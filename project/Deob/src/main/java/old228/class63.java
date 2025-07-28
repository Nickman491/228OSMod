package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cf")
public class class63 {
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=688799447)
    static int field444;
    @ObfuscatedName(value="cy")
    @ObfuscatedSignature(descriptor="Lph;")
    static class406 field446;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ldm;")
    class81 field442;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1296451257)
    int field440 = -1;
    @ObfuscatedName(value="az")
    int[] field441;
    @ObfuscatedName(value="ao")
    String[] field443;

    class63() {
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;II)I", garbageValue="-404819722")
    public static int method1232(CharSequence charSequence, int n) {
        return class141.method3510(charSequence, n, true);
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="104")
    static final boolean method1231(int n) {
        return n == 2 || n == 8 || n == 25 || n == 17 || n == 25;
    }

    @ObfuscatedName(value="gh")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="15")
    static void method1230() {
        int n;
        client.field787 = 1L;
        if (class168.field1794 != null) {
            class168.field1794.field1091 = 0;
        }
        class80.field998 = true;
        client.field520 = true;
        client.field740 = -1L;
        class36.field219 = new class412();
        client.field564.method3243();
        client.field564.field1456 = 0;
        client.field564.field1450.field5471 = 0;
        client.field564.field1451 = null;
        client.field564.field1458 = null;
        client.field564.field1447 = null;
        client.field564.field1460 = null;
        client.field564.field1452 = 0;
        client.field564.field1454 = 0;
        client.field769 = 0;
        client.field627 = 0;
        client.field565 = 0;
        class188.method4443();
        class35.field192 = 0;
        class277.method5948();
        client.field496 = 0;
        client.field522 = false;
        client.field748 = 0;
        client.field503 = 0;
        client.field594 = 0;
        class184.field1975 = null;
        client.field746 = 0;
        client.field739 = -1;
        client.field744 = 0;
        client.field745 = 0;
        client.field759 = class108.field1380;
        client.field728 = class108.field1380;
        client.field508.method2723();
        client.field673.method3139();
        class10.field54.method2023();
        if (class234.field2505 > 5000) {
            // empty if block
        }
        if (!client.field512) {
            for (n = 0; n < class234.field2505; ++n) {
                class234 class2342 = class254.method5404(n);
                if (class2342 == null) continue;
                class349.field3762[n] = 0;
                class349.field3763[n] = 0;
            }
        } else {
            class71.method2104();
        }
        if (class19.field80 != null) {
            class19.field80.method3204();
        }
        client.field672 = -1;
        if (client.field663 != -1) {
            class170.field1807.method7021(client.field663);
        }
        class514 class5142 = (class89)client.field664.method9988();
        while (true) {
            if (class5142 == null) {
                client.field663 = -1;
                client.field664 = new class530(8);
                client.field668 = null;
                class188.method4443();
                client.field680.method7056(null, null, new int[]{0, 0, 0, 0, 0}, 0, -1);
                n = 0;
                while (true) {
                    if (n >= 8) {
                        class84.method2571();
                        client.field513 = true;
                        for (n = 0; n < 100; ++n) {
                            client.field713[n] = true;
                        }
                        if (client.field564 != null && client.field564.field1446 != null) {
                            class5142 = class90.method2629(class322.field3337, client.field564.field1446);
                            ((class324)class5142).field3442.method10300(class194.method4501());
                            ((class324)class5142).field3442.method10266(class128.field1521);
                            ((class324)class5142).field3442.method10266(class363.field4038);
                            client.field564.method3257((class324)class5142);
                        }
                        class281.field3080 = null;
                        class229.field2488 = null;
                        Arrays.fill(client.field737, null);
                        class106.field1371 = null;
                        Arrays.fill(client.field738, null);
                        for (n = 0; n < 8; ++n) {
                            client.field785[n] = new class400();
                        }
                        class328.field3597 = null;
                        client.field776 = 0;
                        client.field777 = 0;
                        client.field778 = 0;
                        client.field779 = 0;
                        return;
                    }
                    client.field638[n] = null;
                    client.field639[n] = false;
                    ++n;
                }
            }
            class247.method5349(class5142, true);
            class5142 = (class89)client.field664.method9996();
        }
    }

    @ObfuscatedName(value="os")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-1288710563")
    static void method1229(boolean bl) {
        client.field646 = bl;
    }
}

