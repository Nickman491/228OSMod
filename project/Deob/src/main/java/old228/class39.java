package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bg")
public class class39 {
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="[Lcu;")
    class61[] field239 = new class61[10];
    @ObfuscatedName(value="az")
    int field238;
    @ObfuscatedName(value="ao")
    int field236;

    @ObfuscatedSignature(descriptor="(Lvy;)V")
    class39(class556 class5562) {
        int n = 0;
        while (true) {
            if (n >= 10) {
                this.field238 = class5562.method10307();
                this.field236 = class5562.method10307();
                return;
            }
            int n2 = class5562.method10282();
            if (n2 != 0) {
                --class5562.field5471;
                this.field239[n] = new class61();
                this.field239[n].method1219(class5562);
            }
            ++n;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="()Lbc;")
    public class40 method772() {
        byte[] byArray = this.method774();
        return new class40(22050, byArray, this.field238 * 22050 / 1000, this.field236 * 22050 / 1000);
    }

    @ObfuscatedName(value="az")
    public final int method773() {
        int n = 9999999;
        int n2 = 0;
        while (true) {
            if (n2 >= 10) {
                if (this.field238 < this.field236 && this.field238 / 20 < n) {
                    n = this.field238 / 20;
                }
                if (n != 9999999 && n != 0) {
                    n2 = 0;
                    while (true) {
                        if (n2 >= 10) {
                            if (this.field238 < this.field236) {
                                this.field238 -= n * 20;
                                this.field236 -= n * 20;
                            }
                            return n;
                        }
                        if (this.field239[n2] != null) {
                            this.field239[n2].field420 -= n * 20;
                        }
                        ++n2;
                    }
                }
                return 0;
            }
            if (this.field239[n2] != null && this.field239[n2].field420 / 20 < n) {
                n = this.field239[n2].field420 / 20;
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="ao")
    final byte[] method774() {
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
                    if (this.field239[n3] != null) {
                        int n4 = this.field239[n3].field428 * 22050 / 1000;
                        int n5 = this.field239[n3].field420 * 22050 / 1000;
                        int[] nArray = this.field239[n3].method1224(n4, this.field239[n3].field428);
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
            if (this.field239[n2] != null && this.field239[n2].field428 + this.field239[n2].field420 > n) {
                n = this.field239[n2].field428 + this.field239[n2].field420;
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;II)Lbg;")
    public static class39 method775(class391 class3912, int n, int n2) {
        byte[] byArray = class3912.method7790(n, n2);
        if (byArray == null) {
            return null;
        }
        return new class39(new class556(byArray));
    }
}

