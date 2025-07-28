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

@ObfuscatedName(value="fm")
public class class138
implements class404 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1608 = new class138(0, 0, null, -1, -1);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1606 = new class138(1, 1, null, 0, 2);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1607 = new class138(2, 2, null, 1, 2);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1619 = new class138(3, 3, null, 2, 2);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1617 = new class138(4, 4, null, 3, 1);
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1610 = new class138(5, 5, null, 4, 1);
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1625 = new class138(6, 6, null, 5, 1);
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1612 = new class138(7, 7, null, 6, 3);
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1613 = new class138(8, 8, null, 7, 3);
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1614 = new class138(9, 9, null, 8, 3);
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1615 = new class138(10, 10, null, 0, 7);
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1616 = new class138(11, 11, null, 1, 7);
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1611 = new class138(12, 12, null, 2, 7);
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1618 = new class138(13, 13, null, 3, 7);
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1605 = new class138(14, 14, null, 4, 7);
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1620 = new class138(15, 15, null, 5, 7);
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lfm;")
    static final class138 field1621 = new class138(16, 16, null, 0, 5);
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=-469878497)
    final int field1624;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=809633273)
    final int field1622;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=-293522285)
    final int field1623;

    @ObfuscatedSignature(descriptor="(IILjava/lang/String;II)V", garbageValue="-1")
    class138(int n, int n2, String string, int n3, int n4) {
        this.field1624 = n;
        this.field1622 = n2;
        this.field1623 = n3;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1607362939")
    int method3491() {
        return this.field1623;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.field1622;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="im")
    @ObfuscatedSignature(descriptor="(IIIII)V", garbageValue="650985830")
    @Export(value="drawEntities")
    static final void drawEntities(int n, int n2, int n3, int n4) {
        ++Client.viewportDrawCount;
        GameEngine.field189.field1319.field2056 = Client.cycle;
        if (ModeWhere.localPlayer.x >> 7 == Client.field744 && ModeWhere.localPlayer.field1196 >> 7 == Client.field745) {
            Client.field744 = 0;
        }
        class36.method718(GameEngine.field189);
        class103 class1032 = GameEngine.field189;
        if (Client.field633) {
            class137.method3487(class1032, Client.field623, false);
        }
        class9.method79(GameEngine.field189);
        Timer.method8951(GameEngine.field189, true);
        class103 class1033 = GameEngine.field189;
        int n5 = Client.field673.field1406;
        int[] nArray = Client.field673.field1412;
        int n6 = 0;
        while (true) {
            if (n6 >= n5) break;
            if (nArray[n6] != Client.combatTargetPlayerIndex) {
                if (nArray[n6] != Client.field623) {
                    class137.method3487(class1033, nArray[n6], true);
                }
            }
            ++n6;
        }
        Timer.method8951(GameEngine.field189, false);
        class103 class1034 = GameEngine.field189;
        int n7 = 0;
        n6 = 0;
        while (true) {
            block62: {
                int n8;
                int n9;
                class480 class4802;
                block76: {
                    class480 class4803;
                    int n10;
                    int n11;
                    int n12;
                    int n13;
                    int n14;
                    int n15;
                    int n16;
                    int n17;
                    int n18;
                    int n19;
                    int n20;
                    block67: {
                        block68: {
                            block69: {
                                int n21;
                                block73: {
                                    block74: {
                                        block75: {
                                            int n22;
                                            int n23;
                                            block63: {
                                                block70: {
                                                    block71: {
                                                        block72: {
                                                            block65: {
                                                                block66: {
                                                                    block64: {
                                                                        int n24;
                                                                        block61: {
                                                                            if (n6 >= class1034.field1334) break block61;
                                                                            class4802 = class1034.field1318[class1034.field1335[n6]];
                                                                            if (class4802 == null) break block62;
                                                                            break block63;
                                                                        }
                                                                        Language.method7980(GameEngine.field189);
                                                                        class16.method208(GameEngine.field189);
                                                                        class143.setViewportShape(n, n2, n3, n4, true);
                                                                        n = Client.viewportOffsetX;
                                                                        n2 = Client.viewportOffsetY;
                                                                        n3 = Client.viewportWidth;
                                                                        n4 = Client.viewportHeight;
                                                                        Rasterizer2D.Rasterizer2D_setClip(n, n2, n + n3, n4 + n2);
                                                                        SceneTileModel.method4071();
                                                                        Rasterizer2D.method10626();
                                                                        n7 = Client.camAngleX;
                                                                        if (Client.field679 / 256 > n7) {
                                                                            n7 = Client.field679 / 256;
                                                                        }
                                                                        if (Client.field571[4] && Client.field690[4] + 128 > n7) {
                                                                            n7 = Client.field690[4] + 128;
                                                                        }
                                                                        n6 = Client.camAngleY & 0x7FF;
                                                                        int n25 = VarpDefinition.field2509;
                                                                        n23 = ClientPacket.field3330;
                                                                        n22 = class7.field26;
                                                                        n9 = n24 = n7 * 3 + 600;
                                                                        n9 = Frames.method4471(n9, n4);
                                                                        n20 = 2048 - n7 & 0x7FF;
                                                                        n8 = 2048 - n6 & 0x7FF;
                                                                        n19 = 0;
                                                                        n18 = 0;
                                                                        n17 = n9;
                                                                        if (n20 != 0) {
                                                                            n16 = SceneTileModel.field1954[n20];
                                                                            n15 = SceneTileModel.Rasterizer3D_cosine[n20];
                                                                            n14 = n18 * n15 - n16 * n17 >> 16;
                                                                            n17 = n18 * n16 + n15 * n17 >> 16;
                                                                            n18 = n14;
                                                                        }
                                                                        if (n8 != 0) {
                                                                            n16 = SceneTileModel.field1954[n8];
                                                                            n15 = SceneTileModel.Rasterizer3D_cosine[n8];
                                                                            n14 = n17 * n16 + n19 * n15 >> 16;
                                                                            n17 = n17 * n15 - n19 * n16 >> 16;
                                                                            n19 = n14;
                                                                        }
                                                                        if (Client.isCameraLocked) {
                                                                            HorizontalAlignment.field2603 = n25 - n19;
                                                                            PcmPlayer.field275 = n23 - n18;
                                                                            class27.field118 = n22 - n17;
                                                                            FriendSystem.field830 = n7;
                                                                            class340.field3703 = n6;
                                                                        } else {
                                                                            Buddy.cameraX = n25 - n19;
                                                                            Message.cameraY = n23 - n18;
                                                                            class31.cameraZ = n22 - n17;
                                                                            class159.cameraPitch = n7;
                                                                            class183.cameraYaw = n6;
                                                                        }
                                                                        if (Client.titleLoadingStage == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (VarpDefinition.field2509 >> 7 != ModeWhere.localPlayer.x >> 7 || class7.field26 >> 7 != ModeWhere.localPlayer.field1196 >> 7)) {
                                                                            n16 = ModeWhere.localPlayer.plane;
                                                                            n15 = (VarpDefinition.field2509 >> 7) + GameEngine.field189.field1324;
                                                                            n14 = (class7.field26 >> 7) + GameEngine.field189.field1325;
                                                                            PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3368, Client.packetWriter.isaacCipher);
                                                                            packetBufferNode.packetBuffer.writeInt(n15);
                                                                            packetBufferNode.packetBuffer.method10320(n14);
                                                                            packetBufferNode.packetBuffer.method10332(Client.field601);
                                                                            packetBufferNode.packetBuffer.method10310(n16);
                                                                            Client.packetWriter.addNode(packetBufferNode);
                                                                        }
                                                                        if (Client.isCameraLocked) break block64;
                                                                        if (!class544.clientPreferences.method2890()) break block65;
                                                                        break block66;
                                                                    }
                                                                    if (class544.clientPreferences.method2890()) {
                                                                        n8 = GameEngine.field189.field1321;
                                                                    } else {
                                                                        n19 = Buddy.cameraX >> 7;
                                                                        n18 = class31.cameraZ >> 7;
                                                                        n8 = n19 >= 0 && 104 > n19 && n18 >= 0 && 104 > n18 ? ((n17 = Canvas.method337(GameEngine.field189, Buddy.cameraX, class31.cameraZ, GameEngine.field189.field1321)) - Message.cameraY < 800 && (GameEngine.field189.field1337[GameEngine.field189.field1321][n19][n18] & 4) != 0 ? GameEngine.field189.field1321 : 3) : GameEngine.field189.field1321;
                                                                    }
                                                                    n20 = n8;
                                                                    break block67;
                                                                }
                                                                n8 = GameEngine.field189.field1321;
                                                                break block68;
                                                            }
                                                            n19 = 3;
                                                            n18 = class53.field339.vmethod9352() >> 7;
                                                            n17 = class53.field339.vmethod9331() >> 7;
                                                            if (class159.cameraPitch >= 310) break block69;
                                                            if (Client.titleLoadingStage == 1) {
                                                                n16 = VarpDefinition.field2509 >> 7;
                                                                n15 = class7.field26 >> 7;
                                                            } else {
                                                                n16 = n18;
                                                                n15 = n17;
                                                            }
                                                            n14 = Buddy.cameraX >> 7;
                                                            n13 = class31.cameraZ >> 7;
                                                            if (n14 < 0 || 104 <= n14 || n13 < 0 || 104 <= n13) break block70;
                                                            if (n16 < 0 || 104 <= n16 || n15 < 0 || 104 <= n15) break block71;
                                                            if ((GameEngine.field189.field1337[GameEngine.field189.field1321][n14][n13] & 4) != 0) {
                                                                n19 = GameEngine.field189.field1321;
                                                            }
                                                            if ((n12 = n16 > n14 ? n16 - n14 : n14 - n16) <= (n11 = n15 > n13 ? n15 - n13 : n13 - n15)) break block72;
                                                            n21 = n11 * 65536 / n12;
                                                            n10 = 32768;
                                                            break block73;
                                                        }
                                                        if (n11 <= 0) break block69;
                                                        n21 = n12 * 65536 / n11;
                                                        n10 = 32768;
                                                        break block74;
                                                    }
                                                    n8 = GameEngine.field189.field1321;
                                                    break block68;
                                                }
                                                n8 = GameEngine.field189.field1321;
                                                break block68;
                                            }
                                            int n26 = n23 = class4802.field5035.field1320 == class148.field1676 ? 1 : 0;
                                            if (n23 != 0) break block75;
                                            int n27 = n22 = n7 < Client.field794 ? 1 : 0;
                                            if (n22 == 0) break block62;
                                            ++n7;
                                        }
                                        class4802.field5029.method5891(Canvas.method337(class1034, class4802.vmethod9352(), class4802.vmethod9331(), class1034.field1321));
                                        class4802.field5035.field1319.field2056 = Client.cycle;
                                        class4802.method9351();
                                        class1034.field1319.method4185(class1034.field1321, class4802.vmethod9352(), class4802.vmethod9331(), class4802.method9288(), class4802.method9315() / 2, class4802.field5035.field1319, class4802.method9291(), 0L, false);
                                        class103 class1035 = class4802.field5035;
                                        if (Client.field633) {
                                            class137.method3487(class1035, Client.field623, false);
                                        }
                                        break block76;
                                    }
                                    while (n13 != n15) {
                                        if (n13 < n15) {
                                            ++n13;
                                        } else if (n13 > n15) {
                                            --n13;
                                        }
                                        if ((GameEngine.field189.field1337[GameEngine.field189.field1321][n14][n13] & 4) != 0) {
                                            n19 = GameEngine.field189.field1321;
                                        }
                                        if ((n10 += n21) < 65536) continue;
                                        n10 -= 65536;
                                        if (n14 < n16) {
                                            ++n14;
                                        } else if (n14 > n16) {
                                            --n14;
                                        }
                                        if ((GameEngine.field189.field1337[GameEngine.field189.field1321][n14][n13] & 4) == 0) continue;
                                        n19 = GameEngine.field189.field1321;
                                    }
                                    break block69;
                                }
                                while (n16 != n14) {
                                    if (n14 < n16) {
                                        ++n14;
                                    } else if (n14 > n16) {
                                        --n14;
                                    }
                                    if ((GameEngine.field189.field1337[GameEngine.field189.field1321][n14][n13] & 4) != 0) {
                                        n19 = GameEngine.field189.field1321;
                                    }
                                    if ((n10 += n21) < 65536) continue;
                                    n10 -= 65536;
                                    if (n13 < n15) {
                                        ++n13;
                                    } else if (n13 > n15) {
                                        --n13;
                                    }
                                    if ((GameEngine.field189.field1337[GameEngine.field189.field1321][n14][n13] & 4) == 0) continue;
                                    n19 = GameEngine.field189.field1321;
                                }
                            }
                            if (n18 >= 0 && 104 > n18 && n17 >= 0 && 104 > n17) {
                                if ((GameEngine.field189.field1337[GameEngine.field189.field1321][n18][n17] & 4) != 0) {
                                    n19 = GameEngine.field189.field1321;
                                }
                                n8 = n19;
                            } else {
                                n8 = GameEngine.field189.field1321;
                            }
                        }
                        n20 = n8;
                    }
                    n8 = Buddy.cameraX;
                    n19 = Message.cameraY;
                    n18 = class31.cameraZ;
                    n17 = class159.cameraPitch;
                    n16 = class183.cameraYaw;
                    n15 = 0;
                    while (true) {
                        block78: {
                            block79: {
                                block77: {
                                    if (n15 >= 5) break block77;
                                    if (!Client.field571[n15]) break block78;
                                    break block79;
                                }
                                n15 = MouseHandler.MouseHandler_x;
                                n14 = MouseHandler.MouseHandler_y;
                                if (MouseHandler.MouseHandler_lastButton != 0) {
                                    n15 = MouseHandler.MouseHandler_lastPressedX;
                                    n14 = MouseHandler.MouseHandler_lastPressedY;
                                }
                                if (n15 >= n && n15 < n + n3 && n14 >= n2 && n14 < n4 + n2) {
                                    class154.method3627(n15 - n, n14 - n2);
                                    for (class103 class1036 : Client.field508) {
                                        class1036.field1319.method4231(class1036.field1321, n15 - n, n14 - n2);
                                    }
                                } else {
                                    class251.method5359();
                                }
                                class113.method3178();
                                Rasterizer2D.Rasterizer2D_fillRectangle(n, n2, n3, n4, 0);
                                class113.method3178();
                                n13 = SceneTileModel.method4061();
                                SceneTileModel.method4017(Client.client.field174);
                                SceneTileModel.field1957.field2289 = Client.viewportZoom;
                                n12 = class53.field339.vmethod9352();
                                n11 = class53.field339.vmethod9331();
                                class175 class1752 = class148.field1676 == -1 ? class175.field1837 : class175.field1838;
                                GameEngine.field189.field1319.method4212(class1752);
                                GameEngine.field189.field1319.method4236(Buddy.cameraX, Message.cameraY, class31.cameraZ, class159.cameraPitch, class183.cameraYaw, n20, n12, n11, Client.isCameraLocked);
                                SceneTileModel.method4017(false);
                                if (Client.renderSelf) {
                                    Rasterizer2D.method10627();
                                }
                                break;
                            }
                            n14 = (int)(Math.random() * (double)(Client.field764[n15] * 2 + 1) - (double)Client.field764[n15] + Math.sin((double)Client.field768[n15] / 100.0 * (double)Client.field705[n15]) * (double)Client.field690[n15]);
                            if (n15 == 0) {
                                Buddy.cameraX = n14 + Buddy.cameraX;
                            }
                            if (n15 == 1) {
                                Message.cameraY = n14 + Message.cameraY;
                            }
                            if (n15 == 2) {
                                class31.cameraZ = n14 + class31.cameraZ;
                            }
                            if (n15 == 3) {
                                class183.cameraYaw = n14 + class183.cameraYaw & 0x7FF;
                            }
                            if (n15 == 4) {
                                if ((class159.cameraPitch = n14 + class159.cameraPitch) < 128) {
                                    class159.cameraPitch = 128;
                                }
                                if (class159.cameraPitch > 383) {
                                    class159.cameraPitch = 383;
                                }
                            }
                        }
                        ++n15;
                    }
                    SceneTileModel.field1957.field2289 = n13;
                    class113.method3178();
                    GameEngine.field189.field1319.method4365();
                    n10 = 0;
                    while (true) {
                        if (n10 >= GameEngine.field189.field1334) break;
                        class4803 = GameEngine.field189.field1318[GameEngine.field189.field1335[n10]];
                        if (class4803 != null) {
                            class4803.field5035.field1319.method4365();
                        }
                        ++n10;
                    }
                    class151.method3599(GameEngine.field189, n, n2, n3, n4);
                    n10 = 0;
                    while (true) {
                        block81: {
                            block82: {
                                block80: {
                                    if (n10 >= GameEngine.field189.field1334) break block80;
                                    class4803 = GameEngine.field189.field1318[GameEngine.field189.field1335[n10]];
                                    if (class4803 == null) break block81;
                                    break block82;
                                }
                                class355.method7041(GameEngine.field189, n, n2);
                                ((TextureProvider)SceneTileModel.field1957.Rasterizer3D_textureLoader).animate(Client.field581);
                                Client.field625 = 0;
                                n10 = (ModeWhere.localPlayer.x >> 7) + GameEngine.field189.field1324;
                                int n28 = (ModeWhere.localPlayer.field1196 >> 7) + GameEngine.field189.field1325;
                                if (n10 >= 3053 && n10 <= 3156 && n28 >= 3056 && n28 <= 3136) {
                                    Client.field625 = 1;
                                }
                                if (n10 >= 3072 && n10 <= 3118 && n28 >= 9492 && n28 <= 9535) {
                                    Client.field625 = 1;
                                }
                                if (Client.field625 == 1 && n10 >= 3139 && n10 <= 3199 && n28 >= 3008 && n28 <= 3062) {
                                    Client.field625 = 0;
                                }
                                Buddy.cameraX = n8;
                                Message.cameraY = n19;
                                class31.cameraZ = n18;
                                class159.cameraPitch = n17;
                                class183.cameraYaw = n16;
                                if (Client.field513 && HitSplatDefinition.field2760.method7836(true, false) == 0) {
                                    Client.field513 = false;
                                }
                                if (Client.field513) {
                                    Rasterizer2D.Rasterizer2D_fillRectangle(n, n2, n3, n4, 0);
                                    class328.drawLoadingMessage("Loading - please wait.", false);
                                }
                                return;
                            }
                            class151.method3599(class4803.field5035, n, n2, n3, n4);
                        }
                        ++n10;
                    }
                }
                class9.method79(class4802.field5035);
                Timer.method8951(class4802.field5035, true);
                class103 class1037 = class4802.field5035;
                n9 = Client.field673.field1406;
                int[] nArray2 = Client.field673.field1412;
                n8 = 0;
                while (true) {
                    block84: {
                        block85: {
                            block83: {
                                if (n8 >= n9) break block83;
                                if (nArray2[n8] == Client.combatTargetPlayerIndex) break block84;
                                break block85;
                            }
                            Timer.method8951(class4802.field5035, false);
                            Language.method7980(class4802.field5035);
                            class16.method208(class4802.field5035);
                            break;
                        }
                        if (nArray2[n8] != Client.field623) {
                            class137.method3487(class1037, nArray2[n8], true);
                        }
                    }
                    ++n8;
                }
            }
            ++n6;
        }
    }
}

