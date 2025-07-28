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
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName(value="hi")
@Implements(value="FaceNormal")
public class FaceNormal {
    @ObfuscatedName(value="fe")
    @ObfuscatedSignature(descriptor="Lok;")
    static Archive field2120;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=508131641)
    @Export(value="x")
    int x;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1031535199)
    @Export(value="y")
    int y;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1338950567)
    @Export(value="z")
    int z;

    FaceNormal() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)Lqa;", garbageValue="-108")
    public static class427 method4465() {
        class427[] class427Array = class427.field4755;
        synchronized (class427.field4755) {
            if (class427.field4752 == 0) {
                // ** MonitorExit[var0] (shouldn't be in output)
                return new class427();
            }
            class427.field4755[--class427.field4752].method8345();
            // ** MonitorExit[var0] (shouldn't be in output)
            return class427.field4755[class427.field4752];
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IS)Lkm;", garbageValue="-6432")
    @Export(value="ItemDefinition_get")
    public static ItemComposition ItemDefinition_get(int n) {
        ItemComposition itemComposition = (ItemComposition)ItemComposition.ItemDefinition_cached.get(n);
        if (itemComposition != null) {
            return itemComposition;
        }
        byte[] byArray = class240.ItemDefinition_archive.takeFile(10, n);
        itemComposition = new ItemComposition();
        itemComposition.id = n;
        if (byArray != null) {
            itemComposition.decode(new Buffer(byArray));
        }
        itemComposition.post();
        if (itemComposition.noteTemplate != -1) {
            itemComposition.genCert(FaceNormal.ItemDefinition_get(itemComposition.noteTemplate), FaceNormal.ItemDefinition_get(itemComposition.note));
        }
        if (itemComposition.notedId != -1) {
            itemComposition.genBought(FaceNormal.ItemDefinition_get(itemComposition.notedId), FaceNormal.ItemDefinition_get(itemComposition.unnotedId));
        }
        if (itemComposition.placeholderTemplate != -1) {
            itemComposition.genPlaceholder(FaceNormal.ItemDefinition_get(itemComposition.placeholderTemplate), FaceNormal.ItemDefinition_get(itemComposition.placeholder));
        }
        if (!WorldMapEvent.ItemDefinition_inMembersWorld && itemComposition.isMembersOnly) {
            if (itemComposition.noteTemplate == -1 && itemComposition.notedId == -1 && itemComposition.placeholderTemplate == -1) {
                itemComposition.name = itemComposition.name + " (Members)";
            }
            itemComposition.field2853 = "Login to a members' server to use this object.";
            itemComposition.isTradable = false;
            int n2 = 0;
            block0: while (true) {
                if (n2 >= itemComposition.groundActions.length) {
                    n2 = 0;
                    while (true) {
                        if (n2 >= itemComposition.inventoryActions.length) {
                            itemComposition.shiftClickIndex = -2;
                            itemComposition.field2895 = 0;
                            if (itemComposition.params == null) break block0;
                            n2 = 0;
                            Node node = itemComposition.params.first();
                            while (true) {
                                if (node == null) {
                                    if (n2 != 0) break block0;
                                    itemComposition.params = null;
                                    break block0;
                                }
                                ParamComposition paramComposition = VerticalAlignment.getParamDefinition((int)node.key);
                                if (paramComposition.autoDisable) {
                                    node.remove();
                                } else {
                                    n2 = 1;
                                }
                                node = itemComposition.params.next();
                            }
                        }
                        if (n2 != 4) {
                            if (itemComposition.field2872 != null) {
                                itemComposition.field2872[n2] = null;
                            }
                            itemComposition.inventoryActions[n2] = null;
                        }
                        ++n2;
                    }
                }
                itemComposition.groundActions[n2] = null;
                ++n2;
            }
        }
        ItemComposition.ItemDefinition_cached.put(itemComposition, n);
        return itemComposition;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIII)I", garbageValue="303252887")
    public static int method4463(int n, int n2, int n3) {
        int n4 = ItemComposition.method5643(n3 - n2 + 1);
        return n &= ~(n4 <<= n2);
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;I)I", garbageValue="-1714037177")
    @Export(value="hashString")
    public static int hashString(CharSequence charSequence) {
        int n = charSequence.length();
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            n2 = (n2 << 5) - n2 + class232.charToByteCp1252(charSequence.charAt(i));
        }
        return n2;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="688939989")
    static int method4464(int n, Script script, boolean bl) {
        Widget widget;
        if (n < 2000) {
            widget = bl ? class134.scriptDotWidget : class9.field45;
        } else {
            n -= 1000;
            widget = ClanChannel.field1807.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
        }
        UserComparator8.invalidateWidget(widget);
        if (n != ScriptOpcodes.CC_SETOBJECT && n != ScriptOpcodes.CC_SETOBJECT_NONUM && n != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
            if (n != ScriptOpcodes.CC_SETNPCHEAD) {
                if (n != ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
                    if (n != 1207) {
                        if (n != 1208) {
                            if (n != 1209) {
                                if (n != 1210) {
                                    return 2;
                                }
                                int n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                if (widget.field3924 != null) {
                                    widget.field3924.method7062(ModeWhere.localPlayer.appearance.gender, n2);
                                    return 1;
                                }
                                throw new RuntimeException("");
                            }
                            int n3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                            int n4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                            if (widget.field3924 != null) {
                                widget.field3924.method7064(n3, n4);
                                return 1;
                            }
                            throw new RuntimeException("");
                        }
                        int n5 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                        if (widget.field3924 != null) {
                            widget.field3924.method7080(n5);
                            return 1;
                        }
                        throw new RuntimeException("");
                    }
                    boolean bl2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                    widget.method7542(ModeWhere.localPlayer.appearance, bl2);
                    return 1;
                }
                widget.modelType = 3;
                widget.modelId = ModeWhere.localPlayer.appearance.getChatHeadId();
                return 1;
            }
            widget.modelType = 2;
            widget.modelId = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
            return 1;
        }
        int n6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
        int n7 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
        widget.itemId = n6;
        widget.itemQuantity = n7;
        ItemComposition itemComposition = FaceNormal.ItemDefinition_get(n6);
        widget.modelAngleX = itemComposition.xan2d;
        widget.modelAngleY = itemComposition.yan2d;
        widget.modelAngleZ = itemComposition.zan2d;
        widget.modelOffsetX = itemComposition.offsetX2d;
        widget.modelOffsetY = itemComposition.offsetY2d;
        widget.modelZoom = itemComposition.zoom2d;
        widget.itemQuantityMode = n == ScriptOpcodes.CC_SETOBJECT_NONUM ? 0 : (n == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == itemComposition.isStackable ? 1 : 2);
        if (widget.field3927 > 0) {
            widget.modelZoom = widget.modelZoom * 32 / widget.field3927;
        } else if (widget.rawWidth > 0) {
            widget.modelZoom = widget.modelZoom * 32 / widget.rawWidth;
        }
        return 1;
    }
}

