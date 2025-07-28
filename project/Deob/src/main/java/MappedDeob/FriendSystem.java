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
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cd")
@Implements(value="FriendSystem")
public class FriendSystem {
    @ObfuscatedName(value="ku")
    @ObfuscatedSignature(descriptor="[Lvi;")
    static IndexedSprite[] field829;
    @ObfuscatedName(value="uc")
    @ObfuscatedGetter(intValue=-721230967)
    static int field830;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Luo;")
    @Export(value="loginType")
    final LoginType loginType;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lsi;")
    @Export(value="friendsList")
    public final FriendsList friendsList;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lru;")
    @Export(value="ignoreList")
    public final IgnoreList ignoreList;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1560136083)
    int field827 = 0;

    @ObfuscatedSignature(descriptor="(Luo;)V")
    FriendSystem(LoginType loginType) {
        this.loginType = loginType;
        this.friendsList = new FriendsList(loginType);
        this.ignoreList = new IgnoreList(loginType);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1622484082")
    boolean method2019() {
        return this.field827 == 2;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1621276437")
    final void method2066() {
        this.field827 = 1;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="1207581411")
    @Export(value="readUpdate")
    final void readUpdate(Buffer buffer, int n) {
        this.friendsList.read(buffer, n);
        this.field827 = 2;
        Iterator iterator = Client.field508.iterator();
        block0: while (true) {
            if (!iterator.hasNext()) {
                Interpreter.method2269();
                if (WorldMapLabelSize.friendsChat != null) {
                    WorldMapLabelSize.friendsChat.method9112();
                }
                return;
            }
            class103 class1032 = (class103)iterator.next();
            int n2 = 0;
            while (true) {
                if (n2 >= Client.field673.field1406) continue block0;
                Player player = class1032.field1329[Client.field673.field1412[n2]];
                if (player != null) {
                    player.method2656();
                }
                ++n2;
            }
            break;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="911863708")
    @Export(value="processFriendUpdates")
    final void processFriendUpdates() {
        FriendLoginUpdate friendLoginUpdate = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last();
        while (friendLoginUpdate != null) {
            if ((long)friendLoginUpdate.field4997 < ReflectionCheck.method724() / 1000L - 5L) {
                if (friendLoginUpdate.world > 0) {
                    Interpreter.addGameMessage(5, "", friendLoginUpdate.username + " has logged in.");
                }
                if (friendLoginUpdate.world == 0) {
                    Interpreter.addGameMessage(5, "", friendLoginUpdate.username + " has logged out.");
                }
                friendLoginUpdate.remove();
            }
            friendLoginUpdate = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous();
        }
        return;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="18")
    @Export(value="clear")
    final void clear() {
        this.field827 = 0;
        this.friendsList.clear();
        this.ignoreList.clear();
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lwb;ZB)Z", garbageValue="0")
    @Export(value="isFriended")
    final boolean isFriended(Username username, boolean bl) {
        if (username == null) {
            return false;
        }
        if (username.equals(ModeWhere.localPlayer.username)) {
            return true;
        }
        return this.friendsList.isFriended(username, bl);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lwb;I)Z", garbageValue="-1462398022")
    @Export(value="isIgnored")
    final boolean isIgnored(Username username) {
        if (username == null) {
            return false;
        }
        return this.ignoreList.contains(username);
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="-85")
    @Export(value="addFriend")
    final void addFriend(String string) {
        if (string == null) {
            return;
        }
        Username username = new Username(string, this.loginType);
        if (!username.hasCleanName()) {
            return;
        }
        if (!this.friendsListIsFull()) {
            if (!ModeWhere.localPlayer.username.equals(username)) {
                if (!this.isFriended(username, false)) {
                    if (!this.isIgnored(username)) {
                        PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3374, Client.packetWriter.isaacCipher);
                        packetBufferNode.packetBuffer.writeByte(MouseRecorder.stringCp1252NullTerminatedByteSize(string));
                        packetBufferNode.packetBuffer.writeStringCp1252NullTerminated(string);
                        Client.packetWriter.addNode(packetBufferNode);
                        return;
                    }
                    SoundCache.method897(string);
                    return;
                }
                class178.method3989(string);
                return;
            }
            class7.method58();
            return;
        }
        class440.method8812();
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-752792445")
    @Export(value="friendsListIsFull")
    final boolean friendsListIsFull() {
        return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field628 != 1;
        {
        }
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="1315844068")
    @Export(value="addIgnore")
    final void addIgnore(String string) {
        if (string == null) {
            return;
        }
        Username username = new Username(string, this.loginType);
        if (!username.hasCleanName()) {
            return;
        }
        if (!this.canAddIgnore()) {
            if (!ModeWhere.localPlayer.username.equals(username)) {
                if (!this.isIgnored(username)) {
                    if (!this.isFriended(username, false)) {
                        class378.method7636(string);
                        return;
                    }
                    String string2 = "Please remove " + string + " from your friend list first";
                    Interpreter.addGameMessage(30, "", string2);
                    return;
                }
                class405.method7966(string);
                return;
            }
            String string3 = "You can't add yourself to your own ignore list";
            Interpreter.addGameMessage(30, "", string3);
            return;
        }
        class19.method287();
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="78734807")
    @Export(value="canAddIgnore")
    final boolean canAddIgnore() {
        return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field628 != 1;
        {
        }
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="866716320")
    @Export(value="removeFriend")
    final void removeFriend(String string) {
        Object object;
        if (string == null) {
            return;
        }
        Username username = new Username(string, this.loginType);
        if (!username.hasCleanName()) {
            return;
        }
        if (this.friendsList.removeByUsername(username)) {
            class327.method6639();
            object = ScriptEvent.getPacketBufferNode(ClientPacket.field3403, Client.packetWriter.isaacCipher);
            ((PacketBufferNode)object).packetBuffer.writeByte(MouseRecorder.stringCp1252NullTerminatedByteSize(string));
            ((PacketBufferNode)object).packetBuffer.writeStringCp1252NullTerminated(string);
            Client.packetWriter.addNode((PacketBufferNode)object);
        }
        object = Client.field508.iterator();
        block0: while (true) {
            if (!object.hasNext()) {
                Interpreter.method2269();
                if (WorldMapLabelSize.friendsChat != null) {
                    WorldMapLabelSize.friendsChat.method9112();
                }
                return;
            }
            class103 class1032 = (class103)object.next();
            int n = 0;
            while (true) {
                if (n >= Client.field673.field1406) continue block0;
                Player player = class1032.field1329[Client.field673.field1412[n]];
                if (player != null) {
                    player.method2656();
                }
                ++n;
            }
            break;
        }
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;ZB)V", garbageValue="-54")
    public final void method2031(String string, boolean bl) {
        if (string == null) {
            return;
        }
        Username username = new Username(string, this.loginType);
        if (!username.hasCleanName()) {
            return;
        }
        if (this.ignoreList.removeByUsername(username)) {
            class327.method6639();
            if (bl) {
                PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3399, Client.packetWriter.isaacCipher);
                packetBufferNode.packetBuffer.writeByte(MouseRecorder.stringCp1252NullTerminatedByteSize(string));
                packetBufferNode.packetBuffer.writeStringCp1252NullTerminated(string);
                Client.packetWriter.addNode(packetBufferNode);
            }
        }
        class328.FriendSystem_invalidateIgnoreds();
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(Lwb;I)Z", garbageValue="-1126787481")
    @Export(value="isFriendAndHasWorld")
    final boolean isFriendAndHasWorld(Username username) {
        Friend friend = (Friend)this.friendsList.getByUsername(username);
        return friend != null && friend.hasWorld();
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIII)I", garbageValue="584905582")
    static final int method2089(int n, int n2, int n3, int n4) {
        return n * n3 + n4 * n2 >> 16;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="jp")
    @ObfuscatedSignature(descriptor="(ZLvv;I)V", garbageValue="1634524342")
    @Export(value="loadRegions")
    static final void loadRegions(boolean bl, PacketBuffer packetBuffer) {
        Client.isInInstance = bl;
        if (Client.isInInstance) {
            int n = packetBuffer.method10334();
            int n2 = packetBuffer.readUnsignedShort();
            boolean bl2 = packetBuffer.method10312() == 1;
            int n3 = packetBuffer.readUnsignedShort();
            packetBuffer.method10226();
            int n4 = 0;
            while (true) {
                int n5;
                int n6;
                int n7;
                if (n4 >= 4) {
                    packetBuffer.exportIndex();
                    MusicPatchPcmStream.field3705 = new int[n3][4];
                    n4 = 0;
                    while (true) {
                        if (n4 >= n3) {
                            TextureProvider.field2157 = new int[n3];
                            class92.field1101 = new int[n3];
                            GrandExchangeOfferNameComparator.field4630 = new int[n3];
                            class20.field88 = new byte[n3][];
                            WorldMapCacheName.field3270 = new byte[n3][];
                            n3 = 0;
                            n4 = 0;
                            while (true) {
                                if (n4 >= 4) {
                                    class188.method4437(n, n2, !bl2);
                                    return;
                                }
                                block3: for (n7 = 0; n7 < 13; ++n7) {
                                    n6 = 0;
                                    while (true) {
                                        if (n6 >= 13) {
                                            continue block3;
                                        }
                                        n5 = Client.field577[n4][n7][n6];
                                        if (n5 != -1) {
                                            int n8;
                                            int n9 = n5 >> 14 & 0x3FF;
                                            int n10 = n5 >> 3 & 0x7FF;
                                            int n11 = (n9 / 8 << 8) + n10 / 8;
                                            for (n8 = 0; n8 < n3; ++n8) {
                                                if (TextureProvider.field2157[n8] != n11) {
                                                    continue;
                                                }
                                                n11 = -1;
                                                break;
                                            }
                                            if (n11 != -1) {
                                                TextureProvider.field2157[n3] = n11;
                                                n8 = n11 >> 8 & 0xFF;
                                                int n12 = n11 & 0xFF;
                                                class92.field1101[n3] = class68.field494.getGroupId("m" + n8 + "_" + n12);
                                                GrandExchangeOfferNameComparator.field4630[n3] = class68.field494.getGroupId("l" + n8 + "_" + n12);
                                                ++n3;
                                            }
                                        }
                                        ++n6;
                                    }
                                }
                                ++n4;
                            }
                        }
                        for (n7 = 0; n7 < 4; ++n7) {
                            MusicPatchPcmStream.field3705[n4][n7] = packetBuffer.readInt();
                        }
                        ++n4;
                    }
                }
                block7: for (n7 = 0; n7 < 13; ++n7) {
                    n6 = 0;
                    while (true) {
                        if (n6 >= 13) {
                            continue block7;
                        }
                        n5 = packetBuffer.readBits(1);
                        Client.field577[n4][n7][n6] = n5 == 1 ? packetBuffer.readBits(26) : -1;
                        ++n6;
                    }
                }
                ++n4;
            }
        }
        int n = packetBuffer.method10334();
        int n13 = packetBuffer.readUnsignedShort();
        packetBuffer.method10326();
        int n14 = packetBuffer.readUnsignedShort();
        MusicPatchPcmStream.field3705 = new int[n14][4];
        int n15 = 0;
        while (true) {
            int n16;
            if (n15 >= n14) {
                TextureProvider.field2157 = new int[n14];
                class92.field1101 = new int[n14];
                GrandExchangeOfferNameComparator.field4630 = new int[n14];
                class20.field88 = new byte[n14][];
                WorldMapCacheName.field3270 = new byte[n14][];
                n14 = 0;
                n15 = (n13 - 6) / 8;
                while (true) {
                    if (n15 > (n13 + 6) / 8) {
                        class188.method4437(n13, n, true);
                        return;
                    }
                    for (n16 = (n - 6) / 8; n16 <= (n + 6) / 8; ++n16) {
                        int n17;
                        TextureProvider.field2157[n14] = n17 = n16 + (n15 << 8);
                        class92.field1101[n14] = class68.field494.getGroupId("m" + n15 + "_" + n16);
                        GrandExchangeOfferNameComparator.field4630[n14] = class68.field494.getGroupId("l" + n15 + "_" + n16);
                        ++n14;
                    }
                    ++n15;
                }
            }
            for (n16 = 0; n16 < 4; ++n16) {
                MusicPatchPcmStream.field3705[n15][n16] = packetBuffer.readInt();
            }
            ++n15;
        }
    }

    @ObfuscatedName(value="jz")
    @ObfuscatedSignature(descriptor="(IIIIIB)V", garbageValue="10")
    static final void method2046(int n, int n2, int n3, int n4, int n5) {
        int n6;
        Object object;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        class187 class1872 = GameEngine.field189.field1319;
        long l = class1872.method4395(n, n2, n3);
        if (0L != l) {
            n13 = class1872.method4192(n, n2, n3, l);
            n12 = n13 >> 6 & 3;
            n11 = n13 & 0x1F;
            n10 = n4;
            int n14 = n9 = l != 0L ? 1 : 0;
            if (n9 != 0) {
                n8 = (int)(l >>> 16 & 1L) == 1 ? 1 : 0;
                int n15 = n9 = n8 == 0 ? 1 : 0;
            }
            if ((n7 = n9) != 0) {
                n10 = n5;
            }
            object = class174.sceneMinimapSprite.pixels;
            n8 = n2 * 4 + (103 - n3) * 2048 + 24624;
            n6 = class360.method7406(l);
            ObjectComposition objectComposition = class142.getObjectDefinition(n6);
            if (objectComposition.mapSceneId == -1) {
                if (n11 == 0 || n11 == 2) {
                    if (n12 != 0) {
                        if (n12 != 1) {
                            if (n12 != 2) {
                                if (n12 == 3) {
                                    object[n8 + 1536] = n10;
                                    object[n8 + 1536 + 1] = n10;
                                    object[n8 + 1536 + 2] = n10;
                                    object[n8 + 1536 + 3] = n10;
                                }
                            } else {
                                object[n8 + 3] = n10;
                                object[n8 + 512 + 3] = n10;
                                object[n8 + 1024 + 3] = n10;
                                object[n8 + 1536 + 3] = n10;
                            }
                        } else {
                            object[n8] = n10;
                            object[n8 + 1] = n10;
                            object[n8 + 2] = n10;
                            object[n8 + 3] = n10;
                        }
                    } else {
                        object[n8] = n10;
                        object[n8 + 512] = n10;
                        object[n8 + 1024] = n10;
                        object[n8 + 1536] = n10;
                    }
                }
                if (n11 == 3) {
                    if (n12 == 0) {
                        object[n8] = n10;
                    } else if (n12 == 1) {
                        object[n8 + 3] = n10;
                    } else if (n12 == 2) {
                        object[n8 + 1536 + 3] = n10;
                    } else if (n12 == 3) {
                        object[n8 + 1536] = n10;
                    }
                }
                if (n11 == 2) {
                    if (n12 != 3) {
                        if (n12 != 0) {
                            if (n12 != 1) {
                                if (n12 == 2) {
                                    object[n8 + 1536] = n10;
                                    object[n8 + 1536 + 1] = n10;
                                    object[n8 + 1536 + 2] = n10;
                                    object[n8 + 1536 + 3] = n10;
                                }
                            } else {
                                object[n8 + 3] = n10;
                                object[n8 + 512 + 3] = n10;
                                object[n8 + 1024 + 3] = n10;
                                object[n8 + 1536 + 3] = n10;
                            }
                        } else {
                            object[n8] = n10;
                            object[n8 + 1] = n10;
                            object[n8 + 2] = n10;
                            object[n8 + 3] = n10;
                        }
                    } else {
                        object[n8] = n10;
                        object[n8 + 512] = n10;
                        object[n8 + 1024] = n10;
                        object[n8 + 1536] = n10;
                    }
                }
            } else {
                IndexedSprite indexedSprite = class155.field1709[objectComposition.mapSceneId];
                if (indexedSprite != null) {
                    int n16 = (objectComposition.sizeX * 4 - indexedSprite.subWidth) / 2;
                    int n17 = (objectComposition.sizeY * 4 - indexedSprite.subHeight) / 2;
                    indexedSprite.drawAt(n2 * 4 + n16 + 48, (104 - n3 - objectComposition.sizeY) * 4 + n17 + 48);
                }
            }
        }
        if (0L != (l = class1872.method4202(n, n2, n3))) {
            n13 = class1872.method4192(n, n2, n3, l);
            n12 = n13 >> 6 & 3;
            n11 = n13 & 0x1F;
            n10 = class360.method7406(l);
            ObjectComposition objectComposition = class142.getObjectDefinition(n10);
            if (objectComposition.mapSceneId == -1) {
                if (n11 == 9) {
                    int n18;
                    n9 = 0xEEEEEE;
                    int n19 = n6 = l != 0L ? 1 : 0;
                    if (n6 != 0) {
                        n18 = (int)(l >>> 16 & 1L) == 1 ? 1 : 0;
                        int n20 = n6 = n18 == 0 ? 1 : 0;
                    }
                    if ((n8 = n6) != 0) {
                        n9 = 0xEE0000;
                    }
                    int[] nArray = class174.sceneMinimapSprite.pixels;
                    n18 = n2 * 4 + (103 - n3) * 2048 + 24624;
                    if (n12 != 0 && n12 != 2) {
                        nArray[n18] = n9;
                        nArray[n18 + 1 + 512] = n9;
                        nArray[n18 + 1024 + 2] = n9;
                        nArray[n18 + 1536 + 3] = n9;
                    } else {
                        nArray[n18 + 1536] = n9;
                        nArray[n18 + 1 + 1024] = n9;
                        nArray[n18 + 512 + 2] = n9;
                        nArray[n18 + 3] = n9;
                    }
                }
            } else {
                object = class155.field1709[objectComposition.mapSceneId];
                if (object != null) {
                    n8 = (objectComposition.sizeX * 4 - ((IndexedSprite)object).subWidth) / 2;
                    n6 = (objectComposition.sizeY * 4 - ((IndexedSprite)object).subHeight) / 2;
                    ((IndexedSprite)object).drawAt(n2 * 4 + n8 + 48, n6 + (104 - n3 - objectComposition.sizeY) * 4 + 48);
                }
            }
        }
        if (0L != (l = class1872.method4203(n, n2, n3))) {
            IndexedSprite indexedSprite;
            n13 = class360.method7406(l);
            ObjectComposition objectComposition = class142.getObjectDefinition(n13);
            if (objectComposition.mapSceneId != -1 && (indexedSprite = class155.field1709[objectComposition.mapSceneId]) != null) {
                n10 = (objectComposition.sizeX * 4 - indexedSprite.subWidth) / 2;
                n7 = (objectComposition.sizeY * 4 - indexedSprite.subHeight) / 2;
                indexedSprite.drawAt(n10 + n2 * 4 + 48, n7 + (104 - n3 - objectComposition.sizeY) * 4 + 48);
            }
        }
    }
}

