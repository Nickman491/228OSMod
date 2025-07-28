/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ce")
public class class75 {
    @ObfuscatedName(value="ad")
    static final BigInteger field897 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
    @ObfuscatedName(value="an")
    static final BigInteger field900 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIS)I", garbageValue="4804")
    static int method2360(int n, int n2) {
        ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.get(n);
        if (itemContainer == null) {
            return 0;
        }
        if (n2 == -1) {
            return 0;
        }
        int n3 = 0;
        int n4 = 0;
        while (n4 < itemContainer.quantities.length) {
            if (itemContainer.ids[n4] == n2) {
                n3 += itemContainer.quantities[n4];
            }
            ++n4;
        }
        return n3;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(IIII)I", garbageValue="1630366833")
    static final int method2359(int n, int n2, int n3) {
        int n4 = n / n3;
        int n5 = n & n3 - 1;
        int n6 = n2 / n3;
        int n7 = n2 & n3 - 1;
        int n8 = class374.method7622(n4, n6);
        int n9 = class374.method7622(n4 + 1, n6);
        int n10 = class374.method7622(n4, n6 + 1);
        int n11 = class374.method7622(n4 + 1, n6 + 1);
        int n12 = ObjectComposition.method5559(n8, n9, n5, n3);
        int n13 = ObjectComposition.method5559(n10, n11, n5, n3);
        return ObjectComposition.method5559(n12, n13, n7, n3);
    }

    @ObfuscatedName(value="nn")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-1194165105")
    @Export(value="Clan_joinChat")
    static final void Clan_joinChat(String string) {
        if (string.equals("")) {
            return;
        }
        PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3405, Client.packetWriter.isaacCipher);
        packetBufferNode.packetBuffer.writeByte(MouseRecorder.stringCp1252NullTerminatedByteSize(string));
        packetBufferNode.packetBuffer.writeStringCp1252NullTerminated(string);
        Client.packetWriter.addNode(packetBufferNode);
    }
}

