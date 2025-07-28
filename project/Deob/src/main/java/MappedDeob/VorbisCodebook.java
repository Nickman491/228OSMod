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

@ObfuscatedName(value="cb")
@Implements(value="VorbisCodebook")
public class VorbisCodebook {
    @ObfuscatedName(value="ay")
    int field333;
    @ObfuscatedName(value="ah")
    @Export(value="entries")
    int entries;
    @ObfuscatedName(value="az")
    @Export(value="lengthMap")
    int[] lengthMap;
    @ObfuscatedName(value="ao")
    int[] field334;
    @ObfuscatedName(value="ad")
    float[][] field335;
    @ObfuscatedName(value="an")
    @Export(value="keys")
    int[] keys;

    /*
     * Enabled aggressive block sorting
     */
    VorbisCodebook() {
        int n;
        int n2;
        int n3;
        int n4;
        boolean bl;
        class60 class602 = VorbisSample.field347;
        class602.method1205(24);
        this.field333 = class602.method1205(16);
        this.entries = class602.method1205(24);
        this.lengthMap = new int[this.entries];
        boolean bl2 = bl = class602.method1207() != 0;
        if (!bl) {
            n4 = class602.method1207() != 0 ? 1 : 0;
            for (n3 = 0; n3 < this.entries; ++n3) {
                this.lengthMap[n3] = n4 != 0 && class602.method1207() == 0 ? 0 : class602.method1205(5) + 1;
            }
        } else {
            n4 = 0;
            n3 = class602.method1205(5) + 1;
            while (n4 < this.entries) {
                int n5 = class602.method1205(class320.iLog(this.entries - n4));
                for (n2 = 0; n2 < n5; ++n2) {
                    this.lengthMap[n4++] = n3;
                }
                ++n3;
            }
        }
        this.method1115();
        n4 = class602.method1205(4);
        if (n4 <= 0) return;
        float f = VorbisSample.float32Unpack(class602.method1205(32));
        float f2 = VorbisSample.float32Unpack(class602.method1205(32));
        n2 = class602.method1205(4) + 1;
        boolean bl3 = class602.method1207() != 0;
        int n6 = n4 == 1 ? VorbisCodebook.mapType1QuantValues(this.entries, this.field333) : this.entries * this.field333;
        this.field334 = new int[n6];
        for (n = 0; n < n6; ++n) {
            this.field334[n] = class602.method1205(n2);
        }
        this.field335 = new float[this.entries][this.field333];
        if (n4 != 1) {
            for (n = 0; n < this.entries; ++n) {
                float f3 = 0.0f;
                int n7 = n * this.field333;
                for (int i = 0; i < this.field333; ++n7, ++i) {
                    float f4;
                    this.field335[n][i] = f4 = (float)this.field334[n7] * f2 + f + f3;
                    if (!bl3) continue;
                    f3 = f4;
                }
            }
            return;
        }
        for (n = 0; n < this.entries; ++n) {
            float f5 = 0.0f;
            int n8 = 1;
            for (int i = 0; i < this.field333; n8 *= n6, ++i) {
                float f6;
                int n9 = n / n8 % n6;
                this.field335[n][i] = f6 = (float)this.field334[n9] * f2 + f + f5;
                if (!bl3) continue;
                f5 = f6;
            }
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ah")
    void method1115() {
        int[] nArray = new int[this.entries];
        int[] nArray2 = new int[33];
        int n = 0;
        while (true) {
            block12: {
                int n2;
                int n3;
                int n4;
                int n5;
                block14: {
                    int n6;
                    block15: {
                        int n7;
                        int n8;
                        block10: {
                            block13: {
                                block11: {
                                    if (n >= this.entries) break block10;
                                    n8 = this.lengthMap[n];
                                    if (n8 != 0) break block11;
                                    break block12;
                                }
                                n7 = 1 << 32 - n8;
                                nArray[n] = n5 = nArray2[n8];
                                if ((n5 & n7) == 0) break block13;
                                n4 = nArray2[n8 - 1];
                                break block14;
                            }
                            n4 = n5 | n7;
                            break block15;
                        }
                        this.keys = new int[8];
                        int n9 = 0;
                        n = 0;
                        block1: while (true) {
                            if (n >= this.entries) {
                                return;
                            }
                            boolean bl = true;
                            while (true) {
                                block23: {
                                    block21: {
                                        block22: {
                                            block19: {
                                                block20: {
                                                    block17: {
                                                        block18: {
                                                            block16: {
                                                                if (!bl || (bl = false)) break block16;
                                                                n8 = this.lengthMap[n];
                                                                if (n8 == 0) break block17;
                                                                n7 = nArray[n];
                                                                n5 = 0;
                                                                n4 = 0;
                                                            }
                                                            if (n4 >= n8) break block18;
                                                            n3 = Integer.MIN_VALUE >>> n4;
                                                            if ((n7 & n3) == 0) break block19;
                                                            break block20;
                                                        }
                                                        this.keys[n5] = ~n;
                                                        if (n5 >= n9) {
                                                            n9 = n5 + 1;
                                                        }
                                                    }
                                                    ++n;
                                                    continue block1;
                                                }
                                                if (this.keys[n5] != 0) break block21;
                                                break block22;
                                            }
                                            ++n5;
                                            break block23;
                                        }
                                        this.keys[n5] = n9;
                                    }
                                    n5 = this.keys[n5];
                                }
                                if (n5 >= this.keys.length) {
                                    int[] nArray3 = new int[this.keys.length * 2];
                                    for (n6 = 0; n6 < this.keys.length; ++n6) {
                                        nArray3[n6] = this.keys[n6];
                                    }
                                    this.keys = nArray3;
                                }
                                n3 >>>= 1;
                                ++n4;
                            }
                            break;
                        }
                    }
                    for (n3 = n8 - 1; n3 >= 1 && (n2 = nArray2[n3]) == n5; --n3) {
                        n6 = 1 << 32 - n3;
                        if ((n2 & n6) != 0) {
                            nArray2[n3] = nArray2[n3 - 1];
                            break;
                        }
                        nArray2[n3] = n2 | n6;
                    }
                }
                nArray2[n8] = n4;
                for (n3 = n8 + 1; n3 <= 32; ++n3) {
                    n2 = nArray2[n3];
                    if (n2 != n5) continue;
                    nArray2[n3] = n4;
                }
            }
            ++n;
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lcy;)I")
    int method1110(class60 class602) {
        int n = 0;
        while (this.keys[n] >= 0) {
            n = class602.method1207() != 0 ? this.keys[n] : n + 1;
        }
        return ~this.keys[n];
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lcy;)[F")
    float[] method1111(class60 class602) {
        return this.field335[this.method1110(class602)];
    }

    @ObfuscatedName(value="ay")
    @Export(value="mapType1QuantValues")
    static int mapType1QuantValues(int n, int n2) {
        int n3 = (int)Math.pow(n, 1.0 / (double)n2) + 1;
        while (class95.method2708(n3, n2) > n) {
            --n3;
        }
        return n3;
    }
}

