/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gw")
public class class158
extends class166 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=965396529)
    int field1726 = -1;
    @ObfuscatedSignature(descriptor="Lgv;")
    final /* synthetic */ class167 this$0;

    @ObfuscatedSignature(descriptor="(Lgv;)V")
    class158(class167 class1672) {
        this.this$0 = class1672;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="1969161379")
    void vmethod3869(Buffer buffer) {
        this.field1726 = buffer.readUnsignedShort();
        buffer.readUnsignedByte();
        if (buffer.readUnsignedByte() != 255) {
            --buffer.offset;
            buffer.readLong();
        }
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgk;I)V", garbageValue="-1263140647")
    void vmethod3870(ClanChannel clanChannel) {
        clanChannel.removeMember(this.field1726);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(III)Ldm;", garbageValue="642980328")
    static Script method3668(int n, int n2) {
        Script script;
        block2: {
            block3: {
                block5: {
                    block6: {
                        block4: {
                            script = (Script)Script.Script_cached.get(n << 16);
                            if (script != null) break block2;
                            String string = String.valueOf(n);
                            int n3 = class167.archive12.getGroupId(string);
                            if (n3 == -1) break block3;
                            byte[] byArray = class167.archive12.takeFileFlat(n3);
                            if (byArray == null) break block4;
                            if (byArray.length <= 1) break block5;
                            script = GrandExchangeOfferAgeComparator.newScript(byArray);
                            if (script != null) break block6;
                        }
                        return null;
                    }
                    Script.Script_cached.put(script, n << 16);
                    return script;
                }
                return null;
            }
            return null;
        }
        return script;
    }
}

