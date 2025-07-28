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

@ObfuscatedName(value="vv")
@Implements(value="PacketBuffer")
public class PacketBuffer
extends Buffer {
    @ObfuscatedName(value="ah")
    static final int[] field5466 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, Short.MAX_VALUE, 65535, 131071, 262143, 524287, 1048575, 0x1FFFFF, 0x3FFFFF, 0x7FFFFF, 0xFFFFFF, 0x1FFFFFF, 0x3FFFFFF, 0x7FFFFFF, 0xFFFFFFF, 0x1FFFFFFF, 0x3FFFFFFF, Integer.MAX_VALUE, -1};
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lwr;")
    @Export(value="isaacCipher")
    IsaacCipher isaacCipher;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-458675841)
    @Export(value="bitIndex")
    int bitIndex;

    public PacketBuffer(int n) {
        super(n);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([II)V", garbageValue="1906157384")
    @Export(value="newIsaacCipher")
    public void newIsaacCipher(int[] nArray) {
        this.isaacCipher = new IsaacCipher(nArray);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lwr;I)V", garbageValue="-1275790681")
    @Export(value="setIsaacCipher")
    public void setIsaacCipher(IsaacCipher isaacCipher) {
        this.isaacCipher = isaacCipher;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-478530350")
    @Export(value="writeByteIsaac")
    public void writeByteIsaac(int n) {
        this.array[++this.offset - 1] = (byte)(n + this.isaacCipher.nextInt());
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="4")
    @Export(value="readByteIsaac")
    public int readByteIsaac() {
        return this.array[++this.offset - 1] - this.isaacCipher.nextInt() & 0xFF;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="699577370")
    public boolean method10224() {
        int n = this.array[this.offset] - this.isaacCipher.method10888() & 0xFF;
        return n >= 128;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="19")
    @Export(value="readSmartByteShortIsaac")
    public int readSmartByteShortIsaac() {
        int n;
        if ((n = this.array[++this.offset - 1] - this.isaacCipher.nextInt() & 0xFF) < 128) {
            return n;
        }
        return (n - 128 << 8) + (this.array[++this.offset - 1] - this.isaacCipher.nextInt() & 0xFF);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="([BIII)V", garbageValue="367906627")
    public void method10225(byte[] byArray, int n, int n2) {
        for (int i = 0; i < n2; ++i) {
            byArray[i + n] = (byte)(this.array[++this.offset - 1] - this.isaacCipher.nextInt());
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="93")
    public void method10226() {
        this.bitIndex = this.offset * 8;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="7")
    @Export(value="readBits")
    public int readBits(int n) {
        int n2 = this.bitIndex >> 3;
        int n3 = 8 - (this.bitIndex & 7);
        int n4 = 0;
        this.bitIndex += n;
        while (true) {
            if (n <= n3) {
                n4 = n3 == n ? (n4 += this.array[n2] & field5466[n3]) : (this.array[n2] >> n3 - n & field5466[n]) + n4;
                return n4;
            }
            n4 += (this.array[n2++] & field5466[n3]) << n - n3;
            n -= n3;
            n3 = 8;
        }
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="508136829")
    @Export(value="exportIndex")
    public void exportIndex() {
        this.offset = (this.bitIndex + 7) / 8;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="-53")
    public int method10229(int n) {
        return n * 8 - this.bitIndex;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="569639568")
    public int method10230(int n) {
        return n - this.offset;
    }

    @ObfuscatedName(value="is")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="28")
    @Export(value="setWindowedMode")
    static void setWindowedMode(int n) {
        Client.field541 = 0L;
        Client.isResizable = n >= 2;
        if (TextureProvider.getWindowedMode() != 1) {
            Client.client.setMaxCanvasSize(7680, 2160);
        } else {
            Client.client.setMaxCanvasSize(765, 503);
        }
        if (Client.gameState >= 25 && Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
            PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3337, Client.packetWriter.isaacCipher);
            packetBufferNode.packetBuffer.writeByte(TextureProvider.getWindowedMode());
            packetBufferNode.packetBuffer.writeShort(BuddyRankComparator.canvasWidth);
            packetBufferNode.packetBuffer.writeShort(Huffman.canvasHeight);
            Client.packetWriter.addNode(packetBufferNode);
        }
    }
}

