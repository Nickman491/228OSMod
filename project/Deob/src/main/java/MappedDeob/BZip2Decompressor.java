/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="vl")
@Implements(value="BZip2Decompressor")
public final class BZip2Decompressor {
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lva;")
    @Export(value="BZip2Decompressor_state")
    static BZip2State BZip2Decompressor_state = new BZip2State();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ay")
    @Export(value="BZip2Decompressor_decompress")
    public static int BZip2Decompressor_decompress(byte[] byArray, int n, byte[] byArray2, int n2, int n3) {
        BZip2State bZip2State = BZip2Decompressor_state;
        synchronized (bZip2State) {
            BZip2Decompressor.BZip2Decompressor_state.inputArray = byArray2;
            BZip2Decompressor.BZip2Decompressor_state.nextByte = n3;
            BZip2Decompressor.BZip2Decompressor_state.outputArray = byArray;
            BZip2Decompressor.BZip2Decompressor_state.next_out = 0;
            BZip2Decompressor.BZip2Decompressor_state.outputLength = n;
            BZip2Decompressor.BZip2Decompressor_state.bsLive = 0;
            BZip2Decompressor.BZip2Decompressor_state.bsBuff = 0;
            BZip2Decompressor.BZip2Decompressor_state.nextBit_unused = 0;
            BZip2Decompressor.BZip2Decompressor_state.field5489 = 0;
            BZip2Decompressor.BZip2Decompressor_decompress(BZip2Decompressor_state);
            BZip2Decompressor.BZip2Decompressor_state.inputArray = null;
            BZip2Decompressor.BZip2Decompressor_state.outputArray = null;
            return n -= BZip2Decompressor.BZip2Decompressor_state.outputLength;
        }
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lva;)V")
    static void method10557(BZip2State var0) {
        var2_1 = var0.out_char;
        var3_2 = var0.su_rNToGo;
        var4_3 = var0.nblocks_used;
        var5_4 = var0.su_ch2;
        var6_5 = BZip2State.BZip2Decompressor_block;
        var7_6 = var0.field5496;
        var8_7 = var0.outputArray;
        var9_8 = var0.next_out;
        var11_10 = var10_9 = var0.outputLength;
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
                    var0.out_char = var2_1;
                    var0.su_rNToGo = var3_2;
                    var0.nblocks_used = var4_3;
                    var0.su_ch2 = var5_4;
                    BZip2State.BZip2Decompressor_block = var6_5;
                    var0.field5496 = var7_6;
                    var0.outputArray = var8_7;
                    var0.next_out = var9_8;
                    var0.outputLength = var10_9;
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
    @Export(value="BZip2Decompressor_decompress")
    static void BZip2Decompressor_decompress(BZip2State var0) {
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
    @Export(value="BZip2Decompressor_readNextByte")
    static byte BZip2Decompressor_readNextByte(BZip2State bZip2State) {
        return (byte)BZip2Decompressor.BZip2Decompressor_readBits(8, bZip2State);
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lva;)B")
    @Export(value="BZip2Decompressor_readNextBit")
    static byte BZip2Decompressor_readNextBit(BZip2State bZip2State) {
        return (byte)BZip2Decompressor.BZip2Decompressor_readBits(1, bZip2State);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(ILva;)I")
    @Export(value="BZip2Decompressor_readBits")
    static int BZip2Decompressor_readBits(int n, BZip2State bZip2State) {
        while (bZip2State.bsLive < n) {
            bZip2State.bsBuff = bZip2State.bsBuff << 8 | bZip2State.inputArray[bZip2State.nextByte] & 0xFF;
            bZip2State.bsLive += 8;
            ++bZip2State.nextByte;
            ++bZip2State.nextBit_unused;
            if (bZip2State.nextBit_unused != 0) continue;
        }
        int n2 = bZip2State.bsBuff >> bZip2State.bsLive - n & (1 << n) - 1;
        bZip2State.bsLive -= n;
        return n2;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lva;)V")
    @Export(value="makeMaps")
    static void makeMaps(BZip2State bZip2State) {
        bZip2State.nInUse = 0;
        int n = 0;
        while (n < 256) {
            if (bZip2State.inUse[n]) {
                bZip2State.seqToUnseq[bZip2State.nInUse] = (byte)n;
                ++bZip2State.nInUse;
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ax")
    @Export(value="BZip2Decompressor_createHuffmanTables")
    static void BZip2Decompressor_createHuffmanTables(int[] nArray, int[] nArray2, int[] nArray3, byte[] byArray, int n, int n2, int n3) {
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

