/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ad")
public final class class4 {
    @ObfuscatedName(value="au")
    @Export(value="Tiles_hueMultiplier")
    static int[] Tiles_hueMultiplier;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Loz;", garbageValue="1199091310")
    public static class383[] method16() {
        return new class383[]{class383.field4487, class383.field4488, class383.field4486, class383.field4485};
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lbt;Lqw;Lqw;S)V", garbageValue="14930")
    static void method19(GameEngine gameEngine, Font font, Font font2) {
        int n;
        int n2;
        int n3;
        if (Login.worldSelectOpen) {
            block185: {
                class269 class2692 = HealthBar.method3010();
                while (class2692.method5772()) {
                    if (class2692.field2989 == 13) {
                        if (Login.loginIndex == 34) {
                            class33.Login_promptCredentials(false);
                        }
                        Login.worldSelectOpen = false;
                        Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
                        WorldMapSectionType.leftTitleSprite.drawAt(Login.xPadding, 0);
                        TriBool.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
                        Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
                        break block185;
                    }
                    if (class2692.field2989 == 96) {
                        if (Login.worldSelectPage <= 0 || class164.worldSelectLeftSprite == null) continue;
                        --Login.worldSelectPage;
                        continue;
                    }
                    if (class2692.field2989 != 97 || Login.worldSelectPage >= Login.worldSelectPagesCount || Decimator.worldSelectRightSprite == null) continue;
                    ++Login.worldSelectPage;
                }
                if (MouseHandler.MouseHandler_lastButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
                    int n4 = Login.xPadding + 280;
                    if (MouseHandler.MouseHandler_lastPressedX >= n4 && MouseHandler.MouseHandler_lastPressedX <= n4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                        class188.changeWorldSelectSorting(0, 0);
                    } else if (MouseHandler.MouseHandler_lastPressedX >= n4 + 15 && MouseHandler.MouseHandler_lastPressedX <= n4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                        class188.changeWorldSelectSorting(0, 1);
                    } else {
                        int n5 = Login.xPadding + 390;
                        if (MouseHandler.MouseHandler_lastPressedX >= n5 && MouseHandler.MouseHandler_lastPressedX <= n5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                            class188.changeWorldSelectSorting(1, 0);
                        } else if (MouseHandler.MouseHandler_lastPressedX >= n5 + 15 && MouseHandler.MouseHandler_lastPressedX <= n5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                            class188.changeWorldSelectSorting(1, 1);
                        } else {
                            int n6 = Login.xPadding + 500;
                            if (MouseHandler.MouseHandler_lastPressedX >= n6 && MouseHandler.MouseHandler_lastPressedX <= n6 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                                class188.changeWorldSelectSorting(2, 0);
                            } else if (MouseHandler.MouseHandler_lastPressedX >= n6 + 15 && MouseHandler.MouseHandler_lastPressedX <= n6 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                                class188.changeWorldSelectSorting(2, 1);
                            } else {
                                int n7 = Login.xPadding + 610;
                                if (MouseHandler.MouseHandler_lastPressedX >= n7 && MouseHandler.MouseHandler_lastPressedX <= n7 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                                    class188.changeWorldSelectSorting(3, 0);
                                } else if (MouseHandler.MouseHandler_lastPressedX >= n7 + 15 && MouseHandler.MouseHandler_lastPressedX <= n7 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
                                    class188.changeWorldSelectSorting(3, 1);
                                } else if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
                                    if (Login.loginIndex == 34) {
                                        class33.Login_promptCredentials(false);
                                    }
                                    Login.worldSelectOpen = false;
                                    Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
                                    WorldMapSectionType.leftTitleSprite.drawAt(Login.xPadding, 0);
                                    TriBool.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
                                    Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
                                } else if (Login.hoveredWorldIndex != -1) {
                                    boolean bl;
                                    boolean bl2;
                                    World world = World.World_worlds[Login.hoveredWorldIndex];
                                    int n8 = Client.worldProperties;
                                    class552 class5522 = class552.field5442;
                                    boolean bl3 = bl2 = (n8 & class5522.rsOrdinal()) != 0;
                                    class273.field3035 = bl = world.isDeadman();
                                    world.field819 = bl ? "beta" : world.field819;
                                    Language.changeWorld(world);
                                    if (Login.loginIndex == 34) {
                                        class33.Login_promptCredentials(false);
                                    }
                                    Login.worldSelectOpen = false;
                                    Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
                                    WorldMapSectionType.leftTitleSprite.drawAt(Login.xPadding, 0);
                                    TriBool.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
                                    Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
                                    if (bl3 != bl) {
                                        ModelData0.method4808();
                                    }
                                } else {
                                    if (Login.worldSelectPage > 0 && class164.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class164.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= Huffman.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= Huffman.canvasHeight / 2 + 50) {
                                        --Login.worldSelectPage;
                                    }
                                    if (Login.worldSelectPage < Login.worldSelectPagesCount && Decimator.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= BuddyRankComparator.canvasWidth - Decimator.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= BuddyRankComparator.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= Huffman.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= Huffman.canvasHeight / 2 + 50) {
                                        ++Login.worldSelectPage;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        if ((MouseHandler.MouseHandler_lastButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453 && MouseHandler.MouseHandler_lastPressedX < Login.xPadding + 765 && MouseHandler.MouseHandler_lastPressedY < 503) {
            class544.clientPreferences.method2978(!class544.clientPreferences.method2887());
            class106.method3078();
            class153.method3619();
        }
        if (Client.gameState == 5) {
            return;
        }
        if (-1L == Login.field954) {
            Login.field954 = ReflectionCheck.method724() + 1000L;
        }
        long l = ReflectionCheck.method724();
        if (class319.method6610() && Login.field927 == -1L && (Login.field927 = l) > Login.field954) {
            Login.field954 = Login.field927;
        }
        if (Client.gameState != 10 && Client.gameState != 11) {
            return;
        }
        if (ScriptFrame.clientLanguage == Language.Language_EN) {
            if (MouseHandler.MouseHandler_lastButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
                n3 = Login.xPadding + 5;
                n2 = 463;
                n = 100;
                int n9 = 35;
                if (MouseHandler.MouseHandler_lastPressedX >= n3 && MouseHandler.MouseHandler_lastPressedX <= n + n3 && MouseHandler.MouseHandler_lastPressedY >= n2 && MouseHandler.MouseHandler_lastPressedY <= n9 + n2) {
                    class212.method4849();
                    return;
                }
            }
            if (class149.World_request != null) {
                class212.method4849();
            }
        }
        n3 = MouseHandler.MouseHandler_lastButton;
        n2 = MouseHandler.MouseHandler_lastPressedX;
        n = MouseHandler.MouseHandler_lastPressedY;
        if (n3 == 0) {
            n2 = MouseHandler.MouseHandler_x;
            n = MouseHandler.MouseHandler_y;
        }
        if (!KeyHandler.mouseCam && n3 == 4) {
            n3 = 1;
        }
        class269 class2693 = HealthBar.method3010();
        if (Login.loginIndex == 0) {
            boolean bl = false;
            while (class2693.method5772()) {
                if (class2693.field2989 != 84) continue;
                bl = true;
            }
            int n10 = UserComparator3.loginBoxCenter - 80;
            int n11 = 291;
            if (n3 == 1 && n2 >= n10 - 75 && n2 <= n10 + 75 && n >= n11 - 20 && n <= n11 + 20) {
                WorldMapRectangle.openURL(RouteStrategy.method5846("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            n10 = UserComparator3.loginBoxCenter + 80;
            if (n3 == 1 && n2 >= n10 - 75 && n2 <= n10 + 75 && n >= n11 - 20 && n <= n11 + 20 || bl) {
                if ((Client.worldProperties & class552.field5451.rsOrdinal()) != 0) {
                    Login.Login_response0 = "";
                    Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                    Login.Login_response2 = "Your normal account will not be affected.";
                    Login.Login_response3 = "";
                    Varcs.method3212(1);
                    HealthBarUpdate.method2832();
                } else if ((Client.worldProperties & class552.field5428.rsOrdinal()) != 0) {
                    if ((Client.worldProperties & class552.field5427.rsOrdinal()) != 0) {
                        Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                        Login.Login_response2 = "Players can attack each other almost everywhere";
                        Login.Login_response3 = "and the Protect Item prayer won't work.";
                    } else {
                        Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                        Login.Login_response2 = "Players can attack each other";
                        Login.Login_response3 = "almost everywhere.";
                    }
                    Login.Login_response0 = "Warning!";
                    Varcs.method3212(1);
                    HealthBarUpdate.method2832();
                } else if ((Client.worldProperties & class552.field5427.rsOrdinal()) != 0) {
                    Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                    Login.Login_response2 = "The Protect Item prayer will";
                    Login.Login_response3 = "not work on this world.";
                    Login.Login_response0 = "Warning!";
                    Varcs.method3212(1);
                    HealthBarUpdate.method2832();
                } else {
                    class33.Login_promptCredentials(false);
                }
            }
        } else if (Login.loginIndex == 1) {
            while (class2693.method5772()) {
                if (class2693.field2989 == 84) {
                    class33.Login_promptCredentials(false);
                    continue;
                }
                if (class2693.field2989 != 13) continue;
                Varcs.method3212(0);
            }
            int n12 = UserComparator3.loginBoxCenter - 80;
            int n13 = 321;
            if (n3 == 1 && n2 >= n12 - 75 && n2 <= n12 + 75 && n >= n13 - 20 && n <= n13 + 20) {
                class33.Login_promptCredentials(false);
            }
            n12 = UserComparator3.loginBoxCenter + 80;
            if (n3 == 1 && n2 >= n12 - 75 && n2 <= n12 + 75 && n >= n13 - 20 && n <= n13 + 20) {
                Varcs.method3212(0);
            }
        } else if (Login.loginIndex == 2) {
            int n14;
            int n15 = 201;
            if (n3 == 1 && n >= (n15 += 52) - 12 && n < n15 + 2) {
                Login.currentLoginField = 0;
            }
            if (n3 == 1 && n >= (n15 += 15) - 12 && n < n15 + 2) {
                Login.currentLoginField = 1;
            }
            n15 += 15;
            n15 = 361;
            if (class169.field1800 != null) {
                n14 = class169.field1800.highX / 2;
                if (n3 == 1 && n2 >= class169.field1800.lowX - n14 && n2 <= n14 + class169.field1800.lowX && n >= n15 - 15 && n < n15) {
                    switch (Login.field933) {
                        case 1: {
                            WorldMapRectangle.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
                            return;
                        }
                        case 2: {
                            WorldMapRectangle.openURL("https://support.runescape.com/hc/en-gb", true, false);
                        }
                    }
                }
            }
            n14 = UserComparator3.loginBoxCenter - 80;
            int n16 = 321;
            if (n3 == 1 && n2 >= n14 - 75 && n2 <= n14 + 75 && n >= n16 - 20 && n <= n16 + 20) {
                ClientPreferences.method2989();
                return;
            }
            n14 = Login.loginBoxX + 180 + 80;
            if (n3 == 1 && n2 >= n14 - 75 && n2 <= n14 + 75 && n >= n16 - 20 && n <= n16 + 20) {
                Varcs.method3212(0);
                Login.Login_username = "";
                Login.Login_password = "";
                class326.field3592 = 0;
                class480.otp = "";
                Login.field946 = true;
            }
            n14 = UserComparator3.loginBoxCenter + -117;
            n16 = 277;
            boolean bl = Login.field944 = n2 >= n14 && n2 < n14 + ClanMate.field5001 && n >= n16 && n < n16 + UrlRequester.field1461;
            if (n3 == 1 && Login.field944) {
                boolean bl4 = Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
                if (!Client.Login_isUsernameRemembered && class544.clientPreferences.method2944() != null) {
                    class544.clientPreferences.method2901(null);
                }
            }
            n14 = UserComparator3.loginBoxCenter + 24;
            n16 = 277;
            boolean bl5 = Login.field945 = n2 >= n14 && n2 < n14 + ClanMate.field5001 && n >= n16 && n < n16 + UrlRequester.field1461;
            if (n3 == 1 && Login.field945) {
                class544.clientPreferences.method2884(!class544.clientPreferences.method2974());
                if (!class544.clientPreferences.method2974()) {
                    Login.Login_username = "";
                    class544.clientPreferences.method2901(null);
                    HealthBarUpdate.method2832();
                }
            }
            while (class2693.method5772()) {
                if (class2693.field2989 == 13) {
                    Varcs.method3212(0);
                    Login.Login_username = "";
                    Login.Login_password = "";
                    class326.field3592 = 0;
                    class480.otp = "";
                    Login.field946 = true;
                    continue;
                }
                if (Login.currentLoginField == 0) {
                    class145.method3558(class2693.field2975);
                    if (class2693.field2989 == 85 && Login.Login_username.length() > 0) {
                        Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                    }
                    if (class2693.field2989 == 84 || class2693.field2989 == 80) {
                        Login.currentLoginField = 1;
                    }
                    if (!class14.method188(class2693.field2975) || Login.Login_username.length() >= 320) continue;
                    Login.Login_username = Login.Login_username + class2693.field2975;
                    continue;
                }
                if (Login.currentLoginField != 1) continue;
                if (class2693.field2989 == 85 && Login.Login_password.length() > 0) {
                    Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
                } else if (class2693.field2989 == 84 || class2693.field2989 == 80) {
                    Login.currentLoginField = 0;
                    if (class2693.field2989 == 84) {
                        ClientPreferences.method2989();
                        return;
                    }
                }
                if ((class2693.method5776(82) || class2693.method5776(87)) && class2693.field2989 == 67) {
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    Transferable transferable = clipboard.getContents(Client.client);
                    int n17 = 20 - Login.Login_password.length();
                    if (n17 <= 0) continue;
                    try {
                        String string = (String)transferable.getTransferData(DataFlavor.stringFlavor);
                        int n18 = Math.min(n17, string.length());
                        for (int i = 0; i < n18; ++i) {
                            if (class59.method1203(string.charAt(i)) && class14.method188(string.charAt(i))) continue;
                            Varcs.method3212(3);
                            return;
                        }
                        Login.Login_password = Login.Login_password + string.substring(0, n18);
                    }
                    catch (UnsupportedFlavorException unsupportedFlavorException) {
                    }
                    catch (IOException iOException) {}
                    continue;
                }
                if (!class59.method1203(class2693.field2975) || !class14.method188(class2693.field2975) || Login.Login_password.length() >= 20) continue;
                Login.Login_password = Login.Login_password + class2693.field2975;
            }
        } else if (Login.loginIndex == 3) {
            int n19 = Login.loginBoxX + 180;
            int n20 = 241;
            Bounds bounds = font.method8709(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", n19, n20);
            if (n3 == 1 && bounds.method8263(n2, n)) {
                WorldMapRectangle.openURL("https://oldschool.runescape.com/launcher", true, false);
            }
            n19 = Login.loginBoxX + 180;
            n20 = 276;
            if (n3 == 1 && n2 >= n19 - 75 && n2 <= n19 + 75 && n >= n20 - 20 && n <= n20 + 20) {
                AbstractSocket.method9400(false);
            }
            n19 = Login.loginBoxX + 180;
            n20 = 326;
            if (n3 == 1 && n2 >= n19 - 75 && n2 <= n19 + 75 && n >= n20 - 20 && n <= n20 + 20) {
                WorldMapRectangle.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
                return;
            }
        } else if (Login.loginIndex == 4) {
            int n21 = Login.loginBoxX + 180 - 80;
            int n22 = 321;
            if (n3 == 1 && n2 >= n21 - 75 && n2 <= n21 + 75 && n >= n22 - 20 && n <= n22 + 20) {
                class233.method5134();
                return;
            }
            if (n3 == 1 && n2 >= Login.loginBoxX + 180 - 9 && n2 <= Login.loginBoxX + 180 + 130 && n >= 263 && n <= 296) {
                boolean bl = Login.field946 = !Login.field946;
            }
            if (n3 == 1 && n2 >= Login.loginBoxX + 180 - 34 && n2 <= Login.loginBoxX + 34 + 180 && n >= 351 && n <= 363) {
                WorldMapRectangle.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
            }
            n21 = Login.loginBoxX + 180 + 80;
            if (n3 == 1 && n2 >= n21 - 75 && n2 <= n21 + 75 && n >= n22 - 20 && n <= n22 + 20) {
                Varcs.method3212(0);
                Login.Login_username = "";
                Login.Login_password = "";
                class326.field3592 = 0;
                class480.otp = "";
            }
            while (class2693.method5772()) {
                boolean bl = false;
                for (int i = 0; i < "1234567890".length(); ++i) {
                    if (class2693.field2975 != "1234567890".charAt(i)) continue;
                    bl = true;
                    break;
                }
                if (class2693.field2989 == 13) {
                    Varcs.method3212(0);
                    Login.Login_username = "";
                    Login.Login_password = "";
                    class326.field3592 = 0;
                    class480.otp = "";
                    continue;
                }
                if (class2693.field2989 == 85 && class480.otp.length() > 0) {
                    class480.otp = class480.otp.substring(0, class480.otp.length() - 1);
                }
                if (class2693.field2989 == 84) {
                    class233.method5134();
                    return;
                }
                if (!bl || class480.otp.length() >= 6) continue;
                class480.otp = class480.otp + class2693.field2975;
            }
        } else if (Login.loginIndex == 5) {
            int n23;
            int n24 = Login.loginBoxX + 180 - 80;
            int n25 = 321;
            if (n3 == 1 && n2 >= n24 - 75 && n2 <= n24 + 75 && n >= n25 - 20 && n <= n25 + 20) {
                class221.method5000();
                return;
            }
            n24 = Login.loginBoxX + 180 + 80;
            if (n3 == 1 && n2 >= n24 - 75 && n2 <= n24 + 75 && n >= n25 - 20 && n <= n25 + 20) {
                class33.Login_promptCredentials(true);
            }
            int n26 = 361;
            if (WorldMapCacheName.field3266 != null) {
                n23 = WorldMapCacheName.field3266.highX / 2;
                if (n3 == 1 && n2 >= WorldMapCacheName.field3266.lowX - n23 && n2 <= n23 + WorldMapCacheName.field3266.lowX && n >= n26 - 15 && n < n26) {
                    WorldMapRectangle.openURL(RouteStrategy.method5846("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class2693.method5772()) {
                n23 = 0;
                for (int i = 0; i < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00ef\u00bf\u00bd$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++i) {
                    if (class2693.field2975 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00ef\u00bf\u00bd$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(i)) continue;
                    n23 = 1;
                    break;
                }
                if (class2693.field2989 == 13) {
                    class33.Login_promptCredentials(true);
                    continue;
                }
                if (class2693.field2989 == 85 && Login.Login_username.length() > 0) {
                    Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                }
                if (class2693.field2989 == 84) {
                    class221.method5000();
                    return;
                }
                if (n23 == 0 || Login.Login_username.length() >= 320) continue;
                Login.Login_username = Login.Login_username + class2693.field2975;
            }
        } else if (Login.loginIndex == 6) {
            while (class2693.method5772()) {
                if (class2693.field2989 != 84 && class2693.field2989 != 13) continue;
                class33.Login_promptCredentials(true);
            }
            int n27 = 321;
            if (n3 == 1 && n >= n27 - 20 && n <= n27 + 20) {
                class33.Login_promptCredentials(true);
            }
        } else if (Login.loginIndex == 7) {
            if (class380.field4145 && !Client.onMobile) {
                boolean bl;
                int n28 = UserComparator3.loginBoxCenter - 150;
                int n29 = n28 + 40 + 240 + 25;
                int n30 = 231;
                int n31 = n30 + 40;
                if (n3 == 1 && n2 >= n28 && n2 <= n29 && n >= n30 && n <= n31) {
                    Login.field941 = class340.method6897(n28, n2);
                }
                int n32 = Login.loginBoxX + 180 - 80;
                int n33 = 321;
                if (n3 == 1 && n2 >= n32 - 75 && n2 <= n32 + 75 && n >= n33 - 20 && n <= n33 + 20 && (bl = class355.method7042())) {
                    class360.updateGameState(50);
                    return;
                }
                n32 = Login.loginBoxX + 180 + 80;
                if (n3 == 1 && n2 >= n32 - 75 && n2 <= n32 + 75 && n >= n33 - 20 && n <= n33 + 20) {
                    Login.field922 = new String[8];
                    class33.Login_promptCredentials(true);
                }
                while (class2693.method5772()) {
                    if (class2693.field2989 == 101) {
                        Login.field922[Login.field941] = null;
                    }
                    if (class2693.field2989 == 85) {
                        if (Login.field922[Login.field941] == null && Login.field941 > 0) {
                            --Login.field941;
                        }
                        Login.field922[Login.field941] = null;
                    }
                    if (class2693.field2975 >= '0' && class2693.field2975 <= '9') {
                        Login.field922[Login.field941] = "" + class2693.field2975;
                        if (Login.field941 < 7) {
                            ++Login.field941;
                        }
                    }
                    if (class2693.field2989 != 84) continue;
                    bl = class355.method7042();
                    if (bl) {
                        class360.updateGameState(50);
                    }
                    return;
                }
            } else {
                int n34 = Login.loginBoxX + 180 - 80;
                int n35 = 321;
                if (n3 == 1 && n2 >= n34 - 75 && n2 <= n34 + 75 && n >= n35 - 20 && n <= n35 + 20) {
                    WorldMapRectangle.openURL(RouteStrategy.method5846("secure", true) + "m=dob/set_dob.ws", true, false);
                    class150.setLoginResponseString("", "Page has opened in the browser.", "");
                    Varcs.method3212(6);
                    return;
                }
                n34 = Login.loginBoxX + 180 + 80;
                if (n3 == 1 && n2 >= n34 - 75 && n2 <= n34 + 75 && n >= n35 - 20 && n <= n35 + 20) {
                    class33.Login_promptCredentials(true);
                }
            }
        } else if (Login.loginIndex == 8) {
            int n36 = Login.loginBoxX + 180 - 80;
            int n37 = 321;
            if (n3 == 1 && n2 >= n36 - 75 && n2 <= n36 + 75 && n >= n37 - 20 && n <= n37 + 20) {
                WorldMapRectangle.openURL("https://www.jagex.com/terms/privacy", true, false);
                class150.setLoginResponseString("", "Page has opened in the browser.", "");
                Varcs.method3212(6);
                return;
            }
            n36 = Login.loginBoxX + 180 + 80;
            if (n3 == 1 && n2 >= n36 - 75 && n2 <= n36 + 75 && n >= n37 - 20 && n <= n37 + 20) {
                class33.Login_promptCredentials(true);
            }
        } else if (Login.loginIndex == 9) {
            int n38 = Login.loginBoxX + 180;
            int n39 = 311;
            if (class2693.field2989 == 84 || class2693.field2989 == 13 || n3 == 1 && n2 >= n38 - 75 && n2 <= n38 + 75 && n >= n39 - 20 && n <= n39 + 20) {
                AbstractSocket.method9400(false);
            }
        } else if (Login.loginIndex == 10) {
            int n40 = Login.loginBoxX + 180;
            int n41 = 209;
            if (class2693.field2989 == 84 || n3 == 1 && n2 >= n40 - 109 && n2 <= n40 + 109 && n >= n41 && n <= n41 + 68) {
                class150.setLoginResponseString("", "Connecting to server...", "");
                Client.field741 = class561.field5525;
                Client.field629 = class544.clientPreferences.method2894(Login.Login_username) ? class146.field1659 : class146.field1661;
                class360.updateGameState(20);
            }
        } else if (Login.loginIndex == 12) {
            int n42 = UserComparator3.loginBoxCenter;
            int n43 = 233;
            Bounds bounds = font2.method8709(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", n42, n43);
            Bounds bounds2 = font2.method8709(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", n42, n43);
            Bounds bounds3 = font2.method8709(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", n42, n43);
            Bounds bounds4 = font2.method8709(0, 34, "<col=ffd200>agreement (EULA)</col>.", n42, n43 += 17);
            if (n3 == 1) {
                if (bounds.method8263(n2, n)) {
                    WorldMapRectangle.openURL("https://www.jagex.com/terms", true, false);
                } else if (bounds2.method8263(n2, n)) {
                    WorldMapRectangle.openURL("https://www.jagex.com/terms/privacy", true, false);
                } else if (bounds3.method8263(n2, n) || bounds4.method8263(n2, n)) {
                    WorldMapRectangle.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            n42 = UserComparator3.loginBoxCenter - 80;
            n43 = 311;
            if (n3 == 1 && n2 >= n42 - 75 && n2 <= n42 + 75 && n >= n43 - 20 && n <= n43 + 20) {
                class544.clientPreferences.method2903(Client.field766);
                AbstractSocket.method9400(true);
            }
            n42 = UserComparator3.loginBoxCenter + 80;
            if (n3 == 1 && n2 >= n42 - 75 && n2 <= n42 + 75 && n >= n43 - 20 && n <= n43 + 20) {
                Login.loginIndex = 13;
            }
        } else if (Login.loginIndex == 13) {
            int n44 = UserComparator3.loginBoxCenter;
            int n45 = 321;
            if (n3 == 1 && n2 >= n44 - 75 && n2 <= n44 + 75 && n >= n45 - 20 && n <= n45 + 20) {
                AbstractSocket.method9400(true);
            }
        } else if (Login.loginIndex == 14) {
            String string = "";
            switch (Login.Login_banType) {
                case 2: {
                    string = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                }
                case 1: {
                    string = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                    break;
                }
                case 0: {
                    string = "https://secure.runescape.com/m=offence-appeal/account-history";
                    break;
                }
                default: {
                    class33.Login_promptCredentials(false);
                }
            }
            int n46 = Login.loginBoxX + 180;
            int n47 = 276;
            if (n3 == 1 && n2 >= n46 - 75 && n2 <= n46 + 75 && n >= n47 - 20 && n <= n47 + 20) {
                WorldMapRectangle.openURL(string, true, false);
                class150.setLoginResponseString("", "Page has opened in the browser.", "");
                Varcs.method3212(6);
                return;
            }
            n46 = Login.loginBoxX + 180;
            n47 = 326;
            if (n3 == 1 && n2 >= n46 - 75 && n2 <= n46 + 75 && n >= n47 - 20 && n <= n47 + 20) {
                class33.Login_promptCredentials(false);
            }
        } else if (Login.loginIndex == 24) {
            int n48 = Login.loginBoxX + 180;
            int n49 = 301;
            if (n3 == 1 && n2 >= n48 - 75 && n2 <= n48 + 75 && n >= n49 - 20 && n <= n49 + 20) {
                AbstractSocket.method9400(false);
            }
        } else if (Login.loginIndex == 32) {
            int n50 = Login.loginBoxX + 180 - 80;
            int n51 = 321;
            if (n3 == 1 && n2 >= n50 - 75 && n2 <= n50 + 75 && n >= n51 - 20 && n <= n51 + 20) {
                WorldMapRectangle.openURL(RouteStrategy.method5846("secure", true) + "m=dob/set_dob.ws", true, false);
                class150.setLoginResponseString("", "Page has opened in the browser.", "");
                Varcs.method3212(6);
                return;
            }
            n50 = Login.loginBoxX + 180 + 80;
            if (n3 == 1 && n2 >= n50 - 75 && n2 <= n50 + 75 && n >= n51 - 20 && n <= n51 + 20) {
                class33.Login_promptCredentials(true);
            }
        } else if (Login.loginIndex == 33) {
            int n52 = Login.loginBoxX + 180;
            int n53 = 276;
            if (n3 == 1 && n2 >= n52 - 75 && n2 <= n52 + 75 && n >= n53 - 20 && n <= n53 + 20) {
                WorldMapRectangle.openURL("https://oldschool.runescape.com/launcher", true, false);
            }
            n52 = Login.loginBoxX + 180;
            n53 = 326;
            if (n3 == 1 && n2 >= n52 - 75 && n2 <= n52 + 75 && n >= n53 - 20 && n <= n53 + 20) {
                class33.Login_promptCredentials(true);
            }
        } else if (Login.loginIndex == 34) {
            int n54 = Login.loginBoxX + 180;
            int n55 = 276;
            if (n3 == 1 && n2 >= n54 - 75 && n2 <= n54 + 75 && n >= n55 - 20 && n <= n55 + 20) {
                class212.method4849();
                return;
            }
            if (class149.World_request != null) {
                class212.method4849();
            }
            n54 = Login.loginBoxX + 180;
            n55 = 326;
            if (n3 == 1 && n2 >= n54 - 75 && n2 <= n54 + 75 && n >= n55 - 20 && n <= n55 + 20) {
                class33.Login_promptCredentials(false);
            }
        }
    }

    @ObfuscatedName(value="cp")
    @ObfuscatedSignature(descriptor="(IB)Ljava/lang/Object;", garbageValue="-7")
    static Object method17(int n) {
        return Timer.method8952((class544)StructComposition.findEnumerated(class544.method10125(), n));
    }

    @ObfuscatedName(value="hu")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="1")
    static final void method20() {
        class211.method4837();
        class166.method3807();
        class251.method5358();
        DbRowType.field5416.clear();
        DbTableType.field5409.clear();
        World.method1994();
        ServerPacket.method6635();
        FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
        class16.method209();
        HitSplatDefinition.HitSplatDefinition_cached.clear();
        HitSplatDefinition.field2754.clear();
        HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
        class336.method6883();
        KitDefinition.field2548.clear();
        class165.method3794();
        class241.method5257();
        World.method1960();
        class244.field2601.clear();
        TextureProvider.method4473();
        ItemComposition.ItemDefinition_cached.clear();
        ItemComposition.ItemDefinition_cachedModels.clear();
        ItemComposition.ItemDefinition_cachedSprites.clear();
        class459.method8967();
        SequenceDefinition.SequenceDefinition_cached.clear();
        SequenceDefinition.SequenceDefinition_cachedFrames.clear();
        SequenceDefinition.SequenceDefinition_cachedModel.clear();
        SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
        SpotAnimationDefinition.DBTableMasterIndex_cache.clear();
        StructComposition.StructDefinition_cached.clear();
        class97.method2751();
        if (class18.field75 != null) {
            class18.field75.method10082();
        }
        if (UserComparator9.field1513 != null) {
            UserComparator9.field1513.method10082();
        }
        class248.field2666.clear();
        class250.field2677.clear();
        class18.method275();
        class153.method3618();
        class230.field2490.clear();
        class233.field2501.clear();
        SpotAnimationDefinition.method5377();
        LoginScreenAnimation.method2877();
        UserComparator3.method3346();
        Client.DBTableIndex_cache.clear();
        Client.field789.clear();
        PlayerComposition.PlayerAppearance_cachedModels.clear();
        PlayerComposition.field3808.method9041();
        PlayerComposition.field3821 = 0;
        if (ClanChannel.field1807 != null) {
            ClanChannel.field1807.method7026();
        }
        if (SceneTileModel.field1957.Rasterizer3D_textureLoader != null) {
            ((TextureProvider)SceneTileModel.field1957.Rasterizer3D_textureLoader).clear();
        }
        class244.method5287();
        Client.field636.method9041();
        if (GraphicsDefaults.field5117 != null) {
            GraphicsDefaults.field5117.clearFiles();
        }
        if (class188.field2104 != null) {
            class188.field2104.clearFiles();
        }
        if (class166.archive10 != null) {
            class166.archive10.clearFiles();
        }
        if (class167.archive12 != null) {
            class167.archive12.clearFiles();
        }
        if (class268.archive2 != null) {
            class268.archive2.clearFiles();
        }
        if (HitSplatDefinition.field2777 != null) {
            HitSplatDefinition.field2777.clearFiles();
        }
        if (FaceNormal.field2120 != null) {
            FaceNormal.field2120.clearFiles();
        }
        if (class220.archive13 != null) {
            class220.archive13.clearFiles();
        }
        if (SoundCache.field291 != null) {
            SoundCache.field291.clearFiles();
        }
        if (class88.field1069 != null) {
            class88.field1069.clearFiles();
        }
        if (World.field815 != null) {
            World.field815.clearFiles();
        }
        if (WorldMapSection2.field3102 != null) {
            WorldMapSection2.field3102.clearFiles();
        }
        if (class68.field494 != null) {
            class68.field494.clearFiles();
        }
        if (class544.field5399 != null) {
            class544.field5399.clearFiles();
        }
        if (class59.field398 != null) {
            class59.field398.clearFiles();
        }
        if (ClanSettings.field1762 != null) {
            ClanSettings.field1762.clearFiles();
        }
        if (PcmPlayer.field276 != null) {
            PcmPlayer.field276.clearFiles();
        }
        if (SpotAnimationDefinition.field2704 != null) {
            SpotAnimationDefinition.field2704.clearFiles();
        }
        if (class221.field2421 != null) {
            class221.field2421.clearFiles();
        }
        if (class137.field1603 != null) {
            class137.field1603.clearFiles();
        }
        if (StructComposition.field2746 != null) {
            StructComposition.field2746.clearFiles();
        }
        if (class157.field1718 != null) {
            class157.field1718.clearFiles();
        }
    }

    @ObfuscatedName(value="jx")
    @ObfuscatedSignature(descriptor="(Ldz;IIIIII)V", garbageValue="-1622761338")
    @Export(value="drawActor2d")
    static void drawActor2d(class103 class1032, int n, int n2, int n3, int n4, int n5) {
        if (n >= 128 && 13056 >= n && n2 >= 128 && 13056 >= n2) {
            int n6 = Canvas.method337(class1032, n3, n4, class1032.field1321) - n5;
            n -= Buddy.cameraX;
            n6 -= Message.cameraY;
            int n7 = SceneTileModel.field1954[class159.cameraPitch];
            int n8 = SceneTileModel.Rasterizer3D_cosine[class159.cameraPitch];
            int n9 = SceneTileModel.field1954[class183.cameraYaw];
            int n10 = SceneTileModel.Rasterizer3D_cosine[class183.cameraYaw];
            int n11 = n9 * (n2 -= class31.cameraZ) + n10 * n >> 16;
            n2 = n10 * n2 - n9 * n >> 16;
            n = n11;
            n11 = n6 * n8 - n7 * n2 >> 16;
            n2 = n7 * n6 + n8 * n2 >> 16;
            n6 = n11;
            if (n2 < 50) {
                Client.field802 = -1;
                Client.field538 = -1;
            } else {
                Client.field802 = Client.viewportWidth / 2 + Client.viewportZoom * n / n2;
                Client.field538 = Client.viewportHeight / 2 + n6 * Client.viewportZoom / n2;
            }
            return;
        }
        Client.field802 = -1;
        Client.field538 = -1;
    }
}

