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

@ObfuscatedName(value="ip")
@Implements(value="InvDefinition")
public class InvDefinition
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="InvDefinition_archive")
    static AbstractArchive InvDefinition_archive;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="InvDefinition_cached")
    static EvictingDualNodeHashTable InvDefinition_cached;
    @ObfuscatedName(value="ax")
    @Export(value="Tiles_hue")
    static int[] Tiles_hue;
    @ObfuscatedName(value="sf")
    @ObfuscatedSignature(descriptor="Lgq;")
    @Export(value="guestClanSettings")
    static ClanSettings guestClanSettings;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=522434629)
    @Export(value="size")
    public int size = 0;

    static {
        InvDefinition_cached = new EvictingDualNodeHashTable(64);
    }

    InvDefinition() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="659202401")
    @Export(value="decode")
    void decode(Buffer buffer) {
        int n;
        while ((n = buffer.readUnsignedByte()) != 0) {
            this.decodeNext(buffer, n);
        }
        return;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="-1952497567")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        if (n == 2) {
            this.size = buffer.readUnsignedShort();
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="16")
    @Export(value="isWorldMapEvent")
    public static boolean isWorldMapEvent(int n) {
        return n == 10 || n == 11 || n == 12 || n == 13 || n == 14 || n == 15 || n == 16 || n == 17;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;I)V", garbageValue="450752558")
    public static void method5120(AbstractArchive abstractArchive) {
        ParamComposition.ParamDefinition_archive = abstractArchive;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;II)V", garbageValue="-728355894")
    static final void method5121(String string, int n) {
        PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3379, Client.packetWriter.isaacCipher);
        packetBufferNode.packetBuffer.writeByte(MouseRecorder.stringCp1252NullTerminatedByteSize(string) + 1);
        packetBufferNode.packetBuffer.method10477(n);
        packetBufferNode.packetBuffer.writeStringCp1252NullTerminated(string);
        Client.packetWriter.addNode(packetBufferNode);
    }

    @ObfuscatedName(value="kd")
    @ObfuscatedSignature(descriptor="(IIIIIIIIIZI)V", garbageValue="-1228848950")
    static void method5109(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, boolean bl) {
        TileItem tileItem = new TileItem();
        tileItem.id = n4;
        tileItem.field1385 = n5;
        tileItem.method3101(n6);
        tileItem.field1386 = Client.field693 + n7;
        tileItem.field1387 = n8 + Client.field693;
        tileItem.field1391 = n9;
        tileItem.field1384 = bl;
        if (class30.field131.field1327[n][n2][n3] == null) {
            class30.field131.field1327[n][n2][n3] = new NodeDeque();
        }
        class30.field131.field1327[n][n2][n3].addFirst(tileItem);
        ByteArrayPool.method8927(n, n2, n3);
    }
}

