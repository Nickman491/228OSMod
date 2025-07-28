package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ek")
final class class110
implements class351 {
    @ObfuscatedSignature(descriptor="Lna;")
    final /* synthetic */ class361 val$item;

    @ObfuscatedSignature(descriptor="(Lna;)V")
    class110(class361 class3612) {
        this.val$item = class3612;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1894647927")
    public void vmethod7020() {
        if (this.val$item.method7447().field3804 != null) {
            class90 class902 = new class90();
            class902.method2628(this.val$item);
            class902.method2630(this.val$item.method7447().field3804);
            class236.method5196().method7998(class902);
        }
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="-8")
    static final void method3122(int n, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8;
        if (class199.field2269) {
            return;
        }
        int n9 = n;
        int n10 = n2;
        int n11 = n3;
        int n12 = n4;
        int n13 = 50;
        int n14 = class185.method4138();
        int n15 = (class199.field2263 - class182.method4008()) * n13 / class182.method4061();
        int n16 = (class199.field2264 - class182.method4048()) * n13 / class182.method4061();
        int n17 = (class199.field2263 - class182.method4008()) * n14 / class182.method4061();
        int n18 = (class199.field2264 - class182.method4048()) * n14 / class182.method4061();
        int n19 = class70.method2089(n16, n13, n10, n9);
        n13 = class93.method2647(n16, n13, n10, n9);
        n16 = n19;
        n19 = class70.method2089(n18, n14, n10, n9);
        n14 = class93.method2647(n18, n14, n10, n9);
        n18 = n19;
        n19 = n8 = n12 * n15 - n11 * n13 >> 16;
        n13 = n7 = n13 * n12 + n15 * n11 >> 16;
        n15 = n19;
        n19 = n6 = n17 * n12 - n11 * n14 >> 16;
        n14 = n5 = n14 * n12 + n17 * n11 >> 16;
        n17 = n19;
        class199.field2267 = (n17 + n15) / 2;
        class363.field4034 = (n18 + n16) / 2;
        class169.field1804 = (n13 + n14) / 2;
        class199.field2262 = (n17 - n15) / 2;
        class496.field5128 = (n18 - n16) / 2;
        class270.field2995 = (n14 - n13) / 2;
        class296.field3231 = Math.abs(class199.field2262);
        class464.field4955 = Math.abs(class496.field5128);
        class127.field1516 = Math.abs(class270.field2995);
        class199.field2268.method8285(n17 - n15, n18 - n16, n14 - n13);
        class199.field2268.method8289();
        class199.field2269 = true;
    }
}

