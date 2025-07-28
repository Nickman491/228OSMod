package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cp")
public class class58 {
    @ObfuscatedName(value="an")
    static float[][] field388 = new float[2][8];
    @ObfuscatedName(value="ae")
    static int[][] field392 = new int[2][8];
    @ObfuscatedName(value="ax")
    static float field393;
    @ObfuscatedName(value="at")
    static int field387;
    @ObfuscatedName(value="ay")
    int[] field394 = new int[2];
    @ObfuscatedName(value="az")
    int[][][] field389 = new int[2][2][4];
    @ObfuscatedName(value="ao")
    int[][][] field391 = new int[2][2][4];
    @ObfuscatedName(value="ad")
    int[] field390 = new int[2];

    class58() {
    }

    @ObfuscatedName(value="ay")
    float method1177(int n, int n2, float f) {
        float f2 = (float)this.field391[n][0][n2] + f * (float)(this.field391[n][1][n2] - this.field391[n][0][n2]);
        return 1.0f - (float)Math.pow(10.0, -(f2 *= 0.0015258789f) / 20.0f);
    }

    @ObfuscatedName(value="az")
    float method1179(int n, int n2, float f) {
        float f2 = (float)this.field389[n][0][n2] + f * (float)(this.field389[n][1][n2] - this.field389[n][0][n2]);
        return class58.method1188(f2 *= 1.2207031E-4f);
    }

    @ObfuscatedName(value="ao")
    int method1180(int n, float f) {
        float f2;
        if (n == 0) {
            f2 = (float)this.field390[0] + (float)(this.field390[1] - this.field390[0]) * f;
            field393 = (float)Math.pow(0.1, (f2 *= 0.0030517578f) / 20.0f);
            field387 = (int)(field393 * 65536.0f);
        }
        if (this.field394[n] == 0) {
            return 0;
        }
        f2 = this.method1177(n, 0, f);
        class58.field388[n][0] = -2.0f * f2 * (float)Math.cos(this.method1179(n, 0, f));
        class58.field388[n][1] = f2 * f2;
        int n2 = 1;
        while (true) {
            if (n2 >= this.field394[n]) {
                if (n == 0) {
                    n2 = 0;
                    while (n2 < this.field394[0] * 2) {
                        float[] fArray = field388[0];
                        int n3 = n2++;
                        fArray[n3] = fArray[n3] * field393;
                    }
                }
                for (n2 = 0; n2 < this.field394[n] * 2; ++n2) {
                    class58.field392[n][n2] = (int)(field388[n][n2] * 65536.0f);
                }
                return this.field394[n] * 2;
            }
            f2 = this.method1177(n, n2, f);
            float f3 = -2.0f * f2 * (float)Math.cos(this.method1179(n, n2, f));
            float f4 = f2 * f2;
            class58.field388[n][n2 * 2 + 1] = field388[n][n2 * 2 - 1] * f4;
            class58.field388[n][n2 * 2] = field388[n][n2 * 2 - 1] * f3 + field388[n][n2 * 2 - 2] * f4;
            for (int i = n2 * 2 - 1; i >= 2; --i) {
                float[] fArray = field388[n];
                int n4 = i;
                fArray[n4] = fArray[n4] + (field388[n][i - 1] * f3 + field388[n][i - 2] * f4);
            }
            float[] fArray = field388[n];
            fArray[1] = fArray[1] + (field388[n][0] * f3 + f4);
            float[] fArray2 = field388[n];
            fArray2[0] = fArray2[0] + f3;
            ++n2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lvy;Lba;)V")
    final void method1181(class556 class5562, class43 class4310) {
        int n = class5562.method10282();
        this.field394[0] = n >> 4;
        this.field394[1] = n & 0xF;
        if (n == 0) {
            int[] nArray = this.field390;
            this.field390[1] = 0;
            nArray[0] = 0;
            return;
        }
        this.field390[0] = class5562.method10307();
        this.field390[1] = class5562.method10307();
        int n2 = class5562.method10282();
        int n3 = 0;
        block0: while (true) {
            int n4;
            if (n3 >= 2) {
                n3 = 0;
                block1: while (true) {
                    if (n3 >= 2) {
                        if (n2 == 0 && this.field390[1] == this.field390[0]) return;
                        class4310.method860(class5562);
                        return;
                    }
                    n4 = 0;
                    while (true) {
                        if (n4 >= this.field394[n3]) {
                            ++n3;
                            continue block1;
                        }
                        if ((n2 & 1 << n3 * 4 << n4) == 0) {
                            this.field389[n3][1][n4] = this.field389[n3][0][n4];
                            this.field391[n3][1][n4] = this.field391[n3][0][n4];
                        } else {
                            this.field389[n3][1][n4] = class5562.method10307();
                            this.field391[n3][1][n4] = class5562.method10307();
                        }
                        ++n4;
                    }
                    break;
                }
            }
            n4 = 0;
            while (true) {
                if (n4 >= this.field394[n3]) {
                    ++n3;
                    continue block0;
                }
                this.field389[n3][0][n4] = class5562.method10307();
                this.field391[n3][0][n4] = class5562.method10307();
                ++n4;
            }
            break;
        }
    }

    @ObfuscatedName(value="ah")
    static float method1188(float f) {
        float f2 = 32.703197f * (float)Math.pow(2.0, f);
        return f2 * (float)Math.PI / 11025.0f;
    }
}

