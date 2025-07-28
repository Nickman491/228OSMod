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
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gk")
@Implements(value="ClanChannel")
public class ClanChannel
extends Node {
    @ObfuscatedName(value="ek")
    @ObfuscatedSignature(descriptor="Lnq;")
    static class352 field1807;
    @ObfuscatedName(value="ay")
    boolean field1814;
    @ObfuscatedName(value="ah")
    boolean field1806 = true;
    @ObfuscatedName(value="az")
    @Export(value="members")
    public List members;
    @ObfuscatedName(value="ao")
    @Export(value="sortedMembers")
    int[] sortedMembers;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(longValue=5804263768996706621L)
    public long field1810;
    @ObfuscatedName(value="an")
    @Export(value="name")
    public String name = null;
    @ObfuscatedName(value="ae")
    public byte field1812;
    @ObfuscatedName(value="ax")
    public byte field1813;

    static {
        new BitSet(65536);
    }

    @ObfuscatedSignature(descriptor="(Lvy;)V")
    public ClanChannel(Buffer buffer) {
        this.method3851(buffer);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[I", garbageValue="-338552712")
    @Export(value="getSortedMembers")
    public int[] getSortedMembers() {
        if (this.sortedMembers != null) return this.sortedMembers;
        String[] stringArray = new String[this.members.size()];
        this.sortedMembers = new int[this.members.size()];
        int n = 0;
        while (true) {
            if (n >= this.members.size()) {
                Renderable.method4461(stringArray, this.sortedMembers);
                return this.sortedMembers;
            }
            stringArray[n] = ((ClanChannelMember)this.members.get((int)n)).username.method10974();
            this.sortedMembers[n] = n;
            ++n;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lfw;I)V", garbageValue="-564141182")
    @Export(value="addMember")
    void addMember(ClanChannelMember clanChannelMember) {
        this.members.add(clanChannelMember);
        this.sortedMembers = null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-561369554")
    @Export(value="removeMember")
    void removeMember(int n) {
        this.members.remove(n);
        this.sortedMembers = null;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-730358534")
    public int method3837() {
        return this.members.size();
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)I", garbageValue="-91")
    public int method3850(String string) {
        if (!this.field1806) {
            throw new RuntimeException("Displaynames not available");
        }
        int n = 0;
        while (n < this.members.size()) {
            if (((ClanChannelMember)this.members.get((int)n)).username.getName().equalsIgnoreCase(string)) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="2119647539")
    void method3851(Buffer buffer) {
        int n = buffer.readUnsignedByte();
        if ((n & 1) != 0) {
            this.field1814 = true;
        }
        if ((n & 2) != 0) {
            this.field1806 = true;
        }
        int n2 = 2;
        if ((n & 4) != 0) {
            n2 = buffer.readUnsignedByte();
        }
        this.key = buffer.readLong();
        this.field1810 = buffer.readLong();
        this.name = buffer.readStringCp1252NullTerminated();
        buffer.readBoolean();
        this.field1813 = buffer.readByte();
        this.field1812 = buffer.readByte();
        int n3 = buffer.readUnsignedShort();
        if (n3 <= 0) return;
        this.members = new ArrayList(n3);
        int n4 = 0;
        while (n4 < n3) {
            ClanChannelMember clanChannelMember = new ClanChannelMember();
            if (this.field1814) {
                buffer.readLong();
            }
            if (this.field1806) {
                clanChannelMember.username = new Username(buffer.readStringCp1252NullTerminated());
            }
            clanChannelMember.rank = buffer.readByte();
            clanChannelMember.world = buffer.readUnsignedShort();
            if (n2 >= 3) {
                buffer.readBoolean();
            }
            this.members.add(n4, clanChannelMember);
            ++n4;
        }
        return;
    }

    @ObfuscatedName(value="kv")
    @ObfuscatedSignature(descriptor="(Ldz;Lvv;I)V", garbageValue="433669662")
    static void method3857(class103 class1032, PacketBuffer packetBuffer) {
        int n = packetBuffer.readUnsignedShort();
        class480 class4802 = class1032.field1318[n];
        class103 class1033 = class4802.field5035;
        class1033.field1324 = packetBuffer.readUnsignedShort();
        class1033.field1325 = packetBuffer.readUnsignedShort();
        int n2 = class1033.field1322 / 8;
        int n3 = class1033.field1323 / 8;
        int n4 = packetBuffer.readUnsignedShort();
        packetBuffer.method10226();
        int n5 = 0;
        while (true) {
            int n6;
            int n7;
            int n8;
            if (n5 >= 4) {
                packetBuffer.exportIndex();
                class374.field4114 = new int[n4][4];
                n5 = 0;
                while (true) {
                    if (n5 >= n4) {
                        StructComposition.field2742 = new int[n4];
                        class440.field4851 = new int[n4];
                        HealthBarDefinition.field2578 = new int[n4];
                        WorldMapSectionType.field3193 = new byte[n4][];
                        AccessFile.field5365 = new byte[n4][];
                        n4 = 0;
                        n5 = 0;
                        while (true) {
                            if (n5 >= 4) {
                                class360.updateGameState(25);
                                Client.field509 = true;
                                class151.field1683 = class1033;
                                GrandExchangeEvents.method7859(class1033);
                                return;
                            }
                            for (n8 = 0; n8 < n2; ++n8) {
                                for (n7 = 0; n7 < n3; ++n7) {
                                    int n9;
                                    n6 = Client.field574[n5][n8][n7];
                                    if (n6 == -1) continue;
                                    int n10 = n6 >> 14 & 0x3FF;
                                    int n11 = n6 >> 3 & 0x7FF;
                                    int n12 = (n10 / 8 << 8) + n11 / 8;
                                    for (n9 = 0; n9 < n4; ++n9) {
                                        if (StructComposition.field2742[n9] != n12) continue;
                                        n12 = -1;
                                        break;
                                    }
                                    if (n12 == -1) continue;
                                    StructComposition.field2742[n4] = n12;
                                    n9 = n12 >> 8 & 0xFF;
                                    int n13 = n12 & 0xFF;
                                    class440.field4851[n4] = class68.field494.getGroupId("m" + n9 + "_" + n13);
                                    HealthBarDefinition.field2578[n4] = class68.field494.getGroupId("l" + n9 + "_" + n13);
                                    ++n4;
                                }
                            }
                            ++n5;
                        }
                    }
                    for (n8 = 0; n8 < 4; ++n8) {
                        class374.field4114[n5][n8] = packetBuffer.readInt();
                    }
                    ++n5;
                }
            }
            for (n8 = 0; n8 < n2; ++n8) {
                for (n7 = 0; n7 < n3; ++n7) {
                    n6 = packetBuffer.readBits(1);
                    if (n6 != 1) {
                        Client.field574[n5][n8][n7] = -1;
                        continue;
                    }
                    Client.field574[n5][n8][n7] = packetBuffer.readBits(26);
                }
            }
            ++n5;
        }
    }

    @ObfuscatedName(value="nv")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1899065248")
    static final void method3839(int n) {
        n = Math.min(Math.max(n, 0), 127);
        class544.clientPreferences.updateSoundEffectVolume(n);
    }
}

