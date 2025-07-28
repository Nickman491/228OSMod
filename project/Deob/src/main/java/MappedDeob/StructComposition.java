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

@ObfuscatedName(value="jf")
@Implements(value="StructComposition")
public class StructComposition
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="StructDefinition_archive")
    public static AbstractArchive StructDefinition_archive;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="StructDefinition_cached")
    public static EvictingDualNodeHashTable StructDefinition_cached;
    @ObfuscatedName(value="ca")
    @ObfuscatedSignature(descriptor="Lol;")
    static StudioGame field2749;
    @ObfuscatedName(value="fr")
    @ObfuscatedSignature(descriptor="Lok;")
    static Archive field2746;
    @ObfuscatedName(value="jw")
    static int[] field2742;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lue;")
    @Export(value="params")
    IterableNodeHashTable params;

    static {
        StructDefinition_cached = new EvictingDualNodeHashTable(64);
    }

    StructComposition() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1529643123")
    @Export(value="postDecode")
    void postDecode() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;B)V", garbageValue="5")
    @Export(value="decode")
    void decode(Buffer buffer) {
        int n;
        while ((n = buffer.readUnsignedByte()) != 0) {
            this.decodeNext(buffer, n);
        }
        return;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="1848014011")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        if (n == 249) {
            this.params = class1.readStringIntParameters(buffer, this.params);
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IIB)I", garbageValue="7")
    @Export(value="getIntParam")
    public int getIntParam(int n, int n2) {
        return Canvas.method336(this.params, n, n2);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;I)Ljava/lang/String;", garbageValue="-634217919")
    @Export(value="getStringParam")
    public String getStringParam(int n, String string) {
        return class47.method906(this.params, n, string);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([Lpd;II)Lpd;", garbageValue="-1909362778")
    @Export(value="findEnumerated")
    public static class404 findEnumerated(class404[] class404Array, int n) {
        class404[] class404Array2 = class404Array;
        int n2 = 0;
        while (n2 < class404Array2.length) {
            class404 class4042 = class404Array2[n2];
            if (n == class4042.rsOrdinal()) {
                return class4042;
            }
            ++n2;
        }
        return null;
    }
}

