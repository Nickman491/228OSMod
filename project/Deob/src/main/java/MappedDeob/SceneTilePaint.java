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

@ObfuscatedName(value="hz")
@Implements(value="SceneTilePaint")
public final class SceneTilePaint {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=467024111)
    @Export(value="swColor")
    int swColor;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1969534629)
    @Export(value="seColor")
    int seColor;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1242849579)
    @Export(value="neColor")
    int neColor;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1818002973)
    @Export(value="nwColor")
    int nwColor;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=364631297)
    @Export(value="texture")
    int texture;
    @ObfuscatedName(value="an")
    @Export(value="isFlat")
    boolean isFlat = true;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1738255123)
    @Export(value="rgb")
    int rgb;

    SceneTilePaint(int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        this.swColor = n;
        this.seColor = n2;
        this.neColor = n3;
        this.nwColor = n4;
        this.texture = n5;
        this.rgb = n6;
        this.isFlat = bl;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1475607289")
    public static int method4708() {
        return ++MouseHandler.MouseHandler_idleCycles - 1;
    }
}

