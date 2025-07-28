package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="hb")
public class class192
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="[Lgf;")
    class180[] field2122;

    @ObfuscatedSignature(descriptor="(Lpq;Lpq;IZ)V", garbageValue="0")
    public class192(class391 class3912, class391 class3913, int n, boolean bl) {
        class410 class4102 = new class410();
        int n2 = class3912.method7740(n);
        this.field2122 = new class180[n2];
        int[] nArray = class3912.method7814(n);
        int n3 = 0;
        while (n3 < nArray.length) {
            byte[] byArray = class3912.method7790(n, nArray[n3]);
            class186 class1862 = null;
            int n4 = (byArray[0] & 0xFF) << 8 | byArray[1] & 0xFF;
            class186 class1863 = (class186)class4102.method7996();
            while (class1863 != null) {
                if (n4 != class1863.field1996) {
                    class1863 = (class186)class4102.method8005();
                    continue;
                }
                class1862 = class1863;
                break;
            }
            if (class1862 == null) {
                byte[] byArray2 = class3913.method7736(n4, 0);
                class1862 = new class186(n4, byArray2);
                class4102.method7998(class1862);
            }
            this.field2122[nArray[n3]] = new class180(byArray, class1862);
            ++n3;
        }
        return;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="-36")
    public boolean method4469(int n) {
        return this.field2122[n].field1927;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(FFFB)F", garbageValue="118")
    public static float method4470(float f, float f2, float f3) {
        if (f2 < f) {
            throw new IllegalArgumentException("max: " + f2 + " can not be lower than min: " + f);
        }
        return Math.max(f, Math.min(f3, f2));
    }

    @ObfuscatedName(value="jw")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="-1182838659")
    static int method4471(int n, int n2) {
        int n3 = n2 - 334;
        if (n3 < 0) {
            n3 = 0;
        } else if (n3 > 100) {
            n3 = 100;
        }
        int n4 = (client.field771 - client.field614) * n3 / 100 + client.field614;
        return n * n4 / 256;
    }
}

