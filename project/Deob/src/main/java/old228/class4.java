package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ad")
public final class class4 {
    @ObfuscatedName(value="au")
    static int[] field6;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Loz;", garbageValue="1199091310")
    public static class383[] method16() {
        return new class383[]{class383.field4487, class383.field4488, class383.field4486, class383.field4485};
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lbt;Lqw;Lqw;S)V", garbageValue="14930")
    static void method19(class34 class347, class435 class4352, class435 class4353) {
        int n;
        int n2;
        int n3;
        if (class78.field950) {
            block185: {
                class269 class2692 = class104.method3010();
                while (class2692.method5772()) {
                    if (class2692.field2989 == 13) {
                        if (class78.field926 == 34) {
                            class33.method515(false);
                        }
                        class78.field950 = false;
                        class566.method10677(0, 0, class566.field5542, class566.field5543, 0);
                        class292.field3195.method10741(class78.field918, 0);
                        class479.field5025.method10741(class78.field918 + 382, 0);
                        class78.field923.method10710(class78.field918 + 382 - class78.field923.field5567 / 2, 18);
                        break block185;
                    }
                    if (class2692.field2989 == 96) {
                        if (class78.field952 <= 0 || class164.field1777 == null) continue;
                        --class78.field952;
                        continue;
                    }
                    if (class2692.field2989 != 97 || class78.field952 >= class78.field928 || class57.field381 == null) continue;
                    ++class78.field952;
                }
                if (class35.field200 == 1 || !class25.field109 && class35.field200 == 4) {
                    int n4 = class78.field918 + 280;
                    if (class35.field209 >= n4 && class35.field209 <= n4 + 14 && class35.field211 >= 4 && class35.field211 <= 18) {
                        class188.method4441(0, 0);
                    } else if (class35.field209 >= n4 + 15 && class35.field209 <= n4 + 80 && class35.field211 >= 4 && class35.field211 <= 18) {
                        class188.method4441(0, 1);
                    } else {
                        int n5 = class78.field918 + 390;
                        if (class35.field209 >= n5 && class35.field209 <= n5 + 14 && class35.field211 >= 4 && class35.field211 <= 18) {
                            class188.method4441(1, 0);
                        } else if (class35.field209 >= n5 + 15 && class35.field209 <= n5 + 80 && class35.field211 >= 4 && class35.field211 <= 18) {
                            class188.method4441(1, 1);
                        } else {
                            int n6 = class78.field918 + 500;
                            if (class35.field209 >= n6 && class35.field209 <= n6 + 14 && class35.field211 >= 4 && class35.field211 <= 18) {
                                class188.method4441(2, 0);
                            } else if (class35.field209 >= n6 + 15 && class35.field209 <= n6 + 80 && class35.field211 >= 4 && class35.field211 <= 18) {
                                class188.method4441(2, 1);
                            } else {
                                int n7 = class78.field918 + 610;
                                if (class35.field209 >= n7 && class35.field209 <= n7 + 14 && class35.field211 >= 4 && class35.field211 <= 18) {
                                    class188.method4441(3, 0);
                                } else if (class35.field209 >= n7 + 15 && class35.field209 <= n7 + 80 && class35.field211 >= 4 && class35.field211 <= 18) {
                                    class188.method4441(3, 1);
                                } else if (class35.field209 >= class78.field918 + 708 && class35.field211 >= 4 && class35.field209 <= class78.field918 + 708 + 50 && class35.field211 <= 20) {
                                    if (class78.field926 == 34) {
                                        class33.method515(false);
                                    }
                                    class78.field950 = false;
                                    class566.method10677(0, 0, class566.field5542, class566.field5543, 0);
                                    class292.field3195.method10741(class78.field918, 0);
                                    class479.field5025.method10741(class78.field918 + 382, 0);
                                    class78.field923.method10710(class78.field918 + 382 - class78.field923.field5567 / 2, 18);
                                } else if (class78.field951 != -1) {
                                    boolean bl;
                                    boolean bl2;
                                    class69 class692 = class69.field817[class78.field951];
                                    int n8 = client.field569;
                                    class552 class5522 = class552.field5442;
                                    boolean bl3 = bl2 = (n8 & class5522.vmethod10703()) != 0;
                                    class273.field3035 = bl = class692.method1959();
                                    class692.field819 = bl ? "beta" : class692.field819;
                                    class406.method7981(class692);
                                    if (class78.field926 == 34) {
                                        class33.method515(false);
                                    }
                                    class78.field950 = false;
                                    class566.method10677(0, 0, class566.field5542, class566.field5543, 0);
                                    class292.field3195.method10741(class78.field918, 0);
                                    class479.field5025.method10741(class78.field918 + 382, 0);
                                    class78.field923.method10710(class78.field918 + 382 - class78.field923.field5567 / 2, 18);
                                    if (bl3 != bl) {
                                        class205.method4808();
                                    }
                                } else {
                                    if (class78.field952 > 0 && class164.field1777 != null && class35.field209 >= 0 && class35.field209 <= class164.field1777.field5567 && class35.field211 >= class363.field4038 / 2 - 50 && class35.field211 <= class363.field4038 / 2 + 50) {
                                        --class78.field952;
                                    }
                                    if (class78.field952 < class78.field928 && class57.field381 != null && class35.field209 >= class128.field1521 - class57.field381.field5567 - 5 && class35.field209 <= class128.field1521 && class35.field211 >= class363.field4038 / 2 - 50 && class35.field211 <= class363.field4038 / 2 + 50) {
                                        ++class78.field952;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        if ((class35.field200 == 1 || !class25.field109 && class35.field200 == 4) && class35.field209 >= class78.field918 + 765 - 50 && class35.field211 >= 453 && class35.field209 < class78.field918 + 765 && class35.field211 < 503) {
            class544.field5403.method2978(!class544.field5403.method2887());
            class106.method3078();
            class153.method3619();
        }
        if (client.field510 == 5) {
            return;
        }
        if (-1L == class78.field954) {
            class78.field954 = class37.method724() + 1000L;
        }
        long l = class37.method724();
        if (class319.method6610() && class78.field927 == -1L && (class78.field927 = l) > class78.field954) {
            class78.field954 = class78.field927;
        }
        if (client.field510 != 10 && client.field510 != 11) {
            return;
        }
        if (class63.field446 == class406.field4667) {
            if (class35.field200 == 1 || !class25.field109 && class35.field200 == 4) {
                n3 = class78.field918 + 5;
                n2 = 463;
                n = 100;
                int n9 = 35;
                if (class35.field209 >= n3 && class35.field209 <= n + n3 && class35.field211 >= n2 && class35.field211 <= n9 + n2) {
                    class212.method4849();
                    return;
                }
            }
            if (class149.field1678 != null) {
                class212.method4849();
            }
        }
        n3 = class35.field200;
        n2 = class35.field209;
        n = class35.field211;
        if (n3 == 0) {
            n2 = class35.field201;
            n = class35.field202;
        }
        if (!class25.field109 && n3 == 4) {
            n3 = 1;
        }
        class269 class2693 = class104.method3010();
        if (class78.field926 == 0) {
            boolean bl = false;
            while (class2693.method5772()) {
                if (class2693.field2989 != 84) continue;
                bl = true;
            }
            int n10 = class125.field1507 - 80;
            int n11 = 291;
            if (n3 == 1 && n2 >= n10 - 75 && n2 <= n10 + 75 && n >= n11 - 20 && n <= n11 + 20) {
                class294.method6390(class272.method5846("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            n10 = class125.field1507 + 80;
            if (n3 == 1 && n2 >= n10 - 75 && n2 <= n10 + 75 && n >= n11 - 20 && n <= n11 + 20 || bl) {
                if ((client.field569 & class552.field5451.vmethod10703()) != 0) {
                    class78.field961 = "";
                    class78.field936 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                    class78.field930 = "Your normal account will not be affected.";
                    class78.field949 = "";
                    class114.method3212(1);
                    class100.method2832();
                } else if ((client.field569 & class552.field5428.vmethod10703()) != 0) {
                    if ((client.field569 & class552.field5427.vmethod10703()) != 0) {
                        class78.field936 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                        class78.field930 = "Players can attack each other almost everywhere";
                        class78.field949 = "and the Protect Item prayer won't work.";
                    } else {
                        class78.field936 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                        class78.field930 = "Players can attack each other";
                        class78.field949 = "almost everywhere.";
                    }
                    class78.field961 = "Warning!";
                    class114.method3212(1);
                    class100.method2832();
                } else if ((client.field569 & class552.field5427.vmethod10703()) != 0) {
                    class78.field936 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                    class78.field930 = "The Protect Item prayer will";
                    class78.field949 = "not work on this world.";
                    class78.field961 = "Warning!";
                    class114.method3212(1);
                    class100.method2832();
                } else {
                    class33.method515(false);
                }
            }
        } else if (class78.field926 == 1) {
            while (class2693.method5772()) {
                if (class2693.field2989 == 84) {
                    class33.method515(false);
                    continue;
                }
                if (class2693.field2989 != 13) continue;
                class114.method3212(0);
            }
            int n12 = class125.field1507 - 80;
            int n13 = 321;
            if (n3 == 1 && n2 >= n12 - 75 && n2 <= n12 + 75 && n >= n13 - 20 && n <= n13 + 20) {
                class33.method515(false);
            }
            n12 = class125.field1507 + 80;
            if (n3 == 1 && n2 >= n12 - 75 && n2 <= n12 + 75 && n >= n13 - 20 && n <= n13 + 20) {
                class114.method3212(0);
            }
        } else if (class78.field926 == 2) {
            int n14;
            int n15 = 201;
            if (n3 == 1 && n >= (n15 += 52) - 12 && n < n15 + 2) {
                class78.field947 = 0;
            }
            if (n3 == 1 && n >= (n15 += 15) - 12 && n < n15 + 2) {
                class78.field947 = 1;
            }
            n15 += 15;
            n15 = 361;
            if (class169.field1800 != null) {
                n14 = class169.field1800.field4734 / 2;
                if (n3 == 1 && n2 >= class169.field1800.field4735 - n14 && n2 <= n14 + class169.field1800.field4735 && n >= n15 - 15 && n < n15) {
                    switch (class78.field933) {
                        case 1: {
                            class294.method6390("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
                            return;
                        }
                        case 2: {
                            class294.method6390("https://support.runescape.com/hc/en-gb", true, false);
                        }
                    }
                }
            }
            n14 = class125.field1507 - 80;
            int n16 = 321;
            if (n3 == 1 && n2 >= n14 - 75 && n2 <= n14 + 75 && n >= n16 - 20 && n <= n16 + 20) {
                class102.method2989();
                return;
            }
            n14 = class78.field925 + 180 + 80;
            if (n3 == 1 && n2 >= n14 - 75 && n2 <= n14 + 75 && n >= n16 - 20 && n <= n16 + 20) {
                class114.method3212(0);
                class78.field955 = "";
                class78.field940 = "";
                class326.field3592 = 0;
                class480.field5036 = "";
                class78.field946 = true;
            }
            n14 = class125.field1507 + -117;
            n16 = 277;
            boolean bl = class78.field944 = n2 >= n14 && n2 < n14 + class473.field5001 && n >= n16 && n < n16 + URLLoader.field1461;
            if (n3 == 1 && class78.field944) {
                boolean bl4 = client.field555 = !client.field555;
                if (!client.field555 && class544.field5403.method2944() != null) {
                    class544.field5403.method2901(null);
                }
            }
            n14 = class125.field1507 + 24;
            n16 = 277;
            boolean bl5 = class78.field945 = n2 >= n14 && n2 < n14 + class473.field5001 && n >= n16 && n < n16 + URLLoader.field1461;
            if (n3 == 1 && class78.field945) {
                class544.field5403.method2884(!class544.field5403.method2974());
                if (!class544.field5403.method2974()) {
                    class78.field955 = "";
                    class544.field5403.method2901(null);
                    class100.method2832();
                }
            }
            while (class2693.method5772()) {
                if (class2693.field2989 == 13) {
                    class114.method3212(0);
                    class78.field955 = "";
                    class78.field940 = "";
                    class326.field3592 = 0;
                    class480.field5036 = "";
                    class78.field946 = true;
                    continue;
                }
                if (class78.field947 == 0) {
                    class145.method3558(class2693.field2975);
                    if (class2693.field2989 == 85 && class78.field955.length() > 0) {
                        class78.field955 = class78.field955.substring(0, class78.field955.length() - 1);
                    }
                    if (class2693.field2989 == 84 || class2693.field2989 == 80) {
                        class78.field947 = 1;
                    }
                    if (!class14.method188(class2693.field2975) || class78.field955.length() >= 320) continue;
                    class78.field955 = class78.field955 + class2693.field2975;
                    continue;
                }
                if (class78.field947 != 1) continue;
                if (class2693.field2989 == 85 && class78.field940.length() > 0) {
                    class78.field940 = class78.field940.substring(0, class78.field940.length() - 1);
                } else if (class2693.field2989 == 84 || class2693.field2989 == 80) {
                    class78.field947 = 0;
                    if (class2693.field2989 == 84) {
                        class102.method2989();
                        return;
                    }
                }
                if ((class2693.method5776(82) || class2693.method5776(87)) && class2693.field2989 == 67) {
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    Transferable transferable = clipboard.getContents(client.field521);
                    int n17 = 20 - class78.field940.length();
                    if (n17 <= 0) continue;
                    try {
                        String string = (String)transferable.getTransferData(DataFlavor.stringFlavor);
                        int n18 = Math.min(n17, string.length());
                        for (int i = 0; i < n18; ++i) {
                            if (class59.method1203(string.charAt(i)) && class14.method188(string.charAt(i))) continue;
                            class114.method3212(3);
                            return;
                        }
                        class78.field940 = class78.field940 + string.substring(0, n18);
                    }
                    catch (UnsupportedFlavorException unsupportedFlavorException) {
                    }
                    catch (IOException iOException) {}
                    continue;
                }
                if (!class59.method1203(class2693.field2975) || !class14.method188(class2693.field2975) || class78.field940.length() >= 20) continue;
                class78.field940 = class78.field940 + class2693.field2975;
            }
        } else if (class78.field926 == 3) {
            int n19 = class78.field925 + 180;
            int n20 = 241;
            class423 class4232 = class4352.method8709(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", n19, n20);
            if (n3 == 1 && class4232.method8263(n2, n)) {
                class294.method6390("https://oldschool.runescape.com/launcher", true, false);
            }
            n19 = class78.field925 + 180;
            n20 = 276;
            if (n3 == 1 && n2 >= n19 - 75 && n2 <= n19 + 75 && n >= n20 - 20 && n <= n20 + 20) {
                class486.method9400(false);
            }
            n19 = class78.field925 + 180;
            n20 = 326;
            if (n3 == 1 && n2 >= n19 - 75 && n2 <= n19 + 75 && n >= n20 - 20 && n <= n20 + 20) {
                class294.method6390("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
                return;
            }
        } else if (class78.field926 == 4) {
            int n21 = class78.field925 + 180 - 80;
            int n22 = 321;
            if (n3 == 1 && n2 >= n21 - 75 && n2 <= n21 + 75 && n >= n22 - 20 && n <= n22 + 20) {
                class233.method5134();
                return;
            }
            if (n3 == 1 && n2 >= class78.field925 + 180 - 9 && n2 <= class78.field925 + 180 + 130 && n >= 263 && n <= 296) {
                boolean bl = class78.field946 = !class78.field946;
            }
            if (n3 == 1 && n2 >= class78.field925 + 180 - 34 && n2 <= class78.field925 + 34 + 180 && n >= 351 && n <= 363) {
                class294.method6390("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
            }
            n21 = class78.field925 + 180 + 80;
            if (n3 == 1 && n2 >= n21 - 75 && n2 <= n21 + 75 && n >= n22 - 20 && n <= n22 + 20) {
                class114.method3212(0);
                class78.field955 = "";
                class78.field940 = "";
                class326.field3592 = 0;
                class480.field5036 = "";
            }
            while (class2693.method5772()) {
                boolean bl = false;
                for (int i = 0; i < "1234567890".length(); ++i) {
                    if (class2693.field2975 != "1234567890".charAt(i)) continue;
                    bl = true;
                    break;
                }
                if (class2693.field2989 == 13) {
                    class114.method3212(0);
                    class78.field955 = "";
                    class78.field940 = "";
                    class326.field3592 = 0;
                    class480.field5036 = "";
                    continue;
                }
                if (class2693.field2989 == 85 && class480.field5036.length() > 0) {
                    class480.field5036 = class480.field5036.substring(0, class480.field5036.length() - 1);
                }
                if (class2693.field2989 == 84) {
                    class233.method5134();
                    return;
                }
                if (!bl || class480.field5036.length() >= 6) continue;
                class480.field5036 = class480.field5036 + class2693.field2975;
            }
        } else if (class78.field926 == 5) {
            int n23;
            int n24 = class78.field925 + 180 - 80;
            int n25 = 321;
            if (n3 == 1 && n2 >= n24 - 75 && n2 <= n24 + 75 && n >= n25 - 20 && n <= n25 + 20) {
                class221.method5000();
                return;
            }
            n24 = class78.field925 + 180 + 80;
            if (n3 == 1 && n2 >= n24 - 75 && n2 <= n24 + 75 && n >= n25 - 20 && n <= n25 + 20) {
                class33.method515(true);
            }
            int n26 = 361;
            if (class303.field3266 != null) {
                n23 = class303.field3266.field4734 / 2;
                if (n3 == 1 && n2 >= class303.field3266.field4735 - n23 && n2 <= n23 + class303.field3266.field4735 && n >= n26 - 15 && n < n26) {
                    class294.method6390(class272.method5846("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
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
                    class33.method515(true);
                    continue;
                }
                if (class2693.field2989 == 85 && class78.field955.length() > 0) {
                    class78.field955 = class78.field955.substring(0, class78.field955.length() - 1);
                }
                if (class2693.field2989 == 84) {
                    class221.method5000();
                    return;
                }
                if (n23 == 0 || class78.field955.length() >= 320) continue;
                class78.field955 = class78.field955 + class2693.field2975;
            }
        } else if (class78.field926 == 6) {
            while (class2693.method5772()) {
                if (class2693.field2989 != 84 && class2693.field2989 != 13) continue;
                class33.method515(true);
            }
            int n27 = 321;
            if (n3 == 1 && n >= n27 - 20 && n <= n27 + 20) {
                class33.method515(true);
            }
        } else if (class78.field926 == 7) {
            if (class380.field4145 && !client.field506) {
                boolean bl;
                int n28 = class125.field1507 - 150;
                int n29 = n28 + 40 + 240 + 25;
                int n30 = 231;
                int n31 = n30 + 40;
                if (n3 == 1 && n2 >= n28 && n2 <= n29 && n >= n30 && n <= n31) {
                    class78.field941 = class340.method6897(n28, n2);
                }
                int n32 = class78.field925 + 180 - 80;
                int n33 = 321;
                if (n3 == 1 && n2 >= n32 - 75 && n2 <= n32 + 75 && n >= n33 - 20 && n <= n33 + 20 && (bl = class355.method7042())) {
                    class360.method7405(50);
                    return;
                }
                n32 = class78.field925 + 180 + 80;
                if (n3 == 1 && n2 >= n32 - 75 && n2 <= n32 + 75 && n >= n33 - 20 && n <= n33 + 20) {
                    class78.field922 = new String[8];
                    class33.method515(true);
                }
                while (class2693.method5772()) {
                    if (class2693.field2989 == 101) {
                        class78.field922[class78.field941] = null;
                    }
                    if (class2693.field2989 == 85) {
                        if (class78.field922[class78.field941] == null && class78.field941 > 0) {
                            --class78.field941;
                        }
                        class78.field922[class78.field941] = null;
                    }
                    if (class2693.field2975 >= '0' && class2693.field2975 <= '9') {
                        class78.field922[class78.field941] = "" + class2693.field2975;
                        if (class78.field941 < 7) {
                            ++class78.field941;
                        }
                    }
                    if (class2693.field2989 != 84) continue;
                    bl = class355.method7042();
                    if (bl) {
                        class360.method7405(50);
                    }
                    return;
                }
            } else {
                int n34 = class78.field925 + 180 - 80;
                int n35 = 321;
                if (n3 == 1 && n2 >= n34 - 75 && n2 <= n34 + 75 && n >= n35 - 20 && n <= n35 + 20) {
                    class294.method6390(class272.method5846("secure", true) + "m=dob/set_dob.ws", true, false);
                    class150.method3595("", "Page has opened in the browser.", "");
                    class114.method3212(6);
                    return;
                }
                n34 = class78.field925 + 180 + 80;
                if (n3 == 1 && n2 >= n34 - 75 && n2 <= n34 + 75 && n >= n35 - 20 && n <= n35 + 20) {
                    class33.method515(true);
                }
            }
        } else if (class78.field926 == 8) {
            int n36 = class78.field925 + 180 - 80;
            int n37 = 321;
            if (n3 == 1 && n2 >= n36 - 75 && n2 <= n36 + 75 && n >= n37 - 20 && n <= n37 + 20) {
                class294.method6390("https://www.jagex.com/terms/privacy", true, false);
                class150.method3595("", "Page has opened in the browser.", "");
                class114.method3212(6);
                return;
            }
            n36 = class78.field925 + 180 + 80;
            if (n3 == 1 && n2 >= n36 - 75 && n2 <= n36 + 75 && n >= n37 - 20 && n <= n37 + 20) {
                class33.method515(true);
            }
        } else if (class78.field926 == 9) {
            int n38 = class78.field925 + 180;
            int n39 = 311;
            if (class2693.field2989 == 84 || class2693.field2989 == 13 || n3 == 1 && n2 >= n38 - 75 && n2 <= n38 + 75 && n >= n39 - 20 && n <= n39 + 20) {
                class486.method9400(false);
            }
        } else if (class78.field926 == 10) {
            int n40 = class78.field925 + 180;
            int n41 = 209;
            if (class2693.field2989 == 84 || n3 == 1 && n2 >= n40 - 109 && n2 <= n40 + 109 && n >= n41 && n <= n41 + 68) {
                class150.method3595("", "Connecting to server...", "");
                client.field741 = class561.field5525;
                client.field629 = class544.field5403.method2894(class78.field955) ? class146.field1659 : class146.field1661;
                class360.method7405(20);
            }
        } else if (class78.field926 == 12) {
            int n42 = class125.field1507;
            int n43 = 233;
            class423 class4233 = class4353.method8709(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", n42, n43);
            class423 class4234 = class4353.method8709(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", n42, n43);
            class423 class4235 = class4353.method8709(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", n42, n43);
            class423 class4236 = class4353.method8709(0, 34, "<col=ffd200>agreement (EULA)</col>.", n42, n43 += 17);
            if (n3 == 1) {
                if (class4233.method8263(n2, n)) {
                    class294.method6390("https://www.jagex.com/terms", true, false);
                } else if (class4234.method8263(n2, n)) {
                    class294.method6390("https://www.jagex.com/terms/privacy", true, false);
                } else if (class4235.method8263(n2, n) || class4236.method8263(n2, n)) {
                    class294.method6390("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            n42 = class125.field1507 - 80;
            n43 = 311;
            if (n3 == 1 && n2 >= n42 - 75 && n2 <= n42 + 75 && n >= n43 - 20 && n <= n43 + 20) {
                class544.field5403.method2903(client.field766);
                class486.method9400(true);
            }
            n42 = class125.field1507 + 80;
            if (n3 == 1 && n2 >= n42 - 75 && n2 <= n42 + 75 && n >= n43 - 20 && n <= n43 + 20) {
                class78.field926 = 13;
            }
        } else if (class78.field926 == 13) {
            int n44 = class125.field1507;
            int n45 = 321;
            if (n3 == 1 && n2 >= n44 - 75 && n2 <= n44 + 75 && n >= n45 - 20 && n <= n45 + 20) {
                class486.method9400(true);
            }
        } else if (class78.field926 == 14) {
            String string = "";
            switch (class78.field932) {
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
                    class33.method515(false);
                }
            }
            int n46 = class78.field925 + 180;
            int n47 = 276;
            if (n3 == 1 && n2 >= n46 - 75 && n2 <= n46 + 75 && n >= n47 - 20 && n <= n47 + 20) {
                class294.method6390(string, true, false);
                class150.method3595("", "Page has opened in the browser.", "");
                class114.method3212(6);
                return;
            }
            n46 = class78.field925 + 180;
            n47 = 326;
            if (n3 == 1 && n2 >= n46 - 75 && n2 <= n46 + 75 && n >= n47 - 20 && n <= n47 + 20) {
                class33.method515(false);
            }
        } else if (class78.field926 == 24) {
            int n48 = class78.field925 + 180;
            int n49 = 301;
            if (n3 == 1 && n2 >= n48 - 75 && n2 <= n48 + 75 && n >= n49 - 20 && n <= n49 + 20) {
                class486.method9400(false);
            }
        } else if (class78.field926 == 32) {
            int n50 = class78.field925 + 180 - 80;
            int n51 = 321;
            if (n3 == 1 && n2 >= n50 - 75 && n2 <= n50 + 75 && n >= n51 - 20 && n <= n51 + 20) {
                class294.method6390(class272.method5846("secure", true) + "m=dob/set_dob.ws", true, false);
                class150.method3595("", "Page has opened in the browser.", "");
                class114.method3212(6);
                return;
            }
            n50 = class78.field925 + 180 + 80;
            if (n3 == 1 && n2 >= n50 - 75 && n2 <= n50 + 75 && n >= n51 - 20 && n <= n51 + 20) {
                class33.method515(true);
            }
        } else if (class78.field926 == 33) {
            int n52 = class78.field925 + 180;
            int n53 = 276;
            if (n3 == 1 && n2 >= n52 - 75 && n2 <= n52 + 75 && n >= n53 - 20 && n <= n53 + 20) {
                class294.method6390("https://oldschool.runescape.com/launcher", true, false);
            }
            n52 = class78.field925 + 180;
            n53 = 326;
            if (n3 == 1 && n2 >= n52 - 75 && n2 <= n52 + 75 && n >= n53 - 20 && n <= n53 + 20) {
                class33.method515(true);
            }
        } else if (class78.field926 == 34) {
            int n54 = class78.field925 + 180;
            int n55 = 276;
            if (n3 == 1 && n2 >= n54 - 75 && n2 <= n54 + 75 && n >= n55 - 20 && n <= n55 + 20) {
                class212.method4849();
                return;
            }
            if (class149.field1678 != null) {
                class212.method4849();
            }
            n54 = class78.field925 + 180;
            n55 = 326;
            if (n3 == 1 && n2 >= n54 - 75 && n2 <= n54 + 75 && n >= n55 - 20 && n <= n55 + 20) {
                class33.method515(false);
            }
        }
    }

    @ObfuscatedName(value="cp")
    @ObfuscatedSignature(descriptor="(IB)Ljava/lang/Object;", garbageValue="-7")
    static Object method17(int n) {
        return class455.method8952((class544)class259.method5457(class544.method10125(), n));
    }

    @ObfuscatedName(value="hu")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="1")
    static final void method20() {
        class211.method4837();
        class166.method3807();
        class251.method5358();
        class549.field5416.method6581();
        class547.field5409.method6581();
        class69.method1994();
        class325.method6635();
        class253.field2710.method6581();
        class16.method209();
        HitSplatDef.field2753.method6581();
        HitSplatDef.field2754.method6581();
        HitSplatDef.field2765.method6581();
        class336.method6883();
        class238.field2548.method6581();
        class165.method3794();
        class241.method5257();
        class69.method1960();
        class244.field2601.method6581();
        class194.method4473();
        ItemDef.field2889.method6581();
        ItemDef.field2862.method6581();
        ItemDef.field2849.method6581();
        class459.method8967();
        SequenceDef.field2917.method6581();
        SequenceDef.field2922.method6581();
        SequenceDef.field2938.method6581();
        class252.field2690.method6581();
        class252.field2691.method6581();
        class259.field2743.method6581();
        class97.method2751();
        if (class18.field75 != null) {
            class18.field75.method10082();
        }
        if (class126.field1513 != null) {
            class126.field1513.method10082();
        }
        class248.field2666.method6581();
        class250.field2677.method6581();
        class18.method275();
        class153.method3618();
        class230.field2490.method6581();
        class233.field2501.method6581();
        class252.method5377();
        class101.method2877();
        class125.method3346();
        client.field788.method6581();
        client.field789.method6581();
        class358.field3819.method6581();
        class358.field3808.method9041();
        class358.field3821 = 0;
        if (class170.field1807 != null) {
            class170.field1807.method7026();
        }
        if (class182.field1957.field2300 != null) {
            ((class194)class182.field1957.field2300).method4487();
        }
        class244.method5287();
        client.field636.method9041();
        if (class494.field5117 != null) {
            class494.field5117.method7744();
        }
        if (class188.field2104 != null) {
            class188.field2104.method7744();
        }
        if (class166.field1785 != null) {
            class166.field1785.method7744();
        }
        if (class167.field1793 != null) {
            class167.field1793.method7744();
        }
        if (class268.field2973 != null) {
            class268.field2973.method7744();
        }
        if (HitSplatDef.field2777 != null) {
            HitSplatDef.field2777.method7744();
        }
        if (class191.field2120 != null) {
            class191.field2120.method7744();
        }
        if (class220.field2408 != null) {
            class220.field2408.method7744();
        }
        if (class45.field291 != null) {
            class45.field291.method7744();
        }
        if (class88.field1069 != null) {
            class88.field1069.method7744();
        }
        if (class69.field815 != null) {
            class69.field815.method7744();
        }
        if (class283.field3102 != null) {
            class283.field3102.method7744();
        }
        if (class68.field494 != null) {
            class68.field494.method7744();
        }
        if (class544.field5399 != null) {
            class544.field5399.method7744();
        }
        if (class59.field398 != null) {
            class59.field398.method7744();
        }
        if (class161.field1762 != null) {
            class161.field1762.method7744();
        }
        if (class42.field276 != null) {
            class42.field276.method7744();
        }
        if (class252.field2704 != null) {
            class252.field2704.method7744();
        }
        if (class221.field2421 != null) {
            class221.field2421.method7744();
        }
        if (class137.field1603 != null) {
            class137.field1603.method7744();
        }
        if (class259.field2746 != null) {
            class259.field2746.method7744();
        }
        if (class157.field1718 != null) {
            class157.field1718.method7744();
        }
    }

    @ObfuscatedName(value="jx")
    @ObfuscatedSignature(descriptor="(Ldz;IIIIII)V", garbageValue="-1622761338")
    static void method18(class103 class1032, int n, int n2, int n3, int n4, int n5) {
        if (n >= 128 && 13056 >= n && n2 >= 128 && 13056 >= n2) {
            int n6 = class23.method337(class1032, n3, n4, class1032.field1321) - n5;
            n -= class478.field5017;
            n6 -= class64.field459;
            int n7 = class182.field1954[class159.field1730];
            int n8 = class182.field1955[class159.field1730];
            int n9 = class182.field1954[class183.field1972];
            int n10 = class182.field1955[class183.field1972];
            int n11 = n9 * (n2 -= class31.field140) + n10 * n >> 16;
            n2 = n10 * n2 - n9 * n >> 16;
            n = n11;
            n11 = n6 * n8 - n7 * n2 >> 16;
            n2 = n7 * n6 + n8 * n2 >> 16;
            n6 = n11;
            if (n2 < 50) {
                client.field802 = -1;
                client.field538 = -1;
            } else {
                client.field802 = client.field778 / 2 + client.field553 * n / n2;
                client.field538 = client.field779 / 2 + n6 * client.field553 / n2;
            }
            return;
        }
        client.field802 = -1;
        client.field538 = -1;
    }
}

