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
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="lv")
@Implements(value="WorldMapAreaData")
public class WorldMapAreaData
extends WorldMapArea {
    @ObfuscatedName(value="tb")
    @ObfuscatedGetter(intValue=-1291871039)
    static int field3274;
    @ObfuscatedName(value="af")
    @Export(value="worldMapData0Set")
    HashSet worldMapData0Set;
    @ObfuscatedName(value="aa")
    @Export(value="worldMapData1Set")
    HashSet worldMapData1Set;
    @ObfuscatedName(value="ak")
    @Export(value="iconList")
    List iconList;

    WorldMapAreaData() {
    }

    @ObfuscatedName(value="ck")
    @ObfuscatedSignature(descriptor="(Lvy;Lvy;IZI)V", garbageValue="-1315466009")
    @Export(value="init")
    void init(Buffer buffer, Buffer buffer2, int n, boolean bl) {
        int n2;
        this.read(buffer, n);
        int n3 = buffer2.readUnsignedShort();
        this.worldMapData0Set = new HashSet(n3);
        for (n2 = 0; n2 < n3; ++n2) {
            WorldMapData_0 worldMapData_0 = new WorldMapData_0();
            try {
                worldMapData_0.init(buffer2);
            }
            catch (IllegalStateException illegalStateException) {
                continue;
            }
            this.worldMapData0Set.add(worldMapData_0);
        }
        n2 = buffer2.readUnsignedShort();
        this.worldMapData1Set = new HashSet(n2);
        for (int i = 0; i < n2; ++i) {
            WorldMapData_1 worldMapData_1 = new WorldMapData_1();
            try {
                worldMapData_1.init(buffer2);
            }
            catch (IllegalStateException illegalStateException) {
                continue;
            }
            this.worldMapData1Set.add(worldMapData_1);
        }
        this.initIconsList(buffer2, bl);
    }

    @ObfuscatedName(value="cs")
    @ObfuscatedSignature(descriptor="(Lvy;ZI)V", garbageValue="1912354326")
    @Export(value="initIconsList")
    void initIconsList(Buffer buffer, boolean bl) {
        this.iconList = new LinkedList();
        int n = buffer.readUnsignedShort();
        int n2 = 0;
        while (n2 < n) {
            boolean bl2;
            int n3 = buffer.method10476();
            Coord coord = new Coord(buffer.readInt());
            boolean bl3 = bl2 = buffer.readUnsignedByte() == 1;
            if (bl || !bl2) {
                this.iconList.add(new WorldMapIcon_0(null, coord, n3, null));
            }
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="na")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="736875172")
    static final void method6494(int n, int n2) {
        ClanChannel clanChannel;
        ClanChannel clanChannel2 = clanChannel = n >= 0 ? Client.currentClanChannels[n] : class106.guestClanChannel;
        if (clanChannel != null && n2 >= 0 && n2 < clanChannel.method3837()) {
            ClanChannelMember clanChannelMember = (ClanChannelMember)clanChannel.members.get(n2);
            if (clanChannelMember.rank != -1) {
                return;
            }
            String string = clanChannelMember.username.getName();
            PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3408, Client.packetWriter.isaacCipher);
            packetBufferNode.packetBuffer.writeByte(3 + MouseRecorder.stringCp1252NullTerminatedByteSize(string));
            packetBufferNode.packetBuffer.writeByte(n);
            packetBufferNode.packetBuffer.writeShort(n2);
            packetBufferNode.packetBuffer.writeStringCp1252NullTerminated(string);
            Client.packetWriter.addNode(packetBufferNode);
            return;
        }
    }
}

