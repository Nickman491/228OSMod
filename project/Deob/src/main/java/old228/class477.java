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

@ObfuscatedName(value="sy")
public class class477
extends class474 {
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=1811218597)
    static int field5015;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1452578339)
    int field5016;

    class477() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lsy;I)I", garbageValue="-1005954819")
    int method9267(class477 class4772) {
        return this.field5016 - class4772.field5016;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lso;I)I", garbageValue="1212702091")
    public int vmethod9266(class474 class4742) {
        return this.method9267((class477)class4742);
    }

    @Override
    public int compareTo(Object object) {
        return this.method9267((class477)object);
    }
}

