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

@ObfuscatedName(value="gn")
public class class157
extends class150 {
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-1210171667)
    @Export(value="ItemDefinition_fileCount")
    public static int ItemDefinition_fileCount;
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Lvi;")
    static IndexedSprite field1724;
    @ObfuscatedName(value="fq")
    @ObfuscatedSignature(descriptor="Lok;")
    static Archive field1718;
    @ObfuscatedName(value="ay")
    boolean field1722;
    @ObfuscatedName(value="ah")
    byte field1716;
    @ObfuscatedName(value="az")
    byte field1717;
    @ObfuscatedName(value="ao")
    byte field1723;
    @ObfuscatedName(value="ad")
    byte field1720;
    @ObfuscatedSignature(descriptor="Lfv;")
    final /* synthetic */ class153 this$0;

    @ObfuscatedSignature(descriptor="(Lfv;)V")
    class157(class153 class1532) {
        this.this$0 = class1532;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1355269794")
    void vmethod3879(Buffer buffer) {
        this.field1722 = buffer.readUnsignedByte() == 1;
        this.field1716 = buffer.readByte();
        this.field1717 = buffer.readByte();
        this.field1723 = buffer.readByte();
        this.field1720 = buffer.readByte();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgq;B)V", garbageValue="0")
    void vmethod3882(ClanSettings clanSettings) {
        clanSettings.allowGuests = this.field1722;
        clanSettings.field1742 = this.field1716;
        clanSettings.field1753 = this.field1717;
        clanSettings.field1744 = this.field1723;
        clanSettings.field1745 = this.field1720;
    }

    @ObfuscatedName(value="by")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-141301278")
    static int method3656(int n, Script script, boolean bl) {
        if (n != ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
            if (n != ScriptOpcodes.CHAT_SETFILTER) {
                if (n != ScriptOpcodes.CHAT_SENDABUSEREPORT) {
                    int n2;
                    Message message;
                    if (n != ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
                        int n3;
                        Message message2;
                        if (n != ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
                            if (n != ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
                                if (n != ScriptOpcodes.CHAT_SENDPUBLIC) {
                                    if (n != ScriptOpcodes.CHAT_SENDPRIVATE) {
                                        if (n != ScriptOpcodes.CHAT_SENDCLAN) {
                                            if (n != ScriptOpcodes.CHAT_PLAYERNAME) {
                                                if (n != ScriptOpcodes.CHAT_GETFILTER_TRADE) {
                                                    if (n != ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
                                                        if (n != ScriptOpcodes.CHAT_GETNEXTUID) {
                                                            if (n != ScriptOpcodes.CHAT_GETPREVUID) {
                                                                if (n != ScriptOpcodes.DOCHEAT) {
                                                                    if (n != ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
                                                                        if (n != ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
                                                                            if (n != ScriptOpcodes.WRITECONSOLE) {
                                                                                int n4;
                                                                                Message message3;
                                                                                if (n != ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
                                                                                    if (n != ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
                                                                                        return 2;
                                                                                    }
                                                                                    int n5 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                    Message message4 = class328.Messages_getMessage(n5);
                                                                                    if (message4 == null) {
                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                    } else {
                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = message4.type;
                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = message4.cycle;
                                                                                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = message4.sender != null ? message4.sender : "";
                                                                                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = message4.prefix != null ? message4.prefix : "";
                                                                                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = message4.text != null ? message4.text : "";
                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = message4.isFromFriend() ? 1 : (message4.isFromIgnored() ? 2 : 0);
                                                                                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                    }
                                                                                    return 1;
                                                                                }
                                                                                int n6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                                                                                if ((message3 = class47.Messages_getByChannelAndID(n6, n4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1])) == null) {
                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                } else {
                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = message3.count;
                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = message3.cycle;
                                                                                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = message3.sender != null ? message3.sender : "";
                                                                                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = message3.prefix != null ? message3.prefix : "";
                                                                                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = message3.text != null ? message3.text : "";
                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = message3.isFromFriend() ? 1 : (message3.isFromIgnored() ? 2 : 0);
                                                                                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                }
                                                                                return 1;
                                                                            }
                                                                            String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                                                            System.out.println(string);
                                                                            return 1;
                                                                        }
                                                                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = Client.field516;
                                                                        return 1;
                                                                    }
                                                                    Client.field516 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize].toLowerCase().trim();
                                                                    return 1;
                                                                }
                                                                String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                                                Script.doCheat(string);
                                                                return 1;
                                                            }
                                                            int n7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = MilliClock.method4964(n7);
                                                            return 1;
                                                        }
                                                        int n8 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class330.Messages_getLastChatID(n8);
                                                        return 1;
                                                    }
                                                    int n9 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.Messages_getHistorySize(n9);
                                                    return 1;
                                                }
                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.tradeChatMode;
                                                return 1;
                                            }
                                            String string = ModeWhere.localPlayer != null && ModeWhere.localPlayer.username != null ? ModeWhere.localPlayer.username.getName() : "";
                                            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = string;
                                            return 1;
                                        }
                                        String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                        int n10 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                                        int n11 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                        PacketBufferNode packetBufferNode = class521.method9694(n10, string, ScriptFrame.clientLanguage, n11);
                                        Client.packetWriter.addNode(packetBufferNode);
                                        return 1;
                                    }
                                    String string = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize -= 2];
                                    String string2 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1];
                                    PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3366, Client.packetWriter.isaacCipher);
                                    packetBufferNode.packetBuffer.writeShort(0);
                                    int n12 = packetBufferNode.packetBuffer.offset;
                                    packetBufferNode.packetBuffer.writeStringCp1252NullTerminated(string);
                                    class344.method6942(packetBufferNode.packetBuffer, string2);
                                    packetBufferNode.packetBuffer.writeLengthShort(packetBufferNode.packetBuffer.offset - n12);
                                    Client.packetWriter.addNode(packetBufferNode);
                                    return 1;
                                }
                                String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                int n13 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                PacketBufferNode packetBufferNode = class521.method9694(n13, string, ScriptFrame.clientLanguage, -1);
                                Client.packetWriter.addNode(packetBufferNode);
                                return 1;
                            }
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.privateChatMode == null ? -1 : WorldMapLabelSize.privateChatMode.field5629;
                            return 1;
                        }
                        if ((message2 = class328.Messages_getMessage(n3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize])) == null) {
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                        } else {
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = message2.type;
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = message2.cycle;
                            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = message2.sender != null ? message2.sender : "";
                            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = message2.prefix != null ? message2.prefix : "";
                            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = message2.text != null ? message2.text : "";
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = message2.isFromFriend() ? 1 : (message2.isFromIgnored() ? 2 : 0);
                        }
                        return 1;
                    }
                    int n14 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                    if ((message = class47.Messages_getByChannelAndID(n14, n2 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1])) == null) {
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                    } else {
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = message.count;
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = message.cycle;
                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = message.sender != null ? message.sender : "";
                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = message.prefix != null ? message.prefix : "";
                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = message.text != null ? message.text : "";
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = message.isFromFriend() ? 1 : (message.isFromIgnored() ? 2 : 0);
                    }
                    return 1;
                }
                String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                int n15 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                int n16 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3386, Client.packetWriter.isaacCipher);
                packetBufferNode.packetBuffer.writeByte(MouseRecorder.stringCp1252NullTerminatedByteSize(string) + 2);
                packetBufferNode.packetBuffer.writeStringCp1252NullTerminated(string);
                packetBufferNode.packetBuffer.writeByte(n15 - 1);
                packetBufferNode.packetBuffer.writeByte(n16);
                Client.packetWriter.addNode(packetBufferNode);
                return 1;
            }
            Client.publicChatMode = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 3];
            WorldMapLabelSize.privateChatMode = class463.method9025(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
            if (WorldMapLabelSize.privateChatMode == null) {
                WorldMapLabelSize.privateChatMode = PrivateChatMode.field5630;
            }
            Client.tradeChatMode = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
            PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3400, Client.packetWriter.isaacCipher);
            packetBufferNode.packetBuffer.writeByte(Client.publicChatMode);
            packetBufferNode.packetBuffer.writeByte(WorldMapLabelSize.privateChatMode.field5629);
            packetBufferNode.packetBuffer.writeByte(Client.tradeChatMode);
            Client.packetWriter.addNode(packetBufferNode);
            return 1;
        }
        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.publicChatMode;
        return 1;
    }

    @ObfuscatedName(value="of")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="-1387703008")
    static void method3657(Buffer buffer, int n) {
        Skeleton.VorbisSample_setData(buffer.array, n);
        if (JagexCache.JagexCache_randomDat != null) {
            try {
                JagexCache.JagexCache_randomDat.seek(0L);
                JagexCache.JagexCache_randomDat.write(buffer.array, n, 24);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }
}

