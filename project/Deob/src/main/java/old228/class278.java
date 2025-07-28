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

@ObfuscatedName(value="kj")
public class class278
implements Comparator {
    class278() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lkn;Lkn;I)I", garbageValue="-1085068041")
    int method5967(class271 class2712, class271 class2713) {
        return class2712.method5832() - class2713.method5832();
    }

    public int compare(Object object, Object object2) {
        return this.method5967((class271)object, (class271)object2);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;S)I", garbageValue="-24914")
    public static int method5972(CharSequence charSequence) {
        return class141.method3510(charSequence, 10, true);
    }

    @ObfuscatedName(value="lj")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="280658968")
    static void method5969() {
        if (!client.field522) {
            return;
        }
        class361 class3612 = class170.field1807.method7023(class33.field149, client.field659);
        if (class3612 != null && class3612.field3976 != null) {
            class90 class902 = new class90();
            class902.field1077 = class3612;
            class902.field1086 = class3612.field3976;
            class471.method9136(class902);
        }
        client.field660 = -1;
        client.field522 = false;
        class122.method3325(class3612);
    }
}

