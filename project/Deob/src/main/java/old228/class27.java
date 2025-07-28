package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bh")
public class class27 {
    @ObfuscatedName(value="uz")
    @ObfuscatedGetter(intValue=393762101)
    static int field118;
    @ObfuscatedName(value="ae")
    int[] field116 = new int[112];
    @ObfuscatedName(value="ax")
    int[] field117 = new int[192];

    public class27() {
        Arrays.fill(this.field116, 3);
        Arrays.fill(this.field117, 3);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="862757942")
    public void method408(int n, int n2) {
        if (this.method414(n) && this.method416(n2)) {
            this.field116[n] = n2;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(CII)V", garbageValue="-1952351037")
    public void method407(char c, int n) {
        if (this.method415(c) && this.method416(n)) {
            this.field117[c] = n;
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="693442515")
    public int method449(int n) {
        if (!this.method414(n)) {
            return 0;
        }
        return this.field116[n];
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(CI)I", garbageValue="-1717637674")
    public int method409(char c) {
        if (!this.method415(c)) {
            return 0;
        }
        return this.field117[c];
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="73")
    public boolean method406(int n) {
        return this.method414(n) && (this.field116[n] == 1 || this.field116[n] == 3);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(CI)Z", garbageValue="-1204283468")
    public boolean method411(char c) {
        return this.method415(c) && (this.field117[c] == 1 || this.field117[c] == 3);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-1272866882")
    public boolean method412(int n) {
        return this.method414(n) && (this.field116[n] == 2 || this.field116[n] == 3);
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(CI)Z", garbageValue="73484292")
    public boolean method413(char c) {
        return this.method415(c) && (this.field117[c] == 2 || this.field117[c] == 3);
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-639505872")
    boolean method414(int n) {
        if (n >= 0 && n < 112) {
            return true;
        }
        System.out.println("Invalid keycode: " + n);
        return false;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(CI)Z", garbageValue="1150164658")
    boolean method415(char c) {
        if (c >= '\u0000' && c < '\u00c0') {
            return true;
        }
        System.out.println("Invalid keychar: " + c);
        return false;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1650627396")
    boolean method416(int n) {
        if (n >= 0 && n < 4) {
            return true;
        }
        System.out.println("Invalid mode: " + n);
        return false;
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-1394724390")
    static int method426(int n, class81 class812, boolean bl) {
        class361 class3612 = class170.field1807.method7031(class72.field865[--class63.field444]);
        if (n != 2600) {
            if (n != 2601) {
                if (n != 2602) {
                    if (n != 2603) {
                        if (n != 2604) {
                            if (n != 2605) {
                                if (n != 2606) {
                                    if (n != 2607) {
                                        if (n != 2608) {
                                            if (n != 2609) {
                                                if (n != 2610) {
                                                    if (n != 2611) {
                                                        if (n != 2612) {
                                                            if (n != 2613) {
                                                                if (n != 2614) {
                                                                    Object object;
                                                                    if (n == 2617) {
                                                                        object = class3612.method7445();
                                                                        int n2 = class72.field865[++class63.field444 - 1] = object != null ? ((class353)object).field3783 : 0;
                                                                    }
                                                                    if (n != 2618) {
                                                                        if (n != 2619) {
                                                                            if (n != 2620) {
                                                                                if (n != 2621) {
                                                                                    if (n != 2622) {
                                                                                        if (n != 2623) {
                                                                                            if (n != 2624) {
                                                                                                if (n != 2625) {
                                                                                                    if (n != 2626) {
                                                                                                        if (n != 2627) {
                                                                                                            if (n != 2628) {
                                                                                                                if (n != 2629) {
                                                                                                                    if (n != 2630) {
                                                                                                                        if (n != 2631) {
                                                                                                                            if (n != 2632) {
                                                                                                                                if (n != 2633) {
                                                                                                                                    if (n != 2634) {
                                                                                                                                        return 2;
                                                                                                                                    }
                                                                                                                                    object = class3612.method7535();
                                                                                                                                    class72.field865[class63.field444 - 1] = object != null ? ((class27)object).method409((char)class72.field865[class63.field444 - 1]) : 0;
                                                                                                                                    return 1;
                                                                                                                                }
                                                                                                                                object = class3612.method7535();
                                                                                                                                class72.field865[class63.field444 - 1] = object != null ? ((class27)object).method449(class72.field865[class63.field444 - 1]) : 0;
                                                                                                                                return 1;
                                                                                                                            }
                                                                                                                            object = class3612.method7444();
                                                                                                                            class72.field865[++class63.field444 - 1] = object != null ? ((class359)object).method7371() : 0;
                                                                                                                            return 1;
                                                                                                                        }
                                                                                                                        object = class3612.method7444();
                                                                                                                        class72.field865[++class63.field444 - 1] = object != null ? ((class359)object).method7193() : 0;
                                                                                                                        return 1;
                                                                                                                    }
                                                                                                                    object = class3612.method7444();
                                                                                                                    class72.field865[++class63.field444 - 1] = object != null ? ((class359)object).method7191() : 0;
                                                                                                                    return 1;
                                                                                                                }
                                                                                                                object = class3612.method7444();
                                                                                                                class72.field865[++class63.field444 - 1] = object != null ? ((class359)object).method7157() : 0;
                                                                                                                return 1;
                                                                                                            }
                                                                                                            object = class3612.method7444();
                                                                                                            class72.field865[++class63.field444 - 1] = object != null ? ((class359)object).method7259() : 0;
                                                                                                            return 1;
                                                                                                        }
                                                                                                        object = class3612.method7444();
                                                                                                        int n3 = object != null ? ((class359)object).method7184() : 0;
                                                                                                        int n4 = object != null ? ((class359)object).method7259() : 0;
                                                                                                        class72.field865[++class63.field444 - 1] = Math.min(n3, n4);
                                                                                                        class72.field865[++class63.field444 - 1] = Math.max(n3, n4);
                                                                                                        return 1;
                                                                                                    }
                                                                                                    object = class3612.method7444();
                                                                                                    class72.field855[++class104.field1343 - 1] = object != null ? ((class359)object).method7179().method8809() : "";
                                                                                                    return 1;
                                                                                                }
                                                                                                object = class3612.method7444();
                                                                                                class72.field865[++class63.field444 - 1] = object != null && ((class359)object).method7181() ? 1 : 0;
                                                                                                return 1;
                                                                                            }
                                                                                            object = class3612.method7444();
                                                                                            class72.field865[++class63.field444 - 1] = object != null && ((class359)object).method7221() ? 1 : 0;
                                                                                            return 1;
                                                                                        }
                                                                                        object = class3612.method7444();
                                                                                        class72.field865[++class63.field444 - 1] = object != null ? ((class359)object).method7190() : 0;
                                                                                        return 1;
                                                                                    }
                                                                                    object = class3612.method7444();
                                                                                    class72.field865[++class63.field444 - 1] = object != null ? ((class359)object).method7189() : 0;
                                                                                    return 1;
                                                                                }
                                                                                object = class3612.method7444();
                                                                                class72.field865[++class63.field444 - 1] = object != null ? ((class359)object).method7188() : 0;
                                                                                return 1;
                                                                            }
                                                                            object = class3612.method7445();
                                                                            class72.field865[++class63.field444 - 1] = object != null ? ((class353)object).field3782 : 0;
                                                                            return 1;
                                                                        }
                                                                        object = class3612.method7444();
                                                                        class72.field855[++class104.field1343 - 1] = object != null ? ((class359)object).method7363().method8533() : "";
                                                                        return 1;
                                                                    }
                                                                    object = class3612.method7445();
                                                                    class72.field865[++class63.field444 - 1] = object != null ? ((class353)object).field3781 : 0;
                                                                    return 1;
                                                                }
                                                                class72.field865[++class63.field444 - 1] = class3612.field3931 ? 1 : 0;
                                                                return 1;
                                                            }
                                                            class72.field865[++class63.field444 - 1] = class3612.field3905.vmethod10703();
                                                            return 1;
                                                        }
                                                        class72.field865[++class63.field444 - 1] = class3612.field3897;
                                                        return 1;
                                                    }
                                                    class72.field865[++class63.field444 - 1] = class3612.field3896;
                                                    return 1;
                                                }
                                                class72.field865[++class63.field444 - 1] = class3612.field3938;
                                                return 1;
                                            }
                                            class72.field865[++class63.field444 - 1] = class3612.field4015;
                                            return 1;
                                        }
                                        class72.field865[++class63.field444 - 1] = class3612.field3994;
                                        return 1;
                                    }
                                    class72.field865[++class63.field444 - 1] = class3612.field3925;
                                    return 1;
                                }
                                class72.field865[++class63.field444 - 1] = class3612.field3923;
                                return 1;
                            }
                            class72.field865[++class63.field444 - 1] = class3612.field4020;
                            return 1;
                        }
                        class72.field865[++class63.field444 - 1] = class3612.field3895;
                        return 1;
                    }
                    class72.field865[++class63.field444 - 1] = class3612.field3894;
                    return 1;
                }
                class72.field855[++class104.field1343 - 1] = class3612.field3911;
                return 1;
            }
            class72.field865[++class63.field444 - 1] = class3612.field3899;
            return 1;
        }
        class72.field865[++class63.field444 - 1] = class3612.field3987;
        return 1;
    }
}

