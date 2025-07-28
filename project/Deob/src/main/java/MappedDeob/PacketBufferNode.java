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

@ObfuscatedName(value="mb")
@Implements(value="PacketBufferNode")
public class PacketBufferNode
extends Node {
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="[Lmb;")
    @Export(value="PacketBufferNode_packetBufferNodes")
    static PacketBufferNode[] PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=790177349)
    @Export(value="PacketBufferNode_packetBufferNodeCount")
    static int PacketBufferNode_packetBufferNodeCount = 0;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmm;")
    @Export(value="clientPacket")
    ClientPacket clientPacket;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1977829057)
    @Export(value="clientPacketLength")
    int clientPacketLength;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lvv;")
    @Export(value="packetBuffer")
    public PacketBuffer packetBuffer;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1763756621)
    @Export(value="index")
    public int index;

    PacketBufferNode() {
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1974751955")
    @Export(value="release")
    public void release() {
        if (PacketBufferNode_packetBufferNodeCount >= PacketBufferNode_packetBufferNodes.length) {
            return;
        }
        PacketBufferNode.PacketBufferNode_packetBufferNodes[++PacketBufferNode.PacketBufferNode_packetBufferNodeCount - 1] = this;
    }

    @ObfuscatedName(value="je")
    @ObfuscatedSignature(descriptor="(Ldx;I)Z", garbageValue="-1639240470")
    static boolean method6629(Player player) {
        boolean bl;
        if (Client.drawPlayerNames == 0) {
            return false;
        }
        if (ModeWhere.localPlayer == player) {
            boolean bl2 = (Client.drawPlayerNames & 8) != 0;
            return bl2;
        }
        boolean bl3 = WorldMapSection0.method6358();
        if (!bl3) {
            bl = (Client.drawPlayerNames & 1) != 0;
            boolean bl4 = bl3 = bl && player.method2697();
        }
        if (!(bl = bl3)) {
            boolean bl5 = (Client.drawPlayerNames & 2) != 0;
            bl = bl5 && player.method2658();
        }
        return bl;
    }
}

