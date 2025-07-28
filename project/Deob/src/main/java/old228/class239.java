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

@ObfuscatedName(value="jc")
public class class239
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    static class391 field2571;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpq;")
    static class391 field2572;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lmi;")
    static class315 field2566;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lmi;")
    static class315 field2567;
    @ObfuscatedName(value="jr")
    static int[] field2578;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=1735350197)
    public int field2568;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=849378789)
    public int field2569 = 255;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=437889605)
    public int field2570 = 255;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=798558681)
    public int field2574 = -1;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-1254299183)
    public int field2565 = 1;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=566914995)
    public int field2573 = 70;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=683773839)
    int field2576 = -1;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-1171934191)
    int field2564 = -1;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=1397526847)
    public int field2575 = 30;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=714006507)
    public int field2577 = 0;

    static {
        field2566 = new class315(64);
        field2567 = new class315(64);
    }

    class239() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="163483323")
    void method5229(class556 class5562) {
        int n;
        while ((n = class5562.method10282()) != 0) {
            this.method5230(class5562, n);
        }
        return;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;IB)V", garbageValue="-95")
    void method5230(class556 class5562, int n) {
        if (n != 1) {
            if (n == 2) {
                this.field2569 = class5562.method10282();
            } else if (n == 3) {
                this.field2570 = class5562.method10282();
            } else if (n == 4) {
                this.field2574 = 0;
            } else if (n == 5) {
                this.field2573 = class5562.method10307();
            } else if (n != 6) {
                if (n == 7) {
                    this.field2576 = class5562.method10476();
                } else if (n == 8) {
                    this.field2564 = class5562.method10476();
                } else if (n == 11) {
                    this.field2574 = class5562.method10307();
                } else if (n == 14) {
                    this.field2575 = class5562.method10282();
                } else if (n == 15) {
                    this.field2577 = class5562.method10282();
                }
            } else {
                class5562.method10282();
            }
        } else {
            class5562.method10307();
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)Lvf;", garbageValue="1179546533")
    public class570 method5239() {
        if (this.field2576 < 0) {
            return null;
        }
        class570 class5702 = (class570)field2567.method6578(this.field2576);
        if (class5702 != null) {
            return class5702;
        }
        class5702 = class83.method2509(field2572, this.field2576, 0);
        if (class5702 != null) {
            field2567.method6590(class5702, this.field2576);
        }
        return class5702;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)Lvf;", garbageValue="-1979105144")
    public class570 method5232() {
        if (this.field2564 < 0) {
            return null;
        }
        class570 class5702 = (class570)field2567.method6578(this.field2564);
        if (class5702 != null) {
            return class5702;
        }
        class5702 = class83.method2509(field2572, this.field2564, 0);
        if (class5702 != null) {
            field2567.method6590(class5702, this.field2564);
        }
        return class5702;
    }

    @ObfuscatedName(value="cc")
    @ObfuscatedSignature(descriptor="(ILdm;ZB)I", garbageValue="63")
    static int method5247(int n, class81 class812, boolean bl) {
        if (n != 8000) {
            if (n != 8001) {
                return 2;
            }
            int n2 = class72.field865[class63.field444 -= 3];
            int n3 = class72.field865[class63.field444 + 1];
            int n4 = class72.field865[class63.field444 + 2];
            int n5 = class72.field852[n2];
            if (n5 <= 1) {
                return 1;
            }
            class451.method8899(class72.field853[n2], n5, n3, n4);
            return 1;
        }
        int n6 = class72.field865[--class63.field444];
        int n7 = class72.field852[n6];
        class515.method9651(class72.field853[n6], new int[n7], 0, n7 - 1);
        return 1;
    }
}

