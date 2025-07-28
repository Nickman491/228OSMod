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

@ObfuscatedName(value="dx")
public final class class94
extends class99 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lwb;")
    class579 field1147;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lny;")
    class358 field1121;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-4338737)
    int field1122 = -1;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=2021020425)
    int field1123 = -1;
    @ObfuscatedName(value="ae")
    String[] field1125 = new String[3];
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1450184417)
    int field1136;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1826513691)
    int field1127;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=1047556293)
    int field1128;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-507008159)
    int field1129;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=1071049889)
    int field1130;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=1467025815)
    int field1131;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-2059756935)
    int field1132;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=1918868429)
    int field1133;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lhv;")
    class198 field1142;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=1224039761)
    int field1124;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=-1108112153)
    int field1141;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=-2029592175)
    int field1146;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=1259463217)
    int field1144;
    @ObfuscatedName(value="ai")
    boolean field1139;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=1299238349)
    int field1140;
    @ObfuscatedName(value="am")
    boolean field1138;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=1798595885)
    int field1137;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=-1870889557)
    int field1145;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Lsb;")
    class479 field1126;
    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="Lsb;")
    class479 field1134;
    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="Lsb;")
    class479 field1135;
    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="Ldz;")
    class103 field1143;

    class94() {
        for (int i = 0; i < 3; ++i) {
            this.field1125[i] = "";
        }
        this.field1136 = 0;
        this.field1127 = 0;
        this.field1129 = 0;
        this.field1130 = 0;
        this.field1139 = false;
        this.field1140 = 0;
        this.field1138 = false;
        this.field1126 = class479.field5024;
        this.field1134 = class479.field5024;
        this.field1135 = class479.field5024;
        this.field1143 = class34.field189;
    }

    @Override
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(B)Lhv;", garbageValue="-7")
    protected final class198 vmethod4447() {
        SequenceDef class2652;
        if (this.field1121 == null) {
            return null;
        }
        SequenceDef class2653 = this.field1240 != -1 && this.field1271 == 0 ? class33.method520(this.field1240) : null;
        class198 class1982 = this.field1121.method7058(class2653, this.field1241, class2652 = this.field1238 != -1 && !this.field1139 && (this.field1201 != this.field1238 || class2653 == null) ? class33.method520(this.field1238) : null, this.field1237);
        if (class1982 == null) {
            return null;
        }
        class1982.method4600();
        this.field1255 = class1982.field2116;
        int n = class1982.field2195;
        if (!this.field1139) {
            class1982 = this.method2807(class1982);
        }
        if (!this.field1139 && this.field1142 != null) {
            if (client.field514 >= this.field1130) {
                this.field1142 = null;
            }
            if (client.field514 >= this.field1129 && client.field514 < this.field1130) {
                class198 class1983 = this.field1142;
                class1983.method4559(this.field1131 * 4096 - this.field1213, this.field1132 - this.field1128, this.field1133 * 4096 - this.field1196);
                if (this.field1262 != 512) {
                    if (this.field1262 != 1024) {
                        if (this.field1262 == 1536) {
                            class1983.method4545();
                        }
                    } else {
                        class1983.method4545();
                        class1983.method4545();
                    }
                } else {
                    class1983.method4545();
                    class1983.method4545();
                    class1983.method4545();
                }
                class198[] class198Array = new class198[]{class1982, class1983};
                class1982 = new class198(class198Array, 2);
                if (this.field1262 == 512) {
                    class1983.method4545();
                } else if (this.field1262 != 1024) {
                    if (this.field1262 == 1536) {
                        class1983.method4545();
                        class1983.method4545();
                        class1983.method4545();
                    }
                } else {
                    class1983.method4545();
                    class1983.method4545();
                }
                class1983.method4559(this.field1213 - this.field1131 * 4096, this.field1128 - this.field1132, this.field1196 - this.field1133 * 4096);
            }
        }
        class1982.field2239 = true;
        if (this.field1208 != 0 && client.field514 >= this.field1256 && client.field514 < this.field1252) {
            class1982.field2196 = this.field1258;
            class1982.field2257 = this.field1211;
            class1982.field2206 = this.field1261;
            class1982.field2225 = this.field1208;
            class1982.field2193 = (short)n;
        } else {
            class1982.field2225 = 0;
        }
        return class1982;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Lvy;B)V", garbageValue="3")
    final void method2654(class556 class5562) {
        int n;
        class228[] class228Array;
        int[] nArray;
        int[] nArray2;
        int n2;
        int[] nArray3;
        int n3;
        int n4;
        byte by;
        block31: {
            int n5;
            int n6;
            int n7;
            class5562.field5471 = 0;
            by = class5562.method10524();
            n4 = -1;
            this.field1122 = class5562.method10524();
            this.field1123 = class5562.method10524();
            n3 = -1;
            this.field1140 = 0;
            nArray3 = new int[12];
            for (int i = 0; i < nArray3.length; ++i) {
                n7 = class5562.method10282();
                if (n7 == 0) {
                    nArray3[i] = 0;
                    continue;
                }
                n6 = class5562.method10282();
                n2 = n6 + (n7 << 8);
                if (i == 0 && n2 == 65535) {
                    n3 = class5562.method10307();
                    break;
                }
                nArray3[i] = n2;
                if (!this.method2696(nArray3[i]) || (n5 = this.method2671((int)nArray3[i]).field2895) == 0) continue;
                this.field1140 = n5;
            }
            nArray2 = new int[12];
            n7 = 0;
            while (true) {
                if (n7 >= nArray2.length) break;
                n6 = class5562.method10282();
                if (n6 == 0) {
                    nArray2[n7] = 0;
                } else {
                    n2 = class5562.method10282();
                    nArray2[n7] = n2 + (n6 << 8);
                }
                ++n7;
            }
            nArray = new int[5];
            n6 = 0;
            while (true) {
                block35: {
                    block33: {
                        block34: {
                            block32: {
                                if (n6 >= nArray.length) break block32;
                                n2 = class5562.method10282();
                                if (n2 < 0) break block33;
                                break block34;
                            }
                            this.field1201 = class5562.method10307();
                            if (this.field1201 == 65535) {
                                this.field1201 = -1;
                            }
                            this.field1202 = class5562.method10307();
                            if (this.field1202 == 65535) {
                                this.field1202 = -1;
                            }
                            this.field1203 = this.field1202;
                            this.field1204 = class5562.method10307();
                            if (this.field1204 == 65535) {
                                this.field1204 = -1;
                            }
                            this.field1223 = class5562.method10307();
                            if (this.field1223 == 65535) {
                                this.field1223 = -1;
                            }
                            this.field1267 = class5562.method10307();
                            if (this.field1267 == 65535) {
                                this.field1267 = -1;
                            }
                            this.field1207 = class5562.method10307();
                            if (this.field1207 == 65535) {
                                this.field1207 = -1;
                            }
                            this.field1257 = class5562.method10307();
                            if (this.field1257 == 65535) {
                                this.field1257 = -1;
                            }
                            this.field1147 = new class579(class5562.method10290(), class383.field4489);
                            this.method2656();
                            this.method2659();
                            this.method2662();
                            if (this == class407.field4693) {
                                class484.field5049 = this.field1147.method10969();
                            }
                            this.field1136 = class5562.method10282();
                            this.field1127 = class5562.method10307();
                            boolean bl = this.field1138 = class5562.method10282() == 1;
                            if (client.field500 == 0 && client.field671 >= 2) {
                                this.field1138 = false;
                            }
                            class228Array = null;
                            n2 = 0;
                            n5 = class5562.method10307();
                            int n8 = n2 = (n5 >> 15 & 1) == 1 ? 1 : 0;
                            if (n5 > 0 && n5 != 32768) {
                                class228Array = new class228[12];
                                break;
                            }
                            break block31;
                        }
                        if (n2 < class358.field3816[n6].length) break block35;
                    }
                    n2 = 0;
                }
                nArray[n6] = n2;
                ++n6;
            }
            for (n = 0; n < class228Array.length; ++n) {
                class228 class2282;
                short s;
                int n9;
                boolean bl;
                int[] nArray4;
                int n10;
                int n11 = n5 >> 12 - n & 1;
                if (n11 != 1) continue;
                class228[] class228Array2 = class228Array;
                int n12 = n;
                int n13 = nArray3[n] - 2048;
                int n14 = class5562.method10282();
                boolean bl2 = (n14 & 1) != 0;
                boolean bl3 = (n14 & 2) != 0;
                boolean bl4 = (n14 & 4) != 0;
                boolean bl5 = (n14 & 8) != 0;
                class228 class2283 = new class228(n13);
                if (bl2) {
                    n10 = class5562.method10282();
                    nArray4 = new int[]{n10 & 0xF, n10 >> 4 & 0xF};
                    bl = class2283.field2479 != null && nArray4.length == class2283.field2479.length;
                    for (n9 = 0; n9 < 2; ++n9) {
                        if (nArray4[n9] == 15) continue;
                        s = (short)class5562.method10307();
                        if (!bl) continue;
                        class2283.field2479[nArray4[n9]] = s;
                    }
                }
                if (bl3) {
                    n10 = class5562.method10282();
                    nArray4 = new int[]{n10 & 0xF, n10 >> 4 & 0xF};
                    bl = class2283.field2477 != null && nArray4.length == class2283.field2477.length;
                    for (n9 = 0; n9 < 2; ++n9) {
                        if (nArray4[n9] == 15) continue;
                        s = (short)class5562.method10307();
                        if (!bl) continue;
                        class2283.field2477[nArray4[n9]] = s;
                    }
                }
                if (bl4) {
                    class2283.field2482 = class5562.method10307();
                    class2283.field2472 = class5562.method10307();
                }
                if (bl5) {
                    class2283.field2480 = class5562.method10307();
                    class2283.field2481 = class5562.method10307();
                }
                class228Array2[n12] = class2282 = class2283;
            }
        }
        for (n = 0; n < 3; ++n) {
            this.field1125[n] = class5562.method10290();
        }
        n4 = class5562.method10524();
        if (this.field1121 == null) {
            this.field1121 = new class358();
        }
        this.field1121.method7095(nArray2, nArray3, class228Array, n2 != 0, nArray, by, n3, n4);
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1283443343")
    boolean method2697() {
        if (this.field1126 == class479.field5024) {
            this.method2657();
        }
        return this.field1126 == class479.field5023;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="92")
    void method2656() {
        this.field1126 = class479.field5024;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="70")
    void method2657() {
        this.field1126 = class10.field54.method2081(this.field1147) ? class479.field5023 : class479.field5022;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="-75")
    boolean method2658() {
        if (this.field1134 == class479.field5024) {
            this.method2677();
        }
        return this.field1134 == class479.field5023;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="506446761")
    void method2659() {
        this.field1134 = class479.field5024;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="809695880")
    void method2677() {
        this.field1134 = class281.field3080 != null && class281.field3080.method9194(this.field1147) ? class479.field5023 : class479.field5022;
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1378119328")
    void method2661() {
        int n = 0;
        while (true) {
            if (n >= 4) {
                this.field1135 = class479.field5022;
                return;
            }
            if (client.field737[n] != null && client.field737[n].method3712(this.field1147.method10969()) != -1 && n != 2) {
                this.field1135 = class479.field5023;
                return;
            }
            ++n;
        }
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1692676098")
    void method2662() {
        this.field1135 = class479.field5024;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1208907157")
    boolean method2663() {
        if (this.field1135 == class479.field5024) {
            this.method2661();
        }
        return this.field1135 == class479.field5023;
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="458573925")
    int method2664() {
        if (this.field1121 != null && this.field1121.field3812 != -1) {
            return class446.method8848((int)this.field1121.field3812).field2622;
        }
        return 1;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Ldz;IILkq;I)V", garbageValue="-1857557654")
    final void method2694(class103 class1032, int n, int n2, class275 class2752) {
        if (this.field1240 != -1 && class33.method520((int)this.field1240).field2942 == 1) {
            this.field1240 = -1;
        }
        this.method2782();
        if (n >= 0 && n < 104 && n2 >= 0 && n2 < 104) {
            if (this.field1266[0] >= 0 && this.field1266[0] < 104 && this.field1221[0] >= 0 && this.field1221[0] < 104) {
                if (class2752 == class275.field3046) {
                    class154.method3629(class1032, this, n, n2, class275.field3046);
                }
                this.method2678(n, n2, class2752);
            } else {
                this.method2667(n, n2);
            }
        } else {
            this.method2667(n, n2);
        }
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="1461697436")
    void method2667(int n, int n2) {
        this.field1265 = 0;
        this.field1270 = 0;
        this.field1269 = 0;
        this.field1266[0] = n;
        this.field1221[0] = n2;
        int n3 = this.method2664();
        this.field1213 = n3 * 64 + this.field1266[0] * 128;
        this.field1196 = this.field1221[0] * 128 + n3 * 64;
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(IILkq;B)V", garbageValue="-127")
    final void method2678(int n, int n2, class275 class2752) {
        if (this.field1265 < 9) {
            ++this.field1265;
        }
        int n3 = this.field1265;
        while (true) {
            if (n3 <= 0) {
                this.field1266[0] = n;
                this.field1221[0] = n2;
                this.field1264[0] = class2752;
                return;
            }
            this.field1266[n3] = this.field1266[n3 - 1];
            this.field1221[n3] = this.field1221[n3 - 1];
            this.field1264[n3] = this.field1264[n3 - 1];
            --n3;
        }
    }

    @Override
    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="3")
    final boolean vmethod3039() {
        return this.field1121 != null;
    }

    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="957965452")
    boolean method2696(int n) {
        return n >= 2048;
    }

    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(II)Lkm;", garbageValue="-466486148")
    ItemDef method2671(int n) {
        return class191.method4462(n - 2048);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;Lpq;Lpq;I)V", garbageValue="1937436320")
    public static void method2704(class391 class3912, class391 class3913, class391 class3914) {
        HitSplatDef.field2778 = class3912;
        HitSplatDef.field2751 = class3913;
        HitSplatDef.field2752 = class3914;
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="mb")
    @ObfuscatedSignature(descriptor="([Lna;IIIIIIII)V", garbageValue="2088854136")
    static final void method2706(class361[] var0, int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7) {
        var8_8 = 0;
        while (true) {
            block117: {
                block118: {
                    block119: {
                        if (var8_8 >= var0.length) {
                            return;
                        }
                        var9_9 = var0[var8_8];
                        if (var9_9 == null || var9_9.field4026 != var1_1 || !var9_9.method7424() && class232.method5133(var9_9) == 0 && var9_9 != client.field676 || (var9_9.field3991 != false ? class163.method3777(var9_9) != false : var9_9.field3873 == 0 && var9_9 != class424.field4739 && class163.method3777(var9_9) != false)) break block117;
                        if (var9_9.field3873 != 11) {
                            if (var9_9.field3873 == 12 && var9_9.method7449(class170.field1807)) {
                                class122.method3325(var9_9);
                            }
                        } else if (var9_9.method7523(class170.field1807, class280.field3069)) {
                            if (var9_9.method7433()) {
                                class122.method3325(var9_9);
                                class244.method5286(var9_9.field4014, var9_9, true);
                                var9_9.method7440().method4873().method4976(3, var9_9.method7440().method4853());
                            }
                            if (var9_9.field4023 != null) {
                                var10_10 = new class90();
                                var10_10.field1077 = var9_9;
                                var10_10.field1086 = var9_9.field4023;
                                client.field706.method7998(var10_10);
                            }
                        }
                        var26_26 = var9_9.field3884 + var6_6;
                        var11_11 = var7_7 + var9_9.field3885;
                        if (var9_9.field3873 != 9) {
                            var16_16 = var26_26 + var9_9.field3886;
                            var17_17 = var11_11 + var9_9.field3887 * -1528330031;
                            var12_12 = var26_26 > var2_2 ? var26_26 : var2_2;
                            var13_13 = var11_11 > var3_3 ? var11_11 : var3_3;
                            var14_14 = var16_16 < var4_4 ? var16_16 : var4_4;
                            var15_15 = var17_17 < var5_5 ? var17_17 : var5_5;
                        } else {
                            var16_16 = var26_26;
                            var17_17 = var11_11;
                            var18_18 = var26_26 + var9_9.field3886;
                            var19_19 = var9_9.field3887 * -1528330031 + var11_11;
                            if (var18_18 < var16_16) {
                                var20_20 = var16_16;
                                var16_16 = var18_18;
                                var18_18 = var20_20;
                            }
                            if (var19_19 < var17_17) {
                                var20_20 = var17_17;
                                var17_17 = var19_19;
                                var19_19 = var20_20;
                            }
                            var12_12 = var16_16 > var2_2 ? var16_16 : var2_2;
                            var13_13 = var17_17 > var3_3 ? var17_17 : var3_3;
                            var14_14 = var18_18 < var4_4 ? ++var18_18 : var4_4;
                            v0 = var15_15 = var19_19 < var5_5 ? ++var19_19 : var5_5;
                        }
                        if (var9_9 == client.field675) {
                            client.field683 = true;
                            client.field721 = var26_26;
                            client.field685 = var11_11;
                        }
                        var16_16 = 0;
                        if (var9_9.field3950) {
                            switch (client.field665) {
                                case 3: {
                                    if (var9_9.field3910 != client.field707) break;
                                    var16_16 = 1;
                                    break;
                                }
                                case 0: {
                                    var16_16 = 1;
                                    break;
                                }
                                case 2: {
                                    if (client.field707 != var9_9.field3910 >>> 16) break;
                                    var16_16 = 1;
                                }
                            }
                        }
                        if (var16_16 == 0 && var9_9.field3991 && (var12_12 >= var14_14 || var13_13 >= var15_15)) break block117;
                        if (var9_9.field3991) {
                            if (!var9_9.field3951) {
                                if (var9_9.field4025 && class35.field201 >= var12_12 && class35.field202 >= var13_13 && class35.field201 < var14_14 && class35.field202 < var15_15) {
                                    var27_27 = (class90)client.field706.method7996();
                                    while (var27_27 != null) {
                                        if (var27_27.field1075 && var27_27.field1077.field3986 == var27_27.field1086) {
                                            var27_27.method9623();
                                        }
                                        var27_27 = (class90)client.field706.method8005();
                                    }
                                }
                            } else if (class35.field201 >= var12_12 && class35.field202 >= var13_13 && class35.field201 < var14_14 && class35.field202 < var15_15) {
                                var27_27 = (class90)client.field706.method7996();
                                while (true) {
                                    if (var27_27 == null) {
                                        class45.method881();
                                        if (class243.field2596 == 0) {
                                            client.field675 = null;
                                            client.field676 = null;
                                        }
                                        if (!client.field647) {
                                            class102.method2990();
                                        }
                                        break;
                                    }
                                    if (var27_27.field1075) {
                                        var27_27.method9623();
                                        var27_27.field1077.field3959 = false;
                                    }
                                    var27_27 = (class90)client.field706.method8005();
                                }
                            }
                        }
                        var17_17 = class35.field201;
                        var18_18 = class35.field202;
                        if (class35.field200 != 0) {
                            var17_17 = class35.field209;
                            var18_18 = class35.field211;
                        }
                        v1 = var19_19 = var17_17 >= var12_12 && var18_18 >= var13_13 && var17_17 < var14_14 && var18_18 < var15_15 ? 1 : 0;
                        if (var9_9.field3875 == 1337) break block118;
                        if (var9_9.field3875 == 1338) break block119;
                        if (var9_9.field3875 == 1400) {
                            class420.field4722.method9912(class35.field201, class35.field202, (boolean)var19_19, var26_26, var11_11, var9_9.field3886, var9_9.field3887 * -1528330031);
                        }
                        if (!client.field647 && var19_19 != 0) {
                            if (var9_9.field3875 != 1400) {
                                class419.method8221(var9_9);
                            } else {
                                class420.field4722.method9803(var26_26, var11_11, var9_9.field3886, var9_9.field3887 * -1528330031, var17_17, var18_18);
                            }
                        }
                        if (var16_16 == 0) ** GOTO lbl110
                        var20_20 = 0;
                        while (true) {
                            block120: {
                                if (var20_20 < var9_9.field3861.length) break block120;
lbl110:
                                // 2 sources

                                if (!var9_9.field3991) ** GOTO lbl326
                                var19_19 = class35.field201 >= var12_12 && class35.field202 >= var13_13 && class35.field201 < var14_14 && class35.field202 < var15_15 ? 1 : 0;
                                var20_20 = 0;
                                if ((class35.field206 == 1 || !class25.field109 && class35.field206 == 4) && var19_19 != 0) {
                                    var20_20 = 1;
                                }
                                var21_21 = 0;
                                if ((class35.field200 == 1 || !class25.field109 && class35.field200 == 4) && class35.field209 >= var12_12 && class35.field211 >= var13_13 && class35.field209 < var14_14 && class35.field211 < var15_15) {
                                    var21_21 = 1;
                                }
                                if (var21_21 != 0) {
                                    class297.method6399(var9_9, class35.field209 - var26_26, class35.field211 - var11_11);
                                }
                                if (var9_9.method7425()) {
                                    if (var21_21 != 0) {
                                        client.field709.method7998(new class268(0, class35.field201 - var26_26, class35.field202 - var11_11, var9_9));
                                    }
                                    if (var20_20 != 0) {
                                        client.field709.method7998(new class268(1, class35.field201 - var26_26, class35.field202 - var11_11, var9_9));
                                    }
                                }
                                if (var9_9.field3875 == 1400) {
                                    class420.field4722.method9800(var17_17, var18_18, (boolean)(var19_19 & var20_20), (boolean)(var19_19 & var21_21));
                                }
                                if (client.field675 != null && var9_9 != client.field675 && var19_19 != 0 && class34.method673(class232.method5133(var9_9))) {
                                    client.field607 = var9_9;
                                }
                                if (var9_9 == client.field676) {
                                    client.field523 = true;
                                    client.field681 = var26_26;
                                    client.field682 = var11_11;
                                }
                                if (!var9_9.field3882) ** GOTO lbl326
                                if (var19_19 != 0 && client.field704 != 0 && var9_9.field3986 != null) {
                                    var22_22 = new class90();
                                    var22_22.field1075 = true;
                                    var22_22.field1077 = var9_9;
                                    var22_22.field1079 = client.field704;
                                    var22_22.field1086 = var9_9.field3986;
                                    client.field706.method7998((class514)var22_22);
                                }
                                if (client.field675 != null || client.field647) {
                                    var21_21 = 0;
                                    var20_20 = 0;
                                    var19_19 = 0;
                                }
                                if (!var9_9.field4016 && var21_21 != 0) {
                                    var9_9.field4016 = true;
                                    if (var9_9.field3966 != null) {
                                        var22_22 = new class90();
                                        var22_22.field1075 = true;
                                        var22_22.field1077 = var9_9;
                                        var22_22.field1078 = class35.field209 - var26_26;
                                        var22_22.field1079 = class35.field211 - var11_11;
                                        var22_22.field1086 = var9_9.field3966;
                                        client.field706.method7998((class514)var22_22);
                                    }
                                }
                                if (var9_9.field4016 && var20_20 != 0 && var9_9.field3944 != null) {
                                    var22_22 = new class90();
                                    var22_22.field1075 = true;
                                    var22_22.field1077 = var9_9;
                                    var22_22.field1078 = class35.field201 - var26_26;
                                    var22_22.field1079 = class35.field202 - var11_11;
                                    var22_22.field1086 = var9_9.field3944;
                                    client.field706.method7998((class514)var22_22);
                                }
                                if (var9_9.field4016 && var20_20 == 0) {
                                    var9_9.field4016 = false;
                                    if (var9_9.field3968 != null) {
                                        var22_22 = new class90();
                                        var22_22.field1075 = true;
                                        var22_22.field1077 = var9_9;
                                        var22_22.field1078 = class35.field201 - var26_26;
                                        var22_22.field1079 = class35.field202 - var11_11;
                                        var22_22.field1086 = var9_9.field3968;
                                        client.field708.method7998((class514)var22_22);
                                    }
                                }
                                if (var20_20 != 0 && var9_9.field3883 != null) {
                                    var22_22 = new class90();
                                    var22_22.field1075 = true;
                                    var22_22.field1077 = var9_9;
                                    var22_22.field1078 = class35.field201 - var26_26;
                                    var22_22.field1079 = class35.field202 - var11_11;
                                    var22_22.field1086 = var9_9.field3883;
                                    client.field706.method7998((class514)var22_22);
                                }
                                if (!var9_9.field3959 && var19_19 != 0) {
                                    var9_9.field3959 = true;
                                    if (var9_9.field3870 != null) {
                                        var22_22 = new class90();
                                        var22_22.field1075 = true;
                                        var22_22.field1077 = var9_9;
                                        var22_22.field1078 = class35.field201 - var26_26;
                                        var22_22.field1079 = class35.field202 - var11_11;
                                        var22_22.field1086 = var9_9.field3870;
                                        client.field706.method7998((class514)var22_22);
                                    }
                                }
                                if (var9_9.field3959 && var19_19 != 0 && var9_9.field3971 != null) {
                                    var22_22 = new class90();
                                    var22_22.field1075 = true;
                                    var22_22.field1077 = var9_9;
                                    var22_22.field1078 = class35.field201 - var26_26;
                                    var22_22.field1079 = class35.field202 - var11_11;
                                    var22_22.field1086 = var9_9.field3971;
                                    client.field706.method7998((class514)var22_22);
                                }
                                if (var9_9.field3959 && var19_19 == 0) {
                                    var9_9.field3959 = false;
                                    if (var9_9.field3972 != null) {
                                        var22_22 = new class90();
                                        var22_22.field1075 = true;
                                        var22_22.field1077 = var9_9;
                                        var22_22.field1078 = class35.field201 - var26_26;
                                        var22_22.field1079 = class35.field202 - var11_11;
                                        var22_22.field1086 = var9_9.field3972;
                                        client.field708.method7998((class514)var22_22);
                                    }
                                }
                                if (var9_9.field3983 != null) {
                                    var22_22 = new class90();
                                    var22_22.field1077 = var9_9;
                                    var22_22.field1086 = var9_9.field3983;
                                    client.field666.method7998((class514)var22_22);
                                }
                                if (var9_9.field3977 != null && client.field586 > var9_9.field4018) {
                                    block114: {
                                        if (var9_9.field3939 != null && client.field586 - var9_9.field4018 <= 32) {
                                            for (var28_28 = var9_9.field4018; var28_28 < client.field586; ++var28_28) {
                                                var23_23 = client.field688[var28_28 & 31];
                                                for (var24_24 = 0; var24_24 < var9_9.field3939.length; ++var24_24) {
                                                    if (var23_23 != var9_9.field3939[var24_24]) continue;
                                                    var25_25 = new class90();
                                                    var25_25.field1077 = var9_9;
                                                    var25_25.field1086 = var9_9.field3977;
                                                    client.field706.method7998(var25_25);
                                                    break block114;
                                                }
                                            }
                                        } else {
                                            var22_22 = new class90();
                                            var22_22.field1077 = var9_9;
                                            var22_22.field1086 = var9_9.field3977;
                                            client.field706.method7998((class514)var22_22);
                                        }
                                    }
                                    var9_9.field4018 = client.field586;
                                }
                                if (var9_9.field3979 != null && client.field749 > var9_9.field4019) {
                                    block115: {
                                        if (var9_9.field3980 != null && client.field749 - var9_9.field4019 <= 32) {
                                            for (var28_28 = var9_9.field4019; var28_28 < client.field749; ++var28_28) {
                                                var23_23 = client.field544[var28_28 & 31];
                                                for (var24_24 = 0; var24_24 < var9_9.field3980.length; ++var24_24) {
                                                    if (var23_23 != var9_9.field3980[var24_24]) continue;
                                                    var25_25 = new class90();
                                                    var25_25.field1077 = var9_9;
                                                    var25_25.field1086 = var9_9.field3979;
                                                    client.field706.method7998(var25_25);
                                                    break block115;
                                                }
                                            }
                                        } else {
                                            var22_22 = new class90();
                                            var22_22.field1077 = var9_9;
                                            var22_22.field1086 = var9_9.field3979;
                                            client.field706.method7998((class514)var22_22);
                                        }
                                    }
                                    var9_9.field4019 = client.field749;
                                }
                                if (var9_9.field3981 != null && client.field505 > var9_9.field3954) {
                                    block116: {
                                        if (var9_9.field3982 != null && client.field505 - var9_9.field3954 <= 32) {
                                            for (var28_28 = var9_9.field3954; var28_28 < client.field505; ++var28_28) {
                                                var23_23 = client.field780[var28_28 & 31];
                                                for (var24_24 = 0; var24_24 < var9_9.field3982.length; ++var24_24) {
                                                    if (var23_23 != var9_9.field3982[var24_24]) continue;
                                                    var25_25 = new class90();
                                                    var25_25.field1077 = var9_9;
                                                    var25_25.field1086 = var9_9.field3981;
                                                    client.field706.method7998(var25_25);
                                                    break block116;
                                                }
                                            }
                                        } else {
                                            var22_22 = new class90();
                                            var22_22.field1077 = var9_9;
                                            var22_22.field1086 = var9_9.field3981;
                                            client.field706.method7998((class514)var22_22);
                                        }
                                    }
                                    var9_9.field3954 = client.field505;
                                }
                                if (client.field696 > var9_9.field4017 && var9_9.field3995 != null) {
                                    var22_22 = new class90();
                                    var22_22.field1077 = var9_9;
                                    var22_22.field1086 = var9_9.field3995;
                                    client.field706.method7998((class514)var22_22);
                                }
                                if (client.field697 > var9_9.field4017 && var9_9.field3934 != null) {
                                    var22_22 = new class90();
                                    var22_22.field1077 = var9_9;
                                    var22_22.field1086 = var9_9.field3934;
                                    client.field706.method7998((class514)var22_22);
                                }
                                if (client.field770 > var9_9.field4017 && var9_9.field3992 != null) {
                                    var22_22 = new class90();
                                    var22_22.field1077 = var9_9;
                                    var22_22.field1086 = var9_9.field3992;
                                    client.field706.method7998((class514)var22_22);
                                }
                                if (client.field699 > var9_9.field4017 && var9_9.field3993 != null) {
                                    var22_22 = new class90();
                                    var22_22.field1077 = var9_9;
                                    var22_22.field1086 = var9_9.field3993;
                                    client.field706.method7998((class514)var22_22);
                                }
                                if (client.field700 > var9_9.field4017 && var9_9.field3988 != null) {
                                    var22_22 = new class90();
                                    var22_22.field1077 = var9_9;
                                    var22_22.field1086 = var9_9.field3988;
                                    client.field706.method7998((class514)var22_22);
                                }
                                if (client.field701 > var9_9.field4017 && var9_9.field3999 != null) {
                                    var22_22 = new class90();
                                    var22_22.field1077 = var9_9;
                                    var22_22.field1086 = var9_9.field3999;
                                    client.field706.method7998((class514)var22_22);
                                }
                                if (client.field714 > var9_9.field4017 && var9_9.field4000 != null) {
                                    var22_22 = new class90();
                                    var22_22.field1077 = var9_9;
                                    var22_22.field1086 = var9_9.field4000;
                                    client.field706.method7998((class514)var22_22);
                                }
                                if (client.field499 > var9_9.field4017 && var9_9.field3970 != null) {
                                    var22_22 = new class90();
                                    var22_22.field1077 = var9_9;
                                    var22_22.field1086 = var9_9.field3970;
                                    client.field706.method7998((class514)var22_22);
                                }
                                var9_9.field4017 = client.field549;
                                if (var9_9.field3969 == null) ** GOTO lbl316
                                var28_28 = 0;
                                while (true) {
                                    block121: {
                                        if (var28_28 < client.field733) break block121;
lbl316:
                                        // 2 sources

                                        if (var9_9.field3989 == null) ** GOTO lbl321
                                        var22_22 = client.field731.method5766();
                                        var23_23 = 0;
                                        while (true) {
                                            block122: {
                                                if (var23_23 < ((Object)var22_22).length) break block122;
lbl321:
                                                // 2 sources

                                                if (var9_9.field3901 == null) ** GOTO lbl326
                                                var22_22 = client.field731.method5767();
                                                var23_23 = 0;
                                                while (true) {
                                                    block123: {
                                                        if (var23_23 < ((Object)var22_22).length) break block123;
lbl326:
                                                        // 4 sources

                                                        if (!var9_9.field3991) {
                                                            if (client.field675 != null || client.field647) break block117;
                                                            if ((var9_9.field4005 >= 0 || var9_9.field3892 != 0) && class35.field201 >= var12_12 && class35.field202 >= var13_13 && class35.field201 < var14_14 && class35.field202 < var15_15) {
                                                                class424.field4739 = var9_9.field4005 >= 0 ? var0[var9_9.field4005] : var9_9;
                                                            }
                                                            if (var9_9.field3873 == 8 && class35.field201 >= var12_12 && class35.field202 >= var13_13 && class35.field201 < var14_14 && class35.field202 < var15_15) {
                                                                class104.field1346 = var9_9;
                                                            }
                                                            if (var9_9.field3895 > var9_9.field3887 * -1528330031) {
                                                                class76.method2364(var9_9, var26_26 + var9_9.field3886, var11_11, var9_9.field3887 * -1528330031, var9_9.field3895, class35.field201, class35.field202);
                                                            }
                                                        }
                                                        if (var9_9.field3873 == 0) {
                                                            class94.method2706(var0, var9_9.field3910, var12_12, var13_13, var14_14, var15_15, var26_26 - var9_9.field3987, var11_11 - var9_9.field3899);
                                                            if (var9_9.field4014 != null) {
                                                                class94.method2706(var9_9.field4014, var9_9.field3910, var12_12, var13_13, var14_14, var15_15, var26_26 - var9_9.field3987, var11_11 - var9_9.field3899);
                                                            }
                                                            if ((var29_29 = (class89)client.field664.method9985(var9_9.field3910)) != null) {
                                                                if (var29_29.field1072 == 0 && class35.field201 >= var12_12 && class35.field202 >= var13_13 && class35.field201 < var14_14 && class35.field202 < var15_15 && !client.field647) {
                                                                    var30_30 = (class90)client.field706.method7996();
                                                                    while (true) {
                                                                        if (var30_30 == null) {
                                                                            if (class243.field2596 == 0) {
                                                                                client.field675 = null;
                                                                                client.field676 = null;
                                                                            }
                                                                            if (client.field647) break;
                                                                            class102.method2990();
                                                                            break;
                                                                        }
                                                                        if (var30_30.field1075) {
                                                                            var30_30.method9623();
                                                                            var30_30.field1077.field3959 = false;
                                                                        }
                                                                        var30_30 = (class90)client.field706.method8005();
                                                                    }
                                                                }
                                                                class367.method7605(var29_29.field1073, var12_12, var13_13, var14_14, var15_15, var26_26, var11_11);
                                                            }
                                                        }
                                                        break block117;
                                                    }
                                                    var31_31 = new class90();
                                                    var31_31.field1077 = var9_9;
                                                    var31_31.field1083 = (int)var22_22[var23_23];
                                                    var31_31.field1086 = var9_9.field3901;
                                                    client.field706.method7998(var31_31);
                                                    ++var23_23;
                                                }
                                            }
                                            var31_31 = new class90();
                                            var31_31.field1077 = var9_9;
                                            var31_31.field1083 = (int)var22_22[var23_23];
                                            var31_31.field1086 = var9_9.field3989;
                                            client.field706.method7998(var31_31);
                                            ++var23_23;
                                        }
                                    }
                                    var32_32 = new class90();
                                    var32_32.field1077 = var9_9;
                                    var32_32.field1083 = client.field735[var28_28];
                                    var32_32.field1084 = client.field589[var28_28];
                                    var32_32.field1086 = var9_9.field3969;
                                    client.field706.method7998(var32_32);
                                    ++var28_28;
                                }
                            }
                            var21_21 = 0;
                            var28_28 = 0;
                            if (var21_21 == 0 && var9_9.field3861[var20_20] != null) {
                                for (var23_23 = 0; var23_23 < var9_9.field3861[var20_20].length; ++var23_23) {
                                    var24_24 = 0;
                                    if (var9_9.field3953 != null) {
                                        var24_24 = client.field731.method5776(var9_9.field3861[var20_20][var23_23]);
                                    }
                                    if (!class227.method5074(var9_9.field3861[var20_20][var23_23]) && var24_24 == 0) continue;
                                    var21_21 = 1;
                                    if (var9_9.field3953 != null && var9_9.field3953[var20_20] > client.field514) break;
                                    var33_33 = var9_9.field3952[var20_20][var23_23];
                                    if (var33_33 != 0 && ((var33_33 & 8) != 0 && (client.field731.method5776(86) != false || client.field731.method5776(82) != false || client.field731.method5776(81) != false) || (var33_33 & 2) != 0 && client.field731.method5776(86) == false || (var33_33 & 1) != 0 && client.field731.method5776(82) == false || (var33_33 & 4) != 0 && !client.field731.method5776(81))) {
                                        continue;
                                    }
                                    var28_28 = 1;
                                    break;
                                }
                            }
                            if (var28_28 != 0) {
                                if (var20_20 < 10) {
                                    URLLoader.method3271(var20_20 + 1, var9_9.field3910, var9_9.field3863, var9_9.field4010, "");
                                } else if (var20_20 == 10) {
                                    class278.method5969();
                                    class302.method6464(var9_9.field3910, var9_9.field3863, class298.method6401(class232.method5133(var9_9)), var9_9.field4010);
                                    client.field661 = class47.method905(var9_9);
                                    if (client.field661 == null) {
                                        client.field661 = "null";
                                    }
                                    client.field662 = var9_9.field4024 + class97.method2752(0xFFFFFF);
                                }
                                var23_23 = var9_9.field3964[var20_20];
                                if (var9_9.field3953 == null) {
                                    var9_9.field3953 = new int[var9_9.field3861.length];
                                }
                                if (var9_9.field3864 == null) {
                                    var9_9.field3864 = new int[var9_9.field3861.length];
                                }
                                var9_9.field3953[var20_20] = var23_23 == 0 ? 0x7FFFFFFF : (var9_9.field3953[var20_20] == 0 ? var23_23 + client.field514 + var9_9.field3864[var20_20] : var23_23 + client.field514);
                            }
                            if (var21_21 == 0 && var9_9.field3953 != null) {
                                var9_9.field3953[var20_20] = 0;
                            }
                            ++var20_20;
                        }
                    }
                    class181.method4000(var9_9, var26_26, var11_11);
                    break block117;
                }
                if (!client.field513 && !client.field647 && var19_19 != 0) {
                    class368.method7607(var17_17, var18_18, var12_12, var13_13);
                }
            }
            ++var8_8;
        }
    }
}

