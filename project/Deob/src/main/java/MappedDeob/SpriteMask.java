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

@ObfuscatedName(value="nf")
@Implements(value="SpriteMask")
public class SpriteMask
extends DualNode {
    @ObfuscatedName(value="kd")
    @ObfuscatedSignature(descriptor="Lvf;")
    static SpritePixels field3758;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1573085963)
    @Export(value="width")
    public final int width;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1656732957)
    @Export(value="height")
    public final int height;
    @ObfuscatedName(value="az")
    @Export(value="xWidths")
    public final int[] xWidths;
    @ObfuscatedName(value="ao")
    @Export(value="xStarts")
    public final int[] xStarts;

    SpriteMask(int n, int n2, int[] nArray, int[] nArray2, int n3) {
        this.width = n;
        this.height = n2;
        this.xWidths = nArray;
        this.xStarts = nArray2;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIB)Z", garbageValue="63")
    @Export(value="contains")
    public boolean contains(int n, int n2) {
        int n3;
        return n2 >= 0 && n2 < this.xStarts.length && n >= (n3 = this.xStarts[n2]) && n <= n3 + this.xWidths[n2];
    }
}

