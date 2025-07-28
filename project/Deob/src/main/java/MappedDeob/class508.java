/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName(value="tu")
public class class508 {
    @ObfuscatedName(value="an")
    static int[] field5156 = new int[32768];
    @ObfuscatedName(value="ae")
    public static int[] field5161;

    static {
        for (int i = 0; i < 32768; ++i) {
            class508.field5156[i] = class508.method9615(i);
        }
        class508.method9606();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-1848177861")
    static final int method9615(int n) {
        double d;
        double d2 = (double)(n >> 10 & 0x1F) / 31.0;
        double d3 = (double)(n >> 5 & 0x1F) / 31.0;
        double d4 = (double)(n & 0x1F) / 31.0;
        double d5 = d2;
        if (d3 < d5) {
            d5 = d3;
        }
        if (d4 < d5) {
            d5 = d4;
        }
        if (d3 > (d = d2)) {
            d = d3;
        }
        if (d4 > d) {
            d = d4;
        }
        double d6 = 0.0;
        double d7 = 0.0;
        double d8 = (d + d5) / 2.0;
        if (d != d5) {
            if (d8 < 0.5) {
                d7 = (d - d5) / (d + d5);
            }
            if (d8 >= 0.5) {
                d7 = (d - d5) / (2.0 - d - d5);
            }
            if (d == d2) {
                d6 = (d3 - d4) / (d - d5);
            } else if (d3 == d) {
                d6 = (d4 - d2) / (d - d5) + 2.0;
            } else if (d4 == d) {
                d6 = 4.0 + (d2 - d3) / (d - d5);
            }
        }
        int n2 = (int)(d6 * 256.0 / 6.0);
        n2 &= 0xFF;
        double d9 = 256.0 * d7;
        if (d9 < 0.0) {
            d9 = 0.0;
        } else if (d9 > 255.0) {
            d9 = 255.0;
        }
        if (d8 > 0.7) {
            d9 /= 2.0;
            d9 = Math.floor(d9);
        }
        if (d8 > 0.75) {
            d9 /= 2.0;
            d9 = Math.floor(d9);
        }
        if (d8 > 0.85) {
            d9 /= 2.0;
            d9 = Math.floor(d9);
        }
        if (d8 > 0.95) {
            d9 /= 2.0;
            d9 = Math.floor(d9);
        }
        if (d8 > 0.995) {
            d8 = 0.995;
        }
        int n3 = (int)((double)(n2 / 4 * 8) + d9 / 32.0);
        return (n3 << 7) + (int)(d8 * 128.0);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="8")
    static void method9606() {
        if (field5161 != null) {
            return;
        }
        field5161 = new int[65536];
        double d = 0.95f;
        int n = 0;
        while (n < 65536) {
            double d2;
            double d3 = (double)(n >> 10 & 0x3F) / 64.0 + 0.0078125;
            double d4 = (double)(n >> 7 & 7) / 8.0 + 0.0625;
            double d5 = d2 = (double)(n & 0x7F) / 128.0;
            double d6 = d2;
            double d7 = d2;
            if (d4 != 0.0) {
                double d8 = d2 < 0.5 ? d2 * (1.0 + d4) : d2 + d4 - d2 * d4;
                double d9 = d2 * 2.0 - d8;
                double d10 = 0.3333333333333333 + d3;
                if (d10 > 1.0) {
                    d10 -= 1.0;
                }
                double d11 = d3;
                double d12 = d3 - 0.3333333333333333;
                if (d12 < 0.0) {
                    d12 += 1.0;
                }
                d5 = 6.0 * d10 < 1.0 ? d9 + (d8 - d9) * 6.0 * d10 : (2.0 * d10 < 1.0 ? d8 : (3.0 * d10 < 2.0 ? d9 + 6.0 * ((d8 - d9) * (0.6666666666666666 - d10)) : d9));
                d6 = 6.0 * d11 < 1.0 ? d9 + d11 * ((d8 - d9) * 6.0) : (2.0 * d11 < 1.0 ? d8 : (3.0 * d11 < 2.0 ? (d8 - d9) * (0.6666666666666666 - d11) * 6.0 + d9 : d9));
                d7 = 6.0 * d12 < 1.0 ? d9 + d12 * ((d8 - d9) * 6.0) : (d12 * 2.0 < 1.0 ? d8 : (3.0 * d12 < 2.0 ? d9 + (0.6666666666666666 - d12) * (d8 - d9) * 6.0 : d9));
            }
            d5 = Math.pow(d5, d);
            d6 = Math.pow(d6, d);
            d7 = Math.pow(d7, d);
            int n2 = (int)(d5 * 256.0);
            int n3 = (int)(256.0 * d6);
            int n4 = (int)(d7 * 256.0);
            int n5 = n4 + (n3 << 8) + (n2 << 16);
            class508.field5161[n] = n5 & 0xFFFFFF;
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(ILdb;B)Ldz;", garbageValue="54")
    public static class103 method9616(int n, class97 class972) {
        class103 class1032;
        Iterator iterator = class972.iterator();
        do {
            if (!iterator.hasNext()) {
                return class972.method2726();
            }
            class1032 = (class103)iterator.next();
        } while (class1032.field1330[n] == null);
        return class1032;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="-24")
    public static int method9604(int n) {
        return 255 - (n & 0xFF);
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="([BIII)Z", garbageValue="-1811127083")
    static final boolean method9614(byte[] var0, int var1_1, int var2_2) {
        var3_3 = true;
        var4_4 = new Buffer(var0);
        var5_5 = -1;
        block0: while (true) lbl-1000:
        // 3 sources

        {
            if ((var6_6 = var4_4.method10297()) == 0) {
                return var3_3;
            }
            var5_5 += var6_6;
            var7_7 = 0;
            var8_8 = false;
            while (true) {
                block4: {
                    if (var8_8) break block4;
                    var9_9 = var4_4.readUShortSmart();
                    if (var9_9 == 0) ** GOTO lbl-1000
                    var10_10 = (var7_7 += var9_9 - 1) & 63;
                    var11_11 = var7_7 >> 6 & 63;
                    var12_12 = var4_4.readUnsignedByte() >> 2;
                    var13_13 = var11_11 + var1_1;
                    var14_14 = var10_10 + var2_2;
                    if (var13_13 <= 0 || var14_14 <= 0 || var13_13 >= 103 || var14_14 >= 103) continue;
                    var15_15 = class142.getObjectDefinition(var5_5);
                    if (var12_12 == 22 && Client.isLowDetail && var15_15.int1 == 0 && var15_15.interactType != 1 && !var15_15.boolean2) continue;
                    if (!var15_15.needsModelFiles()) {
                        ++Client.field561;
                        var3_3 = false;
                    }
                    var8_8 = true;
                    continue;
                }
                var9_9 = var4_4.readUShortSmart();
                if (var9_9 == 0) continue block0;
                var4_4.readUnsignedByte();
            }
            break;
        }
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(ILdm;ZB)I", garbageValue="17")
    static int method9608(int n, Script script, boolean bl) {
        Widget widget;
        Widget widget2 = widget = bl ? class134.scriptDotWidget : class9.field45;
        if (n != ScriptOpcodes.CC_GETSCROLLX) {
            if (n != ScriptOpcodes.CC_GETSCROLLY) {
                class359 class3592;
                if (n != ScriptOpcodes.CC_GETTEXT) {
                    if (n != ScriptOpcodes.CC_GETSCROLLWIDTH) {
                        if (n != ScriptOpcodes.CC_GETSCROLLHEIGHT) {
                            if (n != ScriptOpcodes.CC_GETMODELZOOM) {
                                if (n != ScriptOpcodes.CC_GETMODELANGLE_X) {
                                    if (n != ScriptOpcodes.CC_GETMODELANGLE_Z) {
                                        if (n != ScriptOpcodes.CC_GETMODELANGLE_Y) {
                                            if (n != ScriptOpcodes.CC_GETTRANS) {
                                                if (n != 1610) {
                                                    if (n != ScriptOpcodes.CC_GETCOLOUR) {
                                                        if (n != ScriptOpcodes.CC_GETFILLCOLOUR) {
                                                            if (n != 1613) {
                                                                if (n != ScriptOpcodes.CC_GETMODELTRANSPARENT) {
                                                                    Object object;
                                                                    if (n == 1617) {
                                                                        object = widget.method7445();
                                                                        int n2 = Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = object != null ? ((class353)object).field3783 : 0;
                                                                    }
                                                                    if (n != 1618) {
                                                                        if (n != 1619) {
                                                                            if (n != 1620) {
                                                                                if (n != 1621) {
                                                                                    if (n != 1622) {
                                                                                        if (n != 1623) {
                                                                                            if (n != 1624) {
                                                                                                if (n != 1625) {
                                                                                                    if (n != 1626) {
                                                                                                        if (n != 1627) {
                                                                                                            if (n != 1628) {
                                                                                                                if (n != 1629) {
                                                                                                                    if (n != 1630) {
                                                                                                                        if (n != 1631) {
                                                                                                                            if (n != 1632) {
                                                                                                                                if (n != 1633) {
                                                                                                                                    if (n != 1634) {
                                                                                                                                        return 2;
                                                                                                                                    }
                                                                                                                                    object = widget.method7535();
                                                                                                                                    Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1] = object != null ? ((class27)object).method409((char)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1]) : 0;
                                                                                                                                    return 1;
                                                                                                                                }
                                                                                                                                object = widget.method7535();
                                                                                                                                Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1] = object != null ? ((class27)object).method449(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1]) : 0;
                                                                                                                                return 1;
                                                                                                                            }
                                                                                                                            object = widget.method7444();
                                                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = object != null ? ((class359)object).method7371() : 0;
                                                                                                                            return 1;
                                                                                                                        }
                                                                                                                        object = widget.method7444();
                                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = object != null ? ((class359)object).method7193() : 0;
                                                                                                                        return 1;
                                                                                                                    }
                                                                                                                    object = widget.method7444();
                                                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = object != null ? ((class359)object).method7191() : 0;
                                                                                                                    return 1;
                                                                                                                }
                                                                                                                object = widget.method7444();
                                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = object != null ? ((class359)object).method7157() : 0;
                                                                                                                return 1;
                                                                                                            }
                                                                                                            object = widget.method7444();
                                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = object != null ? ((class359)object).method7259() : 0;
                                                                                                            return 1;
                                                                                                        }
                                                                                                        object = widget.method7444();
                                                                                                        int n3 = object != null ? ((class359)object).method7184() : 0;
                                                                                                        int n4 = object != null ? ((class359)object).method7259() : 0;
                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Math.min(n3, n4);
                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Math.max(n3, n4);
                                                                                                        return 1;
                                                                                                    }
                                                                                                    object = widget.method7444();
                                                                                                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = object != null ? ((class359)object).method7179().method8809() : "";
                                                                                                    return 1;
                                                                                                }
                                                                                                object = widget.method7444();
                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = object != null && ((class359)object).method7181() ? 1 : 0;
                                                                                                return 1;
                                                                                            }
                                                                                            object = widget.method7444();
                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = object != null && ((class359)object).method7221() ? 1 : 0;
                                                                                            return 1;
                                                                                        }
                                                                                        object = widget.method7444();
                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = object != null ? ((class359)object).method7190() : 0;
                                                                                        return 1;
                                                                                    }
                                                                                    object = widget.method7444();
                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = object != null ? ((class359)object).method7189() : 0;
                                                                                    return 1;
                                                                                }
                                                                                object = widget.method7444();
                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = object != null ? ((class359)object).method7188() : 0;
                                                                                return 1;
                                                                            }
                                                                            object = widget.method7445();
                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = object != null ? ((class353)object).field3782 : 0;
                                                                            return 1;
                                                                        }
                                                                        object = widget.method7444();
                                                                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = object != null ? ((class359)object).method7363().method8533() : "";
                                                                        return 1;
                                                                    }
                                                                    object = widget.method7445();
                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = object != null ? ((class353)object).field3781 : 0;
                                                                    return 1;
                                                                }
                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.modelTransparency ? 1 : 0;
                                                                return 1;
                                                            }
                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.fillMode.rsOrdinal();
                                                            return 1;
                                                        }
                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.color2;
                                                        return 1;
                                                    }
                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.color;
                                                    return 1;
                                                }
                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.transparencyBot;
                                                return 1;
                                            }
                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.transparencyTop;
                                            return 1;
                                        }
                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.modelAngleY;
                                        return 1;
                                    }
                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.modelAngleZ;
                                    return 1;
                                }
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.modelAngleX;
                                return 1;
                            }
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.modelZoom;
                            return 1;
                        }
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.scrollHeight;
                        return 1;
                    }
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.scrollWidth;
                    return 1;
                }
                if (widget.type != 12 || (class3592 = widget.method7444()) == null) {
                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = widget.text;
                    return 1;
                }
                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = class3592.method7331().method8533();
                return 1;
            }
            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.scrollY;
            return 1;
        }
        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.scrollX;
        return 1;
    }

    @ObfuscatedName(value="lz")
    @ObfuscatedSignature(descriptor="(IIIIIILjava/lang/String;Ljava/lang/String;III)V", garbageValue="-1815579932")
    public static final void method9611(int n, int n2, int n3, int n4, int n5, int n6, String string, String string2, int n7, int n8) {
        PacketBufferNode packetBufferNode;
        int n9;
        Node node;
        Node node2;
        class103 class1032 = null;
        if (n6 >= 0 && GameEngine.field189.field1318[n6] != null) {
            class1032 = GameEngine.field189.field1318[n6].field5035;
        } else if (n6 == -1) {
            class1032 = GameEngine.field189;
        }
        if (class1032 == null) {
            return;
        }
        int n10 = class1032.field1324;
        int n11 = class1032.field1325;
        class105[] class105Array = class1032.field1330;
        Player[] playerArray = class1032.field1329;
        if (n3 >= 2000) {
            n3 -= 2000;
        }
        if (n3 == 1002) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3333, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node2).packetBuffer.method10320(n4);
            Client.packetWriter.addNode((PacketBufferNode)node2);
        }
        if (n3 == 50 && (node2 = playerArray[n4]) != null) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            Client.field744 = n;
            Client.field745 = n2;
            node = ScriptEvent.getPacketBufferNode(ClientPacket.field3325, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node).packetBuffer.method10320(n4);
            ((PacketBufferNode)node).packetBuffer.writeByte(Client.field731.method5776(82) ? 1 : 0);
            Client.packetWriter.addNode((PacketBufferNode)node);
        }
        if (n3 == 13 && (node2 = class105Array[n4]) != null) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            Client.field744 = n;
            Client.field745 = n2;
            node = ScriptEvent.getPacketBufferNode(ClientPacket.field3378, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node).packetBuffer.writeShort(n4);
            ((PacketBufferNode)node).packetBuffer.method10311(Client.field731.method5776(82) ? 1 : 0);
            Client.packetWriter.addNode((PacketBufferNode)node);
        }
        if (n3 == 60) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 1;
            Client.field622 = 0;
            node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3355, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node2).packetBuffer.method10311(n4);
            Client.packetWriter.addNode((PacketBufferNode)node2);
        }
        if (n3 == 23) {
            if (Client.isMenuOpen) {
                class1032.field1319.method4232();
            } else {
                class1032.field1319.method4235(true);
            }
        }
        if (n3 == 1004) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3341, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node2).packetBuffer.method10454(n4);
            ((PacketBufferNode)node2).packetBuffer.writeShort(n11 + n2);
            ((PacketBufferNode)node2).packetBuffer.writeShort(n + n10);
            Client.packetWriter.addNode((PacketBufferNode)node2);
        }
        if (n3 == 48 && (node2 = playerArray[n4]) != null) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            Client.field744 = n;
            Client.field745 = n2;
            node = ScriptEvent.getPacketBufferNode(ClientPacket.field3389, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node).packetBuffer.writeShort(n4);
            ((PacketBufferNode)node).packetBuffer.method10310(Client.field731.method5776(82) ? 1 : 0);
            Client.packetWriter.addNode((PacketBufferNode)node);
        }
        if (n3 == 1) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            Client.field744 = n;
            Client.field745 = n2;
            node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3393, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node2).packetBuffer.writeInt(n + n10);
            ((PacketBufferNode)node2).packetBuffer.writeInt(class143.field1637);
            ((PacketBufferNode)node2).packetBuffer.method10333(class271.field3015);
            ((PacketBufferNode)node2).packetBuffer.writeShort(n11 + n2);
            ((PacketBufferNode)node2).packetBuffer.method10320(n4);
            ((PacketBufferNode)node2).packetBuffer.writeInt(Interpreter.field866);
            ((PacketBufferNode)node2).packetBuffer.method10310(Client.field731.method5776(82) ? 1 : 0);
            Client.packetWriter.addNode((PacketBufferNode)node2);
        }
        if (n3 == 12 && (node2 = class105Array[n4]) != null) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            Client.field744 = n;
            Client.field745 = n2;
            node = ScriptEvent.getPacketBufferNode(ClientPacket.field3347, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node).packetBuffer.writeByte(Client.field731.method5776(82) ? 1 : 0);
            ((PacketBufferNode)node).packetBuffer.writeShort(n4);
            Client.packetWriter.addNode((PacketBufferNode)node);
        }
        if (n3 == 1008 || n3 == 1009 || n3 == 1010 || n3 == 1011 || n3 == 1012) {
            class420.worldMap.worldMapMenuAction(n3, n4, new Coord(n), new Coord(n2));
        }
        if (n3 == 18) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            Client.field744 = n;
            Client.field745 = n2;
            node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3375, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node2).packetBuffer.writeInt(n + n10);
            ((PacketBufferNode)node2).packetBuffer.method10454(n4);
            ((PacketBufferNode)node2).packetBuffer.writeInt(n11 + n2);
            ((PacketBufferNode)node2).packetBuffer.method10477(Client.field731.method5776(82) ? 1 : 0);
            Client.packetWriter.addNode((PacketBufferNode)node2);
        }
        if ((n3 == 57 || n3 == 1007) && (node2 = ClanChannel.field1807.method7023(n2, n)) != null) {
            UrlRequester.widgetDefaultMenuAction(n4, n2, n, n5, string2);
        }
        if (n3 == 44 && (node2 = playerArray[n4]) != null) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            Client.field744 = n;
            Client.field745 = n2;
            node = ScriptEvent.getPacketBufferNode(ClientPacket.field3380, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node).packetBuffer.method10477(Client.field731.method5776(82) ? 1 : 0);
            ((PacketBufferNode)node).packetBuffer.method10454(n4);
            Client.packetWriter.addNode((PacketBufferNode)node);
        }
        if (n3 == 2) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            Client.field744 = n;
            Client.field745 = n2;
            node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3326, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node2).packetBuffer.method10332(class33.field149);
            ((PacketBufferNode)node2).packetBuffer.writeShort(n11 + n2);
            ((PacketBufferNode)node2).packetBuffer.method10320(n4);
            ((PacketBufferNode)node2).packetBuffer.method10310(Client.field731.method5776(82) ? 1 : 0);
            ((PacketBufferNode)node2).packetBuffer.writeShort(Client.field660);
            ((PacketBufferNode)node2).packetBuffer.method10320(Client.field659);
            ((PacketBufferNode)node2).packetBuffer.method10320(n + n10);
            Client.packetWriter.addNode((PacketBufferNode)node2);
        }
        if (n3 == 11 && (node2 = class105Array[n4]) != null) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            Client.field744 = n;
            Client.field745 = n2;
            node = ScriptEvent.getPacketBufferNode(ClientPacket.field3397, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node).packetBuffer.method10320(n4);
            ((PacketBufferNode)node).packetBuffer.method10310(Client.field731.method5776(82) ? 1 : 0);
            Client.packetWriter.addNode((PacketBufferNode)node);
        }
        if (n3 == 7 && (node2 = class105Array[n4]) != null) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            Client.field744 = n;
            Client.field745 = n2;
            node = ScriptEvent.getPacketBufferNode(ClientPacket.field3404, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node).packetBuffer.method10320(n4);
            ((PacketBufferNode)node).packetBuffer.writeShort(Interpreter.field866);
            ((PacketBufferNode)node).packetBuffer.method10310(Client.field731.method5776(82) ? 1 : 0);
            ((PacketBufferNode)node).packetBuffer.method10454(class143.field1637);
            ((PacketBufferNode)node).packetBuffer.method10333(class271.field3015);
            Client.packetWriter.addNode((PacketBufferNode)node);
        }
        if (n3 == 46 && (node2 = playerArray[n4]) != null) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            Client.field744 = n;
            Client.field745 = n2;
            node = ScriptEvent.getPacketBufferNode(ClientPacket.field3339, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node).packetBuffer.method10320(n4);
            ((PacketBufferNode)node).packetBuffer.writeByte(Client.field731.method5776(82) ? 1 : 0);
            Client.packetWriter.addNode((PacketBufferNode)node);
        }
        if (n3 == 1001) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            Client.field744 = n;
            Client.field745 = n2;
            node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3356, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node2).packetBuffer.method10477(Client.field731.method5776(82) ? 1 : 0);
            ((PacketBufferNode)node2).packetBuffer.writeInt(n + n10);
            ((PacketBufferNode)node2).packetBuffer.method10320(n11 + n2);
            ((PacketBufferNode)node2).packetBuffer.writeInt(n4);
            Client.packetWriter.addNode((PacketBufferNode)node2);
        }
        if (n3 == 58 && (node2 = ClanChannel.field1807.method7023(n2, n)) != null) {
            if (((Widget)node2).field3985 != null) {
                node = new ScriptEvent();
                ((ScriptEvent)node).widget = node2;
                ((ScriptEvent)node).opIndex = n4;
                ((ScriptEvent)node).targetName = string2;
                ((ScriptEvent)node).args = ((Widget)node2).field3985;
                Friend.runScriptEvent((ScriptEvent)node);
            }
            node = ScriptEvent.getPacketBufferNode(ClientPacket.field3412, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node).packetBuffer.method10331(class33.field149);
            ((PacketBufferNode)node).packetBuffer.writeShort(n);
            ((PacketBufferNode)node).packetBuffer.method10332(n2);
            ((PacketBufferNode)node).packetBuffer.method10320(Client.field659);
            ((PacketBufferNode)node).packetBuffer.method10320(n5);
            ((PacketBufferNode)node).packetBuffer.writeShort(Client.field660);
            Client.packetWriter.addNode((PacketBufferNode)node);
        }
        if (n3 == 30 && Client.meslayerContinueWidget == null) {
            class212.resumePauseWidget(n2, n);
            Client.meslayerContinueWidget = ClanChannel.field1807.method7023(n2, n);
            UserComparator8.invalidateWidget(Client.meslayerContinueWidget);
        }
        if (n3 == 29) {
            node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3369, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node2).packetBuffer.method10268(n2);
            Client.packetWriter.addNode((PacketBufferNode)node2);
            node = ClanChannel.field1807.method7031(n2);
            if (node != null && ((Widget)node).cs1Instructions != null && ((Widget)node).cs1Instructions[0][0] == 5 && Varps.Varps_main[n9 = ((Widget)node).cs1Instructions[0][1]] != ((Widget)node).cs1ComparisonValues[0]) {
                Varps.Varps_main[n9] = ((Widget)node).cs1ComparisonValues[0];
                RouteStrategy.changeGameOptions(n9);
            }
        }
        if (n3 == 17) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            Client.field744 = n;
            Client.field745 = n2;
            node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3402, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node2).packetBuffer.writeShort(n + n10);
            ((PacketBufferNode)node2).packetBuffer.writeInt(n11 + n2);
            ((PacketBufferNode)node2).packetBuffer.method10320(n4);
            ((PacketBufferNode)node2).packetBuffer.method10332(class33.field149);
            ((PacketBufferNode)node2).packetBuffer.method10454(Client.field660);
            ((PacketBufferNode)node2).packetBuffer.writeByte(Client.field731.method5776(82) ? 1 : 0);
            ((PacketBufferNode)node2).packetBuffer.writeInt(Client.field659);
            Client.packetWriter.addNode((PacketBufferNode)node2);
        }
        if (n3 == 5) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            Client.field744 = n;
            Client.field745 = n2;
            node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3362, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node2).packetBuffer.method10320(n4);
            ((PacketBufferNode)node2).packetBuffer.method10320(n + n10);
            ((PacketBufferNode)node2).packetBuffer.method10310(Client.field731.method5776(82) ? 1 : 0);
            ((PacketBufferNode)node2).packetBuffer.writeInt(n11 + n2);
            Client.packetWriter.addNode((PacketBufferNode)node2);
        }
        if (n3 == 22) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            Client.field744 = n;
            Client.field745 = n2;
            node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3391, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node2).packetBuffer.method10311(Client.field731.method5776(82) ? 1 : 0);
            ((PacketBufferNode)node2).packetBuffer.writeShort(n11 + n2);
            ((PacketBufferNode)node2).packetBuffer.method10454(n + n10);
            ((PacketBufferNode)node2).packetBuffer.writeInt(n4);
            Client.packetWriter.addNode((PacketBufferNode)node2);
        }
        if (n3 == 1003) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            node2 = class105Array[n4];
            if (node2 != null) {
                node = ((class105)node2).field1354;
                if (((NPCComposition)node).transforms != null) {
                    node = ((NPCComposition)node).transform();
                }
                if (node != null) {
                    packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3383, Client.packetWriter.isaacCipher);
                    packetBufferNode.packetBuffer.method10454(((NPCComposition)node).id);
                    Client.packetWriter.addNode(packetBufferNode);
                }
            }
        }
        if (n3 == 4) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            Client.field744 = n;
            Client.field745 = n2;
            node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3394, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node2).packetBuffer.method10454(n11 + n2);
            ((PacketBufferNode)node2).packetBuffer.method10320(n4);
            ((PacketBufferNode)node2).packetBuffer.writeShort(n + n10);
            ((PacketBufferNode)node2).packetBuffer.writeByte(Client.field731.method5776(82) ? 1 : 0);
            Client.packetWriter.addNode((PacketBufferNode)node2);
        }
        if (n3 == 3) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            Client.field744 = n;
            Client.field745 = n2;
            node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3363, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node2).packetBuffer.method10320(n11 + n2);
            ((PacketBufferNode)node2).packetBuffer.writeByte(Client.field731.method5776(82) ? 1 : 0);
            ((PacketBufferNode)node2).packetBuffer.method10320(n4);
            ((PacketBufferNode)node2).packetBuffer.method10320(n + n10);
            Client.packetWriter.addNode((PacketBufferNode)node2);
        }
        if (n3 == 9 && (node2 = class105Array[n4]) != null) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            Client.field744 = n;
            Client.field745 = n2;
            node = ScriptEvent.getPacketBufferNode(ClientPacket.field3358, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node).packetBuffer.method10477(Client.field731.method5776(82) ? 1 : 0);
            ((PacketBufferNode)node).packetBuffer.writeInt(n4);
            Client.packetWriter.addNode((PacketBufferNode)node);
        }
        if (n3 == 14 && (node2 = playerArray[n4]) != null) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            Client.field744 = n;
            Client.field745 = n2;
            node = ScriptEvent.getPacketBufferNode(ClientPacket.field3377, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node).packetBuffer.method10268(class271.field3015);
            ((PacketBufferNode)node).packetBuffer.method10320(Interpreter.field866);
            ((PacketBufferNode)node).packetBuffer.method10310(Client.field731.method5776(82) ? 1 : 0);
            ((PacketBufferNode)node).packetBuffer.writeShort(class143.field1637);
            ((PacketBufferNode)node).packetBuffer.writeInt(n4);
            Client.packetWriter.addNode((PacketBufferNode)node);
        }
        if (n3 == 19) {
            Client.field620 = n7;
            Client.field717 = n8;
            Client.field603 = 2;
            Client.field622 = 0;
            Client.field744 = n;
            Client.field745 = n2;
            node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3343, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)node2).packetBuffer.method10320(n4);
            ((PacketBufferNode)node2).packetBuffer.method10320(n + n10);
            ((PacketBufferNode)node2).packetBuffer.writeShort(n11 + n2);
            ((PacketBufferNode)node2).packetBuffer.writeByte(Client.field731.method5776(82) ? 1 : 0);
            Client.packetWriter.addNode((PacketBufferNode)node2);
        }
        if (n3 != 25) {
            if (n3 == 24 && (node2 = ClanChannel.field1807.method7031(n2)) != null) {
                boolean bl = true;
                if (((Widget)node2).contentType > 0) {
                    bl = FriendsList.method9092((Widget)node2);
                }
                if (bl) {
                    packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3369, Client.packetWriter.isaacCipher);
                    packetBufferNode.packetBuffer.method10268(n2);
                    Client.packetWriter.addNode(packetBufferNode);
                }
            }
            if (n3 == 21) {
                Client.field620 = n7;
                Client.field717 = n8;
                Client.field603 = 2;
                Client.field622 = 0;
                Client.field744 = n;
                Client.field745 = n2;
                node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3334, Client.packetWriter.isaacCipher);
                ((PacketBufferNode)node2).packetBuffer.method10320(n11 + n2);
                ((PacketBufferNode)node2).packetBuffer.method10320(n4);
                ((PacketBufferNode)node2).packetBuffer.writeInt(n + n10);
                ((PacketBufferNode)node2).packetBuffer.method10310(Client.field731.method5776(82) ? 1 : 0);
                Client.packetWriter.addNode((PacketBufferNode)node2);
            }
            if (n3 == 6) {
                Client.field620 = n7;
                Client.field717 = n8;
                Client.field603 = 2;
                Client.field622 = 0;
                Client.field744 = n;
                Client.field745 = n2;
                node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3360, Client.packetWriter.isaacCipher);
                ((PacketBufferNode)node2).packetBuffer.writeShort(n + n10);
                ((PacketBufferNode)node2).packetBuffer.writeShort(n4);
                ((PacketBufferNode)node2).packetBuffer.method10454(n11 + n2);
                ((PacketBufferNode)node2).packetBuffer.method10311(Client.field731.method5776(82) ? 1 : 0);
                Client.packetWriter.addNode((PacketBufferNode)node2);
            }
            if (n3 == 8 && (node2 = class105Array[n4]) != null) {
                Client.field620 = n7;
                Client.field717 = n8;
                Client.field603 = 2;
                Client.field622 = 0;
                Client.field744 = n;
                Client.field745 = n2;
                node = ScriptEvent.getPacketBufferNode(ClientPacket.field3322, Client.packetWriter.isaacCipher);
                ((PacketBufferNode)node).packetBuffer.method10311(Client.field731.method5776(82) ? 1 : 0);
                ((PacketBufferNode)node).packetBuffer.method10320(n4);
                ((PacketBufferNode)node).packetBuffer.method10454(Client.field659);
                ((PacketBufferNode)node).packetBuffer.method10332(class33.field149);
                ((PacketBufferNode)node).packetBuffer.method10320(Client.field660);
                Client.packetWriter.addNode((PacketBufferNode)node);
            }
            if (n3 == 15 && (node2 = playerArray[n4]) != null) {
                Client.field620 = n7;
                Client.field717 = n8;
                Client.field603 = 2;
                Client.field622 = 0;
                Client.field744 = n;
                Client.field745 = n2;
                node = ScriptEvent.getPacketBufferNode(ClientPacket.field3318, Client.packetWriter.isaacCipher);
                ((PacketBufferNode)node).packetBuffer.method10477(Client.field731.method5776(82) ? 1 : 0);
                ((PacketBufferNode)node).packetBuffer.method10454(Client.field659);
                ((PacketBufferNode)node).packetBuffer.method10268(class33.field149);
                ((PacketBufferNode)node).packetBuffer.writeShort(n4);
                ((PacketBufferNode)node).packetBuffer.writeShort(Client.field660);
                Client.packetWriter.addNode((PacketBufferNode)node);
            }
            if (n3 == 10 && (node2 = class105Array[n4]) != null) {
                Client.field620 = n7;
                Client.field717 = n8;
                Client.field603 = 2;
                Client.field622 = 0;
                Client.field744 = n;
                Client.field745 = n2;
                node = ScriptEvent.getPacketBufferNode(ClientPacket.field3373, Client.packetWriter.isaacCipher);
                ((PacketBufferNode)node).packetBuffer.method10320(n4);
                ((PacketBufferNode)node).packetBuffer.method10310(Client.field731.method5776(82) ? 1 : 0);
                Client.packetWriter.addNode((PacketBufferNode)node);
            }
            if (n3 == 28) {
                node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3369, Client.packetWriter.isaacCipher);
                ((PacketBufferNode)node2).packetBuffer.method10268(n2);
                Client.packetWriter.addNode((PacketBufferNode)node2);
                node = ClanChannel.field1807.method7031(n2);
                if (node != null && ((Widget)node).cs1Instructions != null && ((Widget)node).cs1Instructions[0][0] == 5) {
                    n9 = ((Widget)node).cs1Instructions[0][1];
                    Varps.Varps_main[n9] = 1 - Varps.Varps_main[n9];
                    RouteStrategy.changeGameOptions(n9);
                }
            }
            if (n3 == 26) {
                AbstractByteArrayCopier.method7584();
            }
            if (n3 == 16) {
                Client.field620 = n7;
                Client.field717 = n8;
                Client.field603 = 2;
                Client.field622 = 0;
                Client.field744 = n;
                Client.field745 = n2;
                node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3387, Client.packetWriter.isaacCipher);
                ((PacketBufferNode)node2).packetBuffer.writeShort(Interpreter.field866);
                ((PacketBufferNode)node2).packetBuffer.method10320(class143.field1637);
                ((PacketBufferNode)node2).packetBuffer.writeShort(n11 + n2);
                ((PacketBufferNode)node2).packetBuffer.method10333(class271.field3015);
                ((PacketBufferNode)node2).packetBuffer.writeShort(n + n10);
                ((PacketBufferNode)node2).packetBuffer.method10320(n4);
                ((PacketBufferNode)node2).packetBuffer.method10310(Client.field731.method5776(82) ? 1 : 0);
                Client.packetWriter.addNode((PacketBufferNode)node2);
            }
            if (n3 == 49 && (node2 = playerArray[n4]) != null) {
                Client.field620 = n7;
                Client.field717 = n8;
                Client.field603 = 2;
                Client.field622 = 0;
                Client.field744 = n;
                Client.field745 = n2;
                node = ScriptEvent.getPacketBufferNode(ClientPacket.field3353, Client.packetWriter.isaacCipher);
                ((PacketBufferNode)node).packetBuffer.method10310(Client.field731.method5776(82) ? 1 : 0);
                ((PacketBufferNode)node).packetBuffer.writeInt(n4);
                Client.packetWriter.addNode((PacketBufferNode)node);
            }
            if (n3 == 47 && (node2 = playerArray[n4]) != null) {
                Client.field620 = n7;
                Client.field717 = n8;
                Client.field603 = 2;
                Client.field622 = 0;
                Client.field744 = n;
                Client.field745 = n2;
                node = ScriptEvent.getPacketBufferNode(ClientPacket.field3332, Client.packetWriter.isaacCipher);
                ((PacketBufferNode)node).packetBuffer.method10320(n4);
                ((PacketBufferNode)node).packetBuffer.method10477(Client.field731.method5776(82) ? 1 : 0);
                Client.packetWriter.addNode((PacketBufferNode)node);
            }
            if (n3 == 51 && (node2 = playerArray[n4]) != null) {
                Client.field620 = n7;
                Client.field717 = n8;
                Client.field603 = 2;
                Client.field622 = 0;
                Client.field744 = n;
                Client.field745 = n2;
                node = ScriptEvent.getPacketBufferNode(ClientPacket.field3351, Client.packetWriter.isaacCipher);
                ((PacketBufferNode)node).packetBuffer.method10320(n4);
                ((PacketBufferNode)node).packetBuffer.method10477(Client.field731.method5776(82) ? 1 : 0);
                Client.packetWriter.addNode((PacketBufferNode)node);
            }
            if (n3 == 45 && (node2 = playerArray[n4]) != null) {
                Client.field620 = n7;
                Client.field717 = n8;
                Client.field603 = 2;
                Client.field622 = 0;
                Client.field744 = n;
                Client.field745 = n2;
                node = ScriptEvent.getPacketBufferNode(ClientPacket.field3348, Client.packetWriter.isaacCipher);
                ((PacketBufferNode)node).packetBuffer.method10320(n4);
                ((PacketBufferNode)node).packetBuffer.method10477(Client.field731.method5776(82) ? 1 : 0);
                Client.packetWriter.addNode((PacketBufferNode)node);
            }
            if (n3 == 20) {
                Client.field620 = n7;
                Client.field717 = n8;
                Client.field603 = 2;
                Client.field622 = 0;
                Client.field744 = n;
                Client.field745 = n2;
                node2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3321, Client.packetWriter.isaacCipher);
                ((PacketBufferNode)node2).packetBuffer.writeByte(Client.field731.method5776(82) ? 1 : 0);
                ((PacketBufferNode)node2).packetBuffer.writeShort(n + n10);
                ((PacketBufferNode)node2).packetBuffer.writeShort(n4);
                ((PacketBufferNode)node2).packetBuffer.writeInt(n11 + n2);
                Client.packetWriter.addNode((PacketBufferNode)node2);
            }
            if (Client.isItemSelected != 0) {
                Client.isItemSelected = 0;
                UserComparator8.invalidateWidget(ClanChannel.field1807.method7031(class271.field3015));
            }
            if (Client.isSpellSelected) {
                class278.method5969();
            }
            return;
        }
        node2 = ClanChannel.field1807.method7023(n2, n);
        if (node2 != null) {
            class278.method5969();
            AbstractWorldMapIcon.method6464(n2, n, class298.Widget_unpackTargetMask(class232.getWidgetFlags((Widget)node2)), n5);
            Client.isItemSelected = 0;
            Client.field661 = class47.Widget_getSpellActionName((Widget)node2);
            if (Client.field661 == null) {
                Client.field661 = "null";
            }
            Client.field662 = ((Widget)node2).isIf3 ? ((Widget)node2).dataText + class97.colorStartTag(0xFFFFFF) : class97.colorStartTag(65280) + ((Widget)node2).field4006 + class97.colorStartTag(0xFFFFFF);
        }
    }
}

