package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="py")
final class class398
implements Comparator {
    class398() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpj;Lpj;I)I", garbageValue="1702190653")
    int method7894(class399 class3992, class399 class3993) {
        return class3992.field4639 < class3993.field4639 ? -1 : (class3993.field4639 == class3992.field4639 ? 0 : 1);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    public int compare(Object object, Object object2) {
        return this.method7894((class399)object, (class399)object2);
    }

    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="40")
    protected static final void method7902() {
        int n;
        class16.field70.vmethod5071();
        for (n = 0; n < 32; ++n) {
            class34.field164[n] = 0L;
        }
        for (n = 0; n < 32; ++n) {
            class34.field165[n] = 0L;
        }
        class34.field160 = 0;
    }
}

