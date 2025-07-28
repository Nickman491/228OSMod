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

@ObfuscatedName(value="je")
@Implements(value="VarpDefinition")
public class VarpDefinition
extends DualNode {
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="VarpDefinition_archive")
    static AbstractArchive VarpDefinition_archive;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=111494813)
    public static int field2505;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="VarpDefinition_cached")
    static EvictingDualNodeHashTable VarpDefinition_cached;
    @ObfuscatedName(value="fh")
    @ObfuscatedSignature(descriptor="Lcj;")
    static class68 field2510;
    @ObfuscatedName(value="il")
    @ObfuscatedSignature(descriptor="Lsq;")
    static AbstractSocket field2508;
    @ObfuscatedName(value="lf")
    @ObfuscatedGetter(intValue=1927519643)
    static int field2509;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1557444195)
    @Export(value="type")
    public int type = 0;

    static {
        VarpDefinition_cached = new EvictingDualNodeHashTable(64);
    }

    VarpDefinition() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="830553942")
    @Export(value="decode")
    void decode(Buffer buffer) {
        int n;
        while ((n = buffer.readUnsignedByte()) != 0) {
            this.decodeNext(buffer, n);
        }
        this.method5138();
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="1188566166")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        if (n == 5) {
            this.type = buffer.readUnsignedShort();
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-2088614685")
    void method5138() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="-130295306")
    static String method5158() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = class275.field3053;
        int n = 0;
        while (true) {
            if (n >= ((class275[])object).length) {
                object = stringBuilder.toString();
                return ((String)object).substring(0, ((String)object).length() - 2);
            }
            class275 class2752 = object[n];
            stringBuilder.append(class2752.field3052);
            stringBuilder.append(", ");
            ++n;
        }
    }
}

