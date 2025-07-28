/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pf")
@Implements(value="IterableDualNodeQueueIterator")
public class IterableDualNodeQueueIterator
implements Iterator {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpz;")
    @Export(value="queue")
    IterableDualNodeQueue queue;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ltm;")
    @Export(value="head")
    DualNode head;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Ltm;")
    @Export(value="last")
    DualNode last = null;

    @ObfuscatedSignature(descriptor="(Lpz;)V")
    IterableDualNodeQueueIterator(IterableDualNodeQueue iterableDualNodeQueue) {
        this.queue = iterableDualNodeQueue;
        this.head = this.queue.sentinel.previousDual;
        this.last = null;
    }

    public Object next() {
        DualNode dualNode = this.head;
        if (dualNode != this.queue.sentinel) {
            this.head = dualNode.previousDual;
        } else {
            dualNode = null;
            this.head = null;
        }
        this.last = dualNode;
        return dualNode;
    }

    @Override
    public void remove() {
        if (this.last == null) {
            throw new IllegalStateException();
        }
        this.last.removeDual();
        this.last = null;
    }

    @Override
    public boolean hasNext() {
        return this.queue.sentinel != this.head;
    }
}

