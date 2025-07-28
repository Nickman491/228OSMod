/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName(value="bs")
@Implements(value="SoundCache")
public class SoundCache {
    @ObfuscatedName(value="ed")
    @ObfuscatedSignature(descriptor="Lok;")
    static Archive field291;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="soundEffectIndex")
    AbstractArchive soundEffectIndex;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpq;")
    AbstractArchive field294;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lub;")
    NodeHashTable field293;

    @ObfuscatedSignature(descriptor="(Lpq;Lpq;)V")
    public SoundCache(AbstractArchive abstractArchive, AbstractArchive abstractArchive2) {
        new NodeHashTable(256);
        this.field293 = new NodeHashTable(256);
        this.soundEffectIndex = abstractArchive;
        this.field294 = abstractArchive2;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II[II)Lbc;", garbageValue="-1288138879")
    @Export(value="getSoundEffect0")
    RawSound getSoundEffect0(int n, int n2, int[] nArray) {
        long l = this.method878(n, n2, false);
        class53 class533 = (class53)this.field293.get(l);
        if (class533 != null) {
            return class533.method1119();
        }
        if (nArray != null && nArray[0] <= 0) {
            return null;
        }
        SoundEffect soundEffect = SoundEffect.readSoundEffect(this.soundEffectIndex, n, n2);
        if (soundEffect == null) {
            return null;
        }
        RawSound rawSound = soundEffect.toRawSound();
        this.field293.put(new class53(rawSound), l);
        if (nArray != null) {
            nArray[0] = nArray[0] - rawSound.samples.length;
        }
        return rawSound;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)Lcn;", garbageValue="-1812904405")
    class53 method874(int n, int n2) {
        long l = this.method878(n, n2, true);
        class53 class533 = (class53)this.field293.get(l);
        if (class533 == null) {
            VorbisSample vorbisSample = VorbisSample.readMusicSample(this.field294, n, n2);
            if (vorbisSample != null) {
                class53 class534 = new class53(vorbisSample);
                this.field293.put(class534, l);
                return class534;
            }
            return new class53();
        }
        return class533;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I[IB)Lbc;", garbageValue="5")
    @Export(value="getSoundEffect")
    RawSound getSoundEffect(int n, int[] nArray) {
        if (this.soundEffectIndex.getGroupCount() == 1) {
            return this.getSoundEffect0(0, n, nArray);
        }
        if (this.soundEffectIndex.getGroupFileCount(n) == 1) {
            return this.getSoundEffect0(n, 0, nArray);
        }
        throw new RuntimeException();
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(II)Lcn;", garbageValue="2081628013")
    public class53 method876(int n) {
        if (this.field294.getGroupCount() != 1) {
            if (this.field294.getGroupFileCount(n) != 1) {
                throw new RuntimeException();
            }
            return this.method874(n, 0);
        }
        return this.method874(0, n);
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(II)Lbc;", garbageValue="2051084819")
    public RawSound method888(int n) {
        return this.getSoundEffect(n, null);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IIZI)J", garbageValue="-1650709308")
    long method878(int n, int n2, boolean bl) {
        int n3 = n2 ^ (n << 4 & 0xFFFF | n >> 12);
        n3 |= n << 16;
        if (!bl) {
            return n3;
        }
        return (long)n3 ^ 0x100000000L;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lff;FZB)F", garbageValue="92")
    static float method895(class136 class1362, float f, boolean bl) {
        float f2 = 0.0f;
        if (class1362 != null && class1362.method3455() != 0) {
            float f3 = class1362.field1573[class1362.method3455() - 1].field1528;
            float f4 = class1362.field1573[0].field1528;
            float f5 = f3 - f4;
            if (f5 != 0.0f) {
                float f6 = 0.0f;
                f6 = !(f > f3) ? (f - f4) / f5 : (f - f3) / f5;
                float f7 = (int)f6;
                float f8 = Math.abs(f6 - f7);
                float f9 = f5 * f8;
                f7 = Math.abs(f7 + 1.0f);
                float f10 = f7 / 2.0f;
                float f11 = (int)f10;
                f8 = f10 - f11;
                if (!bl) {
                    if (class1362.field1574 != class134.field1563) {
                        if (class1362.field1574 != class134.field1559 && class1362.field1574 != class134.field1560) {
                            if (class1362.field1574 == class134.field1557) {
                                f9 = f - f3;
                                float f12 = class1362.field1573[class1362.method3455() - 1].field1530;
                                float f13 = class1362.field1573[class1362.method3455() - 1].field1526;
                                f2 = class1362.field1573[class1362.method3455() - 1].field1527;
                                if (0.0f != f12) {
                                    f2 += f13 * f9 / f12;
                                }
                                return f2;
                            }
                        } else {
                            f9 = f4 + f9;
                        }
                    } else {
                        f9 = 0.0f == f8 ? (f9 += f4) : f3 - f9;
                    }
                } else if (class1362.field1572 != class134.field1563) {
                    if (class1362.field1572 != class134.field1559 && class1362.field1572 != class134.field1560) {
                        if (class1362.field1572 == class134.field1557) {
                            f9 = f4 - f;
                            float f14 = class1362.field1573[0].field1531;
                            float f15 = class1362.field1573[0].field1529;
                            f2 = class1362.field1573[0].field1527;
                            if (f14 != 0.0f) {
                                f2 -= f15 * f9 / f14;
                            }
                            return f2;
                        }
                    } else {
                        f9 = f3 - f9;
                    }
                } else {
                    f9 = f8 == 0.0f ? f3 - f9 : (f9 += f4);
                }
                f2 = class149.method3585(class1362, f9);
                if (bl && class1362.field1572 == class134.field1560) {
                    float f16 = class1362.field1573[class1362.method3455() - 1].field1527 - class1362.field1573[0].field1527;
                    f2 -= f16 * f7;
                } else if (!bl && class1362.field1574 == class134.field1560) {
                    float f17 = class1362.field1573[class1362.method3455() - 1].field1527 - class1362.field1573[0].field1527;
                    f2 += f7 * f17;
                }
                return f2;
            }
            return class1362.field1573[0].field1527;
        }
        return f2;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="-84")
    static final void method897(String string) {
        String string2 = "Please remove " + string + " from your ignore list first";
        Interpreter.addGameMessage(30, "", string2);
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(ILdm;ZS)I", garbageValue="19493")
    static int method896(int n, Script script, boolean bl) {
        if (n != ScriptOpcodes.IF_GETINVOBJECT) {
            if (n != ScriptOpcodes.IF_GETINVCOUNT) {
                int n2;
                InterfaceParent interfaceParent;
                if (n != ScriptOpcodes.IF_HASSUB) {
                    if (n != ScriptOpcodes.IF_GETTOP) {
                        if (n != 2707) {
                            if (n != 2708) {
                                if (n != 2709) {
                                    return 2;
                                }
                                Widget widget = ClanChannel.field1807.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
                                return WorldMapCacheName.method6467(widget);
                            }
                            Widget widget = ClanChannel.field1807.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
                            return class10.method112(widget);
                        }
                        Widget widget = ClanChannel.field1807.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.method7433() ? 1 : 0;
                        return 1;
                    }
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.rootInterface;
                    return 1;
                }
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (interfaceParent = (InterfaceParent)Client.interfaceParents.get(n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize])) != null ? 1 : 0;
                return 1;
            }
            Widget widget = ClanChannel.field1807.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.itemId != -1 ? widget.itemQuantity : 0;
            return 1;
        }
        Widget widget = ClanChannel.field1807.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.itemId;
        return 1;
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="601935983")
    static int method872(int n, Script script, boolean bl) {
        if (n != ScriptOpcodes.MES) {
            if (n != ScriptOpcodes.ANIM) {
                if (n != ScriptOpcodes.IF_CLOSE) {
                    if (n != ScriptOpcodes.RESUME_COUNTDIALOG) {
                        if (n != ScriptOpcodes.RESUME_NAMEDIALOG) {
                            if (n != ScriptOpcodes.RESUME_STRINGDIALOG) {
                                if (n != ScriptOpcodes.OPPLAYER) {
                                    if (n != ScriptOpcodes.IF_DRAGPICKUP) {
                                        if (n != ScriptOpcodes.CC_DRAGPICKUP) {
                                            if (n != ScriptOpcodes.MOUSECAM) {
                                                if (n != ScriptOpcodes.GETREMOVEROOFS) {
                                                    if (n != ScriptOpcodes.SETREMOVEROOFS) {
                                                        if (n != ScriptOpcodes.OPENURL) {
                                                            if (n != ScriptOpcodes.RESUME_OBJDIALOG) {
                                                                if (n != ScriptOpcodes.BUG_REPORT) {
                                                                    if (n != ScriptOpcodes.SETSHIFTCLICKDROP) {
                                                                        if (n != ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
                                                                            if (n != ScriptOpcodes.RENDERSELF) {
                                                                                if (n != 3120) {
                                                                                    if (n != 3121) {
                                                                                        if (n != 3122) {
                                                                                            if (n != 3123) {
                                                                                                if (n != 3124) {
                                                                                                    if (n != ScriptOpcodes.SETSHOWMOUSECROSS) {
                                                                                                        if (n != ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
                                                                                                            if (n != ScriptOpcodes.SETTAPTODROP) {
                                                                                                                if (n != ScriptOpcodes.GETTAPTODROP) {
                                                                                                                    if (n != 3129) {
                                                                                                                        if (n != 3130) {
                                                                                                                            if (n != 3131) {
                                                                                                                                if (n != ScriptOpcodes.GETCANVASSIZE) {
                                                                                                                                    if (n != ScriptOpcodes.MOBILE_SETFPS) {
                                                                                                                                        if (n != ScriptOpcodes.MOBILE_OPENSTORE) {
                                                                                                                                            if (n != ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
                                                                                                                                                if (n != 3136) {
                                                                                                                                                    if (n != 3137) {
                                                                                                                                                        if (n != 3138) {
                                                                                                                                                            if (n != 3139) {
                                                                                                                                                                if (n != 3140) {
                                                                                                                                                                    if (n != ScriptOpcodes.SETHIDEUSERNAME) {
                                                                                                                                                                        if (n != ScriptOpcodes.GETHIDEUSERNAME) {
                                                                                                                                                                            boolean bl2;
                                                                                                                                                                            if (n != ScriptOpcodes.SETREMEMBERUSERNAME) {
                                                                                                                                                                                if (n != ScriptOpcodes.GETREMEMBERUSERNAME) {
                                                                                                                                                                                    if (n != ScriptOpcodes.SHOW_IOS_REVIEW) {
                                                                                                                                                                                        if (n != 3146) {
                                                                                                                                                                                            if (n != 3147) {
                                                                                                                                                                                                if (n != 3148) {
                                                                                                                                                                                                    if (n != 3149) {
                                                                                                                                                                                                        if (n != 3150) {
                                                                                                                                                                                                            if (n != 3151) {
                                                                                                                                                                                                                if (n != 3152) {
                                                                                                                                                                                                                    if (n != 3153) {
                                                                                                                                                                                                                        if (n != 3154) {
                                                                                                                                                                                                                            if (n != 3155) {
                                                                                                                                                                                                                                if (n != 3156) {
                                                                                                                                                                                                                                    if (n != 3157) {
                                                                                                                                                                                                                                        if (n != 3158) {
                                                                                                                                                                                                                                            if (n != 3159) {
                                                                                                                                                                                                                                                if (n != 3160) {
                                                                                                                                                                                                                                                    if (n != 3161) {
                                                                                                                                                                                                                                                        if (n != 3162) {
                                                                                                                                                                                                                                                            if (n != 3163) {
                                                                                                                                                                                                                                                                if (n != 3164) {
                                                                                                                                                                                                                                                                    if (n != 3165) {
                                                                                                                                                                                                                                                                        if (n != 3166) {
                                                                                                                                                                                                                                                                            if (n != 3167) {
                                                                                                                                                                                                                                                                                if (n != 3168) {
                                                                                                                                                                                                                                                                                    if (n != 3169) {
                                                                                                                                                                                                                                                                                        if (n != 3170) {
                                                                                                                                                                                                                                                                                            if (n != 3171) {
                                                                                                                                                                                                                                                                                                if (n != 3172) {
                                                                                                                                                                                                                                                                                                    if (n != 3173) {
                                                                                                                                                                                                                                                                                                        if (n != 3174) {
                                                                                                                                                                                                                                                                                                            if (n != 3175) {
                                                                                                                                                                                                                                                                                                                if (n != 3176) {
                                                                                                                                                                                                                                                                                                                    if (n != 3177) {
                                                                                                                                                                                                                                                                                                                        if (n != 3178) {
                                                                                                                                                                                                                                                                                                                            if (n != 3179) {
                                                                                                                                                                                                                                                                                                                                if (n != 3180) {
                                                                                                                                                                                                                                                                                                                                    if (n != 3181) {
                                                                                                                                                                                                                                                                                                                                        if (n != 3182) {
                                                                                                                                                                                                                                                                                                                                            if (n != 3185) {
                                                                                                                                                                                                                                                                                                                                                if (n != 3186) {
                                                                                                                                                                                                                                                                                                                                                    if (n != 3189) {
                                                                                                                                                                                                                                                                                                                                                        return 2;
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                    int n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                                                                                                                                                                                                                                                                    class353.method7037(n2);
                                                                                                                                                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                int n3 = class544.clientPreferences.method2902();
                                                                                                                                                                                                                                                                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = n3;
                                                                                                                                                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            int n4 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                                                                                                                                                                                                                                                            class544.clientPreferences.method2911(n4);
                                                                                                                                                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = SoundCache.method893();
                                                                                                                                                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    class140.method3504(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
                                                                                                                                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                --HealthBar.Interpreter_stringStackSize;
                                                                                                                                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        --HealthBar.Interpreter_stringStackSize;
                                                                                                                                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                                                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        --ScriptFrame.Interpreter_intStackSize;
                                                                                                                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    --ScriptFrame.Interpreter_intStackSize;
                                                                                                                                                                                                                                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                --ScriptFrame.Interpreter_intStackSize;
                                                                                                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                ScriptFrame.Interpreter_intStackSize -= 2;
                                                                                                                                                                                                                                                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                                                                                                                                                                                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                                                                                                                                                                                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                                                                                                                                                                                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                                                                                                                                                                                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                                                                                                                                                                                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                                                                                                                                                                                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                                                                                                                                                                                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                                                                                                                                                                                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            ScriptFrame.Interpreter_intStackSize -= 2;
                                                                                                                                                                                                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        ScriptFrame.Interpreter_intStackSize -= 2;
                                                                                                                                                                                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    --ScriptFrame.Interpreter_intStackSize;
                                                                                                                                                                                                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                --ScriptFrame.Interpreter_intStackSize;
                                                                                                                                                                                                                                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            --HealthBar.Interpreter_stringStackSize;
                                                                                                                                                                                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        --ScriptFrame.Interpreter_intStackSize;
                                                                                                                                                                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    --ScriptFrame.Interpreter_intStackSize;
                                                                                                                                                                                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    ScriptFrame.Interpreter_intStackSize -= 2;
                                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            --HealthBar.Interpreter_stringStackSize;
                                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class254.method5409();
                                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                }
                                                                                                                                                                                                return 1;
                                                                                                                                                                                            }
                                                                                                                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class544.clientPreferences.method2887() ? 0 : 1;
                                                                                                                                                                                            return 1;
                                                                                                                                                                                        }
                                                                                                                                                                                        boolean bl3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                                                        class544.clientPreferences.method2978(!bl3);
                                                                                                                                                                                        return 1;
                                                                                                                                                                                    }
                                                                                                                                                                                    return 1;
                                                                                                                                                                                }
                                                                                                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
                                                                                                                                                                                return 1;
                                                                                                                                                                            }
                                                                                                                                                                            Client.Login_isUsernameRemembered = bl2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                                            if (!bl2) {
                                                                                                                                                                                class544.clientPreferences.method2901("");
                                                                                                                                                                            }
                                                                                                                                                                            return 1;
                                                                                                                                                                        }
                                                                                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class544.clientPreferences.method2974() ? 1 : 0;
                                                                                                                                                                        return 1;
                                                                                                                                                                    }
                                                                                                                                                                    boolean bl4 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                                    class544.clientPreferences.method2884(bl4);
                                                                                                                                                                    return 1;
                                                                                                                                                                }
                                                                                                                                                                Client.field665 = 3;
                                                                                                                                                                Client.field707 = bl ? class134.scriptDotWidget.id : class9.field45.id;
                                                                                                                                                                return 1;
                                                                                                                                                            }
                                                                                                                                                            Client.field665 = 1;
                                                                                                                                                            return 1;
                                                                                                                                                        }
                                                                                                                                                        Client.field665 = 0;
                                                                                                                                                        return 1;
                                                                                                                                                    }
                                                                                                                                                    Client.field665 = 2;
                                                                                                                                                    Client.field707 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                                                                    return 1;
                                                                                                                                                }
                                                                                                                                                Client.field665 = 3;
                                                                                                                                                Client.field707 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                                                                return 1;
                                                                                                                                            }
                                                                                                                                            ScriptFrame.Interpreter_intStackSize -= 2;
                                                                                                                                            return 1;
                                                                                                                                        }
                                                                                                                                        return 1;
                                                                                                                                    }
                                                                                                                                    --ScriptFrame.Interpreter_intStackSize;
                                                                                                                                    return 1;
                                                                                                                                }
                                                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = BuddyRankComparator.canvasWidth;
                                                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Huffman.canvasHeight;
                                                                                                                                return 1;
                                                                                                                            }
                                                                                                                            --ScriptFrame.Interpreter_intStackSize;
                                                                                                                            return 1;
                                                                                                                        }
                                                                                                                        ScriptFrame.Interpreter_intStackSize -= 2;
                                                                                                                        return 1;
                                                                                                                    }
                                                                                                                    Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                                                                                                                    Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                                                                                                    return 1;
                                                                                                                }
                                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class544.getTapToDrop() ? 1 : 0;
                                                                                                                return 1;
                                                                                                            }
                                                                                                            SecureRandomFuture.setTapToDrop(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1);
                                                                                                            return 1;
                                                                                                        }
                                                                                                        Client.showLoadingMessages = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                        return 1;
                                                                                                    }
                                                                                                    Client.showMouseCross = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                    return 1;
                                                                                                }
                                                                                                Client.drawPlayerNames = 0;
                                                                                                return 1;
                                                                                            }
                                                                                            Client.drawPlayerNames = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1 ? (Client.drawPlayerNames |= 8) : (Client.drawPlayerNames &= 0xFFFFFFF7);
                                                                                            return 1;
                                                                                        }
                                                                                        Client.drawPlayerNames = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1 ? (Client.drawPlayerNames |= 4) : (Client.drawPlayerNames &= 0xFFFFFFFB);
                                                                                        return 1;
                                                                                    }
                                                                                    Client.drawPlayerNames = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1 ? (Client.drawPlayerNames |= 2) : (Client.drawPlayerNames &= 0xFFFFFFFD);
                                                                                    return 1;
                                                                                }
                                                                                Client.drawPlayerNames = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1 ? (Client.drawPlayerNames |= 1) : (Client.drawPlayerNames &= 0xFFFFFFFE);
                                                                                return 1;
                                                                            }
                                                                            Client.field633 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                            return 1;
                                                                        }
                                                                        Client.showMouseOverText = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                        return 1;
                                                                    }
                                                                    --ScriptFrame.Interpreter_intStackSize;
                                                                    return 1;
                                                                }
                                                                int n5 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                String string = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize -= 2];
                                                                String string2 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1];
                                                                if (string.length() > 500) {
                                                                    return 1;
                                                                }
                                                                if (string2.length() > 500) {
                                                                    return 1;
                                                                }
                                                                PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3316, Client.packetWriter.isaacCipher);
                                                                packetBufferNode.packetBuffer.writeShort(1 + MouseRecorder.stringCp1252NullTerminatedByteSize(string) + MouseRecorder.stringCp1252NullTerminatedByteSize(string2));
                                                                packetBufferNode.packetBuffer.method10477(n5);
                                                                packetBufferNode.packetBuffer.writeStringCp1252NullTerminated(string);
                                                                packetBufferNode.packetBuffer.writeStringCp1252NullTerminated(string2);
                                                                Client.packetWriter.addNode(packetBufferNode);
                                                                return 1;
                                                            }
                                                            int n6 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                            PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3407, Client.packetWriter.isaacCipher);
                                                            packetBufferNode.packetBuffer.writeShort(n6);
                                                            Client.packetWriter.addNode(packetBufferNode);
                                                            return 1;
                                                        }
                                                        String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                                        boolean bl5 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                        WorldMapRectangle.openURL(string, bl5, false);
                                                        return 1;
                                                    }
                                                    class544.clientPreferences.method2921(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1);
                                                    return 1;
                                                }
                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class544.clientPreferences.method2890() ? 1 : 0;
                                                return 1;
                                            }
                                            KeyHandler.mouseCam = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                            return 1;
                                        }
                                        int n7 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                                        int n8 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                        Widget widget = bl ? class134.scriptDotWidget : class9.field45;
                                        WorldMapLabel.clickWidget(widget, n7, n8);
                                        return 1;
                                    }
                                    int n9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 3];
                                    int n10 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                    int n11 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
                                    Widget widget = ClanChannel.field1807.method7031(n11);
                                    WorldMapLabel.clickWidget(widget, n9, n10);
                                    return 1;
                                }
                                int n12 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                AbstractWorldMapIcon.method6463(n12, string);
                                return 1;
                            }
                            String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                            PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3406, Client.packetWriter.isaacCipher);
                            packetBufferNode.packetBuffer.writeByte(string.length() + 1);
                            packetBufferNode.packetBuffer.writeStringCp1252NullTerminated(string);
                            Client.packetWriter.addNode(packetBufferNode);
                            return 1;
                        }
                        String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                        PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3359, Client.packetWriter.isaacCipher);
                        packetBufferNode.packetBuffer.writeByte(string.length() + 1);
                        packetBufferNode.packetBuffer.writeStringCp1252NullTerminated(string);
                        Client.packetWriter.addNode(packetBufferNode);
                        return 1;
                    }
                    String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                    int n13 = 0;
                    if (class426.isNumber(string)) {
                        n13 = class278.method5972(string);
                    }
                    PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3357, Client.packetWriter.isaacCipher);
                    packetBufferNode.packetBuffer.method10268(n13);
                    Client.packetWriter.addNode(packetBufferNode);
                    return 1;
                }
                if (!Interpreter.field862) {
                    Interpreter.field850 = true;
                }
                return 1;
            }
            Decimator.method1171(ModeWhere.localPlayer, Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2], Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
            return 1;
        }
        String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
        Interpreter.addGameMessage(0, "", string);
        return 1;
    }

    @ObfuscatedName(value="if")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1159973217")
    static void method881() {
        class268 class2682 = (class268)Client.field709.last();
        while (class2682 != null) {
            class2682.remove();
            class2682 = (class268)Client.field709.previous();
        }
        return;
    }

    @ObfuscatedName(value="nb")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="18")
    static final int method893() {
        float f = 200.0f * ((float)class544.clientPreferences.method2941() - 0.5f);
        return 100 - Math.round(f);
    }

    @ObfuscatedName(value="od")
    @ObfuscatedSignature(descriptor="(IB)Lvr;", garbageValue="20")
    static class548 method892(int n) {
        class548 class5482 = (class548)Client.DBTableIndex_cache.get(n);
        if (class5482 == null) {
            class5482 = new class548(HitSplatDefinition.field2777, class244.method5288(n), class384.method7653(n));
            Client.DBTableIndex_cache.put(class5482, n);
        }
        return class5482;
    }
}

