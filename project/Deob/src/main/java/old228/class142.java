package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
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
        MouseWheel[] mouseWheelArray = new class145[]{class145.field1652, class145.field1658, class145.field1649, class145.field1650, class145.field1651, class145.field1647, class145.field1648, class145.field1653, class145.field1655};
        class145 class1452 = (class145)class259.method5457(mouseWheelArray, n);
        if (class1452 == null) {
            class1452 = class145.field1655;
        }
        return class1452;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Lkl;", garbageValue="1781059216")
    public static ObjectDef method3512(int n) {
        ObjectDef class2622 = (ObjectDef) ObjectDef.field2791.method6578(n);
        if (class2622 != null) {
            return class2622;
        }
        byte[] byArray = ObjectDef.field2789.method7790(6, n);
        class2622 = new ObjectDef();
        class2622.field2836 = n;
        if (byArray != null) {
            class2622.method5531(new class556(byArray));
        }
        class2622.method5507();
        if (class2622.field2793) {
            class2622.field2806 = 0;
            class2622.field2807 = false;
        }
        ObjectDef.field2791.method6590(class2622, n);
        return class2622;
    }

    @ObfuscatedName(value="ot")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="0")
    static void method3514() {
        if (client.field594 == 1) {
            client.field602 = true;
        }
    }
}

