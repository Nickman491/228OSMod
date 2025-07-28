/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ob")
public class class378 {
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lpq;Ljava/lang/String;Ljava/lang/String;B)[Lvf;", garbageValue="85")
    public static SpritePixels[] method7637(AbstractArchive abstractArchive, String string, String string2) {
        if (!abstractArchive.isValidFileName(string, string2)) {
            return null;
        }
        int n = abstractArchive.getGroupId(string);
        int n2 = abstractArchive.getFileId(n, string2);
        return AbstractSocket.method9404(abstractArchive, n, n2);
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="175783721")
    static final void method7636(String string) {
        PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3346, Client.packetWriter.isaacCipher);
        packetBufferNode.packetBuffer.writeByte(MouseRecorder.stringCp1252NullTerminatedByteSize(string));
        packetBufferNode.packetBuffer.writeStringCp1252NullTerminated(string);
        Client.packetWriter.addNode(packetBufferNode);
    }

    @ObfuscatedName(value="hy")
    @ObfuscatedSignature(descriptor="(IIII)V", garbageValue="-334790907")
    @Export(value="queueSoundEffect")
    static void queueSoundEffect(int n, int n2, int n3) {
        if (class544.clientPreferences.method2898() != 0 && n2 != 0 && Client.soundEffectCount < 50) {
            Client.soundEffectIds[Client.soundEffectCount] = n;
            Client.queuedSoundEffectLoops[Client.soundEffectCount] = n2;
            Client.queuedSoundEffectDelays[Client.soundEffectCount] = n3;
            Client.soundEffects[Client.soundEffectCount] = null;
            Client.soundLocations[Client.soundEffectCount] = 0;
            Client.field753[Client.soundEffectCount] = 0;
            ++Client.soundEffectCount;
        }
    }
}

