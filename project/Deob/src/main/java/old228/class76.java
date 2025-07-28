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

@ObfuscatedName(value="cr")
public class class76 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1769426223)
    int field914;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=465307575)
    int field911;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=791045811)
    int field906;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-829818609)
    int field904;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1480952507)
    int field908;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1603213755)
    int field909;
    @ObfuscatedName(value="ae")
    String field910;
    @ObfuscatedName(value="ax")
    String field907;
    @ObfuscatedName(value="at")
    boolean field912;

    class76() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Ljy;", garbageValue="-512309802")
    public static class253 method2365(int n) {
        class253 class2532 = (class253)class253.field2710.method6578(n);
        if (class2532 != null) {
            return class2532;
        }
        byte[] byArray = class253.field2706.method7790(1, n);
        class2532 = new class253();
        if (byArray != null) {
            class2532.method5385(new class556(byArray), n);
        }
        class2532.method5384();
        class253.field2710.method6590(class2532, n);
        return class2532;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(IIB)I", garbageValue="82")
    static final int method2362(int n, int n2) {
        if (n == -2) {
            return 12345678;
        }
        if (n != -1) {
            if ((n2 = (n & 0x7F) * n2 / 128) < 2) {
                n2 = 2;
            } else if (n2 > 126) {
                n2 = 126;
            }
            return (n & 0xFF80) + n2;
        }
        if (n2 < 2) {
            n2 = 2;
        } else if (n2 > 126) {
            n2 = 126;
        }
        return n2;
    }

    @ObfuscatedName(value="hp")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-192239950")
    static final void method2363() {
        if (client.field627 <= 0) {
            client.field763.method8954();
            class360.method7405(40);
            class234.field2508 = client.field564.method3249();
            client.field564.method3248();
            return;
        }
        client.method1954();
    }

    @ObfuscatedName(value="mi")
    @ObfuscatedSignature(descriptor="(Lna;IIIIIIB)V", garbageValue="11")
    static final void method2364(class361 class3612, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        client.field587 = client.field519 ? 32 : 0;
        client.field519 = false;
        if (class35.field206 == 1 || !class25.field109 && class35.field206 == 4) {
            if (n5 >= n && n5 < n + 16 && n6 >= n2 && n6 < n2 + 16) {
                class3612.field3899 -= 4;
                class122.method3325(class3612);
            } else if (n5 >= n && n5 < n + 16 && n6 >= n3 + n2 - 16 && n6 < n3 + n2) {
                class3612.field3899 += 4;
                class122.method3325(class3612);
            } else if (n5 >= n - client.field587 && n5 < client.field587 + n + 16 && n6 >= n2 + 16 && n6 < n3 + n2 - 16) {
                n7 = n3 * (n3 - 32) / n4;
                if (n7 < 8) {
                    n7 = 8;
                }
                int n8 = n6 - n2 - 16 - n7 / 2;
                int n9 = n3 - 32 - n7;
                class3612.field3899 = n8 * (n4 - n3) / n9;
                class122.method3325(class3612);
                client.field519 = true;
            }
        }
        if (client.field704 != 0 && n5 >= n - (n7 = class3612.field3886) && n6 >= n2 && n5 < n + 16 && n6 <= n3 + n2) {
            class3612.field3899 += client.field704 * 45;
            class122.method3325(class3612);
        }
    }
}

