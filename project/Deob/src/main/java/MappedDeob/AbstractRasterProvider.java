/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="vg")
@Implements(value="AbstractRasterProvider")
public abstract class AbstractRasterProvider {
    @ObfuscatedName(value="az")
    @Export(value="pixels")
    public int[] pixels;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-97046745)
    @Export(value="width")
    public int width;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-131339153)
    @Export(value="height")
    public int height;
    @ObfuscatedName(value="an")
    protected float[] field5553;

    protected AbstractRasterProvider() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="268701696")
    @Export(value="drawFull")
    public abstract void drawFull(int var1, int var2);

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="0")
    @Export(value="draw")
    public abstract void draw(int var1, int var2, int var3, int var4);

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1201528197")
    @Export(value="apply")
    public final void apply() {
        Rasterizer2D.method10603(this.pixels, this.width, this.height, this.field5553);
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="36")
    public final void method10691(boolean bl) {
        this.field5553 = bl ? new float[this.height * this.width + 1] : null;
    }
}

