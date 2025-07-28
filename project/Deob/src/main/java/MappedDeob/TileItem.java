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

@ObfuscatedName(value="eg")
@Implements(value="TileItem")
public final class TileItem
extends Renderable {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=993264681)
    @Export(value="id")
    int id;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1292745957)
    int field1385;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=208941453)
    int field1386;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=731829437)
    int field1387;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=455551503)
    int field1391;
    @ObfuscatedName(value="an")
    boolean field1384;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1407412917)
    int field1390 = 31;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lia;")
    class228 field1388;

    TileItem() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-768696378")
    void method3101(int n) {
        this.field1390 = n;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="49")
    boolean method3116(int n) {
        if (n >= 0 && n <= 4) {
            return (this.field1390 & 1 << n) != 0;
        }
        return true;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lia;I)V", garbageValue="-1220201616")
    void method3104(class228 class2282) {
        this.field1388 = class2282;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)Lia;", garbageValue="-55471053")
    class228 method3105() {
        return this.field1388;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1906303790")
    void method3106() {
        this.field1388 = null;
    }

    @Override
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(B)Lhv;", garbageValue="-7")
    @Export(value="getModel")
    protected final Model getModel() {
        ItemComposition itemComposition = FaceNormal.ItemDefinition_get(this.id);
        return this.field1388 == null ? itemComposition.getModel(this.field1385) : itemComposition.method5582(this.field1388);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lnw;B)V", garbageValue="60")
    public static void method3111(Huffman huffman) {
        class364.huffman = huffman;
    }
}

