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
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="lu")
@Implements(value="AbstractWorldMapData")
public abstract class AbstractWorldMapData {
    @ObfuscatedName(value="jq")
    @ObfuscatedGetter(intValue=930710513)
    static int field3215;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=747892736)
    @Export(value="regionXLow")
    int regionXLow;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=81772864)
    @Export(value="regionYLow")
    int regionYLow;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=780184599)
    @Export(value="regionX")
    int regionX;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-950004071)
    @Export(value="regionY")
    int regionY;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-432409417)
    @Export(value="minPlane")
    int minPlane;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-171903861)
    @Export(value="planes")
    int planes;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-1411211197)
    @Export(value="groupId")
    int groupId = -1;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-921447447)
    @Export(value="fileId")
    int fileId = -1;
    @ObfuscatedName(value="aq")
    @Export(value="floorUnderlayIds")
    short[][][] floorUnderlayIds;
    @ObfuscatedName(value="af")
    @Export(value="floorOverlayIds")
    short[][][] floorOverlayIds;
    @ObfuscatedName(value="aa")
    byte[][][] field3210;
    @ObfuscatedName(value="ak")
    byte[][][] field3205;
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="[[[[Llx;")
    @Export(value="decorations")
    WorldMapDecoration[][][][] decorations;
    @ObfuscatedName(value="av")
    boolean field3213;
    @ObfuscatedName(value="ag")
    boolean field3214;

    AbstractWorldMapData() {
        new LinkedList();
        this.field3213 = false;
        this.field3214 = false;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;B)V", garbageValue="-46")
    @Export(value="readGeography")
    abstract void readGeography(Buffer var1);

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1510656174")
    @Export(value="isFullyLoaded")
    boolean isFullyLoaded() {
        return this.field3213 && this.field3214;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(Lpq;I)V", garbageValue="1797083612")
    @Export(value="loadGeography")
    void loadGeography(AbstractArchive abstractArchive) {
        if (this.isFullyLoaded()) {
            return;
        }
        byte[] byArray = abstractArchive.takeFile(this.groupId, this.fileId);
        if (byArray != null) {
            this.readGeography(new Buffer(byArray));
            this.field3213 = true;
            this.field3214 = true;
        }
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-2138652093")
    @Export(value="reset")
    void reset() {
        this.floorUnderlayIds = null;
        this.floorOverlayIds = null;
        this.field3210 = null;
        this.field3205 = null;
        this.decorations = null;
        this.field3213 = false;
        this.field3214 = false;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(IILvy;B)V", garbageValue="4")
    @Export(value="readTile")
    void readTile(int n, int n2, Buffer buffer) {
        int n3 = buffer.readUnsignedByte();
        if (n3 != 0) {
            if ((n3 & 1) == 0) {
                this.method6368(n, n2, buffer, n3);
            } else {
                this.method6367(n, n2, buffer, n3);
            }
            return;
        }
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(IILvy;II)V", garbageValue="-91703415")
    void method6367(int n, int n2, Buffer buffer, int n3) {
        boolean bl;
        boolean bl2 = bl = (n3 & 2) != 0;
        if (bl) {
            this.floorOverlayIds[0][n][n2] = (short)buffer.readUnsignedShort();
        }
        this.floorUnderlayIds[0][n][n2] = (short)buffer.readUnsignedShort();
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(IILvy;IB)V", garbageValue="-67")
    void method6368(int n, int n2, Buffer buffer, int n3) {
        int n4;
        int n5;
        int n6;
        int n7 = ((n3 & 0x18) >> 3) + 1;
        boolean bl = (n3 & 2) != 0;
        boolean bl2 = (n3 & 4) != 0;
        this.floorUnderlayIds[0][n][n2] = (short)buffer.readUnsignedShort();
        if (bl) {
            n6 = buffer.readUnsignedByte();
            for (n5 = 0; n5 < n6; ++n5) {
                int n8 = buffer.readUnsignedShort();
                if (n8 == 0) continue;
                this.floorOverlayIds[n5][n][n2] = (short)n8;
                n4 = buffer.readUnsignedByte();
                this.field3210[n5][n][n2] = (byte)(n4 >> 2);
                this.field3205[n5][n][n2] = (byte)(n4 & 3);
            }
        }
        if (bl2) {
            for (n6 = 0; n6 < n7; ++n6) {
                n5 = buffer.readUnsignedByte();
                if (n5 == 0) continue;
                WorldMapDecoration[] worldMapDecorationArray = new WorldMapDecoration[n5];
                this.decorations[n6][n][n2] = worldMapDecorationArray;
                WorldMapDecoration[] worldMapDecorationArray2 = worldMapDecorationArray;
                for (n4 = 0; n4 < n5; ++n4) {
                    int n9 = buffer.method10476();
                    int n10 = buffer.readUnsignedByte();
                    worldMapDecorationArray2[n4] = new WorldMapDecoration(n9, n10 >> 2, n10 & 3);
                }
            }
        }
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="16")
    @Export(value="getRegionX")
    int getRegionX() {
        return this.regionX;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="35")
    @Export(value="getRegionY")
    int getRegionY() {
        return this.regionY;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Lqe;", garbageValue="1411520419")
    public static class428 method6389() {
        class428[] class428Array = class428.field4758;
        synchronized (class428.field4758) {
            if (class428.field4759 == 0) {
                // ** MonitorExit[var0] (shouldn't be in output)
                return new class428();
            }
            class428.field4758[--class428.field4759].method8372();
            // ** MonitorExit[var0] (shouldn't be in output)
            return class428.field4758[class428.field4759];
        }
    }
}

