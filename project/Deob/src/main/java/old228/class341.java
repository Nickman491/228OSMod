package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="nv")
public class class341
extends class49 {
    @ObfuscatedName(value="jh")
    static int[][] field3705;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lma;")
    class334 field3706;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpm;")
    class410 field3709 = new class410();
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lbp;")
    class38 field3707 = new class38();

    @ObfuscatedSignature(descriptor="(Lma;)V")
    class341(class334 class3342) {
        this.field3706 = class3342;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lne;[IIIII)V", garbageValue="1738538147")
    void method6903(class343 class3432, int[] nArray, int n, int n2, int n3) {
        if ((this.field3706.field3651[class3432.field3731] & 4) != 0 && class3432.field3727 < 0) {
            int n4 = this.field3706.field3654[class3432.field3731] / class42.field257;
            while (true) {
                int n5;
                if ((n5 = (n4 + 1048575 - class3432.field3733) / n4) > n2) {
                    class3432.field3733 += n4 * n2;
                    break;
                }
                class3432.field3713.vmethod6908(nArray, n, n5);
                n += n5;
                n2 -= n5;
                class3432.field3733 += n4 * n5 - 0x100000;
                int n6 = class42.field257 / 100;
                int n7 = 262144 / n4;
                if (n7 < n6) {
                    n6 = n7;
                }
                class48 class4810 = class3432.field3713;
                if (this.field3706.field3652[class3432.field3731] != 0) {
                    class3432.field3713 = class48.method911(class3432.field3732, class4810.method926(), 0, class4810.method918());
                    this.field3706.method6723(class3432, class3432.field3725.field3691[class3432.field3718] < 0);
                    class3432.field3713.method950(n6, class4810.method922());
                } else {
                    class3432.field3713 = class48.method911(class3432.field3732, class4810.method926(), class4810.method922(), class4810.method918());
                }
                if (class3432.field3725.field3691[class3432.field3718] < 0) {
                    class3432.field3713.method913(-1);
                }
                class4810.method924(n6);
                class4810.vmethod6908(nArray, n, n3 - n);
                if (!class4810.method928()) continue;
                this.field3707.method741(class4810);
            }
        }
        class3432.field3713.vmethod6908(nArray, n, n2);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lne;II)V", garbageValue="-622400505")
    void method6904(class343 class3432, int n) {
        if ((this.field3706.field3651[class3432.field3731] & 4) != 0 && class3432.field3727 < 0) {
            int n2 = this.field3706.field3654[class3432.field3731] / class42.field257;
            int n3 = (n2 + 1048575 - class3432.field3733) / n2;
            class3432.field3733 = n2 * n + class3432.field3733 & 0xFFFFF;
            if (n3 <= n) {
                if (this.field3706.field3652[class3432.field3731] != 0) {
                    class3432.field3713 = class48.method911(class3432.field3732, class3432.field3713.method926(), 0, class3432.field3713.method918());
                    this.field3706.method6723(class3432, class3432.field3725.field3691[class3432.field3718] < 0);
                } else {
                    class3432.field3713 = class48.method911(class3432.field3732, class3432.field3713.method926(), class3432.field3713.method922(), class3432.field3713.method918());
                }
                if (class3432.field3725.field3691[class3432.field3718] < 0) {
                    class3432.field3713.method913(-1);
                }
                n = class3432.field3733 / n2;
            }
        }
        class3432.field3713.vmethod6902(n);
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="()Lbn;")
    protected class49 vmethod6899() {
        class343 class3432 = (class343)this.field3709.method7996();
        if (class3432 == null) {
            return null;
        }
        if (class3432.field3713 != null) {
            return class3432.field3713;
        }
        return this.vmethod6900();
    }

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="()Lbn;")
    protected class49 vmethod6900() {
        class343 class3432;
        do {
            if ((class3432 = (class343)this.field3709.method8005()) != null) continue;
            return null;
        } while (class3432.field3713 == null);
        return class3432.field3713;
    }

    @Override
    @ObfuscatedName(value="ax")
    protected int vmethod6927() {
        return 0;
    }

    @Override
    @ObfuscatedName(value="at")
    protected void vmethod6908(int[] nArray, int n, int n2) {
        this.field3707.vmethod6908(nArray, n, n2);
        class343 class3432 = (class343)this.field3709.method7996();
        while (class3432 != null) {
            if (!this.field3706.method6745(class3432)) {
                int n3 = n;
                int n4 = n2;
                do {
                    if (n4 <= class3432.field3728) {
                        this.method6903(class3432, nArray, n3, n4, n3 + n4);
                        class3432.field3728 -= n4;
                        break;
                    }
                    this.method6903(class3432, nArray, n3, class3432.field3728, n3 + n4);
                } while (!this.field3706.method6746(class3432, nArray, n3 += class3432.field3728, n4 -= class3432.field3728));
            }
            class3432 = (class343)this.field3709.method8005();
        }
        return;
    }

    @Override
    @ObfuscatedName(value="au")
    protected void vmethod6902(int n) {
        this.field3707.vmethod6902(n);
        class343 class3432 = (class343)this.field3709.method7996();
        while (class3432 != null) {
            if (!this.field3706.method6745(class3432)) {
                int n2 = n;
                do {
                    if (n2 <= class3432.field3728) {
                        this.method6904(class3432, n2);
                        class3432.field3728 -= n2;
                        break;
                    }
                    this.method6904(class3432, class3432.field3728);
                } while (!this.field3706.method6746(class3432, null, 0, n2 -= class3432.field3728));
            }
            class3432 = (class343)this.field3709.method8005();
        }
        return;
    }

    @ObfuscatedName(value="ka")
    @ObfuscatedSignature(descriptor="(Ldz;IIB)V", garbageValue="77")
    static final void method6901(class103 class1032, int n, int n2) {
        class42.method827(class1032, class1032.field1321, n, n2);
    }
}

