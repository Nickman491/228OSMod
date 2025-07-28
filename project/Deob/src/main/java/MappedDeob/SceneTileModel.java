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

@ObfuscatedName(value="hq")
@Implements(value="SceneTileModel")
public class SceneTileModel {
    @ObfuscatedName(value="ay")
    @Export(value="Rasterizer3D_colorPalette")
    public static int[] Rasterizer3D_colorPalette = new int[65536];
    @ObfuscatedName(value="ah")
    static int[] field1952 = new int[512];
    @ObfuscatedName(value="az")
    static int[] field1953 = new int[2048];
    @ObfuscatedName(value="ao")
    public static int[] field1954 = new int[2048];
    @ObfuscatedName(value="ad")
    @Export(value="Rasterizer3D_cosine")
    public static int[] Rasterizer3D_cosine = new int[2048];
    @ObfuscatedName(value="an")
    static double field1956;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lhm;")
    public static class203 field1957;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lhx;")
    static class185 field1958;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lhx;")
    static final class185 field1959;
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lhx;")
    static final class185 field1951;

    static {
        int n = 1;
        while (true) {
            if (n >= 512) {
                n = 1;
                while (true) {
                    if (n >= 2048) {
                        n = 0;
                        while (true) {
                            if (n >= 2048) {
                                field1957 = new class203();
                                field1959 = new class202(field1957);
                                field1951 = new class204(field1957);
                                field1958 = field1959;
                                return;
                            }
                            SceneTileModel.field1954[n] = (int)(65536.0 * Math.sin((double)n * 0.0030679615));
                            SceneTileModel.Rasterizer3D_cosine[n] = (int)(65536.0 * Math.cos((double)n * 0.0030679615));
                            ++n;
                        }
                    }
                    SceneTileModel.field1953[n] = 65536 / n;
                    ++n;
                }
            }
            SceneTileModel.field1952[n] = 32768 / n;
            ++n;
        }
    }

    @ObfuscatedName(value="ay")
    public static void method4017(boolean bl) {
        field1958 = bl && Rasterizer2D.field5544 != null ? field1951 : field1959;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lhf;)V")
    public static void method4003(TextureLoader textureLoader) {
        SceneTileModel.field1957.Rasterizer3D_textureLoader = textureLoader;
    }

    @ObfuscatedName(value="az")
    public static void method4004(double d) {
        SceneTileModel.Rasterizer3D_buildPalette(d, 0, 512);
    }

    @ObfuscatedName(value="ao")
    @Export(value="Rasterizer3D_buildPalette")
    static void Rasterizer3D_buildPalette(double d, int n, int n2) {
        int n3 = n * 128;
        int n4 = n;
        while (n4 < n2) {
            double d2 = (double)(n4 >> 3) / 64.0 + 0.0078125;
            double d3 = (double)(n4 & 7) / 8.0 + 0.0625;
            for (int i = 0; i < 128; ++i) {
                double d4;
                double d5 = d4 = (double)i / 128.0;
                double d6 = d4;
                double d7 = d4;
                if (d3 != 0.0) {
                    double d8 = d4 < 0.5 ? d4 * (1.0 + d3) : d4 + d3 - d4 * d3;
                    double d9 = 2.0 * d4 - d8;
                    double d10 = d2 + 0.3333333333333333;
                    if (d10 > 1.0) {
                        d10 -= 1.0;
                    }
                    double d11 = d2;
                    double d12 = d2 - 0.3333333333333333;
                    if (d12 < 0.0) {
                        d12 += 1.0;
                    }
                    d5 = 6.0 * d10 < 1.0 ? d9 + (d8 - d9) * 6.0 * d10 : (2.0 * d10 < 1.0 ? d8 : (3.0 * d10 < 2.0 ? d9 + (d8 - d9) * (0.6666666666666666 - d10) * 6.0 : d9));
                    d6 = 6.0 * d11 < 1.0 ? d9 + (d8 - d9) * 6.0 * d11 : (2.0 * d11 < 1.0 ? d8 : (3.0 * d11 < 2.0 ? d9 + (d8 - d9) * (0.6666666666666666 - d11) * 6.0 : d9));
                    d7 = 6.0 * d12 < 1.0 ? d9 + (d8 - d9) * 6.0 * d12 : (2.0 * d12 < 1.0 ? d8 : (3.0 * d12 < 2.0 ? d9 + (d8 - d9) * (0.6666666666666666 - d12) * 6.0 : d9));
                }
                int n5 = (int)(d5 * 256.0);
                int n6 = (int)(d6 * 256.0);
                int n7 = (int)(d7 * 256.0);
                int n8 = n7 + (n6 << 8) + (n5 << 16);
                if ((n8 = SceneTileModel.method4006(n8, d)) == 0) {
                    n8 = 1;
                }
                SceneTileModel.Rasterizer3D_colorPalette[n3++] = n8;
            }
            ++n4;
        }
        return;
    }

    @ObfuscatedName(value="ad")
    static int method4006(int n, double d) {
        field1956 = d;
        double d2 = (double)(n >> 16) / 256.0;
        double d3 = (double)(n >> 8 & 0xFF) / 256.0;
        double d4 = (double)(n & 0xFF) / 256.0;
        d2 = Math.pow(d2, d);
        d3 = Math.pow(d3, d);
        d4 = Math.pow(d4, d);
        int n2 = (int)(d2 * 256.0);
        int n3 = (int)(d3 * 256.0);
        int n4 = (int)(d4 * 256.0);
        return n4 + (n3 << 8) + (n2 << 16);
    }

    @ObfuscatedName(value="an")
    public static double method4068() {
        return field1956;
    }

    @ObfuscatedName(value="ae")
    static int method4008() {
        return SceneTileModel.field1957.field2301;
    }

    @ObfuscatedName(value="ax")
    static int method4048() {
        return SceneTileModel.field1957.field2302;
    }

    @ObfuscatedName(value="at")
    static int method4088() {
        return SceneTileModel.field1957.field2304;
    }

    @ObfuscatedName(value="ac")
    static int method4078() {
        return SceneTileModel.field1957.field2306;
    }

    @ObfuscatedName(value="au")
    static int method4012() {
        return SceneTileModel.field1957.field2294;
    }

    @ObfuscatedName(value="as")
    static int method4013() {
        return SceneTileModel.field1957.field2307;
    }

    @ObfuscatedName(value="aq")
    public static int method4061() {
        return SceneTileModel.field1957.field2289;
    }

    @ObfuscatedName(value="af")
    static int method4015() {
        return SceneTileModel.field1957.field2303;
    }

    @ObfuscatedName(value="aa")
    public static void method4016(int[] nArray, int n, int n2, float[] fArray) {
        if (fArray == null && field1958 == field1951) {
            field1958 = field1959;
        }
        field1958.method4133(nArray, n, n2, fArray);
    }

    @ObfuscatedName(value="ak")
    public static void method4071() {
        SceneTileModel.Rasterizer3D_setClip(Rasterizer2D.Rasterizer2D_xClipStart, Rasterizer2D.Rasterizer2D_yClipStart, Rasterizer2D.Rasterizer2D_xClipEnd, Rasterizer2D.Rasterizer2D_yClipEnd);
    }

    @ObfuscatedName(value="al")
    @Export(value="Rasterizer3D_setClip")
    static void Rasterizer3D_setClip(int n, int n2, int n3, int n4) {
        SceneTileModel.field1957.field2303 = n3 - n;
        SceneTileModel.field1957.field2305 = n4 - n2;
        SceneTileModel.method4023();
        if (SceneTileModel.field1957.Rasterizer3D_rowOffsets.length < SceneTileModel.field1957.field2305) {
            SceneTileModel.field1957.Rasterizer3D_rowOffsets = new int[class357.method7049(SceneTileModel.field1957.field2305)];
        }
        int n5 = n + Rasterizer2D.Rasterizer2D_width * n2;
        int n6 = 0;
        while (n6 < SceneTileModel.field1957.field2305) {
            SceneTileModel.field1957.Rasterizer3D_rowOffsets[n6] = n5;
            n5 += Rasterizer2D.Rasterizer2D_width;
            ++n6;
        }
        return;
    }

    @ObfuscatedName(value="av")
    public static void method4023() {
        field1957.method4740();
    }

    @ObfuscatedName(value="ag")
    public static void method4020(int n, int n2) {
        int n3 = SceneTileModel.field1957.Rasterizer3D_rowOffsets[0];
        int n4 = n3 / Rasterizer2D.Rasterizer2D_width;
        int n5 = n3 - n4 * Rasterizer2D.Rasterizer2D_width;
        field1957.method4737(n, n5, n2, n4);
    }

    @ObfuscatedName(value="aw")
    public static void method4021(int n, int n2, int n3) {
        field1957.method4738(n, n2, n3);
    }

    @ObfuscatedName(value="ai")
    static void method4022(int n, int n2, int n3, int n4, int n5, int n6, float f, float f2, float f3, int n7, int n8, int n9) {
        field1958.vmethod4753(n, n2, n3, n4, n5, n6, f, f2, f3, n7, n8, n9);
    }

    @ObfuscatedName(value="ar")
    public static void method4009(int n, int n2, int n3, int n4, int n5, int n6, float f, float f2, float f3, int n7) {
        field1958.vmethod4755(n, n2, n3, n4, n5, n6, f, f2, f3, n7);
    }

    @ObfuscatedName(value="am")
    static void method4024(int n, int n2, int n3, int n4, int n5, int n6, float f, float f2, float f3, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19) {
        field1958.vmethod4801(n, n2, n3, n4, n5, n6, f, f2, f3, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19);
    }

    @ObfuscatedName(value="ap")
    static void method4011(int n, int n2, int n3, int n4, int n5, int n6, float f, float f2, float f3, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19) {
        field1958.vmethod4764(n, n2, n3, n4, n5, n6, f, f2, f3, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19);
    }

    @ObfuscatedName(value="ab")
    static void method4026(int n, int n2, int n3, int n4, int n5, int n6, float f, float f2, float f3, int n7, int n8, int n9, byte by, byte by2, byte by3, byte by4) {
        field1958.method4134(n, n2, n3, n4, n5, n6, f, f2, f3, n7, n8, n9, by, by2, by3, by4);
    }

    @ObfuscatedName(value="aj")
    static void method4027(int n, int n2, int n3, int n4, int n5, int n6, float f, float f2, float f3, int n7, byte by, byte by2, byte by3, byte by4) {
        field1958.method4152(n, n2, n3, n4, n5, n6, f, f2, f3, n7, by, by2, by3, by4);
    }
}

