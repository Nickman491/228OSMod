package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ev")
public class class122
extends class475 {
    @ObfuscatedName(value="ay")
    final boolean field1488;

    public class122(boolean bl) {
        this.field1488 = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lsu;Lsu;I)I", garbageValue="724269610")
    int method3327(class478 class4782, class478 class4783) {
        if (client.field689 != class4782.field5020) {
            if (class4783.field5020 == client.field689) {
                return this.field1488 ? 1 : -1;
            }
        } else if (class4783.field5020 != client.field689) {
            return this.field1488 ? -1 : 1;
        }
        return this.method9184(class4782, class4783);
    }

    public int compare(Object object, Object object2) {
        return this.method3327((class478)object, (class478)object2);
    }

    @ObfuscatedName(value="md")
    @ObfuscatedSignature(descriptor="(Lna;I)V", garbageValue="1034774525")
    public static void method3325(class361 class3612) {
        if (class3612 != null && class3612.field4022 == client.field619) {
            client.field713[class3612.field4021] = true;
        }
    }

    @ObfuscatedName(value="oo")
    @ObfuscatedSignature(descriptor="(B)Lpa;", garbageValue="100")
    static class392 method3320() {
        return HitSplatDef.field2760;
    }
}

