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

@ObfuscatedName(value="em")
public class class113 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lem;")
    static final class113 field1419 = new class113(0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lem;")
    static final class113 field1423 = new class113(1);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lem;")
    static final class113 field1417 = new class113(2);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lem;")
    static final class113 field1418 = new class113(3);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lem;")
    static final class113 field1429 = new class113(4);
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lem;")
    static final class113 field1428 = new class113(5);
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lem;")
    static final class113 field1421 = new class113(6);
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lem;")
    static final class113 field1422 = new class113(7);
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lem;")
    static final class113 field1431 = new class113(8);
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lem;")
    static final class113 field1424 = new class113(9);
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Lem;")
    static final class113 field1425 = new class113(10);
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lem;")
    static final class113 field1426 = new class113(11);
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lem;")
    static final class113 field1420 = new class113(12);
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Lem;")
    static final class113 field1416 = new class113(13);
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lem;")
    static final class113 field1427 = new class113(14);
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lem;")
    static final class113 field1430 = new class113(15);
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-2070727753)
    int field1415;

    class113(int n) {
        this.field1415 = n;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(Lkl;I)Z", garbageValue="622915463")
    static boolean method3177(ObjectDef class2622) {
        if (class2622.field2837 == null) {
            if (class2622.field2817 == -1) return false;
            return true;
        }
        int[] nArray = class2622.field2837;
        int n = 0;
        while (n < nArray.length) {
            int n2 = nArray[n];
            ObjectDef class2623 = class142.method3512(n2);
            if (class2623.field2817 != -1) {
                return true;
            }
            ++n;
        }
        return false;
    }

    @ObfuscatedName(value="hs")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="0")
    static final void method3178() {
        if (class328.field3606 != null) {
            class328.field3606.method806();
        }
    }
}

