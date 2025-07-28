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

@ObfuscatedName(value="vs")
public class class563
implements Comparator {
    @ObfuscatedName(value="ay")
    final boolean field5534;

    public class563(boolean bl) {
        this.field5534 = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lso;Lso;I)I", garbageValue="1635422235")
    int method10587(class474 class4742, class474 class4743) {
        return this.field5534 ? class4742.method9161().method10972(class4743.method9161()) : class4743.method9161().method10972(class4742.method9161());
    }

    public int compare(Object object, Object object2) {
        return this.method10587((class474)object, (class474)object2);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
}

