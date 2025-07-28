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

@ObfuscatedName(value="ly")
public abstract class class302 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lnz;")
    public final class350 field3260;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lnz;")
    public final class350 field3259;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-2111048913)
    int field3258;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-951866125)
    int field3261;

    @ObfuscatedSignature(descriptor="(Lnz;Lnz;)V")
    class302(class350 class3502, class350 class3503) {
        this.field3259 = class3502;
        this.field3260 = class3503;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="468922444")
    public abstract int vmethod6438();

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)Lli;", garbageValue="24")
    abstract class297 vmethod6439();

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1283952551")
    abstract int vmethod6440();

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1685687159")
    abstract int vmethod6453();

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(IIB)Z", garbageValue="4")
    boolean method6437(int n, int n2) {
        if (!this.method6462(n, n2)) {
            return this.method6444(n, n2);
            {
            }
        }
        return true;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-428697607")
    boolean method6456() {
        return this.vmethod6438() >= 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="-2092098035")
    boolean method6462(int n, int n2) {
        if (!this.method6456()) {
            return false;
        }
        class236 class2362 = class31.method498(this.vmethod6438());
        int n3 = this.vmethod6440();
        int n4 = this.vmethod6453();
        switch (class2362.field2524.field2606) {
            case 1: {
                if (n < this.field3258) return false;
                if (n < n3 + this.field3258) break;
                return false;
            }
            case 0: {
                if (n < this.field3258 - n3 / 2) return false;
                if (n <= n3 / 2 + this.field3258) break;
                return false;
            }
            case 2: {
                if (n <= this.field3258 - n3) return false;
                if (n <= this.field3258) break;
                return false;
            }
        }
        switch (class2362.field2539.field2671) {
            case 1: {
                if (n2 < this.field3261 - n4 / 2) return false;
                if (n2 <= n4 / 2 + this.field3261) return true;
                return false;
            }
            case 2: {
                if (n2 <= this.field3261 - n4) return false;
                if (n2 <= this.field3261) return true;
                return false;
            }
            case 0: {
                if (n2 < this.field3261) return false;
                if (n2 < n4 + this.field3261) return true;
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="-1327668678")
    boolean method6444(int n, int n2) {
        class297 class2972 = this.vmethod6439();
        if (class2972 != null) {
            if (n >= this.field3258 - class2972.field3233 / 2 && n <= class2972.field3233 / 2 + this.field3258) {
                return n2 >= this.field3261 && n2 <= class2972.field3234 + this.field3261;
                {
                }
            }
            return false;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IZB)[B", garbageValue="-15")
    public static byte[] method6466(int n, boolean bl) {
        Object object = class453.field4883;
        synchronized (object) {
            int n2;
            if ((n == 100 || n < 100 && bl) && class453.field4884 > 0) {
                byte[] byArray = class453.field4890[--class453.field4884];
                class453.field4890[class453.field4884] = null;
                return byArray;
            }
            if ((n == 5000 || n < 5000 && bl) && class453.field4896 > 0) {
                byte[] byArray = class453.field4893[--class453.field4896];
                class453.field4893[class453.field4896] = null;
                return byArray;
            }
            if ((n == 10000 || n < 10000 && bl) && class453.field4886 > 0) {
                byte[] byArray = class453.field4894[--class453.field4886];
                class453.field4894[class453.field4886] = null;
                return byArray;
            }
            if ((n == 30000 || n < 30000 && bl) && class453.field4885 > 0) {
                byte[] byArray = class453.field4892[--class453.field4885];
                class453.field4892[class453.field4885] = null;
                return byArray;
            }
            if (class225.field2459 != null) {
                for (n2 = 0; n2 < class580.field5644.length; ++n2) {
                    if (class580.field5644[n2] != n && (n >= class580.field5644[n2] || !bl) || class238.field2563[n2] <= 0) continue;
                    int n3 = n2;
                    int n4 = class238.field2563[n3] - 1;
                    class238.field2563[n3] = n4;
                    byte[] byArray = class225.field2459[n2][n4];
                    class225.field2459[n2][class238.field2563[n2]] = null;
                    return byArray;
                }
            }
            if (bl && class580.field5644 != null) {
                for (n2 = 0; n2 < class580.field5644.length; ++n2) {
                    if (n > class580.field5644[n2] || class238.field2563[n2] >= class225.field2459[n2].length) continue;
                    return new byte[class580.field5644[n2]];
                }
            }
        }
        return new byte[n];
    }

    @ObfuscatedName(value="lt")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;B)V", garbageValue="-7")
    static void method6463(int n, String string) {
        int n2 = client.field673.field1406;
        int[] nArray = client.field673.field1412;
        boolean bl = false;
        class579 class5792 = new class579(string, class383.field4489);
        int n3 = 0;
        while (true) {
            block13: {
                block12: {
                    if (n3 >= n2) break block12;
                    class94 class942 = class407.field4693.field1143.field1329[nArray[n3]];
                    if (class942 == null || class942 == class407.field4693 || class942.field1147 == null || !class942.field1147.equals(class5792)) break block13;
                    if (n != 1) {
                        if (n != 4) {
                            if (n != 6) {
                                if (n == 7) {
                                    class324 class3242 = class90.method2629(class322.field3325, client.field564.field1446);
                                    class3242.field3442.method10320(nArray[n3]);
                                    class3242.field3442.method10300(0);
                                    client.field564.method3257(class3242);
                                }
                            } else {
                                class324 class3243 = class90.method2629(class322.field3353, client.field564.field1446);
                                class3243.field3442.method10310(0);
                                class3243.field3442.method10319(nArray[n3]);
                                client.field564.method3257(class3243);
                            }
                        } else {
                            class324 class3244 = class90.method2629(class322.field3332, client.field564.field1446);
                            class3244.field3442.method10320(nArray[n3]);
                            class3244.field3442.method10477(0);
                            client.field564.method3257(class3244);
                        }
                    } else {
                        class324 class3245 = class90.method2629(class322.field3380, client.field564.field1446);
                        class3245.field3442.method10477(0);
                        class3245.field3442.method10454(nArray[n3]);
                        client.field564.method3257(class3245);
                    }
                    bl = true;
                }
                if (!bl) {
                    class72.method2153(4, "", "Unable to find " + string);
                }
                return;
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="lp")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="118")
    static void method6464(int n, int n2, int n3, int n4) {
        class361 class3612 = class170.field1807.method7023(n, n2);
        if (class3612 != null && class3612.field3975 != null) {
            class90 class902 = new class90();
            class902.field1077 = class3612;
            class902.field1086 = class3612.field3975;
            class471.method9136(class902);
        }
        client.field660 = n4;
        client.field522 = true;
        class33.field149 = n;
        client.field659 = n2;
        class106.field1365 = n3;
        class122.method3325(class3612);
    }

    @ObfuscatedName(value="lk")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="-1229904046")
    static boolean method6465(int n, int n2) {
        block5: {
            block6: {
                block4: {
                    boolean bl;
                    if (!class77.method2369(n, n2)) {
                        return false;
                    }
                    if (!class86.method2587(n2)) break block4;
                    class491 class4912 = client.field508.method2740(n);
                    if (class4912 == class491.field5089) break block5;
                    if (class4912 != class491.field5088) break block4;
                    boolean bl2 = n2 != 1002 && n2 != 1003 && n2 != 1004 ? false : (bl = true);
                    if (!bl) break block6;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @ObfuscatedName(value="nu")
    @ObfuscatedSignature(descriptor="(Lna;IIII)V", garbageValue="-317605604")
    static final void method6442(class361 class3612, int n, int n2, int n3) {
        block29: {
            class113.method3178();
            class348 class3482 = class3612.method7446(class170.field1807, false);
            if (class3482 == null) {
                return;
            }
            class566.method10659(n, n2, class3482.field3754 + n, n2 + class3482.field3753);
            if (client.field746 != 2 && client.field746 != 5) {
                int n4 = client.field503 & 0x7FF;
                int n5 = 48 + class53.field339.vmethod9352() / 32;
                int n6 = 464 - class53.field339.vmethod9331() / 32;
                class174.field1834.method10760(n, n2, class3482.field3754, class3482.field3753, n5, n6, n4, 256, class3482.field3755, class3482.field3752);
                int n7 = 0;
                while (true) {
                    int n8;
                    int n9;
                    if (n7 >= client.field756) {
                        n7 = 0;
                        while (true) {
                            int n10;
                            int n11;
                            Object object;
                            if (n7 >= 104) {
                                n7 = 0;
                                while (true) {
                                    Object object2;
                                    if (n7 >= class34.field189.field1331) {
                                        n7 = client.field673.field1406;
                                        object2 = client.field673.field1412;
                                        n9 = 0;
                                        while (true) {
                                            if (n9 >= n7) {
                                                if (client.field565 != 0 && client.field514 % 20 < 10) {
                                                    if (client.field565 == 1 && client.field530 >= 0 && client.field530 < class34.field189.field1330.length && (object = class34.field189.field1330[client.field530]) != null) {
                                                        n11 = ((class99)object).field1213 / 32 - class53.field339.vmethod9352() / 32;
                                                        n10 = ((class99)object).field1196 / 32 - class53.field339.vmethod9331() / 32;
                                                        class53.method1133(n, n2, n11, n10, class140.field1626[1], class3482);
                                                    }
                                                    if (client.field565 == 2) {
                                                        n9 = client.field525 * 4 - class34.field189.field1324 * 4 + 2 - class53.field339.vmethod9352() / 32;
                                                        n11 = client.field526 * 4 - class34.field189.field1325 * 4 + 2 - class53.field339.vmethod9331() / 32;
                                                        class53.method1133(n, n2, n9, n11, class140.field1626[1], class3482);
                                                    }
                                                    if (client.field565 == 10 && client.field524 >= 0 && client.field524 < class34.field189.field1329.length && (object = class34.field189.field1329[client.field524]) != null) {
                                                        n11 = ((class99)object).field1213 / 32 - class53.field339.vmethod9352() / 32;
                                                        n10 = ((class99)object).field1196 / 32 - class53.field339.vmethod9331() / 32;
                                                        class53.method1133(n, n2, n11, n10, class140.field1626[1], class3482);
                                                    }
                                                }
                                                if (client.field744 != 0) {
                                                    n9 = client.field744 * 4 + 2 - class53.field339.vmethod9352() / 32;
                                                    n11 = client.field745 * 4 + 2 - class53.field339.vmethod9331() / 32;
                                                    class526.method9936(n, n2, n9, n11, class140.field1626[0], class3482);
                                                }
                                                if (!class407.field4693.field1138) {
                                                    class566.method10677(class3482.field3754 / 2 + n - 1, class3482.field3753 / 2 + n2 - 1, 3, 3, 0xFFFFFF);
                                                }
                                                break block29;
                                            }
                                            class94 class942 = class34.field189.field1329[object2[n9]];
                                            if (class942 != null && class942.vmethod3039() && !class942.field1138 && class942 != class407.field4693) {
                                                n10 = class942.field1213 / 32 - class53.field339.vmethod9352() / 32;
                                                int n12 = class942.field1196 / 32 - class53.field339.vmethod9331() / 32;
                                                if (class942.method2697()) {
                                                    class526.method9936(n, n2, n10, n12, class464.field4957[3], class3482);
                                                } else if (class407.field4693.field1140 != 0 && class942.field1140 != 0 && class942.field1140 == class407.field4693.field1140) {
                                                    class526.method9936(n, n2, n10, n12, class464.field4957[4], class3482);
                                                } else if (class942.method2658()) {
                                                    class526.method9936(n, n2, n10, n12, class464.field4957[5], class3482);
                                                } else if (class942.method2663()) {
                                                    class526.method9936(n, n2, n10, n12, class464.field4957[6], class3482);
                                                } else {
                                                    class526.method9936(n, n2, n10, n12, class464.field4957[2], class3482);
                                                }
                                            }
                                            ++n9;
                                        }
                                    }
                                    object2 = class34.field189.field1330[class34.field189.field1332[n7]];
                                    if (object2 != null && ((class105)object2).vmethod3039()) {
                                        object = ((class105)object2).field1354;
                                        if (object != null && ((class247)object).field2663 != null) {
                                            object = ((class247)object).method5302();
                                        }
                                        if (object != null && ((class247)object).field2645 && ((class247)object).field2656) {
                                            n11 = ((class99)object2).field1213 / 32 - class53.field339.vmethod9352() / 32;
                                            n10 = ((class99)object2).field1196 / 32 - class53.field339.vmethod9331() / 32;
                                            class526.method9936(n, n2, n11, n10, class464.field4957[1], class3482);
                                        }
                                    }
                                    ++n7;
                                }
                            }
                            for (n8 = 0; n8 < 104; ++n8) {
                                object = class34.field189.field1327[class34.field189.field1321][n7][n8];
                                if (object == null) continue;
                                n11 = n7 * 4 + 2 - class53.field339.vmethod9352() / 32;
                                n10 = n8 * 4 + 2 - class53.field339.vmethod9331() / 32;
                                class526.method9936(n, n2, n11, n10, class464.field4957[0], class3482);
                            }
                            ++n7;
                        }
                    }
                    n8 = client.field658[n7] * 4 + 2 - class53.field339.vmethod9352() / 32;
                    n9 = client.field742[n7] * 4 + 2 - class53.field339.vmethod9331() / 32;
                    class526.method9936(n, n2, n8, n9, client.field719[n7], class3482);
                    ++n7;
                }
            }
            class566.method10625(n, n2, 0, class3482.field3755, class3482.field3752);
        }
        client.field732[n3] = true;
    }
}

