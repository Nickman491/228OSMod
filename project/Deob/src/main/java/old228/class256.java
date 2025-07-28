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

@ObfuscatedName(value="ja")
public class class256
extends class510 {
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmi;")
    static class315 field2730 = new class315(64);
    @ObfuscatedName(value="an")
    static final int[] field2734 = new int[32];
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-704299373)
    public int field2729;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1843645225)
    public int field2732;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1856419001)
    public int field2731;

    static {
        int n = 2;
        int n2 = 0;
        while (n2 < 32) {
            class256.field2734[n2] = n - 1;
            n += n;
            ++n2;
        }
        return;
    }

    class256() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-456122148")
    void method5420(class556 class5562) {
        int n;
        while ((n = class5562.method10282()) != 0) {
            this.method5412(class5562, n);
        }
        return;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="-1149562142")
    void method5412(class556 class5562, int n) {
        if (n == 1) {
            this.field2729 = class5562.method10307();
            this.field2732 = class5562.method10282();
            this.field2731 = class5562.method10282();
        }
    }
}

