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

@ObfuscatedName(value="ja")
@Implements(value="VarbitComposition")
public class VarbitComposition
extends DualNode {
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="VarbitDefinition_cached")
    static EvictingDualNodeHashTable VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
    @ObfuscatedName(value="an")
    static final int[] field2734 = new int[32];
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-704299373)
    @Export(value="baseVar")
    public int baseVar;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1843645225)
    @Export(value="startBit")
    public int startBit;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1856419001)
    @Export(value="endBit")
    public int endBit;

    static {
        int n = 2;
        int n2 = 0;
        while (n2 < 32) {
            VarbitComposition.field2734[n2] = n - 1;
            n += n;
            ++n2;
        }
        return;
    }

    VarbitComposition() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-456122148")
    @Export(value="decode")
    void decode(Buffer buffer) {
        int n;
        while ((n = buffer.readUnsignedByte()) != 0) {
            this.decodeNext(buffer, n);
        }
        return;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="-1149562142")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        if (n == 1) {
            this.baseVar = buffer.readUnsignedShort();
            this.startBit = buffer.readUnsignedByte();
            this.endBit = buffer.readUnsignedByte();
        }
    }
}

