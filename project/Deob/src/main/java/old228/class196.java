package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="ho")
public final class class196 {
    @ObfuscatedName(value="ak")
    static int[] field2173 = new int[6];
    @ObfuscatedName(value="al")
    static int[] field2159 = new int[6];
    @ObfuscatedName(value="av")
    static float[] field2174 = new float[6];
    @ObfuscatedName(value="ag")
    static int[] field2178 = new int[6];
    @ObfuscatedName(value="aw")
    static int[] field2177 = new int[6];
    @ObfuscatedName(value="ai")
    static int[] field2158 = new int[6];
    @ObfuscatedName(value="ar")
    static final int[][] field2179 = new int[][]{{1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 2, 6}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 13, 14}};
    @ObfuscatedName(value="am")
    static final int[][] field2180 = new int[][]{{0, 1, 2, 3, 0, 0, 1, 3}, {1, 1, 2, 3, 1, 0, 1, 3}, {0, 1, 2, 3, 1, 0, 1, 3}, {0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3}, {0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4}, {0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4}, {0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, {0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3}, {0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5}, {0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5}, {0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3}, {1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3}, {1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}};
    @ObfuscatedName(value="ay")
    int[] field2170;
    @ObfuscatedName(value="ah")
    int[] field2176;
    @ObfuscatedName(value="az")
    int[] field2160;
    @ObfuscatedName(value="ao")
    int[] field2161;
    @ObfuscatedName(value="ad")
    int[] field2162;
    @ObfuscatedName(value="an")
    int[] field2175;
    @ObfuscatedName(value="ae")
    int[] field2164;
    @ObfuscatedName(value="ax")
    int[] field2165;
    @ObfuscatedName(value="at")
    int[] field2166;
    @ObfuscatedName(value="ac")
    int[] field2167;
    @ObfuscatedName(value="au")
    boolean field2168 = true;
    @ObfuscatedName(value="as")
    int field2169;
    @ObfuscatedName(value="aq")
    int field2163;
    @ObfuscatedName(value="af")
    int field2171;
    @ObfuscatedName(value="aa")
    int field2172;

    class196(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19) {
        if (n7 != n6 || n8 != n6 || n9 != n6) {
            this.field2168 = false;
        }
        this.field2169 = n;
        this.field2163 = n2;
        this.field2171 = n18;
        this.field2172 = n19;
        int n20 = 128;
        int n21 = n20 / 2;
        int n22 = n20 / 4;
        int n23 = n20 * 3 / 4;
        int[] nArray = field2179[n];
        int n24 = nArray.length;
        this.field2170 = new int[n24];
        this.field2176 = new int[n24];
        this.field2160 = new int[n24];
        int[] nArray2 = new int[n24];
        int[] nArray3 = new int[n24];
        int n25 = n20 * n4;
        int n26 = n5 * n20;
        int n27 = 0;
        while (true) {
            int n28;
            int n29;
            int n30;
            int n31;
            int n32;
            int n33;
            if (n27 >= n24) {
                int[] nArray4 = field2180[n];
                n33 = nArray4.length / 4;
                this.field2164 = new int[n33];
                this.field2165 = new int[n33];
                this.field2166 = new int[n33];
                this.field2161 = new int[n33];
                this.field2162 = new int[n33];
                this.field2175 = new int[n33];
                if (n3 != -1) {
                    this.field2167 = new int[n33];
                }
                n32 = 0;
                n31 = 0;
                while (true) {
                    if (n31 >= n33) {
                        n31 = n6;
                        n30 = n7;
                        if (n7 < n31) {
                            n31 = n7;
                        }
                        if (n7 > n30) {
                            n30 = n7;
                        }
                        if (n8 < n31) {
                            n31 = n8;
                        }
                        if (n8 > n30) {
                            n30 = n8;
                        }
                        if (n9 < n31) {
                            n31 = n9;
                        }
                        if (n9 > n30) {
                            n30 = n9;
                        }
                        n31 /= 14;
                        n30 /= 14;
                        return;
                    }
                    n30 = nArray4[n32];
                    n29 = nArray4[n32 + 1];
                    n28 = nArray4[n32 + 2];
                    int n34 = nArray4[n32 + 3];
                    n32 += 4;
                    if (n29 < 4) {
                        n29 = n29 - n2 & 3;
                    }
                    if (n28 < 4) {
                        n28 = n28 - n2 & 3;
                    }
                    if (n34 < 4) {
                        n34 = n34 - n2 & 3;
                    }
                    this.field2164[n31] = n29;
                    this.field2165[n31] = n28;
                    this.field2166[n31] = n34;
                    if (n30 != 0) {
                        this.field2161[n31] = nArray3[n29];
                        this.field2162[n31] = nArray3[n28];
                        this.field2175[n31] = nArray3[n34];
                        if (this.field2167 != null) {
                            this.field2167[n31] = n3;
                        }
                    } else {
                        this.field2161[n31] = nArray2[n29];
                        this.field2162[n31] = nArray2[n28];
                        this.field2175[n31] = nArray2[n34];
                        if (this.field2167 != null) {
                            this.field2167[n31] = -1;
                        }
                    }
                    ++n31;
                }
            }
            n33 = nArray[n27];
            if ((n33 & 1) == 0 && n33 <= 8) {
                n33 = (n33 - n2 - n2 - 1 & 7) + 1;
            }
            if (n33 > 8 && n33 <= 12) {
                n33 = (n33 - 9 - n2 & 3) + 9;
            }
            if (n33 > 12 && n33 <= 16) {
                n33 = (n33 - 13 - n2 & 3) + 13;
            }
            if (n33 != 1) {
                if (n33 != 2) {
                    if (n33 != 3) {
                        if (n33 != 4) {
                            if (n33 != 5) {
                                if (n33 != 6) {
                                    if (n33 != 7) {
                                        if (n33 != 8) {
                                            if (n33 != 9) {
                                                if (n33 != 10) {
                                                    if (n33 != 11) {
                                                        if (n33 != 12) {
                                                            if (n33 != 13) {
                                                                if (n33 != 14) {
                                                                    if (n33 != 15) {
                                                                        n32 = n25 + n22;
                                                                        n31 = n26 + n23;
                                                                        n30 = n9;
                                                                        n29 = n13;
                                                                        n28 = n17;
                                                                    } else {
                                                                        n32 = n25 + n23;
                                                                        n31 = n26 + n23;
                                                                        n30 = n8;
                                                                        n29 = n12;
                                                                        n28 = n16;
                                                                    }
                                                                } else {
                                                                    n32 = n25 + n23;
                                                                    n31 = n26 + n22;
                                                                    n30 = n7;
                                                                    n29 = n11;
                                                                    n28 = n15;
                                                                }
                                                            } else {
                                                                n32 = n25 + n22;
                                                                n31 = n26 + n22;
                                                                n30 = n6;
                                                                n29 = n10;
                                                                n28 = n14;
                                                            }
                                                        } else {
                                                            n32 = n25 + n22;
                                                            n31 = n26 + n21;
                                                            n30 = n9 + n6 >> 1;
                                                            n29 = n13 + n10 >> 1;
                                                            n28 = n17 + n14 >> 1;
                                                        }
                                                    } else {
                                                        n32 = n25 + n21;
                                                        n31 = n26 + n23;
                                                        n30 = n8 + n9 >> 1;
                                                        n29 = n13 + n12 >> 1;
                                                        n28 = n17 + n16 >> 1;
                                                    }
                                                } else {
                                                    n32 = n25 + n23;
                                                    n31 = n26 + n21;
                                                    n30 = n8 + n7 >> 1;
                                                    n29 = n11 + n12 >> 1;
                                                    n28 = n15 + n16 >> 1;
                                                }
                                            } else {
                                                n32 = n25 + n21;
                                                n31 = n26 + n22;
                                                n30 = n7 + n6 >> 1;
                                                n29 = n11 + n10 >> 1;
                                                n28 = n15 + n14 >> 1;
                                            }
                                        } else {
                                            n32 = n25;
                                            n31 = n26 + n21;
                                            n30 = n9 + n6 >> 1;
                                            n29 = n13 + n10 >> 1;
                                            n28 = n17 + n14 >> 1;
                                        }
                                    } else {
                                        n32 = n25;
                                        n31 = n26 + n20;
                                        n30 = n9;
                                        n29 = n13;
                                        n28 = n17;
                                    }
                                } else {
                                    n32 = n25 + n21;
                                    n31 = n26 + n20;
                                    n30 = n8 + n9 >> 1;
                                    n29 = n13 + n12 >> 1;
                                    n28 = n17 + n16 >> 1;
                                }
                            } else {
                                n32 = n25 + n20;
                                n31 = n26 + n20;
                                n30 = n8;
                                n29 = n12;
                                n28 = n16;
                            }
                        } else {
                            n32 = n25 + n20;
                            n31 = n26 + n21;
                            n30 = n8 + n7 >> 1;
                            n29 = n11 + n12 >> 1;
                            n28 = n15 + n16 >> 1;
                        }
                    } else {
                        n32 = n25 + n20;
                        n31 = n26;
                        n30 = n7;
                        n29 = n11;
                        n28 = n15;
                    }
                } else {
                    n32 = n25 + n21;
                    n31 = n26;
                    n30 = n7 + n6 >> 1;
                    n29 = n11 + n10 >> 1;
                    n28 = n15 + n14 >> 1;
                }
            } else {
                n32 = n25;
                n31 = n26;
                n30 = n6;
                n29 = n10;
                n28 = n14;
            }
            this.field2170[n27] = n32;
            this.field2176[n27] = n30;
            this.field2160[n27] = n31;
            nArray2[n27] = n29;
            nArray3[n27] = n28;
            ++n27;
        }
    }
}

