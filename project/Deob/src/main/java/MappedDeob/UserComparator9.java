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

@ObfuscatedName(value="ey")
@Implements(value="UserComparator9")
public class UserComparator9
extends AbstractUserComparator {
    @ObfuscatedName(value="qw")
    @ObfuscatedSignature(descriptor="Luf;")
    static class539 field1513;
    @ObfuscatedName(value="ay")
    @Export(value="reversed")
    final boolean reversed;

    public UserComparator9(boolean bl) {
        this.reversed = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lsu;Lsu;I)I", garbageValue="-1948928075")
    @Export(value="compareBuddy")
    int compareBuddy(Buddy buddy, Buddy buddy2) {
        if (Client.worldId == buddy.world && buddy2.world == Client.worldId) {
            return this.reversed ? buddy.getUsername().compareToTyped(buddy2.getUsername()) : buddy2.getUsername().compareToTyped(buddy.getUsername());
        }
        return this.compareUser(buddy, buddy2);
    }

    public int compare(Object object, Object object2) {
        return this.compareBuddy((Buddy)object, (Buddy)object2);
    }

    @ObfuscatedName(value="bq")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="1358990506")
    static int method3354(int n, Script script, boolean bl) {
        if (n != ScriptOpcodes.VIEWPORT_SETFOV) {
            if (n != ScriptOpcodes.VIEWPORT_SETZOOM) {
                if (n != ScriptOpcodes.VIEWPORT_CLAMPFOV) {
                    if (n != ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
                        if (n != ScriptOpcodes.VIEWPORT_GETZOOM) {
                            if (n != ScriptOpcodes.VIEWPORT_GETFOV) {
                                if (n != 6220) {
                                    if (n != 6221) {
                                        if (n != 6222) {
                                            if (n != 6223) {
                                                return 2;
                                            }
                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Huffman.canvasHeight;
                                            return 1;
                                        }
                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = BuddyRankComparator.canvasWidth;
                                        return 1;
                                    }
                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                    return 1;
                                }
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                return 1;
                            }
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class9.method85(Client.field609);
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class9.method85(Client.field656);
                            return 1;
                        }
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.zoomHeight;
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.zoomWidth;
                        return 1;
                    }
                    if (Client.viewportWidget == null) {
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                    } else {
                        class143.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height * -1528330031, false);
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.viewportWidth;
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.viewportHeight;
                    }
                    return 1;
                }
                Client.field772 = (short)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 4];
                if (Client.field772 <= 0) {
                    Client.field772 = 1;
                }
                if ((Client.field773 = (short)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]) <= 0) {
                    Client.field773 = Short.MAX_VALUE;
                } else if (Client.field773 < Client.field772) {
                    Client.field773 = Client.field772;
                }
                Client.field702 = (short)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
                if (Client.field702 <= 0) {
                    Client.field702 = 1;
                }
                if ((Client.field775 = (short)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3]) <= 0) {
                    Client.field775 = Short.MAX_VALUE;
                } else if (Client.field775 < Client.field702) {
                    Client.field775 = Client.field702;
                }
                return 1;
            }
            Client.zoomHeight = (short)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
            if (Client.zoomHeight <= 0) {
                Client.zoomHeight = (short)256;
            }
            if ((Client.zoomWidth = (short)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]) <= 0) {
                Client.zoomWidth = (short)320;
            }
            return 1;
        }
        Client.field609 = (short)class148.method3575(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2]);
        if (Client.field609 <= 0) {
            Client.field609 = (short)256;
        }
        if ((Client.field656 = (short)class148.method3575(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1])) <= 0) {
            Client.field656 = (short)256;
        }
        return 1;
    }
}

