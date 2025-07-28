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

@ObfuscatedName(value="fm")
public class class138
implements MouseWheel {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1608 = new class138(0, 0, null, -1, -1);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1606 = new class138(1, 1, null, 0, 2);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1607 = new class138(2, 2, null, 1, 2);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1619 = new class138(3, 3, null, 2, 2);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1617 = new class138(4, 4, null, 3, 1);
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1610 = new class138(5, 5, null, 4, 1);
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1625 = new class138(6, 6, null, 5, 1);
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1612 = new class138(7, 7, null, 6, 3);
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1613 = new class138(8, 8, null, 7, 3);
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1614 = new class138(9, 9, null, 8, 3);
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1615 = new class138(10, 10, null, 0, 7);
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1616 = new class138(11, 11, null, 1, 7);
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1611 = new class138(12, 12, null, 2, 7);
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1618 = new class138(13, 13, null, 3, 7);
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1605 = new class138(14, 14, null, 4, 7);
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1620 = new class138(15, 15, null, 5, 7);
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1621 = new class138(16, 16, null, 0, 5);
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=-469878497)
    final int field1624;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=809633273)
    final int field1622;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=-293522285)
    final int field1623;

    @ObfuscatedSignature(descriptor="(IILjava/lang/String;II)V", garbageValue="-1")
    class138(int n, int n2, String string, int n3, int n4) {
        this.field1624 = n;
        this.field1622 = n2;
        this.field1623 = n3;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1607362939")
    int method3491() {
        return this.field1623;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    public int vmethod10703() {
        return this.field1622;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="im")
    @ObfuscatedSignature(descriptor="(IIIII)V", garbageValue="650985830")
    static final void method3495(int n, int n2, int n3, int n4) {
        ++client.field617;
        class34.field189.field1319.field2056 = client.field514;
        if (class407.field4693.field1213 >> 7 == client.field744 && class407.field4693.field1196 >> 7 == client.field745) {
            client.field744 = 0;
        }
        class36.method718(class34.field189);
        class103 class1032 = class34.field189;
        if (client.field633) {
            class137.method3487(class1032, client.field623, false);
        }
        class9.method79(class34.field189);
        class455.method8951(class34.field189, true);
        class103 class1033 = class34.field189;
        int n5 = client.field673.field1406;
        int[] nArray = client.field673.field1412;
        int n6 = 0;
        while (true) {
            if (n6 >= n5) break;
            if (nArray[n6] != client.field641) {
                if (nArray[n6] != client.field623) {
                    class137.method3487(class1033, nArray[n6], true);
                }
            }
            ++n6;
        }
        class455.method8951(class34.field189, false);
        class103 class1034 = class34.field189;
        int n7 = 0;
        n6 = 0;
        while (true) {
            block62: {
                int n8;
                int n9;
                class480 class4802;
                block76: {
                    class480 class4803;
                    int n10;
                    int n11;
                    int n12;
                    int n13;
                    int n14;
                    int n15;
                    int n16;
                    int n17;
                    int n18;
                    int n19;
                    int n20;
                    block67: {
                        block68: {
                            block69: {
                                int n21;
                                block73: {
                                    block74: {
                                        block75: {
                                            int n22;
                                            int n23;
                                            block63: {
                                                block70: {
                                                    block71: {
                                                        block72: {
                                                            block65: {
                                                                block66: {
                                                                    block64: {
                                                                        int n24;
                                                                        block61: {
                                                                            if (n6 >= class1034.field1334) break block61;
                                                                            class4802 = class1034.field1318[class1034.field1335[n6]];
                                                                            if (class4802 == null) break block62;
                                                                            break block63;
                                                                        }
                                                                        class406.method7980(class34.field189);
                                                                        class16.method208(class34.field189);
                                                                        class143.method3515(n, n2, n3, n4, true);
                                                                        n = client.field776;
                                                                        n2 = client.field777;
                                                                        n3 = client.field778;
                                                                        n4 = client.field779;
                                                                        class566.method10659(n, n2, n + n3, n4 + n2);
                                                                        class182.method4071();
                                                                        class566.method10626();
                                                                        n7 = client.field588;
                                                                        if (client.field679 / 256 > n7) {
                                                                            n7 = client.field679 / 256;
                                                                        }
                                                                        if (client.field571[4] && client.field690[4] + 128 > n7) {
                                                                            n7 = client.field690[4] + 128;
                                                                        }
                                                                        n6 = client.field503 & 0x7FF;
                                                                        int n25 = class234.field2509;
                                                                        n23 = class322.field3330;
                                                                        n22 = class7.field26;
                                                                        n9 = n24 = n7 * 3 + 600;
                                                                        n9 = class192.method4471(n9, n4);
                                                                        n20 = 2048 - n7 & 0x7FF;
                                                                        n8 = 2048 - n6 & 0x7FF;
                                                                        n19 = 0;
                                                                        n18 = 0;
                                                                        n17 = n9;
                                                                        if (n20 != 0) {
                                                                            n16 = class182.field1954[n20];
                                                                            n15 = class182.field1955[n20];
                                                                            n14 = n18 * n15 - n16 * n17 >> 16;
                                                                            n17 = n18 * n16 + n15 * n17 >> 16;
                                                                            n18 = n14;
                                                                        }
                                                                        if (n8 != 0) {
                                                                            n16 = class182.field1954[n8];
                                                                            n15 = class182.field1955[n8];
                                                                            n14 = n17 * n16 + n19 * n15 >> 16;
                                                                            n17 = n17 * n15 - n19 * n16 >> 16;
                                                                            n19 = n14;
                                                                        }
                                                                        if (client.field797) {
                                                                            class245.field2603 = n25 - n19;
                                                                            class42.field275 = n23 - n18;
                                                                            class27.field118 = n22 - n17;
                                                                            class70.field830 = n7;
                                                                            class340.field3703 = n6;
                                                                        } else {
                                                                            class478.field5017 = n25 - n19;
                                                                            class64.field459 = n23 - n18;
                                                                            class31.field140 = n22 - n17;
                                                                            class159.field1730 = n7;
                                                                            class183.field1972 = n6;
                                                                        }
                                                                        if (client.field594 == 1 && client.field671 >= 2 && client.field514 % 50 == 0 && (class234.field2509 >> 7 != class407.field4693.field1213 >> 7 || class7.field26 >> 7 != class407.field4693.field1196 >> 7)) {
                                                                            n16 = class407.field4693.field1137;
                                                                            n15 = (class234.field2509 >> 7) + class34.field189.field1324;
                                                                            n14 = (class7.field26 >> 7) + class34.field189.field1325;
                                                                            class324 class3242 = class90.method2629(class322.field3368, client.field564.field1446);
                                                                            class3242.field3442.method10319(n15);
                                                                            class3242.field3442.method10320(n14);
                                                                            class3242.field3442.method10332(client.field601);
                                                                            class3242.field3442.method10310(n16);
                                                                            client.field564.method3257(class3242);
                                                                        }
                                                                        if (client.field797) break block64;
                                                                        if (!class544.field5403.method2890()) break block65;
                                                                        break block66;
                                                                    }
                                                                    if (class544.field5403.method2890()) {
                                                                        n8 = class34.field189.field1321;
                                                                    } else {
                                                                        n19 = class478.field5017 >> 7;
                                                                        n18 = class31.field140 >> 7;
                                                                        n8 = n19 >= 0 && 104 > n19 && n18 >= 0 && 104 > n18 ? ((n17 = class23.method337(class34.field189, class478.field5017, class31.field140, class34.field189.field1321)) - class64.field459 < 800 && (class34.field189.field1337[class34.field189.field1321][n19][n18] & 4) != 0 ? class34.field189.field1321 : 3) : class34.field189.field1321;
                                                                    }
                                                                    n20 = n8;
                                                                    break block67;
                                                                }
                                                                n8 = class34.field189.field1321;
                                                                break block68;
                                                            }
                                                            n19 = 3;
                                                            n18 = class53.field339.vmethod9352() >> 7;
                                                            n17 = class53.field339.vmethod9331() >> 7;
                                                            if (class159.field1730 >= 310) break block69;
                                                            if (client.field594 == 1) {
                                                                n16 = class234.field2509 >> 7;
                                                                n15 = class7.field26 >> 7;
                                                            } else {
                                                                n16 = n18;
                                                                n15 = n17;
                                                            }
                                                            n14 = class478.field5017 >> 7;
                                                            n13 = class31.field140 >> 7;
                                                            if (n14 < 0 || 104 <= n14 || n13 < 0 || 104 <= n13) break block70;
                                                            if (n16 < 0 || 104 <= n16 || n15 < 0 || 104 <= n15) break block71;
                                                            if ((class34.field189.field1337[class34.field189.field1321][n14][n13] & 4) != 0) {
                                                                n19 = class34.field189.field1321;
                                                            }
                                                            if ((n12 = n16 > n14 ? n16 - n14 : n14 - n16) <= (n11 = n15 > n13 ? n15 - n13 : n13 - n15)) break block72;
                                                            n21 = n11 * 65536 / n12;
                                                            n10 = 32768;
                                                            break block73;
                                                        }
                                                        if (n11 <= 0) break block69;
                                                        n21 = n12 * 65536 / n11;
                                                        n10 = 32768;
                                                        break block74;
                                                    }
                                                    n8 = class34.field189.field1321;
                                                    break block68;
                                                }
                                                n8 = class34.field189.field1321;
                                                break block68;
                                            }
                                            int n26 = n23 = class4802.field5035.field1320 == class148.field1676 ? 1 : 0;
                                            if (n23 != 0) break block75;
                                            int n27 = n22 = n7 < client.field794 ? 1 : 0;
                                            if (n22 == 0) break block62;
                                            ++n7;
                                        }
                                        class4802.field5029.method5891(class23.method337(class1034, class4802.vmethod9352(), class4802.vmethod9331(), class1034.field1321));
                                        class4802.field5035.field1319.field2056 = client.field514;
                                        class4802.method9351();
                                        class1034.field1319.method4185(class1034.field1321, class4802.vmethod9352(), class4802.vmethod9331(), class4802.method9288(), class4802.method9315() / 2, class4802.field5035.field1319, class4802.method9291(), 0L, false);
                                        class103 class1035 = class4802.field5035;
                                        if (client.field633) {
                                            class137.method3487(class1035, client.field623, false);
                                        }
                                        break block76;
                                    }
                                    while (n13 != n15) {
                                        if (n13 < n15) {
                                            ++n13;
                                        } else if (n13 > n15) {
                                            --n13;
                                        }
                                        if ((class34.field189.field1337[class34.field189.field1321][n14][n13] & 4) != 0) {
                                            n19 = class34.field189.field1321;
                                        }
                                        if ((n10 += n21) < 65536) continue;
                                        n10 -= 65536;
                                        if (n14 < n16) {
                                            ++n14;
                                        } else if (n14 > n16) {
                                            --n14;
                                        }
                                        if ((class34.field189.field1337[class34.field189.field1321][n14][n13] & 4) == 0) continue;
                                        n19 = class34.field189.field1321;
                                    }
                                    break block69;
                                }
                                while (n16 != n14) {
                                    if (n14 < n16) {
                                        ++n14;
                                    } else if (n14 > n16) {
                                        --n14;
                                    }
                                    if ((class34.field189.field1337[class34.field189.field1321][n14][n13] & 4) != 0) {
                                        n19 = class34.field189.field1321;
                                    }
                                    if ((n10 += n21) < 65536) continue;
                                    n10 -= 65536;
                                    if (n13 < n15) {
                                        ++n13;
                                    } else if (n13 > n15) {
                                        --n13;
                                    }
                                    if ((class34.field189.field1337[class34.field189.field1321][n14][n13] & 4) == 0) continue;
                                    n19 = class34.field189.field1321;
                                }
                            }
                            if (n18 >= 0 && 104 > n18 && n17 >= 0 && 104 > n17) {
                                if ((class34.field189.field1337[class34.field189.field1321][n18][n17] & 4) != 0) {
                                    n19 = class34.field189.field1321;
                                }
                                n8 = n19;
                            } else {
                                n8 = class34.field189.field1321;
                            }
                        }
                        n20 = n8;
                    }
                    n8 = class478.field5017;
                    n19 = class64.field459;
                    n18 = class31.field140;
                    n17 = class159.field1730;
                    n16 = class183.field1972;
                    n15 = 0;
                    while (true) {
                        block78: {
                            block79: {
                                block77: {
                                    if (n15 >= 5) break block77;
                                    if (!client.field571[n15]) break block78;
                                    break block79;
                                }
                                n15 = class35.field201;
                                n14 = class35.field202;
                                if (class35.field200 != 0) {
                                    n15 = class35.field209;
                                    n14 = class35.field211;
                                }
                                if (n15 >= n && n15 < n + n3 && n14 >= n2 && n14 < n4 + n2) {
                                    class154.method3627(n15 - n, n14 - n2);
                                    for (class103 class1036 : client.field508) {
                                        class1036.field1319.method4231(class1036.field1321, n15 - n, n14 - n2);
                                    }
                                } else {
                                    class251.method5359();
                                }
                                class113.method3178();
                                class566.method10677(n, n2, n3, n4, 0);
                                class113.method3178();
                                n13 = class182.method4061();
                                class182.method4017(client.field521.field174);
                                class182.field1957.field2289 = client.field553;
                                n12 = class53.field339.vmethod9352();
                                n11 = class53.field339.vmethod9331();
                                class175 class1752 = class148.field1676 == -1 ? class175.field1837 : class175.field1838;
                                class34.field189.field1319.method4212(class1752);
                                class34.field189.field1319.method4236(class478.field5017, class64.field459, class31.field140, class159.field1730, class183.field1972, n20, n12, n11, client.field797);
                                class182.method4017(false);
                                if (client.field532) {
                                    class566.method10627();
                                }
                                break;
                            }
                            n14 = (int)(Math.random() * (double)(client.field764[n15] * 2 + 1) - (double)client.field764[n15] + Math.sin((double)client.field768[n15] / 100.0 * (double)client.field705[n15]) * (double)client.field690[n15]);
                            if (n15 == 0) {
                                class478.field5017 = n14 + class478.field5017;
                            }
                            if (n15 == 1) {
                                class64.field459 = n14 + class64.field459;
                            }
                            if (n15 == 2) {
                                class31.field140 = n14 + class31.field140;
                            }
                            if (n15 == 3) {
                                class183.field1972 = n14 + class183.field1972 & 0x7FF;
                            }
                            if (n15 == 4) {
                                if ((class159.field1730 = n14 + class159.field1730) < 128) {
                                    class159.field1730 = 128;
                                }
                                if (class159.field1730 > 383) {
                                    class159.field1730 = 383;
                                }
                            }
                        }
                        ++n15;
                    }
                    class182.field1957.field2289 = n13;
                    class113.method3178();
                    class34.field189.field1319.method4365();
                    n10 = 0;
                    while (true) {
                        if (n10 >= class34.field189.field1334) break;
                        class4803 = class34.field189.field1318[class34.field189.field1335[n10]];
                        if (class4803 != null) {
                            class4803.field5035.field1319.method4365();
                        }
                        ++n10;
                    }
                    class151.method3599(class34.field189, n, n2, n3, n4);
                    n10 = 0;
                    while (true) {
                        block81: {
                            block82: {
                                block80: {
                                    if (n10 >= class34.field189.field1334) break block80;
                                    class4803 = class34.field189.field1318[class34.field189.field1335[n10]];
                                    if (class4803 == null) break block81;
                                    break block82;
                                }
                                class355.method7041(class34.field189, n, n2);
                                ((class194)class182.field1957.field2300).method4479(client.field581);
                                client.field625 = 0;
                                n10 = (class407.field4693.field1213 >> 7) + class34.field189.field1324;
                                int n28 = (class407.field4693.field1196 >> 7) + class34.field189.field1325;
                                if (n10 >= 3053 && n10 <= 3156 && n28 >= 3056 && n28 <= 3136) {
                                    client.field625 = 1;
                                }
                                if (n10 >= 3072 && n10 <= 3118 && n28 >= 9492 && n28 <= 9535) {
                                    client.field625 = 1;
                                }
                                if (client.field625 == 1 && n10 >= 3139 && n10 <= 3199 && n28 >= 3008 && n28 <= 3062) {
                                    client.field625 = 0;
                                }
                                class478.field5017 = n8;
                                class64.field459 = n19;
                                class31.field140 = n18;
                                class159.field1730 = n17;
                                class183.field1972 = n16;
                                if (client.field513 && HitSplatDef.field2760.method7836(true, false) == 0) {
                                    client.field513 = false;
                                }
                                if (client.field513) {
                                    class566.method10677(n, n2, n3, n4, 0);
                                    class328.method6641("Loading - please wait.", false);
                                }
                                return;
                            }
                            class151.method3599(class4803.field5035, n, n2, n3, n4);
                        }
                        ++n10;
                    }
                }
                class9.method79(class4802.field5035);
                class455.method8951(class4802.field5035, true);
                class103 class1037 = class4802.field5035;
                n9 = client.field673.field1406;
                int[] nArray2 = client.field673.field1412;
                n8 = 0;
                while (true) {
                    block84: {
                        block85: {
                            block83: {
                                if (n8 >= n9) break block83;
                                if (nArray2[n8] == client.field641) break block84;
                                break block85;
                            }
                            class455.method8951(class4802.field5035, false);
                            class406.method7980(class4802.field5035);
                            class16.method208(class4802.field5035);
                            break;
                        }
                        if (nArray2[n8] != client.field623) {
                            class137.method3487(class1037, nArray2[n8], true);
                        }
                    }
                    ++n8;
                }
            }
            ++n6;
        }
    }
}

