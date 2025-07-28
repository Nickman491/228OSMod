package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pr")
public class class411
implements Iterator {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lps;")
    class412 field4698;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ltf;")
    class514 field4697;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Ltf;")
    class514 field4699 = null;

    @ObfuscatedSignature(descriptor="(Lps;)V")
    class411(class412 class4122) {
        this.method8028(class4122);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lps;)V")
    void method8028(class412 class4122) {
        this.field4698 = class4122;
        this.method8029();
    }

    @ObfuscatedName(value="ah")
    void method8029() {
        this.field4697 = this.field4698 != null ? this.field4698.field4701.field5173 : null;
        this.field4699 = null;
    }

    @Override
    public void remove() {
        if (this.field4699 == null) {
            throw new IllegalStateException();
        }
        this.field4699.method9623();
        this.field4699 = null;
    }

    @Override
    public boolean hasNext() {
        return this.field4698.field4701 != this.field4697 && this.field4697 != null;
    }

    public Object next() {
        class514 class5142 = this.field4697;
        if (class5142 != this.field4698.field4701) {
            this.field4697 = class5142.field5173;
        } else {
            class5142 = null;
            this.field4697 = null;
        }
        this.field4699 = class5142;
        return class5142;
    }
}

