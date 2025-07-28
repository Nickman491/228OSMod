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

@ObfuscatedName(value="gu")
public final class class181
extends Node {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-774877491)
    int field1944;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=619029883)
    int field1929;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1814724795)
    int field1939;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1118517245)
    int field1931;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lhz;")
    SceneTilePaint field1932;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lho;")
    class196 field1942;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lha;")
    class206 field1934;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lie;")
    class208 field1935;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lgi;")
    class178 field1936;
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lgj;")
    class176 field1930;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=593224731)
    int field1938;
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="[Lik;")
    class209[] field1943 = new class209[5];
    @ObfuscatedName(value="af")
    int[] field1940 = new int[5];
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-858281711)
    int field1941 = 0;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-885550693)
    int field1937;
    @ObfuscatedName(value="al")
    boolean field1928;
    @ObfuscatedName(value="av")
    boolean field1948;
    @ObfuscatedName(value="ag")
    boolean field1945;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=1214984083)
    int field1950;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=243927097)
    int field1947;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=1869939313)
    int field1946;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=-64519713)
    int field1949;
    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="Lgu;")
    class181 field1933;

    class181(int n, int n2, int n3) {
        this.field1931 = this.field1944 = n;
        this.field1929 = n2;
        this.field1939 = n3;
    }

    @ObfuscatedName(value="hc")
    @ObfuscatedSignature(descriptor="(Lna;IIB)V", garbageValue="119")
    @Export(value="checkIfMinimapClicked")
    static final void checkIfMinimapClicked(Widget widget, int n, int n2) {
        if (Client.minimapState != 0 && Client.minimapState != 3) {
            return;
        }
        if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
            SpriteMask spriteMask = widget.method7446(ClanChannel.field1807, true);
            if (spriteMask == null) {
                return;
            }
            int n3 = MouseHandler.MouseHandler_lastPressedX - n;
            int n4 = MouseHandler.MouseHandler_lastPressedY - n2;
            if (spriteMask.contains(n3, n4)) {
                int n5 = Client.camAngleY & 0x7FF;
                int n6 = SceneTileModel.field1954[n5];
                int n7 = SceneTileModel.Rasterizer3D_cosine[n5];
                int n8 = n6 * (n4 -= spriteMask.height / 2) + n7 * (n3 -= spriteMask.width / 2) >> 11;
                int n9 = n7 * n4 - n6 * n3 >> 11;
                int n10 = class53.field339.vmethod9352() + n8 >> 7;
                int n11 = class53.field339.vmethod9331() - n9 >> 7;
                PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3336, Client.packetWriter.isaacCipher);
                packetBufferNode.packetBuffer.writeByte(18);
                packetBufferNode.packetBuffer.writeByte(Client.field731.method5776(82) ? (Client.field731.method5776(81) ? 2 : 1) : 0);
                packetBufferNode.packetBuffer.writeShort(n11 + GameEngine.field189.field1325);
                packetBufferNode.packetBuffer.writeInt(n10 + GameEngine.field189.field1324);
                packetBufferNode.packetBuffer.writeByte(n3);
                packetBufferNode.packetBuffer.writeByte(n4);
                packetBufferNode.packetBuffer.writeShort(Client.camAngleY);
                packetBufferNode.packetBuffer.writeByte(57);
                packetBufferNode.packetBuffer.writeByte(0);
                packetBufferNode.packetBuffer.writeByte(0);
                packetBufferNode.packetBuffer.writeByte(89);
                packetBufferNode.packetBuffer.writeShort(ModeWhere.localPlayer.x);
                packetBufferNode.packetBuffer.writeShort(ModeWhere.localPlayer.field1196);
                packetBufferNode.packetBuffer.writeByte(63);
                Client.packetWriter.addNode(packetBufferNode);
                Client.field744 = n10;
                Client.field745 = n11;
            }
        }
    }
}

