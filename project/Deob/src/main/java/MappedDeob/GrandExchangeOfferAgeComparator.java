/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pb")
@Implements(value="GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator
implements Comparator {
    GrandExchangeOfferAgeComparator() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpj;Lpj;I)I", garbageValue="-379028214")
    @Export(value="compare_bridged")
    int compare_bridged(GrandExchangeEvent grandExchangeEvent, GrandExchangeEvent grandExchangeEvent2) {
        return grandExchangeEvent.age < grandExchangeEvent2.age ? -1 : (grandExchangeEvent2.age == grandExchangeEvent.age ? 0 : 1);
    }

    public int compare(Object object, Object object2) {
        return this.compare_bridged((GrandExchangeEvent)object, (GrandExchangeEvent)object2);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Lae;", garbageValue="-787562554")
    public static class6[] method7886() {
        return new class6[]{class6.field20};
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="([BB)Ldm;", garbageValue="67")
    @Export(value="newScript")
    static Script newScript(byte[] byArray) {
        int n;
        int n2;
        int n3;
        Script script = new Script();
        Buffer buffer = new Buffer(byArray);
        buffer.offset = buffer.array.length - 2;
        int n4 = buffer.readUnsignedShort();
        buffer.offset = n3 = buffer.array.length - 2 - n4 - 12;
        int n5 = buffer.readInt();
        script.localIntCount = buffer.readUnsignedShort();
        script.localStringCount = buffer.readUnsignedShort();
        script.intArgumentCount = buffer.readUnsignedShort();
        script.stringArgumentCount = buffer.readUnsignedShort();
        int n6 = buffer.readUnsignedByte();
        if (n6 > 0) {
            script.switches = script.newIterableNodeHashTable(n6);
            for (n2 = 0; n2 < n6; ++n2) {
                IterableNodeHashTable iterableNodeHashTable;
                n = buffer.readUnsignedShort();
                script.switches[n2] = iterableNodeHashTable = new IterableNodeHashTable(n > 0 ? class357.method7049(n) : 1);
                while (n-- > 0) {
                    int n7 = buffer.readInt();
                    int n8 = buffer.readInt();
                    iterableNodeHashTable.put(new IntegerNode(n8), n7);
                }
            }
        }
        buffer.offset = 0;
        script.field1004 = buffer.readStringCp1252NullTerminatedOrNull();
        script.opcodes = new int[n5];
        script.intOperands = new int[n5];
        script.stringOperands = new String[n5];
        n2 = 0;
        while (buffer.offset < n3) {
            n = buffer.readUnsignedShort();
            if (n == 3) {
                script.stringOperands[n2] = buffer.readStringCp1252NullTerminated();
            } else {
                script.intOperands[n2] = n < 100 && n != 21 && n != 38 && n != 39 ? buffer.readInt() : buffer.readUnsignedByte();
            }
            script.opcodes[n2++] = n;
        }
        return script;
    }
}

