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

@ObfuscatedName(value="qh")
public class class426 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lqh;")
    public static final class426 field4745;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lqh;")
    public static final class426 field4743;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="[Lqh;")
    public static class426[] field4746;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-2124964589)
    static int field4748;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-311402611)
    public static int field4742;
    @ObfuscatedName(value="an")
    public float field4747;
    @ObfuscatedName(value="ae")
    float field4744;
    @ObfuscatedName(value="ax")
    public float field4749;

    static {
        new class426(0.0f, 0.0f, 0.0f);
        new class426(1.0f, 1.0f, 1.0f);
        new class426(1.0f, 0.0f, 0.0f);
        field4745 = new class426(0.0f, 1.0f, 0.0f);
        new class426(0.0f, 0.0f, 1.0f);
        new class426(1.0f, 0.0f, 0.0f);
        new class426(-1.0f, 0.0f, 0.0f);
        new class426(0.0f, 0.0f, 1.0f);
        field4743 = new class426(0.0f, 0.0f, -1.0f);
        new class426(0.0f, 1.0f, 0.0f);
        new class426(0.0f, -1.0f, 0.0f);
        field4746 = new class426[0];
        field4748 = 100;
        field4746 = new class426[100];
        field4742 = 0;
    }

    public class426(float f, float f2, float f3) {
        this.field4747 = f;
        this.field4744 = f2;
        this.field4749 = f3;
    }

    public class426() {
    }

    @ObfuscatedSignature(descriptor="(Lqh;)V")
    public class426(class426 class4262) {
        this.field4747 = class4262.field4747;
        this.field4744 = class4262.field4744;
        this.field4749 = class4262.field4749;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="6")
    public void method8317() {
        class426[] class426Array = field4746;
        synchronized (field4746) {
            if (field4742 < field4748 - 1) {
                class426.field4746[++class426.field4742 - 1] = this;
            }
            // ** MonitorExit[var1_1] (shouldn't be in output)
            return;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(FFFI)V", garbageValue="1169986659")
    public void method8285(float f, float f2, float f3) {
        this.field4747 = f;
        this.field4744 = f2;
        this.field4749 = f3;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lqh;B)V", garbageValue="110")
    public void method8316(class426 class4262) {
        this.method8285(class4262.field4747, class4262.field4744, class4262.field4749);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="1")
    final void method8287() {
        this.field4749 = 0.0f;
        this.field4744 = 0.0f;
        this.field4747 = 0.0f;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lqh;B)Z", garbageValue="91")
    boolean method8288(class426 class4262) {
        return class4262.field4747 == this.field4747 && this.field4744 == class4262.field4744 && class4262.field4749 == this.field4749;
        {
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1106726003")
    public final void method8289() {
        float f = 1.0f / this.method8308();
        this.field4747 *= f;
        this.field4744 *= f;
        this.field4749 *= f;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Lqh;I)V", garbageValue="-618418035")
    public final void method8297(class426 class4262) {
        this.field4747 += class4262.field4747;
        this.field4744 += class4262.field4744;
        this.field4749 += class4262.field4749;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Lqh;I)V", garbageValue="-1168010802")
    final void method8291(class426 class4262) {
        this.field4747 -= class4262.field4747;
        this.field4744 -= class4262.field4744;
        this.field4749 -= class4262.field4749;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lqh;I)F", garbageValue="1591624557")
    public final float method8305(class426 class4262) {
        return class4262.field4747 * this.field4747 + class4262.field4744 * this.field4744 + this.field4749 * class4262.field4749;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Lqh;I)V", garbageValue="-1050500857")
    public final void method8293(class426 class4262) {
        this.method8285(this.field4744 * class4262.field4749 - this.field4749 * class4262.field4744, this.field4749 * class4262.field4747 - class4262.field4749 * this.field4747, this.field4747 * class4262.field4744 - class4262.field4747 * this.field4744);
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(B)F", garbageValue="0")
    final float method8308() {
        return (float)Math.sqrt(this.field4749 * this.field4749 + (this.field4747 * this.field4747 + this.field4744 * this.field4744));
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(FI)V", garbageValue="2042549892")
    public final void method8327(float f) {
        this.field4747 *= f;
        this.field4744 *= f;
        this.field4749 *= f;
    }

    public String toString() {
        return this.field4747 + ", " + this.field4744 + ", " + this.field4749;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;B)Z", garbageValue="110")
    public static boolean method8330(CharSequence charSequence) {
        return class53.method1131(charSequence, 10, true);
    }
}

