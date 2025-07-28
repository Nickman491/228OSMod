/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pw")
public class class402 {
    @ObfuscatedName(value="ay")
    @Export(value="spriteMap")
    final HashMap spriteMap = new HashMap();
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lql;")
    @Export(value="bounds")
    Bounds bounds = new Bounds(0, 0);
    @ObfuscatedName(value="az")
    int[] field4650 = new int[2048];
    @ObfuscatedName(value="ao")
    int[] field4653 = new int[2048];
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1399423945)
    int field4654 = 0;

    public class402() {
        class309.field3287 = new int[2000];
        int n = 0;
        int n2 = 240;
        int n3 = 12;
        while (true) {
            int n4;
            if (n >= 16) {
                n2 = 48;
                n3 = n2 / 6;
                block1: while (true) {
                    if (n >= class309.field3287.length) {
                        return;
                    }
                    n4 = n * 2;
                    int n5 = class9.method82((float)n2 / 360.0f, 0.9999f, 0.5);
                    while (true) {
                        if (n >= n4 || n >= class309.field3287.length) {
                            n2 -= n3;
                            continue block1;
                        }
                        class309.field3287[n] = n5;
                        ++n;
                    }
                    break;
                }
            }
            class309.field3287[n] = n4 = class9.method82((float)n2 / 360.0f, 0.9999f, (float)n * 0.425f / 16.0f + 0.075f);
            ++n;
            n2 -= n3;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="249957867")
    void method7941(int n) {
        int n2 = n * 2 + 1;
        double d = (float)n / 3.0f;
        int n3 = n * 2 + 1;
        double[] dArray = new double[n3];
        int n4 = -n;
        int n5 = 0;
        while (true) {
            double d2;
            int n6;
            if (n4 > n) {
                double[] dArray2;
                double[] dArray3 = dArray2 = dArray;
                double d3 = dArray3[n] * dArray3[n];
                int[] nArray = new int[n2 * n2];
                boolean bl = false;
                n6 = 0;
                while (true) {
                    if (n6 >= n2) {
                        SpritePixels spritePixels = new SpritePixels(nArray, n2, n2);
                        this.spriteMap.put(n, spritePixels);
                        return;
                    }
                    for (int i = 0; i < n2; ++i) {
                        int n7 = (int)(dArray3[i] * dArray3[n6] / d3 * 256.0);
                        nArray[i + n2 * n6] = n7;
                        int n8 = n7;
                        if (bl || n8 <= 0) continue;
                        bl = true;
                    }
                    ++n6;
                }
            }
            double[] dArray4 = dArray;
            n6 = n5++;
            double d4 = (double)(n4 - 0) / d;
            double d5 = Math.exp(-d4 * d4 / 2.0) / Math.sqrt(Math.PI * 2);
            dArray4[n6] = d2 = d5 / d;
            ++n4;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)Lvf;", garbageValue="1")
    SpritePixels method7951(int n) {
        if (!this.spriteMap.containsKey(n)) {
            this.method7941(n);
        }
        return (SpritePixels)this.spriteMap.get(n);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIS)V", garbageValue="4032")
    public final void method7943(int n, int n2) {
        if (this.field4654 >= this.field4650.length) {
            return;
        }
        this.field4650[this.field4654] = n;
        this.field4653[this.field4654] = n2;
        ++this.field4654;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-20350834")
    public final void method7940() {
        this.field4654 = 0;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IILvf;FI)V", garbageValue="203828085")
    public final void method7945(int n, int n2, SpritePixels spritePixels, float f) {
        int n3 = (int)(f * 18.0f);
        SpritePixels spritePixels2 = this.method7951(n3);
        int n4 = n3 * 2 + 1;
        Bounds bounds = new Bounds(0, 0, spritePixels.subWidth, spritePixels.subHeight);
        Bounds bounds2 = new Bounds(0, 0);
        this.bounds.setHigh(n4, n4);
        System.nanoTime();
        int n5 = 0;
        while (true) {
            int n6;
            int n7;
            if (n5 >= this.field4654) {
                System.nanoTime();
                System.nanoTime();
                n5 = 0;
                while (true) {
                    if (n5 >= spritePixels.pixels.length) {
                        System.nanoTime();
                        return;
                    }
                    if (spritePixels.pixels[n5] != 0) {
                        n7 = (spritePixels.pixels[n5] + 64 - 1) / 256;
                        if (n7 > 0) {
                            if (n7 > class309.field3287.length) {
                                n7 = class309.field3287.length;
                            }
                            n6 = class309.field3287[n7 - 1];
                            spritePixels.pixels[n5] = 0xFF000000 | n6;
                        } else {
                            spritePixels.pixels[n5] = -16777216;
                        }
                    } else {
                        spritePixels.pixels[n5] = -16777216;
                    }
                    ++n5;
                }
            }
            n7 = this.field4650[n5];
            n6 = this.field4653[n5];
            int n8 = (int)(f * (float)(n7 - n)) - n3;
            int n9 = (int)((float)spritePixels.subHeight - f * (float)(n6 - n2)) - n3;
            this.bounds.setLow(n8, n9);
            this.bounds.method8265(bounds, bounds2);
            this.method7946(spritePixels2, spritePixels, bounds2);
            ++n5;
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lvf;Lvf;Lql;B)V", garbageValue="127")
    void method7946(SpritePixels spritePixels, SpritePixels spritePixels2, Bounds bounds) {
        if (bounds.highX != 0 && bounds.highY != 0) {
            int n = 0;
            int n2 = 0;
            if (bounds.lowX == 0) {
                n = spritePixels.subWidth - bounds.highX;
            }
            if (bounds.lowY == 0) {
                n2 = spritePixels.subHeight - bounds.highY;
            }
            int n3 = n + n2 * spritePixels.subWidth;
            int n4 = bounds.lowX + spritePixels2.subWidth * bounds.lowY;
            int n5 = 0;
            block0: while (true) {
                if (n5 >= bounds.highY) {
                    return;
                }
                int n6 = 0;
                while (true) {
                    if (n6 >= bounds.highX) {
                        n3 += spritePixels.subWidth - bounds.highX;
                        n4 += spritePixels2.subWidth - bounds.highX;
                        ++n5;
                        continue block0;
                    }
                    int n7 = n4++;
                    spritePixels2.pixels[n7] = spritePixels2.pixels[n7] + spritePixels.pixels[n3++];
                    ++n6;
                }
                break;
            }
        }
    }
}

