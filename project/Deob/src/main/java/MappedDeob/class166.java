/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName(value="gt")
public abstract class class166
extends Node {
    @ObfuscatedName(value="ff")
    @ObfuscatedSignature(descriptor="Lok;")
    @Export(value="archive10")
    static Archive archive10;

    class166() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="1969161379")
    abstract void vmethod3869(Buffer var1);

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgk;I)V", garbageValue="-1263140647")
    abstract void vmethod3870(ClanChannel var1);

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="47")
    public static void method3807() {
        class243.field2599.clear();
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIIB)I", garbageValue="-1")
    static int method3805(int n, int n2, int n3) {
        if (n3 > 179) {
            n2 /= 2;
        }
        if (n3 > 192) {
            n2 /= 2;
        }
        if (n3 > 217) {
            n2 /= 2;
        }
        if (n3 > 243) {
            n2 /= 2;
        }
        int n4 = (n2 / 32 << 7) + (n / 4 << 10) + n3 / 2;
        return n4;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)Ljava/lang/String;", garbageValue="7")
    public static String method3810(String string) {
        if (string != null && !string.isEmpty() && string.charAt(0) != '#') {
            return string;
        }
        return "";
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="1")
    public static int method3808(int n) {
        class144 class1442 = class137.method3480(n);
        if (class1442 != null) {
            return class1442.method3521() ? 0 : 1;
        }
        return 2;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="53")
    public static int method3809(int n) {
        if (n > 0) {
            return 1;
        }
        if (n < 0) {
            return -1;
        }
        return 0;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="2103059388")
    static int method3800(int n, Script script, boolean bl) {
        if (n != ScriptOpcodes.CC_CALLONRESIZE && n != ScriptOpcodes.IF_CALLONRESIZE) {
            int n2;
            if (n != ScriptOpcodes.CC_TRIGGEROP) {
                if (n != ScriptOpcodes.IF_TRIGGEROP) {
                    return 2;
                }
                int n3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 3];
                int n4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                int n5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
                if (n5 >= 1 && n5 <= 10) {
                    Widget widget = ClanChannel.field1807.method7023(n3, n4);
                    if (widget != null) {
                        class107 class1072 = new class107(n5, n3, n4, widget.itemId);
                        Interpreter.field863.add(class1072);
                        return 1;
                    }
                    throw new RuntimeException();
                }
                throw new RuntimeException();
            }
            Widget widget = bl ? class134.scriptDotWidget : class9.field45;
            if ((n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]) >= 1 && n2 <= 10) {
                class107 class1073 = new class107(n2, widget.id, widget.childIndex, widget.itemId);
                Interpreter.field863.add(class1073);
                return 1;
            }
            throw new RuntimeException();
        }
        if (Interpreter.field864 < 10) {
            Widget widget = n < 2000 ? (bl ? class134.scriptDotWidget : class9.field45) : ClanChannel.field1807.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
            if (widget.onResize == null) {
                return 0;
            }
            ScriptEvent scriptEvent = new ScriptEvent();
            scriptEvent.widget = widget;
            scriptEvent.args = widget.onResize;
            scriptEvent.field1080 = Interpreter.field864 + 1;
            Client.scriptEvents.addFirst(scriptEvent);
            return 1;
        }
        throw new RuntimeException();
    }
}

