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

@ObfuscatedName(value="io")
@Implements(value="MilliClock")
public class MilliClock
extends Clock {
    @ObfuscatedName(value="ay")
    long[] field2399 = new long[10];
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1008911357)
    int field2400 = 256;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1670163177)
    int field2401 = 1;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(longValue=7303459872380216089L)
    long field2402 = ReflectionCheck.method724();
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1956802617)
    int field2403 = 0;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1048142161)
    int field2404;

    public MilliClock() {
        int n = 0;
        while (n < 10) {
            this.field2399[n] = this.field2402;
            ++n;
        }
        return;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1922091569")
    @Export(value="mark")
    public void mark() {
        int n = 0;
        while (n < 10) {
            this.field2399[n] = 0L;
            ++n;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="1083508360")
    @Export(value="wait")
    public int wait(int n, int n2) {
        int n3;
        int n4 = this.field2400;
        int n5 = this.field2401;
        this.field2400 = 300;
        this.field2401 = 1;
        this.field2402 = ReflectionCheck.method724();
        if (this.field2399[this.field2404] == 0L) {
            this.field2400 = n4;
            this.field2401 = n5;
        } else if (this.field2402 > this.field2399[this.field2404]) {
            this.field2400 = (int)((long)(n * 2560) / (this.field2402 - this.field2399[this.field2404]));
        }
        if (this.field2400 < 25) {
            this.field2400 = 25;
        }
        if (this.field2400 > 256) {
            this.field2400 = 256;
            this.field2401 = (int)((long)n - (this.field2402 - this.field2399[this.field2404]) / 10L);
        }
        if (this.field2401 > n) {
            this.field2401 = n;
        }
        this.field2399[this.field2404] = this.field2402;
        this.field2404 = (this.field2404 + 1) % 10;
        if (this.field2401 > 1) {
            for (n3 = 0; n3 < 10; ++n3) {
                if (0L == this.field2399[n3]) continue;
                this.field2399[n3] = (long)this.field2401 + this.field2399[n3];
            }
        }
        if (this.field2401 < n2) {
            this.field2401 = n2;
        }
        class174.method3881(this.field2401);
        n3 = 0;
        while (true) {
            if (this.field2403 >= 256) {
                this.field2403 &= 0xFF;
                return n3;
            }
            ++n3;
            this.field2403 += this.field2400;
        }
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(IS)I", garbageValue="-14012")
    static int method4964(int n) {
        Message message = (Message)Messages.Messages_hashTable.get(n);
        if (message == null) {
            return -1;
        }
        if (message.nextDual == Messages.Messages_queue.sentinel) {
            return -1;
        }
        return ((Message)message.nextDual).count;
    }

    @ObfuscatedName(value="hn")
    @ObfuscatedSignature(descriptor="(I)J", garbageValue="1454186243")
    static long method4963() {
        return Client.field736;
    }
}

