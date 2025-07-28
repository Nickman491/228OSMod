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

@ObfuscatedName(value="pc")
public class class390
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lok;")
    Archive field4573;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1587477933)
    int field4575;
    @ObfuscatedName(value="az")
    byte field4572;

    class390() {
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(CLph;I)I", garbageValue="-1685483857")
    @Export(value="lowercaseChar")
    static int lowercaseChar(char c, Language language) {
        int n = c << 4;
        if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
            c = Character.toLowerCase(c);
            n = (c << 4) + 1;
        }
        if (c == '\u00f1' && language == Language.Language_ES) {
            n = 1762;
        }
        return n;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(Lqw;Lqw;B)V", garbageValue="-26")
    static void method7723(Font font, Font font2) {
        int n;
        int n2;
        int n3;
        int n4;
        if (UserComparator5.worldSelectBackSprites == null) {
            UserComparator5.worldSelectBackSprites = class378.method7637(PcmPlayer.field276, "sl_back", "");
        }
        if (class73.worldSelectFlagSprites == null) {
            class73.worldSelectFlagSprites = class319.method6611(PcmPlayer.field276, "sl_flags", "");
        }
        if (Script.worldSelectArrows == null) {
            Script.worldSelectArrows = class319.method6611(PcmPlayer.field276, "sl_arrows", "");
        }
        if (class140.worldSelectStars == null) {
            class140.worldSelectStars = class319.method6611(PcmPlayer.field276, "sl_stars", "");
        }
        if (class164.worldSelectLeftSprite == null) {
            class164.worldSelectLeftSprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(PcmPlayer.field276, "leftarrow", "");
        }
        if (Decimator.worldSelectRightSprite == null) {
            Decimator.worldSelectRightSprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(PcmPlayer.field276, "rightarrow", "");
        }
        Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
        Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
        Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 0x4F4F4F, 0x292929);
        font.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
        if (class140.worldSelectStars != null) {
            class140.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
            font2.draw("Members only world", Login.xPadding + 152, 10, 0xFFFFFF, -1);
            class140.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
            font2.draw("Free world", Login.xPadding + 152, 21, 0xFFFFFF, -1);
        }
        if (Script.worldSelectArrows != null) {
            n4 = Login.xPadding + 280;
            if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
                Script.worldSelectArrows[2].drawAt(n4, 4);
            } else {
                Script.worldSelectArrows[0].drawAt(n4, 4);
            }
            if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
                Script.worldSelectArrows[3].drawAt(n4 + 15, 4);
            } else {
                Script.worldSelectArrows[1].drawAt(n4 + 15, 4);
            }
            font.draw("World", n4 + 32, 17, 0xFFFFFF, -1);
            n3 = Login.xPadding + 390;
            if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
                Script.worldSelectArrows[2].drawAt(n3, 4);
            } else {
                Script.worldSelectArrows[0].drawAt(n3, 4);
            }
            if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
                Script.worldSelectArrows[3].drawAt(n3 + 15, 4);
            } else {
                Script.worldSelectArrows[1].drawAt(n3 + 15, 4);
            }
            font.draw("Players", n3 + 32, 17, 0xFFFFFF, -1);
            n2 = Login.xPadding + 500;
            if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
                Script.worldSelectArrows[2].drawAt(n2, 4);
            } else {
                Script.worldSelectArrows[0].drawAt(n2, 4);
            }
            if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
                Script.worldSelectArrows[3].drawAt(n2 + 15, 4);
            } else {
                Script.worldSelectArrows[1].drawAt(n2 + 15, 4);
            }
            font.draw("Location", n2 + 32, 17, 0xFFFFFF, -1);
            n = Login.xPadding + 610;
            if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
                Script.worldSelectArrows[2].drawAt(n, 4);
            } else {
                Script.worldSelectArrows[0].drawAt(n, 4);
            }
            if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
                Script.worldSelectArrows[3].drawAt(n + 15, 4);
            } else {
                Script.worldSelectArrows[1].drawAt(n + 15, 4);
            }
            font.draw("Type", n + 32, 17, 0xFFFFFF, -1);
        }
        Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
        font2.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 0xFFFFFF, -1);
        Login.hoveredWorldIndex = -1;
        if (UserComparator5.worldSelectBackSprites != null) {
            int n5;
            int n6;
            int n7;
            int n8;
            n4 = 88;
            n3 = 19;
            n2 = 765 / (n4 + 1) - 1;
            n = 480 / (n3 + 1);
            do {
                n8 = n;
                n7 = n2;
                if (n * (n2 - 1) >= World.World_count) {
                    --n2;
                }
                if (n2 * (n - 1) >= World.World_count) {
                    --n;
                }
                if (n2 * (n - 1) < World.World_count) continue;
                --n;
            } while (n != n8 || n7 != n2);
            n8 = (765 - n2 * n4) / (n2 + 1);
            if (n8 > 5) {
                n8 = 5;
            }
            if ((n7 = (480 - n3 * n) / (n + 1)) > 5) {
                n7 = 5;
            }
            int n9 = (765 - n4 * n2 - n8 * (n2 - 1)) / 2;
            int n10 = (480 - n3 * n - n7 * (n - 1)) / 2;
            int n11 = (n + World.World_count - 1) / n;
            Login.worldSelectPagesCount = n11 - n2;
            if (class164.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
                class164.worldSelectLeftSprite.drawAt(8, Huffman.canvasHeight / 2 - class164.worldSelectLeftSprite.subHeight / 2);
            }
            if (Decimator.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
                Decimator.worldSelectRightSprite.drawAt(BuddyRankComparator.canvasWidth - Decimator.worldSelectRightSprite.subWidth - 8, Huffman.canvasHeight / 2 - Decimator.worldSelectRightSprite.subHeight / 2);
            }
            int n12 = n10 + 23;
            int n13 = n9 + Login.xPadding;
            int n14 = 0;
            boolean bl = false;
            int n15 = Login.worldSelectPage;
            for (n6 = n * n15; n6 < World.World_count && n15 - Login.worldSelectPage < n2; ++n6) {
                World world = World.World_worlds[n6];
                n5 = 1;
                String string = Integer.toString(world.population);
                if (world.population != -1) {
                    if (world.population > 1980) {
                        string = "FULL";
                        n5 = 0;
                    }
                } else {
                    string = "OFF";
                    n5 = 0;
                }
                class113 class1132 = null;
                int n16 = 0;
                if (!world.isBeta()) {
                    if (!world.isDeadman()) {
                        if (!world.method1963()) {
                            if (!world.method2016()) {
                                if (!world.isPvp()) {
                                    if (!world.method1966()) {
                                        if (world.method1984()) {
                                            class1132 = world.isMembersOnly() ? class113.field1416 : class113.field1420;
                                        }
                                    } else {
                                        class1132 = world.isMembersOnly() ? class113.field1426 : class113.field1425;
                                    }
                                } else {
                                    class1132 = world.isMembersOnly() ? class113.field1418 : class113.field1417;
                                }
                            } else {
                                class1132 = world.isMembersOnly() ? class113.field1424 : class113.field1431;
                            }
                        } else {
                            n16 = 0xFF0000;
                            class1132 = world.isMembersOnly() ? class113.field1428 : class113.field1429;
                        }
                    } else {
                        class1132 = world.isMembersOnly() ? class113.field1430 : class113.field1427;
                    }
                } else {
                    class113 class1133 = class1132 = world.isMembersOnly() ? class113.field1422 : class113.field1421;
                }
                if (class1132 == null || class1132.field1415 >= UserComparator5.worldSelectBackSprites.length) {
                    class113 class1134 = class1132 = world.isMembersOnly() ? class113.field1423 : class113.field1419;
                }
                if (MouseHandler.MouseHandler_x >= n13 && MouseHandler.MouseHandler_y >= n12 && MouseHandler.MouseHandler_x < n13 + n4 && MouseHandler.MouseHandler_y < n12 + n3 && n5 != 0) {
                    Login.hoveredWorldIndex = n6;
                    UserComparator5.worldSelectBackSprites[class1132.field1415].drawTransOverlayAt(n13, n12, 128, 0xFFFFFF);
                    bl = true;
                } else {
                    UserComparator5.worldSelectBackSprites[class1132.field1415].drawAt(n13, n12);
                }
                if (class73.worldSelectFlagSprites != null) {
                    class73.worldSelectFlagSprites[(world.isMembersOnly() ? 8 : 0) + world.location].drawAt(n13 + 29, n12);
                }
                font.drawCentered(Integer.toString(world.id), n13 + 15, n3 / 2 + n12 + 5, n16, -1);
                font2.drawCentered(string, n13 + 60, n3 / 2 + n12 + 5, 0xFFFFFFF, -1);
                n12 = n12 + n7 + n3;
                if (++n14 < n) continue;
                n12 = n10 + 23;
                n13 = n13 + n8 + n4;
                n14 = 0;
                ++n15;
            }
            if (bl) {
                n6 = font2.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6;
                int n17 = font2.ascent + 8;
                n5 = MouseHandler.MouseHandler_y + 25;
                if (n17 + n5 > 480) {
                    n5 = MouseHandler.MouseHandler_y - 25 - n17;
                }
                Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - n6 / 2, n5, n6, n17, 0xFFFFA0);
                Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - n6 / 2, n5, n6, n17, 0);
                font2.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, n5 + font2.ascent + 4, 0, -1);
            }
        }
    }
}

