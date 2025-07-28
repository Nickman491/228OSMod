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

@ObfuscatedName(value="iz")
public class class210
extends class227 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(longValue=3391896268840424017L)
    long field2352 = System.nanoTime();

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1922091569")
    public void vmethod5071() {
        this.field2352 = System.nanoTime();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="1083508360")
    public int vmethod5072(int n, int n2) {
        long l = (long)n2 * 1000000L;
        long l2 = this.field2352 - System.nanoTime();
        if (l2 < l) {
            l2 = l;
        }
        class174.method3881(l2 / 1000000L);
        long l3 = System.nanoTime();
        int n3 = 0;
        while (n3 < 10 && (n3 < 1 || this.field2352 < l3)) {
            ++n3;
            this.field2352 += (long)n * 1000000L;
        }
        if (this.field2352 < l3) {
            this.field2352 = l3;
        }
        return n3;
    }
}

