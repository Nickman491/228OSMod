package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="vh")
public class class547
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    public static class391 field5408;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static class315 field5409;
    @ObfuscatedName(value="az")
    public int[][] field5407;
    @ObfuscatedName(value="ao")
    public Object[][] field5410;

    static {
        field5409 = new class315(64);
    }

    class547() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="215413861")
    void method10151(class556 class5562) {
        int n;
        while ((n = class5562.method10282()) != 0) {
            this.method10152(class5562, n);
        }
        return;
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;IB)V", garbageValue="14")
    void method10152(class556 var1_1, int var2_2) {
        if (var2_2 != 1) ** GOTO lbl8
        var3_3 = var1_1.method10282();
        if (this.field5407 == null) {
            this.field5407 = new int[var3_3][];
        }
        var4_4 = var1_1.method10282();
        block0: while (true) {
            block12: {
                if (var4_4 != 255) break block12;
lbl8:
                // 2 sources

                return;
            }
            var5_5 = var4_4 & 127;
            var6_6 = (var4_4 & 128) != 0;
            var7_7 = new int[var1_1.method10282()];
            var8_8 = 0;
            while (true) {
                block13: {
                    if (var8_8 < var7_7.length) break block13;
                    this.field5407[var5_5] = var7_7;
                    if (!var6_6) ** GOTO lbl29
                    if (this.field5410 == null) {
                        this.field5410 = new Object[this.field5407.length][];
                    }
                    var17_17 = this.field5410;
                    var9_9 = var5_5;
                    var11_11 = var1_1.method10407();
                    var12_12 = new Object[var7_7.length * var11_11];
                    var13_13 = 0;
                    while (true) {
                        block14: {
                            if (var13_13 < var11_11) break block14;
                            var10_10 = var12_12;
                            var17_17[var9_9] = var10_10;
lbl29:
                            // 2 sources

                            var4_4 = var1_1.method10282();
                            continue block0;
                        }
                        for (var14_14 = 0; var14_14 < var7_7.length; ++var14_14) {
                            var15_15 = var14_14 + var7_7.length * var13_13;
                            var16_16 = class242.method5280(var7_7[var14_14]);
                            var12_12[var15_15] = var16_16.method10123(var1_1);
                        }
                        ++var13_13;
                    }
                }
                var7_7[var8_8] = var1_1.method10407();
                ++var8_8;
            }
            break;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="124")
    void method10159() {
    }
}

