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

@ObfuscatedName(value="eh")
@Implements(value="UserComparator10")
public class UserComparator10
extends AbstractUserComparator {
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-2006159767)
    static int field1516;
    @ObfuscatedName(value="ay")
    @Export(value="reversed")
    final boolean reversed;

    public UserComparator10(boolean bl) {
        this.reversed = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lsu;Lsu;I)I", garbageValue="-1639266255")
    @Export(value="compareBuddy")
    int compareBuddy(Buddy buddy, Buddy buddy2) {
        if (Client.worldId == buddy.world && buddy2.world == Client.worldId) {
            return this.reversed ? buddy.int2 - buddy2.int2 : buddy2.int2 - buddy.int2;
        }
        return this.compareUser(buddy, buddy2);
    }

    public int compare(Object object, Object object2) {
        return this.compareBuddy((Buddy)object, (Buddy)object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-1749241599")
    static int method3361(int n, Script script, boolean bl) {
        Widget widget;
        if (n < 2000) {
            widget = bl ? class134.scriptDotWidget : class9.field45;
        } else {
            n -= 1000;
            widget = ClanChannel.field1807.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
        }
        String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
        int[] nArray = null;
        if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
            int n2;
            if ((n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]) > 0) {
                nArray = new int[n2];
                while (n2-- > 0) {
                    nArray[n2] = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                }
            }
            string = string.substring(0, string.length() - 1);
        }
        Object[] objectArray = new Object[string.length() + 1];
        int n3 = objectArray.length - 1;
        while (true) {
            if (n3 < 1) {
                if ((n3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]) != -1) {
                    objectArray[0] = new Integer(n3);
                } else {
                    objectArray = null;
                }
                if (n == ScriptOpcodes.CC_SETONCLICK) {
                    widget.onClick = objectArray;
                } else if (n == ScriptOpcodes.CC_SETONHOLD) {
                    widget.onHold = objectArray;
                } else if (n == ScriptOpcodes.CC_SETONRELEASE) {
                    widget.onRelease = objectArray;
                } else if (n == ScriptOpcodes.CC_SETONMOUSEOVER) {
                    widget.onMouseOver = objectArray;
                } else if (n == ScriptOpcodes.CC_SETONMOUSELEAVE) {
                    widget.onMouseLeave = objectArray;
                } else if (n == ScriptOpcodes.CC_SETONDRAG) {
                    widget.onDrag = objectArray;
                } else if (n == ScriptOpcodes.CC_SETONTARGETLEAVE) {
                    widget.onTargetLeave = objectArray;
                } else if (n != ScriptOpcodes.CC_SETONVARTRANSMIT) {
                    if (n == ScriptOpcodes.CC_SETONTIMER) {
                        widget.onTimer = objectArray;
                    } else if (n == ScriptOpcodes.CC_SETONOP) {
                        widget.onOp = objectArray;
                    } else if (n == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
                        widget.onDragComplete = objectArray;
                    } else if (n == ScriptOpcodes.CC_SETONCLICKREPEAT) {
                        widget.onClickRepeat = objectArray;
                    } else if (n == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
                        widget.onMouseRepeat = objectArray;
                    } else if (n != ScriptOpcodes.CC_SETONINVTRANSMIT) {
                        if (n != ScriptOpcodes.CC_SETONSTATTRANSMIT) {
                            if (n == ScriptOpcodes.CC_SETONTARGETENTER) {
                                widget.onTargetEnter = objectArray;
                            } else if (n == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
                                widget.onScroll = objectArray;
                            } else if (n == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
                                widget.onChatTransmit = objectArray;
                            } else if (n == ScriptOpcodes.CC_SETONKEY) {
                                widget.onKey = objectArray;
                            } else if (n == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
                                widget.onFriendTransmit = objectArray;
                            } else if (n == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
                                widget.onClanTransmit = objectArray;
                            } else if (n == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
                                widget.onMiscTransmit = objectArray;
                            } else if (n == ScriptOpcodes.CC_SETONDIALOGABORT) {
                                widget.onDialogAbort = objectArray;
                            } else if (n == ScriptOpcodes.CC_SETONSUBCHANGE) {
                                widget.onSubChange = objectArray;
                            } else if (n == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
                                widget.onStockTransmit = objectArray;
                            } else if (n == 1426) {
                                widget.field4000 = objectArray;
                            } else if (n == ScriptOpcodes.CC_SETONRESIZE) {
                                widget.onResize = objectArray;
                            } else if (n == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
                                widget.field3993 = objectArray;
                            } else if (n == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
                                widget.field3988 = objectArray;
                            } else if (n == 1430) {
                                widget.field3989 = objectArray;
                            } else if (n == 1431) {
                                widget.field3901 = objectArray;
                            } else if (n == 1434) {
                                widget.field4023 = objectArray;
                            } else if (n == 1435) {
                                widget.field3985 = objectArray;
                            } else {
                                if (n < 1436 || n > 1439) return 2;
                                class357 class3572 = widget.method7447();
                                if (class3572 != null) {
                                    if (n == 1436) {
                                        class3572.field3803 = objectArray;
                                    } else if (n == 1437) {
                                        class3572.field3804 = objectArray;
                                    } else if (n == 1438) {
                                        class3572.field3805 = objectArray;
                                    } else if (n == 1439) {
                                        class3572.field3802 = objectArray;
                                    }
                                }
                            }
                        } else {
                            widget.onStatTransmit = objectArray;
                            widget.statTransmitTriggers = nArray;
                        }
                    } else {
                        widget.onInvTransmit = objectArray;
                        widget.invTransmitTriggers = nArray;
                    }
                } else {
                    widget.onVarTransmit = objectArray;
                    widget.varTransmitTriggers = nArray;
                }
                widget.hasListener = true;
                return 1;
            }
            objectArray[n3] = string.charAt(n3 - 1) == 's' ? Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize] : new Integer(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
            --n3;
        }
    }
}

