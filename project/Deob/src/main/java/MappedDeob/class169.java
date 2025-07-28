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

@ObfuscatedName(value="gm")
public class class169
extends class150 {
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=875404857)
    static int field1804;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="[Lvi;")
    @Export(value="title_muteSprite")
    static IndexedSprite[] title_muteSprite;
    @ObfuscatedName(value="aq")
    public static short[] field1805;
    @ObfuscatedName(value="bl")
    @ObfuscatedSignature(descriptor="Lql;")
    static Bounds field1800;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-722365081)
    int field1799 = -1;
    @ObfuscatedSignature(descriptor="Lfv;")
    final /* synthetic */ class153 this$0;

    @ObfuscatedSignature(descriptor="(Lfv;)V")
    class169(class153 class1532) {
        this.this$0 = class1532;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1355269794")
    void vmethod3879(Buffer buffer) {
        this.field1799 = buffer.readUnsignedShort();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgq;B)V", garbageValue="0")
    void vmethod3882(ClanSettings clanSettings) {
        clanSettings.method3718(this.field1799);
    }
}

