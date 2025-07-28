package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ou")
public class class380 {
    @ObfuscatedName(value="dg")
    static boolean field4145;

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(IIIIIZB)Lvf;", garbageValue="67")
    public static final class570 method7641(int n, int n2, int n3, int n4, int n5, boolean bl) {
        class198 class1982;
        class570 class5702;
        if (n2 == -1) {
            n5 = 0;
        } else if (n5 == 2 && n2 != 1) {
            n5 = 1;
        }
        long l = ((long)n3 << 38) + ((long)n + ((long)n2 << 16)) + ((long)n5 << 40) + ((long)n4 << 42);
        if (!bl && (class5702 = (class570) ItemDef.field2849.method6578(l)) != null) {
            return class5702;
        }
        ItemDef class2632 = class191.method4462(n);
        if (n2 > 1 && class2632.field2873 != null) {
            int n6 = -1;
            int n7 = 0;
            while (true) {
                if (n7 >= 10) {
                    if (n6 == -1) break;
                    class2632 = class191.method4462(n6);
                    break;
                }
                if (n2 >= class2632.field2887[n7] && class2632.field2887[n7] != 0) {
                    n6 = class2632.field2873[n7];
                }
                ++n7;
            }
        }
        if ((class1982 = class2632.method5568(1)) == null) {
            return null;
        }
        class570 class5703 = null;
        if (class2632.field2901 == -1 ? (class2632.field2900 == -1 ? class2632.field2902 != -1 && (class5703 = class380.method7641(class2632.field2894, n2, 0, 0, 0, false)) == null : (class5703 = class380.method7641(class2632.field2899, n2, n3, n4, 0, false)) == null) : (class5703 = class380.method7641(class2632.field2888, 10, 1, 0, 0, true)) == null) {
            return null;
        }
        int[] nArray = class566.field5546;
        int n8 = class566.field5542;
        int n9 = class566.field5543;
        float[] fArray = class566.field5544;
        int[] nArray2 = new int[4];
        class566.method10607(nArray2);
        class5702 = new class570(36, 32);
        class182.method4016(class5702.field5576, 36, 32, null);
        class566.method10609();
        class182.method4071();
        class182.method4020(16, 16);
        class182.field1957.field2290 = false;
        if (class2632.field2902 != -1) {
            class5703.method10774(0, 0);
        }
        int n10 = class2632.field2858;
        if (bl) {
            n10 = (int)((double)n10 * 1.5);
        } else if (n3 == 2) {
            n10 = (int)((double)n10 * 1.04);
        }
        int n11 = n10 * class182.field1954[class2632.field2859] >> 16;
        int n12 = n10 * class182.field1955[class2632.field2859] >> 16;
        class1982.method4600();
        class1982.method4561(0, class2632.field2860, class2632.field2861, class2632.field2859, class2632.field2890, class1982.field2116 / 2 + n11 + class2632.field2863, n12 + class2632.field2863);
        if (class2632.field2900 != -1) {
            class5703.method10774(0, 0);
        }
        if (n3 >= 1) {
            class5702.method10739(1);
        }
        if (n3 >= 2) {
            class5702.method10739(0xFFFFFF);
        }
        if (n4 != 0) {
            class5702.method10740(n4);
        }
        class182.method4016(class5702.field5576, 36, 32, null);
        if (class2632.field2901 != -1) {
            class5703.method10774(0, 0);
        }
        if (n5 == 1 || n5 == 2 && class2632.field2844 == 1) {
            class515.field5179.method8727(class212.method4858(n2), 0, 9, 0xFFFF00, 1);
        }
        if (!bl) {
            ItemDef.field2849.method6590(class5702, l);
        }
        class182.method4016(nArray, n8, n9, fArray);
        class566.method10649(nArray2);
        class182.method4071();
        class182.field1957.field2290 = true;
        return class5702;
    }

    @ObfuscatedName(value="ob")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1128240649")
    static void method7644() {
        client.field564.method3257(class90.method2629(class322.field3365, client.field564.field1446));
        client.field594 = 0;
    }
}

