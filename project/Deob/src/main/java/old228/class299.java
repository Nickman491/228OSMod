package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="lw")
public class class299 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Llw;")
    static final class299 field3247 = new class299(0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Llw;")
    static final class299 field3241 = new class299(1);
    @ObfuscatedName(value="ae")
    static int[][] field3244;
    @ObfuscatedName(value="ax")
    static ThreadPoolExecutor field3245;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-112446325)
    final int field3242;

    class299(int n) {
        this.field3242 = n;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIIII)[I", garbageValue="2004102191")
    static int[] method6402(int n, int n2, int n3, int n4, int n5) {
        int n6;
        int[] nArray = new int[256];
        for (n6 = 0; n6 < 64; ++n6) {
            nArray[n6] = class135.method3445(n, n2, n6);
        }
        for (n6 = 0; n6 < 64; ++n6) {
            nArray[n6 + 64] = class135.method3445(n2, n3, n6);
        }
        for (n6 = 0; n6 < 64; ++n6) {
            nArray[n6 + 128] = class135.method3445(n3, n4, n6);
        }
        for (n6 = 0; n6 < 64; ++n6) {
            nArray[n6 + 192] = class135.method3445(n4, n5, n6);
        }
        return nArray;
    }
}

