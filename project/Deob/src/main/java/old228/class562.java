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

@ObfuscatedName(value="vz")
public class class562
implements Comparator {
    @ObfuscatedName(value="ay")
    final boolean field5533;

    public class562(boolean bl) {
        this.field5533 = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lso;Lso;I)I", garbageValue="-1279298974")
    int method10581(class474 class4742, class474 class4743) {
        return this.field5533 ? class4742.vmethod9266(class4743) : class4743.vmethod9266(class4742);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    public int compare(Object object, Object object2) {
        return this.method10581((class474)object, (class474)object2);
    }
}

