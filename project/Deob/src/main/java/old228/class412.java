package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ps")
public class class412
implements Iterable,
Collection {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ltf;")
    class514 field4701;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ltf;")
    class514 field4700;

    public class412() {
        this.field4701.field5173 = this.field4701 = new class514();
        this.field4701.field5175 = this.field4701;
    }

    @ObfuscatedName(value="ay")
    public void method8042() {
        while (this.field4701.field5173 != this.field4701) {
            this.field4701.field5173.method9623();
        }
        return;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ltf;)V")
    public void method8043(class514 class5142) {
        if (class5142.field5175 != null) {
            class5142.method9623();
        }
        class5142.field5175 = this.field4701.field5175;
        class5142.field5173 = this.field4701;
        class5142.field5175.field5173 = class5142;
        class5142.field5173.field5175 = class5142;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ltf;)V")
    public void method8113(class514 class5142) {
        if (class5142.field5175 != null) {
            class5142.method9623();
        }
        class5142.field5175 = this.field4701;
        class5142.field5173 = this.field4701.field5173;
        class5142.field5175.field5173 = class5142;
        class5142.field5173.field5175 = class5142;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="()Ltf;")
    public class514 method8046() {
        return this.method8090(null);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Ltf;)Ltf;")
    class514 method8090(class514 class5142) {
        class514 class5143 = class5142 == null ? this.field4701.field5173 : class5142;
        if (class5143 != this.field4701) {
            this.field4700 = class5143.field5173;
            return class5143;
        }
        this.field4700 = null;
        return null;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="()Ltf;")
    public class514 method8048() {
        class514 class5142 = this.field4700;
        if (class5142 != this.field4701) {
            this.field4700 = class5142.field5173;
            return class5142;
        }
        this.field4700 = null;
        return null;
    }

    @ObfuscatedName(value="ax")
    int method8061() {
        int n = 0;
        class514 class5142 = this.field4701.field5173;
        while (class5142 != this.field4701) {
            ++n;
            class5142 = class5142.field5173;
        }
        return n;
    }

    @ObfuscatedName(value="at")
    public boolean method8050() {
        return this.field4701.field5173 == this.field4701;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="()[Ltf;")
    class514[] method8051() {
        class514[] class514Array = new class514[this.method8061()];
        int n = 0;
        class514 class5142 = this.field4701.field5173;
        while (class5142 != this.field4701) {
            class514Array[n++] = class5142;
            class5142 = class5142.field5173;
        }
        return class514Array;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Ltf;)Z")
    boolean method8052(class514 class5142) {
        this.method8043(class5142);
        return true;
    }

    @Override
    public Iterator iterator() {
        return new class411(this);
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
        class514 class5142 = this.field4701.field5173;
        while (class5142 != this.field4701) {
            objectArray[n++] = class5142;
            class5142 = class5142.field5173;
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
        return this.method8052((class514)object);
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
        this.method8042();
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ltf;Ltf;)V")
    public static void method8045(class514 class5142, class514 class5143) {
        if (class5142.field5175 != null) {
            class5142.method9623();
        }
        class5142.field5175 = class5143;
        class5142.field5173 = class5143.field5173;
        class5142.field5175.field5173 = class5142;
        class5142.field5173.field5175 = class5142;
    }
}

