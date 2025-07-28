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

@ObfuscatedName(value="kk")
public class class277 {
    @ObfuscatedName(value="ni")
    @ObfuscatedGetter(intValue=877858037)
    static int field3055;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="[Lky;")
    class273[] field3054;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1223628239")
    public void method5940() {
        this.field3054 = new class273[1];
        class271 class2712 = class271.field3005;
        this.field3054[0] = new class273(class2712.field3013, class2712.field3014);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIILkv;Lku;Z[I[IB)I", garbageValue="30")
    public int method5941(int n, int n2, int n3, RouteStrategy routeStrategy, CollisionMap collisionMap, boolean bl, int[] nArray, int[] nArray2) {
        return this.method5942(n, n2, n3, routeStrategy, collisionMap, bl, nArray, nArray2, this.field3054[0]);
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIILkv;Lku;Z[I[ILky;I)I", garbageValue="1289071983")
    int method5942(int var1_1, int var2_2, int var3_3, RouteStrategy var4_4, CollisionMap var5_5, boolean var6_6, int[] var7_7, int[] var8_8, class273 var9_9) {
        var9_9.method5850();
        var10_10 = var9_9.method5886();
        var11_11 = var9_9.method5855();
        var12_12 = var9_9.method5857();
        var13_13 = var9_9.method5856();
        var14_14 = var9_9.method5858();
        var15_15 = var9_9.method5877();
        var16_16 = var3_3 == 1 ? this.method5958(var1_1, var2_2, var4_4, var5_5, var9_9) : (var3_3 == 2 ? this.method5944(var1_1, var2_2, var4_4, var5_5, var9_9) : this.method5943(var1_1, var2_2, var3_3, var4_4, var5_5, var9_9));
        var17_17 = var1_1 - (var10_10 >> 1);
        var18_18 = var2_2 - (var11_11 >> 1);
        var19_19 = var9_9.method5852();
        var20_20 = var9_9.method5863();
        if (var16_16) ** GOTO lbl29
        if (!var6_6) {
            return -1;
        }
        var21_21 = 0x7FFFFFFF;
        var22_22 = 0x7FFFFFFF;
        var23_23 = 10;
        var24_24 = var4_4.approxDestinationX;
        var25_25 = var4_4.approxDestinationY;
        var26_26 = var4_4.approxDestinationSizeX;
        var27_27 = var4_4.approxDestinationSizeY;
        var28_28 = var24_24 - var23_23;
        while (true) {
            block22: {
                if (var28_28 > var23_23 + var24_24) {
                    if (var21_21 == 0x7FFFFFFF) {
                        return -1;
                    } else {
                        ** GOTO lbl29
                    }
                }
                break block22;
lbl29:
                // 3 sources

                if (var19_19 == var1_1 && var20_20 == var2_2) {
                    var7_7[0] = var19_19;
                    var8_8[0] = var20_20;
                    return 0;
                }
                var21_21 = 0;
                var14_14[var21_21] = var19_19;
                var15_15[var21_21++] = var20_20;
                var22_22 = var23_23 = var13_13[var19_19 - var17_17][var20_20 - var18_18];
                while (true) {
                    if (var19_19 == var1_1 && var20_20 == var2_2) {
                        var24_24 = 0;
                        while (var21_21-- > 0) {
                            var7_7[var24_24] = var14_14[var21_21];
                            var8_8[var24_24++] = var15_15[var21_21];
                            if (var24_24 < var7_7.length) continue;
                        }
                        return var24_24;
                    }
                    if (var22_22 != var23_23) {
                        var23_23 = var22_22;
                        var14_14[var21_21] = var19_19;
                        var15_15[var21_21++] = var20_20;
                    }
                    if ((var22_22 & 2) != 0) {
                        ++var19_19;
                    } else if ((var22_22 & 8) != 0) {
                        --var19_19;
                    }
                    if ((var22_22 & 1) != 0) {
                        ++var20_20;
                    } else if ((var22_22 & 4) != 0) {
                        --var20_20;
                    }
                    var22_22 = var13_13[var19_19 - var17_17][var20_20 - var18_18];
                }
            }
            for (var29_29 = var25_25 - var23_23; var29_29 <= var25_25 + var23_23; ++var29_29) {
                var30_30 = var28_28 - var17_17;
                var31_31 = var29_29 - var18_18;
                if (var30_30 < 0 || var31_31 < 0 || var30_30 >= var10_10 || var31_31 >= var11_11 || var12_12[var30_30][var31_31] >= 100) continue;
                var32_32 = 0;
                if (var28_28 < var24_24) {
                    var32_32 = var24_24 - var28_28;
                } else if (var28_28 > var26_26 + var24_24 - 1) {
                    var32_32 = var28_28 - (var24_24 + var26_26 - 1);
                }
                var33_33 = 0;
                if (var29_29 < var25_25) {
                    var33_33 = var25_25 - var29_29;
                } else if (var29_29 > var27_27 + var25_25 - 1) {
                    var33_33 = var29_29 - (var27_27 + var25_25 - 1);
                }
                var34_34 = var33_33 * var33_33 + var32_32 * var32_32;
                if (var34_34 >= var21_21 && (var21_21 != var34_34 || var12_12[var30_30][var31_31] >= var22_22)) continue;
                var21_21 = var34_34;
                var22_22 = var12_12[var30_30][var31_31];
                var19_19 = var28_28;
                var20_20 = var29_29;
            }
            ++var28_28;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IILkv;Lku;Lky;I)Z", garbageValue="1917928080")
    final boolean method5958(int n, int n2, RouteStrategy routeStrategy, CollisionMap collisionMap, class273 class2732) {
        int n3 = class2732.method5886();
        int n4 = class2732.method5855();
        int[][] nArray = class2732.method5857();
        int[][] nArray2 = class2732.method5856();
        int[] nArray3 = class2732.method5858();
        int[] nArray4 = class2732.method5877();
        int n5 = class2732.method5860();
        int n6 = n;
        int n7 = n2;
        int n8 = n3 >> 1;
        int n9 = n4 >> 1;
        int n10 = n - n8;
        int n11 = n2 - n9;
        nArray2[n8][n9] = 99;
        nArray[n8][n9] = 0;
        int n12 = 0;
        int n13 = 0;
        nArray3[n12] = n6;
        nArray4[n12++] = n7;
        int[][] nArray5 = collisionMap.flags;
        while (true) {
            if (n12 == n13) {
                class2732.method5851(n6, n7);
                return false;
            }
            n6 = nArray3[n13];
            n7 = nArray4[n13];
            n13 = n13 + 1 & n5;
            n8 = n6 - n10;
            n9 = n7 - n11;
            int n14 = n6 - collisionMap.xInset;
            int n15 = n7 - collisionMap.yInset;
            if (routeStrategy.hasArrived(1, n6, n7, collisionMap)) break;
            int n16 = nArray[n8][n9] + 1;
            if (n8 > 0 && nArray2[n8 - 1][n9] == 0 && (nArray5[n14 - 1][n15] & 0x40240108) == 0) {
                nArray3[n12] = n6 - 1;
                nArray4[n12] = n7;
                n12 = n12 + 1 & n5;
                nArray2[n8 - 1][n9] = 2;
                nArray[n8 - 1][n9] = n16;
            }
            if (n8 < n3 - 1 && nArray2[n8 + 1][n9] == 0 && (nArray5[n14 + 1][n15] & 0x40240180) == 0) {
                nArray3[n12] = n6 + 1;
                nArray4[n12] = n7;
                n12 = n12 + 1 & n5;
                nArray2[n8 + 1][n9] = 8;
                nArray[n8 + 1][n9] = n16;
            }
            if (n9 > 0 && nArray2[n8][n9 - 1] == 0 && (nArray5[n14][n15 - 1] & 0x40240102) == 0) {
                nArray3[n12] = n6;
                nArray4[n12] = n7 - 1;
                n12 = n12 + 1 & n5;
                nArray2[n8][n9 - 1] = 1;
                nArray[n8][n9 - 1] = n16;
            }
            if (n9 < n4 - 1 && nArray2[n8][n9 + 1] == 0 && (nArray5[n14][n15 + 1] & 0x40240120) == 0) {
                nArray3[n12] = n6;
                nArray4[n12] = n7 + 1;
                n12 = n12 + 1 & n5;
                nArray2[n8][n9 + 1] = 4;
                nArray[n8][n9 + 1] = n16;
            }
            if (n8 > 0 && n9 > 0 && nArray2[n8 - 1][n9 - 1] == 0 && (nArray5[n14 - 1][n15 - 1] & 0x4024010E) == 0 && (nArray5[n14 - 1][n15] & 0x40240108) == 0 && (nArray5[n14][n15 - 1] & 0x40240102) == 0) {
                nArray3[n12] = n6 - 1;
                nArray4[n12] = n7 - 1;
                n12 = n12 + 1 & n5;
                nArray2[n8 - 1][n9 - 1] = 3;
                nArray[n8 - 1][n9 - 1] = n16;
            }
            if (n8 < n3 - 1 && n9 > 0 && nArray2[n8 + 1][n9 - 1] == 0 && (nArray5[n14 + 1][n15 - 1] & 0x40240183) == 0 && (nArray5[n14 + 1][n15] & 0x40240180) == 0 && (nArray5[n14][n15 - 1] & 0x40240102) == 0) {
                nArray3[n12] = n6 + 1;
                nArray4[n12] = n7 - 1;
                n12 = n12 + 1 & n5;
                nArray2[n8 + 1][n9 - 1] = 9;
                nArray[n8 + 1][n9 - 1] = n16;
            }
            if (n8 > 0 && n9 < n4 - 1 && nArray2[n8 - 1][n9 + 1] == 0 && (nArray5[n14 - 1][n15 + 1] & 0x40240138) == 0 && (nArray5[n14 - 1][n15] & 0x40240108) == 0 && (nArray5[n14][n15 + 1] & 0x40240120) == 0) {
                nArray3[n12] = n6 - 1;
                nArray4[n12] = n7 + 1;
                n12 = n12 + 1 & n5;
                nArray2[n8 - 1][n9 + 1] = 6;
                nArray[n8 - 1][n9 + 1] = n16;
            }
            if (n8 >= n3 - 1 || n9 >= n4 - 1 || nArray2[n8 + 1][n9 + 1] != 0 || (nArray5[n14 + 1][n15 + 1] & 0x402401E0) != 0 || (nArray5[n14 + 1][n15] & 0x40240180) != 0 || (nArray5[n14][n15 + 1] & 0x40240120) != 0) continue;
            nArray3[n12] = n6 + 1;
            nArray4[n12] = n7 + 1;
            n12 = n12 + 1 & n5;
            nArray2[n8 + 1][n9 + 1] = 12;
            nArray[n8 + 1][n9 + 1] = n16;
        }
        class2732.method5851(n6, n7);
        return true;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IILkv;Lku;Lky;I)Z", garbageValue="-2127081683")
    final boolean method5944(int n, int n2, RouteStrategy routeStrategy, CollisionMap collisionMap, class273 class2732) {
        int n3 = class2732.method5886();
        int n4 = class2732.method5855();
        int[][] nArray = class2732.method5857();
        int[][] nArray2 = class2732.method5856();
        int[] nArray3 = class2732.method5858();
        int[] nArray4 = class2732.method5877();
        int n5 = class2732.method5860();
        int n6 = n;
        int n7 = n2;
        int n8 = n3 >> 1;
        int n9 = n4 >> 1;
        int n10 = n - n8;
        int n11 = n2 - n9;
        nArray2[n8][n9] = 99;
        nArray[n8][n9] = 0;
        int n12 = 0;
        int n13 = 0;
        nArray3[n12] = n6;
        nArray4[n12++] = n7;
        int[][] nArray5 = collisionMap.flags;
        while (true) {
            if (n12 == n13) {
                class2732.method5851(n6, n7);
                return false;
            }
            n6 = nArray3[n13];
            n7 = nArray4[n13];
            n13 = n13 + 1 & n5;
            n8 = n6 - n10;
            n9 = n7 - n11;
            int n14 = n6 - collisionMap.xInset;
            int n15 = n7 - collisionMap.yInset;
            if (routeStrategy.hasArrived(2, n6, n7, collisionMap)) break;
            int n16 = nArray[n8][n9] + 1;
            if (n8 > 0 && nArray2[n8 - 1][n9] == 0 && (nArray5[n14 - 1][n15] & 0x4024010E) == 0 && (nArray5[n14 - 1][n15 + 1] & 0x40240138) == 0) {
                nArray3[n12] = n6 - 1;
                nArray4[n12] = n7;
                n12 = n12 + 1 & n5;
                nArray2[n8 - 1][n9] = 2;
                nArray[n8 - 1][n9] = n16;
            }
            if (n8 < n3 - 2 && nArray2[n8 + 1][n9] == 0 && (nArray5[n14 + 2][n15] & 0x40240183) == 0 && (nArray5[n14 + 2][n15 + 1] & 0x402401E0) == 0) {
                nArray3[n12] = n6 + 1;
                nArray4[n12] = n7;
                n12 = n12 + 1 & n5;
                nArray2[n8 + 1][n9] = 8;
                nArray[n8 + 1][n9] = n16;
            }
            if (n9 > 0 && nArray2[n8][n9 - 1] == 0 && (nArray5[n14][n15 - 1] & 0x4024010E) == 0 && (nArray5[n14 + 1][n15 - 1] & 0x40240183) == 0) {
                nArray3[n12] = n6;
                nArray4[n12] = n7 - 1;
                n12 = n12 + 1 & n5;
                nArray2[n8][n9 - 1] = 1;
                nArray[n8][n9 - 1] = n16;
            }
            if (n9 < n4 - 2 && nArray2[n8][n9 + 1] == 0 && (nArray5[n14][n15 + 2] & 0x40240138) == 0 && (nArray5[n14 + 1][n15 + 2] & 0x402401E0) == 0) {
                nArray3[n12] = n6;
                nArray4[n12] = n7 + 1;
                n12 = n12 + 1 & n5;
                nArray2[n8][n9 + 1] = 4;
                nArray[n8][n9 + 1] = n16;
            }
            if (n8 > 0 && n9 > 0 && nArray2[n8 - 1][n9 - 1] == 0 && (nArray5[n14 - 1][n15] & 0x4024013E) == 0 && (nArray5[n14 - 1][n15 - 1] & 0x4024010E) == 0 && (nArray5[n14][n15 - 1] & 0x4024018F) == 0) {
                nArray3[n12] = n6 - 1;
                nArray4[n12] = n7 - 1;
                n12 = n12 + 1 & n5;
                nArray2[n8 - 1][n9 - 1] = 3;
                nArray[n8 - 1][n9 - 1] = n16;
            }
            if (n8 < n3 - 2 && n9 > 0 && nArray2[n8 + 1][n9 - 1] == 0 && (nArray5[n14 + 1][n15 - 1] & 0x4024018F) == 0 && (nArray5[n14 + 2][n15 - 1] & 0x40240183) == 0 && (nArray5[n14 + 2][n15] & 0x402401E3) == 0) {
                nArray3[n12] = n6 + 1;
                nArray4[n12] = n7 - 1;
                n12 = n12 + 1 & n5;
                nArray2[n8 + 1][n9 - 1] = 9;
                nArray[n8 + 1][n9 - 1] = n16;
            }
            if (n8 > 0 && n9 < n4 - 2 && nArray2[n8 - 1][n9 + 1] == 0 && (nArray5[n14 - 1][n15 + 1] & 0x4024013E) == 0 && (nArray5[n14 - 1][n15 + 2] & 0x40240138) == 0 && (nArray5[n14][n15 + 2] & 0x402401F8) == 0) {
                nArray3[n12] = n6 - 1;
                nArray4[n12] = n7 + 1;
                n12 = n12 + 1 & n5;
                nArray2[n8 - 1][n9 + 1] = 6;
                nArray[n8 - 1][n9 + 1] = n16;
            }
            if (n8 >= n3 - 2 || n9 >= n4 - 2 || nArray2[n8 + 1][n9 + 1] != 0 || (nArray5[n14 + 1][n15 + 2] & 0x402401F8) != 0 || (nArray5[n14 + 2][n15 + 2] & 0x402401E0) != 0 || (nArray5[n14 + 2][n15 + 1] & 0x402401E3) != 0) continue;
            nArray3[n12] = n6 + 1;
            nArray4[n12] = n7 + 1;
            n12 = n12 + 1 & n5;
            nArray2[n8 + 1][n9 + 1] = 12;
            nArray[n8 + 1][n9 + 1] = n16;
        }
        class2732.method5851(n6, n7);
        return true;
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IIILkv;Lku;Lky;I)Z", garbageValue="-905997927")
    final boolean method5943(int var1_1, int var2_2, int var3_3, RouteStrategy var4_4, CollisionMap var5_5, class273 var6_6) {
        var7_7 = var6_6.method5886();
        var8_8 = var6_6.method5855();
        var9_9 = var6_6.method5857();
        var10_10 = var6_6.method5856();
        var11_11 = var6_6.method5858();
        var12_12 = var6_6.method5877();
        var13_13 = var6_6.method5860();
        var14_14 = var1_1;
        var15_15 = var2_2;
        var16_16 = var7_7 >> 1;
        var17_17 = var8_8 >> 1;
        var18_18 = var1_1 - var16_16;
        var19_19 = var2_2 - var17_17;
        var10_10[var16_16][var17_17] = 99;
        var9_9[var16_16][var17_17] = 0;
        var20_20 = 0;
        var21_21 = 0;
        var11_11[var20_20] = var14_14;
        var12_12[var20_20++] = var15_15;
        var22_22 = var5_5.flags;
        block0: while (true) {
            if (var20_20 == var21_21) {
                var6_6.method5851(var14_14, var15_15);
                return false;
            }
            var14_14 = var11_11[var21_21];
            var15_15 = var12_12[var21_21];
            var21_21 = var21_21 + 1 & var13_13;
            var16_16 = var14_14 - var18_18;
            var17_17 = var15_15 - var19_19;
            var23_23 = var14_14 - var5_5.xInset;
            var24_24 = var15_15 - var5_5.yInset;
            if (var4_4.hasArrived(var3_3, var14_14, var15_15, var5_5)) break;
            var25_25 = var9_9[var16_16][var17_17] + 1;
            if (var16_16 <= 0 || var10_10[var16_16 - 1][var17_17] != 0 || (var22_22[var23_23 - 1][var24_24] & 1076101390) != 0 || (var22_22[var23_23 - 1][var3_3 + var24_24 - 1] & 1076101432) != 0) ** GOTO lbl46
            var26_26 = 1;
            while (true) {
                block22: {
                    block21: {
                        block20: {
                            if (var26_26 < var3_3 - 1) break block20;
                            var11_11[var20_20] = var14_14 - 1;
                            var12_12[var20_20] = var15_15;
                            var20_20 = var20_20 + 1 & var13_13;
                            var10_10[var16_16 - 1][var17_17] = 2;
                            var9_9[var16_16 - 1][var17_17] = var25_25;
                            break block21;
                        }
                        if ((var22_22[var23_23 - 1][var26_26 + var24_24] & 1076101438) == 0) break block22;
                    }
                    if (var16_16 >= var7_7 - var3_3 || var10_10[var16_16 + 1][var17_17] != 0 || (var22_22[var3_3 + var23_23][var24_24] & 1076101507) != 0 || (var22_22[var3_3 + var23_23][var3_3 + var24_24 - 1] & 1076101600) != 0) ** GOTO lbl59
                    var26_26 = 1;
                    while (true) {
                        block25: {
                            block24: {
                                block23: {
                                    if (var26_26 < var3_3 - 1) break block23;
                                    var11_11[var20_20] = var14_14 + 1;
                                    var12_12[var20_20] = var15_15;
                                    var20_20 = var20_20 + 1 & var13_13;
                                    var10_10[var16_16 + 1][var17_17] = 8;
                                    var9_9[var16_16 + 1][var17_17] = var25_25;
                                    break block24;
                                }
                                if ((var22_22[var3_3 + var23_23][var24_24 + var26_26] & 1076101603) == 0) break block25;
                            }
                            if (var17_17 <= 0 || var10_10[var16_16][var17_17 - 1] != 0 || (var22_22[var23_23][var24_24 - 1] & 1076101390) != 0 || (var22_22[var3_3 + var23_23 - 1][var24_24 - 1] & 1076101507) != 0) ** GOTO lbl72
                            var26_26 = 1;
                            while (true) {
                                block28: {
                                    block27: {
                                        block26: {
                                            if (var26_26 < var3_3 - 1) break block26;
                                            var11_11[var20_20] = var14_14;
                                            var12_12[var20_20] = var15_15 - 1;
                                            var20_20 = var20_20 + 1 & var13_13;
                                            var10_10[var16_16][var17_17 - 1] = 1;
                                            var9_9[var16_16][var17_17 - 1] = var25_25;
                                            break block27;
                                        }
                                        if ((var22_22[var23_23 + var26_26][var24_24 - 1] & 1076101519) == 0) break block28;
                                    }
                                    if (var17_17 >= var8_8 - var3_3 || var10_10[var16_16][var17_17 + 1] != 0 || (var22_22[var23_23][var3_3 + var24_24] & 1076101432) != 0 || (var22_22[var3_3 + var23_23 - 1][var3_3 + var24_24] & 1076101600) != 0) ** GOTO lbl85
                                    var26_26 = 1;
                                    while (true) {
                                        block31: {
                                            block30: {
                                                block29: {
                                                    if (var26_26 < var3_3 - 1) break block29;
                                                    var11_11[var20_20] = var14_14;
                                                    var12_12[var20_20] = var15_15 + 1;
                                                    var20_20 = var20_20 + 1 & var13_13;
                                                    var10_10[var16_16][var17_17 + 1] = 4;
                                                    var9_9[var16_16][var17_17 + 1] = var25_25;
                                                    break block30;
                                                }
                                                if ((var22_22[var26_26 + var23_23][var3_3 + var24_24] & 1076101624) == 0) break block31;
                                            }
                                            if (var16_16 > 0 && var17_17 > 0 && var10_10[var16_16 - 1][var17_17 - 1] == 0 && (var22_22[var23_23 - 1][var24_24 - 1] & 1076101390) == 0) {
                                                var26_26 = 1;
                                                while (true) {
                                                    if (var26_26 >= var3_3) {
                                                        var11_11[var20_20] = var14_14 - 1;
                                                        var12_12[var20_20] = var15_15 - 1;
                                                        var20_20 = var20_20 + 1 & var13_13;
                                                        var10_10[var16_16 - 1][var17_17 - 1] = 3;
                                                        var9_9[var16_16 - 1][var17_17 - 1] = var25_25;
                                                        break;
                                                    }
                                                    if ((var22_22[var23_23 - 1][var26_26 + (var24_24 - 1)] & 1076101438) != 0 || (var22_22[var26_26 + (var23_23 - 1)][var24_24 - 1] & 1076101519) != 0) break;
                                                    ++var26_26;
                                                }
                                            }
                                            if (var16_16 < var7_7 - var3_3 && var17_17 > 0 && var10_10[var16_16 + 1][var17_17 - 1] == 0 && (var22_22[var3_3 + var23_23][var24_24 - 1] & 1076101507) == 0) {
                                                var26_26 = 1;
                                                while (true) {
                                                    if (var26_26 >= var3_3) {
                                                        var11_11[var20_20] = var14_14 + 1;
                                                        var12_12[var20_20] = var15_15 - 1;
                                                        var20_20 = var20_20 + 1 & var13_13;
                                                        var10_10[var16_16 + 1][var17_17 - 1] = 9;
                                                        var9_9[var16_16 + 1][var17_17 - 1] = var25_25;
                                                        break;
                                                    }
                                                    if ((var22_22[var3_3 + var23_23][var26_26 + (var24_24 - 1)] & 1076101603) != 0 || (var22_22[var23_23 + var26_26][var24_24 - 1] & 1076101519) != 0) break;
                                                    ++var26_26;
                                                }
                                            }
                                            if (var16_16 > 0 && var17_17 < var8_8 - var3_3 && var10_10[var16_16 - 1][var17_17 + 1] == 0 && (var22_22[var23_23 - 1][var3_3 + var24_24] & 1076101432) == 0) {
                                                var26_26 = 1;
                                                while (true) {
                                                    if (var26_26 >= var3_3) {
                                                        var11_11[var20_20] = var14_14 - 1;
                                                        var12_12[var20_20] = var15_15 + 1;
                                                        var20_20 = var20_20 + 1 & var13_13;
                                                        var10_10[var16_16 - 1][var17_17 + 1] = 6;
                                                        var9_9[var16_16 - 1][var17_17 + 1] = var25_25;
                                                        break;
                                                    }
                                                    if ((var22_22[var23_23 - 1][var24_24 + var26_26] & 1076101438) != 0 || (var22_22[var26_26 + (var23_23 - 1)][var3_3 + var24_24] & 1076101624) != 0) break;
                                                    ++var26_26;
                                                }
                                            }
                                            if (var16_16 >= var7_7 - var3_3 || var17_17 >= var8_8 - var3_3 || var10_10[var16_16 + 1][var17_17 + 1] != 0 || (var22_22[var3_3 + var23_23][var3_3 + var24_24] & 1076101600) != 0) continue block0;
                                            var26_26 = 1;
                                            while (true) {
                                                if (var26_26 >= var3_3) {
                                                    var11_11[var20_20] = var14_14 + 1;
                                                    var12_12[var20_20] = var15_15 + 1;
                                                    var20_20 = var20_20 + 1 & var13_13;
                                                    var10_10[var16_16 + 1][var17_17 + 1] = 12;
                                                    var9_9[var16_16 + 1][var17_17 + 1] = var25_25;
                                                    continue block0;
                                                }
                                                if ((var22_22[var23_23 + var26_26][var3_3 + var24_24] & 1076101624) == 0 && (var22_22[var3_3 + var23_23][var26_26 + var24_24] & 1076101603) == 0) ** break;
                                                continue block0;
                                                ++var26_26;
                                            }
                                        }
                                        ++var26_26;
                                    }
                                }
                                ++var26_26;
                            }
                        }
                        ++var26_26;
                    }
                }
                ++var26_26;
            }
            break;
        }
        var6_6.method5851(var14_14, var15_15);
        return true;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)[Ldv;", garbageValue="100")
    static class93[] method5964() {
        return new class93[]{class93.field1110, class93.field1109, class93.field1114, class93.field1113, class93.field1112, class93.field1117};
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="281856499")
    static void method5948() {
        Messages.Messages_channels.clear();
        Messages.Messages_hashTable.clear();
        Messages.Messages_queue.clear();
        Messages.Messages_count = 0;
    }
}

