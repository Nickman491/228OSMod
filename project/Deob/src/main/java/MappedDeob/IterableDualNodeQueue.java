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

@ObfuscatedName(value="pz")
@Implements(value="IterableDualNodeQueue")
public class IterableDualNodeQueue
implements Iterable {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ltm;")
    @Export(value="sentinel")
    public DualNode sentinel;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ltm;")
    @Export(value="head")
    DualNode head;

    public IterableDualNodeQueue() {
        this.sentinel.previousDual = this.sentinel = new DualNode();
        this.sentinel.nextDual = this.sentinel;
    }

    @ObfuscatedName(value="ay")
    @Export(value="clear")
    public void clear() {
        while (this.sentinel.previousDual != this.sentinel) {
            this.sentinel.previousDual.removeDual();
        }
        return;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ltm;)V")
    @Export(value="add")
    public void add(DualNode dualNode) {
        if (dualNode.nextDual != null) {
            dualNode.removeDual();
        }
        dualNode.nextDual = this.sentinel.nextDual;
        dualNode.previousDual = this.sentinel;
        dualNode.nextDual.previousDual = dualNode;
        dualNode.previousDual.nextDual = dualNode;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="()Ltm;")
    @Export(value="removeLast")
    public DualNode removeLast() {
        DualNode dualNode = this.sentinel.previousDual;
        if (dualNode == this.sentinel) {
            return null;
        }
        dualNode.removeDual();
        return dualNode;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="()Ltm;")
    @Export(value="last")
    public DualNode last() {
        return this.previousOrLast(null);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Ltm;)Ltm;")
    @Export(value="previousOrLast")
    DualNode previousOrLast(DualNode dualNode) {
        DualNode dualNode2 = dualNode == null ? this.sentinel.previousDual : dualNode;
        if (dualNode2 != this.sentinel) {
            this.head = dualNode2.previousDual;
            return dualNode2;
        }
        this.head = null;
        return null;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="()Ltm;")
    @Export(value="previous")
    public DualNode previous() {
        DualNode dualNode = this.head;
        if (dualNode != this.sentinel) {
            this.head = dualNode.previousDual;
            return dualNode;
        }
        this.head = null;
        return null;
    }

    public Iterator iterator() {
        return new IterableDualNodeQueueIterator(this);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ltm;Ltm;)V")
    @Export(value="DualNodeDeque_addBefore")
    public static void DualNodeDeque_addBefore(DualNode dualNode, DualNode dualNode2) {
        if (dualNode.nextDual != null) {
            dualNode.removeDual();
        }
        dualNode.nextDual = dualNode2;
        dualNode.previousDual = dualNode2.previousDual;
        dualNode.nextDual.previousDual = dualNode;
        dualNode.previousDual.nextDual = dualNode;
    }
}

