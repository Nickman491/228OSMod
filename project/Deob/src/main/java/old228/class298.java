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

@ObfuscatedName(value="lk")
public class class298 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Llk;")
    static final class298 field3236 = new class298(0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Llk;")
    static final class298 field3237 = new class298(1);
    @ObfuscatedName(value="ga")
    @ObfuscatedGetter(intValue=-292070717)
    static int field3239;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1906777519)
    final int field3238;

    class298(int n) {
        this.field3238 = n;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-1463983379")
    public static int method6401(int n) {
        return n >> 11 & 0x3F;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-647715500")
    static int method6400(int n, class81 class812, boolean bl) {
        class361 class3612 = class170.field1807.method7031(class72.field865[--class63.field444]);
        if (n != 2800) {
            if (n != 2801) {
                if (n != 2802) {
                    return 2;
                }
                class72.field855[++class104.field1343 - 1] = class3612.field4024 == null ? "" : class3612.field4024;
                return 1;
            }
            int n2 = class72.field865[--class63.field444];
            class72.field855[++class104.field1343 - 1] = class3612.field3956 != null && --n2 < class3612.field3956.length && class3612.field3956[n2] != null ? class3612.field3956[n2] : "";
            return 1;
        }
        class72.field865[++class63.field444 - 1] = class298.method6401(class232.method5133(class3612));
        return 1;
    }
}

