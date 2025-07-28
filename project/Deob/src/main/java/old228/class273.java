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

@ObfuscatedName(value="ky")
public class class273 {
    @ObfuscatedName(value="ds")
    static boolean field3035;
    @ObfuscatedName(value="ay")
    final int[][] field3031;
    @ObfuscatedName(value="ah")
    final int[][] field3028;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1936066213)
    int field3025;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-2011681545)
    int field3026;
    @ObfuscatedName(value="ad")
    final int[] field3029;
    @ObfuscatedName(value="an")
    final int[] field3030;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=298514173)
    final int field3027;

    class273(int n, int n2) {
        this.field3031 = new int[n][n2];
        this.field3028 = new int[n][n2];
        int n3 = n2 * n;
        int n4 = class357.method7049(n3 / 4);
        this.field3029 = new int[n4];
        this.field3030 = new int[n4];
        this.field3027 = n4 - 1;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1612101914")
    void method5850() {
        int n = 0;
        while (n < this.field3031.length) {
            for (int i = 0; i < this.field3031[n].length; ++i) {
                this.field3031[n][i] = 0;
                this.field3028[n][i] = 99999999;
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-976996248")
    void method5851(int n, int n2) {
        this.field3025 = n;
        this.field3026 = n2;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="45")
    int method5852() {
        return this.field3025;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="71")
    int method5863() {
        return this.field3026;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1701907074")
    int method5886() {
        return this.field3031.length;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(S)I", garbageValue="1188")
    int method5855() {
        return this.field3031[0].length;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)[[I", garbageValue="-230145331")
    int[][] method5856() {
        return this.field3031;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)[[I", garbageValue="2015726352")
    int[][] method5857() {
        return this.field3028;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(B)[I", garbageValue="81")
    int[] method5858() {
        return this.field3029;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(I)[I", garbageValue="-2017734139")
    int[] method5877() {
        return this.field3030;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1261980185")
    int method5860() {
        return this.field3027;
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-1711907147")
    static int method5890(int var0, class81 var1_1, boolean var2_2) {
        block23: {
            block24: {
                block25: {
                    block26: {
                        block27: {
                            block28: {
                                block29: {
                                    block30: {
                                        block31: {
                                            block32: {
                                                block33: {
                                                    block34: {
                                                        block35: {
                                                            block36: {
                                                                var3_3 = true;
                                                                if (var0 < 2000) {
                                                                    var4_4 = var2_2 != false ? class134.field1564 : class9.field45;
                                                                } else {
                                                                    var0 -= 1000;
                                                                    var4_4 = class170.field1807.method7031(class72.field865[--class63.field444]);
                                                                    var3_3 = false;
                                                                }
                                                                if (var0 == 1300) break block23;
                                                                if (var0 == 1301) break block24;
                                                                if (var0 == 1302) break block25;
                                                                if (var0 == 1303) break block26;
                                                                if (var0 == 1304) break block27;
                                                                if (var0 == 1305) break block28;
                                                                if (var0 == 1306) break block29;
                                                                if (var0 == 1307) break block30;
                                                                if (var0 == 1308) break block31;
                                                                if (var0 == 1309) break block32;
                                                                if (var0 == 1310) break block33;
                                                                if (var0 == 1311) break block34;
                                                                if (var0 == 1312) break block35;
                                                                if (var0 != 1350) {
                                                                    if (var0 != 1351) {
                                                                        if (var0 != 1352) {
                                                                            if (var0 != 1353) {
                                                                                if (var0 != 1354) {
                                                                                    if (var0 != 1355) {
                                                                                        return 2;
                                                                                    }
                                                                                    var5_5 = 10;
                                                                                    class77.method2367(var4_4, var5_5);
                                                                                    return 1;
                                                                                }
                                                                                if ((var5_6 = class72.field865[--class63.field444] - 1) >= 0 && var5_6 <= 9) {
                                                                                    class77.method2367(var4_4, var5_6);
                                                                                    return 1;
                                                                                }
                                                                                throw new RuntimeException();
                                                                            }
                                                                            var5_7 = 10;
                                                                            var6_15 = class72.field865[--class63.field444];
                                                                            var7_19 = class72.field865[--class63.field444];
                                                                            class397.method7893(var4_4, var5_7, var6_15, var7_19);
                                                                            return 1;
                                                                        }
                                                                        var5_8 = class72.field865[class63.field444 -= 3] - 1;
                                                                        var6_16 = class72.field865[class63.field444 + 1];
                                                                        var7_20 = class72.field865[class63.field444 + 2];
                                                                        if (var5_8 >= 0 && var5_8 <= 9) {
                                                                            class397.method7893(var4_4, var5_8, var6_16, var7_20);
                                                                            return 1;
                                                                        }
                                                                        throw new RuntimeException();
                                                                    }
                                                                    var5_9 = 10;
                                                                    var8_22 = new byte[]{(byte)class72.field865[class63.field444 -= 2]};
                                                                    var9_24 = new byte[]{(byte)class72.field865[class63.field444 + 1]};
                                                                    class37.method725(var4_4, var5_9, var8_22, var9_24);
                                                                    return 1;
                                                                }
                                                                var10_25 = null;
                                                                var8_23 = null;
                                                                if (var3_3) break block36;
                                                                var10_25 = new byte[]{(byte)class72.field865[class63.field444 -= 2]};
                                                                var8_23 = new byte[]{(byte)class72.field865[class63.field444 + 1]};
                                                                ** GOTO lbl69
                                                            }
                                                            class63.field444 -= 10;
                                                            var7_21 = 0;
                                                            while (true) {
                                                                block37: {
                                                                    if (var7_21 < 10 && class72.field865[var7_21 + class63.field444] >= 0) break block37;
                                                                    if (var7_21 <= 0) ** GOTO lbl69
                                                                    var10_25 = new byte[var7_21 / 2];
                                                                    var8_23 = new byte[var7_21 / 2];
                                                                    var7_21 -= 2;
                                                                    while (true) {
                                                                        block38: {
                                                                            if (var7_21 >= 0) break block38;
lbl69:
                                                                            // 3 sources

                                                                            var7_21 = class72.field865[--class63.field444] - 1;
                                                                            if (var7_21 >= 0 && var7_21 <= 9) {
                                                                                class37.method725(var4_4, var7_21, var10_25, var8_23);
                                                                                return 1;
                                                                            }
                                                                            throw new RuntimeException();
                                                                        }
                                                                        var10_25[var7_21 / 2] = (byte)class72.field865[var7_21 + class63.field444];
                                                                        var8_23[var7_21 / 2] = (byte)class72.field865[var7_21 + class63.field444 + 1];
                                                                        var7_21 -= 2;
                                                                    }
                                                                }
                                                                var7_21 += 2;
                                                            }
                                                        }
                                                        if ((var5_10 = class72.field865[--class63.field444]) != -1) {
                                                            if (var5_10 >= 1 && var5_10 <= 10) {
                                                                var4_4.field3958 = (var5_10 - 1) * 79889599;
                                                            }
                                                        } else {
                                                            var4_4.field3958 = 319558396;
                                                        }
                                                        return 1;
                                                    }
                                                    var5_11 = class72.field865[--class63.field444] - 1;
                                                    if ((var6_17 = class72.field865[--class63.field444] - 1) >= 0 && var6_17 <= 9 && var5_11 >= 0) {
                                                        var4_4.method7498(var6_17, var5_11, class72.field855[--class104.field1343]);
                                                        return 1;
                                                    }
                                                    throw new RuntimeException();
                                                }
                                                if ((var5_12 = class72.field865[--class63.field444] - 1) >= 0 && var5_12 <= 9 && var4_4.field3957 != null) {
                                                    var4_4.field3957[var5_12] = null;
                                                    return 1;
                                                }
                                                return 1;
                                            }
                                            --class63.field444;
                                            return 1;
                                        }
                                        var4_4.field3869 = class72.field865[--class63.field444] == 1;
                                        return 1;
                                    }
                                    var4_4.field3956 = null;
                                    var4_4.field3957 = null;
                                    return 1;
                                }
                                var4_4.field3963 = class72.field855[--class104.field1343];
                                return 1;
                            }
                            var4_4.field4024 = class72.field855[--class104.field1343];
                            return 1;
                        }
                        var4_4.field3961 = class72.field865[--class63.field444];
                        return 1;
                    }
                    var4_4.field3960 = class72.field865[--class63.field444];
                    return 1;
                }
                var4_4.field4027 = class72.field865[--class63.field444] == 1;
                return 1;
            }
            var5_13 = class72.field865[class63.field444 -= 2];
            var6_18 = class72.field865[class63.field444 + 1];
            var4_4.field3898 = class170.field1807.method7023(var5_13, var6_18);
            return 1;
        }
        if ((var5_14 = class72.field865[--class63.field444] - 1) >= 0 && var5_14 <= 9) {
            var4_4.method7422(var5_14, class72.field855[--class104.field1343]);
            return 1;
        }
        --class104.field1343;
        return 1;
    }
}

