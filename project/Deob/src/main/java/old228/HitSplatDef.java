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

@ObfuscatedName(value="kd")
public class HitSplatDef
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    static class391 field2778;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpq;")
    static class391 field2751;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lpq;")
    static class391 field2752;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static class315 field2753;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static class315 field2754;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static class315 field2765;
    @ObfuscatedName(value="ft")
    @ObfuscatedSignature(descriptor="Lok;")
    static class388 field2777;
    @ObfuscatedName(value="vc")
    @ObfuscatedSignature(descriptor="Lpa;")
    static class392 field2760;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=1508234575)
    int field2766 = -1;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-1584396285)
    public int field2761 = 0xFFFFFF;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-1551936187)
    public int field2773 = 70;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-1841557453)
    int field2758 = -1;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-425735521)
    int field2762 = -1;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=271682969)
    int field2763 = -1;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=1963234727)
    int field2767 = -1;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=1270620965)
    public int field2757 = 0;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=-1979431219)
    public int field2759 = 0;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=768545391)
    public int field2764 = -1;
    @ObfuscatedName(value="ar")
    String field2768 = "";
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=-751369181)
    public int field2769 = -1;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=2052084467)
    public int field2770 = 0;
    @ObfuscatedName(value="ab")
    public int[] field2771;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-390406083)
    int field2772 = -1;
    @ObfuscatedName(value="bu")
    @ObfuscatedGetter(intValue=2112634023)
    int field2755 = -1;

    static {
        field2753 = new class315(64);
        field2754 = new class315(64);
        field2765 = new class315(20);
    }

    HitSplatDef() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-239192483")
    void method5474(class556 class5562) {
        int n;
        while ((n = class5562.method10282()) != 0) {
            this.method5504(class5562, n);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="2033650103")
    void method5504(class556 class5562, int n) {
        if (n == 1) {
            this.field2766 = class5562.method10476();
            return;
        }
        if (n == 2) {
            this.field2761 = class5562.method10285();
            return;
        }
        if (n == 3) {
            this.field2758 = class5562.method10476();
            return;
        }
        if (n == 4) {
            this.field2763 = class5562.method10476();
            return;
        }
        if (n == 5) {
            this.field2762 = class5562.method10476();
            return;
        }
        if (n == 6) {
            this.field2767 = class5562.method10476();
            return;
        }
        if (n == 7) {
            this.field2757 = class5562.method10284();
            return;
        }
        if (n == 8) {
            this.field2768 = class5562.method10291();
            return;
        }
        if (n == 9) {
            this.field2773 = class5562.method10307();
            return;
        }
        if (n == 10) {
            this.field2759 = class5562.method10284();
            return;
        }
        if (n == 11) {
            this.field2764 = 0;
            return;
        }
        if (n == 12) {
            this.field2769 = class5562.method10282();
            return;
        }
        if (n == 13) {
            this.field2770 = class5562.method10284();
            return;
        }
        if (n == 14) {
            this.field2764 = class5562.method10307();
            return;
        }
        if (n != 17 && n != 18) return;
        this.field2772 = class5562.method10307();
        if (this.field2772 == 65535) {
            this.field2772 = -1;
        }
        this.field2755 = class5562.method10307();
        if (this.field2755 == 65535) {
            this.field2755 = -1;
        }
        int n2 = -1;
        if (n == 18 && (n2 = class5562.method10307()) == 65535) {
            n2 = -1;
        }
        int n3 = class5562.method10282();
        this.field2771 = new int[n3 + 2];
        int n4 = 0;
        while (true) {
            if (n4 > n3) {
                this.field2771[n3 + 1] = n2;
                return;
            }
            this.field2771[n4] = class5562.method10307();
            if (this.field2771[n4] == 65535) {
                this.field2771[n4] = -1;
            }
            ++n4;
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)Lkd;", garbageValue="1483625755")
    public final HitSplatDef method5480() {
        int n = -1;
        if (this.field2772 != -1) {
            n = class77.method2368(this.field2772);
        } else if (this.field2755 != -1) {
            n = class349.field3763[this.field2755];
        }
        int n2 = n >= 0 && n < this.field2771.length - 1 ? this.field2771[n] : this.field2771[this.field2771.length - 1];
        if (n2 != -1) {
            return class183.method4104(n2);
        }
        return null;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IB)Ljava/lang/String;", garbageValue="-1")
    public String method5477(int n) {
        String string = this.field2768;
        int n2;
        while ((n2 = string.indexOf("%1")) >= 0) {
            string = string.substring(0, n2) + class385.method7659(n, false) + string.substring(n2 + 2);
        }
        return string;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)Lvf;", garbageValue="-1228108972")
    public class570 method5475() {
        if (this.field2758 < 0) {
            return null;
        }
        class570 class5702 = (class570)field2754.method6578(this.field2758);
        if (class5702 != null) {
            return class5702;
        }
        class5702 = class83.method2509(field2751, this.field2758, 0);
        if (class5702 != null) {
            field2754.method6590(class5702, this.field2758);
        }
        return class5702;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)Lvf;", garbageValue="1188272615")
    public class570 method5496() {
        if (this.field2762 < 0) {
            return null;
        }
        class570 class5702 = (class570)field2754.method6578(this.field2762);
        if (class5702 != null) {
            return class5702;
        }
        class5702 = class83.method2509(field2751, this.field2762, 0);
        if (class5702 != null) {
            field2754.method6590(class5702, this.field2762);
        }
        return class5702;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)Lvf;", garbageValue="1647383178")
    public class570 method5490() {
        if (this.field2763 < 0) {
            return null;
        }
        class570 class5702 = (class570)field2754.method6578(this.field2763);
        if (class5702 != null) {
            return class5702;
        }
        class5702 = class83.method2509(field2751, this.field2763, 0);
        if (class5702 != null) {
            field2754.method6590(class5702, this.field2763);
        }
        return class5702;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(I)Lvf;", garbageValue="1310089348")
    public class570 method5481() {
        if (this.field2767 < 0) {
            return null;
        }
        class570 class5702 = (class570)field2754.method6578(this.field2767);
        if (class5702 != null) {
            return class5702;
        }
        class5702 = class83.method2509(field2751, this.field2767, 0);
        if (class5702 != null) {
            field2754.method6590(class5702, this.field2767);
        }
        return class5702;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(I)Lqw;", garbageValue="-1075044673")
    public class435 method5482() {
        class435 class4352;
        if (this.field2766 == -1) {
            return null;
        }
        class435 class4353 = (class435)field2765.method6578(this.field2766);
        if (class4353 != null) {
            return class4353;
        }
        class391 class3912 = field2751;
        class391 class3913 = field2752;
        int n = this.field2766;
        if (class296.method6397(class3912, n, 0)) {
            class435 class4354;
            byte[] byArray = class3913.method7790(n, 0);
            if (byArray != null) {
                class435 class4355 = new class435(byArray, class241.field2585, class571.field5583, class571.field5584, class403.field4657, class25.field108, class240.field2580);
                class241.field2585 = null;
                class571.field5583 = null;
                class571.field5584 = null;
                class403.field4657 = null;
                class25.field108 = null;
                class240.field2580 = null;
                class4354 = class4355;
            } else {
                class4354 = null;
            }
            class4352 = class4354;
        } else {
            class4352 = null;
        }
        class4353 = class4352;
        if (class4353 != null) {
            field2765.method6590(class4353, this.field2766);
        }
        return class4353;
    }
}

