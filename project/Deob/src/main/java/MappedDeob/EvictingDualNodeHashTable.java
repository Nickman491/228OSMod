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

@ObfuscatedName(value="mi")
@Implements(value="EvictingDualNodeHashTable")
public final class EvictingDualNodeHashTable {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ltm;")
    @Export(value="dualNode")
    DualNode dualNode = new DualNode();
    @ObfuscatedName(value="ah")
    @Export(value="capacity")
    int capacity;
    @ObfuscatedName(value="az")
    @Export(value="remainingCapacity")
    int remainingCapacity;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lue;")
    @Export(value="hashTable")
    IterableNodeHashTable hashTable;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lpz;")
    @Export(value="deque")
    IterableDualNodeQueue deque = new IterableDualNodeQueue();

    public EvictingDualNodeHashTable(int n) {
        this.capacity = n;
        this.remainingCapacity = n;
        int n2 = 1;
        while (n2 + n2 < n) {
            n2 += n2;
        }
        this.hashTable = new IterableNodeHashTable(n2);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(J)Ltm;")
    @Export(value="get")
    public DualNode get(long l) {
        DualNode dualNode = (DualNode)this.hashTable.get(l);
        if (dualNode != null) {
            this.deque.add(dualNode);
        }
        return dualNode;
    }

    @ObfuscatedName(value="ah")
    @Export(value="remove")
    public void remove(long l) {
        DualNode dualNode = (DualNode)this.hashTable.get(l);
        if (dualNode != null) {
            dualNode.remove();
            dualNode.removeDual();
            ++this.remainingCapacity;
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ltm;J)V")
    @Export(value="put")
    public void put(DualNode dualNode, long l) {
        if (this.remainingCapacity != 0) {
            --this.remainingCapacity;
        } else {
            DualNode dualNode2 = this.deque.removeLast();
            dualNode2.remove();
            dualNode2.removeDual();
            if (dualNode2 == this.dualNode) {
                dualNode2 = this.deque.removeLast();
                dualNode2.remove();
                dualNode2.removeDual();
            }
        }
        this.hashTable.put(dualNode, l);
        this.deque.add(dualNode);
    }

    @ObfuscatedName(value="ao")
    @Export(value="clear")
    public void clear() {
        this.deque.clear();
        this.hashTable.clear();
        this.dualNode = new DualNode();
        this.remainingCapacity = this.capacity;
    }
}

