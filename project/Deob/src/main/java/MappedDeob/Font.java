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

@ObfuscatedName(value="qw")
@Implements(value="Font")
public final class Font
extends AbstractFont {
    public Font(byte[] byArray, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, int[] nArray5, byte[][] byArray2) {
        super(byArray, nArray, nArray2, nArray3, nArray4, byArray2);
    }

    public Font(byte[] byArray) {
        super(byArray);
    }

    @Override
    @ObfuscatedName(value="ay")
    @Export(value="drawGlyph")
    final void drawGlyph(byte[] byArray, int n, int n2, int n3, int n4, int n5) {
        int n6;
        int n7 = n2 * Rasterizer2D.Rasterizer2D_width + n;
        int n8 = Rasterizer2D.Rasterizer2D_width - n3;
        int n9 = 0;
        int n10 = 0;
        if (n2 < Rasterizer2D.Rasterizer2D_yClipStart) {
            n6 = Rasterizer2D.Rasterizer2D_yClipStart - n2;
            n4 -= n6;
            n2 = Rasterizer2D.Rasterizer2D_yClipStart;
            n10 += n6 * n3;
            n7 += n6 * Rasterizer2D.Rasterizer2D_width;
        }
        if (n2 + n4 > Rasterizer2D.Rasterizer2D_yClipEnd) {
            n4 -= n2 + n4 - Rasterizer2D.Rasterizer2D_yClipEnd;
        }
        if (n < Rasterizer2D.Rasterizer2D_xClipStart) {
            n6 = Rasterizer2D.Rasterizer2D_xClipStart - n;
            n3 -= n6;
            n = Rasterizer2D.Rasterizer2D_xClipStart;
            n10 += n6;
            n7 += n6;
            n9 += n6;
            n8 += n6;
        }
        if (n + n3 > Rasterizer2D.Rasterizer2D_xClipEnd) {
            n6 = n + n3 - Rasterizer2D.Rasterizer2D_xClipEnd;
            n3 -= n6;
            n9 += n6;
            n8 += n6;
        }
        if (n3 > 0 && n4 > 0) {
            AbstractFont.AbstractFont_placeGlyph(Rasterizer2D.Rasterizer2D_pixels, byArray, n5, n10, n7, n3, n4, n8, n9);
            return;
        }
    }

    @Override
    @ObfuscatedName(value="ah")
    @Export(value="drawGlyphAlpha")
    final void drawGlyphAlpha(byte[] byArray, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8 = n2 * Rasterizer2D.Rasterizer2D_width + n;
        int n9 = Rasterizer2D.Rasterizer2D_width - n3;
        int n10 = 0;
        int n11 = 0;
        if (n2 < Rasterizer2D.Rasterizer2D_yClipStart) {
            n7 = Rasterizer2D.Rasterizer2D_yClipStart - n2;
            n4 -= n7;
            n2 = Rasterizer2D.Rasterizer2D_yClipStart;
            n11 += n7 * n3;
            n8 += n7 * Rasterizer2D.Rasterizer2D_width;
        }
        if (n2 + n4 > Rasterizer2D.Rasterizer2D_yClipEnd) {
            n4 -= n2 + n4 - Rasterizer2D.Rasterizer2D_yClipEnd;
        }
        if (n < Rasterizer2D.Rasterizer2D_xClipStart) {
            n7 = Rasterizer2D.Rasterizer2D_xClipStart - n;
            n3 -= n7;
            n = Rasterizer2D.Rasterizer2D_xClipStart;
            n11 += n7;
            n8 += n7;
            n10 += n7;
            n9 += n7;
        }
        if (n + n3 > Rasterizer2D.Rasterizer2D_xClipEnd) {
            n7 = n + n3 - Rasterizer2D.Rasterizer2D_xClipEnd;
            n3 -= n7;
            n10 += n7;
            n9 += n7;
        }
        if (n3 > 0 && n4 > 0) {
            AbstractFont.AbstractFont_placeGlyphAlpha(Rasterizer2D.Rasterizer2D_pixels, byArray, n5, n11, n8, n3, n4, n9, n10, n6);
            return;
        }
    }
}

