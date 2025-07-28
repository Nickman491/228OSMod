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

@ObfuscatedName(value="fb")
public class class134
extends Enum
implements MouseWheel {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lfb;")
    static final /* enum */ class134 field1561 = new class134("runelite", 0, 0, 0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lfb;")
    static final /* enum */ class134 field1557 = new class134("runelite", 1, 1, 1);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lfb;")
    static final /* enum */ class134 field1559 = new class134("runelite", 2, 2, 2);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lfb;")
    static final /* enum */ class134 field1560 = new class134("runelite", 3, 3, 3);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lfb;")
    static final /* enum */ class134 field1563 = new class134("runelite", 4, 4, 4);
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lna;")
    static class361 field1564;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=968091513)
    final int field1562;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1964443191)
    final int field1558;

    /*
     * WARNING - void declaration
     */
    class134() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.field1562 = var3_1;
        this.field1558 = var4_2;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    public int vmethod10703() {
        return this.field1558;
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="lv")
    @ObfuscatedSignature(descriptor="([Lna;IIIIIIIII)V", garbageValue="1811100333")
    static final void method3438(class361[] var0, int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, int var8_8) {
        class566.method10659(var2_2, var3_3, var4_4, var5_5);
        class182.method4071();
        var9_9 = 0;
        while (true) {
            block118: {
                block122: {
                    block123: {
                        block124: {
                            block125: {
                                block128: {
                                    block129: {
                                        block130: {
                                            block127: {
                                                block126: {
                                                    block121: {
                                                        block119: {
                                                            block120: {
                                                                if (var9_9 >= var0.length) {
                                                                    return;
                                                                }
                                                                var10_10 = var0[var9_9];
                                                                if (var10_10 == null || var10_10.field4026 != var1_1 && (var1_1 != -1412584499 || var10_10 != client.field675)) break block118;
                                                                if (var8_8 != -1) {
                                                                    var11_11 = var8_8;
                                                                } else {
                                                                    client.field716[client.field711] = var10_10.field3884 + var6_6;
                                                                    client.field611[client.field711] = var7_7 + var10_10.field3885;
                                                                    client.field718[client.field711] = var10_10.field3886;
                                                                    client.field605[client.field711] = var10_10.field3887 * -1528330031;
                                                                    var11_11 = ++client.field711 - 1;
                                                                }
                                                                var10_10.field4021 = var11_11;
                                                                var10_10.field4022 = client.field514;
                                                                if (var10_10.field3991 && class163.method3777(var10_10)) break block118;
                                                                if (var10_10.field3875 > 0) {
                                                                    class18.method284(var10_10);
                                                                }
                                                                var12_12 = var10_10.field3884 + var6_6;
                                                                var13_13 = var7_7 + var10_10.field3885;
                                                                var14_14 = var10_10.field4015;
                                                                if (var10_10 != client.field675) break block119;
                                                                if (var1_1 == -1412584499 || var10_10.field4027) break block120;
                                                                class10.field53 = var0;
                                                                class433.field4786 = var6_6;
                                                                class236.field2543 = var7_7;
                                                                break block118;
                                                            }
                                                            if (client.field585 && client.field523) {
                                                                var15_15 = class35.field201;
                                                                var16_16 = class35.field202;
                                                                var16_16 -= client.field678;
                                                                if ((var15_15 -= client.field715) < client.field681) {
                                                                    var15_15 = client.field681;
                                                                }
                                                                if (var15_15 + var10_10.field3886 > client.field681 + client.field676.field3886) {
                                                                    var15_15 = client.field681 + client.field676.field3886 - var10_10.field3886;
                                                                }
                                                                if (var16_16 < client.field682) {
                                                                    var16_16 = client.field682;
                                                                }
                                                                if (var16_16 + var10_10.field3887 * -1528330031 > client.field676.field3887 * -1528330031 + client.field682) {
                                                                    var16_16 = client.field676.field3887 * -1528330031 + client.field682 - var10_10.field3887 * -1528330031;
                                                                }
                                                                var12_12 = var15_15;
                                                                var13_13 = var16_16;
                                                            }
                                                            if (!var10_10.field4027) {
                                                                var14_14 = 128;
                                                            }
                                                        }
                                                        if (var10_10.field3873 != 9) {
                                                            var19_19 = var12_12 + var10_10.field3886;
                                                            var20_20 = var13_13 + var10_10.field3887 * -1528330031;
                                                            var15_15 = var12_12 > var2_2 ? var12_12 : var2_2;
                                                            var16_16 = var13_13 > var3_3 ? var13_13 : var3_3;
                                                            var17_17 = var19_19 < var4_4 ? var19_19 : var4_4;
                                                            var18_18 = var20_20 < var5_5 ? var20_20 : var5_5;
                                                        } else {
                                                            var19_19 = var12_12;
                                                            var20_20 = var13_13;
                                                            var21_21 = var12_12 + var10_10.field3886;
                                                            var22_22 = var10_10.field3887 * -1528330031 + var13_13;
                                                            if (var21_21 < var19_19) {
                                                                var23_23 = var19_19;
                                                                var19_19 = var21_21;
                                                                var21_21 = var23_23;
                                                            }
                                                            if (var22_22 < var20_20) {
                                                                var23_23 = var20_20;
                                                                var20_20 = var22_22;
                                                                var22_22 = var23_23;
                                                            }
                                                            var15_15 = var19_19 > var2_2 ? var19_19 : var2_2;
                                                            var16_16 = var20_20 > var3_3 ? var20_20 : var3_3;
                                                            var17_17 = var21_21 < var4_4 ? ++var21_21 : var4_4;
                                                            v0 = var18_18 = var22_22 < var5_5 ? ++var22_22 : var5_5;
                                                        }
                                                        if (var10_10.field3991 && (var15_15 >= var17_17 || var16_16 >= var18_18)) break block118;
                                                        if (var10_10.field3875 == 0) break block121;
                                                        if (var10_10.field3875 == 1336) break block122;
                                                        if (var10_10.field3875 == 1337) break block123;
                                                        if (var10_10.field3875 == 1338) break block124;
                                                        if (var10_10.field3875 == 1339) break block125;
                                                        if (var10_10.field3875 == 1400) {
                                                            class420.field4722.method9738(var12_12, var13_13, var10_10.field3886, var10_10.field3887 * -1528330031, client.field514, class544.field5403.method2941());
                                                        }
                                                        if (var10_10.field3875 == 1401) {
                                                            class420.field4722.method9793(var12_12, var13_13, var10_10.field3886, var10_10.field3887 * -1528330031);
                                                        }
                                                        if (var10_10.field3875 == 1402) {
                                                            class461.field4948.method2838(var12_12, client.field514);
                                                        }
                                                    }
                                                    if (var10_10.field3873 == 0) break block126;
                                                    if (var10_10.field3873 != 11) break block127;
                                                    if (class163.method3777(var10_10) && var10_10 != class424.field4739) break block118;
                                                    if (var10_10.field4014 != null) {
                                                        class134.method3438(var10_10.field4014, var10_10.field3910, var15_15, var16_16, var17_17, var18_18, var12_12 - var10_10.field3987, var13_13 - var10_10.field3899, var11_11);
                                                    }
                                                    class566.method10659(var2_2, var3_3, var4_4, var5_5);
                                                    class182.method4071();
                                                    break block127;
                                                }
                                                if (!var10_10.field3991 && class163.method3777(var10_10) && var10_10 != class424.field4739) break block118;
                                                if (!var10_10.field3991) {
                                                    if (var10_10.field3899 > var10_10.field3895 - var10_10.field3887 * -1528330031) {
                                                        var10_10.field3899 = var10_10.field3895 - var10_10.field3887 * -1528330031;
                                                    }
                                                    if (var10_10.field3899 < 0) {
                                                        var10_10.field3899 = 0;
                                                    }
                                                }
                                                class134.method3438(var0, var10_10.field3910, var15_15, var16_16, var17_17, var18_18, var12_12 - var10_10.field3987, var13_13 - var10_10.field3899, var11_11);
                                                if (var10_10.field4014 != null) {
                                                    class134.method3438(var10_10.field4014, var10_10.field3910, var15_15, var16_16, var17_17, var18_18, var12_12 - var10_10.field3987, var13_13 - var10_10.field3899, var11_11);
                                                }
                                                if ((var28_28 = (class89)client.field664.method9985(var10_10.field3910)) != null) {
                                                    class190.method4459(var28_28.field1073, var15_15, var16_16, var17_17, var18_18, var12_12, var13_13, var11_11);
                                                }
                                                class566.method10659(var2_2, var3_3, var4_4, var5_5);
                                                class182.method4071();
                                            }
                                            if (!client.field722 && !client.field580[var11_11] && client.field720 <= 1) break block118;
                                            if (var10_10.field3873 == 0 && !var10_10.field3991 && var10_10.field3895 > var10_10.field3887 * -1528330031) {
                                                class480.method9354(var12_12 + var10_10.field3886, var13_13, var10_10.field3899, var10_10.field3887 * -1528330031, var10_10.field3895);
                                            }
                                            if (var10_10.field3873 == 1) break block118;
                                            if (var10_10.field3873 == 3) break block128;
                                            if (var10_10.field3873 == 4) break block129;
                                            if (var10_10.field3873 == 5) break block130;
                                            if (var10_10.field3873 != 6) {
                                                if (var10_10.field3873 == 8 && var10_10 == class104.field1346 && client.field654 == client.field655) {
                                                    var19_19 = 0;
                                                    var20_20 = 0;
                                                    var29_29 = class100.field1278;
                                                    var30_30 = var10_10.field3911;
                                                    var30_30 = class28.method458((String)var30_30, var10_10);
                                                    while (true) {
                                                        if (var30_30.length() <= 0) {
                                                            var20_20 += 7;
                                                            var24_24 = var12_12 + var10_10.field3886 - 5 - (var19_19 += 6);
                                                            var25_25 = var10_10.field3887 * -1528330031 + var13_13 + 5;
                                                            if (var24_24 < var12_12 + 5) {
                                                                var24_24 = var12_12 + 5;
                                                            }
                                                            if (var19_19 + var24_24 > var4_4) {
                                                                var24_24 = var4_4 - var19_19;
                                                            }
                                                            if (var25_25 + var20_20 > var5_5) {
                                                                var25_25 = var5_5 - var20_20;
                                                            }
                                                            class566.method10677(var24_24, var25_25, var19_19, var20_20, 0xFFFFA0);
                                                            class566.method10617(var24_24, var25_25, var19_19, var20_20, 0);
                                                            var30_30 = var10_10.field3911;
                                                            var26_26 = var25_25 + var29_29.field4832 + 2;
                                                            var30_30 = class28.method458((String)var30_30, var10_10);
                                                            while (var30_30.length() > 0) {
                                                                var27_27 = var30_30.indexOf("<br>");
                                                                if (var27_27 == -1) {
                                                                    var31_31 = var30_30;
                                                                    var30_30 = "";
                                                                } else {
                                                                    var31_31 = var30_30.substring(0, var27_27);
                                                                    var30_30 = var30_30.substring(var27_27 + 4);
                                                                }
                                                                var29_29.method8727((String)var31_31, var24_24 + 3, var26_26, 0, -1);
                                                                var26_26 = var26_26 + var29_29.field4832 + 1;
                                                            }
                                                            break;
                                                        }
                                                        var24_24 = var30_30.indexOf("<br>");
                                                        if (var24_24 == -1) {
                                                            var31_31 = var30_30;
                                                            var30_30 = "";
                                                        } else {
                                                            var31_31 = var30_30.substring(0, var24_24);
                                                            var30_30 = var30_30.substring(var24_24 + 4);
                                                        }
                                                        var25_25 = var29_29.method8682((String)var31_31);
                                                        if (var25_25 > var19_19) {
                                                            var19_19 = var25_25;
                                                        }
                                                        var20_20 = var20_20 + var29_29.field4832 + 1;
                                                    }
                                                }
                                                if (var10_10.field3873 != 9) {
                                                    if (var10_10.field3873 == 12) {
                                                        var28_28 = var10_10.method7444();
                                                        var32_32 = var10_10.method7445();
                                                        if (var28_28 != null && var32_32 != null && var28_28.method7276() && (var29_29 = var10_10.method7419(class170.field1807)) != null) {
                                                            client.field755.method10905(var12_12, var13_13, var10_10.field3886, var10_10.field3887 * -1528330031, var28_28.method7167(), var28_28.method7187(), var28_28.method7259(), var28_28.method7184(), var28_28.method7182());
                                                            v1 = var22_22 = var10_10.field3890 != false ? var10_10.field3881 : -1;
                                                            if (!var28_28.method7221() && var28_28.method7331().method8579()) {
                                                                client.field755.method10906(var32_32.field3782, var22_22, var32_32.field3783, var32_32.field3781);
                                                                client.field755.method10907(var28_28.method7363(), (class435)var29_29);
                                                            } else {
                                                                client.field755.method10906(var10_10.field3896, var22_22, var32_32.field3783, var32_32.field3781);
                                                                client.field755.method10907(var28_28.method7331(), (class435)var29_29);
                                                            }
                                                            class566.method10659(var2_2, var3_3, var4_4, var5_5);
                                                        }
                                                    }
                                                } else {
                                                    if (!var10_10.field3907) {
                                                        var19_19 = var12_12;
                                                        var20_20 = var13_13;
                                                        var21_21 = var12_12 + var10_10.field3886;
                                                        var22_22 = var10_10.field3887 * -1528330031 + var13_13;
                                                    } else {
                                                        var19_19 = var12_12;
                                                        var20_20 = var13_13 + var10_10.field3887 * -1528330031;
                                                        var21_21 = var12_12 + var10_10.field3886;
                                                        var22_22 = var13_13;
                                                    }
                                                    if (var10_10.field3948 != 1) {
                                                        class228.method5107(var19_19, var20_20, var21_21, var22_22, var10_10.field3896, var10_10.field3948);
                                                    } else {
                                                        class566.method10623(var19_19, var20_20, var21_21, var22_22, var10_10.field3896);
                                                    }
                                                }
                                            } else {
                                                var19_19 = (int)class268.method5754(var10_10);
                                                var20_20 = var19_19 != 0 ? var10_10.field3862 : var10_10.field3919;
                                                var29_29 = null;
                                                var22_22 = 0;
                                                if (var10_10.field4010 == -1) {
                                                    if (var10_10.field3915 != 5) {
                                                        if (var10_10.field3915 != 7) {
                                                            var31_31 = null;
                                                            var33_33 = null;
                                                            if (var10_10.field3915 != 6) {
                                                                if (var10_10.field3915 == 2) {
                                                                    var25_25 = var10_10.field3916;
                                                                    var31_31 = class446.method8848(var25_25);
                                                                    if (var31_31.field2663 != null) {
                                                                        var31_31 = var31_31.method5302();
                                                                    }
                                                                }
                                                            } else {
                                                                var25_25 = var10_10.field3916;
                                                                if (var25_25 >= 0 && var25_25 < class34.field189.field1330.length && (var34_34 = class34.field189.field1330[var25_25]) != null && var34_34.field1354 != null) {
                                                                    var31_31 = var34_34.field1354;
                                                                    if (var31_31.field2663 != null) {
                                                                        var31_31 = var31_31.method5302();
                                                                    }
                                                                    var33_33 = var34_34.method3063();
                                                                }
                                                            }
                                                            var35_35 = null;
                                                            var26_26 = -1;
                                                            if (var20_20 != -1) {
                                                                var35_35 = class33.method520(var20_20);
                                                                var26_26 = var10_10.field4012;
                                                            }
                                                            if ((var29_29 = var10_10.method7420(class170.field1807, var35_35, var26_26, (boolean)var19_19, class407.field4693.field1121, (class247)var31_31, var33_33)) == null && class361.field3868) {
                                                                class122.method3325(var10_10);
                                                            }
                                                        } else {
                                                            var29_29 = var10_10.field3924.method7058(null, -1, class33.method520(class407.field4693.field1201), class407.field4693.field1237);
                                                        }
                                                    } else {
                                                        var29_29 = var10_10.field3916 == 0 ? client.field680.method7058(null, -1, null, -1) : class407.field4693.vmethod4447();
                                                    }
                                                } else {
                                                    var31_31 = class191.method4462(var10_10.field4010);
                                                    if (var31_31 != null) {
                                                        var29_29 = (var31_31 = var31_31.method5570(var10_10.field4011)).method5568(1);
                                                        if (var29_29 == null) {
                                                            class122.method3325(var10_10);
                                                        } else {
                                                            var29_29.method4600();
                                                            var22_22 = var29_29.field2116 / 2;
                                                        }
                                                    }
                                                }
                                                class182.method4020(var10_10.field3886 / 2 + var12_12, var13_13 + var10_10.field3887 * -1528330031 / 2);
                                                var23_23 = class182.field1954[var10_10.field3923] * var10_10.field4020 >> 16;
                                                var24_24 = class182.field1955[var10_10.field3923] * var10_10.field4020 >> 16;
                                                if (var29_29 != null) {
                                                    if (!var10_10.field3991) {
                                                        var29_29.method4561(0, var10_10.field3994, 0, var10_10.field3923, 0, var23_23, var24_24);
                                                    } else {
                                                        var29_29.method4600();
                                                        if (var10_10.field3867) {
                                                            var29_29.method4562(0, var10_10.field3994, var10_10.field3925, var10_10.field3923, var10_10.field3955, var23_23 + var22_22 + var10_10.field3922, var24_24 + var10_10.field3922, var10_10.field4020);
                                                        } else {
                                                            var29_29.method4561(0, var10_10.field3994, var10_10.field3925, var10_10.field3923, var10_10.field3955, var22_22 + var23_23 + var10_10.field3922, var24_24 + var10_10.field3922);
                                                        }
                                                    }
                                                }
                                                class182.method4023();
                                            }
                                            break block118;
                                        }
                                        if (!var10_10.field3991) ** GOTO lbl290
                                        var28_28 = var10_10.field4010 != -1 ? class380.method7641(var10_10.field4010, var10_10.field4011, var10_10.field3990, var10_10.field3881, var10_10.field3932, false) : var10_10.method7430(class170.field1807, false, class280.field3069);
                                        if (var28_28 == null) {
                                            if (class361.field3868) {
                                                class122.method3325(var10_10);
                                            }
                                        } else {
                                            var20_20 = var28_28.field5574;
                                            var21_21 = var28_28.field5575;
                                            if (!var10_10.field3912) {
                                                var22_22 = var10_10.field3886 * 4096 / var20_20;
                                                if (var10_10.field3889 != 0) {
                                                    var28_28.method10770(var10_10.field3886 / 2 + var12_12, var13_13 + var10_10.field3887 * -1528330031 / 2, var10_10.field3889, var22_22);
                                                } else if (var14_14 != 0) {
                                                    var28_28.method10751(var12_12, var13_13, var10_10.field3886, var10_10.field3887 * -1528330031, 256 - (var14_14 & 255));
                                                } else if (var20_20 == var10_10.field3886 && var10_10.field3887 * -1528330031 == var21_21) {
                                                    var28_28.method10774(var12_12, var13_13);
                                                } else {
                                                    var28_28.method10802(var12_12, var13_13, var10_10.field3886, var10_10.field3887 * -1528330031);
                                                }
                                            } else {
                                                class566.method10639(var12_12, var13_13, var12_12 + var10_10.field3886, var10_10.field3887 * -1528330031 + var13_13);
                                                var22_22 = (var20_20 - 1 + var10_10.field3886) / var20_20;
                                                var23_23 = (var21_21 - 1 + var10_10.field3887 * -1528330031) / var21_21;
                                                var24_24 = 0;
                                                while (true) {
                                                    if (var24_24 >= var22_22) {
                                                        class566.method10659(var2_2, var3_3, var4_4, var5_5);
                                                        break block118;
                                                    }
                                                    for (var25_25 = 0; var25_25 < var23_23; ++var25_25) {
                                                        if (var10_10.field3889 != 0) {
                                                            var28_28.method10770(var20_20 / 2 + var12_12 + var24_24 * var20_20, var21_21 / 2 + var13_13 + var21_21 * var25_25, var10_10.field3889, 4096);
                                                            continue;
                                                        }
                                                        if (var14_14 != 0) {
                                                            var28_28.method10773(var12_12 + var20_20 * var24_24, var13_13 + var25_25 * var21_21, 256 - (var14_14 & 255));
                                                            continue;
                                                        }
                                                        var28_28.method10774(var12_12 + var24_24 * var20_20, var13_13 + var21_21 * var25_25);
                                                    }
                                                    ++var24_24;
                                                }
lbl290:
                                                // 1 sources

                                                var28_28 = var10_10.method7430(class170.field1807, class268.method5754(var10_10), class280.field3069);
                                                if (var28_28 != null) {
                                                    var28_28.method10774(var12_12, var13_13);
                                                } else if (class361.field3868) {
                                                    class122.method3325(var10_10);
                                                }
                                            }
                                        }
                                        break block118;
                                    }
                                    var28_28 = var10_10.method7419(class170.field1807);
                                    if (var28_28 != null) {
                                        var29_29 = var10_10.field3911;
                                        if (!class268.method5754(var10_10)) {
                                            var20_20 = var10_10.field3896;
                                            if (var10_10 == class424.field4739 && var10_10.field3892 != 0) {
                                                var20_20 = var10_10.field3892;
                                            }
                                        } else {
                                            var20_20 = var10_10.field3897;
                                            if (var10_10 == class424.field4739 && var10_10.field3900 != 0) {
                                                var20_20 = var10_10.field3900;
                                            }
                                            if (var10_10.field3902.length() > 0) {
                                                var29_29 = var10_10.field3902;
                                            }
                                        }
                                        if (var10_10.field3991 && var10_10.field4010 != -1) {
                                            var30_30 = class191.method4462(var10_10.field4010);
                                            var29_29 = var30_30.field2848;
                                            if (var29_29 == null) {
                                                var29_29 = "null";
                                            }
                                            if ((var30_30.field2844 == 1 || var10_10.field4011 != 1) && var10_10.field4011 != -1) {
                                                var29_29 = class97.method2752(16748608) + (String)var29_29 + "</col>" + " " + 'x' + class526.method9938(var10_10.field4011);
                                            }
                                        }
                                        if (var10_10 == client.field668) {
                                            var29_29 = "Please wait...";
                                            var20_20 = var10_10.field3896;
                                        }
                                        if (!var10_10.field3991) {
                                            var29_29 = class28.method458((String)var29_29, var10_10);
                                        }
                                        var28_28.method8699((String)var29_29, var12_12, var13_13, var10_10.field3886, var10_10.field3887 * -1528330031, var20_20, var10_10.field3890 != false ? 0 : -1, class508.method9604(var10_10.field4015), var10_10.field3937, var10_10.field4001, var10_10.field3936);
                                    } else if (class361.field3868) {
                                        class122.method3325(var10_10);
                                    }
                                    break block118;
                                }
                                if (!class268.method5754(var10_10)) {
                                    var19_19 = var10_10.field3896;
                                    if (var10_10 == class424.field4739 && var10_10.field3892 != 0) {
                                        var19_19 = var10_10.field3892;
                                    }
                                } else {
                                    var19_19 = var10_10.field3897;
                                    if (var10_10 == class424.field4739 && var10_10.field3900 != 0) {
                                        var19_19 = var10_10.field3900;
                                    }
                                }
                                if (!var10_10.field3935) {
                                    if (var14_14 == 0) {
                                        class566.method10617(var12_12, var13_13, var10_10.field3886, var10_10.field3887 * -1528330031, var19_19);
                                    } else {
                                        class566.method10618(var12_12, var13_13, var10_10.field3886, var10_10.field3887 * -1528330031, var19_19, 256 - (var14_14 & 255));
                                    }
                                } else {
                                    switch (var10_10.field3905.field5554) {
                                        default: {
                                            if (var14_14 == 0) {
                                                class566.method10677(var12_12, var13_13, var10_10.field3886, var10_10.field3887 * -1528330031, var19_19);
                                                break;
                                            }
                                            class566.method10680(var12_12, var13_13, var10_10.field3886, var10_10.field3887 * -1528330031, var19_19, 256 - (var14_14 & 255));
                                            break;
                                        }
                                        case 1: {
                                            class566.method10614(var12_12, var13_13, var10_10.field3886, var10_10.field3887 * -1528330031, var10_10.field3896, var10_10.field3897);
                                            break;
                                        }
                                        case 2: {
                                            class566.method10615(var12_12, var13_13, var10_10.field3886, var10_10.field3887 * -1528330031, var10_10.field3896, var10_10.field3897, 255 - (var10_10.field4015 & 255), 255 - (var10_10.field3938 & 255));
                                            break;
                                        }
                                    }
                                }
                                break block118;
                            }
                            class337.method6885(var10_10, var12_12, var13_13, var11_11);
                            class566.method10659(var2_2, var3_3, var4_4, var5_5);
                            break block118;
                        }
                        class302.method6442(var10_10, var12_12, var13_13, var11_11);
                        class566.method10659(var2_2, var3_3, var4_4, var5_5);
                        break block118;
                    }
                    client.field652 = var12_12;
                    client.field653 = var13_13;
                    class138.method3495(var12_12, var13_13, var10_10.field3886, var10_10.field3887 * -1528330031);
                    client.field713[var10_10.field4021] = true;
                    class566.method10659(var2_2, var3_3, var4_4, var5_5);
                    break block118;
                }
                if (class544.field5403.method2983()) {
                    class100.field1278.method8685("Fps:" + class34.field163, var12_12 + var10_10.field3886, var13_13 += 15, 0xFFFF00, -1);
                    var13_13 += 15;
                    var28_28 = Runtime.getRuntime();
                    var20_20 = (int)((var28_28.totalMemory() - var28_28.freeMemory()) / 1024L);
                    var21_21 = 0xFFFF00;
                    if (var20_20 > 327680 && !client.field502) {
                        var21_21 = 0xFF0000;
                    }
                    class100.field1278.method8685("Mem:" + var20_20 + "k", var12_12 + var10_10.field3886, var13_13, var21_21, -1);
                    var13_13 += 15;
                }
            }
            ++var9_9;
        }
    }
}

