package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import java.util.BitSet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="nb")
public class class338
extends class514 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1367548785)
    int field3698;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="[Lcn;")
    class53[] field3700;
    @ObfuscatedName(value="ao")
    short[] field3691;
    @ObfuscatedName(value="ad")
    byte[] field3695;
    @ObfuscatedName(value="an")
    byte[] field3696;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="[Lmx;")
    class332[] field3697;
    @ObfuscatedName(value="ax")
    byte[] field3692;
    @ObfuscatedName(value="at")
    ArrayList field3694;
    @ObfuscatedName(value="ac")
    int[] field3699;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    class338(byte[] var1_1) {
        block82: {
            super();
            this.field3694 = new ArrayList<E>(8);
            this.field3700 = new class53[128];
            this.field3691 = new short[128];
            this.field3695 = new byte[128];
            this.field3696 = new byte[128];
            this.field3697 = new class332[128];
            this.field3692 = new byte[128];
            this.field3699 = new int[128];
            var2_2 = new class556(var1_1);
            var3_3 = 0;
            while (var2_2.field5470[var3_3 + var2_2.field5471] != 0) {
                ++var3_3;
            }
            var4_4 = new byte[var3_3];
            for (var5_5 = 0; var5_5 < var3_3; ++var5_5) {
                var4_4[var5_5] = var2_2.method10524();
            }
            ++var2_2.field5471;
            var5_5 = var2_2.field5471;
            var2_2.field5471 += ++var3_3;
            var6_6 = 0;
            while (var2_2.field5470[var6_6 + var2_2.field5471] != 0) {
                ++var6_6;
            }
            var7_7 = new byte[var6_6];
            for (var8_8 = 0; var8_8 < var6_6; ++var8_8) {
                var7_7[var8_8] = var2_2.method10524();
            }
            ++var2_2.field5471;
            var8_8 = var2_2.field5471;
            var2_2.field5471 += ++var6_6;
            var9_9 = 0;
            while (var2_2.field5470[var9_9 + var2_2.field5471] != 0) {
                ++var9_9;
            }
            var10_10 = new byte[var9_9];
            for (var11_11 = 0; var11_11 < var9_9; ++var11_11) {
                var10_10[var11_11] = var2_2.method10524();
            }
            ++var2_2.field5471;
            var38_12 = new byte[++var9_9];
            if (var9_9 > 1) break block82;
            var12_13 = var9_9;
            ** GOTO lbl53
        }
        var38_12[1] = 1;
        var13_14 = 1;
        var12_13 = 2;
        var14_15 = 2;
        while (true) {
            block83: {
                if (var14_15 < var9_9) break block83;
lbl53:
                // 2 sources

                var39_17 = new class332[var12_13];
                var14_15 = 0;
                while (true) {
                    block84: {
                        if (var14_15 < var39_17.length) break block84;
                        var14_15 = var2_2.method10282();
                        var15_19 = var14_15 > 0 ? (Object)new byte[var14_15 * 2] : null;
                        var14_15 = var2_2.method10282();
                        var16_20 = var14_15 > 0 ? new byte[var14_15 * 2] : null;
                        var17_21 = 0;
                        while (var2_2.field5470[var17_21 + var2_2.field5471] != 0) {
                            ++var17_21;
                        }
                        var18_22 = new byte[var17_21];
                        for (var19_23 = 0; var19_23 < var17_21; ++var19_23) {
                            var18_22[var19_23] = var2_2.method10524();
                        }
                        ++var2_2.field5471;
                        ++var17_21;
                        var19_23 = 0;
                        var20_24 = 0;
                        while (true) {
                            block85: {
                                if (var20_24 < 128) break block85;
                                var19_23 = 0;
                                var20_24 = 0;
                                while (true) {
                                    block86: {
                                        if (var20_24 < 128) break block86;
                                        var20_24 = 0;
                                        var21_25 = 0;
                                        var22_26 = 0;
                                        var23_27 = 0;
                                        while (true) {
                                            block87: {
                                                if (var23_27 < 128) break block87;
                                                var20_24 = 0;
                                                var21_25 = 0;
                                                var23_27 = 0;
                                                var24_28 = 0;
                                                while (true) {
                                                    block88: {
                                                        if (var24_28 < 128) break block88;
                                                        var20_24 = 0;
                                                        var21_25 = 0;
                                                        var24_28 = 0;
                                                        var25_29 = 0;
                                                        while (true) {
                                                            block89: {
                                                                if (var25_29 < 128) break block89;
                                                                var20_24 = 0;
                                                                var21_25 = 0;
                                                                var40_30 = null;
                                                                var26_31 = 0;
                                                                while (true) {
                                                                    block90: {
                                                                        if (var26_31 < 128) break block90;
                                                                        var20_24 = 0;
                                                                        var21_25 = 0;
                                                                        var26_31 = 0;
                                                                        var27_32 /* !! */  = 0;
                                                                        while (true) {
                                                                            block91: {
                                                                                if (var27_32 /* !! */  < 128) break block91;
                                                                                this.field3698 = var2_2.method10282() + 1;
                                                                                var27_32 /* !! */  = 0;
                                                                                while (true) {
                                                                                    block92: {
                                                                                        if (var27_32 /* !! */  < var12_13) break block92;
                                                                                        if (var15_19 != null) {
                                                                                            for (var27_32 /* !! */  = 1; var27_32 /* !! */  < ((class332)var15_19).length; var27_32 /* !! */  += 2) {
                                                                                                var15_19[var27_32 /* !! */ ] = (class332)var2_2.method10524();
                                                                                            }
                                                                                        }
                                                                                        if (var16_20 != null) {
                                                                                            for (var27_32 /* !! */  = 1; var27_32 /* !! */  < var16_20.length; var27_32 /* !! */  += 2) {
                                                                                                var16_20[var27_32 /* !! */ ] = var2_2.method10524();
                                                                                            }
                                                                                        }
                                                                                        var27_32 /* !! */  = 0;
                                                                                        while (true) {
                                                                                            block93: {
                                                                                                if (var27_32 /* !! */  < var12_13) break block93;
                                                                                                var27_32 /* !! */  = 0;
                                                                                                block21: while (true) {
                                                                                                    block94: {
                                                                                                        if (var27_32 /* !! */  < var12_13) break block94;
                                                                                                        if (var15_19 == null) ** GOTO lbl145
                                                                                                        var19_23 = var2_2.method10282();
                                                                                                        var15_19[0] = (class332)((byte)var19_23);
                                                                                                        var27_32 /* !! */  = 2;
                                                                                                        while (true) {
                                                                                                            block95: {
                                                                                                                if (var27_32 /* !! */  < ((class332)var15_19).length) break block95;
                                                                                                                var27_32 /* !! */  = (int)var15_19[0];
                                                                                                                var28_35 /* !! */  = var15_19[1];
                                                                                                                for (var29_33 = 0; var29_33 < var27_32 /* !! */ ; ++var29_33) {
                                                                                                                    this.field3695[var29_33] = (byte)(var28_35 /* !! */  * this.field3695[var29_33] + 32 >> 6);
                                                                                                                }
                                                                                                                var29_33 = 2;
                                                                                                                block24: while (true) {
                                                                                                                    block96: {
                                                                                                                        if (var29_33 < ((class332)var15_19).length) break block96;
                                                                                                                        for (var30_36 /* !! */  = var27_32 /* !! */ ; var30_36 /* !! */  < 128; ++var30_36 /* !! */ ) {
                                                                                                                            this.field3695[var30_36 /* !! */ ] = (byte)(var28_35 /* !! */  * this.field3695[var30_36 /* !! */ ] + 32 >> 6);
                                                                                                                        }
                                                                                                                        var15_19 = null;
lbl145:
                                                                                                                        // 2 sources

                                                                                                                        if (var16_20 == null) ** GOTO lbl163
                                                                                                                        var19_23 = var2_2.method10282();
                                                                                                                        var16_20[0] = (byte)var19_23;
                                                                                                                        var27_32 /* !! */  = 2;
                                                                                                                        while (true) {
                                                                                                                            block97: {
                                                                                                                                if (var27_32 /* !! */  < var16_20.length) break block97;
                                                                                                                                var27_32 /* !! */  = var16_20[0];
                                                                                                                                var28_35 /* !! */  = (reference)(var16_20[1] << 1);
                                                                                                                                var29_33 = 0;
                                                                                                                                while (true) {
                                                                                                                                    block98: {
                                                                                                                                        if (var29_33 < var27_32 /* !! */ ) break block98;
                                                                                                                                        var29_33 = 2;
                                                                                                                                        block28: while (true) {
                                                                                                                                            block99: {
                                                                                                                                                if (var29_33 < var16_20.length) break block99;
                                                                                                                                                var30_36 /* !! */  = var27_32 /* !! */ ;
                                                                                                                                                while (true) {
                                                                                                                                                    block100: {
                                                                                                                                                        if (var30_36 /* !! */  < 128) break block100;
                                                                                                                                                        var16_20 = null;
lbl163:
                                                                                                                                                        // 3 sources

                                                                                                                                                        for (var27_32 /* !! */  = 0; var27_32 /* !! */  < var12_13; ++var27_32 /* !! */ ) {
                                                                                                                                                            var39_17[var27_32 /* !! */ ].field3616 = var2_2.method10282();
                                                                                                                                                        }
                                                                                                                                                        var27_32 /* !! */  = 0;
                                                                                                                                                        while (true) {
                                                                                                                                                            if (var27_32 /* !! */  >= var12_13) {
                                                                                                                                                                for (var27_32 /* !! */  = 0; var27_32 /* !! */  < var12_13; ++var27_32 /* !! */ ) {
                                                                                                                                                                    var39_17[var27_32 /* !! */ ].field3621 = var2_2.method10282();
                                                                                                                                                                }
                                                                                                                                                                var27_32 /* !! */  = 0;
                                                                                                                                                                while (true) {
                                                                                                                                                                    if (var27_32 /* !! */  >= var12_13) {
                                                                                                                                                                        var27_32 /* !! */  = 0;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            if (var27_32 /* !! */  >= var12_13) {
                                                                                                                                                                                return;
                                                                                                                                                                            }
                                                                                                                                                                            var41_34 = var39_17[var27_32 /* !! */ ];
                                                                                                                                                                            if (var41_34.field3618 > 0) {
                                                                                                                                                                                var41_34.field3622 = var2_2.method10282();
                                                                                                                                                                            }
                                                                                                                                                                            ++var27_32 /* !! */ ;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    var41_34 = var39_17[var27_32 /* !! */ ];
                                                                                                                                                                    if (var41_34.field3621 > 0) {
                                                                                                                                                                        var41_34.field3618 = var2_2.method10282();
                                                                                                                                                                    }
                                                                                                                                                                    ++var27_32 /* !! */ ;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            var41_34 = var39_17[var27_32 /* !! */ ];
                                                                                                                                                            if (var41_34.field3614 != null) {
                                                                                                                                                                var41_34.field3617 = var2_2.method10282();
                                                                                                                                                            }
                                                                                                                                                            if (var41_34.field3615 != null) {
                                                                                                                                                                var41_34.field3620 = var2_2.method10282();
                                                                                                                                                            }
                                                                                                                                                            if (var41_34.field3616 > 0) {
                                                                                                                                                                var41_34.field3619 = var2_2.method10282();
                                                                                                                                                            }
                                                                                                                                                            ++var27_32 /* !! */ ;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    var31_37 /* !! */  = var28_35 /* !! */  + (this.field3696[var30_36 /* !! */ ] & 255);
                                                                                                                                                    if (var31_37 /* !! */  < 0) {
                                                                                                                                                        var31_37 /* !! */  = (reference)false;
                                                                                                                                                    }
                                                                                                                                                    if (var31_37 /* !! */  > 128) {
                                                                                                                                                        var31_37 /* !! */  = (reference)128;
                                                                                                                                                    }
                                                                                                                                                    this.field3696[var30_36 /* !! */ ] = (byte)var31_37 /* !! */ ;
                                                                                                                                                    ++var30_36 /* !! */ ;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            var30_36 /* !! */  = var16_20[var29_33];
                                                                                                                                            var31_37 /* !! */  = (reference)(var16_20[var29_33 + 1] << 1);
                                                                                                                                            var32_38 = var28_35 /* !! */  * (var30_36 /* !! */  - var27_32 /* !! */ ) + (var30_36 /* !! */  - var27_32 /* !! */ ) / 2;
                                                                                                                                            var33_39 /* !! */  = var27_32 /* !! */ ;
                                                                                                                                            while (true) {
                                                                                                                                                if (var33_39 /* !! */  >= var30_36 /* !! */ ) {
                                                                                                                                                    var27_32 /* !! */  = var30_36 /* !! */ ;
                                                                                                                                                    var28_35 /* !! */  = var31_37 /* !! */ ;
                                                                                                                                                    var29_33 += 2;
                                                                                                                                                    continue block28;
                                                                                                                                                }
                                                                                                                                                var35_41 = var30_36 /* !! */  - var27_32 /* !! */ ;
                                                                                                                                                var36_42 = var32_38 >>> 31;
                                                                                                                                                var36_42 = var34_40 = (var36_42 + var32_38) / var35_41 - var36_42;
                                                                                                                                                var37_43 /* !! */  = var36_42 + (this.field3696[var33_39 /* !! */ ] & 255);
                                                                                                                                                if (var37_43 /* !! */  < 0) {
                                                                                                                                                    var37_43 /* !! */  = (reference)false;
                                                                                                                                                }
                                                                                                                                                if (var37_43 /* !! */  > 128) {
                                                                                                                                                    var37_43 /* !! */  = (reference)128;
                                                                                                                                                }
                                                                                                                                                this.field3696[var33_39 /* !! */ ] = (byte)var37_43 /* !! */ ;
                                                                                                                                                var32_38 += var31_37 /* !! */  - var28_35 /* !! */ ;
                                                                                                                                                ++var33_39 /* !! */ ;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var30_36 /* !! */  = (int)(var28_35 /* !! */  + (this.field3696[var29_33] & 255));
                                                                                                                                    if (var30_36 /* !! */  < 0) {
                                                                                                                                        var30_36 /* !! */  = 0;
                                                                                                                                    }
                                                                                                                                    if (var30_36 /* !! */  > 128) {
                                                                                                                                        var30_36 /* !! */  = 128;
                                                                                                                                    }
                                                                                                                                    this.field3696[var29_33] = (byte)var30_36 /* !! */ ;
                                                                                                                                    ++var29_33;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var19_23 = var19_23 + 1 + var2_2.method10282();
                                                                                                                            var16_20[var27_32 /* !! */ ] = (byte)var19_23;
                                                                                                                            var27_32 /* !! */  += 2;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    var30_36 /* !! */  = (int)var15_19[var29_33];
                                                                                                                    var31_37 /* !! */  = var15_19[var29_33 + 1];
                                                                                                                    var32_38 = var28_35 /* !! */  * (var30_36 /* !! */  - var27_32 /* !! */ ) + (var30_36 /* !! */  - var27_32 /* !! */ ) / 2;
                                                                                                                    var33_39 /* !! */  = var27_32 /* !! */ ;
                                                                                                                    while (true) {
                                                                                                                        if (var33_39 /* !! */  >= var30_36 /* !! */ ) {
                                                                                                                            var27_32 /* !! */  = var30_36 /* !! */ ;
                                                                                                                            var28_35 /* !! */  = var31_37 /* !! */ ;
                                                                                                                            var29_33 += 2;
                                                                                                                            continue block24;
                                                                                                                        }
                                                                                                                        var35_41 = var30_36 /* !! */  - var27_32 /* !! */ ;
                                                                                                                        var36_42 = var32_38 >>> 31;
                                                                                                                        var36_42 = var34_40 = (var36_42 + var32_38) / var35_41 - var36_42;
                                                                                                                        this.field3695[var33_39 /* !! */ ] = (byte)(var36_42 * this.field3695[var33_39 /* !! */ ] + 32 >> 6);
                                                                                                                        var32_38 += var31_37 /* !! */  - var28_35 /* !! */ ;
                                                                                                                        ++var33_39 /* !! */ ;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            var19_23 = var19_23 + 1 + var2_2.method10282();
                                                                                                            var15_19[var27_32 /* !! */ ] = (class332)((byte)var19_23);
                                                                                                            var27_32 /* !! */  += 2;
                                                                                                        }
                                                                                                    }
                                                                                                    var41_34 = var39_17[var27_32 /* !! */ ];
                                                                                                    if (var41_34.field3614 == null) ** GOTO lbl274
                                                                                                    var19_23 = 0;
                                                                                                    var29_33 = 2;
                                                                                                    while (true) {
                                                                                                        block101: {
                                                                                                            if (var29_33 < var41_34.field3614.length) break block101;
lbl274:
                                                                                                            // 2 sources

                                                                                                            ++var27_32 /* !! */ ;
                                                                                                            continue block21;
                                                                                                        }
                                                                                                        var19_23 = 1 + var19_23 + var2_2.method10282();
                                                                                                        var41_34.field3614[var29_33] = (byte)var19_23;
                                                                                                        var29_33 += 2;
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            var41_34 = var39_17[var27_32 /* !! */ ];
                                                                                            if (var41_34.field3615 != null) {
                                                                                                var19_23 = 0;
                                                                                                for (var29_33 = 2; var29_33 < var41_34.field3615.length; var29_33 += 2) {
                                                                                                    var19_23 = var19_23 + 1 + var2_2.method10282();
                                                                                                    var41_34.field3615[var29_33] = (byte)var19_23;
                                                                                                }
                                                                                            }
                                                                                            ++var27_32 /* !! */ ;
                                                                                        }
                                                                                    }
                                                                                    var41_34 = var39_17[var27_32 /* !! */ ];
                                                                                    if (var41_34.field3614 != null) {
                                                                                        for (var29_33 = 1; var29_33 < var41_34.field3614.length; var29_33 += 2) {
                                                                                            var41_34.field3614[var29_33] = var2_2.method10524();
                                                                                        }
                                                                                    }
                                                                                    if (var41_34.field3615 != null) {
                                                                                        for (var29_33 = 3; var29_33 < var41_34.field3615.length - 2; var29_33 += 2) {
                                                                                            var41_34.field3615[var29_33] = var2_2.method10524();
                                                                                        }
                                                                                    }
                                                                                    ++var27_32 /* !! */ ;
                                                                                }
                                                                            }
                                                                            if (var20_24 == 0) {
                                                                                var20_24 = var21_25 < var18_22.length ? var18_22[var21_25++] : -1;
                                                                                if (this.field3699[var27_32 /* !! */ ] > 0) {
                                                                                    var26_31 = var2_2.method10282() + 1;
                                                                                }
                                                                            }
                                                                            this.field3695[var27_32 /* !! */ ] = (byte)var26_31;
                                                                            --var20_24;
                                                                            ++var27_32 /* !! */ ;
                                                                        }
                                                                    }
                                                                    if (this.field3699[var26_31] != 0) {
                                                                        if (var20_24 == 0) {
                                                                            var40_30 = var39_17[var38_12[var21_25]];
                                                                            var20_24 = var21_25 < var10_10.length ? var10_10[var21_25++] : -1;
                                                                        }
                                                                        this.field3697[var26_31] = var40_30;
                                                                        --var20_24;
                                                                    }
                                                                    ++var26_31;
                                                                }
                                                            }
                                                            if (this.field3699[var25_29] != 0) {
                                                                if (var20_24 == 0) {
                                                                    var20_24 = var21_25 < var7_7.length ? var7_7[var21_25++] : -1;
                                                                    var24_28 = var2_2.field5470[var8_8++] + 16 << 2;
                                                                }
                                                                this.field3696[var25_29] = (byte)var24_28;
                                                                --var20_24;
                                                            }
                                                            ++var25_29;
                                                        }
                                                    }
                                                    if (this.field3699[var24_28] != 0) {
                                                        if (var20_24 == 0) {
                                                            var20_24 = var21_25 < var4_4.length ? var4_4[var21_25++] : -1;
                                                            var23_27 = var2_2.field5470[var5_5++] - 1;
                                                        }
                                                        this.field3692[var24_28] = (byte)var23_27;
                                                        --var20_24;
                                                    }
                                                    ++var24_28;
                                                }
                                            }
                                            if (var20_24 == 0) {
                                                var20_24 = var21_25 < var18_22.length ? var18_22[var21_25++] : -1;
                                                var22_26 = var2_2.method10309();
                                            }
                                            v0 = var23_27;
                                            this.field3691[v0] = (short)(this.field3691[v0] + ((var22_26 - 1 & 2) << 14));
                                            this.field3699[var23_27] = var22_26;
                                            --var20_24;
                                            ++var23_27;
                                        }
                                    }
                                    v1 = var20_24++;
                                    this.field3691[v1] = (short)(this.field3691[v1] + ((var19_23 += var2_2.method10282()) << 8));
                                }
                            }
                            this.field3691[var20_24] = (short)(var19_23 += var2_2.method10282());
                            ++var20_24;
                        }
                    }
                    var15_19 = var39_17[var14_15] = new class332();
                    var42_18 = var2_2.method10282();
                    if (var42_18 > 0) {
                        var15_19.field3614 = new byte[var42_18 * 2];
                    }
                    if ((var42_18 = var2_2.method10282()) > 0) {
                        var15_19.field3615 = new byte[var42_18 * 2 + 2];
                        var15_19.field3615[1] = 64;
                    }
                    ++var14_15;
                }
            }
            var43_16 = var2_2.method10282();
            if (var43_16 == 0) {
                var13_14 = var12_13++;
            } else {
                if (var43_16 <= var13_14) {
                    // empty if block
                }
                var13_14 = --var43_16;
            }
            var38_12[var14_15] = (byte)var13_14;
            ++var14_15;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lbs;Ljava/util/BitSet;I)Z", garbageValue="1152709192")
    boolean method6887(class45 class456, BitSet bitSet) {
        boolean bl = true;
        int n = 0;
        class53 class533 = new class53();
        int n2 = bitSet.nextSetBit(0);
        block0: while (n2 != -1) {
            int n3 = bitSet.nextClearBit(n2);
            int n4 = n2;
            while (true) {
                int n5;
                if (n4 >= n3) {
                    n2 = bitSet.nextSetBit(n3);
                    continue block0;
                }
                if (bitSet.get(n4) && (n5 = this.field3699[n4]) != 0) {
                    if (n5 != n) {
                        n = n5--;
                        class533 = (n5 & 1) != 0 ? class456.method876(n5 >> 2) : new class53(class456.method888(n5 >> 2));
                        if (!class533.method1117()) {
                            this.field3694.add(this.field3694.size(), class533);
                        } else {
                            bl = false;
                        }
                    }
                    if (!class533.method1117()) {
                        this.field3700[n4] = class533;
                        this.field3699[n4] = 0;
                    }
                }
                ++n4;
            }
            break;
        }
        return bl;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1138550968")
    void method6888() {
        this.field3699 = null;
    }
}

