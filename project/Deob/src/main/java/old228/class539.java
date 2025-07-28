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

@ObfuscatedName(value="uf")
public class class539
extends class497
implements class311 {
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpq;")
    final class391 field5385;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lmf;")
    final class313 field5383 = new class313(64);
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=646094095)
    final int field5384;

    @ObfuscatedSignature(descriptor="(Lol;ILph;Lpq;)V")
    public class539(class377 class3772, int n, class406 class4062, class391 class3912) {
        super(class3772, class4062, class3912 != null ? class3912.method7740(n) : 0);
        this.field5385 = class3912;
        this.field5384 = n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IB)Lts;", garbageValue="-1")
    protected class499 vmethod10080(int n) {
        class498 class4982;
        class313 class3132 = this.field5383;
        synchronized (class3132) {
            class4982 = (class498)this.field5383.method6545(n);
            if (class4982 == null) {
                class4982 = this.method10081(n);
                this.field5383.method6549(class4982, n);
            }
        }
        return class4982;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(II)Lto;", garbageValue="280173339")
    class498 method10081(int n) {
        byte[] byArray = this.field5385.method7790(this.field5384, n);
        class498 class4982 = new class498(n);
        if (byArray != null) {
            class4982.method9530(new class556(byArray));
        }
        return class4982;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1867919389")
    public void method10082() {
        class313 class3132 = this.field5383;
        synchronized (class3132) {
            this.field5383.method6551();
        }
    }

    public Iterator iterator() {
        return new class538(this);
    }

    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-1346583378")
    static int method10085(int n, class81 class812, boolean bl) {
        if (n != 3800) {
            int n2;
            if (n != 3801) {
                if (n != 3802) {
                    if (n != 3803) {
                        if (n != 3804) {
                            if (n != 3805) {
                                if (n != 3806) {
                                    if (n != 3807) {
                                        if (n != 3809) {
                                            if (n != 3810) {
                                                if (n != 3811) {
                                                    if (n != 3812) {
                                                        if (n != 3813) {
                                                            if (n != 3814) {
                                                                if (n != 3815) {
                                                                    if (n != 3816) {
                                                                        if (n != 3817) {
                                                                            if (n != 3818) {
                                                                                if (n != 3819) {
                                                                                    if (n != 3820) {
                                                                                        int n3;
                                                                                        if (n == 3821) {
                                                                                            n3 = class72.field865[class63.field444 -= 3];
                                                                                            boolean bl2 = class72.field865[class63.field444 + 1] == 1;
                                                                                            int n4 = class72.field865[class63.field444 + 2];
                                                                                            class35.method678(n4, n3, bl2);
                                                                                        }
                                                                                        if (n != 3822) {
                                                                                            if (n != 3850) {
                                                                                                if (n != 3851) {
                                                                                                    if (n != 3852) {
                                                                                                        if (n != 3853) {
                                                                                                            if (n != 3854) {
                                                                                                                if (n != 3855) {
                                                                                                                    if (n != 3856) {
                                                                                                                        if (n != 3857) {
                                                                                                                            if (n != 3858) {
                                                                                                                                if (n != 3859) {
                                                                                                                                    if (n != 3860) {
                                                                                                                                        if (n != 3861) {
                                                                                                                                            if (n != 3890) {
                                                                                                                                                return 2;
                                                                                                                                            }
                                                                                                                                            class72.field865[++class63.field444 - 1] = client.field803 != null ? 1 : 0;
                                                                                                                                            return 1;
                                                                                                                                        }
                                                                                                                                        class72.field865[class63.field444 - 1] = class365.field4045.method3834()[class72.field865[class63.field444 - 1]];
                                                                                                                                        return 1;
                                                                                                                                    }
                                                                                                                                    class72.field865[++class63.field444 - 1] = class365.field4045.method3850(class72.field855[--class104.field1343]);
                                                                                                                                    return 1;
                                                                                                                                }
                                                                                                                                n3 = class72.field865[--class63.field444];
                                                                                                                                class305.method6494(class571.field5585, n3);
                                                                                                                                return 1;
                                                                                                                            }
                                                                                                                            n3 = class72.field865[--class63.field444];
                                                                                                                            class72.field865[++class63.field444 - 1] = ((class152)class365.field4045.field1808.get((int)n3)).field1687;
                                                                                                                            return 1;
                                                                                                                        }
                                                                                                                        n3 = class72.field865[--class63.field444];
                                                                                                                        class72.field865[++class63.field444 - 1] = ((class152)class365.field4045.field1808.get((int)n3)).field1686;
                                                                                                                        return 1;
                                                                                                                    }
                                                                                                                    n3 = class72.field865[--class63.field444];
                                                                                                                    class72.field855[++class104.field1343 - 1] = ((class152)class365.field4045.field1808.get((int)n3)).field1685.method10969();
                                                                                                                    return 1;
                                                                                                                }
                                                                                                                class72.field865[++class63.field444 - 1] = class365.field4045.method3837();
                                                                                                                return 1;
                                                                                                            }
                                                                                                            class72.field865[++class63.field444 - 1] = class365.field4045.field1812;
                                                                                                            return 1;
                                                                                                        }
                                                                                                        class72.field865[++class63.field444 - 1] = class365.field4045.field1813;
                                                                                                        return 1;
                                                                                                    }
                                                                                                    class72.field855[++class104.field1343 - 1] = class365.field4045.field1811;
                                                                                                    return 1;
                                                                                                }
                                                                                                if (client.field738[n3 = class72.field865[--class63.field444]] == null) {
                                                                                                    class72.field865[++class63.field444 - 1] = 0;
                                                                                                } else {
                                                                                                    class72.field865[++class63.field444 - 1] = 1;
                                                                                                    class365.field4045 = client.field738[n3];
                                                                                                    class571.field5585 = n3;
                                                                                                }
                                                                                                return 1;
                                                                                            }
                                                                                            if (class106.field1371 == null) {
                                                                                                class72.field865[++class63.field444 - 1] = 0;
                                                                                            } else {
                                                                                                class72.field865[++class63.field444 - 1] = 1;
                                                                                                class365.field4045 = class106.field1371;
                                                                                            }
                                                                                            return 1;
                                                                                        }
                                                                                        n3 = class72.field865[--class63.field444];
                                                                                        class72.field865[++class63.field444 - 1] = class281.field3082.field1749[n3] ? 1 : 0;
                                                                                        return 1;
                                                                                    }
                                                                                    int n5 = class72.field865[--class63.field444];
                                                                                    class72.field865[++class63.field444 - 1] = class281.field3082.field1751[n5];
                                                                                    return 1;
                                                                                }
                                                                                int n6 = class72.field865[class63.field444 -= 2];
                                                                                int n7 = class72.field865[class63.field444 + 1];
                                                                                class506.method9591(n7, n6);
                                                                                return 1;
                                                                            }
                                                                            class72.field865[class63.field444 - 1] = class281.field3082.method3709()[class72.field865[class63.field444 - 1]];
                                                                            return 1;
                                                                        }
                                                                        class72.field865[++class63.field444 - 1] = class281.field3082.method3712(class72.field855[--class104.field1343]);
                                                                        return 1;
                                                                    }
                                                                    class72.field865[++class63.field444 - 1] = class281.field3082.field1760;
                                                                    return 1;
                                                                }
                                                                class72.field865[++class63.field444 - 1] = class281.field3082.field1752;
                                                                return 1;
                                                            }
                                                            int n8 = class72.field865[class63.field444 -= 3];
                                                            int n9 = class72.field865[class63.field444 + 1];
                                                            int n10 = class72.field865[class63.field444 + 2];
                                                            class72.field865[++class63.field444 - 1] = class281.field3082.method3711(n8, n9, n10);
                                                            return 1;
                                                        }
                                                        int n11 = class72.field865[--class63.field444];
                                                        class72.field855[++class104.field1343 - 1] = class281.field3082.field1758[n11];
                                                        return 1;
                                                    }
                                                    class72.field865[++class63.field444 - 1] = class281.field3082.field1755;
                                                    return 1;
                                                }
                                                int n12 = class72.field865[--class63.field444];
                                                class72.field865[++class63.field444 - 1] = class281.field3082.field1748[n12];
                                                return 1;
                                            }
                                            int n13 = class72.field865[--class63.field444];
                                            class72.field855[++class104.field1343 - 1] = class281.field3082.field1761[n13];
                                            return 1;
                                        }
                                        class72.field865[++class63.field444 - 1] = class281.field3082.field1746;
                                        return 1;
                                    }
                                    class72.field865[++class63.field444 - 1] = class281.field3082.field1745;
                                    return 1;
                                }
                                class72.field865[++class63.field444 - 1] = class281.field3082.field1744;
                                return 1;
                            }
                            class72.field865[++class63.field444 - 1] = class281.field3082.field1753;
                            return 1;
                        }
                        class72.field865[++class63.field444 - 1] = class281.field3082.field1742;
                        return 1;
                    }
                    class72.field865[++class63.field444 - 1] = class281.field3082.field1741 ? 1 : 0;
                    return 1;
                }
                class72.field855[++class104.field1343 - 1] = class281.field3082.field1739;
                return 1;
            }
            if (client.field737[n2 = class72.field865[--class63.field444]] == null) {
                class72.field865[++class63.field444 - 1] = 0;
            } else {
                class72.field865[++class63.field444 - 1] = 1;
                class281.field3082 = client.field737[n2];
            }
            return 1;
        }
        if (class229.field2488 == null) {
            class72.field865[++class63.field444 - 1] = 0;
        } else {
            class72.field865[++class63.field444 - 1] = 1;
            class281.field3082 = class229.field2488;
        }
        return 1;
    }
}

