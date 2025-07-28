/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bj")
public class class46 {
    @ObfuscatedName(value="ay")
    int field298;
    @ObfuscatedName(value="ah")
    int field301;
    @ObfuscatedName(value="az")
    int field297;
    @ObfuscatedName(value="ao")
    int field299;
    @ObfuscatedName(value="ad")
    int field300;
    @ObfuscatedName(value="an")
    int field296;
    @ObfuscatedName(value="ae")
    int[] field302;

    class46() {
        class60 class602 = VorbisSample.field347;
        this.field298 = class602.method1205(16);
        this.field301 = class602.method1205(24);
        this.field297 = class602.method1205(24);
        this.field299 = class602.method1205(24) + 1;
        this.field300 = class602.method1205(6) + 1;
        this.field296 = class602.method1205(8);
        int[] nArray = new int[this.field300];
        int n = 0;
        while (true) {
            boolean bl;
            if (n >= this.field300) {
                this.field302 = new int[this.field300 * 8];
                for (n = 0; n < this.field300 * 8; ++n) {
                    this.field302[n] = (nArray[n >> 3] & 1 << (n & 7)) != 0 ? class602.method1205(8) : -1;
                }
                return;
            }
            int n2 = 0;
            int n3 = class602.method1205(3);
            boolean bl2 = bl = class602.method1207() != 0;
            if (bl) {
                n2 = class602.method1205(5);
            }
            nArray[n] = n2 << 3 | n3;
            ++n;
        }
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([FIZLcy;)V")
    void method900(float[] var1_1, int var2_2, boolean var3_3, class60 var4_4) {
        for (var5_5 = 0; var5_5 < var2_2; ++var5_5) {
            var1_1[var5_5] = 0.0f;
        }
        if (var3_3) {
            return;
        }
        var5_5 = VorbisSample.field363[this.field296].field333;
        var6_6 = this.field297 - this.field301;
        var7_7 = var6_6 / this.field299;
        var8_8 = new int[var7_7];
        var9_9 = 0;
        while (true) {
            if (var9_9 >= 8) {
                return;
            }
            var10_10 = 0;
            block2: while (var10_10 < var7_7) {
                if (var9_9 != 0) ** GOTO lbl21
                var11_11 = VorbisSample.field363[this.field296].method1110(var4_4);
                var12_12 = var5_5 - 1;
                while (true) {
                    block18: {
                        if (var12_12 >= 0) break block18;
lbl21:
                        // 3 sources

                        for (var11_11 = 0; var11_11 < var5_5; ++var11_11) {
                            block17: {
                                var12_12 = var8_8[var10_10];
                                var13_13 = this.field302[var9_9 + var12_12 * 8];
                                if (var13_13 >= 0) {
                                    var14_14 = var10_10 * this.field299 + this.field301;
                                    var15_15 = VorbisSample.field363[var13_13];
                                    if (this.field298 != 0) {
                                        var16_16 = 0;
                                        while (var16_16 < this.field299) {
                                            var17_17 = var15_15.method1111(var4_4);
                                            for (var18_18 = 0; var18_18 < var15_15.field333; ++var18_18) {
                                                v0 = var14_14 + var16_16;
                                                var1_1[v0] = var1_1[v0] + var17_17[var18_18];
                                                ++var16_16;
                                            }
                                        }
                                    } else {
                                        var16_16 = this.field299 / var15_15.field333;
                                        var20_20 = 0;
lbl40:
                                        // 2 sources

                                        while (true) {
                                            if (var20_20 < var16_16) break block17;
                                            break;
                                        }
                                    }
                                }
                                if (++var10_10 >= var7_7) continue block2;
                                continue;
                            }
                            var21_21 = var15_15.method1111(var4_4);
                            for (var19_19 = 0; var19_19 < var15_15.field333; ++var19_19) {
                                v1 = var14_14 + var20_20 + var19_19 * var16_16;
                                var1_1[v1] = var1_1[v1] + var21_21[var19_19];
                            }
                            ++var20_20;
                            ** continue;
                        }
                        continue block2;
                    }
                    if (var10_10 + var12_12 < var7_7) {
                        var8_8[var10_10 + var12_12] = var11_11 % this.field300;
                    }
                    var11_11 /= this.field300;
                    --var12_12;
                }
            }
            ++var9_9;
        }
    }
}

