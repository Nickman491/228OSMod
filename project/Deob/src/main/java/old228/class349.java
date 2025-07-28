package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="nu")
public class class349 {
    @ObfuscatedName(value="ay")
    static int[] field3760 = new int[32];
    @ObfuscatedName(value="az")
    public static int[] field3762;
    @ObfuscatedName(value="ao")
    public static int[] field3763;

    static {
        int n = 2;
        int n2 = 0;
        while (true) {
            if (n2 >= 32) {
                field3762 = new int[5000];
                field3763 = new int[5000];
                return;
            }
            class349.field3760[n2] = n - 1;
            n += n;
            ++n2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(FFFI)Lqh;", garbageValue="798739498")
    public static class426 method6964(float f, float f2, float f3) {
        class426[] class426Array = class426.field4746;
        synchronized (class426.field4746) {
            if (class426.field4742 == 0) {
                // ** MonitorExit[var3_3] (shouldn't be in output)
                return new class426(f, f2, f3);
            }
            class426.field4746[--class426.field4742].method8285(f, f2, f3);
            // ** MonitorExit[var3_3] (shouldn't be in output)
            return class426.field4746[class426.field4742];
        }
    }
}

