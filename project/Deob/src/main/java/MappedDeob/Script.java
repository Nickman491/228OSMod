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
import java.util.Calendar;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dm")
@Implements(value="Script")
public class Script
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="Script_cached")
    static EvictingDualNodeHashTable Script_cached = new EvictingDualNodeHashTable(128);
    @ObfuscatedName(value="dl")
    @ObfuscatedSignature(descriptor="[Lvi;")
    @Export(value="worldSelectArrows")
    static IndexedSprite[] worldSelectArrows;
    @ObfuscatedName(value="ah")
    String field1004;
    @ObfuscatedName(value="az")
    @Export(value="opcodes")
    int[] opcodes;
    @ObfuscatedName(value="ao")
    @Export(value="intOperands")
    int[] intOperands;
    @ObfuscatedName(value="ad")
    @Export(value="stringOperands")
    String[] stringOperands;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1831460751)
    @Export(value="localIntCount")
    int localIntCount;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-970822451)
    @Export(value="localStringCount")
    int localStringCount;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=386041121)
    @Export(value="intArgumentCount")
    int intArgumentCount;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-914529041)
    @Export(value="stringArgumentCount")
    int stringArgumentCount;
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="[Lue;")
    @Export(value="switches")
    IterableNodeHashTable[] switches;

    Script() {
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(II)[Lue;", garbageValue="-1004050298")
    @Export(value="newIterableNodeHashTable")
    IterableNodeHashTable[] newIterableNodeHashTable(int n) {
        return new IterableNodeHashTable[n];
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", garbageValue="310846203")
    @Export(value="addChatMessage")
    static void addChatMessage(int n, String string, String string2, String string3) {
        ChatChannel chatChannel = (ChatChannel)Messages.Messages_channels.get(n);
        if (chatChannel == null) {
            chatChannel = new ChatChannel();
            Messages.Messages_channels.put(n, chatChannel);
        }
        Message message = chatChannel.addMessage(n, string, string2, string3);
        Messages.Messages_hashTable.put(message, message.count);
        Messages.Messages_queue.add(message);
        Client.chatCycle = Client.cycleCntr;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)Ljava/util/Date;", garbageValue="-1522771239")
    static Date method2490() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, 0);
        calendar.set(5, 1);
        calendar.set(1, 1900);
        return calendar.getTime();
    }

    @ObfuscatedName(value="hd")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="1144422908")
    @Export(value="doCheat")
    static final void doCheat(String string) {
        int n;
        Object object;
        if (string.equalsIgnoreCase("toggleroof")) {
            class544.clientPreferences.method2921(!class544.clientPreferences.method2890());
            if (class544.clientPreferences.method2890()) {
                Interpreter.addGameMessage(99, "", "Roofs are now all hidden");
            } else {
                Interpreter.addGameMessage(99, "", "Roofs will only be removed selectively");
            }
        }
        if (string.startsWith("zbuf")) {
            boolean bl = class278.method5972(string.substring(5).trim()) == 1;
            Client.client.method541(bl);
            SceneTileModel.method4017(bl);
        }
        if (string.equalsIgnoreCase("z")) {
            boolean bl = Client.renderSelf = !Client.renderSelf;
        }
        if (string.equalsIgnoreCase("displayfps")) {
            class544.clientPreferences.method2889();
        }
        if (string.equalsIgnoreCase("renderself")) {
            boolean bl = Client.field633 = !Client.field633;
        }
        if (string.equalsIgnoreCase("mouseovertext")) {
            boolean bl = Client.showMouseOverText = !Client.showMouseOverText;
        }
        if (string.startsWith("setdrawdistance")) {
            object = string.split(" ");
            try {
                n = Integer.parseInt(object[1]);
                class544.clientPreferences.method2911(n);
            }
            catch (NumberFormatException numberFormatException) {
                Interpreter.addGameMessage(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", object[1]));
            }
        }
        if (string.startsWith("settilerendermode")) {
            object = string.split(" ");
            try {
                n = Integer.parseInt(object[1]);
                GameEngine.field189.field1319.method4212(class175.method3888()[n]);
            }
            catch (NumberFormatException numberFormatException) {
                Interpreter.addGameMessage(99, "", String.format("Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s", object[1]));
            }
        }
        if (string.equalsIgnoreCase("getdrawdistance")) {
            Interpreter.addGameMessage(99, "", String.format("%d", class544.clientPreferences.method2902()));
        }
        if (Client.staffModLevel >= 2) {
            if (string.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (string.equalsIgnoreCase("showcoord")) {
                boolean bl = class420.worldMap.field5302 = !class420.worldMap.field5302;
            }
            if (string.equalsIgnoreCase("fpson")) {
                class544.clientPreferences.method2899(true);
            }
            if (string.equalsIgnoreCase("fpsoff")) {
                class544.clientPreferences.method2899(false);
            }
            if (string.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (string.equalsIgnoreCase("clientdrop")) {
                MenuAction.method2363();
            }
            if (string.equalsIgnoreCase("clientreload")) {
                ModelData0.method4808();
            }
        }
        object = ScriptEvent.getPacketBufferNode(ClientPacket.field3344, Client.packetWriter.isaacCipher);
        object.packetBuffer.writeByte(string.length() + 1);
        object.packetBuffer.writeStringCp1252NullTerminated(string);
        Client.packetWriter.addNode((PacketBufferNode)object);
    }
}

