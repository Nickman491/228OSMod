/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName(value="ap")
@Implements(value="Canvas")
public final class Canvas
extends java.awt.Canvas {
    @ObfuscatedName(value="ay")
    @Export(value="component")
    Component component;

    Canvas(Component component) {
        this.component = component;
    }

    @Override
    public final void update(Graphics graphics) {
        this.component.update(graphics);
    }

    @Override
    public final void paint(Graphics graphics) {
        this.component.paint(graphics);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Ljt;", garbageValue="1660841300")
    static HorizontalAlignment[] method338() {
        return new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field2605, HorizontalAlignment.field2609};
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lue;III)I", garbageValue="452391295")
    static int method336(IterableNodeHashTable iterableNodeHashTable, int n, int n2) {
        if (iterableNodeHashTable == null) {
            return n2;
        }
        IntegerNode integerNode = (IntegerNode)iterableNodeHashTable.get(n);
        if (integerNode == null) {
            return n2;
        }
        return integerNode.integer;
    }

    @ObfuscatedName(value="bm")
    @ObfuscatedSignature(descriptor="(ILdm;ZS)I", garbageValue="13847")
    static int method339(int n, Script script, boolean bl) {
        if (n != ScriptOpcodes.GETWINDOWMODE) {
            int n2;
            if (n != ScriptOpcodes.SETWINDOWMODE) {
                if (n != ScriptOpcodes.GETDEFAULTWINDOWMODE) {
                    int n3;
                    if (n != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
                        if (n != 5310) {
                            return 2;
                        }
                        --ScriptFrame.Interpreter_intStackSize;
                        return 1;
                    }
                    if ((n3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]) == 1 || n3 == 2) {
                        class544.clientPreferences.method2905(n3);
                    }
                    return 1;
                }
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class544.clientPreferences.method2906();
                return 1;
            }
            if ((n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]) == 1 || n2 == 2) {
                PacketBuffer.setWindowedMode(n2);
            }
            return 1;
        }
        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = TextureProvider.getWindowedMode();
        return 1;
    }

    @ObfuscatedName(value="fh")
    @ObfuscatedSignature(descriptor="(I)Lua;", garbageValue="-752612347")
    @Export(value="getWorldMap")
    static WorldMap getWorldMap() {
        return class420.worldMap;
    }

    @ObfuscatedName(value="hf")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-944852240")
    @Export(value="load")
    static final void load() {
        int n;
        int n2;
        if (Client.titleLoadingStage != 0) {
            if (Client.titleLoadingStage == 1) {
                int n3;
                if (Client.field602 && ModeWhere.localPlayer != null) {
                    n2 = ModeWhere.localPlayer.field1266[0];
                    n = ModeWhere.localPlayer.field1221[0];
                    if (n2 >= 0 && 104 > n2 && n >= 0 && 104 > n) {
                        VarpDefinition.field2509 = ModeWhere.localPlayer.x;
                        n3 = Canvas.method337(GameEngine.field189, ModeWhere.localPlayer.x, ModeWhere.localPlayer.field1196, GameEngine.field189.field1321) - Client.camFollowHeight;
                        if (n3 < ClientPacket.field3330) {
                            ClientPacket.field3330 = n3;
                        }
                        class7.field26 = ModeWhere.localPlayer.field1196;
                        Client.field602 = false;
                    }
                }
                n2 = -1;
                if (Client.field731.method5776(33)) {
                    n2 = 0;
                } else if (Client.field731.method5776(49)) {
                    n2 = 1024;
                }
                if (!Client.field731.method5776(48)) {
                    if (Client.field731.method5776(50)) {
                        n2 = n2 == 0 ? 256 : (n2 == 1024 ? 768 : 512);
                    }
                } else {
                    n2 = n2 == 0 ? 1792 : (n2 == 1024 ? 1280 : 1536);
                }
                n = 0;
                if (Client.field731.method5776(35)) {
                    n = -1;
                } else if (Client.field731.method5776(51)) {
                    n = 1;
                }
                n3 = 0;
                if (n2 >= 0 || n != 0) {
                    n3 = Client.field731.method5776(81) ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed;
                    n3 *= 16;
                    Client.field539 = n2;
                    Client.field626 = n;
                }
                if (Client.field596 >= n3) {
                    if (Client.field596 > n3) {
                        Client.field596 = Client.field596 * 9 / 10;
                    }
                } else if ((Client.field596 = n3 / 8 + Client.field596) > n3) {
                    Client.field596 = n3;
                }
                if (Client.field596 <= 0) {
                    Client.field539 = -1;
                    Client.field626 = -1;
                } else {
                    int n4 = Client.field596 / 16;
                    if (Client.field539 >= 0) {
                        n2 = Client.field539 - class183.cameraYaw & 0x7FF;
                        int n5 = SceneTileModel.field1954[n2];
                        int n6 = SceneTileModel.Rasterizer3D_cosine[n2];
                        VarpDefinition.field2509 += n5 * n4 / 65536;
                        class7.field26 += n4 * n6 / 65536;
                    }
                    if (Client.field626 != 0 && (ClientPacket.field3330 = n4 * Client.field626 + ClientPacket.field3330) > 0) {
                        ClientPacket.field3330 = 0;
                    }
                }
                if (Client.field731.method5776(13)) {
                    class380.method7644();
                }
            }
        } else {
            int n7;
            Player player;
            n2 = class53.field339.vmethod9352();
            n = class53.field339.vmethod9331();
            if (Client.field781 != -1 && (player = ModeWhere.localPlayer.field1143.field1329[Client.field781]) != null) {
                Coord coord = player.method2785(ModeWhere.localPlayer.field1143);
                n2 = coord.x;
                n = coord.y;
            }
            int n8 = class53.field339.vmethod9290();
            if (VarpDefinition.field2509 - n2 < -500 || VarpDefinition.field2509 - n2 > 500 || class7.field26 - n < -500 || class7.field26 - n > 500) {
                VarpDefinition.field2509 = n2;
                class7.field26 = n;
            }
            if (n2 != VarpDefinition.field2509) {
                VarpDefinition.field2509 += (n2 - VarpDefinition.field2509) / 16;
            }
            if (n != class7.field26) {
                class7.field26 += (n - class7.field26) / 16;
            }
            int n9 = VarpDefinition.field2509 >> 7;
            int n10 = class7.field26 >> 7;
            int n11 = Canvas.method337(GameEngine.field189, VarpDefinition.field2509, class7.field26, n8);
            int n12 = 0;
            if (n9 > 3 && n10 > 3 && n9 < 100 && n10 < 100) {
                for (n7 = n9 - 4; n7 <= n9 + 4; ++n7) {
                    for (int i = n10 - 4; i <= n10 + 4; ++i) {
                        int n13;
                        int n14 = n8;
                        if (n14 < 3 && (GameEngine.field189.field1337[1][n7][i] & 2) == 2) {
                            ++n14;
                        }
                        if ((n13 = n11 - GameEngine.field189.field1328[n14][n7][i]) <= n12) continue;
                        n12 = n13;
                    }
                }
            }
            if ((n7 = n12 * 192) > 98048) {
                n7 = 98048;
            }
            if (n7 < 32768) {
                n7 = 32768;
            }
            if (n7 > Client.field679) {
                Client.field679 = (n7 - Client.field679) / 24 + Client.field679;
            } else if (n7 < Client.field679) {
                Client.field679 = (n7 - Client.field679) / 80 + Client.field679;
            }
            ClientPacket.field3330 = Canvas.method337(GameEngine.field189, n2, n, n8) - Client.camFollowHeight;
        }
        if (MouseHandler.MouseHandler_currentButton == 4 && KeyHandler.mouseCam) {
            n2 = MouseHandler.MouseHandler_y - Client.field593;
            Client.field591 = n2 * 2;
            Client.field593 = n2 != -1 && n2 != 1 ? (MouseHandler.MouseHandler_y + Client.field593) / 2 : MouseHandler.MouseHandler_y;
            n = Client.field592 - MouseHandler.MouseHandler_x;
            Client.field590 = n * 2;
            Client.field592 = n != -1 && n != 1 ? (Client.field592 + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
        } else {
            Client.field590 = Client.field731.method5776(96) ? (-24 - Client.field590) / 2 + Client.field590 : (Client.field731.method5776(97) ? (24 - Client.field590) / 2 + Client.field590 : (Client.field590 /= 2));
            Client.field591 = Client.field731.method5776(98) ? (12 - Client.field591) / 2 + Client.field591 : (Client.field731.method5776(99) ? (-12 - Client.field591) / 2 + Client.field591 : (Client.field591 /= 2));
            Client.field593 = MouseHandler.MouseHandler_y;
            Client.field592 = MouseHandler.MouseHandler_x;
        }
        Client.camAngleY = Client.field590 / 2 + Client.camAngleY & 0x7FF;
        Client.camAngleX = Client.field591 / 2 + Client.camAngleX;
        if (Client.camAngleX < 128) {
            Client.camAngleX = 128;
        }
        if (Client.camAngleX > 383) {
            Client.camAngleX = 383;
        }
    }

    @ObfuscatedName(value="jc")
    @ObfuscatedSignature(descriptor="(Ldz;IIIB)I", garbageValue="54")
    static final int method337(class103 class1032, int n, int n2, int n3) {
        int n4 = n >> 7;
        int n5 = n2 >> 7;
        if (n4 >= 0 && n5 >= 0 && n4 < class1032.field1337[0].length && n5 < class1032.field1337[0][0].length) {
            int n6 = n3;
            if (n6 < 3 && (class1032.field1337[1][n4][n5] & 2) == 2) {
                ++n6;
            }
            int n7 = n & 0x7F;
            int n8 = n2 & 0x7F;
            int n9 = class1032.field1328[n6][n4 + 1][n5] * n7 + class1032.field1328[n6][n4][n5] * (128 - n7) >> 7;
            int n10 = n7 * class1032.field1328[n6][n4 + 1][n5 + 1] + class1032.field1328[n6][n4][n5 + 1] * (128 - n7) >> 7;
            return n9 * (128 - n8) + n8 * n10 >> 7;
        }
        return 0;
    }

    @ObfuscatedName(value="ou")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)Ljava/lang/String;", garbageValue="1261539671")
    @Export(value="method48")
    static String method48(String string) {
        PlayerType[] playerTypeArray = class151.PlayerType_values();
        int n = 0;
        while (true) {
            block4: {
                block3: {
                    if (n >= playerTypeArray.length) break block3;
                    PlayerType playerType = playerTypeArray[n];
                    if (playerType.modIcon == -1 || !string.startsWith(WorldMapElement.method1919(playerType.modIcon))) break block4;
                    string = string.substring(6 + Integer.toString(playerType.modIcon).length());
                }
                return string;
            }
            ++n;
        }
    }
}

