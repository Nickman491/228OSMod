/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ps")
@Implements(value="IterableNodeDeque")
public class IterableNodeDeque
implements Iterable,
Collection {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ltf;")
    @Export(value="sentinel")
    Node sentinel;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ltf;")
    Node field4700;

    public IterableNodeDeque() {
        this.sentinel.previous = this.sentinel = new Node();
        this.sentinel.next = this.sentinel;
    }

    @ObfuscatedName(value="ay")
    @Export(value="rsClear")
    public void rsClear() {
        while (this.sentinel.previous != this.sentinel) {
            this.sentinel.previous.remove();
        }
        return;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ltf;)V")
    @Export(value="addFirst")
    public void addFirst(Node node) {
        if (node.next != null) {
            node.remove();
        }
        node.next = this.sentinel.next;
        node.previous = this.sentinel;
        node.next.previous = node;
        node.previous.next = node;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ltf;)V")
    @Export(value="addLast")
    public void addLast(Node node) {
        if (node.next != null) {
            node.remove();
        }
        node.next = this.sentinel;
        node.previous = this.sentinel.previous;
        node.next.previous = node;
        node.previous.next = node;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="()Ltf;")
    @Export(value="last")
    public Node last() {
        return this.method8090(null);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Ltf;)Ltf;")
    Node method8090(Node node) {
        Node node2 = node == null ? this.sentinel.previous : node;
        if (node2 != this.sentinel) {
            this.field4700 = node2.previous;
            return node2;
        }
        this.field4700 = null;
        return null;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="()Ltf;")
    @Export(value="previous")
    public Node previous() {
        Node node = this.field4700;
        if (node != this.sentinel) {
            this.field4700 = node.previous;
            return node;
        }
        this.field4700 = null;
        return null;
    }

    @ObfuscatedName(value="ax")
    int method8061() {
        int n = 0;
        Node node = this.sentinel.previous;
        while (node != this.sentinel) {
            ++n;
            node = node.previous;
        }
        return n;
    }

    @ObfuscatedName(value="at")
    public boolean method8050() {
        return this.sentinel.previous == this.sentinel;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="()[Ltf;")
    Node[] method8051() {
        Node[] nodeArray = new Node[this.method8061()];
        int n = 0;
        Node node = this.sentinel.previous;
        while (node != this.sentinel) {
            nodeArray[n++] = node;
            node = node.previous;
        }
        return nodeArray;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Ltf;)Z")
    boolean method8052(Node node) {
        this.addFirst(node);
        return true;
    }

    @Override
    public Iterator iterator() {
        return new IterableNodeDequeDescendingIterator(this);
    }

    @Override
    public int size() {
        return this.method8061();
    }

    @Override
    public boolean isEmpty() {
        return this.method8050();
    }

    @Override
    public boolean contains(Object object) {
        throw new RuntimeException();
    }

    @Override
    public Object[] toArray() {
        return this.method8051();
    }

    public Object[] toArray(Object[] objectArray) {
        int n = 0;
        Node node = this.sentinel.previous;
        while (node != this.sentinel) {
            objectArray[n++] = node;
            node = node.previous;
        }
        return objectArray;
    }

    public boolean containsAll(Collection collection) {
        throw new RuntimeException();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public boolean removeAll(Collection collection) {
        throw new RuntimeException();
    }

    public boolean retainAll(Collection collection) {
        throw new RuntimeException();
    }

    public boolean add(Object object) {
        return this.method8052((Node)object);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    public boolean addAll(Collection collection) {
        throw new RuntimeException();
    }

    @Override
    public boolean remove(Object object) {
        throw new RuntimeException();
    }

    @Override
    public void clear() {
        this.rsClear();
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ltf;Ltf;)V")
    @Export(value="IterableNodeDeque_addBefore")
    public static void IterableNodeDeque_addBefore(Node node, Node node2) {
        if (node.next != null) {
            node.remove();
        }
        node.next = node2;
        node.previous = node2.previous;
        node.next.previous = node;
        node.previous.next = node;
    }
}

