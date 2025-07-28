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

@ObfuscatedName(value="pr")
@Implements(value="IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator
implements Iterator {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lps;")
    @Export(value="deque")
    IterableNodeDeque deque;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ltf;")
    Node field4697;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Ltf;")
    @Export(value="last")
    Node last = null;

    @ObfuscatedSignature(descriptor="(Lps;)V")
    IterableNodeDequeDescendingIterator(IterableNodeDeque iterableNodeDeque) {
        this.setDeque(iterableNodeDeque);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lps;)V")
    @Export(value="setDeque")
    void setDeque(IterableNodeDeque iterableNodeDeque) {
        this.deque = iterableNodeDeque;
        this.start();
    }

    @ObfuscatedName(value="ah")
    @Export(value="start")
    void start() {
        this.field4697 = this.deque != null ? this.deque.sentinel.previous : null;
        this.last = null;
    }

    @Override
    public void remove() {
        if (this.last == null) {
            throw new IllegalStateException();
        }
        this.last.remove();
        this.last = null;
    }

    @Override
    public boolean hasNext() {
        return this.deque.sentinel != this.field4697 && this.field4697 != null;
    }

    public Object next() {
        Node node = this.field4697;
        if (node != this.deque.sentinel) {
            this.field4697 = node.previous;
        } else {
            node = null;
            this.field4697 = null;
        }
        this.last = node;
        return node;
    }
}

