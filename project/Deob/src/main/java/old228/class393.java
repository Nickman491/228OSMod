package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pl")
public class class393 {
    @ObfuscatedName(value="ah")
    public static Comparator field4625 = new class396();
    @ObfuscatedName(value="az")
    public static Comparator field4624;
    @ObfuscatedName(value="ao")
    public static Comparator field4626;
    @ObfuscatedName(value="ad")
    public static Comparator field4627;
    @ObfuscatedName(value="ay")
    public final List field4623;

    static {
        new class398();
        field4624 = new class401();
        field4626 = new class395();
        field4627 = new class394();
    }

    @ObfuscatedSignature(descriptor="(Lvy;Z)V", garbageValue="1")
    public class393(class556 class5562, boolean bl) {
        int n = class5562.method10307();
        boolean bl2 = class5562.method10282() == 1;
        byte by = bl2 ? (byte)1 : 0;
        int n2 = class5562.method10307();
        this.field4623 = new ArrayList(n2);
        int n3 = 0;
        while (n3 < n2) {
            this.field4623.add(new class399(class5562, by, n));
            ++n3;
        }
        return;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/util/Comparator;ZI)V", garbageValue="449666140")
    public void method7858(Comparator comparator, boolean bl) {
        if (!bl) {
            Collections.sort(this.field4623, Collections.reverseOrder(comparator));
        } else {
            Collections.sort(this.field4623, comparator);
        }
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="jt")
    @ObfuscatedSignature(descriptor="(Ldz;I)V", garbageValue="1500148000")
    static void method7859(class103 var0) {
        var1_1 = var0.field1322 / 8;
        var2_2 = var0.field1323 / 8;
        var3_3 = false;
        class79.method2454(false);
        var3_3 = true;
        var4_4 = 0;
        while (true) {
            block27: {
                if (var4_4 < class292.field3193.length) break block27;
                if (!var3_3) {
                    return;
                }
                class79.method2454(false);
                var3_3 = true;
                var4_4 = 0;
                while (true) {
                    block28: {
                        if (var4_4 < class292.field3193.length) break block28;
                        if (!var3_3) {
                            return;
                        }
                        var4_4 = 0;
                        while (true) {
                            block29: {
                                if (var4_4 < 4) break block29;
                                class113.method3178();
                                class190.method4460();
                                class69.method1957();
                                class79.method2454(true);
                                var4_4 = 0;
                                while (true) {
                                    if (var4_4 >= 4) {
                                        var4_4 = 0;
                                        while (true) {
                                            if (var4_4 >= 13) {
                                                class79.method2454(true);
                                                var4_4 = 0;
                                                while (true) {
                                                    if (var4_4 >= 4) {
                                                        class79.method2454(true);
                                                        class113.method3178();
                                                        class399.method7903(var0);
                                                        class79.method2454(true);
                                                        ObjectDef.field2792.method6581();
                                                        class113.method3178();
                                                        class123.method3331();
                                                        client.field509 = false;
                                                        return;
                                                    }
                                                    class113.method3178();
                                                    for (var5_8 = 0; var5_8 < var1_1; ++var5_8) {
                                                        block7: for (var6_6 = 0; var6_6 < var2_2; ++var6_6) {
                                                            var7_7 = client.field574[var4_4][var5_8][var6_6];
                                                            if (var7_7 == -1) continue;
                                                            var8_9 = var7_7 >> 24 & 3;
                                                            var9_10 = var7_7 >> 1 & 3;
                                                            var10_11 = var7_7 >> 14 & 1023;
                                                            var11_12 = var7_7 >> 3 & 2047;
                                                            var12_13 = (var10_11 / 8 << 8) + var11_12 / 8;
                                                            for (var13_14 = 0; var13_14 < class259.field2742.length; ++var13_14) {
                                                                if (class259.field2742[var13_14] != var12_13 || class536.field5365[var13_14] == null) continue;
                                                                class84.method2511(var0, class536.field5365[var13_14], var4_4, var5_8 * 8, var6_6 * 8, var8_9, (var10_11 & 7) * 8, (var11_12 & 7) * 8, var9_10);
                                                                continue block7;
                                                            }
                                                        }
                                                    }
                                                    ++var4_4;
                                                }
                                            }
                                            for (var5_8 = 0; var5_8 < 13; ++var5_8) {
                                                var6_6 = client.field574[0][var4_4][var5_8];
                                                if (var6_6 != -1) continue;
                                                class280.method5989(var0, var4_4 * 8, var5_8 * 8, 8, 8);
                                            }
                                            ++var4_4;
                                        }
                                    }
                                    class113.method3178();
                                    for (var5_8 = 0; var5_8 < var1_1; ++var5_8) {
                                        block11: for (var6_6 = 0; var6_6 < var2_2; ++var6_6) {
                                            var7_7 = 0;
                                            var8_9 = client.field574[var4_4][var5_8][var6_6];
                                            if (var8_9 == -1) ** GOTO lbl88
                                            var9_10 = var8_9 >> 24 & 3;
                                            var10_11 = var8_9 >> 1 & 3;
                                            var11_12 = var8_9 >> 14 & 1023;
                                            var12_13 = var8_9 >> 3 & 2047;
                                            var13_14 = (var11_12 / 8 << 8) + var12_13 / 8;
                                            var14_15 = 0;
                                            while (true) {
                                                block31: {
                                                    block30: {
                                                        if (var14_15 >= class259.field2742.length) break block30;
                                                        if (class259.field2742[var14_15] != var13_14 || class292.field3193[var14_15] == null) break block31;
                                                        var15_16 = (var11_12 - var5_8) * 8;
                                                        var16_17 = (var12_13 - var6_6) * 8;
                                                        class92.method2646(var0, class292.field3193[var14_15], var4_4, var5_8 * 8, var6_6 * 8, var9_10, (var11_12 & 7) * 8, (var12_13 & 7) * 8, var10_11, var15_16, var16_17);
                                                        var7_7 = 1;
                                                    }
                                                    if (var7_7 != 0) continue block11;
                                                    OverlayDef.method5662(var0.field1328, var4_4, var5_8 * 8, var6_6 * 8);
                                                    continue block11;
                                                }
                                                ++var14_15;
                                            }
                                        }
                                    }
                                    ++var4_4;
                                }
                            }
                            for (var5_8 = 0; var5_8 < var0.field1337[var4_4].length; ++var5_8) {
                                Arrays.fill(var0.field1337[var4_4][var5_8], (byte)0);
                            }
                            ++var4_4;
                        }
                    }
                    var17_5 = class536.field5365[var4_4];
                    if (var17_5 != null) {
                        var6_6 = 10;
                        var7_7 = 10;
                        var3_3 &= class508.method9614(var17_5, var6_6, var7_7);
                    }
                    ++var4_4;
                }
            }
            if (class440.field4851[var4_4] != -1 && class292.field3193[var4_4] == null) {
                class292.field3193[var4_4] = class68.field494.method7790(class440.field4851[var4_4], 0);
                if (class292.field3193[var4_4] == null) {
                    var3_3 = false;
                }
            }
            if (class239.field2578[var4_4] != -1 && class536.field5365[var4_4] == null) {
                class536.field5365[var4_4] = class68.field494.method7729(class239.field2578[var4_4], 0, class374.field4114[var4_4]);
                if (class536.field5365[var4_4] == null) {
                    var3_3 = false;
                }
            }
            ++var4_4;
        }
    }
}

