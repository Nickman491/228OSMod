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

@ObfuscatedName(value="ip")
public class class229
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    static class391 field2484;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmi;")
    static class315 field2485;
    @ObfuscatedName(value="ax")
    static int[] field2487;
    @ObfuscatedName(value="sf")
    @ObfuscatedSignature(descriptor="Lgq;")
    static class161 field2488;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=522434629)
    public int field2486 = 0;

    static {
        field2485 = new class315(64);
    }

    class229() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="659202401")
    void method5113(class556 class5562) {
        int n;
        while ((n = class5562.method10282()) != 0) {
            this.method5122(class5562, n);
        }
        return;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="-1952497567")
    void method5122(class556 class5562, int n) {
        if (n == 2) {
            this.field2486 = class5562.method10307();
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="16")
    public static boolean method5123(int n) {
        return n == 10 || n == 11 || n == 12 || n == 13 || n == 14 || n == 15 || n == 16 || n == 17;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;I)V", garbageValue="450752558")
    public static void method5120(class391 class3912) {
        class258.field2741 = class3912;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;II)V", garbageValue="-728355894")
    static final void method5121(String string, int n) {
        class324 class3242 = class90.method2629(class322.field3379, client.field564.field1446);
        class3242.field3442.method10300(class91.method2631(string) + 1);
        class3242.field3442.method10477(n);
        class3242.field3442.method10442(string);
        client.field564.method3257(class3242);
    }

    @ObfuscatedName(value="kd")
    @ObfuscatedSignature(descriptor="(IIIIIIIIIZI)V", garbageValue="-1228848950")
    static void method5109(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, boolean bl) {
        class109 class1092 = new class109();
        class1092.field1389 = n4;
        class1092.field1385 = n5;
        class1092.method3101(n6);
        class1092.field1386 = client.field693 + n7;
        class1092.field1387 = n8 + client.field693;
        class1092.field1391 = n9;
        class1092.field1384 = bl;
        if (class30.field131.field1327[n][n2][n3] == null) {
            class30.field131.field1327[n][n2][n3] = new class410();
        }
        class30.field131.field1327[n][n2][n3].method7998(class1092);
        class453.method8927(n, n2, n3);
    }
}

