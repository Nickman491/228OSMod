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

@ObfuscatedName(value="li")
public class class297 {
    @ObfuscatedName(value="ay")
    String field3235;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-289017001)
    int field3233;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-640122131)
    int field3234;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lkz;")
    class281 field3232;

    @ObfuscatedSignature(descriptor="(Ljava/lang/String;IILkz;)V")
    class297(String string, int n, int n2, class281 class2812) {
        this.field3235 = string;
        this.field3233 = n;
        this.field3234 = n2;
        this.field3232 = class2812;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;Lpq;S)Z", garbageValue="17063")
    public static boolean method6398(class391 class3912, class391 class3913) {
        class236.field2526 = class3913;
        if (class3912.method7733()) {
            class236.field2520 = class3912.method7740(35);
            class236.field2519 = new class236[class236.field2520];
            int n = 0;
            while (true) {
                if (n >= class236.field2520) {
                    return true;
                }
                byte[] byArray = class3912.method7790(35, n);
                class236.field2519[n] = new class236(n);
                if (byArray != null) {
                    class236.field2519[n].method5188(new class556(byArray));
                    class236.field2519[n].method5166();
                }
                ++n;
            }
        }
        return false;
    }

    @ObfuscatedName(value="mq")
    @ObfuscatedSignature(descriptor="(Lna;IIB)V", garbageValue="-18")
    static final void method6399(class361 class3612, int n, int n2) {
        if (client.field675 == null && !client.field647) {
            if (class3612 != null && class87.method2607(class3612) != null) {
                client.field675 = class3612;
                client.field676 = class87.method2607(class3612);
                client.field715 = n;
                client.field678 = n2;
                class243.field2596 = 0;
                client.field585 = false;
                int n3 = client.field648.field5612 - 1;
                int n4 = n3;
                if (n4 != -1) {
                    class53.method1124(n4);
                }
                return;
            }
            return;
        }
    }
}

