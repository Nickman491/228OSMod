/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ra")
public class class458 {
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IIIS)I", garbageValue="22026")
    public static int method8966(int n, int n2, int n3) {
        int n4 = ItemComposition.method5643(n3 - n2 + 1);
        return n |= (n4 <<= n2);
    }
}

