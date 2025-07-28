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

@ObfuscatedName(value="sc")
public class class473
extends class478 {
    @ObfuscatedName(value="ck")
    @ObfuscatedGetter(intValue=706986527)
    static int field5001;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lsb;")
    class479 field4999 = class479.field5024;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lsb;")
    class479 field5000 = class479.field5024;

    class473() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1646421790")
    void method9143() {
        this.field4999 = class479.field5024;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-274373997")
    public final boolean method9153() {
        if (this.field4999 == class479.field5024) {
            this.method9144();
        }
        return this.field4999 == class479.field5023;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1913873145")
    void method9144() {
        this.field4999 = class10.field54.field825.method9194(this.field5002) ? class479.field5023 : class479.field5022;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-2126139789")
    void method9145() {
        this.field5000 = class479.field5024;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="4")
    public final boolean method9146() {
        if (this.field5000 == class479.field5024) {
            this.method9148();
        }
        return this.field5000 == class479.field5023;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1748003540")
    void method9148() {
        this.field5000 = class10.field54.field828.method9194(this.field5002) ? class479.field5023 : class479.field5022;
    }
}

