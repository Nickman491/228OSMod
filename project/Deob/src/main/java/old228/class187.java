package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Arrays;
import java.util.BitSet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="hj")
public class class187
extends class190 {
    @ObfuscatedName(value="ah")
    public static boolean field2092 = false;
    @ObfuscatedName(value="cq")
    static final int[] field2059 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
    @ObfuscatedName(value="cf")
    static final int[] field2061 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
    @ObfuscatedName(value="ct")
    static final int[] field2066 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
    @ObfuscatedName(value="ci")
    static final int[] field2074 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
    @ObfuscatedName(value="cl")
    static final int[] field2068 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
    @ObfuscatedName(value="cw")
    static final int[] field2069 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
    @ObfuscatedName(value="cj")
    static final int[] field2070 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
    @ObfuscatedName(value="ay")
    final int field2015;
    @ObfuscatedName(value="az")
    public int field2056;
    @ObfuscatedName(value="ao")
    int field2005;
    @ObfuscatedName(value="ad")
    int field2006;
    @ObfuscatedName(value="an")
    int field2032;
    @ObfuscatedName(value="ae")
    int[][][] field2008;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="[[[Lgu;")
    class181[][][] field2043;
    @ObfuscatedName(value="at")
    int field2087 = 0;
    @ObfuscatedName(value="ac")
    int field2011 = 0;
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="[Lik;")
    class209[] field2012 = new class209[32];
    @ObfuscatedName(value="as")
    int[][][] field2013;
    @ObfuscatedName(value="av")
    int field2019 = 0;
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="Lgs;")
    class175 field2020 = class175.field1837;
    @ObfuscatedName(value="aw")
    int field2021 = 0;
    @ObfuscatedName(value="ai")
    int field2022 = 0;
    @ObfuscatedName(value="ar")
    int field2023 = 0;
    @ObfuscatedName(value="am")
    public int field2024 = 0;
    @ObfuscatedName(value="ap")
    int field2025;
    @ObfuscatedName(value="ab")
    int field2026;
    @ObfuscatedName(value="aj")
    int field2027;
    @ObfuscatedName(value="bu")
    int field2028;
    @ObfuscatedName(value="bh")
    int field2029;
    @ObfuscatedName(value="bw")
    int field2030;
    @ObfuscatedName(value="bb")
    int field2031;
    @ObfuscatedName(value="bx")
    int field2090;
    @ObfuscatedName(value="bd")
    int field2100;
    @ObfuscatedName(value="bi")
    int field2034;
    @ObfuscatedName(value="bz")
    int field2097;
    @ObfuscatedName(value="bt")
    int field2036;
    @ObfuscatedName(value="bf")
    int field2014;
    @ObfuscatedName(value="by")
    int field2038;
    @ObfuscatedName(value="bm")
    public int field2002 = 0;
    @ObfuscatedName(value="bp")
    public int field2040 = 0;
    @ObfuscatedName(value="bg")
    int field2041;
    @ObfuscatedName(value="bc")
    int field2042;
    @ObfuscatedName(value="bv")
    int field2096;
    @ObfuscatedName(value="bq")
    int field2044;
    @ObfuscatedName(value="ba")
    @ObfuscatedSignature(descriptor="[Lik;")
    class209[] field2045 = new class209[5];
    @ObfuscatedName(value="bk")
    boolean field2046 = false;
    @ObfuscatedName(value="bs")
    int field2088 = 0;
    @ObfuscatedName(value="bj")
    int field2065 = 0;
    @ObfuscatedName(value="bo")
    int field2049 = 0;
    @ObfuscatedName(value="be")
    int field2050 = -1;
    @ObfuscatedName(value="bn")
    int field2051 = -1;
    @ObfuscatedName(value="br")
    public float field2067 = -1.0f;
    @ObfuscatedName(value="bl")
    public int field2053 = -1;
    @ObfuscatedName(value="cb")
    public int field2054 = -1;
    @ObfuscatedName(value="cn")
    boolean field2055 = false;
    @ObfuscatedName(value="ca")
    int field2058 = 4;
    @ObfuscatedName(value="cg")
    int[] field2048 = new int[this.field2058];
    @ObfuscatedName(value="cp")
    @ObfuscatedSignature(descriptor="[[Lhe;")
    class193[][] field2035 = new class193[this.field2058][500];
    @ObfuscatedName(value="cz")
    int field2037 = 0;
    @ObfuscatedName(value="cy")
    @ObfuscatedSignature(descriptor="[Lhe;")
    class193[] field2062 = new class193[500];
    @ObfuscatedName(value="cu")
    @ObfuscatedSignature(descriptor="Lpm;")
    class410 field2063 = new class410();
    @ObfuscatedName(value="cs")
    int[][] field2016 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
    @ObfuscatedName(value="cm")
    int[][] field2076 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
    @ObfuscatedName(value="ce")
    int[] field2077 = new int[9];
    @ObfuscatedName(value="cr")
    int field2078;
    @ObfuscatedName(value="ch")
    int field2081;
    @ObfuscatedName(value="dh")
    int field2080;
    @ObfuscatedName(value="dn")
    int field2075;
    @ObfuscatedName(value="dc")
    final int field2082;
    @ObfuscatedName(value="dm")
    BitSet field2083;
    @ObfuscatedName(value="dj")
    BitSet field2072;
    @ObfuscatedName(value="dk")
    final int field2052;
    @ObfuscatedName(value="ds")
    final int field2079;
    @ObfuscatedName(value="dr")
    final int field2039;
    @ObfuscatedName(value="dl")
    final int field2093;
    @ObfuscatedName(value="do")
    BitSet field2003;
    @ObfuscatedName(value="dg")
    BitSet field2010;
    @ObfuscatedName(value="dt")
    final int field2091;
    @ObfuscatedName(value="df")
    @ObfuscatedGetter(intValue=1515787825)
    final int field2060;
    @ObfuscatedName(value="de")
    final int field2101;
    @ObfuscatedName(value="dw")
    int field2064;
    @ObfuscatedName(value="dv")
    int field2095;
    @ObfuscatedName(value="dx")
    int field2084;
    @ObfuscatedName(value="dd")
    int field2033;
    @ObfuscatedName(value="dy")
    int field2098;
    @ObfuscatedName(value="db")
    int field2099;
    @ObfuscatedName(value="du")
    int field2086;
    @ObfuscatedName(value="da")
    int field2004;

    @ObfuscatedSignature(descriptor="(IIIIILgs;[[[I)V")
    public class187(int n, int n2, int n3, int n4, int n5, class175 class1752, int[][][] nArray) {
        this.field2005 = n2;
        this.field2006 = n3;
        this.field2032 = n4;
        this.field2043 = new class181[n2][n3][n4];
        this.field2013 = new int[n2][n3 + 1][n4 + 1];
        this.field2008 = nArray;
        this.field2019 = n5;
        this.field2020 = class1752;
        this.field2015 = n;
        if (n == -1) {
            this.field2082 = 8386816;
            this.field2083 = new BitSet(this.field2082);
            this.field2072 = new BitSet(this.field2082);
            this.field2052 = 1048352;
            this.field2079 = 32761;
            this.field2039 = 181;
            this.field2093 = 9644832;
            this.field2003 = new BitSet(this.field2093);
            this.field2010 = new BitSet(this.field2093);
            this.field2091 = 1071648;
            this.field2060 = 1;
            this.field2101 = 183;
        } else {
            this.field2082 = 0;
            this.field2083 = null;
            this.field2072 = null;
            this.field2052 = 0;
            this.field2079 = 0;
            this.field2039 = 0;
            this.field2093 = 0;
            this.field2003 = null;
            this.field2010 = null;
            this.field2091 = 0;
            this.field2060 = 0;
            this.field2101 = 0;
        }
        class185.method4156(n5);
        this.method4309();
    }

    @ObfuscatedName(value="ay")
    public void method4309() {
        int n = 0;
        block0: while (true) {
            int n2;
            if (n >= this.field2005) {
                n = 0;
                while (true) {
                    if (n >= this.field2058) {
                        n = 0;
                        while (true) {
                            if (n >= this.field2011) {
                                this.field2011 = 0;
                                for (n = 0; n < this.field2045.length; ++n) {
                                    this.field2045[n] = null;
                                }
                                return;
                            }
                            this.field2012[n] = null;
                            ++n;
                        }
                    }
                    for (n2 = 0; n2 < this.field2048[n]; ++n2) {
                        this.field2035[n][n2] = null;
                    }
                    this.field2048[n] = 0;
                    ++n;
                }
            }
            n2 = 0;
            while (true) {
                if (n2 >= this.field2006) {
                    ++n;
                    continue block0;
                }
                for (int i = 0; i < this.field2032; ++i) {
                    this.field2043[n][n2][i] = null;
                }
                ++n2;
            }
            break;
        }
    }

    @ObfuscatedName(value="ah")
    public void method4175(int n) {
        this.field2087 = n;
        int n2 = 0;
        while (n2 < this.field2006) {
            for (int i = 0; i < this.field2032; ++i) {
                if (this.field2043[n][n2][i] != null) continue;
                this.field2043[n][n2][i] = new class181(n, n2, i);
            }
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="az")
    public void method4201(int n, int n2) {
        class181 class1812 = this.field2043[0][n][n2];
        int n3 = 0;
        while (true) {
            if (n3 >= 3) {
                if (this.field2043[0][n][n2] == null) {
                    this.field2043[0][n][n2] = new class181(0, n, n2);
                }
                this.field2043[0][n][n2].field1933 = class1812;
                this.field2043[3][n][n2] = null;
                return;
            }
            this.field2043[n3][n][n2] = this.field2043[n3 + 1][n][n2];
            class181 class1813 = this.field2043[n3][n][n2];
            if (class1813 != null) {
                --class1813.field1944;
                for (int i = 0; i < class1813.field1938; ++i) {
                    class209 class2092 = class1813.field1943[i];
                    if (!class406.method7967(class2092.field2347) || class2092.field2351 != n || n2 != class2092.field2343) continue;
                    --class2092.field2344;
                }
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="ao")
    public void method4405(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        class193 class1932 = new class193();
        class1932.field2136 = n3 / 128;
        class1932.field2143 = n4 / 128;
        class1932.field2128 = n5 / 128;
        class1932.field2129 = n6 / 128;
        class1932.field2130 = n2;
        class1932.field2126 = n3;
        class1932.field2132 = n4;
        class1932.field2133 = n5;
        class1932.field2134 = n6;
        class1932.field2127 = n7;
        class1932.field2145 = n8;
        int n9 = n;
        int n10 = this.field2048[n9];
        this.field2048[n9] = n10 + 1;
        this.field2035[n][n10] = class1932;
    }

    @ObfuscatedName(value="ad")
    public void method4233(int n, int n2, int n3, int n4) {
        class181 class1812 = this.field2043[n][n2][n3];
        if (class1812 == null) {
            return;
        }
        this.field2043[n][n2][n3].field1937 = n4;
    }

    @ObfuscatedName(value="an")
    public void method4179(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20) {
        if (n4 != 0) {
            if (n4 != 1) {
                class196 class1962 = new class196(n4, n5, n6, n2, n3, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20);
                for (int i = n; i >= 0; --i) {
                    if (this.field2043[i][n2][n3] != null) continue;
                    this.field2043[i][n2][n3] = new class181(i, n2, n3);
                }
                this.field2043[n][n2][n3].field1942 = class1962;
                return;
            }
            class201 class2012 = new class201(n15, n16, n17, n18, n6, n20, n8 == n7 && n7 == n9 && n10 == n7);
            int n21 = n;
            while (true) {
                if (n21 >= 0) {
                    if (this.field2043[n21][n2][n3] == null) {
                        this.field2043[n21][n2][n3] = new class181(n21, n2, n3);
                    }
                } else {
                    this.field2043[n][n2][n3].field1932 = class2012;
                    return;
                }
                --n21;
            }
        }
        class201 class2013 = new class201(n11, n12, n13, n14, -1, n19, false);
        for (int i = n; i >= 0; --i) {
            if (this.field2043[i][n2][n3] != null) continue;
            this.field2043[i][n2][n3] = new class181(i, n2, n3);
        }
        this.field2043[n][n2][n3].field1932 = class2013;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IIIILhs;JI)V")
    public void method4180(int n, int n2, int n3, int n4, class190 class1902, long l, int n5) {
        if (class1902 == null) {
            return;
        }
        class178 class1782 = new class178();
        class1782.field1896 = class1902;
        class1782.field1895 = n2 * 8192 + 4096;
        class1782.field1893 = n3 * 128 + 64;
        class1782.field1898 = n4;
        class1782.field1894 = l;
        class1782.field1897 = n5;
        if (this.field2043[n][n2][n3] == null) {
            this.field2043[n][n2][n3] = new class181(n, n2, n3);
        }
        this.field2043[n][n2][n3].field1936 = class1782;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(IIIILhs;JLhs;Lhs;)V")
    public void method4297(int n, int n2, int n3, int n4, class190 class1902, long l, class190 class1903, class190 class1904) {
        class176 class1762 = new class176();
        class1762.field1843 = class1902;
        class1762.field1840 = n2 * 128 + 64;
        class1762.field1842 = n3 * 128 + 64;
        class1762.field1846 = n4;
        class1762.field1841 = l;
        class1762.field1839 = class1903;
        class1762.field1844 = class1904;
        int n5 = 0;
        class181 class1812 = this.field2043[n][n2][n3];
        if (class1812 != null) {
            for (int i = 0; i < class1812.field1938; ++i) {
                if ((class1812.field1943[i].field2348 & 0x100) != 256 || !(class1812.field1943[i].field2339 instanceof class198)) continue;
                class198 class1982 = (class198)class1812.field1943[i].field2339;
                class1982.method4600();
                if (class1982.field2116 <= n5) continue;
                n5 = class1982.field2116;
            }
        }
        class1762.field1845 = n5;
        if (this.field2043[n][n2][n3] == null) {
            this.field2043[n][n2][n3] = new class181(n, n2, n3);
        }
        this.field2043[n][n2][n3].field1930 = class1762;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(IIIILhs;Lhs;IIJI)V")
    public void method4182(int n, int n2, int n3, int n4, class190 class1902, class190 class1903, int n5, int n6, long l, int n7) {
        if (class1902 == null && class1903 == null) {
            return;
        }
        class206 class2062 = new class206();
        class2062.field2320 = l;
        class2062.field2321 = n7;
        class2062.field2314 = n2 * 128 + 64;
        class2062.field2315 = n3 * 128 + 64;
        class2062.field2316 = n4;
        class2062.field2318 = class1902;
        class2062.field2319 = class1903;
        class2062.field2322 = n5;
        class2062.field2313 = n6;
        for (int i = n; i >= 0; --i) {
            if (this.field2043[i][n2][n3] != null) continue;
            this.field2043[i][n2][n3] = new class181(i, n2, n3);
        }
        this.field2043[n][n2][n3].field1934 = class2062;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(IIIILhs;Lhs;IIIIJI)V")
    public void method4183(int n, int n2, int n3, int n4, class190 class1902, class190 class1903, int n5, int n6, int n7, int n8, long l, int n9) {
        if (class1902 == null) {
            return;
        }
        class208 class2082 = new class208();
        class2082.field2332 = l;
        class2082.field2333 = n9;
        class2082.field2323 = n2 * 128 + 64;
        class2082.field2325 = n3 * 8192 + 4096;
        class2082.field2331 = n4;
        class2082.field2329 = class1902;
        class2082.field2328 = class1903;
        class2082.field2326 = n5;
        class2082.field2327 = n6;
        class2082.field2330 = n7;
        class2082.field2324 = n8;
        for (int i = n; i >= 0; --i) {
            if (this.field2043[i][n2][n3] != null) continue;
            this.field2043[i][n2][n3] = new class181(i, n2, n3);
        }
        this.field2043[n][n2][n3].field1935 = class2082;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(IIIIIILhs;IJI)Z")
    public boolean method4184(int n, int n2, int n3, int n4, int n5, int n6, class190 class1902, int n7, long l, int n8) {
        if (class1902 == null) {
            return true;
        }
        int n9 = n5 * 64 + n2 * 128;
        int n10 = n6 * 64 + n3 * 128;
        return this.method4274(n, n2, n3, n5, n6, n9, n10, n4, class1902, n7, false, l, n8);
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(IIIIILhs;IJZ)Z")
    public boolean method4185(int n, int n2, int n3, int n4, int n5, class190 class1902, int n6, long l, boolean bl) {
        if (class1902 == null) {
            return true;
        }
        int n7 = n2 - n5;
        int n8 = n3 - n5;
        int n9 = n5 + n2;
        int n10 = n3 + n5;
        if (bl) {
            if (n6 > 640 && n6 < 1408) {
                n10 += 128;
            }
            if (n6 > 1152 && n6 < 1920) {
                n9 += 128;
            }
            if (n6 > 1664 || n6 < 384) {
                n8 -= 128;
            }
            if (n6 > 128 && n6 < 896) {
                n7 -= 128;
            }
        }
        return this.method4274(n, n7 /= 128, n8 /= 128, (n9 /= 128) - n7 + 1, (n10 /= 128) - n8 + 1, n2, n3, n4, class1902, n6, true, l, 0);
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(IIIIILhs;IJIIII)Z")
    public boolean method4334(int n, int n2, int n3, int n4, int n5, class190 class1902, int n6, long l, int n7, int n8, int n9, int n10) {
        if (class1902 == null) {
            return true;
        }
        return this.method4274(n, n7, n8, n9 - n7 + 1, n10 - n8 + 1, n2, n3, n4, class1902, n6, true, l, 0);
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(IIIIIIIILhs;IZJI)Z")
    boolean method4274(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, class190 class1902, int n9, boolean bl, long l, int n10) {
        int n11 = n2;
        while (true) {
            int n12;
            if (n11 >= n2 + n4) {
                class209 class2092 = new class209();
                class2092.field2347 = l;
                class2092.field2348 = n10;
                class2092.field2344 = n;
                class2092.field2337 = n6;
                class2092.field2338 = n7;
                class2092.field2336 = n8;
                class2092.field2339 = class1902;
                class2092.field2341 = n9;
                class2092.field2351 = n2;
                class2092.field2343 = n3;
                class2092.field2345 = n2 + n4 - 1;
                class2092.field2340 = n3 + n5 - 1;
                n12 = n2;
                while (true) {
                    if (n12 >= n2 + n4) {
                        if (bl) {
                            if (this.field2011 >= this.field2012.length) {
                                this.field2012 = Arrays.copyOf(this.field2012, this.field2012.length * 2);
                            }
                            this.field2012[this.field2011++] = class2092;
                        }
                        return true;
                    }
                    for (int i = n3; i < n3 + n5; ++i) {
                        int n13 = 0;
                        if (n12 > n2) {
                            ++n13;
                        }
                        if (n12 < n2 + n4 - 1) {
                            n13 += 4;
                        }
                        if (i > n3) {
                            n13 += 8;
                        }
                        if (i < n3 + n5 - 1) {
                            n13 += 2;
                        }
                        for (int j = n; j >= 0; --j) {
                            if (this.field2043[j][n12][i] != null) continue;
                            this.field2043[j][n12][i] = new class181(j, n12, i);
                        }
                        class181 class1812 = this.field2043[n][n12][i];
                        class1812.field1943[class1812.field1938] = class2092;
                        class1812.field1940[class1812.field1938] = n13;
                        class181 class1813 = class1812;
                        class1812.field1941 = class1813.field1941 | n13;
                        ++class1812.field1938;
                    }
                    ++n12;
                }
            }
            for (n12 = n3; n12 < n3 + n5; ++n12) {
                if (n11 >= 0 && n12 >= 0 && n11 < this.field2006 && n12 < this.field2032) {
                    class181 class1814 = this.field2043[n][n11][n12];
                    if (class1814 == null || class1814.field1938 < 5) continue;
                    return false;
                }
                return false;
            }
            ++n11;
        }
    }

    @ObfuscatedName(value="av")
    public void method4365() {
        int n = 0;
        while (true) {
            if (n >= this.field2011) {
                this.field2011 = 0;
                return;
            }
            class209 class2092 = this.field2012[n];
            this.method4382(class2092);
            this.field2012[n] = null;
            ++n;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(Lik;)V")
    void method4382(class209 class2092) {
        int n = class2092.field2351;
        block0: while (n <= class2092.field2345) {
            int n2 = class2092.field2343;
            while (true) {
                block7: {
                    int n3;
                    class181 class1812;
                    block8: {
                        block6: {
                            if (n2 > class2092.field2340) break block6;
                            class1812 = this.field2043[class2092.field2344][n][n2];
                            if (class1812 == null) break block7;
                            break block8;
                        }
                        ++n;
                        continue block0;
                    }
                    for (n3 = 0; n3 < class1812.field1938; ++n3) {
                        if (class1812.field1943[n3] != class2092) continue;
                        --class1812.field1938;
                        for (int i = n3; i < class1812.field1938; ++i) {
                            class1812.field1943[i] = class1812.field1943[i + 1];
                            class1812.field1940[i] = class1812.field1940[i + 1];
                        }
                        class1812.field1943[class1812.field1938] = null;
                        break;
                    }
                    class1812.field1941 = 0;
                    for (n3 = 0; n3 < class1812.field1938; ++n3) {
                        class181 class1813 = class1812;
                        class1812.field1941 = class1813.field1941 | class1812.field1940[n3];
                    }
                }
                ++n2;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="aw")
    public void method4190(int n, int n2, int n3, int n4) {
        class181 class1812 = this.field2043[n][n2][n3];
        if (class1812 == null) {
            return;
        }
        class208 class2082 = class1812.field1935;
        if (class2082 == null) {
            return;
        }
        class2082.field2330 = n4 * class2082.field2330 / 16;
        class2082.field2324 = n4 * class2082.field2324 / 16;
    }

    @ObfuscatedName(value="ai")
    public void method4191(int n, int n2, int n3) {
        class181 class1812 = this.field2043[n][n2][n3];
        if (class1812 == null) {
            return;
        }
        class1812.field1934 = null;
    }

    @ObfuscatedName(value="ar")
    public void method4381(int n, int n2, int n3) {
        class181 class1812 = this.field2043[n][n2][n3];
        if (class1812 == null) {
            return;
        }
        class1812.field1935 = null;
    }

    @ObfuscatedName(value="am")
    public void method4242(int n, int n2, int n3) {
        class181 class1812 = this.field2043[n][n2][n3];
        if (class1812 == null) {
            return;
        }
        int n4 = 0;
        while (n4 < class1812.field1938) {
            class209 class2092 = class1812.field1943[n4];
            if (class406.method7967(class2092.field2347) && n2 == class2092.field2351 && n3 == class2092.field2343) {
                this.method4382(class2092);
                return;
            }
            ++n4;
        }
        return;
    }

    @ObfuscatedName(value="ap")
    public void method4194(int n, int n2, int n3) {
        class181 class1812 = this.field2043[n][n2][n3];
        if (class1812 == null) {
            return;
        }
        class1812.field1936 = null;
    }

    @ObfuscatedName(value="ab")
    public void method4195(int n, int n2, int n3) {
        class181 class1812 = this.field2043[n][n2][n3];
        if (class1812 == null) {
            return;
        }
        class1812.field1930 = null;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(III)Lha;")
    public class206 method4257(int n, int n2, int n3) {
        class181 class1812 = this.field2043[n][n2][n3];
        if (class1812 == null) {
            return null;
        }
        return class1812.field1934;
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(III)Lie;")
    public class208 method4230(int n, int n2, int n3) {
        class181 class1812 = this.field2043[n][n2][n3];
        if (class1812 == null) {
            return null;
        }
        return class1812.field1935;
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(III)Lik;")
    public class209 method4280(int n, int n2, int n3) {
        class181 class1812 = this.field2043[n][n2][n3];
        if (class1812 == null) {
            return null;
        }
        int n4 = 0;
        while (n4 < class1812.field1938) {
            class209 class2092 = class1812.field1943[n4];
            if (class406.method7967(class2092.field2347) && n2 == class2092.field2351 && n3 == class2092.field2343) {
                return class2092;
            }
            ++n4;
        }
        return null;
    }

    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="(III)Lgi;")
    public class178 method4199(int n, int n2, int n3) {
        class181 class1812 = this.field2043[n][n2][n3];
        if (class1812 != null && class1812.field1936 != null) {
            return class1812.field1936;
        }
        return null;
    }

    @ObfuscatedName(value="bb")
    public long method4395(int n, int n2, int n3) {
        class181 class1812 = this.field2043[n][n2][n3];
        if (class1812 != null && class1812.field1934 != null) {
            return class1812.field1934.field2320;
        }
        return 0L;
    }

    @ObfuscatedName(value="bx")
    public long method4253(int n, int n2, int n3) {
        class181 class1812 = this.field2043[n][n2][n3];
        if (class1812 != null && class1812.field1935 != null) {
            return class1812.field1935.field2332;
        }
        return 0L;
    }

    @ObfuscatedName(value="bd")
    public long method4202(int n, int n2, int n3) {
        class181 class1812 = this.field2043[n][n2][n3];
        if (class1812 == null) {
            return 0L;
        }
        int n4 = 0;
        while (n4 < class1812.field1938) {
            class209 class2092 = class1812.field1943[n4];
            if (class406.method7967(class2092.field2347) && n2 == class2092.field2351 && n3 == class2092.field2343) {
                return class2092.field2347;
            }
            ++n4;
        }
        return 0L;
    }

    @ObfuscatedName(value="bi")
    public long method4203(int n, int n2, int n3) {
        class181 class1812 = this.field2043[n][n2][n3];
        if (class1812 != null && class1812.field1936 != null) {
            return class1812.field1936.field1894;
        }
        return 0L;
    }

    @ObfuscatedName(value="bz")
    public int method4192(int n, int n2, int n3, long l) {
        class181 class1812 = this.field2043[n][n2][n3];
        if (class1812 == null) {
            return -1;
        }
        if (class1812.field1934 != null && class1812.field1934.field2320 == l) {
            return class1812.field1934.field2321 & 0xFF;
        }
        if (class1812.field1935 != null && class1812.field1935.field2332 == l) {
            return class1812.field1935.field2333 & 0xFF;
        }
        if (class1812.field1936 != null && class1812.field1936.field1894 == l) {
            return class1812.field1936.field1897 & 0xFF;
        }
        int n4 = 0;
        while (n4 < class1812.field1938) {
            if (class1812.field1943[n4].field2347 == l) {
                return class1812.field1943[n4].field2348 & 0xFF;
            }
            ++n4;
        }
        return -1;
    }

    @ObfuscatedName(value="bt")
    public void method4205(int n, int n2, int n3) {
        int n4 = 0;
        block0: while (n4 < this.field2005) {
            int n5 = 0;
            while (true) {
                if (n5 >= this.field2006) {
                    ++n4;
                    continue block0;
                }
                block2: for (int i = 0; i < this.field2032; ++i) {
                    Object object;
                    Object object2;
                    class181 class1812 = this.field2043[n4][n5][i];
                    if (class1812 == null) continue;
                    class206 class2062 = class1812.field1934;
                    if (class2062 != null && class2062.field2318 instanceof class177) {
                        object2 = (class177)class2062.field2318;
                        this.method4207((class177)object2, n4, n5, i, 1, 1);
                        if (class2062.field2319 instanceof class177) {
                            object = (class177)class2062.field2319;
                            this.method4207((class177)object, n4, n5, i, 1, 1);
                            class177.method3916((class177)object2, (class177)object, 0, 0, 0, false);
                            class2062.field2319 = ((class177)object).method3917(((class177)object).field1858, ((class177)object).field1881, n, n2, n3);
                        }
                        class2062.field2318 = ((class177)object2).method3917(((class177)object2).field1858, ((class177)object2).field1881, n, n2, n3);
                    }
                    int n6 = 0;
                    while (true) {
                        if (n6 >= class1812.field1938) {
                            object2 = class1812.field1936;
                            if (object2 == null || !(((class178)object2).field1896 instanceof class177)) continue block2;
                            object = (class177)((class178)object2).field1896;
                            this.method4234((class177)object, n4, n5, i);
                            ((class178)object2).field1896 = ((class177)object).method3917(((class177)object).field1858, ((class177)object).field1881, n, n2, n3);
                            continue block2;
                        }
                        object = class1812.field1943[n6];
                        if (object != null && ((class209)object).field2339 instanceof class177) {
                            class177 class1772 = (class177)((class209)object).field2339;
                            this.method4207(class1772, n4, n5, i, ((class209)object).field2345 - ((class209)object).field2351 + 1, ((class209)object).field2340 - ((class209)object).field2343 + 1);
                            ((class209)object).field2339 = class1772.method3917(class1772.field1858, class1772.field1881, n, n2, n3);
                        }
                        ++n6;
                    }
                }
                ++n5;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="bf")
    @ObfuscatedSignature(descriptor="(Lgx;III)V")
    void method4234(class177 class1772, int n, int n2, int n3) {
        int n4 = n2;
        int n5 = n2 + 1;
        int n6 = n3 - 1;
        int n7 = n3 + 1;
        int n8 = n4;
        while (n8 <= n5) {
            if (n8 >= 0 && n8 < this.field2006) {
                for (int i = n6; i <= n7; ++i) {
                    class181 class1812;
                    if (i < 0 || i >= this.field2032 || n8 < n5 && i < n7 || (class1812 = this.field2043[n][n8][i]) == null || class1812.field1936 == null || !(class1812.field1936.field1896 instanceof class177)) continue;
                    int n9 = this.method4208(n, n8, i, n, n2, n3);
                    class177 class1773 = (class177)class1812.field1936.field1896;
                    class177.method3916(class1772, class1773, (n8 - n2) * 128, n9, (i - n3) * 128, true);
                }
            }
            ++n8;
        }
        return;
    }

    @ObfuscatedName(value="by")
    @ObfuscatedSignature(descriptor="(Lgx;IIIII)V")
    void method4207(class177 class1772, int n, int n2, int n3, int n4, int n5) {
        boolean bl = true;
        int n6 = n2;
        int n7 = n2 + n4;
        int n8 = n3 - 1;
        int n9 = n3 + n5;
        int n10 = n;
        while (n10 <= n + 1) {
            if (n10 != this.field2005) {
                int n11 = n6;
                while (true) {
                    if (n11 > n7) {
                        --n6;
                        bl = false;
                        break;
                    }
                    if (n11 >= 0 && n11 < this.field2006) {
                        for (int i = n8; i <= n9; ++i) {
                            class181 class1812;
                            if (i < 0 || i >= this.field2032 || bl && n11 < n7 && i < n9 && (i >= n3 || n2 == n11) || (class1812 = this.field2043[n10][n11][i]) == null) continue;
                            int n12 = this.method4208(n10, n11, i, n, n2, n3);
                            class206 class2062 = class1812.field1934;
                            if (class2062 != null) {
                                class177 class1773;
                                if (class2062.field2318 instanceof class177) {
                                    class1773 = (class177)class2062.field2318;
                                    class177.method3916(class1772, class1773, (1 - n4) * 64 + (n11 - n2) * 128, n12, (i - n3) * 128 + (1 - n5) * 64, bl);
                                }
                                if (class2062.field2319 instanceof class177) {
                                    class1773 = (class177)class2062.field2319;
                                    class177.method3916(class1772, class1773, (1 - n4) * 64 + (n11 - n2) * 128, n12, (i - n3) * 128 + (1 - n5) * 64, bl);
                                }
                            }
                            for (int j = 0; j < class1812.field1938; ++j) {
                                class209 class2092 = class1812.field1943[j];
                                if (class2092 == null || !(class2092.field2339 instanceof class177)) continue;
                                class177 class1774 = (class177)class2092.field2339;
                                int n13 = class2092.field2345 - class2092.field2351 + 1;
                                int n14 = class2092.field2340 - class2092.field2343 + 1;
                                class177.method3916(class1772, class1774, (n13 - n4) * 64 + (class2092.field2351 - n2) * 128, n12, (class2092.field2343 - n3) * 128 + (n14 - n5) * 64, bl);
                            }
                        }
                    }
                    ++n11;
                }
            }
            ++n10;
        }
        return;
    }

    @ObfuscatedName(value="bm")
    int method4208(int n, int n2, int n3, int n4, int n5, int n6) {
        return this.method4209(n, n2, n3) - this.method4209(n4, n5, n6);
    }

    @ObfuscatedName(value="bp")
    int method4209(int n, int n2, int n3) {
        return (this.field2008[n][n2 + 1][n3 + 1] + this.field2008[n][n2][n3] + this.field2008[n][n2][n3 + 1] + this.field2008[n][n2 + 1][n3]) / 4;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="bg")
    public void method4210(int[] nArray, int n, int n2, int n3, int n4, int n5) {
        int n6;
        int[] nArray2;
        int[] nArray3;
        int n7;
        int n8;
        block15: {
            int n9;
            block14: {
                class181 class1812;
                block13: {
                    class1812 = this.field2043[n3][n4][n5];
                    if (class1812 == null) {
                        return;
                    }
                    class201 class2012 = class1812.field1932;
                    if (class2012 == null) break block13;
                    n9 = class2012.field2286;
                    if (n9 == 0) {
                        return;
                    }
                    break block14;
                }
                class196 class1962 = class1812.field1942;
                if (class1962 == null) {
                    return;
                }
                int n10 = class1962.field2169;
                int n11 = class1962.field2163;
                n8 = class1962.field2171;
                n7 = class1962.field2172;
                nArray3 = this.field2016[n10];
                nArray2 = this.field2076[n11];
                n6 = 0;
                if (n8 != 0) {
                    break block15;
                } else {
                    for (int i = 0; i < 4; ++i) {
                        if (nArray3[nArray2[n6++]] != 0) {
                            nArray[n] = n7;
                        }
                        if (nArray3[nArray2[n6++]] != 0) {
                            nArray[n + 1] = n7;
                        }
                        if (nArray3[nArray2[n6++]] != 0) {
                            nArray[n + 2] = n7;
                        }
                        if (nArray3[nArray2[n6++]] != 0) {
                            nArray[n + 3] = n7;
                        }
                        n = n2 + n;
                    }
                    return;
                }
            }
            int n12 = 0;
            while (true) {
                if (n12 >= 4) {
                    return;
                }
                nArray[n] = n9;
                nArray[n + 1] = n9;
                nArray[n + 2] = n9;
                nArray[n + 3] = n9;
                n = n2 + n;
                ++n12;
            }
        }
        for (int i = 0; i < 4; ++i) {
            nArray[n] = nArray3[nArray2[n6++]] == 0 ? n8 : n7;
            nArray[n + 1] = nArray3[nArray2[n6++]] == 0 ? n8 : n7;
            nArray[n + 2] = nArray3[nArray2[n6++]] == 0 ? n8 : n7;
            nArray[n + 3] = nArray3[nArray2[n6++]] == 0 ? n8 : n7;
            n = n2 + n;
        }
    }

    @ObfuscatedName(value="bc")
    public void method4211(int n) {
        int n2;
        this.field2019 = n2 = Math.max(25, Math.min(n, 90));
        class185.method4156(this.field2019);
        if (this.field2077 != null && this.field2077.length > 0) {
            this.method4267(this.field2077, this.field2078, this.field2081, this.field2080, this.field2075);
        }
    }

    @ObfuscatedName(value="bv")
    @ObfuscatedSignature(descriptor="(Lgs;)V")
    public void method4212(class175 class1752) {
        if (class1752 != this.field2020) {
            this.field2020 = class1752;
            this.method4267(this.field2077, this.field2078, this.field2081, this.field2080, this.field2075);
        }
    }

    @ObfuscatedName(value="bq")
    boolean method4397(BitSet bitSet, int n, int n2, int n3, int n4) {
        return bitSet.get(n4 + n3 * this.field2039 + n * this.field2052 + n2 * this.field2079);
    }

    @ObfuscatedName(value="ba")
    boolean method4214(BitSet bitSet, int n, int n2, int n3, int n4, boolean bl) {
        bitSet.set(n4 + n3 * this.field2039 + n * this.field2052 + n2 * this.field2079, bl);
        return bl;
    }

    @ObfuscatedName(value="bk")
    boolean method4215(int n, int n2, int n3, int n4) {
        return this.method4397(this.field2083, n, n2, n3, n4);
    }

    @ObfuscatedName(value="bs")
    boolean method4378(int n, int n2, int n3, int n4, boolean bl) {
        return this.method4214(this.field2083, n, n2, n3, n4, bl);
    }

    @ObfuscatedName(value="bj")
    boolean method4217(int n, int n2, int n3, int n4) {
        return this.method4397(this.field2072, n, n2, n3, n4);
    }

    @ObfuscatedName(value="bo")
    boolean method4218(int n, int n2, int n3, int n4, boolean bl) {
        return this.method4214(this.field2072, n, n2, n3, n4, bl);
    }

    @ObfuscatedName(value="be")
    boolean method4219(BitSet bitSet, int n, int n2, int n3, int n4) {
        return bitSet.get(n4 + n3 * this.field2101 + n2 * this.field2060 * 33489 + n * this.field2091);
    }

    @ObfuscatedName(value="bn")
    boolean method4220(BitSet bitSet, int n, int n2, int n3, int n4, boolean bl) {
        bitSet.set(n4 + n3 * this.field2101 + n2 * this.field2060 * 33489 + n * this.field2091, bl);
        return bl;
    }

    @ObfuscatedName(value="br")
    boolean method4221(int n, int n2, int n3, int n4) {
        return this.method4219(this.field2003, n, n2, n3, n4);
    }

    @ObfuscatedName(value="bl")
    boolean method4222(int n, int n2, int n3, int n4, boolean bl) {
        return this.method4220(this.field2003, n, n2, n3, n4, bl);
    }

    @ObfuscatedName(value="cb")
    boolean method4177(int n, int n2, int n3, int n4) {
        return this.method4219(this.field2010, n, n2, n3, n4);
    }

    @ObfuscatedName(value="cn")
    boolean method4224(int n, int n2, int n3, int n4, boolean bl) {
        return this.method4220(this.field2010, n, n2, n3, n4, bl);
    }

    @ObfuscatedName(value="cc")
    public void method4267(int[] nArray, int n, int n2, int n3, int n4) {
        this.field2077 = nArray;
        this.field2078 = n;
        this.field2081 = n2;
        this.field2080 = n3;
        this.field2075 = n4;
        this.field2098 = 0;
        this.field2099 = 0;
        this.field2086 = n3;
        this.field2004 = n4;
        this.field2084 = n3 / 2;
        this.field2033 = n4 / 2;
        this.field2072.set(0, this.field2072.size());
        this.field2010.set(0, this.field2010.size());
    }

    @ObfuscatedName(value="co")
    void method4226(int n, int n2) {
        this.field2064 = n;
        this.field2095 = n2;
    }

    @ObfuscatedName(value="ca")
    boolean method4287(int n, int n2) {
        if (this.method4217(this.field2064, this.field2095, n, n2)) {
            this.method4218(this.field2064, this.field2095, n, n2, false);
            boolean bl = false;
            int n3 = -1;
            while (true) {
                if (n3 > 1) {
                    return this.method4378(this.field2064, this.field2095, n, n2, bl);
                }
                for (int i = -1; i <= 1; ++i) {
                    if (!this.method4286(this.field2064, this.field2095, n3 + n + 1, i + n2 + 1)) {
                        if (!this.method4286(this.field2064, (this.field2095 + 1) % 31, n3 + n + 1, i + n2 + 1)) {
                            if (!this.method4286(this.field2064 + 1, this.field2095, n3 + n + 1, i + n2 + 1)) {
                                if (!this.method4286(this.field2064 + 1, (this.field2095 + 1) % 31, n3 + n + 1, i + n2 + 1)) continue;
                                bl = true;
                                n3 = 2;
                                break;
                            }
                            bl = true;
                            n3 = 2;
                            break;
                        }
                        bl = true;
                        n3 = 2;
                        break;
                    }
                    bl = true;
                    n3 = 2;
                    break;
                }
                ++n3;
            }
        }
        return this.method4215(this.field2064, this.field2095, n, n2);
    }

    @ObfuscatedName(value="cg")
    boolean method4286(int n, int n2, int n3, int n4) {
        if (this.method4177(n, n2, n3, n4)) {
            this.method4224(n, n2, n3, n4, false);
            int n5 = n * 32 + 128;
            int n6 = n2 * 64;
            int n7 = (n3 - this.field2019 - this.field2021 - 1) * 128;
            int n8 = (n4 - this.field2019 - this.field2022 - 1) * 128;
            int n9 = -this.field2078;
            while (true) {
                if (n9 > this.field2081) {
                    return this.method4222(n, n2, n3, n4, false);
                }
                if (this.method4410(n7, n9 + this.field2077[n], n8, n5, n6)) {
                    return this.method4222(n, n2, n3, n4, true);
                }
                n9 += 128;
            }
        }
        return this.method4221(n, n2, n3, n4);
    }

    @ObfuscatedName(value="cp")
    boolean method4410(int n, int n2, int n3, int n4, int n5) {
        int[] nArray = class182.field1954;
        int[] nArray2 = class182.field1955;
        int n6 = nArray[n4];
        int n7 = nArray2[n4];
        int n8 = nArray[n5];
        int n9 = nArray2[n5];
        int n10 = n9 * n + n3 * n8 >> 16;
        int n11 = n3 * n9 - n8 * n >> 16;
        int n12 = n11 * n7 + n6 * n2 >> 16;
        int n13 = n7 * n2 - n11 * n6 >> 16;
        if (n12 >= 50 && n12 <= class185.method4138()) {
            int n14 = n10 * 128 / n12 + this.field2084;
            int n15 = n13 * 128 / n12 + this.field2033;
            return n14 >= this.field2098 && n14 <= this.field2086 && n15 >= this.field2099 && n15 <= this.field2004;
            {
            }
        }
        return false;
    }

    @ObfuscatedName(value="cz")
    public void method4235(boolean bl) {
        if (this.method4423() && !bl) {
            return;
        }
        this.field2046 = true;
        this.field2055 = bl;
        this.field2053 = -1;
        this.field2054 = -1;
    }

    @ObfuscatedName(value="cy")
    public void method4231(int n, int n2, int n3) {
        this.field2088 = n;
        this.field2065 = n2;
        this.field2049 = n3;
    }

    @ObfuscatedName(value="cu")
    public void method4232() {
        this.field2055 = true;
    }

    @ObfuscatedName(value="cq")
    public boolean method4423() {
        return this.field2055 && this.field2053 != -1;
    }

    @ObfuscatedName(value="cf")
    void method4315() {
        if (this.field2046) {
            this.field2046 = false;
            this.field2053 = this.field2050;
            this.field2054 = this.field2051;
        }
    }

    @ObfuscatedName(value="ct")
    public void method4411() {
        this.field2053 = -1;
        this.field2055 = false;
    }

    @ObfuscatedName(value="ci")
    public void method4236(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl) {
        if (n < 0) {
            n = 0;
        } else if (n >= this.field2006 * 128) {
            n = this.field2006 * 128 - 1;
        }
        if (n3 < 0) {
            n3 = 0;
        } else if (n3 >= this.field2032 * 128) {
            n3 = this.field2032 * 128 - 1;
        }
        if (n4 < 128) {
            n4 = 128;
        } else if (n4 > 383) {
            n4 = 383;
        }
        this.field2041 = class182.field1954[n4];
        this.field2042 = class182.field1955[n4];
        this.field2096 = class182.field1954[n5];
        this.field2044 = class182.field1955[n5];
        this.method4226((n4 - 128) / 32, n5 / 64);
        class110.method3122(this.field2041, this.field2042, this.field2096, this.field2044);
        this.field2030 = n;
        this.field2031 = n2;
        this.field2090 = n3;
        this.field2100 = n / 128;
        this.field2034 = n3 / 128;
        this.field2097 = n7 / 128;
        this.field2036 = n8 / 128;
        this.field2024 = n6;
        class183 class1832 = new class183(n, n2, n3, n4, n5, n7, n8);
        this.method4237(class1832, bl);
    }

    /*
     * Exception decompiling
     */
    @ObfuscatedName(value="cl")
    @ObfuscatedSignature(descriptor="(Lht;Z)V")
    void method4237(class195 var1_1, boolean var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[UNCONDITIONALDOLOOP]], but top level block is 8[UNCONDITIONALDOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @ObfuscatedName(value="cw")
    @ObfuscatedSignature(descriptor="(Lht;Lgu;Z)V")
    void method4238(class195 class1952, class181 class1812, boolean bl) {
        this.field2063.method7998(class1812);
        class181 class1813;
        while ((class1813 = (class181)this.field2063.method8016()) != null) {
            int n;
            int n2;
            Object object;
            Object object2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            Object object3;
            int n8;
            int n9;
            Object object4;
            int n10;
            Object object5;
            Object object6;
            if (!class1813.field1948) continue;
            int n11 = class1813.field1929;
            int n12 = class1813.field1939;
            int n13 = class1813.field1944;
            int n14 = class1813.field1931;
            class181[][] class181Array = this.field2043[n13];
            if (class1813.field1928) {
                if (bl) {
                    if (n13 > 0 && (object6 = this.field2043[n13 - 1][n11][n12]) != null && ((class181)object6).field1948 || n11 <= this.field2100 && n11 > this.field2026 && (object6 = class181Array[n11 - 1][n12]) != null && ((class181)object6).field1948 && (((class181)object6).field1928 || (class1813.field1941 & 1) == 0) || n11 >= this.field2100 && n11 < this.field2027 - 1 && (object6 = class181Array[n11 + 1][n12]) != null && ((class181)object6).field1948 && (((class181)object6).field1928 || (class1813.field1941 & 4) == 0) || n12 <= this.field2034 && n12 > this.field2028 && (object6 = class181Array[n11][n12 - 1]) != null && ((class181)object6).field1948 && (((class181)object6).field1928 || (class1813.field1941 & 8) == 0) || n12 >= this.field2034 && n12 < this.field2029 - 1 && (object6 = class181Array[n11][n12 + 1]) != null && ((class181)object6).field1948 && (((class181)object6).field1928 || (class1813.field1941 & 2) == 0)) {
                        continue;
                    }
                } else {
                    bl = true;
                }
                class1813.field1928 = false;
                if (class1813.field1933 != null) {
                    object6 = class1813.field1933;
                    if (((class181)object6).field1932 != null) {
                        if (!this.method4329(0, n11, n12)) {
                            class1952.vmethod4504(this, ((class181)object6).field1932, 0, n11, n12);
                        }
                    } else if (((class181)object6).field1942 != null && !this.method4329(0, n11, n12)) {
                        class1952.vmethod4516(this, ((class181)object6).field1942, n11, n12);
                    }
                    if ((object5 = ((class181)object6).field1934) != null) {
                        class1952.vmethod4503(((class206)object5).field2318, 0, ((class206)object5).field2314 * 4096, ((class206)object5).field2316, ((class206)object5).field2315 * 4096, ((class206)object5).field2320);
                    }
                    for (n10 = 0; n10 < ((class181)object6).field1938; ++n10) {
                        object4 = ((class181)object6).field1943[n10];
                        if (object4 == null) continue;
                        class1952.vmethod4503(((class209)object4).field2339, ((class209)object4).field2341, ((class209)object4).field2337, ((class209)object4).field2336, ((class209)object4).field2338, ((class209)object4).field2347);
                    }
                }
                n9 = 0;
                if (class1813.field1932 != null) {
                    if (!this.method4329(n14, n11, n12)) {
                        n9 = 1;
                        if (class1813.field1932.field2282 != 12345678 || n13 <= this.field2088) {
                            class1952.vmethod4504(this, class1813.field1932, n14, n11, n12);
                        }
                    }
                } else if (class1813.field1942 != null && !this.method4329(n14, n11, n12)) {
                    n9 = 1;
                    class1952.vmethod4516(this, class1813.field1942, n11, n12);
                }
                n8 = 0;
                n10 = 0;
                object4 = class1813.field1934;
                object3 = class1813.field1935;
                if (object4 != null || object3 != null) {
                    if (n11 == this.field2100) {
                        ++n8;
                    } else if (this.field2100 < n11) {
                        n8 += 2;
                    }
                    if (n12 == this.field2034) {
                        n8 += 3;
                    } else if (this.field2034 > n12) {
                        n8 += 6;
                    }
                    n10 = field2059[n8];
                    class1813.field1949 = field2066[n8];
                }
                if (object4 != null) {
                    if ((((class206)object4).field2322 & field2061[n8]) != 0) {
                        if (((class206)object4).field2322 == 16) {
                            class1813.field1950 = 3;
                            class1813.field1947 = field2074[n8];
                            class1813.field1946 = 3 - class1813.field1947;
                        } else if (((class206)object4).field2322 == 32) {
                            class1813.field1950 = 6;
                            class1813.field1947 = field2068[n8];
                            class1813.field1946 = 6 - class1813.field1947;
                        } else if (((class206)object4).field2322 == 64) {
                            class1813.field1950 = 12;
                            class1813.field1947 = field2069[n8];
                            class1813.field1946 = 12 - class1813.field1947;
                        } else {
                            class1813.field1950 = 9;
                            class1813.field1947 = field2070[n8];
                            class1813.field1946 = 9 - class1813.field1947;
                        }
                    } else {
                        class1813.field1950 = 0;
                    }
                    if ((((class206)object4).field2322 & n10) != 0 && !this.method4243(n14, n11, n12, ((class206)object4).field2322)) {
                        class1952.vmethod4503(((class206)object4).field2318, 0, ((class206)object4).field2314 * 4096, ((class206)object4).field2316, ((class206)object4).field2315 * 4096, ((class206)object4).field2320);
                    }
                    if ((((class206)object4).field2313 & n10) != 0 && !this.method4243(n14, n11, n12, ((class206)object4).field2313)) {
                        class1952.vmethod4503(((class206)object4).field2319, 0, ((class206)object4).field2314 * 4096, ((class206)object4).field2316, ((class206)object4).field2315 * 4096, ((class206)object4).field2320);
                    }
                }
                if (object3 != null && !this.method4244(n14, n11, n12, ((class208)object3).field2329.field2116)) {
                    if ((((class208)object3).field2326 & n10) != 0) {
                        class1952.vmethod4503(((class208)object3).field2329, 0, ((class208)object3).field2323 * 4096 + ((class208)object3).field2330, ((class208)object3).field2331, ((class208)object3).field2325 * 64 + ((class208)object3).field2324, ((class208)object3).field2332);
                    } else if (((class208)object3).field2326 == 256) {
                        n7 = ((class208)object3).field2323 * 4096 - this.field2030;
                        n6 = ((class208)object3).field2325 * 64 - this.field2090;
                        n4 = n5 == 2 || n5 == 3 ? -n6 : n6;
                        if (n4 < (n3 = (n5 = ((class208)object3).field2327) == 1 || n5 == 2 ? -n7 : n7)) {
                            class1952.vmethod4503(((class208)object3).field2329, 0, ((class208)object3).field2323 * 4096 + ((class208)object3).field2330, ((class208)object3).field2331, ((class208)object3).field2325 * 64 + ((class208)object3).field2324, ((class208)object3).field2332);
                        } else if (((class208)object3).field2328 != null) {
                            class1952.vmethod4503(((class208)object3).field2328, 0, ((class208)object3).field2323 * 4096, ((class208)object3).field2331, ((class208)object3).field2325 * 64, ((class208)object3).field2332);
                        }
                    }
                }
                if (n9 != 0) {
                    object2 = class1813.field1936;
                    if (object2 != null) {
                        class1952.vmethod4503(((class178)object2).field1896, 0, ((class178)object2).field1895 * 64, ((class178)object2).field1898, ((class178)object2).field1893 * 4096, ((class178)object2).field1894);
                    }
                    if ((object = class1813.field1930) != null && ((class176)object).field1845 == 0) {
                        if (((class176)object).field1839 != null) {
                            class1952.vmethod4503(((class176)object).field1839, 0, ((class176)object).field1840 * 4096, ((class176)object).field1846, ((class176)object).field1842 * 4096, ((class176)object).field1841);
                        }
                        if (((class176)object).field1844 != null) {
                            class1952.vmethod4503(((class176)object).field1844, 0, ((class176)object).field1840 * 4096, ((class176)object).field1846, ((class176)object).field1842 * 4096, ((class176)object).field1841);
                        }
                        if (((class176)object).field1843 != null) {
                            class1952.vmethod4503(((class176)object).field1843, 0, ((class176)object).field1840 * 4096, ((class176)object).field1846, ((class176)object).field1842 * 4096, ((class176)object).field1841);
                        }
                    }
                }
                if ((n7 = class1813.field1941) != 0) {
                    if (n11 < this.field2100 && n11 >= this.field2026 && n11 < this.field2027 - 1 && (n7 & 4) != 0 && (object = class181Array[n11 + 1][n12]) != null && ((class181)object).field1948) {
                        this.field2063.method7998((class514)object);
                    }
                    if (n12 < this.field2034 && n12 >= this.field2028 && n12 < this.field2029 - 1 && (n7 & 2) != 0 && (object = class181Array[n11][n12 + 1]) != null && ((class181)object).field1948) {
                        this.field2063.method7998((class514)object);
                    }
                    if (n11 > this.field2100 && n11 > this.field2026 && n11 < this.field2027 && (n7 & 1) != 0 && (object = class181Array[n11 - 1][n12]) != null && ((class181)object).field1948) {
                        this.field2063.method7998((class514)object);
                    }
                    if (n12 > this.field2034 && n12 > this.field2028 && n12 < this.field2029 && (n7 & 8) != 0 && (object = class181Array[n11][n12 - 1]) != null && ((class181)object).field1948) {
                        this.field2063.method7998((class514)object);
                    }
                }
            }
            if (class1813.field1950 != 0) {
                n9 = 1;
                for (n8 = 0; n8 < class1813.field1938; ++n8) {
                    if (class1813.field1943[n8].field2342 == this.field2025 || (class1813.field1940[n8] & class1813.field1950) != class1813.field1947) continue;
                    n9 = 0;
                    break;
                }
                if (n9 != 0) {
                    object5 = class1813.field1934;
                    if (!this.method4243(n14, n11, n12, ((class206)object5).field2322)) {
                        class1952.vmethod4503(((class206)object5).field2318, 0, ((class206)object5).field2314 * 4096, ((class206)object5).field2316, ((class206)object5).field2315 * 4096, ((class206)object5).field2320);
                    }
                    class1813.field1950 = 0;
                }
            }
            if (class1813.field1945) {
                try {
                    n9 = class1813.field1938;
                    class1813.field1945 = false;
                    n8 = 0;
                    block5: for (n10 = 0; n10 < n9; ++n10) {
                        object4 = class1813.field1943[n10];
                        if (((class209)object4).field2342 == this.field2025) continue;
                        for (n2 = ((class209)object4).field2351; n2 <= ((class209)object4).field2345; ++n2) {
                            for (n7 = ((class209)object4).field2343; n7 <= ((class209)object4).field2340; ++n7) {
                                object = class181Array[n2][n7];
                                if (((class181)object).field1928) {
                                    class1813.field1945 = true;
                                    continue block5;
                                }
                                if (((class181)object).field1950 == 0) continue;
                                n5 = 0;
                                if (n2 > ((class209)object4).field2351) {
                                    ++n5;
                                }
                                if (n2 < ((class209)object4).field2345) {
                                    n5 += 4;
                                }
                                if (n7 > ((class209)object4).field2343) {
                                    n5 += 8;
                                }
                                if (n7 < ((class209)object4).field2340) {
                                    n5 += 2;
                                }
                                if ((n5 & ((class181)object).field1950) != class1813.field1946) continue;
                                class1813.field1945 = true;
                                continue block5;
                            }
                        }
                        this.field2045[n8++] = object4;
                        n7 = ((class209)object4).field2345 - this.field2100;
                        n2 = this.field2100 - ((class209)object4).field2351;
                        if (n7 > n2) {
                            n2 = n7;
                        }
                        ((class209)object4).field2335 = (n5 = ((class209)object4).field2340 - this.field2034) > (n6 = this.field2034 - ((class209)object4).field2343) ? n2 + n5 : n2 + n6;
                    }
                    block8: while (true) {
                        n10 = -50;
                        n = -1;
                        for (n2 = 0; n2 < n8; ++n2) {
                            object2 = this.field2045[n2];
                            if (((class209)object2).field2342 == this.field2025) continue;
                            if (((class209)object2).field2335 > n10) {
                                n10 = ((class209)object2).field2335;
                                n = n2;
                                continue;
                            }
                            if (n10 != ((class209)object2).field2335 || (n6 = ((class209)object2).field2337 - this.field2030) * n6 + (n5 = ((class209)object2).field2338 - this.field2090) * n5 <= (n3 = this.field2045[n].field2337 - this.field2030) * n3 + (n4 = this.field2045[n].field2338 - this.field2090) * n4) continue;
                            n = n2;
                        }
                        if (n == -1) break;
                        object3 = this.field2045[n];
                        ((class209)object3).field2342 = this.field2025;
                        if (!this.method4245(n14, ((class209)object3).field2351, ((class209)object3).field2345, ((class209)object3).field2343, ((class209)object3).field2340, ((class209)object3).field2339.field2116)) {
                            class1952.vmethod4503(((class209)object3).field2339, ((class209)object3).field2341, ((class209)object3).field2337, ((class209)object3).field2336, ((class209)object3).field2338, ((class209)object3).field2347);
                        }
                        n7 = ((class209)object3).field2351;
                        while (true) {
                            if (n7 > ((class209)object3).field2345) continue block8;
                            for (n6 = ((class209)object3).field2343; n6 <= ((class209)object3).field2340; ++n6) {
                                class181 class1814 = class181Array[n7][n6];
                                if (class1814.field1950 != 0) {
                                    this.field2063.method7998(class1814);
                                    continue;
                                }
                                if (n7 == n11 && n6 == n12 || !class1814.field1948) continue;
                                this.field2063.method7998(class1814);
                            }
                            ++n7;
                        }
                        break;
                    }
                    if (class1813.field1945) {
                        continue;
                    }
                }
                catch (Exception exception) {
                    class1813.field1945 = false;
                }
            }
            if (!class1813.field1948 || class1813.field1950 != 0 || n11 <= this.field2100 && n11 > this.field2026 && (object6 = class181Array[n11 - 1][n12]) != null && ((class181)object6).field1948 || n11 >= this.field2100 && n11 < this.field2027 - 1 && (object6 = class181Array[n11 + 1][n12]) != null && ((class181)object6).field1948 || n12 <= this.field2034 && n12 > this.field2028 && (object6 = class181Array[n11][n12 - 1]) != null && ((class181)object6).field1948 || n12 >= this.field2034 && n12 < this.field2029 - 1 && (object6 = class181Array[n11][n12 + 1]) != null && ((class181)object6).field1948) continue;
            class1813.field1948 = false;
            --this.field2023;
            object6 = class1813.field1930;
            if (object6 != null && ((class176)object6).field1845 != 0) {
                if (((class176)object6).field1839 != null) {
                    class1952.vmethod4503(((class176)object6).field1839, 0, ((class176)object6).field1840 * 4096, ((class176)object6).field1846 - ((class176)object6).field1845, ((class176)object6).field1842 * 4096, ((class176)object6).field1841);
                }
                if (((class176)object6).field1844 != null) {
                    class1952.vmethod4503(((class176)object6).field1844, 0, ((class176)object6).field1840 * 4096, ((class176)object6).field1846 - ((class176)object6).field1845, ((class176)object6).field1842 * 4096, ((class176)object6).field1841);
                }
                if (((class176)object6).field1843 != null) {
                    class1952.vmethod4503(((class176)object6).field1843, 0, ((class176)object6).field1840 * 4096, ((class176)object6).field1846 - ((class176)object6).field1845, ((class176)object6).field1842 * 4096, ((class176)object6).field1841);
                }
            }
            if (class1813.field1949 != 0) {
                class206 class2062;
                object5 = class1813.field1935;
                if (object5 != null && !this.method4244(n14, n11, n12, ((class208)object5).field2329.field2116)) {
                    if ((((class208)object5).field2326 & class1813.field1949) != 0) {
                        class1952.vmethod4503(((class208)object5).field2329, 0, ((class208)object5).field2323 * 4096 + ((class208)object5).field2330, ((class208)object5).field2331, ((class208)object5).field2325 * 64 + ((class208)object5).field2324, ((class208)object5).field2332);
                    } else if (((class208)object5).field2326 == 256) {
                        n10 = ((class208)object5).field2323 * 4096 - this.field2030;
                        n = ((class208)object5).field2325 * 64 - this.field2090;
                        n6 = n2 == 2 || n2 == 3 ? -n : n;
                        if (n6 >= (n7 = (n2 = ((class208)object5).field2327) == 1 || n2 == 2 ? -n10 : n10)) {
                            class1952.vmethod4503(((class208)object5).field2329, 0, ((class208)object5).field2323 * 4096 + ((class208)object5).field2330, ((class208)object5).field2331, ((class208)object5).field2325 * 64 + ((class208)object5).field2324, ((class208)object5).field2332);
                        } else if (((class208)object5).field2328 != null) {
                            class1952.vmethod4503(((class208)object5).field2328, 0, ((class208)object5).field2323 * 4096, ((class208)object5).field2331, ((class208)object5).field2325 * 64, ((class208)object5).field2332);
                        }
                    }
                }
                if ((class2062 = class1813.field1934) != null) {
                    if ((class2062.field2313 & class1813.field1949) != 0 && !this.method4243(n14, n11, n12, class2062.field2313)) {
                        class1952.vmethod4503(class2062.field2319, 0, class2062.field2314 * 4096, class2062.field2316, class2062.field2315 * 4096, class2062.field2320);
                    }
                    if ((class2062.field2322 & class1813.field1949) != 0 && !this.method4243(n14, n11, n12, class2062.field2322)) {
                        class1952.vmethod4503(class2062.field2318, 0, class2062.field2314 * 4096, class2062.field2316, class2062.field2315 * 4096, class2062.field2320);
                    }
                }
            }
            if (n13 < this.field2005 - 1 && (object5 = this.field2043[n13 + 1][n11][n12]) != null && ((class181)object5).field1948) {
                this.field2063.method7998((class514)object5);
            }
            if (n11 < this.field2100 && n11 >= this.field2026 && n11 < this.field2027 - 1 && (object5 = class181Array[n11 + 1][n12]) != null && ((class181)object5).field1948) {
                this.field2063.method7998((class514)object5);
            }
            if (n12 < this.field2034 && n12 >= this.field2028 && n12 < this.field2029 - 1 && (object5 = class181Array[n11][n12 + 1]) != null && ((class181)object5).field1948) {
                this.field2063.method7998((class514)object5);
            }
            if (n11 > this.field2100 && n11 > this.field2026 && n11 < this.field2027 && (object5 = class181Array[n11 - 1][n12]) != null && ((class181)object5).field1948) {
                this.field2063.method7998((class514)object5);
            }
            if (n12 <= this.field2034 || n12 <= this.field2028 || n12 >= this.field2029 || (object5 = class181Array[n11][n12 - 1]) == null || !((class181)object5).field1948) continue;
            this.field2063.method7998((class514)object5);
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="cd")
    void method4241() {
        int n = this.field2048[this.field2024];
        class193[] class193Array = this.field2035[this.field2024];
        this.field2037 = 0;
        int n2 = 0;
        while (true) {
            block20: {
                boolean bl;
                int n3;
                int n4;
                int n5;
                class193 class1932;
                block24: {
                    block28: {
                        block27: {
                            int n6;
                            int n7;
                            block21: {
                                block26: {
                                    block25: {
                                        block23: {
                                            block22: {
                                                block19: {
                                                    if (n2 >= n) {
                                                        return;
                                                    }
                                                    class1932 = class193Array[n2];
                                                    if (class1932.field2130 != 1) break block19;
                                                    n5 = class1932.field2136 - this.field2100 + this.field2019;
                                                    if (n5 < 0) break block20;
                                                    break block21;
                                                }
                                                if (class1932.field2130 != 2) break block22;
                                                n5 = class1932.field2128 - this.field2034 + this.field2019;
                                                if (n5 < 0) break block20;
                                                break block23;
                                            }
                                            if (class1932.field2130 != 4 || (n5 = class1932.field2127 - this.field2031) <= 128) break block20;
                                            n7 = class1932.field2128 - this.field2034 + this.field2019;
                                            if (n7 < 0) {
                                                n7 = 0;
                                            }
                                            if ((n4 = class1932.field2129 - this.field2034 + this.field2019) > this.field2019 + this.field2019) {
                                                n4 = this.field2019 + this.field2019;
                                            }
                                            if (n7 > n4) break block20;
                                            n6 = class1932.field2136 - this.field2100 + this.field2019;
                                            if (n6 < 0) {
                                                n6 = 0;
                                            }
                                            if ((n3 = class1932.field2143 - this.field2100 + this.field2019) > this.field2019 + this.field2019) {
                                                n3 = this.field2019 + this.field2019;
                                            }
                                            bl = false;
                                            break block24;
                                        }
                                        if (n5 > this.field2019 + this.field2019) break block20;
                                        n7 = class1932.field2136 - this.field2100 + this.field2019;
                                        if (n7 < 0) {
                                            n7 = 0;
                                        }
                                        if ((n4 = class1932.field2143 - this.field2100 + this.field2019) > this.field2019 + this.field2019) {
                                            n4 = this.field2019 + this.field2019;
                                        }
                                        n6 = 0;
                                        while (n7 <= n4) {
                                            if (!this.method4287(n7++, n5)) continue;
                                            n6 = 1;
                                            break;
                                        }
                                        if (n6 == 0) break block20;
                                        n3 = this.field2090 - class1932.field2133;
                                        if (n3 <= 32) break block25;
                                        class1932.field2131 = 3;
                                        break block26;
                                    }
                                    if (n3 >= -32) break block20;
                                    class1932.field2131 = 4;
                                    n3 = -n3;
                                }
                                class1932.field2138 = (class1932.field2126 - this.field2030 << 8) / n3;
                                class1932.field2139 = (class1932.field2132 - this.field2030 << 8) / n3;
                                class1932.field2142 = (class1932.field2127 - this.field2031 << 8) / n3;
                                class1932.field2135 = (class1932.field2145 - this.field2031 << 8) / n3;
                                this.field2062[this.field2037++] = class1932;
                                break block20;
                            }
                            if (n5 > this.field2019 + this.field2019) break block20;
                            n7 = class1932.field2128 - this.field2034 + this.field2019;
                            if (n7 < 0) {
                                n7 = 0;
                            }
                            if ((n4 = class1932.field2129 - this.field2034 + this.field2019) > this.field2019 + this.field2019) {
                                n4 = this.field2019 + this.field2019;
                            }
                            n6 = 0;
                            while (n7 <= n4) {
                                if (!this.method4287(n5, n7++)) continue;
                                n6 = 1;
                                break;
                            }
                            if (n6 == 0) break block20;
                            n3 = this.field2030 - class1932.field2126;
                            if (n3 <= 32) break block27;
                            class1932.field2131 = 1;
                            break block28;
                        }
                        if (n3 >= -32) break block20;
                        class1932.field2131 = 2;
                        n3 = -n3;
                    }
                    class1932.field2140 = (class1932.field2133 - this.field2090 << 8) / n3;
                    class1932.field2141 = (class1932.field2134 - this.field2090 << 8) / n3;
                    class1932.field2142 = (class1932.field2127 - this.field2031 << 8) / n3;
                    class1932.field2135 = (class1932.field2145 - this.field2031 << 8) / n3;
                    this.field2062[this.field2037++] = class1932;
                    break block20;
                }
                block3: for (int i = n6; i <= n3; ++i) {
                    for (int j = n7; j <= n4; ++j) {
                        if (!this.method4287(i, j)) continue;
                        bl = true;
                        break block3;
                    }
                }
                if (bl) {
                    class1932.field2131 = 5;
                    class1932.field2138 = (class1932.field2126 - this.field2030 << 8) / n5;
                    class1932.field2139 = (class1932.field2132 - this.field2030 << 8) / n5;
                    class1932.field2140 = (class1932.field2133 - this.field2090 << 8) / n5;
                    class1932.field2141 = (class1932.field2134 - this.field2090 << 8) / n5;
                    this.field2062[this.field2037++] = class1932;
                }
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="cv")
    boolean method4329(int n, int n2, int n3) {
        int n4 = this.field2013[n][n2][n3];
        if (n4 == -this.field2025) {
            return false;
        }
        if (n4 == this.field2025) {
            return true;
        }
        int n5 = n2 << 7;
        int n6 = n3 << 7;
        if (this.method4246(n5 + 1, this.field2008[n][n2][n3], n6 + 1) && this.method4246(n5 + 128 - 1, this.field2008[n][n2 + 1][n3], n6 + 1) && this.method4246(n5 + 128 - 1, this.field2008[n][n2 + 1][n3 + 1], n6 + 128 - 1) && this.method4246(n5 + 1, this.field2008[n][n2][n3 + 1], n6 + 128 - 1)) {
            this.field2013[n][n2][n3] = this.field2025;
            return true;
        }
        this.field2013[n][n2][n3] = -this.field2025;
        return false;
    }

    @ObfuscatedName(value="ck")
    boolean method4243(int n, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        block38: {
            block39: {
                block40: {
                    block41: {
                        int n10;
                        block37: {
                            if (!this.method4329(n, n2, n3)) {
                                return false;
                            }
                            n9 = n2 << 7;
                            n8 = n3 << 7;
                            n7 = this.field2008[n][n2][n3] - 1;
                            n6 = n7 - 120;
                            n5 = n7 - 230;
                            n10 = n7 - 238;
                            if (n4 >= 16) break block37;
                            if (n4 == 1) break block38;
                            if (n4 == 2) break block39;
                            if (n4 == 4) break block40;
                            if (n4 == 8) break block41;
                        }
                        if (!this.method4246(n9 + 64, n10, n8 + 64)) {
                            return false;
                        }
                        if (n4 != 16) {
                            if (n4 != 32) {
                                if (n4 != 64) {
                                    if (n4 != 128) {
                                        return true;
                                    }
                                    return this.method4246(n9, n5, n8);
                                }
                                return this.method4246(n9 + 128, n5, n8);
                            }
                            return this.method4246(n9 + 128, n5, n8 + 128);
                        }
                        return this.method4246(n9, n5, n8 + 128);
                    }
                    if (n8 > this.field2090) {
                        if (!this.method4246(n9, n7, n8)) {
                            return false;
                        }
                        if (!this.method4246(n9 + 128, n7, n8)) {
                            return false;
                        }
                    }
                    if (n > 0) {
                        if (!this.method4246(n9, n6, n8)) {
                            return false;
                        }
                        if (!this.method4246(n9 + 128, n6, n8)) {
                            return false;
                        }
                    }
                    if (!this.method4246(n9, n5, n8)) {
                        return false;
                    }
                    return this.method4246(n9 + 128, n5, n8);
                }
                if (n9 < this.field2030) {
                    if (!this.method4246(n9 + 128, n7, n8)) {
                        return false;
                    }
                    if (!this.method4246(n9 + 128, n7, n8 + 128)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!this.method4246(n9 + 128, n6, n8)) {
                        return false;
                    }
                    if (!this.method4246(n9 + 128, n6, n8 + 128)) {
                        return false;
                    }
                }
                if (!this.method4246(n9 + 128, n5, n8)) {
                    return false;
                }
                return this.method4246(n9 + 128, n5, n8 + 128);
            }
            if (n8 < this.field2090) {
                if (!this.method4246(n9, n7, n8 + 128)) {
                    return false;
                }
                if (!this.method4246(n9 + 128, n7, n8 + 128)) {
                    return false;
                }
            }
            if (n > 0) {
                if (!this.method4246(n9, n6, n8 + 128)) {
                    return false;
                }
                if (!this.method4246(n9 + 128, n6, n8 + 128)) {
                    return false;
                }
            }
            if (!this.method4246(n9, n5, n8 + 128)) {
                return false;
            }
            return this.method4246(n9 + 128, n5, n8 + 128);
        }
        if (n9 > this.field2030) {
            if (!this.method4246(n9, n7, n8)) {
                return false;
            }
            if (!this.method4246(n9, n7, n8 + 128)) {
                return false;
            }
        }
        if (n > 0) {
            if (!this.method4246(n9, n6, n8)) {
                return false;
            }
            if (!this.method4246(n9, n6, n8 + 128)) {
                return false;
            }
        }
        if (!this.method4246(n9, n5, n8)) {
            return false;
        }
        return this.method4246(n9, n5, n8 + 128);
    }

    @ObfuscatedName(value="cs")
    boolean method4244(int n, int n2, int n3, int n4) {
        if (!this.method4329(n, n2, n3)) {
            return false;
        }
        int n5 = n2 << 7;
        int n6 = n3 << 7;
        return this.method4246(n5 + 1, this.field2008[n][n2][n3] - n4, n6 + 1) && this.method4246(n5 + 128 - 1, this.field2008[n][n2 + 1][n3] - n4, n6 + 1) && this.method4246(n5 + 128 - 1, this.field2008[n][n2 + 1][n3 + 1] - n4, n6 + 128 - 1) && this.method4246(n5 + 1, this.field2008[n][n2][n3 + 1] - n4, n6 + 128 - 1);
    }

    @ObfuscatedName(value="cm")
    boolean method4245(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n3 == n2 && n5 == n4) {
            if (!this.method4329(n, n2, n4)) {
                return false;
            }
            int n7 = n2 << 7;
            int n8 = n4 << 7;
            return this.method4246(n7 + 1, this.field2008[n][n2][n4] - n6, n8 + 1) && this.method4246(n7 + 128 - 1, this.field2008[n][n2 + 1][n4] - n6, n8 + 1) && this.method4246(n7 + 128 - 1, this.field2008[n][n2 + 1][n4 + 1] - n6, n8 + 128 - 1) && this.method4246(n7 + 1, this.field2008[n][n2][n4 + 1] - n6, n8 + 128 - 1);
        }
        int n9 = n2;
        while (true) {
            int n10;
            if (n9 > n3) {
                n9 = (n2 << 7) + 1;
                int n11 = this.field2008[n][n2][n4] - n6;
                n10 = (n4 << 7) + 2;
                if (!this.method4246(n9, n11, n10)) {
                    return false;
                }
                int n12 = (n3 << 7) - 1;
                if (!this.method4246(n12, n11, n10)) {
                    return false;
                }
                int n13 = (n5 << 7) - 1;
                if (!this.method4246(n9, n11, n13)) {
                    return false;
                }
                return this.method4246(n12, n11, n13);
            }
            for (n10 = n4; n10 <= n5; ++n10) {
                if (this.field2013[n][n9][n10] != -this.field2025) continue;
                return false;
            }
            ++n9;
        }
    }

    @ObfuscatedName(value="ce")
    boolean method4246(int n, int n2, int n3) {
        int n4 = 0;
        while (n4 < this.field2037) {
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            class193 class1932 = this.field2062[n4];
            if (class1932.field2131 != 1) {
                if (class1932.field2131 != 2) {
                    if (class1932.field2131 != 3) {
                        if (class1932.field2131 != 4) {
                            if (class1932.field2131 == 5 && (n9 = n2 - class1932.field2127) > 0) {
                                n8 = (n9 * class1932.field2138 >> 8) + class1932.field2126;
                                n7 = (n9 * class1932.field2139 >> 8) + class1932.field2132;
                                n6 = (n9 * class1932.field2140 >> 8) + class1932.field2133;
                                n5 = (n9 * class1932.field2141 >> 8) + class1932.field2134;
                                if (n >= n8 && n <= n7 && n3 >= n6 && n3 <= n5) {
                                    return true;
                                }
                            }
                        } else {
                            n9 = n3 - class1932.field2133;
                            if (n9 > 0) {
                                n8 = (n9 * class1932.field2138 >> 8) + class1932.field2126;
                                n7 = (n9 * class1932.field2139 >> 8) + class1932.field2132;
                                n6 = (n9 * class1932.field2142 >> 8) + class1932.field2127;
                                n5 = (n9 * class1932.field2135 >> 8) + class1932.field2145;
                                if (n >= n8 && n <= n7 && n2 >= n6 && n2 <= n5) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        n9 = class1932.field2133 - n3;
                        if (n9 > 0) {
                            n8 = (n9 * class1932.field2138 >> 8) + class1932.field2126;
                            n7 = (n9 * class1932.field2139 >> 8) + class1932.field2132;
                            n6 = (n9 * class1932.field2142 >> 8) + class1932.field2127;
                            n5 = (n9 * class1932.field2135 >> 8) + class1932.field2145;
                            if (n >= n8 && n <= n7 && n2 >= n6 && n2 <= n5) {
                                return true;
                            }
                        }
                    }
                } else {
                    n9 = n - class1932.field2126;
                    if (n9 > 0) {
                        n8 = (n9 * class1932.field2140 >> 8) + class1932.field2133;
                        n7 = (n9 * class1932.field2141 >> 8) + class1932.field2134;
                        n6 = (n9 * class1932.field2142 >> 8) + class1932.field2127;
                        n5 = (n9 * class1932.field2135 >> 8) + class1932.field2145;
                        if (n3 >= n8 && n3 <= n7 && n2 >= n6 && n2 <= n5) {
                            return true;
                        }
                    }
                }
            } else {
                n9 = class1932.field2126 - n;
                if (n9 > 0) {
                    n8 = (n9 * class1932.field2140 >> 8) + class1932.field2133;
                    n7 = (n9 * class1932.field2141 >> 8) + class1932.field2134;
                    n6 = (n9 * class1932.field2142 >> 8) + class1932.field2127;
                    n5 = (n9 * class1932.field2135 >> 8) + class1932.field2145;
                    if (n3 >= n8 && n3 <= n7 && n2 >= n6 && n2 <= n5) {
                        return true;
                    }
                }
            }
            ++n4;
        }
        return false;
    }

    @Override
    @ObfuscatedName(value="eq")
    void vmethod4616(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, long l, int n10, int n11, boolean bl) {
        class429 class4292 = new class429();
        class4292.method8459((float)((double)(-n2) * 0.0030679615));
        class4292.method8460((float)((double)(-n3) * 0.0030679615));
        class4292.method8458(n7, n8, n9);
        class428 class4282 = new class428();
        class4282.method8381(class4292);
        class4282.method8383();
        int n12 = this.field2056 % 300;
        float f = (float)n12 / 300.0f * 6.283f;
        float f2 = (float)Math.sin(f);
        float f3 = (float)Math.cos(f);
        float f4 = f2 * 3.14159f / 100.0f;
        float f5 = f3 * 3.14159f / 100.0f;
        class422 class4222 = new class422();
        class428 class4283 = new class428();
        class4222.field4728 = new class427((float)((double)n * 0.0030679615), f4, f5);
        class4222.field4729 = new class426(n4, n5, n6);
        class428 class4284 = new class428();
        class4284.method8379(class4222);
        class4284.method8383();
        class422 class4223 = new class422();
        class4223.field4729 = new class426(-(this.field2006 * 64) - this.field2002, 0.0f, -(this.field2032 * 64) - this.field2040);
        class428 class4285 = new class428();
        class4285.method8379(class4223);
        class4283.method8398(1.0f, 1.0f, 1.0f, 1.0f);
        class4285.method8389(class4283);
        class4283.method8379(class4222);
        class4285.method8389(class4283);
        class4285.method8389(class4282);
        this.field2030 = (int)class4284.method8400(n7, n8, n9);
        this.field2031 = (int)class4284.method8388(n7, n8, n9);
        this.field2090 = (int)class4284.method8452(n7, n8, n9);
        this.field2100 = this.field2030 / 128;
        this.field2034 = this.field2090 / 128;
        this.field2097 = (int)class4284.method8400(n10, 0.0f, n11) / 128;
        this.field2036 = (int)class4284.method8452(n10, 0.0f, n11) / 128;
        class188 class1882 = new class188(class4285);
        this.method4237(class1882, bl);
    }

    @ObfuscatedName(value="cj")
    static final int method4239(int n, int n2) {
        if ((n2 = (n & 0x7F) * n2 >> 7) < 2) {
            n2 = 2;
        } else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }

    @ObfuscatedName(value="cx")
    static boolean method4240(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (n2 < n3 && n2 < n4 && n2 < n5) {
            return false;
        }
        if (n2 > n3 && n2 > n4 && n2 > n5) {
            return false;
        }
        if (n < n6 && n < n7 && n < n8) {
            return false;
        }
        if (n > n6 && n > n7 && n > n8) {
            return false;
        }
        int n9 = (n2 - n3) * (n7 - n6) - (n - n6) * (n4 - n3);
        int n10 = (n8 - n7) * (n2 - n4) - (n - n7) * (n5 - n4);
        int n11 = (n6 - n8) * (n2 - n5) - (n3 - n5) * (n - n8);
        if (n9 == 0) {
            if (n10 == 0) {
                return true;
            }
            return n10 < 0 ? n11 <= 0 : n11 >= 0;
        }
        return n9 < 0 ? n10 <= 0 && n11 <= 0 : n10 >= 0 && n11 >= 0;
    }
}

