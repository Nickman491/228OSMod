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
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ly")
@Implements(value="AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lnz;")
    @Export(value="coord2")
    public final Coord coord2;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lnz;")
    @Export(value="coord1")
    public final Coord coord1;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-2111048913)
    @Export(value="screenX")
    int screenX;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-951866125)
    @Export(value="screenY")
    int screenY;

    @ObfuscatedSignature(descriptor="(Lnz;Lnz;)V")
    AbstractWorldMapIcon(Coord coord, Coord coord2) {
        this.coord1 = coord;
        this.coord2 = coord2;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="468922444")
    @Export(value="getElement")
    public abstract int getElement();

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)Lli;", garbageValue="24")
    @Export(value="getLabel")
    abstract WorldMapLabel getLabel();

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1283952551")
    @Export(value="getSubWidth")
    abstract int getSubWidth();

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1685687159")
    @Export(value="getSubHeight")
    abstract int getSubHeight();

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(IIB)Z", garbageValue="4")
    @Export(value="fitsScreen")
    boolean fitsScreen(int n, int n2) {
        if (!this.elementFitsScreen(n, n2)) {
            return this.labelFitsScreen(n, n2);
            {
            }
        }
        return true;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-428697607")
    @Export(value="hasValidElement")
    boolean hasValidElement() {
        return this.getElement() >= 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="-2092098035")
    @Export(value="elementFitsScreen")
    boolean elementFitsScreen(int n, int n2) {
        if (!this.hasValidElement()) {
            return false;
        }
        WorldMapElement worldMapElement = class31.WorldMapElement_get(this.getElement());
        int n3 = this.getSubWidth();
        int n4 = this.getSubHeight();
        switch (worldMapElement.horizontalAlignment.value) {
            case 1: {
                if (n < this.screenX) return false;
                if (n < n3 + this.screenX) break;
                return false;
            }
            case 0: {
                if (n < this.screenX - n3 / 2) return false;
                if (n <= n3 / 2 + this.screenX) break;
                return false;
            }
            case 2: {
                if (n <= this.screenX - n3) return false;
                if (n <= this.screenX) break;
                return false;
            }
        }
        switch (worldMapElement.verticalAlignment.value) {
            case 1: {
                if (n2 < this.screenY - n4 / 2) return false;
                if (n2 <= n4 / 2 + this.screenY) return true;
                return false;
            }
            case 2: {
                if (n2 <= this.screenY - n4) return false;
                if (n2 <= this.screenY) return true;
                return false;
            }
            case 0: {
                if (n2 < this.screenY) return false;
                if (n2 < n4 + this.screenY) return true;
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="-1327668678")
    @Export(value="labelFitsScreen")
    boolean labelFitsScreen(int n, int n2) {
        WorldMapLabel worldMapLabel = this.getLabel();
        if (worldMapLabel != null) {
            if (n >= this.screenX - worldMapLabel.width / 2 && n <= worldMapLabel.width / 2 + this.screenX) {
                return n2 >= this.screenY && n2 <= worldMapLabel.height + this.screenY;
                {
                }
            }
            return false;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IZB)[B", garbageValue="-15")
    @Export(value="ByteArrayPool_getArrayBool")
    public static byte[] ByteArrayPool_getArrayBool(int n, boolean bl) {
        Object object = ByteArrayPool.field4883;
        synchronized (object) {
            int n2;
            if ((n == 100 || n < 100 && bl) && ByteArrayPool.ByteArrayPool_smallCount > 0) {
                byte[] byArray = ByteArrayPool.ByteArrayPool_small[--ByteArrayPool.ByteArrayPool_smallCount];
                ByteArrayPool.ByteArrayPool_small[ByteArrayPool.ByteArrayPool_smallCount] = null;
                return byArray;
            }
            if ((n == 5000 || n < 5000 && bl) && ByteArrayPool.ByteArrayPool_mediumCount > 0) {
                byte[] byArray = ByteArrayPool.ByteArrayPool_medium[--ByteArrayPool.ByteArrayPool_mediumCount];
                ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount] = null;
                return byArray;
            }
            if ((n == 10000 || n < 10000 && bl) && ByteArrayPool.ByteArrayPool_largeCount > 0) {
                byte[] byArray = ByteArrayPool.ByteArrayPool_large[--ByteArrayPool.ByteArrayPool_largeCount];
                ByteArrayPool.ByteArrayPool_large[ByteArrayPool.ByteArrayPool_largeCount] = null;
                return byArray;
            }
            if ((n == 30000 || n < 30000 && bl) && ByteArrayPool.field4885 > 0) {
                byte[] byArray = ByteArrayPool.field4892[--ByteArrayPool.field4885];
                ByteArrayPool.field4892[ByteArrayPool.field4885] = null;
                return byArray;
            }
            if (class225.ByteArrayPool_arrays != null) {
                for (n2 = 0; n2 < class580.ByteArrayPool_alternativeSizes.length; ++n2) {
                    if (class580.ByteArrayPool_alternativeSizes[n2] != n && (n >= class580.ByteArrayPool_alternativeSizes[n2] || !bl) || KitDefinition.ByteArrayPool_altSizeArrayCounts[n2] <= 0) continue;
                    int n3 = n2;
                    int n4 = KitDefinition.ByteArrayPool_altSizeArrayCounts[n3] - 1;
                    KitDefinition.ByteArrayPool_altSizeArrayCounts[n3] = n4;
                    byte[] byArray = class225.ByteArrayPool_arrays[n2][n4];
                    class225.ByteArrayPool_arrays[n2][KitDefinition.ByteArrayPool_altSizeArrayCounts[n2]] = null;
                    return byArray;
                }
            }
            if (bl && class580.ByteArrayPool_alternativeSizes != null) {
                for (n2 = 0; n2 < class580.ByteArrayPool_alternativeSizes.length; ++n2) {
                    if (n > class580.ByteArrayPool_alternativeSizes[n2] || KitDefinition.ByteArrayPool_altSizeArrayCounts[n2] >= class225.ByteArrayPool_arrays[n2].length) continue;
                    return new byte[class580.ByteArrayPool_alternativeSizes[n2]];
                }
            }
        }
        return new byte[n];
    }

    @ObfuscatedName(value="lt")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;B)V", garbageValue="-7")
    static void method6463(int n, String string) {
        int n2 = Client.field673.field1406;
        int[] nArray = Client.field673.field1412;
        boolean bl = false;
        Username username = new Username(string, class383.loginType);
        int n3 = 0;
        while (true) {
            block13: {
                block12: {
                    if (n3 >= n2) break block12;
                    Player player = ModeWhere.localPlayer.field1143.field1329[nArray[n3]];
                    if (player == null || player == ModeWhere.localPlayer || player.username == null || !player.username.equals(username)) break block13;
                    if (n != 1) {
                        if (n != 4) {
                            if (n != 6) {
                                if (n == 7) {
                                    PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3325, Client.packetWriter.isaacCipher);
                                    packetBufferNode.packetBuffer.method10320(nArray[n3]);
                                    packetBufferNode.packetBuffer.writeByte(0);
                                    Client.packetWriter.addNode(packetBufferNode);
                                }
                            } else {
                                PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3353, Client.packetWriter.isaacCipher);
                                packetBufferNode.packetBuffer.method10310(0);
                                packetBufferNode.packetBuffer.writeInt(nArray[n3]);
                                Client.packetWriter.addNode(packetBufferNode);
                            }
                        } else {
                            PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3332, Client.packetWriter.isaacCipher);
                            packetBufferNode.packetBuffer.method10320(nArray[n3]);
                            packetBufferNode.packetBuffer.method10477(0);
                            Client.packetWriter.addNode(packetBufferNode);
                        }
                    } else {
                        PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3380, Client.packetWriter.isaacCipher);
                        packetBufferNode.packetBuffer.method10477(0);
                        packetBufferNode.packetBuffer.method10454(nArray[n3]);
                        Client.packetWriter.addNode(packetBufferNode);
                    }
                    bl = true;
                }
                if (!bl) {
                    Interpreter.addGameMessage(4, "", "Unable to find " + string);
                }
                return;
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="lp")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="118")
    static void method6464(int n, int n2, int n3, int n4) {
        Widget widget = ClanChannel.field1807.method7023(n, n2);
        if (widget != null && widget.onTargetEnter != null) {
            ScriptEvent scriptEvent = new ScriptEvent();
            scriptEvent.widget = widget;
            scriptEvent.args = widget.onTargetEnter;
            Friend.runScriptEvent(scriptEvent);
        }
        Client.field660 = n4;
        Client.isSpellSelected = true;
        class33.field149 = n;
        Client.field659 = n2;
        class106.field1365 = n3;
        UserComparator8.invalidateWidget(widget);
    }

    @ObfuscatedName(value="lk")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="-1229904046")
    static boolean method6465(int n, int n2) {
        block5: {
            block6: {
                block4: {
                    boolean bl;
                    if (!class77.method2369(n, n2)) {
                        return false;
                    }
                    if (!ArchiveLoader.method2587(n2)) break block4;
                    class491 class4912 = Client.field508.method2740(n);
                    if (class4912 == class491.field5089) break block5;
                    if (class4912 != class491.field5088) break block4;
                    boolean bl2 = n2 != 1002 && n2 != 1003 && n2 != 1004 ? false : (bl = true);
                    if (!bl) break block6;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @ObfuscatedName(value="nu")
    @ObfuscatedSignature(descriptor="(Lna;IIII)V", garbageValue="-317605604")
    @Export(value="drawMinimap")
    static final void drawMinimap(Widget widget, int n, int n2, int n3) {
        block29: {
            class113.method3178();
            SpriteMask spriteMask = widget.method7446(ClanChannel.field1807, false);
            if (spriteMask == null) {
                return;
            }
            Rasterizer2D.Rasterizer2D_setClip(n, n2, spriteMask.width + n, n2 + spriteMask.height);
            if (Client.minimapState != 2 && Client.minimapState != 5) {
                int n4 = Client.camAngleY & 0x7FF;
                int n5 = 48 + class53.field339.vmethod9352() / 32;
                int n6 = 464 - class53.field339.vmethod9331() / 32;
                class174.sceneMinimapSprite.drawRotatedMaskedCenteredAround(n, n2, spriteMask.width, spriteMask.height, n5, n6, n4, 256, spriteMask.xStarts, spriteMask.xWidths);
                int n7 = 0;
                while (true) {
                    int n8;
                    int n9;
                    if (n7 >= Client.mapIconCount) {
                        n7 = 0;
                        while (true) {
                            int n10;
                            int n11;
                            Object object;
                            if (n7 >= 104) {
                                n7 = 0;
                                while (true) {
                                    Object object2;
                                    if (n7 >= GameEngine.field189.field1331) {
                                        n7 = Client.field673.field1406;
                                        object2 = Client.field673.field1412;
                                        n9 = 0;
                                        while (true) {
                                            if (n9 >= n7) {
                                                if (Client.field565 != 0 && Client.cycle % 20 < 10) {
                                                    if (Client.field565 == 1 && Client.field530 >= 0 && Client.field530 < GameEngine.field189.field1330.length && (object = GameEngine.field189.field1330[Client.field530]) != null) {
                                                        n11 = ((Actor)object).x / 32 - class53.field339.vmethod9352() / 32;
                                                        n10 = ((Actor)object).field1196 / 32 - class53.field339.vmethod9331() / 32;
                                                        class53.worldToMinimap(n, n2, n11, n10, class140.field1626[1], spriteMask);
                                                    }
                                                    if (Client.field565 == 2) {
                                                        n9 = Client.field525 * 4 - GameEngine.field189.field1324 * 4 + 2 - class53.field339.vmethod9352() / 32;
                                                        n11 = Client.field526 * 4 - GameEngine.field189.field1325 * 4 + 2 - class53.field339.vmethod9331() / 32;
                                                        class53.worldToMinimap(n, n2, n9, n11, class140.field1626[1], spriteMask);
                                                    }
                                                    if (Client.field565 == 10 && Client.field524 >= 0 && Client.field524 < GameEngine.field189.field1329.length && (object = GameEngine.field189.field1329[Client.field524]) != null) {
                                                        n11 = ((Actor)object).x / 32 - class53.field339.vmethod9352() / 32;
                                                        n10 = ((Actor)object).field1196 / 32 - class53.field339.vmethod9331() / 32;
                                                        class53.worldToMinimap(n, n2, n11, n10, class140.field1626[1], spriteMask);
                                                    }
                                                }
                                                if (Client.field744 != 0) {
                                                    n9 = Client.field744 * 4 + 2 - class53.field339.vmethod9352() / 32;
                                                    n11 = Client.field745 * 4 + 2 - class53.field339.vmethod9331() / 32;
                                                    FontName.drawSpriteOnMinimap(n, n2, n9, n11, class140.field1626[0], spriteMask);
                                                }
                                                if (!ModeWhere.localPlayer.field1138) {
                                                    Rasterizer2D.Rasterizer2D_fillRectangle(spriteMask.width / 2 + n - 1, spriteMask.height / 2 + n2 - 1, 3, 3, 0xFFFFFF);
                                                }
                                                break block29;
                                            }
                                            Player player = GameEngine.field189.field1329[object2[n9]];
                                            if (player != null && player.isVisible() && !player.field1138 && player != ModeWhere.localPlayer) {
                                                n10 = player.x / 32 - class53.field339.vmethod9352() / 32;
                                                int n12 = player.field1196 / 32 - class53.field339.vmethod9331() / 32;
                                                if (player.method2697()) {
                                                    FontName.drawSpriteOnMinimap(n, n2, n10, n12, class464.field4957[3], spriteMask);
                                                } else if (ModeWhere.localPlayer.field1140 != 0 && player.field1140 != 0 && player.field1140 == ModeWhere.localPlayer.field1140) {
                                                    FontName.drawSpriteOnMinimap(n, n2, n10, n12, class464.field4957[4], spriteMask);
                                                } else if (player.method2658()) {
                                                    FontName.drawSpriteOnMinimap(n, n2, n10, n12, class464.field4957[5], spriteMask);
                                                } else if (player.method2663()) {
                                                    FontName.drawSpriteOnMinimap(n, n2, n10, n12, class464.field4957[6], spriteMask);
                                                } else {
                                                    FontName.drawSpriteOnMinimap(n, n2, n10, n12, class464.field4957[2], spriteMask);
                                                }
                                            }
                                            ++n9;
                                        }
                                    }
                                    object2 = GameEngine.field189.field1330[GameEngine.field189.field1332[n7]];
                                    if (object2 != null && ((class105)object2).isVisible()) {
                                        object = ((class105)object2).field1354;
                                        if (object != null && ((NPCComposition)object).transforms != null) {
                                            object = ((NPCComposition)object).transform();
                                        }
                                        if (object != null && ((NPCComposition)object).field2645 && ((NPCComposition)object).field2656) {
                                            n11 = ((Actor)object2).x / 32 - class53.field339.vmethod9352() / 32;
                                            n10 = ((Actor)object2).field1196 / 32 - class53.field339.vmethod9331() / 32;
                                            FontName.drawSpriteOnMinimap(n, n2, n11, n10, class464.field4957[1], spriteMask);
                                        }
                                    }
                                    ++n7;
                                }
                            }
                            for (n8 = 0; n8 < 104; ++n8) {
                                object = GameEngine.field189.field1327[GameEngine.field189.field1321][n7][n8];
                                if (object == null) continue;
                                n11 = n7 * 4 + 2 - class53.field339.vmethod9352() / 32;
                                n10 = n8 * 4 + 2 - class53.field339.vmethod9331() / 32;
                                FontName.drawSpriteOnMinimap(n, n2, n11, n10, class464.field4957[0], spriteMask);
                            }
                            ++n7;
                        }
                    }
                    n8 = Client.field658[n7] * 4 + 2 - class53.field339.vmethod9352() / 32;
                    n9 = Client.field742[n7] * 4 + 2 - class53.field339.vmethod9331() / 32;
                    FontName.drawSpriteOnMinimap(n, n2, n8, n9, Client.field719[n7], spriteMask);
                    ++n7;
                }
            }
            Rasterizer2D.Rasterizer2D_fillMaskedRectangle(n, n2, 0, spriteMask.xStarts, spriteMask.xWidths);
        }
        Client.field732[n3] = true;
    }
}

