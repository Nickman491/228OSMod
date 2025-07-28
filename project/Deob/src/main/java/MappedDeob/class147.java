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

@ObfuscatedName(value="fa")
public class class147
extends class150 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1977526603)
    int field1671 = -1;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=473158071)
    int field1668;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1330833969)
    int field1670;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1943120069)
    int field1667;
    @ObfuscatedSignature(descriptor="Lfv;")
    final /* synthetic */ class153 this$0;

    @ObfuscatedSignature(descriptor="(Lfv;)V")
    class147(class153 class1532) {
        this.this$0 = class1532;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1355269794")
    void vmethod3879(Buffer buffer) {
        this.field1671 = buffer.readUnsignedShort();
        this.field1668 = buffer.readInt();
        this.field1670 = buffer.readUnsignedByte();
        this.field1667 = buffer.readUnsignedByte();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgq;B)V", garbageValue="0")
    void vmethod3882(ClanSettings clanSettings) {
        clanSettings.method3697(this.field1671, this.field1668, this.field1670, this.field1667);
    }
}

