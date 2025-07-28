/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pj")
@Implements(value="GrandExchangeEvent")
public class GrandExchangeEvent {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=38001761)
    @Export(value="world")
    public final int world;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(longValue=5386861718554422505L)
    @Export(value="age")
    public final long age;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lpu;")
    @Export(value="grandExchangeOffer")
    public final GrandExchangeOffer grandExchangeOffer;
    @ObfuscatedName(value="ao")
    @Export(value="offerName")
    String offerName;
    @ObfuscatedName(value="ad")
    @Export(value="previousOfferName")
    String previousOfferName;

    @ObfuscatedSignature(descriptor="(Lvy;BI)V")
    GrandExchangeEvent(Buffer buffer, byte by, int n) {
        this.offerName = buffer.readStringCp1252NullTerminated();
        this.previousOfferName = buffer.readStringCp1252NullTerminated();
        this.world = buffer.readUnsignedShort();
        this.age = buffer.readLong();
        int n2 = buffer.readInt();
        int n3 = buffer.readInt();
        this.grandExchangeOffer = new GrandExchangeOffer();
        this.grandExchangeOffer.method7918(2);
        this.grandExchangeOffer.method7919(by);
        this.grandExchangeOffer.unitPrice = n2;
        this.grandExchangeOffer.totalQuantity = n3;
        this.grandExchangeOffer.currentQuantity = 0;
        this.grandExchangeOffer.currentPrice = 0;
        this.grandExchangeOffer.id = n;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="1560869395")
    @Export(value="getOfferName")
    public String getOfferName() {
        return this.offerName;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="1718272041")
    @Export(value="getPreviousOfferName")
    public String getPreviousOfferName() {
        return this.previousOfferName;
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Ldz;I)V", garbageValue="1354859132")
    static final void method7903(class103 var0) {
        var1_1 = var0.field1322;
        var2_2 = var0.field1323;
        var3_3 = var0.field1328;
        var4_4 = var0.field1337;
        var5_5 = var0.field1319;
        var6_6 = var0.field1336;
        var7_7 = 0;
        while (true) {
            block92: {
                if (var7_7 < 4) break block92;
                if ((Tiles.field1039 += (int)(Math.random() * 5.0) - 2) < -8) {
                    Tiles.field1039 = -8;
                }
                if (Tiles.field1039 > 8) {
                    Tiles.field1039 = 8;
                }
                if ((Tiles.field1040 += (int)(Math.random() * 5.0) - 2) < -16) {
                    Tiles.field1040 = -16;
                }
                if (Tiles.field1040 > 16) {
                    Tiles.field1040 = 16;
                }
                var7_7 = 0;
                block1: while (true) {
                    block93: {
                        if (var7_7 < 4) break block93;
                        var5_5.method4205(-50, -10, -50);
                        var7_7 = 0;
                        while (true) {
                            block94: {
                                if (var7_7 < var1_1) break block94;
                                var7_7 = 1;
                                var8_8 = 2;
                                var9_9 = 4;
                                var10_10 = 0;
                                while (true) {
                                    if (var10_10 >= 4) {
                                        return;
                                    }
                                    if (var10_10 > 0) {
                                        var7_7 <<= 3;
                                        var8_8 <<= 3;
                                        var9_9 <<= 3;
                                    }
                                    for (var11_11 = 0; var11_11 <= var10_10; ++var11_11) {
                                        for (var12_12 = 0; var12_12 <= var2_2; ++var12_12) {
                                            block6: for (var13_13 = 0; var13_13 <= var1_1; ++var13_13) {
                                                if ((class538.field5380[var11_11][var13_13][var12_12] & var7_7) == 0) ** GOTO lbl64
                                                var15_15 = var12_12;
                                                var16_16 = var11_11;
                                                var17_17 = var11_11;
                                                for (var14_14 = var12_12; var14_14 > 0 && (class538.field5380[var11_11][var13_13][var14_14 - 1] & var7_7) != 0; --var14_14) {
                                                }
                                                while (var15_15 < var2_2 && (class538.field5380[var11_11][var13_13][var15_15 + 1] & var7_7) != 0) {
                                                    ++var15_15;
                                                }
                                                while (true) {
                                                    if (var16_16 <= 0) ** GOTO lbl52
                                                    for (var18_18 = var14_14; var18_18 <= var15_15; ++var18_18) {
                                                        if ((class538.field5380[var16_16 - 1][var13_13][var18_18] & var7_7) != 0) continue;
lbl52:
                                                        // 2 sources

                                                        while (true) {
                                                            if (var17_17 >= var10_10) ** GOTO lbl56
                                                            for (var18_18 = var14_14; var18_18 <= var15_15; ++var18_18) {
                                                                if ((class538.field5380[var17_17 + 1][var13_13][var18_18] & var7_7) != 0) continue;
lbl56:
                                                                // 2 sources

                                                                if ((var18_18 = (var15_15 - var14_14 + 1) * (var17_17 + 1 - var16_16)) < 8) ** GOTO lbl64
                                                                var19_19 = 240;
                                                                var20_20 = var3_3[var17_17][var13_13][var14_14] - var19_19;
                                                                var21_21 = var3_3[var16_16][var13_13][var14_14];
                                                                var5_5.method4405(var10_10, 1, var13_13 * 128, var13_13 * 128, var14_14 * 128, var15_15 * 128 + 128, var20_20, var21_21);
                                                                var22_22 = var16_16;
                                                                while (true) {
                                                                    block95: {
                                                                        if (var22_22 <= var17_17) break block95;
lbl64:
                                                                        // 3 sources

                                                                        if ((class538.field5380[var11_11][var13_13][var12_12] & var8_8) == 0) ** GOTO lbl89
                                                                        var15_15 = var13_13;
                                                                        var16_16 = var11_11;
                                                                        var17_17 = var11_11;
                                                                        for (var14_14 = var13_13; var14_14 > 0 && (class538.field5380[var11_11][var14_14 - 1][var12_12] & var8_8) != 0; --var14_14) {
                                                                        }
                                                                        while (var15_15 < var1_1 && (class538.field5380[var11_11][var15_15 + 1][var12_12] & var8_8) != 0) {
                                                                            ++var15_15;
                                                                        }
                                                                        while (true) {
                                                                            if (var16_16 <= 0) ** GOTO lbl77
                                                                            for (var18_18 = var14_14; var18_18 <= var15_15; ++var18_18) {
                                                                                if ((class538.field5380[var16_16 - 1][var18_18][var12_12] & var8_8) != 0) continue;
lbl77:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    if (var17_17 >= var10_10) ** GOTO lbl81
                                                                                    for (var18_18 = var14_14; var18_18 <= var15_15; ++var18_18) {
                                                                                        if ((class538.field5380[var17_17 + 1][var18_18][var12_12] & var8_8) != 0) continue;
lbl81:
                                                                                        // 2 sources

                                                                                        if ((var18_18 = (var17_17 + 1 - var16_16) * (var15_15 - var14_14 + 1)) < 8) ** GOTO lbl89
                                                                                        var19_19 = 240;
                                                                                        var20_20 = var3_3[var17_17][var14_14][var12_12] - var19_19;
                                                                                        var21_21 = var3_3[var16_16][var14_14][var12_12];
                                                                                        var5_5.method4405(var10_10, 2, var14_14 * 128, var15_15 * 128 + 128, var12_12 * 128, var12_12 * 128, var20_20, var21_21);
                                                                                        var22_22 = var16_16;
                                                                                        while (true) {
                                                                                            block96: {
                                                                                                if (var22_22 <= var17_17) break block96;
lbl89:
                                                                                                // 3 sources

                                                                                                if ((class538.field5380[var11_11][var13_13][var12_12] & var9_9) == 0) continue block6;
                                                                                                var14_14 = var13_13;
                                                                                                var15_15 = var13_13;
                                                                                                var17_17 = var12_12;
                                                                                                for (var16_16 = var12_12; var16_16 > 0 && (class538.field5380[var11_11][var13_13][var16_16 - 1] & var9_9) != 0; --var16_16) {
                                                                                                }
                                                                                                while (var17_17 < var2_2 && (class538.field5380[var11_11][var13_13][var17_17 + 1] & var9_9) != 0) {
                                                                                                    ++var17_17;
                                                                                                }
                                                                                                while (true) {
                                                                                                    if (var14_14 <= 0) ** GOTO lbl102
                                                                                                    for (var18_18 = var16_16; var18_18 <= var17_17; ++var18_18) {
                                                                                                        if ((class538.field5380[var11_11][var14_14 - 1][var18_18] & var9_9) != 0) continue;
lbl102:
                                                                                                        // 2 sources

                                                                                                        while (true) {
                                                                                                            if (var15_15 >= var1_1) ** GOTO lbl106
                                                                                                            for (var18_18 = var16_16; var18_18 <= var17_17; ++var18_18) {
                                                                                                                if ((class538.field5380[var11_11][var15_15 + 1][var18_18] & var9_9) != 0) continue;
lbl106:
                                                                                                                // 2 sources

                                                                                                                if ((var17_17 - var16_16 + 1) * (var15_15 - var14_14 + 1) < 4) continue block6;
                                                                                                                var18_18 = var3_3[var11_11][var14_14][var16_16];
                                                                                                                var5_5.method4405(var10_10, 4, var14_14 * 128, var15_15 * 128 + 128, var16_16 * 128, var17_17 * 128 + 128, var18_18, var18_18);
                                                                                                                for (var19_19 = var14_14; var19_19 <= var15_15; ++var19_19) {
                                                                                                                    var20_20 = var16_16;
                                                                                                                    while (var20_20 <= var17_17) {
                                                                                                                        v0 = class538.field5380[var11_11][var19_19];
                                                                                                                        v1 = var20_20++;
                                                                                                                        v0[v1] = v0[v1] & ~var9_9;
                                                                                                                    }
                                                                                                                }
                                                                                                                continue block6;
                                                                                                            }
                                                                                                            ++var15_15;
                                                                                                        }
                                                                                                    }
                                                                                                    --var14_14;
                                                                                                }
                                                                                            }
                                                                                            for (var23_23 = var14_14; var23_23 <= var15_15; ++var23_23) {
                                                                                                v2 = class538.field5380[var22_22][var23_23];
                                                                                                v3 = var12_12;
                                                                                                v2[v3] = v2[v3] & ~var8_8;
                                                                                            }
                                                                                            ++var22_22;
                                                                                        }
                                                                                    }
                                                                                    ++var17_17;
                                                                                }
                                                                            }
                                                                            --var16_16;
                                                                        }
                                                                    }
                                                                    var23_23 = var14_14;
                                                                    while (var23_23 <= var15_15) {
                                                                        v4 = class538.field5380[var22_22][var13_13];
                                                                        v5 = var23_23++;
                                                                        v4[v5] = v4[v5] & ~var7_7;
                                                                    }
                                                                    ++var22_22;
                                                                }
                                                            }
                                                            ++var17_17;
                                                        }
                                                    }
                                                    --var16_16;
                                                }
                                            }
                                        }
                                    }
                                    ++var10_10;
                                }
                            }
                            for (var8_8 = 0; var8_8 < var2_2; ++var8_8) {
                                if ((var4_4[1][var7_7][var8_8] & 2) != 2) continue;
                                var5_5.method4201(var7_7, var8_8);
                            }
                            ++var7_7;
                        }
                    }
                    var52_51 = Tiles.Tiles_underlays2[var7_7];
                    var9_9 = 96;
                    var10_10 = 768;
                    var11_11 = -50;
                    var12_12 = -10;
                    var13_13 = -50;
                    var14_14 = (int)Math.sqrt(5100.0);
                    var15_15 = var14_14 * 768 >> 8;
                    var16_16 = 1;
                    while (true) {
                        if (var16_16 >= var2_2 - 1) {
                            var16_16 = 0;
                            while (true) {
                                if (var16_16 >= var2_2) {
                                    var16_16 = -5;
                                    block34: while (true) {
                                        if (var16_16 >= var1_1 + 5) {
                                            var16_16 = 1;
                                            while (true) {
                                                if (var16_16 >= var2_2 - 1) {
                                                    SecureRandomCallable.Tiles_underlays[var7_7] = null;
                                                    SecureRandomFuture.Tiles_overlays[var7_7] = null;
                                                    Tiles.Tiles_shapes[var7_7] = null;
                                                    Tiles.field1026[var7_7] = null;
                                                    Tiles.Tiles_underlays2[var7_7] = null;
                                                    ++var7_7;
                                                    continue block1;
                                                }
                                                for (var17_17 = 1; var17_17 < var1_1 - 1; ++var17_17) {
                                                    var53_52 = var5_5;
                                                    var19_19 = var7_7;
                                                    var20_20 = var17_17;
                                                    var21_21 = var16_16;
                                                    var22_22 = (var0.field1337[var7_7][var17_17][var16_16] & 8) == 0 ? (var7_7 > 0 && (var0.field1337[1][var17_17][var16_16] & 2) != 0 ? var7_7 - 1 : var7_7) : 0;
                                                    var53_52.method4233(var19_19, var20_20, var21_21, var22_22);
                                                }
                                                ++var16_16;
                                            }
                                        }
                                        var17_17 = 0;
                                        while (true) {
                                            if (var17_17 >= var2_2) {
                                                if (var16_16 >= 1 && var16_16 < var1_1 - 1) {
                                                    var17_17 = 0;
                                                    var18_18 = 0;
                                                    var19_19 = 0;
                                                    var20_20 = 0;
                                                    var21_21 = 0;
                                                    for (var22_22 = -5; var22_22 < var2_2 + 5; ++var22_22) {
                                                        var23_23 = var22_22 + 5;
                                                        if (var23_23 >= 0 && var23_23 < var2_2) {
                                                            var17_17 = InvDefinition.Tiles_hue[var23_23] + var17_17;
                                                            var18_18 = Tiles.Tiles_saturation[var23_23] + var18_18;
                                                            var19_19 = Tiles.Tiles_lightness[var23_23] + var19_19;
                                                            var20_20 = class4.Tiles_hueMultiplier[var23_23] + var20_20;
                                                            var21_21 = class557.field5476[var23_23] + var21_21;
                                                        }
                                                        if ((var24_24 = var22_22 - 5) >= 0 && var24_24 < var2_2) {
                                                            var17_17 -= InvDefinition.Tiles_hue[var24_24];
                                                            var18_18 -= Tiles.Tiles_saturation[var24_24];
                                                            var19_19 -= Tiles.Tiles_lightness[var24_24];
                                                            var20_20 -= class4.Tiles_hueMultiplier[var24_24];
                                                            var21_21 -= class557.field5476[var24_24];
                                                        }
                                                        if (var22_22 < 1 || var22_22 >= var2_2 - 1 || Client.isLowDetail && (var4_4[0][var16_16][var22_22] & 2) == 0 && (var4_4[var7_7][var16_16][var22_22] & 16) != 0) continue;
                                                        if (var7_7 < Tiles.Tiles_minPlane) {
                                                            Tiles.Tiles_minPlane = var7_7;
                                                        }
                                                        var25_25 = (long)Math.pow(2.0, 15.0) - 1L;
                                                        var27_26 = (int)var25_25;
                                                        var28_27 = SecureRandomCallable.Tiles_underlays[var7_7][var16_16][var22_22] & var27_26;
                                                        var29_28 = SecureRandomFuture.Tiles_overlays[var7_7][var16_16][var22_22] & var27_26;
                                                        if (var28_27 <= 0 && var29_28 <= 0) continue;
                                                        var30_29 = var3_3[var7_7][var16_16][var22_22];
                                                        var31_30 = var3_3[var7_7][var16_16 + 1][var22_22];
                                                        var32_31 = var3_3[var7_7][var16_16 + 1][var22_22 + 1];
                                                        var33_32 = var3_3[var7_7][var16_16][var22_22 + 1];
                                                        var34_33 = WorldMapID.field3244[var16_16][var22_22];
                                                        var35_34 = WorldMapID.field3244[var16_16 + 1][var22_22];
                                                        var36_35 = WorldMapID.field3244[var16_16 + 1][var22_22 + 1];
                                                        var37_36 = WorldMapID.field3244[var16_16][var22_22 + 1];
                                                        var38_37 = -1;
                                                        var39_38 = -1;
                                                        if (var28_27 > 0) {
                                                            var40_39 = var17_17 * 256 / var20_20;
                                                            var41_40 = var18_18 / var21_21;
                                                            var42_41 = var19_19 / var21_21;
                                                            var38_37 = class28.method462(var40_39, var41_40, var42_41);
                                                            var40_39 = var40_39 + Tiles.field1039 & 255;
                                                            if ((var42_41 += Tiles.field1040) < 0) {
                                                                var42_41 = 0;
                                                            } else if (var42_41 > 255) {
                                                                var42_41 = 255;
                                                            }
                                                            var39_38 = class28.method462(var40_39, var41_40, var42_41);
                                                        }
                                                        if (var7_7 > 0) {
                                                            var40_39 = 1;
                                                            if (var28_27 == 0 && Tiles.Tiles_shapes[var7_7][var16_16][var22_22] != 0) {
                                                                var40_39 = 0;
                                                            }
                                                            if (var29_28 > 0) {
                                                                var42_41 = var29_28 - 1;
                                                                var43_42 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get(var42_41);
                                                                if (var43_42 == null) {
                                                                    var44_43 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var42_41);
                                                                    var43_42 = new FloorOverlayDefinition();
                                                                    if (var44_43 != null) {
                                                                        var43_42.decode(new Buffer(var44_43), var42_41);
                                                                    }
                                                                    var43_42.postDecode();
                                                                    FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var43_42, var42_41);
                                                                    var54_53 = var43_42;
                                                                } else {
                                                                    var54_53 = var43_42;
                                                                }
                                                                if (!var54_53.hideUnderlay) {
                                                                    var40_39 = 0;
                                                                }
                                                            }
                                                            if (var40_39 != 0 && var31_30 == var30_29 && var30_29 == var32_31 && var30_29 == var33_32) {
                                                                v6 = class538.field5380[var7_7][var16_16];
                                                                v7 = var22_22;
                                                                v6[v7] = v6[v7] | 2340;
                                                            }
                                                        }
                                                        var40_39 = 0;
                                                        if (var39_38 != -1) {
                                                            var40_39 = SceneTileModel.Rasterizer3D_colorPalette[class140.method3505(var39_38, 96)];
                                                        }
                                                        if (var29_28 != 0) {
                                                            var41_40 = Tiles.Tiles_shapes[var7_7][var16_16][var22_22] + 1;
                                                            var42_41 = Tiles.field1026[var7_7][var16_16][var22_22];
                                                            var55_54 = var29_28 - 1;
                                                            var45_44 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get(var55_54);
                                                            if (var45_44 == null) {
                                                                var46_45 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var55_54);
                                                                var45_44 = new FloorOverlayDefinition();
                                                                if (var46_45 != null) {
                                                                    var45_44.decode(new Buffer(var46_45), var55_54);
                                                                }
                                                                var45_44.postDecode();
                                                                FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var45_44, var55_54);
                                                                var43_42 = var45_44;
                                                            } else {
                                                                var43_42 = var45_44;
                                                            }
                                                            var45_44 = var43_42;
                                                            var56_55 = var45_44.texture;
                                                            if (var56_55 < 0) {
                                                                if (var45_44.primaryRgb != 0xFF00FF) {
                                                                    var47_46 = class28.method462(var45_44.hue, var45_44.saturation, var45_44.lightness);
                                                                    var49_48 = var45_44.hue + Tiles.field1039 & 255;
                                                                    var50_49 = var45_44.lightness + Tiles.field1040;
                                                                    if (var50_49 < 0) {
                                                                        var50_49 = 0;
                                                                    } else if (var50_49 > 255) {
                                                                        var50_49 = 255;
                                                                    }
                                                                    var48_47 = class28.method462(var49_48, var45_44.saturation, var50_49);
                                                                } else {
                                                                    var47_46 = -2;
                                                                    var56_55 = -1;
                                                                    var48_47 = -2;
                                                                }
                                                            } else {
                                                                var48_47 = SceneTileModel.field1957.Rasterizer3D_textureLoader.getAverageTextureRGB(var56_55);
                                                                var47_46 = -1;
                                                            }
                                                            var49_48 = 0;
                                                            if (var48_47 != -2) {
                                                                var49_48 = SceneTileModel.Rasterizer3D_colorPalette[MenuAction.method2362(var48_47, 96)];
                                                            }
                                                            if (var45_44.secondaryRgb != -1) {
                                                                var50_49 = var45_44.secondaryHue + Tiles.field1039 & 255;
                                                                var51_50 = var45_44.secondaryLightness + Tiles.field1040;
                                                                if (var51_50 < 0) {
                                                                    var51_50 = 0;
                                                                } else if (var51_50 > 255) {
                                                                    var51_50 = 255;
                                                                }
                                                                var48_47 = class28.method462(var50_49, var45_44.secondarySaturation, var51_50);
                                                                var49_48 = SceneTileModel.Rasterizer3D_colorPalette[MenuAction.method2362(var48_47, 96)];
                                                            }
                                                            var5_5.method4179(var7_7, var16_16, var22_22, var41_40, var42_41, var56_55, var30_29, var31_30, var32_31, var33_32, class140.method3505(var38_37, var34_33), class140.method3505(var38_37, var35_34), class140.method3505(var38_37, var36_35), class140.method3505(var38_37, var37_36), MenuAction.method2362(var47_46, var34_33), MenuAction.method2362(var47_46, var35_34), MenuAction.method2362(var47_46, var36_35), MenuAction.method2362(var47_46, var37_36), var40_39, var49_48);
                                                            continue;
                                                        }
                                                        var5_5.method4179(var7_7, var16_16, var22_22, 0, 0, -1, var30_29, var31_30, var32_31, var33_32, class140.method3505(var38_37, var34_33), class140.method3505(var38_37, var35_34), class140.method3505(var38_37, var36_35), class140.method3505(var38_37, var37_36), 0, 0, 0, 0, var40_39, 0);
                                                    }
                                                }
                                                ++var16_16;
                                                continue block34;
                                            }
                                            var18_18 = var16_16 + 5;
                                            if (var18_18 >= 0 && var18_18 < var1_1 && (var22_22 = SecureRandomCallable.Tiles_underlays[var7_7][var18_18][var17_17] & (var21_21 = (int)(var57_56 = (long)Math.pow(2.0, 15.0) - 1L))) > 0) {
                                                var59_57 = MenuAction.method2365(var22_22 - 1);
                                                v8 = var17_17;
                                                InvDefinition.Tiles_hue[v8] = InvDefinition.Tiles_hue[v8] + var59_57.hue;
                                                v9 = var17_17;
                                                Tiles.Tiles_saturation[v9] = Tiles.Tiles_saturation[v9] + var59_57.saturation;
                                                v10 = var17_17;
                                                Tiles.Tiles_lightness[v10] = Tiles.Tiles_lightness[v10] + var59_57.lightness;
                                                v11 = var17_17;
                                                class4.Tiles_hueMultiplier[v11] = class4.Tiles_hueMultiplier[v11] + var59_57.hueMultiplier;
                                                v12 = var17_17;
                                                class557.field5476[v12] = class557.field5476[v12] + 1;
                                            }
                                            if ((var19_19 = var16_16 - 5) >= 0 && var19_19 < var1_1 && (var23_23 = SecureRandomCallable.Tiles_underlays[var7_7][var19_19][var17_17] & (var22_22 = (int)(var60_58 = (long)Math.pow(2.0, 15.0) - 1L))) > 0) {
                                                var62_59 = MenuAction.method2365(var23_23 - 1);
                                                v13 = var17_17;
                                                InvDefinition.Tiles_hue[v13] = InvDefinition.Tiles_hue[v13] - var62_59.hue;
                                                v14 = var17_17;
                                                Tiles.Tiles_saturation[v14] = Tiles.Tiles_saturation[v14] - var62_59.saturation;
                                                v15 = var17_17;
                                                Tiles.Tiles_lightness[v15] = Tiles.Tiles_lightness[v15] - var62_59.lightness;
                                                v16 = var17_17;
                                                class4.Tiles_hueMultiplier[v16] = class4.Tiles_hueMultiplier[v16] - var62_59.hueMultiplier;
                                                v17 = var17_17;
                                                class557.field5476[v17] = class557.field5476[v17] - 1;
                                            }
                                            ++var17_17;
                                        }
                                        break;
                                    }
                                }
                                InvDefinition.Tiles_hue[var16_16] = 0;
                                Tiles.Tiles_saturation[var16_16] = 0;
                                Tiles.Tiles_lightness[var16_16] = 0;
                                class4.Tiles_hueMultiplier[var16_16] = 0;
                                class557.field5476[var16_16] = 0;
                                ++var16_16;
                            }
                        }
                        for (var17_17 = 1; var17_17 < var1_1 - 1; ++var17_17) {
                            var18_18 = var3_3[var7_7][var17_17 + 1][var16_16] - var3_3[var7_7][var17_17 - 1][var16_16];
                            var19_19 = var3_3[var7_7][var17_17][var16_16 + 1] - var3_3[var7_7][var17_17][var16_16 - 1];
                            var20_20 = (int)Math.sqrt(var18_18 * var18_18 + var19_19 * var19_19 + 65536);
                            var21_21 = (var18_18 << 8) / var20_20;
                            var22_22 = 65536 / var20_20;
                            var23_23 = (var19_19 << 8) / var20_20;
                            var24_24 = (var21_21 * -50 + var23_23 * -50 + var22_22 * -10) / var15_15 + 96;
                            var63_60 = (var52_51[var17_17][var16_16 + 1] >> 3) + (var52_51[var17_17 - 1][var16_16] >> 2) + (var52_51[var17_17][var16_16 - 1] >> 2) + (var52_51[var17_17 + 1][var16_16] >> 3) + (var52_51[var17_17][var16_16] >> 1);
                            WorldMapID.field3244[var17_17][var16_16] = var24_24 - var63_60;
                        }
                        ++var16_16;
                    }
                    break;
                }
            }
            block40: for (var8_8 = 0; var8_8 < var1_1; ++var8_8) {
                var9_9 = 0;
                while (true) {
                    if (var9_9 >= var2_2) {
                        continue block40;
                    }
                    if ((var0.field1337[var7_7][var8_8][var9_9] & 1) == 1) {
                        var10_10 = var7_7;
                        if ((var0.field1337[1][var8_8][var9_9] & 2) == 2) {
                            --var10_10;
                        }
                        if (var10_10 >= 0 && var6_6 != null) {
                            var6_6[var10_10].method5814(var8_8, var9_9);
                        }
                    }
                    ++var9_9;
                }
            }
            ++var7_7;
        }
    }
}

