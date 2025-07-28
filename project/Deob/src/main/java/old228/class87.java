package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="do")
public class class87
extends class514 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lub;")
    static class530 field1057 = new class530(32);
    @ObfuscatedName(value="ah")
    int[] field1058 = new int[]{-1};
    @ObfuscatedName(value="az")
    int[] field1059 = new int[]{0};

    class87() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIII)J", garbageValue="1514847798")
    static long method2606(int n, int n2, int n3) {
        return n3 << 16 | n << 8 | n2;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Ljf;", garbageValue="-769851822")
    public static class259 method2605(int n) {
        class259 class2592 = (class259)class259.field2743.method6578(n);
        if (class2592 != null) {
            return class2592;
        }
        byte[] byArray = class259.field2745.method7790(34, n);
        class2592 = new class259();
        if (byArray != null) {
            class2592.method5453(new class556(byArray));
        }
        class2592.method5452();
        class259.field2743.method6590(class2592, n);
        return class2592;
    }

    @ObfuscatedName(value="mh")
    @ObfuscatedSignature(descriptor="(Lna;I)Lna;", garbageValue="2120923696")
    static class361 method2607(class361 class3612) {
        class361 class3613 = class211.method4832(class3612);
        if (class3613 == null) {
            class3613 = class3612.field3898;
        }
        return class3613;
    }
}

