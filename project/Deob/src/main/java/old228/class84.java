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

@ObfuscatedName(value="ds")
public final class class84 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1710557195)
    static int field1035 = 99;
    @ObfuscatedName(value="ao")
    static byte[][][] field1027;
    @ObfuscatedName(value="ad")
    static byte[][][] field1026;
    @ObfuscatedName(value="an")
    static byte[][][] field1029;
    @ObfuscatedName(value="at")
    static int[] field1030;
    @ObfuscatedName(value="ac")
    static int[] field1042;
    @ObfuscatedName(value="al")
    static final int[] field1028;
    @ObfuscatedName(value="av")
    static final int[] field1034;
    @ObfuscatedName(value="ag")
    static final int[] field1031;
    @ObfuscatedName(value="aw")
    static final int[] field1036;
    @ObfuscatedName(value="ai")
    static final int[] field1037;
    @ObfuscatedName(value="ar")
    static final int[] field1038;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=1718024243)
    static int field1039;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=-1678568769)
    static int field1040;

    static {
        field1028 = new int[]{1, 2, 4, 8};
        field1034 = new int[]{16, 32, 64, 128};
        field1031 = new int[]{1, 0, -1, 0};
        field1036 = new int[]{0, -1, 0, 1};
        field1037 = new int[]{1, -1, -1, 1};
        field1038 = new int[]{-1, -1, 1, 1};
        field1039 = (int)(Math.random() * 17.0) - 8;
        field1040 = (int)(Math.random() * 33.0) - 16;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1060073835")
    static int method2572() {
        return ++class115.field1441 - 1;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([FIFZFZ[FI)I", garbageValue="-113421688")
    public static int method2556(float[] fArray, int n, float f, boolean bl, float f2, boolean bl2, float[] fArray2) {
        float f3 = 0.0f;
        int n2 = 0;
        while (true) {
            if (n2 >= n + 1) {
                float f4 = (Math.abs(f) + Math.abs(f2)) * (float)(n + 1) * class132.field1535;
                if (!(f3 <= f4)) {
                    float[] fArray3 = new float[n + 1];
                    int n3 = 0;
                    while (true) {
                        if (n3 >= n + 1) {
                            while (true) {
                                if (!(Math.abs(fArray3[n]) < f4)) {
                                    n3 = 0;
                                    if (n != 0) {
                                        boolean bl3;
                                        if (n != 1) {
                                            class430 class4302 = new class430(fArray3, n);
                                            float[] fArray4 = new float[n + 1];
                                            int n4 = 1;
                                            while (true) {
                                                if (n4 > n) {
                                                    float[] fArray5 = new float[n + 1];
                                                    int n5 = class84.method2556(fArray4, n - 1, f, false, f2, false, fArray5);
                                                    if (n5 != -1) {
                                                        boolean bl4 = false;
                                                        float f5 = 0.0f;
                                                        float f6 = 0.0f;
                                                        float f7 = 0.0f;
                                                        int n6 = 0;
                                                        while (true) {
                                                            float f8;
                                                            if (n6 > n5) {
                                                                return n3;
                                                            }
                                                            if (n3 > n) {
                                                                return n3;
                                                            }
                                                            if (n6 != 0) {
                                                                f8 = f7;
                                                                f6 = f5;
                                                            } else {
                                                                f8 = f;
                                                                f6 = class450.method8887(fArray3, n, f8);
                                                                if (Math.abs(f6) <= f4 && bl) {
                                                                    fArray2[n3++] = f;
                                                                }
                                                            }
                                                            if (n5 != n6) {
                                                                f7 = fArray5[n6];
                                                            } else {
                                                                f7 = f2;
                                                                bl4 = false;
                                                            }
                                                            f5 = class450.method8887(fArray3, n, f7);
                                                            if (!bl4) {
                                                                if (!(Math.abs(f5) < f4)) {
                                                                    if (f6 < 0.0f && f5 > 0.0f || f6 > 0.0f && f5 < 0.0f) {
                                                                        float f9;
                                                                        float[] fArray6 = fArray2;
                                                                        int n7 = n3++;
                                                                        float f10 = f8;
                                                                        float f11 = f7;
                                                                        float f12 = class450.method8887(class4302.field4780, class4302.field4778, f10);
                                                                        if (!(Math.abs(f12) < class132.field1535)) {
                                                                            float f13 = class450.method8887(class4302.field4780, class4302.field4778, f11);
                                                                            if (!(Math.abs(f13) < class132.field1535)) {
                                                                                float f14 = 0.0f;
                                                                                float f15 = 0.0f;
                                                                                float f16 = 0.0f;
                                                                                float f17 = 0.0f;
                                                                                boolean bl5 = true;
                                                                                boolean bl6 = false;
                                                                                do {
                                                                                    boolean bl7;
                                                                                    bl6 = false;
                                                                                    if (bl5) {
                                                                                        f14 = f10;
                                                                                        f17 = f12;
                                                                                        f16 = f15 = f11 - f10;
                                                                                        bl5 = false;
                                                                                    }
                                                                                    if (Math.abs(f17) < Math.abs(f13)) {
                                                                                        f10 = f11;
                                                                                        f11 = f14;
                                                                                        f14 = f10;
                                                                                        f12 = f13;
                                                                                        f13 = f17;
                                                                                        f17 = f12;
                                                                                    }
                                                                                    float f18 = class132.field1536 * Math.abs(f11) + 0.0f;
                                                                                    float f19 = (f14 - f11) * 0.5f;
                                                                                    boolean bl8 = bl7 = Math.abs(f19) > f18 && 0.0f != f13;
                                                                                    if (!bl7) continue;
                                                                                    if (!(Math.abs(f16) < f18) && !(Math.abs(f12) <= Math.abs(f13))) {
                                                                                        float f20;
                                                                                        float f21;
                                                                                        float f22 = f13 / f12;
                                                                                        if (f14 != f10) {
                                                                                            f21 = f12 / f17;
                                                                                            float f23 = f13 / f17;
                                                                                            f20 = (2.0f * f19 * f21 * (f21 - f23) - (f23 - 1.0f) * (f11 - f10)) * f22;
                                                                                            f21 = (f22 - 1.0f) * ((f23 - 1.0f) * (f21 - 1.0f));
                                                                                        } else {
                                                                                            f20 = f19 * 2.0f * f22;
                                                                                            f21 = 1.0f - f22;
                                                                                        }
                                                                                        if ((double)f20 > 0.0) {
                                                                                            f21 = -f21;
                                                                                        } else {
                                                                                            f20 = -f20;
                                                                                        }
                                                                                        f22 = f16;
                                                                                        f16 = f15;
                                                                                        if (2.0f * f20 < f21 * (f19 * 3.0f) - Math.abs(f21 * f18) && f20 < Math.abs(f21 * (f22 * 0.5f))) {
                                                                                            f15 = f20 / f21;
                                                                                        } else {
                                                                                            f16 = f15 = f19;
                                                                                        }
                                                                                    } else {
                                                                                        f16 = f15 = f19;
                                                                                    }
                                                                                    f10 = f11;
                                                                                    f12 = f13;
                                                                                    f11 = Math.abs(f15) > f18 ? (f11 += f15) : ((double)f19 > 0.0 ? (f11 += f18) : (f11 -= f18));
                                                                                    f13 = class450.method8887(class4302.field4780, class4302.field4778, f11);
                                                                                    if (!((double)(f13 * (f17 / Math.abs(f17))) > 0.0)) {
                                                                                        bl6 = true;
                                                                                        continue;
                                                                                    }
                                                                                    bl5 = true;
                                                                                    bl6 = true;
                                                                                } while (bl6);
                                                                                f9 = f11;
                                                                            } else {
                                                                                f9 = f11;
                                                                            }
                                                                        } else {
                                                                            f9 = f10;
                                                                        }
                                                                        fArray6[n7] = f9;
                                                                        if (n3 > 1 && fArray2[n3 - 2] >= fArray2[n3 - 1] - f4) {
                                                                            fArray2[n3 - 2] = 0.5f * (fArray2[n3 - 1] + fArray2[n3 - 2]);
                                                                            --n3;
                                                                        }
                                                                    }
                                                                } else if (n6 != n5 || bl2) {
                                                                    fArray2[n3++] = f7;
                                                                    bl4 = true;
                                                                }
                                                            } else {
                                                                bl4 = false;
                                                            }
                                                            ++n6;
                                                        }
                                                    }
                                                    return 0;
                                                }
                                                fArray4[n4 - 1] = fArray3[n4] * (float)n4;
                                                ++n4;
                                            }
                                        }
                                        fArray2[0] = -fArray3[0] / fArray3[1];
                                        boolean bl9 = bl ? f < f4 + fArray2[0] : (bl3 = f < fArray2[0] - f4);
                                        boolean bl10 = bl2 ? f2 > fArray2[0] - f4 : f2 > f4 + fArray2[0];
                                        int n8 = n3 = bl3 && bl10 ? 1 : 0;
                                        if (n3 > 0) {
                                            if (bl && fArray2[0] < f) {
                                                fArray2[0] = f;
                                            } else if (bl2 && fArray2[0] > f2) {
                                                fArray2[0] = f2;
                                            }
                                        }
                                        return n3;
                                    }
                                    return n3;
                                }
                                --n;
                            }
                        }
                        fArray3[n3] = 1.0f / f3 * fArray[n3];
                        ++n3;
                    }
                }
                return -1;
            }
            f3 += Math.abs(fArray[n2]);
            ++n2;
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-232898322")
    static void method2571() {
        class87.field1057 = new class530(32);
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Ldz;[BIIIIIII)V")
    static final void method2511(class103 class1032, byte[] byArray, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        class556 class5562 = new class556(byArray);
        int n8 = -1;
        int n9;
        block0: while ((n9 = class5562.method10297()) != 0) {
            n8 += n9;
            int n10 = 0;
            while (true) {
                int n11;
                if ((n11 = class5562.method10407()) == 0) continue block0;
                int n12 = (n10 += n11 - 1) & 0x3F;
                int n13 = n10 >> 6 & 0x3F;
                int n14 = n10 >> 12;
                int n15 = class5562.method10282();
                int n16 = n15 >> 2;
                int n17 = n15 & 3;
                if (n4 != n14 || n13 < n5 || n13 >= n5 + 8 || n12 < n6 || n12 >= n6 + 8) continue;
                ObjectDef class2622 = class142.method3512(n8);
                int n18 = n2 + class133.method3426(n13 & 7, n12 & 7, n7, class2622.field2804, class2622.field2805, n17);
                int n19 = n3 + class224.method5045(n13 & 7, n12 & 7, n7, class2622.field2804, class2622.field2805, n17);
                if (n18 <= 0 || n19 <= 0 || n18 >= class1032.field1322 - 1 || n19 >= class1032.field1323 - 1) continue;
                int n20 = n;
                if ((class1032.field1337[1][n18][n19] & 2) == 2) {
                    --n20;
                }
                class270 class2702 = null;
                if (n20 >= 0 && class1032.field1336 != null) {
                    class2702 = class1032.field1336[n20];
                }
                class301.method6435(class1032, n, n18, n19, n8, n17 + n7 & 3, n16, class2702);
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", garbageValue="-360358901")
    static void method2574(String string, String string2, String string3) {
        class114.method3212(7);
        class150.method3595(string, string2, string3);
    }

    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="(ILdm;ZB)I", garbageValue="-95")
    static int method2544(int n, class81 class812, boolean bl) {
        if (n != 5630) {
            return 2;
        }
        client.field627 = 250;
        return 1;
    }
}

