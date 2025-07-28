package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ap")
public final class class23
extends Canvas {
    @ObfuscatedName(value="ay")
    Component field96;

    class23(Component component) {
        this.field96 = component;
    }

    @Override
    public final void update(Graphics graphics) {
        this.field96.update(graphics);
    }

    @Override
    public final void paint(Graphics graphics) {
        this.field96.paint(graphics);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Ljt;", garbageValue="1660841300")
    static class245[] method338() {
        return new class245[]{class245.field2604, class245.field2605, class245.field2609};
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lue;III)I", garbageValue="452391295")
    static int method336(class529 class5292, int n, int n2) {
        if (class5292 == null) {
            return n2;
        }
        class513 class5132 = (class513)class5292.method9967(n);
        if (class5132 == null) {
            return n2;
        }
        return class5132.field5172;
    }

    @ObfuscatedName(value="bm")
    @ObfuscatedSignature(descriptor="(ILdm;ZS)I", garbageValue="13847")
    static int method339(int n, class81 class812, boolean bl) {
        if (n != 5306) {
            int n2;
            if (n != 5307) {
                if (n != 5308) {
                    int n3;
                    if (n != 5309) {
                        if (n != 5310) {
                            return 2;
                        }
                        --class63.field444;
                        return 1;
                    }
                    if ((n3 = class72.field865[--class63.field444]) == 1 || n3 == 2) {
                        class544.field5403.method2905(n3);
                    }
                    return 1;
                }
                class72.field865[++class63.field444 - 1] = class544.field5403.method2906();
                return 1;
            }
            if ((n2 = class72.field865[--class63.field444]) == 1 || n2 == 2) {
                class555.method10255(n2);
            }
            return 1;
        }
        class72.field865[++class63.field444 - 1] = class194.method4501();
        return 1;
    }

    @ObfuscatedName(value="fh")
    @ObfuscatedSignature(descriptor="(I)Lua;", garbageValue="-752612347")
    static class524 method330() {
        return class420.field4722;
    }

    @ObfuscatedName(value="hf")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-944852240")
    static final void method335() {
        int n;
        int n2;
        if (client.field594 != 0) {
            if (client.field594 == 1) {
                int n3;
                if (client.field602 && class407.field4693 != null) {
                    n2 = class407.field4693.field1266[0];
                    n = class407.field4693.field1221[0];
                    if (n2 >= 0 && 104 > n2 && n >= 0 && 104 > n) {
                        class234.field2509 = class407.field4693.field1213;
                        n3 = class23.method337(class34.field189, class407.field4693.field1213, class407.field4693.field1196, class34.field189.field1321) - client.field595;
                        if (n3 < class322.field3330) {
                            class322.field3330 = n3;
                        }
                        class7.field26 = class407.field4693.field1196;
                        client.field602 = false;
                    }
                }
                n2 = -1;
                if (client.field731.method5776(33)) {
                    n2 = 0;
                } else if (client.field731.method5776(49)) {
                    n2 = 1024;
                }
                if (!client.field731.method5776(48)) {
                    if (client.field731.method5776(50)) {
                        n2 = n2 == 0 ? 256 : (n2 == 1024 ? 768 : 512);
                    }
                } else {
                    n2 = n2 == 0 ? 1792 : (n2 == 1024 ? 1280 : 1536);
                }
                n = 0;
                if (client.field731.method5776(35)) {
                    n = -1;
                } else if (client.field731.method5776(51)) {
                    n = 1;
                }
                n3 = 0;
                if (n2 >= 0 || n != 0) {
                    n3 = client.field731.method5776(81) ? client.field600 : client.field599;
                    n3 *= 16;
                    client.field539 = n2;
                    client.field626 = n;
                }
                if (client.field596 >= n3) {
                    if (client.field596 > n3) {
                        client.field596 = client.field596 * 9 / 10;
                    }
                } else if ((client.field596 = n3 / 8 + client.field596) > n3) {
                    client.field596 = n3;
                }
                if (client.field596 <= 0) {
                    client.field539 = -1;
                    client.field626 = -1;
                } else {
                    int n4 = client.field596 / 16;
                    if (client.field539 >= 0) {
                        n2 = client.field539 - class183.field1972 & 0x7FF;
                        int n5 = class182.field1954[n2];
                        int n6 = class182.field1955[n2];
                        class234.field2509 += n5 * n4 / 65536;
                        class7.field26 += n4 * n6 / 65536;
                    }
                    if (client.field626 != 0 && (class322.field3330 = n4 * client.field626 + class322.field3330) > 0) {
                        class322.field3330 = 0;
                    }
                }
                if (client.field731.method5776(13)) {
                    class380.method7644();
                }
            }
        } else {
            int n7;
            class94 class942;
            n2 = class53.field339.vmethod9352();
            n = class53.field339.vmethod9331();
            if (client.field781 != -1 && (class942 = class407.field4693.field1143.field1329[client.field781]) != null) {
                class350 class3502 = class942.method2785(class407.field4693.field1143);
                n2 = class3502.field3764;
                n = class3502.field3765;
            }
            int n8 = class53.field339.vmethod9290();
            if (class234.field2509 - n2 < -500 || class234.field2509 - n2 > 500 || class7.field26 - n < -500 || class7.field26 - n > 500) {
                class234.field2509 = n2;
                class7.field26 = n;
            }
            if (n2 != class234.field2509) {
                class234.field2509 += (n2 - class234.field2509) / 16;
            }
            if (n != class7.field26) {
                class7.field26 += (n - class7.field26) / 16;
            }
            int n9 = class234.field2509 >> 7;
            int n10 = class7.field26 >> 7;
            int n11 = class23.method337(class34.field189, class234.field2509, class7.field26, n8);
            int n12 = 0;
            if (n9 > 3 && n10 > 3 && n9 < 100 && n10 < 100) {
                for (n7 = n9 - 4; n7 <= n9 + 4; ++n7) {
                    for (int i = n10 - 4; i <= n10 + 4; ++i) {
                        int n13;
                        int n14 = n8;
                        if (n14 < 3 && (class34.field189.field1337[1][n7][i] & 2) == 2) {
                            ++n14;
                        }
                        if ((n13 = n11 - class34.field189.field1328[n14][n7][i]) <= n12) continue;
                        n12 = n13;
                    }
                }
            }
            if ((n7 = n12 * 192) > 98048) {
                n7 = 98048;
            }
            if (n7 < 32768) {
                n7 = 32768;
            }
            if (n7 > client.field679) {
                client.field679 = (n7 - client.field679) / 24 + client.field679;
            } else if (n7 < client.field679) {
                client.field679 = (n7 - client.field679) / 80 + client.field679;
            }
            class322.field3330 = class23.method337(class34.field189, n2, n, n8) - client.field595;
        }
        if (class35.field206 == 4 && class25.field109) {
            n2 = class35.field202 - client.field593;
            client.field591 = n2 * 2;
            client.field593 = n2 != -1 && n2 != 1 ? (class35.field202 + client.field593) / 2 : class35.field202;
            n = client.field592 - class35.field201;
            client.field590 = n * 2;
            client.field592 = n != -1 && n != 1 ? (client.field592 + class35.field201) / 2 : class35.field201;
        } else {
            client.field590 = client.field731.method5776(96) ? (-24 - client.field590) / 2 + client.field590 : (client.field731.method5776(97) ? (24 - client.field590) / 2 + client.field590 : (client.field590 /= 2));
            client.field591 = client.field731.method5776(98) ? (12 - client.field591) / 2 + client.field591 : (client.field731.method5776(99) ? (-12 - client.field591) / 2 + client.field591 : (client.field591 /= 2));
            client.field593 = class35.field202;
            client.field592 = class35.field201;
        }
        client.field503 = client.field590 / 2 + client.field503 & 0x7FF;
        client.field588 = client.field591 / 2 + client.field588;
        if (client.field588 < 128) {
            client.field588 = 128;
        }
        if (client.field588 > 383) {
            client.field588 = 383;
        }
    }

    @ObfuscatedName(value="jc")
    @ObfuscatedSignature(descriptor="(Ldz;IIIB)I", garbageValue="54")
    static final int method337(class103 class1032, int n, int n2, int n3) {
        int n4 = n >> 7;
        int n5 = n2 >> 7;
        if (n4 >= 0 && n5 >= 0 && n4 < class1032.field1337[0].length && n5 < class1032.field1337[0][0].length) {
            int n6 = n3;
            if (n6 < 3 && (class1032.field1337[1][n4][n5] & 2) == 2) {
                ++n6;
            }
            int n7 = n & 0x7F;
            int n8 = n2 & 0x7F;
            int n9 = class1032.field1328[n6][n4 + 1][n5] * n7 + class1032.field1328[n6][n4][n5] * (128 - n7) >> 7;
            int n10 = n7 * class1032.field1328[n6][n4 + 1][n5 + 1] + class1032.field1328[n6][n4][n5 + 1] * (128 - n7) >> 7;
            return n9 * (128 - n8) + n8 * n10 >> 7;
        }
        return 0;
    }

    @ObfuscatedName(value="ou")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)Ljava/lang/String;", garbageValue="1261539671")
    static String method334(String string) {
        class385[] class385Array = class151.method3607();
        int n = 0;
        while (true) {
            block4: {
                block3: {
                    if (n >= class385Array.length) break block3;
                    class385 class3852 = class385Array[n];
                    if (class3852.field4517 == -1 || !string.startsWith(class236.method5195(class3852.field4517))) break block4;
                    string = string.substring(6 + Integer.toString(class3852.field4517).length());
                }
                return string;
            }
            ++n;
        }
    }
}

