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

@ObfuscatedName(value="ot")
public class class379 {
    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="(ILdm;ZB)I", garbageValue="8")
    static int method7638(int n, Script script, boolean bl) {
        if (n != ScriptOpcodes.FRIEND_COUNT) {
            if (n != ScriptOpcodes.FRIEND_GETNAME) {
                if (n != ScriptOpcodes.FRIEND_GETWORLD) {
                    if (n != ScriptOpcodes.FRIEND_GETRANK) {
                        if (n != ScriptOpcodes.FRIEND_SETRANK) {
                            if (n != ScriptOpcodes.FRIEND_ADD) {
                                if (n != ScriptOpcodes.FRIEND_DEL) {
                                    if (n != ScriptOpcodes.IGNORE_ADD) {
                                        if (n != ScriptOpcodes.IGNORE_DEL) {
                                            if (n != ScriptOpcodes.FRIEND_TEST) {
                                                if (n != ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
                                                    if (n != ScriptOpcodes.CLAN_GETCHATCOUNT) {
                                                        if (n != ScriptOpcodes.CLAN_GETCHATUSERNAME) {
                                                            if (n != ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
                                                                if (n != ScriptOpcodes.CLAN_GETCHATUSERRANK) {
                                                                    if (n != ScriptOpcodes.CLAN_GETCHATMINKICK) {
                                                                        if (n != ScriptOpcodes.CLAN_KICKUSER) {
                                                                            if (n != ScriptOpcodes.CLAN_GETCHATRANK) {
                                                                                if (n != ScriptOpcodes.CLAN_JOINCHAT) {
                                                                                    if (n != ScriptOpcodes.CLAN_LEAVECHAT) {
                                                                                        if (n != ScriptOpcodes.IGNORE_COUNT) {
                                                                                            if (n != ScriptOpcodes.IGNORE_GETNAME) {
                                                                                                if (n != ScriptOpcodes.IGNORE_TEST) {
                                                                                                    if (n != ScriptOpcodes.CLAN_ISSELF) {
                                                                                                        if (n != ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
                                                                                                            if (n != ScriptOpcodes.CLAN_ISFRIEND) {
                                                                                                                if (n != ScriptOpcodes.CLAN_ISIGNORE) {
                                                                                                                    if (n != 3628) {
                                                                                                                        if (n != 3629) {
                                                                                                                            if (n != 3630) {
                                                                                                                                if (n != 3631) {
                                                                                                                                    if (n != 3632) {
                                                                                                                                        if (n != 3633) {
                                                                                                                                            if (n != 3634) {
                                                                                                                                                if (n != 3635) {
                                                                                                                                                    if (n != 3636) {
                                                                                                                                                        if (n != 3637) {
                                                                                                                                                            if (n != 3638) {
                                                                                                                                                                if (n != 3639) {
                                                                                                                                                                    if (n != 3640) {
                                                                                                                                                                        if (n != 3641) {
                                                                                                                                                                            if (n != 3642) {
                                                                                                                                                                                if (n != 3643) {
                                                                                                                                                                                    if (n != 3644) {
                                                                                                                                                                                        boolean bl2;
                                                                                                                                                                                        if (n != 3645) {
                                                                                                                                                                                            boolean bl3;
                                                                                                                                                                                            if (n != 3646) {
                                                                                                                                                                                                boolean bl4;
                                                                                                                                                                                                if (n != 3647) {
                                                                                                                                                                                                    boolean bl5;
                                                                                                                                                                                                    if (n != 3648) {
                                                                                                                                                                                                        boolean bl6;
                                                                                                                                                                                                        if (n != 3649) {
                                                                                                                                                                                                            boolean bl7;
                                                                                                                                                                                                            if (n != 3650) {
                                                                                                                                                                                                                boolean bl8;
                                                                                                                                                                                                                if (n != 3651) {
                                                                                                                                                                                                                    boolean bl9;
                                                                                                                                                                                                                    if (n != 3652) {
                                                                                                                                                                                                                        boolean bl10;
                                                                                                                                                                                                                        if (n != 3653) {
                                                                                                                                                                                                                            boolean bl11;
                                                                                                                                                                                                                            if (n != 3654) {
                                                                                                                                                                                                                                if (n != 3655) {
                                                                                                                                                                                                                                    if (n != 3656) {
                                                                                                                                                                                                                                        boolean bl12;
                                                                                                                                                                                                                                        if (n != 3657) {
                                                                                                                                                                                                                                            return 2;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        boolean bl13 = bl12 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                                                                                                        if (WorldMapLabelSize.friendsChat != null) {
                                                                                                                                                                                                                                            WorldMapLabelSize.friendsChat.addComparator(new BuddyRankComparator(bl12));
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    boolean bl14 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                                                                                                    class10.friendSystem.friendsList.addComparator(new BuddyRankComparator(bl14));
                                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (WorldMapLabelSize.friendsChat != null) {
                                                                                                                                                                                                                                    WorldMapLabelSize.friendsChat.sort();
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            boolean bl15 = bl11 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                                                                                            if (WorldMapLabelSize.friendsChat != null) {
                                                                                                                                                                                                                                WorldMapLabelSize.friendsChat.addComparator(new UserComparator10(bl11));
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        boolean bl16 = bl10 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                                                                                        if (WorldMapLabelSize.friendsChat != null) {
                                                                                                                                                                                                                            WorldMapLabelSize.friendsChat.addComparator(new UserComparator9(bl10));
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    boolean bl17 = bl9 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                                                                                    if (WorldMapLabelSize.friendsChat != null) {
                                                                                                                                                                                                                        WorldMapLabelSize.friendsChat.addComparator(new UserComparator8(bl9));
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                boolean bl18 = bl8 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                                                                                if (WorldMapLabelSize.friendsChat != null) {
                                                                                                                                                                                                                    WorldMapLabelSize.friendsChat.addComparator(new UserComparator7(bl8));
                                                                                                                                                                                                                }
                                                                                                                                                                                                                return 1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            boolean bl19 = bl7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                                                                            if (WorldMapLabelSize.friendsChat != null) {
                                                                                                                                                                                                                WorldMapLabelSize.friendsChat.addComparator(new UserComparator6(bl7));
                                                                                                                                                                                                            }
                                                                                                                                                                                                            return 1;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        boolean bl20 = bl6 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                                                                        if (WorldMapLabelSize.friendsChat != null) {
                                                                                                                                                                                                            WorldMapLabelSize.friendsChat.addComparator(new UserComparator5(bl6));
                                                                                                                                                                                                        }
                                                                                                                                                                                                        return 1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    boolean bl21 = bl5 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                                                                    if (WorldMapLabelSize.friendsChat != null) {
                                                                                                                                                                                                        WorldMapLabelSize.friendsChat.addComparator(new UserComparator4(bl5));
                                                                                                                                                                                                    }
                                                                                                                                                                                                    return 1;
                                                                                                                                                                                                }
                                                                                                                                                                                                boolean bl22 = bl4 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                                                                if (WorldMapLabelSize.friendsChat != null) {
                                                                                                                                                                                                    WorldMapLabelSize.friendsChat.addComparator(new UserComparator3(bl4));
                                                                                                                                                                                                }
                                                                                                                                                                                                return 1;
                                                                                                                                                                                            }
                                                                                                                                                                                            boolean bl23 = bl3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                                                            if (WorldMapLabelSize.friendsChat != null) {
                                                                                                                                                                                                WorldMapLabelSize.friendsChat.addComparator(new UserComparator2(bl3));
                                                                                                                                                                                            }
                                                                                                                                                                                            return 1;
                                                                                                                                                                                        }
                                                                                                                                                                                        boolean bl24 = bl2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                                                        if (WorldMapLabelSize.friendsChat != null) {
                                                                                                                                                                                            WorldMapLabelSize.friendsChat.addComparator(new UserComparator1(bl2));
                                                                                                                                                                                        }
                                                                                                                                                                                        return 1;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (WorldMapLabelSize.friendsChat != null) {
                                                                                                                                                                                        WorldMapLabelSize.friendsChat.removeComparator();
                                                                                                                                                                                    }
                                                                                                                                                                                    return 1;
                                                                                                                                                                                }
                                                                                                                                                                                class10.friendSystem.ignoreList.sort();
                                                                                                                                                                                return 1;
                                                                                                                                                                            }
                                                                                                                                                                            boolean bl25 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                                            class10.friendSystem.ignoreList.addComparator(new UserComparator2(bl25));
                                                                                                                                                                            return 1;
                                                                                                                                                                        }
                                                                                                                                                                        boolean bl26 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                                        class10.friendSystem.ignoreList.addComparator(new UserComparator1(bl26));
                                                                                                                                                                        return 1;
                                                                                                                                                                    }
                                                                                                                                                                    class10.friendSystem.ignoreList.removeComparator();
                                                                                                                                                                    return 1;
                                                                                                                                                                }
                                                                                                                                                                class10.friendSystem.friendsList.sort();
                                                                                                                                                                return 1;
                                                                                                                                                            }
                                                                                                                                                            boolean bl27 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                            class10.friendSystem.friendsList.addComparator(new UserComparator10(bl27));
                                                                                                                                                            return 1;
                                                                                                                                                        }
                                                                                                                                                        boolean bl28 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                        class10.friendSystem.friendsList.addComparator(new UserComparator9(bl28));
                                                                                                                                                        return 1;
                                                                                                                                                    }
                                                                                                                                                    boolean bl29 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                    class10.friendSystem.friendsList.addComparator(new UserComparator8(bl29));
                                                                                                                                                    return 1;
                                                                                                                                                }
                                                                                                                                                boolean bl30 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                                class10.friendSystem.friendsList.addComparator(new UserComparator7(bl30));
                                                                                                                                                return 1;
                                                                                                                                            }
                                                                                                                                            boolean bl31 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                            class10.friendSystem.friendsList.addComparator(new UserComparator6(bl31));
                                                                                                                                            return 1;
                                                                                                                                        }
                                                                                                                                        boolean bl32 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                        class10.friendSystem.friendsList.addComparator(new UserComparator5(bl32));
                                                                                                                                        return 1;
                                                                                                                                    }
                                                                                                                                    boolean bl33 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                    class10.friendSystem.friendsList.addComparator(new UserComparator4(bl33));
                                                                                                                                    return 1;
                                                                                                                                }
                                                                                                                                boolean bl34 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                                class10.friendSystem.friendsList.addComparator(new UserComparator3(bl34));
                                                                                                                                return 1;
                                                                                                                            }
                                                                                                                            boolean bl35 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                            class10.friendSystem.friendsList.addComparator(new UserComparator2(bl35));
                                                                                                                            return 1;
                                                                                                                        }
                                                                                                                        boolean bl36 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                                                                                                        class10.friendSystem.friendsList.addComparator(new UserComparator1(bl36));
                                                                                                                        return 1;
                                                                                                                    }
                                                                                                                    class10.friendSystem.friendsList.removeComparator();
                                                                                                                    return 1;
                                                                                                                }
                                                                                                                int n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.friendsChat != null && n2 < WorldMapLabelSize.friendsChat.getSize() && ((ClanMate)WorldMapLabelSize.friendsChat.get(n2)).isIgnored() ? 1 : 0;
                                                                                                                return 1;
                                                                                                            }
                                                                                                            int n3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.friendsChat != null && n3 < WorldMapLabelSize.friendsChat.getSize() && ((ClanMate)WorldMapLabelSize.friendsChat.get(n3)).isFriend() ? 1 : 0;
                                                                                                            return 1;
                                                                                                        }
                                                                                                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = WorldMapLabelSize.friendsChat != null && WorldMapLabelSize.friendsChat.owner != null ? WorldMapLabelSize.friendsChat.owner : "";
                                                                                                        return 1;
                                                                                                    }
                                                                                                    int n4 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.friendsChat != null && n4 < WorldMapLabelSize.friendsChat.getSize() && WorldMapLabelSize.friendsChat.get(n4).getUsername().equals(ModeWhere.localPlayer.username) ? 1 : 0;
                                                                                                    return 1;
                                                                                                }
                                                                                                String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                                                                                string = Canvas.method48(string);
                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class10.friendSystem.isIgnored(new Username(string, class383.loginType)) ? 1 : 0;
                                                                                                return 1;
                                                                                            }
                                                                                            int n5 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                            if (class10.friendSystem.method2019() && n5 >= 0 && n5 < class10.friendSystem.ignoreList.getSize()) {
                                                                                                Ignored ignored = (Ignored)class10.friendSystem.ignoreList.get(n5);
                                                                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ignored.getName();
                                                                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ignored.getPreviousName();
                                                                                            } else {
                                                                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                                                                            }
                                                                                            return 1;
                                                                                        }
                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = !class10.friendSystem.method2019() ? -1 : class10.friendSystem.ignoreList.getSize();
                                                                                        return 1;
                                                                                    }
                                                                                    UserComparator4.Clan_leaveChat();
                                                                                    return 1;
                                                                                }
                                                                                String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                                                                class75.Clan_joinChat(string);
                                                                                return 1;
                                                                            }
                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.friendsChat != null ? WorldMapLabelSize.friendsChat.rank : 0;
                                                                            return 1;
                                                                        }
                                                                        String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                                                        Skills.clanKickUser(string);
                                                                        return 1;
                                                                    }
                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.friendsChat != null ? WorldMapLabelSize.friendsChat.minKick : (byte)0;
                                                                    return 1;
                                                                }
                                                                int n6 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.friendsChat != null && n6 < WorldMapLabelSize.friendsChat.getSize() ? ((Buddy)WorldMapLabelSize.friendsChat.get((int)n6)).rank : 0;
                                                                return 1;
                                                            }
                                                            int n7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.friendsChat != null && n7 < WorldMapLabelSize.friendsChat.getSize() ? ((Buddy)WorldMapLabelSize.friendsChat.get(n7)).getWorld() : 0;
                                                            return 1;
                                                        }
                                                        int n8 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = WorldMapLabelSize.friendsChat != null && n8 < WorldMapLabelSize.friendsChat.getSize() ? WorldMapLabelSize.friendsChat.get(n8).getUsername().getName() : "";
                                                        return 1;
                                                    }
                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.friendsChat == null ? 0 : WorldMapLabelSize.friendsChat.getSize();
                                                    return 1;
                                                }
                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = WorldMapLabelSize.friendsChat == null ? "" : WorldMapLabelSize.friendsChat.name;
                                                return 1;
                                            }
                                            String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                            string = Canvas.method48(string);
                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class10.friendSystem.isFriended(new Username(string, class383.loginType), false) ? 1 : 0;
                                            return 1;
                                        }
                                        String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                        boolean bl37 = true;
                                        class10.friendSystem.method2031(string, bl37);
                                        return 1;
                                    }
                                    String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                    class10.friendSystem.addIgnore(string);
                                    return 1;
                                }
                                String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                class10.friendSystem.removeFriend(string);
                                return 1;
                            }
                            String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                            class10.friendSystem.addFriend(string);
                            return 1;
                        }
                        String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                        int n9 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                        InvDefinition.method5121(string, n9);
                        return 1;
                    }
                    int n10 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class10.friendSystem.method2019() && n10 >= 0 && n10 < class10.friendSystem.friendsList.getSize() ? ((Buddy)class10.friendSystem.friendsList.get((int)n10)).rank : 0;
                    return 1;
                }
                int n11 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class10.friendSystem.method2019() && n11 >= 0 && n11 < class10.friendSystem.friendsList.getSize() ? ((Buddy)class10.friendSystem.friendsList.get((int)n11)).world : 0;
                return 1;
            }
            int n12 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
            if (class10.friendSystem.method2019() && n12 >= 0 && n12 < class10.friendSystem.friendsList.getSize()) {
                Friend friend = (Friend)class10.friendSystem.friendsList.get(n12);
                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = friend.getName();
                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = friend.getPreviousName();
            } else {
                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
            }
            return 1;
        }
        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class10.friendSystem.field827 == 0 ? -2 : (class10.friendSystem.field827 == 1 ? -1 : class10.friendSystem.friendsList.getSize());
        return 1;
    }
}

