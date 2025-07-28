/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pm")
@Implements(value="NodeDeque")
public class NodeDeque {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ltf;")
    @Export(value="sentinel")
    public Node sentinel;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ltf;")
    @Export(value="current")
    Node current;

    public NodeDeque() {
        this.sentinel.previous = this.sentinel = new Node();
        this.sentinel.next = this.sentinel;
    }

    @ObfuscatedName(value="ay")
    @Export(value="clear")
    public void clear() {
        while (true) {
            Node node;
            if ((node = this.sentinel.previous) == this.sentinel) {
                this.current = null;
                return;
            }
            node.remove();
        }
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
    @Export(value="removeLast")
    public Node removeLast() {
        Node node = this.sentinel.previous;
        if (node == this.sentinel) {
            return null;
        }
        node.remove();
        return node;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="()Ltf;")
    @Export(value="removeFirst")
    public Node removeFirst() {
        Node node = this.sentinel.next;
        if (node == this.sentinel) {
            return null;
        }
        node.remove();
        return node;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="()Ltf;")
    @Export(value="last")
    public Node last() {
        Node node = this.sentinel.previous;
        if (node != this.sentinel) {
            this.current = node.previous;
            return node;
        }
        this.current = null;
        return null;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="()Ltf;")
    @Export(value="first")
    public Node first() {
        Node node = this.sentinel.next;
        if (node != this.sentinel) {
            this.current = node.next;
            return node;
        }
        this.current = null;
        return null;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="()Ltf;")
    @Export(value="previous")
    public Node previous() {
        Node node = this.current;
        if (node != this.sentinel) {
            this.current = node.previous;
            return node;
        }
        this.current = null;
        return null;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="()Ltf;")
    @Export(value="next")
    public Node next() {
        Node node = this.current;
        if (node != this.sentinel) {
            this.current = node.next;
            return node;
        }
        this.current = null;
        return null;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ltf;Ltf;)V")
    @Export(value="NodeDeque_addBefore")
    public static void NodeDeque_addBefore(Node node, Node node2) {
        if (node.next != null) {
            node.remove();
        }
        node.next = node2.next;
        node.previous = node2;
        node.next.previous = node;
        node.previous.next = node;
    }
}

