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

@ObfuscatedName(value="lo")
@Implements(value="WorldMapEvent")
public class WorldMapEvent {
    @ObfuscatedName(value="at")
    @Export(value="ItemDefinition_inMembersWorld")
    static boolean ItemDefinition_inMembersWorld;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1192052067)
    @Export(value="mapElement")
    public int mapElement;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lnz;")
    @Export(value="coord1")
    public Coord coord1;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lnz;")
    @Export(value="coord2")
    public Coord coord2;

    @ObfuscatedSignature(descriptor="(ILnz;Lnz;)V")
    public WorldMapEvent(int n, Coord coord, Coord coord2) {
        this.mapElement = n;
        this.coord1 = coord;
        this.coord2 = coord2;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Lpq;II)Z", garbageValue="286865598")
    public static boolean method6538(AbstractArchive abstractArchive, int n) {
        byte[] byArray = abstractArchive.takeFileFlat(n);
        if (byArray == null) {
            return false;
        }
        class443.SpriteBuffer_decode(byArray);
        return true;
    }

    @ObfuscatedName(value="iv")
    @ObfuscatedSignature(descriptor="(Lka;S)V", garbageValue="17104")
    static void method6537(class268 class2682) {
        if (class2682 != null && class2682.field2971 != null) {
            Object object;
            if (class2682.field2971.childIndex < 0 || (object = ClanChannel.field1807.method7031(class2682.field2971.parentId)) != null && ((Widget)object).children != null && ((Widget)object).children.length != 0 && class2682.field2971.childIndex < ((Widget)object).children.length && class2682.field2971 == ((Widget)object).children[class2682.field2971.childIndex]) {
                if (class2682.field2971.type == 11 && class2682.field2970 == 0) {
                    if (class2682.field2971.method7432(class2682.field2968, class2682.field2969, 0, 0)) {
                        class2682.field2971.method7440().method4873().method4976(1, class2682.field2971.method7440().method4853());
                        switch (class2682.field2971.method7441()) {
                            case 1: {
                                int[] nArray;
                                boolean bl;
                                int n = class232.getWidgetFlags(class2682.field2971);
                                boolean bl2 = bl = (n >> 22 & 1) != 0;
                                if (!bl || (nArray = class2682.field2971.method7536()) == null) break;
                                PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3390, Client.packetWriter.isaacCipher);
                                packetBufferNode.packetBuffer.method10331(nArray[2]);
                                packetBufferNode.packetBuffer.method10268(class2682.field2971.method7437());
                                packetBufferNode.packetBuffer.method10332(nArray[1]);
                                packetBufferNode.packetBuffer.method10331(nArray[0]);
                                packetBufferNode.packetBuffer.writeShort(class2682.field2971.childIndex);
                                packetBufferNode.packetBuffer.method10332(class2682.field2971.id);
                                Client.packetWriter.addNode(packetBufferNode);
                                break;
                            }
                            case 0: {
                                WorldMapRectangle.openURL(class2682.field2971.method7436(), true, false);
                            }
                        }
                    }
                } else if (class2682.field2971.type == 12 && (object = class2682.field2971.method7444()) != null && ((class359)object).method7181()) {
                    switch (class2682.field2970) {
                        case 1: {
                            ((class359)object).method7169(class2682.field2968, class2682.field2969);
                            break;
                        }
                        case 0: {
                            Client.field575.method5727(class2682.field2971);
                            ((class359)object).method7129(true);
                            ((class359)object).method7317(class2682.field2968, class2682.field2969, Client.field731.method5776(82), Client.field731.method5776(81));
                        }
                    }
                }
                return;
            }
            return;
        }
    }
}

