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

@ObfuscatedName(value="kp")
@Implements(value="WorldMapSection2")
public class WorldMapSection2
implements WorldMapSection {
    @ObfuscatedName(value="fs")
    @ObfuscatedSignature(descriptor="Lok;")
    static Archive field3102;
    @ObfuscatedName(value="kc")
    @ObfuscatedSignature(descriptor="[Lvi;")
    @Export(value="scrollBarSprites")
    static IndexedSprite[] scrollBarSprites;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1440027847)
    @Export(value="minPlane")
    int minPlane;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-437334943)
    @Export(value="planes")
    int planes;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=878567445)
    @Export(value="regionStartX")
    int regionStartX;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1988309377)
    @Export(value="regionStartY")
    int regionStartY;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1369617375)
    @Export(value="regionEndX")
    int regionEndX;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=97173577)
    @Export(value="regionEndY")
    int regionEndY;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-2004531413)
    int field3096;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1888039883)
    int field3095;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1409237689)
    int field3092;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=174576573)
    int field3099;

    WorldMapSection2() {
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lkg;B)V", garbageValue="43")
    @Export(value="expandBounds")
    public void expandBounds(WorldMapArea worldMapArea) {
        if (worldMapArea.regionLowX > this.field3096) {
            worldMapArea.regionLowX = this.field3096;
        }
        if (worldMapArea.regionHighX < this.field3092) {
            worldMapArea.regionHighX = this.field3092;
        }
        if (worldMapArea.regionLowY > this.field3095) {
            worldMapArea.regionLowY = this.field3095;
        }
        if (worldMapArea.regionHighY < this.field3099) {
            worldMapArea.regionHighY = this.field3099;
        }
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIB)Z", garbageValue="53")
    @Export(value="containsCoord")
    public boolean containsCoord(int n, int n2, int n3) {
        if (n >= this.minPlane && n < this.minPlane + this.planes) {
            return n2 >> 6 >= this.regionStartX && n2 >> 6 <= this.regionEndX && n3 >> 6 >= this.regionStartY && n3 >> 6 <= this.regionEndY;
        }
        return false;
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="-177019651")
    @Export(value="containsPosition")
    public boolean containsPosition(int n, int n2) {
        return n >> 6 >= this.field3096 && n >> 6 <= this.field3092 && n2 >> 6 >= this.field3095 && n2 >> 6 <= this.field3099;
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIIB)[I", garbageValue="1")
    @Export(value="getBorderTileLengths")
    public int[] getBorderTileLengths(int n, int n2, int n3) {
        if (this.containsCoord(n, n2, n3)) {
            int[] nArray = new int[]{this.field3096 * 64 - this.regionStartX * 64 + n2, n3 + (this.field3095 * 64 - this.regionStartY * 64)};
            return nArray;
        }
        return null;
    }

    @Override
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(III)Lnz;", garbageValue="-425070677")
    @Export(value="coord")
    public Coord coord(int n, int n2) {
        if (this.containsPosition(n, n2)) {
            int n3 = this.regionStartX * 64 - this.field3096 * 64 + n;
            int n4 = this.regionStartY * 64 - this.field3095 * 64 + n2;
            return new Coord(this.minPlane, n3, n4);
        }
        return null;
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1542767096")
    @Export(value="read")
    public void read(Buffer buffer) {
        this.minPlane = buffer.readUnsignedByte();
        this.planes = buffer.readUnsignedByte();
        this.regionStartX = buffer.readUnsignedShort();
        this.regionStartY = buffer.readUnsignedShort();
        this.regionEndX = buffer.readUnsignedShort();
        this.regionEndY = buffer.readUnsignedShort();
        this.field3096 = buffer.readUnsignedShort();
        this.field3095 = buffer.readUnsignedShort();
        this.field3092 = buffer.readUnsignedShort();
        this.field3099 = buffer.readUnsignedShort();
        this.postRead();
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1998585367")
    @Export(value="postRead")
    void postRead() {
    }

    @ObfuscatedName(value="iu")
    @ObfuscatedSignature(descriptor="(Lda;I)V", garbageValue="-2014514008")
    static final void method6018(Actor actor) {
        int n = Math.max(1, actor.field1263 - Client.cycle);
        int n2 = actor.field1247 * 128 + actor.field1268 * 936633408;
        int n3 = actor.field1249 * 128 + actor.field1268 * 936633408;
        actor.x += (n2 - actor.x) / n;
        actor.field1196 += (n3 - actor.field1196) / n;
        actor.field1269 = 0;
        actor.field1262 = actor.field1253;
    }
}

