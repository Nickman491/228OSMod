/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName(value="uf")
public class class539
extends class497
implements class311 {
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpq;")
    final AbstractArchive field5385;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lmf;")
    final DemotingHashTable field5383 = new DemotingHashTable(64);
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=646094095)
    final int field5384;

    @ObfuscatedSignature(descriptor="(Lol;ILph;Lpq;)V")
    public class539(StudioGame studioGame, int n, Language language, AbstractArchive abstractArchive) {
        super(studioGame, language, abstractArchive != null ? abstractArchive.getGroupFileCount(n) : 0);
        this.field5385 = abstractArchive;
        this.field5384 = n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IB)Lts;", garbageValue="-1")
    protected class499 vmethod10080(int n) {
        class498 class4982;
        DemotingHashTable demotingHashTable = this.field5383;
        synchronized (demotingHashTable) {
            class4982 = (class498)this.field5383.get(n);
            if (class4982 == null) {
                class4982 = this.method10081(n);
                this.field5383.method6549(class4982, n);
            }
        }
        return class4982;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(II)Lto;", garbageValue="280173339")
    class498 method10081(int n) {
        byte[] byArray = this.field5385.takeFile(this.field5384, n);
        class498 class4982 = new class498(n);
        if (byArray != null) {
            class4982.method9530(new Buffer(byArray));
        }
        return class4982;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1867919389")
    public void method10082() {
        DemotingHashTable demotingHashTable = this.field5383;
        synchronized (demotingHashTable) {
            this.field5383.clear();
        }
    }

    public Iterator iterator() {
        return new class538(this);
    }

    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-1346583378")
    static int method10085(int n, Script script, boolean bl) {
        if (n != ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
            int n2;
            if (n != ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
                if (n != ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
                    if (n != ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
                        if (n != ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
                            if (n != ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
                                if (n != ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
                                    if (n != ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
                                        if (n != ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
                                            if (n != ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
                                                if (n != ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
                                                    if (n != ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
                                                        if (n != ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
                                                            if (n != ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
                                                                if (n != ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
                                                                    if (n != ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
                                                                        if (n != ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
                                                                            if (n != ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
                                                                                if (n != ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
                                                                                    if (n != ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
                                                                                        int n3;
                                                                                        if (n == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
                                                                                            n3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 3];
                                                                                            boolean bl2 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1] == 1;
                                                                                            int n4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
                                                                                            MouseHandler.method678(n4, n3, bl2);
                                                                                        }
                                                                                        if (n != ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
                                                                                            if (n != ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
                                                                                                if (n != ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
                                                                                                    if (n != ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
                                                                                                        if (n != ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
                                                                                                            if (n != ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
                                                                                                                if (n != ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
                                                                                                                    if (n != ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
                                                                                                                        if (n != ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
                                                                                                                            if (n != ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
                                                                                                                                if (n != ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
                                                                                                                                    if (n != ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
                                                                                                                                        if (n != ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
                                                                                                                                            if (n != ScriptOpcodes.CLANPROFILE_FIND) {
                                                                                                                                                return 2;
                                                                                                                                            }
                                                                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.field803 != null ? 1 : 0;
                                                                                                                                            return 1;
                                                                                                                                        }
                                                                                                                                        Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1] = AbstractByteArrayCopier.field4045.getSortedMembers()[Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1]];
                                                                                                                                        return 1;
                                                                                                                                    }
                                                                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = AbstractByteArrayCopier.field4045.method3850(Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]);
                                                                                                                                    return 1;
                                                                                                                                }
                                                                                                                                n3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                                                WorldMapAreaData.method6494(class571.field5585, n3);
                                                                                                                                return 1;
                                                                                                                            }
                                                                                                                            n3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = ((ClanChannelMember)AbstractByteArrayCopier.field4045.members.get((int)n3)).world;
                                                                                                                            return 1;
                                                                                                                        }
                                                                                                                        n3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = ((ClanChannelMember)AbstractByteArrayCopier.field4045.members.get((int)n3)).rank;
                                                                                                                        return 1;
                                                                                                                    }
                                                                                                                    n3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ((ClanChannelMember)AbstractByteArrayCopier.field4045.members.get((int)n3)).username.getName();
                                                                                                                    return 1;
                                                                                                                }
                                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = AbstractByteArrayCopier.field4045.method3837();
                                                                                                                return 1;
                                                                                                            }
                                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = AbstractByteArrayCopier.field4045.field1812;
                                                                                                            return 1;
                                                                                                        }
                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = AbstractByteArrayCopier.field4045.field1813;
                                                                                                        return 1;
                                                                                                    }
                                                                                                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = AbstractByteArrayCopier.field4045.name;
                                                                                                    return 1;
                                                                                                }
                                                                                                if (Client.currentClanChannels[n3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]] == null) {
                                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                                } else {
                                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
                                                                                                    AbstractByteArrayCopier.field4045 = Client.currentClanChannels[n3];
                                                                                                    class571.field5585 = n3;
                                                                                                }
                                                                                                return 1;
                                                                                            }
                                                                                            if (class106.guestClanChannel == null) {
                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                                                                            } else {
                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
                                                                                                AbstractByteArrayCopier.field4045 = class106.guestClanChannel;
                                                                                            }
                                                                                            return 1;
                                                                                        }
                                                                                        n3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.field1749[n3] ? 1 : 0;
                                                                                        return 1;
                                                                                    }
                                                                                    int n5 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.field1751[n5];
                                                                                    return 1;
                                                                                }
                                                                                int n6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                                                                                int n7 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                                                                class506.method9591(n7, n6);
                                                                                return 1;
                                                                            }
                                                                            Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.getSortedMembers()[Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1]];
                                                                            return 1;
                                                                        }
                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.method3712(Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]);
                                                                        return 1;
                                                                    }
                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.field1760;
                                                                    return 1;
                                                                }
                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.currentOwner;
                                                                return 1;
                                                            }
                                                            int n8 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 3];
                                                            int n9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                                            int n10 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.method3711(n8, n9, n10);
                                                            return 1;
                                                        }
                                                        int n11 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = WorldMapLabelSize.field3082.bannedMemberNames[n11];
                                                        return 1;
                                                    }
                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.bannedMemberCount;
                                                    return 1;
                                                }
                                                int n12 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.memberRanks[n12];
                                                return 1;
                                            }
                                            int n13 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = WorldMapLabelSize.field3082.memberNames[n13];
                                            return 1;
                                        }
                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.memberCount;
                                        return 1;
                                    }
                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.field1745;
                                    return 1;
                                }
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.field1744;
                                return 1;
                            }
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.field1753;
                            return 1;
                        }
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.field1742;
                        return 1;
                    }
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.allowGuests ? 1 : 0;
                    return 1;
                }
                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = WorldMapLabelSize.field3082.name;
                return 1;
            }
            if (Client.currentClanSettings[n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]] == null) {
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
            } else {
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
                WorldMapLabelSize.field3082 = Client.currentClanSettings[n2];
            }
            return 1;
        }
        if (InvDefinition.guestClanSettings == null) {
            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
        } else {
            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
            WorldMapLabelSize.field3082 = InvDefinition.guestClanSettings;
        }
        return 1;
    }
}

