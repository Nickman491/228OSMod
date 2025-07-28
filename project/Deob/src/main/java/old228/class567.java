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

@ObfuscatedName(value="vg")
public abstract class class567 {
    @ObfuscatedName(value="az")
    public int[] field5552;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-97046745)
    public int field5551;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-131339153)
    public int field5550;
    @ObfuscatedName(value="an")
    protected float[] field5553;

    protected class567() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="268701696")
    public abstract void vmethod10689(int var1, int var2);

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="0")
    public abstract void vmethod10698(int var1, int var2, int var3, int var4);

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1201528197")
    public final void method10693() {
        class566.method10603(this.field5552, this.field5551, this.field5550, this.field5553);
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="36")
    public final void method10691(boolean bl) {
        this.field5553 = bl ? new float[this.field5550 * this.field5551 + 1] : null;
    }
}

