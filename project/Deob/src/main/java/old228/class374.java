package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="or")
public class class374 {
    @ObfuscatedName(value="jb")
    static int[][] field4114;

    static {
        Math.sqrt(8192.0);
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="-1163631135")
    static final int method7622(int n, int n2) {
        int n3 = class42.method804(n - 1, n2 - 1) + class42.method804(n + 1, n2 - 1) + class42.method804(n - 1, 1 + n2) + class42.method804(n + 1, n2 + 1);
        int n4 = class42.method804(n - 1, n2) + class42.method804(n + 1, n2) + class42.method804(n, n2 - 1) + class42.method804(n, n2 + 1);
        int n5 = class42.method804(n, n2);
        return n3 / 16 + n4 / 8 + n5 / 4;
    }

    @ObfuscatedName(value="bf")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-574847449")
    static int method7621(int n, class81 class812, boolean bl) {
        if (n != 4200) {
            if (n != 4201) {
                if (n != 4202) {
                    if (n != 4222) {
                        if (n != 4203) {
                            if (n != 4204) {
                                if (n != 4205) {
                                    if (n != 4206) {
                                        if (n != 4207) {
                                            if (n != 4208) {
                                                if (n != 4209) {
                                                    int n2;
                                                    if (n != 4210) {
                                                        if (n != 4211) {
                                                            if (n != 4212) {
                                                                int n3;
                                                                int n4;
                                                                if (n != 4213) {
                                                                    if (n != 4214) {
                                                                        if (n != 4215) {
                                                                            if (n != 4216) {
                                                                                if (n != 4217) {
                                                                                    if (n != 4218) {
                                                                                        return 2;
                                                                                    }
                                                                                    int n5 = class72.field865[--class63.field444];
                                                                                    class72.field855[++class104.field1343 - 1] = class191.method4462((int)n5).field2853;
                                                                                    return 1;
                                                                                }
                                                                                int n6 = class72.field865[--class63.field444];
                                                                                ItemDef class2632 = class191.method4462(n6);
                                                                                class72.field865[++class63.field444 - 1] = class2632.field2896;
                                                                                return 1;
                                                                            }
                                                                            int n7 = class72.field865[--class63.field444];
                                                                            class72.field865[++class63.field444 - 1] = class191.method4462((int)n7).field2878;
                                                                            return 1;
                                                                        }
                                                                        int n8 = class72.field865[--class63.field444];
                                                                        class72.field865[++class63.field444 - 1] = class191.method4462((int)n8).field2867;
                                                                        return 1;
                                                                    }
                                                                    int n9 = class72.field865[--class63.field444];
                                                                    class72.field865[++class63.field444 - 1] = class191.method4462((int)n9).field2866;
                                                                    return 1;
                                                                }
                                                                class72.field865[++class63.field444 - 1] = (n4 = class191.method4462(n3 = class72.field865[--class63.field444]).method5609()) != -1 ? n4 + 1 : n4;
                                                                return 1;
                                                            }
                                                            class271.field3007 = 0;
                                                            return 1;
                                                        }
                                                        class72.field865[++class63.field444 - 1] = class301.field3257 != null && class271.field3007 < class20.field92 ? class301.field3257[++class271.field3007 - 1] & 0xFFFF : -1;
                                                        return 1;
                                                    }
                                                    String string = class72.field855[--class104.field1343];
                                                    class360.method7404(string, (n2 = class72.field865[--class63.field444]) == 1);
                                                    class72.field865[++class63.field444 - 1] = class20.field92;
                                                    return 1;
                                                }
                                                int n10 = class72.field865[--class63.field444];
                                                ItemDef class2633 = class191.method4462(n10);
                                                class72.field865[++class63.field444 - 1] = class2633.field2902 >= 0 && class2633.field2894 >= 0 ? class2633.field2894 : n10;
                                                return 1;
                                            }
                                            int n11 = class72.field865[--class63.field444];
                                            ItemDef class2634 = class191.method4462(n11);
                                            class72.field865[++class63.field444 - 1] = class2634.field2902 == -1 && class2634.field2894 >= 0 ? class2634.field2894 : n11;
                                            return 1;
                                        }
                                        int n12 = class72.field865[--class63.field444];
                                        class72.field865[++class63.field444 - 1] = class191.method4462((int)n12).field2869 ? 1 : 0;
                                        return 1;
                                    }
                                    int n13 = class72.field865[--class63.field444];
                                    ItemDef class2635 = class191.method4462(n13);
                                    class72.field865[++class63.field444 - 1] = class2635.field2901 >= 0 && class2635.field2888 >= 0 ? class2635.field2888 : n13;
                                    return 1;
                                }
                                int n14 = class72.field865[--class63.field444];
                                ItemDef class2636 = class191.method4462(n14);
                                class72.field865[++class63.field444 - 1] = class2636.field2901 == -1 && class2636.field2888 >= 0 ? class2636.field2888 : n14;
                                return 1;
                            }
                            int n15 = class72.field865[--class63.field444];
                            class72.field865[++class63.field444 - 1] = class191.method4462((int)n15).field2844 == 1 ? 1 : 0;
                            return 1;
                        }
                        int n16 = class72.field865[--class63.field444];
                        class72.field865[++class63.field444 - 1] = class191.method4462((int)n16).field2865;
                        return 1;
                    }
                    int n17 = class72.field865[class63.field444 -= 3];
                    int n18 = class72.field865[class63.field444 + 1];
                    int n19 = class72.field865[class63.field444 + 2];
                    ItemDef class2637 = class191.method4462(n17);
                    String string = null;
                    if (n18 >= 1 && n18 <= 5 && class2637.field2871[n18 - 1] != null && class2637.field2872 != null && class2637.field2872[n18 - 1] != null && n19 >= 1 && n19 <= class2637.field2872[n18 - 1].length) {
                        string = class2637.field2872[n18 - 1][n19 - 1];
                    }
                    class72.field855[++class104.field1343 - 1] = string != null ? string : "";
                    return 1;
                }
                int n20 = class72.field865[class63.field444 -= 2];
                int n21 = class72.field865[class63.field444 + 1];
                ItemDef class2638 = class191.method4462(n20);
                class72.field855[++class104.field1343 - 1] = n21 >= 1 && n21 <= 5 && class2638.field2871[n21 - 1] != null ? class2638.field2871[n21 - 1] : "";
                return 1;
            }
            int n22 = class72.field865[class63.field444 -= 2];
            int n23 = class72.field865[class63.field444 + 1];
            ItemDef class2639 = class191.method4462(n22);
            class72.field855[++class104.field1343 - 1] = n23 >= 1 && n23 <= 5 && class2639.field2870[n23 - 1] != null ? class2639.field2870[n23 - 1] : "";
            return 1;
        }
        int n24 = class72.field865[--class63.field444];
        class72.field855[++class104.field1343 - 1] = class191.method4462((int)n24).field2848;
        return 1;
    }

    @ObfuscatedName(value="hk")
    @ObfuscatedSignature(descriptor="(IIIB)V", garbageValue="-38")
    static final void method7623(int n, int n2, int n3) {
        if (class478.field5017 < n && (class478.field5017 = (n - class478.field5017) * class544.field5398 / 1000 + class478.field5017 + class292.field3187) > n) {
            class478.field5017 = n;
        }
        if (class478.field5017 > n && (class478.field5017 -= (class478.field5017 - n) * class544.field5398 / 1000 + class292.field3187) < n) {
            class478.field5017 = n;
        }
        if (class64.field459 < n2 && (class64.field459 = (n2 - class64.field459) * class544.field5398 / 1000 + class64.field459 + class292.field3187) > n2) {
            class64.field459 = n2;
        }
        if (class64.field459 > n2 && (class64.field459 -= (class64.field459 - n2) * class544.field5398 / 1000 + class292.field3187) < n2) {
            class64.field459 = n2;
        }
        if (class31.field140 < n3 && (class31.field140 = (n3 - class31.field140) * class544.field5398 / 1000 + class31.field140 + class292.field3187) > n3) {
            class31.field140 = n3;
        }
        if (class31.field140 > n3 && (class31.field140 -= (class31.field140 - n3) * class544.field5398 / 1000 + class292.field3187) < n3) {
            class31.field140 = n3;
        }
    }
}

