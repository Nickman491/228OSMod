/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="oi")
@Implements(value="AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="Lgk;")
    static ClanChannel field4045;

    AbstractByteArrayCopier() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)[B", garbageValue="14")
    @Export(value="get")
    abstract byte[] get();

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="([BI)V", garbageValue="1288883946")
    @Export(value="set")
    public abstract void set(byte[] var1);

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Lfb;", garbageValue="-1650010421")
    static class134 method7582(int n) {
        class404[] class404Array = new class134[]{class134.field1561, class134.field1557, class134.field1559, class134.field1560, class134.field1563};
        class134 class1342 = (class134)StructComposition.findEnumerated(class404Array, n);
        if (class1342 == null) {
            class1342 = class134.field1561;
        }
        return class1342;
    }

    @ObfuscatedName(value="nh")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="63")
    static final void method7584() {
        PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3340, Client.packetWriter.isaacCipher);
        Client.packetWriter.addNode(packetBufferNode);
        Interpreter.field862 = true;
        InterfaceParent interfaceParent = (InterfaceParent)Client.interfaceParents.first();
        while (true) {
            if (interfaceParent == null) {
                if (Client.meslayerContinueWidget != null) {
                    UserComparator8.invalidateWidget(Client.meslayerContinueWidget);
                    Client.meslayerContinueWidget = null;
                }
                Interpreter.field862 = false;
                return;
            }
            if (interfaceParent.type == 0 || interfaceParent.type == 3) {
                NPCComposition.closeInterface(interfaceParent, true);
            }
            interfaceParent = (InterfaceParent)Client.interfaceParents.next();
        }
    }
}

