package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cu")
public class class61 {
    @ObfuscatedName(value="av")
    static int[] field430;
    @ObfuscatedName(value="ag")
    static int[] field431;
    @ObfuscatedName(value="aw")
    static int[] field432;
    @ObfuscatedName(value="ar")
    static int[] field417;
    @ObfuscatedName(value="am")
    static int[] field435;
    @ObfuscatedName(value="ap")
    static int[] field436;
    @ObfuscatedName(value="ab")
    static int[] field437;
    @ObfuscatedName(value="aj")
    static int[] field438;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lba;")
    class43 field434;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lba;")
    class43 field414;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lba;")
    class43 field423;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lba;")
    class43 field425;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lba;")
    class43 field416;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lba;")
    class43 field415;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lba;")
    class43 field419;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lba;")
    class43 field422;
    @ObfuscatedName(value="at")
    int[] field421 = new int[]{0, 0, 0, 0, 0};
    @ObfuscatedName(value="ac")
    int[] field418 = new int[]{0, 0, 0, 0, 0};
    @ObfuscatedName(value="au")
    int[] field429 = new int[]{0, 0, 0, 0, 0};
    @ObfuscatedName(value="as")
    int field424 = 0;
    @ObfuscatedName(value="aq")
    int field413 = 100;
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Lcp;")
    class58 field426;
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lba;")
    class43 field427;
    @ObfuscatedName(value="ak")
    int field428 = 500;
    @ObfuscatedName(value="al")
    int field420 = 0;

    static {
        field431 = new int[32768];
        Random random = new Random(0L);
        int n = 0;
        while (true) {
            if (n >= 32768) {
                field432 = new int[32768];
                n = 0;
                while (true) {
                    if (n >= 32768) {
                        field430 = new int[220500];
                        field417 = new int[5];
                        field435 = new int[5];
                        field436 = new int[5];
                        field437 = new int[5];
                        field438 = new int[5];
                        return;
                    }
                    class61.field432[n] = (int)(Math.sin((double)n / 5215.1903) * 16384.0);
                    ++n;
                }
            }
            class61.field431[n] = (random.nextInt() & 2) - 1;
            ++n;
        }
    }

    class61() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ay")
    final int[] method1224(int n, int n2) {
        class451.method8898(field430, 0, n);
        if (n2 < 10) {
            return field430;
        }
        double d = (double)n / ((double)n2 + 0.0);
        this.field434.method859();
        this.field414.method859();
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        if (this.field423 != null) {
            this.field423.method859();
            this.field425.method859();
            n3 = (int)((double)(this.field423.field281 - this.field423.field280) * 32.768 / d);
            n4 = (int)((double)this.field423.field280 * 32.768 / d);
        }
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        if (this.field416 != null) {
            this.field416.method859();
            this.field415.method859();
            n6 = (int)((double)(this.field416.field281 - this.field416.field280) * 32.768 / d);
            n7 = (int)((double)this.field416.field280 * 32.768 / d);
        }
        int n9 = 0;
        while (true) {
            if (n9 >= 5) break;
            if (this.field421[n9] == 0) {
            } else {
                class61.field417[n9] = 0;
                class61.field435[n9] = (int)((double)this.field429[n9] * d);
                class61.field436[n9] = (this.field421[n9] << 14) / 100;
                class61.field437[n9] = (int)((double)(this.field434.field281 - this.field434.field280) * 32.768 * Math.pow(1.0057929410678534, this.field418[n9]) / d);
                class61.field438[n9] = (int)((double)this.field434.field280 * 32.768 / d);
            }
            ++n9;
        }
        n9 = 0;
        block1: while (true) {
            int n10;
            int n11;
            int n12;
            int n13;
            block39: {
                int n14;
                block37: {
                    block38: {
                        block35: {
                            block36: {
                                block34: {
                                    if (n9 >= n) break block34;
                                    n13 = this.field434.method862(n);
                                    n12 = this.field414.method862(n);
                                    if (this.field423 == null) break block35;
                                    break block36;
                                }
                                if (this.field419 == null) break block37;
                                this.field419.method859();
                                this.field422.method859();
                                n9 = 0;
                                n13 = 0;
                                n12 = 1;
                                break block38;
                            }
                            n11 = this.field423.method862(n);
                            n10 = this.field425.method862(n);
                            n13 += this.method1218(n5, n10, this.field423.field282) >> 1;
                            n5 = n5 + n4 + (n11 * n3 >> 16);
                        }
                        if (this.field416 != null) {
                            n11 = this.field416.method862(n);
                            n10 = this.field415.method862(n);
                            n12 = n12 * ((this.method1218(n8, n10, this.field416.field282) >> 1) + 32768) >> 15;
                            n8 = n8 + n7 + (n11 * n6 >> 16);
                        }
                        break block39;
                    }
                    for (n11 = 0; n11 < n; ++n11) {
                        n10 = this.field419.method862(n);
                        n14 = this.field422.method862(n);
                        n13 = n12 != 0 ? (n10 * (this.field419.field281 - this.field419.field280) >> 8) + this.field419.field280 : (n14 * (this.field419.field281 - this.field419.field280) >> 8) + this.field419.field280;
                        if ((n9 += 256) >= n13) {
                            n9 = 0;
                            int n15 = n12 = n12 == 0 ? 1 : 0;
                        }
                        if (n12 == 0) continue;
                        class61.field430[n11] = 0;
                    }
                }
                if (this.field424 > 0 && this.field413 > 0) {
                    for (n13 = n9 = (int)((double)this.field424 * d); n13 < n; ++n13) {
                        int n16 = n13;
                        field430[n16] = field430[n16] + field430[n13 - n9] * this.field413 / 100;
                    }
                }
                if (this.field426.field394[0] > 0 || this.field426.field394[1] > 0) {
                    this.field427.method859();
                    n9 = this.field427.method862(n + 1);
                    n13 = this.field426.method1180(0, (float)n9 / 65536.0f);
                    n12 = this.field426.method1180(1, (float)n9 / 65536.0f);
                    if (n >= n13 + n12) {
                        int n17;
                        int n18;
                        n11 = 0;
                        n10 = n12;
                        if (n10 > n - n13) {
                            n10 = n - n13;
                        }
                        while (true) {
                            if (n11 >= n10) break;
                            n14 = (int)((long)field430[n11 + n13] * (long)class58.field387 >> 16);
                            for (n18 = 0; n18 < n13; ++n18) {
                                n14 = (int)((long)field430[n11 + n13 - 1 - n18] * (long)class58.field392[0][n18] >> 16) + n14;
                            }
                            for (n18 = 0; n18 < n11; n14 -= (int)((long)field430[n11 - 1 - n18] * (long)class58.field392[1][n18] >> 16), ++n18) {
                            }
                            class61.field430[n11] = n14;
                            n9 = this.field427.method862(n + 1);
                            ++n11;
                        }
                        n14 = 128;
                        n10 = 128;
                        block7: while (true) {
                            if (n10 > n - n13) {
                                n10 = n - n13;
                            }
                            while (true) {
                                if (n11 < n10) {
                                    n18 = (int)((long)field430[n11 + n13] * (long)class58.field387 >> 16);
                                } else {
                                    if (n11 >= n - n13) break block7;
                                    n13 = this.field426.method1180(0, (float)n9 / 65536.0f);
                                    n12 = this.field426.method1180(1, (float)n9 / 65536.0f);
                                    n10 += 128;
                                    continue block7;
                                }
                                for (n17 = 0; n17 < n13; ++n17) {
                                    n18 = (int)((long)field430[n11 + n13 - 1 - n17] * (long)class58.field392[0][n17] >> 16) + n18;
                                }
                                for (n17 = 0; n17 < n12; n18 -= (int)((long)field430[n11 - 1 - n17] * (long)class58.field392[1][n17] >> 16), ++n17) {
                                }
                                class61.field430[n11] = n18;
                                n9 = this.field427.method862(n + 1);
                                ++n11;
                            }
                            break;
                        }
                        while (n11 < n) {
                            n18 = 0;
                            for (n17 = n11 + n13 - n; n17 < n13; ++n17) {
                                n18 = (int)((long)field430[n11 + n13 - 1 - n17] * (long)class58.field392[0][n17] >> 16) + n18;
                            }
                            for (n17 = 0; n17 < n12; n18 -= (int)((long)field430[n11 - 1 - n17] * (long)class58.field392[1][n17] >> 16), ++n17) {
                            }
                            class61.field430[n11] = n18;
                            n9 = this.field427.method862(n + 1);
                            ++n11;
                        }
                    }
                }
                n9 = 0;
                while (true) {
                    if (n9 >= n) {
                        return field430;
                    }
                    if (field430[n9] < Short.MIN_VALUE) {
                        class61.field430[n9] = Short.MIN_VALUE;
                    }
                    if (field430[n9] > Short.MAX_VALUE) {
                        class61.field430[n9] = Short.MAX_VALUE;
                    }
                    ++n9;
                }
            }
            n11 = 0;
            while (true) {
                block42: {
                    block41: {
                        block40: {
                            if (n11 >= 5) break block40;
                            if (this.field421[n11] != 0) break block41;
                            break block42;
                        }
                        ++n9;
                        continue block1;
                    }
                    n10 = field435[n11] + n9;
                    if (n10 < n) {
                        int n19 = n10;
                        field430[n19] = field430[n19] + this.method1218(field417[n11], n12 * field436[n11] >> 15, this.field434.field282);
                        int n20 = n11;
                        field417[n20] = field417[n20] + ((n13 * field437[n11] >> 16) + field438[n11]);
                    }
                }
                ++n11;
            }
            break;
        }
    }

    @ObfuscatedName(value="ah")
    final int method1218(int n, int n2, int n3) {
        if (n3 != 1) {
            if (n3 == 2) {
                return field432[n & Short.MAX_VALUE] * n2 >> 14;
            }
            if (n3 == 3) {
                return (n2 * (n & Short.MAX_VALUE) >> 14) - n2;
            }
            if (n3 == 4) {
                return n2 * field431[n / 2607 & Short.MAX_VALUE];
            }
            return 0;
        }
        if ((n & Short.MAX_VALUE) < 16384) {
            return n2;
        }
        return -n2;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;)V")
    final void method1219(class556 class5562) {
        this.field434 = new class43();
        this.field434.method858(class5562);
        this.field414 = new class43();
        this.field414.method858(class5562);
        int n = class5562.method10282();
        if (n != 0) {
            --class5562.field5471;
            this.field423 = new class43();
            this.field423.method858(class5562);
            this.field425 = new class43();
            this.field425.method858(class5562);
        }
        if ((n = class5562.method10282()) != 0) {
            --class5562.field5471;
            this.field416 = new class43();
            this.field416.method858(class5562);
            this.field415 = new class43();
            this.field415.method858(class5562);
        }
        if ((n = class5562.method10282()) != 0) {
            --class5562.field5471;
            this.field419 = new class43();
            this.field419.method858(class5562);
            this.field422 = new class43();
            this.field422.method858(class5562);
        }
        int n2 = 0;
        while (true) {
            int n3;
            if (n2 >= 10 || (n3 = class5562.method10407()) == 0) {
                this.field424 = class5562.method10407();
                this.field413 = class5562.method10407();
                this.field428 = class5562.method10307();
                this.field420 = class5562.method10307();
                this.field426 = new class58();
                this.field427 = new class43();
                this.field426.method1181(class5562, this.field427);
                return;
            }
            this.field421[n2] = n3;
            this.field418[n2] = class5562.method10294();
            this.field429[n2] = class5562.method10407();
            ++n2;
        }
    }
}

