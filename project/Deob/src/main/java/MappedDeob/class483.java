/*
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

@ObfuscatedName(value="sf")
public class class483
extends class482 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=511137801)
    static final int field5045 = Client.field695 + 3;
    @ObfuscatedName(value="cf")
    @ObfuscatedGetter(intValue=-1809519995)
    static int field5046;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lks;")
    final class274 field5042 = new class274();
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lks;")
    final class274 field5043 = new class274();
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1218565273)
    int field5041 = 0;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=434863069)
    int field5044 = 0;

    class483() {
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lks;Lsm;II)V", garbageValue="-1318895003")
    void vmethod9368(class274 class2742, class481 class4812, int n) {
        this.field5042.method5899(class2742);
        this.field5043.method5899(class4812.field5037);
        this.field5041 = n - 1;
        this.field5044 = class4812.field5038 + field5045;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lks;IIB)Z", garbageValue="-65")
    boolean vmethod9369(class274 class2742, int n, int n2) {
        if (this.field5041 < this.field5044) {
            float f = class33.method521(n, this.field5041, this.field5044);
            class274 class2743 = this.field5042;
            class274 class2744 = this.field5043;
            float f2 = f;
            f2 = Frames.method4470(0.0f, 1.0f, f2);
            int n3 = class2744.method5895() - class2743.method5895();
            int n4 = class2744.method5894() - class2743.method5894();
            n3 = (int)(f2 * (float)n3);
            n4 = (int)((float)n4 * f2);
            class2742.method5902(class2743.method5895() + n3, class2743.method5894() + n4);
            int n5 = BuddyRankComparator.method3362(class2743.method5897(), class2744.method5897());
            n5 = (int)(f2 * (float)n5);
            class2742.method5901(class2743.method5897() + n5);
            return f >= 1.0f;
        }
        class2742.method5899(this.field5043);
        return true;
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="1212488341")
    void vmethod9367(int n, int n2) {
        this.field5042.method5903(n, n2);
        this.field5043.method5903(n, n2);
    }
}

