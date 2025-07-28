/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kq")
public class class275
extends Enum
implements class404 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lkq;")
    public static final /* enum */ class275 field3048 = new class275("runelite", 0, -1, 0.0f);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lkq;")
    public static final /* enum */ class275 field3044 = new class275("runelite", 1, 0, 0.5f);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lkq;")
    public static final /* enum */ class275 field3045 = new class275("runelite", 2, 1, 1.0f);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lkq;")
    public static final /* enum */ class275 field3046 = new class275("runelite", 3, 2, 2.0f);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lkq;")
    public static final /* enum */ class275 field3047 = new class275("runelite", 4, 3, 1.5f);
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lkq;")
    public static final /* enum */ class275 field3049 = new class275("runelite", 5, 4, 2.5f);
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lkq;")
    public static final /* enum */ class275 field3050 = new class275("runelite", 6, 5, 3.0f);
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lkq;")
    public static final /* enum */ class275 field3043 = new class275("runelite", 7, 6, 3.5f);
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lkq;")
    public static final /* enum */ class275 field3051 = new class275("runelite", 8, 7, 4.0f);
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="[Lkq;")
    static class275[] field3053;
    @ObfuscatedName(value="ac")
    final byte field3052;

    static {
        class275[] class275Array = new class275[9];
        class275[] class275Array2 = class275Array;
        class275[] class275Array3 = class275Array;
        9[0] = field3049;
        "runelite"[1] = field3047;
        "runelite"[2] = field3048;
        "runelite"[3] = field3044;
        "runelite"[4] = field3045;
        "runelite"[5] = field3051;
        "runelite"[6] = field3050;
        "runelite"[7] = field3043;
        "runelite"[8] = field3046;
        String string = "runelite";
        field3053 = string;
        VarpDefinition.method5158();
    }

    /*
     * WARNING - void declaration
     */
    @ObfuscatedSignature(descriptor="(BF)V", garbageValue="0.0")
    class275() {
        void var3_2;
        void var1_-1;
        this.field3052 = var3_2;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.field3052;
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="iz")
    @ObfuscatedSignature(descriptor="(Ldz;Lda;II)V", garbageValue="214683550")
    static final void method5935(class103 var0, Actor var1_1, int var2_2) {
        block67: {
            block69: {
                block68: {
                    block66: {
                        if (var1_1.field1263 < Client.cycle) break block66;
                        WorldMapSection2.method6018(var1_1);
                        break block67;
                    }
                    if (var1_1.field1199 < Client.cycle) break block68;
                    class329.method6646(var1_1);
                    break block67;
                }
                var1_1.field1238 = var1_1.field1201;
                if (var1_1.field1265 == 0) break block69;
                if (var1_1.field1240 == -1 || var1_1.field1271 != 0) ** GOTO lbl-1000
                var3_3 = class33.SequenceDefinition_get(var1_1.field1240);
                if (var1_1.field1270 > 0 && var3_3.field2941 == 0) {
                    ++var1_1.field1269;
                } else if (var1_1.field1270 <= 0 && var3_3.field2942 == 0) {
                    ++var1_1.field1269;
                } else lbl-1000:
                // 2 sources

                {
                    var12_4 = var1_1.x;
                    var4_5 = var1_1.field1196;
                    var5_6 = var1_1.field1266[var1_1.field1265 - 1] * 128 + var1_1.field1268 * 936633408;
                    var6_7 = var1_1.field1221[var1_1.field1265 - 1] * 128 + var1_1.field1268 * 936633408;
                    if (var12_4 >= var5_6) {
                        if (var12_4 <= var5_6) {
                            if (var4_5 < var6_7) {
                                var1_1.field1262 = 1024;
                            } else if (var4_5 > var6_7) {
                                var1_1.field1262 = 0;
                            }
                        } else {
                            var1_1.field1262 = var4_5 < var6_7 ? 768 : (var4_5 > var6_7 ? 256 : 512);
                        }
                    } else {
                        var1_1.field1262 = var4_5 < var6_7 ? 1280 : (var4_5 > var6_7 ? 1792 : 1536);
                    }
                    var7_8 = var1_1.field1264[var1_1.field1265 - 1];
                    if (var5_6 - var12_4 <= 256 && var5_6 - var12_4 >= -256 && var6_7 - var4_5 <= 256 && var6_7 - var4_5 >= -256) {
                        var8_9 = var1_1.field1262 - var1_1.field1197 & 2047;
                        if (var8_9 > 1024) {
                            var8_9 -= 2048;
                        }
                        var9_10 = var1_1.field1223;
                        if (var8_9 >= -256 && var8_9 <= 256) {
                            var9_10 = var1_1.field1204;
                        } else if (var8_9 >= 256 && var8_9 < 768) {
                            var9_10 = var1_1.field1207;
                        } else if (var8_9 >= -768 && var8_9 <= -256) {
                            var9_10 = var1_1.field1267;
                        }
                        if (var9_10 == -1) {
                            var9_10 = var1_1.field1204;
                        }
                        var1_1.field1238 = var9_10;
                        var10_11 = 4;
                        var11_12 = true;
                        if (var1_1 instanceof class105) {
                            var11_12 = ((class105)var1_1).field1354.field2624;
                        }
                        if (!var11_12) {
                            if (var1_1.field1265 > 1) {
                                var10_11 = 6;
                            }
                            if (var1_1.field1265 > 2) {
                                var10_11 = 8;
                            }
                            if (var1_1.field1269 > 0 && var1_1.field1265 > 1) {
                                var10_11 = 8;
                                --var1_1.field1269;
                            }
                        } else {
                            if (var1_1.field1197 != var1_1.field1262 && var1_1.field1230 == -1 && var1_1.field1200 != 0) {
                                var10_11 = 2;
                            }
                            if (var1_1.field1265 > 2) {
                                var10_11 = 6;
                            }
                            if (var1_1.field1265 > 3) {
                                var10_11 = 8;
                            }
                            if (var1_1.field1269 > 0 && var1_1.field1265 > 1) {
                                var10_11 = 8;
                                --var1_1.field1269;
                            }
                        }
                        if (var7_8 == class275.field3046) {
                            var10_11 <<= 1;
                        } else if (var7_8 == class275.field3044) {
                            var10_11 >>= 1;
                        }
                        if (var10_11 < 8) {
                            if (var10_11 <= 2) {
                                if (var1_1.field1238 == var1_1.field1204 && var1_1.field1212 != -1) {
                                    var1_1.field1238 = var1_1.field1212;
                                } else if (var1_1.field1238 == var1_1.field1223 && var1_1.field1234 != -1) {
                                    var1_1.field1238 = var1_1.field1234;
                                } else if (var1_1.field1267 == var1_1.field1238 && var1_1.field1214 != -1) {
                                    var1_1.field1238 = var1_1.field1214;
                                } else if (var1_1.field1238 == var1_1.field1207 && var1_1.field1220 != -1) {
                                    var1_1.field1238 = var1_1.field1220;
                                }
                            }
                        } else if (var1_1.field1204 == var1_1.field1238 && var1_1.field1257 != -1) {
                            var1_1.field1238 = var1_1.field1257;
                        } else if (var1_1.field1238 == var1_1.field1223 && var1_1.field1198 != -1) {
                            var1_1.field1238 = var1_1.field1198;
                        } else if (var1_1.field1238 == var1_1.field1267 && var1_1.field1210 != -1) {
                            var1_1.field1238 = var1_1.field1210;
                        } else if (var1_1.field1238 == var1_1.field1207 && var1_1.field1251 != -1) {
                            var1_1.field1238 = var1_1.field1251;
                        }
                        if (var12_4 != var5_6 || var6_7 != var4_5) {
                            if (var12_4 >= var5_6) {
                                if (var12_4 > var5_6) {
                                    var1_1.x -= var10_11;
                                    if (var1_1.x < var5_6) {
                                        var1_1.x = var5_6;
                                    }
                                }
                            } else {
                                var1_1.x += var10_11;
                                if (var1_1.x > var5_6) {
                                    var1_1.x = var5_6;
                                }
                            }
                            if (var4_5 >= var6_7) {
                                if (var4_5 > var6_7) {
                                    var1_1.field1196 -= var10_11;
                                    if (var1_1.field1196 < var6_7) {
                                        var1_1.field1196 = var6_7;
                                    }
                                }
                            } else {
                                var1_1.field1196 += var10_11;
                                if (var1_1.field1196 > var6_7) {
                                    var1_1.field1196 = var6_7;
                                }
                            }
                        }
                        if (var5_6 == var1_1.x && var6_7 == var1_1.field1196) {
                            --var1_1.field1265;
                            if (var1_1.field1270 > 0) {
                                --var1_1.field1270;
                            }
                        }
                    } else {
                        var1_1.x = var5_6;
                        var1_1.field1196 = var6_7;
                        --var1_1.field1265;
                        if (var1_1.field1270 > 0) {
                            --var1_1.field1270;
                        }
                    }
                }
                break block67;
            }
            var1_1.field1269 = 0;
        }
        if (var1_1.x < 128 || 13184 <= var1_1.x || var1_1.field1196 < 128 || 13184 <= var1_1.field1196) {
            var1_1.field1240 = -1;
            var1_1.field1263 = 0;
            var1_1.field1199 = 0;
            var1_1.method2780();
            var1_1.x = var1_1.field1266[0] * 128 + var1_1.field1268 * 936633408;
            var1_1.field1196 = var1_1.field1221[0] * 128 + var1_1.field1268 * 936633408;
            var1_1.method2774();
        }
        if (var1_1 == ModeWhere.localPlayer && (var1_1.x < 1536 || 11776 <= var1_1.x || var1_1.field1196 < 1536 || 11776 <= var1_1.field1196)) {
            var1_1.field1240 = -1;
            var1_1.field1263 = 0;
            var1_1.field1199 = 0;
            var1_1.method2780();
            var1_1.x = var1_1.field1266[0] * 128 + var1_1.field1268 * 936633408;
            var1_1.field1196 = var1_1.field1221[0] * 128 + var1_1.field1268 * 936633408;
            var1_1.method2774();
        }
        class96.method2710(var0, var1_1);
        SpotAnimationDefinition.method5375(var1_1);
    }
}

