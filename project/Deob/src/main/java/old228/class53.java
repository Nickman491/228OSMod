package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cn")
public class class53
extends class514 {
    @ObfuscatedName(value="mb")
    @ObfuscatedSignature(descriptor="Lhv;")
    static class198 field338;
    @ObfuscatedName(value="mj")
    @ObfuscatedSignature(descriptor="Lcw;")
    static class67 field339;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lbo;")
    class47 field340;

    public class53() {
        this.field340 = null;
    }

    @ObfuscatedSignature(descriptor="(Lcc;)V")
    class53(class54 class546) {
        if (class546 != null) {
            this.field340 = new class47(class546, null);
            return;
        }
    }

    @ObfuscatedSignature(descriptor="(Lbc;)V")
    public class53(class40 class408) {
        this.field340 = new class47(null, class408);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="-39")
    public boolean method1117() {
        return this.field340 == null;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)Lbc;", garbageValue="1940326458")
    public class40 method1130() {
        if (this.field340 != null && this.field340.field305.tryLock()) {
            class40 class408;
            try {
                class408 = this.method1128();
            }
            finally {
                this.field340.field305.unlock();
            }
            return class408;
        }
        return null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(S)Lbc;", garbageValue="-2570")
    public class40 method1119() {
        if (this.field340 != null) {
            class40 class408;
            this.field340.field305.lock();
            try {
                class408 = this.method1128();
            }
            finally {
                this.field340.field305.unlock();
            }
            return class408;
        }
        return null;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)Lbc;", garbageValue="-1373017010")
    class40 method1128() {
        if (this.field340.field306 == null) {
            this.field340.field306 = this.field340.field304.method1140(null);
            this.field340.field304 = null;
        }
        return this.field340.field306;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;IZB)Z", garbageValue="-25")
    static boolean method1131(CharSequence charSequence, int n, boolean bl) {
        if (n < 2 || n > 36) throw new IllegalArgumentException("" + n);
        boolean bl2 = false;
        boolean bl3 = false;
        int n2 = 0;
        int n3 = charSequence.length();
        int n4 = 0;
        while (true) {
            block13: {
                block12: {
                    int n5;
                    int n6;
                    block11: {
                        if (n4 >= n3) {
                            return bl3;
                        }
                        n6 = charSequence.charAt(n4);
                        if (n4 != 0) break block11;
                        if (n6 == 45) break block12;
                        if (n6 == 43) break block13;
                    }
                    if (n6 >= 48 && n6 <= 57) {
                        n6 -= 48;
                    } else if (n6 >= 65 && n6 <= 90) {
                        n6 -= 55;
                    } else {
                        if (n6 < 97 || n6 > 122) return false;
                        n6 -= 87;
                    }
                    if (n6 >= n) {
                        return false;
                    }
                    if (bl2) {
                        n6 = -n6;
                    }
                    if ((n5 = n2 * n + n6) / n != n2) {
                        return false;
                    }
                    n2 = n5;
                    bl3 = true;
                    break block13;
                }
                bl2 = true;
            }
            ++n4;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="1825257480")
    static int method1129(int n, class81 class812, boolean bl) {
        if (n < 1000) {
            return class209.method4821(n, class812, bl);
        }
        if (n < 1100) {
            return class19.method285(n, class812, bl);
        }
        if (n < 1200) {
            return class454.method8934(n, class812, bl);
        }
        if (n < 1300) {
            return class191.method4464(n, class812, bl);
        }
        if (n < 1400) {
            return class273.method5890(n, class812, bl);
        }
        if (n < 1500) {
            return class127.method3361(n, class812, bl);
        }
        if (n < 1600) {
            return class209.method4823(n, class812, bl);
        }
        if (n < 1700) {
            return class508.method9608(n, class812, bl);
        }
        if (n < 1800) {
            return class165.method3793(n, class812, bl);
        }
        if (n < 1900) {
            return class208.method4820(n, class812, bl);
        }
        if (n < 2000) {
            return class166.method3800(n, class812, bl);
        }
        if (n < 2100) {
            return class19.method285(n, class812, bl);
        }
        if (n < 2200) {
            return class454.method8934(n, class812, bl);
        }
        if (n < 2300) {
            return class191.method4464(n, class812, bl);
        }
        if (n < 2400) {
            return class273.method5890(n, class812, bl);
        }
        if (n < 2500) {
            return class127.method3361(n, class812, bl);
        }
        if (n < 2600) {
            return class279.method5988(n, class812, bl);
        }
        if (n < 2700) {
            return class27.method426(n, class812, bl);
        }
        if (n < 2800) {
            return class45.method896(n, class812, bl);
        }
        if (n < 2900) {
            return class298.method6400(n, class812, bl);
        }
        if (n < 3000) {
            return class166.method3800(n, class812, bl);
        }
        if (n < 3200) {
            return class45.method872(n, class812, bl);
        }
        if (n < 3300) {
            return class104.method3000(n, class812, bl);
        }
        if (n < 3400) {
            return class44.method869(n, class812, bl);
        }
        if (n < 3500) {
            return class37.method726(n, class812, bl);
        }
        if (n < 3600) {
            return class30.method484(n, class812, bl);
        }
        if (n < 3700) {
            return class379.method7638(n, class812, bl);
        }
        if (n < 3800) {
            return class161.method3755(n, class812, bl);
        }
        if (n < 3900) {
            return class539.method10085(n, class812, bl);
        }
        if (n < 4000) {
            return class66.method1269(n, class812, bl);
        }
        if (n < 4100) {
            return class344.method6944(n, class812, bl);
        }
        if (n < 4200) {
            return class140.method3501(n, class812, bl);
        }
        if (n < 4300) {
            return class374.method7621(n, class812, bl);
        }
        if (n < 5100) {
            return class157.method3656(n, class812, bl);
        }
        if (n < 5400) {
            return class23.method339(n, class812, bl);
        }
        if (n < 5600) {
            return class214.method4922(n, class812, bl);
        }
        if (n < 5700) {
            return class84.method2544(n, class812, bl);
        }
        if (n < 6300) {
            return class126.method3354(n, class812, bl);
        }
        if (n < 6600) {
            return class294.method6391(n, class812, bl);
        }
        if (n < 6700) {
            return class388.method7721(n, class812, bl);
        }
        if (n < 6800) {
            return class98.method2755(n, class812, bl);
        }
        if (n < 6900) {
            return class218.method4954(n, class812, bl);
        }
        if (n < 7000) {
            return class31.method494(n, class812, bl);
        }
        if (n < 7100) {
            return class249.method5355(n, class812, bl);
        }
        if (n < 7200) {
            return class252.method5382(n, class812, bl);
        }
        if (n < 7500) {
            return class246.method5295(n, class812, bl);
        }
        if (n < 7600) {
            return class156.method3638(n, class812, bl);
        }
        if (n < 7700) {
            return class34.method549(n, class812, bl);
        }
        if (n < 8000) {
            return class28.method459(n, class812, bl);
        }
        if (n < 8100) {
            return class239.method5247(n, class812, bl);
        }
        return 2;
    }

    @ObfuscatedName(value="ly")
    @ObfuscatedSignature(descriptor="(Ldx;IIIII)V", garbageValue="-1177802429")
    static final void method1132(class94 class942, int n, int n2, int n3, int n4) {
        int n5;
        if (class942.field1145 == client.field623) {
            return;
        }
        if (client.field648.field5612 >= 400) {
            return;
        }
        String string = class942.field1127 == 0 ? class942.field1125[0] + class942.field1147 + class942.field1125[1] + class86.method2584(class942.field1136, class407.field4693.field1136) + " " + " (" + "level-" + class942.field1136 + ")" + class942.field1125[2] : class942.field1125[0] + class942.field1147 + class942.field1125[1] + " " + " (" + "skill-" + class942.field1127 + ")" + class942.field1125[2];
        if (client.field496 != 1) {
            if (!client.field522) {
                for (n5 = 7; n5 >= 0; --n5) {
                    if (client.field638[n5] == null) continue;
                    int n6 = 0;
                    if (!client.field638[n5].equalsIgnoreCase("Attack")) {
                        if (client.field639[n5]) {
                            n6 = 2000;
                        }
                    } else {
                        if (class108.field1380 == client.field759) continue;
                        if (client.field759 == class108.field1382 || class108.field1377 == client.field759 && class942.field1136 > class407.field4693.field1136) {
                            n6 = 2000;
                        }
                        if (class407.field4693.field1140 != 0 && class942.field1140 != 0) {
                            n6 = class942.field1140 == class407.field4693.field1140 ? 2000 : 0;
                        } else if (client.field759 == class108.field1378 && class942.method2663()) {
                            n6 = 2000;
                        }
                    }
                    int n7 = 0;
                    n7 = client.field637[n5] + n6;
                    class231.method5128(client.field638[n5], class97.method2752(0xFFFFFF) + string, n7, n, n2, n3, -1, false, n4);
                }
            } else if ((class106.field1365 & 8) == 8) {
                class231.method5128(client.field661, client.field662 + " " + "->" + " " + class97.method2752(0xFFFFFF) + string, 15, n, n2, n3, -1, false, n4);
            }
        } else {
            class231.method5128("Use", client.field570 + " " + "->" + " " + class97.method2752(0xFFFFFF) + string, 14, n, n2, n3, -1, false, n4);
        }
        n5 = 0;
        while (true) {
            block21: {
                block20: {
                    if (n5 >= client.field648.field5612) break block20;
                    if (client.field648.field5614[n5] != 23) break block21;
                    client.field648.field5619[n5] = class97.method2752(0xFFFFFF) + string;
                }
                return;
            }
            ++n5;
        }
    }

    @ObfuscatedName(value="mg")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1410523996")
    static void method1124(int n) {
        class318.field3302 = new class76();
        class318.field3302.field914 = client.field648.field5622[n];
        class318.field3302.field911 = client.field648.field5613[n];
        class318.field3302.field906 = client.field648.field5614[n];
        class318.field3302.field904 = client.field648.field5615[n];
        class318.field3302.field908 = client.field648.field5616[n];
        class318.field3302.field910 = client.field648.field5618[n];
        class318.field3302.field907 = client.field648.field5619[n];
        class318.field3302.field909 = client.field648.field5617[n];
        class318.field3302.field912 = client.field648.field5628[n];
    }

    @ObfuscatedName(value="nd")
    @ObfuscatedSignature(descriptor="(IIIILvf;Lnf;I)V", garbageValue="-985042487")
    static final void method1133(int n, int n2, int n3, int n4, class570 class5702, class348 class3482) {
        int n5 = n4 * n4 + n3 * n3;
        if (n5 > 4225 && n5 < 90000) {
            int n6 = client.field503 & 0x7FF;
            int n7 = class182.field1954[n6];
            int n8 = class182.field1955[n6];
            int n9 = n8 * n3 + n4 * n7 >> 16;
            int n10 = n4 * n8 - n7 * n3 >> 16;
            double d = Math.atan2(n9, n10);
            int n11 = class3482.field3754 / 2 - 25;
            int n12 = (int)(Math.sin(d) * (double)n11);
            int n13 = (int)(Math.cos(d) * (double)n11);
            int n14 = 20;
            class213.field2371.method10761(n12 + (n + class3482.field3754 / 2 - n14 / 2), class3482.field3753 / 2 + n2 - n14 / 2 - n13 - 10, n14, n14, 15, 15, d, 256);
        } else {
            class526.method9936(n, n2, n3, n4, class5702, class3482);
        }
    }
}

