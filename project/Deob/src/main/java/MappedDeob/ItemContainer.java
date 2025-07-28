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

@ObfuscatedName(value="do")
@Implements(value="ItemContainer")
public class ItemContainer
extends Node {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lub;")
    @Export(value="itemContainers")
    static NodeHashTable itemContainers = new NodeHashTable(32);
    @ObfuscatedName(value="ah")
    @Export(value="ids")
    int[] ids = new int[]{-1};
    @ObfuscatedName(value="az")
    @Export(value="quantities")
    int[] quantities = new int[]{0};

    ItemContainer() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIII)J", garbageValue="1514847798")
    static long method2606(int n, int n2, int n3) {
        return n3 << 16 | n << 8 | n2;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Ljf;", garbageValue="-769851822")
    @Export(value="StructDefinition_getStructDefinition")
    public static StructComposition StructDefinition_getStructDefinition(int n) {
        StructComposition structComposition = (StructComposition)StructComposition.StructDefinition_cached.get(n);
        if (structComposition != null) {
            return structComposition;
        }
        byte[] byArray = StructComposition.StructDefinition_archive.takeFile(34, n);
        structComposition = new StructComposition();
        if (byArray != null) {
            structComposition.decode(new Buffer(byArray));
        }
        structComposition.postDecode();
        StructComposition.StructDefinition_cached.put(structComposition, n);
        return structComposition;
    }

    @ObfuscatedName(value="mh")
    @ObfuscatedSignature(descriptor="(Lna;I)Lna;", garbageValue="2120923696")
    static Widget method2607(Widget widget) {
        Widget widget2 = class211.method4832(widget);
        if (widget2 == null) {
            widget2 = widget.parent;
        }
        return widget2;
    }
}

