package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ju")
public class class244
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static class315 field2601 = new class315(64);

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="1308022467")
    public static int method5288(int n) {
        return n >>> 12;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-48")
    static void method5287() {
        class81.field1009.method6581();
    }

    @ObfuscatedName(value="ls")
    @ObfuscatedSignature(descriptor="([Lna;Lna;ZI)V", garbageValue="-1058652978")
    static void method5286(class361[] class361Array, class361 class3612, boolean bl) {
        int n;
        class89 class892;
        int n2 = class3612.field3894 != 0 ? class3612.field3894 : class3612.field3886;
        int n3 = class3612.field3895 != 0 ? class3612.field3895 : class3612.field3887 * -1528330031;
        class86.method2588(class361Array, class3612.field3910, n2, n3, bl);
        if (class3612.field4014 != null) {
            class86.method2588(class3612.field4014, class3612.field3910, n2, n3, bl);
        }
        if ((class892 = (class89)client.field664.method9985(class3612.field3910)) != null && class170.field1807.method7024(n = class892.field1073)) {
            class86.method2588(class170.field1807.field3772[n], -1, n2, n3, bl);
        }
        if (class3612.field3875 != 1337) {
            // empty if block
        }
    }
}

