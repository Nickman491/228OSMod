/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName(value="rm")
public class class454 {
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lvi;")
    static IndexedSprite field4897;

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="17")
    public static int method8933(int n) {
        return n + -512;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-166948006")
    static int method8934(int n, Script script, boolean bl) {
        Widget widget;
        int n2 = -1;
        if (n < 2000) {
            widget = bl ? class134.scriptDotWidget : class9.field45;
        } else {
            n -= 1000;
            n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
            widget = ClanChannel.field1807.method7031(n2);
        }
        if (n != ScriptOpcodes.CC_SETSCROLLPOS) {
            if (n != ScriptOpcodes.CC_SETCOLOUR) {
                if (n != ScriptOpcodes.CC_SETFILL) {
                    if (n != ScriptOpcodes.CC_SETTRANS) {
                        if (n != ScriptOpcodes.CC_SETLINEWID) {
                            if (n != ScriptOpcodes.CC_SETGRAPHIC) {
                                if (n != ScriptOpcodes.CC_SET2DANGLE) {
                                    if (n != ScriptOpcodes.CC_SETTILING) {
                                        if (n != ScriptOpcodes.CC_SETMODEL) {
                                            if (n != ScriptOpcodes.CC_SETMODELANGLE) {
                                                int n3;
                                                if (n != ScriptOpcodes.CC_SETMODELANIM) {
                                                    if (n != ScriptOpcodes.CC_SETMODELORTHOG) {
                                                        if (n != ScriptOpcodes.CC_SETTEXT) {
                                                            class359 class3592;
                                                            if (n != ScriptOpcodes.CC_SETTEXTFONT) {
                                                                if (n != ScriptOpcodes.CC_SETTEXTALIGN) {
                                                                    if (n != ScriptOpcodes.CC_SETTEXTSHADOW) {
                                                                        if (n != ScriptOpcodes.CC_SETOUTLINE) {
                                                                            if (n != ScriptOpcodes.CC_SETGRAPHICSHADOW) {
                                                                                if (n != ScriptOpcodes.CC_SETVFLIP) {
                                                                                    if (n != ScriptOpcodes.CC_SETHFLIP) {
                                                                                        if (n != ScriptOpcodes.CC_SETSCROLLSIZE) {
                                                                                            if (n != ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
                                                                                                if (n != 1122) {
                                                                                                    if (n != ScriptOpcodes.CC_SETFILLCOLOUR) {
                                                                                                        if (n != 1124) {
                                                                                                            if (n != 1125) {
                                                                                                                boolean bl2;
                                                                                                                if (n != ScriptOpcodes.CC_SETLINEDIRECTION) {
                                                                                                                    boolean bl3;
                                                                                                                    if (n != ScriptOpcodes.CC_SETMODELTRANSPARENT) {
                                                                                                                        if (n != 1129) {
                                                                                                                            if (n != 1130) {
                                                                                                                                if (n != 1131) {
                                                                                                                                    if (n != 1132) {
                                                                                                                                        if (n != 1133) {
                                                                                                                                            if (n != 1134) {
                                                                                                                                                if (n != 1135) {
                                                                                                                                                    if (n != 1136) {
                                                                                                                                                        if (n != 1137) {
                                                                                                                                                            if (n != 1138) {
                                                                                                                                                                if (n != 1139) {
                                                                                                                                                                    if (n != 1140) {
                                                                                                                                                                        class359 class3593;
                                                                                                                                                                        boolean bl4;
                                                                                                                                                                        if (n != 1141) {
                                                                                                                                                                            if (n != 1142) {
                                                                                                                                                                                if (n != 1143) {
                                                                                                                                                                                    if (n != 1144) {
                                                                                                                                                                                        if (n != 1145) {
                                                                                                                                                                                            if (n != 1146) {
                                                                                                                                                                                                if (n != 1147) {
                                                                                                                                                                                                    if (n != 1148) {
                                                                                                                                                                                                        if (n != 1149) {
                                                                                                                                                                                                            if (n != 1150) {
                                                                                                                                                                                                                if (n != 1151) {
                                                                                                                                                                                                                    if (n != 1152) {
                                                                                                                                                                                                                        return 2;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (widget.type != 11) {
                                                                                                                                                                                                                        throw new RuntimeException();
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    class212 class2122 = widget.method7440();
                                                                                                                                                                                                                    boolean bl5 = class2122 != null && class2122.method4845() && class143.method3517().method4983(class2122.method4853());
                                                                                                                                                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = bl5 ? 1 : 0;
                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                String string = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize -= 3];
                                                                                                                                                                                                                String string2 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1];
                                                                                                                                                                                                                String string3 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 2];
                                                                                                                                                                                                                long l = MilliClock.method4963();
                                                                                                                                                                                                                long l2 = EnumComposition.method5279();
                                                                                                                                                                                                                String string4 = class225.method5057().method9655(class225.method5057().field5209);
                                                                                                                                                                                                                if (l != -1L) {
                                                                                                                                                                                                                    string = string.replaceAll("%userid%", Long.toString(l));
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (-1L != l2) {
                                                                                                                                                                                                                    string = string.replaceAll("%userhash%", Long.toString(l2));
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (!string4.isEmpty()) {
                                                                                                                                                                                                                    string = string.replaceAll("%deviceid%", string4);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                widget.method7427(string, string2, string3, string4, Long.toString(l2), class280.urlRequester);
                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            widget.method7428(Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize], class280.urlRequester);
                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        ScriptFrame.Interpreter_intStackSize -= 2;
                                                                                                                                                                                                        class27 class272 = widget.method7535();
                                                                                                                                                                                                        if (class272 != null) {
                                                                                                                                                                                                            class272.method407((char)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize], Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    ScriptFrame.Interpreter_intStackSize -= 2;
                                                                                                                                                                                                    class27 class276 = widget.method7535();
                                                                                                                                                                                                    if (class276 != null) {
                                                                                                                                                                                                        class276.method408(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize], Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                }
                                                                                                                                                                                                --ScriptFrame.Interpreter_intStackSize;
                                                                                                                                                                                                class359 class3594 = widget.method7444();
                                                                                                                                                                                                if (class3594 != null) {
                                                                                                                                                                                                    class3594.method7143(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize]);
                                                                                                                                                                                                    UserComparator8.invalidateWidget(widget);
                                                                                                                                                                                                }
                                                                                                                                                                                                return 1;
                                                                                                                                                                                            }
                                                                                                                                                                                            --ScriptFrame.Interpreter_intStackSize;
                                                                                                                                                                                            class359 class3595 = widget.method7444();
                                                                                                                                                                                            if (class3595 != null) {
                                                                                                                                                                                                class3595.method7144(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize]);
                                                                                                                                                                                            }
                                                                                                                                                                                            return 1;
                                                                                                                                                                                        }
                                                                                                                                                                                        --ScriptFrame.Interpreter_intStackSize;
                                                                                                                                                                                        class359 class3596 = widget.method7444();
                                                                                                                                                                                        if (class3596 != null) {
                                                                                                                                                                                            class3596.method7141(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize]);
                                                                                                                                                                                        }
                                                                                                                                                                                        return 1;
                                                                                                                                                                                    }
                                                                                                                                                                                    --ScriptFrame.Interpreter_intStackSize;
                                                                                                                                                                                    class359 class3597 = widget.method7444();
                                                                                                                                                                                    if (class3597 != null) {
                                                                                                                                                                                        class3597.method7142(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize]);
                                                                                                                                                                                        UserComparator8.invalidateWidget(widget);
                                                                                                                                                                                    }
                                                                                                                                                                                    return 1;
                                                                                                                                                                                }
                                                                                                                                                                                class359 class3598 = widget.method7444();
                                                                                                                                                                                if (class3598 != null && class3598.method7285(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize], Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize])) {
                                                                                                                                                                                    UserComparator8.invalidateWidget(widget);
                                                                                                                                                                                }
                                                                                                                                                                                return 1;
                                                                                                                                                                            }
                                                                                                                                                                            class359 class3599 = widget.method7444();
                                                                                                                                                                            if (class3599 != null && class3599.method7285(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2], Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1])) {
                                                                                                                                                                                UserComparator8.invalidateWidget(widget);
                                                                                                                                                                            }
                                                                                                                                                                            return 1;
                                                                                                                                                                        }
                                                                                                                                                                        boolean bl6 = bl4 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                                        if (!bl4 && Client.field575.method5728() == widget) {
                                                                                                                                                                            Client.field575.method5738();
                                                                                                                                                                            UserComparator8.invalidateWidget(widget);
                                                                                                                                                                        }
                                                                                                                                                                        if ((class3593 = widget.method7444()) != null) {
                                                                                                                                                                            class3593.method7128(bl4);
                                                                                                                                                                        }
                                                                                                                                                                        return 1;
                                                                                                                                                                    }
                                                                                                                                                                    boolean bl7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                                    Client.field575.method5738();
                                                                                                                                                                    class359 class35910 = widget.method7444();
                                                                                                                                                                    if (class35910 != null && class35910.method7129(bl7)) {
                                                                                                                                                                        if (bl7) {
                                                                                                                                                                            Client.field575.method5727(widget);
                                                                                                                                                                        }
                                                                                                                                                                        UserComparator8.invalidateWidget(widget);
                                                                                                                                                                    }
                                                                                                                                                                    return 1;
                                                                                                                                                                }
                                                                                                                                                                class359 class35911 = widget.method7444();
                                                                                                                                                                if (class35911 != null && class35911.method7379(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize])) {
                                                                                                                                                                    UserComparator8.invalidateWidget(widget);
                                                                                                                                                                }
                                                                                                                                                                return 1;
                                                                                                                                                            }
                                                                                                                                                            class359 class35912 = widget.method7444();
                                                                                                                                                            if (class35912 != null && class35912.method7136(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize])) {
                                                                                                                                                                UserComparator8.invalidateWidget(widget);
                                                                                                                                                            }
                                                                                                                                                            return 1;
                                                                                                                                                        }
                                                                                                                                                        class359 class35913 = widget.method7444();
                                                                                                                                                        if (class35913 != null && class35913.method7212(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize])) {
                                                                                                                                                            UserComparator8.invalidateWidget(widget);
                                                                                                                                                        }
                                                                                                                                                        return 1;
                                                                                                                                                    }
                                                                                                                                                    --ScriptFrame.Interpreter_intStackSize;
                                                                                                                                                    class353 class3532 = widget.method7445();
                                                                                                                                                    if (class3532 != null) {
                                                                                                                                                        class3532.field3782 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
                                                                                                                                                        UserComparator8.invalidateWidget(widget);
                                                                                                                                                    }
                                                                                                                                                    return 1;
                                                                                                                                                }
                                                                                                                                                --HealthBar.Interpreter_stringStackSize;
                                                                                                                                                class359 class35914 = widget.method7444();
                                                                                                                                                if (class35914 != null) {
                                                                                                                                                    widget.text2 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize];
                                                                                                                                                }
                                                                                                                                                return 1;
                                                                                                                                            }
                                                                                                                                            --ScriptFrame.Interpreter_intStackSize;
                                                                                                                                            class353 class3533 = widget.method7445();
                                                                                                                                            if (class3533 != null) {
                                                                                                                                                class3533.field3781 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
                                                                                                                                                UserComparator8.invalidateWidget(widget);
                                                                                                                                            }
                                                                                                                                            return 1;
                                                                                                                                        }
                                                                                                                                        --ScriptFrame.Interpreter_intStackSize;
                                                                                                                                        class353 class3534 = widget.method7445();
                                                                                                                                        if (class3534 != null) {
                                                                                                                                            class3534.field3783 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
                                                                                                                                            UserComparator8.invalidateWidget(widget);
                                                                                                                                        }
                                                                                                                                        return 1;
                                                                                                                                    }
                                                                                                                                    widget.method7546(Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
                                                                                                                                    return 1;
                                                                                                                                }
                                                                                                                                widget.method7521(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2], Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
                                                                                                                                return 1;
                                                                                                                            }
                                                                                                                            widget.method7426(Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize], "", class280.urlRequester, MilliClock.method4963());
                                                                                                                            return 1;
                                                                                                                        }
                                                                                                                        widget.field3908 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                                                                                                        UserComparator8.invalidateWidget(widget);
                                                                                                                        return 1;
                                                                                                                    }
                                                                                                                    widget.modelTransparency = bl3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                    return 1;
                                                                                                                }
                                                                                                                widget.field3907 = bl2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                return 1;
                                                                                                            }
                                                                                                            int n4 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                            class568 class5682 = (class568)StructComposition.findEnumerated(class309.FillMode_values(), n4);
                                                                                                            if (class5682 != null) {
                                                                                                                widget.fillMode = class5682;
                                                                                                                UserComparator8.invalidateWidget(widget);
                                                                                                            }
                                                                                                            return 1;
                                                                                                        }
                                                                                                        widget.transparencyBot = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                        UserComparator8.invalidateWidget(widget);
                                                                                                        return 1;
                                                                                                    }
                                                                                                    widget.color2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                    UserComparator8.invalidateWidget(widget);
                                                                                                    return 1;
                                                                                                }
                                                                                                widget.spriteId = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                UserComparator8.invalidateWidget(widget);
                                                                                                return 1;
                                                                                            }
                                                                                            class212.resumePauseWidget(widget.id, widget.childIndex);
                                                                                            Client.meslayerContinueWidget = widget;
                                                                                            UserComparator8.invalidateWidget(widget);
                                                                                            return 1;
                                                                                        }
                                                                                        widget.scrollWidth = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                                                                                        widget.scrollHeight = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                                                                        UserComparator8.invalidateWidget(widget);
                                                                                        if (n2 != -1 && widget.type == 0) {
                                                                                            class244.revalidateWidgetScroll(ClanChannel.field1807.field3772[n2 >> 16], widget, false);
                                                                                        }
                                                                                        return 1;
                                                                                    }
                                                                                    widget.spriteFlipH = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                    UserComparator8.invalidateWidget(widget);
                                                                                    return 1;
                                                                                }
                                                                                widget.spriteFlipV = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                UserComparator8.invalidateWidget(widget);
                                                                                return 1;
                                                                            }
                                                                            widget.spriteShadow = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                            UserComparator8.invalidateWidget(widget);
                                                                            return 1;
                                                                        }
                                                                        widget.outline = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                        UserComparator8.invalidateWidget(widget);
                                                                        return 1;
                                                                    }
                                                                    widget.textShadowed = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                    UserComparator8.invalidateWidget(widget);
                                                                    return 1;
                                                                }
                                                                ScriptFrame.Interpreter_intStackSize -= 3;
                                                                if (widget.type != 12) {
                                                                    widget.textXAlignment = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
                                                                    widget.textYAlignment = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                                                    widget.textLineHeight = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
                                                                } else {
                                                                    class359 class35915 = widget.method7444();
                                                                    if (class35915 != null) {
                                                                        class35915.method7345(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize], Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
                                                                        class35915.method7311(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2]);
                                                                    }
                                                                }
                                                                UserComparator8.invalidateWidget(widget);
                                                                return 1;
                                                            }
                                                            widget.fontId = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                            if (widget.type == 12 && (class3592 = widget.method7444()) != null) {
                                                                class3592.method7145();
                                                            }
                                                            UserComparator8.invalidateWidget(widget);
                                                            return 1;
                                                        }
                                                        String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                                        if (widget.type != 12) {
                                                            if (!string.equals(widget.text)) {
                                                                widget.text = string;
                                                                UserComparator8.invalidateWidget(widget);
                                                            }
                                                        } else {
                                                            class359 class35916 = widget.method7444();
                                                            if (class35916 != null && class35916.method7276()) {
                                                                class35916.method7131(string);
                                                            } else {
                                                                widget.text = string;
                                                            }
                                                            UserComparator8.invalidateWidget(widget);
                                                        }
                                                        return 1;
                                                    }
                                                    widget.modelOrthog = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                    UserComparator8.invalidateWidget(widget);
                                                    return 1;
                                                }
                                                if ((n3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]) != widget.sequenceId) {
                                                    widget.sequenceId = n3;
                                                    widget.modelFrame = 0;
                                                    widget.modelFrameCycle = 0;
                                                    UserComparator8.invalidateWidget(widget);
                                                }
                                                return 1;
                                            }
                                            widget.modelOffsetX = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 6];
                                            widget.modelOffsetY = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                            widget.modelAngleX = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
                                            widget.modelAngleY = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3];
                                            widget.modelAngleZ = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 4];
                                            widget.modelZoom = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 5];
                                            UserComparator8.invalidateWidget(widget);
                                            return 1;
                                        }
                                        widget.modelType = 1;
                                        widget.modelId = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                        UserComparator8.invalidateWidget(widget);
                                        return 1;
                                    }
                                    widget.spriteTiling = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                    UserComparator8.invalidateWidget(widget);
                                    return 1;
                                }
                                widget.spriteAngle = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                UserComparator8.invalidateWidget(widget);
                                return 1;
                            }
                            widget.spriteId2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                            UserComparator8.invalidateWidget(widget);
                            return 1;
                        }
                        widget.lineWid = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                        UserComparator8.invalidateWidget(widget);
                        return 1;
                    }
                    widget.transparencyTop = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                    UserComparator8.invalidateWidget(widget);
                    return 1;
                }
                widget.fill = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                UserComparator8.invalidateWidget(widget);
                return 1;
            }
            widget.color = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
            UserComparator8.invalidateWidget(widget);
            return 1;
        }
        int n5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
        int n6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
        if (widget.type != 12) {
            widget.scrollX = n5;
            if (widget.scrollX > widget.scrollWidth - widget.width) {
                widget.scrollX = widget.scrollWidth - widget.width;
            }
            if (widget.scrollX < 0) {
                widget.scrollX = 0;
            }
            widget.scrollY = n6;
            if (widget.scrollY > widget.scrollHeight - widget.height * -1528330031) {
                widget.scrollY = widget.scrollHeight - widget.height * -1528330031;
            }
            if (widget.scrollY < 0) {
                widget.scrollY = 0;
            }
            UserComparator8.invalidateWidget(widget);
        } else {
            class359 class35917 = widget.method7444();
            if (class35917 != null && class35917.method7138(n5, n6)) {
                UserComparator8.invalidateWidget(widget);
            }
        }
        return 1;
    }

    @ObfuscatedName(value="oh")
    @ObfuscatedSignature(descriptor="(II)Lvr;", garbageValue="-1349481154")
    static class548 method8935(int n) {
        class548 class5482 = (class548)Client.field789.get(n);
        if (class5482 == null) {
            class5482 = new class548(HitSplatDefinition.field2777, n);
        }
        return class5482;
    }
}

