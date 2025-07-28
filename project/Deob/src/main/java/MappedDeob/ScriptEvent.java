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

@ObfuscatedName(value="df")
@Implements(value="ScriptEvent")
public class ScriptEvent
extends Node {
    @ObfuscatedName(value="ay")
    @Export(value="args")
    Object[] args;
    @ObfuscatedName(value="ah")
    boolean field1075;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lna;")
    @Export(value="widget")
    Widget widget;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1190012531)
    @Export(value="mouseX")
    int mouseX;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=1402240027)
    @Export(value="mouseY")
    int mouseY;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=904758891)
    @Export(value="opIndex")
    int opIndex;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1860502355)
    int field1081;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lna;")
    @Export(value="dragTarget")
    Widget dragTarget;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1432134479)
    @Export(value="keyTyped")
    int keyTyped;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=1241265743)
    int field1084;
    @ObfuscatedName(value="au")
    @Export(value="targetName")
    String targetName;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-1852724295)
    int field1080;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-212291339)
    @Export(value="type")
    int type = 76;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([Ljava/lang/Object;I)V", garbageValue="1177676751")
    @Export(value="setArgs")
    public void setArgs(Object[] objectArray) {
        this.args = objectArray;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1971710567")
    @Export(value="setType")
    public void setType(int n) {
        this.type = n;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lna;S)V", garbageValue="-4216")
    public void method2628(Widget widget) {
        this.widget = widget;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lmm;Lwr;B)Lmb;", garbageValue="18")
    @Export(value="getPacketBufferNode")
    public static PacketBufferNode getPacketBufferNode(ClientPacket clientPacket, IsaacCipher isaacCipher) {
        PacketBufferNode packetBufferNode = class19.method288();
        packetBufferNode.clientPacket = clientPacket;
        packetBufferNode.clientPacketLength = clientPacket.length;
        packetBufferNode.packetBuffer = packetBufferNode.clientPacketLength == -1 ? new PacketBuffer(260) : (packetBufferNode.clientPacketLength == -2 ? new PacketBuffer(10000) : (packetBufferNode.clientPacketLength <= 18 ? new PacketBuffer(20) : (packetBufferNode.clientPacketLength <= 98 ? new PacketBuffer(100) : new PacketBuffer(260))));
        packetBufferNode.packetBuffer.setIsaacCipher(isaacCipher);
        packetBufferNode.packetBuffer.writeByteIsaac(packetBufferNode.clientPacket.id);
        packetBufferNode.index = 0;
        return packetBufferNode;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1400630297")
    public static void method2622(int n) {
        if (class333.field3623.isEmpty()) return;
        Object object = class333.field3623.iterator();
        while (true) {
            if (!object.hasNext()) {
                object = (class345)class333.field3623.get(0);
                if (object == null || ((class345)object).field3743 == null || !((class345)object).field3743.isReady() || ((class345)object).field3745) return;
                ((class345)object).field3743.setPcmStreamVolume(n);
                ((class345)object).field3739 = n;
                return;
            }
            class345 class3452 = (class345)object.next();
            if (class3452 == null) continue;
            class3452.field3738 = n;
        }
    }
}

