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

@ObfuscatedName(value="hy")
public class class194
implements class207 {
    @ObfuscatedName(value="je")
    static int[] field2157;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="[Lgh;")
    class179[] field2152;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpm;")
    class410 field2147 = new class410();
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1827847465)
    int field2148;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1077343619)
    int field2149 = 0;
    @ObfuscatedName(value="ad")
    double field2150 = 1.0;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1652188377)
    int field2156 = 128;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lpq;")
    class391 field2146;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedSignature(descriptor="(Lpq;Lpq;IDI)V")
    public class194(class391 class3912, class391 class3913, int n, double d, int n2) {
        this.field2146 = class3913;
        this.field2149 = this.field2148 = n;
        this.field2150 = d;
        this.field2156 = n2;
        int[] nArray = class3912.method7814(0);
        if (nArray == null) {
            this.field2152 = new class179[0];
            return;
        }
        int n3 = nArray.length;
        this.field2152 = new class179[class3912.method7740(0)];
        int n4 = 0;
        while (n4 < n3) {
            class556 class5562 = new class556(class3912.method7790(0, nArray[n4]));
            this.field2152[nArray[n4]] = new class179(class5562);
            ++n4;
        }
        return;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-70")
    public int method4472() {
        if (this.field2152.length == 0) {
            return 100;
        }
        int n = 0;
        int n2 = 0;
        class179[] class179Array = this.field2152;
        int n3 = 0;
        while (true) {
            if (n3 >= class179Array.length) {
                if (n == 0) {
                    return 0;
                }
                return n2 * 100 / n;
            }
            class179 class1792 = class179Array[n3];
            if (class1792 != null && class1792.field1908 != null) {
                n = class1792.field1908.length + n;
                int[] nArray = class1792.field1908;
                for (int i = 0; i < nArray.length; ++i) {
                    int n4 = nArray[i];
                    if (!this.field2146.method7731(n4)) continue;
                    ++n2;
                }
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="ah")
    public void method4478(double d) {
        this.field2150 = d;
        this.method4487();
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)[I", garbageValue="-294472347")
    public int[] vmethod4816(int n) {
        class179 class1792;
        block6: {
            block7: {
                block5: {
                    class1792 = this.field2152[n];
                    if (class1792 == null) break block5;
                    if (class1792.field1910 != null) break block6;
                    boolean bl = class1792.method3991(this.field2150, this.field2156, this.field2146);
                    if (bl) break block7;
                }
                return null;
            }
            if (this.field2149 != 0) {
                --this.field2149;
            } else {
                class179 class1793 = (class179)this.field2147.method8002();
                class1793.method3992();
            }
            this.field2147.method7999(class1792);
            class1792.field1915 = true;
            return class1792.field1910;
        }
        this.field2147.method7999(class1792);
        class1792.field1915 = true;
        return class1792.field1910;
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="667540605")
    public int vmethod4811(int n) {
        if (this.field2152[n] != null) {
            return this.field2152[n].field1906;
        }
        return 0;
    }

    @Override
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1748706073")
    public boolean vmethod4810(int n) {
        return this.field2152[n].field1907;
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="2020085258")
    public boolean vmethod4813(int n) {
        return this.field2156 == 64;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="608282356")
    public void method4487() {
        int n = 0;
        while (true) {
            if (n >= this.field2152.length) {
                this.field2147 = new class410();
                this.field2149 = this.field2148;
                return;
            }
            if (this.field2152[n] != null) {
                this.field2152[n].method3992();
            }
            ++n;
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1451779619")
    public void method4479(int n) {
        int n2 = 0;
        while (n2 < this.field2152.length) {
            class179 class1792 = this.field2152[n2];
            if (class1792 != null && class1792.field1903 != 0 && class1792.field1915) {
                class1792.method3993(n);
                class1792.field1915 = false;
            }
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1398740013")
    public static void method4473() {
        class247.field2653.method6581();
        class247.field2619.method6581();
    }

    @ObfuscatedName(value="in")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1509989655")
    static int method4501() {
        return client.field722 ? 2 : 1;
    }
}

