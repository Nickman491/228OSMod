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

@ObfuscatedName(value="pf")
public class class414
implements Iterator {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpz;")
    class415 field4706;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ltm;")
    class510 field4705;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Ltm;")
    class510 field4704 = null;

    @ObfuscatedSignature(descriptor="(Lpz;)V")
    class414(class415 class4152) {
        this.field4706 = class4152;
        this.field4705 = this.field4706.field4707.field5168;
        this.field4704 = null;
    }

    public Object next() {
        class510 class5102 = this.field4705;
        if (class5102 != this.field4706.field4707) {
            this.field4705 = class5102.field5168;
        } else {
            class5102 = null;
            this.field4705 = null;
        }
        this.field4704 = class5102;
        return class5102;
    }

    @Override
    public void remove() {
        if (this.field4704 == null) {
            throw new IllegalStateException();
        }
        this.field4704.method9621();
        this.field4704 = null;
    }

    @Override
    public boolean hasNext() {
        return this.field4706.field4707 != this.field4705;
    }
}

