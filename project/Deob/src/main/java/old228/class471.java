package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="sk")
public class class471
extends class478 {
    @ObfuscatedName(value="ay")
    boolean field4990;
    @ObfuscatedName(value="ah")
    boolean field4991;

    class471() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lsk;S)I", garbageValue="-18687")
    int method9135(class471 class4712) {
        if (this.field5020 == client.field689 && client.field689 != class4712.field5020) {
            return -1;
        }
        if (client.field689 == class4712.field5020 && this.field5020 != client.field689) {
            return 1;
        }
        if (this.field5020 != 0 && class4712.field5020 == 0) {
            return -1;
        }
        if (class4712.field5020 != 0 && this.field5020 == 0) {
            return 1;
        }
        if (this.field4990 && !class4712.field4990) {
            return -1;
        }
        if (!this.field4990 && class4712.field4990) {
            return 1;
        }
        if (this.field4991 && !class4712.field4991) {
            return -1;
        }
        if (!this.field4991 && class4712.field4991) {
            return 1;
        }
        if (this.field5020 == 0) {
            return class4712.field5018 - this.field5018;
        }
        return this.field5018 - class4712.field5018;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lso;I)I", garbageValue="1212702091")
    public int vmethod9266(class474 class4742) {
        return this.method9135((class471)class4742);
    }

    @Override
    public int compareTo(Object object) {
        return this.method9135((class471)object);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ldf;I)V", garbageValue="-236997524")
    public static void method9136(class90 class902) {
        class150.method3597(class902, 500000, 475000);
    }
}

