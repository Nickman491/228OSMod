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

@ObfuscatedName(value="ie")
public final class class208 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=747575319)
    int field2331;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-2059859337)
    int field2323;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=2014411507)
    int field2325;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-191954525)
    int field2326;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-110708295)
    int field2327;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1357881535)
    int field2330;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1936879603)
    int field2324;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lhs;")
    public Renderable field2329;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lhs;")
    public Renderable field2328;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(longValue=-1715493241959163543L)
    public long field2332 = 0L;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=682103303)
    int field2333 = 0;

    class208() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-1147398537")
    public static int method4819(int n) {
        return (n & class550.field5423) - 1;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-323063316")
    static int method4820(int n, Script script, boolean bl) {
        Widget widget;
        Widget widget2 = widget = bl ? class134.scriptDotWidget : class9.field45;
        if (n != ScriptOpcodes.CC_GETTARGETMASK) {
            if (n != ScriptOpcodes.CC_GETOP) {
                if (n != ScriptOpcodes.CC_GETOPBASE) {
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

