package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gx")
public class class177
extends class190 {
    @ObfuscatedName(value="bc")
    static int[] field1888 = new int[10000];
    @ObfuscatedName(value="bv")
    static int[] field1853 = new int[10000];
    @ObfuscatedName(value="bq")
    static int field1890 = 0;
    @ObfuscatedName(value="ba")
    static int[] field1891 = class182.field1954;
    @ObfuscatedName(value="bk")
    static int[] field1892 = class182.field1955;
    @ObfuscatedName(value="ao")
    int field1879 = 0;
    @ObfuscatedName(value="ad")
    int[] field1852;
    @ObfuscatedName(value="an")
    int[] field1860;
    @ObfuscatedName(value="ae")
    int[] field1854;
    @ObfuscatedName(value="ax")
    int field1855 = 0;
    @ObfuscatedName(value="at")
    int[] field1856;
    @ObfuscatedName(value="ac")
    int[] field1857;
    @ObfuscatedName(value="au")
    int[] field1883;
    @ObfuscatedName(value="as")
    byte[] field1882;
    @ObfuscatedName(value="aq")
    byte[] field1859;
    @ObfuscatedName(value="af")
    byte[] field1861;
    @ObfuscatedName(value="aa")
    byte[] field1862;
    @ObfuscatedName(value="ak")
    short[] field1864;
    @ObfuscatedName(value="al")
    short[] field1889;
    @ObfuscatedName(value="av")
    byte field1865 = 0;
    @ObfuscatedName(value="ag")
    int field1866;
    @ObfuscatedName(value="aw")
    byte[] field1867;
    @ObfuscatedName(value="ai")
    short[] field1868;
    @ObfuscatedName(value="ar")
    short[] field1869;
    @ObfuscatedName(value="am")
    short[] field1873;
    @ObfuscatedName(value="ap")
    int[] field1871;
    @ObfuscatedName(value="ab")
    int[] field1872;
    @ObfuscatedName(value="aj")
    int[][] field1851;
    @ObfuscatedName(value="bu")
    int[][] field1874;
    @ObfuscatedName(value="bh")
    int[][] field1875;
    @ObfuscatedName(value="bw")
    int[][] field1876;
    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="[Lhi;")
    class191[] field1877;
    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="[Lhd;")
    class200[] field1878;
    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="[Lhd;")
    class200[] field1848;
    @ObfuscatedName(value="bi")
    public short field1858;
    @ObfuscatedName(value="bz")
    public short field1881;
    @ObfuscatedName(value="bt")
    boolean field1880 = false;
    @ObfuscatedName(value="bf")
    int field1863;
    @ObfuscatedName(value="by")
    int field1884;
    @ObfuscatedName(value="bm")
    int field1885;
    @ObfuscatedName(value="bp")
    int field1886;
    @ObfuscatedName(value="bg")
    int field1887;

    class177() {
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @ObfuscatedSignature(descriptor="([Lgx;I)V")
    public class177(class177[] class177Array, int n) {
        class177 class1772;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        this.field1879 = 0;
        this.field1855 = 0;
        this.field1866 = 0;
        this.field1865 = (byte)-1;
        int n2 = 0;
        while (true) {
            block24: {
                block25: {
                    block23: {
                        if (n2 >= n) break block23;
                        class1772 = class177Array[n2];
                        if (class1772 == null) break block24;
                        break block25;
                    }
                    this.field1852 = new int[this.field1879];
                    this.field1860 = new int[this.field1879];
                    this.field1854 = new int[this.field1879];
                    this.field1871 = new int[this.field1879];
                    this.field1856 = new int[this.field1855];
                    this.field1857 = new int[this.field1855];
                    this.field1883 = new int[this.field1855];
                    if (bl) {
                        this.field1882 = new byte[this.field1855];
                    }
                    if (bl2) {
                        this.field1859 = new byte[this.field1855];
                    }
                    if (bl3) {
                        this.field1861 = new byte[this.field1855];
                    }
                    if (bl4) {
                        this.field1872 = new int[this.field1855];
                    }
                    if (bl5) {
                        this.field1889 = new short[this.field1855];
                    }
                    if (bl6) {
                        this.field1862 = new byte[this.field1855];
                    }
                    if (bl7) {
                        this.field1875 = new int[this.field1879][];
                        this.field1876 = new int[this.field1879][];
                    }
                    this.field1864 = new short[this.field1855];
                    if (this.field1866 > 0) {
                        this.field1867 = new byte[this.field1866];
                        this.field1868 = new short[this.field1866];
                        this.field1869 = new short[this.field1866];
                        this.field1873 = new short[this.field1866];
                    }
                    break;
                }
                this.field1879 += class1772.field1879;
                this.field1855 += class1772.field1855;
                this.field1866 += class1772.field1866;
                if (class1772.field1859 != null) {
                    bl2 = true;
                } else {
                    if (this.field1865 == -1) {
                        this.field1865 = class1772.field1865;
                    }
                    if (this.field1865 != class1772.field1865) {
                        bl2 = true;
                    }
                }
                bl |= class1772.field1882 != null;
                bl3 |= class1772.field1861 != null;
                bl4 |= class1772.field1872 != null;
                bl5 |= class1772.field1889 != null;
                bl6 |= class1772.field1862 != null;
                bl7 |= class1772.field1875 != null;
            }
            ++n2;
        }
        this.field1879 = 0;
        this.field1855 = 0;
        this.field1866 = 0;
        n2 = 0;
        block1: while (n2 < n) {
            boolean bl8 = true;
            while (true) {
                int n3;
                block29: {
                    block30: {
                        block27: {
                            block28: {
                                block26: {
                                    if (!bl8 || (bl8 = false)) break block26;
                                    class1772 = class177Array[n2];
                                    if (class1772 == null) break block27;
                                    n3 = 0;
                                }
                                if (n3 >= class1772.field1855) break block28;
                                if (!bl) break block29;
                                break block30;
                            }
                            for (n3 = 0; n3 < class1772.field1866; ++this.field1866, ++n3) {
                                this.field1867[this.field1866] = class1772.field1867[n3];
                                byte by = this.field1867[this.field1866];
                                if (by != 0) continue;
                                this.field1868[this.field1866] = (short)this.method3898(class1772, class1772.field1868[n3]);
                                this.field1869[this.field1866] = (short)this.method3898(class1772, class1772.field1869[n3]);
                                this.field1873[this.field1866] = (short)this.method3898(class1772, class1772.field1873[n3]);
                            }
                        }
                        ++n2;
                        continue block1;
                    }
                    if (class1772.field1882 != null) {
                        this.field1882[this.field1855] = class1772.field1882[n3];
                    }
                }
                if (bl2) {
                    this.field1859[this.field1855] = class1772.field1859 != null ? class1772.field1859[n3] : class1772.field1865;
                }
                if (bl3 && class1772.field1861 != null) {
                    this.field1861[this.field1855] = class1772.field1861[n3];
                }
                if (bl4 && class1772.field1872 != null) {
                    this.field1872[this.field1855] = class1772.field1872[n3];
                }
                if (bl5) {
                    this.field1889[this.field1855] = class1772.field1889 != null ? class1772.field1889[n3] : -1;
                }
                if (bl6) {
                    this.field1862[this.field1855] = class1772.field1862 != null && class1772.field1862[n3] != -1 ? (int)(this.field1866 + class1772.field1862[n3]) : -1;
                }
                this.field1864[this.field1855] = class1772.field1864[n3];
                this.field1856[this.field1855] = this.method3898(class1772, class1772.field1856[n3]);
                this.field1857[this.field1855] = this.method3898(class1772, class1772.field1857[n3]);
                this.field1883[this.field1855] = this.method3898(class1772, class1772.field1883[n3]);
                ++this.field1855;
                ++n3;
            }
            break;
        }
        return;
    }

    class177(byte[] byArray) {
        if (byArray[byArray.length - 1] == -3 && byArray[byArray.length - 2] == -1) {
            this.method3892(byArray);
        } else if (byArray[byArray.length - 1] == -2 && byArray[byArray.length - 2] == -1) {
            this.method3921(byArray);
        } else if (byArray[byArray.length - 1] == -1 && byArray[byArray.length - 2] == -1) {
            this.method3895(byArray);
        } else {
            this.method3906(byArray);
        }
    }

    @ObfuscatedSignature(descriptor="(Lgx;ZZZZ)V", garbageValue="1")
    public class177(class177 class1772, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        int n;
        this.field1879 = class1772.field1879;
        this.field1855 = class1772.field1855;
        this.field1866 = class1772.field1866;
        if (!bl) {
            this.field1852 = new int[this.field1879];
            this.field1860 = new int[this.field1879];
            this.field1854 = new int[this.field1879];
            for (n = 0; n < this.field1879; ++n) {
                this.field1852[n] = class1772.field1852[n];
                this.field1860[n] = class1772.field1860[n];
                this.field1854[n] = class1772.field1854[n];
            }
        } else {
            this.field1852 = class1772.field1852;
            this.field1860 = class1772.field1860;
            this.field1854 = class1772.field1854;
        }
        if (bl2) {
            this.field1864 = class1772.field1864;
        } else {
            this.field1864 = new short[this.field1855];
            for (n = 0; n < this.field1855; ++n) {
                this.field1864[n] = class1772.field1864[n];
            }
        }
        if (!bl3 && class1772.field1889 != null) {
            this.field1889 = new short[this.field1855];
            for (n = 0; n < this.field1855; ++n) {
                this.field1889[n] = class1772.field1889[n];
            }
        } else {
            this.field1889 = class1772.field1889;
        }
        this.field1861 = class1772.field1861;
        this.field1856 = class1772.field1856;
        this.field1857 = class1772.field1857;
        this.field1883 = class1772.field1883;
        this.field1882 = class1772.field1882;
        this.field1859 = class1772.field1859;
        this.field1862 = class1772.field1862;
        this.field1865 = class1772.field1865;
        this.field1867 = class1772.field1867;
        this.field1868 = class1772.field1868;
        this.field1869 = class1772.field1869;
        this.field1873 = class1772.field1873;
        this.field1871 = class1772.field1871;
        this.field1872 = class1772.field1872;
        this.field1851 = class1772.field1851;
        this.field1874 = class1772.field1874;
        this.field1878 = class1772.field1878;
        this.field1877 = class1772.field1877;
        this.field1848 = class1772.field1848;
        this.field1875 = class1772.field1875;
        this.field1876 = class1772.field1876;
        this.field1858 = class1772.field1858;
        this.field1881 = class1772.field1881;
    }

    public class177(int n, int n2, int n3) {
        this.field1852 = new int[n];
        this.field1860 = new int[n];
        this.field1854 = new int[n];
        this.field1871 = new int[n];
        this.field1856 = new int[n2];
        this.field1857 = new int[n2];
        this.field1883 = new int[n2];
        this.field1882 = new byte[n2];
        this.field1859 = new byte[n2];
        this.field1861 = new byte[n2];
        this.field1864 = new short[n2];
        this.field1889 = new short[n2];
        this.field1862 = new byte[n2];
        this.field1872 = new int[n2];
        if (n3 > 0) {
            this.field1867 = new byte[n3];
            this.field1868 = new short[n3];
            this.field1869 = new short[n3];
            this.field1873 = new short[n3];
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ah")
    void method3892(byte[] byArray) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        int n19;
        int n20;
        int n21;
        int n22;
        int n23;
        int n24;
        int n25;
        int n26;
        int n27;
        int n28;
        int n29;
        class556 class5562;
        class556 class5563;
        class556 class5564;
        class556 class5565;
        class556 class5566;
        class556 class5567;
        class556 class5568;
        block40: {
            int n30;
            int n31;
            class5568 = new class556(byArray);
            class5567 = new class556(byArray);
            class5566 = new class556(byArray);
            class5565 = new class556(byArray);
            class5564 = new class556(byArray);
            class5563 = new class556(byArray);
            class5562 = new class556(byArray);
            class5568.field5471 = byArray.length - 26;
            int n32 = class5568.method10307();
            n29 = class5568.method10307();
            n28 = class5568.method10282();
            n27 = class5568.method10282();
            n26 = class5568.method10282();
            n25 = class5568.method10282();
            n24 = class5568.method10282();
            n23 = class5568.method10282();
            int n33 = class5568.method10282();
            int n34 = class5568.method10282();
            int n35 = class5568.method10307();
            int n36 = class5568.method10307();
            int n37 = class5568.method10307();
            int n38 = class5568.method10307();
            int n39 = class5568.method10307();
            int n40 = class5568.method10307();
            int n41 = 0;
            int n42 = 0;
            int n43 = 0;
            if (n28 > 0) {
                this.field1867 = new byte[n28];
                class5568.field5471 = 0;
                for (n31 = 0; n31 < n28; ++n31) {
                    this.field1867[n31] = class5568.method10524();
                    n30 = this.field1867[n31];
                    if (n30 == 0) {
                        ++n41;
                    }
                    if (n30 >= 1 && n30 <= 3) {
                        ++n42;
                    }
                    if (n30 != 2) continue;
                    ++n43;
                }
            }
            n30 = n31 = n28;
            n22 = n31 += n32;
            if (n27 == 1) {
                n31 += n29;
            }
            n21 = n31;
            n20 = n31 += n29;
            if (n26 == 255) {
                n31 += n29;
            }
            n19 = n31;
            if (n24 == 1) {
                n31 += n29;
            }
            int n44 = n31;
            n18 = n31 += n40;
            if (n25 == 1) {
                n31 += n29;
            }
            n17 = n31;
            n16 = n31 += n38;
            if (n23 == 1) {
                n31 = n29 * 2 + n31;
            }
            n15 = n31;
            n14 = n31 += n39;
            int n45 = n31 = n29 * 2 + n31;
            int n46 = n31 += n35;
            int n47 = n31 += n36;
            n13 = n31 += n37;
            n12 = n31 = n41 * 6 + n31;
            n11 = n31 = n42 * 6 + n31;
            n10 = n31 = n42 * 6 + n31;
            n9 = n31 = n42 * 2 + n31;
            n8 = n31 += n42;
            n7 = n31 = n42 * 2 + n43 * 2 + n31;
            this.field1879 = n32;
            this.field1855 = n29;
            this.field1866 = n28;
            this.field1852 = new int[n32];
            this.field1860 = new int[n32];
            this.field1854 = new int[n32];
            this.field1856 = new int[n29];
            this.field1857 = new int[n29];
            this.field1883 = new int[n29];
            if (n33 == 1) {
                this.field1871 = new int[n32];
            }
            if (n27 == 1) {
                this.field1882 = new byte[n29];
            }
            if (n26 == 255) {
                this.field1859 = new byte[n29];
            } else {
                this.field1865 = (byte)n26;
            }
            if (n25 == 1) {
                this.field1861 = new byte[n29];
            }
            if (n24 == 1) {
                this.field1872 = new int[n29];
            }
            if (n23 == 1) {
                this.field1889 = new short[n29];
            }
            if (n23 == 1 && n28 > 0) {
                this.field1862 = new byte[n29];
            }
            if (n34 == 1) {
                this.field1875 = new int[n32][];
                this.field1876 = new int[n32][];
            }
            this.field1864 = new short[n29];
            if (n28 > 0) {
                this.field1868 = new short[n28];
                this.field1869 = new short[n28];
                this.field1873 = new short[n28];
            }
            class5568.field5471 = n30;
            class5567.field5471 = n45;
            class5566.field5471 = n46;
            class5565.field5471 = n47;
            class5564.field5471 = n44;
            int n48 = 0;
            int n49 = 0;
            int n50 = 0;
            n6 = 0;
            while (true) {
                block42: {
                    block43: {
                        block41: {
                            if (n6 >= n32) break block41;
                            n5 = class5568.method10282();
                            n4 = 0;
                            if ((n5 & 1) == 0) break block42;
                            break block43;
                        }
                        if (n34 == 1) {
                            break;
                        }
                        break block40;
                    }
                    n4 = class5567.method10294();
                }
                n3 = 0;
                if ((n5 & 2) != 0) {
                    n3 = class5566.method10294();
                }
                n2 = 0;
                if ((n5 & 4) != 0) {
                    n2 = class5565.method10294();
                }
                this.field1852[n6] = n48 + n4;
                this.field1860[n6] = n49 + n3;
                this.field1854[n6] = n50 + n2;
                n48 = this.field1852[n6];
                n49 = this.field1860[n6];
                n50 = this.field1854[n6];
                if (n33 == 1) {
                    this.field1871[n6] = class5564.method10282();
                }
                ++n6;
            }
            for (n6 = 0; n6 < n32; ++n6) {
                n5 = class5564.method10282();
                this.field1875[n6] = new int[n5];
                this.field1876[n6] = new int[n5];
                for (n4 = 0; n4 < n5; ++n4) {
                    this.field1875[n6][n4] = class5564.method10282();
                    this.field1876[n6][n4] = class5564.method10282();
                }
            }
        }
        class5568.field5471 = n14;
        class5567.field5471 = n22;
        class5566.field5471 = n20;
        class5565.field5471 = n18;
        class5564.field5471 = n19;
        class5563.field5471 = n16;
        class5562.field5471 = n15;
        n6 = 0;
        while (true) {
            if (n6 >= n29) break;
            this.field1864[n6] = (short)class5568.method10307();
            if (n27 == 1) {
                this.field1882[n6] = class5567.method10524();
            }
            if (n26 == 255) {
                this.field1859[n6] = class5566.method10524();
            }
            if (n25 == 1) {
                this.field1861[n6] = class5565.method10524();
            }
            if (n24 == 1) {
                this.field1872[n6] = class5564.method10282();
            }
            if (n23 == 1) {
                this.field1889[n6] = (short)(class5563.method10307() - 1);
            }
            if (this.field1862 != null && this.field1889[n6] != -1) {
                this.field1862[n6] = (byte)(class5562.method10282() - 1);
            }
            ++n6;
        }
        class5568.field5471 = n17;
        class5567.field5471 = n21;
        n6 = 0;
        n5 = 0;
        n4 = 0;
        n3 = 0;
        n2 = 0;
        while (true) {
            if (n2 >= n29) break;
            n = class5567.method10282();
            if (n == 1) {
                n3 = n6 = class5568.method10294() + n3;
                n3 = n5 = class5568.method10294() + n3;
                n3 = n4 = class5568.method10294() + n3;
                this.field1856[n2] = n6;
                this.field1857[n2] = n5;
                this.field1883[n2] = n4;
            }
            if (n == 2) {
                n5 = n4;
                n3 = n4 = class5568.method10294() + n3;
                this.field1856[n2] = n6;
                this.field1857[n2] = n5;
                this.field1883[n2] = n4;
            }
            if (n == 3) {
                n6 = n4;
                n3 = n4 = class5568.method10294() + n3;
                this.field1856[n2] = n6;
                this.field1857[n2] = n5;
                this.field1883[n2] = n4;
            }
            if (n == 4) {
                int n51 = n6;
                n6 = n5;
                n5 = n51;
                n3 = n4 = class5568.method10294() + n3;
                this.field1856[n2] = n6;
                this.field1857[n2] = n5;
                this.field1883[n2] = n4;
            }
            ++n2;
        }
        class5568.field5471 = n13;
        class5567.field5471 = n12;
        class5566.field5471 = n11;
        class5565.field5471 = n10;
        class5564.field5471 = n9;
        class5563.field5471 = n8;
        n2 = 0;
        while (true) {
            block45: {
                block46: {
                    block44: {
                        if (n2 >= n28) break block44;
                        n = this.field1867[n2] & 0xFF;
                        if (n != 0) break block45;
                        break block46;
                    }
                    class5568.field5471 = n7;
                    n2 = class5568.method10282();
                    if (n2 != 0) {
                        new class205();
                        class5568.method10307();
                        class5568.method10307();
                        class5568.method10307();
                        class5568.method10440();
                    }
                    return;
                }
                this.field1868[n2] = (short)class5568.method10307();
                this.field1869[n2] = (short)class5568.method10307();
                this.field1873[n2] = (short)class5568.method10307();
            }
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="az")
    void method3921(byte[] byArray) {
        boolean bl;
        boolean bl2;
        block37: {
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            int n16;
            int n17;
            int n18;
            int n19;
            int n20;
            int n21;
            class556 class5562;
            class556 class5563;
            class556 class5564;
            class556 class5565;
            class556 class5566;
            block36: {
                int n22;
                bl2 = false;
                bl = false;
                class5566 = new class556(byArray);
                class5565 = new class556(byArray);
                class5564 = new class556(byArray);
                class5563 = new class556(byArray);
                class5562 = new class556(byArray);
                class5566.field5471 = byArray.length - 23;
                int n23 = class5566.method10307();
                n21 = class5566.method10307();
                n20 = class5566.method10282();
                n19 = class5566.method10282();
                n18 = class5566.method10282();
                n17 = class5566.method10282();
                n16 = class5566.method10282();
                int n24 = class5566.method10282();
                int n25 = class5566.method10282();
                int n26 = class5566.method10307();
                int n27 = class5566.method10307();
                int n28 = class5566.method10307();
                int n29 = class5566.method10307();
                int n30 = class5566.method10307();
                int n31 = n22 = 0;
                n15 = n22 += n23;
                n14 = n22 += n21;
                if (n18 == 255) {
                    n22 += n21;
                }
                n13 = n22;
                if (n16 == 1) {
                    n22 += n21;
                }
                n12 = n22;
                if (n19 == 1) {
                    n22 += n21;
                }
                int n32 = n22;
                n11 = n22 += n30;
                if (n17 == 1) {
                    n22 += n21;
                }
                n10 = n22;
                n9 = n22 += n29;
                n8 = n22 = n21 * 2 + n22;
                int n33 = n22 = n20 * 6 + n22;
                int n34 = n22 += n26;
                int n35 = n22 += n27;
                n22 += n28;
                this.field1879 = n23;
                this.field1855 = n21;
                this.field1866 = n20;
                this.field1852 = new int[n23];
                this.field1860 = new int[n23];
                this.field1854 = new int[n23];
                this.field1856 = new int[n21];
                this.field1857 = new int[n21];
                this.field1883 = new int[n21];
                if (n20 > 0) {
                    this.field1867 = new byte[n20];
                    this.field1868 = new short[n20];
                    this.field1869 = new short[n20];
                    this.field1873 = new short[n20];
                }
                if (n24 == 1) {
                    this.field1871 = new int[n23];
                }
                if (n19 == 1) {
                    this.field1882 = new byte[n21];
                    this.field1862 = new byte[n21];
                    this.field1889 = new short[n21];
                }
                if (n18 == 255) {
                    this.field1859 = new byte[n21];
                } else {
                    this.field1865 = (byte)n18;
                }
                if (n17 == 1) {
                    this.field1861 = new byte[n21];
                }
                if (n16 == 1) {
                    this.field1872 = new int[n21];
                }
                if (n25 == 1) {
                    this.field1875 = new int[n23][];
                    this.field1876 = new int[n23][];
                }
                this.field1864 = new short[n21];
                class5566.field5471 = n31;
                class5565.field5471 = n33;
                class5564.field5471 = n34;
                class5563.field5471 = n35;
                class5562.field5471 = n32;
                int n36 = 0;
                int n37 = 0;
                int n38 = 0;
                n7 = 0;
                while (true) {
                    block39: {
                        block40: {
                            block38: {
                                if (n7 >= n23) break block38;
                                n6 = class5566.method10282();
                                n5 = 0;
                                if ((n6 & 1) == 0) break block39;
                                break block40;
                            }
                            if (n25 == 1) {
                                break;
                            }
                            break block36;
                        }
                        n5 = class5565.method10294();
                    }
                    n4 = 0;
                    if ((n6 & 2) != 0) {
                        n4 = class5564.method10294();
                    }
                    n3 = 0;
                    if ((n6 & 4) != 0) {
                        n3 = class5563.method10294();
                    }
                    this.field1852[n7] = n36 + n5;
                    this.field1860[n7] = n37 + n4;
                    this.field1854[n7] = n38 + n3;
                    n36 = this.field1852[n7];
                    n37 = this.field1860[n7];
                    n38 = this.field1854[n7];
                    if (n24 == 1) {
                        this.field1871[n7] = class5562.method10282();
                    }
                    ++n7;
                }
                n7 = 0;
                while (true) {
                    if (n7 >= n23) break;
                    n6 = class5562.method10282();
                    this.field1875[n7] = new int[n6];
                    this.field1876[n7] = new int[n6];
                    for (n5 = 0; n5 < n6; ++n5) {
                        this.field1875[n7][n5] = class5562.method10282();
                        this.field1876[n7][n5] = class5562.method10282();
                    }
                    ++n7;
                }
            }
            class5566.field5471 = n9;
            class5565.field5471 = n12;
            class5564.field5471 = n14;
            class5563.field5471 = n11;
            class5562.field5471 = n13;
            n7 = 0;
            while (true) {
                block41: {
                    block43: {
                        block42: {
                            if (n7 >= n21) break;
                            this.field1864[n7] = (short)class5566.method10307();
                            if (n19 != 1) break block41;
                            n6 = class5565.method10282();
                            if ((n6 & 1) == 1) {
                                this.field1882[n7] = 1;
                                bl2 = true;
                            } else {
                                this.field1882[n7] = 0;
                            }
                            if ((n6 & 2) != 2) break block42;
                            this.field1862[n7] = (byte)(n6 >> 2);
                            this.field1889[n7] = this.field1864[n7];
                            this.field1864[n7] = 127;
                            if (this.field1889[n7] == -1) break block41;
                            break block43;
                        }
                        this.field1862[n7] = -1;
                        this.field1889[n7] = -1;
                        break block41;
                    }
                    bl = true;
                }
                if (n18 == 255) {
                    this.field1859[n7] = class5564.method10524();
                }
                if (n17 == 1) {
                    this.field1861[n7] = class5563.method10524();
                }
                if (n16 == 1) {
                    this.field1872[n7] = class5562.method10282();
                }
                ++n7;
            }
            class5566.field5471 = n10;
            class5565.field5471 = n15;
            n7 = 0;
            n6 = 0;
            n5 = 0;
            n4 = 0;
            n3 = 0;
            while (true) {
                block45: {
                    block46: {
                        block44: {
                            if (n3 >= n21) break block44;
                            n2 = class5565.method10282();
                            if (n2 != 1) break block45;
                            break block46;
                        }
                        class5566.field5471 = n8;
                        for (n3 = 0; n3 < n20; ++n3) {
                            this.field1867[n3] = 0;
                            this.field1868[n3] = (short)class5566.method10307();
                            this.field1869[n3] = (short)class5566.method10307();
                            this.field1873[n3] = (short)class5566.method10307();
                        }
                        if (this.field1862 != null) {
                            break;
                        }
                        break block37;
                    }
                    n4 = n7 = class5566.method10294() + n4;
                    n4 = n6 = class5566.method10294() + n4;
                    n4 = n5 = class5566.method10294() + n4;
                    this.field1856[n3] = n7;
                    this.field1857[n3] = n6;
                    this.field1883[n3] = n5;
                }
                if (n2 == 2) {
                    n6 = n5;
                    n4 = n5 = class5566.method10294() + n4;
                    this.field1856[n3] = n7;
                    this.field1857[n3] = n6;
                    this.field1883[n3] = n5;
                }
                if (n2 == 3) {
                    n7 = n5;
                    n4 = n5 = class5566.method10294() + n4;
                    this.field1856[n3] = n7;
                    this.field1857[n3] = n6;
                    this.field1883[n3] = n5;
                }
                if (n2 == 4) {
                    n = n7;
                    n7 = n6;
                    n6 = n;
                    n4 = n5 = class5566.method10294() + n4;
                    this.field1856[n3] = n7;
                    this.field1857[n3] = n6;
                    this.field1883[n3] = n5;
                }
                ++n3;
            }
            n3 = 0;
            n2 = 0;
            while (true) {
                block48: {
                    block49: {
                        block47: {
                            if (n2 >= n21) break block47;
                            n = this.field1862[n2] & 0xFF;
                            if (n == 255) break block48;
                            break block49;
                        }
                        if (n3 != 0) break;
                        this.field1862 = null;
                        break;
                    }
                    if (this.field1856[n2] == (this.field1868[n] & 0xFFFF) && this.field1857[n2] == (this.field1869[n] & 0xFFFF) && this.field1883[n2] == (this.field1873[n] & 0xFFFF)) {
                        this.field1862[n2] = -1;
                    } else {
                        n3 = 1;
                    }
                }
                ++n2;
            }
        }
        if (!bl) {
            this.field1889 = null;
        }
        if (!bl2) {
            this.field1882 = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ao")
    void method3895(byte[] byArray) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        class556 class5562 = new class556(byArray);
        class556 class5563 = new class556(byArray);
        class556 class5564 = new class556(byArray);
        class556 class5565 = new class556(byArray);
        class556 class5566 = new class556(byArray);
        class556 class5567 = new class556(byArray);
        class556 class5568 = new class556(byArray);
        class5562.field5471 = byArray.length - 23;
        int n8 = class5562.method10307();
        int n9 = class5562.method10307();
        int n10 = class5562.method10282();
        int n11 = class5562.method10282();
        int n12 = class5562.method10282();
        int n13 = class5562.method10282();
        int n14 = class5562.method10282();
        int n15 = class5562.method10282();
        int n16 = class5562.method10282();
        int n17 = class5562.method10307();
        int n18 = class5562.method10307();
        int n19 = class5562.method10307();
        int n20 = class5562.method10307();
        int n21 = class5562.method10307();
        int n22 = 0;
        int n23 = 0;
        int n24 = 0;
        if (n10 > 0) {
            this.field1867 = new byte[n10];
            class5562.field5471 = 0;
            for (n7 = 0; n7 < n10; ++n7) {
                this.field1867[n7] = class5562.method10524();
                n6 = this.field1867[n7];
                if (n6 == 0) {
                    ++n22;
                }
                if (n6 >= 1 && n6 <= 3) {
                    ++n23;
                }
                if (n6 != 2) continue;
                ++n24;
            }
        }
        n6 = n7 = n10;
        int n25 = n7 += n8;
        if (n11 == 1) {
            n7 += n9;
        }
        int n26 = n7;
        int n27 = n7 += n9;
        if (n12 == 255) {
            n7 += n9;
        }
        int n28 = n7;
        if (n14 == 1) {
            n7 += n9;
        }
        int n29 = n7;
        if (n16 == 1) {
            n7 += n8;
        }
        int n30 = n7;
        if (n13 == 1) {
            n7 += n9;
        }
        int n31 = n7;
        int n32 = n7 += n20;
        if (n15 == 1) {
            n7 = n9 * 2 + n7;
        }
        int n33 = n7;
        int n34 = n7 += n21;
        int n35 = n7 = n9 * 2 + n7;
        int n36 = n7 += n17;
        int n37 = n7 += n18;
        int n38 = n7 += n19;
        int n39 = n7 = n22 * 6 + n7;
        int n40 = n7 = n23 * 6 + n7;
        int n41 = n7 = n23 * 6 + n7;
        int n42 = n7 = n23 * 2 + n7;
        int n43 = n7 += n23;
        int n44 = n7 = n23 * 2 + n24 * 2 + n7;
        this.field1879 = n8;
        this.field1855 = n9;
        this.field1866 = n10;
        this.field1852 = new int[n8];
        this.field1860 = new int[n8];
        this.field1854 = new int[n8];
        this.field1856 = new int[n9];
        this.field1857 = new int[n9];
        this.field1883 = new int[n9];
        if (n16 == 1) {
            this.field1871 = new int[n8];
        }
        if (n11 == 1) {
            this.field1882 = new byte[n9];
        }
        if (n12 == 255) {
            this.field1859 = new byte[n9];
        } else {
            this.field1865 = (byte)n12;
        }
        if (n13 == 1) {
            this.field1861 = new byte[n9];
        }
        if (n14 == 1) {
            this.field1872 = new int[n9];
        }
        if (n15 == 1) {
            this.field1889 = new short[n9];
        }
        if (n15 == 1 && n10 > 0) {
            this.field1862 = new byte[n9];
        }
        this.field1864 = new short[n9];
        if (n10 > 0) {
            this.field1868 = new short[n10];
            this.field1869 = new short[n10];
            this.field1873 = new short[n10];
        }
        class5562.field5471 = n6;
        class5563.field5471 = n35;
        class5564.field5471 = n36;
        class5565.field5471 = n37;
        class5566.field5471 = n29;
        int n45 = 0;
        int n46 = 0;
        int n47 = 0;
        int n48 = 0;
        while (true) {
            if (n48 >= n8) break;
            n5 = class5562.method10282();
            n4 = 0;
            if ((n5 & 1) != 0) {
                n4 = class5563.method10294();
            }
            n3 = 0;
            if ((n5 & 2) != 0) {
                n3 = class5564.method10294();
            }
            n2 = 0;
            if ((n5 & 4) != 0) {
                n2 = class5565.method10294();
            }
            this.field1852[n48] = n45 + n4;
            this.field1860[n48] = n46 + n3;
            this.field1854[n48] = n47 + n2;
            n45 = this.field1852[n48];
            n46 = this.field1860[n48];
            n47 = this.field1854[n48];
            if (n16 == 1) {
                this.field1871[n48] = class5566.method10282();
            }
            ++n48;
        }
        class5562.field5471 = n34;
        class5563.field5471 = n25;
        class5564.field5471 = n27;
        class5565.field5471 = n30;
        class5566.field5471 = n28;
        class5567.field5471 = n32;
        class5568.field5471 = n33;
        n48 = 0;
        while (true) {
            if (n48 >= n9) break;
            this.field1864[n48] = (short)class5562.method10307();
            if (n11 == 1) {
                this.field1882[n48] = class5563.method10524();
            }
            if (n12 == 255) {
                this.field1859[n48] = class5564.method10524();
            }
            if (n13 == 1) {
                this.field1861[n48] = class5565.method10524();
            }
            if (n14 == 1) {
                this.field1872[n48] = class5566.method10282();
            }
            if (n15 == 1) {
                this.field1889[n48] = (short)(class5567.method10307() - 1);
            }
            if (this.field1862 != null && this.field1889[n48] != -1) {
                this.field1862[n48] = (byte)(class5568.method10282() - 1);
            }
            ++n48;
        }
        class5562.field5471 = n31;
        class5563.field5471 = n26;
        n48 = 0;
        n5 = 0;
        n4 = 0;
        n3 = 0;
        n2 = 0;
        while (true) {
            if (n2 >= n9) break;
            n = class5563.method10282();
            if (n == 1) {
                n3 = n48 = class5562.method10294() + n3;
                n3 = n5 = class5562.method10294() + n3;
                n3 = n4 = class5562.method10294() + n3;
                this.field1856[n2] = n48;
                this.field1857[n2] = n5;
                this.field1883[n2] = n4;
            }
            if (n == 2) {
                n5 = n4;
                n3 = n4 = class5562.method10294() + n3;
                this.field1856[n2] = n48;
                this.field1857[n2] = n5;
                this.field1883[n2] = n4;
            }
            if (n == 3) {
                n48 = n4;
                n3 = n4 = class5562.method10294() + n3;
                this.field1856[n2] = n48;
                this.field1857[n2] = n5;
                this.field1883[n2] = n4;
            }
            if (n == 4) {
                int n49 = n48;
                n48 = n5;
                n5 = n49;
                n3 = n4 = class5562.method10294() + n3;
                this.field1856[n2] = n48;
                this.field1857[n2] = n5;
                this.field1883[n2] = n4;
            }
            ++n2;
        }
        class5562.field5471 = n38;
        class5563.field5471 = n39;
        class5564.field5471 = n40;
        class5565.field5471 = n41;
        class5566.field5471 = n42;
        class5567.field5471 = n43;
        n2 = 0;
        while (true) {
            block39: {
                block40: {
                    block38: {
                        if (n2 >= n10) break block38;
                        n = this.field1867[n2] & 0xFF;
                        if (n != 0) break block39;
                        break block40;
                    }
                    class5562.field5471 = n44;
                    n2 = class5562.method10282();
                    if (n2 != 0) {
                        new class205();
                        class5562.method10307();
                        class5562.method10307();
                        class5562.method10307();
                        class5562.method10440();
                    }
                    return;
                }
                this.field1868[n2] = (short)class5562.method10307();
                this.field1869[n2] = (short)class5562.method10307();
                this.field1873[n2] = (short)class5562.method10307();
            }
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ad")
    void method3906(byte[] byArray) {
        boolean bl;
        boolean bl2;
        block34: {
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            bl2 = false;
            bl = false;
            class556 class5562 = new class556(byArray);
            class556 class5563 = new class556(byArray);
            class556 class5564 = new class556(byArray);
            class556 class5565 = new class556(byArray);
            class556 class5566 = new class556(byArray);
            class5562.field5471 = byArray.length - 18;
            int n8 = class5562.method10307();
            int n9 = class5562.method10307();
            int n10 = class5562.method10282();
            int n11 = class5562.method10282();
            int n12 = class5562.method10282();
            int n13 = class5562.method10282();
            int n14 = class5562.method10282();
            int n15 = class5562.method10282();
            int n16 = class5562.method10307();
            int n17 = class5562.method10307();
            int n18 = class5562.method10307();
            int n19 = class5562.method10307();
            int n20 = n7 = 0;
            int n21 = n7 += n8;
            int n22 = n7 += n9;
            if (n12 == 255) {
                n7 += n9;
            }
            int n23 = n7;
            if (n14 == 1) {
                n7 += n9;
            }
            int n24 = n7;
            if (n11 == 1) {
                n7 += n9;
            }
            int n25 = n7;
            if (n15 == 1) {
                n7 += n8;
            }
            int n26 = n7;
            if (n13 == 1) {
                n7 += n9;
            }
            int n27 = n7;
            int n28 = n7 += n19;
            int n29 = n7 = n9 * 2 + n7;
            int n30 = n7 = n10 * 6 + n7;
            int n31 = n7 += n16;
            int n32 = n7 += n17;
            n7 += n18;
            this.field1879 = n8;
            this.field1855 = n9;
            this.field1866 = n10;
            this.field1852 = new int[n8];
            this.field1860 = new int[n8];
            this.field1854 = new int[n8];
            this.field1856 = new int[n9];
            this.field1857 = new int[n9];
            this.field1883 = new int[n9];
            if (n10 > 0) {
                this.field1867 = new byte[n10];
                this.field1868 = new short[n10];
                this.field1869 = new short[n10];
                this.field1873 = new short[n10];
            }
            if (n15 == 1) {
                this.field1871 = new int[n8];
            }
            if (n11 == 1) {
                this.field1882 = new byte[n9];
                this.field1862 = new byte[n9];
                this.field1889 = new short[n9];
            }
            if (n12 == 255) {
                this.field1859 = new byte[n9];
            } else {
                this.field1865 = (byte)n12;
            }
            if (n13 == 1) {
                this.field1861 = new byte[n9];
            }
            if (n14 == 1) {
                this.field1872 = new int[n9];
            }
            this.field1864 = new short[n9];
            class5562.field5471 = n20;
            class5563.field5471 = n30;
            class5564.field5471 = n31;
            class5565.field5471 = n32;
            class5566.field5471 = n25;
            int n33 = 0;
            int n34 = 0;
            int n35 = 0;
            int n36 = 0;
            while (true) {
                if (n36 >= n8) break;
                n6 = class5562.method10282();
                n5 = 0;
                if ((n6 & 1) != 0) {
                    n5 = class5563.method10294();
                }
                n4 = 0;
                if ((n6 & 2) != 0) {
                    n4 = class5564.method10294();
                }
                n3 = 0;
                if ((n6 & 4) != 0) {
                    n3 = class5565.method10294();
                }
                this.field1852[n36] = n33 + n5;
                this.field1860[n36] = n34 + n4;
                this.field1854[n36] = n35 + n3;
                n33 = this.field1852[n36];
                n34 = this.field1860[n36];
                n35 = this.field1854[n36];
                if (n15 == 1) {
                    this.field1871[n36] = class5566.method10282();
                }
                ++n36;
            }
            class5562.field5471 = n28;
            class5563.field5471 = n24;
            class5564.field5471 = n22;
            class5565.field5471 = n26;
            class5566.field5471 = n23;
            n36 = 0;
            while (true) {
                block35: {
                    block37: {
                        block36: {
                            if (n36 >= n9) break;
                            this.field1864[n36] = (short)class5562.method10307();
                            if (n11 != 1) break block35;
                            n6 = class5563.method10282();
                            if ((n6 & 1) == 1) {
                                this.field1882[n36] = 1;
                                bl2 = true;
                            } else {
                                this.field1882[n36] = 0;
                            }
                            if ((n6 & 2) != 2) break block36;
                            this.field1862[n36] = (byte)(n6 >> 2);
                            this.field1889[n36] = this.field1864[n36];
                            this.field1864[n36] = 127;
                            if (this.field1889[n36] == -1) break block35;
                            break block37;
                        }
                        this.field1862[n36] = -1;
                        this.field1889[n36] = -1;
                        break block35;
                    }
                    bl = true;
                }
                if (n12 == 255) {
                    this.field1859[n36] = class5564.method10524();
                }
                if (n13 == 1) {
                    this.field1861[n36] = class5565.method10524();
                }
                if (n14 == 1) {
                    this.field1872[n36] = class5566.method10282();
                }
                ++n36;
            }
            class5562.field5471 = n27;
            class5563.field5471 = n21;
            n36 = 0;
            n6 = 0;
            n5 = 0;
            n4 = 0;
            n3 = 0;
            while (true) {
                block39: {
                    block40: {
                        block38: {
                            if (n3 >= n9) break block38;
                            n2 = class5563.method10282();
                            if (n2 != 1) break block39;
                            break block40;
                        }
                        class5562.field5471 = n29;
                        for (n3 = 0; n3 < n10; ++n3) {
                            this.field1867[n3] = 0;
                            this.field1868[n3] = (short)class5562.method10307();
                            this.field1869[n3] = (short)class5562.method10307();
                            this.field1873[n3] = (short)class5562.method10307();
                        }
                        if (this.field1862 != null) {
                            break;
                        }
                        break block34;
                    }
                    n4 = n36 = class5562.method10294() + n4;
                    n4 = n6 = class5562.method10294() + n4;
                    n4 = n5 = class5562.method10294() + n4;
                    this.field1856[n3] = n36;
                    this.field1857[n3] = n6;
                    this.field1883[n3] = n5;
                }
                if (n2 == 2) {
                    n6 = n5;
                    n4 = n5 = class5562.method10294() + n4;
                    this.field1856[n3] = n36;
                    this.field1857[n3] = n6;
                    this.field1883[n3] = n5;
                }
                if (n2 == 3) {
                    n36 = n5;
                    n4 = n5 = class5562.method10294() + n4;
                    this.field1856[n3] = n36;
                    this.field1857[n3] = n6;
                    this.field1883[n3] = n5;
                }
                if (n2 == 4) {
                    n = n36;
                    n36 = n6;
                    n6 = n;
                    n4 = n5 = class5562.method10294() + n4;
                    this.field1856[n3] = n36;
                    this.field1857[n3] = n6;
                    this.field1883[n3] = n5;
                }
                ++n3;
            }
            n3 = 0;
            n2 = 0;
            while (true) {
                block42: {
                    block43: {
                        block41: {
                            if (n2 >= n9) break block41;
                            n = this.field1862[n2] & 0xFF;
                            if (n == 255) break block42;
                            break block43;
                        }
                        if (n3 != 0) break;
                        this.field1862 = null;
                        break;
                    }
                    if (this.field1856[n2] == (this.field1868[n] & 0xFFFF) && this.field1857[n2] == (this.field1869[n] & 0xFFFF) && this.field1883[n2] == (this.field1873[n] & 0xFFFF)) {
                        this.field1862[n2] = -1;
                    } else {
                        n3 = 1;
                    }
                }
                ++n2;
            }
        }
        if (!bl) {
            this.field1889 = null;
        }
        if (!bl2) {
            this.field1882 = null;
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lgx;I)I")
    final int method3898(class177 class1772, int n) {
        int n2 = -1;
        int n3 = class1772.field1852[n];
        int n4 = class1772.field1860[n];
        int n5 = class1772.field1854[n];
        for (int i = 0; i < this.field1879; ++i) {
            if (n3 != this.field1852[i] || n4 != this.field1860[i] || n5 != this.field1854[i]) {
                continue;
            }
            n2 = i;
            break;
        }
        if (n2 == -1) {
            this.field1852[this.field1879] = n3;
            this.field1860[this.field1879] = n4;
            this.field1854[this.field1879] = n5;
            if (class1772.field1871 != null) {
                this.field1871[this.field1879] = class1772.field1871[n];
            }
            if (class1772.field1875 != null) {
                this.field1875[this.field1879] = class1772.field1875[n];
                this.field1876[this.field1879] = class1772.field1876[n];
            }
            n2 = this.field1879++;
        }
        return n2;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="()Lgx;")
    public class177 method3899() {
        class177 class1772 = new class177();
        if (this.field1882 != null) {
            class1772.field1882 = new byte[this.field1855];
            for (int i = 0; i < this.field1855; ++i) {
                class1772.field1882[i] = this.field1882[i];
            }
        }
        class1772.field1879 = this.field1879;
        class1772.field1855 = this.field1855;
        class1772.field1866 = this.field1866;
        class1772.field1852 = this.field1852;
        class1772.field1860 = this.field1860;
        class1772.field1854 = this.field1854;
        class1772.field1856 = this.field1856;
        class1772.field1857 = this.field1857;
        class1772.field1883 = this.field1883;
        class1772.field1859 = this.field1859;
        class1772.field1861 = this.field1861;
        class1772.field1862 = this.field1862;
        class1772.field1864 = this.field1864;
        class1772.field1889 = this.field1889;
        class1772.field1865 = this.field1865;
        class1772.field1867 = this.field1867;
        class1772.field1868 = this.field1868;
        class1772.field1869 = this.field1869;
        class1772.field1873 = this.field1873;
        class1772.field1871 = this.field1871;
        class1772.field1872 = this.field1872;
        class1772.field1851 = this.field1851;
        class1772.field1874 = this.field1874;
        class1772.field1878 = this.field1878;
        class1772.field1877 = this.field1877;
        class1772.field1858 = this.field1858;
        class1772.field1881 = this.field1881;
        return class1772;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="([[IIIIZI)Lgx;")
    public class177 method3900(int[][] nArray, int n, int n2, int n3, boolean bl, int n4) {
        this.method3963();
        int n5 = n + this.field1884;
        int n6 = n + this.field1885;
        int n7 = n3 + this.field1887;
        int n8 = n3 + this.field1886;
        if (n5 >= 0 && n6 + 128 >> 7 < nArray.length && n7 >= 0 && n8 + 128 >> 7 < nArray[0].length) {
            n6 = n6 + 127 >> 7;
            n8 = n8 + 127 >> 7;
            if (n2 == nArray[n5 >>= 7][n7 >>= 7] && n2 == nArray[n6][n7] && n2 == nArray[n5][n8] && n2 == nArray[n6][n8]) {
                return this;
            }
            class177 class1772 = new class177(this, true, true, true, true);
            class1772.field1860 = new int[class1772.field1879];
            if (n4 != 0) {
                for (int i = 0; i < class1772.field1879; ++i) {
                    int n9 = (-this.field1860[i] << 16) / this.field2116;
                    if (n9 >= n4) {
                        class1772.field1860[i] = this.field1860[i];
                        continue;
                    }
                    int n10 = n + this.field1852[i];
                    int n11 = n3 + this.field1854[i];
                    int n12 = n10 & 0x7F;
                    int n13 = n11 & 0x7F;
                    int n14 = n10 >> 7;
                    int n15 = n11 >> 7;
                    int n16 = nArray[n14][n15] * (128 - n12) + nArray[n14 + 1][n15] * n12 >> 7;
                    int n17 = nArray[n14][n15 + 1] * (128 - n12) + n12 * nArray[n14 + 1][n15 + 1] >> 7;
                    int n18 = n16 * (128 - n13) + n17 * n13 >> 7;
                    class1772.field1860[i] = (n4 - n9) * (n18 - n2) / n4 + this.field1860[i];
                }
            } else {
                for (int i = 0; i < class1772.field1879; ++i) {
                    int n19 = n + this.field1852[i];
                    int n20 = n3 + this.field1854[i];
                    int n21 = n19 & 0x7F;
                    int n22 = n20 & 0x7F;
                    int n23 = n19 >> 7;
                    int n24 = n20 >> 7;
                    int n25 = nArray[n23][n24] * (128 - n21) + nArray[n23 + 1][n24] * n21 >> 7;
                    int n26 = nArray[n23][n24 + 1] * (128 - n21) + n21 * nArray[n23 + 1][n24 + 1] >> 7;
                    int n27 = n25 * (128 - n22) + n26 * n22 >> 7;
                    class1772.field1860[i] = n27 + this.field1860[i] - n2;
                }
            }
            class1772.method3922();
            return class1772;
        }
        return this;
    }

    @ObfuscatedName(value="at")
    public int method3942(int n, int n2, int n3) {
        for (int i = 0; i < this.field1879; ++i) {
            if (this.field1852[i] != n || n2 != this.field1860[i] || n3 != this.field1854[i]) continue;
            return i;
        }
        this.field1852[this.field1879] = n;
        this.field1860[this.field1879] = n2;
        this.field1854[this.field1879] = n3;
        return this.field1879++;
    }

    @ObfuscatedName(value="ac")
    public int method3954(int n, int n2, int n3, byte by, byte by2, short s, short s2) {
        this.field1856[this.field1855] = n;
        this.field1857[this.field1855] = n2;
        this.field1883[this.field1855] = n3;
        this.field1882[this.field1855] = by;
        this.field1862[this.field1855] = by2;
        this.field1864[this.field1855] = s;
        this.field1889[this.field1855] = s2;
        return this.field1855++;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="au")
    void method3903() {
        int n;
        int n2;
        int n3;
        int[] nArray;
        block7: {
            if (this.field1871 == null) break block7;
            nArray = new int[256];
            n3 = 0;
            n2 = 0;
            while (true) {
                block9: {
                    block10: {
                        block8: {
                            if (n2 >= this.field1879) break block8;
                            int n4 = n = this.field1871[n2];
                            nArray[n4] = nArray[n4] + 1;
                            if (n <= n3) break block9;
                            break block10;
                        }
                        this.field1851 = new int[n3 + 1][];
                        for (n2 = 0; n2 <= n3; ++n2) {
                            this.field1851[n2] = new int[nArray[n2]];
                            nArray[n2] = 0;
                        }
                        n2 = 0;
                        while (n2 < this.field1879) {
                            int n5 = n = this.field1871[n2];
                            int n6 = nArray[n5];
                            nArray[n5] = n6 + 1;
                            this.field1851[n][n6] = n2++;
                        }
                        this.field1871 = null;
                        break;
                    }
                    n3 = n;
                }
                ++n2;
            }
        }
        if (this.field1872 == null) return;
        nArray = new int[256];
        n3 = 0;
        n2 = 0;
        while (true) {
            block12: {
                block13: {
                    block11: {
                        if (n2 >= this.field1855) break block11;
                        int n7 = n = this.field1872[n2];
                        nArray[n7] = nArray[n7] + 1;
                        if (n <= n3) break block12;
                        break block13;
                    }
                    this.field1874 = new int[n3 + 1][];
                    for (n2 = 0; n2 <= n3; ++n2) {
                        this.field1874[n2] = new int[nArray[n2]];
                        nArray[n2] = 0;
                    }
                    n2 = 0;
                    while (true) {
                        if (n2 >= this.field1855) {
                            this.field1872 = null;
                            return;
                        }
                        int n8 = n = this.field1872[n2];
                        int n9 = nArray[n8];
                        nArray[n8] = n9 + 1;
                        this.field1874[n][n9] = n2++;
                    }
                }
                n3 = n;
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="aa")
    public void method3904() {
        int n = 0;
        while (true) {
            if (n >= this.field1879) {
                this.method3922();
                return;
            }
            int n2 = this.field1852[n];
            this.field1852[n] = this.field1854[n];
            this.field1854[n] = -n2;
            ++n;
        }
    }

    @ObfuscatedName(value="ak")
    public void method3905() {
        int n = 0;
        while (true) {
            if (n >= this.field1879) {
                this.method3922();
                return;
            }
            this.field1852[n] = -this.field1852[n];
            this.field1854[n] = -this.field1854[n];
            ++n;
        }
    }

    @ObfuscatedName(value="al")
    public void method3894() {
        int n = 0;
        while (true) {
            if (n >= this.field1879) {
                this.method3922();
                return;
            }
            int n2 = this.field1854[n];
            this.field1854[n] = this.field1852[n];
            this.field1852[n] = -n2;
            ++n;
        }
    }

    @ObfuscatedName(value="av")
    public void method3907(int n) {
        int n2 = field1891[n];
        int n3 = field1892[n];
        int n4 = 0;
        while (true) {
            if (n4 >= this.field1879) {
                this.method3922();
                return;
            }
            int n5 = n2 * this.field1854[n4] + n3 * this.field1852[n4] >> 16;
            this.field1854[n4] = n3 * this.field1854[n4] - n2 * this.field1852[n4] >> 16;
            this.field1852[n4] = n5;
            ++n4;
        }
    }

    @ObfuscatedName(value="ag")
    public void method3896(int n, int n2, int n3) {
        int n4 = 0;
        while (true) {
            if (n4 >= this.field1879) {
                this.method3922();
                return;
            }
            int n5 = n4;
            this.field1852[n5] = this.field1852[n5] + n;
            int n6 = n4;
            this.field1860[n6] = this.field1860[n6] + n2;
            int n7 = n4++;
            this.field1854[n7] = this.field1854[n7] + n3;
        }
    }

    @ObfuscatedName(value="aw")
    public void method3909(short s, short s2) {
        int n = 0;
        while (n < this.field1855) {
            if (this.field1864[n] == s) {
                this.field1864[n] = s2;
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ai")
    public void method3961(short s, short s2) {
        if (this.field1889 == null) {
            return;
        }
        int n = 0;
        while (n < this.field1855) {
            if (this.field1889[n] == s) {
                this.field1889[n] = s2;
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ar")
    public void method3911() {
        int n;
        for (n = 0; n < this.field1879; ++n) {
            this.field1854[n] = -this.field1854[n];
        }
        n = 0;
        while (true) {
            if (n >= this.field1855) {
                this.method3922();
                return;
            }
            int n2 = this.field1856[n];
            this.field1856[n] = this.field1883[n];
            this.field1883[n] = n2;
            ++n;
        }
    }

    @ObfuscatedName(value="am")
    public void method3912(int n, int n2, int n3) {
        int n4 = 0;
        while (true) {
            if (n4 >= this.field1879) {
                this.method3922();
                return;
            }
            this.field1852[n4] = this.field1852[n4] * n / 128;
            this.field1860[n4] = n2 * this.field1860[n4] / 128;
            this.field1854[n4] = n3 * this.field1854[n4] / 128;
            ++n4;
        }
    }

    @ObfuscatedName(value="ap")
    public void method3968() {
        int n;
        if (this.field1878 != null) {
            return;
        }
        this.field1878 = new class200[this.field1879];
        for (n = 0; n < this.field1879; ++n) {
            this.field1878[n] = new class200();
        }
        n = 0;
        block1: while (n < this.field1855) {
            int n2 = this.field1856[n];
            int n3 = this.field1857[n];
            int n4 = this.field1883[n];
            int n5 = this.field1852[n3] - this.field1852[n2];
            int n6 = this.field1860[n3] - this.field1860[n2];
            int n7 = this.field1854[n3] - this.field1854[n2];
            int n8 = this.field1852[n4] - this.field1852[n2];
            int n9 = this.field1860[n4] - this.field1860[n2];
            int n10 = this.field1854[n4] - this.field1854[n2];
            int n11 = n6 * n10 - n9 * n7;
            int n12 = n7 * n8 - n10 * n5;
            int n13 = n5 * n9 - n8 * n6;
            while (true) {
                if (n11 <= 8192 && n12 <= 8192 && n13 <= 8192 && n11 >= -8192 && n12 >= -8192 && n13 >= -8192) {
                    Object object;
                    int n14 = (int)Math.sqrt(n11 * n11 + n12 * n12 + n13 * n13);
                    if (n14 <= 0) {
                        n14 = 1;
                    }
                    n11 = n11 * 256 / n14;
                    n12 = n12 * 256 / n14;
                    n13 = n13 * 256 / n14;
                    byte by = this.field1882 == null ? (byte)0 : this.field1882[n];
                    if (by != 0) {
                        if (by == 1) {
                            if (this.field1877 == null) {
                                this.field1877 = new class191[this.field1855];
                            }
                            this.field1877[n] = new class191();
                            object = this.field1877[n];
                            ((class191)object).field2119 = n11;
                            ((class191)object).field2118 = n12;
                            ((class191)object).field2117 = n13;
                        }
                    } else {
                        object = this.field1878[n2];
                        ((class200)object).field2278 += n11;
                        ((class200)object).field2276 += n12;
                        ((class200)object).field2277 += n13;
                        ++((class200)object).field2275;
                        object = this.field1878[n3];
                        ((class200)object).field2278 += n11;
                        ((class200)object).field2276 += n12;
                        ((class200)object).field2277 += n13;
                        ++((class200)object).field2275;
                        object = this.field1878[n4];
                        ((class200)object).field2278 += n11;
                        ((class200)object).field2276 += n12;
                        ((class200)object).field2277 += n13;
                        ++((class200)object).field2275;
                    }
                    ++n;
                    continue block1;
                }
                n11 >>= 1;
                n12 >>= 1;
                n13 >>= 1;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="ab")
    void method3922() {
        this.field1878 = null;
        this.field1848 = null;
        this.field1877 = null;
        this.field1880 = false;
    }

    @ObfuscatedName(value="aj")
    void method3963() {
        if (this.field1880) {
            return;
        }
        this.field2116 = 0;
        this.field1863 = 0;
        this.field1884 = 999999;
        this.field1885 = -999999;
        this.field1886 = -99999;
        this.field1887 = 99999;
        int n = 0;
        while (true) {
            if (n >= this.field1879) {
                this.field1880 = true;
                return;
            }
            int n2 = this.field1852[n];
            int n3 = this.field1860[n];
            int n4 = this.field1854[n];
            if (n2 < this.field1884) {
                this.field1884 = n2;
            }
            if (n2 > this.field1885) {
                this.field1885 = n2;
            }
            if (n4 < this.field1887) {
                this.field1887 = n4;
            }
            if (n4 > this.field1886) {
                this.field1886 = n4;
            }
            if (-n3 > this.field2116) {
                this.field2116 = -n3;
            }
            if (n3 > this.field1863) {
                this.field1863 = n3;
            }
            ++n;
        }
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(IIIII)Lhv;")
    public final class198 method3917(int var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        this.method3968();
        var6_6 = (int)Math.sqrt(var5_5 * var5_5 + var3_3 * var3_3 + var4_4 * var4_4);
        var7_7 = var6_6 * var2_2 >> 8;
        var8_8 = new class198();
        var8_8.field2199 = new int[this.field1855];
        var8_8.field2200 = new int[this.field1855];
        var8_8.field2188 = new int[this.field1855];
        if (this.field1866 <= 0 || this.field1862 == null) ** GOTO lbl28
        var9_9 = new int[this.field1866];
        var10_10 = 0;
        while (true) {
            block27: {
                if (var10_10 < this.field1855) break block27;
                var8_8.field2207 = 0;
                var10_10 = 0;
                while (true) {
                    block28: {
                        if (var10_10 < this.field1866) break block28;
                        var8_8.field2208 = new int[var8_8.field2207];
                        var8_8.field2241 = new int[var8_8.field2207];
                        var8_8.field2210 = new int[var8_8.field2207];
                        var10_10 = 0;
                        var11_11 = 0;
                        while (true) {
                            block29: {
                                if (var11_11 < this.field1866) break block29;
                                var8_8.field2237 = new byte[this.field1855];
                                var11_11 = 0;
                                while (true) {
                                    block30: {
                                        if (var11_11 < this.field1855) break block30;
lbl28:
                                        // 2 sources

                                        var16_12 = 0;
                                        while (true) {
                                            if (var16_12 >= this.field1855) {
                                                this.method3903();
                                                var8_8.field2191 = this.field1879;
                                                var8_8.field2192 = this.field1852;
                                                var8_8.field2202 = this.field1860;
                                                var8_8.field2194 = this.field1854;
                                                var8_8.field2195 = this.field1855;
                                                var8_8.field2184 = this.field1856;
                                                var8_8.field2197 = this.field1857;
                                                var8_8.field2198 = this.field1883;
                                                var8_8.field2217 = this.field1859;
                                                var8_8.field2203 = this.field1861;
                                                var8_8.field2212 = this.field1865;
                                                var8_8.field2211 = this.field1851;
                                                var8_8.field2253 = this.field1874;
                                                var8_8.field2205 = this.field1889;
                                                var8_8.field2260 = this.field1875;
                                                var8_8.field2214 = this.field1876;
                                                return var8_8;
                                            }
                                            var10_10 = this.field1882 == null ? 0 : this.field1882[var16_12];
                                            var11_11 = this.field1861 == null ? 0 : this.field1861[var16_12];
                                            var12_13 = this.field1889 == null ? -1 : this.field1889[var16_12];
                                            if (var11_11 == -2) {
                                                var10_10 = 3;
                                            }
                                            if (var11_11 == -1) {
                                                var10_10 = 2;
                                            }
                                            if (var12_13 != -1) {
                                                if (var10_10 != 0) {
                                                    if (var10_10 != 1) {
                                                        var8_8.field2188[var16_12] = -2;
                                                    } else {
                                                        var13_14 = this.field1877[var16_12];
                                                        var14_15 = (var4_4 * var13_14.field2118 + var5_5 * var13_14.field2117 + var3_3 * var13_14.field2119) / (var7_7 / 2 + var7_7) + var1_1;
                                                        var8_8.field2199[var16_12] = class177.method3988(var14_15);
                                                        var8_8.field2188[var16_12] = -1;
                                                    }
                                                } else {
                                                    var13_14 = this.field1848 != null && this.field1848[this.field1856[var16_12]] != null ? this.field1848[this.field1856[var16_12]] : this.field1878[this.field1856[var16_12]];
                                                    var14_15 = (var4_4 * var13_14.field2276 + var5_5 * var13_14.field2277 + var3_3 * var13_14.field2278) / (var7_7 * var13_14.field2275) + var1_1;
                                                    var8_8.field2199[var16_12] = class177.method3988(var14_15);
                                                    var13_14 = this.field1848 != null && this.field1848[this.field1857[var16_12]] != null ? this.field1848[this.field1857[var16_12]] : this.field1878[this.field1857[var16_12]];
                                                    var14_15 = (var4_4 * var13_14.field2276 + var5_5 * var13_14.field2277 + var3_3 * var13_14.field2278) / (var7_7 * var13_14.field2275) + var1_1;
                                                    var8_8.field2200[var16_12] = class177.method3988(var14_15);
                                                    var13_14 = this.field1848 != null && this.field1848[this.field1883[var16_12]] != null ? this.field1848[this.field1883[var16_12]] : this.field1878[this.field1883[var16_12]];
                                                    var14_15 = (var4_4 * var13_14.field2276 + var5_5 * var13_14.field2277 + var3_3 * var13_14.field2278) / (var7_7 * var13_14.field2275) + var1_1;
                                                    var8_8.field2188[var16_12] = class177.method3988(var14_15);
                                                }
                                            } else if (var10_10 != 0) {
                                                if (var10_10 != 1) {
                                                    if (var10_10 != 3) {
                                                        var8_8.field2188[var16_12] = -2;
                                                    } else {
                                                        var8_8.field2199[var16_12] = 128;
                                                        var8_8.field2188[var16_12] = -1;
                                                    }
                                                } else {
                                                    var13_14 = this.field1877[var16_12];
                                                    var14_15 = (var4_4 * var13_14.field2118 + var5_5 * var13_14.field2117 + var3_3 * var13_14.field2119) / (var7_7 / 2 + var7_7) + var1_1;
                                                    var8_8.field2199[var16_12] = class177.method3915(this.field1864[var16_12] & 65535, var14_15);
                                                    var8_8.field2188[var16_12] = -1;
                                                }
                                            } else {
                                                var15_16 = this.field1864[var16_12] & 65535;
                                                var13_14 = this.field1848 != null && this.field1848[this.field1856[var16_12]] != null ? this.field1848[this.field1856[var16_12]] : this.field1878[this.field1856[var16_12]];
                                                var14_15 = (var4_4 * var13_14.field2276 + var5_5 * var13_14.field2277 + var3_3 * var13_14.field2278) / (var7_7 * var13_14.field2275) + var1_1;
                                                var8_8.field2199[var16_12] = class177.method3915(var15_16, var14_15);
                                                var13_14 = this.field1848 != null && this.field1848[this.field1857[var16_12]] != null ? this.field1848[this.field1857[var16_12]] : this.field1878[this.field1857[var16_12]];
                                                var14_15 = (var4_4 * var13_14.field2276 + var5_5 * var13_14.field2277 + var3_3 * var13_14.field2278) / (var7_7 * var13_14.field2275) + var1_1;
                                                var8_8.field2200[var16_12] = class177.method3915(var15_16, var14_15);
                                                var13_14 = this.field1848 != null && this.field1848[this.field1883[var16_12]] != null ? this.field1848[this.field1883[var16_12]] : this.field1878[this.field1883[var16_12]];
                                                var14_15 = (var4_4 * var13_14.field2276 + var5_5 * var13_14.field2277 + var3_3 * var13_14.field2278) / (var7_7 * var13_14.field2275) + var1_1;
                                                var8_8.field2188[var16_12] = class177.method3915(var15_16, var14_15);
                                            }
                                            ++var16_12;
                                        }
                                    }
                                    var8_8.field2237[var11_11] = this.field1862[var11_11] != -1 ? (int)var9_9[this.field1862[var11_11] & 255] : -1;
                                    ++var11_11;
                                }
                            }
                            if (var9_9[var11_11] <= 0 || this.field1867[var11_11] != 0) {
                                var9_9[var11_11] = -1;
                            } else {
                                var8_8.field2208[var10_10] = this.field1868[var11_11] & 65535;
                                var8_8.field2241[var10_10] = this.field1869[var11_11] & 65535;
                                var8_8.field2210[var10_10] = this.field1873[var11_11] & 65535;
                                var9_9[var11_11] = var10_10++;
                            }
                            ++var11_11;
                        }
                    }
                    if (var9_9[var10_10] > 0 && this.field1867[var10_10] == 0) {
                        ++var8_8.field2207;
                    }
                    ++var10_10;
                }
            }
            if (this.field1862[var10_10] != -1) {
                v0 = this.field1862[var10_10] & 255;
                var9_9[v0] = var9_9[v0] + 1;
            }
            ++var10_10;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;II)Lgx;")
    public static class177 method3919(class391 class3912, int n, int n2) {
        byte[] byArray = class3912.method7790(n, n2);
        if (byArray == null) {
            return null;
        }
        return new class177(byArray);
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(Lgx;Lgx;IIIZ)V")
    static void method3916(class177 class1772, class177 class1773, int n, int n2, int n3, boolean bl) {
        class1772.method3963();
        class1772.method3968();
        class1773.method3963();
        class1773.method3968();
        ++field1890;
        int n4 = 0;
        int[] nArray = class1773.field1852;
        int n5 = class1773.field1879;
        int n6 = 0;
        while (true) {
            int n7;
            int n8;
            int n9;
            if (n6 >= class1772.field1879) {
                if (n4 >= 3 && bl) {
                    n6 = 0;
                    while (true) {
                        if (n6 >= class1772.field1855) {
                            n6 = 0;
                            while (true) {
                                if (n6 >= class1773.field1855) {
                                    return;
                                }
                                if (field1890 == field1853[class1773.field1856[n6]] && field1890 == field1853[class1773.field1857[n6]] && field1890 == field1853[class1773.field1883[n6]]) {
                                    if (class1773.field1882 == null) {
                                        class1773.field1882 = new byte[class1773.field1855];
                                    }
                                    class1773.field1882[n6] = 2;
                                }
                                ++n6;
                            }
                        }
                        if (field1888[class1772.field1856[n6]] == field1890 && field1888[class1772.field1857[n6]] == field1890 && field1888[class1772.field1883[n6]] == field1890) {
                            if (class1772.field1882 == null) {
                                class1772.field1882 = new byte[class1772.field1855];
                            }
                            class1772.field1882[n6] = 2;
                        }
                        ++n6;
                    }
                }
                return;
            }
            class200 class2002 = class1772.field1878[n6];
            if (class2002.field2275 != 0 && (n9 = class1772.field1860[n6] - n2) <= class1773.field1863 && (n8 = class1772.field1852[n6] - n) >= class1773.field1884 && n8 <= class1773.field1885 && (n7 = class1772.field1854[n6] - n3) >= class1773.field1887 && n7 <= class1773.field1886) {
                for (int i = 0; i < n5; ++i) {
                    class200 class2003;
                    class200 class2004;
                    class200 class2005 = class1773.field1878[i];
                    if (n8 != nArray[i] || n7 != class1773.field1854[i] || n9 != class1773.field1860[i] || class2005.field2275 == 0) continue;
                    if (class1772.field1848 == null) {
                        class1772.field1848 = new class200[class1772.field1879];
                    }
                    if (class1773.field1848 == null) {
                        class1773.field1848 = new class200[n5];
                    }
                    if ((class2004 = class1772.field1848[n6]) == null) {
                        class2004 = class1772.field1848[n6] = new class200(class2002);
                    }
                    if ((class2003 = class1773.field1848[i]) == null) {
                        class2003 = class1773.field1848[i] = new class200(class2005);
                    }
                    class2004.field2278 += class2005.field2278;
                    class2004.field2276 += class2005.field2276;
                    class2004.field2277 += class2005.field2277;
                    class2004.field2275 += class2005.field2275;
                    class2003.field2278 += class2002.field2278;
                    class2003.field2276 += class2002.field2276;
                    class2003.field2277 += class2002.field2277;
                    class2003.field2275 += class2002.field2275;
                    ++n4;
                    class177.field1888[n6] = field1890;
                    class177.field1853[i] = field1890;
                }
            }
            ++n6;
        }
    }

    @ObfuscatedName(value="bw")
    static final int method3915(int n, int n2) {
        if ((n2 = (n & 0x7F) * n2 >> 7) < 2) {
            n2 = 2;
        } else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }

    @ObfuscatedName(value="bb")
    static final int method3988(int n) {
        if (n < 2) {
            n = 2;
        } else if (n > 126) {
            n = 126;
        }
        return n;
    }
}

