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

@ObfuscatedName(value="td")
public class class506 {
    @ObfuscatedName(value="an")
    static final int[] field5147 = new int[16384];
    @ObfuscatedName(value="ae")
    static final int[] field5148 = new int[16384];

    static {
        double d = 3.834951969714103E-4;
        int n = 0;
        while (n < 16384) {
            class506.field5147[n] = (int)(16384.0 * Math.sin((double)n * d));
            class506.field5148[n] = (int)(16384.0 * Math.cos((double)n * d));
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Throwable;Ljava/lang/String;)Lwg;")
    @Export(value="newRunException")
    public static RunException newRunException(Throwable throwable, String string) {
        RunException runException;
        if (!(throwable instanceof RunException)) {
            runException = new RunException(throwable, string);
        } else {
            runException = (RunException)throwable;
            runException.message = runException.message + ' ' + string;
        }
        return runException;
    }

    @ObfuscatedName(value="nj")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="399679247")
    static final void method9591(int n, int n2) {
        if (Client.currentClanChannels[n] == null) {
            return;
        }
        if (n2 >= 0 && n2 < Client.currentClanChannels[n].method3837()) {
            ClanChannelMember clanChannelMember = (ClanChannelMember)Client.currentClanChannels[n].members.get(n2);
            if (clanChannelMember.rank != -1) {
                return;
            }
            PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3345, Client.packetWriter.isaacCipher);
            packetBufferNode.packetBuffer.writeByte(3 + MouseRecorder.stringCp1252NullTerminatedByteSize(clanChannelMember.username.getName()));
            packetBufferNode.packetBuffer.writeByte(n);
            packetBufferNode.packetBuffer.writeShort(n2);
            packetBufferNode.packetBuffer.writeStringCp1252NullTerminated(clanChannelMember.username.getName());
            Client.packetWriter.addNode(packetBufferNode);
            return;
        }
    }
}

