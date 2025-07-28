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

@ObfuscatedName(value="jr")
@Implements(value="EnumComposition")
public class EnumComposition
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="EnumDefinition_archive")
    static AbstractArchive EnumDefinition_archive;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="EnumDefinition_cached")
    static EvictingDualNodeHashTable EnumDefinition_cached;
    @ObfuscatedName(value="az")
    @Export(value="inputType")
    public char inputType;
    @ObfuscatedName(value="ao")
    @Export(value="outputType")
    public char outputType;
    @ObfuscatedName(value="ad")
    @Export(value="defaultStr")
    public String defaultStr = "null";
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-592889597)
    @Export(value="defaultInt")
    public int defaultInt;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-176546561)
    @Export(value="outputCount")
    public int outputCount = 0;
    @ObfuscatedName(value="ax")
    @Export(value="keys")
    public int[] keys;
    @ObfuscatedName(value="at")
    @Export(value="intVals")
    public int[] intVals;
    @ObfuscatedName(value="ac")
    @Export(value="strVals")
    public String[] strVals;

    static {
        EnumDefinition_cached = new EvictingDualNodeHashTable(64);
    }

    EnumComposition() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="687907281")
    @Export(value="decode")
    void decode(Buffer buffer) {
        int n;
        while ((n = buffer.readUnsignedByte()) != 0) {
            this.decodeNext(buffer, n);
        }
        return;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="-94680643")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        block3: {
            block7: {
                block6: {
                    block5: {
                        block4: {
                            block2: {
                                if (n != 1) break block2;
                                this.inputType = (char)buffer.readUnsignedByte();
                                break block3;
                            }
                            if (n != 2) break block4;
                            this.outputType = (char)buffer.readUnsignedByte();
                            break block3;
                        }
                        if (n != 3) break block5;
                        this.defaultStr = buffer.readStringCp1252NullTerminated();
                        break block3;
                    }
                    if (n != 4) break block6;
                    this.defaultInt = buffer.readInt();
                    break block3;
                }
                if (n == 5) break block7;
                if (n != 6) break block3;
                this.outputCount = buffer.readUnsignedShort();
                this.keys = new int[this.outputCount];
                this.intVals = new int[this.outputCount];
                for (int i = 0; i < this.outputCount; ++i) {
                    this.keys[i] = buffer.readInt();
                    this.intVals[i] = buffer.readInt();
                }
                break block3;
            }
            this.outputCount = buffer.readUnsignedShort();
            this.keys = new int[this.outputCount];
            this.strVals = new String[this.outputCount];
            for (int i = 0; i < this.outputCount; ++i) {
                this.keys[i] = buffer.readInt();
                this.strVals[i] = buffer.readStringCp1252NullTerminated();
            }
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-2052156765")
    @Export(value="size")
    public int size() {
        return this.outputCount;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Lud;", garbageValue="-1958777495")
    public static class544 method5280(int n) {
        int n2 = class542.field5387[n];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return null;
                }
                return class544.field5395;
            }
            return class544.field5393;
        }
        return class544.field5392;
    }

    @ObfuscatedName(value="hx")
    @ObfuscatedSignature(descriptor="(I)J", garbageValue="-1013211388")
    static long method5279() {
        return Client.field630;
    }
}

