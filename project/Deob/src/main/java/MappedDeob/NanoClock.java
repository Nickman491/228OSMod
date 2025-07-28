/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="iz")
@Implements(value="NanoClock")
public class NanoClock
extends Clock {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(longValue=3391896268840424017L)
    @Export(value="lastTimeNano")
    long lastTimeNano = System.nanoTime();

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1922091569")
    @Export(value="mark")
    public void mark() {
        this.lastTimeNano = System.nanoTime();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="1083508360")
    @Export(value="wait")
    public int wait(int n, int n2) {
        long l = (long)n2 * 1000000L;
        long l2 = this.lastTimeNano - System.nanoTime();
        if (l2 < l) {
            l2 = l;
        }
        class174.method3881(l2 / 1000000L);
        long l3 = System.nanoTime();
        int n3 = 0;
        while (n3 < 10 && (n3 < 1 || this.lastTimeNano < l3)) {
            ++n3;
            this.lastTimeNano += (long)n * 1000000L;
        }
        if (this.lastTimeNano < l3) {
            this.lastTimeNano = l3;
        }
        return n3;
    }
}

