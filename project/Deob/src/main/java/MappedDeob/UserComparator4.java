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
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ee")
@Implements(value="UserComparator4")
public class UserComparator4
implements Comparator {
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="[Luc;")
    @Export(value="JagexCache_idxFiles")
    public static BufferedFile[] JagexCache_idxFiles;
    @ObfuscatedName(value="cy")
    @ObfuscatedGetter(intValue=-1400294067)
    static int field1481;
    @ObfuscatedName(value="ay")
    @Export(value="reversed")
    final boolean reversed;

    public UserComparator4(boolean bl) {
        this.reversed = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lsu;Lsu;B)I", garbageValue="76")
    @Export(value="compare_bridged")
    int compare_bridged(Buddy buddy, Buddy buddy2) {
        return this.reversed ? buddy.int2 - buddy2.int2 : buddy2.int2 - buddy.int2;
    }

    public int compare(Object object, Object object2) {
        return this.compare_bridged((Buddy)object, (Buddy)object2);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @ObfuscatedName(value="nr")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-3927")
    @Export(value="Clan_leaveChat")
    static final void Clan_leaveChat() {
        PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3405, Client.packetWriter.isaacCipher);
        packetBufferNode.packetBuffer.writeByte(0);
        Client.packetWriter.addNode(packetBufferNode);
    }
}

