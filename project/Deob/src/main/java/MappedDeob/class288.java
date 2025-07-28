/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="lt")
public class class288
implements WorldMapSection {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1775251119)
    int field3163;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1575321749)
    int field3162;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=947655803)
    int field3156;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=277246349)
    int field3157;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1654093091)
    int field3158;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1951986327)
    int field3159;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-2112018911)
    int field3155;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1050491983)
    int field3154;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=1031370985)
    int field3161;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=1683391381)
    int field3160;

    class288() {
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lkg;B)V", garbageValue="43")
    @Export(value="expandBounds")
    public void expandBounds(WorldMapArea worldMapArea) {
        if (worldMapArea.regionLowX > this.field3158) {
            worldMapArea.regionLowX = this.field3158;
        }
        if (worldMapArea.regionHighX < this.field3158) {
            worldMapArea.regionHighX = this.field3158;
        }
        if (worldMapArea.regionLowY > this.field3159) {
            worldMapArea.regionLowY = this.field3159;
        }
        if (worldMapArea.regionHighY < this.field3159) {
            worldMapArea.regionHighY = this.field3159;
        }
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIB)Z", garbageValue="53")
    @Export(value="containsCoord")
    public boolean containsCoord(int n, int n2, int n3) {
        if (n >= this.field3163 && n < this.field3162 + this.field3163) {
            return n2 >= (this.field3156 << 6) + (this.field3155 << 3) && n2 <= (this.field3156 << 6) + (this.field3155 << 3) + 7 && n3 >= (this.field3157 << 6) + (this.field3154 << 3) && n3 <= (this.field3157 << 6) + (this.field3154 << 3) + 7;
        }
        return false;
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="-177019651")
    @Export(value="containsPosition")
    public boolean containsPosition(int n, int n2) {
        return n >= (this.field3158 << 6) + (this.field3161 << 3) && n <= (this.field3158 << 6) + (this.field3161 << 3) + 7 && n2 >= (this.field3159 << 6) + (this.field3160 << 3) && n2 <= (this.field3159 << 6) + (this.field3160 << 3) + 7;
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIIB)[I", garbageValue="1")
    @Export(value="getBorderTileLengths")
    public int[] getBorderTileLengths(int n, int n2, int n3) {
        if (this.containsCoord(n, n2, n3)) {
            int[] nArray = new int[]{this.field3158 * 64 - this.field3156 * 64 + n2 + (this.field3161 * 8 - this.field3155 * 8), n3 + (this.field3159 * 64 - this.field3157 * 64) + (this.field3160 * 8 - this.field3154 * 8)};
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
            int n3 = this.field3156 * 64 - this.field3158 * 64 + (this.field3155 * 8 - this.field3161 * 8) + n;
            int n4 = this.field3157 * 64 - this.field3159 * 64 + n2 + (this.field3154 * 8 - this.field3160 * 8);
            return new Coord(this.field3163, n3, n4);
        }
        return null;
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1542767096")
    @Export(value="read")
    public void read(Buffer buffer) {
        this.field3163 = buffer.readUnsignedByte();
        this.field3162 = buffer.readUnsignedByte();
        this.field3156 = buffer.readUnsignedShort();
        this.field3155 = buffer.readUnsignedByte();
        this.field3157 = buffer.readUnsignedShort();
        this.field3154 = buffer.readUnsignedByte();
        this.field3158 = buffer.readUnsignedShort();
        this.field3161 = buffer.readUnsignedByte();
        this.field3159 = buffer.readUnsignedShort();
        this.field3160 = buffer.readUnsignedByte();
        this.method6307();
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1403113813")
    void method6307() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(S)Lmb;", garbageValue="21848")
    public static PacketBufferNode method6320() {
        PacketBufferNode packetBufferNode = class19.method288();
        packetBufferNode.clientPacket = null;
        packetBufferNode.clientPacketLength = 0;
        packetBufferNode.packetBuffer = new PacketBuffer(5000);
        return packetBufferNode;
    }
}

