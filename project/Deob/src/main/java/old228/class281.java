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

@ObfuscatedName(value="kz")
public class class281 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lkz;")
    public static final class281 field3076 = new class281(0, 0, 4);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lkz;")
    public static final class281 field3075 = new class281(1, 1, 2);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lkz;")
    public static final class281 field3077 = new class281(2, 2, 0);
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lgq;")
    static class161 field3082;
    @ObfuscatedName(value="sw")
    @ObfuscatedSignature(descriptor="Lwk;")
    static class576 field3074;
    @ObfuscatedName(value="sm")
    @ObfuscatedSignature(descriptor="Lsa;")
    static class470 field3080;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1750753491)
    final int field3078;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1318030643)
    final int field3081;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-164667467)
    final int field3079;

    class281(int n, int n2, int n3) {
        this.field3078 = n;
        this.field3081 = n2;
        this.field3079 = n3;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(FI)Z", garbageValue="-394087721")
    boolean method5991(float f) {
        return f >= (float)this.field3079;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Lkz;", garbageValue="-1934432977")
    static class281 method5992(int n) {
        class281[] class281Array;
        class281[] class281Array2 = class281Array = new class281[]{field3075, field3077, field3076};
        int n2 = 0;
        while (n2 < class281Array2.length) {
            class281 class2812 = class281Array2[n2];
            if (n == class2812.field3081) {
                return class2812;
            }
            ++n2;
        }
        return null;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(B)Lcx;", garbageValue="-86")
    static class69 method5993() {
        class69.field820 = 0;
        return class329.method6648();
    }
}

