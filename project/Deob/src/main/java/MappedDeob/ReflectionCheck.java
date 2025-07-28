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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName(value="bm")
@Implements(value="ReflectionCheck")
public class ReflectionCheck
extends Node {
    @ObfuscatedName(value="ho")
    static SecureRandom field228;
    @ObfuscatedName(value="vi")
    @ObfuscatedSignature(descriptor="Lsh;")
    static ArchiveDisk field227;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1508244125)
    @Export(value="id")
    int id;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1413258665)
    @Export(value="size")
    int size;
    @ObfuscatedName(value="az")
    @Export(value="operations")
    int[] operations;
    @ObfuscatedName(value="ao")
    @Export(value="creationErrors")
    int[] creationErrors;
    @ObfuscatedName(value="ad")
    @Export(value="fields")
    Field[] fields;
    @ObfuscatedName(value="an")
    @Export(value="intReplaceValues")
    int[] intReplaceValues;
    @ObfuscatedName(value="ae")
    @Export(value="methods")
    Method[] methods;
    @ObfuscatedName(value="ax")
    @Export(value="arguments")
    byte[][][] arguments;

    ReflectionCheck() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)J", garbageValue="-373546867")
    public static final synchronized long method724() {
        long l = System.currentTimeMillis();
        if (l < class329.field3607) {
            class319.field3313 += class329.field3607 - l;
        }
        class329.field3607 = l;
        return class319.field3313 + l;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Lna;I[B[BI)V", garbageValue="1806582189")
    @Export(value="Widget_setKey")
    static final void Widget_setKey(Widget widget, int n, byte[] byArray, byte[] byArray2) {
        if (widget.field3861 == null) {
            if (byArray == null) {
                return;
            }
            widget.field3861 = new byte[11][];
            widget.field3952 = new byte[11][];
            widget.field3964 = new int[11];
            widget.field3864 = new int[11];
        }
        widget.field3861[n] = byArray;
        if (byArray != null) {
            widget.field3950 = true;
        } else {
            widget.field3950 = false;
            for (int i = 0; i < widget.field3861.length; ++i) {
                if (widget.field3861[i] == null) {
                    continue;
                }
                widget.field3950 = true;
                break;
            }
        }
        widget.field3952[n] = byArray2;
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-236178595")
    static int method726(int n, Script script, boolean bl) {
        block19: {
            int n2;
            block20: {
                if (n == ScriptOpcodes.ENUM_STRING) break block19;
                if (n != ScriptOpcodes.ENUM) {
                    if (n != ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
                        return 2;
                    }
                    int n3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                    EnumComposition enumComposition = VertexNormal.getEnum(n3);
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = enumComposition.size();
                    return 1;
                }
                int n4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 4];
                n2 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                int n5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
                int n6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3];
                EnumComposition enumComposition = VertexNormal.getEnum(n5);
                if (n4 != enumComposition.inputType || n2 != enumComposition.outputType) break block20;
                int n7 = 0;
                while (true) {
                    block22: {
                        block21: {
                            if (n7 >= enumComposition.outputCount) break block21;
                            if (n6 != enumComposition.keys[n7]) break block22;
                            if (n2 == 115) {
                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = enumComposition.strVals[n7];
                            } else {
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = enumComposition.intVals[n7];
                            }
                            enumComposition = null;
                        }
                        if (enumComposition != null) {
                            if (n2 == 115) {
                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = enumComposition.defaultStr;
                            } else {
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = enumComposition.defaultInt;
                            }
                        }
                        return 1;
                    }
                    ++n7;
                }
            }
            if (n2 == 115) {
                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "null";
            } else {
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
            }
            return 1;
        }
        int n8 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
        int n9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
        EnumComposition enumComposition = VertexNormal.getEnum(n8);
        if (enumComposition.outputType != 's') {
            // empty if block
        }
        int n10 = 0;
        while (true) {
            block24: {
                block23: {
                    if (n10 >= enumComposition.outputCount) break block23;
                    if (n9 != enumComposition.keys[n10]) break block24;
                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = enumComposition.strVals[n10];
                    enumComposition = null;
                }
                if (enumComposition != null) {
                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = enumComposition.defaultStr;
                }
                return 1;
            }
            ++n10;
        }
    }
}

