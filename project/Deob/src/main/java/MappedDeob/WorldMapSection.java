/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="lb")
@Implements(value="WorldMapSection")
public interface WorldMapSection {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lkg;B)V", garbageValue="43")
    @Export(value="expandBounds")
    public void expandBounds(WorldMapArea var1);

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIB)Z", garbageValue="53")
    @Export(value="containsCoord")
    public boolean containsCoord(int var1, int var2, int var3);

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="-177019651")
    @Export(value="containsPosition")
    public boolean containsPosition(int var1, int var2);

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIIB)[I", garbageValue="1")
    @Export(value="getBorderTileLengths")
    public int[] getBorderTileLengths(int var1, int var2, int var3);

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(III)Lnz;", garbageValue="-425070677")
    @Export(value="coord")
    public Coord coord(int var1, int var2);

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1542767096")
    @Export(value="read")
    public void read(Buffer var1);
}

