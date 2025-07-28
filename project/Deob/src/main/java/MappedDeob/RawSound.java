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

@ObfuscatedName(value="bc")
@Implements(value="RawSound")
public class RawSound
extends AbstractSound {
    @ObfuscatedName(value="ay")
    @Export(value="sampleRate")
    public int sampleRate;
    @ObfuscatedName(value="ah")
    @Export(value="samples")
    public byte[] samples;
    @ObfuscatedName(value="az")
    @Export(value="start")
    public int start;
    @ObfuscatedName(value="ao")
    @Export(value="end")
    int end;
    @ObfuscatedName(value="ad")
    public boolean field244;

    RawSound(int n, byte[] byArray, int n2, int n3) {
        this.sampleRate = n;
        this.samples = byArray;
        this.start = n2;
        this.end = n3;
    }

    RawSound(int n, byte[] byArray, int n2, int n3, boolean bl) {
        this.sampleRate = n;
        this.samples = byArray;
        this.start = n2;
        this.end = n3;
        this.field244 = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lcg;)Lbc;")
    @Export(value="resample")
    public RawSound resample(Decimator decimator) {
        this.samples = decimator.resample(this.samples);
        this.sampleRate = decimator.scaleRate(this.sampleRate);
        if (this.start == this.end) {
            this.start = this.end = decimator.scalePosition(this.start);
        } else {
            this.start = decimator.scalePosition(this.start);
            this.end = decimator.scalePosition(this.end);
            if (this.start == this.end) {
                --this.start;
            }
        }
        return this;
    }
}

