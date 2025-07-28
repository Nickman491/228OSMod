package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cc")
public class class54
extends class514 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lcy;")
    static class60 field347 = new class60();
    @ObfuscatedName(value="ax")
    static int field346;
    @ObfuscatedName(value="at")
    static int field352;
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="[Lcb;")
    static class52[] field363;
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="[Lbv;")
    static class41[] field341;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="[Lbj;")
    static class46[] field366;
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="[Lbr;")
    static class50[] field353;
    @ObfuscatedName(value="af")
    static boolean[] field354;
    @ObfuscatedName(value="aa")
    static int[] field355;
    @ObfuscatedName(value="ak")
    static boolean field356;
    @ObfuscatedName(value="ar")
    static float[] field350;
    @ObfuscatedName(value="am")
    static float[] field349;
    @ObfuscatedName(value="ap")
    static float[] field364;
    @ObfuscatedName(value="ab")
    static float[] field365;
    @ObfuscatedName(value="aj")
    static float[] field348;
    @ObfuscatedName(value="bu")
    static float[] field362;
    @ObfuscatedName(value="bh")
    static int[] field368;
    @ObfuscatedName(value="bw")
    static int[] field369;
    @ObfuscatedName(value="ay")
    byte[][] field351;
    @ObfuscatedName(value="ah")
    int field343;
    @ObfuscatedName(value="az")
    int field361;
    @ObfuscatedName(value="ao")
    int field344;
    @ObfuscatedName(value="ad")
    int field345;
    @ObfuscatedName(value="an")
    boolean field342;
    @ObfuscatedName(value="al")
    float[] field357;
    @ObfuscatedName(value="av")
    int field358;
    @ObfuscatedName(value="ag")
    int field359;
    @ObfuscatedName(value="aw")
    boolean field360;
    @ObfuscatedName(value="ai")
    float[] field367;
    @ObfuscatedName(value="bb")
    byte[] field370;
    @ObfuscatedName(value="bx")
    int field371;
    @ObfuscatedName(value="bd")
    int field372;

    static {
        field356 = false;
    }

    class54(byte[] byArray) {
        this.method1135(byArray);
    }

    @ObfuscatedName(value="ah")
    void method1135(byte[] byArray) {
        class556 class5562 = new class556(byArray);
        this.field343 = class5562.method10440();
        this.field361 = class5562.method10440();
        this.field344 = class5562.method10440();
        this.field345 = class5562.method10440();
        if (this.field345 < 0) {
            this.field345 ^= 0xFFFFFFFF;
            this.field342 = true;
        }
        int n = class5562.method10440();
        this.field351 = new byte[n][];
        int n2 = 0;
        while (n2 < n) {
            int n3;
            int n4 = 0;
            do {
                n3 = class5562.method10282();
                n4 += n3;
            } while (n3 >= 255);
            byte[] byArray2 = new byte[n4];
            class5562.method10293(byArray2, 0, n4);
            this.field351[n2] = byArray2;
            ++n2;
        }
        return;
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="ao")
    float[] method1137(int var1_1) {
        var2_2 = new class60();
        var2_2.method1204(this.field351[var1_1], 0);
        this.field367 = new float[class54.field352];
        var2_2.method1207();
        var3_3 = var2_2.method1205(class320.method6612(class54.field355.length - 1));
        var4_4 = class54.field354[var3_3];
        var5_5 = var4_4 != false ? class54.field352 : class54.field346;
        var6_6 = false;
        var7_7 = false;
        if (var4_4) {
            var6_6 = var2_2.method1207() != 0;
            var7_7 = var2_2.method1207() != 0;
        }
        var8_8 = var5_5 >> 1;
        if (var4_4 && !var6_6) {
            var9_9 = (var5_5 >> 2) - (class54.field346 >> 2);
            var10_10 = (class54.field346 >> 2) + (var5_5 >> 2);
            var11_11 = class54.field346 >> 1;
        } else {
            var9_9 = 0;
            var10_10 = var8_8;
            var11_11 = var5_5 >> 1;
        }
        if (var4_4 && !var7_7) {
            var12_12 = var5_5 - (var5_5 >> 2) - (class54.field346 >> 2);
            var13_13 = (class54.field346 >> 2) + (var5_5 - (var5_5 >> 2));
            var14_14 = class54.field346 >> 1;
        } else {
            var12_12 = var8_8;
            var13_13 = var5_5;
            var14_14 = var5_5 >> 1;
        }
        var15_15 = class54.field353[class54.field355[var3_3]];
        var16_16 = var15_15.field328;
        var17_17 = var15_15.field329[var16_16];
        var18_18 = class54.field341[var17_17].method787(var2_2);
        var19_19 = var18_18.method1199() == false;
        var20_20 = 0;
        while (true) {
            block43: {
                block42: {
                    if (var20_20 < var15_15.field330) break block43;
                    if (var18_18.method1199()) {
                        var16_16 = var15_15.field328;
                        var17_17 = var15_15.field329[var16_16];
                        var18_18.method1195(this.field367, var5_5 >> 1);
                    }
                    if (var18_18.method1199()) {
                        var20_20 = var5_5 >> 1;
                        var21_23 = var5_5 >> 2;
                        var22_24 = var5_5 >> 3;
                        var23_25 = this.field367;
                        var24_26 = 0;
                        while (var24_26 < var20_20) {
                            v0 = var24_26++;
                            var23_25[v0] = var23_25[v0] * 0.5f;
                        }
                        for (var24_26 = var20_20; var24_26 < var5_5; ++var24_26) {
                            var23_25[var24_26] = -var23_25[var5_5 - var24_26 - 1];
                        }
                        var43_27 = var4_4 != false ? class54.field365 : class54.field350;
                        var25_28 = var4_4 != false ? class54.field348 : class54.field349;
                        var26_29 = var4_4 != false ? class54.field362 : class54.field364;
                        var27_30 = var4_4 != false ? class54.field369 : class54.field368;
                        var28_31 = 0;
                        while (true) {
                            if (var28_31 >= var21_23) {
                                var28_31 = 0;
                                while (true) {
                                    if (var28_31 >= var22_24) {
                                        var28_31 = class320.method6612(var5_5 - 1);
                                        var29_33 = 0;
                                        while (true) {
                                            if (var29_33 >= var28_31 - 3) {
                                                var29_33 = 1;
                                                while (true) {
                                                    if (var29_33 >= var22_24 - 1) {
                                                        for (var29_33 = 0; var29_33 < var20_20; ++var29_33) {
                                                            var23_25[var29_33] = var23_25[var29_33 * 2 + 1];
                                                        }
                                                        var29_33 = 0;
                                                        while (true) {
                                                            if (var29_33 >= var22_24) {
                                                                var29_33 = 0;
                                                                while (true) {
                                                                    if (var29_33 >= var22_24) {
                                                                        var29_33 = 0;
                                                                        while (true) {
                                                                            if (var29_33 >= var21_23) {
                                                                                for (var29_33 = 0; var29_33 < var21_23; ++var29_33) {
                                                                                    var23_25[var29_33 + (var5_5 - var21_23)] = -var23_25[var29_33];
                                                                                }
                                                                                for (var29_33 = 0; var29_33 < var21_23; ++var29_33) {
                                                                                    var23_25[var29_33] = var23_25[var21_23 + var29_33];
                                                                                }
                                                                                for (var29_33 = 0; var29_33 < var21_23; ++var29_33) {
                                                                                    var23_25[var21_23 + var29_33] = -var23_25[var21_23 - var29_33 - 1];
                                                                                }
                                                                                for (var29_33 = 0; var29_33 < var21_23; ++var29_33) {
                                                                                    var23_25[var20_20 + var29_33] = var23_25[var5_5 - var29_33 - 1];
                                                                                }
                                                                                var29_33 = var9_9;
                                                                                while (true) {
                                                                                    if (var29_33 >= var10_10) {
                                                                                        var29_33 = var12_12;
                                                                                        while (var29_33 < var13_13) {
                                                                                            var30_35 = (float)Math.sin(((double)(var29_33 - var12_12) + 0.5) / (double)var14_14 * 0.5 * 3.141592653589793 + 1.5707963267948966);
                                                                                            v1 = var29_33++;
                                                                                            this.field367[v1] = this.field367[v1] * (float)Math.sin(1.5707963267948966 * (double)var30_35 * (double)var30_35);
                                                                                        }
                                                                                        break block42;
                                                                                    }
                                                                                    var30_36 = (float)Math.sin(((double)(var29_33 - var9_9) + 0.5) / (double)var11_11 * 0.5 * 3.141592653589793);
                                                                                    v2 = var29_33++;
                                                                                    this.field367[v2] = this.field367[v2] * (float)Math.sin(1.5707963267948966 * (double)var30_36 * (double)var30_36);
                                                                                }
                                                                            }
                                                                            var23_25[var29_33] = var23_25[var20_20 + var29_33 * 2] * var25_28[var29_33 * 2] + var23_25[var20_20 + var29_33 * 2 + 1] * var25_28[var29_33 * 2 + 1];
                                                                            var23_25[var20_20 - 1 - var29_33] = var23_25[var20_20 + var29_33 * 2] * var25_28[var29_33 * 2 + 1] - var23_25[var20_20 + var29_33 * 2 + 1] * var25_28[var29_33 * 2];
                                                                            ++var29_33;
                                                                        }
                                                                    }
                                                                    var30_37 = var26_29[var29_33 * 2];
                                                                    var31_41 = var26_29[var29_33 * 2 + 1];
                                                                    var32_45 = var23_25[var20_20 + var29_33 * 2];
                                                                    var33_49 = var23_25[var20_20 + var29_33 * 2 + 1];
                                                                    var34_53 = var23_25[var5_5 - 2 - var29_33 * 2];
                                                                    var35_56 = var23_25[var5_5 - 1 - var29_33 * 2];
                                                                    var36_58 = var31_41 * (var32_45 - var34_53) + var30_37 * (var33_49 + var35_56);
                                                                    var23_25[var20_20 + var29_33 * 2] = (var32_45 + var34_53 + var36_58) * 0.5f;
                                                                    var23_25[var5_5 - 2 - var29_33 * 2] = (var32_45 + var34_53 - var36_58) * 0.5f;
                                                                    var36_58 = var31_41 * (var33_49 + var35_56) - var30_37 * (var32_45 - var34_53);
                                                                    var23_25[var20_20 + var29_33 * 2 + 1] = (var33_49 - var35_56 + var36_58) * 0.5f;
                                                                    var23_25[var5_5 - 1 - var29_33 * 2] = (-var33_49 + var35_56 + var36_58) * 0.5f;
                                                                    ++var29_33;
                                                                }
                                                            }
                                                            var23_25[var5_5 - 1 - var29_33 * 2] = var23_25[var29_33 * 4];
                                                            var23_25[var5_5 - 2 - var29_33 * 2] = var23_25[var29_33 * 4 + 1];
                                                            var23_25[var5_5 - var21_23 - 1 - var29_33 * 2] = var23_25[var29_33 * 4 + 2];
                                                            var23_25[var5_5 - var21_23 - 2 - var29_33 * 2] = var23_25[var29_33 * 4 + 3];
                                                            ++var29_33;
                                                        }
                                                    }
                                                    var30_38 = var27_30[var29_33];
                                                    if (var29_33 < var30_38) {
                                                        var31_42 = var29_33 * 8;
                                                        var32_46 = var30_38 * 8;
                                                        var33_50 = var23_25[var31_42 + 1];
                                                        var23_25[var31_42 + 1] = var23_25[var32_46 + 1];
                                                        var23_25[var32_46 + 1] = var33_50;
                                                        var33_50 = var23_25[var31_42 + 3];
                                                        var23_25[var31_42 + 3] = var23_25[var32_46 + 3];
                                                        var23_25[var32_46 + 3] = var33_50;
                                                        var33_50 = var23_25[var31_42 + 5];
                                                        var23_25[var31_42 + 5] = var23_25[var32_46 + 5];
                                                        var23_25[var32_46 + 5] = var33_50;
                                                        var33_50 = var23_25[var31_42 + 7];
                                                        var23_25[var31_42 + 7] = var23_25[var32_46 + 7];
                                                        var23_25[var32_46 + 7] = var33_50;
                                                    }
                                                    ++var29_33;
                                                }
                                            }
                                            var30_39 = var5_5 >> var29_33 + 2;
                                            var31_43 = 8 << var29_33;
                                            for (var32_47 = 0; var32_47 < 2 << var29_33; ++var32_47) {
                                                var33_51 = var5_5 - var30_39 * var32_47 * 2;
                                                var34_54 = var5_5 - var30_39 * (var32_47 * 2 + 1);
                                                for (var35_55 = 0; var35_55 < var5_5 >> var29_33 + 4; ++var35_55) {
                                                    var36_57 = var35_55 * 4;
                                                    var37_59 = var23_25[var33_51 - 1 - var36_57];
                                                    var38_60 = var23_25[var33_51 - 3 - var36_57];
                                                    var39_61 = var23_25[var34_54 - 1 - var36_57];
                                                    var40_62 = var23_25[var34_54 - 3 - var36_57];
                                                    var23_25[var33_51 - 1 - var36_57] = var37_59 + var39_61;
                                                    var23_25[var33_51 - 3 - var36_57] = var38_60 + var40_62;
                                                    var41_63 = var43_27[var35_55 * var31_43];
                                                    var42_64 = var43_27[var35_55 * var31_43 + 1];
                                                    var23_25[var34_54 - 1 - var36_57] = (var37_59 - var39_61) * var41_63 - (var38_60 - var40_62) * var42_64;
                                                    var23_25[var34_54 - 3 - var36_57] = (var38_60 - var40_62) * var41_63 + (var37_59 - var39_61) * var42_64;
                                                }
                                            }
                                            ++var29_33;
                                        }
                                    }
                                    var29_32 = var23_25[var20_20 + var28_31 * 4 + 3];
                                    var30_34 = var23_25[var20_20 + var28_31 * 4 + 1];
                                    var31_40 = var23_25[var28_31 * 4 + 3];
                                    var32_44 = var23_25[var28_31 * 4 + 1];
                                    var23_25[var20_20 + var28_31 * 4 + 3] = var29_32 + var31_40;
                                    var23_25[var20_20 + var28_31 * 4 + 1] = var30_34 + var32_44;
                                    var33_48 = var43_27[var20_20 - 4 - var28_31 * 4];
                                    var34_52 = var43_27[var20_20 - 3 - var28_31 * 4];
                                    var23_25[var28_31 * 4 + 3] = (var29_32 - var31_40) * var33_48 - (var30_34 - var32_44) * var34_52;
                                    var23_25[var28_31 * 4 + 1] = (var30_34 - var32_44) * var33_48 + (var29_32 - var31_40) * var34_52;
                                    ++var28_31;
                                }
                            }
                            var29_32 = var23_25[var28_31 * 4] - var23_25[var5_5 - var28_31 * 4 - 1];
                            var30_34 = var23_25[var28_31 * 4 + 2] - var23_25[var5_5 - var28_31 * 4 - 3];
                            var31_40 = var43_27[var28_31 * 2];
                            var32_44 = var43_27[var28_31 * 2 + 1];
                            var23_25[var5_5 - var28_31 * 4 - 1] = var29_32 * var31_40 - var30_34 * var32_44;
                            var23_25[var5_5 - var28_31 * 4 - 3] = var29_32 * var32_44 + var30_34 * var31_40;
                            ++var28_31;
                        }
                    }
                    for (var20_20 = var5_5 >> 1; var20_20 < var5_5; ++var20_20) {
                        this.field367[var20_20] = 0.0f;
                    }
                }
                var44_65 = null;
                if (this.field358 <= 0) ** GOTO lbl210
                var21_23 = var5_5 + this.field358 >> 2;
                var44_65 = new float[var21_23];
                if (this.field360) ** GOTO lbl206
                var22_24 = 0;
                while (true) {
                    block44: {
                        if (var22_24 < this.field359) break block44;
lbl206:
                        // 2 sources

                        if (!var18_18.method1199()) ** GOTO lbl210
                        var22_24 = var9_9;
                        while (true) {
                            block45: {
                                if (var22_24 < var5_5 >> 1) break block45;
lbl210:
                                // 3 sources

                                var45_21 = this.field357;
                                this.field357 = this.field367;
                                this.field367 = (float[])var45_21;
                                this.field358 = var5_5;
                                this.field359 = var13_13 - (var5_5 >> 1);
                                this.field360 = var18_18.method1199() == false;
                                return var44_65;
                            }
                            v3 = var46_66 = var44_65.length - (var5_5 >> 1) + var22_24;
                            var44_65[v3] = var44_65[v3] + this.field367[var22_24];
                            ++var22_24;
                        }
                    }
                    var46_66 = var22_24 + (this.field358 >> 1);
                    v4 = var22_24++;
                    var44_65[v4] = var44_65[v4] + this.field357[var46_66];
                }
            }
            var45_21 = class54.field366[var15_15.field327[var20_20]];
            var47_22 = this.field367;
            var45_21.method900(var47_22, var5_5 >> 1, var19_19, var2_2);
            ++var20_20;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="([I)Lbc;")
    class40 method1140(int[] nArray) {
        if (nArray != null && nArray[0] <= 0) {
            return null;
        }
        if (this.field370 == null) {
            this.field358 = 0;
            this.field357 = new float[field352];
            this.field370 = new byte[this.field361];
            this.field371 = 0;
            this.field372 = 0;
        }
        block0: while (true) {
            if (this.field372 >= this.field351.length) {
                this.field357 = null;
                byte[] byArray = this.field370;
                this.field370 = null;
                return new class40(this.field343, byArray, this.field344, this.field345, this.field342);
            }
            if (nArray != null && nArray[0] <= 0) {
                return null;
            }
            boolean bl = true;
            while (true) {
                int n;
                int n2;
                block11: {
                    block12: {
                        block9: {
                            int n3;
                            block10: {
                                int n4;
                                float[] fArray;
                                block8: {
                                    if (!bl || (bl = false)) break block8;
                                    fArray = this.method1137(this.field372);
                                    if (fArray == null) break block9;
                                    n4 = fArray.length;
                                    n3 = this.field371;
                                    if (n4 > this.field361 - n3) {
                                        n4 = this.field361 - n3;
                                    }
                                    n2 = 0;
                                }
                                if (n2 >= n4) break block10;
                                n = (int)(128.0f + fArray[n2] * 128.0f);
                                if ((n & 0xFFFFFF00) == 0) break block11;
                                break block12;
                            }
                            if (nArray != null) {
                                nArray[0] = nArray[0] - (n3 - this.field371);
                            }
                            this.field371 = n3;
                        }
                        ++this.field372;
                        continue block0;
                    }
                    n = ~n >> 31;
                }
                this.field370[n3++] = (byte)(n - 128);
                ++n2;
            }
            break;
        }
    }

    @ObfuscatedName(value="ay")
    static float method1155(int n) {
        int n2 = n & 0x1FFFFF;
        int n3 = n & Integer.MIN_VALUE;
        int n4 = (n & 0x7FE00000) >> 21;
        if (n3 != 0) {
            n2 = -n2;
        }
        return (float)((double)n2 * Math.pow(2.0, n4 - 788));
    }

    @ObfuscatedName(value="az")
    static void method1158(byte[] byArray) {
        class60 class602 = field347;
        class602.method1204(byArray, 0);
        field346 = 1 << class602.method1205(4);
        field352 = 1 << class602.method1205(4);
        int n = 0;
        block0: while (true) {
            int n2;
            int n3;
            int n4;
            int n5;
            if (n >= 2) {
                n = class602.method1205(8) + 1;
                field363 = new class52[n];
                for (n5 = 0; n5 < n; ++n5) {
                    class54.field363[n5] = new class52();
                }
                n5 = class602.method1205(6) + 1;
                for (n4 = 0; n4 < n5; ++n4) {
                    class602.method1205(16);
                }
                n5 = class602.method1205(6) + 1;
                field341 = new class41[n5];
                for (n4 = 0; n4 < n5; ++n4) {
                    class54.field341[n4] = new class41();
                }
                n4 = class602.method1205(6) + 1;
                field366 = new class46[n4];
                for (n3 = 0; n3 < n4; ++n3) {
                    class54.field366[n3] = new class46();
                }
                n3 = class602.method1205(6) + 1;
                field353 = new class50[n3];
                for (n2 = 0; n2 < n3; ++n2) {
                    class54.field353[n2] = new class50();
                }
                n2 = class602.method1205(6) + 1;
                field354 = new boolean[n2];
                field355 = new int[n2];
                int n6 = 0;
                while (true) {
                    if (n6 >= n2) {
                        return;
                    }
                    class54.field354[n6] = class602.method1207() != 0;
                    class602.method1205(16);
                    class602.method1205(16);
                    class54.field355[n6] = class602.method1205(8);
                    ++n6;
                }
            }
            n5 = n != 0 ? field352 : field346;
            n4 = n5 >> 1;
            n3 = n5 >> 2;
            n2 = n5 >> 3;
            float[] fArray = new float[n4];
            int n7 = 0;
            while (true) {
                if (n7 >= n3) {
                    float[] fArray2 = new float[n4];
                    int n8 = 0;
                    while (true) {
                        if (n8 >= n3) {
                            float[] fArray3 = new float[n3];
                            int n9 = 0;
                            while (true) {
                                if (n9 >= n2) {
                                    int[] nArray = new int[n2];
                                    int n10 = class320.method6612(n2 - 1);
                                    for (int i = 0; i < n2; ++i) {
                                        nArray[i] = class30.method481(i, n10);
                                    }
                                    if (n == 0) {
                                        field350 = fArray;
                                        field349 = fArray2;
                                        field364 = fArray3;
                                        field368 = nArray;
                                    } else {
                                        field365 = fArray;
                                        field348 = fArray2;
                                        field362 = fArray3;
                                        field369 = nArray;
                                    }
                                    ++n;
                                    continue block0;
                                }
                                fArray3[n9 * 2] = (float)Math.cos((double)(n9 * 4 + 2) * Math.PI / (double)n5);
                                fArray3[n9 * 2 + 1] = -((float)Math.sin((double)(n9 * 4 + 2) * Math.PI / (double)n5));
                                ++n9;
                            }
                        }
                        fArray2[n8 * 2] = (float)Math.cos((double)(n8 * 2 + 1) * Math.PI / (double)(n5 * 2));
                        fArray2[n8 * 2 + 1] = (float)Math.sin((double)(n8 * 2 + 1) * Math.PI / (double)(n5 * 2));
                        ++n8;
                    }
                }
                fArray[n7 * 2] = (float)Math.cos((double)(n7 * 4) * Math.PI / (double)n5);
                fArray[n7 * 2 + 1] = -((float)Math.sin((double)(n7 * 4) * Math.PI / (double)n5));
                ++n7;
            }
            break;
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lpq;)Z")
    static boolean method1144(class391 class3912) {
        if (!field356) {
            byte[] byArray = class3912.method7790(0, 0);
            if (byArray == null) {
                return false;
            }
            class54.method1158(byArray);
            field356 = true;
        }
        return true;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lpq;II)Lcc;")
    static class54 method1136(class391 class3912, int n, int n2) {
        if (class54.method1144(class3912)) {
            byte[] byArray = class3912.method7790(n, n2);
            if (byArray == null) {
                return null;
            }
            return new class54(byArray);
        }
        class3912.method7730(n, n2);
        return null;
    }
}

