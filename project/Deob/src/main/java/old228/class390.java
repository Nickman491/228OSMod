package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pc")
public class class390
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lok;")
    class388 field4573;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1587477933)
    int field4575;
    @ObfuscatedName(value="az")
    byte field4572;

    class390() {
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(CLph;I)I", garbageValue="-1685483857")
    static int method7724(char c, class406 class4062) {
        int n = c << 4;
        if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
            c = Character.toLowerCase(c);
            n = (c << 4) + 1;
        }
        if (c == '\u00f1' && class4062 == class406.field4672) {
            n = 1762;
        }
        return n;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(Lqw;Lqw;B)V", garbageValue="-26")
    static void method7723(class435 class4352, class435 class4353) {
        int n;
        int n2;
        int n3;
        int n4;
        if (class124.field1493 == null) {
            class124.field1493 = class378.method7637(class42.field276, "sl_back", "");
        }
        if (class73.field878 == null) {
            class73.field878 = class319.method6611(class42.field276, "sl_flags", "");
        }
        if (class81.field999 == null) {
            class81.field999 = class319.method6611(class42.field276, "sl_arrows", "");
        }
        if (class140.field1628 == null) {
            class140.field1628 = class319.method6611(class42.field276, "sl_stars", "");
        }
        if (class164.field1777 == null) {
            class164.field1777 = class108.method3097(class42.field276, "leftarrow", "");
        }
        if (class57.field381 == null) {
            class57.field381 = class108.method3097(class42.field276, "rightarrow", "");
        }
        class566.method10677(class78.field918, 23, 765, 480, 0);
        class566.method10614(class78.field918, 0, 125, 23, 12425273, 9135624);
        class566.method10614(class78.field918 + 125, 0, 640, 23, 0x4F4F4F, 0x292929);
        class4352.method8679("Select a world", class78.field918 + 62, 15, 0, -1);
        if (class140.field1628 != null) {
            class140.field1628[1].method10710(class78.field918 + 140, 1);
            class4353.method8727("Members only world", class78.field918 + 152, 10, 0xFFFFFF, -1);
            class140.field1628[0].method10710(class78.field918 + 140, 12);
            class4353.method8727("Free world", class78.field918 + 152, 21, 0xFFFFFF, -1);
        }
        if (class81.field999 != null) {
            n4 = class78.field918 + 280;
            if (class69.field804[0] == 0 && class69.field805[0] == 0) {
                class81.field999[2].method10710(n4, 4);
            } else {
                class81.field999[0].method10710(n4, 4);
            }
            if (class69.field804[0] == 0 && class69.field805[0] == 1) {
                class81.field999[3].method10710(n4 + 15, 4);
            } else {
                class81.field999[1].method10710(n4 + 15, 4);
            }
            class4352.method8727("World", n4 + 32, 17, 0xFFFFFF, -1);
            n3 = class78.field918 + 390;
            if (class69.field804[0] == 1 && class69.field805[0] == 0) {
                class81.field999[2].method10710(n3, 4);
            } else {
                class81.field999[0].method10710(n3, 4);
            }
            if (class69.field804[0] == 1 && class69.field805[0] == 1) {
                class81.field999[3].method10710(n3 + 15, 4);
            } else {
                class81.field999[1].method10710(n3 + 15, 4);
            }
            class4352.method8727("Players", n3 + 32, 17, 0xFFFFFF, -1);
            n2 = class78.field918 + 500;
            if (class69.field804[0] == 2 && class69.field805[0] == 0) {
                class81.field999[2].method10710(n2, 4);
            } else {
                class81.field999[0].method10710(n2, 4);
            }
            if (class69.field804[0] == 2 && class69.field805[0] == 1) {
                class81.field999[3].method10710(n2 + 15, 4);
            } else {
                class81.field999[1].method10710(n2 + 15, 4);
            }
            class4352.method8727("Location", n2 + 32, 17, 0xFFFFFF, -1);
            n = class78.field918 + 610;
            if (class69.field804[0] == 3 && class69.field805[0] == 0) {
                class81.field999[2].method10710(n, 4);
            } else {
                class81.field999[0].method10710(n, 4);
            }
            if (class69.field804[0] == 3 && class69.field805[0] == 1) {
                class81.field999[3].method10710(n + 15, 4);
            } else {
                class81.field999[1].method10710(n + 15, 4);
            }
            class4352.method8727("Type", n + 32, 17, 0xFFFFFF, -1);
        }
        class566.method10677(class78.field918 + 708, 4, 50, 16, 0);
        class4353.method8679("Cancel", class78.field918 + 708 + 25, 16, 0xFFFFFF, -1);
        class78.field951 = -1;
        if (class124.field1493 != null) {
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
                if (n * (n2 - 1) >= class69.field808) {
                    --n2;
                }
                if (n2 * (n - 1) >= class69.field808) {
                    --n;
                }
                if (n2 * (n - 1) < class69.field808) continue;
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
            int n11 = (n + class69.field808 - 1) / n;
            class78.field928 = n11 - n2;
            if (class164.field1777 != null && class78.field952 > 0) {
                class164.field1777.method10710(8, class363.field4038 / 2 - class164.field1777.field5564 / 2);
            }
            if (class57.field381 != null && class78.field952 < class78.field928) {
                class57.field381.method10710(class128.field1521 - class57.field381.field5567 - 8, class363.field4038 / 2 - class57.field381.field5564 / 2);
            }
            int n12 = n10 + 23;
            int n13 = n9 + class78.field918;
            int n14 = 0;
            boolean bl = false;
            int n15 = class78.field952;
            for (n6 = n * n15; n6 < class69.field808 && n15 - class78.field952 < n2; ++n6) {
                class69 class692 = class69.field817[n6];
                n5 = 1;
                String string = Integer.toString(class692.field814);
                if (class692.field814 != -1) {
                    if (class692.field814 > 1980) {
                        string = "FULL";
                        n5 = 0;
                    }
                } else {
                    string = "OFF";
                    n5 = 0;
                }
                class113 class1132 = null;
                int n16 = 0;
                if (!class692.method1999()) {
                    if (!class692.method1959()) {
                        if (!class692.method1963()) {
                            if (!class692.method2016()) {
                                if (!class692.method1961()) {
                                    if (!class692.method1966()) {
                                        if (class692.method1984()) {
                                            class1132 = class692.method1958() ? class113.field1416 : class113.field1420;
                                        }
                                    } else {
                                        class1132 = class692.method1958() ? class113.field1426 : class113.field1425;
                                    }
                                } else {
                                    class1132 = class692.method1958() ? class113.field1418 : class113.field1417;
                                }
                            } else {
                                class1132 = class692.method1958() ? class113.field1424 : class113.field1431;
                            }
                        } else {
                            n16 = 0xFF0000;
                            class1132 = class692.method1958() ? class113.field1428 : class113.field1429;
                        }
                    } else {
                        class1132 = class692.method1958() ? class113.field1430 : class113.field1427;
                    }
                } else {
                    class113 class1133 = class1132 = class692.method1958() ? class113.field1422 : class113.field1421;
                }
                if (class1132 == null || class1132.field1415 >= class124.field1493.length) {
                    class113 class1134 = class1132 = class692.method1958() ? class113.field1423 : class113.field1419;
                }
                if (class35.field201 >= n13 && class35.field202 >= n12 && class35.field201 < n13 + n4 && class35.field202 < n12 + n3 && n5 != 0) {
                    class78.field951 = n6;
                    class124.field1493[class1132.field1415].method10747(n13, n12, 128, 0xFFFFFF);
                    bl = true;
                } else {
                    class124.field1493[class1132.field1415].method10741(n13, n12);
                }
                if (class73.field878 != null) {
                    class73.field878[(class692.method1958() ? 8 : 0) + class692.field811].method10710(n13 + 29, n12);
                }
                class4352.method8679(Integer.toString(class692.field812), n13 + 15, n3 / 2 + n12 + 5, n16, -1);
                class4353.method8679(string, n13 + 60, n3 / 2 + n12 + 5, 0xFFFFFFF, -1);
                n12 = n12 + n7 + n3;
                if (++n14 < n) continue;
                n12 = n10 + 23;
                n13 = n13 + n8 + n4;
                n14 = 0;
                ++n15;
            }
            if (bl) {
                n6 = class4353.method8682(class69.field817[class78.field951].field816) + 6;
                int n17 = class4353.field4832 + 8;
                n5 = class35.field202 + 25;
                if (n17 + n5 > 480) {
                    n5 = class35.field202 - 25 - n17;
                }
                class566.method10677(class35.field201 - n6 / 2, n5, n6, n17, 0xFFFFA0);
                class566.method10617(class35.field201 - n6 / 2, n5, n6, n17, 0);
                class4353.method8679(class69.field817[class78.field951].field816, class35.field201, n5 + class4353.field4832 + 4, 0, -1);
            }
        }
    }
}

