package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="sx")
public abstract class class475
implements Comparator {
    @ObfuscatedName(value="ah")
    Comparator field5007;

    protected class475() {
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Ljava/util/Comparator;I)V", garbageValue="1210153578")
    final void method9182(Comparator comparator) {
        if (this.field5007 != null) {
            if (this.field5007 instanceof class475) {
                ((class475)this.field5007).method9182(comparator);
            }
        } else {
            this.field5007 = comparator;
        }
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Lso;Lso;I)I", garbageValue="-969612135")
    protected final int method9184(class474 class4742, class474 class4743) {
        if (this.field5007 == null) {
            return 0;
        }
        return this.field5007.compare(class4742, class4743);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="kq")
    @ObfuscatedSignature(descriptor="(Ldz;Lvv;I)V", garbageValue="-1570915856")
    static final void method9189(class103 var0, class555 var1_1) {
        var2_2 = 0;
        block0: while (true) {
            if (var2_2 >= client.field562) {
                return;
            }
            var3_3 = client.field567[var2_2];
            var4_4 = var0.field1330[var3_3];
            var5_5 = var1_1.method10282();
            if ((var5_5 & 16) != 0) {
                var6_6 = var1_1.method10282();
                var5_5 += var6_6 << 8;
            }
            if ((var5_5 & 2048) != 0) {
                var6_6 = var1_1.method10282();
                var5_5 += var6_6 << 16;
            }
            if ((var5_5 & 32) != 0) {
                var4_4.field1230 = var1_1.method10323();
                var4_4.field1230 += var1_1.method10312() << 16;
                var6_6 = 0xFFFFFF;
                if (var6_6 == var4_4.field1230) {
                    var4_4.field1230 = -1;
                }
            }
            if ((var5_5 & 4) != 0) {
                var4_4.field1216 = var1_1.method10290();
                var4_4.field1219 = 100;
            }
            if ((var5_5 & 262144) != 0) {
                var6_6 = var1_1.method10378();
                var4_4.field1202 = (var6_6 & 1) != 0 ? var1_1.method10307() : var4_4.field1354.field2626;
                var4_4.field1203 = (var6_6 & 2) != 0 ? var1_1.method10458() : var4_4.field1354.field2644;
                var4_4.field1204 = (var6_6 & 4) != 0 ? var1_1.method10323() : var4_4.field1354.field2628;
                var4_4.field1223 = (var6_6 & 8) != 0 ? var1_1.method10323() : var4_4.field1354.field2629;
                var4_4.field1267 = (var6_6 & 16) != 0 ? var1_1.method10323() : var4_4.field1354.field2630;
                var4_4.field1207 = (var6_6 & 32) != 0 ? var1_1.method10307() : var4_4.field1354.field2632;
                var4_4.field1257 = (var6_6 & 64) != 0 ? var1_1.method10334() : var4_4.field1354.field2659;
                var4_4.field1198 = (var6_6 & 128) != 0 ? var1_1.method10323() : var4_4.field1354.field2633;
                var4_4.field1210 = (var6_6 & 256) != 0 ? var1_1.method10307() : var4_4.field1354.field2634;
                var4_4.field1251 = (var6_6 & 512) != 0 ? var1_1.method10458() : var4_4.field1354.field2623;
                var4_4.field1212 = (var6_6 & 1024) != 0 ? var1_1.method10307() : var4_4.field1354.field2636;
                var4_4.field1234 = (var6_6 & 2048) != 0 ? var1_1.method10323() : var4_4.field1354.field2649;
                var4_4.field1214 = (var6_6 & 4096) != 0 ? var1_1.method10334() : var4_4.field1354.field2660;
                var4_4.field1220 = (var6_6 & 8192) != 0 ? var1_1.method10307() : var4_4.field1354.field2639;
                v0 = var4_4.field1201 = (var6_6 & 16384) != 0 ? var1_1.method10334() : var4_4.field1354.field2627;
            }
            if ((var5_5 & 65536) == 0) ** GOTO lbl45
            var6_6 = var1_1.method10314();
            var7_7 = 0;
            while (true) {
                block57: {
                    if (var7_7 < var6_6) break block57;
lbl45:
                    // 2 sources

                    if ((var5_5 & 2) != 0) {
                        var4_4.field1354 = class446.method8848(var1_1.method10307());
                        class97.method2736(var4_4);
                    }
                    if ((var5_5 & 4096) != 0) {
                        var4_4.method3022(var1_1.method10290());
                    }
                    if ((var5_5 & 8) == 0) ** GOTO lbl60
                    var6_6 = var1_1.method10314();
                    if (var6_6 <= 0) ** GOTO lbl56
                    var7_7 = 0;
                    while (true) {
                        block58: {
                            if (var7_7 < var6_6) break block58;
lbl56:
                            // 2 sources

                            if ((var7_7 = var1_1.method10314()) <= 0) ** GOTO lbl60
                            var8_8 = 0;
                            while (true) {
                                block59: {
                                    block56: {
                                        block55: {
                                            block64: {
                                                block54: {
                                                    block60: {
                                                        if (var8_8 < var7_7) break block59;
lbl60:
                                                        // 3 sources

                                                        if ((var5_5 & 256) != 0) {
                                                            var4_4.field1256 = client.field514 + var1_1.method10323();
                                                            var4_4.field1252 = client.field514 + var1_1.method10458();
                                                            var4_4.field1258 = var1_1.method10316();
                                                            var4_4.field1211 = var1_1.method10443();
                                                            var4_4.field1261 = var1_1.method10316();
                                                            var4_4.field1208 = (byte)var1_1.method10282();
                                                        }
                                                        if ((var5_5 & 64) != 0) {
                                                            var6_6 = var1_1.method10307();
                                                            if (var6_6 == 65535) {
                                                                var6_6 = -1;
                                                            }
                                                            var7_7 = var1_1.method10314();
                                                            if (var6_6 == var4_4.field1240 && var6_6 != -1) {
                                                                var8_8 = class33.method520((int)var6_6).field2943;
                                                                if (var8_8 == 1) {
                                                                    var4_4.field1241 = 0;
                                                                    var4_4.field1242 = 0;
                                                                    var4_4.field1271 = var7_7;
                                                                    var4_4.field1244 = 0;
                                                                }
                                                                if (var8_8 == 2) {
                                                                    var4_4.field1244 = 0;
                                                                }
                                                            } else if (var6_6 == -1 || var4_4.field1240 == -1 || class33.method520((int)var6_6).field2930 >= class33.method520((int)var4_4.field1240).field2930) {
                                                                var4_4.field1240 = var6_6;
                                                                var4_4.field1241 = 0;
                                                                var4_4.field1242 = 0;
                                                                var4_4.field1271 = var7_7;
                                                                var4_4.field1244 = 0;
                                                                var4_4.field1270 = var4_4.field1265;
                                                            }
                                                        }
                                                        if ((var5_5 & 8192) != 0) {
                                                            var4_4.field1247 = var1_1.method10315();
                                                            var4_4.field1249 = var1_1.method10524();
                                                            var4_4.field1248 = var1_1.method10315();
                                                            var4_4.field1250 = var1_1.method10315();
                                                            var4_4.field1263 = var1_1.method10458() + client.field514;
                                                            var4_4.field1199 = var1_1.method10323() + client.field514;
                                                            var4_4.field1253 = var1_1.method10323();
                                                            var4_4.field1265 = 1;
                                                            var4_4.field1270 = 0;
                                                            var4_4.field1247 += var4_4.field1266[0];
                                                            var4_4.field1249 += var4_4.field1221[0];
                                                            var4_4.field1248 += var4_4.field1266[0];
                                                            var4_4.field1250 += var4_4.field1221[0];
                                                        }
                                                        if ((var5_5 & 512) != 0) {
                                                            var4_4.field1209 = var1_1.method10440();
                                                        }
                                                        if ((var5_5 & 16384) == 0) break block54;
                                                        var6_6 = var1_1.method10282();
                                                        if ((var6_6 & 1) == 1) break block60;
                                                        var14_14 = null;
                                                        if ((var6_6 & 2) != 2) ** GOTO lbl115
                                                        var8_8 = var1_1.method10282();
                                                        var14_14 = new int[var8_8];
                                                        var9_9 = 0;
                                                        while (true) {
                                                            block61: {
                                                                if (var9_9 < var8_8) break block61;
lbl115:
                                                                // 2 sources

                                                                var15_15 = null;
                                                                if ((var6_6 & 4) != 4) ** GOTO lbl124
                                                                var9_9 = 0;
                                                                if (var4_4.field1354.field2641 != null) {
                                                                    var9_9 = var4_4.field1354.field2641.length;
                                                                }
                                                                var15_15 = new short[var9_9];
                                                                var10_10 = 0;
                                                                while (true) {
                                                                    block62: {
                                                                        if (var10_10 < var9_9) break block62;
lbl124:
                                                                        // 2 sources

                                                                        var16_16 = null;
                                                                        if ((var6_6 & 8) != 8) ** GOTO lbl133
                                                                        var10_10 = 0;
                                                                        if (var4_4.field1354.field2643 != null) {
                                                                            var10_10 = var4_4.field1354.field2643.length;
                                                                        }
                                                                        var16_16 = new short[var10_10];
                                                                        var11_11 = 0;
                                                                        while (true) {
                                                                            block63: {
                                                                                if (var11_11 < var10_10) break block63;
lbl133:
                                                                                // 2 sources

                                                                                var10_10 = 0;
                                                                                if ((var6_6 & 16) != 0) {
                                                                                    var10_10 = var1_1.method10341() == 1 ? 1 : 0;
                                                                                }
                                                                                var17_17 = ++class105.field1349 - 1;
                                                                                var4_4.method3019(new class246(var17_17, var14_14, var15_15, var16_16, (boolean)var10_10));
                                                                                break block54;
                                                                            }
                                                                            var16_16[var11_11] = (short)var1_1.method10323();
                                                                            ++var11_11;
                                                                        }
                                                                    }
                                                                    var15_15[var10_10] = (short)var1_1.method10458();
                                                                    ++var10_10;
                                                                }
                                                            }
                                                            var10_10 = var1_1.method10458();
                                                            var14_14[var9_9] = var10_10 = var10_10 == 65535 ? -1 : var10_10;
                                                            ++var9_9;
                                                        }
                                                    }
                                                    var4_4.method3028();
                                                }
                                                if ((var5_5 & 1) != 0) {
                                                    var6_6 = var1_1.method10307();
                                                    var7_7 = var1_1.method10307();
                                                    var4_4.field1235 = var1_1.method10341() == 1;
                                                    var4_4.field1233 = var6_6;
                                                    var4_4.field1205 = var7_7;
                                                }
                                                if ((var5_5 & 32768) == 0) break block55;
                                                var6_6 = var1_1.method10282();
                                                if ((var6_6 & 1) == 1) break block64;
                                                var14_14 = null;
                                                if ((var6_6 & 2) != 2) ** GOTO lbl171
                                                var8_8 = var1_1.method10282();
                                                var14_14 = new int[var8_8];
                                                var9_9 = 0;
                                                while (true) {
                                                    block65: {
                                                        if (var9_9 < var8_8) break block65;
lbl171:
                                                        // 2 sources

                                                        var15_15 = null;
                                                        if ((var6_6 & 4) != 4) ** GOTO lbl180
                                                        var9_9 = 0;
                                                        if (var4_4.field1354.field2641 != null) {
                                                            var9_9 = var4_4.field1354.field2641.length;
                                                        }
                                                        var15_15 = new short[var9_9];
                                                        var10_10 = 0;
                                                        while (true) {
                                                            block66: {
                                                                if (var10_10 < var9_9) break block66;
lbl180:
                                                                // 2 sources

                                                                var16_16 = null;
                                                                if ((var6_6 & 8) != 8) ** GOTO lbl189
                                                                var10_10 = 0;
                                                                if (var4_4.field1354.field2643 != null) {
                                                                    var10_10 = var4_4.field1354.field2643.length;
                                                                }
                                                                var16_16 = new short[var10_10];
                                                                var11_11 = 0;
                                                                while (true) {
                                                                    block67: {
                                                                        if (var11_11 < var10_10) break block67;
lbl189:
                                                                        // 2 sources

                                                                        var10_10 = 0;
                                                                        if ((var6_6 & 16) != 0) {
                                                                            var10_10 = var1_1.method10341() == 1 ? 1 : 0;
                                                                        }
                                                                        var17_17 = ++class105.field1352 - 1;
                                                                        var4_4.method3027(new class246(var17_17, var14_14, var15_15, var16_16, (boolean)var10_10));
                                                                        break block55;
                                                                    }
                                                                    var16_16[var11_11] = (short)var1_1.method10307();
                                                                    ++var11_11;
                                                                }
                                                            }
                                                            var15_15[var10_10] = (short)var1_1.method10323();
                                                            ++var10_10;
                                                        }
                                                    }
                                                    var10_10 = var1_1.method10323();
                                                    var14_14[var9_9] = var10_10 = var10_10 == 65535 ? -1 : var10_10;
                                                    ++var9_9;
                                                }
                                            }
                                            var4_4.method3014();
                                        }
                                        if ((var5_5 & 128) != 0) {
                                            var1_1.method10323();
                                            var1_1.method10440();
                                        }
                                        if ((var5_5 & 131072) != 0) {
                                            var6_6 = var1_1.method10282();
                                            if (var6_6 != 0) {
                                                var14_14 = new int[8];
                                                var15_15 = new short[8];
                                                var9_9 = 0;
                                                while (true) {
                                                    if (var9_9 >= 8) {
                                                        var4_4.method3023(var14_14, var15_15);
                                                        break block56;
                                                    }
                                                    if ((var6_6 & 1 << var9_9) == 0) {
                                                        var14_14[var9_9] = -1;
                                                        var15_15[var9_9] = -1;
                                                    } else {
                                                        var14_14[var9_9] = var1_1.method10476();
                                                        var15_15[var9_9] = (short)var1_1.method10441();
                                                    }
                                                    ++var9_9;
                                                }
                                            }
                                            var4_4.method3024();
                                        }
                                    }
                                    if ((var5_5 & 1024) != 0) {
                                        var4_4.method3013(var1_1.method10341());
                                    }
                                    ++var2_2;
                                    continue block0;
                                }
                                var9_9 = var1_1.method10407();
                                var10_10 = var1_1.method10407();
                                if (var10_10 == 32767) {
                                    var4_4.method2778(var9_9);
                                } else {
                                    var11_11 = var1_1.method10407();
                                    var12_12 = var1_1.method10312();
                                    var13_13 = var10_10 > 0 ? var1_1.method10312() : var12_12;
                                    var4_4.method2789(var9_9, client.field514, var10_10, var11_11, var12_12, var13_13);
                                }
                                ++var8_8;
                            }
                        }
                        var9_9 = -1;
                        var10_10 = -1;
                        var11_11 = -1;
                        var8_8 = var1_1.method10407();
                        if (var8_8 != 32767) {
                            if (var8_8 == 32766) {
                                var8_8 = -1;
                            } else {
                                var10_10 = var1_1.method10407();
                            }
                        } else {
                            var8_8 = var1_1.method10407();
                            var10_10 = var1_1.method10407();
                            var9_9 = var1_1.method10407();
                            var11_11 = var1_1.method10407();
                        }
                        var12_12 = var1_1.method10407();
                        var4_4.method2776(var8_8, var10_10, var9_9, var11_11, client.field514, var12_12);
                        ++var7_7;
                    }
                }
                var8_8 = var1_1.method10312();
                var9_9 = var1_1.method10307();
                var10_10 = var1_1.method10387();
                var4_4.method2794(var8_8, var9_9, var10_10 >> 16, var10_10 & 65535);
                ++var7_7;
            }
            break;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="oa")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1138663028")
    static void method9190() {
        if (class184.field1975 == null) return;
        client.field791 = client.field514;
        class184.field1975.method7940();
        int n = 0;
        while (n < class34.field189.field1329.length) {
            if (class34.field189.field1329[n] != null) {
                class184.field1975.method7943((class34.field189.field1329[n].field1213 >> 7) + class34.field189.field1324, (class34.field189.field1329[n].field1196 >> 7) + class34.field189.field1325);
            }
            ++n;
        }
        return;
    }
}

