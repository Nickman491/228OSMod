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
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cf")
@Implements(value="ScriptFrame")
public class ScriptFrame {
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=688799447)
    @Export(value="Interpreter_intStackSize")
    static int Interpreter_intStackSize;
    @ObfuscatedName(value="cy")
    @ObfuscatedSignature(descriptor="Lph;")
    @Export(value="clientLanguage")
    static Language clientLanguage;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ldm;")
    Script field442;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1296451257)
    int field440 = -1;
    @ObfuscatedName(value="az")
    @Export(value="intLocals")
    int[] intLocals;
    @ObfuscatedName(value="ao")
    @Export(value="stringLocals")
    String[] stringLocals;

    ScriptFrame() {
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;II)I", garbageValue="-404819722")
    public static int method1232(CharSequence charSequence, int n) {
        return class141.method3510(charSequence, n, true);
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="104")
    static final boolean method1231(int n) {
        return n == 2 || n == 8 || n == 25 || n == 17 || n == 25;
    }

    @ObfuscatedName(value="gh")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="15")
    static void method1230() {
        int n;
        Client.field787 = 1L;
        if (class168.field1794 != null) {
            class168.field1794.index = 0;
        }
        SecureRandomFuture.hasFocus = true;
        Client.field520 = true;
        Client.field740 = -1L;
        class36.reflectionChecks = new IterableNodeDeque();
        Client.packetWriter.clearBuffer();
        Client.packetWriter.field1456 = 0;
        Client.packetWriter.packetBuffer.offset = 0;
        Client.packetWriter.serverPacket = null;
        Client.packetWriter.field1458 = null;
        Client.packetWriter.field1447 = null;
        Client.packetWriter.field1460 = null;
        Client.packetWriter.field1452 = 0;
        Client.packetWriter.field1454 = 0;
        Client.rebootTimer = 0;
        Client.logoutTimer = 0;
        Client.field565 = 0;
        class188.method4443();
        MouseHandler.MouseHandler_idleCycles = 0;
        class277.method5948();
        Client.isItemSelected = 0;
        Client.isSpellSelected = false;
        Client.soundEffectCount = 0;
        Client.camAngleY = 0;
        Client.titleLoadingStage = 0;
        class184.field1975 = null;
        Client.minimapState = 0;
        Client.field739 = -1;
        Client.field744 = 0;
        Client.field745 = 0;
        Client.playerAttackOption = AttackOption.field1380;
        Client.npcAttackOption = AttackOption.field1380;
        Client.field508.method2723();
        Client.field673.method3139();
        class10.friendSystem.clear();
        if (VarpDefinition.field2505 > 5000) {
            // empty if block
        }
        if (!Client.field512) {
            for (n = 0; n < VarpDefinition.field2505; ++n) {
                VarpDefinition varpDefinition = class254.VarpDefinition_get(n);
                if (varpDefinition == null) continue;
                Varps.Varps_temp[n] = 0;
                Varps.Varps_main[n] = 0;
            }
        } else {
            ObjectSound.method2104();
        }
        if (class19.varcs != null) {
            class19.varcs.clearTransient();
        }
        Client.followerIndex = -1;
        if (Client.rootInterface != -1) {
            ClanChannel.field1807.method7021(Client.rootInterface);
        }
        Node node = (InterfaceParent)Client.interfaceParents.first();
        while (true) {
            if (node == null) {
                Client.rootInterface = -1;
                Client.interfaceParents = new NodeHashTable(8);
                Client.meslayerContinueWidget = null;
                class188.method4443();
                Client.playerAppearance.method7056(null, null, new int[]{0, 0, 0, 0, 0}, 0, -1);
                n = 0;
                while (true) {
                    if (n >= 8) {
                        Tiles.method2571();
                        Client.field513 = true;
                        for (n = 0; n < 100; ++n) {
                            Client.field713[n] = true;
                        }
                        if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
                            node = ScriptEvent.getPacketBufferNode(ClientPacket.field3337, Client.packetWriter.isaacCipher);
                            ((PacketBufferNode)node).packetBuffer.writeByte(TextureProvider.getWindowedMode());
                            ((PacketBufferNode)node).packetBuffer.writeShort(BuddyRankComparator.canvasWidth);
                            ((PacketBufferNode)node).packetBuffer.writeShort(Huffman.canvasHeight);
                            Client.packetWriter.addNode((PacketBufferNode)node);
                        }
                        WorldMapLabelSize.friendsChat = null;
                        InvDefinition.guestClanSettings = null;
                        Arrays.fill(Client.currentClanSettings, null);
                        class106.guestClanChannel = null;
                        Arrays.fill(Client.currentClanChannels, null);
                        for (n = 0; n < 8; ++n) {
                            Client.grandExchangeOffers[n] = new GrandExchangeOffer();
                        }
                        class328.grandExchangeEvents = null;
                        Client.viewportOffsetX = 0;
                        Client.viewportOffsetY = 0;
                        Client.viewportWidth = 0;
                        Client.viewportHeight = 0;
                        return;
                    }
                    Client.field638[n] = null;
                    Client.field639[n] = false;
                    ++n;
                }
            }
            NPCComposition.closeInterface(node, true);
            node = (InterfaceParent)Client.interfaceParents.next();
        }
    }

    @ObfuscatedName(value="os")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-1288710563")
    static void method1229(boolean bl) {
        Client.leftClickOpensMenu = bl;
    }
}

