package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gt")
public abstract class class166
extends class514 {
    @ObfuscatedName(value="ff")
    @ObfuscatedSignature(descriptor="Lok;")
    static class388 field1785;

    class166() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="1969161379")
    abstract void vmethod3869(class556 var1);

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgk;I)V", garbageValue="-1263140647")
    abstract void vmethod3870(class170 var1);

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="47")
    public static void method3807() {
        class243.field2599.method6581();
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIIB)I", garbageValue="-1")
    static int method3805(int n, int n2, int n3) {
        if (n3 > 179) {
            n2 /= 2;
        }
        if (n3 > 192) {
            n2 /= 2;
        }
        if (n3 > 217) {
            n2 /= 2;
        }
        if (n3 > 243) {
            n2 /= 2;
        }
        int n4 = (n2 / 32 << 7) + (n / 4 << 10) + n3 / 2;
        return n4;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)Ljava/lang/String;", garbageValue="7")
    public static String method3810(String string) {
        if (string != null && !string.isEmpty() && string.charAt(0) != '#') {
            return string;
        }
        return "";
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="1")
    public static int method3808(int n) {
        class144 class1442 = class137.method3480(n);
        if (class1442 != null) {
            return class1442.method3521() ? 0 : 1;
        }
        return 2;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="53")
    public static int method3809(int n) {
        if (n > 0) {
            return 1;
        }
        if (n < 0) {
            return -1;
        }
        return 0;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="2103059388")
    static int method3800(int n, class81 class812, boolean bl) {
        if (n != 1927 && n != 2927) {
            int n2;
            if (n != 1928) {
                if (n != 2928) {
                    return 2;
                }
                int n3 = class72.field865[class63.field444 -= 3];
                int n4 = class72.field865[class63.field444 + 1];
                int n5 = class72.field865[class63.field444 + 2];
                if (n5 >= 1 && n5 <= 10) {
                    class361 class3612 = class170.field1807.method7023(n3, n4);
                    if (class3612 != null) {
                        class107 class1072 = new class107(n5, n3, n4, class3612.field4010);
                        class72.field863.add(class1072);
                        return 1;
                    }
                    throw new RuntimeException();
                }
                throw new RuntimeException();
            }
            class361 class3613 = bl ? class134.field1564 : class9.field45;
            if ((n2 = class72.field865[--class63.field444]) >= 1 && n2 <= 10) {
                class107 class1073 = new class107(n2, class3613.field3910, class3613.field3863, class3613.field4010);
                class72.field863.add(class1073);
                return 1;
            }
            throw new RuntimeException();
        }
        if (class72.field864 < 10) {
            class361 class3614 = n < 2000 ? (bl ? class134.field1564 : class9.field45) : class170.field1807.method7031(class72.field865[--class63.field444]);
            if (class3614.field3998 == null) {
                return 0;
            }
            class90 class902 = new class90();
            class902.field1077 = class3614;
            class902.field1086 = class3614.field3998;
            class902.field1080 = class72.field864 + 1;
            client.field706.method7998(class902);
            return 1;
        }
        throw new RuntimeException();
    }
}

