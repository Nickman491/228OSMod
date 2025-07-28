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

@ObfuscatedName(value="eh")
public class class127
extends class475 {
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-2006159767)
    static int field1516;
    @ObfuscatedName(value="ay")
    final boolean field1519;

    public class127(boolean bl) {
        this.field1519 = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lsu;Lsu;I)I", garbageValue="-1639266255")
    int method3356(class478 class4782, class478 class4783) {
        if (client.field689 == class4782.field5020 && class4783.field5020 == client.field689) {
            return this.field1519 ? class4782.field5018 - class4783.field5018 : class4783.field5018 - class4782.field5018;
        }
        return this.method9184(class4782, class4783);
    }

    public int compare(Object object, Object object2) {
        return this.method3356((class478)object, (class478)object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-1749241599")
    static int method3361(int n, class81 class812, boolean bl) {
        class361 class3612;
        if (n < 2000) {
            class3612 = bl ? class134.field1564 : class9.field45;
        } else {
            n -= 1000;
            class3612 = class170.field1807.method7031(class72.field865[--class63.field444]);
        }
        String string = class72.field855[--class104.field1343];
        int[] nArray = null;
        if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
            int n2;
            if ((n2 = class72.field865[--class63.field444]) > 0) {
                nArray = new int[n2];
                while (n2-- > 0) {
                    nArray[n2] = class72.field865[--class63.field444];
                }
            }
            string = string.substring(0, string.length() - 1);
        }
        Object[] objectArray = new Object[string.length() + 1];
        int n3 = objectArray.length - 1;
        while (true) {
            if (n3 < 1) {
                if ((n3 = class72.field865[--class63.field444]) != -1) {
                    objectArray[0] = new Integer(n3);
                } else {
                    objectArray = null;
                }
                if (n == 1400) {
                    class3612.field3966 = objectArray;
                } else if (n == 1401) {
                    class3612.field3883 = objectArray;
                } else if (n == 1402) {
                    class3612.field3968 = objectArray;
                } else if (n == 1403) {
                    class3612.field3870 = objectArray;
                } else if (n == 1404) {
                    class3612.field3972 = objectArray;
                } else if (n == 1405) {
                    class3612.field3973 = objectArray;
                } else if (n == 1406) {
                    class3612.field3976 = objectArray;
                } else if (n != 1407) {
                    if (n == 1408) {
                        class3612.field3983 = objectArray;
                    } else if (n == 1409) {
                        class3612.field3984 = objectArray;
                    } else if (n == 1410) {
                        class3612.field3974 = objectArray;
                    } else if (n == 1411) {
                        class3612.field3944 = objectArray;
                    } else if (n == 1412) {
                        class3612.field3971 = objectArray;
                    } else if (n != 1414) {
                        if (n != 1415) {
                            if (n == 1416) {
                                class3612.field3975 = objectArray;
                            } else if (n == 1417) {
                                class3612.field3986 = objectArray;
                            } else if (n == 1418) {
                                class3612.field3995 = objectArray;
                            } else if (n == 1419) {
                                class3612.field3969 = objectArray;
                            } else if (n == 1420) {
                                class3612.field3934 = objectArray;
                            } else if (n == 1421) {
                                class3612.field3992 = objectArray;
                            } else if (n == 1422) {
                                class3612.field3970 = objectArray;
                            } else if (n == 1423) {
                                class3612.field3996 = objectArray;
                            } else if (n == 1424) {
                                class3612.field3930 = objectArray;
                            } else if (n == 1425) {
                                class3612.field3999 = objectArray;
                            } else if (n == 1426) {
                                class3612.field4000 = objectArray;
                            } else if (n == 1427) {
                                class3612.field3998 = objectArray;
                            } else if (n == 1428) {
                                class3612.field3993 = objectArray;
                            } else if (n == 1429) {
                                class3612.field3988 = objectArray;
                            } else if (n == 1430) {
                                class3612.field3989 = objectArray;
                            } else if (n == 1431) {
                                class3612.field3901 = objectArray;
                            } else if (n == 1434) {
                                class3612.field4023 = objectArray;
                            } else if (n == 1435) {
                                class3612.field3985 = objectArray;
                            } else {
                                if (n < 1436 || n > 1439) return 2;
                                class357 class3572 = class3612.method7447();
                                if (class3572 != null) {
                                    if (n == 1436) {
                                        class3572.field3803 = objectArray;
                                    } else if (n == 1437) {
                                        class3572.field3804 = objectArray;
                                    } else if (n == 1438) {
                                        class3572.field3805 = objectArray;
                                    } else if (n == 1439) {
                                        class3572.field3802 = objectArray;
                                    }
                                }
                            }
                        } else {
                            class3612.field3981 = objectArray;
                            class3612.field3982 = nArray;
                        }
                    } else {
                        class3612.field3979 = objectArray;
                        class3612.field3980 = nArray;
                    }
                } else {
                    class3612.field3977 = objectArray;
                    class3612.field3939 = nArray;
                }
                class3612.field3882 = true;
                return 1;
            }
            objectArray[n3] = string.charAt(n3 - 1) == 's' ? class72.field855[--class104.field1343] : new Integer(class72.field865[--class63.field444]);
            --n3;
        }
    }
}

