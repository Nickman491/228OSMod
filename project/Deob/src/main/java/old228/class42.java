package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bq")
public class class42 {
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=323263577)
    public static int field257;
    @ObfuscatedName(value="an")
    public static boolean field264;
    @ObfuscatedName(value="ax")
    static ScheduledExecutorService field255;
    @ObfuscatedName(value="fb")
    @ObfuscatedSignature(descriptor="Lok;")
    static class388 field276;
    @ObfuscatedName(value="uo")
    @ObfuscatedGetter(intValue=1930587711)
    static int field275;
    @ObfuscatedName(value="af")
    protected int[] field262;
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lbn;")
    class49 field260;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=1358623715)
    int field261 = 32;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(longValue=-9098802176499279333L)
    long field254 = class37.method724();
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=-1048911801)
    int field267;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=-474399613)
    int field263;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=1729245287)
    int field265;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(longValue=-3167251829314267789L)
    long field266 = 0L;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=1007287475)
    int field259 = 0;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=310071645)
    int field268 = 0;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=905456165)
    int field269 = 0;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(longValue=205761756168129153L)
    long field270 = 0L;
    @ObfuscatedName(value="aj")
    boolean field271 = true;
    @ObfuscatedName(value="bd")
    @ObfuscatedGetter(intValue=940450061)
    int field272 = 0;
    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="[Lbn;")
    class49[] field273 = new class49[8];
    @ObfuscatedName(value="bz")
    @ObfuscatedSignature(descriptor="[Lbn;")
    class49[] field274 = new class49[8];

    protected class42() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-934813238")
    protected void vmethod834() throws Exception {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="2008767536")
    protected void vmethod854(int n) throws Exception {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1560665771")
    protected int vmethod815() throws Exception {
        return this.field267;
    }

    @ObfuscatedName(value="ao")
    protected void vmethod816() throws Exception {
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="0")
    protected void vmethod817() {
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-376770394")
    protected void vmethod818() throws Exception {
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(Lbn;I)V", garbageValue="238570419")
    public final synchronized void method849(class49 class4910) {
        this.field260 = class4910;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="61")
    public final synchronized void method806() {
        if (this.field262 == null) {
            return;
        }
        long l = class37.method724();
        try {
            int n;
            int n2;
            if (0L != this.field266) {
                if (l < this.field266) {
                    return;
                }
                this.vmethod854(this.field267);
                this.field266 = 0L;
                this.field271 = true;
            }
            if (this.field269 - (n2 = this.vmethod815()) > this.field259) {
                this.field259 = this.field269 - n2;
            }
            if ((n = this.field265 + this.field263) + 256 > 16384) {
                n = 16128;
            }
            if (n + 256 > this.field267) {
                this.field267 += 1024;
                if (this.field267 > 16384) {
                    this.field267 = 16384;
                }
                this.vmethod817();
                this.vmethod854(this.field267);
                n2 = 0;
                this.field271 = true;
                if (n + 256 > this.field267) {
                    n = this.field267 - 256;
                    this.field265 = n - this.field263;
                }
            }
            while (n2 < n) {
                this.method842(this.field262, 256);
                this.vmethod816();
                n2 += 256;
            }
            if (l > this.field270) {
                if (!this.field271) {
                    if (this.field259 == 0 && this.field268 == 0) {
                        this.vmethod817();
                        this.field266 = 2000L + l;
                        return;
                    }
                    this.field265 = Math.min(this.field268, this.field259);
                    this.field268 = this.field259;
                } else {
                    this.field271 = false;
                }
                this.field259 = 0;
                this.field270 = 2000L + l;
            }
            this.field269 = n2;
        }
        catch (Exception exception) {
            this.vmethod817();
            this.field266 = 2000L + l;
        }
        try {
            if (l > 500000L + this.field254) {
                l = this.field254;
            }
            while (l > this.field254 + 5000L) {
                this.method810(256);
                this.field254 += (long)(256000 / field257);
            }
        }
        catch (Exception exception) {
            this.field254 = l;
        }
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1874859943")
    public final void method807() {
        this.field271 = true;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-19562")
    public final synchronized void method808() {
        this.field271 = true;
        try {
            this.vmethod818();
        }
        catch (Exception exception) {
            this.vmethod817();
            this.field266 = class37.method724() + 2000L;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-82")
    public final synchronized void method809() {
        block2: {
            if (class493.field5096 == null) break block2;
            boolean bl = true;
            int n = 0;
            while (true) {
                block4: {
                    block5: {
                        block3: {
                            if (n >= 2) break block3;
                            if (this != class493.field5096.field289[n]) break block4;
                            break block5;
                        }
                        if (!bl) break;
                        field255.shutdownNow();
                        field255 = null;
                        class493.field5096 = null;
                        break;
                    }
                    class493.field5096.field289[n] = null;
                }
                if (class493.field5096.field289[n] != null) {
                    bl = false;
                }
                ++n;
            }
        }
        this.vmethod817();
        this.field262 = null;
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-4852237")
    final void method810(int n) {
        this.field272 -= n;
        if (this.field272 < 0) {
            this.field272 = 0;
        }
        if (this.field260 != null) {
            this.field260.vmethod6902(n);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="bw")
    final void method842(int[] nArray, int n) {
        block21: {
            class49 class4910;
            int n2;
            int n3 = n;
            if (field264) {
                n3 <<= 1;
            }
            class451.method8898(nArray, 0, n3);
            this.field272 -= n;
            if (this.field260 == null || this.field272 > 0) break block21;
            this.field272 += field257 >> 4;
            class220.method4965(this.field260);
            this.method812(this.field260, this.field260.vmethod1079());
            int n4 = 0;
            int n5 = 255;
            int n6 = 7;
            block0: while (n5 != 0) {
                int n7;
                int n8;
                if (n6 < 0) {
                    n8 = n6 & 3;
                    n7 = -(n6 >> 2);
                } else {
                    n8 = n6;
                    n7 = 0;
                }
                n2 = n5 >>> n8 & 0x11111111;
                while (true) {
                    block22: {
                        if (n2 == 0) {
                            --n6;
                            continue block0;
                        }
                        if ((n2 & 1) == 0) break block22;
                        n5 &= ~(1 << n8);
                        class4910 = null;
                        class49 class4911 = this.field273[n8];
                        while (class4911 != null) {
                            block23: {
                                class62 class622 = class4911.field324;
                                if (class622 != null && class622.field439 > n7) {
                                    n5 |= 1 << n8;
                                    class4910 = class4911;
                                    class4911 = class4911.field326;
                                    continue;
                                }
                                class4911.field325 = true;
                                int n9 = class4911.vmethod6927();
                                n4 += n9;
                                if (class622 != null) {
                                    class622.field439 += n9;
                                }
                                if (n4 < this.field261) break block23;
                                break block0;
                            }
                            class49 class4912 = class4911.vmethod6899();
                            if (class4912 != null) {
                                int n10 = class4911.field323;
                                while (class4912 != null) {
                                    this.method812(class4912, n10 * class4912.vmethod1079() >> 8);
                                    class4912 = class4911.vmethod6900();
                                }
                            }
                            class49 class4913 = class4911.field326;
                            class4911.field326 = null;
                            if (class4910 == null) {
                                this.field273[n8] = class4913;
                            } else {
                                class4910.field326 = class4913;
                            }
                            if (class4913 == null) {
                                this.field274[n8] = class4910;
                            }
                            class4911 = class4913;
                        }
                    }
                    n8 += 4;
                    ++n7;
                    n2 >>>= 4;
                }
            }
            for (n6 = 0; n6 < 8; ++n6) {
                class49 class4914 = this.field273[n6];
                class49[] class49Array = this.field273;
                n2 = n6;
                this.field274[n6] = null;
                class49Array[n2] = null;
                while (class4914 != null) {
                    class4910 = class4914.field326;
                    class4914.field326 = null;
                    class4914 = class4910;
                }
            }
        }
        if (this.field272 < 0) {
            this.field272 = 0;
        }
        if (this.field260 != null) {
            this.field260.vmethod6908(nArray, 0, n);
        }
        this.field254 = class37.method724();
    }

    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(Lbn;II)V", garbageValue="705422506")
    final void method812(class49 class4910, int n) {
        int n2 = n >> 5;
        class49 class4911 = this.field274[n2];
        if (class4911 == null) {
            this.field273[n2] = class4910;
        } else {
            class4911.field326 = class4910;
        }
        this.field274[n2] = class4910;
        class4910.field323 = n;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;I)Ljava/lang/String;", garbageValue="817321018")
    public static String method857(CharSequence charSequence) {
        int n = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(n);
        int n2 = 0;
        while (n2 < n) {
            char c = charSequence.charAt(n2);
            if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == '.' || c == '-' || c == '*' || c == '_')) {
                if (c == ' ') {
                    stringBuilder.append('+');
                } else {
                    byte by = class232.method5132(c);
                    stringBuilder.append('%');
                    int n3 = by >> 4 & 0xF;
                    if (n3 >= 10) {
                        stringBuilder.append((char)(n3 + 55));
                    } else {
                        stringBuilder.append((char)(n3 + 48));
                    }
                    n3 = by & 0xF;
                    if (n3 >= 10) {
                        stringBuilder.append((char)(n3 + 55));
                    } else {
                        stringBuilder.append((char)(n3 + 48));
                    }
                }
            } else {
                stringBuilder.append(c);
            }
            ++n2;
        }
        return stringBuilder.toString();
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="-1488118055")
    static final int method804(int n, int n2) {
        int n3 = n + n2 * 57;
        n3 = n3 << 13 ^ n3;
        int n4 = n3 * (n3 * n3 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
        return n4 >> 19 & 0xFF;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Ldz;IIIIIIIILku;I)V", garbageValue="-1915575984")
    static final void method823(class103 class1032, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, class270 class2702) {
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        ObjectDef class2622 = class142.method3512(n5);
        int n16 = n15 = n8 >= 0 ? n8 : class2622.field2815;
        if (n6 != 1 && n6 != 3) {
            n14 = class2622.field2804;
            n13 = class2622.field2805;
        } else {
            n14 = class2622.field2805;
            n13 = class2622.field2804;
        }
        if (n3 + n14 > class1032.field1322) {
            n12 = n3;
            n11 = n3 + 1;
        } else {
            n12 = n3 + (n14 >> 1);
            n11 = n3 + (n14 + 1 >> 1);
        }
        if (n13 + n4 > class1032.field1323) {
            n10 = n4;
            n9 = n4 + 1;
        } else {
            n10 = (n13 >> 1) + n4;
            n9 = n4 + (n13 + 1 >> 1);
        }
        int[][] nArray = class1032.field1328[n2];
        int n17 = nArray[n11][n9] + nArray[n12][n9] + nArray[n12][n10] + nArray[n11][n10] >> 2;
        int n18 = (n3 << 7) + (n14 << 6);
        int n19 = (n4 << 7) + (n13 << 6);
        class187 class1872 = class1032.field1319;
        long l = class79.method2452(n3, n4, 2, class2622.field2833 == 0, n5, class1032.field1320);
        int n20 = (n6 << 6) + n7;
        if (class2622.field2829 == 1) {
            n20 += 256;
        }
        if (n7 != 22) {
            if (n7 != 10 && n7 != 11) {
                if (n7 < 12) {
                    if (n7 != 0) {
                        if (n7 != 1) {
                            class190 class1902;
                            class190 class1903;
                            if (n7 != 2) {
                                if (n7 != 3) {
                                    if (n7 != 9) {
                                        if (n7 != 4) {
                                            if (n7 != 5) {
                                                if (n7 != 6) {
                                                    if (n7 != 7) {
                                                        class190 class1904;
                                                        class190 class1905;
                                                        if (n7 != 8) {
                                                            return;
                                                        }
                                                        int n21 = 8;
                                                        long l2 = class1872.method4395(n, n3, n4);
                                                        if (l2 != 0L) {
                                                            n21 = class142.method3512((int)class360.method7406((long)l2)).field2813 / 2;
                                                        }
                                                        int n22 = n6 + 2 & 3;
                                                        if (n15 == -1 && class2622.field2837 == null) {
                                                            class1905 = class2622.method5534(4, n6 + 4, nArray, n18, n17, n19);
                                                            class1904 = class2622.method5534(4, n22 + 4, nArray, n18, n17, n19);
                                                        } else {
                                                            class1905 = new class82(class1032, n5, 4, n6 + 4, n2, n3, n4, n15, class2622.field2839, null);
                                                            class1904 = new class82(class1032, n5, 4, n22 + 4, n2, n3, n4, n15, class2622.field2839, null);
                                                        }
                                                        class1872.method4183(n, n3, n4, n17, class1905, class1904, 256, n6, class84.field1037[n6] * n21, class84.field1038[n6] * n21, l, n20);
                                                        return;
                                                    }
                                                    int n23 = n6 + 2 & 3;
                                                    class190 class1906 = n15 == -1 && class2622.field2837 == null ? class2622.method5534(4, n23 + 4, nArray, n18, n17, n19) : new class82(class1032, n5, 4, n23 + 4, n2, n3, n4, n15, class2622.field2839, null);
                                                    class1872.method4183(n, n3, n4, n17, class1906, null, 256, n23, 0, 0, l, n20);
                                                    return;
                                                }
                                                int n24 = 8;
                                                long l3 = class1872.method4395(n, n3, n4);
                                                if (0L != l3) {
                                                    n24 = class142.method3512((int)class360.method7406((long)l3)).field2813 / 2;
                                                }
                                                class190 class1907 = n15 == -1 && class2622.field2837 == null ? class2622.method5534(4, n6 + 4, nArray, n18, n17, n19) : new class82(class1032, n5, 4, n6 + 4, n2, n3, n4, n15, class2622.field2839, null);
                                                class1872.method4183(n, n3, n4, n17, class1907, null, 256, n6, class84.field1037[n6] * n24, class84.field1038[n6] * n24, l, n20);
                                                return;
                                            }
                                            int n25 = 16;
                                            long l4 = class1872.method4395(n, n3, n4);
                                            if (0L != l4) {
                                                n25 = class142.method3512((int)class360.method7406((long)l4)).field2813;
                                            }
                                            class190 class1908 = n15 == -1 && class2622.field2837 == null ? class2622.method5534(4, n6, nArray, n18, n17, n19) : new class82(class1032, n5, 4, n6, n2, n3, n4, n15, class2622.field2839, null);
                                            class1872.method4183(n, n3, n4, n17, class1908, null, class84.field1028[n6], 0, class84.field1031[n6] * n25, class84.field1036[n6] * n25, l, n20);
                                            return;
                                        }
                                        class190 class1909 = n15 == -1 && class2622.field2837 == null ? class2622.method5534(4, n6, nArray, n18, n17, n19) : new class82(class1032, n5, 4, n6, n2, n3, n4, n15, class2622.field2839, null);
                                        class1872.method4183(n, n3, n4, n17, class1909, null, class84.field1028[n6], 0, 0, 0, l, n20);
                                        return;
                                    }
                                    class190 class19010 = n15 == -1 && class2622.field2837 == null ? class2622.method5534(n7, n6, nArray, n18, n17, n19) : new class82(class1032, n5, n7, n6, n2, n3, n4, n15, class2622.field2839, null);
                                    class1872.method4184(n, n3, n4, n17, 1, 1, class19010, 0, l, n20);
                                    if (class2622.field2806 != 0 && class2702 != null) {
                                        class2702.method5798(n3, n4, n14, n13, class2622.field2807);
                                    }
                                    return;
                                }
                                class190 class19011 = n15 == -1 && class2622.field2837 == null ? class2622.method5534(3, n6, nArray, n18, n17, n19) : new class82(class1032, n5, 3, n6, n2, n3, n4, n15, class2622.field2839, null);
                                class1872.method4182(n, n3, n4, n17, class19011, null, class84.field1034[n6], 0, l, n20);
                                if (class2622.field2806 != 0 && class2702 != null) {
                                    class2702.method5797(n3, n4, n7, n6, class2622.field2807);
                                }
                                return;
                            }
                            int n26 = n6 + 1 & 3;
                            if (n15 == -1 && class2622.field2837 == null) {
                                class1903 = class2622.method5534(2, n6 + 4, nArray, n18, n17, n19);
                                class1902 = class2622.method5534(2, n26, nArray, n18, n17, n19);
                            } else {
                                class1903 = new class82(class1032, n5, 2, n6 + 4, n2, n3, n4, n15, class2622.field2839, null);
                                class1902 = new class82(class1032, n5, 2, n26, n2, n3, n4, n15, class2622.field2839, null);
                            }
                            class1872.method4182(n, n3, n4, n17, class1903, class1902, class84.field1028[n6], class84.field1028[n26], l, n20);
                            if (class2622.field2806 != 0 && class2702 != null) {
                                class2702.method5797(n3, n4, n7, n6, class2622.field2807);
                            }
                            return;
                        }
                        class190 class19012 = n15 == -1 && class2622.field2837 == null ? class2622.method5534(1, n6, nArray, n18, n17, n19) : new class82(class1032, n5, 1, n6, n2, n3, n4, n15, class2622.field2839, null);
                        class1872.method4182(n, n3, n4, n17, class19012, null, class84.field1034[n6], 0, l, n20);
                        if (class2622.field2806 != 0 && class2702 != null) {
                            class2702.method5797(n3, n4, n7, n6, class2622.field2807);
                        }
                        return;
                    }
                    class190 class19013 = n15 == -1 && class2622.field2837 == null ? class2622.method5534(0, n6, nArray, n18, n17, n19) : new class82(class1032, n5, 0, n6, n2, n3, n4, n15, class2622.field2839, null);
                    class1872.method4182(n, n3, n4, n17, class19013, null, class84.field1028[n6], 0, l, n20);
                    if (class2622.field2806 != 0 && class2702 != null) {
                        class2702.method5797(n3, n4, n7, n6, class2622.field2807);
                    }
                    return;
                }
                class190 class19014 = n15 == -1 && class2622.field2837 == null ? class2622.method5534(n7, n6, nArray, n18, n17, n19) : new class82(class1032, n5, n7, n6, n2, n3, n4, n15, class2622.field2839, null);
                class1872.method4184(n, n3, n4, n17, 1, 1, class19014, 0, l, n20);
                if (class2622.field2806 != 0 && class2702 != null) {
                    class2702.method5798(n3, n4, n14, n13, class2622.field2807);
                }
                return;
            }
            class190 class19015 = n15 == -1 && class2622.field2837 == null ? class2622.method5534(10, n6, nArray, n18, n17, n19) : new class82(class1032, n5, 10, n6, n2, n3, n4, n15, class2622.field2839, null);
            if (class19015 != null) {
                class1872.method4184(n, n3, n4, n17, n14, n13, class19015, n7 == 11 ? 256 : 0, l, n20);
            }
            if (class2622.field2806 != 0 && class2702 != null) {
                class2702.method5798(n3, n4, n14, n13, class2622.field2807);
            }
            return;
        }
        class190 class19016 = n15 == -1 && class2622.field2837 == null ? class2622.method5534(22, n6, nArray, n18, n17, n19) : new class82(class1032, n5, 22, n6, n2, n3, n4, n15, class2622.field2839, null);
        class1872.method4180(n, n3, n4, n17, class19016, l, n20);
        if (class2622.field2806 == 1 && class2702 != null) {
            class2702.method5812(n3, n4);
        }
    }

    @ObfuscatedName(value="ku")
    @ObfuscatedSignature(descriptor="(Ldz;IIII)V", garbageValue="218938967")
    static final void method827(class103 class1032, int n, int n2, int n3) {
        class410 class4102 = class1032.field1327[n][n2][n3];
        if (class4102 != null) {
            long l = -99999999L;
            class109 class1092 = null;
            class109 class1093 = (class109)class4102.method7996();
            while (true) {
                class510 class5102;
                if (class1093 == null) {
                    if (class1092 != null) {
                        class4102.method7999(class1092);
                        class5102 = null;
                        class109 class1094 = null;
                        class1093 = (class109)class4102.method7996();
                        while (true) {
                            if (class1093 == null) {
                                long l2 = class79.method2452(n2, n3, 3, false, 0, class1032.field1320);
                                class1032.field1319.method4297(n, n2, n3, class23.method337(class1032, class350.method6980(n2), class350.method6980(n3), n), class1092, l2, (class190)class5102, class1094);
                                return;
                            }
                            if (class1093.field1389 != class1092.field1389) {
                                if (class5102 == null) {
                                    class5102 = class1093;
                                }
                                if (class1093.field1389 != ((class109)class5102).field1389 && class1094 == null) {
                                    class1094 = class1093;
                                }
                            }
                            class1093 = (class109)class4102.method8005();
                        }
                    }
                    class1032.field1319.method4195(n, n2, n3);
                    return;
                }
                class5102 = class191.method4462(class1093.field1389);
                long l3 = class5102.field2865;
                if (class5102.field2844 == 1) {
                    l3 *= class1093.field1385 < Integer.MAX_VALUE ? (long)(class1093.field1385 + 1) : (long)class1093.field1385;
                }
                if (l3 > l) {
                    l = l3;
                    class1092 = class1093;
                }
                class1093 = (class109)class4102.method8005();
            }
        }
        class1032.field1319.method4195(n, n2, n3);
    }
}

