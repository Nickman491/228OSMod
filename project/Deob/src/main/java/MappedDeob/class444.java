/*
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

@ObfuscatedName(value="rg")
public class class444
extends class448 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(longValue=575910451997902603L)
    long field4857;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-591086789)
    int field4858;

    @ObfuscatedSignature(descriptor="(Lrh;I)V")
    public class444(class448 class4482, int n) {
        super(class4482);
        this.field4858 = n;
        this.field4868 = "DelayFadeTask";
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1892560666")
    public boolean vmethod8883() {
        if (this.field4857 >= (long)this.field4858) {
            return true;
        }
        ++this.field4857;
        return false;
    }
}

