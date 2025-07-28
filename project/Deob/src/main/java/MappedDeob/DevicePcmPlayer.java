/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ab")
@Implements(value="DevicePcmPlayer")
public class DevicePcmPlayer
extends PcmPlayer {
    @ObfuscatedName(value="ay")
    @Export(value="format")
    AudioFormat format;
    @ObfuscatedName(value="ah")
    @Export(value="line")
    SourceDataLine line;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-325651531)
    @Export(value="capacity2")
    int capacity2;
    @ObfuscatedName(value="ao")
    @Export(value="byteSamples")
    byte[] byteSamples;

    DevicePcmPlayer() {
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-934813238")
    @Export(value="init")
    protected void init() {
        this.format = new AudioFormat(PcmPlayer.field257, 16, PcmPlayer.PcmPlayer_stereo ? 2 : 1, true, false);
        this.byteSamples = new byte[256 << (PcmPlayer.PcmPlayer_stereo ? 2 : 1)];
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="2008767536")
    @Export(value="open")
    protected void open(int n) throws LineUnavailableException {
        try {
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, this.format, n << (PcmPlayer.PcmPlayer_stereo ? 2 : 1));
            this.line = (SourceDataLine)AudioSystem.getLine(info);
            this.line.open();
            this.line.start();
            this.capacity2 = n;
        }
        catch (LineUnavailableException lineUnavailableException) {
            if (class206.method4809(n) != 1) {
                this.open(class357.method7049(n));
                return;
            }
            this.line = null;
            throw lineUnavailableException;
        }
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1560665771")
    @Export(value="position")
    protected int position() {
        return this.capacity2 - (this.line.available() >> (PcmPlayer.PcmPlayer_stereo ? 2 : 1));
    }

    @Override
    @ObfuscatedName(value="ao")
    @Export(value="write")
    protected void write() {
        int n = 256;
        if (PcmPlayer.PcmPlayer_stereo) {
            n <<= 1;
        }
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                this.line.write(this.byteSamples, 0, n << 1);
                return;
            }
            int n3 = this.samples[n2];
            if ((n3 + 0x800000 & 0xFF000000) != 0) {
                n3 = 0x7FFFFF ^ n3 >> 31;
            }
            this.byteSamples[n2 * 2] = (byte)(n3 >> 8);
            this.byteSamples[n2 * 2 + 1] = (byte)(n3 >> 16);
            ++n2;
        }
    }

    @Override
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="0")
    @Export(value="close")
    protected void close() {
        if (this.line != null) {
            this.line.close();
            this.line = null;
        }
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-376770394")
    @Export(value="discard")
    protected void discard() {
        this.line.flush();
    }
}

