package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="rs")
public final class class466
implements Comparable {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lpq;")
    static class391 field4971;
    @ObfuscatedName(value="ee")
    @ObfuscatedSignature(descriptor="Liq;")
    static class222 field4968;
    @ObfuscatedName(value="ay")
    Object field4970;
    @ObfuscatedName(value="ah")
    Object field4967;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(longValue=7941363310758731965L)
    long field4969;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(longValue=-8628826825301261969L)
    long field4966;

    class466(Object object, Object object2) {
        this.field4970 = object;
        this.field4967 = object2;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lrs;I)I", garbageValue="-1075640087")
    int method9059(class466 class4662) {
        if (this.field4966 < class4662.field4966) {
            return -1;
        }
        if (this.field4966 > class4662.field4966) {
            return 1;
        }
        return 0;
    }

    public boolean equals(Object object) {
        if (object instanceof class466) {
            return this.field4967.equals(((class466)object).field4967);
        }
        throw new IllegalArgumentException();
    }

    public int compareTo(Object object) {
        return this.method9059((class466)object);
    }

    public int hashCode() {
        return this.field4967.hashCode();
    }
}

