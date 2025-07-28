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

@ObfuscatedName(value="ec")
public class class112 {
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lvi;")
    static class569 field1414;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="[Lcs;")
    final class73[] field1413 = new class73[2048];
    @ObfuscatedName(value="ao")
    final boolean[] field1399 = new boolean[2048];
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="[Lkq;")
    final class275[] field1403 = new class275[2048];
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lvy;")
    final class556 field1407 = new class556(new byte[5000]);
    @ObfuscatedName(value="ae")
    final String[] field1405 = new String[3];
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-424710833)
    int field1406 = 0;
    @ObfuscatedName(value="at")
    final int[] field1412 = new int[2048];
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=354342637)
    int field1408 = 0;
    @ObfuscatedName(value="au")
    final int[] field1409 = new int[2048];
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-141109869)
    int field1410 = 0;
    @ObfuscatedName(value="aq")
    final int[] field1411 = new int[2048];
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=623422135)
    int field1404 = 0;
    @ObfuscatedName(value="aa")
    final int[] field1401 = new int[2048];

    class112() {
        int n = 0;
        while (n < 2048) {
            this.field1413[n] = new class73(n);
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvv;B)V", garbageValue="4")
    final void method3131(class555 class5552) {
        this.method3139();
        class5552.method10226();
        int n = client.field623;
        class73 class732 = this.field1413[n];
        int n2 = class5552.method10227(30);
        class732.method2272(-1);
        class732.field874.method6967(n2);
        class732.field871 = 0;
        class94 class942 = class732.method2275(n, class34.field189);
        class732.method2347(class942);
        class34.field189.field1329[n] = class942;
        class407.field4693 = class942;
        this.field1406 = 0;
        this.field1412[++this.field1406 - 1] = n;
        this.field1408 = 0;
        int n3 = 1;
        while (true) {
            if (n3 >= 2048) {
                class5552.method10238();
                return;
            }
            if (n3 != n) {
                int n4 = class5552.method10227(18);
                int n5 = n4 >> 16;
                int n6 = n4 >> 8 & 0xFF;
                int n7 = n4 & 0xFF;
                this.field1413[n3].method2272(class350.method6969(n5, n6, n7));
                this.field1409[++this.field1408 - 1] = n3;
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvv;IB)V", garbageValue="95")
    final void method3144(class555 class5552, int n) {
        int n2 = class5552.field5471;
        this.field1404 = 0;
        this.method3130(class5552);
        this.method3127();
        this.method3135();
        this.method3136(class5552);
        this.method3150();
        if (n == class5552.field5471 - n2) {
            return;
        }
        throw new RuntimeException(class5552.field5471 - n2 + " " + n);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvv;I)V", garbageValue="-1630891958")
    void method3130(class555 class5552) {
        this.field1410 = 0;
        int n = 0;
        class5552.method10226();
        int n2 = 0;
        while (true) {
            int n3;
            int n4;
            if (n2 >= this.field1406) {
                class5552.method10238();
                if (n == 0) {
                    class5552.method10226();
                    n2 = 0;
                    while (true) {
                        if (n2 >= this.field1406) {
                            class5552.method10238();
                            if (n == 0) {
                                class5552.method10226();
                                n2 = 0;
                                while (true) {
                                    if (n2 >= this.field1408) {
                                        class5552.method10238();
                                        if (n == 0) {
                                            class5552.method10226();
                                            n2 = 0;
                                            while (true) {
                                                if (n2 >= this.field1408) {
                                                    class5552.method10238();
                                                    if (n == 0) {
                                                        this.field1406 = 0;
                                                        this.field1408 = 0;
                                                        n2 = 1;
                                                        while (true) {
                                                            if (n2 >= 2048) {
                                                                return;
                                                            }
                                                            this.field1413[n2].field871 = (byte)(this.field1413[n2].field871 >> 1);
                                                            if (this.field1413[n2].method2276()) {
                                                                this.field1412[++this.field1406 - 1] = n2;
                                                            } else {
                                                                this.field1409[++this.field1408 - 1] = n2;
                                                            }
                                                            ++n2;
                                                        }
                                                    }
                                                    throw new RuntimeException();
                                                }
                                                n4 = this.field1409[n2];
                                                if ((this.field1413[n4].field871 & 1) == 0) {
                                                    if (n <= 0) {
                                                        n3 = class5552.method10227(1);
                                                        if (n3 != 0) {
                                                            if (this.method3133(class5552, n4)) {
                                                                this.field1413[n4].field871 = (byte)(this.field1413[n4].field871 | 2);
                                                            }
                                                        } else {
                                                            n = this.method3134(class5552);
                                                            this.field1413[n4].field871 = (byte)(this.field1413[n4].field871 | 2);
                                                        }
                                                    } else {
                                                        --n;
                                                        this.field1413[n4].field871 = (byte)(this.field1413[n4].field871 | 2);
                                                    }
                                                }
                                                ++n2;
                                            }
                                        }
                                        throw new RuntimeException();
                                    }
                                    n4 = this.field1409[n2];
                                    if ((this.field1413[n4].field871 & 1) != 0) {
                                        if (n <= 0) {
                                            n3 = class5552.method10227(1);
                                            if (n3 != 0) {
                                                if (this.method3133(class5552, n4)) {
                                                    this.field1413[n4].field871 = (byte)(this.field1413[n4].field871 | 2);
                                                }
                                            } else {
                                                n = this.method3134(class5552);
                                                this.field1413[n4].field871 = (byte)(this.field1413[n4].field871 | 2);
                                            }
                                        } else {
                                            --n;
                                            this.field1413[n4].field871 = (byte)(this.field1413[n4].field871 | 2);
                                        }
                                    }
                                    ++n2;
                                }
                            }
                            throw new RuntimeException();
                        }
                        n4 = this.field1412[n2];
                        if ((this.field1413[n4].field871 & 1) != 0) {
                            if (n <= 0) {
                                n3 = class5552.method10227(1);
                                if (n3 != 0) {
                                    this.method3132(class5552, n4);
                                } else {
                                    n = this.method3134(class5552);
                                    this.field1413[n4].field871 = (byte)(this.field1413[n4].field871 | 2);
                                }
                            } else {
                                --n;
                                this.field1413[n4].field871 = (byte)(this.field1413[n4].field871 | 2);
                            }
                        }
                        ++n2;
                    }
                }
                throw new RuntimeException();
            }
            n4 = this.field1412[n2];
            if ((this.field1413[n4].field871 & 1) == 0) {
                if (n <= 0) {
                    n3 = class5552.method10227(1);
                    if (n3 != 0) {
                        this.method3132(class5552, n4);
                    } else {
                        n = this.method3134(class5552);
                        this.field1413[n4].field871 = (byte)(this.field1413[n4].field871 | 2);
                    }
                } else {
                    --n;
                    this.field1413[n4].field871 = (byte)(this.field1413[n4].field871 | 2);
                }
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvv;B)I", garbageValue="-1")
    int method3134(class555 class5552) {
        int n = class5552.method10227(2);
        int n2 = n == 0 ? 0 : (n == 1 ? class5552.method10227(5) : (n == 2 ? class5552.method10227(8) : class5552.method10227(11)));
        return n2;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lvv;II)V", garbageValue="856013933")
    void method3132(class555 class5552, int n) {
        boolean bl;
        boolean bl2 = bl = class5552.method10227(1) == 1;
        if (bl) {
            this.field1401[++this.field1404 - 1] = n;
        }
        int n2 = class5552.method10227(2);
        class73 class732 = this.field1413[n];
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    int n3;
                    int n4 = class5552.method10227(1);
                    if (n4 != 0) {
                        int n5 = class5552.method10227(30);
                        int n6 = class350.method6965(n5);
                        int n7 = class350.method6971(n5);
                        int n8 = class350.method6972(n5);
                        class350 class3502 = class732.field874;
                        class3502.field3766 = (byte)(n6 + class3502.field3766 & 3);
                        class3502.field3764 = n7 + class3502.field3764 & 0x3FFF;
                        class3502.field3765 = n8 + class3502.field3765 & 0x3FFF;
                        this.field1399[n] = true;
                        this.field1403[n] = class732.field875;
                        return;
                    }
                    int n9 = class5552.method10227(12);
                    int n10 = n9 >> 10;
                    int n11 = n9 >> 5 & 0x1F;
                    if (n11 > 15) {
                        n11 -= 32;
                    }
                    if ((n3 = n9 & 0x1F) > 15) {
                        n3 -= 32;
                    }
                    class350 class3503 = class732.field874;
                    class3503.field3766 = (byte)(n10 + class3503.field3766 & 3);
                    class3503.field3764 += n11;
                    class3503.field3765 += n3;
                    this.field1399[n] = true;
                    this.field1403[n] = class732.field875;
                    return;
                }
                int n12 = class5552.method10227(4);
                class350 class3504 = class732.field874;
                if (n12 != 0) {
                    if (n12 != 1) {
                        if (n12 == 2) {
                            class3504.field3765 -= 2;
                        } else if (n12 != 3) {
                            if (n12 != 4) {
                                if (n12 != 5) {
                                    if (n12 != 6) {
                                        if (n12 == 7) {
                                            class3504.field3764 -= 2;
                                        } else if (n12 == 8) {
                                            class3504.field3764 += 2;
                                        } else if (n12 != 9) {
                                            if (n12 != 10) {
                                                if (n12 != 11) {
                                                    if (n12 != 12) {
                                                        if (n12 == 13) {
                                                            class3504.field3765 += 2;
                                                        } else if (n12 != 14) {
                                                            if (n12 == 15) {
                                                                class3504.field3764 += 2;
                                                                class3504.field3765 += 2;
                                                            }
                                                        } else {
                                                            ++class3504.field3764;
                                                            class3504.field3765 += 2;
                                                        }
                                                    } else {
                                                        --class3504.field3764;
                                                        class3504.field3765 += 2;
                                                    }
                                                } else {
                                                    class3504.field3764 -= 2;
                                                    class3504.field3765 += 2;
                                                }
                                            } else {
                                                class3504.field3764 += 2;
                                                ++class3504.field3765;
                                            }
                                        } else {
                                            class3504.field3764 -= 2;
                                            ++class3504.field3765;
                                        }
                                    } else {
                                        class3504.field3764 += 2;
                                        --class3504.field3765;
                                    }
                                } else {
                                    class3504.field3764 -= 2;
                                    --class3504.field3765;
                                }
                            } else {
                                class3504.field3764 += 2;
                                class3504.field3765 -= 2;
                            }
                        } else {
                            ++class3504.field3764;
                            class3504.field3765 -= 2;
                        }
                    } else {
                        --class3504.field3764;
                        class3504.field3765 -= 2;
                    }
                } else {
                    class3504.field3764 -= 2;
                    class3504.field3765 -= 2;
                }
                this.field1399[n] = true;
                this.field1403[n] = class732.field875;
                return;
            }
            int n13 = class5552.method10227(3);
            class350 class3505 = class732.field874;
            if (n13 != 0) {
                if (n13 == 1) {
                    --class3505.field3765;
                } else if (n13 != 2) {
                    if (n13 == 3) {
                        --class3505.field3764;
                    } else if (n13 == 4) {
                        ++class3505.field3764;
                    } else if (n13 != 5) {
                        if (n13 == 6) {
                            ++class3505.field3765;
                        } else if (n13 == 7) {
                            ++class3505.field3764;
                            ++class3505.field3765;
                        }
                    } else {
                        --class3505.field3764;
                        ++class3505.field3765;
                    }
                } else {
                    ++class3505.field3764;
                    --class3505.field3765;
                }
            } else {
                --class3505.field3764;
                --class3505.field3765;
            }
            this.field1399[n] = true;
            this.field1403[n] = class732.field875;
            return;
        }
        if (!bl) {
            if (n == client.field623) {
                throw new RuntimeException();
            }
            class732.method2277();
            if (class5552.method10227(1) != 0) {
                this.method3133(class5552, n);
            }
            this.field1411[++this.field1410 - 1] = n;
            return;
        }
        this.field1399[n] = false;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lvv;II)Z", garbageValue="2008955812")
    boolean method3133(class555 class5552, int n) {
        boolean bl;
        class73 class732 = this.field1413[n];
        int n2 = class5552.method10227(2);
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    int n3 = class5552.method10227(18);
                    int n4 = n3 >> 16;
                    int n5 = n3 >> 8 & 0xFF;
                    int n6 = n3 & 0xFF;
                    int n7 = class732.field869;
                    int n8 = class350.method6965(n7) + n4 & 3;
                    class732.method2326(n8);
                    int n9 = class350.method6971(n7) + n5 & 0xFF;
                    int n10 = class350.method6972(n7) + n6 & 0xFF;
                    class732.field869 = class350.method6969(class732.method2328(), n9, n10);
                    return false;
                }
                int n11 = class5552.method10227(5);
                int n12 = n11 >> 3;
                int n13 = n11 & 7;
                int n14 = class732.field869;
                int n15 = class350.method6965(n14) + n12 & 3;
                int n16 = n14 >> 14 & 0xFF;
                int n17 = n14 & 0xFF;
                if (n13 == 0) {
                    --n16;
                    --n17;
                }
                if (n13 == 1) {
                    --n17;
                }
                if (n13 == 2) {
                    ++n16;
                    --n17;
                }
                if (n13 == 3) {
                    --n16;
                }
                if (n13 == 4) {
                    ++n16;
                }
                if (n13 == 5) {
                    --n16;
                    ++n17;
                }
                if (n13 == 6) {
                    ++n17;
                }
                if (n13 == 7) {
                    ++n16;
                    ++n17;
                }
                class732.method2326(n15);
                class732.field869 = class350.method6969(n15, n16, n17);
                return false;
            }
            int n18 = class5552.method10227(2);
            int n19 = class732.field869;
            int n20 = class350.method6965(n19) + n18 & 3;
            class732.method2326(n20);
            class732.field869 = (n19 & 0xFFFFFFF) + (n20 << 28);
            return false;
        }
        if (class5552.method10227(1) != 0) {
            this.method3133(class5552, n);
        }
        int n21 = class5552.method10227(13);
        int n22 = class5552.method10227(13);
        boolean bl2 = bl = class5552.method10227(1) == 1;
        if (bl) {
            this.field1401[++this.field1404 - 1] = n;
        }
        if (!class732.method2276()) {
            class732.method2332(n21, n22);
            this.field1399[n] = false;
            return true;
        }
        throw new RuntimeException();
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1082969786")
    void method3127() {
        int n = 0;
        while (n < this.field1410) {
            int n2 = this.field1411[n];
            class73 class732 = this.field1413[n2];
            for (class103 class1032 : client.field508) {
                class94 class942 = class1032.field1329[n2];
                if (class942 == null) continue;
                class732.method2291(class942);
                class1032.field1329[n2] = null;
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1157490276")
    void method3135() {
        class148.field1676 = -1;
        int n = 0;
        while (n < this.field1406) {
            int n2 = this.field1412[n];
            class73 class732 = this.field1413[n2];
            class350 class3502 = class732.field874;
            for (class103 class1032 : client.field508) {
                boolean bl;
                class94 class942 = class1032.field1329[n2];
                boolean bl2 = bl = class3502.field3764 > class1032.field1324 && class3502.field3765 > class1032.field1325 && class3502.field3764 < class1032.field1322 + class1032.field1324 && class3502.field3765 < class1032.field1325 + class1032.field1323;
                if (n2 == client.field623 && bl && class1032.field1320 != -1) {
                    class148.field1676 = class1032.field1320;
                }
                if (bl && class942 == null) {
                    class942 = class732.method2275(n2, class1032);
                    class732.method2347(class942);
                    class1032.field1329[n2] = class942;
                    continue;
                }
                if (bl || class942 == null || class942 == class407.field4693) continue;
                class732.method2291(class942);
                class1032.field1329[n2] = null;
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Lvv;I)V", garbageValue="-1845304357")
    void method3136(class555 class5552) {
        int n = 0;
        while (n < this.field1404) {
            int n2 = this.field1401[n];
            int n3 = class5552.method10282();
            if ((n3 & 4) != 0) {
                n3 += class5552.method10282() << 8;
            }
            if ((n3 & 0x100) != 0) {
                n3 += class5552.method10282() << 16;
            }
            this.method3172(class5552, n2, n3);
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="17329")
    void method3150() {
        int n = 0;
        while (n < this.field1406) {
            int n2 = this.field1412[n];
            if (this.field1399[n2]) {
                class73 class732 = this.field1413[n2];
                class732.method2297(this.field1403[n2]);
                this.field1399[n2] = false;
            }
            ++n;
        }
        return;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Lvv;III)V", garbageValue="1182589201")
    void method3172(class555 var1_1, int var2_2, int var3_3) {
        var4_4 = this.field1413[var2_2];
        var5_5 = 0x7FFFFFFF;
        if ((var3_3 & 1024) != 0) {
            for (var6_6 = 0; var6_6 < 3; ++var6_6) {
                this.field1405[var6_6] = var1_1.method10290();
            }
            var4_4.method2286(this.field1405);
        }
        if ((var3_3 & 8) != 0) {
            var7_7 = var1_1.method10323();
            if ((var7_7 += var1_1.method10312() << 16) == (var6_6 = 0xFFFFFF)) {
                var7_7 = -1;
            }
            var4_4.method2284(var7_7);
        }
        if ((var3_3 & 512) != 0) {
            var15_8 /* !! */  = var4_4;
            var16_9 /* !! */  = (byte[])new class275[]{class275.field3049, class275.field3047, class275.field3048, class275.field3044, class275.field3045, class275.field3051, class275.field3050, class275.field3043, class275.field3046};
            var15_8 /* !! */ .field875 = (class275)class259.method5457((MouseWheel[])var16_9 /* !! */ , var1_1.method10443());
            if (var5_5 == 0x7FFFFFFF) {
                this.field1403[var2_2] = var4_4.field875;
            }
        }
        if ((var3_3 & 16) != 0) {
            var6_6 = var1_1.method10282();
            var16_9 /* !! */  = new byte[var6_6];
            var8_10 = new class556(var16_9 /* !! */ );
            var1_1.method10337(var16_9 /* !! */ , 0, var6_6);
            var4_4.method2282((class556)var8_10);
        }
        if ((var3_3 & 2) == 0) ** GOTO lbl35
        var6_6 = var1_1.method10282();
        if (var6_6 <= 0) ** GOTO lbl31
        var7_7 = 0;
        while (true) {
            block32: {
                if (var7_7 < var6_6) break block32;
lbl31:
                // 2 sources

                if ((var7_7 = var1_1.method10341()) <= 0) ** GOTO lbl35
                var17_13 = 0;
                while (true) {
                    block33: {
                        if (var17_13 < var7_7) break block33;
lbl35:
                        // 3 sources

                        if ((var3_3 & 32) != 0) {
                            var1_1.method10323();
                            var1_1.method10312();
                            var1_1.method10314();
                            var6_6 = var1_1.method10312();
                            this.field1407.field5471 = 0;
                            var1_1.method10337(this.field1407.field5470, 0, var6_6);
                            this.field1407.field5471 = 0;
                        }
                        if ((var3_3 & 32768) != 0) {
                            var6_6 = var1_1.method10458();
                            var7_7 = var6_6 >> 8;
                            var17_13 = var7_7 >= 13 && var7_7 <= 20 ? var7_7 - 12 : 0;
                            var9_17 = (class385)class259.method5457(class151.method3607(), var1_1.method10312());
                            var10_11 = var1_1.method10312() == 1 ? 1 : 0;
                            var11_12 = var1_1.method10314();
                            this.field1407.field5471 = 0;
                            var1_1.method10293(this.field1407.field5470, 0, var11_12);
                            this.field1407.field5471 = 0;
                            var12_18 = class439.method8700(class371.method7619(class261.method5505(this.field1407)));
                            var13_19 = null;
                            if (var17_13 > 0 && var17_13 <= 8) {
                                var13_19 = new byte[var17_13];
                                for (var14_20 = 0; var14_20 < var17_13; ++var14_20) {
                                    var13_19[var14_20] = var1_1.method10443();
                                }
                            }
                            var4_4.method2289(var6_6, var9_17, (boolean)var10_11, var12_18, var13_19);
                        }
                        if ((var3_3 & 2048) != 0) {
                            var5_5 = var1_1.method10316();
                            if (var5_5 != 127) {
                                var15_8 /* !! */  = this.field1403;
                                var7_7 = var2_2;
                                var8_10 = new class275[]{class275.field3049, class275.field3047, class275.field3048, class275.field3044, class275.field3045, class275.field3051, class275.field3050, class275.field3043, class275.field3046};
                                var15_8 /* !! */ [var7_7] = (class275)class259.method5457(var8_10, var5_5);
                            } else {
                                this.field1403[var2_2] = class275.field3048;
                            }
                        }
                        if ((var3_3 & 4096) != 0) {
                            var6_6 = client.field514 + var1_1.method10323();
                            var7_7 = client.field514 + var1_1.method10458();
                            var17_13 = var1_1.method10443();
                            var18_14 = var1_1.method10524();
                            var10_11 = var1_1.method10315();
                            var11_12 = (byte)var1_1.method10312();
                            var4_4.method2292(var6_6, var7_7, (byte)var17_13, var18_14, (byte)var10_11, (byte)var11_12);
                        }
                        if ((var3_3 & 128) != 0) {
                            var15_8 /* !! */  = var1_1.method10290();
                            var4_4.method2285((String)var15_8 /* !! */ );
                        }
                        if ((var3_3 & 1) != 0) {
                            var6_6 = var1_1.method10334();
                            if (var6_6 == 65535) {
                                var6_6 = -1;
                            }
                            var7_7 = var1_1.method10312();
                            var4_4.method2283(var6_6, var7_7);
                        }
                        if ((var3_3 & 65536) == 0) ** GOTO lbl95
                        var6_6 = var1_1.method10314();
                        var7_7 = 0;
                        while (true) {
                            block34: {
                                if (var7_7 < var6_6) break block34;
lbl95:
                                // 2 sources

                                if ((var3_3 & 64) != 0) {
                                    var6_6 = var1_1.method10307();
                                    var4_4.method2288(var6_6);
                                }
                                if ((var3_3 & 16384) != 0) {
                                    var6_6 = var1_1.method10524();
                                    var7_7 = var1_1.method10316();
                                    var17_13 = var1_1.method10524();
                                    var18_14 = var1_1.method10316();
                                    var10_11 = var1_1.method10458() + client.field514;
                                    var11_12 = var1_1.method10334() + client.field514;
                                    var19_15 = var1_1.method10458();
                                    var4_4.method2290(var6_6, var7_7, var17_13, var18_14, var10_11, var11_12, var19_15, this.field1399[var2_2]);
                                }
                                return;
                            }
                            var17_13 = var1_1.method10314();
                            var18_14 = var1_1.method10323();
                            var10_11 = var1_1.method10440();
                            var4_4.method2311(var17_13, var18_14, var10_11 >> 16, var10_11 & 65535);
                            ++var7_7;
                        }
                    }
                    var18_14 = var1_1.method10407();
                    var10_11 = var1_1.method10407();
                    if (var10_11 == 32767) {
                        var4_4.method2314(var18_14);
                    } else {
                        var11_12 = var1_1.method10407();
                        var19_15 = var1_1.method10312();
                        var20_16 = var10_11 > 0 ? var1_1.method10341() : var19_15;
                        var4_4.method2287(var18_14, var10_11, var11_12, var19_15, var20_16);
                    }
                    ++var17_13;
                }
            }
            var18_14 = -1;
            var10_11 = -1;
            var11_12 = -1;
            var17_13 = var1_1.method10407();
            if (var17_13 != 32767) {
                if (var17_13 == 32766) {
                    var17_13 = -1;
                } else {
                    var10_11 = var1_1.method10407();
                }
            } else {
                var17_13 = var1_1.method10407();
                var10_11 = var1_1.method10407();
                var18_14 = var1_1.method10407();
                var11_12 = var1_1.method10407();
            }
            var19_15 = var1_1.method10407();
            var4_4.method2329(var17_13, var10_11, var18_14, var11_12, var19_15);
            ++var7_7;
        }
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-2040127946")
    void method3139() {
        this.field1406 = 0;
        int n = 0;
        while (n < 2048) {
            this.field1413[n].method2271();
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="585853899")
    static final int method3152() {
        return class199.field2263;
    }
}

