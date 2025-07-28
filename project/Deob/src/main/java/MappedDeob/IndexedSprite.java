/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="vi")
@Implements(value="IndexedSprite")
public final class IndexedSprite
extends Rasterizer2D {
    @ObfuscatedName(value="ay")
    @Export(value="pixels")
    public byte[] pixels;
    @ObfuscatedName(value="ah")
    @Export(value="palette")
    public int[] palette;
    @ObfuscatedName(value="az")
    @Export(value="subWidth")
    public int subWidth;
    @ObfuscatedName(value="ao")
    @Export(value="subHeight")
    public int subHeight;
    @ObfuscatedName(value="ad")
    @Export(value="xOffset")
    public int xOffset;
    @ObfuscatedName(value="an")
    @Export(value="yOffset")
    public int yOffset;
    @ObfuscatedName(value="ae")
    @Export(value="width")
    public int width;
    @ObfuscatedName(value="ax")
    @Export(value="height")
    public int height;

    @ObfuscatedName(value="ay")
    @Export(value="normalize")
    public void normalize() {
        if (this.subWidth == this.width && this.subHeight == this.height) {
            return;
        }
        byte[] byArray = new byte[this.width * this.height];
        int n = 0;
        int n2 = 0;
        block0: while (true) {
            if (n2 >= this.subHeight) {
                this.pixels = byArray;
                this.subWidth = this.width;
                this.subHeight = this.height;
                this.xOffset = 0;
                this.yOffset = 0;
                return;
            }
            int n3 = 0;
            while (true) {
                if (n3 >= this.subWidth) {
                    ++n2;
                    continue block0;
                }
                byArray[n3 + (n2 + this.yOffset) * this.width + this.xOffset] = this.pixels[n++];
                ++n3;
            }
            break;
        }
    }

    @ObfuscatedName(value="ah")
    @Export(value="shiftColors")
    public void shiftColors(int n, int n2, int n3) {
        int n4 = 0;
        while (n4 < this.palette.length) {
            int n5 = this.palette[n4] >> 16 & 0xFF;
            if ((n5 += n) < 0) {
                n5 = 0;
            } else if (n5 > 255) {
                n5 = 255;
            }
            int n6 = this.palette[n4] >> 8 & 0xFF;
            if ((n6 += n2) < 0) {
                n6 = 0;
            } else if (n6 > 255) {
                n6 = 255;
            }
            int n7 = this.palette[n4] & 0xFF;
            n7 = n3 + n7;
            if (n7 < 0) {
                n7 = 0;
            } else if (n7 > 255) {
                n7 = 255;
            }
            this.palette[n4] = n7 + (n6 << 8) + (n5 << 16);
            ++n4;
        }
        return;
    }

    @ObfuscatedName(value="az")
    @Export(value="drawAt")
    public void drawAt(int n, int n2) {
        int n3;
        n = this.xOffset + n;
        int n4 = n + (n2 += this.yOffset) * Rasterizer2D.Rasterizer2D_width;
        int n5 = 0;
        int n6 = this.subHeight;
        int n7 = this.subWidth;
        int n8 = Rasterizer2D.Rasterizer2D_width - n7;
        int n9 = 0;
        if (n2 < Rasterizer2D.Rasterizer2D_yClipStart) {
            n3 = Rasterizer2D.Rasterizer2D_yClipStart - n2;
            n6 -= n3;
            n2 = Rasterizer2D.Rasterizer2D_yClipStart;
            n5 += n3 * n7;
            n4 += n3 * Rasterizer2D.Rasterizer2D_width;
        }
        if (n6 + n2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
            n6 -= n6 + n2 - Rasterizer2D.Rasterizer2D_yClipEnd;
        }
        if (n < Rasterizer2D.Rasterizer2D_xClipStart) {
            n3 = Rasterizer2D.Rasterizer2D_xClipStart - n;
            n7 -= n3;
            n = Rasterizer2D.Rasterizer2D_xClipStart;
            n5 += n3;
            n4 += n3;
            n9 += n3;
            n8 += n3;
        }
        if (n7 + n > Rasterizer2D.Rasterizer2D_xClipEnd) {
            n3 = n7 + n - Rasterizer2D.Rasterizer2D_xClipEnd;
            n7 -= n3;
            n9 += n3;
            n8 += n3;
        }
        if (n7 > 0 && n6 > 0) {
            IndexedSprite.IndexedSprite_two(Rasterizer2D.Rasterizer2D_pixels, this.pixels, this.palette, n5, n4, n7, n6, n8, n9);
            return;
        }
    }

    @ObfuscatedName(value="ad")
    public void method10712(int n, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7 = this.subWidth;
        int n8 = this.subHeight;
        int n9 = 0;
        int n10 = 0;
        int n11 = this.width;
        int n12 = this.height;
        int n13 = (n11 << 16) / n3;
        int n14 = (n12 << 16) / n4;
        if (this.xOffset > 0) {
            n6 = (n13 + (this.xOffset << 16) - 1) / n13;
            n = n6 + n;
            n9 += n6 * n13 - (this.xOffset << 16);
        }
        if (this.yOffset > 0) {
            n6 = (n14 + (this.yOffset << 16) - 1) / n14;
            n2 = n6 + n2;
            n10 += n6 * n14 - (this.yOffset << 16);
        }
        if (n7 < n11) {
            n3 = (n13 + ((n7 << 16) - n9) - 1) / n13;
        }
        if (n8 < n12) {
            n4 = (n14 + ((n8 << 16) - n10) - 1) / n14;
        }
        n6 = n + n2 * Rasterizer2D.Rasterizer2D_width;
        int n15 = Rasterizer2D.Rasterizer2D_width - n3;
        if (n2 + n4 > Rasterizer2D.Rasterizer2D_yClipEnd) {
            n4 -= n2 + n4 - Rasterizer2D.Rasterizer2D_yClipEnd;
        }
        if (n2 < Rasterizer2D.Rasterizer2D_yClipStart) {
            n5 = Rasterizer2D.Rasterizer2D_yClipStart - n2;
            n4 -= n5;
            n6 += n5 * Rasterizer2D.Rasterizer2D_width;
            n10 += n14 * n5;
        }
        if (n3 + n > Rasterizer2D.Rasterizer2D_xClipEnd) {
            n5 = n3 + n - Rasterizer2D.Rasterizer2D_xClipEnd;
            n3 -= n5;
            n15 += n5;
        }
        if (n < Rasterizer2D.Rasterizer2D_xClipStart) {
            n5 = Rasterizer2D.Rasterizer2D_xClipStart - n;
            n3 -= n5;
            n6 += n5;
            n9 += n13 * n5;
            n15 += n5;
        }
        IndexedSprite.IndexedSprite_something(Rasterizer2D.Rasterizer2D_pixels, this.pixels, this.palette, n9, n10, n6, n15, n3, n4, n13, n14, n7);
    }

    @ObfuscatedName(value="ao")
    @Export(value="IndexedSprite_two")
    static void IndexedSprite_two(int[] nArray, byte[] byArray, int[] nArray2, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = -(n3 >> 2);
        n3 = -(n3 & 3);
        int n8 = -n4;
        block0: while (n8 < 0) {
            int n9 = n7;
            while (true) {
                byte by;
                if (n9 >= 0) {
                    n9 = n3;
                    while (true) {
                        if (n9 >= 0) {
                            n2 += n5;
                            n += n6;
                            ++n8;
                            continue block0;
                        }
                        by = byArray[n++];
                        if (by != 0) {
                            nArray[n2++] = nArray2[by & 0xFF];
                        } else {
                            ++n2;
                        }
                        ++n9;
                    }
                }
                by = byArray[n++];
                if (by != 0) {
                    nArray[n2++] = nArray2[by & 0xFF];
                } else {
                    ++n2;
                }
                by = byArray[n++];
                if (by != 0) {
                    nArray[n2++] = nArray2[by & 0xFF];
                } else {
                    ++n2;
                }
                by = byArray[n++];
                if (by != 0) {
                    nArray[n2++] = nArray2[by & 0xFF];
                } else {
                    ++n2;
                }
                by = byArray[n++];
                if (by != 0) {
                    nArray[n2++] = nArray2[by & 0xFF];
                } else {
                    ++n2;
                }
                ++n9;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="an")
    @Export(value="IndexedSprite_something")
    static void IndexedSprite_something(int[] nArray, byte[] byArray, int[] nArray2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        int n10 = n;
        int n11 = -n6;
        block0: while (n11 < 0) {
            int n12 = n9 * (n2 >> 16);
            int n13 = -n5;
            while (true) {
                if (n13 >= 0) {
                    n2 = n8 + n2;
                    n = n10;
                    n3 += n4;
                    ++n11;
                    continue block0;
                }
                byte by = byArray[(n >> 16) + n12];
                if (by != 0) {
                    nArray[n3++] = nArray2[by & 0xFF];
                } else {
                    ++n3;
                }
                n += n7;
                ++n13;
            }
            break;
        }
        return;
    }
}

