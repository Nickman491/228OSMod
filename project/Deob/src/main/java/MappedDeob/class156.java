/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName(value="gg")
public class class156
extends class166 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1538274283)
    int field1712 = -1;
    @ObfuscatedName(value="ah")
    byte field1710;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1511951237)
    int field1711;
    @ObfuscatedName(value="ao")
    String field1713;
    @ObfuscatedSignature(descriptor="Lgv;")
    final /* synthetic */ class167 this$0;

    @ObfuscatedSignature(descriptor="(Lgv;)V")
    class156(class167 class1672) {
        this.this$0 = class1672;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="1969161379")
    void vmethod3869(Buffer buffer) {
        this.field1712 = buffer.readUnsignedShort();
        this.field1710 = buffer.readByte();
        this.field1711 = buffer.readUnsignedShort();
        buffer.readLong();
        this.field1713 = buffer.readStringCp1252NullTerminated();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgk;I)V", garbageValue="-1263140647")
    void vmethod3870(ClanChannel clanChannel) {
        ClanChannelMember clanChannelMember = (ClanChannelMember)clanChannel.members.get(this.field1712);
        clanChannelMember.rank = this.field1710;
        clanChannelMember.world = this.field1711;
        clanChannelMember.username = new Username(this.field1713);
    }

    @ObfuscatedName(value="bl")
    @ObfuscatedSignature(descriptor="(ILdm;ZB)I", garbageValue="61")
    static int method3638(int n, Script script, boolean bl) {
        int n2;
        class548 class5482;
        block38: {
            block39: {
                int n3;
                int n4;
                block41: {
                    Object[] objectArray;
                    int n5;
                    int[] nArray;
                    DbTableType dbTableType;
                    DbRowType dbRowType;
                    int n6;
                    int n7;
                    block40: {
                        if (n == ScriptOpcodes.DB_FIND_WITH_COUNT) break block38;
                        if (n == ScriptOpcodes.DB_FINDNEXT) break block39;
                        if (n != ScriptOpcodes.DB_GETFIELD) {
                            if (n != ScriptOpcodes.DB_GETFIELDCOUNT) {
                                int n8;
                                class548 class5483;
                                if (n != ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
                                    if (n != ScriptOpcodes.DB_GETROWTABLE) {
                                        if (n != ScriptOpcodes.DB_GETROW) {
                                            if (n != ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
                                                return 2;
                                            }
                                            int n9 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                            Object object = class4.method17(n9);
                                            int n10 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                            class548 class5484 = SoundCache.method892(n10);
                                            if (class5484 != null) {
                                                if (class244.method5288(n10) == Client.field790) {
                                                    if (class230.field2489 == null && class230.field2489.isEmpty()) {
                                                        throw new RuntimeException();
                                                    }
                                                    int n11 = class208.method4819(n10);
                                                    List list = class5484.method10168(object, n11);
                                                    class230.field2489 = new LinkedList(class230.field2489);
                                                    if (list == null) {
                                                        class230.field2489.clear();
                                                    } else {
                                                        class230.field2489.retainAll(list);
                                                    }
                                                    class261.field2784 = class230.field2489.iterator();
                                                    if (n == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class230.field2489.size();
                                                    }
                                                    return 1;
                                                }
                                                throw new RuntimeException();
                                            }
                                            throw new RuntimeException();
                                        }
                                        int n12 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                        int n13 = -1;
                                        if (class230.field2489 != null && n12 >= 0 && n12 < class230.field2489.size()) {
                                            n13 = (Integer)class230.field2489.get(n12);
                                        }
                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = n13;
                                        return 1;
                                    }
                                    int n14 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                    DbRowType dbRowType2 = class28.method463(n14);
                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = dbRowType2.tableId;
                                    return 1;
                                }
                                if ((class5483 = class454.method8935(n8 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize])) != null) {
                                    class230.field2489 = class5483.method10168(0, 0);
                                    int n15 = 0;
                                    if (class230.field2489 != null) {
                                        Client.field790 = n8;
                                        class261.field2784 = class230.field2489.iterator();
                                        n15 = class230.field2489.size();
                                    }
                                    if (n == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = n15;
                                    }
                                    return 1;
                                }
                                throw new RuntimeException();
                            }
                            int n16 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                            int n17 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                            int n18 = 0;
                            int n19 = class244.method5288(n17);
                            int n20 = class384.method7653(n17);
                            DbRowType dbRowType3 = class28.method463(n16);
                            DbTableType dbTableType2 = ArchiveDiskActionHandler.method7671(n19);
                            int[] nArray2 = dbTableType2.types[n20];
                            Object[] objectArray2 = dbRowType3.getColumnType(n20);
                            if (objectArray2 == null && dbTableType2.defaultValues != null) {
                                objectArray2 = dbTableType2.defaultValues[n20];
                            }
                            if (objectArray2 != null) {
                                n18 = objectArray2.length / nArray2.length;
                            }
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = n18;
                            return 1;
                        }
                        int n21 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 3];
                        int n22 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                        n7 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
                        int n23 = class244.method5288(n22);
                        n6 = class384.method7653(n22);
                        n4 = class208.method4819(n22);
                        dbRowType = class28.method463(n21);
                        dbTableType = ArchiveDiskActionHandler.method7671(n23);
                        nArray = dbTableType.types[n6];
                        n5 = 0;
                        n3 = nArray.length;
                        if (n4 < 0) break block40;
                        if (n4 >= n3) break block41;
                        n5 = n4;
                        n3 = n4 + 1;
                    }
                    if ((objectArray = dbRowType.getColumnType(n6)) == null && dbTableType.defaultValues != null) {
                        objectArray = dbTableType.defaultValues[n6];
                    }
                    if (objectArray != null) {
                        int n24 = objectArray.length / nArray.length;
                        if (n7 >= 0 && n7 < n24) {
                            int n25 = n5;
                            while (true) {
                                if (n25 >= n3) {
                                    return 1;
                                }
                                int n26 = n25 + nArray.length * n7;
                                class544 class5442 = EnumComposition.method5280(nArray[n25]);
                                if (class5442 == class544.field5393) {
                                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = (String)objectArray[n26];
                                } else {
                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (Integer)objectArray[n26];
                                }
                                ++n25;
                            }
                        }
                        throw new RuntimeException();
                    }
                    int n27 = n5;
                    while (true) {
                        if (n27 >= n3) {
                            return 1;
                        }
                        int n28 = nArray[n27];
                        class544 class5443 = EnumComposition.method5280(n28);
                        if (class5443 == class544.field5393) {
                            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                        } else {
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class485.method9377(n28);
                        }
                        ++n27;
                    }
                }
                throw new RuntimeException("Tuple index out-of-bounds. Requested: " + n4 + ", Max: " + n3);
            }
            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class261.field2784 != null && class261.field2784.hasNext() ? (Integer)class261.field2784.next() : -1;
            return 1;
        }
        int n29 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
        Object object = class4.method17(n29);
        if ((class5482 = SoundCache.method892(n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize])) != null) {
            int n30 = class208.method4819(n2);
            class230.field2489 = class5482.method10168(object, n30);
            if (class230.field2489 == null) {
                Client.field790 = -1;
                class261.field2784 = null;
                if (n == ScriptOpcodes.DB_FIND_WITH_COUNT) {
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                }
            } else {
                Client.field790 = class244.method5288(n2);
                class261.field2784 = class230.field2489.iterator();
                if (n == ScriptOpcodes.DB_FIND_WITH_COUNT) {
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class230.field2489.size();
                }
            }
            return 1;
        }
        throw new RuntimeException();
    }
}

