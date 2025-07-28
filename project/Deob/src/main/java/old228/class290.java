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

@ObfuscatedName(value="lj")
public class class290
extends class302 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1454486399)
    final int field3171;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lli;")
    final class297 field3169;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-530200853)
    final int field3168;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-179215661)
    final int field3170;

    @ObfuscatedSignature(descriptor="(Lnz;Lnz;ILli;)V")
    class290(class350 class3502, class350 class3503, int n, class297 class2972) {
        super(class3502, class3503);
        this.field3171 = n;
        this.field3169 = class2972;
        class236 class2362 = class31.method498(this.vmethod6438());
        class570 class5702 = class2362.method5167(false);
        if (class5702 == null) {
            this.field3168 = 0;
            this.field3170 = 0;
        } else {
            this.field3168 = class5702.field5570;
            this.field3170 = class5702.field5571;
        }
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="468922444")
    public int vmethod6438() {
        return this.field3171;
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)Lli;", garbageValue="24")
    class297 vmethod6439() {
        return this.field3169;
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1283952551")
    int vmethod6440() {
        return this.field3168;
    }

    @Override
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1685687159")
    int vmethod6453() {
        return this.field3170;
    }

    @ObfuscatedName(value="co")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-2063488600")
    static void method6334(int n) {
        if (n == -1) {
            return;
        }
        if (!class170.field1807.method7024(n)) {
            return;
        }
        class361[] class361Array = class170.field1807.field3772[n];
        int n2 = 0;
        while (n2 < class361Array.length) {
            class361 class3612 = class361Array[n2];
            if (class3612.field3967 != null) {
                class90 class902 = new class90();
                class902.field1077 = class3612;
                class902.field1086 = class3612.field3967;
                class150.method3597(class902, 5000000, 0);
            }
            ++n2;
        }
        return;
    }
}

