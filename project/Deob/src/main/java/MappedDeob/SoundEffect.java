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

@ObfuscatedName(value="bg")
@Implements(value="SoundEffect")
public class SoundEffect {
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="[Lcu;")
    @Export(value="instruments")
    Instrument[] instruments = new Instrument[10];
    @ObfuscatedName(value="az")
    @Export(value="start")
    int start;
    @ObfuscatedName(value="ao")
    @Export(value="end")
    int end;

    @ObfuscatedSignature(descriptor="(Lvy;)V")
    SoundEffect(Buffer buffer) {
        int n = 0;
        while (true) {
            if (n >= 10) {
                this.start = buffer.readUnsignedShort();
                this.end = buffer.readUnsignedShort();
                return;
            }
            int n2 = buffer.readUnsignedByte();
            if (n2 != 0) {
                --buffer.offset;
                this.instruments[n] = new Instrument();
                this.instruments[n].decode(buffer);
            }
            ++n;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="()Lbc;")
    @Export(value="toRawSound")
    public RawSound toRawSound() {
        byte[] byArray = this.mix();
        return new RawSound(22050, byArray, this.start * 22050 / 1000, this.end * 22050 / 1000);
    }

    @ObfuscatedName(value="az")
    @Export(value="calculateDelay")
    public final int calculateDelay() {
        int n = 9999999;
        int n2 = 0;
        while (true) {
            if (n2 >= 10) {
                if (this.start < this.end && this.start / 20 < n) {
                    n = this.start / 20;
                }
                if (n != 9999999 && n != 0) {
                    n2 = 0;
                    while (true) {
                        if (n2 >= 10) {
                            if (this.start < this.end) {
                                this.start -= n * 20;
                                this.end -= n * 20;
                            }
                            return n;
                        }
                        if (this.instruments[n2] != null) {
                            this.instruments[n2].offset -= n * 20;
                        }
                        ++n2;
                    }
                }
                return 0;
            }
            if (this.instruments[n2] != null && this.instruments[n2].offset / 20 < n) {
                n = this.instruments[n2].offset / 20;
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="ao")
    @Export(value="mix")
    final byte[] mix() {
        int n = 0;
        int n2 = 0;
        while (true) {
            if (n2 >= 10) {
                if (n == 0) {
                    return new byte[0];
                }
                n2 = n * 22050 / 1000;
                byte[] byArray = new byte[n2];
                int n3 = 0;
                while (true) {
                    if (n3 >= 10) {
                        return byArray;
                    }
                    if (this.instruments[n3] != null) {
                        int n4 = this.instruments[n3].duration * 22050 / 1000;
                        int n5 = this.instruments[n3].offset * 22050 / 1000;
                        int[] nArray = this.instruments[n3].synthesize(n4, this.instruments[n3].duration);
                        for (int i = 0; i < n4; ++i) {
                            int n6 = (nArray[i] >> 8) + byArray[i + n5];
                            if ((n6 + 128 & 0xFFFFFF00) != 0) {
                                n6 = n6 >> 31 ^ 0x7F;
                            }
                            byArray[i + n5] = (byte)n6;
                        }
                    }
                    ++n3;
                }
            }
            if (this.instruments[n2] != null && this.instruments[n2].duration + this.instruments[n2].offset > n) {
                n = this.instruments[n2].duration + this.instruments[n2].offset;
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;II)Lbg;")
    @Export(value="readSoundEffect")
    public static SoundEffect readSoundEffect(AbstractArchive abstractArchive, int n, int n2) {
        byte[] byArray = abstractArchive.takeFile(n, n2);
        if (byArray == null) {
            return null;
        }
        return new SoundEffect(new Buffer(byArray));
    }
}

