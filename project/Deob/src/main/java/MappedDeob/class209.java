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

@ObfuscatedName(value="ik")
public final class class209 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-52846939)
    int field2344;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-2138523021)
    int field2336;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=635722313)
    int field2337;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-492530409)
    int field2338;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lhs;")
    public Renderable field2339;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-62300097)
    int field2351;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=711001867)
    int field2341;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1114535483)
    int field2345;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1257097225)
    int field2343;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=18141731)
    int field2340;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-1966644445)
    int field2335;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-900462987)
    int field2342;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(longValue=8459724622587672005L)
    public long field2347 = 0L;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=1945860265)
    int field2348 = 0;

    class209() {
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(ILdm;ZB)I", garbageValue="7")
    static int method4821(int n, Script script, boolean bl) {
        if (n != ScriptOpcodes.CC_CREATE) {
            if (n != ScriptOpcodes.CC_DELETE) {
                if (n != ScriptOpcodes.CC_DELETEALL) {
                    if (n != 105) {
                        int n2;
                        Widget widget;
                        if (n != ScriptOpcodes.CC_FIND) {
                            if (n != ScriptOpcodes.IF_FIND) {
                                return 2;
                            }
                            Widget widget2 = ClanChannel.field1807.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
                            if (widget2 == null) {
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                            } else {
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
                                if (bl) {
                                    class134.scriptDotWidget = widget2;
                                } else {
                                    class9.field45 = widget2;
                                }
                            }
                            return 1;
                        }
                        int n3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                        if ((widget = ClanChannel.field1807.method7023(n3, n2 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1])) != null && n2 != -1) {
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
                            if (bl) {
                                class134.scriptDotWidget = widget;
                            } else {
                                class9.field45 = widget;
                            }
                        } else {
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                        }
                        return 1;
                    }
                    int n4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                    int n5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                    Widget widget = ClanChannel.field1807.method7031(n4);
                    Widget widget3 = ClanChannel.field1807.method7023(n4, n5);
                    if (widget == null) {
                        throw new RuntimeException("");
                    }
                    if (n5 < 0) {
                        throw new RuntimeException("");
                    }
                    if (widget3 == null) {
                        throw new RuntimeException("");
                    }
                    if (widget.children == null) {
                        throw new RuntimeException("");
                    }
                    int n6 = widget.children.length;
                    Widget[] widgetArray = new Widget[n6 + 1];
                    System.arraycopy(widget.children, 0, widgetArray, 0, widget.children.length);
                    widget.children = widgetArray;
                    Widget widget4 = new Widget(widget3, n6);
                    if (widget3.type == 12) {
                        class106.method3077(widget4);
                    }
                    widget.children[n6] = widget4;
                    if (bl) {
                        class134.scriptDotWidget = widget4;
                    } else {
                        class9.field45 = widget4;
                    }
                    UserComparator8.invalidateWidget(widget);
                    return 1;
                }
                Widget widget = ClanChannel.field1807.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
                widget.children = null;
                UserComparator8.invalidateWidget(widget);
                return 1;
            }
            Widget widget = bl ? class134.scriptDotWidget : class9.field45;
            Widget widget5 = ClanChannel.field1807.method7031(widget.id);
            widget5.children[widget.childIndex] = null;
            UserComparator8.invalidateWidget(widget5);
            return 1;
        }
        int n7 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 3];
        int n8 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
        int n9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
        if (n8 != 0) {
            Object object;
            Widget widget = ClanChannel.field1807.method7031(n7);
            if (widget.children == null) {
                widget.children = new Widget[n9 + 1];
            }
            if (widget.children.length <= n9) {
                object = new Widget[n9 + 1];
                for (int i = 0; i < widget.children.length; ++i) {
                    object[i] = widget.children[i];
                }
                widget.children = object;
            }
            if (n9 > 0 && widget.children[n9 - 1] == null) {
                throw new RuntimeException("" + (n9 - 1));
            }
            object = new Widget();
            object.type = n8;
            object.parentId = object.id = widget.id;
            object.childIndex = n9;
            object.isIf3 = true;
            if (n8 == 12) {
                class106.method3077((Widget)object);
            }
            widget.children[n9] = object;
            if (bl) {
                class134.scriptDotWidget = object;
            } else {
                class9.field45 = object;
            }
            UserComparator8.invalidateWidget(widget);
            return 1;
        }
        throw new RuntimeException();
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="38006974")
    static int method4823(int n, Script script, boolean bl) {
        Widget widget;
        Widget widget2 = widget = bl ? class134.scriptDotWidget : class9.field45;
        if (n != ScriptOpcodes.CC_GETX) {
            if (n != ScriptOpcodes.CC_GETY) {
                if (n != ScriptOpcodes.CC_GETWIDTH) {
                    if (n != ScriptOpcodes.CC_GETHEIGHT) {
                        if (n != ScriptOpcodes.CC_GETHIDE) {
                            if (n != ScriptOpcodes.CC_GETLAYER) {
                                return 2;
                            }
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.parentId;
                            return 1;
                        }
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.isHidden ? 1 : 0;
                        return 1;
                    }
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.height * -1528330031;
                    return 1;
                }
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.width;
                return 1;
            }
            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.y;
            return 1;
        }
        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.x;
        return 1;
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="0")
    static void method4822(int n) {
        Varcs.method3212(14);
        Login.Login_banType = n;
    }
}

