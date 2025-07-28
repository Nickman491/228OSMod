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
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ew")
@Implements(value="BuddyRankComparator")
public class BuddyRankComparator
extends AbstractUserComparator {
    @ObfuscatedName(value="av")
    static String[] field1522;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=139576529)
    @Export(value="canvasWidth")
    public static int canvasWidth;
    @ObfuscatedName(value="km")
    @ObfuscatedSignature(descriptor="[Lvf;")
    static SpritePixels[] field1520;
    @ObfuscatedName(value="ay")
    @Export(value="reversed")
    final boolean reversed;

    public BuddyRankComparator(boolean bl) {
        this.reversed = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lsu;Lsu;I)I", garbageValue="335257140")
    @Export(value="compareBuddy")
    int compareBuddy(Buddy buddy, Buddy buddy2) {
        if (buddy2.rank == buddy.rank) {
            return this.compareUser(buddy, buddy2);
        }
        return this.reversed ? buddy.rank - buddy2.rank : buddy2.rank - buddy.rank;
    }

    public int compare(Object object, Object object2) {
        return this.compareBuddy((Buddy)object, (Buddy)object2);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(ILdb;I)Ldz;", garbageValue="1501070296")
    public static class103 method3366(int n, class97 class972) {
        class103 class1032;
        Iterator iterator = class972.iterator();
        do {
            if (!iterator.hasNext()) {
                return class972.method2726();
            }
            class1032 = (class103)iterator.next();
        } while (class1032.field1329[n] == null || class1032.field1320 == -1);
        return class1032;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="2021385313")
    public static int method3362(int n, int n2) {
        int n3 = n2 - n & 0x7FF;
        if (n3 <= 1024) {
            return n3;
        }
        return -(2048 - n3);
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(Lqw;Lqw;Lqw;I)V", garbageValue="-863541888")
    @Export(value="drawTitle")
    static void drawTitle(Font var0, Font var1_1, Font var2_2) {
        block62: {
            block61: {
                block63: {
                    block64: {
                        block65: {
                            block66: {
                                Login.xPadding = (BuddyRankComparator.canvasWidth - 765) / 2;
                                Login.loginBoxX = Login.xPadding + 202;
                                UserComparator3.loginBoxCenter = Login.loginBoxX + 180;
                                if (Login.worldSelectOpen) break block62;
                                WorldMapSectionType.leftTitleSprite.drawAt(Login.xPadding, 0);
                                TriBool.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
                                Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
                                if (Client.gameState == 0 || Client.gameState == 5) {
                                    var3_3 = 20;
                                    var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3_3, 0xFFFFFF, -1);
                                    var4_4 = 253 - var3_3;
                                    Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4_4, 304, 34, 0x8C1111);
                                    Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4_4 + 1, 302, 32, 0);
                                    Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4_4 + 2, Login.Login_loadingPercent * 3, 30, 0x8C1111);
                                    Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4_4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
                                    var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3_3, 0xFFFFFF, -1);
                                }
                                if (Client.gameState == 20) {
                                    Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2);
                                    var3_3 = 201;
                                    var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var3_3, 0xFFFF00, 0);
                                    var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3_3 += 15, 0xFFFF00, 0);
                                    var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3_3 += 15, 0xFFFF00, 0);
                                    var3_3 += 15;
                                    var3_3 += 7;
                                    if (Login.loginIndex != 4 && Login.loginIndex != 10) {
                                        var0.draw("Login: ", Login.loginBoxX + 180 - 110, var3_3, 0xFFFFFF, 0);
                                        var4_4 = 200;
                                        var5_5 = class544.clientPreferences.method2974() != false ? class106.method3069(Login.Login_username) : Login.Login_username;
                                        var6_6 = var5_5;
                                        block8: while (true) {
                                            if (var0.stringWidth((String)var6_6) <= var4_4) {
                                                var0.draw(AbstractFont.escapeBrackets((String)var6_6), Login.loginBoxX + 180 - 70, var3_3, 0xFFFFFF, 0);
                                                var3_3 += 15;
                                                var7_7 = class106.method3069(Login.Login_password);
                                                while (true) {
                                                    if (var0.stringWidth(var7_7) <= var4_4) {
                                                        var0.draw("Password: " + var7_7, Login.loginBoxX + 180 - 108, var3_3, 0xFFFFFF, 0);
                                                        var3_3 += 15;
                                                        break block8;
                                                    }
                                                    var7_7 = var7_7.substring(1);
                                                }
                                            }
                                            var6_6 = var6_6.substring(0, var6_6.length() - 1);
                                        }
                                    }
                                }
                                if (Client.gameState != 10 && Client.gameState != 11 && Client.gameState != 50) break block61;
                                Login.titleboxSprite.drawAt(Login.loginBoxX, 171);
                                if (Login.loginIndex == 0) break block63;
                                if (Login.loginIndex == 1) break block64;
                                if (Login.loginIndex == 2) break block65;
                                if (Login.loginIndex == 3) break block66;
                                if (Login.loginIndex == 4) ** GOTO lbl282
                                if (Login.loginIndex != 5) {
                                    if (Login.loginIndex != 6) {
                                        if (Login.loginIndex != 7) {
                                            if (Login.loginIndex != 8) {
                                                if (Login.loginIndex != 9) {
                                                    if (Login.loginIndex != 10) {
                                                        if (Login.loginIndex != 12) {
                                                            if (Login.loginIndex != 13) {
                                                                if (Login.loginIndex != 14) {
                                                                    if (Login.loginIndex != 24) {
                                                                        if (Login.loginIndex != 32) {
                                                                            if (Login.loginIndex != 33) {
                                                                                if (Login.loginIndex == 34) {
                                                                                    var3_3 = 201;
                                                                                    var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var3_3, 0xFFFF00, 0);
                                                                                    var1_1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3_3 += 20, 0xFFFF00, 0);
                                                                                    var1_1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3_3 += 20, 0xFFFF00, 0);
                                                                                    var4_4 = Login.loginBoxX + 180;
                                                                                    var18_8 = 276;
                                                                                    class454.field4897.drawAt(var4_4 - 73, var18_8 - 20);
                                                                                    var6_6 = class149.World_request != null ? "Loading..." : "Switch World";
                                                                                    var2_2.drawCentered((String)var6_6, var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                                                                    var4_4 = Login.loginBoxX + 180;
                                                                                    var18_8 = 326;
                                                                                    class454.field4897.drawAt(var4_4 - 73, var18_8 - 20);
                                                                                    var2_2.drawCentered("Back", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                                                                }
                                                                            } else {
                                                                                var3_3 = 201;
                                                                                var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var3_3, 0xFFFF00, 0);
                                                                                var1_1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3_3 += 20, 0xFFFF00, 0);
                                                                                var1_1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3_3 += 20, 0xFFFF00, 0);
                                                                                var3_3 += 15;
                                                                                var4_4 = Login.loginBoxX + 180;
                                                                                var18_8 = 276;
                                                                                class454.field4897.drawAt(var4_4 - 73, var18_8 - 20);
                                                                                var2_2.drawCentered("Download Launcher", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                                                                var4_4 = Login.loginBoxX + 180;
                                                                                var18_8 = 326;
                                                                                class454.field4897.drawAt(var4_4 - 73, var18_8 - 20);
                                                                                var2_2.drawCentered("Back", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                                                            }
                                                                        } else {
                                                                            var3_3 = 216;
                                                                            var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var3_3, 0xFFFF00, 0);
                                                                            var2_2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var3_3 += 15, 0xFFFF00, 0);
                                                                            var2_2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var3_3 += 15, 0xFFFF00, 0);
                                                                            var3_3 += 15;
                                                                            var4_4 = Login.loginBoxX + 180 - 80;
                                                                            var18_8 = 321;
                                                                            class454.field4897.drawAt(var4_4 - 73, var18_8 - 20);
                                                                            var0.drawCentered("Set Date of Birth", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                                                            var4_4 = Login.loginBoxX + 180 + 80;
                                                                            class454.field4897.drawAt(var4_4 - 73, var18_8 - 20);
                                                                            var0.drawCentered("Back", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                                                        }
                                                                    } else {
                                                                        var3_3 = 221;
                                                                        var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var3_3, 0xFFFFFF, 0);
                                                                        var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3_3 += 15, 0xFFFFFF, 0);
                                                                        var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3_3 += 15, 0xFFFFFF, 0);
                                                                        var3_3 += 15;
                                                                        var4_4 = Login.loginBoxX + 180;
                                                                        var18_8 = 301;
                                                                        class454.field4897.drawAt(var4_4 - 73, var18_8 - 20);
                                                                        var0.drawCentered("Ok", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                                                    }
                                                                } else {
                                                                    var3_3 = 201;
                                                                    var19_9 = "";
                                                                    var5_5 = "";
                                                                    var6_6 = "";
                                                                    switch (Login.Login_banType) {
                                                                        case 0: {
                                                                            var19_9 = "Your account has been involved";
                                                                            var5_5 = "in serious rule breaking.";
                                                                            var6_6 = "";
                                                                            break;
                                                                        }
                                                                        case 1: {
                                                                            var19_9 = "Your account has been locked due to";
                                                                            var5_5 = "suspicious activity.";
                                                                            var6_6 = "Please recover your account.";
                                                                            break;
                                                                        }
                                                                        default: {
                                                                            class33.Login_promptCredentials(false);
                                                                            break;
                                                                        }
                                                                        case 2: {
                                                                            var19_9 = "The unpaid balance on your account needs";
                                                                            var5_5 = "to be resolved before you can play.";
                                                                            var6_6 = Strings.field4301;
                                                                        }
                                                                    }
                                                                    var0.drawCentered(var19_9, Login.loginBoxX + 180, var3_3, 0xFFFF00, 0);
                                                                    var0.drawCentered(var5_5, Login.loginBoxX + 180, var3_3 += 20, 0xFFFF00, 0);
                                                                    var0.drawCentered((String)var6_6, Login.loginBoxX + 180, var3_3 += 20, 0xFFFF00, 0);
                                                                    var20_10 = Login.loginBoxX + 180;
                                                                    var8_13 = 276;
                                                                    class454.field4897.drawAt(var20_10 - 73, var8_13 - 20);
                                                                    if (Login.Login_banType != 1) {
                                                                        var0.drawCentered("View Appeal Options", var20_10, var8_13 + 5, 0xFFFFFF, 0);
                                                                    } else {
                                                                        var0.drawCentered("Recover Account", var20_10, var8_13 + 5, 0xFFFFFF, 0);
                                                                    }
                                                                    var20_10 = Login.loginBoxX + 180;
                                                                    var8_13 = 326;
                                                                    class454.field4897.drawAt(var20_10 - 73, var8_13 - 20);
                                                                    var0.drawCentered("Back", var20_10, var8_13 + 5, 0xFFFFFF, 0);
                                                                }
                                                            } else {
                                                                var3_3 = 231;
                                                                var2_2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var3_3, 0xFFFFFF, 0);
                                                                var2_2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var3_3 += 20, 0xFFFFFF, 0);
                                                                var4_4 = Login.loginBoxX + 180;
                                                                var3_3 = 311;
                                                                class454.field4897.drawAt(var4_4 - 73, var3_3 - 20);
                                                                var0.drawCentered("Back", var4_4, var3_3 + 5, 0xFFFFFF, 0);
                                                            }
                                                        } else {
                                                            var3_3 = UserComparator3.loginBoxCenter;
                                                            var4_4 = 216;
                                                            var2_2.drawCentered("Before using this app, please read and accept our", var3_3, var4_4, 0xFFFFFF, 0);
                                                            var2_2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var3_3, var4_4 += 17, 0xFFFFFF, 0);
                                                            var2_2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var3_3, var4_4 += 17, 0xFFFFFF, 0);
                                                            var2_2.drawCentered("By accepting, you agree to these documents.", var3_3, var4_4 += 17, 0xFFFFFF, 0);
                                                            var3_3 = UserComparator3.loginBoxCenter - 80;
                                                            var4_4 = 311;
                                                            class454.field4897.drawAt(var3_3 - 73, var4_4 - 20);
                                                            var0.drawCentered("Accept", var3_3, var4_4 + 5, 0xFFFFFF, 0);
                                                            var3_3 = UserComparator3.loginBoxCenter + 80;
                                                            class454.field4897.drawAt(var3_3 - 73, var4_4 - 20);
                                                            var0.drawCentered("Decline", var3_3, var4_4 + 5, 0xFFFFFF, 0);
                                                        }
                                                    } else {
                                                        var3_3 = Login.loginBoxX + 180;
                                                        var4_4 = 209;
                                                        var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var4_4, 0xFFFF00, 0);
                                                        Login.field953.drawAt(var3_3 - 109, var4_4 += 20);
                                                        if (!Login.field943.isEmpty()) {
                                                            class418.field4715.drawAt(var3_3 - 48, var4_4 + 5);
                                                            var0.drawCentered(Login.field943, var3_3, var4_4 + 68 - 15, 0xFFFF00, 0);
                                                        } else {
                                                            class418.field4715.drawAt(var3_3 - 48, var4_4 + 18);
                                                        }
                                                    }
                                                } else {
                                                    var3_3 = 221;
                                                    var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var3_3, 0xFFFF00, 0);
                                                    var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3_3 += 25, 0xFFFF00, 0);
                                                    var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3_3 += 25, 0xFFFF00, 0);
                                                    var4_4 = Login.loginBoxX + 180;
                                                    var18_8 = 311;
                                                    class454.field4897.drawAt(var4_4 - 73, var18_8 - 20);
                                                    var0.drawCentered("Try again", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                                }
                                            } else {
                                                var3_3 = 216;
                                                var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var3_3, 0xFFFF00, 0);
                                                var2_2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var3_3 += 15, 0xFFFF00, 0);
                                                var2_2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var3_3 += 15, 0xFFFF00, 0);
                                                var3_3 += 15;
                                                var4_4 = Login.loginBoxX + 180 - 80;
                                                var18_8 = 321;
                                                class454.field4897.drawAt(var4_4 - 73, var18_8 - 20);
                                                var0.drawCentered("Privacy Policy", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                                var4_4 = Login.loginBoxX + 180 + 80;
                                                class454.field4897.drawAt(var4_4 - 73, var18_8 - 20);
                                                var0.drawCentered("Back", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                            }
                                        } else {
                                            if (class380.field4145 && !Client.onMobile) {
                                                var3_3 = 201;
                                                var0.drawCentered(Login.Login_response1, UserComparator3.loginBoxCenter, var3_3, 0xFFFF00, 0);
                                                var0.drawCentered(Login.Login_response2, UserComparator3.loginBoxCenter, var3_3 += 15, 0xFFFF00, 0);
                                                var0.drawCentered(Login.Login_response3, UserComparator3.loginBoxCenter, var3_3 += 15, 0xFFFF00, 0);
                                                var4_4 = UserComparator3.loginBoxCenter - 150;
                                                var3_3 += 10;
                                                var18_8 = 0;
                                                while (true) {
                                                    if (var18_8 >= 8) {
                                                        var18_8 = UserComparator3.loginBoxCenter - 80;
                                                        var21_17 = 321;
                                                        class454.field4897.drawAt(var18_8 - 73, var21_17 - 20);
                                                        var0.drawCentered("Submit", var18_8, var21_17 + 5, 0xFFFFFF, 0);
                                                        var18_8 = UserComparator3.loginBoxCenter + 80;
                                                        class454.field4897.drawAt(var18_8 - 73, var21_17 - 20);
                                                        var0.drawCentered("Cancel", var18_8, var21_17 + 5, 0xFFFFFF, 0);
                                                        break block61;
                                                    }
                                                    class454.field4897.method10712(var4_4, var3_3, 30, 40);
                                                    var21_17 = (var18_8 == Login.field941 ? 1 : 0) & (Client.cycle % 40 < 20 ? 1 : 0);
                                                    var0.draw((Login.field922[var18_8] == null ? "" : Login.field922[var18_8]) + (var21_17 != 0 ? class97.colorStartTag(0xFFFF00) + "|" : ""), var4_4 + 10, var3_3 + 27, 0xFFFFFF, 0);
                                                    if (var18_8 != 1 && var18_8 != 3) {
                                                        var4_4 += 35;
                                                    } else {
                                                        var0.draw(AbstractFont.escapeBrackets("/"), (var4_4 += 50) - 13, var3_3 + 27, 0xFFFFFF, 0);
                                                    }
                                                    ++var18_8;
                                                }
                                            }
                                            var3_3 = 216;
                                            var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var3_3, 0xFFFF00, 0);
                                            var2_2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var3_3 += 15, 0xFFFF00, 0);
                                            var2_2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var3_3 += 15, 0xFFFF00, 0);
                                            var3_3 += 15;
                                            var4_4 = Login.loginBoxX + 180 - 80;
                                            var18_8 = 321;
                                            class454.field4897.drawAt(var4_4 - 73, var18_8 - 20);
                                            var0.drawCentered("Set Date of Birth", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                            var4_4 = Login.loginBoxX + 180 + 80;
                                            class454.field4897.drawAt(var4_4 - 73, var18_8 - 20);
                                            var0.drawCentered("Back", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                        }
                                    } else {
                                        var3_3 = 201;
                                        var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var3_3, 0xFFFF00, 0);
                                        var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3_3 += 15, 0xFFFF00, 0);
                                        var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3_3 += 15, 0xFFFF00, 0);
                                        var3_3 += 15;
                                        var4_4 = Login.loginBoxX + 180;
                                        var18_8 = 321;
                                        class454.field4897.drawAt(var4_4 - 73, var18_8 - 20);
                                        var0.drawCentered("Back", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                    }
                                } else {
                                    var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 0xFFFF00, 0);
                                    var3_3 = 221;
                                    var2_2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var3_3, 0xFFFF00, 0);
                                    var2_2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3_3 += 15, 0xFFFF00, 0);
                                    var2_2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3_3 += 15, 0xFFFF00, 0);
                                    var3_3 += 15;
                                    var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var3_3 += 14, 0xFFFFFF, 0);
                                    var4_4 = 174;
                                    var5_5 = class544.clientPreferences.method2974() != false ? class106.method3069(Login.Login_username) : Login.Login_username;
                                    var6_6 = var5_5;
                                    while (true) {
                                        if (var0.stringWidth((String)var6_6) <= var4_4) {
                                            var0.draw(AbstractFont.escapeBrackets((String)var6_6) + (Client.cycle % 40 < 20 ? class97.colorStartTag(0xFFFF00) + "|" : ""), Login.loginBoxX + 180 - 34, var3_3, 0xFFFFFF, 0);
                                            var3_3 += 15;
                                            var20_11 = Login.loginBoxX + 180 - 80;
                                            var8_14 = 321;
                                            class454.field4897.drawAt(var20_11 - 73, var8_14 - 20);
                                            var0.drawCentered("Recover", var20_11, var8_14 + 5, 0xFFFFFF, 0);
                                            var20_11 = Login.loginBoxX + 180 + 80;
                                            class454.field4897.drawAt(var20_11 - 73, var8_14 - 20);
                                            var0.drawCentered("Back", var20_11, var8_14 + 5, 0xFFFFFF, 0);
                                            var8_14 = 356;
                                            var1_1.drawCentered("Still having trouble logging in?", UserComparator3.loginBoxCenter, var8_14, 0xFFFFFFF, 0);
                                            break block61;
                                        }
                                        var6_6 = var6_6.substring(1);
                                    }
lbl282:
                                    // 1 sources

                                    var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 0xFFFF00, 0);
                                    var3_3 = 236;
                                    var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var3_3, 0xFFFFFF, 0);
                                    var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3_3 += 15, 0xFFFFFF, 0);
                                    var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3_3 += 15, 0xFFFFFF, 0);
                                    var0.draw("PIN: " + class106.method3069(class480.otp) + (Client.cycle % 40 < 20 ? class97.colorStartTag(0xFFFF00) + "|" : ""), Login.loginBoxX + 180 - 108, var3_3 += 15, 0xFFFFFF, 0);
                                    var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var3_3 -= 8, 0xFFFF00, 0);
                                    var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var3_3 += 15, 0xFFFF00, 0);
                                    var4_4 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15;
                                    var18_8 = var3_3 - var0.ascent;
                                    var6_6 = !Login.field946 ? Login.field920 : FriendLoginUpdate.field4992;
                                    var6_6.drawAt(var4_4, var18_8);
                                    var3_3 += 15;
                                    var20_12 = Login.loginBoxX + 180 - 80;
                                    var8_15 = 321;
                                    class454.field4897.drawAt(var20_12 - 73, var8_15 - 20);
                                    var0.drawCentered("Continue", var20_12, var8_15 + 5, 0xFFFFFF, 0);
                                    var20_12 = Login.loginBoxX + 180 + 80;
                                    class454.field4897.drawAt(var20_12 - 73, var8_15 - 20);
                                    var0.drawCentered("Cancel", var20_12, var8_15 + 5, 0xFFFFFF, 0);
                                    var1_1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var8_15 + 36, 0xFFFFFF, 0);
                                }
                                break block61;
                            }
                            var3_3 = 201;
                            var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var3_3, 0xFFFF00, 0);
                            var1_1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var3_3 += 20, 0xFFFF00, 0);
                            var1_1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var3_3 += 20, 0xFFFF00, 0);
                            var3_3 += 15;
                            var4_4 = Login.loginBoxX + 180;
                            var18_8 = 276;
                            class454.field4897.drawAt(var4_4 - 73, var18_8 - 20);
                            var2_2.drawCentered("Try again", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                            var4_4 = Login.loginBoxX + 180;
                            var18_8 = 326;
                            class454.field4897.drawAt(var4_4 - 73, var18_8 - 20);
                            var2_2.drawCentered("Forgotten password?", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                            break block61;
                        }
                        var3_3 = 201;
                        var0.drawCentered(Login.Login_response1, UserComparator3.loginBoxCenter, var3_3, 0xFFFF00, 0);
                        var0.drawCentered(Login.Login_response2, UserComparator3.loginBoxCenter, var3_3 += 15, 0xFFFF00, 0);
                        var0.drawCentered(Login.Login_response3, UserComparator3.loginBoxCenter, var3_3 += 15, 0xFFFF00, 0);
                        var3_3 += 15;
                        var0.draw("Login: ", UserComparator3.loginBoxCenter - 110, var3_3 += 7, 0xFFFFFF, 0);
                        var4_4 = 200;
                        var5_5 = class544.clientPreferences.method2974() != false ? class106.method3069(Login.Login_username) : Login.Login_username;
                        var6_6 = var5_5;
                        while (true) {
                            if (var0.stringWidth((String)var6_6) <= var4_4) {
                                var0.draw(AbstractFont.escapeBrackets((String)var6_6) + ((Login.currentLoginField == 0 & Client.cycle % 40 < 20) != false ? class97.colorStartTag(0xFFFF00) + "|" : ""), UserComparator3.loginBoxCenter - 70, var3_3, 0xFFFFFF, 0);
                                var3_3 += 15;
                                var7_7 = class106.method3069(Login.Login_password);
                                while (true) {
                                    if (var0.stringWidth(var7_7) <= var4_4) {
                                        var0.draw("Password: " + var7_7 + ((Login.currentLoginField == 1 & Client.cycle % 40 < 20) != false ? class97.colorStartTag(0xFFFF00) + "|" : ""), UserComparator3.loginBoxCenter - 108, var3_3, 0xFFFFFF, 0);
                                        var3_3 += 15;
                                        var3_3 = 277;
                                        var8_16 = UserComparator3.loginBoxCenter + -117;
                                        var10_18 = Client.Login_isUsernameRemembered;
                                        var11_19 = Login.field944;
                                        var12_21 = var9_20 = var10_18 ? (var11_19 ? class112.field1414 : FriendLoginUpdate.field4992) : (var11_19 != false ? class157.field1724 : Login.field920);
                                        var12_21.drawAt(var8_16, var3_3);
                                        var8_16 = var8_16 + var12_21.subWidth + 5;
                                        var1_1.draw("Remember username", var8_16, var3_3 + 13, 0xFFFF00, 0);
                                        var8_16 = UserComparator3.loginBoxCenter + 24;
                                        var14_22 = class544.clientPreferences.method2974();
                                        var15_23 = Login.field945;
                                        var12_21 = var13_24 = var14_22 ? (var15_23 ? class112.field1414 : FriendLoginUpdate.field4992) : (var15_23 != false ? class157.field1724 : Login.field920);
                                        var12_21.drawAt(var8_16, var3_3);
                                        var8_16 = var8_16 + var12_21.subWidth + 5;
                                        var1_1.draw("Hide username", var8_16, var3_3 + 13, 0xFFFF00, 0);
                                        var3_3 += 15;
                                        var16_25 = UserComparator3.loginBoxCenter - 80;
                                        var17_26 = 321;
                                        class454.field4897.drawAt(var16_25 - 73, var17_26 - 20);
                                        var0.drawCentered("Login", var16_25, var17_26 + 5, 0xFFFFFF, 0);
                                        var16_25 = UserComparator3.loginBoxCenter + 80;
                                        class454.field4897.drawAt(var16_25 - 73, var17_26 - 20);
                                        var0.drawCentered("Cancel", var16_25, var17_26 + 5, 0xFFFFFF, 0);
                                        var3_3 = 357;
                                        switch (Login.field933) {
                                            default: {
                                                WorldMapDecorationType.field4073 = "Can't login? Click here.";
                                                break;
                                            }
                                            case 2: {
                                                WorldMapDecorationType.field4073 = "Having trouble logging in?";
                                            }
                                        }
                                        class169.field1800 = new Bounds(UserComparator3.loginBoxCenter, var3_3, var1_1.stringWidth(WorldMapDecorationType.field4073), 11);
                                        WorldMapCacheName.field3266 = new Bounds(UserComparator3.loginBoxCenter, var3_3, var1_1.stringWidth("Still having trouble logging in?"), 11);
                                        var1_1.drawCentered(WorldMapDecorationType.field4073, UserComparator3.loginBoxCenter, var3_3, 0xFFFFFF, 0);
                                        break block61;
                                    }
                                    var7_7 = var7_7.substring(1);
                                }
                            }
                            var6_6 = var6_6.substring(1);
                        }
                    }
                    var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 0xFFFF00, 0);
                    var3_3 = 236;
                    var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var3_3, 0xFFFFFF, 0);
                    var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var3_3 += 15, 0xFFFFFF, 0);
                    var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var3_3 += 15, 0xFFFFFF, 0);
                    var3_3 += 15;
                    var4_4 = Login.loginBoxX + 180 - 80;
                    var18_8 = 321;
                    class454.field4897.drawAt(var4_4 - 73, var18_8 - 20);
                    var0.drawCentered("Continue", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                    var4_4 = Login.loginBoxX + 180 + 80;
                    class454.field4897.drawAt(var4_4 - 73, var18_8 - 20);
                    var0.drawCentered("Cancel", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                    break block61;
                }
                var3_3 = 251;
                var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var3_3, 0xFFFF00, 0);
                var3_3 += 30;
                var4_4 = Login.loginBoxX + 180 - 80;
                var18_8 = 291;
                class454.field4897.drawAt(var4_4 - 73, var18_8 - 20);
                var0.drawLines("New User", var4_4 - 73, var18_8 - 20, 144, 40, 0xFFFFFF, 0, 1, 1, 0);
                var4_4 = Login.loginBoxX + 180 + 80;
                class454.field4897.drawAt(var4_4 - 73, var18_8 - 20);
                var0.drawLines("Existing User", var4_4 - 73, var18_8 - 20, 144, 40, 0xFFFFFF, 0, 1, 1, 0);
            }
            if (Client.gameState >= 10) {
                var22_27 = new int[4];
                Rasterizer2D.Rasterizer2D_getClipArray(var22_27);
                Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, Huffman.canvasHeight);
                class461.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
                class461.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
                Rasterizer2D.Rasterizer2D_setClipArray(var22_27);
            }
            class169.title_muteSprite[class544.clientPreferences.method2887() != false ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
            if (Client.gameState > 5 && Language.Language_EN == ScriptFrame.clientLanguage) {
                if (class93.field1118 == null) {
                    class93.field1118 = AttackOption.SpriteBuffer_getIndexedSpriteByName(PcmPlayer.field276, "sl_button", "");
                } else {
                    var3_3 = Login.xPadding + 5;
                    var4_4 = 463;
                    var18_8 = 100;
                    var21_17 = 35;
                    class93.field1118.drawAt(var3_3, var4_4);
                    var0.drawCentered("World" + " " + Client.worldId, var18_8 / 2 + var3_3, var21_17 / 2 + var4_4 - 2, 0xFFFFFF, 0);
                    if (class149.World_request != null) {
                        var1_1.drawCentered("Loading...", var18_8 / 2 + var3_3, var21_17 / 2 + var4_4 + 12, 0xFFFFFF, 0);
                    } else {
                        var1_1.drawCentered("Click to switch", var18_8 / 2 + var3_3, var21_17 / 2 + var4_4 + 12, 0xFFFFFF, 0);
                    }
                }
            }
            return;
        }
        class390.method7723(var0, var1_1);
    }

    @ObfuscatedName(value="kh")
    @ObfuscatedSignature(descriptor="(Ldz;IIIII)Ldu;", garbageValue="1789450078")
    static final PendingSpawn method3365(class103 class1032, int n, int n2, int n3, int n4) {
        PendingSpawn pendingSpawn = (PendingSpawn)class1032.field1333.last();
        while (pendingSpawn != null) {
            if (pendingSpawn.field1188 == n && n2 == pendingSpawn.field1187 && n3 == pendingSpawn.field1182 && n4 == pendingSpawn.field1180) {
                return pendingSpawn;
            }
            pendingSpawn = (PendingSpawn)class1032.field1333.previous();
        }
        return null;
    }

    @ObfuscatedName(value="ml")
    @ObfuscatedSignature(descriptor="([Lna;II)V", garbageValue="389193373")
    @Export(value="runComponentCloseListeners")
    static final void runComponentCloseListeners(Widget[] widgetArray, int n) {
        int n2 = 0;
        while (n2 < widgetArray.length) {
            Widget widget = widgetArray[n2];
            if (widget != null) {
                Node node;
                if (widget.type == 0) {
                    if (widget.children != null) {
                        BuddyRankComparator.runComponentCloseListeners(widget.children, n);
                    }
                    if ((node = (InterfaceParent)Client.interfaceParents.get(widget.id)) != null) {
                        Client.method1709(node.group, n);
                    }
                }
                if (n == 0 && widget.onDialogAbort != null) {
                    node = new ScriptEvent();
                    ((ScriptEvent)node).widget = widget;
                    ((ScriptEvent)node).args = widget.onDialogAbort;
                    Friend.runScriptEvent((ScriptEvent)node);
                }
                if (n == 1 && widget.onSubChange != null && (widget.childIndex < 0 || (node = ClanChannel.field1807.method7031(widget.id)) != null && ((Widget)node).children != null && widget.childIndex < ((Widget)node).children.length && widget == ((Widget)node).children[widget.childIndex])) {
                    node = new ScriptEvent();
                    ((ScriptEvent)node).widget = widget;
                    ((ScriptEvent)node).args = widget.onSubChange;
                    Friend.runScriptEvent((ScriptEvent)node);
                }
            }
            ++n2;
        }
        return;
    }
}

