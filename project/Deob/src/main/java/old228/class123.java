package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="el")
public class class123
extends class475 {
    @ObfuscatedName(value="ay")
    final boolean field1492;

    public class123(boolean bl) {
        this.field1492 = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lsu;Lsu;I)I", garbageValue="796003130")
    int method3328(class478 class4782, class478 class4783) {
        if (class4782.field5020 != 0 && class4783.field5020 != 0) {
            return this.field1492 ? class4782.field5018 - class4783.field5018 : class4783.field5018 - class4782.field5018;
        }
        return this.method9184(class4782, class4783);
    }

    public int compare(Object object, Object object2) {
        return this.method3328((class478)object, (class478)object2);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;Lpq;IZI)Lfl;", garbageValue="201102891")
    public static class144 method3330(class391 class3912, class391 class3913, int n, boolean bl) {
        boolean bl2 = true;
        byte[] byArray = class3912.method7736(n >> 16 & 0xFFFF, n & 0xFFFF);
        if (byArray == null) {
            bl2 = false;
            return null;
        }
        int n2 = (byArray[1] & 0xFF) << 8 | byArray[2] & 0xFF;
        byte[] byArray2 = bl ? class3913.method7736(0, n2) : class3913.method7736(n2, 0);
        if (byArray2 == null) {
            bl2 = false;
        }
        if (!bl2) {
            return null;
        }
        if (class299.field3245 == null) {
            class142.field1631 = Runtime.getRuntime().availableProcessors();
            class299.field3245 = new ThreadPoolExecutor(0, class142.field1631, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(class142.field1631 * 100 + 100), new class141());
        }
        try {
            return new class144(class3912, class3913, n, bl);
        }
        catch (Exception exception) {
            return null;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-109")
    static void method3331() {
        class85.field1047 = null;
        class80.field992 = null;
        class84.field1027 = null;
        class84.field1026 = null;
        class538.field5380 = null;
        class84.field1029 = null;
        class299.field3244 = null;
        class229.field2487 = null;
        class84.field1030 = null;
        class84.field1042 = null;
        class4.field6 = null;
        class557.field5476 = null;
    }

    @ObfuscatedName(value="jd")
    @ObfuscatedSignature(descriptor="(IIIIIIIIIIIIIII)V", garbageValue="853514196")
    static void method3332(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14) {
        n2 = n2 * 128 + 64;
        n3 = n3 * 128 + 64;
        n4 = n4 * 128 + 64;
        n5 = n5 * 128 + 64;
        class79 class792 = new class79(n7, n, n2, n3, class23.method337(class30.field131, n2, n3, n) - n8, n10 + client.field514, n11 + client.field514, n12, n13, n14, n6, n9);
        class792.method2453(n4, n5, class23.method337(class30.field131, n4, n5, n) - n9, n10 + client.field514);
        class30.field131.field1338.method7998(class792);
    }
}

