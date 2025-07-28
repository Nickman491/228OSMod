package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="rm")
public class class454 {
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lvi;")
    static class569 field4897;

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="17")
    public static int method8933(int n) {
        return n + -512;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-166948006")
    static int method8934(int n, class81 class812, boolean bl) {
        class361 class3612;
        int n2 = -1;
        if (n < 2000) {
            class3612 = bl ? class134.field1564 : class9.field45;
        } else {
            n -= 1000;
            n2 = class72.field865[--class63.field444];
            class3612 = class170.field1807.method7031(n2);
        }
        if (n != 1100) {
            if (n != 1101) {
                if (n != 1102) {
                    if (n != 1103) {
                        if (n != 1104) {
                            if (n != 1105) {
                                if (n != 1106) {
                                    if (n != 1107) {
                                        if (n != 1108) {
                                            if (n != 1109) {
                                                int n3;
                                                if (n != 1110) {
                                                    if (n != 1111) {
                                                        if (n != 1112) {
                                                            class359 class3592;
                                                            if (n != 1113) {
                                                                if (n != 1114) {
                                                                    if (n != 1115) {
                                                                        if (n != 1116) {
                                                                            if (n != 1117) {
                                                                                if (n != 1118) {
                                                                                    if (n != 1119) {
                                                                                        if (n != 1120) {
                                                                                            if (n != 1121) {
                                                                                                if (n != 1122) {
                                                                                                    if (n != 1123) {
                                                                                                        if (n != 1124) {
                                                                                                            if (n != 1125) {
                                                                                                                boolean bl2;
                                                                                                                if (n != 1126) {
                                                                                                                    boolean bl3;
                                                                                                                    if (n != 1127) {
                                                                                                                        if (n != 1129) {
                                                                                                                            if (n != 1130) {
                                                                                                                                if (n != 1131) {
                                                                                                                                    if (n != 1132) {
                                                                                                                                        if (n != 1133) {
                                                                                                                                            if (n != 1134) {
                                                                                                                                                if (n != 1135) {
                                                                                                                                                    if (n != 1136) {
                                                                                                                                                        if (n != 1137) {
                                                                                                                                                            if (n != 1138) {
                                                                                                                                                                if (n != 1139) {
                                                                                                                                                                    if (n != 1140) {
                                                                                                                                                                        class359 class3593;
                                                                                                                                                                        boolean bl4;
                                                                                                                                                                        if (n != 1141) {
                                                                                                                                                                            if (n != 1142) {
                                                                                                                                                                                if (n != 1143) {
                                                                                                                                                                                    if (n != 1144) {
                                                                                                                                                                                        if (n != 1145) {
                                                                                                                                                                                            if (n != 1146) {
                                                                                                                                                                                                if (n != 1147) {
                                                                                                                                                                                                    if (n != 1148) {
                                                                                                                                                                                                        if (n != 1149) {
                                                                                                                                                                                                            if (n != 1150) {
                                                                                                                                                                                                                if (n != 1151) {
                                                                                                                                                                                                                    if (n != 1152) {
                                                                                                                                                                                                                        return 2;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (class3612.field3873 != 11) {
                                                                                                                                                                                                                        throw new RuntimeException();
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    class212 class2122 = class3612.method7440();
                                                                                                                                                                                                                    boolean bl5 = class2122 != null && class2122.method4845() && class143.method3517().method4983(class2122.method4853());
                                                                                                                                                                                                                    class72.field865[++class63.field444 - 1] = bl5 ? 1 : 0;
                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                String string = class72.field855[class104.field1343 -= 3];
                                                                                                                                                                                                                String string2 = class72.field855[class104.field1343 + 1];
                                                                                                                                                                                                                String string3 = class72.field855[class104.field1343 + 2];
                                                                                                                                                                                                                long l = class219.method4963();
                                                                                                                                                                                                                long l2 = class242.method5279();
                                                                                                                                                                                                                String string4 = class225.method5057().method9655(class225.method5057().field5209);
                                                                                                                                                                                                                if (l != -1L) {
                                                                                                                                                                                                                    string = string.replaceAll("%userid%", Long.toString(l));
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (-1L != l2) {
                                                                                                                                                                                                                    string = string.replaceAll("%userhash%", Long.toString(l2));
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (!string4.isEmpty()) {
                                                                                                                                                                                                                    string = string.replaceAll("%deviceid%", string4);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                class3612.method7427(string, string2, string3, string4, Long.toString(l2), class280.field3069);
                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            class3612.method7428(class72.field855[--class104.field1343], class280.field3069);
                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        class63.field444 -= 2;
                                                                                                                                                                                                        class27 class276 = class3612.method7535();
                                                                                                                                                                                                        if (class276 != null) {
                                                                                                                                                                                                            class276.method407((char)class72.field865[class63.field444], class72.field865[class63.field444 + 1]);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    class63.field444 -= 2;
                                                                                                                                                                                                    class27 class2710 = class3612.method7535();
                                                                                                                                                                                                    if (class2710 != null) {
                                                                                                                                                                                                        class2710.method408(class72.field865[class63.field444], class72.field865[class63.field444 + 1]);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                }
                                                                                                                                                                                                --class63.field444;
                                                                                                                                                                                                class359 class3594 = class3612.method7444();
                                                                                                                                                                                                if (class3594 != null) {
                                                                                                                                                                                                    class3594.method7143(class72.field865[class63.field444]);
                                                                                                                                                                                                    class122.method3325(class3612);
                                                                                                                                                                                                }
                                                                                                                                                                                                return 1;
                                                                                                                                                                                            }
                                                                                                                                                                                            --class63.field444;
                                                                                                                                                                                            class359 class3595 = class3612.method7444();
                                                                                                                                                                                            if (class3595 != null) {
                                                                                                                                                                                                class3595.method7144(class72.field865[class63.field444]);
                                                                                                                                                                                            }
                                                                                                                                                                                            return 1;
                                                                                                                                                                                        }
                                                                                                                                                                                        --class63.field444;
                                                                                                                                                                                        class359 class3596 = class3612.method7444();
                                                                                                                                                                                        if (class3596 != null) {
                                                                                                                                                                                            class3596.method7141(class72.field865[class63.field444]);
                                                                                                                                                                                        }
                                                                                                                                                                                        return 1;
                                                                                                                                                                                    }
                                                                                                                                                                                    --class63.field444;
                                                                                                                                                                                    class359 class3597 = class3612.method7444();
                                                                                                                                                                                    if (class3597 != null) {
                                                                                                                                                                                        class3597.method7142(class72.field865[class63.field444]);
                                                                                                                                                                                        class122.method3325(class3612);
                                                                                                                                                                                    }
                                                                                                                                                                                    return 1;
                                                                                                                                                                                }
                                                                                                                                                                                class359 class3598 = class3612.method7444();
                                                                                                                                                                                if (class3598 != null && class3598.method7285(class72.field865[--class63.field444], class72.field865[class63.field444])) {
                                                                                                                                                                                    class122.method3325(class3612);
                                                                                                                                                                                }
                                                                                                                                                                                return 1;
                                                                                                                                                                            }
                                                                                                                                                                            class359 class3599 = class3612.method7444();
                                                                                                                                                                            if (class3599 != null && class3599.method7285(class72.field865[class63.field444 -= 2], class72.field865[class63.field444 + 1])) {
                                                                                                                                                                                class122.method3325(class3612);
                                                                                                                                                                            }
                                                                                                                                                                            return 1;
                                                                                                                                                                        }
                                                                                                                                                                        boolean bl6 = bl4 = class72.field865[--class63.field444] == 1;
                                                                                                                                                                        if (!bl4 && client.field575.method5728() == class3612) {
                                                                                                                                                                            client.field575.method5738();
                                                                                                                                                                            class122.method3325(class3612);
                                                                                                                                                                        }
                                                                                                                                                                        if ((class3593 = class3612.method7444()) != null) {
                                                                                                                                                                            class3593.method7128(bl4);
                                                                                                                                                                        }
                                                                                                                                                                        return 1;
                                                                                                                                                                    }
                                                                                                                                                                    boolean bl7 = class72.field865[--class63.field444] == 1;
                                                                                                                                                                    client.field575.method5738();
                                                                                                                                                                    class359 class35910 = class3612.method7444();
                                                                                                                                                                    if (class35910 != null && class35910.method7129(bl7)) {
                                                                                                                                                                        if (bl7) {
                                                                                                                                                                            client.field575.method5727(class3612);
                                                                                                                                                                        }
                                                                                                                                                                        class122.method3325(class3612);
                                                                                                                                                                    }
                                                                                                                                                                    return 1;
                                                                                                                                                                }
                                                                                                                                                                class359 class35911 = class3612.method7444();
                                                                                                                                                                if (class35911 != null && class35911.method7379(class72.field865[--class63.field444])) {
                                                                                                                                                                    class122.method3325(class3612);
                                                                                                                                                                }
                                                                                                                                                                return 1;
                                                                                                                                                            }
                                                                                                                                                            class359 class35912 = class3612.method7444();
                                                                                                                                                            if (class35912 != null && class35912.method7136(class72.field865[--class63.field444])) {
                                                                                                                                                                class122.method3325(class3612);
                                                                                                                                                            }
                                                                                                                                                            return 1;
                                                                                                                                                        }
                                                                                                                                                        class359 class35913 = class3612.method7444();
                                                                                                                                                        if (class35913 != null && class35913.method7212(class72.field865[--class63.field444])) {
                                                                                                                                                            class122.method3325(class3612);
                                                                                                                                                        }
                                                                                                                                                        return 1;
                                                                                                                                                    }
                                                                                                                                                    --class63.field444;
                                                                                                                                                    class353 class3532 = class3612.method7445();
                                                                                                                                                    if (class3532 != null) {
                                                                                                                                                        class3532.field3782 = class72.field865[class63.field444];
                                                                                                                                                        class122.method3325(class3612);
                                                                                                                                                    }
                                                                                                                                                    return 1;
                                                                                                                                                }
                                                                                                                                                --class104.field1343;
                                                                                                                                                class359 class35914 = class3612.method7444();
                                                                                                                                                if (class35914 != null) {
                                                                                                                                                    class3612.field3902 = class72.field855[class104.field1343];
                                                                                                                                                }
                                                                                                                                                return 1;
                                                                                                                                            }
                                                                                                                                            --class63.field444;
                                                                                                                                            class353 class3533 = class3612.method7445();
                                                                                                                                            if (class3533 != null) {
                                                                                                                                                class3533.field3781 = class72.field865[class63.field444];
                                                                                                                                                class122.method3325(class3612);
                                                                                                                                            }
                                                                                                                                            return 1;
                                                                                                                                        }
                                                                                                                                        --class63.field444;
                                                                                                                                        class353 class3534 = class3612.method7445();
                                                                                                                                        if (class3534 != null) {
                                                                                                                                            class3534.field3783 = class72.field865[class63.field444];
                                                                                                                                            class122.method3325(class3612);
                                                                                                                                        }
                                                                                                                                        return 1;
                                                                                                                                    }
                                                                                                                                    class3612.method7546(class72.field855[--class104.field1343], class72.field865[--class63.field444]);
                                                                                                                                    return 1;
                                                                                                                                }
                                                                                                                                class3612.method7521(class72.field865[class63.field444 -= 2], class72.field865[class63.field444 + 1]);
                                                                                                                                return 1;
                                                                                                                            }
                                                                                                                            class3612.method7426(class72.field855[--class104.field1343], "", class280.field3069, class219.method4963());
                                                                                                                            return 1;
                                                                                                                        }
                                                                                                                        class3612.field3908 = class72.field855[--class104.field1343];
                                                                                                                        class122.method3325(class3612);
                                                                                                                        return 1;
                                                                                                                    }
                                                                                                                    class3612.field3931 = bl3 = class72.field865[--class63.field444] == 1;
                                                                                                                    return 1;
                                                                                                                }
                                                                                                                class3612.field3907 = bl2 = class72.field865[--class63.field444] == 1;
                                                                                                                return 1;
                                                                                                            }
                                                                                                            int n4 = class72.field865[--class63.field444];
                                                                                                            class568 class5682 = (class568)class259.method5457(class309.method6540(), n4);
                                                                                                            if (class5682 != null) {
                                                                                                                class3612.field3905 = class5682;
                                                                                                                class122.method3325(class3612);
                                                                                                            }
                                                                                                            return 1;
                                                                                                        }
                                                                                                        class3612.field3938 = class72.field865[--class63.field444];
                                                                                                        class122.method3325(class3612);
                                                                                                        return 1;
                                                                                                    }
                                                                                                    class3612.field3897 = class72.field865[--class63.field444];
                                                                                                    class122.method3325(class3612);
                                                                                                    return 1;
                                                                                                }
                                                                                                class3612.field3871 = class72.field865[--class63.field444];
                                                                                                class122.method3325(class3612);
                                                                                                return 1;
                                                                                            }
                                                                                            class212.method4861(class3612.field3910, class3612.field3863);
                                                                                            client.field668 = class3612;
                                                                                            class122.method3325(class3612);
                                                                                            return 1;
                                                                                        }
                                                                                        class3612.field3894 = class72.field865[class63.field444 -= 2];
                                                                                        class3612.field3895 = class72.field865[class63.field444 + 1];
                                                                                        class122.method3325(class3612);
                                                                                        if (n2 != -1 && class3612.field3873 == 0) {
                                                                                            class244.method5286(class170.field1807.field3772[n2 >> 16], class3612, false);
                                                                                        }
                                                                                        return 1;
                                                                                    }
                                                                                    class3612.field3914 = class72.field865[--class63.field444] == 1;
                                                                                    class122.method3325(class3612);
                                                                                    return 1;
                                                                                }
                                                                                class3612.field3913 = class72.field865[--class63.field444] == 1;
                                                                                class122.method3325(class3612);
                                                                                return 1;
                                                                            }
                                                                            class3612.field3881 = class72.field865[--class63.field444];
                                                                            class122.method3325(class3612);
                                                                            return 1;
                                                                        }
                                                                        class3612.field3990 = class72.field865[--class63.field444];
                                                                        class122.method3325(class3612);
                                                                        return 1;
                                                                    }
                                                                    class3612.field3890 = class72.field865[--class63.field444] == 1;
                                                                    class122.method3325(class3612);
                                                                    return 1;
                                                                }
                                                                class63.field444 -= 3;
                                                                if (class3612.field3873 != 12) {
                                                                    class3612.field3937 = class72.field865[class63.field444];
                                                                    class3612.field4001 = class72.field865[class63.field444 + 1];
                                                                    class3612.field3936 = class72.field865[class63.field444 + 2];
                                                                } else {
                                                                    class359 class35915 = class3612.method7444();
                                                                    if (class35915 != null) {
                                                                        class35915.method7345(class72.field865[class63.field444], class72.field865[class63.field444 + 1]);
                                                                        class35915.method7311(class72.field865[class63.field444 + 2]);
                                                                    }
                                                                }
                                                                class122.method3325(class3612);
                                                                return 1;
                                                            }
                                                            class3612.field3978 = class72.field865[--class63.field444];
                                                            if (class3612.field3873 == 12 && (class3592 = class3612.method7444()) != null) {
                                                                class3592.method7145();
                                                            }
                                                            class122.method3325(class3612);
                                                            return 1;
                                                        }
                                                        String string = class72.field855[--class104.field1343];
                                                        if (class3612.field3873 != 12) {
                                                            if (!string.equals(class3612.field3911)) {
                                                                class3612.field3911 = string;
                                                                class122.method3325(class3612);
                                                            }
                                                        } else {
                                                            class359 class35916 = class3612.method7444();
                                                            if (class35916 != null && class35916.method7276()) {
                                                                class35916.method7131(string);
                                                            } else {
                                                                class3612.field3911 = string;
                                                            }
                                                            class122.method3325(class3612);
                                                        }
                                                        return 1;
                                                    }
                                                    class3612.field3867 = class72.field865[--class63.field444] == 1;
                                                    class122.method3325(class3612);
                                                    return 1;
                                                }
                                                if ((n3 = class72.field865[--class63.field444]) != class3612.field3919) {
                                                    class3612.field3919 = n3;
                                                    class3612.field4012 = 0;
                                                    class3612.field4013 = 0;
                                                    class122.method3325(class3612);
                                                }
                                                return 1;
                                            }
                                            class3612.field3955 = class72.field865[class63.field444 -= 6];
                                            class3612.field3922 = class72.field865[class63.field444 + 1];
                                            class3612.field3923 = class72.field865[class63.field444 + 2];
                                            class3612.field3994 = class72.field865[class63.field444 + 3];
                                            class3612.field3925 = class72.field865[class63.field444 + 4];
                                            class3612.field4020 = class72.field865[class63.field444 + 5];
                                            class122.method3325(class3612);
                                            return 1;
                                        }
                                        class3612.field3915 = 1;
                                        class3612.field3916 = class72.field865[--class63.field444];
                                        class122.method3325(class3612);
                                        return 1;
                                    }
                                    class3612.field3912 = class72.field865[--class63.field444] == 1;
                                    class122.method3325(class3612);
                                    return 1;
                                }
                                class3612.field3889 = class72.field865[--class63.field444];
                                class122.method3325(class3612);
                                return 1;
                            }
                            class3612.field3906 = class72.field865[--class63.field444];
                            class122.method3325(class3612);
                            return 1;
                        }
                        class3612.field3948 = class72.field865[--class63.field444];
                        class122.method3325(class3612);
                        return 1;
                    }
                    class3612.field4015 = class72.field865[--class63.field444];
                    class122.method3325(class3612);
                    return 1;
                }
                class3612.field3935 = class72.field865[--class63.field444] == 1;
                class122.method3325(class3612);
                return 1;
            }
            class3612.field3896 = class72.field865[--class63.field444];
            class122.method3325(class3612);
            return 1;
        }
        int n5 = class72.field865[class63.field444 -= 2];
        int n6 = class72.field865[class63.field444 + 1];
        if (class3612.field3873 != 12) {
            class3612.field3987 = n5;
            if (class3612.field3987 > class3612.field3894 - class3612.field3886) {
                class3612.field3987 = class3612.field3894 - class3612.field3886;
            }
            if (class3612.field3987 < 0) {
                class3612.field3987 = 0;
            }
            class3612.field3899 = n6;
            if (class3612.field3899 > class3612.field3895 - class3612.field3887 * -1528330031) {
                class3612.field3899 = class3612.field3895 - class3612.field3887 * -1528330031;
            }
            if (class3612.field3899 < 0) {
                class3612.field3899 = 0;
            }
            class122.method3325(class3612);
        } else {
            class359 class35917 = class3612.method7444();
            if (class35917 != null && class35917.method7138(n5, n6)) {
                class122.method3325(class3612);
            }
        }
        return 1;
    }

    @ObfuscatedName(value="oh")
    @ObfuscatedSignature(descriptor="(II)Lvr;", garbageValue="-1349481154")
    static class548 method8935(int n) {
        class548 class5482 = (class548)client.field789.method6578(n);
        if (class5482 == null) {
            class5482 = new class548(HitSplatDef.field2777, n);
        }
        return class5482;
    }
}

