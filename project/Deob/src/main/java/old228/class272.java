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

@ObfuscatedName(value="kv")
public abstract class class272 {
    @ObfuscatedName(value="hq")
    static String field3024;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=843506147)
    public int field3023;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=200025215)
    public int field3020;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1048838837)
    public int field3021;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=322017111)
    public int field3019;

    protected class272() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIILku;B)Z", garbageValue="-42")
    protected abstract boolean vmethod5841(int var1, int var2, int var3, class270 var4);

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="1148389678")
    public static void method5847(int n, int n2) {
        class256 class2562 = class205.method4806(n);
        int n3 = class2562.field2729;
        int n4 = class2562.field2732;
        int n5 = class2562.field2731;
        int n6 = class349.field3760[n5 - n4];
        if (n2 < 0 || n2 > n6) {
            n2 = 0;
        }
        class349.field3763[n3] = class349.field3763[n3] & ~(n6 <<= n4) | n2 << n4 & n6;
    }

    @ObfuscatedName(value="ne")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-2028955871")
    static final void method5848(int n) {
        class150.method3598();
        class71 class712 = (class71)class71.field846.method7996();
        while (true) {
            if (class712 == null) {
                int n2 = class254.method5404((int)n).field2502;
                if (n2 == 0) {
                    return;
                }
                int n3 = class349.field3763[n];
                if (n2 == 1) {
                    if (n3 == 1) {
                        class33.method522(0.9);
                    }
                    if (n3 == 2) {
                        class33.method522(0.8);
                    }
                    if (n3 == 3) {
                        class33.method522(0.7);
                    }
                    if (n3 == 4) {
                        class33.method522(0.6);
                    }
                }
                if (n2 == 3) {
                    if (n3 == 0) {
                        class149.method3578(255);
                    }
                    if (n3 == 1) {
                        class149.method3578(192);
                    }
                    if (n3 == 2) {
                        class149.method3578(128);
                    }
                    if (n3 == 3) {
                        class149.method3578(64);
                    }
                    if (n3 == 4) {
                        class149.method3578(0);
                    }
                }
                if (n2 == 4) {
                    if (n3 == 0) {
                        class170.method3839(127);
                    }
                    if (n3 == 1) {
                        class170.method3839(96);
                    }
                    if (n3 == 2) {
                        class170.method3839(64);
                    }
                    if (n3 == 3) {
                        class170.method3839(32);
                    }
                    if (n3 == 4) {
                        class170.method3839(0);
                    }
                }
                if (n2 == 5) {
                    boolean bl = client.field646 = n3 == 1;
                }
                if (n2 == 6) {
                    client.field667 = n3;
                }
                if (n2 == 9) {
                    // empty if block
                }
                if (n2 == 10) {
                    if (n3 == 0) {
                        class240.method5252(127);
                    }
                    if (n3 == 1) {
                        class240.method5252(96);
                    }
                    if (n3 == 2) {
                        class240.method5252(64);
                    }
                    if (n3 == 3) {
                        class240.method5252(32);
                    }
                    if (n3 == 4) {
                        class240.method5252(0);
                    }
                }
                if (n2 == 17) {
                    client.field672 = n3 & 0xFFFF;
                }
                if (n2 == 18 && (client.field759 = (class108)class259.method5457(class146.method3561(), n3)) == null) {
                    client.field759 = class108.field1377;
                }
                if (n2 == 19) {
                    client.field641 = n3 == -1 ? -1 : n3 & 0x7FF;
                }
                if (n2 == 22 && (client.field728 = (class108)class259.method5457(class146.method3561(), n3)) == null) {
                    client.field728 = class108.field1377;
                }
                return;
            }
            if (class712.field848 != null) {
                class712.method2092();
            }
            class712 = (class71)class71.field846.method8005();
        }
    }

    @ObfuscatedName(value="on")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;ZB)Ljava/lang/String;", garbageValue="59")
    static String method5846(String string, boolean bl) {
        String string2;
        String string3 = string2 = bl ? "https://" : "http://";
        if (client.field500 == 1) {
            string = string + "-wtrc";
        } else if (client.field500 == 2) {
            string = string + "-wtqa";
        } else if (client.field500 == 3) {
            string = string + "-wtwip";
        } else if (client.field500 == 5) {
            string = string + "-wti";
        } else if (client.field500 == 4) {
            string = "local";
        }
        String string4 = "";
        if (class406.field4674 != null) {
            string4 = "/p=" + class406.field4674;
        }
        String string5 = "runescape.com";
        return string2 + string + "." + string5 + "/l=" + class63.field446 + "/a=" + class483.field5046 + string4 + "/";
    }
}

