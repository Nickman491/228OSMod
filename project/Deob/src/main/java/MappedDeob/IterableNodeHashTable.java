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

@ObfuscatedName(value="ue")
@Implements(value="IterableNodeHashTable")
public final class IterableNodeHashTable
implements Iterable {
    @ObfuscatedName(value="ay")
    @Export(value="size")
    int size;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="[Ltf;")
    @Export(value="buckets")
    Node[] buckets;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Ltf;")
    @Export(value="currentGet")
    Node currentGet;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Ltf;")
    @Export(value="current")
    Node current;
    @ObfuscatedName(value="ad")
    @Export(value="index")
    int index = 0;

    public IterableNodeHashTable(int n) {
        this.size = n;
        this.buckets = new Node[n];
        int n2 = 0;
        while (n2 < n) {
            Node node;
            node.previous = node = (this.buckets[n2] = new Node());
            node.next = node;
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(J)Ltf;")
    @Export(value="get")
    public Node get(long l) {
        Node node = this.buckets[(int)(l & (long)(this.size - 1))];
        this.currentGet = node.previous;
        while (true) {
            if (node == this.currentGet) {
                this.currentGet = null;
                return null;
            }
            if (this.currentGet.key == l) break;
            this.currentGet = this.currentGet.previous;
        }
        Node node2 = this.currentGet;
        this.currentGet = this.currentGet.previous;
        return node2;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ltf;J)V")
    @Export(value="put")
    public void put(Node node, long l) {
        if (node.next != null) {
            node.remove();
        }
        Node node2 = this.buckets[(int)(l & (long)(this.size - 1))];
        node.next = node2.next;
        node.previous = node2;
        node.next.previous = node;
        node.previous.next = node;
        node.key = l;
    }

    @ObfuscatedName(value="az")
    @Export(value="clear")
    public void clear() {
        int n = 0;
        block0: while (true) {
            if (n >= this.size) {
                this.currentGet = null;
                this.current = null;
                return;
            }
            Node node = this.buckets[n];
            while (true) {
                Node node2;
                if ((node2 = node.previous) == node) {
                    ++n;
                    continue block0;
                }
                node2.remove();
            }
            break;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="()Ltf;")
    @Export(value="first")
    public Node first() {
        this.index = 0;
        return this.next();
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="()Ltf;")
    @Export(value="next")
    public Node next() {
        Node node;
        if (this.index > 0 && this.buckets[this.index - 1] != this.current) {
            Node node2 = this.current;
            this.current = node2.previous;
            return node2;
        }
        do {
            if (this.index < this.size) continue;
            return null;
        } while ((node = this.buckets[this.index++].previous) == this.buckets[this.index - 1]);
        this.current = node.previous;
        return node;
    }

    public Iterator iterator() {
        return new IterableNodeHashTableIterator(this);
    }
}

