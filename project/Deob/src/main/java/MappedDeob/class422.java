/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="qf")
public class class422 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lqa;")
    public class427 field4728 = FaceNormal.method4465();
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lqh;")
    public class426 field4729 = class289.method6322();
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lqh;")
    public class426 field4732 = Varps.method6964(1.0f, 1.0f, 1.0f);

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-841889556")
    public void method8253() {
        this.field4728.method8354();
        this.field4729.method8317();
        this.field4732.method8317();
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!(object instanceof class422)) {
            return false;
        }
        class422 class4222 = (class422)object;
        return this.field4728.equals(class4222.field4728) && this.field4729.method8288(class4222.field4729) && this.field4732.method8288(class4222.field4732);
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + this.field4728.hashCode();
        n2 = n2 * 31 + this.field4729.hashCode();
        n2 = 31 * n2 + this.field4732.hashCode();
        return n2;
    }

    public String toString() {
        return "[" + this.field4728.toString() + "|" + this.field4729.toString() + "|" + this.field4732.toString() + "]";
    }
}

