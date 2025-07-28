package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="it")
public abstract class class227 {
    class227() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1922091569")
    public abstract void vmethod5071();

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="1083508360")
    public abstract int vmethod5072(int var1, int var2);

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Lme;", garbageValue="-2107103455")
    static class326[] method5073() {
        return new class326[]{class326.field3587, class326.field3582, class326.field3593, class326.field3584, class326.field3588, class326.field3586, class326.field3589, class326.field3583};
    }

    @ObfuscatedName(value="go")
    @ObfuscatedSignature(descriptor="(Ldd;B)V", garbageValue="74")
    static void method5078(class95 class952) {
        if (client.field533 == class952) {
            return;
        }
        client.field533 = class952;
    }

    @ObfuscatedName(value="mn")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1664298343")
    static boolean method5074(int n) {
        int n2 = 0;
        while (n2 < client.field733) {
            if (client.field735[n2] == n) {
                return true;
            }
            ++n2;
        }
        return false;
    }
}

