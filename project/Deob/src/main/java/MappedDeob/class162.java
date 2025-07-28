/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gr")
public class class162
extends class166 {
    @ObfuscatedName(value="ay")
    String field1763 = null;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1131253487)
    int field1765;
    @ObfuscatedName(value="az")
    byte field1764;
    @ObfuscatedSignature(descriptor="Lgv;")
    final /* synthetic */ class167 this$0;

    @ObfuscatedSignature(descriptor="(Lgv;)V")
    class162(class167 class1672) {
        this.this$0 = class1672;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="1969161379")
    void vmethod3869(Buffer buffer) {
        if (buffer.readUnsignedByte() != 255) {
            --buffer.offset;
            buffer.readLong();
        }
        this.field1763 = buffer.readStringCp1252NullTerminatedOrNull();
        this.field1765 = buffer.readUnsignedShort();
        this.field1764 = buffer.readByte();
        buffer.readLong();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgk;I)V", garbageValue="-1263140647")
    void vmethod3870(ClanChannel clanChannel) {
        ClanChannelMember clanChannelMember = new ClanChannelMember();
        clanChannelMember.username = new Username(this.field1763);
        clanChannelMember.world = this.field1765;
        clanChannelMember.rank = this.field1764;
        clanChannel.addMember(clanChannelMember);
    }
}

