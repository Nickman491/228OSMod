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

@ObfuscatedName(value="lm")
@Implements(value="WorldMapSection0")
public class WorldMapSection0
implements WorldMapSection {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=374769887)
    @Export(value="oldZ")
    int oldZ;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=344112399)
    @Export(value="newZ")
    int newZ;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1856263099)
    @Export(value="oldX")
    int oldX;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=286775725)
    @Export(value="oldY")
    int oldY;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-828001247)
    @Export(value="newX")
    int newX;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1353964283)
    @Export(value="newY")
    int newY;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1766889347)
    @Export(value="oldChunkXLow")
    int oldChunkXLow;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1789200761)
    @Export(value="oldChunkYLow")
    int oldChunkYLow;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=1449937041)
    @Export(value="oldChunkXHigh")
    int oldChunkXHigh;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-1893291229)
    @Export(value="oldChunkYHigh")
    int oldChunkYHigh;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-1620698785)
    @Export(value="newChunkXLow")
    int newChunkXLow;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-212616909)
    @Export(value="newChunkYLow")
    int newChunkYLow;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=2138023255)
    @Export(value="newChunkXHigh")
    int newChunkXHigh;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-532819435)
    @Export(value="newChunkYHigh")
    int newChunkYHigh;

    WorldMapSection0() {
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lkg;B)V", garbageValue="43")
    @Export(value="expandBounds")
    public void expandBounds(WorldMapArea worldMapArea) {
        if (worldMapArea.regionLowX > this.newX) {
            worldMapArea.regionLowX = this.newX;
        }
        if (worldMapArea.regionHighX < this.newX) {
            worldMapArea.regionHighX = this.newX;
        }
        if (worldMapArea.regionLowY > this.newY) {
            worldMapArea.regionLowY = this.newY;
        }
        if (worldMapArea.regionHighY < this.newY) {
            worldMapArea.regionHighY = this.newY;
        }
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIB)Z", garbageValue="53")
    @Export(value="containsCoord")
    public boolean containsCoord(int n, int n2, int n3) {
        if (n >= this.oldZ && n < this.newZ + this.oldZ) {
            return n2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && n2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && n3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && n3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
        }
        return false;
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="-177019651")
    @Export(value="containsPosition")
    public boolean containsPosition(int n, int n2) {
        return n >= (this.newX << 6) + (this.newChunkXLow << 3) && n <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && n2 >= (this.newY << 6) + (this.newChunkYLow << 3) && n2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIIB)[I", garbageValue="1")
    @Export(value="getBorderTileLengths")
    public int[] getBorderTileLengths(int n, int n2, int n3) {
        if (this.containsCoord(n, n2, n3)) {
            int[] nArray = new int[]{this.newX * 64 - this.oldX * 64 + n2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), n3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
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
            int n3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + n;
            int n4 = this.oldY * 64 - this.newY * 64 + n2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
            return new Coord(this.oldZ, n3, n4);
        }
        return null;
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1542767096")
    @Export(value="read")
    public void read(Buffer buffer) {
        this.oldZ = buffer.readUnsignedByte();
        this.newZ = buffer.readUnsignedByte();
        this.oldX = buffer.readUnsignedShort();
        this.oldChunkXLow = buffer.readUnsignedByte();
        this.oldChunkXHigh = buffer.readUnsignedByte();
        this.oldY = buffer.readUnsignedShort();
        this.oldChunkYLow = buffer.readUnsignedByte();
        this.oldChunkYHigh = buffer.readUnsignedByte();
        this.newX = buffer.readUnsignedShort();
        this.newChunkXLow = buffer.readUnsignedByte();
        this.newChunkXHigh = buffer.readUnsignedByte();
        this.newY = buffer.readUnsignedShort();
        this.newChunkYLow = buffer.readUnsignedByte();
        this.newChunkYHigh = buffer.readUnsignedByte();
        this.postRead();
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-774872799")
    @Export(value="postRead")
    void postRead() {
    }

    @ObfuscatedName(value="ib")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="891741750")
    static boolean method6358() {
        return (Client.drawPlayerNames & 4) != 0;
    }
}

