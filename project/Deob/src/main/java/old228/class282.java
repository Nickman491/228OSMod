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

@ObfuscatedName(value="kf")
public class class282
extends class302 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1352700713)
    final int field3087;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lki;")
    final class285 field3085;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=2131429413)
    int field3084;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lli;")
    class297 field3086;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=441142667)
    int field3088;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-575586641)
    int field3089;

    @ObfuscatedSignature(descriptor="(Lnz;Lnz;ILki;)V")
    class282(class350 class3502, class350 class3503, int n, class285 class2852) {
        super(class3502, class3503);
        this.field3087 = n;
        this.field3085 = class2852;
        this.method5995();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-76")
    void method5995() {
        this.field3084 = class142.method3512((int)this.field3087).method5517().field2817;
        this.field3086 = this.field3085.method6176(class31.method498(this.field3084));
        class236 class2362 = class31.method498(this.vmethod6438());
        class570 class5702 = class2362.method5167(false);
        if (class5702 == null) {
            this.field3088 = 0;
            this.field3089 = 0;
        } else {
            this.field3088 = class5702.field5570;
            this.field3089 = class5702.field5571;
        }
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="468922444")
    public int vmethod6438() {
        return this.field3084;
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)Lli;", garbageValue="24")
    class297 vmethod6439() {
        return this.field3086;
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1283952551")
    int vmethod6440() {
        return this.field3088;
    }

    @Override
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1685687159")
    int vmethod6453() {
        return this.field3089;
    }
}

