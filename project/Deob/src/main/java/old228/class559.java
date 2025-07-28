package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="vl")
public final class class559 {
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lva;")
    static class558 field5523 = new class558();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ay")
    public static int method10566(byte[] byArray, int n, byte[] byArray2, int n2, int n3) {
        class558 class5582 = field5523;
        synchronized (class5582) {
            class559.field5523.field5483 = byArray2;
            class559.field5523.field5484 = n3;
            class559.field5523.field5486 = byArray;
            class559.field5523.field5487 = 0;
            class559.field5523.field5494 = n;
            class559.field5523.field5488 = 0;
            class559.field5523.field5492 = 0;
            class559.field5523.field5485 = 0;
            class559.field5523.field5489 = 0;
            class559.method10545(field5523);
            class559.field5523.field5483 = null;
            class559.field5523.field5486 = null;
            return n -= class559.field5523.field5494;
        }
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lva;)V")
    static void method10557(class558 var0) {
        var2_1 = var0.field5503;
        var3_2 = var0.field5491;
        var4_3 = var0.field5499;
        var5_4 = var0.field5480;
        var6_5 = class558.field5501;
        var7_6 = var0.field5496;
        var8_7 = var0.field5486;
        var9_8 = var0.field5487;
        var11_10 = var10_9 = var0.field5494;
        var12_11 = var0.field5493 + 1;
        block0: while (true) {
            if (var3_2 <= 0) ** GOTO lbl20
            while (true) {
                block16: {
                    block15: {
                        if (var10_9 == 0) break block15;
                        if (var3_2 != 1) break block16;
                        if (var10_9 != 0) {
                            var8_7[var9_8] = var2_1;
                            ++var9_8;
                            --var10_9;
lbl20:
                            // 4 sources

                            while (var4_3 != var12_11) {
                                var2_1 = (byte)var5_4;
                                var7_6 = var6_5[var7_6];
                                var1_12 = (byte)var7_6;
                                var7_6 >>= 8;
                                ++var4_3;
                                if (var1_12 == var5_4) {
                                    if (var4_3 != var12_11) {
                                        var3_2 = 2;
                                        var7_6 = var6_5[var7_6];
                                        var1_12 = (byte)var7_6;
                                        var7_6 >>= 8;
                                        if (++var4_3 == var12_11) continue block0;
                                        if (var1_12 == var5_4) {
                                            var3_2 = 3;
                                            var7_6 = var6_5[var7_6];
                                            var1_12 = (byte)var7_6;
                                            var7_6 >>= 8;
                                            if (++var4_3 == var12_11) continue block0;
                                            if (var1_12 == var5_4) {
                                                var7_6 = var6_5[var7_6];
                                                var1_12 = (byte)var7_6;
                                                var7_6 >>= 8;
                                                ++var4_3;
                                                var3_2 = (var1_12 & 255) + 4;
                                                var7_6 = var6_5[var7_6];
                                                var5_4 = (byte)var7_6;
                                                var7_6 >>= 8;
                                                ++var4_3;
                                                continue block0;
                                            }
                                            var5_4 = var1_12;
                                            continue block0;
                                        }
                                        var5_4 = var1_12;
                                        continue block0;
                                    }
                                    if (var10_9 != 0) {
                                        var8_7[var9_8] = var2_1;
                                        ++var9_8;
                                        --var10_9;
                                        continue;
                                    }
                                    var3_2 = 1;
                                } else {
                                    var5_4 = var1_12;
                                    if (var10_9 != 0) {
                                        var8_7[var9_8] = var2_1;
                                        ++var9_8;
                                        --var10_9;
                                        continue;
                                    }
                                    var3_2 = 1;
                                }
                                break block15;
                            }
                            var3_2 = 0;
                        } else {
                            var3_2 = 1;
                        }
                    }
                    var13_13 = var0.field5489;
                    var0.field5489 += var11_10 - var10_9;
                    if (var0.field5489 < var13_13) {
                        // empty if block
                    }
                    var0.field5503 = var2_1;
                    var0.field5491 = var3_2;
                    var0.field5499 = var4_3;
                    var0.field5480 = var5_4;
                    class558.field5501 = var6_5;
                    var0.field5496 = var7_6;
                    var0.field5486 = var8_7;
                    var0.field5487 = var9_8;
                    var0.field5494 = var10_9;
                    return;
                }
                var8_7[var9_8] = var2_1;
                --var3_2;
                ++var9_8;
                --var10_9;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lva;)V")
    static void method10545(class558 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[UNCONDITIONALDOLOOP]], but top level block is 60[SIMPLE_IF_TAKEN]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lva;)B")
    static byte method10546(class558 class5582) {
        return (byte)class559.method10548(8, class5582);
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lva;)B")
    static byte method10547(class558 class5582) {
        return (byte)class559.method10548(1, class5582);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(ILva;)I")
    static int method10548(int n, class558 class5582) {
        while (class5582.field5488 < n) {
            class5582.field5492 = class5582.field5492 << 8 | class5582.field5483[class5582.field5484] & 0xFF;
            class5582.field5488 += 8;
            ++class5582.field5484;
            ++class5582.field5485;
            if (class5582.field5485 != 0) continue;
        }
        int n2 = class5582.field5492 >> class5582.field5488 - n & (1 << n) - 1;
        class5582.field5488 -= n;
        return n2;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lva;)V")
    static void method10543(class558 class5582) {
        class5582.field5502 = 0;
        int n = 0;
        while (n < 256) {
            if (class5582.field5477[n]) {
                class5582.field5505[class5582.field5502] = (byte)n;
                ++class5582.field5502;
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ax")
    static void method10550(int[] nArray, int[] nArray2, int[] nArray3, byte[] byArray, int n, int n2, int n3) {
        int n4 = 0;
        int n5 = n;
        while (true) {
            if (n5 > n2) {
                for (n5 = 0; n5 < 23; ++n5) {
                    nArray2[n5] = 0;
                }
                for (n5 = 0; n5 < n3; ++n5) {
                    int n6 = byArray[n5] + 1;
                    nArray2[n6] = nArray2[n6] + 1;
                }
                for (n5 = 1; n5 < 23; ++n5) {
                    int n7 = n5;
                    nArray2[n7] = nArray2[n7] + nArray2[n5 - 1];
                }
                for (n5 = 0; n5 < 23; ++n5) {
                    nArray[n5] = 0;
                }
                int n8 = 0;
                n5 = n;
                while (true) {
                    if (n5 > n2) {
                        n5 = n + 1;
                        while (true) {
                            if (n5 > n2) {
                                return;
                            }
                            nArray2[n5] = (nArray[n5 - 1] + 1 << 1) - nArray2[n5];
                            ++n5;
                        }
                    }
                    n8 = nArray2[n5 + 1] - nArray2[n5] + n8;
                    nArray[n5] = n8 - 1;
                    n8 <<= 1;
                    ++n5;
                }
            }
            for (int i = 0; i < n3; ++i) {
                if (n5 != byArray[i]) continue;
                nArray3[n4] = i;
                ++n4;
            }
            ++n5;
        }
    }
}

