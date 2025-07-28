package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.awt.Desktop;
import java.net.URI;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="la")
public final class class294 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=969059261)
    int field3219;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-247160933)
    int field3217;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1455202723)
    int field3216;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1752729869)
    int field3218;
    @ObfuscatedSignature(descriptor="Lln;")
    final /* synthetic */ class286 this$0;

    @ObfuscatedSignature(descriptor="(Lln;)V")
    class294(class286 class2862) {
        this.this$0 = class2862;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;ZZI)V", garbageValue="-1654093091")
    public static void method6390(String string, boolean bl, boolean bl2) {
        block9: {
            if (bl) {
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    try {
                        Desktop.getDesktop().browse(new URI(string));
                        break block9;
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                if (class31.field137.startsWith("win")) {
                    class163.method3775(string, 0);
                } else if (class31.field137.startsWith("mac")) {
                    class440.method8813(string, 1, "openjs");
                } else {
                    class163.method3775(string, 2);
                }
            } else {
                class163.method3775(string, 3);
            }
        }
    }

    @ObfuscatedName(value="az")
    public static String method6392(long l) {
        if (l > 0L && l < 6582952005840035281L) {
            if (l % 37L == 0L) {
                return null;
            }
            int n = 0;
            long l2 = l;
            while (true) {
                if (0L == l2) {
                    StringBuilder stringBuilder = new StringBuilder(n);
                    while (true) {
                        if (l == 0L) {
                            stringBuilder.reverse();
                            stringBuilder.setCharAt(0, Character.toUpperCase(stringBuilder.charAt(0)));
                            return stringBuilder.toString();
                        }
                        long l3 = l;
                        int n2 = class421.field4727[(int)(l3 - (l /= 37L) * 37L)];
                        if (n2 == 95) {
                            int n3 = stringBuilder.length() - 1;
                            stringBuilder.setCharAt(n3, Character.toUpperCase(stringBuilder.charAt(n3)));
                            n2 = 160;
                        }
                        stringBuilder.append((char)n2);
                    }
                }
                ++n;
                l2 /= 37L;
            }
        }
        return null;
    }

    @ObfuscatedName(value="ba")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="2120766497")
    static int method6391(int n, class81 class812, boolean bl) {
        block38: {
            block39: {
                block40: {
                    if (n == 6500) break block38;
                    if (n == 6501) break block39;
                    if (n == 6502) break block40;
                    if (n != 6506) {
                        if (n != 6507) {
                            int n2;
                            if (n != 6511) {
                                if (n != 6512) {
                                    if (n != 6513) {
                                        if (n != 6514) {
                                            if (n != 6515) {
                                                if (n != 6516) {
                                                    if (n != 6518) {
                                                        if (n != 6519) {
                                                            if (n != 6520) {
                                                                if (n != 6521) {
                                                                    if (n != 6522) {
                                                                        if (n != 6523) {
                                                                            if (n != 6524) {
                                                                                if (n != 6525) {
                                                                                    if (n != 6526) {
                                                                                        if (n != 6527) {
                                                                                            return 2;
                                                                                        }
                                                                                        class72.field865[++class63.field444 - 1] = client.field498;
                                                                                        return 1;
                                                                                    }
                                                                                    class72.field865[++class63.field444 - 1] = 1;
                                                                                    return 1;
                                                                                }
                                                                                class72.field865[++class63.field444 - 1] = 1;
                                                                                return 1;
                                                                            }
                                                                            class72.field865[++class63.field444 - 1] = -1;
                                                                            return 1;
                                                                        }
                                                                        --class104.field1343;
                                                                        --class63.field444;
                                                                        return 1;
                                                                    }
                                                                    --class104.field1343;
                                                                    --class63.field444;
                                                                    return 1;
                                                                }
                                                                return 1;
                                                            }
                                                            return 1;
                                                        }
                                                        class72.field865[++class63.field444 - 1] = client.field504;
                                                        return 1;
                                                    }
                                                    class72.field865[++class63.field444 - 1] = client.field506 ? 1 : 0;
                                                    return 1;
                                                }
                                                int n3 = class72.field865[class63.field444 -= 2];
                                                int n4 = class72.field865[class63.field444 + 1];
                                                class258 class2582 = class249.method5354(n4);
                                                if (!class2582.method5431()) {
                                                    class72.field865[++class63.field444 - 1] = class87.method2605(n3).method5468(n4, class2582.field2739);
                                                } else {
                                                    class72.field855[++class104.field1343 - 1] = class87.method2605(n3).method5460(n4, class2582.field2740);
                                                }
                                                return 1;
                                            }
                                            int n5 = class72.field865[class63.field444 -= 2];
                                            int n6 = class72.field865[class63.field444 + 1];
                                            class258 class2583 = class249.method5354(n6);
                                            if (!class2583.method5431()) {
                                                class72.field865[++class63.field444 - 1] = class191.method4462(n5).method5575(n6, class2583.field2739);
                                            } else {
                                                class72.field855[++class104.field1343 - 1] = class191.method4462(n5).method5628(n6, class2583.field2740);
                                            }
                                            return 1;
                                        }
                                        int n7 = class72.field865[class63.field444 -= 2];
                                        int n8 = class72.field865[class63.field444 + 1];
                                        class258 class2584 = class249.method5354(n8);
                                        if (!class2584.method5431()) {
                                            class72.field865[++class63.field444 - 1] = class142.method3512(n7).method5516(n8, class2584.field2739);
                                        } else {
                                            class72.field855[++class104.field1343 - 1] = class142.method3512(n7).method5522(n8, class2584.field2740);
                                        }
                                        return 1;
                                    }
                                    int n9 = class72.field865[class63.field444 -= 2];
                                    int n10 = class72.field865[class63.field444 + 1];
                                    class258 class2585 = class249.method5354(n10);
                                    if (!class2585.method5431()) {
                                        class72.field865[++class63.field444 - 1] = class446.method8848(n9).method5337(n10, class2585.field2739);
                                    } else {
                                        class72.field855[++class104.field1343 - 1] = class446.method8848(n9).method5305(n10, class2585.field2740);
                                    }
                                    return 1;
                                }
                                client.field649 = class72.field865[--class63.field444] == 1;
                                return 1;
                            }
                            if ((n2 = class72.field865[--class63.field444]) < 0 || n2 >= class69.field808) {
                                class72.field865[++class63.field444 - 1] = -1;
                                class72.field865[++class63.field444 - 1] = 0;
                                class72.field855[++class104.field1343 - 1] = "";
                                class72.field865[++class63.field444 - 1] = 0;
                                class72.field865[++class63.field444 - 1] = 0;
                                class72.field855[++class104.field1343 - 1] = "";
                            } else {
                                class69 class692 = class69.field817[n2];
                                class72.field865[++class63.field444 - 1] = class692.field812;
                                class72.field865[++class63.field444 - 1] = class692.field813;
                                class72.field855[++class104.field1343 - 1] = class692.field816;
                                class72.field865[++class63.field444 - 1] = class692.field811;
                                class72.field865[++class63.field444 - 1] = class692.field814;
                                class72.field855[++class104.field1343 - 1] = class692.field807;
                            }
                            return 1;
                        }
                        int n11 = class72.field865[class63.field444 -= 4];
                        boolean bl2 = class72.field865[class63.field444 + 1] == 1;
                        int n12 = class72.field865[class63.field444 + 2];
                        boolean bl3 = class72.field865[class63.field444 + 3] == 1;
                        class133.method3435(n11, bl2, n12, bl3);
                        return 1;
                    }
                    int n13 = class72.field865[--class63.field444];
                    class69 class693 = null;
                    int n14 = 0;
                    while (true) {
                        block42: {
                            block41: {
                                if (n14 >= class69.field808) break block41;
                                if (n13 != class69.field817[n14].field812) break block42;
                                class693 = class69.field817[n14];
                            }
                            if (class693 == null) {
                                class72.field865[++class63.field444 - 1] = -1;
                                class72.field865[++class63.field444 - 1] = 0;
                                class72.field855[++class104.field1343 - 1] = "";
                                class72.field865[++class63.field444 - 1] = 0;
                                class72.field865[++class63.field444 - 1] = 0;
                                class72.field855[++class104.field1343 - 1] = "";
                            } else {
                                class72.field865[++class63.field444 - 1] = class693.field812;
                                class72.field865[++class63.field444 - 1] = class693.field813;
                                class72.field855[++class104.field1343 - 1] = class693.field816;
                                class72.field865[++class63.field444 - 1] = class693.field811;
                                class72.field865[++class63.field444 - 1] = class693.field814;
                                class72.field855[++class104.field1343 - 1] = class693.field807;
                            }
                            return 1;
                        }
                        ++n14;
                    }
                }
                class69 class694 = class329.method6648();
                if (class694 == null) {
                    class72.field865[++class63.field444 - 1] = -1;
                    class72.field865[++class63.field444 - 1] = 0;
                    class72.field855[++class104.field1343 - 1] = "";
                    class72.field865[++class63.field444 - 1] = 0;
                    class72.field865[++class63.field444 - 1] = 0;
                    class72.field855[++class104.field1343 - 1] = "";
                } else {
                    class72.field865[++class63.field444 - 1] = class694.field812;
                    class72.field865[++class63.field444 - 1] = class694.field813;
                    class72.field855[++class104.field1343 - 1] = class694.field816;
                    class72.field865[++class63.field444 - 1] = class694.field811;
                    class72.field865[++class63.field444 - 1] = class694.field814;
                    class72.field855[++class104.field1343 - 1] = class694.field807;
                }
                return 1;
            }
            class69 class695 = class281.method5993();
            if (class695 == null) {
                class72.field865[++class63.field444 - 1] = -1;
                class72.field865[++class63.field444 - 1] = 0;
                class72.field855[++class104.field1343 - 1] = "";
                class72.field865[++class63.field444 - 1] = 0;
                class72.field865[++class63.field444 - 1] = 0;
                class72.field855[++class104.field1343 - 1] = "";
            } else {
                class72.field865[++class63.field444 - 1] = class695.field812;
                class72.field865[++class63.field444 - 1] = class695.field813;
                class72.field855[++class104.field1343 - 1] = class695.field816;
                class72.field865[++class63.field444 - 1] = class695.field811;
                class72.field865[++class63.field444 - 1] = class695.field814;
                class72.field855[++class104.field1343 - 1] = class695.field807;
            }
            return 1;
        }
        class72.field865[++class63.field444 - 1] = class280.method5990() ? 1 : 0;
        return 1;
    }
}

