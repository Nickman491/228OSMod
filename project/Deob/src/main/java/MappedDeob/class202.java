/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="hl")
public class class202
extends class185 {
    @ObfuscatedSignature(descriptor="(Lhm;)V")
    class202(class203 class2032) {
        super(class2032);
    }

    @Override
    @ObfuscatedName(value="an")
    void vmethod4753(int n, int n2, int n3, int n4, int n5, int n6, float f, float f2, float f3, int n7, int n8, int n9) {
        int n10 = n5 - n4;
        int n11 = n2 - n;
        int n12 = n6 - n4;
        int n13 = n3 - n;
        int n14 = n8 - n7;
        int n15 = n9 - n7;
        int n16 = n3 == n2 ? 0 : (n6 - n5 << 14) / (n3 - n2);
        int n17 = n2 == n ? 0 : (n10 << 14) / n11;
        int n18 = n3 == n ? 0 : (n12 << 14) / n13;
        int n19 = n10 * n13 - n12 * n11;
        if (n19 == 0) {
            return;
        }
        int n20 = (n14 * n13 - n15 * n11 << 8) / n19;
        int n21 = (n15 * n10 - n14 * n12 << 8) / n19;
        int[] nArray = this.field1982.Rasterizer3D_rowOffsets;
        int n22 = this.field1982.field2305;
        if (n <= n2 && n <= n3) {
            if (n >= n22) {
                return;
            }
            if (n2 > n22) {
                n2 = n22;
            }
            if (n3 > n22) {
                n3 = n22;
            }
            n7 = n20 + ((n7 << 8) - n20 * n4);
            if (n2 >= n3) {
                n5 = n4 <<= 14;
                if (n < 0) {
                    n5 -= n18 * n;
                    n4 -= n17 * n;
                    n7 -= n21 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n3 * n16;
                    n3 = 0;
                }
                if (n3 != n && n18 < n17 || n3 == n && n16 > n17) {
                    n2 -= n3;
                    n3 -= n;
                    n = nArray[n];
                    while (true) {
                        if (--n3 < 0) {
                            while (true) {
                                if (--n2 < 0) {
                                    return;
                                }
                                this.method4716(Rasterizer2D.Rasterizer2D_pixels, n, 0, 0, n6 >> 14, n4 >> 14, n7, n20);
                                n6 = n16 + n6;
                                n4 = n17 + n4;
                                n7 += n21;
                                n = Rasterizer2D.Rasterizer2D_width + n;
                            }
                        }
                        this.method4716(Rasterizer2D.Rasterizer2D_pixels, n, 0, 0, n5 >> 14, n4 >> 14, n7, n20);
                        n5 += n18;
                        n4 = n17 + n4;
                        n7 += n21;
                        n = Rasterizer2D.Rasterizer2D_width + n;
                    }
                }
                n2 -= n3;
                n3 -= n;
                n = nArray[n];
                while (true) {
                    if (--n3 < 0) {
                        while (true) {
                            if (--n2 < 0) {
                                return;
                            }
                            this.method4716(Rasterizer2D.Rasterizer2D_pixels, n, 0, 0, n4 >> 14, n6 >> 14, n7, n20);
                            n6 = n16 + n6;
                            n4 = n17 + n4;
                            n7 += n21;
                            n = Rasterizer2D.Rasterizer2D_width + n;
                        }
                    }
                    this.method4716(Rasterizer2D.Rasterizer2D_pixels, n, 0, 0, n4 >> 14, n5 >> 14, n7, n20);
                    n5 += n18;
                    n4 = n17 + n4;
                    n7 += n21;
                    n = Rasterizer2D.Rasterizer2D_width + n;
                }
            }
            n6 = n4 <<= 14;
            if (n < 0) {
                n6 -= n18 * n;
                n4 -= n17 * n;
                n7 -= n21 * n;
                n = 0;
            }
            n5 <<= 14;
            if (n2 < 0) {
                n5 -= n16 * n2;
                n2 = 0;
            }
            if (n2 != n && n18 < n17 || n2 == n && n18 > n16) {
                n3 -= n2;
                n2 -= n;
                n = nArray[n];
                while (true) {
                    if (--n2 < 0) {
                        while (true) {
                            if (--n3 < 0) {
                                return;
                            }
                            this.method4716(Rasterizer2D.Rasterizer2D_pixels, n, 0, 0, n6 >> 14, n5 >> 14, n7, n20);
                            n6 = n18 + n6;
                            n5 += n16;
                            n7 += n21;
                            n = Rasterizer2D.Rasterizer2D_width + n;
                        }
                    }
                    this.method4716(Rasterizer2D.Rasterizer2D_pixels, n, 0, 0, n6 >> 14, n4 >> 14, n7, n20);
                    n6 = n18 + n6;
                    n4 = n17 + n4;
                    n7 += n21;
                    n = Rasterizer2D.Rasterizer2D_width + n;
                }
            }
            n3 -= n2;
            n2 -= n;
            n = nArray[n];
            while (true) {
                if (--n2 < 0) {
                    while (true) {
                        if (--n3 < 0) {
                            return;
                        }
                        this.method4716(Rasterizer2D.Rasterizer2D_pixels, n, 0, 0, n5 >> 14, n6 >> 14, n7, n20);
                        n6 = n18 + n6;
                        n5 += n16;
                        n7 += n21;
                        n = Rasterizer2D.Rasterizer2D_width + n;
                    }
                }
                this.method4716(Rasterizer2D.Rasterizer2D_pixels, n, 0, 0, n4 >> 14, n6 >> 14, n7, n20);
                n6 = n18 + n6;
                n4 = n17 + n4;
                n7 += n21;
                n = Rasterizer2D.Rasterizer2D_width + n;
            }
        }
        if (n2 > n3) {
            if (n3 >= n22) {
                return;
            }
            if (n > n22) {
                n = n22;
            }
            if (n2 > n22) {
                n2 = n22;
            }
            n9 = n20 + ((n9 << 8) - n20 * n6);
            if (n >= n2) {
                n4 = n6 <<= 14;
                if (n3 < 0) {
                    n4 -= n3 * n16;
                    n6 -= n3 * n18;
                    n9 -= n3 * n21;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n17 * n2;
                    n2 = 0;
                }
                if (n16 >= n18) {
                    n -= n2;
                    n2 -= n3;
                    n3 = nArray[n3];
                    while (true) {
                        if (--n2 < 0) {
                            while (true) {
                                if (--n < 0) {
                                    return;
                                }
                                this.method4716(Rasterizer2D.Rasterizer2D_pixels, n3, 0, 0, n6 >> 14, n5 >> 14, n9, n20);
                                n5 += n17;
                                n6 = n18 + n6;
                                n9 = n21 + n9;
                                n3 += Rasterizer2D.Rasterizer2D_width;
                            }
                        }
                        this.method4716(Rasterizer2D.Rasterizer2D_pixels, n3, 0, 0, n6 >> 14, n4 >> 14, n9, n20);
                        n4 = n16 + n4;
                        n6 = n18 + n6;
                        n9 = n21 + n9;
                        n3 += Rasterizer2D.Rasterizer2D_width;
                    }
                }
                n -= n2;
                n2 -= n3;
                n3 = nArray[n3];
                while (true) {
                    if (--n2 < 0) {
                        while (true) {
                            if (--n < 0) {
                                return;
                            }
                            this.method4716(Rasterizer2D.Rasterizer2D_pixels, n3, 0, 0, n5 >> 14, n6 >> 14, n9, n20);
                            n5 += n17;
                            n6 = n18 + n6;
                            n9 = n21 + n9;
                            n3 += Rasterizer2D.Rasterizer2D_width;
                        }
                    }
                    this.method4716(Rasterizer2D.Rasterizer2D_pixels, n3, 0, 0, n4 >> 14, n6 >> 14, n9, n20);
                    n4 = n16 + n4;
                    n6 = n18 + n6;
                    n9 = n21 + n9;
                    n3 += Rasterizer2D.Rasterizer2D_width;
                }
            }
            n5 = n6 <<= 14;
            if (n3 < 0) {
                n5 -= n3 * n16;
                n6 -= n3 * n18;
                n9 -= n3 * n21;
                n3 = 0;
            }
            n4 <<= 14;
            if (n < 0) {
                n4 -= n17 * n;
                n = 0;
            }
            if (n16 >= n18) {
                n2 -= n;
                n -= n3;
                n3 = nArray[n3];
                while (true) {
                    if (--n < 0) {
                        while (true) {
                            if (--n2 < 0) {
                                return;
                            }
                            this.method4716(Rasterizer2D.Rasterizer2D_pixels, n3, 0, 0, n4 >> 14, n5 >> 14, n9, n20);
                            n5 += n16;
                            n4 = n17 + n4;
                            n9 = n21 + n9;
                            n3 += Rasterizer2D.Rasterizer2D_width;
                        }
                    }
                    this.method4716(Rasterizer2D.Rasterizer2D_pixels, n3, 0, 0, n6 >> 14, n5 >> 14, n9, n20);
                    n5 += n16;
                    n6 = n18 + n6;
                    n9 = n21 + n9;
                    n3 += Rasterizer2D.Rasterizer2D_width;
                }
            }
            n2 -= n;
            n -= n3;
            n3 = nArray[n3];
            while (true) {
                if (--n < 0) {
                    while (true) {
                        if (--n2 < 0) {
                            return;
                        }
                        this.method4716(Rasterizer2D.Rasterizer2D_pixels, n3, 0, 0, n5 >> 14, n4 >> 14, n9, n20);
                        n5 += n16;
                        n4 = n17 + n4;
                        n9 = n21 + n9;
                        n3 += Rasterizer2D.Rasterizer2D_width;
                    }
                }
                this.method4716(Rasterizer2D.Rasterizer2D_pixels, n3, 0, 0, n5 >> 14, n6 >> 14, n9, n20);
                n5 += n16;
                n6 = n18 + n6;
                n9 = n21 + n9;
                n3 += Rasterizer2D.Rasterizer2D_width;
            }
        }
        if (n2 >= n22) {
            return;
        }
        if (n3 > n22) {
            n3 = n22;
        }
        if (n > n22) {
            n = n22;
        }
        n8 = (n8 << 8) - n5 * n20 + n20;
        if (n3 >= n) {
            n6 = n5 <<= 14;
            if (n2 < 0) {
                n6 -= n17 * n2;
                n5 -= n16 * n2;
                n8 -= n21 * n2;
                n2 = 0;
            }
            n4 <<= 14;
            if (n < 0) {
                n4 -= n18 * n;
                n = 0;
            }
            if (n17 >= n16) {
                n3 -= n;
                n -= n2;
                n2 = nArray[n2];
                while (true) {
                    if (--n < 0) {
                        while (true) {
                            if (--n3 < 0) {
                                return;
                            }
                            this.method4716(Rasterizer2D.Rasterizer2D_pixels, n2, 0, 0, n5 >> 14, n4 >> 14, n8, n20);
                            n4 = n18 + n4;
                            n5 += n16;
                            n8 += n21;
                            n2 += Rasterizer2D.Rasterizer2D_width;
                        }
                    }
                    this.method4716(Rasterizer2D.Rasterizer2D_pixels, n2, 0, 0, n5 >> 14, n6 >> 14, n8, n20);
                    n6 = n17 + n6;
                    n5 += n16;
                    n8 += n21;
                    n2 += Rasterizer2D.Rasterizer2D_width;
                }
            }
            n3 -= n;
            n -= n2;
            n2 = nArray[n2];
            while (true) {
                if (--n < 0) {
                    while (true) {
                        if (--n3 < 0) {
                            return;
                        }
                        this.method4716(Rasterizer2D.Rasterizer2D_pixels, n2, 0, 0, n4 >> 14, n5 >> 14, n8, n20);
                        n4 = n18 + n4;
                        n5 += n16;
                        n8 += n21;
                        n2 += Rasterizer2D.Rasterizer2D_width;
                    }
                }
                this.method4716(Rasterizer2D.Rasterizer2D_pixels, n2, 0, 0, n6 >> 14, n5 >> 14, n8, n20);
                n6 = n17 + n6;
                n5 += n16;
                n8 += n21;
                n2 += Rasterizer2D.Rasterizer2D_width;
            }
        }
        n4 = n5 <<= 14;
        if (n2 < 0) {
            n4 -= n17 * n2;
            n5 -= n16 * n2;
            n8 -= n21 * n2;
            n2 = 0;
        }
        n6 <<= 14;
        if (n3 < 0) {
            n6 -= n3 * n18;
            n3 = 0;
        }
        if (!(n3 != n2 && n17 < n16 || n3 == n2 && n17 > n18)) {
            n -= n3;
            n3 -= n2;
            n2 = nArray[n2];
            while (true) {
                if (--n3 < 0) {
                    while (true) {
                        if (--n < 0) {
                            return;
                        }
                        this.method4716(Rasterizer2D.Rasterizer2D_pixels, n2, 0, 0, n6 >> 14, n4 >> 14, n8, n20);
                        n4 = n17 + n4;
                        n6 = n18 + n6;
                        n8 += n21;
                        n2 += Rasterizer2D.Rasterizer2D_width;
                    }
                }
                this.method4716(Rasterizer2D.Rasterizer2D_pixels, n2, 0, 0, n5 >> 14, n4 >> 14, n8, n20);
                n4 = n17 + n4;
                n5 += n16;
                n8 += n21;
                n2 += Rasterizer2D.Rasterizer2D_width;
            }
        }
        n -= n3;
        n3 -= n2;
        n2 = nArray[n2];
        while (true) {
            if (--n3 < 0) {
                while (true) {
                    if (--n < 0) {
                        return;
                    }
                    this.method4716(Rasterizer2D.Rasterizer2D_pixels, n2, 0, 0, n4 >> 14, n6 >> 14, n8, n20);
                    n4 = n17 + n4;
                    n6 = n18 + n6;
                    n8 += n21;
                    n2 += Rasterizer2D.Rasterizer2D_width;
                }
            }
            this.method4716(Rasterizer2D.Rasterizer2D_pixels, n2, 0, 0, n4 >> 14, n5 >> 14, n8, n20);
            n4 = n17 + n4;
            n5 += n16;
            n8 += n21;
            n2 += Rasterizer2D.Rasterizer2D_width;
        }
    }

    @Override
    @ObfuscatedName(value="ae")
    void vmethod4755(int n, int n2, int n3, int n4, int n5, int n6, float f, float f2, float f3, int n7) {
        int n8 = 0;
        if (n2 != n) {
            n8 = (n5 - n4 << 14) / (n2 - n);
        }
        int n9 = 0;
        if (n3 != n2) {
            n9 = (n6 - n5 << 14) / (n3 - n2);
        }
        int n10 = 0;
        if (n3 != n) {
            n10 = (n4 - n6 << 14) / (n - n3);
        }
        int[] nArray = this.field1982.Rasterizer3D_rowOffsets;
        int n11 = this.field1982.field2305;
        if (n > n2 || n > n3) {
            if (n2 > n3) {
                if (n3 >= n11) {
                    return;
                }
                if (n > n11) {
                    n = n11;
                }
                if (n2 > n11) {
                    n2 = n11;
                }
                if (n >= n2) {
                    n4 = n6 <<= 14;
                    if (n3 < 0) {
                        n4 -= n3 * n9;
                        n6 -= n3 * n10;
                        n3 = 0;
                    }
                    n5 <<= 14;
                    if (n2 < 0) {
                        n5 -= n8 * n2;
                        n2 = 0;
                    }
                    if (n9 >= n10) {
                        n -= n2;
                        n2 -= n3;
                        n3 = nArray[n3];
                        while (true) {
                            if (--n2 < 0) {
                                while (true) {
                                    if (--n < 0) {
                                        return;
                                    }
                                    this.method4713(Rasterizer2D.Rasterizer2D_pixels, n3, n7, 0, n6 >> 14, n5 >> 14);
                                    n5 += n8;
                                    n6 = n10 + n6;
                                    n3 += Rasterizer2D.Rasterizer2D_width;
                                }
                            }
                            this.method4713(Rasterizer2D.Rasterizer2D_pixels, n3, n7, 0, n6 >> 14, n4 >> 14);
                            n4 = n9 + n4;
                            n6 = n10 + n6;
                            n3 += Rasterizer2D.Rasterizer2D_width;
                        }
                    }
                    n -= n2;
                    n2 -= n3;
                    n3 = nArray[n3];
                    while (true) {
                        if (--n2 < 0) {
                            while (true) {
                                if (--n < 0) {
                                    return;
                                }
                                this.method4713(Rasterizer2D.Rasterizer2D_pixels, n3, n7, 0, n5 >> 14, n6 >> 14);
                                n5 += n8;
                                n6 = n10 + n6;
                                n3 += Rasterizer2D.Rasterizer2D_width;
                            }
                        }
                        this.method4713(Rasterizer2D.Rasterizer2D_pixels, n3, n7, 0, n4 >> 14, n6 >> 14);
                        n4 = n9 + n4;
                        n6 = n10 + n6;
                        n3 += Rasterizer2D.Rasterizer2D_width;
                    }
                }
                n5 = n6 <<= 14;
                if (n3 < 0) {
                    n5 -= n3 * n9;
                    n6 -= n3 * n10;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n8 * n;
                    n = 0;
                }
                if (n9 >= n10) {
                    n2 -= n;
                    n -= n3;
                    n3 = nArray[n3];
                    while (true) {
                        if (--n < 0) {
                            while (true) {
                                if (--n2 < 0) {
                                    return;
                                }
                                this.method4713(Rasterizer2D.Rasterizer2D_pixels, n3, n7, 0, n4 >> 14, n5 >> 14);
                                n5 += n9;
                                n4 = n8 + n4;
                                n3 += Rasterizer2D.Rasterizer2D_width;
                            }
                        }
                        this.method4713(Rasterizer2D.Rasterizer2D_pixels, n3, n7, 0, n6 >> 14, n5 >> 14);
                        n5 += n9;
                        n6 = n10 + n6;
                        n3 += Rasterizer2D.Rasterizer2D_width;
                    }
                }
                n2 -= n;
                n -= n3;
                n3 = nArray[n3];
                while (true) {
                    if (--n < 0) {
                        while (true) {
                            if (--n2 < 0) {
                                return;
                            }
                            this.method4713(Rasterizer2D.Rasterizer2D_pixels, n3, n7, 0, n5 >> 14, n4 >> 14);
                            n5 += n9;
                            n4 = n8 + n4;
                            n3 += Rasterizer2D.Rasterizer2D_width;
                        }
                    }
                    this.method4713(Rasterizer2D.Rasterizer2D_pixels, n3, n7, 0, n5 >> 14, n6 >> 14);
                    n5 += n9;
                    n6 = n10 + n6;
                    n3 += Rasterizer2D.Rasterizer2D_width;
                }
            }
            if (n2 >= n11) {
                return;
            }
            if (n3 > n11) {
                n3 = n11;
            }
            if (n > n11) {
                n = n11;
            }
            if (n3 >= n) {
                n6 = n5 <<= 14;
                if (n2 < 0) {
                    n6 -= n8 * n2;
                    n5 -= n9 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n10 * n;
                    n = 0;
                }
                if (n8 >= n9) {
                    n3 -= n;
                    n -= n2;
                    n2 = nArray[n2];
                    while (true) {
                        if (--n < 0) {
                            while (true) {
                                if (--n3 < 0) {
                                    return;
                                }
                                this.method4713(Rasterizer2D.Rasterizer2D_pixels, n2, n7, 0, n5 >> 14, n4 >> 14);
                                n4 = n10 + n4;
                                n5 += n9;
                                n2 += Rasterizer2D.Rasterizer2D_width;
                            }
                        }
                        this.method4713(Rasterizer2D.Rasterizer2D_pixels, n2, n7, 0, n5 >> 14, n6 >> 14);
                        n6 = n8 + n6;
                        n5 += n9;
                        n2 += Rasterizer2D.Rasterizer2D_width;
                    }
                }
                n3 -= n;
                n -= n2;
                n2 = nArray[n2];
                while (true) {
                    if (--n < 0) {
                        while (true) {
                            if (--n3 < 0) {
                                return;
                            }
                            this.method4713(Rasterizer2D.Rasterizer2D_pixels, n2, n7, 0, n4 >> 14, n5 >> 14);
                            n4 = n10 + n4;
                            n5 += n9;
                            n2 += Rasterizer2D.Rasterizer2D_width;
                        }
                    }
                    this.method4713(Rasterizer2D.Rasterizer2D_pixels, n2, n7, 0, n6 >> 14, n5 >> 14);
                    n6 = n8 + n6;
                    n5 += n9;
                    n2 += Rasterizer2D.Rasterizer2D_width;
                }
            }
            n4 = n5 <<= 14;
            if (n2 < 0) {
                n4 -= n8 * n2;
                n5 -= n9 * n2;
                n2 = 0;
            }
            n6 <<= 14;
            if (n3 < 0) {
                n6 -= n3 * n10;
                n3 = 0;
            }
            if (!(n3 != n2 && n8 < n9 || n3 == n2 && n8 > n10)) {
                n -= n3;
                n3 -= n2;
                n2 = nArray[n2];
                while (true) {
                    if (--n3 < 0) {
                        while (true) {
                            if (--n < 0) {
                                return;
                            }
                            this.method4713(Rasterizer2D.Rasterizer2D_pixels, n2, n7, 0, n6 >> 14, n4 >> 14);
                            n4 = n8 + n4;
                            n6 = n10 + n6;
                            n2 += Rasterizer2D.Rasterizer2D_width;
                        }
                    }
                    this.method4713(Rasterizer2D.Rasterizer2D_pixels, n2, n7, 0, n5 >> 14, n4 >> 14);
                    n4 = n8 + n4;
                    n5 += n9;
                    n2 += Rasterizer2D.Rasterizer2D_width;
                }
            }
            n -= n3;
            n3 -= n2;
            n2 = nArray[n2];
            while (true) {
                if (--n3 < 0) {
                    while (true) {
                        if (--n < 0) {
                            return;
                        }
                        this.method4713(Rasterizer2D.Rasterizer2D_pixels, n2, n7, 0, n4 >> 14, n6 >> 14);
                        n4 = n8 + n4;
                        n6 = n10 + n6;
                        n2 += Rasterizer2D.Rasterizer2D_width;
                    }
                }
                this.method4713(Rasterizer2D.Rasterizer2D_pixels, n2, n7, 0, n4 >> 14, n5 >> 14);
                n4 = n8 + n4;
                n5 += n9;
                n2 += Rasterizer2D.Rasterizer2D_width;
            }
        }
        if (n >= n11) {
            return;
        }
        if (n2 > n11) {
            n2 = n11;
        }
        if (n3 > n11) {
            n3 = n11;
        }
        if (n2 >= n3) {
            n5 = n4 <<= 14;
            if (n < 0) {
                n5 -= n10 * n;
                n4 -= n8 * n;
                n = 0;
            }
            n6 <<= 14;
            if (n3 < 0) {
                n6 -= n3 * n9;
                n3 = 0;
            }
            if (!(n3 != n && n10 < n8 || n3 == n && n9 > n8)) {
                n2 -= n3;
                n3 -= n;
                n = nArray[n];
                while (true) {
                    if (--n3 < 0) {
                        while (true) {
                            if (--n2 < 0) {
                                return;
                            }
                            this.method4713(Rasterizer2D.Rasterizer2D_pixels, n, n7, 0, n4 >> 14, n6 >> 14);
                            n6 = n9 + n6;
                            n4 = n8 + n4;
                            n = Rasterizer2D.Rasterizer2D_width + n;
                        }
                    }
                    this.method4713(Rasterizer2D.Rasterizer2D_pixels, n, n7, 0, n4 >> 14, n5 >> 14);
                    n5 += n10;
                    n4 = n8 + n4;
                    n = Rasterizer2D.Rasterizer2D_width + n;
                }
            }
            n2 -= n3;
            n3 -= n;
            n = nArray[n];
            while (true) {
                if (--n3 < 0) {
                    while (true) {
                        if (--n2 < 0) {
                            return;
                        }
                        this.method4713(Rasterizer2D.Rasterizer2D_pixels, n, n7, 0, n6 >> 14, n4 >> 14);
                        n6 = n9 + n6;
                        n4 = n8 + n4;
                        n = Rasterizer2D.Rasterizer2D_width + n;
                    }
                }
                this.method4713(Rasterizer2D.Rasterizer2D_pixels, n, n7, 0, n5 >> 14, n4 >> 14);
                n5 += n10;
                n4 = n8 + n4;
                n = Rasterizer2D.Rasterizer2D_width + n;
            }
        }
        n6 = n4 <<= 14;
        if (n < 0) {
            n6 -= n10 * n;
            n4 -= n8 * n;
            n = 0;
        }
        n5 <<= 14;
        if (n2 < 0) {
            n5 -= n9 * n2;
            n2 = 0;
        }
        if (n2 != n && n10 < n8 || n2 == n && n10 > n9) {
            n3 -= n2;
            n2 -= n;
            n = nArray[n];
            while (true) {
                if (--n2 < 0) {
                    while (true) {
                        if (--n3 < 0) {
                            return;
                        }
                        this.method4713(Rasterizer2D.Rasterizer2D_pixels, n, n7, 0, n6 >> 14, n5 >> 14);
                        n6 = n10 + n6;
                        n5 += n9;
                        n = Rasterizer2D.Rasterizer2D_width + n;
                    }
                }
                this.method4713(Rasterizer2D.Rasterizer2D_pixels, n, n7, 0, n6 >> 14, n4 >> 14);
                n6 = n10 + n6;
                n4 = n8 + n4;
                n = Rasterizer2D.Rasterizer2D_width + n;
            }
        }
        n3 -= n2;
        n2 -= n;
        n = nArray[n];
        while (true) {
            if (--n2 < 0) {
                while (true) {
                    if (--n3 < 0) {
                        return;
                    }
                    this.method4713(Rasterizer2D.Rasterizer2D_pixels, n, n7, 0, n5 >> 14, n6 >> 14);
                    n6 = n10 + n6;
                    n5 += n9;
                    n = Rasterizer2D.Rasterizer2D_width + n;
                }
            }
            this.method4713(Rasterizer2D.Rasterizer2D_pixels, n, n7, 0, n4 >> 14, n6 >> 14);
            n6 = n10 + n6;
            n4 = n8 + n4;
            n = Rasterizer2D.Rasterizer2D_width + n;
        }
    }

    @Override
    @ObfuscatedName(value="ax")
    void vmethod4801(int n, int n2, int n3, int n4, int n5, int n6, float f, float f2, float f3, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19) {
        int[] nArray = this.field1982.Rasterizer3D_textureLoader.getTexturePixels(n19);
        if (nArray != null) {
            int n20;
            this.field1981 = this.field1982.Rasterizer3D_textureLoader.isLowDetail(n19);
            this.field1983 = this.field1982.Rasterizer3D_textureLoader.vmethod4810(n19);
            int n21 = n5 - n4;
            int n22 = n2 - n;
            int n23 = n6 - n4;
            int n24 = n3 - n;
            int n25 = n8 - n7;
            int n26 = n9 - n7;
            int n27 = 0;
            if (n2 != n) {
                n27 = (n5 - n4 << 14) / (n2 - n);
            }
            int n28 = 0;
            if (n3 != n2) {
                n28 = (n6 - n5 << 14) / (n3 - n2);
            }
            int n29 = 0;
            if (n3 != n) {
                n29 = (n4 - n6 << 14) / (n - n3);
            }
            if ((n20 = n21 * n24 - n23 * n22) == 0) {
                return;
            }
            int n30 = (n25 * n24 - n26 * n22 << 9) / n20;
            int n31 = (n26 * n21 - n25 * n23 << 9) / n20;
            int n32 = this.field1982.field2289;
            n11 = n10 - n11;
            n14 = n13 - n14;
            n17 = n16 - n17;
            int n33 = (n12 -= n10) * n13 - (n15 -= n13) * n10 << 14;
            int n34 = (int)(((long)(n15 * n16 - n13 * (n18 -= n16)) << 3 << 14) / (long)n32);
            int n35 = (int)(((long)(n10 * n18 - n16 * n12) << 14) / (long)n32);
            int n36 = n13 * n11 - n10 * n14 << 14;
            int n37 = (int)(((long)(n16 * n14 - n13 * n17) << 3 << 14) / (long)n32);
            int n38 = (int)(((long)(n10 * n17 - n16 * n11) << 14) / (long)n32);
            int n39 = n14 * n12 - n15 * n11 << 14;
            int n40 = (int)(((long)(n15 * n17 - n14 * n18) << 3 << 14) / (long)n32);
            int n41 = (int)(((long)(n18 * n11 - n12 * n17) << 14) / (long)n32);
            int[] nArray2 = this.field1982.Rasterizer3D_rowOffsets;
            int n42 = this.field1982.field2305;
            if (n <= n2 && n <= n3) {
                if (n >= n42) {
                    return;
                }
                if (n2 > n42) {
                    n2 = n42;
                }
                if (n3 > n42) {
                    n3 = n42;
                }
                n7 = n30 + ((n7 << 9) - n30 * n4);
                if (n2 >= n3) {
                    n5 = n4 <<= 14;
                    if (n < 0) {
                        n5 -= n29 * n;
                        n4 -= n27 * n;
                        n7 -= n31 * n;
                        n = 0;
                    }
                    n6 <<= 14;
                    if (n3 < 0) {
                        n6 -= n3 * n28;
                        n3 = 0;
                    }
                    int n43 = n - this.field1982.field2302;
                    n33 += n35 * n43;
                    n36 += n38 * n43;
                    n39 += n41 * n43;
                    if (!(n3 != n && n29 < n27 || n3 == n && n28 > n27)) {
                        n2 -= n3;
                        n3 -= n;
                        n = nArray2[n];
                        while (true) {
                            if (--n3 < 0) {
                                while (true) {
                                    if (--n2 < 0) {
                                        return;
                                    }
                                    this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n, n4 >> 14, n6 >> 14, n7, n30, n33, n36, n39, n34, n37, n40);
                                    n6 = n28 + n6;
                                    n4 = n27 + n4;
                                    n7 += n31;
                                    n = Rasterizer2D.Rasterizer2D_width + n;
                                    n33 += n35;
                                    n36 += n38;
                                    n39 += n41;
                                }
                            }
                            this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n, n4 >> 14, n5 >> 14, n7, n30, n33, n36, n39, n34, n37, n40);
                            n5 += n29;
                            n4 = n27 + n4;
                            n7 += n31;
                            n = Rasterizer2D.Rasterizer2D_width + n;
                            n33 += n35;
                            n36 += n38;
                            n39 += n41;
                        }
                    }
                    n2 -= n3;
                    n3 -= n;
                    n = nArray2[n];
                    while (true) {
                        if (--n3 < 0) {
                            while (true) {
                                if (--n2 < 0) {
                                    return;
                                }
                                this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n, n6 >> 14, n4 >> 14, n7, n30, n33, n36, n39, n34, n37, n40);
                                n6 = n28 + n6;
                                n4 = n27 + n4;
                                n7 += n31;
                                n = Rasterizer2D.Rasterizer2D_width + n;
                                n33 += n35;
                                n36 += n38;
                                n39 += n41;
                            }
                        }
                        this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n, n5 >> 14, n4 >> 14, n7, n30, n33, n36, n39, n34, n37, n40);
                        n5 += n29;
                        n4 = n27 + n4;
                        n7 += n31;
                        n = Rasterizer2D.Rasterizer2D_width + n;
                        n33 += n35;
                        n36 += n38;
                        n39 += n41;
                    }
                }
                n6 = n4 <<= 14;
                if (n < 0) {
                    n6 -= n29 * n;
                    n4 -= n27 * n;
                    n7 -= n31 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n28 * n2;
                    n2 = 0;
                }
                int n44 = n - this.field1982.field2302;
                n33 += n35 * n44;
                n36 += n38 * n44;
                n39 += n41 * n44;
                if (!(n2 != n && n29 < n27 || n2 == n && n29 > n28)) {
                    n3 -= n2;
                    n2 -= n;
                    n = nArray2[n];
                    while (true) {
                        if (--n2 < 0) {
                            while (true) {
                                if (--n3 < 0) {
                                    return;
                                }
                                this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n, n5 >> 14, n6 >> 14, n7, n30, n33, n36, n39, n34, n37, n40);
                                n6 = n29 + n6;
                                n5 += n28;
                                n7 += n31;
                                n = Rasterizer2D.Rasterizer2D_width + n;
                                n33 += n35;
                                n36 += n38;
                                n39 += n41;
                            }
                        }
                        this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n, n4 >> 14, n6 >> 14, n7, n30, n33, n36, n39, n34, n37, n40);
                        n6 = n29 + n6;
                        n4 = n27 + n4;
                        n7 += n31;
                        n = Rasterizer2D.Rasterizer2D_width + n;
                        n33 += n35;
                        n36 += n38;
                        n39 += n41;
                    }
                }
                n3 -= n2;
                n2 -= n;
                n = nArray2[n];
                while (true) {
                    if (--n2 < 0) {
                        while (true) {
                            if (--n3 < 0) {
                                return;
                            }
                            this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n, n6 >> 14, n5 >> 14, n7, n30, n33, n36, n39, n34, n37, n40);
                            n6 = n29 + n6;
                            n5 += n28;
                            n7 += n31;
                            n = Rasterizer2D.Rasterizer2D_width + n;
                            n33 += n35;
                            n36 += n38;
                            n39 += n41;
                        }
                    }
                    this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n, n6 >> 14, n4 >> 14, n7, n30, n33, n36, n39, n34, n37, n40);
                    n6 = n29 + n6;
                    n4 = n27 + n4;
                    n7 += n31;
                    n = Rasterizer2D.Rasterizer2D_width + n;
                    n33 += n35;
                    n36 += n38;
                    n39 += n41;
                }
            }
            if (n2 > n3) {
                if (n3 >= n42) {
                    return;
                }
                if (n > n42) {
                    n = n42;
                }
                if (n2 > n42) {
                    n2 = n42;
                }
                n9 = (n9 << 9) - n30 * n6 + n30;
                if (n >= n2) {
                    n4 = n6 <<= 14;
                    if (n3 < 0) {
                        n4 -= n3 * n28;
                        n6 -= n3 * n29;
                        n9 -= n3 * n31;
                        n3 = 0;
                    }
                    n5 <<= 14;
                    if (n2 < 0) {
                        n5 -= n27 * n2;
                        n2 = 0;
                    }
                    int n45 = n3 - this.field1982.field2302;
                    n33 += n35 * n45;
                    n36 += n38 * n45;
                    n39 += n41 * n45;
                    if (n28 >= n29) {
                        n -= n2;
                        n2 -= n3;
                        n3 = nArray2[n3];
                        while (true) {
                            if (--n2 < 0) {
                                while (true) {
                                    if (--n < 0) {
                                        return;
                                    }
                                    this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n3, n6 >> 14, n5 >> 14, n9, n30, n33, n36, n39, n34, n37, n40);
                                    n5 += n27;
                                    n6 = n29 + n6;
                                    n9 = n31 + n9;
                                    n3 += Rasterizer2D.Rasterizer2D_width;
                                    n33 += n35;
                                    n36 += n38;
                                    n39 += n41;
                                }
                            }
                            this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n3, n6 >> 14, n4 >> 14, n9, n30, n33, n36, n39, n34, n37, n40);
                            n4 = n28 + n4;
                            n6 = n29 + n6;
                            n9 = n31 + n9;
                            n3 += Rasterizer2D.Rasterizer2D_width;
                            n33 += n35;
                            n36 += n38;
                            n39 += n41;
                        }
                    }
                    n -= n2;
                    n2 -= n3;
                    n3 = nArray2[n3];
                    while (true) {
                        if (--n2 < 0) {
                            while (true) {
                                if (--n < 0) {
                                    return;
                                }
                                this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n3, n5 >> 14, n6 >> 14, n9, n30, n33, n36, n39, n34, n37, n40);
                                n5 += n27;
                                n6 = n29 + n6;
                                n9 = n31 + n9;
                                n3 += Rasterizer2D.Rasterizer2D_width;
                                n33 += n35;
                                n36 += n38;
                                n39 += n41;
                            }
                        }
                        this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n3, n4 >> 14, n6 >> 14, n9, n30, n33, n36, n39, n34, n37, n40);
                        n4 = n28 + n4;
                        n6 = n29 + n6;
                        n9 = n31 + n9;
                        n3 += Rasterizer2D.Rasterizer2D_width;
                        n33 += n35;
                        n36 += n38;
                        n39 += n41;
                    }
                }
                n5 = n6 <<= 14;
                if (n3 < 0) {
                    n5 -= n3 * n28;
                    n6 -= n3 * n29;
                    n9 -= n3 * n31;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n27 * n;
                    n = 0;
                }
                int n46 = n3 - this.field1982.field2302;
                n33 += n35 * n46;
                n36 += n38 * n46;
                n39 += n41 * n46;
                if (n28 >= n29) {
                    n2 -= n;
                    n -= n3;
                    n3 = nArray2[n3];
                    while (true) {
                        if (--n < 0) {
                            while (true) {
                                if (--n2 < 0) {
                                    return;
                                }
                                this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n3, n4 >> 14, n5 >> 14, n9, n30, n33, n36, n39, n34, n37, n40);
                                n5 += n28;
                                n4 = n27 + n4;
                                n9 = n31 + n9;
                                n3 += Rasterizer2D.Rasterizer2D_width;
                                n33 += n35;
                                n36 += n38;
                                n39 += n41;
                            }
                        }
                        this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n3, n6 >> 14, n5 >> 14, n9, n30, n33, n36, n39, n34, n37, n40);
                        n5 += n28;
                        n6 = n29 + n6;
                        n9 = n31 + n9;
                        n3 += Rasterizer2D.Rasterizer2D_width;
                        n33 += n35;
                        n36 += n38;
                        n39 += n41;
                    }
                }
                n2 -= n;
                n -= n3;
                n3 = nArray2[n3];
                while (true) {
                    if (--n < 0) {
                        while (true) {
                            if (--n2 < 0) {
                                return;
                            }
                            this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n3, n5 >> 14, n4 >> 14, n9, n30, n33, n36, n39, n34, n37, n40);
                            n5 += n28;
                            n4 = n27 + n4;
                            n9 = n31 + n9;
                            n3 += Rasterizer2D.Rasterizer2D_width;
                            n33 += n35;
                            n36 += n38;
                            n39 += n41;
                        }
                    }
                    this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n3, n5 >> 14, n6 >> 14, n9, n30, n33, n36, n39, n34, n37, n40);
                    n5 += n28;
                    n6 = n29 + n6;
                    n9 = n31 + n9;
                    n3 += Rasterizer2D.Rasterizer2D_width;
                    n33 += n35;
                    n36 += n38;
                    n39 += n41;
                }
            }
            if (n2 >= n42) {
                return;
            }
            if (n3 > n42) {
                n3 = n42;
            }
            if (n > n42) {
                n = n42;
            }
            n8 = n30 + ((n8 << 9) - n5 * n30);
            if (n3 >= n) {
                n6 = n5 <<= 14;
                if (n2 < 0) {
                    n6 -= n27 * n2;
                    n5 -= n28 * n2;
                    n8 -= n31 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n29 * n;
                    n = 0;
                }
                int n47 = n2 - this.field1982.field2302;
                n33 += n35 * n47;
                n36 += n38 * n47;
                n39 += n41 * n47;
                if (n27 >= n28) {
                    n3 -= n;
                    n -= n2;
                    n2 = nArray2[n2];
                    while (true) {
                        if (--n < 0) {
                            while (true) {
                                if (--n3 < 0) {
                                    return;
                                }
                                this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n2, n5 >> 14, n4 >> 14, n8, n30, n33, n36, n39, n34, n37, n40);
                                n4 = n29 + n4;
                                n5 += n28;
                                n8 += n31;
                                n2 += Rasterizer2D.Rasterizer2D_width;
                                n33 += n35;
                                n36 += n38;
                                n39 += n41;
                            }
                        }
                        this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n2, n5 >> 14, n6 >> 14, n8, n30, n33, n36, n39, n34, n37, n40);
                        n6 = n27 + n6;
                        n5 += n28;
                        n8 += n31;
                        n2 += Rasterizer2D.Rasterizer2D_width;
                        n33 += n35;
                        n36 += n38;
                        n39 += n41;
                    }
                }
                n3 -= n;
                n -= n2;
                n2 = nArray2[n2];
                while (true) {
                    if (--n < 0) {
                        while (true) {
                            if (--n3 < 0) {
                                return;
                            }
                            this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n2, n4 >> 14, n5 >> 14, n8, n30, n33, n36, n39, n34, n37, n40);
                            n4 = n29 + n4;
                            n5 += n28;
                            n8 += n31;
                            n2 += Rasterizer2D.Rasterizer2D_width;
                            n33 += n35;
                            n36 += n38;
                            n39 += n41;
                        }
                    }
                    this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n2, n6 >> 14, n5 >> 14, n8, n30, n33, n36, n39, n34, n37, n40);
                    n6 = n27 + n6;
                    n5 += n28;
                    n8 += n31;
                    n2 += Rasterizer2D.Rasterizer2D_width;
                    n33 += n35;
                    n36 += n38;
                    n39 += n41;
                }
            }
            n4 = n5 <<= 14;
            if (n2 < 0) {
                n4 -= n27 * n2;
                n5 -= n28 * n2;
                n8 -= n31 * n2;
                n2 = 0;
            }
            n6 <<= 14;
            if (n3 < 0) {
                n6 -= n3 * n29;
                n3 = 0;
            }
            int n48 = n2 - this.field1982.field2302;
            n33 += n35 * n48;
            n36 += n38 * n48;
            n39 += n41 * n48;
            if (n3 != n2 && n27 < n28 || n3 == n2 && n27 > n29) {
                n -= n3;
                n3 -= n2;
                n2 = nArray2[n2];
                while (true) {
                    if (--n3 < 0) {
                        while (true) {
                            if (--n < 0) {
                                return;
                            }
                            this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n2, n4 >> 14, n6 >> 14, n8, n30, n33, n36, n39, n34, n37, n40);
                            n4 = n27 + n4;
                            n6 = n29 + n6;
                            n8 += n31;
                            n2 += Rasterizer2D.Rasterizer2D_width;
                            n33 += n35;
                            n36 += n38;
                            n39 += n41;
                        }
                    }
                    this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n2, n4 >> 14, n5 >> 14, n8, n30, n33, n36, n39, n34, n37, n40);
                    n4 = n27 + n4;
                    n5 += n28;
                    n8 += n31;
                    n2 += Rasterizer2D.Rasterizer2D_width;
                    n33 += n35;
                    n36 += n38;
                    n39 += n41;
                }
            }
            n -= n3;
            n3 -= n2;
            n2 = nArray2[n2];
            while (true) {
                if (--n3 < 0) {
                    while (true) {
                        if (--n < 0) {
                            return;
                        }
                        this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n2, n6 >> 14, n4 >> 14, n8, n30, n33, n36, n39, n34, n37, n40);
                        n4 = n27 + n4;
                        n6 = n29 + n6;
                        n8 += n31;
                        n2 += Rasterizer2D.Rasterizer2D_width;
                        n33 += n35;
                        n36 += n38;
                        n39 += n41;
                    }
                }
                this.method4715(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n2, n5 >> 14, n4 >> 14, n8, n30, n33, n36, n39, n34, n37, n40);
                n4 = n27 + n4;
                n5 += n28;
                n8 += n31;
                n2 += Rasterizer2D.Rasterizer2D_width;
                n33 += n35;
                n36 += n38;
                n39 += n41;
            }
        }
        int n49 = this.field1982.Rasterizer3D_textureLoader.getAverageTextureRGB(n19);
        this.vmethod4753(n, n2, n3, n4, n5, n6, f, f2, f3, class185.method4131(n49, n7), class185.method4131(n49, n8), class185.method4131(n49, n9));
    }

    @Override
    @ObfuscatedName(value="at")
    void vmethod4764(int n, int n2, int n3, int n4, int n5, int n6, float f, float f2, float f3, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19) {
        int[] nArray = this.field1982.Rasterizer3D_textureLoader.getTexturePixels(n19);
        if (nArray != null) {
            int n20;
            this.field1981 = this.field1982.Rasterizer3D_textureLoader.isLowDetail(n19);
            this.field1983 = this.field1982.Rasterizer3D_textureLoader.vmethod4810(n19);
            int n21 = n5 - n4;
            int n22 = n2 - n;
            int n23 = n6 - n4;
            int n24 = n3 - n;
            int n25 = n8 - n7;
            int n26 = n9 - n7;
            int n27 = 0;
            if (n2 != n) {
                n27 = (n5 - n4 << 14) / (n2 - n);
            }
            int n28 = 0;
            if (n3 != n2) {
                n28 = (n6 - n5 << 14) / (n3 - n2);
            }
            int n29 = 0;
            if (n3 != n) {
                n29 = (n4 - n6 << 14) / (n - n3);
            }
            if ((n20 = n21 * n24 - n23 * n22) == 0) {
                return;
            }
            int n30 = (n25 * n24 - n26 * n22 << 9) / n20;
            int n31 = (n26 * n21 - n25 * n23 << 9) / n20;
            int n32 = this.field1982.field2289;
            n11 = n10 - n11;
            n14 = n13 - n14;
            n17 = n16 - n17;
            int n33 = (n12 -= n10) * n13 - (n15 -= n13) * n10 << 14;
            int n34 = (int)(((long)(n15 * n16 - n13 * (n18 -= n16)) << 14) / (long)n32);
            int n35 = (int)(((long)(n10 * n18 - n16 * n12) << 14) / (long)n32);
            int n36 = n13 * n11 - n10 * n14 << 14;
            int n37 = (int)(((long)(n16 * n14 - n13 * n17) << 14) / (long)n32);
            int n38 = (int)(((long)(n10 * n17 - n16 * n11) << 14) / (long)n32);
            int n39 = n14 * n12 - n15 * n11 << 14;
            int n40 = (int)(((long)(n15 * n17 - n14 * n18) << 14) / (long)n32);
            int n41 = (int)(((long)(n18 * n11 - n12 * n17) << 14) / (long)n32);
            int[] nArray2 = this.field1982.Rasterizer3D_rowOffsets;
            int n42 = this.field1982.field2305;
            int n43 = this.field1982.field2302;
            if (n > n2 || n > n3) {
                if (n2 > n3) {
                    if (n3 >= n42) {
                        return;
                    }
                    if (n > n42) {
                        n = n42;
                    }
                    if (n2 > n42) {
                        n2 = n42;
                    }
                    n9 = (n9 << 9) - n30 * n6 + n30;
                    if (n >= n2) {
                        n4 = n6 <<= 14;
                        if (n3 < 0) {
                            n4 -= n3 * n28;
                            n6 -= n3 * n29;
                            n9 -= n3 * n31;
                            n3 = 0;
                        }
                        n5 <<= 14;
                        if (n2 < 0) {
                            n5 -= n27 * n2;
                            n2 = 0;
                        }
                        int n44 = n3 - n43;
                        n33 += n35 * n44;
                        n36 += n38 * n44;
                        n39 += n41 * n44;
                        if (n28 >= n29) {
                            n -= n2;
                            n2 -= n3;
                            n3 = nArray2[n3];
                            while (true) {
                                if (--n2 < 0) {
                                    while (true) {
                                        if (--n < 0) {
                                            return;
                                        }
                                        this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n3, n6 >> 14, n5 >> 14, n9, n30, n33, n36, n39, n34, n37, n40);
                                        n5 += n27;
                                        n6 = n29 + n6;
                                        n9 = n31 + n9;
                                        n3 += Rasterizer2D.Rasterizer2D_width;
                                        n33 += n35;
                                        n36 += n38;
                                        n39 += n41;
                                    }
                                }
                                this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n3, n6 >> 14, n4 >> 14, n9, n30, n33, n36, n39, n34, n37, n40);
                                n4 = n28 + n4;
                                n6 = n29 + n6;
                                n9 = n31 + n9;
                                n3 += Rasterizer2D.Rasterizer2D_width;
                                n33 += n35;
                                n36 += n38;
                                n39 += n41;
                            }
                        }
                        n -= n2;
                        n2 -= n3;
                        n3 = nArray2[n3];
                        while (true) {
                            if (--n2 < 0) {
                                while (true) {
                                    if (--n < 0) {
                                        return;
                                    }
                                    this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n3, n5 >> 14, n6 >> 14, n9, n30, n33, n36, n39, n34, n37, n40);
                                    n5 += n27;
                                    n6 = n29 + n6;
                                    n9 = n31 + n9;
                                    n3 += Rasterizer2D.Rasterizer2D_width;
                                    n33 += n35;
                                    n36 += n38;
                                    n39 += n41;
                                }
                            }
                            this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n3, n4 >> 14, n6 >> 14, n9, n30, n33, n36, n39, n34, n37, n40);
                            n4 = n28 + n4;
                            n6 = n29 + n6;
                            n9 = n31 + n9;
                            n3 += Rasterizer2D.Rasterizer2D_width;
                            n33 += n35;
                            n36 += n38;
                            n39 += n41;
                        }
                    }
                    n5 = n6 <<= 14;
                    if (n3 < 0) {
                        n5 -= n3 * n28;
                        n6 -= n3 * n29;
                        n9 -= n3 * n31;
                        n3 = 0;
                    }
                    n4 <<= 14;
                    if (n < 0) {
                        n4 -= n27 * n;
                        n = 0;
                    }
                    int n45 = n3 - n43;
                    n33 += n35 * n45;
                    n36 += n38 * n45;
                    n39 += n41 * n45;
                    if (n28 >= n29) {
                        n2 -= n;
                        n -= n3;
                        n3 = nArray2[n3];
                        while (true) {
                            if (--n < 0) {
                                while (true) {
                                    if (--n2 < 0) {
                                        return;
                                    }
                                    this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n3, n4 >> 14, n5 >> 14, n9, n30, n33, n36, n39, n34, n37, n40);
                                    n5 += n28;
                                    n4 = n27 + n4;
                                    n9 = n31 + n9;
                                    n3 += Rasterizer2D.Rasterizer2D_width;
                                    n33 += n35;
                                    n36 += n38;
                                    n39 += n41;
                                }
                            }
                            this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n3, n6 >> 14, n5 >> 14, n9, n30, n33, n36, n39, n34, n37, n40);
                            n5 += n28;
                            n6 = n29 + n6;
                            n9 = n31 + n9;
                            n3 += Rasterizer2D.Rasterizer2D_width;
                            n33 += n35;
                            n36 += n38;
                            n39 += n41;
                        }
                    }
                    n2 -= n;
                    n -= n3;
                    n3 = nArray2[n3];
                    while (true) {
                        if (--n < 0) {
                            while (true) {
                                if (--n2 < 0) {
                                    return;
                                }
                                this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n3, n5 >> 14, n4 >> 14, n9, n30, n33, n36, n39, n34, n37, n40);
                                n5 += n28;
                                n4 = n27 + n4;
                                n9 = n31 + n9;
                                n3 += Rasterizer2D.Rasterizer2D_width;
                                n33 += n35;
                                n36 += n38;
                                n39 += n41;
                            }
                        }
                        this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n3, n5 >> 14, n6 >> 14, n9, n30, n33, n36, n39, n34, n37, n40);
                        n5 += n28;
                        n6 = n29 + n6;
                        n9 = n31 + n9;
                        n3 += Rasterizer2D.Rasterizer2D_width;
                        n33 += n35;
                        n36 += n38;
                        n39 += n41;
                    }
                }
                if (n2 >= n42) {
                    return;
                }
                if (n3 > n42) {
                    n3 = n42;
                }
                if (n > n42) {
                    n = n42;
                }
                n8 = n30 + ((n8 << 9) - n5 * n30);
                if (n3 >= n) {
                    n6 = n5 <<= 14;
                    if (n2 < 0) {
                        n6 -= n27 * n2;
                        n5 -= n28 * n2;
                        n8 -= n31 * n2;
                        n2 = 0;
                    }
                    n4 <<= 14;
                    if (n < 0) {
                        n4 -= n29 * n;
                        n = 0;
                    }
                    int n46 = n2 - n43;
                    n33 += n35 * n46;
                    n36 += n38 * n46;
                    n39 += n41 * n46;
                    if (n27 >= n28) {
                        n3 -= n;
                        n -= n2;
                        n2 = nArray2[n2];
                        while (true) {
                            if (--n < 0) {
                                while (true) {
                                    if (--n3 < 0) {
                                        return;
                                    }
                                    this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n2, n5 >> 14, n4 >> 14, n8, n30, n33, n36, n39, n34, n37, n40);
                                    n4 = n29 + n4;
                                    n5 += n28;
                                    n8 += n31;
                                    n2 += Rasterizer2D.Rasterizer2D_width;
                                    n33 += n35;
                                    n36 += n38;
                                    n39 += n41;
                                }
                            }
                            this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n2, n5 >> 14, n6 >> 14, n8, n30, n33, n36, n39, n34, n37, n40);
                            n6 = n27 + n6;
                            n5 += n28;
                            n8 += n31;
                            n2 += Rasterizer2D.Rasterizer2D_width;
                            n33 += n35;
                            n36 += n38;
                            n39 += n41;
                        }
                    }
                    n3 -= n;
                    n -= n2;
                    n2 = nArray2[n2];
                    while (true) {
                        if (--n < 0) {
                            while (true) {
                                if (--n3 < 0) {
                                    return;
                                }
                                this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n2, n4 >> 14, n5 >> 14, n8, n30, n33, n36, n39, n34, n37, n40);
                                n4 = n29 + n4;
                                n5 += n28;
                                n8 += n31;
                                n2 += Rasterizer2D.Rasterizer2D_width;
                                n33 += n35;
                                n36 += n38;
                                n39 += n41;
                            }
                        }
                        this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n2, n6 >> 14, n5 >> 14, n8, n30, n33, n36, n39, n34, n37, n40);
                        n6 = n27 + n6;
                        n5 += n28;
                        n8 += n31;
                        n2 += Rasterizer2D.Rasterizer2D_width;
                        n33 += n35;
                        n36 += n38;
                        n39 += n41;
                    }
                }
                n4 = n5 <<= 14;
                if (n2 < 0) {
                    n4 -= n27 * n2;
                    n5 -= n28 * n2;
                    n8 -= n31 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n3 * n29;
                    n3 = 0;
                }
                int n47 = n2 - n43;
                n33 += n35 * n47;
                n36 += n38 * n47;
                n39 += n41 * n47;
                if (!(n3 != n2 && n27 < n28 || n3 == n2 && n27 > n29)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = nArray2[n2];
                    while (true) {
                        if (--n3 < 0) {
                            while (true) {
                                if (--n < 0) {
                                    return;
                                }
                                this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n2, n6 >> 14, n4 >> 14, n8, n30, n33, n36, n39, n34, n37, n40);
                                n4 = n27 + n4;
                                n6 = n29 + n6;
                                n8 += n31;
                                n2 += Rasterizer2D.Rasterizer2D_width;
                                n33 += n35;
                                n36 += n38;
                                n39 += n41;
                            }
                        }
                        this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n2, n5 >> 14, n4 >> 14, n8, n30, n33, n36, n39, n34, n37, n40);
                        n4 = n27 + n4;
                        n5 += n28;
                        n8 += n31;
                        n2 += Rasterizer2D.Rasterizer2D_width;
                        n33 += n35;
                        n36 += n38;
                        n39 += n41;
                    }
                }
                n -= n3;
                n3 -= n2;
                n2 = nArray2[n2];
                while (true) {
                    if (--n3 < 0) {
                        while (true) {
                            if (--n < 0) {
                                return;
                            }
                            this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n2, n4 >> 14, n6 >> 14, n8, n30, n33, n36, n39, n34, n37, n40);
                            n4 = n27 + n4;
                            n6 = n29 + n6;
                            n8 += n31;
                            n2 += Rasterizer2D.Rasterizer2D_width;
                            n33 += n35;
                            n36 += n38;
                            n39 += n41;
                        }
                    }
                    this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n2, n4 >> 14, n5 >> 14, n8, n30, n33, n36, n39, n34, n37, n40);
                    n4 = n27 + n4;
                    n5 += n28;
                    n8 += n31;
                    n2 += Rasterizer2D.Rasterizer2D_width;
                    n33 += n35;
                    n36 += n38;
                    n39 += n41;
                }
            }
            if (n >= n42) {
                return;
            }
            if (n2 > n42) {
                n2 = n42;
            }
            if (n3 > n42) {
                n3 = n42;
            }
            n7 = n30 + ((n7 << 9) - n30 * n4);
            if (n2 >= n3) {
                n5 = n4 <<= 14;
                if (n < 0) {
                    n5 -= n29 * n;
                    n4 -= n27 * n;
                    n7 -= n31 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n3 * n28;
                    n3 = 0;
                }
                int n48 = n - n43;
                n33 += n35 * n48;
                n36 += n38 * n48;
                n39 += n41 * n48;
                if (n3 != n && n29 < n27 || n3 == n && n28 > n27) {
                    n2 -= n3;
                    n3 -= n;
                    n = nArray2[n];
                    while (true) {
                        if (--n3 < 0) {
                            while (true) {
                                if (--n2 < 0) {
                                    return;
                                }
                                this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n, n6 >> 14, n4 >> 14, n7, n30, n33, n36, n39, n34, n37, n40);
                                n6 = n28 + n6;
                                n4 = n27 + n4;
                                n7 += n31;
                                n = Rasterizer2D.Rasterizer2D_width + n;
                                n33 += n35;
                                n36 += n38;
                                n39 += n41;
                            }
                        }
                        this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n, n5 >> 14, n4 >> 14, n7, n30, n33, n36, n39, n34, n37, n40);
                        n5 += n29;
                        n4 = n27 + n4;
                        n7 += n31;
                        n = Rasterizer2D.Rasterizer2D_width + n;
                        n33 += n35;
                        n36 += n38;
                        n39 += n41;
                    }
                }
                n2 -= n3;
                n3 -= n;
                n = nArray2[n];
                while (true) {
                    if (--n3 < 0) {
                        while (true) {
                            if (--n2 < 0) {
                                return;
                            }
                            this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n, n4 >> 14, n6 >> 14, n7, n30, n33, n36, n39, n34, n37, n40);
                            n6 = n28 + n6;
                            n4 = n27 + n4;
                            n7 += n31;
                            n = Rasterizer2D.Rasterizer2D_width + n;
                            n33 += n35;
                            n36 += n38;
                            n39 += n41;
                        }
                    }
                    this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n, n4 >> 14, n5 >> 14, n7, n30, n33, n36, n39, n34, n37, n40);
                    n5 += n29;
                    n4 = n27 + n4;
                    n7 += n31;
                    n = Rasterizer2D.Rasterizer2D_width + n;
                    n33 += n35;
                    n36 += n38;
                    n39 += n41;
                }
            }
            n6 = n4 <<= 14;
            if (n < 0) {
                n6 -= n29 * n;
                n4 -= n27 * n;
                n7 -= n31 * n;
                n = 0;
            }
            n5 <<= 14;
            if (n2 < 0) {
                n5 -= n28 * n2;
                n2 = 0;
            }
            int n49 = n - n43;
            n33 += n35 * n49;
            n36 += n38 * n49;
            n39 += n41 * n49;
            if (!(n2 != n && n29 < n27 || n2 == n && n29 > n28)) {
                n3 -= n2;
                n2 -= n;
                n = nArray2[n];
                while (true) {
                    if (--n2 < 0) {
                        while (true) {
                            if (--n3 < 0) {
                                return;
                            }
                            this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n, n5 >> 14, n6 >> 14, n7, n30, n33, n36, n39, n34, n37, n40);
                            n6 = n29 + n6;
                            n5 += n28;
                            n7 += n31;
                            n = Rasterizer2D.Rasterizer2D_width + n;
                            n33 += n35;
                            n36 += n38;
                            n39 += n41;
                        }
                    }
                    this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n, n4 >> 14, n6 >> 14, n7, n30, n33, n36, n39, n34, n37, n40);
                    n6 = n29 + n6;
                    n4 = n27 + n4;
                    n7 += n31;
                    n = Rasterizer2D.Rasterizer2D_width + n;
                    n33 += n35;
                    n36 += n38;
                    n39 += n41;
                }
            }
            n3 -= n2;
            n2 -= n;
            n = nArray2[n];
            while (true) {
                if (--n2 < 0) {
                    while (true) {
                        if (--n3 < 0) {
                            return;
                        }
                        this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n, n6 >> 14, n5 >> 14, n7, n30, n33, n36, n39, n34, n37, n40);
                        n6 = n29 + n6;
                        n5 += n28;
                        n7 += n31;
                        n = Rasterizer2D.Rasterizer2D_width + n;
                        n33 += n35;
                        n36 += n38;
                        n39 += n41;
                    }
                }
                this.method4720(Rasterizer2D.Rasterizer2D_pixels, nArray, 0, 0, n, n6 >> 14, n4 >> 14, n7, n30, n33, n36, n39, n34, n37, n40);
                n6 = n29 + n6;
                n4 = n27 + n4;
                n7 += n31;
                n = Rasterizer2D.Rasterizer2D_width + n;
                n33 += n35;
                n36 += n38;
                n39 += n41;
            }
        }
        int n50 = this.field1982.Rasterizer3D_textureLoader.getAverageTextureRGB(n19);
        this.vmethod4753(n, n2, n3, n4, n5, n6, f, f2, f3, class185.method4131(n50, n7), class185.method4131(n50, n8), class185.method4131(n50, n9));
    }

    @ObfuscatedName(value="bz")
    final void method4716(int[] nArray, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.field1982.field2308) {
            if (n5 > this.field1982.field2303) {
                n5 = this.field1982.field2303;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n = n4 + n;
        n6 = n4 * n7 + n6;
        if (!this.field1982.field2290) {
            n3 = n5 - n4;
            if (this.field1982.field2291 != 0) {
                int n8 = this.field1982.field2291;
                int n9 = 256 - this.field1982.field2291;
                do {
                    int n10 = (n6 & (n6 >> 31 & 1) - 1) >> 8;
                    n2 = this.field1989[n10];
                    n6 = n7 + n6;
                    n2 = ((n2 & 0xFF00FF) * n9 >> 8 & 0xFF00FF) + (n9 * (n2 & 0xFF00) >> 8 & 0xFF00);
                    int n11 = nArray[n];
                    nArray[n++] = n2 + ((n11 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + (n8 * (n11 & 0xFF00) >> 8 & 0xFF00);
                } while (--n3 > 0);
            } else {
                do {
                    int n12 = (n6 & (n6 >> 31 & 1) - 1) >> 8;
                    nArray[n++] = this.field1989[n12];
                    n6 = n7 + n6;
                } while (--n3 > 0);
            }
            return;
        }
        n3 = n5 - n4 >> 2;
        n7 <<= 2;
        if (this.field1982.field2291 != 0) {
            int n13;
            int n14;
            int n15 = this.field1982.field2291;
            int n16 = 256 - this.field1982.field2291;
            if (n3 > 0) {
                do {
                    n14 = (n6 & (n6 >> 31 & 1) - 1) >> 8;
                    n2 = this.field1989[n14];
                    n6 = n7 + n6;
                    n2 = ((n2 & 0xFF00FF) * n16 >> 8 & 0xFF00FF) + (n16 * (n2 & 0xFF00) >> 8 & 0xFF00);
                    n13 = nArray[n];
                    nArray[n++] = n2 + ((n13 & 0xFF00FF) * n15 >> 8 & 0xFF00FF) + (n15 * (n13 & 0xFF00) >> 8 & 0xFF00);
                    n13 = nArray[n];
                    nArray[n++] = n2 + ((n13 & 0xFF00FF) * n15 >> 8 & 0xFF00FF) + (n15 * (n13 & 0xFF00) >> 8 & 0xFF00);
                    n13 = nArray[n];
                    nArray[n++] = n2 + ((n13 & 0xFF00FF) * n15 >> 8 & 0xFF00FF) + (n15 * (n13 & 0xFF00) >> 8 & 0xFF00);
                    n13 = nArray[n];
                    nArray[n++] = n2 + ((n13 & 0xFF00FF) * n15 >> 8 & 0xFF00FF) + (n15 * (n13 & 0xFF00) >> 8 & 0xFF00);
                } while (--n3 > 0);
            }
            if ((n3 = n5 - n4 & 3) > 0) {
                n14 = (n6 & (n6 >> 31 & 1) - 1) >> 8;
                n2 = this.field1989[n14];
                n2 = ((n2 & 0xFF00FF) * n16 >> 8 & 0xFF00FF) + (n16 * (n2 & 0xFF00) >> 8 & 0xFF00);
                do {
                    n13 = nArray[n];
                    nArray[n++] = n2 + ((n13 & 0xFF00FF) * n15 >> 8 & 0xFF00FF) + (n15 * (n13 & 0xFF00) >> 8 & 0xFF00);
                } while (--n3 > 0);
            }
        } else {
            int n17;
            if (n3 > 0) {
                do {
                    n17 = (n6 & (n6 >> 31 & 1) - 1) >> 8;
                    n2 = this.field1989[n17];
                    n6 = n7 + n6;
                    nArray[n++] = n2;
                    nArray[n++] = n2;
                    nArray[n++] = n2;
                    nArray[n++] = n2;
                } while (--n3 > 0);
            }
            if ((n3 = n5 - n4 & 3) > 0) {
                n17 = (n6 & (n6 >> 31 & 1) - 1) >> 8;
                n2 = this.field1989[n17];
                do {
                    nArray[n++] = n2;
                } while (--n3 > 0);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="bt")
    void method4713(int[] nArray, int n, int n2, int n3, int n4, int n5) {
        if (this.field1982.field2308) {
            if (n5 > this.field1982.field2303) {
                n5 = this.field1982.field2303;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n = n4 + n;
        n3 = n5 - n4 >> 2;
        if (this.field1982.field2291 != 0) {
            if (this.field1982.field2291 != 254) {
                int n6 = this.field1982.field2291;
                int n7 = 256 - this.field1982.field2291;
                n2 = ((n2 & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + (n7 * (n2 & 0xFF00) >> 8 & 0xFF00);
                while (true) {
                    int n8;
                    if (--n3 < 0) {
                        n3 = n5 - n4 & 3;
                        while (--n3 >= 0) {
                            n8 = nArray[n];
                            nArray[n++] = n2 + ((n8 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + (n6 * (n8 & 0xFF00) >> 8 & 0xFF00);
                        }
                        return;
                    }
                    n8 = nArray[n];
                    nArray[n++] = n2 + ((n8 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + (n6 * (n8 & 0xFF00) >> 8 & 0xFF00);
                    n8 = nArray[n];
                    nArray[n++] = n2 + ((n8 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + (n6 * (n8 & 0xFF00) >> 8 & 0xFF00);
                    n8 = nArray[n];
                    nArray[n++] = n2 + ((n8 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + (n6 * (n8 & 0xFF00) >> 8 & 0xFF00);
                    n8 = nArray[n];
                    nArray[n++] = n2 + ((n8 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + (n6 * (n8 & 0xFF00) >> 8 & 0xFF00);
                }
            }
            while (true) {
                if (--n3 < 0) {
                    n3 = n5 - n4 & 3;
                    while (--n3 >= 0) {
                        nArray[n++] = nArray[n];
                    }
                    return;
                }
                nArray[n++] = nArray[n];
                nArray[n++] = nArray[n];
                nArray[n++] = nArray[n];
                nArray[n++] = nArray[n];
            }
        }
        while (true) {
            if (--n3 < 0) {
                n3 = n5 - n4 & 3;
                while (true) {
                    if (--n3 < 0) {
                        return;
                    }
                    nArray[n++] = n2;
                }
            }
            nArray[n++] = n2;
            nArray[n++] = n2;
            nArray[n++] = n2;
            nArray[n++] = n2;
        }
    }

    @ObfuscatedName(value="bf")
    void method4715(int[] nArray, int[] nArray2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13) {
        if (this.field1982.field2308) {
            if (n5 > this.field1982.field2303) {
                n5 = this.field1982.field2303;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n3 += n4;
        n6 = n7 * n4 + n6;
        int n14 = n5 - n4;
        if (!this.field1981) {
            int n15;
            int n16;
            int n17;
            int n18;
            int n19 = n4 - this.field1982.field2301;
            n8 += (n11 >> 3) * n19;
            n9 += n19 * (n12 >> 3);
            int n20 = (n10 = (n13 >> 3) * n19 + n10) >> 14;
            if (n20 == 0) {
                n18 = 0;
                n17 = 0;
            } else {
                n18 = n8 / n20;
                n17 = n9 / n20;
                if (n18 < 0) {
                    n18 = 0;
                } else if (n18 > 16256) {
                    n18 = 16256;
                }
            }
            n8 = n11 + n8;
            n9 += n12;
            n10 = n13 + n10;
            n20 = n10 >> 14;
            if (n20 == 0) {
                n16 = 0;
                n15 = 0;
            } else {
                n16 = n8 / n20;
                n15 = n9 / n20;
                if (n16 < 0) {
                    n16 = 0;
                } else if (n16 > 16256) {
                    n16 = 16256;
                }
            }
            n = (n18 << 18) + n17;
            int n21 = (n15 - n17 >> 3) + (n16 - n18 >> 3 << 18);
            n14 >>= 3;
            n7 <<= 3;
            int n22 = n6 >> 8;
            if (!this.field1983) {
                if (n14 > 0) {
                    do {
                        if ((n2 = nArray2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            nArray[n3] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)]) != 0) {
                            nArray[n3] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)]) != 0) {
                            nArray[n3] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)]) != 0) {
                            nArray[n3] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)]) != 0) {
                            nArray[n3] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)]) != 0) {
                            nArray[n3] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)]) != 0) {
                            nArray[n3] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)]) != 0) {
                            nArray[n3] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n21;
                        n18 = n16;
                        n17 = n15;
                        n8 = n11 + n8;
                        n9 += n12;
                        n20 = (n10 = n13 + n10) >> 14;
                        if (n20 == 0) {
                            n16 = 0;
                            n15 = 0;
                        } else {
                            n16 = n8 / n20;
                            n15 = n9 / n20;
                            if (n16 < 0) {
                                n16 = 0;
                            } else if (n16 > 16256) {
                                n16 = 16256;
                            }
                        }
                        n = (n18 << 18) + n17;
                        n21 = (n15 - n17 >> 3) + (n16 - n18 >> 3 << 18);
                        n22 = (n6 += n7) >> 8;
                    } while (--n14 > 0);
                }
                if ((n14 = n5 - n4 & 7) > 0) {
                    do {
                        if ((n2 = nArray2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            nArray[n3] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n21;
                    } while (--n14 > 0);
                }
            } else {
                if (n14 > 0) {
                    do {
                        n2 = nArray2[(n & 0x3F80) + (n >>> 25)];
                        nArray[n3++] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)];
                        nArray[n3++] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)];
                        nArray[n3++] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)];
                        nArray[n3++] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)];
                        nArray[n3++] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)];
                        nArray[n3++] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)];
                        nArray[n3++] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)];
                        nArray[n3++] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n += n21;
                        n18 = n16;
                        n17 = n15;
                        n8 = n11 + n8;
                        n9 += n12;
                        n20 = (n10 = n13 + n10) >> 14;
                        if (n20 == 0) {
                            n16 = 0;
                            n15 = 0;
                        } else {
                            n16 = n8 / n20;
                            n15 = n9 / n20;
                            if (n16 < 0) {
                                n16 = 0;
                            } else if (n16 > 16256) {
                                n16 = 16256;
                            }
                        }
                        n = (n18 << 18) + n17;
                        n21 = (n15 - n17 >> 3) + (n16 - n18 >> 3 << 18);
                        n22 = (n6 += n7) >> 8;
                    } while (--n14 > 0);
                }
                if ((n14 = n5 - n4 & 7) > 0) {
                    do {
                        n2 = nArray2[(n & 0x3F80) + (n >>> 25)];
                        nArray[n3++] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n += n21;
                    } while (--n14 > 0);
                }
            }
        } else {
            int n23;
            int n24;
            int n25;
            int n26;
            int n27 = n4 - this.field1982.field2301;
            n8 += (n11 >> 3) * n27;
            n9 += n27 * (n12 >> 3);
            n10 = (n13 >> 3) * n27 + n10;
            int n28 = n10 >> 12;
            if (n28 == 0) {
                n26 = 0;
                n25 = 0;
            } else {
                n26 = n8 / n28;
                n25 = n9 / n28;
                if (n26 < 0) {
                    n26 = 0;
                } else if (n26 > 4032) {
                    n26 = 4032;
                }
            }
            n8 = n11 + n8;
            n9 += n12;
            n10 = n13 + n10;
            n28 = n10 >> 12;
            if (n28 == 0) {
                n24 = 0;
                n23 = 0;
            } else {
                n24 = n8 / n28;
                n23 = n9 / n28;
                if (n24 < 0) {
                    n24 = 0;
                } else if (n24 > 4032) {
                    n24 = 4032;
                }
            }
            n = (n26 << 20) + n25;
            int n29 = (n23 - n25 >> 3) + (n24 - n26 >> 3 << 20);
            n14 >>= 3;
            n7 <<= 3;
            int n30 = n6 >> 8;
            if (!this.field1983) {
                if (n14 > 0) {
                    do {
                        if ((n2 = nArray2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            nArray[n3] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)]) != 0) {
                            nArray[n3] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)]) != 0) {
                            nArray[n3] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)]) != 0) {
                            nArray[n3] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)]) != 0) {
                            nArray[n3] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)]) != 0) {
                            nArray[n3] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)]) != 0) {
                            nArray[n3] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)]) != 0) {
                            nArray[n3] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n29;
                        n26 = n24;
                        n25 = n23;
                        n8 = n11 + n8;
                        n9 += n12;
                        n28 = (n10 = n13 + n10) >> 12;
                        if (n28 == 0) {
                            n24 = 0;
                            n23 = 0;
                        } else {
                            n24 = n8 / n28;
                            n23 = n9 / n28;
                            if (n24 < 0) {
                                n24 = 0;
                            } else if (n24 > 4032) {
                                n24 = 4032;
                            }
                        }
                        n = (n26 << 20) + n25;
                        n29 = (n23 - n25 >> 3) + (n24 - n26 >> 3 << 20);
                        n30 = (n6 += n7) >> 8;
                    } while (--n14 > 0);
                }
                if ((n14 = n5 - n4 & 7) > 0) {
                    do {
                        if ((n2 = nArray2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            nArray[n3] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n29;
                    } while (--n14 > 0);
                }
            } else {
                if (n14 > 0) {
                    do {
                        n2 = nArray2[(n & 0xFC0) + (n >>> 26)];
                        nArray[n3++] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)];
                        nArray[n3++] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)];
                        nArray[n3++] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)];
                        nArray[n3++] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)];
                        nArray[n3++] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)];
                        nArray[n3++] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)];
                        nArray[n3++] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)];
                        nArray[n3++] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n += n29;
                        n26 = n24;
                        n25 = n23;
                        n8 = n11 + n8;
                        n9 += n12;
                        n28 = (n10 = n13 + n10) >> 12;
                        if (n28 == 0) {
                            n24 = 0;
                            n23 = 0;
                        } else {
                            n24 = n8 / n28;
                            n23 = n9 / n28;
                            if (n24 < 0) {
                                n24 = 0;
                            } else if (n24 > 4032) {
                                n24 = 4032;
                            }
                        }
                        n = (n26 << 20) + n25;
                        n29 = (n23 - n25 >> 3) + (n24 - n26 >> 3 << 20);
                        n30 = (n6 += n7) >> 8;
                    } while (--n14 > 0);
                }
                if ((n14 = n5 - n4 & 7) > 0) {
                    do {
                        n2 = nArray2[(n & 0xFC0) + (n >>> 26)];
                        nArray[n3++] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n += n29;
                    } while (--n14 > 0);
                }
            }
        }
    }

    @ObfuscatedName(value="by")
    void method4720(int[] nArray, int[] nArray2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13) {
        if (this.field1982.field2308) {
            if (n5 > this.field1982.field2303) {
                n5 = this.field1982.field2303;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n3 += n4;
        n6 = n7 * n4 + n6;
        int n14 = n5 - n4;
        if (!this.field1981) {
            int n15;
            int n16;
            int n17;
            int n18;
            int n19 = n4 - this.field1982.field2301;
            n8 += n11 * n19;
            n9 = n19 * n12 + n9;
            int n20 = (n10 = n19 * n13 + n10) >> 14;
            if (n20 == 0) {
                n18 = 0;
                n17 = 0;
            } else {
                n18 = n8 / n20;
                n17 = n9 / n20;
            }
            n8 += n11 * n14;
            n9 = n14 * n12 + n9;
            n10 = n14 * n13 + n10;
            n20 = n10 >> 14;
            if (n20 == 0) {
                n16 = 0;
                n15 = 0;
            } else {
                n16 = n8 / n20;
                n15 = n9 / n20;
            }
            n = (n18 << 18) + n17;
            int n21 = (n15 - n17) / n14 + ((n16 - n18) / n14 << 18);
            n14 >>= 3;
            n7 <<= 3;
            int n22 = n6 >> 8;
            if (!this.field1983) {
                if (n14 > 0) {
                    do {
                        if ((n2 = nArray2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            nArray[n3] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)]) != 0) {
                            nArray[n3] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)]) != 0) {
                            nArray[n3] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)]) != 0) {
                            nArray[n3] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)]) != 0) {
                            nArray[n3] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)]) != 0) {
                            nArray[n3] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)]) != 0) {
                            nArray[n3] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)]) != 0) {
                            nArray[n3] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n21;
                        n22 = (n6 += n7) >> 8;
                    } while (--n14 > 0);
                }
                if ((n14 = n5 - n4 & 7) > 0) {
                    do {
                        if ((n2 = nArray2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            nArray[n3] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n21;
                    } while (--n14 > 0);
                }
            } else {
                if (n14 > 0) {
                    do {
                        n2 = nArray2[(n & 0x3F80) + (n >>> 25)];
                        nArray[n3++] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)];
                        nArray[n3++] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)];
                        nArray[n3++] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)];
                        nArray[n3++] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)];
                        nArray[n3++] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)];
                        nArray[n3++] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)];
                        nArray[n3++] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n21) & 0x3F80) + (n >>> 25)];
                        nArray[n3++] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n += n21;
                        n22 = (n6 += n7) >> 8;
                    } while (--n14 > 0);
                }
                if ((n14 = n5 - n4 & 7) > 0) {
                    do {
                        n2 = nArray2[(n & 0x3F80) + (n >>> 25)];
                        nArray[n3++] = (n22 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n22 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n += n21;
                    } while (--n14 > 0);
                }
            }
        } else {
            int n23;
            int n24;
            int n25;
            int n26;
            int n27 = n4 - this.field1982.field2301;
            n8 += n11 * n27;
            n9 = n27 * n12 + n9;
            n10 = n27 * n13 + n10;
            int n28 = n10 >> 12;
            if (n28 == 0) {
                n26 = 0;
                n25 = 0;
            } else {
                n26 = n8 / n28;
                n25 = n9 / n28;
            }
            n8 += n11 * n14;
            n9 = n14 * n12 + n9;
            n10 = n14 * n13 + n10;
            n28 = n10 >> 12;
            if (n28 == 0) {
                n24 = 0;
                n23 = 0;
            } else {
                n24 = n8 / n28;
                n23 = n9 / n28;
            }
            n = (n26 << 20) + n25;
            int n29 = (n23 - n25) / n14 + ((n24 - n26) / n14 << 20);
            n14 >>= 3;
            n7 <<= 3;
            int n30 = n6 >> 8;
            if (!this.field1983) {
                if (n14 > 0) {
                    do {
                        if ((n2 = nArray2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            nArray[n3] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)]) != 0) {
                            nArray[n3] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)]) != 0) {
                            nArray[n3] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)]) != 0) {
                            nArray[n3] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)]) != 0) {
                            nArray[n3] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)]) != 0) {
                            nArray[n3] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)]) != 0) {
                            nArray[n3] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        if ((n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)]) != 0) {
                            nArray[n3] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n29;
                        n30 = (n6 += n7) >> 8;
                    } while (--n14 > 0);
                }
                if ((n14 = n5 - n4 & 7) > 0) {
                    do {
                        if ((n2 = nArray2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            nArray[n3] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n29;
                    } while (--n14 > 0);
                }
            } else {
                if (n14 > 0) {
                    do {
                        n2 = nArray2[(n & 0xFC0) + (n >>> 26)];
                        nArray[n3++] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)];
                        nArray[n3++] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)];
                        nArray[n3++] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)];
                        nArray[n3++] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)];
                        nArray[n3++] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)];
                        nArray[n3++] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)];
                        nArray[n3++] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n2 = nArray2[((n += n29) & 0xFC0) + (n >>> 26)];
                        nArray[n3++] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n += n29;
                        n30 = (n6 += n7) >> 8;
                    } while (--n14 > 0);
                }
                if ((n14 = n5 - n4 & 7) > 0) {
                    do {
                        n2 = nArray2[(n & 0xFC0) + (n >>> 26)];
                        nArray[n3++] = (n30 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n2 & 0xFF00) & 0xFF0000) >> 8;
                        n += n29;
                    } while (--n14 > 0);
                }
            }
        }
    }
}

