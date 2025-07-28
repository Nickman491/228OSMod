/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="it")
@Implements(value="Clock")
public abstract class Clock {
    Clock() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1922091569")
    @Export(value="mark")
    public abstract void mark();

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="1083508360")
    @Export(value="wait")
    public abstract int wait(int var1, int var2);

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Lme;", garbageValue="-2107103455")
    static class326[] method5073() {
        return new class326[]{class326.field3587, class326.field3582, class326.field3593, class326.field3584, class326.field3588, class326.field3586, class326.field3589, class326.field3583};
    }

    @ObfuscatedName(value="go")
    @ObfuscatedSignature(descriptor="(Ldd;B)V", garbageValue="74")
    static void method5078(class95 class952) {
        if (Client.field533 == class952) {
            return;
        }
        Client.field533 = class952;
    }

    @ObfuscatedName(value="mn")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1664298343")
    static boolean method5074(int n) {
        int n2 = 0;
        while (n2 < Client.field733) {
            if (Client.field735[n2] == n) {
                return true;
            }
            ++n2;
        }
        return false;
    }
}

