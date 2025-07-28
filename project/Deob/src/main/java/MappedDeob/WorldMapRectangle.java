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
import java.awt.Desktop;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName(value="la")
@Implements(value="WorldMapRectangle")
public final class WorldMapRectangle {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=969059261)
    @Export(value="width")
    int width;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-247160933)
    @Export(value="height")
    int height;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1455202723)
    @Export(value="x")
    int x;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1752729869)
    @Export(value="y")
    int y;
    @ObfuscatedSignature(descriptor="Lln;")
    final /* synthetic */ WorldMapRenderer this$0;

    @ObfuscatedSignature(descriptor="(Lln;)V")
    WorldMapRectangle(WorldMapRenderer worldMapRenderer) {
        this.this$0 = worldMapRenderer;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;ZZI)V", garbageValue="-1654093091")
    @Export(value="openURL")
    public static void openURL(String string, boolean bl, boolean bl2) {
        block9: {
            if (bl) {
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    try {
                        Desktop.getDesktop().browse(new URI(string));
                        break block9;
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                if (class31.field137.startsWith("win")) {
                    class163.method3775(string, 0);
                } else if (class31.field137.startsWith("mac")) {
                    class440.method8813(string, 1, "openjs");
                } else {
                    class163.method3775(string, 2);
                }
            } else {
                class163.method3775(string, 3);
            }
        }
    }

    @ObfuscatedName(value="az")
    @Export(value="base37DecodeLong")
    public static String base37DecodeLong(long l) {
        if (l > 0L && l < 6582952005840035281L) {
            if (l % 37L == 0L) {
                return null;
            }
            int n = 0;
            long l2 = l;
            while (true) {
                if (0L == l2) {
                    StringBuilder stringBuilder = new StringBuilder(n);
                    while (true) {
                        if (l == 0L) {
                            stringBuilder.reverse();
                            stringBuilder.setCharAt(0, Character.toUpperCase(stringBuilder.charAt(0)));
                            return stringBuilder.toString();
                        }
                        long l3 = l;
                        int n2 = class421.base37Table[(int)(l3 - (l /= 37L) * 37L)];
                        if (n2 == 95) {
                            int n3 = stringBuilder.length() - 1;
                            stringBuilder.setCharAt(n3, Character.toUpperCase(stringBuilder.charAt(n3)));
                            n2 = 160;
                        }
                        stringBuilder.append((char)n2);
                    }
                }
                ++n;
                l2 /= 37L;
            }
        }
        return null;
    }

    @ObfuscatedName(value="ba")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="2120766497")
    static int method6391(int n, Script script, boolean bl) {
        block38: {
            block39: {
                block40: {
                    if (n == ScriptOpcodes.WORLDLIST_FETCH) break block38;
                    if (n == ScriptOpcodes.WORLDLIST_START) break block39;
                    if (n == ScriptOpcodes.WORLDLIST_NEXT) break block40;
                    if (n != ScriptOpcodes.WORLDLIST_SPECIFIC) {
                        if (n != ScriptOpcodes.WORLDLIST_SORT) {
                            int n2;
                            if (n != 6511) {
                                if (n != ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
                                    if (n != ScriptOpcodes.NC_PARAM) {
                                        if (n != ScriptOpcodes.LC_PARAM) {
                                            if (n != ScriptOpcodes.OC_PARAM) {
                                                if (n != ScriptOpcodes.STRUCT_PARAM) {
                                                    if (n != ScriptOpcodes.ON_MOBILE) {
                                                        if (n != ScriptOpcodes.CLIENTTYPE) {
                                                            if (n != 6520) {
                                                                if (n != ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
                                                                    if (n != 6522) {
                                                                        if (n != 6523) {
                                                                            if (n != ScriptOpcodes.MOBILE_BATTERYLEVEL) {
                                                                                if (n != ScriptOpcodes.MOBILE_BATTERYCHARGING) {
                                                                                    if (n != ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
                                                                                        if (n != 6527) {
                                                                                            return 2;
                                                                                        }
                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.field498;
                                                                                        return 1;
                                                                                    }
                                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
                                                                                    return 1;
                                                                                }
                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
                                                                                return 1;
                                                                            }
                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                                                                            return 1;
                                                                        }
                                                                        --HealthBar.Interpreter_stringStackSize;
                                                                        --ScriptFrame.Interpreter_intStackSize;
                                                                        return 1;
                                                                    }
                                                                    --HealthBar.Interpreter_stringStackSize;
                                                                    --ScriptFrame.Interpreter_intStackSize;
                                                                    return 1;
                                                                }
                                                                return 1;
                                                            }
                                                            return 1;
                                                        }
                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.clientType;
                                                        return 1;
                                                    }
                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
                                                    return 1;
                                                }
                                                int n3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                                                int n4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                                ParamComposition paramComposition = VerticalAlignment.getParamDefinition(n4);
                                                if (!paramComposition.isString()) {
                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = ItemContainer.StructDefinition_getStructDefinition(n3).getIntParam(n4, paramComposition.defaultInt);
                                                } else {
                                                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ItemContainer.StructDefinition_getStructDefinition(n3).getStringParam(n4, paramComposition.defaultStr);
                                                }
                                                return 1;
                                            }
                                            int n5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                                            int n6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                            ParamComposition paramComposition = VerticalAlignment.getParamDefinition(n6);
                                            if (!paramComposition.isString()) {
                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = FaceNormal.ItemDefinition_get(n5).getIntParam(n6, paramComposition.defaultInt);
                                            } else {
                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = FaceNormal.ItemDefinition_get(n5).getStringParam(n6, paramComposition.defaultStr);
                                            }
                                            return 1;
                                        }
                                        int n7 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                                        int n8 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                        ParamComposition paramComposition = VerticalAlignment.getParamDefinition(n8);
                                        if (!paramComposition.isString()) {
                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class142.getObjectDefinition(n7).getIntParam(n8, paramComposition.defaultInt);
                                        } else {
                                            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = class142.getObjectDefinition(n7).getStringParam(n8, paramComposition.defaultStr);
                                        }
                                        return 1;
                                    }
                                    int n9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                                    int n10 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                    ParamComposition paramComposition = VerticalAlignment.getParamDefinition(n10);
                                    if (!paramComposition.isString()) {
                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class446.getNpcDefinition(n9).getIntParam(n10, paramComposition.defaultInt);
                                    } else {
                                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = class446.getNpcDefinition(n9).getStringParam(n10, paramComposition.defaultStr);
                                    }
                                    return 1;
                                }
                                Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
                                return 1;
                            }
                            if ((n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]) < 0 || n2 >= World.World_count) {
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                            } else {
                                World world = World.World_worlds[n2];
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = world.id;
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = world.properties;
                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = world.activity;
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = world.location;
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = world.population;
                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = world.host;
                            }
                            return 1;
                        }
                        int n11 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 4];
                        boolean bl2 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1] == 1;
                        int n12 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
                        boolean bl3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3] == 1;
                        class133.sortWorldList(n11, bl2, n12, bl3);
                        return 1;
                    }
                    int n13 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                    World world = null;
                    int n14 = 0;
                    while (true) {
                        block42: {
                            block41: {
                                if (n14 >= World.World_count) break block41;
                                if (n13 != World.World_worlds[n14].id) break block42;
                                world = World.World_worlds[n14];
                            }
                            if (world == null) {
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                            } else {
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = world.id;
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = world.properties;
                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = world.activity;
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = world.location;
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = world.population;
                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = world.host;
                            }
                            return 1;
                        }
                        ++n14;
                    }
                }
                World world = class329.getNextWorldListWorld();
                if (world == null) {
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                } else {
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = world.id;
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = world.properties;
                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = world.activity;
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = world.location;
                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = world.population;
                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = world.host;
                }
                return 1;
            }
            World world = WorldMapLabelSize.worldListStart();
            if (world == null) {
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
            } else {
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = world.id;
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = world.properties;
                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = world.activity;
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = world.location;
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = world.population;
                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = world.host;
            }
            return 1;
        }
        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class280.loadWorlds() ? 1 : 0;
        return 1;
    }
}

