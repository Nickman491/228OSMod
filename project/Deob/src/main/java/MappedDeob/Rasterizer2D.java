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

@ObfuscatedName(value="vq")
@Implements(value="Rasterizer2D")
public class Rasterizer2D
extends DualNode {
    @ObfuscatedName(value="ap")
    @Export(value="Rasterizer2D_pixels")
    public static int[] Rasterizer2D_pixels;
    @ObfuscatedName(value="ab")
    @Export(value="Rasterizer2D_width")
    public static int Rasterizer2D_width;
    @ObfuscatedName(value="aj")
    @Export(value="Rasterizer2D_height")
    public static int Rasterizer2D_height;
    @ObfuscatedName(value="bu")
    public static float[] field5544;
    @ObfuscatedName(value="bw")
    @Export(value="Rasterizer2D_yClipStart")
    public static int Rasterizer2D_yClipStart;
    @ObfuscatedName(value="bb")
    @Export(value="Rasterizer2D_yClipEnd")
    public static int Rasterizer2D_yClipEnd;
    @ObfuscatedName(value="bx")
    @Export(value="Rasterizer2D_xClipStart")
    public static int Rasterizer2D_xClipStart;
    @ObfuscatedName(value="bd")
    @Export(value="Rasterizer2D_xClipEnd")
    public static int Rasterizer2D_xClipEnd;

    static {
        Rasterizer2D_yClipStart = 0;
        Rasterizer2D_yClipEnd = 0;
        Rasterizer2D_xClipStart = 0;
        Rasterizer2D_xClipEnd = 0;
    }

    protected Rasterizer2D() {
    }

    @ObfuscatedName(value="ec")
    protected static void method10603(int[] nArray, int n, int n2, float[] fArray) {
        Rasterizer2D_pixels = nArray;
        Rasterizer2D_width = n;
        Rasterizer2D_height = n2;
        field5544 = fArray;
        Rasterizer2D.Rasterizer2D_setClip(0, 0, n, n2);
    }

    @ObfuscatedName(value="em")
    @Export(value="Rasterizer2D_resetClip")
    public static void Rasterizer2D_resetClip() {
        Rasterizer2D_xClipStart = 0;
        Rasterizer2D_yClipStart = 0;
        Rasterizer2D_xClipEnd = Rasterizer2D_width;
        Rasterizer2D_yClipEnd = Rasterizer2D_height;
    }

    @ObfuscatedName(value="es")
    @Export(value="Rasterizer2D_setClip")
    public static void Rasterizer2D_setClip(int n, int n2, int n3, int n4) {
        if (n < 0) {
            n = 0;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 > Rasterizer2D_width) {
            n3 = Rasterizer2D_width;
        }
        if (n4 > Rasterizer2D_height) {
            n4 = Rasterizer2D_height;
        }
        Rasterizer2D_xClipStart = n;
        Rasterizer2D_yClipStart = n2;
        Rasterizer2D_xClipEnd = n3;
        Rasterizer2D_yClipEnd = n4;
    }

    @ObfuscatedName(value="er")
    @Export(value="Rasterizer2D_expandClip")
    public static void Rasterizer2D_expandClip(int n, int n2, int n3, int n4) {
        if (Rasterizer2D_xClipStart < n) {
            Rasterizer2D_xClipStart = n;
        }
        if (Rasterizer2D_yClipStart < n2) {
            Rasterizer2D_yClipStart = n2;
        }
        if (Rasterizer2D_xClipEnd > n3) {
            Rasterizer2D_xClipEnd = n3;
        }
        if (Rasterizer2D_yClipEnd > n4) {
            Rasterizer2D_yClipEnd = n4;
        }
    }

    @ObfuscatedName(value="ep")
    @Export(value="Rasterizer2D_getClipArray")
    public static void Rasterizer2D_getClipArray(int[] nArray) {
        nArray[0] = Rasterizer2D_xClipStart;
        nArray[1] = Rasterizer2D_yClipStart;
        nArray[2] = Rasterizer2D_xClipEnd;
        nArray[3] = Rasterizer2D_yClipEnd;
    }

    @ObfuscatedName(value="eo")
    @Export(value="Rasterizer2D_setClipArray")
    public static void Rasterizer2D_setClipArray(int[] nArray) {
        Rasterizer2D_xClipStart = nArray[0];
        Rasterizer2D_yClipStart = nArray[1];
        Rasterizer2D_xClipEnd = nArray[2];
        Rasterizer2D_yClipEnd = nArray[3];
    }

    @ObfuscatedName(value="ez")
    @Export(value="Rasterizer2D_clear")
    public static void Rasterizer2D_clear() {
        int n = 0;
        int n2 = Rasterizer2D_width * Rasterizer2D_height - 7;
        while (true) {
            if (n >= n2) {
                n2 += 7;
                while (n < n2) {
                    Rasterizer2D.Rasterizer2D_pixels[n++] = 0;
                }
                Rasterizer2D.method10626();
                return;
            }
            Rasterizer2D.Rasterizer2D_pixels[n++] = 0;
            Rasterizer2D.Rasterizer2D_pixels[n++] = 0;
            Rasterizer2D.Rasterizer2D_pixels[n++] = 0;
            Rasterizer2D.Rasterizer2D_pixels[n++] = 0;
            Rasterizer2D.Rasterizer2D_pixels[n++] = 0;
            Rasterizer2D.Rasterizer2D_pixels[n++] = 0;
            Rasterizer2D.Rasterizer2D_pixels[n++] = 0;
            Rasterizer2D.Rasterizer2D_pixels[n++] = 0;
        }
    }

    @ObfuscatedName(value="eb")
    @Export(value="drawCircle")
    static void drawCircle(int n, int n2, int n3, int n4) {
        if (n3 != 0) {
            int n5;
            int n6;
            if (n3 < 0) {
                n3 = -n3;
            }
            if ((n6 = n2 - n3) < Rasterizer2D_yClipStart) {
                n6 = Rasterizer2D_yClipStart;
            }
            if ((n5 = n3 + n2 + 1) > Rasterizer2D_yClipEnd) {
                n5 = Rasterizer2D_yClipEnd;
            }
            int n7 = n6;
            int n8 = n3 * n3;
            int n9 = 0;
            int n10 = n2 - n7;
            int n11 = n10 * n10;
            int n12 = n11 - n10;
            if (n2 > n5) {
                n2 = n5;
            }
            block0: while (true) {
                int n13;
                int n14;
                int n15;
                int n16;
                if (n7 >= n2) {
                    n9 = n3;
                    n10 = n7 - n2;
                    n12 = n8 + n10 * n10;
                    n11 = n12 - n9;
                    n12 -= n10;
                    block1: while (true) {
                        if (n7 >= n5) {
                            return;
                        }
                        while (true) {
                            if (n12 <= n8 || n11 <= n8) {
                                n16 = n - n9;
                                if (n16 < Rasterizer2D_xClipStart) {
                                    n16 = Rasterizer2D_xClipStart;
                                }
                                if ((n15 = n + n9) > Rasterizer2D_xClipEnd - 1) {
                                    n15 = Rasterizer2D_xClipEnd - 1;
                                }
                                n14 = n16 + n7 * Rasterizer2D_width;
                                for (n13 = n16; n13 <= n15; ++n13) {
                                    Rasterizer2D.Rasterizer2D_pixels[n14++] = n4;
                                }
                                ++n7;
                                n12 = n12 + n10 + n10;
                                n11 += n10++ + n10;
                                continue block1;
                            }
                            n12 -= n9-- + n9;
                            n11 -= n9 + n9;
                        }
                        break;
                    }
                }
                while (true) {
                    if (n12 > n8 && n11 > n8) {
                        n16 = n - n9 + 1;
                        if (n16 < Rasterizer2D_xClipStart) {
                            n16 = Rasterizer2D_xClipStart;
                        }
                        if ((n15 = n + n9) > Rasterizer2D_xClipEnd) {
                            n15 = Rasterizer2D_xClipEnd;
                        }
                        n14 = n16 + n7 * Rasterizer2D_width;
                        for (n13 = n16; n13 < n15; ++n13) {
                            Rasterizer2D.Rasterizer2D_pixels[n14++] = n4;
                        }
                        ++n7;
                        n11 -= n10-- + n10;
                        n12 -= n10 + n10;
                        continue block0;
                    }
                    n11 = n11 + n9 + n9;
                    n12 += n9++ + n9;
                }
                break;
            }
        }
        Rasterizer2D.Rasterizer2D_setPixel(n, n2, n4);
    }

    @ObfuscatedName(value="en")
    @Export(value="Rasterizer2D_drawCircleAlpha")
    public static void Rasterizer2D_drawCircleAlpha(int n, int n2, int n3, int n4, int n5) {
        if (n5 == 0) {
            return;
        }
        if (n5 != 256) {
            int n6;
            if (n3 < 0) {
                n3 = -n3;
            }
            int n7 = 256 - n5;
            int n8 = (n4 >> 16 & 0xFF) * n5;
            int n9 = (n4 >> 8 & 0xFF) * n5;
            int n10 = n5 * (n4 & 0xFF);
            int n11 = n2 - n3;
            if (n11 < Rasterizer2D_yClipStart) {
                n11 = Rasterizer2D_yClipStart;
            }
            if ((n6 = n3 + n2 + 1) > Rasterizer2D_yClipEnd) {
                n6 = Rasterizer2D_yClipEnd;
            }
            int n12 = n11;
            int n13 = n3 * n3;
            int n14 = 0;
            int n15 = n2 - n12;
            int n16 = n15 * n15;
            int n17 = n16 - n15;
            if (n2 > n6) {
                n2 = n6;
            }
            block0: while (true) {
                int n18;
                int n19;
                int n20;
                int n21;
                int n22;
                int n23;
                int n24;
                int n25;
                if (n12 >= n2) {
                    n14 = n3;
                    n15 = -n15;
                    n17 = n13 + n15 * n15;
                    n16 = n17 - n14;
                    n17 -= n15;
                    block1: while (true) {
                        if (n12 >= n6) {
                            return;
                        }
                        while (true) {
                            if (n17 <= n13 || n16 <= n13) {
                                n25 = n - n14;
                                if (n25 < Rasterizer2D_xClipStart) {
                                    n25 = Rasterizer2D_xClipStart;
                                }
                                if ((n24 = n + n14) > Rasterizer2D_xClipEnd - 1) {
                                    n24 = Rasterizer2D_xClipEnd - 1;
                                }
                                n23 = n25 + n12 * Rasterizer2D_width;
                                n22 = n25;
                                while (true) {
                                    if (n22 > n24) {
                                        ++n12;
                                        n17 = n17 + n15 + n15;
                                        n16 += n15++ + n15;
                                        continue block1;
                                    }
                                    n21 = n7 * (Rasterizer2D_pixels[n23] >> 16 & 0xFF);
                                    n20 = (Rasterizer2D_pixels[n23] >> 8 & 0xFF) * n7;
                                    n19 = n7 * (Rasterizer2D_pixels[n23] & 0xFF);
                                    n18 = (n10 + n19 >> 8) + (n8 + n21 >> 8 << 16) + (n9 + n20 >> 8 << 8);
                                    Rasterizer2D.Rasterizer2D_pixels[n23++] = n18;
                                    ++n22;
                                }
                            }
                            n17 -= n14-- + n14;
                            n16 -= n14 + n14;
                        }
                        break;
                    }
                }
                while (true) {
                    if (n17 > n13 && n16 > n13) {
                        n25 = n - n14 + 1;
                        if (n25 < Rasterizer2D_xClipStart) {
                            n25 = Rasterizer2D_xClipStart;
                        }
                        if ((n24 = n + n14) > Rasterizer2D_xClipEnd) {
                            n24 = Rasterizer2D_xClipEnd;
                        }
                        n23 = n25 + n12 * Rasterizer2D_width;
                        n22 = n25;
                        while (true) {
                            if (n22 >= n24) {
                                ++n12;
                                n16 -= n15-- + n15;
                                n17 -= n15 + n15;
                                continue block0;
                            }
                            n21 = n7 * (Rasterizer2D_pixels[n23] >> 16 & 0xFF);
                            n20 = (Rasterizer2D_pixels[n23] >> 8 & 0xFF) * n7;
                            n19 = n7 * (Rasterizer2D_pixels[n23] & 0xFF);
                            n18 = (n10 + n19 >> 8) + (n8 + n21 >> 8 << 16) + (n9 + n20 >> 8 << 8);
                            Rasterizer2D.Rasterizer2D_pixels[n23++] = n18;
                            ++n22;
                        }
                    }
                    n16 = n16 + n14 + n14;
                    n17 += n14++ + n14;
                }
                break;
            }
        }
        Rasterizer2D.drawCircle(n, n2, n3, n4);
    }

    @ObfuscatedName(value="ee")
    @Export(value="Rasterizer2D_fillRectangleAlpha")
    public static void Rasterizer2D_fillRectangleAlpha(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n < Rasterizer2D_xClipStart) {
            n3 -= Rasterizer2D_xClipStart - n;
            n = Rasterizer2D_xClipStart;
        }
        if (n2 < Rasterizer2D_yClipStart) {
            n4 -= Rasterizer2D_yClipStart - n2;
            n2 = Rasterizer2D_yClipStart;
        }
        if (n + n3 > Rasterizer2D_xClipEnd) {
            n3 = Rasterizer2D_xClipEnd - n;
        }
        if (n4 + n2 > Rasterizer2D_yClipEnd) {
            n4 = Rasterizer2D_yClipEnd - n2;
        }
        n5 = (n6 * (n5 & 0xFF00FF) >> 8 & 0xFF00FF) + (n6 * (n5 & 0xFF00) >> 8 & 0xFF00);
        int n7 = 256 - n6;
        int n8 = Rasterizer2D_width - n3;
        int n9 = n + Rasterizer2D_width * n2;
        int n10 = 0;
        block0: while (n10 < n4) {
            int n11 = -n3;
            while (true) {
                if (n11 >= 0) {
                    n9 += n8;
                    ++n10;
                    continue block0;
                }
                int n12 = Rasterizer2D_pixels[n9];
                n12 = ((n12 & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + (n7 * (n12 & 0xFF00) >> 8 & 0xFF00);
                Rasterizer2D.Rasterizer2D_pixels[n9++] = n12 + n5;
                ++n11;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="ev")
    @Export(value="Rasterizer2D_fillRectangle")
    public static void Rasterizer2D_fillRectangle(int n, int n2, int n3, int n4, int n5) {
        if (n < Rasterizer2D_xClipStart) {
            n3 -= Rasterizer2D_xClipStart - n;
            n = Rasterizer2D_xClipStart;
        }
        if (n2 < Rasterizer2D_yClipStart) {
            n4 -= Rasterizer2D_yClipStart - n2;
            n2 = Rasterizer2D_yClipStart;
        }
        if (n + n3 > Rasterizer2D_xClipEnd) {
            n3 = Rasterizer2D_xClipEnd - n;
        }
        if (n4 + n2 > Rasterizer2D_yClipEnd) {
            n4 = Rasterizer2D_yClipEnd - n2;
        }
        int n6 = Rasterizer2D_width - n3;
        int n7 = n + Rasterizer2D_width * n2;
        int n8 = -n4;
        block0: while (n8 < 0) {
            int n9 = -n3;
            while (true) {
                if (n9 >= 0) {
                    n7 += n6;
                    ++n8;
                    continue block0;
                }
                Rasterizer2D.Rasterizer2D_pixels[n7++] = n5;
                ++n9;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="el")
    @Export(value="Rasterizer2D_fillRectangleGradient")
    public static void Rasterizer2D_fillRectangleGradient(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n3 > 0 && n4 > 0) {
            int n7 = 0;
            int n8 = 65536 / n4;
            if (n < Rasterizer2D_xClipStart) {
                n3 -= Rasterizer2D_xClipStart - n;
                n = Rasterizer2D_xClipStart;
            }
            if (n2 < Rasterizer2D_yClipStart) {
                n7 += (Rasterizer2D_yClipStart - n2) * n8;
                n4 -= Rasterizer2D_yClipStart - n2;
                n2 = Rasterizer2D_yClipStart;
            }
            if (n + n3 > Rasterizer2D_xClipEnd) {
                n3 = Rasterizer2D_xClipEnd - n;
            }
            if (n4 + n2 > Rasterizer2D_yClipEnd) {
                n4 = Rasterizer2D_yClipEnd - n2;
            }
            int n9 = Rasterizer2D_width - n3;
            int n10 = n + Rasterizer2D_width * n2;
            int n11 = -n4;
            block0: while (true) {
                if (n11 >= 0) {
                    return;
                }
                int n12 = 65536 - n7 >> 8;
                int n13 = n7 >> 8;
                int n14 = (n13 * (n6 & 0xFF00FF) + n12 * (n5 & 0xFF00FF) & 0xFF00FF00) + (n13 * (n6 & 0xFF00) + n12 * (n5 & 0xFF00) & 0xFF0000) >>> 8;
                int n15 = -n3;
                while (true) {
                    if (n15 >= 0) {
                        n10 += n9;
                        n7 += n8;
                        ++n11;
                        continue block0;
                    }
                    Rasterizer2D.Rasterizer2D_pixels[n10++] = n14;
                    ++n15;
                }
                break;
            }
        }
    }

    @ObfuscatedName(value="ea")
    @Export(value="Rasterizer2D_fillRectangleGradientAlpha")
    public static void Rasterizer2D_fillRectangleGradientAlpha(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (n3 > 0 && n4 > 0) {
            int n9 = 0;
            int n10 = 65536 / n4;
            if (n < Rasterizer2D_xClipStart) {
                n3 -= Rasterizer2D_xClipStart - n;
                n = Rasterizer2D_xClipStart;
            }
            if (n2 < Rasterizer2D_yClipStart) {
                n9 += (Rasterizer2D_yClipStart - n2) * n10;
                n4 -= Rasterizer2D_yClipStart - n2;
                n2 = Rasterizer2D_yClipStart;
            }
            if (n + n3 > Rasterizer2D_xClipEnd) {
                n3 = Rasterizer2D_xClipEnd - n;
            }
            if (n4 + n2 > Rasterizer2D_yClipEnd) {
                n4 = Rasterizer2D_yClipEnd - n2;
            }
            int n11 = Rasterizer2D_width - n3;
            int n12 = n + Rasterizer2D_width * n2;
            int n13 = -n4;
            while (true) {
                block12: {
                    if (n13 >= 0) {
                        return;
                    }
                    int n14 = 65536 - n9 >> 8;
                    int n15 = n9 >> 8;
                    int n16 = (n14 * n7 + n15 * n8 & 0xFF00) >>> 8;
                    if (n16 != 0) {
                        int n17 = (n15 * (n6 & 0xFF00FF) + n14 * (n5 & 0xFF00FF) & 0xFF00FF00) + (n15 * (n6 & 0xFF00) + n14 * (n5 & 0xFF00) & 0xFF0000) >>> 8;
                        int n18 = 255 - n16;
                        int n19 = ((n17 & 0xFF00FF) * n16 >> 8 & 0xFF00FF) + (n16 * (n17 & 0xFF00) >> 8 & 0xFF00);
                        int n20 = -n3;
                        while (true) {
                            if (n20 >= 0) {
                                n12 += n11;
                                n9 += n10;
                                break block12;
                            }
                            int n21 = Rasterizer2D_pixels[n12];
                            if (n21 != 0) {
                                n21 = ((n21 & 0xFF00FF) * n18 >> 8 & 0xFF00FF) + (n18 * (n21 & 0xFF00) >> 8 & 0xFF00);
                                Rasterizer2D.Rasterizer2D_pixels[n12++] = n19 + n21;
                            } else {
                                Rasterizer2D.Rasterizer2D_pixels[n12++] = n19;
                            }
                            ++n20;
                        }
                    }
                    n12 += Rasterizer2D_width;
                    n9 += n10;
                }
                ++n13;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="eu")
    @ObfuscatedSignature(descriptor="(IIIIII[BIZ)V", garbageValue="1")
    @Export(value="Rasterizer2D_drawGradientPixels")
    public static void Rasterizer2D_drawGradientPixels(int n, int n2, int n3, int n4, int n5, int n6, byte[] byArray, int n7) {
        int n8;
        int n9;
        int n10;
        int n11;
        block10: {
            if (n + n3 < 0) return;
            if (n4 + n2 < 0) {
                return;
            }
            if (n >= Rasterizer2D_width) return;
            if (n2 >= Rasterizer2D_height) {
                return;
            }
            n11 = 0;
            n10 = 0;
            if (n < 0) {
                n11 -= n;
                n3 = n + n3;
            }
            if (n2 < 0) {
                n10 -= n2;
                n4 += n2;
            }
            if (n + n3 > Rasterizer2D_width) {
                n3 = Rasterizer2D_width - n;
            }
            if (n4 + n2 > Rasterizer2D_height) {
                n4 = Rasterizer2D_height - n2;
            }
            n9 = byArray.length / n7;
            n8 = Rasterizer2D_width - n3;
            int n12 = n5 >>> 24;
            int n13 = n6 >>> 24;
            if (n12 == 255 && n13 == 255) break block10;
            int n14 = n + n11 + (n10 + n2) * Rasterizer2D_width;
            int n15 = n10 + n2;
            block0: while (true) {
                if (n15 >= n4 + n10 + n2) return;
                int n16 = n + n11;
                while (true) {
                    int n17;
                    block12: {
                        block13: {
                            block11: {
                                if (n16 >= n + n11 + n3) break block11;
                                int n18 = (n15 - n2) % n9;
                                int n19 = (n16 - n) % n7;
                                n17 = n5;
                                if (byArray[n19 + n18 * n7] == 0) break block12;
                                break block13;
                            }
                            n14 += n8;
                            ++n15;
                            continue block0;
                        }
                        n17 = n6;
                    }
                    int n20 = n17 >>> 24;
                    int n21 = 255 - n20;
                    int n22 = Rasterizer2D_pixels[n14];
                    int n23 = ((n17 & 0xFF00FF) * n20 + (n22 & 0xFF00FF) * n21 & 0xFF00FF00) + (n20 * (n17 & 0xFF00) + n21 * (n22 & 0xFF00) & 0xFF0000) >> 8;
                    Rasterizer2D.Rasterizer2D_pixels[n14++] = n23;
                    ++n16;
                }
                break;
            }
        }
        int n24 = n + n11 + (n10 + n2) * Rasterizer2D_width;
        int n25 = n10 + n2;
        block2: while (n25 < n4 + n10 + n2) {
            int n26 = n + n11;
            while (true) {
                block17: {
                    block15: {
                        block16: {
                            block14: {
                                if (n26 >= n + n11 + n3) break block14;
                                int n27 = (n26 - n) % n7;
                                int n28 = (n25 - n2) % n9;
                                if (byArray[n27 + n28 * n7] == 0) break block15;
                                break block16;
                            }
                            n24 += n8;
                            ++n25;
                            continue block2;
                        }
                        Rasterizer2D.Rasterizer2D_pixels[n24++] = n6;
                        break block17;
                    }
                    Rasterizer2D.Rasterizer2D_pixels[n24++] = n5;
                }
                ++n26;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="ey")
    @Export(value="Rasterizer2D_drawRectangle")
    public static void Rasterizer2D_drawRectangle(int n, int n2, int n3, int n4, int n5) {
        Rasterizer2D.method10619(n, n2, n3, n5);
        Rasterizer2D.method10619(n, n4 + n2 - 1, n3, n5);
        Rasterizer2D.method10621(n, n2, n4, n5);
        Rasterizer2D.method10621(n + n3 - 1, n2, n4, n5);
    }

    @ObfuscatedName(value="eh")
    @Export(value="Rasterizer2D_drawRectangleAlpha")
    public static void Rasterizer2D_drawRectangleAlpha(int n, int n2, int n3, int n4, int n5, int n6) {
        Rasterizer2D.Rasterizer2D_drawHorizontalLineAlpha(n, n2, n3, n5, n6);
        Rasterizer2D.Rasterizer2D_drawHorizontalLineAlpha(n, n4 + n2 - 1, n3, n5, n6);
        if (n4 >= 3) {
            Rasterizer2D.Rasterizer2D_drawVerticalLineAlpha(n, n2 + 1, n4 - 2, n5, n6);
            Rasterizer2D.Rasterizer2D_drawVerticalLineAlpha(n + n3 - 1, n2 + 1, n4 - 2, n5, n6);
        }
    }

    @ObfuscatedName(value="ew")
    public static void method10619(int n, int n2, int n3, int n4) {
        if (n2 >= Rasterizer2D_yClipStart && n2 < Rasterizer2D_yClipEnd) {
            if (n < Rasterizer2D_xClipStart) {
                n3 -= Rasterizer2D_xClipStart - n;
                n = Rasterizer2D_xClipStart;
            }
            if (n + n3 > Rasterizer2D_xClipEnd) {
                n3 = Rasterizer2D_xClipEnd - n;
            }
            int n5 = n + Rasterizer2D_width * n2;
            for (int i = 0; i < n3; ++i) {
                Rasterizer2D.Rasterizer2D_pixels[n5 + i] = n4;
            }
            return;
        }
    }

    @ObfuscatedName(value="ed")
    @Export(value="Rasterizer2D_drawHorizontalLineAlpha")
    static void Rasterizer2D_drawHorizontalLineAlpha(int n, int n2, int n3, int n4, int n5) {
        if (n2 >= Rasterizer2D_yClipStart && n2 < Rasterizer2D_yClipEnd) {
            if (n < Rasterizer2D_xClipStart) {
                n3 -= Rasterizer2D_xClipStart - n;
                n = Rasterizer2D_xClipStart;
            }
            if (n + n3 > Rasterizer2D_xClipEnd) {
                n3 = Rasterizer2D_xClipEnd - n;
            }
            int n6 = 256 - n5;
            int n7 = (n4 >> 16 & 0xFF) * n5;
            int n8 = (n4 >> 8 & 0xFF) * n5;
            int n9 = n5 * (n4 & 0xFF);
            int n10 = n + Rasterizer2D_width * n2;
            int n11 = 0;
            while (true) {
                if (n11 >= n3) {
                    return;
                }
                int n12 = n6 * (Rasterizer2D_pixels[n10] >> 16 & 0xFF);
                int n13 = (Rasterizer2D_pixels[n10] >> 8 & 0xFF) * n6;
                int n14 = n6 * (Rasterizer2D_pixels[n10] & 0xFF);
                int n15 = (n9 + n14 >> 8) + (n7 + n12 >> 8 << 16) + (n8 + n13 >> 8 << 8);
                Rasterizer2D.Rasterizer2D_pixels[n10++] = n15;
                ++n11;
            }
        }
    }

    @ObfuscatedName(value="fz")
    public static void method10621(int n, int n2, int n3, int n4) {
        if (n >= Rasterizer2D_xClipStart && n < Rasterizer2D_xClipEnd) {
            if (n2 < Rasterizer2D_yClipStart) {
                n3 -= Rasterizer2D_yClipStart - n2;
                n2 = Rasterizer2D_yClipStart;
            }
            if (n3 + n2 > Rasterizer2D_yClipEnd) {
                n3 = Rasterizer2D_yClipEnd - n2;
            }
            int n5 = n + Rasterizer2D_width * n2;
            for (int i = 0; i < n3; ++i) {
                Rasterizer2D.Rasterizer2D_pixels[n5 + i * Rasterizer2D.Rasterizer2D_width] = n4;
            }
            return;
        }
    }

    @ObfuscatedName(value="fn")
    @Export(value="Rasterizer2D_drawVerticalLineAlpha")
    static void Rasterizer2D_drawVerticalLineAlpha(int n, int n2, int n3, int n4, int n5) {
        if (n >= Rasterizer2D_xClipStart && n < Rasterizer2D_xClipEnd) {
            if (n2 < Rasterizer2D_yClipStart) {
                n3 -= Rasterizer2D_yClipStart - n2;
                n2 = Rasterizer2D_yClipStart;
            }
            if (n3 + n2 > Rasterizer2D_yClipEnd) {
                n3 = Rasterizer2D_yClipEnd - n2;
            }
            int n6 = 256 - n5;
            int n7 = (n4 >> 16 & 0xFF) * n5;
            int n8 = (n4 >> 8 & 0xFF) * n5;
            int n9 = n5 * (n4 & 0xFF);
            int n10 = n + Rasterizer2D_width * n2;
            int n11 = 0;
            while (true) {
                int n12;
                if (n11 >= n3) {
                    return;
                }
                int n13 = n6 * (Rasterizer2D_pixels[n10] >> 16 & 0xFF);
                int n14 = (Rasterizer2D_pixels[n10] >> 8 & 0xFF) * n6;
                int n15 = n6 * (Rasterizer2D_pixels[n10] & 0xFF);
                Rasterizer2D.Rasterizer2D_pixels[n10] = n12 = (n9 + n15 >> 8) + (n7 + n13 >> 8 << 16) + (n8 + n14 >> 8 << 8);
                n10 += Rasterizer2D_width;
                ++n11;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="fd")
    @Export(value="Rasterizer2D_drawLine")
    public static void Rasterizer2D_drawLine(int n, int n2, int n3, int n4, int n5) {
        block11: {
            block13: {
                int n6;
                block15: {
                    block16: {
                        block14: {
                            block12: {
                                block10: {
                                    n3 -= n;
                                    if ((n4 -= n2) != 0) break block10;
                                    if (n3 < 0) {
                                        Rasterizer2D.method10619(n + n3, n2, -n3 + 1, n5);
                                        return;
                                    }
                                    break block11;
                                }
                                if (n3 != 0) break block12;
                                if (n4 < 0) {
                                    Rasterizer2D.method10621(n, n4 + n2, -n4 + 1, n5);
                                    return;
                                }
                                break block13;
                            }
                            if (n4 + n3 < 0) {
                                n += n3;
                                n3 = -n3;
                                n2 = n4 + n2;
                                n4 = -n4;
                            }
                            if (n3 <= n4) break block14;
                            n2 <<= 16;
                            n2 += 32768;
                            n6 = (int)Math.floor((double)(n4 <<= 16) / (double)n3 + 0.5);
                            n3 = n + n3;
                            if (n >= Rasterizer2D_xClipStart) break block15;
                            break block16;
                        }
                        n <<= 16;
                        n += 32768;
                        int n7 = (int)Math.floor((double)(n3 <<= 16) / (double)n4 + 0.5);
                        n4 += n2;
                        if (n2 < Rasterizer2D_yClipStart) {
                            n += (Rasterizer2D_yClipStart - n2) * n7;
                            n2 = Rasterizer2D_yClipStart;
                        }
                        if (n4 >= Rasterizer2D_yClipEnd) {
                            n4 = Rasterizer2D_yClipEnd - 1;
                        }
                        while (n2 <= n4) {
                            int n8 = n >> 16;
                            if (n8 >= Rasterizer2D_xClipStart && n8 < Rasterizer2D_xClipEnd) {
                                Rasterizer2D.Rasterizer2D_pixels[n8 + Rasterizer2D.Rasterizer2D_width * n2] = n5;
                            }
                            n += n7;
                            ++n2;
                        }
                        return;
                    }
                    n2 = n6 * (Rasterizer2D_xClipStart - n) + n2;
                    n = Rasterizer2D_xClipStart;
                }
                if (n3 >= Rasterizer2D_xClipEnd) {
                    n3 = Rasterizer2D_xClipEnd - 1;
                }
                while (n <= n3) {
                    int n9 = n2 >> 16;
                    if (n9 >= Rasterizer2D_yClipStart && n9 < Rasterizer2D_yClipEnd) {
                        Rasterizer2D.Rasterizer2D_pixels[n + n9 * Rasterizer2D.Rasterizer2D_width] = n5;
                    }
                    n2 = n6 + n2;
                    ++n;
                }
                return;
            }
            Rasterizer2D.method10621(n, n2, n4 + 1, n5);
            return;
        }
        Rasterizer2D.method10619(n, n2, n3 + 1, n5);
    }

    @ObfuscatedName(value="fc")
    @Export(value="Rasterizer2D_setPixel")
    static void Rasterizer2D_setPixel(int n, int n2, int n3) {
        if (n >= Rasterizer2D_xClipStart && n2 >= Rasterizer2D_yClipStart && n < Rasterizer2D_xClipEnd && n2 < Rasterizer2D_yClipEnd) {
            Rasterizer2D.Rasterizer2D_pixels[n + Rasterizer2D.Rasterizer2D_width * n2] = n3;
            return;
        }
    }

    @ObfuscatedName(value="fb")
    @Export(value="Rasterizer2D_fillMaskedRectangle")
    public static void Rasterizer2D_fillMaskedRectangle(int n, int n2, int n3, int[] nArray, int[] nArray2) {
        int n4 = n + Rasterizer2D_width * n2;
        n2 = 0;
        while (n2 < nArray.length) {
            int n5 = n4 + nArray[n2];
            for (n = -nArray2[n2]; n < 0; ++n) {
                Rasterizer2D.Rasterizer2D_pixels[n5++] = n3;
            }
            n4 += Rasterizer2D_width;
            ++n2;
        }
        return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="fg")
    public static void method10626() {
        if (field5544 == null) {
            return;
        }
        if (Rasterizer2D_xClipStart == 0 && Rasterizer2D_xClipEnd == Rasterizer2D_width && Rasterizer2D_yClipStart == 0 && Rasterizer2D_yClipEnd == Rasterizer2D_height) {
            int n = field5544.length;
            int n2 = n - (n & 7);
            int n3 = 0;
            while (true) {
                if (n3 >= n2) {
                    while (n3 < n) {
                        Rasterizer2D.field5544[n3++] = 0.0f;
                    }
                    return;
                }
                Rasterizer2D.field5544[n3++] = 0.0f;
                Rasterizer2D.field5544[n3++] = 0.0f;
                Rasterizer2D.field5544[n3++] = 0.0f;
                Rasterizer2D.field5544[n3++] = 0.0f;
                Rasterizer2D.field5544[n3++] = 0.0f;
                Rasterizer2D.field5544[n3++] = 0.0f;
                Rasterizer2D.field5544[n3++] = 0.0f;
                Rasterizer2D.field5544[n3++] = 0.0f;
            }
        }
        int n = Rasterizer2D_xClipEnd - Rasterizer2D_xClipStart;
        int n4 = Rasterizer2D_yClipEnd - Rasterizer2D_yClipStart;
        int n5 = Rasterizer2D_width - n;
        int n6 = Rasterizer2D_yClipStart * Rasterizer2D_width + Rasterizer2D_xClipStart;
        int n7 = n >> 3;
        int n8 = n & 7;
        n = n6 - 1;
        int n9 = -n4;
        while (n9 < 0) {
            int n10;
            if (n7 > 0) {
                n10 = n7;
                do {
                    Rasterizer2D.field5544[++n] = 0.0f;
                    Rasterizer2D.field5544[++n] = 0.0f;
                    Rasterizer2D.field5544[++n] = 0.0f;
                    Rasterizer2D.field5544[++n] = 0.0f;
                    Rasterizer2D.field5544[++n] = 0.0f;
                    Rasterizer2D.field5544[++n] = 0.0f;
                    Rasterizer2D.field5544[++n] = 0.0f;
                    Rasterizer2D.field5544[++n] = 0.0f;
                } while (--n10 > 0);
            }
            if (n8 > 0) {
                n10 = n8;
                do {
                    Rasterizer2D.field5544[++n] = 0.0f;
                } while (--n10 > 0);
            }
            n += n5;
            ++n9;
        }
        return;
    }

    @ObfuscatedName(value="ff")
    public static void method10627() {
        if (field5544 == null) {
            return;
        }
        int n = field5544.length;
        int n2 = 0;
        while (n2 < n) {
            if (n2 % Rasterizer2D_width < Rasterizer2D_width / 2 && field5544[n2] > 0.0f) {
                float f = field5544[n2];
                float f2 = 75.0f;
                float f3 = 10000.0f;
                float f4 = 750000.0f / (10000.0f - 9925.0f * f);
                float f5 = (f4 - 75.0f) / 9925.0f;
                int n3 = (int)(255.0f * f5);
                Rasterizer2D.Rasterizer2D_pixels[n2] = n3 << 16 | n3 << 8 | n3;
            }
            ++n2;
        }
        return;
    }
}

