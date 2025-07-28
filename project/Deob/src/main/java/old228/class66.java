package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cl")
public class class66
implements Comparator {
    @ObfuscatedName(value="ay")
    boolean field467;

    class66() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpj;Lpj;I)I", garbageValue="1976626223")
    int method1262(class399 class3992, class399 class3993) {
        if (class3993.field4639 == class3992.field4639) {
            return 0;
        }
        if (this.field467) {
            if (client.field689 == class3992.field4639) {
                return -1;
            }
            if (class3993.field4639 == client.field689) {
                return 1;
            }
        }
        return class3992.field4639 < class3993.field4639 ? -1 : 1;
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    public int compare(Object object, Object object2) {
        return this.method1262((class399)object, (class399)object2);
    }

    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-1234038462")
    static int method1269(int n, class81 class812, boolean bl) {
        if (n != 3903) {
            if (n != 3904) {
                if (n != 3905) {
                    if (n != 3906) {
                        if (n != 3907) {
                            if (n != 3908) {
                                if (n != 3910) {
                                    if (n != 3911) {
                                        if (n != 3912) {
                                            if (n != 3913) {
                                                boolean bl2;
                                                if (n != 3914) {
                                                    boolean bl3;
                                                    if (n != 3915) {
                                                        boolean bl4;
                                                        if (n != 3916) {
                                                            boolean bl5;
                                                            if (n != 3917) {
                                                                boolean bl6;
                                                                if (n != 3918) {
                                                                    if (n != 3919) {
                                                                        if (n != 3920) {
                                                                            if (n != 3921) {
                                                                                if (n != 3922) {
                                                                                    if (n != 3923) {
                                                                                        if (n != 3924) {
                                                                                            if (n != 3925) {
                                                                                                if (n != 3926) {
                                                                                                    if (n != 3939) {
                                                                                                        return 2;
                                                                                                    }
                                                                                                    int n2 = class72.field865[--class63.field444];
                                                                                                    class72.field865[++class63.field444 - 1] = class191.method4462((int)n2).field2886 ? 1 : 0;
                                                                                                    return 1;
                                                                                                }
                                                                                                int n3 = class72.field865[--class63.field444];
                                                                                                class399 class3992 = (class399)class328.field3597.field4623.get(n3);
                                                                                                class72.field865[++class63.field444 - 1] = class3992.field4637.field4644;
                                                                                                return 1;
                                                                                            }
                                                                                            int n4 = class72.field865[--class63.field444];
                                                                                            class399 class3993 = (class399)class328.field3597.field4623.get(n4);
                                                                                            class72.field865[++class63.field444 - 1] = class3993.field4637.field4645;
                                                                                            return 1;
                                                                                        }
                                                                                        int n5 = class72.field865[--class63.field444];
                                                                                        class399 class3994 = (class399)class328.field3597.field4623.get(n5);
                                                                                        class72.field865[++class63.field444 - 1] = class3994.field4637.field4646;
                                                                                        return 1;
                                                                                    }
                                                                                    int n6 = class72.field865[--class63.field444];
                                                                                    class399 class3995 = (class399)class328.field3597.field4623.get(n6);
                                                                                    long l = class37.method724() - class361.field3909 - class3995.field4638;
                                                                                    int n7 = (int)(l / 3600000L);
                                                                                    int n8 = (int)((l - (long)(n7 * 3600000)) / 60000L);
                                                                                    int n9 = (int)((l - (long)(n7 * 3600000) - (long)(n8 * 60000)) / 1000L);
                                                                                    String string = n7 + ":" + n8 / 10 + n8 % 10 + ":" + n9 / 10 + n9 % 10;
                                                                                    class72.field855[++class104.field1343 - 1] = string;
                                                                                    return 1;
                                                                                }
                                                                                int n10 = class72.field865[--class63.field444];
                                                                                class399 class3996 = (class399)class328.field3597.field4623.get(n10);
                                                                                class72.field855[++class104.field1343 - 1] = class3996.method7905();
                                                                                return 1;
                                                                            }
                                                                            int n11 = class72.field865[--class63.field444];
                                                                            class399 class3997 = (class399)class328.field3597.field4623.get(n11);
                                                                            class72.field855[++class104.field1343 - 1] = class3997.method7907();
                                                                            return 1;
                                                                        }
                                                                        int n12 = class72.field865[--class63.field444];
                                                                        class399 class3998 = (class399)class328.field3597.field4623.get(n12);
                                                                        class72.field865[++class63.field444 - 1] = class3998.field4639;
                                                                        return 1;
                                                                    }
                                                                    class72.field865[++class63.field444 - 1] = class328.field3597 == null ? 0 : class328.field3597.field4623.size();
                                                                    return 1;
                                                                }
                                                                boolean bl7 = bl6 = class72.field865[--class63.field444] == 1;
                                                                if (class328.field3597 != null) {
                                                                    class328.field3597.method7858(class393.field4627, bl6);
                                                                }
                                                                return 1;
                                                            }
                                                            boolean bl8 = bl5 = class72.field865[--class63.field444] == 1;
                                                            if (class328.field3597 != null) {
                                                                class328.field3597.method7858(class393.field4625, bl5);
                                                            }
                                                            return 1;
                                                        }
                                                        boolean bl9 = class72.field865[class63.field444 -= 2] == 1;
                                                        boolean bl10 = bl4 = class72.field865[class63.field444 + 1] == 1;
                                                        if (class328.field3597 != null) {
                                                            client.field786.field467 = bl4;
                                                            class328.field3597.method7858(client.field786, bl9);
                                                        }
                                                        return 1;
                                                    }
                                                    boolean bl11 = bl3 = class72.field865[--class63.field444] == 1;
                                                    if (class328.field3597 != null) {
                                                        class328.field3597.method7858(class393.field4624, bl3);
                                                    }
                                                    return 1;
                                                }
                                                boolean bl12 = bl2 = class72.field865[--class63.field444] == 1;
                                                if (class328.field3597 != null) {
                                                    class328.field3597.method7858(class393.field4626, bl2);
                                                }
                                                return 1;
                                            }
                                            int n13 = class72.field865[--class63.field444];
                                            int n14 = client.field785[n13].method7916();
                                            class72.field865[++class63.field444 - 1] = n14 == 1 ? 1 : 0;
                                            return 1;
                                        }
                                        int n15 = class72.field865[--class63.field444];
                                        int n16 = client.field785[n15].method7916();
                                        class72.field865[++class63.field444 - 1] = n16 == 5 ? 1 : 0;
                                        return 1;
                                    }
                                    int n17 = class72.field865[--class63.field444];
                                    int n18 = client.field785[n17].method7916();
                                    class72.field865[++class63.field444 - 1] = n18 == 2 ? 1 : 0;
                                    return 1;
                                }
                                int n19 = class72.field865[--class63.field444];
                                int n20 = client.field785[n19].method7916();
                                class72.field865[++class63.field444 - 1] = n20 == 0 ? 1 : 0;
                                return 1;
                            }
                            int n21 = class72.field865[--class63.field444];
                            class72.field865[++class63.field444 - 1] = client.field785[n21].field4648;
                            return 1;
                        }
                        int n22 = class72.field865[--class63.field444];
                        class72.field865[++class63.field444 - 1] = client.field785[n22].field4647;
                        return 1;
                    }
                    int n23 = class72.field865[--class63.field444];
                    class72.field865[++class63.field444 - 1] = client.field785[n23].field4646;
                    return 1;
                }
                int n24 = class72.field865[--class63.field444];
                class72.field865[++class63.field444 - 1] = client.field785[n24].field4645;
                return 1;
            }
            int n25 = class72.field865[--class63.field444];
            class72.field865[++class63.field444 - 1] = client.field785[n25].field4644;
            return 1;
        }
        int n26 = class72.field865[--class63.field444];
        class72.field865[++class63.field444 - 1] = client.field785[n26].method7928();
        return 1;
    }
}

