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
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ep")
@Implements(value="PacketWriter")
public class PacketWriter {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lsq;")
    @Export(value="socket")
    AbstractSocket socket;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lps;")
    @Export(value="packetBufferNodes")
    IterableNodeDeque packetBufferNodes = new IterableNodeDeque();
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1527394769)
    @Export(value="bufferSize")
    int bufferSize = 0;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lvy;")
    @Export(value="buffer")
    Buffer buffer = new Buffer(5000);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lwr;")
    @Export(value="isaacCipher")
    public IsaacCipher isaacCipher;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lvv;")
    @Export(value="packetBuffer")
    PacketBuffer packetBuffer = new PacketBuffer(40000);
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lmn;")
    @Export(value="serverPacket")
    ServerPacket serverPacket = null;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-554681029)
    int field1452 = 0;
    @ObfuscatedName(value="at")
    boolean field1457 = true;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-1900238241)
    int field1454 = 0;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=555548547)
    @Export(value="pendingWrites")
    int pendingWrites = 0;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=1785260499)
    int field1456 = 0;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-1743314537)
    int field1445;
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Lmn;")
    ServerPacket field1458;
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lmn;")
    ServerPacket field1447;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lmn;")
    ServerPacket field1460;

    PacketWriter() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1444195951")
    @Export(value="clearBuffer")
    final void clearBuffer() {
        this.packetBufferNodes.rsClear();
        this.bufferSize = 0;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="911985798")
    @Export(value="flush")
    final void flush() throws IOException {
        if (this.socket != null && this.bufferSize > 0) {
            this.buffer.offset = 0;
            while (true) {
                PacketBufferNode packetBufferNode;
                if ((packetBufferNode = (PacketBufferNode)this.packetBufferNodes.last()) == null || packetBufferNode.index > this.buffer.array.length - this.buffer.offset) {
                    this.socket.write(this.buffer.array, 0, this.buffer.offset);
                    this.pendingWrites = 0;
                    break;
                }
                this.buffer.writeBytes(packetBufferNode.packetBuffer.array, 0, packetBufferNode.index);
                this.bufferSize -= packetBufferNode.index;
                packetBufferNode.remove();
                packetBufferNode.packetBuffer.releaseArray();
                packetBufferNode.release();
            }
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lmb;I)V", garbageValue="1268821956")
    @Export(value="addNode")
    public final void addNode(PacketBufferNode packetBufferNode) {
        this.packetBufferNodes.addFirst(packetBufferNode);
        packetBufferNode.index = packetBufferNode.packetBuffer.offset;
        packetBufferNode.packetBuffer.offset = 0;
        this.bufferSize += packetBufferNode.index;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lsq;I)V", garbageValue="375321384")
    @Export(value="setSocket")
    void setSocket(AbstractSocket abstractSocket) {
        this.socket = abstractSocket;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-4")
    @Export(value="close")
    void close() {
        if (this.socket != null) {
            this.socket.close();
            this.socket = null;
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-14145")
    @Export(value="removeSocket")
    void removeSocket() {
        this.socket = null;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)Lsq;", garbageValue="-145702831")
    @Export(value="getSocket")
    AbstractSocket getSocket() {
        return this.socket;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)[B", garbageValue="167109404")
    @Export(value="ByteArrayPool_getArray")
    public static byte[] ByteArrayPool_getArray(int n) {
        return AbstractWorldMapIcon.ByteArrayPool_getArrayBool(n, false);
    }
}

