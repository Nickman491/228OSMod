/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="hv")
@Implements(value="Model")
public class Model
extends Renderable {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lhv;")
    @Export(value="Model_sharedSequenceModel")
    static Model Model_sharedSequenceModel = new Model();
    @ObfuscatedName(value="ah")
    @Export(value="Model_sharedSequenceModelFaceAlphas")
    static byte[] Model_sharedSequenceModelFaceAlphas = new byte[1];
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lhv;")
    @Export(value="Model_sharedSpotAnimationModel")
    static Model Model_sharedSpotAnimationModel = new Model();
    @ObfuscatedName(value="ao")
    @Export(value="Model_sharedSpotAnimationModelFaceAlphas")
    static byte[] Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lqe;")
    static class428 field2242 = new class428();
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lqe;")
    static class428 field2189 = new class428();
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lqe;")
    static class428 field2190 = new class428();
    @ObfuscatedName(value="bg")
    static boolean[] field2204 = new boolean[6500];
    @ObfuscatedName(value="bc")
    static boolean[] field2224 = new boolean[6500];
    @ObfuscatedName(value="bv")
    @Export(value="modelViewportXs")
    static int[] modelViewportXs = new int[6500];
    @ObfuscatedName(value="bq")
    @Export(value="modelViewportYs")
    static int[] modelViewportYs = new int[6500];
    @ObfuscatedName(value="ba")
    static float[] field2187 = new float[6500];
    @ObfuscatedName(value="bk")
    static int[] field2247 = new int[6500];
    @ObfuscatedName(value="bs")
    static int[] field2229 = new int[6500];
    @ObfuscatedName(value="bj")
    static int[] field2230 = new int[6500];
    @ObfuscatedName(value="bo")
    static int[] field2231 = new int[6500];
    @ObfuscatedName(value="bn")
    static char[] field2233 = new char[6000];
    @ObfuscatedName(value="br")
    static char[][] field2201 = new char[6000][512];
    @ObfuscatedName(value="bl")
    static int[] field2235 = new int[12];
    @ObfuscatedName(value="cb")
    static int[][] field2234 = new int[12][2000];
    @ObfuscatedName(value="cn")
    static int[] field2209 = new int[2000];
    @ObfuscatedName(value="cc")
    static int[] field2238 = new int[2000];
    @ObfuscatedName(value="co")
    static int[] field2256 = new int[12];
    @ObfuscatedName(value="ca")
    static int[] field2240 = new int[10];
    @ObfuscatedName(value="cg")
    static int[] field2258 = new int[10];
    @ObfuscatedName(value="cp")
    static int[] field2227 = new int[10];
    @ObfuscatedName(value="cz")
    @Export(value="Model_transformTempX")
    static int Model_transformTempX;
    @ObfuscatedName(value="cy")
    static float[] field2243;
    @ObfuscatedName(value="cu")
    @Export(value="Model_transformTempY")
    static int Model_transformTempY;
    @ObfuscatedName(value="cq")
    @Export(value="Model_transformTempZ")
    static int Model_transformTempZ;
    @ObfuscatedName(value="cf")
    static boolean field2215;
    @ObfuscatedName(value="cl")
    static int[] field2250;
    @ObfuscatedName(value="cw")
    static int[] field2251;
    @ObfuscatedName(value="cj")
    static int[] field2213;
    @ObfuscatedName(value="cx")
    static int[] field2259;
    @ObfuscatedName(value="cv")
    static final float field2255;
    @ObfuscatedName(value="ch")
    static float[] field2261;
    @ObfuscatedName(value="ax")
    @Export(value="verticesCount")
    public int verticesCount = 0;
    @ObfuscatedName(value="at")
    @Export(value="verticesX")
    int[] verticesX;
    @ObfuscatedName(value="ac")
    @Export(value="verticesY")
    int[] verticesY;
    @ObfuscatedName(value="au")
    @Export(value="verticesZ")
    int[] verticesZ;
    @ObfuscatedName(value="as")
    @Export(value="indicesCount")
    public int indicesCount = 0;
    @ObfuscatedName(value="aq")
    @Export(value="indices1")
    int[] indices1;
    @ObfuscatedName(value="af")
    @Export(value="indices2")
    int[] indices2;
    @ObfuscatedName(value="aa")
    @Export(value="indices3")
    int[] indices3;
    @ObfuscatedName(value="ak")
    @Export(value="faceColors1")
    int[] faceColors1;
    @ObfuscatedName(value="al")
    @Export(value="faceColors2")
    int[] faceColors2;
    @ObfuscatedName(value="av")
    @Export(value="faceColors3")
    int[] faceColors3;
    @ObfuscatedName(value="ag")
    @Export(value="faceRenderPriorities")
    byte[] faceRenderPriorities;
    @ObfuscatedName(value="aw")
    @Export(value="faceAlphas")
    byte[] faceAlphas;
    @ObfuscatedName(value="ai")
    byte[] field2237;
    @ObfuscatedName(value="ar")
    @Export(value="faceTextures")
    short[] faceTextures;
    @ObfuscatedName(value="am")
    public byte field2212 = 0;
    @ObfuscatedName(value="ap")
    public int field2207 = 0;
    @ObfuscatedName(value="ab")
    int[] field2208;
    @ObfuscatedName(value="aj")
    int[] field2241;
    @ObfuscatedName(value="bu")
    int[] field2210;
    @ObfuscatedName(value="bh")
    @Export(value="vertexLabels")
    int[][] vertexLabels;
    @ObfuscatedName(value="bw")
    @Export(value="faceLabelsAlpha")
    int[][] faceLabelsAlpha;
    @ObfuscatedName(value="bb")
    int[][] field2260;
    @ObfuscatedName(value="bx")
    int[][] field2214;
    @ObfuscatedName(value="bd")
    @Export(value="isSingleTile")
    public boolean isSingleTile = false;
    @ObfuscatedName(value="bi")
    @Export(value="boundsType")
    int boundsType;
    @ObfuscatedName(value="bz")
    @Export(value="bottomY")
    int bottomY;
    @ObfuscatedName(value="bt")
    @Export(value="xzRadius")
    int xzRadius;
    @ObfuscatedName(value="bf")
    @Export(value="diameter")
    int diameter;
    @ObfuscatedName(value="by")
    @Export(value="radius")
    int radius;
    @ObfuscatedName(value="bm")
    @ObfuscatedSignature(descriptor="Lhr;")
    class189 field2221;
    @ObfuscatedName(value="ck")
    public byte field2196;
    @ObfuscatedName(value="cs")
    public byte field2257;
    @ObfuscatedName(value="cm")
    public byte field2206;
    @ObfuscatedName(value="ce")
    @Export(value="overrideAmount")
    public byte overrideAmount;
    @ObfuscatedName(value="cr")
    public short field2193;

    static {
        field2243 = new float[10];
        field2215 = true;
        field2250 = SceneTileModel.field1954;
        field2251 = SceneTileModel.Rasterizer3D_cosine;
        field2213 = SceneTileModel.Rasterizer3D_colorPalette;
        field2259 = SceneTileModel.field1953;
        field2255 = class20.method298(50);
        field2261 = new float[3];
    }

    Model() {
    }

    public Model(int n, int n2, int n3, byte by) {
        this.method4535(n, n2, n3);
        this.field2212 = by;
        this.verticesCount = 0;
        this.indicesCount = 0;
        this.field2207 = 0;
    }

    @ObfuscatedSignature(descriptor="(Lhv;)V")
    Model(Model model) {
        this.verticesCount = model.verticesCount;
        this.indicesCount = model.indicesCount;
        this.field2207 = model.field2207;
        this.verticesX = model.verticesX;
        this.verticesY = model.verticesY;
        this.verticesZ = model.verticesZ;
        this.indices1 = model.indices1;
        this.indices2 = model.indices2;
        this.indices3 = model.indices3;
        this.faceColors1 = model.faceColors1;
        this.faceColors2 = model.faceColors2;
        this.faceColors3 = model.faceColors3;
        this.faceRenderPriorities = model.faceRenderPriorities;
        this.faceAlphas = model.faceAlphas;
        this.field2237 = model.field2237;
        this.faceTextures = model.faceTextures;
        this.field2212 = model.field2212;
        this.field2208 = model.field2208;
        this.field2241 = model.field2241;
        this.field2210 = model.field2210;
        this.vertexLabels = model.vertexLabels;
        this.faceLabelsAlpha = model.faceLabelsAlpha;
        this.isSingleTile = model.isSingleTile;
    }

    @ObfuscatedSignature(descriptor="([Lhv;I)V")
    public Model(Model[] modelArray, int n) {
        this.verticesCount = 0;
        this.indicesCount = 0;
        this.field2207 = 0;
        this.field2212 = (byte)-1;
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                this.method4535(this.verticesCount, this.indicesCount, this.field2207);
                this.verticesCount = 0;
                this.indicesCount = 0;
                this.field2207 = 0;
                n2 = 0;
                while (true) {
                    if (n2 >= n) {
                        return;
                    }
                    this.method4553(modelArray[n2]);
                    ++n2;
                }
            }
            Model model = modelArray[n2];
            if (model != null) {
                this.verticesCount += model.verticesCount;
                this.indicesCount += model.indicesCount;
                this.field2207 += model.field2207;
                if (this.field2212 == -1) {
                    this.field2212 = model.field2212;
                }
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="ay")
    void method4535(int n, int n2, int n3) {
        this.verticesX = new int[n];
        this.verticesY = new int[n];
        this.verticesZ = new int[n];
        this.indices1 = new int[n2];
        this.indices2 = new int[n2];
        this.indices3 = new int[n2];
        this.faceColors1 = new int[n2];
        this.faceColors2 = new int[n2];
        this.faceColors3 = new int[n2];
        if (n3 > 0) {
            this.field2208 = new int[n3];
            this.field2241 = new int[n3];
            this.field2210 = new int[n3];
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lhv;)V")
    void method4536(Model model) {
        int n = this.indices1.length;
        if (this.faceRenderPriorities == null && (model.faceRenderPriorities != null || this.field2212 != model.field2212)) {
            this.faceRenderPriorities = new byte[n];
            Arrays.fill(this.faceRenderPriorities, this.field2212);
        }
        if (this.faceAlphas == null && model.faceAlphas != null) {
            this.faceAlphas = new byte[n];
            Arrays.fill(this.faceAlphas, (byte)0);
        }
        if (this.faceTextures == null && model.faceTextures != null) {
            this.faceTextures = new short[n];
            Arrays.fill(this.faceTextures, (short)-1);
        }
        if (this.field2237 == null && model.field2237 != null) {
            this.field2237 = new byte[n];
            Arrays.fill(this.field2237, (byte)-1);
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lhv;)V")
    public void method4553(Model model) {
        if (model != null) {
            this.method4536(model);
            int n = 0;
            while (true) {
                if (n >= model.indicesCount) {
                    n = 0;
                    while (true) {
                        if (n >= model.field2207) {
                            n = 0;
                            while (true) {
                                if (n >= model.verticesCount) {
                                    return;
                                }
                                this.verticesX[this.verticesCount] = model.verticesX[n];
                                this.verticesY[this.verticesCount] = model.verticesY[n];
                                this.verticesZ[this.verticesCount] = model.verticesZ[n];
                                ++this.verticesCount;
                                ++n;
                            }
                        }
                        this.field2208[this.field2207] = this.verticesCount + model.field2208[n];
                        this.field2241[this.field2207] = this.verticesCount + model.field2241[n];
                        this.field2210[this.field2207] = this.verticesCount + model.field2210[n];
                        ++this.field2207;
                        ++n;
                    }
                }
                this.indices1[this.indicesCount] = this.verticesCount + model.indices1[n];
                this.indices2[this.indicesCount] = this.verticesCount + model.indices2[n];
                this.indices3[this.indicesCount] = this.verticesCount + model.indices3[n];
                this.faceColors1[this.indicesCount] = model.faceColors1[n];
                this.faceColors2[this.indicesCount] = model.faceColors2[n];
                this.faceColors3[this.indicesCount] = model.faceColors3[n];
                if (this.faceRenderPriorities != null) {
                    byte by = this.faceRenderPriorities[this.indicesCount] = model.faceRenderPriorities != null ? model.faceRenderPriorities[n] : model.field2212;
                }
                if (this.faceAlphas != null && model.faceAlphas != null) {
                    this.faceAlphas[this.indicesCount] = model.faceAlphas[n];
                }
                if (this.faceTextures != null) {
                    int n2 = this.faceTextures[this.indicesCount] = model.faceTextures != null ? model.faceTextures[n] : -1;
                }
                if (this.field2237 != null) {
                    this.field2237[this.indicesCount] = model.field2237 == null || model.field2237[n] == -1 ? -1 : (byte)(model.field2237[n] + this.field2207);
                }
                ++this.indicesCount;
                ++n;
            }
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="([[IIIIZI)Lhv;")
    @Export(value="contourGround")
    public Model contourGround(int[][] nArray, int n, int n2, int n3, boolean bl, int n4) {
        this.calculateBoundsCylinder();
        int n5 = n - this.xzRadius;
        int n6 = n + this.xzRadius;
        int n7 = n3 - this.xzRadius;
        int n8 = n3 + this.xzRadius;
        if (n5 >= 0 && n6 + 128 >> 7 < nArray.length && n7 >= 0 && n8 + 128 >> 7 < nArray[0].length) {
            Model model;
            n6 = n6 + 127 >> 7;
            n8 = n8 + 127 >> 7;
            if (n2 == nArray[n5 >>= 7][n7 >>= 7] && n2 == nArray[n6][n7] && n2 == nArray[n5][n8] && n2 == nArray[n6][n8]) {
                return this;
            }
            if (!bl) {
                model = this;
            } else {
                model = new Model(this);
                model.verticesY = new int[model.verticesCount];
            }
            if (n4 != 0) {
                for (int i = 0; i < model.verticesCount; ++i) {
                    int n9 = (-this.verticesY[i] << 16) / this.height;
                    if (n9 >= n4) {
                        model.verticesY[i] = this.verticesY[i];
                        continue;
                    }
                    int n10 = n + this.verticesX[i];
                    int n11 = n3 + this.verticesZ[i];
                    int n12 = n10 & 0x7F;
                    int n13 = n11 & 0x7F;
                    int n14 = n10 >> 7;
                    int n15 = n11 >> 7;
                    int n16 = nArray[n14][n15] * (128 - n12) + nArray[n14 + 1][n15] * n12 >> 7;
                    int n17 = nArray[n14][n15 + 1] * (128 - n12) + n12 * nArray[n14 + 1][n15 + 1] >> 7;
                    int n18 = n16 * (128 - n13) + n17 * n13 >> 7;
                    model.verticesY[i] = (n4 - n9) * (n18 - n2) / n4 + this.verticesY[i];
                }
            } else {
                for (int i = 0; i < model.verticesCount; ++i) {
                    int n19 = n + this.verticesX[i];
                    int n20 = n3 + this.verticesZ[i];
                    int n21 = n19 & 0x7F;
                    int n22 = n20 & 0x7F;
                    int n23 = n19 >> 7;
                    int n24 = n20 >> 7;
                    int n25 = nArray[n23][n24] * (128 - n21) + nArray[n23 + 1][n24] * n21 >> 7;
                    int n26 = nArray[n23][n24 + 1] * (128 - n21) + n21 * nArray[n23 + 1][n24 + 1] >> 7;
                    int n27 = n25 * (128 - n22) + n26 * n22 >> 7;
                    model.verticesY[i] = n27 + this.verticesY[i] - n2;
                }
            }
            model.resetBounds();
            return model;
        }
        return this;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Z)Lhv;")
    @Export(value="toSharedSequenceModel")
    public Model toSharedSequenceModel(boolean bl) {
        if (!bl && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
            Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
        }
        return this.buildSharedModel(bl, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Z)Lhv;")
    public Model method4652(boolean bl) {
        if (!bl && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
            Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
        }
        return this.buildSharedModel(bl, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(ZLhv;[B)Lhv;")
    @Export(value="buildSharedModel")
    Model buildSharedModel(boolean bl, Model model, byte[] byArray) {
        model.verticesCount = this.verticesCount;
        model.indicesCount = this.indicesCount;
        model.field2207 = this.field2207;
        if (model.verticesX == null || model.verticesX.length < this.verticesCount) {
            model.verticesX = new int[this.verticesCount + 100];
            model.verticesY = new int[this.verticesCount + 100];
            model.verticesZ = new int[this.verticesCount + 100];
        }
        int n = 0;
        while (true) {
            if (n >= this.verticesCount) {
                if (bl) {
                    model.faceAlphas = this.faceAlphas;
                } else {
                    model.faceAlphas = byArray;
                    if (this.faceAlphas != null) {
                        for (n = 0; n < this.indicesCount; ++n) {
                            model.faceAlphas[n] = this.faceAlphas[n];
                        }
                    } else {
                        for (n = 0; n < this.indicesCount; ++n) {
                            model.faceAlphas[n] = 0;
                        }
                    }
                }
                model.indices1 = this.indices1;
                model.indices2 = this.indices2;
                model.indices3 = this.indices3;
                model.faceColors1 = this.faceColors1;
                model.faceColors2 = this.faceColors2;
                model.faceColors3 = this.faceColors3;
                model.faceRenderPriorities = this.faceRenderPriorities;
                model.field2237 = this.field2237;
                model.faceTextures = this.faceTextures;
                model.field2212 = this.field2212;
                model.field2208 = this.field2208;
                model.field2241 = this.field2241;
                model.field2210 = this.field2210;
                model.vertexLabels = this.vertexLabels;
                model.faceLabelsAlpha = this.faceLabelsAlpha;
                model.field2260 = this.field2260;
                model.field2214 = this.field2214;
                model.isSingleTile = this.isSingleTile;
                model.resetBounds();
                model.overrideAmount = 0;
                return model;
            }
            model.verticesX[n] = this.verticesX[n];
            model.verticesY[n] = this.verticesY[n];
            model.verticesZ[n] = this.verticesZ[n];
            ++n;
        }
    }

    @ObfuscatedName(value="ax")
    @Export(value="calculateBoundingBox")
    void calculateBoundingBox(int n) {
        class189 class1892 = this.method4543(n);
        if (class1892 != null) {
            return;
        }
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = field2251[n];
        int n9 = field2250[n];
        int n10 = 0;
        while (true) {
            int n11;
            if (n10 >= this.verticesCount) {
                class1892 = new class189(n, (n5 + n2) / 2, (n6 + n3) / 2, (n7 + n4) / 2, (n5 - n2 + 1) / 2, (n6 - n3 + 1) / 2, (n7 - n4 + 1) / 2);
                n10 = 32;
                if (class1892.field2111 < 32) {
                    class1892.field2111 = 32;
                }
                if (class1892.field2110 < 32) {
                    class1892.field2110 = 32;
                }
                if (this.isSingleTile) {
                    n11 = 8;
                    class1892.field2111 += 8;
                    class1892.field2110 += 8;
                }
                class1892.field2112 = this.field2221;
                this.field2221 = class1892;
                return;
            }
            int n12 = this.verticesX[n10];
            int n13 = this.verticesZ[n10];
            int n14 = n11 = n12 * n8 + n9 * n13 >> 16;
            int n15 = this.verticesY[n10];
            int n16 = class499.method9540(this.verticesX[n10], this.verticesZ[n10], n8, n9);
            if (n14 < n2) {
                n2 = n14;
            }
            if (n14 > n5) {
                n5 = n14;
            }
            if (n15 < n3) {
                n3 = n15;
            }
            if (n15 > n6) {
                n6 = n15;
            }
            if (n16 < n4) {
                n4 = n16;
            }
            if (n16 > n7) {
                n7 = n16;
            }
            ++n10;
        }
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)Lhr;")
    class189 method4543(int n) {
        class189 class1892 = this.field2221;
        while (true) {
            if (class1892 == null) {
                return null;
            }
            if (class1892.field2114 == n) break;
            class1892 = class1892.field2112;
        }
        return class1892;
    }

    @ObfuscatedName(value="ac")
    @Export(value="calculateBoundsCylinder")
    public void calculateBoundsCylinder() {
        if (this.boundsType == 1) {
            return;
        }
        this.boundsType = 1;
        this.height = 0;
        this.bottomY = 0;
        this.xzRadius = 0;
        int n = 0;
        while (true) {
            int n2;
            if (n >= this.verticesCount) {
                this.xzRadius = (int)(Math.sqrt(this.xzRadius) + 0.99);
                this.radius = (int)(Math.sqrt(this.xzRadius * this.xzRadius + this.height * this.height) + 0.99);
                this.diameter = this.radius + (int)(Math.sqrt(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY) + 0.99);
                return;
            }
            int n3 = this.verticesX[n];
            int n4 = this.verticesY[n];
            int n5 = this.verticesZ[n];
            if (-n4 > this.height) {
                this.height = -n4;
            }
            if (n4 > this.bottomY) {
                this.bottomY = n4;
            }
            if ((n2 = n3 * n3 + n5 * n5) > this.xzRadius) {
                this.xzRadius = n2;
            }
            ++n;
        }
    }

    @ObfuscatedName(value="au")
    void method4544() {
        if (this.boundsType == 2) {
            return;
        }
        this.boundsType = 2;
        this.xzRadius = 0;
        int n = 0;
        while (true) {
            if (n >= this.verticesCount) {
                this.radius = this.xzRadius = (int)(Math.sqrt(this.xzRadius) + 0.99);
                this.diameter = this.xzRadius + this.xzRadius;
                return;
            }
            int n2 = this.verticesX[n];
            int n3 = this.verticesY[n];
            int n4 = this.verticesZ[n];
            int n5 = n2 * n2 + n4 * n4 + n3 * n3;
            if (n5 > this.xzRadius) {
                this.xzRadius = n5;
            }
            ++n;
        }
    }

    @ObfuscatedName(value="aa")
    public int method4591() {
        this.calculateBoundsCylinder();
        return this.xzRadius;
    }

    @ObfuscatedName(value="ak")
    @Export(value="resetBounds")
    public void resetBounds() {
        this.boundsType = 0;
        this.field2221 = null;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(Lhb;I)V")
    @Export(value="animate")
    public void animate(Frames frames, int n) {
        if (this.vertexLabels == null) {
            return;
        }
        if (n == -1) {
            return;
        }
        Animation animation = frames.frames[n];
        Skeleton skeleton = animation.skeleton;
        Model_transformTempX = 0;
        Model_transformTempY = 0;
        Model_transformTempZ = 0;
        int n2 = 0;
        while (true) {
            if (n2 >= animation.transformCount) {
                this.resetBounds();
                return;
            }
            int n3 = animation.transformSkeletonLabels[n2];
            this.transform(skeleton.transformTypes[n3], skeleton.labels[n3], animation.transformXs[n2], animation.transformYs[n2], animation.transformZs[n2]);
            ++n2;
        }
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(Lfl;I)V")
    public void method4548(class144 class1442, int n) {
        Skeleton skeleton = class1442.field1641;
        class184 class1842 = skeleton.method4168();
        if (class1842 != null) {
            skeleton.method4168().method4110(class1442, n);
            this.method4550(skeleton.method4168(), class1442.method3529());
        }
        if (class1442.method3535()) {
            this.method4537(class1442, n);
        }
        this.resetBounds();
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(Lfl;I)V")
    void method4537(class144 class1442, int n) {
        Skeleton skeleton = class1442.field1641;
        int n2 = 0;
        while (n2 < skeleton.count) {
            int n3 = skeleton.transformTypes[n2];
            if (n3 == 5 && class1442.field1639 != null && class1442.field1639[n2] != null && class1442.field1639[n2][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
                class136 class1362 = class1442.field1639[n2][0];
                block1: for (int n4 : skeleton.labels[n2]) {
                    if (n4 >= this.faceLabelsAlpha.length) continue;
                    int[] nArray = this.faceLabelsAlpha[n4];
                    int n5 = 0;
                    while (true) {
                        if (n5 >= nArray.length) {
                            continue block1;
                        }
                        int n6 = nArray[n5];
                        int n7 = (int)((float)(this.faceAlphas[n6] & 0xFF) + class1362.method3454(n) * 255.0f);
                        if (n7 < 0) {
                            n7 = 0;
                        } else if (n7 > 255) {
                            n7 = 255;
                        }
                        this.faceAlphas[n6] = (byte)n7;
                        ++n5;
                    }
                }
            }
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(Lhn;I)V")
    void method4550(class184 class1842, int n) {
        this.method4538(class1842, n);
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lhb;ILhb;I[I)V")
    @Export(value="animate2")
    public void animate2(Frames frames, int n, Frames frames2, int n2, int[] nArray) {
        if (n == -1) {
            return;
        }
        if (nArray != null && n2 != -1) {
            Animation animation = frames.frames[n];
            Animation animation2 = frames2.frames[n2];
            Skeleton skeleton = animation.skeleton;
            Model_transformTempX = 0;
            Model_transformTempY = 0;
            Model_transformTempZ = 0;
            int n3 = 0;
            int n4 = nArray[n3++];
            int n5 = 0;
            while (true) {
                int n6;
                if (n5 >= animation.transformCount) {
                    Model_transformTempX = 0;
                    Model_transformTempY = 0;
                    Model_transformTempZ = 0;
                    n3 = 0;
                    n4 = nArray[n3++];
                    n5 = 0;
                    while (true) {
                        if (n5 >= animation2.transformCount) {
                            this.resetBounds();
                            return;
                        }
                        n6 = animation2.transformSkeletonLabels[n5];
                        while (n6 > n4) {
                            n4 = nArray[n3++];
                        }
                        if (n6 == n4 || skeleton.transformTypes[n6] == 0) {
                            this.transform(skeleton.transformTypes[n6], skeleton.labels[n6], animation2.transformXs[n5], animation2.transformYs[n5], animation2.transformZs[n5]);
                        }
                        ++n5;
                    }
                }
                n6 = animation.transformSkeletonLabels[n5];
                while (n6 > n4) {
                    n4 = nArray[n3++];
                }
                if (n6 != n4 || skeleton.transformTypes[n6] == 0) {
                    this.transform(skeleton.transformTypes[n6], skeleton.labels[n6], animation.transformXs[n5], animation.transformYs[n5], animation.transformZs[n5]);
                }
                ++n5;
            }
        }
        this.animate(frames, n);
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(Lhu;Lfl;I[ZZZ)V")
    public void method4552(Skeleton skeleton, class144 class1442, int n, boolean[] blArray, boolean bl, boolean bl2) {
        class184 class1842 = skeleton.method4168();
        if (class1842 != null) {
            class1842.method4111(class1442, n, blArray, bl);
            if (bl2) {
                this.method4550(class1842, class1442.method3529());
            }
        }
        if (!bl && class1442.method3535()) {
            this.method4537(class1442, n);
        }
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(Lhb;I[IZ)V")
    public void method4598(Frames frames, int n, int[] nArray, boolean bl) {
        if (nArray != null) {
            Animation animation = frames.frames[n];
            Skeleton skeleton = animation.skeleton;
            int n2 = 0;
            int n3 = nArray[n2++];
            Model_transformTempX = 0;
            Model_transformTempY = 0;
            Model_transformTempZ = 0;
            int n4 = 0;
            while (true) {
                if (n4 >= animation.transformCount) {
                    return;
                }
                int n5 = animation.transformSkeletonLabels[n4];
                while (n5 > n3) {
                    n3 = nArray[n2++];
                }
                if (!bl) {
                    if (n5 != n3 || skeleton.transformTypes[n5] == 0) {
                        this.transform(skeleton.transformTypes[n5], skeleton.labels[n5], animation.transformXs[n4], animation.transformYs[n4], animation.transformZs[n4]);
                    }
                } else if (n5 == n3 || skeleton.transformTypes[n5] == 0) {
                    this.transform(skeleton.transformTypes[n5], skeleton.labels[n5], animation.transformXs[n4], animation.transformYs[n4], animation.transformZs[n4]);
                }
                ++n4;
            }
        }
        this.animate(frames, n);
    }

    @ObfuscatedName(value="ap")
    @Export(value="transform")
    void transform(int n, int[] nArray, int n2, int n3, int n4) {
        int n5 = nArray.length;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 5) {
                            return;
                        }
                        if (this.faceLabelsAlpha != null && this.faceAlphas != null) {
                            block0: for (int i = 0; i < n5; ++i) {
                                int n6 = nArray[i];
                                if (n6 >= this.faceLabelsAlpha.length) continue;
                                int[] nArray2 = this.faceLabelsAlpha[n6];
                                int n7 = 0;
                                while (true) {
                                    if (n7 >= nArray2.length) {
                                        continue block0;
                                    }
                                    int n8 = nArray2[n7];
                                    int n9 = (this.faceAlphas[n8] & 0xFF) + n2 * 8;
                                    if (n9 < 0) {
                                        n9 = 0;
                                    } else if (n9 > 255) {
                                        n9 = 255;
                                    }
                                    this.faceAlphas[n8] = (byte)n9;
                                    ++n7;
                                }
                            }
                        }
                        return;
                    }
                    int n10 = 0;
                    while (true) {
                        if (n10 >= n5) {
                            return;
                        }
                        int n11 = nArray[n10];
                        if (n11 < this.vertexLabels.length) {
                            int[] nArray3 = this.vertexLabels[n11];
                            for (int i = 0; i < nArray3.length; ++i) {
                                int n12;
                                int n13 = n12 = nArray3[i];
                                this.verticesX[n13] = this.verticesX[n13] - Model_transformTempX;
                                int n14 = n12;
                                this.verticesY[n14] = this.verticesY[n14] - Model_transformTempY;
                                int n15 = n12;
                                this.verticesZ[n15] = this.verticesZ[n15] - Model_transformTempZ;
                                this.verticesX[n12] = n2 * this.verticesX[n12] / 128;
                                this.verticesY[n12] = n3 * this.verticesY[n12] / 128;
                                this.verticesZ[n12] = n4 * this.verticesZ[n12] / 128;
                                int n16 = n12;
                                this.verticesX[n16] = this.verticesX[n16] + Model_transformTempX;
                                int n17 = n12;
                                this.verticesY[n17] = this.verticesY[n17] + Model_transformTempY;
                                int n18 = n12;
                                this.verticesZ[n18] = this.verticesZ[n18] + Model_transformTempZ;
                            }
                        }
                        ++n10;
                    }
                }
                int n19 = 0;
                while (true) {
                    if (n19 >= n5) {
                        return;
                    }
                    int n20 = nArray[n19];
                    if (n20 < this.vertexLabels.length) {
                        int[] nArray4 = this.vertexLabels[n20];
                        for (int i = 0; i < nArray4.length; ++i) {
                            int n21;
                            int n22;
                            int n23;
                            int n24;
                            int n25 = n24 = nArray4[i];
                            this.verticesX[n25] = this.verticesX[n25] - Model_transformTempX;
                            int n26 = n24;
                            this.verticesY[n26] = this.verticesY[n26] - Model_transformTempY;
                            int n27 = n24;
                            this.verticesZ[n27] = this.verticesZ[n27] - Model_transformTempZ;
                            int n28 = (n2 & 0xFF) * 8;
                            int n29 = (n3 & 0xFF) * 8;
                            int n30 = (n4 & 0xFF) * 8;
                            if (n30 != 0) {
                                n23 = field2250[n30];
                                n22 = field2251[n30];
                                n21 = n23 * this.verticesY[n24] + n22 * this.verticesX[n24] >> 16;
                                this.verticesY[n24] = n22 * this.verticesY[n24] - n23 * this.verticesX[n24] >> 16;
                                this.verticesX[n24] = n21;
                            }
                            if (n28 != 0) {
                                n23 = field2250[n28];
                                n22 = field2251[n28];
                                n21 = n22 * this.verticesY[n24] - n23 * this.verticesZ[n24] >> 16;
                                this.verticesZ[n24] = n23 * this.verticesY[n24] + n22 * this.verticesZ[n24] >> 16;
                                this.verticesY[n24] = n21;
                            }
                            if (n29 != 0) {
                                n23 = field2250[n29];
                                n22 = field2251[n29];
                                n21 = n23 * this.verticesZ[n24] + n22 * this.verticesX[n24] >> 16;
                                this.verticesZ[n24] = n22 * this.verticesZ[n24] - n23 * this.verticesX[n24] >> 16;
                                this.verticesX[n24] = n21;
                            }
                            int n31 = n24;
                            this.verticesX[n31] = this.verticesX[n31] + Model_transformTempX;
                            int n32 = n24;
                            this.verticesY[n32] = this.verticesY[n32] + Model_transformTempY;
                            int n33 = n24;
                            this.verticesZ[n33] = this.verticesZ[n33] + Model_transformTempZ;
                        }
                    }
                    ++n19;
                }
            }
            int n34 = 0;
            while (true) {
                if (n34 >= n5) {
                    return;
                }
                int n35 = nArray[n34];
                if (n35 < this.vertexLabels.length) {
                    int[] nArray5 = this.vertexLabels[n35];
                    for (int i = 0; i < nArray5.length; ++i) {
                        int n36;
                        int n37 = n36 = nArray5[i];
                        this.verticesX[n37] = this.verticesX[n37] + n2;
                        int n38 = n36;
                        this.verticesY[n38] = this.verticesY[n38] + n3;
                        int n39 = n36;
                        this.verticesZ[n39] = this.verticesZ[n39] + n4;
                    }
                }
                ++n34;
            }
        }
        int n40 = 0;
        Model_transformTempX = 0;
        Model_transformTempY = 0;
        Model_transformTempZ = 0;
        int n41 = 0;
        while (true) {
            if (n41 >= n5) {
                if (n40 <= 0) {
                    Model_transformTempX = n2;
                    Model_transformTempY = n3;
                    Model_transformTempZ = n4;
                } else {
                    Model_transformTempX = n2 + Model_transformTempX / n40;
                    Model_transformTempY = n3 + Model_transformTempY / n40;
                    Model_transformTempZ = n4 + Model_transformTempZ / n40;
                }
                return;
            }
            int n42 = nArray[n41];
            if (n42 < this.vertexLabels.length) {
                int[] nArray6 = this.vertexLabels[n42];
                for (int i = 0; i < nArray6.length; ++i) {
                    int n43 = nArray6[i];
                    Model_transformTempX += this.verticesX[n43];
                    Model_transformTempY += this.verticesY[n43];
                    Model_transformTempZ += this.verticesZ[n43];
                    ++n40;
                }
            }
            ++n41;
        }
    }

    @ObfuscatedName(value="ab")
    @Export(value="rotateY90Ccw")
    public void rotateY90Ccw() {
        int n = 0;
        while (true) {
            if (n >= this.verticesCount) {
                this.resetBounds();
                return;
            }
            int n2 = this.verticesX[n];
            this.verticesX[n] = this.verticesZ[n];
            this.verticesZ[n] = -n2;
            ++n;
        }
    }

    @ObfuscatedName(value="aj")
    @Export(value="rotateY180")
    public void rotateY180() {
        int n = 0;
        while (true) {
            if (n >= this.verticesCount) {
                this.resetBounds();
                return;
            }
            this.verticesX[n] = -this.verticesX[n];
            this.verticesZ[n] = -this.verticesZ[n];
            ++n;
        }
    }

    @ObfuscatedName(value="bu")
    @Export(value="rotateY270Ccw")
    public void rotateY270Ccw() {
        int n = 0;
        while (true) {
            if (n >= this.verticesCount) {
                this.resetBounds();
                return;
            }
            int n2 = this.verticesZ[n];
            this.verticesZ[n] = this.verticesX[n];
            this.verticesX[n] = -n2;
            ++n;
        }
    }

    @ObfuscatedName(value="bh")
    @Export(value="rotateZ")
    public void rotateZ(int n) {
        int n2 = field2250[n];
        int n3 = field2251[n];
        int n4 = 0;
        while (true) {
            if (n4 >= this.verticesCount) {
                this.resetBounds();
                return;
            }
            int n5 = n3 * this.verticesY[n4] - n2 * this.verticesZ[n4] >> 16;
            this.verticesZ[n4] = n2 * this.verticesY[n4] + n3 * this.verticesZ[n4] >> 16;
            this.verticesY[n4] = n5;
            ++n4;
        }
    }

    @ObfuscatedName(value="bw")
    @Export(value="offsetBy")
    public void offsetBy(int n, int n2, int n3) {
        int n4 = 0;
        while (true) {
            if (n4 >= this.verticesCount) {
                this.resetBounds();
                return;
            }
            int n5 = n4;
            this.verticesX[n5] = this.verticesX[n5] + n;
            int n6 = n4;
            this.verticesY[n6] = this.verticesY[n6] + n2;
            int n7 = n4++;
            this.verticesZ[n7] = this.verticesZ[n7] + n3;
        }
    }

    @ObfuscatedName(value="bb")
    @Export(value="scale")
    public void scale(int n, int n2, int n3) {
        int n4 = 0;
        while (true) {
            if (n4 >= this.verticesCount) {
                this.resetBounds();
                return;
            }
            this.verticesX[n4] = this.verticesX[n4] * n / 128;
            this.verticesY[n4] = n2 * this.verticesY[n4] / 128;
            this.verticesZ[n4] = n3 * this.verticesZ[n4] / 128;
            ++n4;
        }
    }

    @ObfuscatedName(value="bx")
    public final void method4561(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.boundsType != 2) {
            this.method4544();
        }
        int n8 = SceneTileModel.method4008();
        int n9 = SceneTileModel.method4048();
        int n10 = field2250[n];
        int n11 = field2251[n];
        int n12 = field2250[n2];
        int n13 = field2251[n2];
        int n14 = field2250[n3];
        int n15 = field2251[n3];
        int n16 = field2250[n4];
        int n17 = field2251[n4];
        int n18 = n16 * n6 + n17 * n7 >> 16;
        for (int i = 0; i < this.verticesCount; ++i) {
            int n19;
            int n20 = this.verticesX[i];
            int n21 = this.verticesY[i];
            int n22 = this.verticesZ[i];
            if (n3 != 0) {
                n19 = n21 * n14 + n20 * n15 >> 16;
                n21 = n21 * n15 - n20 * n14 >> 16;
                n20 = n19;
            }
            if (n != 0) {
                n19 = n21 * n11 - n22 * n10 >> 16;
                n22 = n21 * n10 + n22 * n11 >> 16;
                n21 = n19;
            }
            if (n2 != 0) {
                n19 = n22 * n12 + n20 * n13 >> 16;
                n22 = n22 * n13 - n20 * n12 >> 16;
                n20 = n19;
            }
            n20 = n5 + n20;
            n19 = (n21 += n6) * n17 - (n22 += n7) * n16 >> 16;
            n22 = n21 * n16 + n22 * n17 >> 16;
            n21 = n19;
            Model.field2247[i] = n22 - n18;
            Model.modelViewportXs[i] = n8 + n20 * SceneTileModel.method4061() / n22;
            Model.modelViewportYs[i] = n9 + n21 * SceneTileModel.method4061() / n22;
            Model.field2187[i] = class20.method298(n22);
            if (this.faceTextures == null) continue;
            Model.field2229[i] = n20;
            Model.field2230[i] = n21;
            Model.field2231[i] = n22;
        }
        try {
            this.draw0(false, false, false, 0L);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @ObfuscatedName(value="bd")
    public final void method4562(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (this.boundsType != 2) {
            this.method4544();
        }
        int n9 = SceneTileModel.method4008();
        int n10 = SceneTileModel.method4048();
        int n11 = field2250[n];
        int n12 = field2251[n];
        int n13 = field2250[n2];
        int n14 = field2251[n2];
        int n15 = field2250[n3];
        int n16 = field2251[n3];
        int n17 = field2250[n4];
        int n18 = field2251[n4];
        int n19 = n17 * n6 + n18 * n7 >> 16;
        for (int i = 0; i < this.verticesCount; ++i) {
            int n20;
            int n21 = this.verticesX[i];
            int n22 = this.verticesY[i];
            int n23 = this.verticesZ[i];
            if (n3 != 0) {
                n20 = n22 * n15 + n21 * n16 >> 16;
                n22 = n22 * n16 - n21 * n15 >> 16;
                n21 = n20;
            }
            if (n != 0) {
                n20 = n22 * n12 - n23 * n11 >> 16;
                n23 = n22 * n11 + n23 * n12 >> 16;
                n22 = n20;
            }
            if (n2 != 0) {
                n20 = n23 * n13 + n21 * n14 >> 16;
                n23 = n23 * n14 - n21 * n13 >> 16;
                n21 = n20;
            }
            n21 = n5 + n21;
            n20 = (n22 += n6) * n18 - (n23 += n7) * n17 >> 16;
            n23 = n22 * n17 + n23 * n18 >> 16;
            n22 = n20;
            Model.field2247[i] = n23 - n19;
            Model.modelViewportXs[i] = n9 + n21 * SceneTileModel.method4061() / n8;
            Model.modelViewportYs[i] = n10 + n22 * SceneTileModel.method4061() / n8;
            Model.field2187[i] = class20.method298(n8);
            if (this.faceTextures == null) continue;
            Model.field2229[i] = n21;
            Model.field2230[i] = n22;
            Model.field2231[i] = n23;
        }
        try {
            this.draw0(false, false, false, 0L);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @ObfuscatedName(value="bi")
    @Export(value="draw")
    void draw(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, long l) {
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        boolean bl;
        boolean bl2;
        boolean bl3;
        int n18;
        if (this.boundsType != 1) {
            this.calculateBoundsCylinder();
        }
        this.calculateBoundingBox(n);
        int n19 = n5 * n8 - n4 * n6 >> 16;
        int n20 = n2 * n7 + n3 * n19 >> 16;
        int n21 = n3 * this.xzRadius >> 16;
        int n22 = n20 + n21;
        if (n22 <= 50 || n20 >= class185.method4138()) {
            return;
        }
        int n23 = n8 * n4 + n5 * n6 >> 16;
        int n24 = (n23 - this.xzRadius) * SceneTileModel.method4061();
        if (n24 / n22 >= SceneTileModel.method4078()) {
            return;
        }
        int n25 = (n23 + this.xzRadius) * SceneTileModel.method4061();
        if (n25 / n22 <= SceneTileModel.method4088()) {
            return;
        }
        int n26 = n3 * n7 - n19 * n2 >> 16;
        int n27 = n2 * this.xzRadius >> 16;
        int n28 = (n3 * this.bottomY >> 16) + n27;
        int n29 = (n26 + n28) * SceneTileModel.method4061();
        if (n29 / n22 <= SceneTileModel.method4013()) {
            return;
        }
        int n30 = (n3 * this.height >> 16) + n27;
        int n31 = (n26 - n30) * SceneTileModel.method4061();
        if (n31 / n22 >= SceneTileModel.method4012()) {
            return;
        }
        int n32 = n21 + (n2 * this.height >> 16);
        boolean bl4 = false;
        boolean bl5 = false;
        if (n20 - n32 <= 50) {
            bl5 = true;
        }
        boolean bl6 = bl5 || this.faceTextures != null;
        int n33 = class112.method3152();
        int n34 = n18 = ViewportMouse.ViewportMouse_y;
        boolean bl7 = Login.method2449();
        boolean bl8 = bl3 = 0L != l;
        if (bl3) {
            bl2 = (int)(l >>> 16 & 1L) == 1;
            bl3 = !bl2;
        }
        bl3 = bl = bl3;
        bl2 = false;
        if (bl3 && bl7) {
            n17 = 0;
            if (field2215) {
                Model model = this;
                if (!Login.method2449()) {
                    n16 = 0;
                } else {
                    class110.method3122(n2, n3, n4, n5);
                    class189 class1892 = model.method4543(n);
                    n15 = class1892.field2108 + n6;
                    n14 = n7 + class1892.field2107;
                    n13 = n8 + class1892.field2109;
                    n12 = class1892.field2111;
                    n11 = class1892.field2113;
                    int n35 = class1892.field2110;
                    int n36 = ViewportMouse.field2267 - n15;
                    int n37 = Huffman.field4034 - n14;
                    int n38 = class169.field1804 - n13;
                    n16 = Math.abs(n36) > n12 + WorldMapSprite.field3231 ? 0 : (Math.abs(n37) > n11 + class464.field4955 ? 0 : (Math.abs(n38) > n35 + UserComparator10.field1516 ? 0 : (Math.abs(n38 * class496.field5128 - n37 * CollisionMap.field2995) > n11 * UserComparator10.field1516 + n35 * class464.field4955 ? 0 : (Math.abs(n36 * CollisionMap.field2995 - n38 * ViewportMouse.field2262) > n12 * UserComparator10.field1516 + n35 * WorldMapSprite.field3231 ? 0 : (Math.abs(n37 * ViewportMouse.field2262 - n36 * class496.field5128) > n11 * WorldMapSprite.field3231 + n12 * class464.field4955 ? 0 : 1)))));
                }
                n17 = n16;
            } else {
                n16 = n20 - n21;
                if (n16 <= 50) {
                    n16 = 50;
                }
                if (n23 > 0) {
                    n24 /= n22;
                    n25 /= n16;
                } else {
                    n25 /= n22;
                    n24 /= n16;
                }
                if (n26 > 0) {
                    n31 /= n22;
                    n29 /= n16;
                } else {
                    n29 /= n22;
                    n31 /= n16;
                }
                n10 = n33 - SceneTileModel.method4008();
                n9 = n34 - SceneTileModel.method4048();
                if (n10 > n24 && n10 < n25 && n9 > n31 && n9 < n29) {
                    n17 = 1;
                }
            }
            if (n17 != 0) {
                if (this.isSingleTile) {
                    long l2 = l;
                    ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = l2;
                } else {
                    bl2 = true;
                }
            }
        }
        n17 = SceneTileModel.method4008();
        n16 = SceneTileModel.method4048();
        n10 = 0;
        n9 = 0;
        if (n != 0) {
            n10 = field2250[n];
            n9 = field2251[n];
        }
        for (n15 = 0; n15 < this.verticesCount; ++n15) {
            n14 = this.verticesX[n15];
            n13 = this.verticesY[n15];
            n12 = this.verticesZ[n15];
            if (n != 0) {
                n11 = n12 * n10 + n14 * n9 >> 16;
                n12 = n12 * n9 - n14 * n10 >> 16;
                n14 = n11;
            }
            n11 = (n12 += n8) * n4 + n5 * (n14 += n6) >> 16;
            n12 = n5 * n12 - n14 * n4 >> 16;
            n14 = n11;
            n11 = n3 * (n13 += n7) - n12 * n2 >> 16;
            n12 = n13 * n2 + n3 * n12 >> 16;
            n13 = n11;
            bl4 |= this.method4566(n15, n14, n13, n12, n20, n17, n16, bl6);
        }
        try {
            this.draw0(bl4, bl2, this.isSingleTile, l);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @ObfuscatedName(value="bz")
    boolean method4566(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        Model.field2247[n] = n4 - n5;
        if (bl) {
            Model.field2229[n] = n2;
            Model.field2230[n] = n3;
            Model.field2231[n] = n4;
        }
        if (n4 < 50) {
            Model.modelViewportXs[n] = -5000;
            return true;
        }
        Model.modelViewportXs[n] = n6 + n2 * SceneTileModel.method4061() / n4;
        Model.modelViewportYs[n] = n7 + n3 * SceneTileModel.method4061() / n4;
        Model.field2187[n] = class20.method298(n4);
        return false;
    }

    @ObfuscatedName(value="bt")
    @Export(value="draw0")
    final void draw0(boolean bl, boolean bl2, boolean bl3, long l) {
        int n;
        if (this.diameter >= 6000) {
            return;
        }
        for (n = 0; n < this.diameter; ++n) {
            Model.field2233[n] = '\u0000';
        }
        n = bl3 ? 20 : 5;
        int n2 = 0;
        while (true) {
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            int n10;
            if (n2 >= this.indicesCount) {
                if (this.faceRenderPriorities != null) {
                    n2 = 0;
                    while (true) {
                        if (n2 >= 12) {
                            n2 = this.diameter - 1;
                            while (true) {
                                if (n2 < 0) {
                                    n2 = 0;
                                    if (field2235[1] > 0 || field2235[2] > 0) {
                                        n2 = (field2256[1] + field2256[2]) / (field2235[1] + field2235[2]);
                                    }
                                    n10 = 0;
                                    if (field2235[3] > 0 || field2235[4] > 0) {
                                        n10 = (field2256[3] + field2256[4]) / (field2235[3] + field2235[4]);
                                    }
                                    n9 = 0;
                                    if (field2235[6] > 0 || field2235[8] > 0) {
                                        n9 = (field2256[8] + field2256[6]) / (field2235[8] + field2235[6]);
                                    }
                                    n8 = 0;
                                    n7 = field2235[10];
                                    int[] nArray = field2234[10];
                                    int[] nArray2 = field2209;
                                    if (n8 == n7) {
                                        n8 = 0;
                                        n7 = field2235[11];
                                        nArray = field2234[11];
                                        nArray2 = field2238;
                                    }
                                    n6 = n8 < n7 ? nArray2[n8] : -1000;
                                    n5 = 0;
                                    block4: while (true) {
                                        if (n5 >= 10) {
                                            while (true) {
                                                if (n6 == -1000) {
                                                    return;
                                                }
                                                this.drawFace(nArray[n8++]);
                                                if (n8 == n7 && nArray != field2234[11]) {
                                                    n8 = 0;
                                                    nArray = field2234[11];
                                                    n7 = field2235[11];
                                                    nArray2 = field2238;
                                                }
                                                if (n8 < n7) {
                                                    n6 = nArray2[n8];
                                                    continue;
                                                }
                                                n6 = -1000;
                                            }
                                        }
                                        while (n5 == 0 && n6 > n2) {
                                            this.drawFace(nArray[n8++]);
                                            if (n8 == n7 && nArray != field2234[11]) {
                                                n8 = 0;
                                                n7 = field2235[11];
                                                nArray = field2234[11];
                                                nArray2 = field2238;
                                            }
                                            if (n8 < n7) {
                                                n6 = nArray2[n8];
                                                continue;
                                            }
                                            n6 = -1000;
                                        }
                                        while (true) {
                                            if (n5 != 3 || n6 <= n10) {
                                                while (true) {
                                                    if (n5 != 5 || n6 <= n9) {
                                                        n4 = field2235[n5];
                                                        int[] nArray3 = field2234[n5];
                                                        for (n3 = 0; n3 < n4; ++n3) {
                                                            this.drawFace(nArray3[n3]);
                                                        }
                                                        ++n5;
                                                        continue block4;
                                                    }
                                                    this.drawFace(nArray[n8++]);
                                                    if (n8 == n7 && nArray != field2234[11]) {
                                                        n8 = 0;
                                                        n7 = field2235[11];
                                                        nArray = field2234[11];
                                                        nArray2 = field2238;
                                                    }
                                                    if (n8 < n7) {
                                                        n6 = nArray2[n8];
                                                        continue;
                                                    }
                                                    n6 = -1000;
                                                }
                                            }
                                            this.drawFace(nArray[n8++]);
                                            if (n8 == n7 && nArray != field2234[11]) {
                                                n8 = 0;
                                                n7 = field2235[11];
                                                nArray = field2234[11];
                                                nArray2 = field2238;
                                            }
                                            if (n8 < n7) {
                                                n6 = nArray2[n8];
                                                continue;
                                            }
                                            n6 = -1000;
                                        }
                                        break;
                                    }
                                }
                                n10 = field2233[n2];
                                if (n10 > 0) {
                                    char[] cArray = field2201[n2];
                                    for (n6 = 0; n6 < n10; ++n6) {
                                        n8 = cArray[n6];
                                        int n11 = n7 = this.faceRenderPriorities[n8];
                                        field2235[n11] = field2235[n11] + 1;
                                        Model.field2234[n7][n15] = n8;
                                        if (n7 < 10) {
                                            int n12 = n7;
                                            field2256[n12] = field2256[n12] + n2;
                                            continue;
                                        }
                                        if (n7 == 10) {
                                            Model.field2209[n15] = n2;
                                            continue;
                                        }
                                        Model.field2238[n15] = n2;
                                    }
                                }
                                --n2;
                            }
                        }
                        Model.field2235[n2] = 0;
                        Model.field2256[n2] = 0;
                        ++n2;
                    }
                }
                n2 = this.diameter - 1;
                while (true) {
                    if (n2 < 0) {
                        return;
                    }
                    n10 = field2233[n2];
                    if (n10 > 0) {
                        char[] cArray = field2201[n2];
                        for (n6 = 0; n6 < n10; ++n6) {
                            this.drawFace(cArray[n6]);
                        }
                    }
                    --n2;
                }
            }
            if (this.faceColors3[n2] != -2) {
                int n13;
                int n14;
                n10 = this.indices1[n2];
                n9 = this.indices2[n2];
                n6 = this.indices3[n2];
                n8 = modelViewportXs[n10];
                n7 = modelViewportXs[n9];
                int n15 = modelViewportXs[n6];
                if (bl && (n8 == -5000 || n7 == -5000 || n15 == -5000)) {
                    int n16;
                    int n17;
                    n14 = field2229[n10];
                    n5 = field2229[n9];
                    n4 = field2229[n6];
                    n13 = field2230[n10];
                    n3 = field2230[n9];
                    int n18 = field2230[n6];
                    int n19 = field2231[n10];
                    int n20 = field2231[n9];
                    int n21 = field2231[n6];
                    int n22 = (n13 -= n3) * (n21 -= n20) - (n19 -= n20) * (n18 -= n3);
                    if (n5 * n22 + n3 * (n17 = n19 * (n4 -= n5) - (n14 -= n5) * n21) + n20 * (n16 = n14 * n18 - n13 * n4) > 0) {
                        int n23;
                        Model.field2224[n2] = true;
                        int n24 = n23 = (field2247[n10] + field2247[n9] + field2247[n6]) / 3 + this.radius;
                        char c = field2233[n24];
                        field2233[n24] = (char)(c + '\u0001');
                        Model.field2201[n23][c] = n2;
                    }
                } else {
                    if (bl2) {
                        n5 = modelViewportYs[n10];
                        n4 = modelViewportYs[n9];
                        n13 = modelViewportYs[n6];
                        n3 = n + ViewportMouse.ViewportMouse_y;
                        n14 = n3 < n5 && n3 < n4 && n3 < n13 ? 0 : ((n3 = ViewportMouse.ViewportMouse_y - n) > n5 && n3 > n4 && n3 > n13 ? 0 : ((n3 = n + ViewportMouse.ViewportMouse_x) < n8 && n3 < n7 && n3 < n15 ? 0 : ((n3 = ViewportMouse.ViewportMouse_x - n) > n8 && n3 > n7 && n3 > n15 ? 0 : 1)));
                        if (n14 != 0) {
                            long l2 = l;
                            ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = l2;
                            bl2 = false;
                        }
                    }
                    if ((n8 - n7) * (modelViewportYs[n6] - modelViewportYs[n9]) - (n15 - n7) * (modelViewportYs[n10] - modelViewportYs[n9]) > 0) {
                        Model.field2224[n2] = false;
                        n14 = SceneTileModel.method4015();
                        Model.field2204[n2] = n8 < 0 || n7 < 0 || n15 < 0 || n8 > n14 || n7 > n14 || n15 > n14;
                        int n25 = n5 = (field2247[n10] + field2247[n9] + field2247[n6]) / 3 + this.radius;
                        char c = field2233[n25];
                        field2233[n25] = (char)(c + '\u0001');
                        Model.field2201[n5][c] = n2;
                    }
                }
            }
            n2 = (char)(n2 + 1);
        }
    }

    @ObfuscatedName(value="bf")
    @Export(value="drawFace")
    final void drawFace(int n) {
        if (!field2224[n]) {
            int n2 = this.indices1[n];
            int n3 = this.indices2[n];
            int n4 = this.indices3[n];
            SceneTileModel.field1957.field2308 = field2204[n];
            SceneTileModel.field1957.field2291 = this.faceAlphas != null ? (this.faceAlphas[n] == -1 ? 253 : this.faceAlphas[n]) & 0xFF : 0;
            this.method4546(n, modelViewportYs[n2], modelViewportYs[n3], modelViewportYs[n4], modelViewportXs[n2], modelViewportXs[n3], modelViewportXs[n4], field2187[n2], field2187[n3], field2187[n4], this.faceColors1[n], this.faceColors2[n], this.faceColors3[n]);
            return;
        }
        this.method4657(n);
    }

    @ObfuscatedName(value="by")
    boolean method4622(int n) {
        return this.overrideAmount > 0 && n < this.field2193;
    }

    @ObfuscatedName(value="bm")
    final void method4546(int n, int n2, int n3, int n4, int n5, int n6, int n7, float f, float f2, float f3, int n8, int n9, int n10) {
        if (this.faceTextures != null && this.faceTextures[n] != -1) {
            int n11;
            int n12;
            int n13;
            if (this.field2237 != null && this.field2237[n] != -1) {
                int n14 = this.field2237[n] & 0xFF;
                n13 = this.field2208[n14];
                n12 = this.field2241[n14];
                n11 = this.field2210[n14];
            } else {
                n13 = this.indices1[n];
                n12 = this.indices2[n];
                n11 = this.indices3[n];
            }
            if (this.faceColors3[n] != -1) {
                SceneTileModel.method4024(n2, n3, n4, n5, n6, n7, f, f2, f3, n8, n9, n10, field2229[n13], field2229[n12], field2229[n11], field2230[n13], field2230[n12], field2230[n11], field2231[n13], field2231[n12], field2231[n11], this.faceTextures[n]);
            } else {
                SceneTileModel.method4024(n2, n3, n4, n5, n6, n7, f, f2, f3, n8, n8, n8, field2229[n13], field2229[n12], field2229[n11], field2230[n13], field2230[n12], field2230[n11], field2231[n13], field2231[n12], field2231[n11], this.faceTextures[n]);
            }
        } else {
            boolean bl = this.method4622(n);
            if (this.faceColors3[n] != -1 || !bl) {
                if (this.faceColors3[n] != -1) {
                    if (!bl) {
                        SceneTileModel.method4022(n2, n3, n4, n5, n6, n7, f, f2, f3, n8, n9, n10);
                    } else {
                        SceneTileModel.method4026(n2, n3, n4, n5, n6, n7, f, f2, f3, n8, n9, n10, this.field2196, this.field2257, this.field2206, this.overrideAmount);
                    }
                } else {
                    SceneTileModel.method4009(n2, n3, n4, n5, n6, n7, f, f2, f3, field2213[this.faceColors1[n]]);
                }
            } else {
                SceneTileModel.method4027(n2, n3, n4, n5, n6, n7, f, f2, f3, field2213[this.faceColors1[n]], this.field2196, this.field2257, this.field2206, this.overrideAmount);
            }
        }
    }

    @ObfuscatedName(value="bp")
    final void method4657(int n) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = SceneTileModel.method4008();
        int n7 = SceneTileModel.method4048();
        int n8 = 0;
        int n9 = this.indices1[n];
        int n10 = this.indices2[n];
        int n11 = this.indices3[n];
        int n12 = field2231[n9];
        int n13 = field2231[n10];
        int n14 = field2231[n11];
        SceneTileModel.field1957.field2291 = this.faceAlphas == null ? 0 : this.faceAlphas[n] & 0xFF;
        if (n12 < 50) {
            n5 = field2229[n9];
            n4 = field2230[n9];
            n3 = this.faceColors1[n];
            if (n14 >= 50) {
                n2 = field2259[n14 - n12] * (50 - n12);
                Model.field2240[n8] = n6 + (n5 + ((field2229[n11] - n5) * n2 >> 16)) * SceneTileModel.method4061() / 50;
                Model.field2258[n8] = n7 + (n4 + ((field2230[n11] - n4) * n2 >> 16)) * SceneTileModel.method4061() / 50;
                Model.field2243[n8] = field2255;
                Model.field2227[n8++] = n3 + ((this.faceColors3[n] - n3) * n2 >> 16);
            }
            if (n13 >= 50) {
                n2 = field2259[n13 - n12] * (50 - n12);
                Model.field2240[n8] = n6 + (n5 + ((field2229[n10] - n5) * n2 >> 16)) * SceneTileModel.method4061() / 50;
                Model.field2258[n8] = n7 + (n4 + ((field2230[n10] - n4) * n2 >> 16)) * SceneTileModel.method4061() / 50;
                Model.field2243[n8] = field2255;
                Model.field2227[n8++] = n3 + ((this.faceColors2[n] - n3) * n2 >> 16);
            }
        } else {
            Model.field2240[n8] = modelViewportXs[n9];
            Model.field2258[n8] = modelViewportYs[n9];
            Model.field2243[n8] = field2187[n11];
            Model.field2227[n8++] = this.faceColors1[n];
        }
        if (n13 < 50) {
            n5 = field2229[n10];
            n4 = field2230[n10];
            n3 = this.faceColors2[n];
            if (n12 >= 50) {
                n2 = field2259[n12 - n13] * (50 - n13);
                Model.field2240[n8] = n6 + (n5 + ((field2229[n9] - n5) * n2 >> 16)) * SceneTileModel.method4061() / 50;
                Model.field2258[n8] = n7 + (n4 + ((field2230[n9] - n4) * n2 >> 16)) * SceneTileModel.method4061() / 50;
                Model.field2243[n8] = field2255;
                Model.field2227[n8++] = n3 + ((this.faceColors1[n] - n3) * n2 >> 16);
            }
            if (n14 >= 50) {
                n2 = field2259[n14 - n13] * (50 - n13);
                Model.field2240[n8] = n6 + (n5 + ((field2229[n11] - n5) * n2 >> 16)) * SceneTileModel.method4061() / 50;
                Model.field2258[n8] = n7 + (n4 + ((field2230[n11] - n4) * n2 >> 16)) * SceneTileModel.method4061() / 50;
                Model.field2227[n8++] = n3 + ((this.faceColors3[n] - n3) * n2 >> 16);
            }
        } else {
            Model.field2240[n8] = modelViewportXs[n10];
            Model.field2258[n8] = modelViewportYs[n10];
            Model.field2243[n8] = field2187[n11];
            Model.field2227[n8++] = this.faceColors2[n];
        }
        if (n14 < 50) {
            n5 = field2229[n11];
            n4 = field2230[n11];
            n3 = this.faceColors3[n];
            if (n13 >= 50) {
                n2 = field2259[n13 - n14] * (50 - n14);
                Model.field2240[n8] = n6 + (n5 + ((field2229[n10] - n5) * n2 >> 16)) * SceneTileModel.method4061() / 50;
                Model.field2258[n8] = n7 + (n4 + ((field2230[n10] - n4) * n2 >> 16)) * SceneTileModel.method4061() / 50;
                Model.field2243[n8] = field2255;
                Model.field2227[n8++] = n3 + ((this.faceColors2[n] - n3) * n2 >> 16);
            }
            if (n12 >= 50) {
                n2 = field2259[n12 - n14] * (50 - n14);
                Model.field2240[n8] = n6 + (n5 + ((field2229[n9] - n5) * n2 >> 16)) * SceneTileModel.method4061() / 50;
                Model.field2258[n8] = n7 + (n4 + ((field2230[n9] - n4) * n2 >> 16)) * SceneTileModel.method4061() / 50;
                Model.field2243[n8] = field2255;
                Model.field2227[n8++] = n3 + ((this.faceColors1[n] - n3) * n2 >> 16);
            }
        } else {
            Model.field2240[n8] = modelViewportXs[n11];
            Model.field2258[n8] = modelViewportYs[n11];
            Model.field2243[n8] = field2187[n11];
            Model.field2227[n8++] = this.faceColors3[n];
        }
        n5 = field2240[0];
        n4 = field2240[1];
        n3 = field2240[2];
        n2 = field2258[0];
        int n15 = field2258[1];
        int n16 = field2258[2];
        float f = field2243[0];
        float f2 = field2243[1];
        float f3 = field2243[2];
        SceneTileModel.field1957.field2308 = false;
        int n17 = SceneTileModel.method4015();
        if (n8 == 3) {
            if (n5 < 0 || n4 < 0 || n3 < 0 || n5 > n17 || n4 > n17 || n3 > n17) {
                SceneTileModel.field1957.field2308 = true;
            }
            this.method4546(n, n2, n15, n16, n5, n4, n3, f, f2, f3, field2227[0], field2227[1], field2227[2]);
        }
        if (n8 == 4) {
            if (n5 < 0 || n4 < 0 || n3 < 0 || n5 > n17 || n4 > n17 || n3 > n17 || field2240[3] < 0 || field2240[3] > n17) {
                SceneTileModel.field1957.field2308 = true;
            }
            if (this.faceTextures != null && this.faceTextures[n] != -1) {
                int n18;
                int n19;
                int n20;
                int n21;
                if (this.field2237 == null || this.field2237[n] == -1) {
                    n21 = n9;
                    n20 = n10;
                    n19 = n11;
                } else {
                    n18 = this.field2237[n] & 0xFF;
                    n21 = this.field2208[n18];
                    n20 = this.field2241[n18];
                    n19 = this.field2210[n18];
                }
                n18 = this.faceTextures[n];
                if (this.faceColors3[n] != -1) {
                    SceneTileModel.method4024(n2, n15, n16, n5, n4, n3, f, f2, f3, field2227[0], field2227[1], field2227[2], field2229[n21], field2229[n20], field2229[n19], field2230[n21], field2230[n20], field2230[n19], field2231[n21], field2231[n20], field2231[n19], n18);
                    SceneTileModel.method4024(n2, n16, field2258[3], n5, n3, field2240[3], f, f3, field2243[3], field2227[0], field2227[2], field2227[3], field2229[n21], field2229[n20], field2229[n19], field2230[n21], field2230[n20], field2230[n19], field2231[n21], field2231[n20], field2231[n19], n18);
                } else {
                    SceneTileModel.method4024(n2, n15, n16, n5, n4, n3, f, f2, f3, this.faceColors1[n], this.faceColors1[n], this.faceColors1[n], field2229[n21], field2229[n20], field2229[n19], field2230[n21], field2230[n20], field2230[n19], field2231[n21], field2231[n20], field2231[n19], n18);
                    SceneTileModel.method4024(n2, n16, field2258[3], n5, n3, field2240[3], f, f3, field2243[3], this.faceColors1[n], this.faceColors1[n], this.faceColors1[n], field2229[n21], field2229[n20], field2229[n19], field2230[n21], field2230[n20], field2230[n19], field2231[n21], field2231[n20], field2231[n19], n18);
                }
            } else {
                boolean bl = this.method4622(n);
                if (this.faceColors3[n] != -1 || !bl) {
                    if (this.faceColors3[n] != -1) {
                        if (!bl) {
                            SceneTileModel.method4022(n2, n15, n16, n5, n4, n3, f, f2, f3, field2227[0], field2227[1], field2227[2]);
                            SceneTileModel.method4022(n2, n16, field2258[3], n5, n3, field2240[3], f, f3, field2243[3], field2227[0], field2227[2], field2227[3]);
                        } else {
                            SceneTileModel.method4026(n2, n15, n16, n5, n4, n3, f, f2, f3, field2227[0], field2227[1], field2227[2], this.field2196, this.field2206, this.field2257, this.overrideAmount);
                            SceneTileModel.method4026(n2, n16, field2258[3], n5, n3, field2240[3], 0.0f, 0.0f, 0.0f, field2227[0], field2227[2], field2227[3], this.field2196, this.field2206, this.field2257, this.overrideAmount);
                        }
                    } else {
                        int n22 = field2213[this.faceColors1[n]];
                        SceneTileModel.method4009(n2, n15, n16, n5, n4, n3, f, f2, f3, n22);
                        SceneTileModel.method4009(n2, n16, field2258[3], n5, n3, field2240[3], f, f3, field2243[3], n22);
                    }
                } else {
                    int n23 = field2213[this.faceColors1[n]];
                    SceneTileModel.method4027(n2, n15, n16, n5, n4, n3, f, f2, f3, n23, this.field2196, this.field2257, this.field2206, this.overrideAmount);
                    SceneTileModel.method4027(n2, n16, field2258[3], n5, n3, field2240[3], f, f3, field2243[3], n23, this.field2196, this.field2257, this.field2206, this.overrideAmount);
                }
            }
        }
    }

    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="(ILqe;)V")
    void method4555(int n, class428 class4282) {
        float f = this.verticesX[n];
        float f2 = -this.verticesY[n];
        float f3 = -this.verticesZ[n];
        float f4 = 1.0f;
        this.verticesX[n] = (int)(class4282.field4761[0] * f + class4282.field4761[4] * f2 + class4282.field4761[8] * f3 + class4282.field4761[12] * f4);
        this.verticesY[n] = -((int)(class4282.field4761[1] * f + class4282.field4761[5] * f2 + class4282.field4761[9] * f3 + class4282.field4761[13] * f4));
        this.verticesZ[n] = -((int)(class4282.field4761[2] * f + class4282.field4761[6] * f2 + class4282.field4761[10] * f3 + class4282.field4761[14] * f4));
    }

    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(Lhn;I)V")
    void method4538(class184 class1842, int n) {
        if (this.field2260 == null) {
            return;
        }
        int n2 = 0;
        while (n2 < this.verticesCount) {
            int[] nArray = this.field2260[n2];
            if (nArray != null && nArray.length != 0) {
                int[] nArray2 = this.field2214[n2];
                field2242.method8368();
                int n3 = 0;
                while (true) {
                    if (n3 >= nArray.length) {
                        this.method4555(n2, field2242);
                        break;
                    }
                    int n4 = nArray[n3];
                    class133 class1332 = class1842.method4108(n4);
                    if (class1332 != null) {
                        field2189.method8375((float)nArray2[n3] / 255.0f);
                        field2190.method8374(class1332.method3403(n));
                        field2190.method8389(field2189);
                        field2242.method8377(field2190);
                    }
                    ++n3;
                }
            }
            ++n2;
        }
        return;
    }

    @Override
    @ObfuscatedName(value="eq")
    void vmethod4616(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, long l, int n10, int n11, boolean bl) {
        int n12 = SceneTileModel.field1954[n2];
        int n13 = SceneTileModel.Rasterizer3D_cosine[n2];
        int n14 = SceneTileModel.field1954[n3];
        int n15 = SceneTileModel.Rasterizer3D_cosine[n3];
        this.draw(n, n12, n13, n14, n15, n4 - n7, n5 - n8, n6 - n9, l);
    }

    @Override
    @ObfuscatedName(value="kl")
    @ObfuscatedSignature(descriptor="(ILqe;IIIJ)V")
    void vmethod4565(int n, class428 class4282, int n2, int n3, int n4, long l) {
        int n5;
        int n6;
        int n7;
        int n8;
        if (this.boundsType != 1) {
            this.calculateBoundsCylinder();
        }
        this.calculateBoundingBox(n);
        class422 class4222 = new class422();
        class4222.field4728.method8332((float)n * 0.0030679614f, 0.0f, 0.0f);
        class4222.field4732.method8285(1.0f, 1.0f, 1.0f);
        class4222.field4729.method8285(n2, n3, n4);
        class428 class4283 = AbstractWorldMapData.method6389();
        class4283.method8379(class4222);
        class4283.method8389(class4282);
        int n9 = (int)class4283.method8452(0.0f, 0.0f, 0.0f);
        boolean bl = false;
        int n10 = n9 - this.radius;
        boolean bl2 = n10 <= 50 || this.faceTextures != null;
        int n11 = SceneTileModel.method4008();
        int n12 = SceneTileModel.method4048();
        for (n8 = 0; n8 < this.verticesCount; ++n8) {
            n7 = this.verticesX[n8];
            n6 = this.verticesY[n8];
            n5 = this.verticesZ[n8];
            class4283.method8385(n7, n6, n5, field2261);
            n7 = (int)field2261[0];
            n6 = (int)field2261[1];
            n5 = (int)field2261[2];
            bl |= this.method4566(n8, n7, n6, n5, n9, n11, n12, bl2);
        }
        n8 = Login.method2449() ? 1 : 0;
        if (n8 != 0) {
            int n13 = n6 = l != 0L ? 1 : 0;
            if (n6 != 0) {
                n5 = (int)(l >>> 16 & 1L) == 1 ? 1 : 0;
                n6 = n5 == 0 ? 1 : 0;
            }
            n8 = n7 = n6;
        }
        n7 = n8;
        class4222.method8253();
        class4283.method8373();
        try {
            this.draw0(bl, n7 != 0, this.isSingleTile, l);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

