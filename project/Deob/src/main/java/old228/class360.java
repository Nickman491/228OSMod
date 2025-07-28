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

@ObfuscatedName(value="nr")
public class class360 {
    @ObfuscatedName(value="ay")
    public static final short[] field3860 = new short[]{6798, 8741, 25238, 4626, 4550};
    @ObfuscatedName(value="ah")
    public static final short[][] field3858 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010, -22122, 937, 8130, -13422, 30385}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}};
    @ObfuscatedName(value="az")
    public static final short[] field3856 = new short[]{-10304, 9104, -1, -1, -1};
    @ObfuscatedName(value="ao")
    public static final short[][] field3855 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002, -22116, 945, 8144, -13414, 30389}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]};
    @ObfuscatedName(value="jy")
    @ObfuscatedGetter(intValue=-465183433)
    static int field3857;

    @ObfuscatedName(value="ax")
    public static int method7406(long l) {
        return (int)(l >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName(value="ga")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="99")
    static void method7405(int n) {
        if (n == client.field510) {
            return;
        }
        if (client.field510 == 30) {
            client.field575.method5738();
        }
        if (client.field510 == 0) {
            client.field521.method557();
        }
        if (n == 20 || n == 40 || n == 45 || n == 50) {
            class22.method327(class68.field479);
            client.field501 = 0;
            client.field743 = 0;
            client.field763.method8944(n);
            if (n != 20) {
                class146 class1462 = client.field629 = class544.field5403.method2894(class78.field955) ? class146.field1659 : class146.field1661;
            }
        }
        if (n != 20 && n != 40 && class234.field2508 != null) {
            class234.field2508.vmethod9416();
            class234.field2508 = null;
        }
        if (client.field510 == 25) {
            client.field573 = 0;
            client.field760 = 0;
            client.field615 = 1;
            client.field561 = 0;
            client.field572 = 1;
        }
        if (n != 5 && n != 10) {
            if (n != 20) {
                if (n != 11) {
                    if (n != 50) {
                        if (n != 0) {
                            class9.method84();
                        }
                    } else {
                        class150.method3595("", "Updating date of birth...", "");
                        class267.method5753(class166.field1785, class42.field276, class30.field133, false, 7);
                    }
                } else {
                    class267.method5753(class166.field1785, class42.field276, class30.field133, false, 4);
                }
            } else {
                int n2 = client.field510 == 11 ? 4 : 0;
                class267.method5753(class166.field1785, class42.field276, class30.field133, false, n2);
            }
        } else {
            int n3 = class101.method2876() ? 0 : 12;
            class267.method5753(class166.field1785, class42.field276, class30.field133, true, n3);
        }
        client.field510 = n;
    }

    @ObfuscatedName(value="oq")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;ZI)V", garbageValue="1224893635")
    static void method7404(String string, boolean bl) {
        string = string.toLowerCase();
        short[] sArray = new short[16];
        int n = 0;
        int n2 = 0;
        while (true) {
            Object object;
            if (n2 >= class157.field1721) {
                class301.field3257 = sArray;
                class271.field3007 = 0;
                class20.field92 = n;
                String[] stringArray = new String[class20.field92];
                for (int i = 0; i < class20.field92; ++i) {
                    stringArray[i] = class191.method4462((int)sArray[i]).field2848;
                }
                object = class301.field3257;
                class174.method3887(stringArray, (short[])object, 0, stringArray.length - 1);
                return;
            }
            object = class191.method4462(n2);
            if ((!bl || ((ItemDef)object).field2886) && ((ItemDef)object).field2901 == -1 && ((ItemDef)object).field2848.toLowerCase().indexOf(string) != -1) {
                if (n < 250) {
                    if (n >= sArray.length) {
                        short[] sArray2 = new short[sArray.length * 2];
                        for (int i = 0; i < n; ++i) {
                            sArray2[i] = sArray[i];
                        }
                        sArray = sArray2;
                    }
                    sArray[n++] = (short)n2;
                } else {
                    class20.field92 = -1;
                    class301.field3257 = null;
                    return;
                }
            }
            ++n2;
        }
    }
}

