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

@ObfuscatedName(value="ff")
public class class136 {
    @ObfuscatedName(value="iu")
    @ObfuscatedSignature(descriptor="Liq;")
    static class222 field1587;
    @ObfuscatedName(value="ay")
    boolean field1593;
    @ObfuscatedName(value="ah")
    boolean field1571;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lfb;")
    class134 field1572;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lfb;")
    class134 field1574;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="[Lfn;")
    class131[] field1573;
    @ObfuscatedName(value="an")
    boolean field1575;
    @ObfuscatedName(value="ae")
    float field1576;
    @ObfuscatedName(value="ax")
    float field1577;
    @ObfuscatedName(value="at")
    float field1578;
    @ObfuscatedName(value="ac")
    float field1579;
    @ObfuscatedName(value="au")
    float field1580;
    @ObfuscatedName(value="as")
    float field1581;
    @ObfuscatedName(value="aq")
    float field1582;
    @ObfuscatedName(value="af")
    float field1585;
    @ObfuscatedName(value="aa")
    float field1584;
    @ObfuscatedName(value="ak")
    float field1591;
    @ObfuscatedName(value="al")
    boolean field1586 = true;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=412565635)
    int field1583 = 0;
    @ObfuscatedName(value="ag")
    float[] field1588;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=-1445207609)
    int field1589;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-1830532937)
    int field1590;
    @ObfuscatedName(value="ar")
    float field1570;
    @ObfuscatedName(value="am")
    float field1592;

    class136() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;II)I", garbageValue="-1723338220")
    int method3447(class556 class5562, int n) {
        int n2 = class5562.method10307();
        class142.method3513(class5562.method10282());
        this.field1572 = class365.method7582(class5562.method10282());
        this.field1574 = class365.method7582(class5562.method10282());
        this.field1593 = class5562.method10282() != 0;
        this.field1573 = new class131[n2];
        class131 class1312 = null;
        int n3 = 0;
        while (n3 < n2) {
            class131 class1313 = new class131();
            class1313.method3375(class5562, n);
            this.field1573[n3] = class1313;
            if (class1312 != null) {
                class1312.field1532 = class1313;
            }
            class1312 = class1313;
            ++n3;
        }
        return n2;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="41")
    void method3448() {
        this.field1589 = this.field1573[0].field1528;
        this.field1590 = this.field1573[this.method3455() - 1].field1528;
        this.field1588 = new float[this.method3452() + 1];
        int n = this.method3466();
        while (true) {
            if (n > this.method3451()) {
                this.field1573 = null;
                this.field1570 = class149.method3585(this, this.method3466() - 1);
                this.field1592 = class149.method3585(this, this.method3451() + 1);
                return;
            }
            this.field1588[n - this.method3466()] = class149.method3585(this, n);
            ++n;
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IB)F", garbageValue="-6")
    public float method3454(int n) {
        if (n >= this.method3466()) {
            if (n <= this.method3451()) {
                return this.field1588[n - this.method3466()];
            }
            return this.field1592;
        }
        return this.field1570;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1105216544")
    int method3466() {
        return this.field1589;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1110077187")
    int method3451() {
        return this.field1590;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="989125341")
    int method3452() {
        return this.method3451() - this.method3466();
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(FI)I", garbageValue="-1666062473")
    int method3453(float f) {
        block10: {
            int n;
            block8: {
                if (this.field1583 >= 0 && (float)this.field1573[this.field1583].field1528 <= f && (this.field1573[this.field1583].field1532 == null || (float)this.field1573[this.field1583].field1532.field1528 > f)) {
                    return this.field1583;
                }
                if (f < (float)this.method3466() || f > (float)this.method3451()) break block10;
                int n2 = this.method3455();
                n = this.field1583;
                if (n2 > 0) {
                    int n3;
                    block9: {
                        int n4 = 0;
                        int n5 = n2 - 1;
                        do {
                            n3 = n4 + n5 >> 1;
                            if (!(f < (float)this.field1573[n3].field1528)) {
                                if (!(f > (float)this.field1573[n3].field1528)) {
                                    n = n3;
                                } else {
                                    if (!(f < (float)this.field1573[n3 + 1].field1528)) {
                                        n4 = n3 + 1;
                                        continue;
                                    }
                                    n = n3;
                                }
                                break block8;
                            }
                            if (f > (float)this.field1573[n3 - 1].field1528) break block9;
                            n5 = n3 - 1;
                        } while (n4 <= n5);
                        break block8;
                    }
                    n = n3 - 1;
                }
            }
            if (n != this.field1583) {
                this.field1583 = n;
                this.field1586 = true;
            }
            return this.field1583;
        }
        return -1;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(FI)Lfn;", garbageValue="-1934359287")
    class131 method3460(float f) {
        int n = this.method3453(f);
        if (n >= 0 && n < this.field1573.length) {
            return this.field1573[n];
        }
        return null;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="124")
    int method3455() {
        if (this.field1573 == null) {
            return 0;
        }
        return this.field1573.length;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;Lpq;ZI)V", garbageValue="-533189619")
    public static void method3476(class391 class3912, class391 class3913, boolean bl) {
        ObjectDef.field2789 = class3912;
        ObjectDef.field2801 = class3913;
        ObjectDef.field2828 = bl;
    }
}

