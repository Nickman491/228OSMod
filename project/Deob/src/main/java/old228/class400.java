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

@ObfuscatedName(value="pu")
public class class400 {
    @ObfuscatedName(value="ay")
    byte field4643;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1143661643)
    public int field4644;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=708435427)
    public int field4645;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-219996791)
    public int field4646;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-2134705951)
    public int field4647;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-2086438493)
    public int field4648;

    public class400() {
    }

    @ObfuscatedSignature(descriptor="(Lvy;Z)V", garbageValue="0")
    public class400(class556 class5562, boolean bl) {
        this.field4643 = class5562.method10524();
        this.field4644 = class5562.method10307();
        this.field4645 = class5562.method10440();
        this.field4646 = class5562.method10440();
        this.field4647 = class5562.method10440();
        this.field4648 = class5562.method10440();
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="305720230")
    public int method7916() {
        return this.field4643 & 7;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1473569240")
    public int method7928() {
        return (this.field4643 & 8) == 8 ? 1 : 0;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="854210133")
    void method7918(int n) {
        this.field4643 = (byte)(this.field4643 & 0xFFFFFFF8);
        this.field4643 = (byte)(this.field4643 | n & 7);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-923443826")
    void method7919(int n) {
        this.field4643 = (byte)(this.field4643 & 0xFFFFFFF7);
        if (n == 1) {
            this.field4643 = (byte)(this.field4643 | 8);
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)D", garbageValue="849686759")
    public static double method7927(int n) {
        int n2 = class507.field5154[n & 0x7FF];
        return (double)n2 / 65536.0;
    }
}

