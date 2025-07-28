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

@ObfuscatedName(value="fk")
public class class148
extends class150 {
    @ObfuscatedName(value="ad")
    @Export(value="Interpreter_stringLocals")
    static String[] Interpreter_stringLocals;
    @ObfuscatedName(value="mz")
    @ObfuscatedGetter(intValue=851312265)
    static int field1676;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(longValue=-7198038692640291871L)
    long field1673 = -1L;
    @ObfuscatedName(value="ah")
    String field1672 = null;
    @ObfuscatedSignature(descriptor="Lfv;")
    final /* synthetic */ class153 this$0;

    @ObfuscatedSignature(descriptor="(Lfv;)V")
    class148(class153 class1532) {
        this.this$0 = class1532;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1355269794")
    void vmethod3879(Buffer buffer) {
        if (buffer.readUnsignedByte() != 255) {
            --buffer.offset;
            this.field1673 = buffer.readLong();
        }
        this.field1672 = buffer.readStringCp1252NullTerminatedOrNull();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgq;B)V", garbageValue="0")
    void vmethod3882(ClanSettings clanSettings) {
        clanSettings.method3691(this.field1673, this.field1672, 0);
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="37")
    public static int method3577(int n) {
        long l = ViewportMouse.ViewportMouse_entityTags[n];
        int n2 = (int)(l >>> 7 & 0x7FL);
        return n2;
    }

    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="98")
    static int method3575(int n) {
        return (int)Math.pow(2.0, 7.0f + (float)n / 256.0f);
    }
}

