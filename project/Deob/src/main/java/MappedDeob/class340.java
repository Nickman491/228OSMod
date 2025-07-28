/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="no")
class class340
implements Callable {
    @ObfuscatedName(value="gb")
    @ObfuscatedGetter(intValue=1026790625)
    @Export(value="currentPort")
    static int currentPort;
    @ObfuscatedName(value="uv")
    @ObfuscatedGetter(intValue=2099192279)
    static int field3703;
    @ObfuscatedSignature(descriptor="Lma;")
    final /* synthetic */ MidiPcmStream this$0;
    final /* synthetic */ AtomicBoolean val$cancelled;

    @ObfuscatedSignature(descriptor="(Lma;Ljava/util/concurrent/atomic/AtomicBoolean;)V")
    class340(MidiPcmStream midiPcmStream, AtomicBoolean atomicBoolean) {
        this.this$0 = midiPcmStream;
        this.val$cancelled = atomicBoolean;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object call() {
        PriorityQueue priorityQueue = this.this$0.field3646;
        while (true) {
            class337 class3372 = null;
            PriorityQueue priorityQueue2 = priorityQueue;
            synchronized (priorityQueue2) {
                if (priorityQueue.isEmpty() || this.val$cancelled.get()) {
                    return null;
                }
                class3372 = (class337)priorityQueue.remove();
            }
            class3372.field3688.method1130();
        }
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="1320044401")
    static int method6897(int n, int n2) {
        int n3 = 0;
        while (true) {
            if (n3 >= 8) {
                return 0;
            }
            if (n2 <= n + 30) break;
            n += 30;
            n += n3 != 1 && n3 != 3 ? 5 : 20;
            ++n3;
        }
        return n3;
    }
}

