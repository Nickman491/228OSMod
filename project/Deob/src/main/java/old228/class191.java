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

@ObfuscatedName(value="hi")
public class class191 {
    @ObfuscatedName(value="fe")
    @ObfuscatedSignature(descriptor="Lok;")
    static class388 field2120;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=508131641)
    int field2119;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1031535199)
    int field2118;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1338950567)
    int field2117;

    class191() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)Lqa;", garbageValue="-108")
    public static class427 method4465() {
        class427[] class427Array = class427.field4755;
        synchronized (class427.field4755) {
            if (class427.field4752 == 0) {
                // ** MonitorExit[var0] (shouldn't be in output)
                return new class427();
            }
            class427.field4755[--class427.field4752].method8345();
            // ** MonitorExit[var0] (shouldn't be in output)
            return class427.field4755[class427.field4752];
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IS)Lkm;", garbageValue="-6432")
    public static ItemDef method4462(int n) {
        ItemDef class2632 = (ItemDef) ItemDef.field2889.method6578(n);
        if (class2632 != null) {
            return class2632;
        }
        byte[] byArray = class240.field2581.method7790(10, n);
        class2632 = new ItemDef();
        class2632.field2850 = n;
        if (byArray != null) {
            class2632.method5591(new class556(byArray));
        }
        class2632.method5561();
        if (class2632.field2901 != -1) {
            class2632.method5564(class191.method4462(class2632.field2901), class191.method4462(class2632.field2888));
        }
        if (class2632.field2900 != -1) {
            class2632.method5626(class191.method4462(class2632.field2900), class191.method4462(class2632.field2899));
        }
        if (class2632.field2902 != -1) {
            class2632.method5641(class191.method4462(class2632.field2902), class191.method4462(class2632.field2894));
        }
        if (!class307.field3282 && class2632.field2869) {
            if (class2632.field2901 == -1 && class2632.field2900 == -1 && class2632.field2902 == -1) {
                class2632.field2848 = class2632.field2848 + " (Members)";
            }
            class2632.field2853 = "Login to a members' server to use this object.";
            class2632.field2886 = false;
            int n2 = 0;
            block0: while (true) {
                if (n2 >= class2632.field2870.length) {
                    n2 = 0;
                    while (true) {
                        if (n2 >= class2632.field2871.length) {
                            class2632.field2842 = -2;
                            class2632.field2895 = 0;
                            if (class2632.field2897 == null) break block0;
                            n2 = 0;
                            class514 class5142 = class2632.field2897.method9978();
                            while (true) {
                                if (class5142 == null) {
                                    if (n2 != 0) break block0;
                                    class2632.field2897 = null;
                                    break block0;
                                }
                                class258 class2582 = class249.method5354((int)class5142.field5174);
                                if (class2582.field2736) {
                                    class5142.method9623();
                                } else {
                                    n2 = 1;
                                }
                                class5142 = class2632.field2897.method9975();
                            }
                        }
                        if (n2 != 4) {
                            if (class2632.field2872 != null) {
                                class2632.field2872[n2] = null;
                            }
                            class2632.field2871[n2] = null;
                        }
                        ++n2;
                    }
                }
                class2632.field2870[n2] = null;
                ++n2;
            }
        }
        ItemDef.field2889.method6590(class2632, n);
        return class2632;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIII)I", garbageValue="303252887")
    public static int method4463(int n, int n2, int n3) {
        int n4 = ItemDef.method5643(n3 - n2 + 1);
        return n &= ~(n4 <<= n2);
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;I)I", garbageValue="-1714037177")
    public static int method4466(CharSequence charSequence) {
        int n = charSequence.length();
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            n2 = (n2 << 5) - n2 + class232.method5132(charSequence.charAt(i));
        }
        return n2;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="688939989")
    static int method4464(int n, class81 class812, boolean bl) {
        class361 class3612;
        if (n < 2000) {
            class3612 = bl ? class134.field1564 : class9.field45;
        } else {
            n -= 1000;
            class3612 = class170.field1807.method7031(class72.field865[--class63.field444]);
        }
        class122.method3325(class3612);
        if (n != 1200 && n != 1205 && n != 1212) {
            if (n != 1201) {
                if (n != 1202) {
                    if (n != 1207) {
                        if (n != 1208) {
                            if (n != 1209) {
                                if (n != 1210) {
                                    return 2;
                                }
                                int n2 = class72.field865[--class63.field444];
                                if (class3612.field3924 != null) {
                                    class3612.field3924.method7062(class407.field4693.field1121.field3813, n2);
                                    return 1;
                                }
                                throw new RuntimeException("");
                            }
                            int n3 = class72.field865[class63.field444 -= 2];
                            int n4 = class72.field865[class63.field444 + 1];
                            if (class3612.field3924 != null) {
                                class3612.field3924.method7064(n3, n4);
                                return 1;
                            }
                            throw new RuntimeException("");
                        }
                        int n5 = class72.field865[--class63.field444];
                        if (class3612.field3924 != null) {
                            class3612.field3924.method7080(n5);
                            return 1;
                        }
                        throw new RuntimeException("");
                    }
                    boolean bl2 = class72.field865[--class63.field444] == 1;
                    class3612.method7542(class407.field4693.field1121, bl2);
                    return 1;
                }
                class3612.field3915 = 3;
                class3612.field3916 = class407.field4693.field1121.method7060();
                return 1;
            }
            class3612.field3915 = 2;
            class3612.field3916 = class72.field865[--class63.field444];
            return 1;
        }
        int n6 = class72.field865[class63.field444 -= 2];
        int n7 = class72.field865[class63.field444 + 1];
        class3612.field4010 = n6;
        class3612.field4011 = n7;
        ItemDef class2632 = class191.method4462(n6);
        class3612.field3923 = class2632.field2859;
        class3612.field3994 = class2632.field2860;
        class3612.field3925 = class2632.field2861;
        class3612.field3955 = class2632.field2890;
        class3612.field3922 = class2632.field2863;
        class3612.field4020 = class2632.field2858;
        class3612.field3932 = n == 1205 ? 0 : (n == 1212 | 1 == class2632.field2844 ? 1 : 2);
        if (class3612.field3927 > 0) {
            class3612.field4020 = class3612.field4020 * 32 / class3612.field3927;
        } else if (class3612.field3929 > 0) {
            class3612.field4020 = class3612.field4020 * 32 / class3612.field3929;
        }
        return 1;
    }
}

