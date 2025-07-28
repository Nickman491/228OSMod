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

@ObfuscatedName(value="lz")
@Implements(value="WorldMapData_1")
public class WorldMapData_1
extends AbstractWorldMapData {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=925829211)
    @Export(value="chunkXLow")
    int chunkXLow;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-873636975)
    @Export(value="chunkYLow")
    int chunkYLow;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1757891955)
    @Export(value="chunkX")
    int chunkX;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-797559619)
    @Export(value="chunkY")
    int chunkY;

    WorldMapData_1() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;S)V", garbageValue="17470")
    @Export(value="init")
    void init(Buffer buffer) {
        int n = buffer.readUnsignedByte();
        if (n == WorldMapID.field3241.value) {
            this.minPlane = buffer.readUnsignedByte();
            this.planes = buffer.readUnsignedByte();
            this.regionXLow = buffer.readUnsignedShort() * 4096;
            this.regionYLow = buffer.readUnsignedShort() * 64;
            this.chunkXLow = buffer.readUnsignedByte();
            this.chunkYLow = buffer.readUnsignedByte();
            this.regionX = buffer.readUnsignedShort();
            this.regionY = buffer.readUnsignedShort();
            this.chunkX = buffer.readUnsignedByte();
            this.chunkY = buffer.readUnsignedByte();
            this.groupId = buffer.method10476();
            this.fileId = buffer.method10476();
            return;
        }
        throw new IllegalStateException("");
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;B)V", garbageValue="-46")
    @Export(value="readGeography")
    void readGeography(Buffer buffer) {
        this.planes = Math.min(this.planes, 4);
        this.floorUnderlayIds = new short[1][64][64];
        this.floorOverlayIds = new short[this.planes][64][64];
        this.field3210 = new byte[this.planes][64][64];
        this.field3205 = new byte[this.planes][64][64];
        this.decorations = new WorldMapDecoration[this.planes][64][64][];
        int n = buffer.readUnsignedByte();
        if (n == class298.field3237.value) {
            int n2 = buffer.readUnsignedByte();
            int n3 = buffer.readUnsignedByte();
            int n4 = buffer.readUnsignedByte();
            int n5 = buffer.readUnsignedByte();
            if (n2 == this.regionX && n3 == this.regionY && n4 == this.chunkX && n5 == this.chunkY) {
                int n6 = 0;
                while (true) {
                    if (n6 >= 8) {
                        return;
                    }
                    for (int i = 0; i < 8; ++i) {
                        this.readTile(n6 + this.chunkX * 8, i + this.chunkY * 8, buffer);
                    }
                    ++n6;
                }
            }
            throw new IllegalStateException("");
        }
        throw new IllegalStateException("");
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="88")
    @Export(value="getChunkXLow")
    int getChunkXLow() {
        return this.chunkXLow;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="483757753")
    @Export(value="getChunkYLow")
    int getChunkYLow() {
        return this.chunkYLow;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-2068610270")
    @Export(value="getChunkX")
    int getChunkX() {
        return this.chunkX;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="315524748")
    @Export(value="getChunkY")
    int getChunkY() {
        return this.chunkY;
    }

    public int hashCode() {
        return this.regionX | this.regionY << 8 | this.chunkX << 16 | this.chunkY << 24;
    }

    public boolean equals(Object object) {
        if (object instanceof WorldMapData_1) {
            WorldMapData_1 worldMapData_1 = (WorldMapData_1)object;
            if (worldMapData_1.regionX == this.regionX && worldMapData_1.regionY == this.regionY) {
                return this.chunkX == worldMapData_1.chunkX && this.chunkY == worldMapData_1.chunkY;
            }
            return false;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1805668632")
    public static void method6298() {
        while (true) {
            ArchiveDiskAction archiveDiskAction;
            NodeDeque nodeDeque = ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue;
            synchronized (nodeDeque) {
                archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
            }
            if (archiveDiskAction == null) {
                return;
            }
            archiveDiskAction.archive.load(archiveDiskAction.archiveDisk, (int)archiveDiskAction.key, archiveDiskAction.data, false);
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="8")
    public static int method6279(int n) {
        return class506.field5147[n & 0x3FFF];
    }
}

