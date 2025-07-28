/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="rf")
class class464
implements Comparator {
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-242649963)
    static int field4955;
    @ObfuscatedName(value="ka")
    @ObfuscatedSignature(descriptor="[Lvf;")
    static SpritePixels[] field4957;
    @ObfuscatedSignature(descriptor="Lro;")
    final /* synthetic */ class465 this$0;

    @ObfuscatedSignature(descriptor="(Lro;)V")
    class464(class465 class4652) {
        this.this$0 = class4652;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lrs;Lrs;I)I", garbageValue="-339076083")
    int method9026(class466 class4662, class466 class4663) {
        if (class4662.field4969 > class4663.field4969) {
            return 1;
        }
        if (class4662.field4969 < class4663.field4969) {
            return -1;
        }
        return 0;
    }

    public int compare(Object object, Object object2) {
        return this.method9026((class466)object, (class466)object2);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
}

