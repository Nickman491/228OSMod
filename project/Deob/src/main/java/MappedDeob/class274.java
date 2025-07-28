/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ks")
public class class274 {
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-369415215)
    int field3038 = 0;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1846867525)
    int field3039 = 0;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=1806402917)
    int field3041 = 0;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1220751115)
    int field3042 = 0;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="80")
    public int method5895() {
        return this.field3039;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-58")
    public int method5893() {
        return this.field3042;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="864235813")
    public int method5894() {
        return this.field3041;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="431390191")
    public int method5925() {
        return this.field3039 >> 7;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-53")
    public int method5896() {
        return this.field3041 >> 7;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-87")
    public int method5897() {
        return this.field3038;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lks;I)V", garbageValue="-33689973")
    public void method5899(class274 class2742) {
        this.field3038 = class2742.field3038;
        this.field3039 = class2742.field3039;
        this.field3042 = class2742.field3042;
        this.field3041 = class2742.field3041;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="116")
    public void method5902(int n, int n2) {
        this.field3039 = n;
        this.field3041 = n2;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="93")
    public void method5900(int n, int n2) {
        int n3 = n << 7;
        this.field3039 = n3 + 64;
        int n4 = n2 << 7;
        this.field3041 = n4 + 64;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1108931288")
    public void method5901(int n) {
        this.field3038 = n & 0x7FF;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-771103473")
    public void method5891(int n) {
        this.field3042 = n;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="251491445")
    public void method5903(int n, int n2) {
        this.field3039 += n;
        this.field3041 += n2;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="-84")
    void method5921(int n, int n2, int n3, int n4) {
        this.field3039 += n;
        this.field3042 += n2;
        this.field3041 += n3;
        this.method5901(n4 + this.field3038);
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(CB)Z", garbageValue="-43")
    @Export(value="isAlphaNumeric")
    public static boolean isAlphaNumeric(char c) {
        return c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }
}

