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

@ObfuscatedName(value="lq")
public class class301
implements class304 {
    @ObfuscatedName(value="ws")
    static short[] field3257;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=2131055319)
    int field3250;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1183766459)
    int field3251;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1132037033)
    int field3256;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-756063109)
    int field3253;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=83308097)
    int field3254;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-843891125)
    int field3255;

    class301() {
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lkg;B)V", garbageValue="43")
    public void vmethod6484(class284 class2842) {
        if (class2842.field3112 > this.field3254) {
            class2842.field3112 = this.field3254;
        }
        if (class2842.field3113 < this.field3254) {
            class2842.field3113 = this.field3254;
        }
        if (class2842.field3114 > this.field3255) {
            class2842.field3114 = this.field3255;
        }
        if (class2842.field3117 < this.field3255) {
            class2842.field3117 = this.field3255;
        }
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIB)Z", garbageValue="53")
    public boolean vmethod6470(int n, int n2, int n3) {
        if (n >= this.field3250 && n < this.field3251 + this.field3250) {
            return n2 >> 6 == this.field3256 && n3 >> 6 == this.field3253;
        }
        return false;
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="-177019651")
    public boolean vmethod6469(int n, int n2) {
        return n >> 6 == this.field3254 && n2 >> 6 == this.field3255;
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIIB)[I", garbageValue="1")
    public int[] vmethod6481(int n, int n2, int n3) {
        if (this.vmethod6470(n, n2, n3)) {
            int[] nArray = new int[]{this.field3254 * 64 - this.field3256 * 64 + n2, n3 + (this.field3255 * 64 - this.field3253 * 64)};
            return nArray;
        }
        return null;
    }

    @Override
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(III)Lnz;", garbageValue="-425070677")
    public class350 vmethod6473(int n, int n2) {
        if (this.vmethod6469(n, n2)) {
            int n3 = this.field3256 * 64 - this.field3254 * 64 + n;
            int n4 = this.field3253 * 64 - this.field3255 * 64 + n2;
            return new class350(this.field3250, n3, n4);
        }
        return null;
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1542767096")
    public void vmethod6474(class556 class5562) {
        this.field3250 = class5562.method10282();
        this.field3251 = class5562.method10282();
        this.field3256 = class5562.method10307();
        this.field3253 = class5562.method10307();
        this.field3254 = class5562.method10307();
        this.field3255 = class5562.method10307();
        this.method6419();
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-199417862")
    void method6419() {
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Ldz;IIIIIILku;S)V", garbageValue="218")
    static final void method6435(class103 class1032, int n, int n2, int n3, int n4, int n5, int n6, class270 class2702) {
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        if (client.field502 && (class1032.field1337[0][n2][n3] & 2) == 0 && (class1032.field1337[n][n2][n3] & 0x10) != 0) {
            return;
        }
        if (n < class84.field1035) {
            class84.field1035 = n;
        }
        ObjectDef class2622 = class142.method3512(n4);
        if (n5 != 1 && n5 != 3) {
            n12 = class2622.field2804;
            n11 = class2622.field2805;
        } else {
            n12 = class2622.field2805;
            n11 = class2622.field2804;
        }
        if (n12 + n2 > class1032.field1322) {
            n10 = n2;
            n9 = n2 + 1;
        } else {
            n10 = (n12 >> 1) + n2;
            n9 = n2 + (n12 + 1 >> 1);
        }
        if (n3 + n11 > class1032.field1323) {
            n8 = n3;
            n7 = n3 + 1;
        } else {
            n8 = n3 + (n11 >> 1);
            n7 = n3 + (n11 + 1 >> 1);
        }
        int[][] nArray = class1032.field1328[n];
        int n13 = nArray[n9][n7] + nArray[n9][n8] + nArray[n10][n8] + nArray[n10][n7] >> 2;
        int n14 = (n2 << 7) + (n12 << 6);
        int n15 = (n3 << 7) + (n11 << 6);
        long l = class79.method2452(n2, n3, 2, class2622.field2833 == 0, n4, class1032.field1320);
        int n16 = (n5 << 6) + n6;
        if (class2622.field2829 == 1) {
            n16 += 256;
        }
        if (class2622.method5519()) {
            class34.method593(n, n2, n3, class2622, n5);
        }
        class187 class1872 = class1032.field1319;
        if (n6 != 22) {
            if (n6 != 10 && n6 != 11) {
                if (n6 < 12) {
                    if (n6 != 0) {
                        if (n6 != 1) {
                            class190 class1902;
                            class190 class1903;
                            if (n6 != 2) {
                                if (n6 != 3) {
                                    if (n6 != 9) {
                                        if (n6 != 4) {
                                            if (n6 != 5) {
                                                if (n6 != 6) {
                                                    if (n6 != 7) {
                                                        class190 class1904;
                                                        class190 class1905;
                                                        if (n6 != 8) {
                                                            return;
                                                        }
                                                        int n17 = 8;
                                                        long l2 = class1872.method4395(n, n2, n3);
                                                        if (l2 != 0L) {
                                                            n17 = class142.method3512((int)class360.method7406((long)l2)).field2813 / 2;
                                                        }
                                                        int n18 = n5 + 2 & 3;
                                                        if (class2622.field2815 == -1 && class2622.field2837 == null) {
                                                            class1905 = class2622.method5512(4, n5 + 4, nArray, n14, n13, n15);
                                                            class1904 = class2622.method5512(4, n18 + 4, nArray, n14, n13, n15);
                                                        } else {
                                                            class1905 = new class82(class1032, n4, 4, n5 + 4, n, n2, n3, class2622.field2815, class2622.field2839, null);
                                                            class1904 = new class82(class1032, n4, 4, n18 + 4, n, n2, n3, class2622.field2815, class2622.field2839, null);
                                                        }
                                                        class1872.method4183(n, n2, n3, n13, class1905, class1904, 256, n5, n17 * class84.field1037[n5], n17 * class84.field1038[n5], l, n16);
                                                        return;
                                                    }
                                                    int n19 = n5 + 2 & 3;
                                                    class190 class1906 = class2622.field2815 == -1 && class2622.field2837 == null ? class2622.method5512(4, n19 + 4, nArray, n14, n13, n15) : new class82(class1032, n4, 4, n19 + 4, n, n2, n3, class2622.field2815, class2622.field2839, null);
                                                    class1872.method4183(n, n2, n3, n13, class1906, null, 256, n19, 0, 0, l, n16);
                                                    return;
                                                }
                                                int n20 = 8;
                                                long l3 = class1872.method4395(n, n2, n3);
                                                if (0L != l3) {
                                                    n20 = class142.method3512((int)class360.method7406((long)l3)).field2813 / 2;
                                                }
                                                class190 class1907 = class2622.field2815 == -1 && class2622.field2837 == null ? class2622.method5512(4, n5 + 4, nArray, n14, n13, n15) : new class82(class1032, n4, 4, n5 + 4, n, n2, n3, class2622.field2815, class2622.field2839, null);
                                                class1872.method4183(n, n2, n3, n13, class1907, null, 256, n5, n20 * class84.field1037[n5], n20 * class84.field1038[n5], l, n16);
                                                return;
                                            }
                                            int n21 = 16;
                                            long l4 = class1872.method4395(n, n2, n3);
                                            if (0L != l4) {
                                                n21 = class142.method3512((int)class360.method7406((long)l4)).field2813;
                                            }
                                            class190 class1908 = class2622.field2815 == -1 && class2622.field2837 == null ? class2622.method5512(4, n5, nArray, n14, n13, n15) : new class82(class1032, n4, 4, n5, n, n2, n3, class2622.field2815, class2622.field2839, null);
                                            class1872.method4183(n, n2, n3, n13, class1908, null, class84.field1028[n5], 0, n21 * class84.field1031[n5], n21 * class84.field1036[n5], l, n16);
                                            return;
                                        }
                                        class190 class1909 = class2622.field2815 == -1 && class2622.field2837 == null ? class2622.method5512(4, n5, nArray, n14, n13, n15) : new class82(class1032, n4, 4, n5, n, n2, n3, class2622.field2815, class2622.field2839, null);
                                        class1872.method4183(n, n2, n3, n13, class1909, null, class84.field1028[n5], 0, 0, 0, l, n16);
                                        return;
                                    }
                                    class190 class19010 = class2622.field2815 == -1 && class2622.field2837 == null ? class2622.method5512(n6, n5, nArray, n14, n13, n15) : new class82(class1032, n4, n6, n5, n, n2, n3, class2622.field2815, class2622.field2839, null);
                                    class1872.method4184(n, n2, n3, n13, 1, 1, class19010, 0, l, n16);
                                    if (class2622.field2806 != 0 && class2702 != null) {
                                        class2702.method5798(n2, n3, n12, n11, class2622.field2807);
                                    }
                                    if (class2622.field2813 != 16) {
                                        class1872.method4190(n, n2, n3, class2622.field2813);
                                    }
                                    return;
                                }
                                class190 class19011 = class2622.field2815 == -1 && class2622.field2837 == null ? class2622.method5512(3, n5, nArray, n14, n13, n15) : new class82(class1032, n4, 3, n5, n, n2, n3, class2622.field2815, class2622.field2839, null);
                                class1872.method4182(n, n2, n3, n13, class19011, null, class84.field1034[n5], 0, l, n16);
                                if (class2622.field2820) {
                                    if (n5 == 0) {
                                        class84.field1029[n][n2][n3 + 1] = 50;
                                    } else if (n5 == 1) {
                                        class84.field1029[n][n2 + 1][n3 + 1] = 50;
                                    } else if (n5 == 2) {
                                        class84.field1029[n][n2 + 1][n3] = 50;
                                    } else if (n5 == 3) {
                                        class84.field1029[n][n2][n3] = 50;
                                    }
                                }
                                if (class2622.field2806 != 0 && class2702 != null) {
                                    class2702.method5797(n2, n3, n6, n5, class2622.field2807);
                                }
                                return;
                            }
                            int n22 = n5 + 1 & 3;
                            if (class2622.field2815 == -1 && class2622.field2837 == null) {
                                class1903 = class2622.method5512(2, n5 + 4, nArray, n14, n13, n15);
                                class1902 = class2622.method5512(2, n22, nArray, n14, n13, n15);
                            } else {
                                class1903 = new class82(class1032, n4, 2, n5 + 4, n, n2, n3, class2622.field2815, class2622.field2839, null);
                                class1902 = new class82(class1032, n4, 2, n22, n, n2, n3, class2622.field2815, class2622.field2839, null);
                            }
                            class1872.method4182(n, n2, n3, n13, class1903, class1902, class84.field1028[n5], class84.field1028[n22], l, n16);
                            if (class2622.field2788) {
                                if (n5 != 0) {
                                    if (n5 != 1) {
                                        if (n5 != 2) {
                                            if (n5 == 3) {
                                                int[] nArray2 = class538.field5380[n][n2];
                                                int n23 = n3;
                                                nArray2[n23] = nArray2[n23] | 0x492;
                                                int[] nArray3 = class538.field5380[n][n2];
                                                int n24 = n3;
                                                nArray3[n24] = nArray3[n24] | 0x249;
                                            }
                                        } else {
                                            int[] nArray4 = class538.field5380[n][n2 + 1];
                                            int n25 = n3;
                                            nArray4[n25] = nArray4[n25] | 0x249;
                                            int[] nArray5 = class538.field5380[n][n2];
                                            int n26 = n3;
                                            nArray5[n26] = nArray5[n26] | 0x492;
                                        }
                                    } else {
                                        int[] nArray6 = class538.field5380[n][n2];
                                        int n27 = 1 + n3;
                                        nArray6[n27] = nArray6[n27] | 0x492;
                                        int[] nArray7 = class538.field5380[n][n2 + 1];
                                        int n28 = n3;
                                        nArray7[n28] = nArray7[n28] | 0x249;
                                    }
                                } else {
                                    int[] nArray8 = class538.field5380[n][n2];
                                    int n29 = n3;
                                    nArray8[n29] = nArray8[n29] | 0x249;
                                    int[] nArray9 = class538.field5380[n][n2];
                                    int n30 = n3 + 1;
                                    nArray9[n30] = nArray9[n30] | 0x492;
                                }
                            }
                            if (class2622.field2806 != 0 && class2702 != null) {
                                class2702.method5797(n2, n3, n6, n5, class2622.field2807);
                            }
                            if (class2622.field2813 != 16) {
                                class1872.method4190(n, n2, n3, class2622.field2813);
                            }
                            return;
                        }
                        class190 class19012 = class2622.field2815 == -1 && class2622.field2837 == null ? class2622.method5512(1, n5, nArray, n14, n13, n15) : new class82(class1032, n4, 1, n5, n, n2, n3, class2622.field2815, class2622.field2839, null);
                        class1872.method4182(n, n2, n3, n13, class19012, null, class84.field1034[n5], 0, l, n16);
                        if (class2622.field2820) {
                            if (n5 == 0) {
                                class84.field1029[n][n2][n3 + 1] = 50;
                            } else if (n5 == 1) {
                                class84.field1029[n][n2 + 1][n3 + 1] = 50;
                            } else if (n5 == 2) {
                                class84.field1029[n][n2 + 1][n3] = 50;
                            } else if (n5 == 3) {
                                class84.field1029[n][n2][n3] = 50;
                            }
                        }
                        if (class2622.field2806 != 0 && class2702 != null) {
                            class2702.method5797(n2, n3, n6, n5, class2622.field2807);
                        }
                        return;
                    }
                    class190 class19013 = class2622.field2815 == -1 && class2622.field2837 == null ? class2622.method5512(0, n5, nArray, n14, n13, n15) : new class82(class1032, n4, 0, n5, n, n2, n3, class2622.field2815, class2622.field2839, null);
                    class1872.method4182(n, n2, n3, n13, class19013, null, class84.field1028[n5], 0, l, n16);
                    if (n5 != 0) {
                        if (n5 != 1) {
                            if (n5 != 2) {
                                if (n5 == 3) {
                                    if (class2622.field2820) {
                                        class84.field1029[n][n2][n3] = 50;
                                        class84.field1029[n][n2 + 1][n3] = 50;
                                    }
                                    if (class2622.field2788) {
                                        int[] nArray10 = class538.field5380[n][n2];
                                        int n31 = n3;
                                        nArray10[n31] = nArray10[n31] | 0x492;
                                    }
                                }
                            } else {
                                if (class2622.field2820) {
                                    class84.field1029[n][n2 + 1][n3] = 50;
                                    class84.field1029[n][n2 + 1][n3 + 1] = 50;
                                }
                                if (class2622.field2788) {
                                    int[] nArray11 = class538.field5380[n][n2 + 1];
                                    int n32 = n3;
                                    nArray11[n32] = nArray11[n32] | 0x249;
                                }
                            }
                        } else {
                            if (class2622.field2820) {
                                class84.field1029[n][n2][n3 + 1] = 50;
                                class84.field1029[n][n2 + 1][n3 + 1] = 50;
                            }
                            if (class2622.field2788) {
                                int[] nArray12 = class538.field5380[n][n2];
                                int n33 = n3 + 1;
                                nArray12[n33] = nArray12[n33] | 0x492;
                            }
                        }
                    } else {
                        if (class2622.field2820) {
                            class84.field1029[n][n2][n3] = 50;
                            class84.field1029[n][n2][n3 + 1] = 50;
                        }
                        if (class2622.field2788) {
                            int[] nArray13 = class538.field5380[n][n2];
                            int n34 = n3;
                            nArray13[n34] = nArray13[n34] | 0x249;
                        }
                    }
                    if (class2622.field2806 != 0 && class2702 != null) {
                        class2702.method5797(n2, n3, n6, n5, class2622.field2807);
                    }
                    if (class2622.field2813 != 16) {
                        class1872.method4190(n, n2, n3, class2622.field2813);
                    }
                    return;
                }
                class190 class19014 = class2622.field2815 == -1 && class2622.field2837 == null ? class2622.method5512(n6, n5, nArray, n14, n13, n15) : new class82(class1032, n4, n6, n5, n, n2, n3, class2622.field2815, class2622.field2839, null);
                class1872.method4184(n, n2, n3, n13, 1, 1, class19014, 0, l, n16);
                if (n6 >= 12 && n6 <= 17 && n6 != 13 && n > 0) {
                    int[] nArray14 = class538.field5380[n][n2];
                    int n35 = n3;
                    nArray14[n35] = nArray14[n35] | 0x924;
                }
                if (class2622.field2806 != 0 && class2702 != null) {
                    class2702.method5798(n2, n3, n12, n11, class2622.field2807);
                }
                return;
            }
            class190 class19015 = class2622.field2815 == -1 && class2622.field2837 == null ? class2622.method5512(10, n5, nArray, n14, n13, n15) : new class82(class1032, n4, 10, n5, n, n2, n3, class2622.field2815, class2622.field2839, null);
            if (class19015 != null && class1872.method4184(n, n2, n3, n13, n12, n11, class19015, n6 == 11 ? 256 : 0, l, n16) && class2622.field2820) {
                byte by = 15;
                if (class19015 instanceof class198 && (by = ((class198)class19015).method4591() / 4) > 30) {
                    by = 30;
                }
                for (int i = 0; i <= n12; ++i) {
                    for (int j = 0; j <= n11; ++j) {
                        if (by <= class84.field1029[n][i + n2][n3 + j]) continue;
                        class84.field1029[n][i + n2][n3 + j] = by;
                    }
                }
            }
            if (class2622.field2806 != 0 && class2702 != null) {
                class2702.method5798(n2, n3, n12, n11, class2622.field2807);
            }
            return;
        }
        if (client.field502 && class2622.field2833 == 0 && class2622.field2806 != 1 && !class2622.field2827) {
            return;
        }
        class190 class19016 = class2622.field2815 == -1 && class2622.field2837 == null ? class2622.method5512(22, n5, nArray, n14, n13, n15) : new class82(class1032, n4, 22, n5, n, n2, n3, class2622.field2815, class2622.field2839, null);
        class1872.method4180(n, n2, n3, n13, class19016, l, n16);
        if (class2622.field2806 == 1 && class2702 != null) {
            class2702.method5812(n2, n3);
        }
    }
}

