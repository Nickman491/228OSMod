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

@ObfuscatedName(value="ik")
public final class class209 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-52846939)
    int field2344;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-2138523021)
    int field2336;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=635722313)
    int field2337;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-492530409)
    int field2338;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lhs;")
    public class190 field2339;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-62300097)
    int field2351;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=711001867)
    int field2341;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1114535483)
    int field2345;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1257097225)
    int field2343;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=18141731)
    int field2340;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-1966644445)
    int field2335;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-900462987)
    int field2342;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(longValue=8459724622587672005L)
    public long field2347 = 0L;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=1945860265)
    int field2348 = 0;

    class209() {
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(ILdm;ZB)I", garbageValue="7")
    static int method4821(int n, class81 class812, boolean bl) {
        if (n != 100) {
            if (n != 101) {
                if (n != 102) {
                    if (n != 105) {
                        int n2;
                        class361 class3612;
                        if (n != 200) {
                            if (n != 201) {
                                return 2;
                            }
                            class361 class3613 = class170.field1807.method7031(class72.field865[--class63.field444]);
                            if (class3613 == null) {
                                class72.field865[++class63.field444 - 1] = 0;
                            } else {
                                class72.field865[++class63.field444 - 1] = 1;
                                if (bl) {
                                    class134.field1564 = class3613;
                                } else {
                                    class9.field45 = class3613;
                                }
                            }
                            return 1;
                        }
                        int n3 = class72.field865[class63.field444 -= 2];
                        if ((class3612 = class170.field1807.method7023(n3, n2 = class72.field865[class63.field444 + 1])) != null && n2 != -1) {
                            class72.field865[++class63.field444 - 1] = 1;
                            if (bl) {
                                class134.field1564 = class3612;
                            } else {
                                class9.field45 = class3612;
                            }
                        } else {
                            class72.field865[++class63.field444 - 1] = 0;
                        }
                        return 1;
                    }
                    int n4 = class72.field865[class63.field444 -= 2];
                    int n5 = class72.field865[class63.field444 + 1];
                    class361 class3614 = class170.field1807.method7031(n4);
                    class361 class3615 = class170.field1807.method7023(n4, n5);
                    if (class3614 == null) {
                        throw new RuntimeException("");
                    }
                    if (n5 < 0) {
                        throw new RuntimeException("");
                    }
                    if (class3615 == null) {
                        throw new RuntimeException("");
                    }
                    if (class3614.field4014 == null) {
                        throw new RuntimeException("");
                    }
                    int n6 = class3614.field4014.length;
                    class361[] class361Array = new class361[n6 + 1];
                    System.arraycopy(class3614.field4014, 0, class361Array, 0, class3614.field4014.length);
                    class3614.field4014 = class361Array;
                    class361 class3616 = new class361(class3615, n6);
                    if (class3615.field3873 == 12) {
                        class106.method3077(class3616);
                    }
                    class3614.field4014[n6] = class3616;
                    if (bl) {
                        class134.field1564 = class3616;
                    } else {
                        class9.field45 = class3616;
                    }
                    class122.method3325(class3614);
                    return 1;
                }
                class361 class3617 = class170.field1807.method7031(class72.field865[--class63.field444]);
                class3617.field4014 = null;
                class122.method3325(class3617);
                return 1;
            }
            class361 class3618 = bl ? class134.field1564 : class9.field45;
            class361 class3619 = class170.field1807.method7031(class3618.field3910);
            class3619.field4014[class3618.field3863] = null;
            class122.method3325(class3619);
            return 1;
        }
        int n7 = class72.field865[class63.field444 -= 3];
        int n8 = class72.field865[class63.field444 + 1];
        int n9 = class72.field865[class63.field444 + 2];
        if (n8 != 0) {
            Object object;
            class361 class36110 = class170.field1807.method7031(n7);
            if (class36110.field4014 == null) {
                class36110.field4014 = new class361[n9 + 1];
            }
            if (class36110.field4014.length <= n9) {
                object = new class361[n9 + 1];
                for (int i = 0; i < class36110.field4014.length; ++i) {
                    object[i] = class36110.field4014[i];
                }
                class36110.field4014 = object;
            }
            if (n9 > 0 && class36110.field4014[n9 - 1] == null) {
                throw new RuntimeException("" + (n9 - 1));
            }
            object = new class361();
            object.field3873 = n8;
            object.field4026 = object.field3910 = class36110.field3910;
            object.field3863 = n9;
            object.field3991 = true;
            if (n8 == 12) {
                class106.method3077((class361)object);
            }
            class36110.field4014[n9] = object;
            if (bl) {
                class134.field1564 = object;
            } else {
                class9.field45 = object;
            }
            class122.method3325(class36110);
            return 1;
        }
        throw new RuntimeException();
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="38006974")
    static int method4823(int n, class81 class812, boolean bl) {
        class361 class3612;
        class361 class3613 = class3612 = bl ? class134.field1564 : class9.field45;
        if (n != 1500) {
            if (n != 1501) {
                if (n != 1502) {
                    if (n != 1503) {
                        if (n != 1504) {
                            if (n != 1505) {
                                return 2;
                            }
                            class72.field865[++class63.field444 - 1] = class3612.field4026;
                            return 1;
                        }
                        class72.field865[++class63.field444 - 1] = class3612.field3891 ? 1 : 0;
                        return 1;
                    }
                    class72.field865[++class63.field444 - 1] = class3612.field3887 * -1528330031;
                    return 1;
                }
                class72.field865[++class63.field444 - 1] = class3612.field3886;
                return 1;
            }
            class72.field865[++class63.field444 - 1] = class3612.field3885;
            return 1;
        }
        class72.field865[++class63.field444 - 1] = class3612.field3884;
        return 1;
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="0")
    static void method4822(int n) {
        class114.method3212(14);
        class78.field932 = n;
    }
}

