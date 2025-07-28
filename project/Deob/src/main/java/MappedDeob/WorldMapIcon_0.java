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

@ObfuscatedName(value="lj")
@Implements(value="WorldMapIcon_0")
public class WorldMapIcon_0
extends AbstractWorldMapIcon {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1454486399)
    @Export(value="element")
    final int element;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lli;")
    @Export(value="label")
    final WorldMapLabel label;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-530200853)
    @Export(value="subWidth")
    final int subWidth;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-179215661)
    @Export(value="subHeight")
    final int subHeight;

    @ObfuscatedSignature(descriptor="(Lnz;Lnz;ILli;)V")
    WorldMapIcon_0(Coord coord, Coord coord2, int n, WorldMapLabel worldMapLabel) {
        super(coord, coord2);
        this.element = n;
        this.label = worldMapLabel;
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

    @ObfuscatedName(value="co")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-2063488600")
    static void method6334(int n) {
        if (n == -1) {
            return;
        }
        if (!ClanChannel.field1807.method7024(n)) {
            return;
        }
        Widget[] widgetArray = ClanChannel.field1807.field3772[n];
        int n2 = 0;
        while (n2 < widgetArray.length) {
            Widget widget = widgetArray[n2];
            if (widget.onLoad != null) {
                ScriptEvent scriptEvent = new ScriptEvent();
                scriptEvent.widget = widget;
                scriptEvent.args = widget.onLoad;
                class150.runScript(scriptEvent, 5000000, 0);
            }
            ++n2;
        }
        return;
    }
}

