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

@ObfuscatedName(value="jq")
public class class252
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    static class391 field2696;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpq;")
    static class391 field2700;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static class315 field2690;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static class315 field2691;
    @ObfuscatedName(value="fg")
    @ObfuscatedSignature(descriptor="Lok;")
    static class388 field2704;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1301972745)
    int field2692;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=141562829)
    int field2694;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=425218609)
    public int field2703 = -1;
    @ObfuscatedName(value="ax")
    short[] field2699;
    @ObfuscatedName(value="at")
    short[] field2689;
    @ObfuscatedName(value="ac")
    short[] field2697;
    @ObfuscatedName(value="au")
    short[] field2695;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-2104753871)
    int field2693 = 128;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=1879181871)
    int field2698 = 128;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-1758727787)
    int field2701 = 0;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-940508089)
    int field2702 = 0;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=1250873071)
    int field2688 = 0;

    static {
        field2690 = new class315(64);
        field2691 = new class315(30);
    }

    class252() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="1007662088")
    void method5362(class556 class5562) {
        int n;
        while ((n = class5562.method10282()) != 0) {
            this.method5380(class5562, n);
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="-1457934063")
    void method5380(class556 class5562, int n) {
        if (n == 1) {
            this.field2694 = class5562.method10307();
            return;
        }
        if (n == 2) {
            this.field2703 = class5562.method10307();
            return;
        }
        if (n == 4) {
            this.field2693 = class5562.method10307();
            return;
        }
        if (n == 5) {
            this.field2698 = class5562.method10307();
            return;
        }
        if (n == 6) {
            this.field2701 = class5562.method10307();
            return;
        }
        if (n == 7) {
            this.field2702 = class5562.method10282();
            return;
        }
        if (n == 8) {
            this.field2688 = class5562.method10282();
            return;
        }
        if (n != 40) {
            if (n != 41) return;
            int n2 = class5562.method10282();
            this.field2697 = new short[n2];
            this.field2695 = new short[n2];
            int n3 = 0;
            while (n3 < n2) {
                this.field2697[n3] = (short)class5562.method10307();
                this.field2695[n3] = (short)class5562.method10307();
                ++n3;
            }
            return;
        }
        int n4 = class5562.method10282();
        this.field2699 = new short[n4];
        this.field2689 = new short[n4];
        int n5 = 0;
        while (n5 < n4) {
            this.field2699[n5] = (short)class5562.method10307();
            this.field2689[n5] = (short)class5562.method10307();
            ++n5;
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(II)Lhv;", garbageValue="-1427565975")
    public final class198 method5381(int n) {
        class198 class1982 = this.method5365();
        if (class1982 == null) {
            return null;
        }
        class198 class1983 = this.field2703 != -1 && n != -1 ? class33.method520(this.field2703).method5698(class1982, n) : class1982.method4652(true);
        if (this.field2693 != 128 || this.field2698 != 128) {
            class1983.method4618(this.field2693, this.field2698, this.field2693);
        }
        if (this.field2701 != 0) {
            if (this.field2701 == 90) {
                class1983.method4545();
            }
            if (this.field2701 == 180) {
                class1983.method4545();
                class1983.method4545();
            }
            if (this.field2701 == 270) {
                class1983.method4545();
                class1983.method4545();
                class1983.method4545();
            }
        }
        return class1983;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(B)Lhv;", garbageValue="121")
    public final class198 method5365() {
        class198 class1982 = (class198)field2691.method6578(this.field2692);
        if (class1982 == null) {
            int n;
            class177 class1772 = class177.method3919(field2700, this.field2694, 0);
            if (class1772 == null) {
                return null;
            }
            if (this.field2699 != null) {
                for (n = 0; n < this.field2699.length; ++n) {
                    class1772.method3909(this.field2699[n], this.field2689[n]);
                }
            }
            if (this.field2697 != null) {
                for (n = 0; n < this.field2697.length; ++n) {
                    class1772.method3961(this.field2697[n], this.field2695[n]);
                }
            }
            class1982 = class1772.method3917(this.field2702 + 64, this.field2688 + 850, -30, -50, -30);
            field2691.method6590(class1982, this.field2692);
        }
        return class1982;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1699365126")
    public static void method5377() {
        class257.field2735.method6581();
    }

    @ObfuscatedName(value="bn")
    @ObfuscatedSignature(descriptor="(ILdm;ZB)I", garbageValue="-13")
    static int method5382(int n, class81 class812, boolean bl) {
        if (n != 7108) {
            return 2;
        }
        class72.field865[++class63.field444 - 1] = class186.method4171() ? 1 : 0;
        return 1;
    }

    @ObfuscatedName(value="ix")
    @ObfuscatedSignature(descriptor="(Lda;I)V", garbageValue="-401614943")
    static final void method5375(class99 class992) {
        Object object;
        class992.field1206 = false;
        if (class992.field1238 != -1) {
            object = class33.method520(class992.field1238);
            if (object == null) {
                class992.field1238 = -1;
            } else if (!((SequenceDef)object).method5672() && ((SequenceDef)object).field2916 != null) {
                ++class992.field1226;
                if (class992.field1237 < ((SequenceDef)object).field2916.length && class992.field1226 > ((SequenceDef)object).field2923[class992.field1237]) {
                    class992.field1226 = 1;
                    class271.method5839((SequenceDef)object, ++class992.field1237, class992.field1213, class992.field1196, class407.field4693 == class992);
                }
                if (class992.field1237 >= ((SequenceDef)object).field2916.length) {
                    if (((SequenceDef)object).field2932 <= 0) {
                        class992.field1226 = 0;
                        class992.field1237 = 0;
                    } else {
                        class992.field1237 -= ((SequenceDef)object).field2932;
                        if (((SequenceDef)object).field2940) {
                            ++class992.field1239;
                        }
                        if (class992.field1237 < 0 || class992.field1237 >= ((SequenceDef)object).field2916.length || ((SequenceDef)object).field2940 && class992.field1239 >= ((SequenceDef)object).field2936) {
                            class992.field1226 = 0;
                            class992.field1237 = 0;
                            class992.field1239 = 0;
                        }
                    }
                    class271.method5839((SequenceDef)object, class992.field1237, class992.field1213, class992.field1196, class407.field4693 == class992);
                }
            } else if (!((SequenceDef)object).method5672()) {
                class992.field1238 = -1;
            } else {
                ++class992.field1237;
                int n = ((SequenceDef)object).method5703();
                if (class992.field1237 >= n) {
                    if (((SequenceDef)object).field2932 <= 0) {
                        class992.field1226 = 0;
                        class992.field1237 = 0;
                    } else {
                        class992.field1237 -= ((SequenceDef)object).field2932;
                        if (((SequenceDef)object).field2940) {
                            ++class992.field1239;
                        }
                        if (class992.field1237 < 0 || class992.field1237 >= n || ((SequenceDef)object).field2940 && class992.field1239 >= ((SequenceDef)object).field2936) {
                            class992.field1237 = 0;
                            class992.field1226 = 0;
                            class992.field1239 = 0;
                        }
                    }
                    class271.method5839((SequenceDef)object, class992.field1237, class992.field1213, class992.field1196, class407.field4693 == class992);
                } else {
                    class271.method5839((SequenceDef)object, class992.field1237, class992.field1213, class992.field1196, class407.field4693 == class992);
                }
            }
        }
        object = new class528(class992.method2810());
        class514 class5142 = (class485)((class528)object).method9951();
        while (true) {
            int n;
            if (class5142 == null) {
                if (class992.field1240 != -1 && class992.field1271 <= 1) {
                    class5142 = class33.method520(class992.field1240);
                    if (((SequenceDef)class5142).field2941 == 1 && class992.field1270 > 0 && class992.field1263 <= client.field514 && class992.field1199 < client.field514) {
                        class992.field1271 = 1;
                        return;
                    }
                }
                if (class992.field1240 != -1 && class992.field1271 == 0) {
                    class5142 = class33.method520(class992.field1240);
                    if (class5142 == null) {
                        class992.field1240 = -1;
                    } else if (!((SequenceDef)class5142).method5672() && ((SequenceDef)class5142).field2916 != null) {
                        ++class992.field1242;
                        if (class992.field1241 < ((SequenceDef)class5142).field2916.length && class992.field1242 > ((SequenceDef)class5142).field2923[class992.field1241]) {
                            class992.field1242 = 1;
                            class271.method5839((SequenceDef)class5142, ++class992.field1241, class992.field1213, class992.field1196, class407.field4693 == class992);
                        }
                        if (class992.field1241 >= ((SequenceDef)class5142).field2916.length) {
                            class992.field1241 -= ((SequenceDef)class5142).field2932;
                            ++class992.field1244;
                            if (class992.field1244 < ((SequenceDef)class5142).field2936) {
                                if (class992.field1241 >= 0 && class992.field1241 < ((SequenceDef)class5142).field2916.length) {
                                    class271.method5839((SequenceDef)class5142, class992.field1241, class992.field1213, class992.field1196, class407.field4693 == class992);
                                } else {
                                    class992.field1240 = -1;
                                }
                            } else {
                                class992.field1240 = -1;
                            }
                        }
                        class992.field1206 = ((SequenceDef)class5142).field2935;
                    } else if (!((SequenceDef)class5142).method5672()) {
                        class992.field1240 = -1;
                    } else {
                        ++class992.field1241;
                        n = ((SequenceDef)class5142).method5703();
                        if (class992.field1241 >= n) {
                            class992.field1241 -= ((SequenceDef)class5142).field2932;
                            ++class992.field1244;
                            if (class992.field1244 < ((SequenceDef)class5142).field2936) {
                                if (class992.field1241 >= 0 && class992.field1241 < n) {
                                    class271.method5839((SequenceDef)class5142, class992.field1241, class992.field1213, class992.field1196, class407.field4693 == class992);
                                } else {
                                    class992.field1240 = -1;
                                }
                            } else {
                                class992.field1240 = -1;
                            }
                        } else {
                            class271.method5839((SequenceDef)class5142, class992.field1241, class992.field1213, class992.field1196, class407.field4693 == class992);
                        }
                    }
                }
                if (class992.field1271 > 0) {
                    --class992.field1271;
                }
                return;
            }
            if (((class485)class5142).field5056 != -1 && client.field514 >= ((class485)class5142).field5051) {
                n = ObjectDef.method5541((int)((class485)class5142).field5056).field2703;
                if (n != -1) {
                    ((class485)class5142).field5052 = Math.max(((class485)class5142).field5052, 0);
                    SequenceDef class2652 = class33.method520(n);
                    if (class2652.field2916 != null && !class2652.method5672()) {
                        ++((class485)class5142).field5053;
                        if (((class485)class5142).field5052 < class2652.field2916.length && ((class485)class5142).field5053 > class2652.field2923[((class485)class5142).field5052]) {
                            ((class485)class5142).field5053 = 1;
                            class271.method5839(class2652, ++((class485)class5142).field5052, class992.field1213, class992.field1196, class407.field4693 == class992);
                        }
                        if (((class485)class5142).field5052 >= class2652.field2916.length) {
                            class5142.method9623();
                            --class992.field1246;
                        }
                    } else if (!class2652.method5672()) {
                        class5142.method9623();
                        --class992.field1246;
                    } else {
                        ++((class485)class5142).field5052;
                        int n2 = class2652.method5703();
                        if (((class485)class5142).field5052 >= n2) {
                            class5142.method9623();
                            --class992.field1246;
                        } else {
                            class271.method5839(class2652, ((class485)class5142).field5052, class992.field1213, class992.field1196, class407.field4693 == class992);
                        }
                    }
                } else {
                    class5142.method9623();
                    --class992.field1246;
                }
            }
            class5142 = (class485)((class528)object).next();
        }
    }
}

