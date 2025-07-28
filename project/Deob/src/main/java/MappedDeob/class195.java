/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ht")
public abstract class class195 {
    class195() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lhs;IIIIJ)V")
    abstract void vmethod4503(Renderable var1, int var2, int var3, int var4, int var5, long var6);

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lhj;Lhz;IIII)V", garbageValue="54431755")
    abstract void vmethod4504(class187 var1, SceneTilePaint var2, int var3, int var4, int var5);

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lhj;Lho;IIB)V", garbageValue="-59")
    abstract void vmethod4516(class187 var1, class196 var2, int var3, int var4);

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lhj;Lhz;IIIIIIIIIIIIIII)V", garbageValue="101446402")
    void method4506(class187 class1872, SceneTilePaint sceneTilePaint, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14) {
        int n15;
        int n16;
        int n17 = SceneTileModel.method4008() + n3 * SceneTileModel.method4061() / n11;
        int n18 = SceneTileModel.method4048() + n7 * SceneTileModel.method4061() / n11;
        int n19 = SceneTileModel.method4008() + n4 * SceneTileModel.method4061() / n12;
        int n20 = SceneTileModel.method4048() + n8 * SceneTileModel.method4061() / n12;
        int n21 = SceneTileModel.method4008() + n5 * SceneTileModel.method4061() / n13;
        int n22 = SceneTileModel.method4048() + n9 * SceneTileModel.method4061() / n13;
        int n23 = SceneTileModel.method4008() + n6 * SceneTileModel.method4061() / n14;
        int n24 = SceneTileModel.method4048() + n10 * SceneTileModel.method4061() / n14;
        float f = class20.method298(n11);
        float f2 = class20.method298(n12);
        float f3 = class20.method298(n13);
        float f4 = class20.method298(n14);
        SceneTileModel.field1957.field2291 = 0;
        if ((n20 - n24) * (n21 - n23) - (n19 - n23) * (n22 - n24) > 0) {
            SceneTileModel.field1957.field2308 = false;
            n16 = SceneTileModel.method4015();
            if (n21 < 0 || n23 < 0 || n19 < 0 || n21 > n16 || n23 > n16 || n19 > n16) {
                SceneTileModel.field1957.field2308 = true;
            }
            if (class187.containsBounds(class1872.field2065, class1872.field2049, n22, n24, n20, n21, n23, n19)) {
                class1872.field2050 = n;
                class1872.field2051 = n2;
                class1872.field2067 = class223.method5043(class1872.field2065, class1872.field2049, n21, n23, n19, n22, n24, n20, f3, f4, f2);
            }
            if (sceneTilePaint.texture != -1) {
                if (class187.Scene_isLowDetail) {
                    n15 = SceneTileModel.field1957.Rasterizer3D_textureLoader.getAverageTextureRGB(sceneTilePaint.texture);
                    SceneTileModel.method4022(n22, n24, n20, n21, n23, n19, f3, f4, f2, class187.method4239(n15, sceneTilePaint.neColor), class187.method4239(n15, sceneTilePaint.nwColor), class187.method4239(n15, sceneTilePaint.seColor));
                } else if (sceneTilePaint.isFlat) {
                    SceneTileModel.method4011(n22, n24, n20, n21, n23, n19, f3, f4, f2, sceneTilePaint.neColor, sceneTilePaint.nwColor, sceneTilePaint.seColor, n3, n4, n6, n7, n8, n10, n11, n12, n14, sceneTilePaint.texture);
                } else {
                    SceneTileModel.method4011(n22, n24, n20, n21, n23, n19, f3, f4, f2, sceneTilePaint.neColor, sceneTilePaint.nwColor, sceneTilePaint.seColor, n5, n6, n4, n9, n10, n8, n13, n14, n12, sceneTilePaint.texture);
                }
            } else if (sceneTilePaint.neColor != 12345678) {
                SceneTileModel.method4022(n22, n24, n20, n21, n23, n19, f3, f4, f2, sceneTilePaint.neColor, sceneTilePaint.nwColor, sceneTilePaint.seColor);
            }
        }
        if ((n24 - n20) * (n17 - n19) - (n18 - n20) * (n23 - n19) > 0) {
            SceneTileModel.field1957.field2308 = false;
            n16 = SceneTileModel.method4015();
            if (n17 < 0 || n19 < 0 || n23 < 0 || n17 > n16 || n19 > n16 || n23 > n16) {
                SceneTileModel.field1957.field2308 = true;
            }
            if (class187.containsBounds(class1872.field2065, class1872.field2049, n18, n20, n24, n17, n19, n23)) {
                class1872.field2050 = n;
                class1872.field2051 = n2;
                class1872.field2067 = class223.method5043(class1872.field2065, class1872.field2049, n17, n19, n23, n18, n20, n24, f, f2, f4);
            }
            if (sceneTilePaint.texture != -1) {
                if (class187.Scene_isLowDetail) {
                    n15 = SceneTileModel.field1957.Rasterizer3D_textureLoader.getAverageTextureRGB(sceneTilePaint.texture);
                    SceneTileModel.method4022(n18, n20, n24, n17, n19, n23, f, f2, f4, class187.method4239(n15, sceneTilePaint.swColor), class187.method4239(n15, sceneTilePaint.seColor), class187.method4239(n15, sceneTilePaint.nwColor));
                } else {
                    SceneTileModel.method4011(n18, n20, n24, n17, n19, n23, f, f2, f4, sceneTilePaint.swColor, sceneTilePaint.seColor, sceneTilePaint.nwColor, n3, n4, n6, n7, n8, n10, n11, n12, n14, sceneTilePaint.texture);
                }
            } else if (sceneTilePaint.swColor != 12345678) {
                SceneTileModel.method4022(n18, n20, n24, n17, n19, n23, f, f2, f4, sceneTilePaint.swColor, sceneTilePaint.seColor, sceneTilePaint.nwColor);
            }
        }
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Lhj;Lho;III)V", garbageValue="-950087355")
    void method4507(class187 class1872, class196 class1962, int n, int n2) {
        SceneTileModel.field1957.field2291 = 0;
        int n3 = class1962.field2164.length;
        int n4 = 0;
        while (n4 < n3) {
            int n5 = class1962.field2164[n4];
            int n6 = class1962.field2165[n4];
            int n7 = class1962.field2166[n4];
            int n8 = class196.field2173[n5];
            int n9 = class196.field2173[n6];
            int n10 = class196.field2173[n7];
            int n11 = class196.field2159[n5];
            int n12 = class196.field2159[n6];
            int n13 = class196.field2159[n7];
            float f = class196.field2174[n5];
            float f2 = class196.field2174[n6];
            float f3 = class196.field2174[n7];
            if ((n8 - n9) * (n13 - n12) - (n10 - n9) * (n11 - n12) > 0) {
                SceneTileModel.field1957.field2308 = false;
                int n14 = SceneTileModel.method4015();
                if (n8 < 0 || n9 < 0 || n10 < 0 || n8 > n14 || n9 > n14 || n10 > n14) {
                    SceneTileModel.field1957.field2308 = true;
                }
                if (class187.containsBounds(class1872.field2065, class1872.field2049, n11, n12, n13, n8, n9, n10)) {
                    class1872.field2050 = n;
                    class1872.field2051 = n2;
                    class1872.field2067 = class223.method5043(class1872.field2065, class1872.field2049, n8, n9, n10, n11, n12, n13, f, f2, f3);
                }
                if (class1962.field2167 != null && class1962.field2167[n4] != -1) {
                    if (class187.Scene_isLowDetail) {
                        int n15 = SceneTileModel.field1957.Rasterizer3D_textureLoader.getAverageTextureRGB(class1962.field2167[n4]);
                        SceneTileModel.method4022(n11, n12, n13, n8, n9, n10, f, f2, f3, class187.method4239(n15, class1962.field2161[n4]), class187.method4239(n15, class1962.field2162[n4]), class187.method4239(n15, class1962.field2175[n4]));
                    } else if (class1962.field2168) {
                        SceneTileModel.method4011(n11, n12, n13, n8, n9, n10, f, f2, f3, class1962.field2161[n4], class1962.field2162[n4], class1962.field2175[n4], class196.field2178[0], class196.field2178[1], class196.field2178[3], class196.field2177[0], class196.field2177[1], class196.field2177[3], class196.field2158[0], class196.field2158[1], class196.field2158[3], class1962.field2167[n4]);
                    } else {
                        SceneTileModel.method4011(n11, n12, n13, n8, n9, n10, f, f2, f3, class1962.field2161[n4], class1962.field2162[n4], class1962.field2175[n4], class196.field2178[n5], class196.field2178[n6], class196.field2178[n7], class196.field2177[n5], class196.field2177[n6], class196.field2177[n7], class196.field2158[n5], class196.field2158[n6], class196.field2158[n7], class1962.field2167[n4]);
                    }
                } else if (class1962.field2161[n4] != 12345678) {
                    SceneTileModel.method4022(n11, n12, n13, n8, n9, n10, f, f2, f3, class1962.field2161[n4], class1962.field2162[n4], class1962.field2175[n4]);
                }
            }
            ++n4;
        }
        return;
    }
}

