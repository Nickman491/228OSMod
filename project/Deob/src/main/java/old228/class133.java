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

@ObfuscatedName(value="fc")
public class class133 {
    @ObfuscatedName(value="eu")
    @ObfuscatedGetter(longValue=-3173905978490896003L)
    static long field1548;
    @ObfuscatedName(value="ia")
    @ObfuscatedGetter(intValue=1178667793)
    static int field1554;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=426911859)
    public final int field1553;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lfc;")
    public class133 field1541;
    @ObfuscatedName(value="az")
    float[][] field1546;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="[Lqe;")
    final class428[] field1543;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="[Lqe;")
    class428[] field1544;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="[Lqe;")
    class428[] field1545;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lqe;")
    class428 field1540 = new class428();
    @ObfuscatedName(value="ax")
    boolean field1547 = true;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lqe;")
    class428 field1542 = new class428();
    @ObfuscatedName(value="ac")
    boolean field1549 = true;
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Lqe;")
    class428 field1550 = new class428();
    @ObfuscatedName(value="as")
    float[][] field1556;
    @ObfuscatedName(value="aq")
    float[][] field1551;
    @ObfuscatedName(value="af")
    float[][] field1552;

    @ObfuscatedSignature(descriptor="(ILvy;Z)V")
    public class133(int n, class556 class5562, boolean bl) {
        this.field1553 = class5562.method10284();
        this.field1543 = new class428[n];
        this.field1544 = new class428[this.field1543.length];
        this.field1545 = new class428[this.field1543.length];
        this.field1546 = new float[this.field1543.length][3];
        int n2 = 0;
        while (true) {
            if (n2 >= this.field1543.length) {
                this.method3396();
                return;
            }
            this.field1543[n2] = new class428(class5562, bl);
            this.field1546[n2][0] = class5562.method10302();
            this.field1546[n2][1] = class5562.method10302();
            this.field1546[n2][2] = class5562.method10302();
            ++n2;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="2110556102")
    void method3396() {
        this.field1556 = new float[this.field1543.length][3];
        this.field1551 = new float[this.field1543.length][3];
        this.field1552 = new float[this.field1543.length][3];
        class428 class4282 = class293.method6389();
        int n = 0;
        while (true) {
            if (n >= this.field1543.length) {
                class4282.method8373();
                return;
            }
            class428 class4283 = this.method3397(n);
            class4282.method8374(class4283);
            class4282.method8383();
            this.field1556[n] = class4282.method8406();
            this.field1551[n][0] = class4283.field4761[12];
            this.field1551[n][1] = class4283.field4761[13];
            this.field1551[n][2] = class4283.field4761[14];
            this.field1552[n] = class4283.method8391();
            ++n;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)Lqe;", garbageValue="64")
    class428 method3397(int n) {
        return this.field1543[n];
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)Lqe;", garbageValue="-2146983541")
    class428 method3437(int n) {
        if (this.field1544[n] == null) {
            this.field1544[n] = new class428(this.method3397(n));
            if (this.field1541 == null) {
                this.field1544[n].method8389(class428.field4762);
            } else {
                this.field1544[n].method8389(this.field1541.method3437(n));
            }
        }
        return this.field1544[n];
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(II)Lqe;", garbageValue="-1015358600")
    class428 method3425(int n) {
        if (this.field1545[n] == null) {
            this.field1545[n] = new class428(this.method3437(n));
            this.field1545[n].method8383();
        }
        return this.field1545[n];
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lqe;I)V", garbageValue="-1079733838")
    void method3400(class428 class4282) {
        this.field1540.method8374(class4282);
        this.field1547 = true;
        this.field1549 = true;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(B)Lqe;", garbageValue="68")
    class428 method3401() {
        return this.field1540;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)Lqe;", garbageValue="-950874663")
    class428 method3398() {
        if (this.field1547) {
            this.field1542.method8374(this.method3401());
            if (this.field1541 != null) {
                this.field1542.method8389(this.field1541.method3398());
            }
            this.field1547 = false;
        }
        return this.field1542;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(II)Lqe;", garbageValue="370449324")
    public class428 method3403(int n) {
        if (this.field1549) {
            this.field1550.method8374(this.method3425(n));
            this.field1550.method8389(this.method3398());
            this.field1549 = false;
        }
        return this.field1550;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(II)[F", garbageValue="-1186746109")
    float[] method3402(int n) {
        return this.field1556[n];
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(II)[F", garbageValue="-1901188305")
    float[] method3410(int n) {
        return this.field1551[n];
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(II)[F", garbageValue="-1731594469")
    float[] method3406(int n) {
        return this.field1552[n];
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIIIIIB)I", garbageValue="24")
    public static int method3426(int n, int n2, int n3, int n4, int n5, int n6) {
        if ((n6 & 1) == 1) {
            int n7 = n4;
            n4 = n5;
            n5 = n7;
        }
        if ((n3 &= 3) == 0) {
            return n;
        }
        if (n3 == 1) {
            return n2;
        }
        if (n3 == 2) {
            return 7 - n - (n4 - 1);
        }
        return 7 - n2 - (n5 - 1);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IZIZI)V", garbageValue="-400726809")
    static void method3435(int n, boolean bl, int n2, boolean bl2) {
        if (class69.field817 != null) {
            class322.method6613(0, class69.field817.length - 1, n, bl, n2, bl2);
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lcx;Lcx;IZI)I", garbageValue="-1376899254")
    static int method3436(class69 class692, class69 class693, int n, boolean bl) {
        if (n != 1) {
            if (n == 2) {
                return class692.field811 - class693.field811;
            }
            if (n != 3) {
                if (n == 4) {
                    return class692.method1977() ? (class693.method1977() ? 0 : 1) : (class693.method1977() ? -1 : 0);
                }
                if (n == 5) {
                    return class692.method1965() ? (class693.method1965() ? 0 : 1) : (class693.method1965() ? -1 : 0);
                }
                if (n == 6) {
                    return class692.method1961() ? (class693.method1961() ? 0 : 1) : (class693.method1961() ? -1 : 0);
                }
                if (n == 7) {
                    return class692.method1958() ? (class693.method1958() ? 0 : 1) : (class693.method1958() ? -1 : 0);
                }
                return class692.field812 - class693.field812;
            }
            if (!class692.field816.equals("-")) {
                if (class693.field816.equals("-")) {
                    return bl ? 1 : -1;
                }
                return class692.field816.compareTo(class693.field816);
            }
            if (class693.field816.equals("-")) {
                return 0;
            }
            return bl ? -1 : 1;
        }
        int n2 = class692.field814;
        int n3 = class693.field814;
        if (!bl) {
            if (n2 == -1) {
                n2 = 2001;
            }
            if (n3 == -1) {
                n3 = 2001;
            }
        }
        return n2 - n3;
    }
}

