package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ro")
public final class class465 {
    @ObfuscatedName(value="ay")
    final Comparator field4964 = new class464(this);
    @ObfuscatedName(value="ah")
    final Map field4960;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lqn;")
    final class434 field4961;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lqn;")
    final class434 field4962;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(longValue=3203989653765037379L)
    final long field4963;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lrq;")
    final class463 field4965;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1227924963)
    final int field4959;

    @ObfuscatedSignature(descriptor="(JILrq;)V")
    class465(long l, int n, class463 class4632) {
        this.field4963 = l;
        this.field4959 = n;
        this.field4965 = class4632;
        if (this.field4959 != -1) {
            if (this.field4965 == null) {
                throw new IllegalArgumentException("");
            }
            this.field4960 = new HashMap(this.field4959);
            this.field4961 = new class434(this.field4959, this.field4964);
            this.field4962 = new class434(this.field4959);
        } else {
            this.field4960 = new HashMap(64);
            this.field4961 = new class434(64, this.field4964);
            this.field4962 = null;
        }
    }

    @ObfuscatedSignature(descriptor="(ILrq;)V")
    public class465(int n, class463 class4632) {
        this(-1L, n, class4632);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1479259566")
    boolean method9036() {
        return this.field4959 != -1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Object;I)Ljava/lang/Object;", garbageValue="-2061781268")
    public Object method9037(Object object) {
        class465 class4652 = this;
        synchronized (class4652) {
            class466 class4662;
            if (this.field4963 != -1L) {
                this.method9052();
            }
            if ((class4662 = (class466)this.field4960.get(object)) == null) {
                return null;
            }
            this.method9048(class4662, false);
            return class4662.field4970;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;", garbageValue="607857320")
    public Object method9038(Object object, Object object2) {
        class465 class4652 = this;
        synchronized (class4652) {
            class466 class4662;
            class466 class4663;
            if (-1L != this.field4963) {
                this.method9052();
            }
            if ((class4663 = (class466)this.field4960.get(object)) != null) {
                Object object3 = class4663.field4970;
                class4663.field4970 = object2;
                this.method9048(class4663, false);
                return object3;
            }
            if (this.method9036() && this.field4960.size() == this.field4959) {
                class4662 = (class466)this.field4962.remove();
                this.field4960.remove(class4662.field4967);
                this.field4961.remove(class4662);
            }
            class4662 = new class466(object2, object);
            this.field4960.put(object, class4662);
            this.method9048(class4662, true);
            return null;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lrs;ZI)V", garbageValue="2120275250")
    void method9048(class466 class4662, boolean bl) {
        if (!bl) {
            this.field4961.remove(class4662);
            if (this.method9036() && !this.field4962.remove(class4662)) {
                throw new IllegalStateException("");
            }
        }
        class4662.field4969 = System.currentTimeMillis();
        if (this.method9036()) {
            switch (this.field4965.field4952) {
                case 1: {
                    ++class4662.field4966;
                    break;
                }
                case 0: {
                    class4662.field4966 = class4662.field4969;
                }
            }
            this.field4962.add(class4662);
        }
        this.field4961.add(class4662);
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="583766195")
    void method9052() {
        if (this.field4963 == -1L) {
            throw new IllegalStateException("");
        }
        long l = System.currentTimeMillis() - this.field4963;
        while (!this.field4961.isEmpty()) {
            class466 class4662 = (class466)this.field4961.peek();
            if (class4662.field4969 >= l) {
                return;
            }
            this.field4960.remove(class4662.field4967);
            this.field4961.remove(class4662);
            if (!this.method9036()) continue;
            this.field4962.remove(class4662);
        }
        return;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1000767985")
    public void method9041() {
        class465 class4652 = this;
        synchronized (class4652) {
            this.field4960.clear();
            this.field4961.clear();
            if (this.method9036()) {
                this.field4962.clear();
            }
        }
    }
}

