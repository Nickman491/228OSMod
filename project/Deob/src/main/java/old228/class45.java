package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bs")
public class class45 {
    @ObfuscatedName(value="ed")
    @ObfuscatedSignature(descriptor="Lok;")
    static class388 field291;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    class391 field292;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpq;")
    class391 field294;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lub;")
    class530 field293;

    @ObfuscatedSignature(descriptor="(Lpq;Lpq;)V")
    public class45(class391 class3912, class391 class3913) {
        new class530(256);
        this.field293 = new class530(256);
        this.field292 = class3912;
        this.field294 = class3913;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II[II)Lbc;", garbageValue="-1288138879")
    class40 method873(int n, int n2, int[] nArray) {
        long l = this.method878(n, n2, false);
        class53 class533 = (class53)this.field293.method9985(l);
        if (class533 != null) {
            return class533.method1119();
        }
        if (nArray != null && nArray[0] <= 0) {
            return null;
        }
        class39 class3910 = class39.method775(this.field292, n, n2);
        if (class3910 == null) {
            return null;
        }
        class40 class408 = class3910.method772();
        this.field293.method9984(new class53(class408), l);
        if (nArray != null) {
            nArray[0] = nArray[0] - class408.field241.length;
        }
        return class408;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)Lcn;", garbageValue="-1812904405")
    class53 method874(int n, int n2) {
        long l = this.method878(n, n2, true);
        class53 class533 = (class53)this.field293.method9985(l);
        if (class533 == null) {
            class54 class546 = class54.method1136(this.field294, n, n2);
            if (class546 != null) {
                class53 class5310 = new class53(class546);
                this.field293.method9984(class5310, l);
                return class5310;
            }
            return new class53();
        }
        return class533;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I[IB)Lbc;", garbageValue="5")
    class40 method875(int n, int[] nArray) {
        if (this.field292.method7812() == 1) {
            return this.method873(0, n, nArray);
        }
        if (this.field292.method7740(n) == 1) {
            return this.method873(n, 0, nArray);
        }
        throw new RuntimeException();
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(II)Lcn;", garbageValue="2081628013")
    public class53 method876(int n) {
        if (this.field294.method7812() != 1) {
            if (this.field294.method7740(n) != 1) {
                throw new RuntimeException();
            }
            return this.method874(n, 0);
        }
        return this.method874(0, n);
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(II)Lbc;", garbageValue="2051084819")
    public class40 method888(int n) {
        return this.method875(n, null);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IIZI)J", garbageValue="-1650709308")
    long method878(int n, int n2, boolean bl) {
        int n3 = n2 ^ (n << 4 & 0xFFFF | n >> 12);
        n3 |= n << 16;
        if (!bl) {
            return n3;
        }
        return (long)n3 ^ 0x100000000L;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lff;FZB)F", garbageValue="92")
    static float method895(class136 class1362, float f, boolean bl) {
        float f2 = 0.0f;
        if (class1362 != null && class1362.method3455() != 0) {
            float f3 = class1362.field1573[class1362.method3455() - 1].field1528;
            float f4 = class1362.field1573[0].field1528;
            float f5 = f3 - f4;
            if (f5 != 0.0f) {
                float f6 = 0.0f;
                f6 = !(f > f3) ? (f - f4) / f5 : (f - f3) / f5;
                float f7 = (int)f6;
                float f8 = Math.abs(f6 - f7);
                float f9 = f5 * f8;
                f7 = Math.abs(f7 + 1.0f);
                float f10 = f7 / 2.0f;
                float f11 = (int)f10;
                f8 = f10 - f11;
                if (!bl) {
                    if (class1362.field1574 != class134.field1563) {
                        if (class1362.field1574 != class134.field1559 && class1362.field1574 != class134.field1560) {
                            if (class1362.field1574 == class134.field1557) {
                                f9 = f - f3;
                                float f12 = class1362.field1573[class1362.method3455() - 1].field1530;
                                float f13 = class1362.field1573[class1362.method3455() - 1].field1526;
                                f2 = class1362.field1573[class1362.method3455() - 1].field1527;
                                if (0.0f != f12) {
                                    f2 += f13 * f9 / f12;
                                }
                                return f2;
                            }
                        } else {
                            f9 = f4 + f9;
                        }
                    } else {
                        f9 = 0.0f == f8 ? (f9 += f4) : f3 - f9;
                    }
                } else if (class1362.field1572 != class134.field1563) {
                    if (class1362.field1572 != class134.field1559 && class1362.field1572 != class134.field1560) {
                        if (class1362.field1572 == class134.field1557) {
                            f9 = f4 - f;
                            float f14 = class1362.field1573[0].field1531;
                            float f15 = class1362.field1573[0].field1529;
                            f2 = class1362.field1573[0].field1527;
                            if (f14 != 0.0f) {
                                f2 -= f15 * f9 / f14;
                            }
                            return f2;
                        }
                    } else {
                        f9 = f3 - f9;
                    }
                } else {
                    f9 = f8 == 0.0f ? f3 - f9 : (f9 += f4);
                }
                f2 = class149.method3585(class1362, f9);
                if (bl && class1362.field1572 == class134.field1560) {
                    float f16 = class1362.field1573[class1362.method3455() - 1].field1527 - class1362.field1573[0].field1527;
                    f2 -= f16 * f7;
                } else if (!bl && class1362.field1574 == class134.field1560) {
                    float f17 = class1362.field1573[class1362.method3455() - 1].field1527 - class1362.field1573[0].field1527;
                    f2 += f7 * f17;
                }
                return f2;
            }
            return class1362.field1573[0].field1527;
        }
        return f2;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="-84")
    static final void method897(String string) {
        String string2 = "Please remove " + string + " from your ignore list first";
        class72.method2153(30, "", string2);
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(ILdm;ZS)I", garbageValue="19493")
    static int method896(int n, class81 class812, boolean bl) {
        if (n != 2700) {
            if (n != 2701) {
                int n2;
                class89 class892;
                if (n != 2702) {
                    if (n != 2706) {
                        if (n != 2707) {
                            if (n != 2708) {
                                if (n != 2709) {
                                    return 2;
                                }
                                class361 class3612 = class170.field1807.method7031(class72.field865[--class63.field444]);
                                return class303.method6467(class3612);
                            }
                            class361 class3613 = class170.field1807.method7031(class72.field865[--class63.field444]);
                            return class10.method112(class3613);
                        }
                        class361 class3614 = class170.field1807.method7031(class72.field865[--class63.field444]);
                        class72.field865[++class63.field444 - 1] = class3614.method7433() ? 1 : 0;
                        return 1;
                    }
                    class72.field865[++class63.field444 - 1] = client.field663;
                    return 1;
                }
                class72.field865[++class63.field444 - 1] = (class892 = (class89)client.field664.method9985(n2 = class72.field865[--class63.field444])) != null ? 1 : 0;
                return 1;
            }
            class361 class3615 = class170.field1807.method7031(class72.field865[--class63.field444]);
            class72.field865[++class63.field444 - 1] = class3615.field4010 != -1 ? class3615.field4011 : 0;
            return 1;
        }
        class361 class3616 = class170.field1807.method7031(class72.field865[--class63.field444]);
        class72.field865[++class63.field444 - 1] = class3616.field4010;
        return 1;
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="601935983")
    static int method872(int n, class81 class812, boolean bl) {
        if (n != 3100) {
            if (n != 3101) {
                if (n != 3103) {
                    if (n != 3104) {
                        if (n != 3105) {
                            if (n != 3106) {
                                if (n != 3107) {
                                    if (n != 3108) {
                                        if (n != 3109) {
                                            if (n != 3110) {
                                                if (n != 3111) {
                                                    if (n != 3112) {
                                                        if (n != 3113) {
                                                            if (n != 3115) {
                                                                if (n != 3116) {
                                                                    if (n != 3117) {
                                                                        if (n != 3118) {
                                                                            if (n != 3119) {
                                                                                if (n != 3120) {
                                                                                    if (n != 3121) {
                                                                                        if (n != 3122) {
                                                                                            if (n != 3123) {
                                                                                                if (n != 3124) {
                                                                                                    if (n != 3125) {
                                                                                                        if (n != 3126) {
                                                                                                            if (n != 3127) {
                                                                                                                if (n != 3128) {
                                                                                                                    if (n != 3129) {
                                                                                                                        if (n != 3130) {
                                                                                                                            if (n != 3131) {
                                                                                                                                if (n != 3132) {
                                                                                                                                    if (n != 3133) {
                                                                                                                                        if (n != 3134) {
                                                                                                                                            if (n != 3135) {
                                                                                                                                                if (n != 3136) {
                                                                                                                                                    if (n != 3137) {
                                                                                                                                                        if (n != 3138) {
                                                                                                                                                            if (n != 3139) {
                                                                                                                                                                if (n != 3140) {
                                                                                                                                                                    if (n != 3141) {
                                                                                                                                                                        if (n != 3142) {
                                                                                                                                                                            boolean bl2;
                                                                                                                                                                            if (n != 3143) {
                                                                                                                                                                                if (n != 3144) {
                                                                                                                                                                                    if (n != 3145) {
                                                                                                                                                                                        if (n != 3146) {
                                                                                                                                                                                            if (n != 3147) {
                                                                                                                                                                                                if (n != 3148) {
                                                                                                                                                                                                    if (n != 3149) {
                                                                                                                                                                                                        if (n != 3150) {
                                                                                                                                                                                                            if (n != 3151) {
                                                                                                                                                                                                                if (n != 3152) {
                                                                                                                                                                                                                    if (n != 3153) {
                                                                                                                                                                                                                        if (n != 3154) {
                                                                                                                                                                                                                            if (n != 3155) {
                                                                                                                                                                                                                                if (n != 3156) {
                                                                                                                                                                                                                                    if (n != 3157) {
                                                                                                                                                                                                                                        if (n != 3158) {
                                                                                                                                                                                                                                            if (n != 3159) {
                                                                                                                                                                                                                                                if (n != 3160) {
                                                                                                                                                                                                                                                    if (n != 3161) {
                                                                                                                                                                                                                                                        if (n != 3162) {
                                                                                                                                                                                                                                                            if (n != 3163) {
                                                                                                                                                                                                                                                                if (n != 3164) {
                                                                                                                                                                                                                                                                    if (n != 3165) {
                                                                                                                                                                                                                                                                        if (n != 3166) {
                                                                                                                                                                                                                                                                            if (n != 3167) {
                                                                                                                                                                                                                                                                                if (n != 3168) {
                                                                                                                                                                                                                                                                                    if (n != 3169) {
                                                                                                                                                                                                                                                                                        if (n != 3170) {
                                                                                                                                                                                                                                                                                            if (n != 3171) {
                                                                                                                                                                                                                                                                                                if (n != 3172) {
                                                                                                                                                                                                                                                                                                    if (n != 3173) {
                                                                                                                                                                                                                                                                                                        if (n != 3174) {
                                                                                                                                                                                                                                                                                                            if (n != 3175) {
                                                                                                                                                                                                                                                                                                                if (n != 3176) {
                                                                                                                                                                                                                                                                                                                    if (n != 3177) {
                                                                                                                                                                                                                                                                                                                        if (n != 3178) {
                                                                                                                                                                                                                                                                                                                            if (n != 3179) {
                                                                                                                                                                                                                                                                                                                                if (n != 3180) {
                                                                                                                                                                                                                                                                                                                                    if (n != 3181) {
                                                                                                                                                                                                                                                                                                                                        if (n != 3182) {
                                                                                                                                                                                                                                                                                                                                            if (n != 3185) {
                                                                                                                                                                                                                                                                                                                                                if (n != 3186) {
                                                                                                                                                                                                                                                                                                                                                    if (n != 3189) {
                                                                                                                                                                                                                                                                                                                                                        return 2;
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                    int n2 = class72.field865[--class63.field444];
                                                                                                                                                                                                                                                                                                                                                    class353.method7037(n2);
                                                                                                                                                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                int n3 = class544.field5403.method2902();
                                                                                                                                                                                                                                                                                                                                                class72.field865[++class63.field444 - 1] = n3;
                                                                                                                                                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            int n4 = class72.field865[--class63.field444];
                                                                                                                                                                                                                                                                                                                                            class544.field5403.method2911(n4);
                                                                                                                                                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        class72.field865[++class63.field444 - 1] = class45.method893();
                                                                                                                                                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    class140.method3504(class72.field865[--class63.field444]);
                                                                                                                                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                --class104.field1343;
                                                                                                                                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        --class104.field1343;
                                                                                                                                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            class72.field865[++class63.field444 - 1] = 0;
                                                                                                                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        --class63.field444;
                                                                                                                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    --class63.field444;
                                                                                                                                                                                                                                                                                                    class72.field865[++class63.field444 - 1] = 0;
                                                                                                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                --class63.field444;
                                                                                                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            class72.field865[++class63.field444 - 1] = 0;
                                                                                                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        class72.field865[++class63.field444 - 1] = 0;
                                                                                                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                class63.field444 -= 2;
                                                                                                                                                                                                                                                                                class72.field855[++class104.field1343 - 1] = "";
                                                                                                                                                                                                                                                                                class72.field855[++class104.field1343 - 1] = "";
                                                                                                                                                                                                                                                                                class72.field855[++class104.field1343 - 1] = "";
                                                                                                                                                                                                                                                                                class72.field855[++class104.field1343 - 1] = "";
                                                                                                                                                                                                                                                                                class72.field855[++class104.field1343 - 1] = "";
                                                                                                                                                                                                                                                                                class72.field855[++class104.field1343 - 1] = "";
                                                                                                                                                                                                                                                                                class72.field855[++class104.field1343 - 1] = "";
                                                                                                                                                                                                                                                                                class72.field855[++class104.field1343 - 1] = "";
                                                                                                                                                                                                                                                                                class72.field855[++class104.field1343 - 1] = "";
                                                                                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            class63.field444 -= 2;
                                                                                                                                                                                                                                                                            class72.field865[++class63.field444 - 1] = 0;
                                                                                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        class63.field444 -= 2;
                                                                                                                                                                                                                                                                        class72.field865[++class63.field444 - 1] = 0;
                                                                                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    --class63.field444;
                                                                                                                                                                                                                                                                    class72.field865[++class63.field444 - 1] = 0;
                                                                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                --class63.field444;
                                                                                                                                                                                                                                                                class72.field855[++class104.field1343 - 1] = "";
                                                                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            --class104.field1343;
                                                                                                                                                                                                                                                            class72.field865[++class63.field444 - 1] = 0;
                                                                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        --class63.field444;
                                                                                                                                                                                                                                                        class72.field865[++class63.field444 - 1] = 0;
                                                                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    --class63.field444;
                                                                                                                                                                                                                                                    class72.field865[++class63.field444 - 1] = 0;
                                                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                class72.field865[++class63.field444 - 1] = 0;
                                                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            class72.field865[++class63.field444 - 1] = 0;
                                                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        class72.field865[++class63.field444 - 1] = 0;
                                                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    class63.field444 -= 2;
                                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            --class104.field1343;
                                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        class72.field865[++class63.field444 - 1] = class254.method5409();
                                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    class72.field865[++class63.field444 - 1] = class78.field935;
                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                class72.field865[++class63.field444 - 1] = 0;
                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            class72.field865[++class63.field444 - 1] = 0;
                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        class72.field865[++class63.field444 - 1] = 0;
                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    class72.field865[++class63.field444 - 1] = 0;
                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                }
                                                                                                                                                                                                return 1;
                                                                                                                                                                                            }
                                                                                                                                                                                            class72.field865[++class63.field444 - 1] = class544.field5403.method2887() ? 0 : 1;
                                                                                                                                                                                            return 1;
                                                                                                                                                                                        }
                                                                                                                                                                                        boolean bl3 = class72.field865[--class63.field444] == 1;
                                                                                                                                                                                        class544.field5403.method2978(!bl3);
                                                                                                                                                                                        return 1;
                                                                                                                                                                                    }
                                                                                                                                                                                    return 1;
                                                                                                                                                                                }
                                                                                                                                                                                class72.field865[++class63.field444 - 1] = client.field555 ? 1 : 0;
                                                                                                                                                                                return 1;
                                                                                                                                                                            }
                                                                                                                                                                            client.field555 = bl2 = class72.field865[--class63.field444] == 1;
                                                                                                                                                                            if (!bl2) {
                                                                                                                                                                                class544.field5403.method2901("");
                                                                                                                                                                            }
                                                                                                                                                                            return 1;
                                                                                                                                                                        }
                                                                                                                                                                        class72.field865[++class63.field444 - 1] = class544.field5403.method2974() ? 1 : 0;
                                                                                                                                                                        return 1;
                                                                                                                                                                    }
                                                                                                                                                                    boolean bl4 = class72.field865[--class63.field444] == 1;
                                                                                                                                                                    class544.field5403.method2884(bl4);
                                                                                                                                                                    return 1;
                                                                                                                                                                }
                                                                                                                                                                client.field665 = 3;
                                                                                                                                                                client.field707 = bl ? class134.field1564.field3910 : class9.field45.field3910;
                                                                                                                                                                return 1;
                                                                                                                                                            }
                                                                                                                                                            client.field665 = 1;
                                                                                                                                                            return 1;
                                                                                                                                                        }
                                                                                                                                                        client.field665 = 0;
                                                                                                                                                        return 1;
                                                                                                                                                    }
                                                                                                                                                    client.field665 = 2;
                                                                                                                                                    client.field707 = class72.field865[--class63.field444];
                                                                                                                                                    return 1;
                                                                                                                                                }
                                                                                                                                                client.field665 = 3;
                                                                                                                                                client.field707 = class72.field865[--class63.field444];
                                                                                                                                                return 1;
                                                                                                                                            }
                                                                                                                                            class63.field444 -= 2;
                                                                                                                                            return 1;
                                                                                                                                        }
                                                                                                                                        return 1;
                                                                                                                                    }
                                                                                                                                    --class63.field444;
                                                                                                                                    return 1;
                                                                                                                                }
                                                                                                                                class72.field865[++class63.field444 - 1] = class128.field1521;
                                                                                                                                class72.field865[++class63.field444 - 1] = class363.field4038;
                                                                                                                                return 1;
                                                                                                                            }
                                                                                                                            --class63.field444;
                                                                                                                            return 1;
                                                                                                                        }
                                                                                                                        class63.field444 -= 2;
                                                                                                                        return 1;
                                                                                                                    }
                                                                                                                    client.field599 = class72.field865[class63.field444 -= 2];
                                                                                                                    client.field600 = class72.field865[class63.field444 + 1];
                                                                                                                    return 1;
                                                                                                                }
                                                                                                                class72.field865[++class63.field444 - 1] = class544.method10137() ? 1 : 0;
                                                                                                                return 1;
                                                                                                            }
                                                                                                            class80.method2473(class72.field865[--class63.field444] == 1);
                                                                                                            return 1;
                                                                                                        }
                                                                                                        client.field560 = class72.field865[--class63.field444] == 1;
                                                                                                        return 1;
                                                                                                    }
                                                                                                    client.field703 = class72.field865[--class63.field444] == 1;
                                                                                                    return 1;
                                                                                                }
                                                                                                client.field634 = 0;
                                                                                                return 1;
                                                                                            }
                                                                                            client.field634 = class72.field865[--class63.field444] == 1 ? (client.field634 |= 8) : (client.field634 &= 0xFFFFFFF7);
                                                                                            return 1;
                                                                                        }
                                                                                        client.field634 = class72.field865[--class63.field444] == 1 ? (client.field634 |= 4) : (client.field634 &= 0xFFFFFFFB);
                                                                                        return 1;
                                                                                    }
                                                                                    client.field634 = class72.field865[--class63.field444] == 1 ? (client.field634 |= 2) : (client.field634 &= 0xFFFFFFFD);
                                                                                    return 1;
                                                                                }
                                                                                client.field634 = class72.field865[--class63.field444] == 1 ? (client.field634 |= 1) : (client.field634 &= 0xFFFFFFFE);
                                                                                return 1;
                                                                            }
                                                                            client.field633 = class72.field865[--class63.field444] == 1;
                                                                            return 1;
                                                                        }
                                                                        client.field598 = class72.field865[--class63.field444] == 1;
                                                                        return 1;
                                                                    }
                                                                    --class63.field444;
                                                                    return 1;
                                                                }
                                                                int n5 = class72.field865[--class63.field444];
                                                                String string = class72.field855[class104.field1343 -= 2];
                                                                String string2 = class72.field855[class104.field1343 + 1];
                                                                if (string.length() > 500) {
                                                                    return 1;
                                                                }
                                                                if (string2.length() > 500) {
                                                                    return 1;
                                                                }
                                                                class324 class3242 = class90.method2629(class322.field3316, client.field564.field1446);
                                                                class3242.field3442.method10266(1 + class91.method2631(string) + class91.method2631(string2));
                                                                class3242.field3442.method10477(n5);
                                                                class3242.field3442.method10442(string);
                                                                class3242.field3442.method10442(string2);
                                                                client.field564.method3257(class3242);
                                                                return 1;
                                                            }
                                                            int n6 = class72.field865[--class63.field444];
                                                            class324 class3243 = class90.method2629(class322.field3407, client.field564.field1446);
                                                            class3243.field3442.method10266(n6);
                                                            client.field564.method3257(class3243);
                                                            return 1;
                                                        }
                                                        String string = class72.field855[--class104.field1343];
                                                        boolean bl5 = class72.field865[--class63.field444] == 1;
                                                        class294.method6390(string, bl5, false);
                                                        return 1;
                                                    }
                                                    class544.field5403.method2921(class72.field865[--class63.field444] == 1);
                                                    return 1;
                                                }
                                                class72.field865[++class63.field444 - 1] = class544.field5403.method2890() ? 1 : 0;
                                                return 1;
                                            }
                                            class25.field109 = class72.field865[--class63.field444] == 1;
                                            return 1;
                                        }
                                        int n7 = class72.field865[class63.field444 -= 2];
                                        int n8 = class72.field865[class63.field444 + 1];
                                        class361 class3612 = bl ? class134.field1564 : class9.field45;
                                        class297.method6399(class3612, n7, n8);
                                        return 1;
                                    }
                                    int n9 = class72.field865[class63.field444 -= 3];
                                    int n10 = class72.field865[class63.field444 + 1];
                                    int n11 = class72.field865[class63.field444 + 2];
                                    class361 class3613 = class170.field1807.method7031(n11);
                                    class297.method6399(class3613, n9, n10);
                                    return 1;
                                }
                                int n12 = class72.field865[--class63.field444];
                                String string = class72.field855[--class104.field1343];
                                class302.method6463(n12, string);
                                return 1;
                            }
                            String string = class72.field855[--class104.field1343];
                            class324 class3244 = class90.method2629(class322.field3406, client.field564.field1446);
                            class3244.field3442.method10300(string.length() + 1);
                            class3244.field3442.method10442(string);
                            client.field564.method3257(class3244);
                            return 1;
                        }
                        String string = class72.field855[--class104.field1343];
                        class324 class3245 = class90.method2629(class322.field3359, client.field564.field1446);
                        class3245.field3442.method10300(string.length() + 1);
                        class3245.field3442.method10442(string);
                        client.field564.method3257(class3245);
                        return 1;
                    }
                    String string = class72.field855[--class104.field1343];
                    int n13 = 0;
                    if (class426.method8330(string)) {
                        n13 = class278.method5972(string);
                    }
                    class324 class3246 = class90.method2629(class322.field3357, client.field564.field1446);
                    class3246.field3442.method10268(n13);
                    client.field564.method3257(class3246);
                    return 1;
                }
                if (!class72.field862) {
                    class72.field850 = true;
                }
                return 1;
            }
            class57.method1171(class407.field4693, class72.field865[class63.field444 -= 2], class72.field865[class63.field444 + 1]);
            return 1;
        }
        String string = class72.field855[--class104.field1343];
        class72.method2153(0, "", string);
        return 1;
    }

    @ObfuscatedName(value="if")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1159973217")
    static void method881() {
        class268 class2682 = (class268)client.field709.method7996();
        while (class2682 != null) {
            class2682.method9623();
            class2682 = (class268)client.field709.method8005();
        }
        return;
    }

    @ObfuscatedName(value="nb")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="18")
    static final int method893() {
        float f = 200.0f * ((float)class544.field5403.method2941() - 0.5f);
        return 100 - Math.round(f);
    }

    @ObfuscatedName(value="od")
    @ObfuscatedSignature(descriptor="(IB)Lvr;", garbageValue="20")
    static class548 method892(int n) {
        class548 class5482 = (class548)client.field788.method6578(n);
        if (class5482 == null) {
            class5482 = new class548(HitSplatDef.field2777, class244.method5288(n), class384.method7653(n));
            client.field788.method6590(class5482, n);
        }
        return class5482;
    }
}

