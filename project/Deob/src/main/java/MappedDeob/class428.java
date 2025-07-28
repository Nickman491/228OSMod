/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="qe")
public final class class428 {
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="[Lqe;")
    static class428[] field4758 = new class428[0];
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1557335651)
    static int field4757 = 100;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=2031211881)
    static int field4759;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lqe;")
    public static final class428 field4762;
    @ObfuscatedName(value="ad")
    public float[] field4761 = new float[16];

    static {
        field4758 = new class428[100];
        field4759 = 0;
        field4762 = new class428();
    }

    public class428() {
        this.method8372();
    }

    @ObfuscatedSignature(descriptor="(Lqe;)V")
    public class428(class428 class4282) {
        this.method8374(class4282);
    }

    @ObfuscatedSignature(descriptor="(Lvy;Z)V")
    public class428(Buffer buffer, boolean bl) {
        this.method8417(buffer, bl);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1585352490")
    public void method8373() {
        class428[] class428Array = field4758;
        synchronized (field4758) {
            if (field4759 < field4757 - 1) {
                class428.field4758[++class428.field4759 - 1] = this;
            }
            // ** MonitorExit[var1_1] (shouldn't be in output)
            return;
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;ZB)V", garbageValue="97")
    void method8417(Buffer buffer, boolean bl) {
        if (!bl) {
            for (int i = 0; i < 16; ++i) {
                this.field4761[i] = buffer.method10302();
            }
        } else {
            class429 class4292 = new class429();
            class4292.method8459(TriBool.method9284(buffer.readShort()));
            class4292.method8460(TriBool.method9284(buffer.readShort()));
            class4292.method8455(TriBool.method9284(buffer.readShort()));
            class4292.method8458(buffer.readShort(), buffer.readShort(), buffer.readShort());
            this.method8381(class4292);
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)[F", garbageValue="144401204")
    float[] method8442() {
        float[] fArray = new float[3];
        if ((double)this.field4761[2] < 0.999 && (double)this.field4761[2] > -0.999) {
            fArray[1] = (float)(-Math.asin(this.field4761[2]));
            double d = Math.cos(fArray[1]);
            fArray[0] = (float)Math.atan2((double)this.field4761[6] / d, (double)this.field4761[10] / d);
            fArray[2] = (float)Math.atan2((double)this.field4761[1] / d, (double)this.field4761[0] / d);
        } else {
            fArray[0] = 0.0f;
            fArray[1] = (float)Math.atan2(this.field4761[2], 0.0);
            fArray[2] = (float)Math.atan2(-this.field4761[9], this.field4761[5]);
        }
        return fArray;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)[F", garbageValue="-1423946208")
    public float[] method8406() {
        float[] fArray = new float[3];
        fArray[0] = (float)(-Math.asin(this.field4761[6]));
        double d = Math.cos(fArray[0]);
        if (!(Math.abs(d) > 0.005)) {
            double d2 = this.field4761[1];
            double d3 = this.field4761[0];
            fArray[1] = !(this.field4761[6] < 0.0f) ? (float)(-Math.atan2(d2, d3)) : (float)Math.atan2(d2, d3);
            fArray[2] = 0.0f;
        } else {
            double d4 = this.field4761[2];
            double d5 = this.field4761[10];
            double d6 = this.field4761[4];
            double d7 = this.field4761[5];
            fArray[1] = (float)Math.atan2(d4, d5);
            fArray[2] = (float)Math.atan2(d6, d7);
        }
        return fArray;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-2")
    void method8372() {
        this.field4761[0] = 1.0f;
        this.field4761[1] = 0.0f;
        this.field4761[2] = 0.0f;
        this.field4761[3] = 0.0f;
        this.field4761[4] = 0.0f;
        this.field4761[5] = 1.0f;
        this.field4761[6] = 0.0f;
        this.field4761[7] = 0.0f;
        this.field4761[8] = 0.0f;
        this.field4761[9] = 0.0f;
        this.field4761[10] = 1.0f;
        this.field4761[11] = 0.0f;
        this.field4761[12] = 0.0f;
        this.field4761[13] = 0.0f;
        this.field4761[14] = 0.0f;
        this.field4761[15] = 1.0f;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="89")
    public void method8368() {
        this.field4761[0] = 0.0f;
        this.field4761[1] = 0.0f;
        this.field4761[2] = 0.0f;
        this.field4761[3] = 0.0f;
        this.field4761[4] = 0.0f;
        this.field4761[5] = 0.0f;
        this.field4761[6] = 0.0f;
        this.field4761[7] = 0.0f;
        this.field4761[8] = 0.0f;
        this.field4761[9] = 0.0f;
        this.field4761[10] = 0.0f;
        this.field4761[11] = 0.0f;
        this.field4761[12] = 0.0f;
        this.field4761[13] = 0.0f;
        this.field4761[14] = 0.0f;
        this.field4761[15] = 0.0f;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lqe;B)V", garbageValue="49")
    public void method8374(class428 class4282) {
        System.arraycopy(class4282.field4761, 0, this.field4761, 0, 16);
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(FI)V", garbageValue="-1865066324")
    public void method8375(float f) {
        this.method8378(f, f, f);
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(FFFI)V", garbageValue="1853963433")
    public void method8378(float f, float f2, float f3) {
        this.method8372();
        this.field4761[0] = f;
        this.field4761[5] = f2;
        this.field4761[10] = f3;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Lqe;I)V", garbageValue="-1609335368")
    public void method8377(class428 class4282) {
        int n = 0;
        while (n < this.field4761.length) {
            int n2 = n;
            this.field4761[n2] = this.field4761[n2] + class4282.field4761[n];
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lqe;I)V", garbageValue="1178667793")
    public void method8389(class428 class4282) {
        float f = class4282.field4761[0] * this.field4761[0] + class4282.field4761[4] * this.field4761[1] + class4282.field4761[8] * this.field4761[2] + this.field4761[3] * class4282.field4761[12];
        float f2 = this.field4761[3] * class4282.field4761[13] + (class4282.field4761[5] * this.field4761[1] + class4282.field4761[1] * this.field4761[0] + class4282.field4761[9] * this.field4761[2]);
        float f3 = this.field4761[2] * class4282.field4761[10] + (class4282.field4761[2] * this.field4761[0] + this.field4761[1] * class4282.field4761[6]) + this.field4761[3] * class4282.field4761[14];
        float f4 = this.field4761[3] * class4282.field4761[15] + (this.field4761[2] * class4282.field4761[11] + (class4282.field4761[7] * this.field4761[1] + class4282.field4761[3] * this.field4761[0]));
        float f5 = this.field4761[5] * class4282.field4761[4] + class4282.field4761[0] * this.field4761[4] + this.field4761[6] * class4282.field4761[8] + class4282.field4761[12] * this.field4761[7];
        float f6 = this.field4761[4] * class4282.field4761[1] + this.field4761[5] * class4282.field4761[5] + this.field4761[6] * class4282.field4761[9] + this.field4761[7] * class4282.field4761[13];
        float f7 = class4282.field4761[14] * this.field4761[7] + (class4282.field4761[10] * this.field4761[6] + (this.field4761[4] * class4282.field4761[2] + this.field4761[5] * class4282.field4761[6]));
        float f8 = class4282.field4761[15] * this.field4761[7] + (class4282.field4761[3] * this.field4761[4] + class4282.field4761[7] * this.field4761[5] + class4282.field4761[11] * this.field4761[6]);
        float f9 = this.field4761[8] * class4282.field4761[0] + class4282.field4761[4] * this.field4761[9] + this.field4761[10] * class4282.field4761[8] + this.field4761[11] * class4282.field4761[12];
        float f10 = this.field4761[8] * class4282.field4761[1] + this.field4761[9] * class4282.field4761[5] + class4282.field4761[9] * this.field4761[10] + class4282.field4761[13] * this.field4761[11];
        float f11 = this.field4761[8] * class4282.field4761[2] + this.field4761[9] * class4282.field4761[6] + this.field4761[10] * class4282.field4761[10] + this.field4761[11] * class4282.field4761[14];
        float f12 = this.field4761[10] * class4282.field4761[11] + (this.field4761[9] * class4282.field4761[7] + class4282.field4761[3] * this.field4761[8]) + this.field4761[11] * class4282.field4761[15];
        float f13 = this.field4761[12] * class4282.field4761[0] + this.field4761[13] * class4282.field4761[4] + this.field4761[14] * class4282.field4761[8] + this.field4761[15] * class4282.field4761[12];
        float f14 = this.field4761[13] * class4282.field4761[5] + this.field4761[12] * class4282.field4761[1] + this.field4761[14] * class4282.field4761[9] + class4282.field4761[13] * this.field4761[15];
        float f15 = class4282.field4761[14] * this.field4761[15] + (this.field4761[12] * class4282.field4761[2] + this.field4761[13] * class4282.field4761[6] + this.field4761[14] * class4282.field4761[10]);
        float f16 = class4282.field4761[3] * this.field4761[12] + class4282.field4761[7] * this.field4761[13] + class4282.field4761[11] * this.field4761[14] + class4282.field4761[15] * this.field4761[15];
        this.field4761[0] = f;
        this.field4761[1] = f2;
        this.field4761[2] = f3;
        this.field4761[3] = f4;
        this.field4761[4] = f5;
        this.field4761[5] = f6;
        this.field4761[6] = f7;
        this.field4761[7] = f8;
        this.field4761[8] = f9;
        this.field4761[9] = f10;
        this.field4761[10] = f11;
        this.field4761[11] = f12;
        this.field4761[12] = f13;
        this.field4761[13] = f14;
        this.field4761[14] = f15;
        this.field4761[15] = f16;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Lqf;I)V", garbageValue="1687351949")
    public void method8379(class422 class4222) {
        float f = class4222.field4728.field4756 * class4222.field4728.field4756;
        float f2 = class4222.field4728.field4756 * class4222.field4728.field4751;
        float f3 = class4222.field4728.field4756 * class4222.field4728.field4754;
        float f4 = class4222.field4728.field4756 * class4222.field4728.field4753;
        float f5 = class4222.field4728.field4751 * class4222.field4728.field4751;
        float f6 = class4222.field4728.field4751 * class4222.field4728.field4754;
        float f7 = class4222.field4728.field4751 * class4222.field4728.field4753;
        float f8 = class4222.field4728.field4754 * class4222.field4728.field4754;
        float f9 = class4222.field4728.field4753 * class4222.field4728.field4754;
        float f10 = class4222.field4728.field4753 * class4222.field4728.field4753;
        this.field4761[0] = f5 + f - f10 - f8;
        this.field4761[1] = f4 + (f6 + (f6 + f4));
        this.field4761[2] = f7 - f3 - f3 + f7;
        this.field4761[4] = f6 + (f6 - f4 - f4);
        this.field4761[5] = f + f8 - f5 - f10;
        this.field4761[6] = f2 + (f2 + f9 + f9);
        this.field4761[8] = f3 + f7 + f7 + f3;
        this.field4761[9] = f9 - f2 - f2 + f9;
        this.field4761[10] = f + f10 - f8 - f5;
        float[] fArray = this.field4761;
        float[] fArray2 = this.field4761;
        this.field4761[11] = 0.0f;
        fArray2[7] = 0.0f;
        fArray[3] = 0.0f;
        this.field4761[12] = class4222.field4729.field4747;
        this.field4761[13] = class4222.field4729.field4744;
        this.field4761[14] = class4222.field4729.field4749;
        this.field4761[15] = 1.0f;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(Lqa;B)V", garbageValue="-24")
    public void method8380(class427 class4272) {
        float f = class4272.field4756 * class4272.field4756;
        float f2 = class4272.field4751 * class4272.field4756;
        float f3 = class4272.field4756 * class4272.field4754;
        float f4 = class4272.field4756 * class4272.field4753;
        float f5 = class4272.field4751 * class4272.field4751;
        float f6 = class4272.field4751 * class4272.field4754;
        float f7 = class4272.field4753 * class4272.field4751;
        float f8 = class4272.field4754 * class4272.field4754;
        float f9 = class4272.field4753 * class4272.field4754;
        float f10 = class4272.field4753 * class4272.field4753;
        this.field4761[0] = f + f5 - f10 - f8;
        this.field4761[1] = f6 + (f6 + f4) + f4;
        this.field4761[2] = f7 - f3 - f3 + f7;
        this.field4761[4] = f6 + (f6 - f4 - f4);
        this.field4761[5] = f + f8 - f5 - f10;
        this.field4761[6] = f9 + (f9 + f2) + f2;
        this.field4761[8] = f7 + (f7 + f3) + f3;
        this.field4761[9] = f9 - f2 - f2 + f9;
        this.field4761[10] = f + f10 - f8 - f5;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Lqp;I)V", garbageValue="-2089442831")
    public void method8381(class429 class4292) {
        this.field4761[0] = class4292.field4768;
        this.field4761[1] = class4292.field4766;
        this.field4761[2] = class4292.field4773;
        this.field4761[3] = 0.0f;
        this.field4761[4] = class4292.field4775;
        this.field4761[5] = class4292.field4765;
        this.field4761[6] = class4292.field4770;
        this.field4761[7] = 0.0f;
        this.field4761[8] = class4292.field4771;
        this.field4761[9] = class4292.field4772;
        this.field4761[10] = class4292.field4767;
        this.field4761[11] = 0.0f;
        this.field4761[12] = class4292.field4769;
        this.field4761[13] = class4292.field4774;
        this.field4761[14] = class4292.field4776;
        this.field4761[15] = 1.0f;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)F", garbageValue="-53543580")
    float method8384() {
        return this.field4761[3] * this.field4761[5] * this.field4761[8] * this.field4761[14] + (this.field4761[7] * this.field4761[2] * this.field4761[8] * this.field4761[13] + (this.field4761[5] * this.field4761[2] * this.field4761[11] * this.field4761[12] + (this.field4761[12] * (this.field4761[7] * this.field4761[1] * this.field4761[10]) + (this.field4761[8] * (this.field4761[6] * this.field4761[1]) * this.field4761[15] + (this.field4761[13] * (this.field4761[11] * (this.field4761[6] * this.field4761[0])) + (this.field4761[15] * (this.field4761[10] * (this.field4761[5] * this.field4761[0])) - this.field4761[14] * (this.field4761[11] * (this.field4761[5] * this.field4761[0])) - this.field4761[6] * this.field4761[0] * this.field4761[9] * this.field4761[15]) + this.field4761[0] * this.field4761[7] * this.field4761[9] * this.field4761[14] - this.field4761[0] * this.field4761[7] * this.field4761[10] * this.field4761[13] - this.field4761[10] * (this.field4761[1] * this.field4761[4]) * this.field4761[15] + this.field4761[14] * (this.field4761[4] * this.field4761[1] * this.field4761[11])) - this.field4761[11] * (this.field4761[1] * this.field4761[6]) * this.field4761[12] - this.field4761[8] * (this.field4761[1] * this.field4761[7]) * this.field4761[14]) + this.field4761[15] * (this.field4761[4] * this.field4761[2] * this.field4761[9]) - this.field4761[13] * (this.field4761[4] * this.field4761[2] * this.field4761[11]) - this.field4761[8] * (this.field4761[5] * this.field4761[2]) * this.field4761[15])) - this.field4761[9] * (this.field4761[2] * this.field4761[7]) * this.field4761[12] - this.field4761[3] * this.field4761[4] * this.field4761[9] * this.field4761[14] + this.field4761[4] * this.field4761[3] * this.field4761[10] * this.field4761[13]) - this.field4761[10] * (this.field4761[3] * this.field4761[5]) * this.field4761[12] - this.field4761[13] * (this.field4761[6] * this.field4761[3] * this.field4761[8]) + this.field4761[12] * (this.field4761[9] * (this.field4761[3] * this.field4761[6]));
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-22358")
    public void method8383() {
        float f = 1.0f / this.method8384();
        float f2 = (this.field4761[7] * this.field4761[9] * this.field4761[14] + (this.field4761[13] * (this.field4761[11] * this.field4761[6]) + (this.field4761[5] * this.field4761[10] * this.field4761[15] - this.field4761[11] * this.field4761[5] * this.field4761[14] - this.field4761[6] * this.field4761[9] * this.field4761[15])) - this.field4761[10] * this.field4761[7] * this.field4761[13]) * f;
        float f3 = f * (this.field4761[10] * -this.field4761[1] * this.field4761[15] + this.field4761[14] * (this.field4761[1] * this.field4761[11]) + this.field4761[15] * (this.field4761[9] * this.field4761[2]) - this.field4761[11] * this.field4761[2] * this.field4761[13] - this.field4761[14] * (this.field4761[3] * this.field4761[9]) + this.field4761[3] * this.field4761[10] * this.field4761[13]);
        float f4 = (this.field4761[3] * this.field4761[5] * this.field4761[14] + (this.field4761[2] * this.field4761[7] * this.field4761[13] + (this.field4761[15] * (this.field4761[6] * this.field4761[1]) - this.field4761[7] * this.field4761[1] * this.field4761[14] - this.field4761[15] * (this.field4761[2] * this.field4761[5]))) - this.field4761[3] * this.field4761[6] * this.field4761[13]) * f;
        float f5 = (this.field4761[6] * this.field4761[3] * this.field4761[9] + (this.field4761[5] * this.field4761[2] * this.field4761[11] + (-this.field4761[1] * this.field4761[6] * this.field4761[11] + this.field4761[7] * this.field4761[1] * this.field4761[10]) - this.field4761[7] * this.field4761[2] * this.field4761[9] - this.field4761[10] * (this.field4761[3] * this.field4761[5]))) * f;
        float f6 = f * (this.field4761[12] * (this.field4761[10] * this.field4761[7]) + (this.field4761[8] * this.field4761[6] * this.field4761[15] + (this.field4761[4] * this.field4761[11] * this.field4761[14] + this.field4761[15] * (-this.field4761[4] * this.field4761[10])) - this.field4761[12] * (this.field4761[11] * this.field4761[6]) - this.field4761[14] * (this.field4761[8] * this.field4761[7])));
        float f7 = (this.field4761[12] * (this.field4761[2] * this.field4761[11]) + (this.field4761[15] * (this.field4761[0] * this.field4761[10]) - this.field4761[14] * (this.field4761[11] * this.field4761[0]) - this.field4761[8] * this.field4761[2] * this.field4761[15]) + this.field4761[14] * (this.field4761[3] * this.field4761[8]) - this.field4761[10] * this.field4761[3] * this.field4761[12]) * f;
        float f8 = f * (this.field4761[3] * this.field4761[6] * this.field4761[12] + (this.field4761[2] * this.field4761[4] * this.field4761[15] + (this.field4761[15] * (this.field4761[6] * -this.field4761[0]) + this.field4761[7] * this.field4761[0] * this.field4761[14]) - this.field4761[12] * (this.field4761[2] * this.field4761[7]) - this.field4761[14] * (this.field4761[4] * this.field4761[3])));
        float f9 = f * (this.field4761[4] * this.field4761[3] * this.field4761[10] + (this.field4761[8] * (this.field4761[7] * this.field4761[2]) + (this.field4761[0] * this.field4761[6] * this.field4761[11] - this.field4761[7] * this.field4761[0] * this.field4761[10] - this.field4761[2] * this.field4761[4] * this.field4761[11])) - this.field4761[8] * (this.field4761[6] * this.field4761[3]));
        float f10 = f * (this.field4761[5] * this.field4761[11] * this.field4761[12] + (this.field4761[4] * this.field4761[9] * this.field4761[15] - this.field4761[13] * (this.field4761[11] * this.field4761[4]) - this.field4761[5] * this.field4761[8] * this.field4761[15]) + this.field4761[8] * this.field4761[7] * this.field4761[13] - this.field4761[12] * (this.field4761[9] * this.field4761[7]));
        float f11 = f * (this.field4761[12] * (this.field4761[9] * this.field4761[3]) + (this.field4761[15] * (this.field4761[8] * this.field4761[1]) + (this.field4761[11] * this.field4761[0] * this.field4761[13] + this.field4761[15] * (-this.field4761[0] * this.field4761[9])) - this.field4761[1] * this.field4761[11] * this.field4761[12] - this.field4761[3] * this.field4761[8] * this.field4761[13]));
        float f12 = f * (this.field4761[15] * (this.field4761[5] * this.field4761[0]) - this.field4761[13] * (this.field4761[0] * this.field4761[7]) - this.field4761[4] * this.field4761[1] * this.field4761[15] + this.field4761[7] * this.field4761[1] * this.field4761[12] + this.field4761[13] * (this.field4761[4] * this.field4761[3]) - this.field4761[3] * this.field4761[5] * this.field4761[12]);
        float f13 = f * (this.field4761[11] * (this.field4761[1] * this.field4761[4]) + (this.field4761[5] * -this.field4761[0] * this.field4761[11] + this.field4761[9] * (this.field4761[0] * this.field4761[7])) - this.field4761[7] * this.field4761[1] * this.field4761[8] - this.field4761[3] * this.field4761[4] * this.field4761[9] + this.field4761[3] * this.field4761[5] * this.field4761[8]);
        float f14 = (this.field4761[14] * (this.field4761[5] * this.field4761[8]) + (this.field4761[10] * this.field4761[4] * this.field4761[13] + this.field4761[9] * -this.field4761[4] * this.field4761[14]) - this.field4761[12] * (this.field4761[5] * this.field4761[10]) - this.field4761[6] * this.field4761[8] * this.field4761[13] + this.field4761[6] * this.field4761[9] * this.field4761[12]) * f;
        float f15 = f * (this.field4761[14] * (this.field4761[0] * this.field4761[9]) - this.field4761[13] * (this.field4761[10] * this.field4761[0]) - this.field4761[14] * (this.field4761[8] * this.field4761[1]) + this.field4761[10] * this.field4761[1] * this.field4761[12] + this.field4761[13] * (this.field4761[2] * this.field4761[8]) - this.field4761[12] * (this.field4761[2] * this.field4761[9]));
        float f16 = (this.field4761[5] * this.field4761[2] * this.field4761[12] + (this.field4761[5] * -this.field4761[0] * this.field4761[14] + this.field4761[13] * (this.field4761[0] * this.field4761[6]) + this.field4761[14] * (this.field4761[4] * this.field4761[1]) - this.field4761[12] * (this.field4761[1] * this.field4761[6]) - this.field4761[2] * this.field4761[4] * this.field4761[13])) * f;
        float f17 = f * (this.field4761[1] * this.field4761[6] * this.field4761[8] + (this.field4761[10] * (this.field4761[0] * this.field4761[5]) - this.field4761[0] * this.field4761[6] * this.field4761[9] - this.field4761[10] * (this.field4761[4] * this.field4761[1])) + this.field4761[9] * (this.field4761[2] * this.field4761[4]) - this.field4761[2] * this.field4761[5] * this.field4761[8]);
        this.field4761[0] = f2;
        this.field4761[1] = f3;
        this.field4761[2] = f4;
        this.field4761[3] = f5;
        this.field4761[4] = f6;
        this.field4761[5] = f7;
        this.field4761[6] = f8;
        this.field4761[7] = f9;
        this.field4761[8] = f10;
        this.field4761[9] = f11;
        this.field4761[10] = f12;
        this.field4761[11] = f13;
        this.field4761[12] = f14;
        this.field4761[13] = f15;
        this.field4761[14] = f16;
        this.field4761[15] = f17;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(FFFFI)V", garbageValue="-717160163")
    public void method8398(float f, float f2, float f3, float f4) {
        this.field4761[0] = f;
        this.field4761[1] = 0.0f;
        this.field4761[2] = 0.0f;
        this.field4761[3] = 0.0f;
        this.field4761[4] = 0.0f;
        this.field4761[5] = f2;
        this.field4761[6] = 0.0f;
        this.field4761[7] = 0.0f;
        this.field4761[8] = 0.0f;
        this.field4761[9] = 0.0f;
        this.field4761[10] = f3;
        this.field4761[11] = 0.0f;
        this.field4761[12] = 0.0f;
        this.field4761[13] = 0.0f;
        this.field4761[14] = 0.0f;
        this.field4761[15] = f4;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(FFF[FI)V", garbageValue="-1131230174")
    public void method8385(float f, float f2, float f3, float[] fArray) {
        fArray[0] = f3 * this.field4761[8] + (f * this.field4761[0] + this.field4761[4] * f2) + this.field4761[12];
        fArray[1] = this.field4761[13] + (f3 * this.field4761[9] + (f2 * this.field4761[5] + this.field4761[1] * f));
        fArray[2] = this.field4761[6] * f2 + this.field4761[2] * f + this.field4761[10] * f3 + this.field4761[14];
        if (fArray.length > 3) {
            fArray[3] = this.field4761[15] + (this.field4761[7] * f2 + f * this.field4761[3] + this.field4761[11] * f3);
        }
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(FFFI)Lqh;", garbageValue="-510918344")
    public class426 method8386(float f, float f2, float f3) {
        float f4 = 1.0f / (f * this.field4761[3] + this.field4761[7] * f2 + f3 * this.field4761[11] + this.field4761[15]);
        return new class426(f4 * (f2 * this.field4761[4] + this.field4761[0] * f + this.field4761[8] * f3 + this.field4761[12]), (this.field4761[13] + (this.field4761[9] * f3 + (this.field4761[5] * f2 + f * this.field4761[1]))) * f4, f4 * (this.field4761[14] + (f2 * this.field4761[6] + this.field4761[2] * f + f3 * this.field4761[10])));
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(FFFI)F", garbageValue="751936456")
    public float method8400(float f, float f2, float f3) {
        return f3 * this.field4761[8] + (this.field4761[0] * f + f2 * this.field4761[4]) + this.field4761[12];
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(FFFB)F", garbageValue="98")
    public float method8388(float f, float f2, float f3) {
        return f3 * this.field4761[9] + (this.field4761[5] * f2 + this.field4761[1] * f) + this.field4761[13];
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(FFFS)F", garbageValue="-18624")
    public float method8452(float f, float f2, float f3) {
        return this.field4761[6] * f2 + f * this.field4761[2] + f3 * this.field4761[10] + this.field4761[14];
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(I)[F", garbageValue="1982534628")
    public float[] method8391() {
        float[] fArray = new float[3];
        class426 class4262 = new class426(this.field4761[0], this.field4761[1], this.field4761[2]);
        class426 class4263 = new class426(this.field4761[4], this.field4761[5], this.field4761[6]);
        class426 class4264 = new class426(this.field4761[8], this.field4761[9], this.field4761[10]);
        fArray[0] = class4262.method8308();
        fArray[1] = class4263.method8308();
        fArray[2] = class4264.method8308();
        return fArray;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.method8406();
        this.method8442();
        int n = 0;
        block0: while (n < 4) {
            int n2 = 0;
            while (true) {
                float f;
                if (n2 >= 4) {
                    stringBuilder.append("\n");
                    ++n;
                    continue block0;
                }
                if (n2 > 0) {
                    stringBuilder.append("\t");
                }
                if (Math.sqrt((f = this.field4761[n2 + n * 4]) * f) < (double)1.0E-4f) {
                    f = 0.0f;
                }
                stringBuilder.append(f);
                ++n2;
            }
            break;
        }
        return stringBuilder.toString();
    }

    public boolean equals(Object object) {
        if (!(object instanceof class428)) {
            return false;
        }
        class428 class4282 = (class428)object;
        for (int i = 0; i < 16; ++i) {
            if (this.field4761[i] == class4282.field4761[i]) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = n2 * 31 + Arrays.hashCode(this.field4761);
        return n2;
    }

    @ObfuscatedName(value="ba")
    @ObfuscatedSignature(descriptor="([BII)I", garbageValue="-180058422")
    public static int method8382(byte[] byArray, int n) {
        return class499.method9539(byArray, 0, n);
    }
}

