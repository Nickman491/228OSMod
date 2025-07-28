package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ew")
public class class128
extends class475 {
    @ObfuscatedName(value="av")
    static String[] field1522;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=139576529)
    public static int field1521;
    @ObfuscatedName(value="km")
    @ObfuscatedSignature(descriptor="[Lvf;")
    static class570[] field1520;
    @ObfuscatedName(value="ay")
    final boolean field1524;

    public class128(boolean bl) {
        this.field1524 = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lsu;Lsu;I)I", garbageValue="335257140")
    int method3363(class478 class4782, class478 class4783) {
        if (class4783.field5019 == class4782.field5019) {
            return this.method9184(class4782, class4783);
        }
        return this.field1524 ? class4782.field5019 - class4783.field5019 : class4783.field5019 - class4782.field5019;
    }

    public int compare(Object object, Object object2) {
        return this.method3363((class478)object, (class478)object2);
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
    static void method3364(class435 var0, class435 var1_1, class435 var2_2) {
        block62: {
            block61: {
                block63: {
                    block64: {
                        block65: {
                            block66: {
                                class78.field918 = (class128.field1521 - 765) / 2;
                                class78.field925 = class78.field918 + 202;
                                class125.field1507 = class78.field925 + 180;
                                if (class78.field950) break block62;
                                class292.field3195.method10741(class78.field918, 0);
                                class479.field5025.method10741(class78.field918 + 382, 0);
                                class78.field923.method10710(class78.field918 + 382 - class78.field923.field5567 / 2, 18);
                                if (client.field510 == 0 || client.field510 == 5) {
                                    var3_3 = 20;
                                    var0.method8679("RuneScape is loading - please wait...", class78.field925 + 180, 245 - var3_3, 0xFFFFFF, -1);
                                    var4_4 = 253 - var3_3;
                                    class566.method10617(class78.field925 + 180 - 152, var4_4, 304, 34, 0x8C1111);
                                    class566.method10617(class78.field925 + 180 - 151, var4_4 + 1, 302, 32, 0);
                                    class566.method10677(class78.field925 + 180 - 150, var4_4 + 2, class78.field935 * 3, 30, 0x8C1111);
                                    class566.method10677(class78.field925 + 180 - 150 + class78.field935 * 3, var4_4 + 2, 300 - class78.field935 * 3, 30, 0);
                                    var0.method8679(class78.field934, class78.field925 + 180, 276 - var3_3, 0xFFFFFF, -1);
                                }
                                if (client.field510 == 20) {
                                    class78.field921.method10710(class78.field925 + 180 - class78.field921.field5567 / 2, 271 - class78.field921.field5564 / 2);
                                    var3_3 = 201;
                                    var0.method8679(class78.field936, class78.field925 + 180, var3_3, 0xFFFF00, 0);
                                    var0.method8679(class78.field930, class78.field925 + 180, var3_3 += 15, 0xFFFF00, 0);
                                    var0.method8679(class78.field949, class78.field925 + 180, var3_3 += 15, 0xFFFF00, 0);
                                    var3_3 += 15;
                                    var3_3 += 7;
                                    if (class78.field926 != 4 && class78.field926 != 10) {
                                        var0.method8727("Login: ", class78.field925 + 180 - 110, var3_3, 0xFFFFFF, 0);
                                        var4_4 = 200;
                                        var5_5 = class544.field5403.method2974() != false ? class106.method3069(class78.field955) : class78.field955;
                                        var6_6 = var5_5;
                                        block8: while (true) {
                                            if (var0.method8682((String)var6_6) <= var4_4) {
                                                var0.method8727(class439.method8700((String)var6_6), class78.field925 + 180 - 70, var3_3, 0xFFFFFF, 0);
                                                var3_3 += 15;
                                                var7_7 = class106.method3069(class78.field940);
                                                while (true) {
                                                    if (var0.method8682(var7_7) <= var4_4) {
                                                        var0.method8727("Password: " + var7_7, class78.field925 + 180 - 108, var3_3, 0xFFFFFF, 0);
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
                                if (client.field510 != 10 && client.field510 != 11 && client.field510 != 50) break block61;
                                class78.field921.method10710(class78.field925, 171);
                                if (class78.field926 == 0) break block63;
                                if (class78.field926 == 1) break block64;
                                if (class78.field926 == 2) break block65;
                                if (class78.field926 == 3) break block66;
                                if (class78.field926 == 4) ** GOTO lbl282
                                if (class78.field926 != 5) {
                                    if (class78.field926 != 6) {
                                        if (class78.field926 != 7) {
                                            if (class78.field926 != 8) {
                                                if (class78.field926 != 9) {
                                                    if (class78.field926 != 10) {
                                                        if (class78.field926 != 12) {
                                                            if (class78.field926 != 13) {
                                                                if (class78.field926 != 14) {
                                                                    if (class78.field926 != 24) {
                                                                        if (class78.field926 != 32) {
                                                                            if (class78.field926 != 33) {
                                                                                if (class78.field926 == 34) {
                                                                                    var3_3 = 201;
                                                                                    var0.method8679(class78.field936, class78.field925 + 180, var3_3, 0xFFFF00, 0);
                                                                                    var1_1.method8679(class78.field930, class78.field925 + 180, var3_3 += 20, 0xFFFF00, 0);
                                                                                    var1_1.method8679(class78.field949, class78.field925 + 180, var3_3 += 20, 0xFFFF00, 0);
                                                                                    var4_4 = class78.field925 + 180;
                                                                                    var18_8 = 276;
                                                                                    class454.field4897.method10710(var4_4 - 73, var18_8 - 20);
                                                                                    var6_6 = class149.field1678 != null ? "Loading..." : "Switch World";
                                                                                    var2_2.method8679((String)var6_6, var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                                                                    var4_4 = class78.field925 + 180;
                                                                                    var18_8 = 326;
                                                                                    class454.field4897.method10710(var4_4 - 73, var18_8 - 20);
                                                                                    var2_2.method8679("Back", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                                                                }
                                                                            } else {
                                                                                var3_3 = 201;
                                                                                var0.method8679(class78.field936, class78.field925 + 180, var3_3, 0xFFFF00, 0);
                                                                                var1_1.method8679(class78.field930, class78.field925 + 180, var3_3 += 20, 0xFFFF00, 0);
                                                                                var1_1.method8679(class78.field949, class78.field925 + 180, var3_3 += 20, 0xFFFF00, 0);
                                                                                var3_3 += 15;
                                                                                var4_4 = class78.field925 + 180;
                                                                                var18_8 = 276;
                                                                                class454.field4897.method10710(var4_4 - 73, var18_8 - 20);
                                                                                var2_2.method8679("Download Launcher", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                                                                var4_4 = class78.field925 + 180;
                                                                                var18_8 = 326;
                                                                                class454.field4897.method10710(var4_4 - 73, var18_8 - 20);
                                                                                var2_2.method8679("Back", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                                                            }
                                                                        } else {
                                                                            var3_3 = 216;
                                                                            var0.method8679("Your date of birth isn't set.", class78.field925 + 180, var3_3, 0xFFFF00, 0);
                                                                            var2_2.method8679("Please verify your account status by", class78.field925 + 180, var3_3 += 15, 0xFFFF00, 0);
                                                                            var2_2.method8679("setting your date of birth.", class78.field925 + 180, var3_3 += 15, 0xFFFF00, 0);
                                                                            var3_3 += 15;
                                                                            var4_4 = class78.field925 + 180 - 80;
                                                                            var18_8 = 321;
                                                                            class454.field4897.method10710(var4_4 - 73, var18_8 - 20);
                                                                            var0.method8679("Set Date of Birth", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                                                            var4_4 = class78.field925 + 180 + 80;
                                                                            class454.field4897.method10710(var4_4 - 73, var18_8 - 20);
                                                                            var0.method8679("Back", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                                                        }
                                                                    } else {
                                                                        var3_3 = 221;
                                                                        var0.method8679(class78.field936, class78.field925 + 180, var3_3, 0xFFFFFF, 0);
                                                                        var0.method8679(class78.field930, class78.field925 + 180, var3_3 += 15, 0xFFFFFF, 0);
                                                                        var0.method8679(class78.field949, class78.field925 + 180, var3_3 += 15, 0xFFFFFF, 0);
                                                                        var3_3 += 15;
                                                                        var4_4 = class78.field925 + 180;
                                                                        var18_8 = 301;
                                                                        class454.field4897.method10710(var4_4 - 73, var18_8 - 20);
                                                                        var0.method8679("Ok", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                                                    }
                                                                } else {
                                                                    var3_3 = 201;
                                                                    var19_9 = "";
                                                                    var5_5 = "";
                                                                    var6_6 = "";
                                                                    switch (class78.field932) {
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
                                                                            class33.method515(false);
                                                                            break;
                                                                        }
                                                                        case 2: {
                                                                            var19_9 = "The unpaid balance on your account needs";
                                                                            var5_5 = "to be resolved before you can play.";
                                                                            var6_6 = class382.field4301;
                                                                        }
                                                                    }
                                                                    var0.method8679(var19_9, class78.field925 + 180, var3_3, 0xFFFF00, 0);
                                                                    var0.method8679(var5_5, class78.field925 + 180, var3_3 += 20, 0xFFFF00, 0);
                                                                    var0.method8679((String)var6_6, class78.field925 + 180, var3_3 += 20, 0xFFFF00, 0);
                                                                    var20_10 = class78.field925 + 180;
                                                                    var8_13 = 276;
                                                                    class454.field4897.method10710(var20_10 - 73, var8_13 - 20);
                                                                    if (class78.field932 != 1) {
                                                                        var0.method8679("View Appeal Options", var20_10, var8_13 + 5, 0xFFFFFF, 0);
                                                                    } else {
                                                                        var0.method8679("Recover Account", var20_10, var8_13 + 5, 0xFFFFFF, 0);
                                                                    }
                                                                    var20_10 = class78.field925 + 180;
                                                                    var8_13 = 326;
                                                                    class454.field4897.method10710(var20_10 - 73, var8_13 - 20);
                                                                    var0.method8679("Back", var20_10, var8_13 + 5, 0xFFFFFF, 0);
                                                                }
                                                            } else {
                                                                var3_3 = 231;
                                                                var2_2.method8679("You must accept our terms of use, privacy policy,", class78.field925 + 180, var3_3, 0xFFFFFF, 0);
                                                                var2_2.method8679("and end user licence agreement to continue.", class78.field925 + 180, var3_3 += 20, 0xFFFFFF, 0);
                                                                var4_4 = class78.field925 + 180;
                                                                var3_3 = 311;
                                                                class454.field4897.method10710(var4_4 - 73, var3_3 - 20);
                                                                var0.method8679("Back", var4_4, var3_3 + 5, 0xFFFFFF, 0);
                                                            }
                                                        } else {
                                                            var3_3 = class125.field1507;
                                                            var4_4 = 216;
                                                            var2_2.method8679("Before using this app, please read and accept our", var3_3, var4_4, 0xFFFFFF, 0);
                                                            var2_2.method8679("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var3_3, var4_4 += 17, 0xFFFFFF, 0);
                                                            var2_2.method8679("<col=ffd200>agreement (EULA)</col>.", var3_3, var4_4 += 17, 0xFFFFFF, 0);
                                                            var2_2.method8679("By accepting, you agree to these documents.", var3_3, var4_4 += 17, 0xFFFFFF, 0);
                                                            var3_3 = class125.field1507 - 80;
                                                            var4_4 = 311;
                                                            class454.field4897.method10710(var3_3 - 73, var4_4 - 20);
                                                            var0.method8679("Accept", var3_3, var4_4 + 5, 0xFFFFFF, 0);
                                                            var3_3 = class125.field1507 + 80;
                                                            class454.field4897.method10710(var3_3 - 73, var4_4 - 20);
                                                            var0.method8679("Decline", var3_3, var4_4 + 5, 0xFFFFFF, 0);
                                                        }
                                                    } else {
                                                        var3_3 = class78.field925 + 180;
                                                        var4_4 = 209;
                                                        var0.method8679("Welcome to RuneScape", class78.field925 + 180, var4_4, 0xFFFF00, 0);
                                                        class78.field953.method10710(var3_3 - 109, var4_4 += 20);
                                                        if (!class78.field943.isEmpty()) {
                                                            class418.field4715.method10710(var3_3 - 48, var4_4 + 5);
                                                            var0.method8679(class78.field943, var3_3, var4_4 + 68 - 15, 0xFFFF00, 0);
                                                        } else {
                                                            class418.field4715.method10710(var3_3 - 48, var4_4 + 18);
                                                        }
                                                    }
                                                } else {
                                                    var3_3 = 221;
                                                    var0.method8679(class78.field936, class78.field925 + 180, var3_3, 0xFFFF00, 0);
                                                    var0.method8679(class78.field930, class78.field925 + 180, var3_3 += 25, 0xFFFF00, 0);
                                                    var0.method8679(class78.field949, class78.field925 + 180, var3_3 += 25, 0xFFFF00, 0);
                                                    var4_4 = class78.field925 + 180;
                                                    var18_8 = 311;
                                                    class454.field4897.method10710(var4_4 - 73, var18_8 - 20);
                                                    var0.method8679("Try again", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                                }
                                            } else {
                                                var3_3 = 216;
                                                var0.method8679("Sorry, but your account is not eligible to play.", class78.field925 + 180, var3_3, 0xFFFF00, 0);
                                                var2_2.method8679("For more information, please take a look at", class78.field925 + 180, var3_3 += 15, 0xFFFF00, 0);
                                                var2_2.method8679("our privacy policy.", class78.field925 + 180, var3_3 += 15, 0xFFFF00, 0);
                                                var3_3 += 15;
                                                var4_4 = class78.field925 + 180 - 80;
                                                var18_8 = 321;
                                                class454.field4897.method10710(var4_4 - 73, var18_8 - 20);
                                                var0.method8679("Privacy Policy", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                                var4_4 = class78.field925 + 180 + 80;
                                                class454.field4897.method10710(var4_4 - 73, var18_8 - 20);
                                                var0.method8679("Back", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                            }
                                        } else {
                                            if (class380.field4145 && !client.field506) {
                                                var3_3 = 201;
                                                var0.method8679(class78.field936, class125.field1507, var3_3, 0xFFFF00, 0);
                                                var0.method8679(class78.field930, class125.field1507, var3_3 += 15, 0xFFFF00, 0);
                                                var0.method8679(class78.field949, class125.field1507, var3_3 += 15, 0xFFFF00, 0);
                                                var4_4 = class125.field1507 - 150;
                                                var3_3 += 10;
                                                var18_8 = 0;
                                                while (true) {
                                                    if (var18_8 >= 8) {
                                                        var18_8 = class125.field1507 - 80;
                                                        var21_17 = 321;
                                                        class454.field4897.method10710(var18_8 - 73, var21_17 - 20);
                                                        var0.method8679("Submit", var18_8, var21_17 + 5, 0xFFFFFF, 0);
                                                        var18_8 = class125.field1507 + 80;
                                                        class454.field4897.method10710(var18_8 - 73, var21_17 - 20);
                                                        var0.method8679("Cancel", var18_8, var21_17 + 5, 0xFFFFFF, 0);
                                                        break block61;
                                                    }
                                                    class454.field4897.method10712(var4_4, var3_3, 30, 40);
                                                    var21_17 = (var18_8 == class78.field941 ? 1 : 0) & (client.field514 % 40 < 20 ? 1 : 0);
                                                    var0.method8727((class78.field922[var18_8] == null ? "" : class78.field922[var18_8]) + (var21_17 != 0 ? class97.method2752(0xFFFF00) + "|" : ""), var4_4 + 10, var3_3 + 27, 0xFFFFFF, 0);
                                                    if (var18_8 != 1 && var18_8 != 3) {
                                                        var4_4 += 35;
                                                    } else {
                                                        var0.method8727(class439.method8700("/"), (var4_4 += 50) - 13, var3_3 + 27, 0xFFFFFF, 0);
                                                    }
                                                    ++var18_8;
                                                }
                                            }
                                            var3_3 = 216;
                                            var0.method8679("Your date of birth isn't set.", class78.field925 + 180, var3_3, 0xFFFF00, 0);
                                            var2_2.method8679("Please verify your account status by", class78.field925 + 180, var3_3 += 15, 0xFFFF00, 0);
                                            var2_2.method8679("setting your date of birth.", class78.field925 + 180, var3_3 += 15, 0xFFFF00, 0);
                                            var3_3 += 15;
                                            var4_4 = class78.field925 + 180 - 80;
                                            var18_8 = 321;
                                            class454.field4897.method10710(var4_4 - 73, var18_8 - 20);
                                            var0.method8679("Set Date of Birth", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                            var4_4 = class78.field925 + 180 + 80;
                                            class454.field4897.method10710(var4_4 - 73, var18_8 - 20);
                                            var0.method8679("Back", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                        }
                                    } else {
                                        var3_3 = 201;
                                        var0.method8679(class78.field936, class78.field925 + 180, var3_3, 0xFFFF00, 0);
                                        var0.method8679(class78.field930, class78.field925 + 180, var3_3 += 15, 0xFFFF00, 0);
                                        var0.method8679(class78.field949, class78.field925 + 180, var3_3 += 15, 0xFFFF00, 0);
                                        var3_3 += 15;
                                        var4_4 = class78.field925 + 180;
                                        var18_8 = 321;
                                        class454.field4897.method10710(var4_4 - 73, var18_8 - 20);
                                        var0.method8679("Back", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                                    }
                                } else {
                                    var0.method8679("Forgotten your password?", class78.field925 + 180, 201, 0xFFFF00, 0);
                                    var3_3 = 221;
                                    var2_2.method8679(class78.field936, class78.field925 + 180, var3_3, 0xFFFF00, 0);
                                    var2_2.method8679(class78.field930, class78.field925 + 180, var3_3 += 15, 0xFFFF00, 0);
                                    var2_2.method8679(class78.field949, class78.field925 + 180, var3_3 += 15, 0xFFFF00, 0);
                                    var3_3 += 15;
                                    var0.method8727("Username/email: ", class78.field925 + 180 - 145, var3_3 += 14, 0xFFFFFF, 0);
                                    var4_4 = 174;
                                    var5_5 = class544.field5403.method2974() != false ? class106.method3069(class78.field955) : class78.field955;
                                    var6_6 = var5_5;
                                    while (true) {
                                        if (var0.method8682((String)var6_6) <= var4_4) {
                                            var0.method8727(class439.method8700((String)var6_6) + (client.field514 % 40 < 20 ? class97.method2752(0xFFFF00) + "|" : ""), class78.field925 + 180 - 34, var3_3, 0xFFFFFF, 0);
                                            var3_3 += 15;
                                            var20_11 = class78.field925 + 180 - 80;
                                            var8_14 = 321;
                                            class454.field4897.method10710(var20_11 - 73, var8_14 - 20);
                                            var0.method8679("Recover", var20_11, var8_14 + 5, 0xFFFFFF, 0);
                                            var20_11 = class78.field925 + 180 + 80;
                                            class454.field4897.method10710(var20_11 - 73, var8_14 - 20);
                                            var0.method8679("Back", var20_11, var8_14 + 5, 0xFFFFFF, 0);
                                            var8_14 = 356;
                                            var1_1.method8679("Still having trouble logging in?", class125.field1507, var8_14, 0xFFFFFFF, 0);
                                            break block61;
                                        }
                                        var6_6 = var6_6.substring(1);
                                    }
lbl282:
                                    // 1 sources

                                    var0.method8679("Authenticator", class78.field925 + 180, 201, 0xFFFF00, 0);
                                    var3_3 = 236;
                                    var0.method8679(class78.field936, class78.field925 + 180, var3_3, 0xFFFFFF, 0);
                                    var0.method8679(class78.field930, class78.field925 + 180, var3_3 += 15, 0xFFFFFF, 0);
                                    var0.method8679(class78.field949, class78.field925 + 180, var3_3 += 15, 0xFFFFFF, 0);
                                    var0.method8727("PIN: " + class106.method3069(class480.field5036) + (client.field514 % 40 < 20 ? class97.method2752(0xFFFF00) + "|" : ""), class78.field925 + 180 - 108, var3_3 += 15, 0xFFFFFF, 0);
                                    var0.method8727("Trust this computer", class78.field925 + 180 - 9, var3_3 -= 8, 0xFFFF00, 0);
                                    var0.method8727("for 30 days: ", class78.field925 + 180 - 9, var3_3 += 15, 0xFFFF00, 0);
                                    var4_4 = 180 + class78.field925 - 9 + var0.method8682("for 30 days: ") + 15;
                                    var18_8 = var3_3 - var0.field4832;
                                    var6_6 = !class78.field946 ? class78.field920 : class472.field4992;
                                    var6_6.method10710(var4_4, var18_8);
                                    var3_3 += 15;
                                    var20_12 = class78.field925 + 180 - 80;
                                    var8_15 = 321;
                                    class454.field4897.method10710(var20_12 - 73, var8_15 - 20);
                                    var0.method8679("Continue", var20_12, var8_15 + 5, 0xFFFFFF, 0);
                                    var20_12 = class78.field925 + 180 + 80;
                                    class454.field4897.method10710(var20_12 - 73, var8_15 - 20);
                                    var0.method8679("Cancel", var20_12, var8_15 + 5, 0xFFFFFF, 0);
                                    var1_1.method8679("Can't login? Click here.", class78.field925 + 180, var8_15 + 36, 0xFFFFFF, 0);
                                }
                                break block61;
                            }
                            var3_3 = 201;
                            var0.method8679("Incorrect username or password.", class78.field925 + 180, var3_3, 0xFFFF00, 0);
                            var1_1.method8679("If you have upgraded to a Jagex Account, you", class78.field925 + 180, var3_3 += 20, 0xFFFF00, 0);
                            var1_1.method8679("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", class78.field925 + 180, var3_3 += 20, 0xFFFF00, 0);
                            var3_3 += 15;
                            var4_4 = class78.field925 + 180;
                            var18_8 = 276;
                            class454.field4897.method10710(var4_4 - 73, var18_8 - 20);
                            var2_2.method8679("Try again", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                            var4_4 = class78.field925 + 180;
                            var18_8 = 326;
                            class454.field4897.method10710(var4_4 - 73, var18_8 - 20);
                            var2_2.method8679("Forgotten password?", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                            break block61;
                        }
                        var3_3 = 201;
                        var0.method8679(class78.field936, class125.field1507, var3_3, 0xFFFF00, 0);
                        var0.method8679(class78.field930, class125.field1507, var3_3 += 15, 0xFFFF00, 0);
                        var0.method8679(class78.field949, class125.field1507, var3_3 += 15, 0xFFFF00, 0);
                        var3_3 += 15;
                        var0.method8727("Login: ", class125.field1507 - 110, var3_3 += 7, 0xFFFFFF, 0);
                        var4_4 = 200;
                        var5_5 = class544.field5403.method2974() != false ? class106.method3069(class78.field955) : class78.field955;
                        var6_6 = var5_5;
                        while (true) {
                            if (var0.method8682((String)var6_6) <= var4_4) {
                                var0.method8727(class439.method8700((String)var6_6) + ((class78.field947 == 0 & client.field514 % 40 < 20) != false ? class97.method2752(0xFFFF00) + "|" : ""), class125.field1507 - 70, var3_3, 0xFFFFFF, 0);
                                var3_3 += 15;
                                var7_7 = class106.method3069(class78.field940);
                                while (true) {
                                    if (var0.method8682(var7_7) <= var4_4) {
                                        var0.method8727("Password: " + var7_7 + ((class78.field947 == 1 & client.field514 % 40 < 20) != false ? class97.method2752(0xFFFF00) + "|" : ""), class125.field1507 - 108, var3_3, 0xFFFFFF, 0);
                                        var3_3 += 15;
                                        var3_3 = 277;
                                        var8_16 = class125.field1507 + -117;
                                        var10_18 = client.field555;
                                        var11_19 = class78.field944;
                                        var12_21 = var9_20 = var10_18 ? (var11_19 ? class112.field1414 : class472.field4992) : (var11_19 != false ? class157.field1724 : class78.field920);
                                        var12_21.method10710(var8_16, var3_3);
                                        var8_16 = var8_16 + var12_21.field5567 + 5;
                                        var1_1.method8727("Remember username", var8_16, var3_3 + 13, 0xFFFF00, 0);
                                        var8_16 = class125.field1507 + 24;
                                        var14_22 = class544.field5403.method2974();
                                        var15_23 = class78.field945;
                                        var12_21 = var13_24 = var14_22 ? (var15_23 ? class112.field1414 : class472.field4992) : (var15_23 != false ? class157.field1724 : class78.field920);
                                        var12_21.method10710(var8_16, var3_3);
                                        var8_16 = var8_16 + var12_21.field5567 + 5;
                                        var1_1.method8727("Hide username", var8_16, var3_3 + 13, 0xFFFF00, 0);
                                        var3_3 += 15;
                                        var16_25 = class125.field1507 - 80;
                                        var17_26 = 321;
                                        class454.field4897.method10710(var16_25 - 73, var17_26 - 20);
                                        var0.method8679("Login", var16_25, var17_26 + 5, 0xFFFFFF, 0);
                                        var16_25 = class125.field1507 + 80;
                                        class454.field4897.method10710(var16_25 - 73, var17_26 - 20);
                                        var0.method8679("Cancel", var16_25, var17_26 + 5, 0xFFFFFF, 0);
                                        var3_3 = 357;
                                        switch (class78.field933) {
                                            default: {
                                                class370.field4073 = "Can't login? Click here.";
                                                break;
                                            }
                                            case 2: {
                                                class370.field4073 = "Having trouble logging in?";
                                            }
                                        }
                                        class169.field1800 = new class423(class125.field1507, var3_3, var1_1.method8682(class370.field4073), 11);
                                        class303.field3266 = new class423(class125.field1507, var3_3, var1_1.method8682("Still having trouble logging in?"), 11);
                                        var1_1.method8679(class370.field4073, class125.field1507, var3_3, 0xFFFFFF, 0);
                                        break block61;
                                    }
                                    var7_7 = var7_7.substring(1);
                                }
                            }
                            var6_6 = var6_6.substring(1);
                        }
                    }
                    var0.method8679(class78.field961, class78.field925 + 180, 201, 0xFFFF00, 0);
                    var3_3 = 236;
                    var0.method8679(class78.field936, class78.field925 + 180, var3_3, 0xFFFFFF, 0);
                    var0.method8679(class78.field930, class78.field925 + 180, var3_3 += 15, 0xFFFFFF, 0);
                    var0.method8679(class78.field949, class78.field925 + 180, var3_3 += 15, 0xFFFFFF, 0);
                    var3_3 += 15;
                    var4_4 = class78.field925 + 180 - 80;
                    var18_8 = 321;
                    class454.field4897.method10710(var4_4 - 73, var18_8 - 20);
                    var0.method8679("Continue", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                    var4_4 = class78.field925 + 180 + 80;
                    class454.field4897.method10710(var4_4 - 73, var18_8 - 20);
                    var0.method8679("Cancel", var4_4, var18_8 + 5, 0xFFFFFF, 0);
                    break block61;
                }
                var3_3 = 251;
                var0.method8679("Welcome to RuneScape", class78.field925 + 180, var3_3, 0xFFFF00, 0);
                var3_3 += 30;
                var4_4 = class78.field925 + 180 - 80;
                var18_8 = 291;
                class454.field4897.method10710(var4_4 - 73, var18_8 - 20);
                var0.method8687("New User", var4_4 - 73, var18_8 - 20, 144, 40, 0xFFFFFF, 0, 1, 1, 0);
                var4_4 = class78.field925 + 180 + 80;
                class454.field4897.method10710(var4_4 - 73, var18_8 - 20);
                var0.method8687("Existing User", var4_4 - 73, var18_8 - 20, 144, 40, 0xFFFFFF, 0, 1, 1, 0);
            }
            if (client.field510 >= 10) {
                var22_27 = new int[4];
                class566.method10607(var22_27);
                class566.method10659(class78.field918, 0, class78.field918 + 765, class363.field4038);
                class461.field4948.method2838(class78.field918 - 22, client.field514);
                class461.field4948.method2838(class78.field918 + 22 + 765 - 128, client.field514);
                class566.method10649(var22_27);
            }
            class169.field1801[class544.field5403.method2887() != false ? 1 : 0].method10710(class78.field918 + 765 - 40, 463);
            if (client.field510 > 5 && class406.field4667 == class63.field446) {
                if (class93.field1118 == null) {
                    class93.field1118 = class108.method3097(class42.field276, "sl_button", "");
                } else {
                    var3_3 = class78.field918 + 5;
                    var4_4 = 463;
                    var18_8 = 100;
                    var21_17 = 35;
                    class93.field1118.method10710(var3_3, var4_4);
                    var0.method8679("World" + " " + client.field689, var18_8 / 2 + var3_3, var21_17 / 2 + var4_4 - 2, 0xFFFFFF, 0);
                    if (class149.field1678 != null) {
                        var1_1.method8679("Loading...", var18_8 / 2 + var3_3, var21_17 / 2 + var4_4 + 12, 0xFFFFFF, 0);
                    } else {
                        var1_1.method8679("Click to switch", var18_8 / 2 + var3_3, var21_17 / 2 + var4_4 + 12, 0xFFFFFF, 0);
                    }
                }
            }
            return;
        }
        class390.method7723(var0, var1_1);
    }

    @ObfuscatedName(value="kh")
    @ObfuscatedSignature(descriptor="(Ldz;IIIII)Ldu;", garbageValue="1789450078")
    static final class98 method3365(class103 class1032, int n, int n2, int n3, int n4) {
        class98 class982 = (class98)class1032.field1333.method7996();
        while (class982 != null) {
            if (class982.field1188 == n && n2 == class982.field1187 && n3 == class982.field1182 && n4 == class982.field1180) {
                return class982;
            }
            class982 = (class98)class1032.field1333.method8005();
        }
        return null;
    }

    @ObfuscatedName(value="ml")
    @ObfuscatedSignature(descriptor="([Lna;II)V", garbageValue="389193373")
    static final void method3367(class361[] class361Array, int n) {
        int n2 = 0;
        while (n2 < class361Array.length) {
            class361 class3612 = class361Array[n2];
            if (class3612 != null) {
                class514 class5142;
                if (class3612.field3873 == 0) {
                    if (class3612.field4014 != null) {
                        class128.method3367(class3612.field4014, n);
                    }
                    if ((class5142 = (class89)client.field664.method9985(class3612.field3910)) != null) {
                        client.method1709(class5142.field1073, n);
                    }
                }
                if (n == 0 && class3612.field3996 != null) {
                    class5142 = new class90();
                    ((class90)class5142).field1077 = class3612;
                    ((class90)class5142).field1086 = class3612.field3996;
                    class471.method9136((class90)class5142);
                }
                if (n == 1 && class3612.field3930 != null && (class3612.field3863 < 0 || (class5142 = class170.field1807.method7031(class3612.field3910)) != null && ((class361)class5142).field4014 != null && class3612.field3863 < ((class361)class5142).field4014.length && class3612 == ((class361)class5142).field4014[class3612.field3863])) {
                    class5142 = new class90();
                    ((class90)class5142).field1077 = class3612;
                    ((class90)class5142).field1086 = class3612.field3930;
                    class471.method9136((class90)class5142);
                }
            }
            ++n2;
        }
        return;
    }
}

