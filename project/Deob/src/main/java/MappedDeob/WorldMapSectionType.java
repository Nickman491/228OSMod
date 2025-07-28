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

@ObfuscatedName(value="lf")
@Implements(value="WorldMapSectionType")
public class WorldMapSectionType
extends Enum
implements class404 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Llf;")
    @Export(value="WORLDMAPSECTIONTYPE0")
    static final /* enum */ WorldMapSectionType WORLDMAPSECTIONTYPE0 = new WorldMapSectionType("runelite", 0, 0, 0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Llf;")
    @Export(value="WORLDMAPSECTIONTYPE1")
    static final /* enum */ WorldMapSectionType WORLDMAPSECTIONTYPE1 = new WorldMapSectionType("runelite", 1, 3, 1);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Llf;")
    @Export(value="WORLDMAPSECTIONTYPE2")
    static final /* enum */ WorldMapSectionType WORLDMAPSECTIONTYPE2 = new WorldMapSectionType("runelite", 2, 1, 2);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Llf;")
    @Export(value="WORLDMAPSECTIONTYPE3")
    static final /* enum */ WorldMapSectionType WORLDMAPSECTIONTYPE3 = new WorldMapSectionType("runelite", 3, 2, 3);
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lvf;")
    @Export(value="leftTitleSprite")
    static SpritePixels leftTitleSprite;
    @ObfuscatedName(value="ju")
    static byte[][] field3193;
    @ObfuscatedName(value="tq")
    @ObfuscatedGetter(intValue=58883679)
    static int field3187;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1870578927)
    @Export(value="type")
    final int type;
    @ObfuscatedName(value="an")
    @Export(value="id")
    final byte id;

    /*
     * WARNING - void declaration
     */
    WorldMapSectionType() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.type = var3_1;
        this.id = var4_2;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.id;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Lmr;", garbageValue="-1935350685")
    public static class323[] method6360() {
        return new class323[]{class323.field3420, class323.field3423, class323.field3421, class323.field3427, class323.field3419, class323.field3424, class323.field3425, class323.field3422, class323.field3429, class323.field3428, class323.field3433, class323.field3430, class323.field3431, class323.field3432};
    }
}

