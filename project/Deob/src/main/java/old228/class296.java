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

@ObfuscatedName(value="ld")
public final class class296 {
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=1399333337)
    static int field3231;
    @ObfuscatedName(value="ah")
    final int[] field3226;

    class296() {
        this.field3226 = new int[4096];
    }

    class296(int[] nArray) {
        this.field3226 = nArray;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="1508282537")
    final int method6394(int n, int n2) {
        return this.field3226[n + n2 * 64];
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lpq;III)Z", garbageValue="761771961")
    public static boolean method6397(class391 class3912, int n, int n2) {
        byte[] byArray = class3912.method7790(n, n2);
        if (byArray == null) {
            return false;
        }
        class443.method8827(byArray);
        return true;
    }
}

