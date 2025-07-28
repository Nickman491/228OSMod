package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="qn")
public class class434
extends AbstractQueue {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="[Lqq;")
    class432[] field4793;
    @ObfuscatedName(value="ah")
    Map field4797;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1652179925)
    int field4792;
    @ObfuscatedName(value="ao")
    final Comparator field4795;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1936714925)
    int field4796 = 0;

    public class434(int n, Comparator comparator) {
        this.field4793 = new class432[n];
        this.field4797 = new HashMap();
        this.field4795 = comparator;
    }

    public class434(int n) {
        this(n, null);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1188088117")
    void method8496() {
        int n = (this.field4793.length << 1) + 1;
        this.field4793 = Arrays.copyOf(this.field4793, n);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-2020518532")
    void method8492(int n) {
        class432 class4322 = this.field4793[n];
        while (true) {
            class432 class4323;
            int n2;
            block4: {
                block3: {
                    if (n <= 0) break block3;
                    n2 = n - 1 >>> 1;
                    class4323 = this.field4793[n2];
                    if (!(this.field4795 == null ? ((Comparable)class4322.field4785).compareTo(class4323.field4785) >= 0 : this.field4795.compare(class4322.field4785, class4323.field4785) >= 0)) break block4;
                }
                this.field4793[n] = class4322;
                this.field4793[n].field4784 = n;
                return;
            }
            this.field4793[n] = class4323;
            this.field4793[n].field4784 = n;
            n = n2;
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1409273919")
    void method8490(int n) {
        class432 class4322 = this.field4793[n];
        int n2 = this.field4792 >>> 1;
        while (true) {
            int n3;
            block5: {
                block4: {
                    if (n >= n2) break block4;
                    int n4 = (n << 1) + 1;
                    class432 class4323 = this.field4793[n4];
                    int n5 = (n << 1) + 2;
                    class432 class4324 = this.field4793[n5];
                    n3 = this.field4795 == null ? (n5 < this.field4792 && ((Comparable)class4323.field4785).compareTo(class4324.field4785) > 0 ? n5 : n4) : (n5 < this.field4792 && this.field4795.compare(class4323.field4785, class4324.field4785) > 0 ? n5 : n4);
                    if (!(this.field4795 == null ? ((Comparable)class4322.field4785).compareTo(this.field4793[n3].field4785) <= 0 : this.field4795.compare(class4322.field4785, this.field4793[n3].field4785) <= 0)) break block5;
                }
                this.field4793[n] = class4322;
                this.field4793[n].field4784 = n;
                return;
            }
            this.field4793[n] = this.field4793[n3];
            this.field4793[n].field4784 = n;
            n = n3;
        }
    }

    @Override
    public boolean remove(Object object) {
        class432 class4322 = (class432)this.field4797.remove(object);
        if (class4322 == null) {
            return false;
        }
        ++this.field4796;
        --this.field4792;
        if (class4322.field4784 != this.field4792) {
            class432 class4323 = this.field4793[this.field4792];
            this.field4793[this.field4792] = null;
            this.field4793[class4322.field4784] = class4323;
            this.field4793[class4322.field4784].field4784 = class4322.field4784;
            this.method8490(class4322.field4784);
            if (class4323 == this.field4793[class4322.field4784]) {
                this.method8492(class4322.field4784);
            }
            return true;
        }
        this.field4793[this.field4792] = null;
        return true;
    }

    @Override
    public Object peek() {
        if (this.field4792 == 0) {
            return null;
        }
        return this.field4793[0].field4785;
    }

    @Override
    public int size() {
        return this.field4792;
    }

    @Override
    public boolean offer(Object object) {
        if (this.field4797.containsKey(object)) {
            throw new IllegalArgumentException("");
        }
        ++this.field4796;
        int n = this.field4792;
        if (n >= this.field4793.length) {
            this.method8496();
        }
        ++this.field4792;
        if (n != 0) {
            this.field4793[n] = new class432(object, n);
            this.field4797.put(object, this.field4793[n]);
            this.method8492(n);
        } else {
            this.field4793[0] = new class432(object, 0);
            this.field4797.put(object, this.field4793[0]);
        }
        return true;
    }

    @Override
    public Iterator iterator() {
        return new class433(this);
    }

    @Override
    public Object poll() {
        if (this.field4792 == 0) {
            return null;
        }
        ++this.field4796;
        Object object = this.field4793[0].field4785;
        this.field4797.remove(object);
        --this.field4792;
        if (this.field4792 == 0) {
            this.field4793[this.field4792] = null;
        } else {
            this.field4793[0] = this.field4793[this.field4792];
            this.field4793[0].field4784 = 0;
            this.field4793[this.field4792] = null;
            this.method8490(0);
        }
        return object;
    }

    @Override
    public Object[] toArray() {
        Object[] objectArray = super.toArray();
        if (this.field4795 != null) {
            Arrays.sort(objectArray, this.field4795);
        } else {
            Arrays.sort(objectArray);
        }
        return objectArray;
    }

    @Override
    public boolean contains(Object object) {
        return this.field4797.containsKey(object);
    }
}

