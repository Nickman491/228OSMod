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

@ObfuscatedName(value="cd")
public class class70 {
    @ObfuscatedName(value="ku")
    @ObfuscatedSignature(descriptor="[Lvi;")
    static class569[] field829;
    @ObfuscatedName(value="uc")
    @ObfuscatedGetter(intValue=-721230967)
    static int field830;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Luo;")
    final class534 field824;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lsi;")
    public final class469 field825;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lru;")
    public final class467 field828;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1560136083)
    int field827 = 0;

    @ObfuscatedSignature(descriptor="(Luo;)V")
    class70(class534 class5342) {
        this.field824 = class5342;
        this.field825 = new class469(class5342);
        this.field828 = new class467(class5342);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1622484082")
    boolean method2019() {
        return this.field827 == 2;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1621276437")
    final void method2066() {
        this.field827 = 1;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="1207581411")
    final void method2021(class556 class5562, int n) {
        this.field825.method9091(class5562, n);
        this.field827 = 2;
        Iterator iterator = client.field508.iterator();
        block0: while (true) {
            if (!iterator.hasNext()) {
                class72.method2269();
                if (class281.field3080 != null) {
                    class281.field3080.method9112();
                }
                return;
            }
            class103 class1032 = (class103)iterator.next();
            int n2 = 0;
            while (true) {
                if (n2 >= client.field673.field1406) continue block0;
                class94 class942 = class1032.field1329[client.field673.field1412[n2]];
                if (class942 != null) {
                    class942.method2656();
                }
                ++n2;
            }
            break;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="911863708")
    final void method2022() {
        class472 class4722 = (class472)this.field825.field4979.method8118();
        while (class4722 != null) {
            if ((long)class4722.field4997 < class37.method724() / 1000L - 5L) {
                if (class4722.field4994 > 0) {
                    class72.method2153(5, "", class4722.field4993 + " has logged in.");
                }
                if (class4722.field4994 == 0) {
                    class72.method2153(5, "", class4722.field4993 + " has logged out.");
                }
                class4722.method9617();
            }
            class4722 = (class472)this.field825.field4979.method8119();
        }
        return;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="18")
    final void method2023() {
        this.field827 = 0;
        this.field825.method9191();
        this.field828.method9191();
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lwb;ZB)Z", garbageValue="0")
    final boolean method2024(class579 class5792, boolean bl) {
        if (class5792 == null) {
            return false;
        }
        if (class5792.equals(class407.field4693.field1147)) {
            return true;
        }
        return this.field825.method9090(class5792, bl);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lwb;I)Z", garbageValue="-1462398022")
    final boolean method2025(class579 class5792) {
        if (class5792 == null) {
            return false;
        }
        return this.field828.method9194(class5792);
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="-85")
    final void method2077(String string) {
        if (string == null) {
            return;
        }
        class579 class5792 = new class579(string, this.field824);
        if (!class5792.method10980()) {
            return;
        }
        if (!this.method2027()) {
            if (!class407.field4693.field1147.equals(class5792)) {
                if (!this.method2024(class5792, false)) {
                    if (!this.method2025(class5792)) {
                        class324 class3242 = class90.method2629(class322.field3374, client.field564.field1446);
                        class3242.field3442.method10300(class91.method2631(string));
                        class3242.field3442.method10442(string);
                        client.field564.method3257(class3242);
                        return;
                    }
                    class45.method897(string);
                    return;
                }
                class178.method3989(string);
                return;
            }
            class7.method58();
            return;
        }
        class440.method8812();
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-752792445")
    final boolean method2027() {
        return this.field825.method9193() || this.field825.method9192() >= 200 && client.field628 != 1;
        {
        }
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="1315844068")
    final void method2028(String string) {
        if (string == null) {
            return;
        }
        class579 class5792 = new class579(string, this.field824);
        if (!class5792.method10980()) {
            return;
        }
        if (!this.method2029()) {
            if (!class407.field4693.field1147.equals(class5792)) {
                if (!this.method2025(class5792)) {
                    if (!this.method2024(class5792, false)) {
                        class378.method7636(string);
                        return;
                    }
                    String string2 = "Please remove " + string + " from your friend list first";
                    class72.method2153(30, "", string2);
                    return;
                }
                class405.method7966(string);
                return;
            }
            String string3 = "You can't add yourself to your own ignore list";
            class72.method2153(30, "", string3);
            return;
        }
        class19.method287();
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="78734807")
    final boolean method2029() {
        return this.field828.method9193() || this.field828.method9192() >= 100 && client.field628 != 1;
        {
        }
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="866716320")
    final void method2030(String string) {
        Object object;
        if (string == null) {
            return;
        }
        class579 class5792 = new class579(string, this.field824);
        if (!class5792.method10980()) {
            return;
        }
        if (this.field825.method9198(class5792)) {
            class327.method6639();
            object = class90.method2629(class322.field3403, client.field564.field1446);
            ((class324)object).field3442.method10300(class91.method2631(string));
            ((class324)object).field3442.method10442(string);
            client.field564.method3257((class324)object);
        }
        object = client.field508.iterator();
        block0: while (true) {
            if (!object.hasNext()) {
                class72.method2269();
                if (class281.field3080 != null) {
                    class281.field3080.method9112();
                }
                return;
            }
            class103 class1032 = (class103)object.next();
            int n = 0;
            while (true) {
                if (n >= client.field673.field1406) continue block0;
                class94 class942 = class1032.field1329[client.field673.field1412[n]];
                if (class942 != null) {
                    class942.method2656();
                }
                ++n;
            }
            break;
        }
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;ZB)V", garbageValue="-54")
    public final void method2031(String string, boolean bl) {
        if (string == null) {
            return;
        }
        class579 class5792 = new class579(string, this.field824);
        if (!class5792.method10980()) {
            return;
        }
        if (this.field828.method9198(class5792)) {
            class327.method6639();
            if (bl) {
                class324 class3242 = class90.method2629(class322.field3399, client.field564.field1446);
                class3242.field3442.method10300(class91.method2631(string));
                class3242.field3442.method10442(string);
                client.field564.method3257(class3242);
            }
        }
        class328.method6640();
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(Lwb;I)Z", garbageValue="-1126787481")
    final boolean method2081(class579 class5792) {
        class471 class4712 = (class471)this.field825.method9219(class5792);
        return class4712 != null && class4712.method9278();
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIII)I", garbageValue="584905582")
    static final int method2089(int n, int n2, int n3, int n4) {
        return n * n3 + n4 * n2 >> 16;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="jp")
    @ObfuscatedSignature(descriptor="(ZLvv;I)V", garbageValue="1634524342")
    static final void method2091(boolean bl, class555 class5552) {
        client.field531 = bl;
        if (client.field531) {
            int n = class5552.method10334();
            int n2 = class5552.method10307();
            boolean bl2 = class5552.method10312() == 1;
            int n3 = class5552.method10307();
            class5552.method10226();
            int n4 = 0;
            while (true) {
                int n5;
                int n6;
                int n7;
                if (n4 >= 4) {
                    class5552.method10238();
                    class341.field3705 = new int[n3][4];
                    n4 = 0;
                    while (true) {
                        if (n4 >= n3) {
                            class194.field2157 = new int[n3];
                            class92.field1101 = new int[n3];
                            class395.field4630 = new int[n3];
                            class20.field88 = new byte[n3][];
                            class303.field3270 = new byte[n3][];
                            n3 = 0;
                            n4 = 0;
                            while (true) {
                                if (n4 >= 4) {
                                    class188.method4437(n, n2, !bl2);
                                    return;
                                }
                                block3: for (n7 = 0; n7 < 13; ++n7) {
                                    n6 = 0;
                                    while (true) {
                                        if (n6 >= 13) {
                                            continue block3;
                                        }
                                        n5 = client.field577[n4][n7][n6];
                                        if (n5 != -1) {
                                            int n8;
                                            int n9 = n5 >> 14 & 0x3FF;
                                            int n10 = n5 >> 3 & 0x7FF;
                                            int n11 = (n9 / 8 << 8) + n10 / 8;
                                            for (n8 = 0; n8 < n3; ++n8) {
                                                if (class194.field2157[n8] != n11) {
                                                    continue;
                                                }
                                                n11 = -1;
                                                break;
                                            }
                                            if (n11 != -1) {
                                                class194.field2157[n3] = n11;
                                                n8 = n11 >> 8 & 0xFF;
                                                int n12 = n11 & 0xFF;
                                                class92.field1101[n3] = class68.field494.method7743("m" + n8 + "_" + n12);
                                                class395.field4630[n3] = class68.field494.method7743("l" + n8 + "_" + n12);
                                                ++n3;
                                            }
                                        }
                                        ++n6;
                                    }
                                }
                                ++n4;
                            }
                        }
                        for (n7 = 0; n7 < 4; ++n7) {
                            class341.field3705[n4][n7] = class5552.method10440();
                        }
                        ++n4;
                    }
                }
                block7: for (n7 = 0; n7 < 13; ++n7) {
                    n6 = 0;
                    while (true) {
                        if (n6 >= 13) {
                            continue block7;
                        }
                        n5 = class5552.method10227(1);
                        client.field577[n4][n7][n6] = n5 == 1 ? class5552.method10227(26) : -1;
                        ++n6;
                    }
                }
                ++n4;
            }
        }
        int n = class5552.method10334();
        int n13 = class5552.method10307();
        class5552.method10326();
        int n14 = class5552.method10307();
        class341.field3705 = new int[n14][4];
        int n15 = 0;
        while (true) {
            int n16;
            if (n15 >= n14) {
                class194.field2157 = new int[n14];
                class92.field1101 = new int[n14];
                class395.field4630 = new int[n14];
                class20.field88 = new byte[n14][];
                class303.field3270 = new byte[n14][];
                n14 = 0;
                n15 = (n13 - 6) / 8;
                while (true) {
                    if (n15 > (n13 + 6) / 8) {
                        class188.method4437(n13, n, true);
                        return;
                    }
                    for (n16 = (n - 6) / 8; n16 <= (n + 6) / 8; ++n16) {
                        int n17;
                        class194.field2157[n14] = n17 = n16 + (n15 << 8);
                        class92.field1101[n14] = class68.field494.method7743("m" + n15 + "_" + n16);
                        class395.field4630[n14] = class68.field494.method7743("l" + n15 + "_" + n16);
                        ++n14;
                    }
                    ++n15;
                }
            }
            for (n16 = 0; n16 < 4; ++n16) {
                class341.field3705[n15][n16] = class5552.method10440();
            }
            ++n15;
        }
    }

    @ObfuscatedName(value="jz")
    @ObfuscatedSignature(descriptor="(IIIIIB)V", garbageValue="10")
    static final void method2046(int n, int n2, int n3, int n4, int n5) {
        int n6;
        Object object;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        class187 class1872 = class34.field189.field1319;
        long l = class1872.method4395(n, n2, n3);
        if (0L != l) {
            n13 = class1872.method4192(n, n2, n3, l);
            n12 = n13 >> 6 & 3;
            n11 = n13 & 0x1F;
            n10 = n4;
            int n14 = n9 = l != 0L ? 1 : 0;
            if (n9 != 0) {
                n8 = (int)(l >>> 16 & 1L) == 1 ? 1 : 0;
                int n15 = n9 = n8 == 0 ? 1 : 0;
            }
            if ((n7 = n9) != 0) {
                n10 = n5;
            }
            object = class174.field1834.field5576;
            n8 = n2 * 4 + (103 - n3) * 2048 + 24624;
            n6 = class360.method7406(l);
            ObjectDef class2622 = class142.method3512(n6);
            if (class2622.field2818 == -1) {
                if (n11 == 0 || n11 == 2) {
                    if (n12 != 0) {
                        if (n12 != 1) {
                            if (n12 != 2) {
                                if (n12 == 3) {
                                    object[n8 + 1536] = n10;
                                    object[n8 + 1536 + 1] = n10;
                                    object[n8 + 1536 + 2] = n10;
                                    object[n8 + 1536 + 3] = n10;
                                }
                            } else {
                                object[n8 + 3] = n10;
                                object[n8 + 512 + 3] = n10;
                                object[n8 + 1024 + 3] = n10;
                                object[n8 + 1536 + 3] = n10;
                            }
                        } else {
                            object[n8] = n10;
                            object[n8 + 1] = n10;
                            object[n8 + 2] = n10;
                            object[n8 + 3] = n10;
                        }
                    } else {
                        object[n8] = n10;
                        object[n8 + 512] = n10;
                        object[n8 + 1024] = n10;
                        object[n8 + 1536] = n10;
                    }
                }
                if (n11 == 3) {
                    if (n12 == 0) {
                        object[n8] = n10;
                    } else if (n12 == 1) {
                        object[n8 + 3] = n10;
                    } else if (n12 == 2) {
                        object[n8 + 1536 + 3] = n10;
                    } else if (n12 == 3) {
                        object[n8 + 1536] = n10;
                    }
                }
                if (n11 == 2) {
                    if (n12 != 3) {
                        if (n12 != 0) {
                            if (n12 != 1) {
                                if (n12 == 2) {
                                    object[n8 + 1536] = n10;
                                    object[n8 + 1536 + 1] = n10;
                                    object[n8 + 1536 + 2] = n10;
                                    object[n8 + 1536 + 3] = n10;
                                }
                            } else {
                                object[n8 + 3] = n10;
                                object[n8 + 512 + 3] = n10;
                                object[n8 + 1024 + 3] = n10;
                                object[n8 + 1536 + 3] = n10;
                            }
                        } else {
                            object[n8] = n10;
                            object[n8 + 1] = n10;
                            object[n8 + 2] = n10;
                            object[n8 + 3] = n10;
                        }
                    } else {
                        object[n8] = n10;
                        object[n8 + 512] = n10;
                        object[n8 + 1024] = n10;
                        object[n8 + 1536] = n10;
                    }
                }
            } else {
                class569 class5692 = class155.field1709[class2622.field2818];
                if (class5692 != null) {
                    int n16 = (class2622.field2804 * 4 - class5692.field5567) / 2;
                    int n17 = (class2622.field2805 * 4 - class5692.field5564) / 2;
                    class5692.method10710(n2 * 4 + n16 + 48, (104 - n3 - class2622.field2805) * 4 + n17 + 48);
                }
            }
        }
        if (0L != (l = class1872.method4202(n, n2, n3))) {
            n13 = class1872.method4192(n, n2, n3, l);
            n12 = n13 >> 6 & 3;
            n11 = n13 & 0x1F;
            n10 = class360.method7406(l);
            ObjectDef class2623 = class142.method3512(n10);
            if (class2623.field2818 == -1) {
                if (n11 == 9) {
                    int n18;
                    n9 = 0xEEEEEE;
                    int n19 = n6 = l != 0L ? 1 : 0;
                    if (n6 != 0) {
                        n18 = (int)(l >>> 16 & 1L) == 1 ? 1 : 0;
                        int n20 = n6 = n18 == 0 ? 1 : 0;
                    }
                    if ((n8 = n6) != 0) {
                        n9 = 0xEE0000;
                    }
                    int[] nArray = class174.field1834.field5576;
                    n18 = n2 * 4 + (103 - n3) * 2048 + 24624;
                    if (n12 != 0 && n12 != 2) {
                        nArray[n18] = n9;
                        nArray[n18 + 1 + 512] = n9;
                        nArray[n18 + 1024 + 2] = n9;
                        nArray[n18 + 1536 + 3] = n9;
                    } else {
                        nArray[n18 + 1536] = n9;
                        nArray[n18 + 1 + 1024] = n9;
                        nArray[n18 + 512 + 2] = n9;
                        nArray[n18 + 3] = n9;
                    }
                }
            } else {
                object = class155.field1709[class2623.field2818];
                if (object != null) {
                    n8 = (class2623.field2804 * 4 - ((class569)object).field5567) / 2;
                    n6 = (class2623.field2805 * 4 - ((class569)object).field5564) / 2;
                    ((class569)object).method10710(n2 * 4 + n8 + 48, n6 + (104 - n3 - class2623.field2805) * 4 + 48);
                }
            }
        }
        if (0L != (l = class1872.method4203(n, n2, n3))) {
            class569 class5693;
            n13 = class360.method7406(l);
            ObjectDef class2624 = class142.method3512(n13);
            if (class2624.field2818 != -1 && (class5693 = class155.field1709[class2624.field2818]) != null) {
                n10 = (class2624.field2804 * 4 - class5693.field5567) / 2;
                n7 = (class2624.field2805 * 4 - class5693.field5564) / 2;
                class5693.method10710(n10 + n2 * 4 + 48, n7 + (104 - n3 - class2624.field2805) * 4 + 48);
            }
        }
    }
}

