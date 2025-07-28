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

@ObfuscatedName(value="jl")
public class class254
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmi;")
    static EvictingDualNodeHashTable field2716 = new EvictingDualNodeHashTable(64);

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)Lje;", garbageValue="-41")
    @Export(value="VarpDefinition_get")
    public static VarpDefinition VarpDefinition_get(int n) {
        VarpDefinition varpDefinition = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get(n);
        if (varpDefinition != null) {
            return varpDefinition;
        }
        byte[] byArray = VarpDefinition.VarpDefinition_archive.takeFile(16, n);
        varpDefinition = new VarpDefinition();
        if (byArray != null) {
            varpDefinition.decode(new Buffer(byArray));
        }
        VarpDefinition.VarpDefinition_cached.put(varpDefinition, n);
        return varpDefinition;
    }

    @ObfuscatedName(value="gm")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="50")
    static int method5409() {
        if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
            int n = 0;
            int n2 = 0;
            while (true) {
                if (n2 > Client.archiveLoadersDone) {
                    return n * 10000 / Client.field692;
                }
                n += ((ArchiveLoader)Client.archiveLoaders.get((int)n2)).loadedCount;
                ++n2;
            }
        }
        return 10000;
    }
}

