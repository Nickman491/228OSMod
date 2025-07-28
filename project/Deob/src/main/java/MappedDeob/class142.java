/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fq")
public class class142 {
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1869948611)
    static int field1631;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Lfe;", garbageValue="121870175")
    static class145 method3513(int n) {
        class404[] class404Array = new class145[]{class145.field1652, class145.field1658, class145.field1649, class145.field1650, class145.field1651, class145.field1647, class145.field1648, class145.field1653, class145.field1655};
        class145 class1452 = (class145)StructComposition.findEnumerated(class404Array, n);
        if (class1452 == null) {
            class1452 = class145.field1655;
        }
        return class1452;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Lkl;", garbageValue="1781059216")
    @Export(value="getObjectDefinition")
    public static ObjectComposition getObjectDefinition(int n) {
        ObjectComposition objectComposition = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get(n);
        if (objectComposition != null) {
            return objectComposition;
        }
        byte[] byArray = ObjectComposition.ObjectDefinition_archive.takeFile(6, n);
        objectComposition = new ObjectComposition();
        objectComposition.id = n;
        if (byArray != null) {
            objectComposition.decode(new Buffer(byArray));
        }
        objectComposition.postDecode();
        if (objectComposition.isSolid) {
            objectComposition.interactType = 0;
            objectComposition.boolean1 = false;
        }
        ObjectComposition.ObjectDefinition_cached.put(objectComposition, n);
        return objectComposition;
    }

    @ObfuscatedName(value="ot")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="0")
    static void method3514() {
        if (Client.titleLoadingStage == 1) {
            Client.field602 = true;
        }
    }
}

