/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fb")
public class class134
extends Enum
implements class404 {
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
    @Export(value="scriptDotWidget")
    static Widget scriptDotWidget;
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
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.field1558;
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="lv")
    @ObfuscatedSignature(descriptor="([Lna;IIIIIIIII)V", garbageValue="1811100333")
    @Export(value="drawInterface")
    static final void drawInterface(Widget[] var0, int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, int var8_8) {
        Rasterizer2D.Rasterizer2D_setClip(var2_2, var3_3, var4_4, var5_5);
        SceneTileModel.method4071();
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
                                                                if (var10_10 == null || var10_10.parentId != var1_1 && (var1_1 != -1412584499 || var10_10 != Client.clickedWidget)) break block118;
                                                                if (var8_8 != -1) {
                                                                    var11_11 = var8_8;
                                                                } else {
                                                                    Client.rootWidgetXs[Client.rootWidgetCount] = var10_10.x + var6_6;
                                                                    Client.rootWidgetYs[Client.rootWidgetCount] = var7_7 + var10_10.y;
                                                                    Client.rootWidgetWidths[Client.rootWidgetCount] = var10_10.width;
                                                                    Client.rootWidgetHeights[Client.rootWidgetCount] = var10_10.height * -1528330031;
                                                                    var11_11 = ++Client.rootWidgetCount - 1;
                                                                }
                                                                var10_10.rootIndex = var11_11;
                                                                var10_10.cycle = Client.cycle;
                                                                if (var10_10.isIf3 && class163.isComponentHidden(var10_10)) break block118;
                                                                if (var10_10.contentType > 0) {
                                                                    class18.method284(var10_10);
                                                                }
                                                                var12_12 = var10_10.x + var6_6;
                                                                var13_13 = var7_7 + var10_10.y;
                                                                var14_14 = var10_10.transparencyTop;
                                                                if (var10_10 != Client.clickedWidget) break block119;
                                                                if (var1_1 == -1412584499 || var10_10.isScrollBar) break block120;
                                                                class10.field53 = var0;
                                                                class433.field4786 = var6_6;
                                                                WorldMapElement.field2543 = var7_7;
                                                                break block118;
                                                            }
                                                            if (Client.isDraggingWidget && Client.field523) {
                                                                var15_15 = MouseHandler.MouseHandler_x;
                                                                var16_16 = MouseHandler.MouseHandler_y;
                                                                var16_16 -= Client.widgetClickY;
                                                                if ((var15_15 -= Client.widgetClickX) < Client.field681) {
                                                                    var15_15 = Client.field681;
                                                                }
                                                                if (var15_15 + var10_10.width > Client.field681 + Client.clickedWidgetParent.width) {
                                                                    var15_15 = Client.field681 + Client.clickedWidgetParent.width - var10_10.width;
                                                                }
                                                                if (var16_16 < Client.field682) {
                                                                    var16_16 = Client.field682;
                                                                }
                                                                if (var16_16 + var10_10.height * -1528330031 > Client.clickedWidgetParent.height * -1528330031 + Client.field682) {
                                                                    var16_16 = Client.clickedWidgetParent.height * -1528330031 + Client.field682 - var10_10.height * -1528330031;
                                                                }
                                                                var12_12 = var15_15;
                                                                var13_13 = var16_16;
                                                            }
                                                            if (!var10_10.isScrollBar) {
                                                                var14_14 = 128;
                                                            }
                                                        }
                                                        if (var10_10.type != 9) {
                                                            var19_19 = var12_12 + var10_10.width;
                                                            var20_20 = var13_13 + var10_10.height * -1528330031;
                                                            var15_15 = var12_12 > var2_2 ? var12_12 : var2_2;
                                                            var16_16 = var13_13 > var3_3 ? var13_13 : var3_3;
                                                            var17_17 = var19_19 < var4_4 ? var19_19 : var4_4;
                                                            var18_18 = var20_20 < var5_5 ? var20_20 : var5_5;
                                                        } else {
                                                            var19_19 = var12_12;
                                                            var20_20 = var13_13;
                                                            var21_21 = var12_12 + var10_10.width;
                                                            var22_22 = var10_10.height * -1528330031 + var13_13;
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
                                                        if (var10_10.isIf3 && (var15_15 >= var17_17 || var16_16 >= var18_18)) break block118;
                                                        if (var10_10.contentType == 0) break block121;
                                                        if (var10_10.contentType == 1336) break block122;
                                                        if (var10_10.contentType == 1337) break block123;
                                                        if (var10_10.contentType == 1338) break block124;
                                                        if (var10_10.contentType == 1339) break block125;
                                                        if (var10_10.contentType == 1400) {
                                                            class420.worldMap.method9738(var12_12, var13_13, var10_10.width, var10_10.height * -1528330031, Client.cycle, class544.clientPreferences.method2941());
                                                        }
                                                        if (var10_10.contentType == 1401) {
                                                            class420.worldMap.drawOverview(var12_12, var13_13, var10_10.width, var10_10.height * -1528330031);
                                                        }
                                                        if (var10_10.contentType == 1402) {
                                                            class461.loginScreenRunesAnimation.draw(var12_12, Client.cycle);
                                                        }
                                                    }
                                                    if (var10_10.type == 0) break block126;
                                                    if (var10_10.type != 11) break block127;
                                                    if (class163.isComponentHidden(var10_10) && var10_10 != class424.mousedOverWidgetIf1) break block118;
                                                    if (var10_10.children != null) {
                                                        class134.drawInterface(var10_10.children, var10_10.id, var15_15, var16_16, var17_17, var18_18, var12_12 - var10_10.scrollX, var13_13 - var10_10.scrollY, var11_11);
                                                    }
                                                    Rasterizer2D.Rasterizer2D_setClip(var2_2, var3_3, var4_4, var5_5);
                                                    SceneTileModel.method4071();
                                                    break block127;
                                                }
                                                if (!var10_10.isIf3 && class163.isComponentHidden(var10_10) && var10_10 != class424.mousedOverWidgetIf1) break block118;
                                                if (!var10_10.isIf3) {
                                                    if (var10_10.scrollY > var10_10.scrollHeight - var10_10.height * -1528330031) {
                                                        var10_10.scrollY = var10_10.scrollHeight - var10_10.height * -1528330031;
                                                    }
                                                    if (var10_10.scrollY < 0) {
                                                        var10_10.scrollY = 0;
                                                    }
                                                }
                                                class134.drawInterface(var0, var10_10.id, var15_15, var16_16, var17_17, var18_18, var12_12 - var10_10.scrollX, var13_13 - var10_10.scrollY, var11_11);
                                                if (var10_10.children != null) {
                                                    class134.drawInterface(var10_10.children, var10_10.id, var15_15, var16_16, var17_17, var18_18, var12_12 - var10_10.scrollX, var13_13 - var10_10.scrollY, var11_11);
                                                }
                                                if ((var28_28 = (InterfaceParent)Client.interfaceParents.get(var10_10.id)) != null) {
                                                    Renderable.method4459(var28_28.group, var15_15, var16_16, var17_17, var18_18, var12_12, var13_13, var11_11);
                                                }
                                                Rasterizer2D.Rasterizer2D_setClip(var2_2, var3_3, var4_4, var5_5);
                                                SceneTileModel.method4071();
                                            }
                                            if (!Client.isResizable && !Client.field580[var11_11] && Client.field720 <= 1) break block118;
                                            if (var10_10.type == 0 && !var10_10.isIf3 && var10_10.scrollHeight > var10_10.height * -1528330031) {
                                                class480.drawScrollBar(var12_12 + var10_10.width, var13_13, var10_10.scrollY, var10_10.height * -1528330031, var10_10.scrollHeight);
                                            }
                                            if (var10_10.type == 1) break block118;
                                            if (var10_10.type == 3) break block128;
                                            if (var10_10.type == 4) break block129;
                                            if (var10_10.type == 5) break block130;
                                            if (var10_10.type != 6) {
                                                if (var10_10.type == 8 && var10_10 == HealthBar.field1346 && Client.field654 == Client.field655) {
                                                    var19_19 = 0;
                                                    var20_20 = 0;
                                                    var29_29 = HealthBarUpdate.fontPlain12;
                                                    var30_30 = var10_10.text;
                                                    var30_30 = class28.method458((String)var30_30, var10_10);
                                                    while (true) {
                                                        if (var30_30.length() <= 0) {
                                                            var20_20 += 7;
                                                            var24_24 = var12_12 + var10_10.width - 5 - (var19_19 += 6);
                                                            var25_25 = var10_10.height * -1528330031 + var13_13 + 5;
                                                            if (var24_24 < var12_12 + 5) {
                                                                var24_24 = var12_12 + 5;
                                                            }
                                                            if (var19_19 + var24_24 > var4_4) {
                                                                var24_24 = var4_4 - var19_19;
                                                            }
                                                            if (var25_25 + var20_20 > var5_5) {
                                                                var25_25 = var5_5 - var20_20;
                                                            }
                                                            Rasterizer2D.Rasterizer2D_fillRectangle(var24_24, var25_25, var19_19, var20_20, 0xFFFFA0);
                                                            Rasterizer2D.Rasterizer2D_drawRectangle(var24_24, var25_25, var19_19, var20_20, 0);
                                                            var30_30 = var10_10.text;
                                                            var26_26 = var25_25 + var29_29.ascent + 2;
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
                                                                var29_29.draw((String)var31_31, var24_24 + 3, var26_26, 0, -1);
                                                                var26_26 = var26_26 + var29_29.ascent + 1;
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
                                                        var25_25 = var29_29.stringWidth((String)var31_31);
                                                        if (var25_25 > var19_19) {
                                                            var19_19 = var25_25;
                                                        }
                                                        var20_20 = var20_20 + var29_29.ascent + 1;
                                                    }
                                                }
                                                if (var10_10.type != 9) {
                                                    if (var10_10.type == 12) {
                                                        var28_28 = var10_10.method7444();
                                                        var32_32 = var10_10.method7445();
                                                        if (var28_28 != null && var32_32 != null && var28_28.method7276() && (var29_29 = var10_10.method7419(ClanChannel.field1807)) != null) {
                                                            Client.field755.method10905(var12_12, var13_13, var10_10.width, var10_10.height * -1528330031, var28_28.method7167(), var28_28.method7187(), var28_28.method7259(), var28_28.method7184(), var28_28.method7182());
                                                            v1 = var22_22 = var10_10.textShadowed != false ? var10_10.spriteShadow : -1;
                                                            if (!var28_28.method7221() && var28_28.method7331().method8579()) {
                                                                Client.field755.method10906(var32_32.field3782, var22_22, var32_32.field3783, var32_32.field3781);
                                                                Client.field755.method10907(var28_28.method7363(), (Font)var29_29);
                                                            } else {
                                                                Client.field755.method10906(var10_10.color, var22_22, var32_32.field3783, var32_32.field3781);
                                                                Client.field755.method10907(var28_28.method7331(), (Font)var29_29);
                                                            }
                                                            Rasterizer2D.Rasterizer2D_setClip(var2_2, var3_3, var4_4, var5_5);
                                                        }
                                                    }
                                                } else {
                                                    if (!var10_10.field3907) {
                                                        var19_19 = var12_12;
                                                        var20_20 = var13_13;
                                                        var21_21 = var12_12 + var10_10.width;
                                                        var22_22 = var10_10.height * -1528330031 + var13_13;
                                                    } else {
                                                        var19_19 = var12_12;
                                                        var20_20 = var13_13 + var10_10.height * -1528330031;
                                                        var21_21 = var12_12 + var10_10.width;
                                                        var22_22 = var13_13;
                                                    }
                                                    if (var10_10.lineWid != 1) {
                                                        class228.method5107(var19_19, var20_20, var21_21, var22_22, var10_10.color, var10_10.lineWid);
                                                    } else {
                                                        Rasterizer2D.Rasterizer2D_drawLine(var19_19, var20_20, var21_21, var22_22, var10_10.color);
                                                    }
                                                }
                                            } else {
                                                var19_19 = (int)class268.runCs1(var10_10);
                                                var20_20 = var19_19 != 0 ? var10_10.sequenceId2 : var10_10.sequenceId;
                                                var29_29 = null;
                                                var22_22 = 0;
                                                if (var10_10.itemId == -1) {
                                                    if (var10_10.modelType != 5) {
                                                        if (var10_10.modelType != 7) {
                                                            var31_31 = null;
                                                            var33_33 = null;
                                                            if (var10_10.modelType != 6) {
                                                                if (var10_10.modelType == 2) {
                                                                    var25_25 = var10_10.modelId;
                                                                    var31_31 = class446.getNpcDefinition(var25_25);
                                                                    if (var31_31.transforms != null) {
                                                                        var31_31 = var31_31.transform();
                                                                    }
                                                                }
                                                            } else {
                                                                var25_25 = var10_10.modelId;
                                                                if (var25_25 >= 0 && var25_25 < GameEngine.field189.field1330.length && (var34_34 = GameEngine.field189.field1330[var25_25]) != null && var34_34.field1354 != null) {
                                                                    var31_31 = var34_34.field1354;
                                                                    if (var31_31.transforms != null) {
                                                                        var31_31 = var31_31.transform();
                                                                    }
                                                                    var33_33 = var34_34.method3063();
                                                                }
                                                            }
                                                            var35_35 = null;
                                                            var26_26 = -1;
                                                            if (var20_20 != -1) {
                                                                var35_35 = class33.SequenceDefinition_get(var20_20);
                                                                var26_26 = var10_10.modelFrame;
                                                            }
                                                            if ((var29_29 = var10_10.method7420(ClanChannel.field1807, var35_35, var26_26, (boolean)var19_19, ModeWhere.localPlayer.appearance, (NPCComposition)var31_31, var33_33)) == null && Widget.field3868) {
                                                                UserComparator8.invalidateWidget(var10_10);
                                                            }
                                                        } else {
                                                            var29_29 = var10_10.field3924.getModel(null, -1, class33.SequenceDefinition_get(ModeWhere.localPlayer.field1201), ModeWhere.localPlayer.field1237);
                                                        }
                                                    } else {
                                                        var29_29 = var10_10.modelId == 0 ? Client.playerAppearance.getModel(null, -1, null, -1) : ModeWhere.localPlayer.getModel();
                                                    }
                                                } else {
                                                    var31_31 = FaceNormal.ItemDefinition_get(var10_10.itemId);
                                                    if (var31_31 != null) {
                                                        var29_29 = (var31_31 = var31_31.getCountObj(var10_10.itemQuantity)).getModel(1);
                                                        if (var29_29 == null) {
                                                            UserComparator8.invalidateWidget(var10_10);
                                                        } else {
                                                            var29_29.calculateBoundsCylinder();
                                                            var22_22 = var29_29.height / 2;
                                                        }
                                                    }
                                                }
                                                SceneTileModel.method4020(var10_10.width / 2 + var12_12, var13_13 + var10_10.height * -1528330031 / 2);
                                                var23_23 = SceneTileModel.field1954[var10_10.modelAngleX] * var10_10.modelZoom >> 16;
                                                var24_24 = SceneTileModel.Rasterizer3D_cosine[var10_10.modelAngleX] * var10_10.modelZoom >> 16;
                                                if (var29_29 != null) {
                                                    if (!var10_10.isIf3) {
                                                        var29_29.method4561(0, var10_10.modelAngleY, 0, var10_10.modelAngleX, 0, var23_23, var24_24);
                                                    } else {
                                                        var29_29.calculateBoundsCylinder();
                                                        if (var10_10.modelOrthog) {
                                                            var29_29.method4562(0, var10_10.modelAngleY, var10_10.modelAngleZ, var10_10.modelAngleX, var10_10.modelOffsetX, var23_23 + var22_22 + var10_10.modelOffsetY, var24_24 + var10_10.modelOffsetY, var10_10.modelZoom);
                                                        } else {
                                                            var29_29.method4561(0, var10_10.modelAngleY, var10_10.modelAngleZ, var10_10.modelAngleX, var10_10.modelOffsetX, var22_22 + var23_23 + var10_10.modelOffsetY, var24_24 + var10_10.modelOffsetY);
                                                        }
                                                    }
                                                }
                                                SceneTileModel.method4023();
                                            }
                                            break block118;
                                        }
                                        if (!var10_10.isIf3) ** GOTO lbl290
                                        var28_28 = var10_10.itemId != -1 ? class380.getItemSprite(var10_10.itemId, var10_10.itemQuantity, var10_10.outline, var10_10.spriteShadow, var10_10.itemQuantityMode, false) : var10_10.method7430(ClanChannel.field1807, false, class280.urlRequester);
                                        if (var28_28 == null) {
                                            if (Widget.field3868) {
                                                UserComparator8.invalidateWidget(var10_10);
                                            }
                                        } else {
                                            var20_20 = var28_28.width;
                                            var21_21 = var28_28.height;
                                            if (!var10_10.spriteTiling) {
                                                var22_22 = var10_10.width * 4096 / var20_20;
                                                if (var10_10.spriteAngle != 0) {
                                                    var28_28.method10770(var10_10.width / 2 + var12_12, var13_13 + var10_10.height * -1528330031 / 2, var10_10.spriteAngle, var22_22);
                                                } else if (var14_14 != 0) {
                                                    var28_28.drawTransScaledAt(var12_12, var13_13, var10_10.width, var10_10.height * -1528330031, 256 - (var14_14 & 255));
                                                } else if (var20_20 == var10_10.width && var10_10.height * -1528330031 == var21_21) {
                                                    var28_28.drawTransBgAt(var12_12, var13_13);
                                                } else {
                                                    var28_28.drawScaledAt(var12_12, var13_13, var10_10.width, var10_10.height * -1528330031);
                                                }
                                            } else {
                                                Rasterizer2D.Rasterizer2D_expandClip(var12_12, var13_13, var12_12 + var10_10.width, var10_10.height * -1528330031 + var13_13);
                                                var22_22 = (var20_20 - 1 + var10_10.width) / var20_20;
                                                var23_23 = (var21_21 - 1 + var10_10.height * -1528330031) / var21_21;
                                                var24_24 = 0;
                                                while (true) {
                                                    if (var24_24 >= var22_22) {
                                                        Rasterizer2D.Rasterizer2D_setClip(var2_2, var3_3, var4_4, var5_5);
                                                        break block118;
                                                    }
                                                    for (var25_25 = 0; var25_25 < var23_23; ++var25_25) {
                                                        if (var10_10.spriteAngle != 0) {
                                                            var28_28.method10770(var20_20 / 2 + var12_12 + var24_24 * var20_20, var21_21 / 2 + var13_13 + var21_21 * var25_25, var10_10.spriteAngle, 4096);
                                                            continue;
                                                        }
                                                        if (var14_14 != 0) {
                                                            var28_28.drawTransAt(var12_12 + var20_20 * var24_24, var13_13 + var25_25 * var21_21, 256 - (var14_14 & 255));
                                                            continue;
                                                        }
                                                        var28_28.drawTransBgAt(var12_12 + var24_24 * var20_20, var13_13 + var21_21 * var25_25);
                                                    }
                                                    ++var24_24;
                                                }
lbl290:
                                                // 1 sources

                                                var28_28 = var10_10.method7430(ClanChannel.field1807, class268.runCs1(var10_10), class280.urlRequester);
                                                if (var28_28 != null) {
                                                    var28_28.drawTransBgAt(var12_12, var13_13);
                                                } else if (Widget.field3868) {
                                                    UserComparator8.invalidateWidget(var10_10);
                                                }
                                            }
                                        }
                                        break block118;
                                    }
                                    var28_28 = var10_10.method7419(ClanChannel.field1807);
                                    if (var28_28 != null) {
                                        var29_29 = var10_10.text;
                                        if (!class268.runCs1(var10_10)) {
                                            var20_20 = var10_10.color;
                                            if (var10_10 == class424.mousedOverWidgetIf1 && var10_10.field3892 != 0) {
                                                var20_20 = var10_10.field3892;
                                            }
                                        } else {
                                            var20_20 = var10_10.color2;
                                            if (var10_10 == class424.mousedOverWidgetIf1 && var10_10.field3900 != 0) {
                                                var20_20 = var10_10.field3900;
                                            }
                                            if (var10_10.text2.length() > 0) {
                                                var29_29 = var10_10.text2;
                                            }
                                        }
                                        if (var10_10.isIf3 && var10_10.itemId != -1) {
                                            var30_30 = FaceNormal.ItemDefinition_get(var10_10.itemId);
                                            var29_29 = var30_30.name;
                                            if (var29_29 == null) {
                                                var29_29 = "null";
                                            }
                                            if ((var30_30.isStackable == 1 || var10_10.itemQuantity != 1) && var10_10.itemQuantity != -1) {
                                                var29_29 = class97.colorStartTag(16748608) + (String)var29_29 + "</col>" + " " + 'x' + FontName.formatItemStacks(var10_10.itemQuantity);
                                            }
                                        }
                                        if (var10_10 == Client.meslayerContinueWidget) {
                                            var29_29 = "Please wait...";
                                            var20_20 = var10_10.color;
                                        }
                                        if (!var10_10.isIf3) {
                                            var29_29 = class28.method458((String)var29_29, var10_10);
                                        }
                                        var28_28.method8699((String)var29_29, var12_12, var13_13, var10_10.width, var10_10.height * -1528330031, var20_20, var10_10.textShadowed != false ? 0 : -1, class508.method9604(var10_10.transparencyTop), var10_10.textXAlignment, var10_10.textYAlignment, var10_10.textLineHeight);
                                    } else if (Widget.field3868) {
                                        UserComparator8.invalidateWidget(var10_10);
                                    }
                                    break block118;
                                }
                                if (!class268.runCs1(var10_10)) {
                                    var19_19 = var10_10.color;
                                    if (var10_10 == class424.mousedOverWidgetIf1 && var10_10.field3892 != 0) {
                                        var19_19 = var10_10.field3892;
                                    }
                                } else {
                                    var19_19 = var10_10.color2;
                                    if (var10_10 == class424.mousedOverWidgetIf1 && var10_10.field3900 != 0) {
                                        var19_19 = var10_10.field3900;
                                    }
                                }
                                if (!var10_10.fill) {
                                    if (var14_14 == 0) {
                                        Rasterizer2D.Rasterizer2D_drawRectangle(var12_12, var13_13, var10_10.width, var10_10.height * -1528330031, var19_19);
                                    } else {
                                        Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12_12, var13_13, var10_10.width, var10_10.height * -1528330031, var19_19, 256 - (var14_14 & 255));
                                    }
                                } else {
                                    switch (var10_10.fillMode.field5554) {
                                        default: {
                                            if (var14_14 == 0) {
                                                Rasterizer2D.Rasterizer2D_fillRectangle(var12_12, var13_13, var10_10.width, var10_10.height * -1528330031, var19_19);
                                                break;
                                            }
                                            Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12_12, var13_13, var10_10.width, var10_10.height * -1528330031, var19_19, 256 - (var14_14 & 255));
                                            break;
                                        }
                                        case 1: {
                                            Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12_12, var13_13, var10_10.width, var10_10.height * -1528330031, var10_10.color, var10_10.color2);
                                            break;
                                        }
                                        case 2: {
                                            Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12_12, var13_13, var10_10.width, var10_10.height * -1528330031, var10_10.color, var10_10.color2, 255 - (var10_10.transparencyTop & 255), 255 - (var10_10.transparencyBot & 255));
                                            break;
                                        }
                                    }
                                }
                                break block118;
                            }
                            class337.method6885(var10_10, var12_12, var13_13, var11_11);
                            Rasterizer2D.Rasterizer2D_setClip(var2_2, var3_3, var4_4, var5_5);
                            break block118;
                        }
                        AbstractWorldMapIcon.drawMinimap(var10_10, var12_12, var13_13, var11_11);
                        Rasterizer2D.Rasterizer2D_setClip(var2_2, var3_3, var4_4, var5_5);
                        break block118;
                    }
                    Client.viewportX = var12_12;
                    Client.viewportY = var13_13;
                    class138.drawEntities(var12_12, var13_13, var10_10.width, var10_10.height * -1528330031);
                    Client.field713[var10_10.rootIndex] = true;
                    Rasterizer2D.Rasterizer2D_setClip(var2_2, var3_3, var4_4, var5_5);
                    break block118;
                }
                if (class544.clientPreferences.method2983()) {
                    HealthBarUpdate.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12_12 + var10_10.width, var13_13 += 15, 0xFFFF00, -1);
                    var13_13 += 15;
                    var28_28 = Runtime.getRuntime();
                    var20_20 = (int)((var28_28.totalMemory() - var28_28.freeMemory()) / 1024L);
                    var21_21 = 0xFFFF00;
                    if (var20_20 > 327680 && !Client.isLowDetail) {
                        var21_21 = 0xFF0000;
                    }
                    HealthBarUpdate.fontPlain12.drawRightAligned("Mem:" + var20_20 + "k", var12_12 + var10_10.width, var13_13, var21_21, -1);
                    var13_13 += 15;
                }
            }
            ++var9_9;
        }
    }
}

