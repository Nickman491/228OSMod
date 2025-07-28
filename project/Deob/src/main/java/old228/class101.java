package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="di")
public class class101 {
    @ObfuscatedName(value="tp")
    @ObfuscatedGetter(intValue=143881131)
    static int field1293;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="[Lvi;")
    class569[] field1299;
    @ObfuscatedName(value="ae")
    int[] field1298 = new int[256];
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-354058959)
    int field1283 = 0;
    @ObfuscatedName(value="at")
    int[] field1301;
    @ObfuscatedName(value="ac")
    int[] field1285;
    @ObfuscatedName(value="au")
    int[] field1286;
    @ObfuscatedName(value="as")
    int[] field1287;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-1725635467)
    int field1290 = 0;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-918109945)
    int field1289 = 0;
    @ObfuscatedName(value="aa")
    int[] field1297;
    @ObfuscatedName(value="ak")
    int[] field1291;
    @ObfuscatedName(value="al")
    int[] field1292;
    @ObfuscatedName(value="av")
    int[] field1280;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=905273427)
    int field1294 = 0;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=1944675440)
    int field1295 = 0;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=1056539043)
    int field1296 = 0;
    @ObfuscatedName(value="ar")
    final int[][] field1300;

    @ObfuscatedSignature(descriptor="([Lvi;[[I)V")
    class101(class569[] class569Array, int[][] nArray) {
        this.field1299 = class569Array;
        this.field1300 = nArray;
        this.method2836();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="42")
    void method2836() {
        this.field1285 = class299.method6402(this.field1300[0][0], this.field1300[0][1], this.field1300[0][2], this.field1300[0][3], this.field1300[0][4]);
        this.field1286 = class299.method6402(this.field1300[1][0], this.field1300[1][1], this.field1300[1][2], this.field1300[1][3], this.field1300[1][4]);
        this.field1287 = class299.method6402(this.field1300[2][0], this.field1300[2][1], this.field1300[2][2], this.field1300[2][3], this.field1300[2][4]);
        this.field1301 = new int[256];
        this.field1294 = 0;
        this.field1292 = new int[32768];
        this.field1280 = new int[32768];
        this.method2844(null);
        this.field1297 = new int[32768];
        this.field1291 = new int[32768];
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="2095724330")
    void method2852() {
        this.field1285 = null;
        this.field1286 = null;
        this.field1287 = null;
        this.field1301 = null;
        this.field1292 = null;
        this.field1280 = null;
        this.field1297 = null;
        this.field1291 = null;
        this.field1294 = 0;
        this.field1295 = 0;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="1398909088")
    void method2838(int n, int n2) {
        int n3;
        if (this.field1297 == null) {
            this.method2836();
        }
        if (this.field1296 == 0) {
            this.field1296 = n2;
        }
        if ((n3 = n2 - this.field1296) >= 256) {
            n3 = 0;
        }
        this.field1296 = n2;
        if (n3 > 0) {
            this.method2862(n3);
        }
        this.method2841(n);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-25")
    final void method2862(int n) {
        int n2;
        this.field1294 += n * 128;
        if (this.field1294 > this.field1292.length) {
            this.field1294 -= this.field1292.length;
            n2 = (int)(Math.random() * 12.0);
            this.method2844(this.field1299[n2]);
        }
        n2 = 0;
        int n3 = n * 128;
        int n4 = (256 - n) * 128;
        int n5 = 0;
        while (true) {
            int n6;
            if (n5 >= n4) {
                n5 = 10;
                n6 = 128 - n5;
                int n7 = 256 - n;
                while (true) {
                    int n8;
                    int n9;
                    int n10;
                    if (n7 >= 256) {
                        if (this.field1290 * 16 > 0) {
                            this.field1290 = this.field1290 * 16 - n * 4;
                        }
                        if (this.field1289 * 16 > 0) {
                            this.field1289 = this.field1289 * 16 - n * 4;
                        }
                        if (this.field1290 * 16 == 0 && this.field1289 * 16 == 0) {
                            n7 = (int)(Math.random() * (double)(2000 / n));
                            if (n7 == 0) {
                                this.field1290 = 1024;
                            }
                            if (n7 == 1) {
                                this.field1289 = 1024;
                            }
                        }
                        for (n7 = 0; n7 < 256 - n; ++n7) {
                            this.field1298[n7] = this.field1298[n7 + n];
                        }
                        n7 = 256 - n;
                        while (true) {
                            if (n7 >= 256) {
                                this.field1295 = this.field1295 * 10000 + 10000 * n;
                                n7 = ((client.field514 & 1) + n) / 2;
                                if (n7 <= 0) return;
                                n10 = 128;
                                n9 = 2;
                                n8 = 128 - n9 - n9;
                                int n11 = 0;
                                while (true) {
                                    int n12;
                                    int n13;
                                    if (n11 >= this.field1295 * 100) {
                                        this.field1295 = 0;
                                        n11 = 0;
                                        while (true) {
                                            int n14;
                                            if (n11 >= 256) {
                                                n11 = 0;
                                                while (true) {
                                                    if (n11 >= 128) {
                                                        return;
                                                    }
                                                    n13 = 0;
                                                    for (n12 = -n7; n12 < 256; ++n12) {
                                                        n14 = n12 * 128;
                                                        if (n7 + n12 < 256) {
                                                            n13 += this.field1291[n11 + n14 + n7 * 128];
                                                        }
                                                        if (n12 - (n7 + 1) >= 0) {
                                                            n13 -= this.field1291[n11 + n14 - (n7 + 1) * 128];
                                                        }
                                                        if (n12 < 0) continue;
                                                        this.field1297[n14 + n11] = n13 / (n7 * 2 + 1);
                                                    }
                                                    ++n11;
                                                }
                                            }
                                            n13 = 0;
                                            n12 = n11 * 128;
                                            for (n14 = -n7; n14 < 128; ++n14) {
                                                if (n7 + n14 < 128) {
                                                    n13 = this.field1297[n7 + n14 + n12] + n13;
                                                }
                                                if (n14 - (n7 + 1) >= 0) {
                                                    n13 -= this.field1297[n12 + n14 - (n7 + 1)];
                                                }
                                                if (n14 < 0) continue;
                                                this.field1291[n12 + n14] = n13 / (n7 * 2 + 1);
                                            }
                                            ++n11;
                                        }
                                    }
                                    n13 = (int)(Math.random() * (double)n8) + n9;
                                    n12 = (int)(Math.random() * (double)n10) + n10;
                                    this.field1297[n13 + (n12 << 7)] = 192;
                                    ++n11;
                                }
                            }
                            this.field1298[n7] = (int)(Math.sin((double)this.field1283 / 14.0) * 16.0 + Math.sin((double)this.field1283 / 15.0) * 14.0 + Math.sin((double)this.field1283 / 16.0) * 12.0);
                            ++this.field1283;
                            ++n7;
                        }
                    }
                    n10 = n7 * 128;
                    for (n9 = 0; n9 < 128; ++n9) {
                        n8 = (int)(Math.random() * 100.0);
                        if (n8 < 50 && n9 > n5 && n9 < n6) {
                            this.field1297[n10 + n9] = 255;
                            continue;
                        }
                        this.field1297[n9 + n10] = 0;
                    }
                    ++n7;
                }
            }
            n6 = this.field1297[n2 + n3] - this.field1292[n2 + this.field1294 & this.field1292.length - 1] * n / 6;
            if (n6 < 0) {
                n6 = 0;
            }
            this.field1297[n2++] = n6;
            ++n5;
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IIII)I", garbageValue="-1054708219")
    final int method2871(int n, int n2, int n3) {
        int n4 = 256 - n3;
        return (n3 * (n2 & 0xFF00) + n4 * (n & 0xFF00) & 0xFF0000) + (n3 * (n2 & 0xFF00FF) + n4 * (n & 0xFF00FF) & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-2134968857")
    final void method2841(int n) {
        int n2 = this.field1301.length;
        if (this.field1290 * 16 <= 0) {
            if (this.field1289 * 16 <= 0) {
                System.arraycopy(this.field1285, 0, this.field1301, 0, n2);
            } else {
                this.method2842(this.field1289 * 16, this.field1287);
            }
        } else {
            this.method2842(this.field1290 * 16, this.field1286);
        }
        this.method2843(n);
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I[II)V", garbageValue="-1423102211")
    final void method2842(int n, int[] nArray) {
        int n2 = this.field1301.length;
        int n3 = 0;
        while (n3 < n2) {
            this.field1301[n3] = n <= 768 ? (n <= 256 ? this.method2871(nArray[n3], this.field1285[n3], 256 - n) : nArray[n3]) : this.method2871(this.field1285[n3], nArray[n3], 1024 - n);
            ++n3;
        }
        return;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="101")
    final void method2843(int n) {
        int n2 = 0;
        int n3 = 1;
        block0: while (n3 < 255) {
            int n4 = (256 - n3) * this.field1298[n3] / 256;
            int n5 = n4 + n;
            int n6 = 0;
            int n7 = 128;
            if (n5 < 0) {
                n6 = -n5;
                n5 = 0;
            }
            if (n5 + 128 >= class6.field14.field5551) {
                n7 = class6.field14.field5551 - n5;
            }
            int n8 = n5 + (n3 + 8) * class6.field14.field5551;
            n2 += n6;
            int n9 = n6;
            while (true) {
                if (n9 >= n7) {
                    n2 += 128 - n7;
                    ++n3;
                    continue block0;
                }
                int n10 = this.field1297[n2++];
                int n11 = n8 % class566.field5542;
                if (n10 != 0 && n11 >= class566.field5548 && n11 < class566.field5549) {
                    int n12 = n10;
                    int n13 = 256 - n10;
                    n10 = this.field1301[n10];
                    int n14 = class6.field14.field5552[n8];
                    class6.field14.field5552[n8++] = 0xFF000000 | (n12 * (n10 & 0xFF00) + n13 * (n14 & 0xFF00) & 0xFF0000) + ((n10 & 0xFF00FF) * n12 + (n14 & 0xFF00FF) * n13 & 0xFF00FF00) >> 8;
                } else {
                    ++n8;
                }
                ++n9;
            }
            break;
        }
        return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Lvi;I)V", garbageValue="-2132570656")
    final void method2844(class569 class5692) {
        int n;
        for (n = 0; n < this.field1292.length; ++n) {
            this.field1292[n] = 0;
        }
        n = 0;
        while (true) {
            int n2;
            if (n >= 5000) {
                n = 0;
                block2: while (true) {
                    int n3;
                    int n4;
                    if (n >= 20) {
                        if (class5692 == null) return;
                        n = 0;
                        n2 = 0;
                        while (true) {
                            if (n2 >= class5692.field5564) {
                                return;
                            }
                            for (n4 = 0; n4 < class5692.field5567; ++n4) {
                                if (class5692.field5563[n++] == 0) continue;
                                n3 = n4 + class5692.field5565 + 16;
                                int n5 = n2 + class5692.field5566 + 16;
                                int n6 = n3 + (n5 << 7);
                                this.field1292[n6] = 0;
                            }
                            ++n2;
                        }
                    }
                    n2 = 1;
                    while (true) {
                        if (n2 >= 255) {
                            int[] nArray = this.field1292;
                            this.field1292 = this.field1280;
                            this.field1280 = nArray;
                            ++n;
                            continue block2;
                        }
                        for (n4 = 1; n4 < 127; ++n4) {
                            n3 = n4 + (n2 << 7);
                            this.field1280[n3] = (this.field1292[n3 + 1] + this.field1292[n3 - 128] + this.field1292[n3 + 128] + this.field1292[n3 - 1]) / 4;
                        }
                        ++n2;
                    }
                    break;
                }
            }
            n2 = (int)(Math.random() * 128.0 * 256.0);
            this.field1292[n2] = (int)(Math.random() * 256.0);
            ++n;
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1012588797")
    public static void method2877() {
        class234.field2506.method6581();
    }

    @ObfuscatedName(value="ox")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="545969286")
    static boolean method2876() {
        return class544.field5403.method2904() >= client.field766;
    }
}

