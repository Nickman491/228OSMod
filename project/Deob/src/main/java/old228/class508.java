package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="tu")
public class class508 {
    @ObfuscatedName(value="an")
    static int[] field5156 = new int[32768];
    @ObfuscatedName(value="ae")
    public static int[] field5161;

    static {
        for (int i = 0; i < 32768; ++i) {
            class508.field5156[i] = class508.method9615(i);
        }
        class508.method9606();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-1848177861")
    static final int method9615(int n) {
        double d;
        double d2 = (double)(n >> 10 & 0x1F) / 31.0;
        double d3 = (double)(n >> 5 & 0x1F) / 31.0;
        double d4 = (double)(n & 0x1F) / 31.0;
        double d5 = d2;
        if (d3 < d5) {
            d5 = d3;
        }
        if (d4 < d5) {
            d5 = d4;
        }
        if (d3 > (d = d2)) {
            d = d3;
        }
        if (d4 > d) {
            d = d4;
        }
        double d6 = 0.0;
        double d7 = 0.0;
        double d8 = (d + d5) / 2.0;
        if (d != d5) {
            if (d8 < 0.5) {
                d7 = (d - d5) / (d + d5);
            }
            if (d8 >= 0.5) {
                d7 = (d - d5) / (2.0 - d - d5);
            }
            if (d == d2) {
                d6 = (d3 - d4) / (d - d5);
            } else if (d3 == d) {
                d6 = (d4 - d2) / (d - d5) + 2.0;
            } else if (d4 == d) {
                d6 = 4.0 + (d2 - d3) / (d - d5);
            }
        }
        int n2 = (int)(d6 * 256.0 / 6.0);
        n2 &= 0xFF;
        double d9 = 256.0 * d7;
        if (d9 < 0.0) {
            d9 = 0.0;
        } else if (d9 > 255.0) {
            d9 = 255.0;
        }
        if (d8 > 0.7) {
            d9 /= 2.0;
            d9 = Math.floor(d9);
        }
        if (d8 > 0.75) {
            d9 /= 2.0;
            d9 = Math.floor(d9);
        }
        if (d8 > 0.85) {
            d9 /= 2.0;
            d9 = Math.floor(d9);
        }
        if (d8 > 0.95) {
            d9 /= 2.0;
            d9 = Math.floor(d9);
        }
        if (d8 > 0.995) {
            d8 = 0.995;
        }
        int n3 = (int)((double)(n2 / 4 * 8) + d9 / 32.0);
        return (n3 << 7) + (int)(d8 * 128.0);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="8")
    static void method9606() {
        if (field5161 != null) {
            return;
        }
        field5161 = new int[65536];
        double d = 0.95f;
        int n = 0;
        while (n < 65536) {
            double d2;
            double d3 = (double)(n >> 10 & 0x3F) / 64.0 + 0.0078125;
            double d4 = (double)(n >> 7 & 7) / 8.0 + 0.0625;
            double d5 = d2 = (double)(n & 0x7F) / 128.0;
            double d6 = d2;
            double d7 = d2;
            if (d4 != 0.0) {
                double d8 = d2 < 0.5 ? d2 * (1.0 + d4) : d2 + d4 - d2 * d4;
                double d9 = d2 * 2.0 - d8;
                double d10 = 0.3333333333333333 + d3;
                if (d10 > 1.0) {
                    d10 -= 1.0;
                }
                double d11 = d3;
                double d12 = d3 - 0.3333333333333333;
                if (d12 < 0.0) {
                    d12 += 1.0;
                }
                d5 = 6.0 * d10 < 1.0 ? d9 + (d8 - d9) * 6.0 * d10 : (2.0 * d10 < 1.0 ? d8 : (3.0 * d10 < 2.0 ? d9 + 6.0 * ((d8 - d9) * (0.6666666666666666 - d10)) : d9));
                d6 = 6.0 * d11 < 1.0 ? d9 + d11 * ((d8 - d9) * 6.0) : (2.0 * d11 < 1.0 ? d8 : (3.0 * d11 < 2.0 ? (d8 - d9) * (0.6666666666666666 - d11) * 6.0 + d9 : d9));
                d7 = 6.0 * d12 < 1.0 ? d9 + d12 * ((d8 - d9) * 6.0) : (d12 * 2.0 < 1.0 ? d8 : (3.0 * d12 < 2.0 ? d9 + (0.6666666666666666 - d12) * (d8 - d9) * 6.0 : d9));
            }
            d5 = Math.pow(d5, d);
            d6 = Math.pow(d6, d);
            d7 = Math.pow(d7, d);
            int n2 = (int)(d5 * 256.0);
            int n3 = (int)(256.0 * d6);
            int n4 = (int)(d7 * 256.0);
            int n5 = n4 + (n3 << 8) + (n2 << 16);
            class508.field5161[n] = n5 & 0xFFFFFF;
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(ILdb;B)Ldz;", garbageValue="54")
    public static class103 method9616(int n, class97 class972) {
        class103 class1032;
        Iterator iterator = class972.iterator();
        do {
            if (!iterator.hasNext()) {
                return class972.method2726();
            }
            class1032 = (class103)iterator.next();
        } while (class1032.field1330[n] == null);
        return class1032;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="-24")
    public static int method9604(int n) {
        return 255 - (n & 0xFF);
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="([BIII)Z", garbageValue="-1811127083")
    static final boolean method9614(byte[] var0, int var1_1, int var2_2) {
        var3_3 = true;
        var4_4 = new class556(var0);
        var5_5 = -1;
        block0: while (true) lbl-1000:
        // 3 sources

        {
            if ((var6_6 = var4_4.method10297()) == 0) {
                return var3_3;
            }
            var5_5 += var6_6;
            var7_7 = 0;
            var8_8 = false;
            while (true) {
                block4: {
                    if (var8_8) break block4;
                    var9_9 = var4_4.method10407();
                    if (var9_9 == 0) ** GOTO lbl-1000
                    var10_10 = (var7_7 += var9_9 - 1) & 63;
                    var11_11 = var7_7 >> 6 & 63;
                    var12_12 = var4_4.method10282() >> 2;
                    var13_13 = var11_11 + var1_1;
                    var14_14 = var10_10 + var2_2;
                    if (var13_13 <= 0 || var14_14 <= 0 || var13_13 >= 103 || var14_14 >= 103) continue;
                    var15_15 = class142.method3512(var5_5);
                    if (var12_12 == 22 && client.field502 && var15_15.field2833 == 0 && var15_15.field2806 != 1 && !var15_15.field2827) continue;
                    if (!var15_15.method5511()) {
                        ++client.field561;
                        var3_3 = false;
                    }
                    var8_8 = true;
                    continue;
                }
                var9_9 = var4_4.method10407();
                if (var9_9 == 0) continue block0;
                var4_4.method10282();
            }
            break;
        }
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(ILdm;ZB)I", garbageValue="17")
    static int method9608(int n, class81 class812, boolean bl) {
        class361 class3612;
        class361 class3613 = class3612 = bl ? class134.field1564 : class9.field45;
        if (n != 1600) {
            if (n != 1601) {
                class359 class3592;
                if (n != 1602) {
                    if (n != 1603) {
                        if (n != 1604) {
                            if (n != 1605) {
                                if (n != 1606) {
                                    if (n != 1607) {
                                        if (n != 1608) {
                                            if (n != 1609) {
                                                if (n != 1610) {
                                                    if (n != 1611) {
                                                        if (n != 1612) {
                                                            if (n != 1613) {
                                                                if (n != 1614) {
                                                                    Object object;
                                                                    if (n == 1617) {
                                                                        object = class3612.method7445();
                                                                        int n2 = class72.field865[++class63.field444 - 1] = object != null ? ((class353)object).field3783 : 0;
                                                                    }
                                                                    if (n != 1618) {
                                                                        if (n != 1619) {
                                                                            if (n != 1620) {
                                                                                if (n != 1621) {
                                                                                    if (n != 1622) {
                                                                                        if (n != 1623) {
                                                                                            if (n != 1624) {
                                                                                                if (n != 1625) {
                                                                                                    if (n != 1626) {
                                                                                                        if (n != 1627) {
                                                                                                            if (n != 1628) {
                                                                                                                if (n != 1629) {
                                                                                                                    if (n != 1630) {
                                                                                                                        if (n != 1631) {
                                                                                                                            if (n != 1632) {
                                                                                                                                if (n != 1633) {
                                                                                                                                    if (n != 1634) {
                                                                                                                                        return 2;
                                                                                                                                    }
                                                                                                                                    object = class3612.method7535();
                                                                                                                                    class72.field865[class63.field444 - 1] = object != null ? ((class27)object).method409((char)class72.field865[class63.field444 - 1]) : 0;
                                                                                                                                    return 1;
                                                                                                                                }
                                                                                                                                object = class3612.method7535();
                                                                                                                                class72.field865[class63.field444 - 1] = object != null ? ((class27)object).method449(class72.field865[class63.field444 - 1]) : 0;
                                                                                                                                return 1;
                                                                                                                            }
                                                                                                                            object = class3612.method7444();
                                                                                                                            class72.field865[++class63.field444 - 1] = object != null ? ((class359)object).method7371() : 0;
                                                                                                                            return 1;
                                                                                                                        }
                                                                                                                        object = class3612.method7444();
                                                                                                                        class72.field865[++class63.field444 - 1] = object != null ? ((class359)object).method7193() : 0;
                                                                                                                        return 1;
                                                                                                                    }
                                                                                                                    object = class3612.method7444();
                                                                                                                    class72.field865[++class63.field444 - 1] = object != null ? ((class359)object).method7191() : 0;
                                                                                                                    return 1;
                                                                                                                }
                                                                                                                object = class3612.method7444();
                                                                                                                class72.field865[++class63.field444 - 1] = object != null ? ((class359)object).method7157() : 0;
                                                                                                                return 1;
                                                                                                            }
                                                                                                            object = class3612.method7444();
                                                                                                            class72.field865[++class63.field444 - 1] = object != null ? ((class359)object).method7259() : 0;
                                                                                                            return 1;
                                                                                                        }
                                                                                                        object = class3612.method7444();
                                                                                                        int n3 = object != null ? ((class359)object).method7184() : 0;
                                                                                                        int n4 = object != null ? ((class359)object).method7259() : 0;
                                                                                                        class72.field865[++class63.field444 - 1] = Math.min(n3, n4);
                                                                                                        class72.field865[++class63.field444 - 1] = Math.max(n3, n4);
                                                                                                        return 1;
                                                                                                    }
                                                                                                    object = class3612.method7444();
                                                                                                    class72.field855[++class104.field1343 - 1] = object != null ? ((class359)object).method7179().method8809() : "";
                                                                                                    return 1;
                                                                                                }
                                                                                                object = class3612.method7444();
                                                                                                class72.field865[++class63.field444 - 1] = object != null && ((class359)object).method7181() ? 1 : 0;
                                                                                                return 1;
                                                                                            }
                                                                                            object = class3612.method7444();
                                                                                            class72.field865[++class63.field444 - 1] = object != null && ((class359)object).method7221() ? 1 : 0;
                                                                                            return 1;
                                                                                        }
                                                                                        object = class3612.method7444();
                                                                                        class72.field865[++class63.field444 - 1] = object != null ? ((class359)object).method7190() : 0;
                                                                                        return 1;
                                                                                    }
                                                                                    object = class3612.method7444();
                                                                                    class72.field865[++class63.field444 - 1] = object != null ? ((class359)object).method7189() : 0;
                                                                                    return 1;
                                                                                }
                                                                                object = class3612.method7444();
                                                                                class72.field865[++class63.field444 - 1] = object != null ? ((class359)object).method7188() : 0;
                                                                                return 1;
                                                                            }
                                                                            object = class3612.method7445();
                                                                            class72.field865[++class63.field444 - 1] = object != null ? ((class353)object).field3782 : 0;
                                                                            return 1;
                                                                        }
                                                                        object = class3612.method7444();
                                                                        class72.field855[++class104.field1343 - 1] = object != null ? ((class359)object).method7363().method8533() : "";
                                                                        return 1;
                                                                    }
                                                                    object = class3612.method7445();
                                                                    class72.field865[++class63.field444 - 1] = object != null ? ((class353)object).field3781 : 0;
                                                                    return 1;
                                                                }
                                                                class72.field865[++class63.field444 - 1] = class3612.field3931 ? 1 : 0;
                                                                return 1;
                                                            }
                                                            class72.field865[++class63.field444 - 1] = class3612.field3905.vmethod10703();
                                                            return 1;
                                                        }
                                                        class72.field865[++class63.field444 - 1] = class3612.field3897;
                                                        return 1;
                                                    }
                                                    class72.field865[++class63.field444 - 1] = class3612.field3896;
                                                    return 1;
                                                }
                                                class72.field865[++class63.field444 - 1] = class3612.field3938;
                                                return 1;
                                            }
                                            class72.field865[++class63.field444 - 1] = class3612.field4015;
                                            return 1;
                                        }
                                        class72.field865[++class63.field444 - 1] = class3612.field3994;
                                        return 1;
                                    }
                                    class72.field865[++class63.field444 - 1] = class3612.field3925;
                                    return 1;
                                }
                                class72.field865[++class63.field444 - 1] = class3612.field3923;
                                return 1;
                            }
                            class72.field865[++class63.field444 - 1] = class3612.field4020;
                            return 1;
                        }
                        class72.field865[++class63.field444 - 1] = class3612.field3895;
                        return 1;
                    }
                    class72.field865[++class63.field444 - 1] = class3612.field3894;
                    return 1;
                }
                if (class3612.field3873 != 12 || (class3592 = class3612.method7444()) == null) {
                    class72.field855[++class104.field1343 - 1] = class3612.field3911;
                    return 1;
                }
                class72.field855[++class104.field1343 - 1] = class3592.method7331().method8533();
                return 1;
            }
            class72.field865[++class63.field444 - 1] = class3612.field3899;
            return 1;
        }
        class72.field865[++class63.field444 - 1] = class3612.field3987;
        return 1;
    }

    @ObfuscatedName(value="lz")
    @ObfuscatedSignature(descriptor="(IIIIIILjava/lang/String;Ljava/lang/String;III)V", garbageValue="-1815579932")
    public static final void method9611(int n, int n2, int n3, int n4, int n5, int n6, String string, String string2, int n7, int n8) {
        class324 class3242;
        int n9;
        class514 class5142;
        class514 class5143;
        class103 class1032 = null;
        if (n6 >= 0 && class34.field189.field1318[n6] != null) {
            class1032 = class34.field189.field1318[n6].field5035;
        } else if (n6 == -1) {
            class1032 = class34.field189;
        }
        if (class1032 == null) {
            return;
        }
        int n10 = class1032.field1324;
        int n11 = class1032.field1325;
        class105[] class105Array = class1032.field1330;
        class94[] class94Array = class1032.field1329;
        if (n3 >= 2000) {
            n3 -= 2000;
        }
        if (n3 == 1002) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            class5143 = class90.method2629(class322.field3333, client.field564.field1446);
            ((class324)class5143).field3442.method10320(n4);
            client.field564.method3257((class324)class5143);
        }
        if (n3 == 50 && (class5143 = class94Array[n4]) != null) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            client.field744 = n;
            client.field745 = n2;
            class5142 = class90.method2629(class322.field3325, client.field564.field1446);
            ((class324)class5142).field3442.method10320(n4);
            ((class324)class5142).field3442.method10300(client.field731.method5776(82) ? 1 : 0);
            client.field564.method3257((class324)class5142);
        }
        if (n3 == 13 && (class5143 = class105Array[n4]) != null) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            client.field744 = n;
            client.field745 = n2;
            class5142 = class90.method2629(class322.field3378, client.field564.field1446);
            ((class324)class5142).field3442.method10266(n4);
            ((class324)class5142).field3442.method10311(client.field731.method5776(82) ? 1 : 0);
            client.field564.method3257((class324)class5142);
        }
        if (n3 == 60) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 1;
            client.field622 = 0;
            class5143 = class90.method2629(class322.field3355, client.field564.field1446);
            ((class324)class5143).field3442.method10311(n4);
            client.field564.method3257((class324)class5143);
        }
        if (n3 == 23) {
            if (client.field647) {
                class1032.field1319.method4232();
            } else {
                class1032.field1319.method4235(true);
            }
        }
        if (n3 == 1004) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            class5143 = class90.method2629(class322.field3341, client.field564.field1446);
            ((class324)class5143).field3442.method10454(n4);
            ((class324)class5143).field3442.method10266(n11 + n2);
            ((class324)class5143).field3442.method10266(n + n10);
            client.field564.method3257((class324)class5143);
        }
        if (n3 == 48 && (class5143 = class94Array[n4]) != null) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            client.field744 = n;
            client.field745 = n2;
            class5142 = class90.method2629(class322.field3389, client.field564.field1446);
            ((class324)class5142).field3442.method10266(n4);
            ((class324)class5142).field3442.method10310(client.field731.method5776(82) ? 1 : 0);
            client.field564.method3257((class324)class5142);
        }
        if (n3 == 1) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            client.field744 = n;
            client.field745 = n2;
            class5143 = class90.method2629(class322.field3393, client.field564.field1446);
            ((class324)class5143).field3442.method10319(n + n10);
            ((class324)class5143).field3442.method10319(class143.field1637);
            ((class324)class5143).field3442.method10333(class271.field3015);
            ((class324)class5143).field3442.method10266(n11 + n2);
            ((class324)class5143).field3442.method10320(n4);
            ((class324)class5143).field3442.method10319(class72.field866);
            ((class324)class5143).field3442.method10310(client.field731.method5776(82) ? 1 : 0);
            client.field564.method3257((class324)class5143);
        }
        if (n3 == 12 && (class5143 = class105Array[n4]) != null) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            client.field744 = n;
            client.field745 = n2;
            class5142 = class90.method2629(class322.field3347, client.field564.field1446);
            ((class324)class5142).field3442.method10300(client.field731.method5776(82) ? 1 : 0);
            ((class324)class5142).field3442.method10266(n4);
            client.field564.method3257((class324)class5142);
        }
        if (n3 == 1008 || n3 == 1009 || n3 == 1010 || n3 == 1011 || n3 == 1012) {
            class420.field4722.method9776(n3, n4, new class350(n), new class350(n2));
        }
        if (n3 == 18) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            client.field744 = n;
            client.field745 = n2;
            class5143 = class90.method2629(class322.field3375, client.field564.field1446);
            ((class324)class5143).field3442.method10319(n + n10);
            ((class324)class5143).field3442.method10454(n4);
            ((class324)class5143).field3442.method10319(n11 + n2);
            ((class324)class5143).field3442.method10477(client.field731.method5776(82) ? 1 : 0);
            client.field564.method3257((class324)class5143);
        }
        if ((n3 == 57 || n3 == 1007) && (class5143 = class170.field1807.method7023(n2, n)) != null) {
            URLLoader.method3271(n4, n2, n, n5, string2);
        }
        if (n3 == 44 && (class5143 = class94Array[n4]) != null) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            client.field744 = n;
            client.field745 = n2;
            class5142 = class90.method2629(class322.field3380, client.field564.field1446);
            ((class324)class5142).field3442.method10477(client.field731.method5776(82) ? 1 : 0);
            ((class324)class5142).field3442.method10454(n4);
            client.field564.method3257((class324)class5142);
        }
        if (n3 == 2) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            client.field744 = n;
            client.field745 = n2;
            class5143 = class90.method2629(class322.field3326, client.field564.field1446);
            ((class324)class5143).field3442.method10332(class33.field149);
            ((class324)class5143).field3442.method10266(n11 + n2);
            ((class324)class5143).field3442.method10320(n4);
            ((class324)class5143).field3442.method10310(client.field731.method5776(82) ? 1 : 0);
            ((class324)class5143).field3442.method10266(client.field660);
            ((class324)class5143).field3442.method10320(client.field659);
            ((class324)class5143).field3442.method10320(n + n10);
            client.field564.method3257((class324)class5143);
        }
        if (n3 == 11 && (class5143 = class105Array[n4]) != null) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            client.field744 = n;
            client.field745 = n2;
            class5142 = class90.method2629(class322.field3397, client.field564.field1446);
            ((class324)class5142).field3442.method10320(n4);
            ((class324)class5142).field3442.method10310(client.field731.method5776(82) ? 1 : 0);
            client.field564.method3257((class324)class5142);
        }
        if (n3 == 7 && (class5143 = class105Array[n4]) != null) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            client.field744 = n;
            client.field745 = n2;
            class5142 = class90.method2629(class322.field3404, client.field564.field1446);
            ((class324)class5142).field3442.method10320(n4);
            ((class324)class5142).field3442.method10266(class72.field866);
            ((class324)class5142).field3442.method10310(client.field731.method5776(82) ? 1 : 0);
            ((class324)class5142).field3442.method10454(class143.field1637);
            ((class324)class5142).field3442.method10333(class271.field3015);
            client.field564.method3257((class324)class5142);
        }
        if (n3 == 46 && (class5143 = class94Array[n4]) != null) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            client.field744 = n;
            client.field745 = n2;
            class5142 = class90.method2629(class322.field3339, client.field564.field1446);
            ((class324)class5142).field3442.method10320(n4);
            ((class324)class5142).field3442.method10300(client.field731.method5776(82) ? 1 : 0);
            client.field564.method3257((class324)class5142);
        }
        if (n3 == 1001) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            client.field744 = n;
            client.field745 = n2;
            class5143 = class90.method2629(class322.field3356, client.field564.field1446);
            ((class324)class5143).field3442.method10477(client.field731.method5776(82) ? 1 : 0);
            ((class324)class5143).field3442.method10319(n + n10);
            ((class324)class5143).field3442.method10320(n11 + n2);
            ((class324)class5143).field3442.method10319(n4);
            client.field564.method3257((class324)class5143);
        }
        if (n3 == 58 && (class5143 = class170.field1807.method7023(n2, n)) != null) {
            if (((class361)class5143).field3985 != null) {
                class5142 = new class90();
                ((class90)class5142).field1077 = class5143;
                ((class90)class5142).field1076 = n4;
                ((class90)class5142).field1085 = string2;
                ((class90)class5142).field1086 = ((class361)class5143).field3985;
                class471.method9136((class90)class5142);
            }
            class5142 = class90.method2629(class322.field3412, client.field564.field1446);
            ((class324)class5142).field3442.method10331(class33.field149);
            ((class324)class5142).field3442.method10266(n);
            ((class324)class5142).field3442.method10332(n2);
            ((class324)class5142).field3442.method10320(client.field659);
            ((class324)class5142).field3442.method10320(n5);
            ((class324)class5142).field3442.method10266(client.field660);
            client.field564.method3257((class324)class5142);
        }
        if (n3 == 30 && client.field668 == null) {
            class212.method4861(n2, n);
            client.field668 = class170.field1807.method7023(n2, n);
            class122.method3325(client.field668);
        }
        if (n3 == 29) {
            class5143 = class90.method2629(class322.field3369, client.field564.field1446);
            ((class324)class5143).field3442.method10268(n2);
            client.field564.method3257((class324)class5143);
            class5142 = class170.field1807.method7031(n2);
            if (class5142 != null && ((class361)class5142).field4002 != null && ((class361)class5142).field4002[0][0] == 5 && class349.field3763[n9 = ((class361)class5142).field4002[0][1]] != ((class361)class5142).field4004[0]) {
                class349.field3763[n9] = ((class361)class5142).field4004[0];
                class272.method5848(n9);
            }
        }
        if (n3 == 17) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            client.field744 = n;
            client.field745 = n2;
            class5143 = class90.method2629(class322.field3402, client.field564.field1446);
            ((class324)class5143).field3442.method10266(n + n10);
            ((class324)class5143).field3442.method10319(n11 + n2);
            ((class324)class5143).field3442.method10320(n4);
            ((class324)class5143).field3442.method10332(class33.field149);
            ((class324)class5143).field3442.method10454(client.field660);
            ((class324)class5143).field3442.method10300(client.field731.method5776(82) ? 1 : 0);
            ((class324)class5143).field3442.method10319(client.field659);
            client.field564.method3257((class324)class5143);
        }
        if (n3 == 5) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            client.field744 = n;
            client.field745 = n2;
            class5143 = class90.method2629(class322.field3362, client.field564.field1446);
            ((class324)class5143).field3442.method10320(n4);
            ((class324)class5143).field3442.method10320(n + n10);
            ((class324)class5143).field3442.method10310(client.field731.method5776(82) ? 1 : 0);
            ((class324)class5143).field3442.method10319(n11 + n2);
            client.field564.method3257((class324)class5143);
        }
        if (n3 == 22) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            client.field744 = n;
            client.field745 = n2;
            class5143 = class90.method2629(class322.field3391, client.field564.field1446);
            ((class324)class5143).field3442.method10311(client.field731.method5776(82) ? 1 : 0);
            ((class324)class5143).field3442.method10266(n11 + n2);
            ((class324)class5143).field3442.method10454(n + n10);
            ((class324)class5143).field3442.method10319(n4);
            client.field564.method3257((class324)class5143);
        }
        if (n3 == 1003) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            class5143 = class105Array[n4];
            if (class5143 != null) {
                class5142 = ((class105)class5143).field1354;
                if (((class247)class5142).field2663 != null) {
                    class5142 = ((class247)class5142).method5302();
                }
                if (class5142 != null) {
                    class3242 = class90.method2629(class322.field3383, client.field564.field1446);
                    class3242.field3442.method10454(((class247)class5142).field2625);
                    client.field564.method3257(class3242);
                }
            }
        }
        if (n3 == 4) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            client.field744 = n;
            client.field745 = n2;
            class5143 = class90.method2629(class322.field3394, client.field564.field1446);
            ((class324)class5143).field3442.method10454(n11 + n2);
            ((class324)class5143).field3442.method10320(n4);
            ((class324)class5143).field3442.method10266(n + n10);
            ((class324)class5143).field3442.method10300(client.field731.method5776(82) ? 1 : 0);
            client.field564.method3257((class324)class5143);
        }
        if (n3 == 3) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            client.field744 = n;
            client.field745 = n2;
            class5143 = class90.method2629(class322.field3363, client.field564.field1446);
            ((class324)class5143).field3442.method10320(n11 + n2);
            ((class324)class5143).field3442.method10300(client.field731.method5776(82) ? 1 : 0);
            ((class324)class5143).field3442.method10320(n4);
            ((class324)class5143).field3442.method10320(n + n10);
            client.field564.method3257((class324)class5143);
        }
        if (n3 == 9 && (class5143 = class105Array[n4]) != null) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            client.field744 = n;
            client.field745 = n2;
            class5142 = class90.method2629(class322.field3358, client.field564.field1446);
            ((class324)class5142).field3442.method10477(client.field731.method5776(82) ? 1 : 0);
            ((class324)class5142).field3442.method10319(n4);
            client.field564.method3257((class324)class5142);
        }
        if (n3 == 14 && (class5143 = class94Array[n4]) != null) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            client.field744 = n;
            client.field745 = n2;
            class5142 = class90.method2629(class322.field3377, client.field564.field1446);
            ((class324)class5142).field3442.method10268(class271.field3015);
            ((class324)class5142).field3442.method10320(class72.field866);
            ((class324)class5142).field3442.method10310(client.field731.method5776(82) ? 1 : 0);
            ((class324)class5142).field3442.method10266(class143.field1637);
            ((class324)class5142).field3442.method10319(n4);
            client.field564.method3257((class324)class5142);
        }
        if (n3 == 19) {
            client.field620 = n7;
            client.field717 = n8;
            client.field603 = 2;
            client.field622 = 0;
            client.field744 = n;
            client.field745 = n2;
            class5143 = class90.method2629(class322.field3343, client.field564.field1446);
            ((class324)class5143).field3442.method10320(n4);
            ((class324)class5143).field3442.method10320(n + n10);
            ((class324)class5143).field3442.method10266(n11 + n2);
            ((class324)class5143).field3442.method10300(client.field731.method5776(82) ? 1 : 0);
            client.field564.method3257((class324)class5143);
        }
        if (n3 != 25) {
            if (n3 == 24 && (class5143 = class170.field1807.method7031(n2)) != null) {
                boolean bl = true;
                if (((class361)class5143).field3875 > 0) {
                    bl = class469.method9092((class361)class5143);
                }
                if (bl) {
                    class3242 = class90.method2629(class322.field3369, client.field564.field1446);
                    class3242.field3442.method10268(n2);
                    client.field564.method3257(class3242);
                }
            }
            if (n3 == 21) {
                client.field620 = n7;
                client.field717 = n8;
                client.field603 = 2;
                client.field622 = 0;
                client.field744 = n;
                client.field745 = n2;
                class5143 = class90.method2629(class322.field3334, client.field564.field1446);
                ((class324)class5143).field3442.method10320(n11 + n2);
                ((class324)class5143).field3442.method10320(n4);
                ((class324)class5143).field3442.method10319(n + n10);
                ((class324)class5143).field3442.method10310(client.field731.method5776(82) ? 1 : 0);
                client.field564.method3257((class324)class5143);
            }
            if (n3 == 6) {
                client.field620 = n7;
                client.field717 = n8;
                client.field603 = 2;
                client.field622 = 0;
                client.field744 = n;
                client.field745 = n2;
                class5143 = class90.method2629(class322.field3360, client.field564.field1446);
                ((class324)class5143).field3442.method10266(n + n10);
                ((class324)class5143).field3442.method10266(n4);
                ((class324)class5143).field3442.method10454(n11 + n2);
                ((class324)class5143).field3442.method10311(client.field731.method5776(82) ? 1 : 0);
                client.field564.method3257((class324)class5143);
            }
            if (n3 == 8 && (class5143 = class105Array[n4]) != null) {
                client.field620 = n7;
                client.field717 = n8;
                client.field603 = 2;
                client.field622 = 0;
                client.field744 = n;
                client.field745 = n2;
                class5142 = class90.method2629(class322.field3322, client.field564.field1446);
                ((class324)class5142).field3442.method10311(client.field731.method5776(82) ? 1 : 0);
                ((class324)class5142).field3442.method10320(n4);
                ((class324)class5142).field3442.method10454(client.field659);
                ((class324)class5142).field3442.method10332(class33.field149);
                ((class324)class5142).field3442.method10320(client.field660);
                client.field564.method3257((class324)class5142);
            }
            if (n3 == 15 && (class5143 = class94Array[n4]) != null) {
                client.field620 = n7;
                client.field717 = n8;
                client.field603 = 2;
                client.field622 = 0;
                client.field744 = n;
                client.field745 = n2;
                class5142 = class90.method2629(class322.field3318, client.field564.field1446);
                ((class324)class5142).field3442.method10477(client.field731.method5776(82) ? 1 : 0);
                ((class324)class5142).field3442.method10454(client.field659);
                ((class324)class5142).field3442.method10268(class33.field149);
                ((class324)class5142).field3442.method10266(n4);
                ((class324)class5142).field3442.method10266(client.field660);
                client.field564.method3257((class324)class5142);
            }
            if (n3 == 10 && (class5143 = class105Array[n4]) != null) {
                client.field620 = n7;
                client.field717 = n8;
                client.field603 = 2;
                client.field622 = 0;
                client.field744 = n;
                client.field745 = n2;
                class5142 = class90.method2629(class322.field3373, client.field564.field1446);
                ((class324)class5142).field3442.method10320(n4);
                ((class324)class5142).field3442.method10310(client.field731.method5776(82) ? 1 : 0);
                client.field564.method3257((class324)class5142);
            }
            if (n3 == 28) {
                class5143 = class90.method2629(class322.field3369, client.field564.field1446);
                ((class324)class5143).field3442.method10268(n2);
                client.field564.method3257((class324)class5143);
                class5142 = class170.field1807.method7031(n2);
                if (class5142 != null && ((class361)class5142).field4002 != null && ((class361)class5142).field4002[0][0] == 5) {
                    n9 = ((class361)class5142).field4002[0][1];
                    class349.field3763[n9] = 1 - class349.field3763[n9];
                    class272.method5848(n9);
                }
            }
            if (n3 == 26) {
                class365.method7584();
            }
            if (n3 == 16) {
                client.field620 = n7;
                client.field717 = n8;
                client.field603 = 2;
                client.field622 = 0;
                client.field744 = n;
                client.field745 = n2;
                class5143 = class90.method2629(class322.field3387, client.field564.field1446);
                ((class324)class5143).field3442.method10266(class72.field866);
                ((class324)class5143).field3442.method10320(class143.field1637);
                ((class324)class5143).field3442.method10266(n11 + n2);
                ((class324)class5143).field3442.method10333(class271.field3015);
                ((class324)class5143).field3442.method10266(n + n10);
                ((class324)class5143).field3442.method10320(n4);
                ((class324)class5143).field3442.method10310(client.field731.method5776(82) ? 1 : 0);
                client.field564.method3257((class324)class5143);
            }
            if (n3 == 49 && (class5143 = class94Array[n4]) != null) {
                client.field620 = n7;
                client.field717 = n8;
                client.field603 = 2;
                client.field622 = 0;
                client.field744 = n;
                client.field745 = n2;
                class5142 = class90.method2629(class322.field3353, client.field564.field1446);
                ((class324)class5142).field3442.method10310(client.field731.method5776(82) ? 1 : 0);
                ((class324)class5142).field3442.method10319(n4);
                client.field564.method3257((class324)class5142);
            }
            if (n3 == 47 && (class5143 = class94Array[n4]) != null) {
                client.field620 = n7;
                client.field717 = n8;
                client.field603 = 2;
                client.field622 = 0;
                client.field744 = n;
                client.field745 = n2;
                class5142 = class90.method2629(class322.field3332, client.field564.field1446);
                ((class324)class5142).field3442.method10320(n4);
                ((class324)class5142).field3442.method10477(client.field731.method5776(82) ? 1 : 0);
                client.field564.method3257((class324)class5142);
            }
            if (n3 == 51 && (class5143 = class94Array[n4]) != null) {
                client.field620 = n7;
                client.field717 = n8;
                client.field603 = 2;
                client.field622 = 0;
                client.field744 = n;
                client.field745 = n2;
                class5142 = class90.method2629(class322.field3351, client.field564.field1446);
                ((class324)class5142).field3442.method10320(n4);
                ((class324)class5142).field3442.method10477(client.field731.method5776(82) ? 1 : 0);
                client.field564.method3257((class324)class5142);
            }
            if (n3 == 45 && (class5143 = class94Array[n4]) != null) {
                client.field620 = n7;
                client.field717 = n8;
                client.field603 = 2;
                client.field622 = 0;
                client.field744 = n;
                client.field745 = n2;
                class5142 = class90.method2629(class322.field3348, client.field564.field1446);
                ((class324)class5142).field3442.method10320(n4);
                ((class324)class5142).field3442.method10477(client.field731.method5776(82) ? 1 : 0);
                client.field564.method3257((class324)class5142);
            }
            if (n3 == 20) {
                client.field620 = n7;
                client.field717 = n8;
                client.field603 = 2;
                client.field622 = 0;
                client.field744 = n;
                client.field745 = n2;
                class5143 = class90.method2629(class322.field3321, client.field564.field1446);
                ((class324)class5143).field3442.method10300(client.field731.method5776(82) ? 1 : 0);
                ((class324)class5143).field3442.method10266(n + n10);
                ((class324)class5143).field3442.method10266(n4);
                ((class324)class5143).field3442.method10319(n11 + n2);
                client.field564.method3257((class324)class5143);
            }
            if (client.field496 != 0) {
                client.field496 = 0;
                class122.method3325(class170.field1807.method7031(class271.field3015));
            }
            if (client.field522) {
                class278.method5969();
            }
            return;
        }
        class5143 = class170.field1807.method7023(n2, n);
        if (class5143 != null) {
            class278.method5969();
            class302.method6464(n2, n, class298.method6401(class232.method5133((class361)class5143)), n5);
            client.field496 = 0;
            client.field661 = class47.method905((class361)class5143);
            if (client.field661 == null) {
                client.field661 = "null";
            }
            client.field662 = ((class361)class5143).field3991 ? ((class361)class5143).field4024 + class97.method2752(0xFFFFFF) : class97.method2752(65280) + ((class361)class5143).field4006 + class97.method2752(0xFFFFFF);
        }
    }
}

