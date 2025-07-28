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

@ObfuscatedName(value="hd")
@Implements(value="VertexNormal")
public class VertexNormal {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1397898627)
    @Export(value="x")
    int x;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-396954475)
    @Export(value="y")
    int y;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-411226141)
    @Export(value="z")
    int z;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=507587089)
    @Export(value="magnitude")
    int magnitude;

    VertexNormal() {
    }

    @ObfuscatedSignature(descriptor="(Lhd;)V")
    VertexNormal(VertexNormal vertexNormal) {
        this.x = vertexNormal.x;
        this.y = vertexNormal.y;
        this.z = vertexNormal.z;
        this.magnitude = vertexNormal.magnitude;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Ljr;", garbageValue="-678648084")
    @Export(value="getEnum")
    public static EnumComposition getEnum(int n) {
        EnumComposition enumComposition = (EnumComposition)EnumComposition.EnumDefinition_cached.get(n);
        if (enumComposition != null) {
            return enumComposition;
        }
        byte[] byArray = EnumComposition.EnumDefinition_archive.takeFile(8, n);
        enumComposition = new EnumComposition();
        if (byArray != null) {
            enumComposition.decode(new Buffer(byArray));
        }
        EnumComposition.EnumDefinition_cached.put(enumComposition, n);
        return enumComposition;
    }
}

