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

@ObfuscatedName(value="ux")
@Implements(value="IterableNodeHashTableIterator")
public class IterableNodeHashTableIterator
implements Iterator {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lue;")
    @Export(value="hashTable")
    IterableNodeHashTable hashTable;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ltf;")
    @Export(value="head")
    Node head;
    @ObfuscatedName(value="az")
    @Export(value="index")
    int index;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Ltf;")
    @Export(value="last")
    Node last = null;

    @ObfuscatedSignature(descriptor="(Lue;)V")
    public IterableNodeHashTableIterator(IterableNodeHashTable iterableNodeHashTable) {
        this.hashTable = iterableNodeHashTable;
        this.start();
    }

    @ObfuscatedName(value="ay")
    @Export(value="start")
    void start() {
        this.head = this.hashTable.buckets[0].previous;
        this.index = 1;
        this.last = null;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="()Ltf;")
    public Node method9951() {
        this.start();
        return (Node)this.next();
    }

    public Object next() {
        if (this.hashTable.buckets[this.index - 1] == this.head) {
            Node node;
            do {
                if (this.index < this.hashTable.size) continue;
                return null;
            } while ((node = this.hashTable.buckets[this.index++].previous) == this.hashTable.buckets[this.index - 1]);
            this.head = node.previous;
            this.last = node;
            return node;
        }
        Node node = this.head;
        this.head = node.previous;
        this.last = node;
        return node;
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
        if (this.hashTable.buckets[this.index - 1] != this.head) {
            return true;
        }
        while (true) {
            if (this.index >= this.hashTable.size) {
                return false;
            }
            if (this.hashTable.buckets[this.index++].previous != this.hashTable.buckets[this.index - 1]) break;
            this.head = this.hashTable.buckets[this.index - 1];
        }
        this.head = this.hashTable.buckets[this.index - 1].previous;
        return true;
    }
}

