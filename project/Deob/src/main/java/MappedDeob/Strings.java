/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ox")
@Implements(value="Strings")
public class Strings {
    @ObfuscatedName(value="fc")
    public static String field4301 = "Please visit the support page for assistance.";
    @ObfuscatedName(value="kg")
    public static String field4256 = "";
    @ObfuscatedName(value="ki")
    public static String field4410 = "Page has opened in the browser.";
    @ObfuscatedName(value="ln")
    public static String field4439 = "";

    @ObfuscatedName(value="gx")
    @ObfuscatedSignature(descriptor="(Lmb;B)V", garbageValue="71")
    static void method7645(PacketBufferNode packetBufferNode) {
        packetBufferNode.packetBuffer.method10331(class221.field2421.hash);
        packetBufferNode.packetBuffer.method10331(class220.archive13.hash);
        packetBufferNode.packetBuffer.method10268(class544.field5399.hash);
        packetBufferNode.packetBuffer.method10332(ClanSettings.field1762.hash);
        packetBufferNode.packetBuffer.method10331(PcmPlayer.field276.hash);
        packetBufferNode.packetBuffer.method10331(class166.archive10.hash);
        packetBufferNode.packetBuffer.method10333(World.field815.hash);
    }
}

