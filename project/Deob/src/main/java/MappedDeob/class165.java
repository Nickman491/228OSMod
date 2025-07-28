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
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName(value="gy")
public class class165
extends class150 {
    @ObfuscatedName(value="gt")
    static String field1782;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(longValue=-2094426101884963605L)
    long field1783 = -1L;
    @ObfuscatedName(value="ah")
    String field1781 = null;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1010564325)
    int field1784 = 0;
    @ObfuscatedSignature(descriptor="Lfv;")
    final /* synthetic */ class153 this$0;

    @ObfuscatedSignature(descriptor="(Lfv;)V")
    class165(class153 class1532) {
        this.this$0 = class1532;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1355269794")
    void vmethod3879(Buffer buffer) {
        if (buffer.readUnsignedByte() != 255) {
            --buffer.offset;
            this.field1783 = buffer.readLong();
        }
        this.field1781 = buffer.readStringCp1252NullTerminatedOrNull();
        this.field1784 = buffer.readUnsignedShort();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgq;B)V", garbageValue="0")
    void vmethod3882(ClanSettings clanSettings) {
        clanSettings.method3691(this.field1783, this.field1781, this.field1784);
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1951312105")
    public static void method3794() {
        InvDefinition.InvDefinition_cached.clear();
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="1147545767")
    static int method3793(int n, Script script, boolean bl) {
        Widget widget;
        Widget widget2 = widget = bl ? class134.scriptDotWidget : class9.field45;
        if (n != ScriptOpcodes.CC_GETINVOBJECT) {
            if (n != ScriptOpcodes.CC_GETINVCOUNT) {
                if (n != ScriptOpcodes.CC_GETID) {
                    if (n != 1707) {
                        if (n != 1708) {
                            if (n != 1709) {
                                return 2;
                            }
                            return WorldMapCacheName.method6467(widget);
                        }
                        return class10.method112(widget);
                    }
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.method7433() ? 1 : 0;
                    return 1;
                }
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.childIndex;
                return 1;
            }
            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.itemId != -1 ? widget.itemQuantity : 0;
            return 1;
        }
        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.itemId;
        return 1;
    }
}

