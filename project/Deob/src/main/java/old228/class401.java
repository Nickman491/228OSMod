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

@ObfuscatedName(value="pe")
final class class401
implements Comparator {
    class401() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpj;Lpj;B)I", garbageValue="113")
    int method7935(class399 class3992, class399 class3993) {
        return class3992.field4637.field4645 < class3993.field4637.field4645 ? -1 : (class3993.field4637.field4645 == class3992.field4637.field4645 ? 0 : 1);
    }

    public int compare(Object object, Object object2) {
        return this.method7935((class399)object, (class399)object2);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
}

