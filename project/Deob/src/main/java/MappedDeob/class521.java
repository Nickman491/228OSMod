/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="uq")
public abstract class class521
extends class522 {
    class521(int n, int n2) {
        super(n, n2);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="634007463")
    public abstract int vmethod9687();

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1800401881")
    public abstract int vmethod9688();

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="7")
    public abstract int vmethod9689();

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;Lph;II)Lmb;", garbageValue="2107590413")
    public static PacketBufferNode method9694(int n, String string, Language language, int n2) {
        PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3396, Client.packetWriter.isaacCipher);
        packetBufferNode.packetBuffer.writeByte(0);
        int n3 = packetBufferNode.packetBuffer.offset;
        packetBufferNode.packetBuffer.writeByte(n);
        String string2 = string.toLowerCase();
        int n4 = 0;
        byte[] byArray = null;
        if (string2.startsWith("yellow:")) {
            n4 = 0;
            string = string.substring("yellow:".length());
        } else if (string2.startsWith("red:")) {
            n4 = 1;
            string = string.substring("red:".length());
        } else if (string2.startsWith("green:")) {
            n4 = 2;
            string = string.substring("green:".length());
        } else if (string2.startsWith("cyan:")) {
            n4 = 3;
            string = string.substring("cyan:".length());
        } else if (string2.startsWith("purple:")) {
            n4 = 4;
            string = string.substring("purple:".length());
        } else if (string2.startsWith("white:")) {
            n4 = 5;
            string = string.substring("white:".length());
        } else if (string2.startsWith("flash1:")) {
            n4 = 6;
            string = string.substring("flash1:".length());
        } else if (string2.startsWith("flash2:")) {
            n4 = 7;
            string = string.substring("flash2:".length());
        } else if (string2.startsWith("flash3:")) {
            n4 = 8;
            string = string.substring("flash3:".length());
        } else if (string2.startsWith("glow1:")) {
            n4 = 9;
            string = string.substring("glow1:".length());
        } else if (string2.startsWith("glow2:")) {
            n4 = 10;
            string = string.substring("glow2:".length());
        } else if (string2.startsWith("glow3:")) {
            n4 = 11;
            string = string.substring("glow3:".length());
        } else if (string2.startsWith("rainbow:")) {
            n4 = 12;
            string = string.substring("rainbow:".length());
        } else if (string2.startsWith("pattern") && (byArray = class356.method7046(string2)) != null) {
            n4 = byArray.length + 12;
            string = string.substring("pattern".length() + byArray.length + 1);
        }
        string2 = string.toLowerCase();
        int n5 = 0;
        if (string2.startsWith("wave:")) {
            n5 = 1;
            string = string.substring("wave:".length());
        } else if (string2.startsWith("wave2:")) {
            n5 = 2;
            string = string.substring("wave2:".length());
        } else if (string2.startsWith("shake:")) {
            n5 = 3;
            string = string.substring("shake:".length());
        } else if (string2.startsWith("scroll:")) {
            n5 = 4;
            string = string.substring("scroll:".length());
        } else if (string2.startsWith("slide:")) {
            n5 = 5;
            string = string.substring("slide:".length());
        }
        packetBufferNode.packetBuffer.writeByte(n4);
        packetBufferNode.packetBuffer.writeByte(n5);
        if (byArray != null) {
            for (int i = 0; i < byArray.length; ++i) {
                packetBufferNode.packetBuffer.writeByte((int)byArray[i]);
            }
        }
        class344.method6942(packetBufferNode.packetBuffer, string);
        if (n == class369.field4061.rsOrdinal()) {
            packetBufferNode.packetBuffer.writeByte(n2);
        }
        packetBufferNode.packetBuffer.method10279(packetBufferNode.packetBuffer.offset - n3);
        return packetBufferNode;
    }
}

