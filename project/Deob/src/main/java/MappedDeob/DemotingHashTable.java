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

@ObfuscatedName(value="mf")
@Implements(value="DemotingHashTable")
public final class DemotingHashTable {
    @ObfuscatedName(value="ay")
    @Export(value="capacity")
    int capacity;
    @ObfuscatedName(value="ah")
    @Export(value="remaining")
    int remaining;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lue;")
    @Export(value="hashTable")
    IterableNodeHashTable hashTable;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lpz;")
    @Export(value="queue")
    IterableDualNodeQueue queue = new IterableDualNodeQueue();
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lmk;")
    class312 field3289;

    public DemotingHashTable(int n, int n2) {
        int n3;
        this.capacity = n;
        this.remaining = n;
        for (n3 = 1; n3 + n3 < n && n3 < n2; n3 += n3) {
        }
        this.hashTable = new IterableNodeHashTable(n3);
    }

    public DemotingHashTable(int n) {
        this(n, n);
    }

    @ObfuscatedName(value="ay")
    @Export(value="get")
    public Object get(long l) {
        Wrapper wrapper = (Wrapper)this.hashTable.get(l);
        if (wrapper == null) {
            return null;
        }
        Object object = wrapper.get();
        if (object != null) {
            if (!wrapper.isSoft()) {
                this.queue.add(wrapper);
                wrapper.keyDual = 0L;
            } else {
                DirectWrapper directWrapper = new DirectWrapper(object, wrapper.size);
                this.hashTable.put(directWrapper, wrapper.key);
                this.queue.add(directWrapper);
                directWrapper.keyDual = 0L;
                wrapper.remove();
                wrapper.removeDual();
            }
            return object;
        }
        wrapper.remove();
        wrapper.removeDual();
        this.remaining += wrapper.size;
        return null;
    }

    @ObfuscatedName(value="ah")
    @Export(value="remove")
    void remove(long l) {
        Wrapper wrapper = (Wrapper)this.hashTable.get(l);
        this.removeWrapper(wrapper);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lmy;)V")
    @Export(value="removeWrapper")
    void removeWrapper(Wrapper wrapper) {
        if (wrapper != null) {
            wrapper.remove();
            wrapper.removeDual();
            this.remaining += wrapper.size;
        }
    }

    @ObfuscatedName(value="ao")
    public void method6549(Object object, long l) {
        this.put(object, l, 1);
    }

    @ObfuscatedName(value="ad")
    @Export(value="put")
    public void put(Object object, long l, int n) {
        if (n > this.capacity) {
            throw new IllegalStateException();
        }
        this.remove(l);
        this.remaining -= n;
        while (true) {
            Wrapper wrapper;
            if (this.remaining >= 0) {
                wrapper = new DirectWrapper(object, n);
                this.hashTable.put(wrapper, l);
                this.queue.add(wrapper);
                wrapper.keyDual = 0L;
                return;
            }
            wrapper = (Wrapper)this.queue.removeLast();
            if (wrapper == null) break;
            if (!wrapper.isSoft()) {
                // empty if block
            }
            this.removeWrapper(wrapper);
            if (this.field3289 == null) continue;
            this.field3289.method6541(wrapper.get());
        }
        throw new RuntimeException("");
    }

    @ObfuscatedName(value="an")
    @Export(value="demote")
    public void demote(int n) {
        Wrapper wrapper = (Wrapper)this.queue.last();
        while (wrapper != null) {
            if (!wrapper.isSoft()) {
                if (++wrapper.keyDual > (long)n) {
                    SoftWrapper softWrapper = new SoftWrapper(wrapper.get(), wrapper.size);
                    this.hashTable.put(softWrapper, wrapper.key);
                    IterableDualNodeQueue.DualNodeDeque_addBefore(softWrapper, wrapper);
                    wrapper.remove();
                    wrapper.removeDual();
                }
            } else if (wrapper.get() == null) {
                wrapper.remove();
                wrapper.removeDual();
                this.remaining += wrapper.size;
            }
            wrapper = (Wrapper)this.queue.previous();
        }
        return;
    }

    @ObfuscatedName(value="ae")
    @Export(value="clear")
    public void clear() {
        this.queue.clear();
        this.hashTable.clear();
        this.remaining = this.capacity;
    }
}

