/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ba")
@Implements(value="SoundEnvelope")
public class SoundEnvelope {
    @ObfuscatedName(value="ay")
    @Export(value="segments")
    int segments = 2;
    @ObfuscatedName(value="ah")
    @Export(value="durations")
    int[] durations = new int[2];
    @ObfuscatedName(value="az")
    @Export(value="phases")
    int[] phases = new int[2];
    @ObfuscatedName(value="ao")
    @Export(value="start")
    int start;
    @ObfuscatedName(value="ad")
    @Export(value="end")
    int end;
    @ObfuscatedName(value="an")
    @Export(value="form")
    int form;
    @ObfuscatedName(value="ae")
    @Export(value="ticks")
    int ticks;
    @ObfuscatedName(value="ax")
    @Export(value="phaseIndex")
    int phaseIndex;
    @ObfuscatedName(value="at")
    @Export(value="step")
    int step;
    @ObfuscatedName(value="ac")
    @Export(value="amplitude")
    int amplitude;
    @ObfuscatedName(value="au")
    @Export(value="max")
    int max;

    SoundEnvelope() {
        this.durations[0] = 0;
        this.durations[1] = 65535;
        this.phases[0] = 0;
        this.phases[1] = 65535;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;)V")
    @Export(value="decode")
    final void decode(Buffer buffer) {
        this.form = buffer.readUnsignedByte();
        this.start = buffer.readInt();
        this.end = buffer.readInt();
        this.decodeSegments(buffer);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;)V")
    @Export(value="decodeSegments")
    final void decodeSegments(Buffer buffer) {
        this.segments = buffer.readUnsignedByte();
        this.durations = new int[this.segments];
        this.phases = new int[this.segments];
        int n = 0;
        while (n < this.segments) {
            this.durations[n] = buffer.readUnsignedShort();
            this.phases[n] = buffer.readUnsignedShort();
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="az")
    @Export(value="reset")
    final void reset() {
        this.ticks = 0;
        this.phaseIndex = 0;
        this.step = 0;
        this.amplitude = 0;
        this.max = 0;
    }

    @ObfuscatedName(value="ao")
    @Export(value="doStep")
    final int doStep(int n) {
        if (this.max >= this.ticks) {
            this.amplitude = this.phases[this.phaseIndex++] << 15;
            if (this.phaseIndex >= this.segments) {
                this.phaseIndex = this.segments - 1;
            }
            this.ticks = (int)((double)this.durations[this.phaseIndex] / 65536.0 * (double)n);
            if (this.ticks > this.max) {
                this.step = ((this.phases[this.phaseIndex] << 15) - this.amplitude) / (this.ticks - this.max);
            }
        }
        this.amplitude += this.step;
        ++this.max;
        return this.amplitude - this.step >> 15;
    }
}

