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

@ObfuscatedName(value="kf")
@Implements(value="WorldMapIcon_1")
public class WorldMapIcon_1
extends AbstractWorldMapIcon {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1352700713)
    @Export(value="objectDefId")
    final int objectDefId;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lki;")
    @Export(value="region")
    final WorldMapRegion region;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=2131429413)
    @Export(value="element")
    int element;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lli;")
    @Export(value="label")
    WorldMapLabel label;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=441142667)
    @Export(value="subWidth")
    int subWidth;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-575586641)
    @Export(value="subHeight")
    int subHeight;

    @ObfuscatedSignature(descriptor="(Lnz;Lnz;ILki;)V")
    WorldMapIcon_1(Coord coord, Coord coord2, int n, WorldMapRegion worldMapRegion) {
        super(coord, coord2);
        this.objectDefId = n;
        this.region = worldMapRegion;
        this.init();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-76")
    @Export(value="init")
    void init() {
        this.element = class142.getObjectDefinition((int)this.objectDefId).transform().mapIconId;
        this.label = this.region.createMapLabel(class31.WorldMapElement_get(this.element));
        WorldMapElement worldMapElement = class31.WorldMapElement_get(this.getElement());
        SpritePixels spritePixels = worldMapElement.getSpriteBool(false);
        if (spritePixels == null) {
            this.subWidth = 0;
            this.subHeight = 0;
        } else {
            this.subWidth = spritePixels.subWidth;
            this.subHeight = spritePixels.subHeight;
        }
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="468922444")
    @Export(value="getElement")
    public int getElement() {
        return this.element;
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)Lli;", garbageValue="24")
    @Export(value="getLabel")
    WorldMapLabel getLabel() {
        return this.label;
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1283952551")
    @Export(value="getSubWidth")
    int getSubWidth() {
        return this.subWidth;
    }

    @Override
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1685687159")
    @Export(value="getSubHeight")
    int getSubHeight() {
        return this.subHeight;
    }
}

