/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jj")
public class class248
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static EvictingDualNodeHashTable field2666 = new EvictingDualNodeHashTable(64);

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="35")
    public static boolean method5351(int n) {
        return (n & 1) != 0;
    }

    @ObfuscatedName(value="ah")
    static final void method5350(long l) {
        try {
            Thread.sleep(l);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }
}

