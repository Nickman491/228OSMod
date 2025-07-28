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

@ObfuscatedName(value="bk")
@Implements(value="SoundSystem")
public class SoundSystem
implements Runnable {
    @ObfuscatedName(value="kb")
    @ObfuscatedSignature(descriptor="[Lvf;")
    static SpritePixels[] field288;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="[Lbq;")
    @Export(value="players")
    volatile PcmPlayer[] players = new PcmPlayer[2];

    SoundSystem() {
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 2; ++i) {
                PcmPlayer pcmPlayer = this.players[i];
                if (pcmPlayer == null) continue;
                pcmPlayer.run();
            }
        }
        catch (Exception exception) {
            class255.RunException_sendStackTrace(null, exception);
        }
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="250513281")
    static int method869(int n, Script script, boolean bl) {
        if (n != ScriptOpcodes.CLIENTCLOCK) {
            if (n != ScriptOpcodes.INV_GETOBJ) {
                if (n != ScriptOpcodes.INV_GETNUM) {
                    if (n != ScriptOpcodes.INV_TOTAL) {
                        if (n != ScriptOpcodes.INV_SIZE) {
                            if (n != ScriptOpcodes.STAT) {
                                if (n != ScriptOpcodes.STAT_BASE) {
                                    if (n != ScriptOpcodes.STAT_XP) {
                                        if (n != ScriptOpcodes.COORD) {
                                            if (n != ScriptOpcodes.COORDX) {
                                                if (n != ScriptOpcodes.COORDZ) {
                                                    if (n != ScriptOpcodes.COORDY) {
                                                        if (n != ScriptOpcodes.MAP_MEMBERS) {
                                                            if (n != ScriptOpcodes.INVOTHER_GETOBJ) {
                                                                if (n != ScriptOpcodes.INVOTHER_GETNUM) {
                                                                    if (n != ScriptOpcodes.INVOTHER_TOTAL) {
                                                                        if (n != ScriptOpcodes.STAFFMODLEVEL) {
                                                                            if (n != ScriptOpcodes.REBOOTTIMER) {
                                                                                if (n != ScriptOpcodes.MAP_WORLD) {
                                                                                    if (n != ScriptOpcodes.RUNENERGY_VISIBLE) {
                                                                                        if (n != ScriptOpcodes.RUNWEIGHT_VISIBLE) {
                                                                                            if (n != ScriptOpcodes.PLAYERMOD) {
                                                                                                if (n != ScriptOpcodes.WORLDFLAGS) {
                                                                                                    if (n != ScriptOpcodes.MOVECOORD) {
                                                                                                        if (n != 3326) {
                                                                                                            if (n != 3327) {
                                                                                                                if (n != 3331) {
                                                                                                                    if (n != 3332) {
                                                                                                                        if (n != 3333) {
                                                                                                                            return 2;
                                                                                                                        }
                                                                                                                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = Client.field631;
                                                                                                                        return 1;
                                                                                                                    }
                                                                                                                    int n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.field645[n2];
                                                                                                                    return 1;
                                                                                                                }
                                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.runEnergy;
                                                                                                                return 1;
                                                                                                            }
                                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.field518;
                                                                                                            return 1;
                                                                                                        }
                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.field517;
                                                                                                        return 1;
                                                                                                    }
                                                                                                    int n3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 4];
                                                                                                    int n4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                                                                                    int n5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
                                                                                                    int n6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3];
                                                                                                    int n7 = Coord.method6969(n5, n4, n6);
                                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = n3 + n7;
                                                                                                    return 1;
                                                                                                }
                                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.worldProperties;
                                                                                                return 1;
                                                                                            }
                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.playerMod ? 1 : 0;
                                                                                            return 1;
                                                                                        }
                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.weight;
                                                                                        return 1;
                                                                                    }
                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
                                                                                    return 1;
                                                                                }
                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.worldId;
                                                                                return 1;
                                                                            }
                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.rebootTimer;
                                                                            return 1;
                                                                        }
                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.staffModLevel >= 2 ? Client.staffModLevel : 0;
                                                                        return 1;
                                                                    }
                                                                    int n8 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2] + 32768;
                                                                    int n9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class75.method2360(n8, n9);
                                                                    return 1;
                                                                }
                                                                int n10 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2] + 32768;
                                                                int n11 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = GameBuild.ItemContainer_getCount(n10, n11);
                                                                return 1;
                                                            }
                                                            int n12 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2] + 32768;
                                                            int n13 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class36.method716(n12, n13);
                                                            return 1;
                                                        }
                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
                                                        return 1;
                                                    }
                                                    int n14 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Coord.method6972(n14);
                                                    return 1;
                                                }
                                                int n15 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Coord.method6965(n15);
                                                return 1;
                                            }
                                            int n16 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Coord.method6971(n16);
                                            return 1;
                                        }
                                        int n17 = GameEngine.field189.field1321;
                                        int n18 = (ModeWhere.localPlayer.x >> 7) + GameEngine.field189.field1324;
                                        int n19 = (ModeWhere.localPlayer.field1196 >> 7) + GameEngine.field189.field1325;
                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Coord.method6969(n17, n18, n19);
                                        return 1;
                                    }
                                    int n20 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.experience[n20];
                                    return 1;
                                }
                                int n21 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.levels[n21];
                                return 1;
                            }
                            int n22 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.currentLevels[n22];
                            return 1;
                        }
                        int n23 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class369.getInvDefinition((int)n23).size;
                        return 1;
                    }
                    int n24 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                    int n25 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class75.method2360(n24, n25);
                    return 1;
                }
                int n26 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                int n27 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = GameBuild.ItemContainer_getCount(n26, n27);
                return 1;
            }
            int n28 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
            int n29 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class36.method716(n28, n29);
            return 1;
        }
        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.cycle;
        return 1;
    }
}

