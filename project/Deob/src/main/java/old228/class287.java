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

@ObfuscatedName(value="lz")
public class class287
extends class293 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=925829211)
    int field3151;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-873636975)
    int field3150;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1757891955)
    int field3152;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-797559619)
    int field3153;

    class287() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;S)V", garbageValue="17470")
    void method6297(class556 class5562) {
        int n = class5562.method10282();
        if (n == class299.field3241.field3242) {
            this.field3211 = class5562.method10282();
            this.field3202 = class5562.method10282();
            this.field3204 = class5562.method10307() * 4096;
            this.field3201 = class5562.method10307() * 4096;
            this.field3151 = class5562.method10282();
            this.field3150 = class5562.method10282();
            this.field3203 = class5562.method10307();
            this.field3200 = class5562.method10307();
            this.field3152 = class5562.method10282();
            this.field3153 = class5562.method10282();
            this.field3212 = class5562.method10476();
            this.field3207 = class5562.method10476();
            return;
        }
        throw new IllegalStateException("");
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;B)V", garbageValue="-46")
    void vmethod6369(class556 class5562) {
        this.field3202 = Math.min(this.field3202, 4);
        this.field3206 = new short[1][64][64];
        this.field3209 = new short[this.field3202][64][64];
        this.field3210 = new byte[this.field3202][64][64];
        this.field3205 = new byte[this.field3202][64][64];
        this.field3208 = new class295[this.field3202][64][64][];
        int n = class5562.method10282();
        if (n == class298.field3237.field3238) {
            int n2 = class5562.method10282();
            int n3 = class5562.method10282();
            int n4 = class5562.method10282();
            int n5 = class5562.method10282();
            if (n2 == this.field3203 && n3 == this.field3200 && n4 == this.field3152 && n5 == this.field3153) {
                int n6 = 0;
                while (true) {
                    if (n6 >= 8) {
                        return;
                    }
                    for (int i = 0; i < 8; ++i) {
                        this.method6374(n6 + this.field3152 * 8, i + this.field3153 * 8, class5562);
                    }
                    ++n6;
                }
            }
            throw new IllegalStateException("");
        }
        throw new IllegalStateException("");
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="88")
    int method6276() {
        return this.field3151;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="483757753")
    int method6280() {
        return this.field3150;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-2068610270")
    int method6281() {
        return this.field3152;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="315524748")
    int method6282() {
        return this.field3153;
    }

    public int hashCode() {
        return this.field3203 | this.field3200 << 8 | this.field3152 << 16 | this.field3153 << 24;
    }

    public boolean equals(Object object) {
        if (object instanceof class287) {
            class287 class2872 = (class287)object;
            if (class2872.field3203 == this.field3203 && class2872.field3200 == this.field3200) {
                return this.field3152 == class2872.field3152 && this.field3153 == class2872.field3153;
            }
            return false;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1805668632")
    public static void method6298() {
        while (true) {
            class386 class3862;
            class410 class4102 = class387.field4527;
            synchronized (class4102) {
                class3862 = (class386)class387.field4528.method8016();
            }
            if (class3862 == null) {
                return;
            }
            class3862.field4524.method7692(class3862.field4521, (int)class3862.field5174, class3862.field4523, false);
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="8")
    public static int method6279(int n) {
        return class506.field5147[n & 0x3FFF];
    }
}

