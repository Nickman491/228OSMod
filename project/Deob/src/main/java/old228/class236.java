package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jm")
public class class236
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    static class391 field2526;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="[Ljm;")
    static class236[] field2519;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1187381095)
    public static int field2520;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lmi;")
    static class315 field2521;
    @ObfuscatedName(value="pi")
    @ObfuscatedGetter(intValue=-1003000535)
    static int field2543;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-418413189)
    public final int field2522;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1044903649)
    public int field2523 = -1;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1717119769)
    int field2518 = -1;
    @ObfuscatedName(value="ax")
    public String field2525;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1169799285)
    public int field2540;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=1570467255)
    public int field2527 = 0;
    @ObfuscatedName(value="as")
    public boolean field2533 = true;
    @ObfuscatedName(value="aq")
    public boolean field2530 = false;
    @ObfuscatedName(value="af")
    public String[] field2531 = new String[5];
    @ObfuscatedName(value="aa")
    public String field2532;
    @ObfuscatedName(value="ak")
    int[] field2528;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-510614173)
    int field2534 = Integer.MAX_VALUE;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=12256039)
    int field2535 = Integer.MAX_VALUE;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=1837550443)
    int field2536 = Integer.MIN_VALUE;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=-208336589)
    int field2537 = Integer.MIN_VALUE;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Ljt;")
    public class245 field2524 = class245.field2604;
    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="Ljk;")
    public class249 field2539 = class249.field2668;
    @ObfuscatedName(value="am")
    int[] field2538;
    @ObfuscatedName(value="ap")
    byte[] field2542;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=-1379816205)
    public int field2529 = -1;

    static {
        field2521 = new class315(256);
    }

    class236(int n) {
        this.field2522 = n;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1689056337")
    void method5188(class556 class5562) {
        int n;
        while ((n = class5562.method10282()) != 0) {
            this.method5165(class5562, n);
        }
        return;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="825746633")
    void method5165(class556 class5562, int n) {
        if (n == 1) {
            this.field2523 = class5562.method10476();
        } else if (n == 2) {
            this.field2518 = class5562.method10476();
        } else if (n == 3) {
            this.field2525 = class5562.method10290();
        } else if (n == 4) {
            this.field2540 = class5562.method10285();
        } else if (n != 5) {
            if (n == 6) {
                this.field2527 = class5562.method10282();
            } else if (n != 7) {
                if (n != 8) {
                    if (n >= 10 && n <= 14) {
                        this.field2531[n - 10] = class5562.method10290();
                    } else if (n != 15) {
                        if (n != 16) {
                            if (n == 17) {
                                this.field2532 = class5562.method10290();
                            } else if (n != 18) {
                                if (n == 19) {
                                    this.field2529 = class5562.method10307();
                                } else if (n != 21) {
                                    if (n != 22) {
                                        if (n != 23) {
                                            if (n != 24) {
                                                if (n != 25) {
                                                    if (n != 28) {
                                                        if (n != 29) {
                                                            if (n == 30) {
                                                                MouseWheel[] mouseWheelArray = new class249[]{class249.field2670, class249.field2668, class249.field2673};
                                                                this.field2539 = (class249)class259.method5457(mouseWheelArray, class5562.method10282());
                                                            }
                                                        } else {
                                                            this.field2524 = (class245)class259.method5457(class23.method338(), class5562.method10282());
                                                        }
                                                    } else {
                                                        class5562.method10282();
                                                    }
                                                } else {
                                                    class5562.method10476();
                                                }
                                            } else {
                                                class5562.method10284();
                                                class5562.method10284();
                                            }
                                        } else {
                                            class5562.method10282();
                                            class5562.method10282();
                                            class5562.method10282();
                                        }
                                    } else {
                                        class5562.method10440();
                                    }
                                } else {
                                    class5562.method10440();
                                }
                            } else {
                                class5562.method10476();
                            }
                        }
                    } else {
                        int n2;
                        int n3;
                        int n4 = class5562.method10282();
                        this.field2528 = new int[n4 * 2];
                        for (n3 = 0; n3 < n4 * 2; ++n3) {
                            this.field2528[n3] = class5562.method10284();
                        }
                        class5562.method10440();
                        n3 = class5562.method10282();
                        this.field2538 = new int[n3];
                        for (n2 = 0; n2 < this.field2538.length; ++n2) {
                            this.field2538[n2] = class5562.method10440();
                        }
                        this.field2542 = new byte[n4];
                        for (n2 = 0; n2 < n4; ++n2) {
                            this.field2542[n2] = class5562.method10524();
                        }
                    }
                } else {
                    class5562.method10282();
                }
            } else {
                int n5 = class5562.method10282();
                if ((n5 & 1) == 0) {
                    this.field2533 = false;
                }
                if ((n5 & 2) == 2) {
                    this.field2530 = true;
                }
            }
        } else {
            class5562.method10285();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1627989215")
    void method5166() {
        if (this.field2528 == null) return;
        int n = 0;
        while (n < this.field2528.length) {
            if (this.field2528[n] < this.field2534) {
                this.field2534 = this.field2528[n];
            } else if (this.field2528[n] > this.field2536) {
                this.field2536 = this.field2528[n];
            }
            if (this.field2528[n + 1] < this.field2535) {
                this.field2535 = this.field2528[n + 1];
            } else if (this.field2528[n + 1] > this.field2537) {
                this.field2537 = this.field2528[n + 1];
            }
            n += 2;
        }
        return;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(ZB)Lvf;", garbageValue="-100")
    public class570 method5167(boolean bl) {
        int n = this.field2523;
        return this.method5169(n);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IB)Lvf;", garbageValue="63")
    class570 method5169(int n) {
        if (n < 0) {
            return null;
        }
        class570 class5702 = (class570)field2521.method6578(n);
        if (class5702 != null) {
            return class5702;
        }
        class5702 = class83.method2509(field2526, n, 0);
        if (class5702 != null) {
            field2521.method6590(class5702, n);
        }
        return class5702;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-111")
    public int method5172() {
        return this.field2522;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Ljava/lang/String;", garbageValue="235760565")
    static String method5195(int n) {
        return "<img=" + n + ">";
    }

    @ObfuscatedName(value="iw")
    @ObfuscatedSignature(descriptor="(B)Lpm;", garbageValue="-98")
    public static class410 method5196() {
        return client.field706;
    }

    @ObfuscatedName(value="or")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="437702728")
    static void method5197(class556 class5562) {
        byte[] byArray;
        if (client.field782 != null) {
            class5562.method10275(client.field782, 0, client.field782.length);
            return;
        }
        byte[] byArray2 = new byte[24];
        try {
            int n;
            class216.field2392.method10050(0L);
            class216.field2392.method10052(byArray2);
            for (n = 0; n < 24 && byArray2[n] == 0; ++n) {
            }
            if (n >= 24) {
                throw new IOException();
            }
        }
        catch (Exception exception) {
            for (int i = 0; i < 24; ++i) {
                byArray2[i] = -1;
            }
        }
        byArray2 = byArray = byArray2;
        class5562.method10275(byArray2, 0, byArray2.length);
    }
}

