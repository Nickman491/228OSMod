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
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName(value="lk")
public class class298 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Llk;")
    static final class298 field3236 = new class298(0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Llk;")
    static final class298 field3237 = new class298(1);
    @ObfuscatedName(value="ga")
    @ObfuscatedGetter(intValue=-292070717)
    static int field3239;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1906777519)
    @Export(value="value")
    final int value;

    class298(int n) {
        this.value = n;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-1463983379")
    @Export(value="Widget_unpackTargetMask")
    public static int Widget_unpackTargetMask(int n) {
        return n >> 11 & 0x3F;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-647715500")
    static int method6400(int n, Script script, boolean bl) {
        Widget widget = ClanChannel.field1807.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
        if (n != ScriptOpcodes.IF_GETTARGETMASK) {
            if (n != ScriptOpcodes.IF_GETOP) {
                if (n != ScriptOpcodes.IF_GETOPBASE) {
                    return 2;
                }
                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = widget.dataText == null ? "" : widget.dataText;
                return 1;
            }
            int n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = widget.actions != null && --n2 < widget.actions.length && widget.actions[n2] != null ? widget.actions[n2] : "";
            return 1;
        }
        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class298.Widget_unpackTargetMask(class232.getWidgetFlags(widget));
        return 1;
    }
}

