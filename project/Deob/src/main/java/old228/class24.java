package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ab")
public class class24
extends class42 {
    @ObfuscatedName(value="ay")
    AudioFormat field98;
    @ObfuscatedName(value="ah")
    SourceDataLine field99;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-325651531)
    int field97;
    @ObfuscatedName(value="ao")
    byte[] field100;

    class24() {
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-934813238")
    protected void vmethod834() {
        this.field98 = new AudioFormat(class42.field257, 16, class42.field264 ? 2 : 1, true, false);
        this.field100 = new byte[256 << (class42.field264 ? 2 : 1)];
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="2008767536")
    protected void vmethod854(int n) throws LineUnavailableException {
        try {
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, this.field98, n << (class42.field264 ? 2 : 1));
            this.field99 = (SourceDataLine)AudioSystem.getLine(info);
            this.field99.open();
            this.field99.start();
            this.field97 = n;
        }
        catch (LineUnavailableException lineUnavailableException) {
            if (class206.method4809(n) != 1) {
                this.vmethod854(class357.method7049(n));
                return;
            }
            this.field99 = null;
            throw lineUnavailableException;
        }
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1560665771")
    protected int vmethod815() {
        return this.field97 - (this.field99.available() >> (class42.field264 ? 2 : 1));
    }

    @Override
    @ObfuscatedName(value="ao")
    protected void vmethod816() {
        int n = 256;
        if (class42.field264) {
            n <<= 1;
        }
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                this.field99.write(this.field100, 0, n << 1);
                return;
            }
            int n3 = this.field262[n2];
            if ((n3 + 0x800000 & 0xFF000000) != 0) {
                n3 = 0x7FFFFF ^ n3 >> 31;
            }
            this.field100[n2 * 2] = (byte)(n3 >> 8);
            this.field100[n2 * 2 + 1] = (byte)(n3 >> 16);
            ++n2;
        }
    }

    @Override
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="0")
    protected void vmethod817() {
        if (this.field99 != null) {
            this.field99.close();
            this.field99 = null;
        }
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-376770394")
    protected void vmethod818() {
        this.field99.flush();
    }
}

