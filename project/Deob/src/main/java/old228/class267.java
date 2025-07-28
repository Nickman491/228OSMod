package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kt")
public class class267
implements class29 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lna;")
    class361 field2966 = null;
    @ObfuscatedName(value="ah")
    boolean field2961 = false;
    @ObfuscatedName(value="az")
    boolean field2962 = false;

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-458319724")
    public boolean vmethod5756(int n) {
        if (this.field2966 == null) {
            return false;
        }
        class27 class276 = this.field2966.method7535();
        if (class276 == null) {
            return false;
        }
        if (class276.method412(n)) {
            switch (n) {
                case 82: {
                    this.field2961 = true;
                    break;
                }
                case 81: {
                    this.field2962 = true;
                    break;
                }
                default: {
                    if (!this.method5752(n)) break;
                    class122.method3325(this.field2966);
                }
            }
        }
        return class276.method406(n);
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="0")
    public boolean vmethod5757(int n) {
        switch (n) {
            default: {
                return false;
            }
            case 81: {
                this.field2962 = false;
                return false;
            }
            case 82: 
        }
        this.field2961 = false;
        return false;
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(CI)Z", garbageValue="804434279")
    public boolean vmethod5758(char c) {
        if (this.field2966 == null) {
            return false;
        }
        if (!class59.method1203(c)) {
            return false;
        }
        class359 class3592 = this.field2966.method7444();
        if (class3592 != null && class3592.method7276()) {
            class27 class276 = this.field2966.method7535();
            if (class276 == null) {
                return false;
            }
            if (class276.method413(c) && class3592.method7146(c)) {
                class122.method3325(this.field2966);
            }
            return class276.method411(c);
        }
        return false;
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(ZI)Z", garbageValue="1360179052")
    public boolean vmethod5764(boolean bl) {
        return false;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Lna;B)V", garbageValue="-10")
    public void method5727(class361 class3612) {
        if (class3612 == null) {
            this.method5738();
        } else {
            class357 class3572;
            if (class3612 != this.field2966) {
                this.method5738();
                this.field2966 = class3612;
            }
            if ((class3572 = class3612.method7447()) != null) {
                if (!class3572.field3801.method7221() && class3572.field3803 != null) {
                    class90 class902 = new class90();
                    class902.method2628(class3612);
                    class902.method2630(class3572.field3803);
                    class236.method5196().method7998(class902);
                }
                class3572.field3801.method7129(true);
            }
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)Lna;", garbageValue="-1925559873")
    public class361 method5728() {
        return this.field2966;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-4397062")
    public void method5738() {
        if (this.field2966 == null) {
            return;
        }
        class357 class3572 = this.field2966.method7447();
        class361 class3612 = this.field2966;
        this.field2966 = null;
        if (class3572 == null) {
            return;
        }
        if (class3572.field3801.method7221() && class3572.field3803 != null) {
            class90 class902 = new class90();
            class902.method2628(class3612);
            class902.method2630(class3572.field3803);
            class236.method5196().method7998(class902);
        }
        class3572.field3801.method7129(false);
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="187447019")
    boolean method5752(int n) {
        if (this.field2966 == null) {
            return false;
        }
        class359 class3592 = this.field2966.method7444();
        if (class3592 != null && class3592.method7276()) {
            switch (n) {
                default: {
                    return false;
                }
                case 84: {
                    if (class3592.method7191() != 0) {
                        if (this.field2962 && class3592.method7195()) {
                            class3592.method7146(10);
                        } else {
                            class357 class3572 = this.field2966.method7447();
                            class90 class902 = new class90();
                            class902.method2628(this.field2966);
                            class902.method2630(class3572.field3805);
                            class236.method5196().method7998(class902);
                            this.method5738();
                        }
                    } else {
                        class3592.method7146(10);
                    }
                    return true;
                }
                case 103: {
                    if (!this.field2961) {
                        class3592.method7155(this.field2962);
                    } else {
                        class3592.method7137(this.field2962);
                    }
                    return true;
                }
                case 102: {
                    if (!this.field2961) {
                        class3592.method7332(this.field2962);
                    } else {
                        class3592.method7290(this.field2962);
                    }
                    return true;
                }
                case 105: {
                    if (!this.field2961) {
                        class3592.method7165(this.field2962);
                    } else {
                        class3592.method7260(this.field2962);
                    }
                    return true;
                }
                case 85: {
                    if (!this.field2961) {
                        class3592.method7228();
                    } else {
                        class3592.method7201();
                    }
                    return true;
                }
                case 96: {
                    if (!this.field2961) {
                        class3592.method7220(this.field2962);
                    } else {
                        class3592.method7160(this.field2962);
                    }
                    return true;
                }
                case 97: {
                    if (!this.field2961) {
                        class3592.method7194(this.field2962);
                    } else {
                        class3592.method7161(this.field2962);
                    }
                    return true;
                }
                case 65: {
                    if (this.field2961) {
                        class3592.method7171(class421.method8239());
                    }
                    return true;
                }
                case 66: {
                    if (this.field2961) {
                        class3592.method7170(class421.method8239());
                    }
                    return true;
                }
                case 48: {
                    if (this.field2961) {
                        class3592.method7152();
                    }
                    return true;
                }
                case 67: {
                    if (this.field2961) {
                        class3592.method7172(class421.method8239());
                    }
                    return true;
                }
                case 13: {
                    this.method5738();
                    return true;
                }
                case 98: {
                    if (!this.field2961) {
                        class3592.method7162(this.field2962);
                    } else {
                        class3592.method7173();
                    }
                    return true;
                }
                case 104: {
                    if (!this.field2961) {
                        class3592.method7164(this.field2962);
                    } else {
                        class3592.method7166(this.field2962);
                    }
                    return true;
                }
                case 99: {
                    if (!this.field2961) {
                        class3592.method7163(this.field2962);
                    } else {
                        class3592.method7174();
                    }
                    return true;
                }
                case 101: 
            }
            if (!this.field2961) {
                class3592.method7281();
            } else {
                class3592.method7150();
            }
            return true;
        }
        return false;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;Lpq;Lth;ZII)V", garbageValue="-892928212")
    static void method5753(class391 class3912, class391 class3913, class494 class4942, boolean bl, int n) {
        if (!class78.field937) {
            if (n != 0) {
                class114.method3212(n);
            } else {
                class486.method9400(bl);
            }
            class566.method10609();
            byte[] byArray = class3912.method7749("title.jpg", "");
            class292.field3195 = class395.method7878(byArray);
            class479.field5025 = class292.field3195.method10819();
            int n2 = client.field569;
            class78.field923 = (n2 & class552.field5431.vmethod10703()) == 0 ? ((n2 & class552.field5456.vmethod10703()) == 0 ? ((n2 & class552.field5441.vmethod10703()) == 0 ? class108.method3097(class3913, "logo", "") : class108.method3097(class3913, "logo_speedrunning", "")) : class108.method3097(class3913, "logo_seasonal_mode", "")) : class108.method3097(class3913, "logo_deadman_mode", "");
            class78.field921 = class108.method3097(class3913, "titlebox", "");
            class454.field4897 = class108.method3097(class3913, "titlebutton", "");
            class78.field953 = class108.method3097(class3913, "titlebutton_large", "");
            class418.field4715 = class108.method3097(class3913, "play_now_text", "");
            class108.method3097(class3913, "titlebutton_wide42,1", "");
            class538.field5379 = class319.method6611(class3913, "runes", "");
            class169.field1801 = class319.method6611(class3913, "title_mute", "");
            class78.field920 = class108.method3097(class3913, "options_radio_buttons,0", "");
            class157.field1724 = class108.method3097(class3913, "options_radio_buttons,4", "");
            class472.field4992 = class108.method3097(class3913, "options_radio_buttons,2", "");
            class112.field1414 = class108.method3097(class3913, "options_radio_buttons,6", "");
            class473.field5001 = class78.field920.field5567;
            URLLoader.field1461 = class78.field920.field5564;
            class461.field4948 = new class101(class538.field5379, class4942.field5101);
            if (bl) {
                class78.field955 = "";
                class78.field940 = "";
                class78.field922 = new String[8];
                class78.field941 = 0;
            }
            class326.field3592 = 0;
            class480.field5036 = "";
            class78.field946 = true;
            class78.field950 = false;
            class106.method3078();
            class153.method3619();
            class122.method3320().method7823(false);
            class78.field937 = true;
            class78.field918 = (class128.field1521 - 765) / 2;
            class78.field925 = class78.field918 + 202;
            class125.field1507 = class78.field925 + 180;
            class292.field3195.method10741(class78.field918, 0);
            class479.field5025.method10741(class78.field918 + 382, 0);
            class78.field923.method10710(class78.field918 + 382 - class78.field923.field5567 / 2, 18);
            return;
        }
        if (n == 4) {
            class114.method3212(4);
        }
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-594909621")
    public static void method5746(boolean bl) {
        if (bl != class307.field3282) {
            ItemDef.field2889.method6581();
            ItemDef.field2862.method6581();
            ItemDef.field2849.method6581();
            class307.field3282 = bl;
        }
    }
}

