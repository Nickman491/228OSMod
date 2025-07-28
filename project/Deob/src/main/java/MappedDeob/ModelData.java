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

@ObfuscatedName(value="gx")
@Implements(value="ModelData")
public class ModelData
extends Renderable {
    @ObfuscatedName(value="bc")
    static int[] field1888 = new int[10000];
    @ObfuscatedName(value="bv")
    static int[] field1853 = new int[10000];
    @ObfuscatedName(value="bq")
    static int field1890 = 0;
    @ObfuscatedName(value="ba")
    @Export(value="ModelData_sine")
    static int[] ModelData_sine = SceneTileModel.field1954;
    @ObfuscatedName(value="bk")
    @Export(value="ModelData_cosine")
    static int[] ModelData_cosine = SceneTileModel.Rasterizer3D_cosine;
    @ObfuscatedName(value="ao")
    @Export(value="verticesCount")
    int verticesCount = 0;
    @ObfuscatedName(value="ad")
    @Export(value="verticesX")
    int[] verticesX;
    @ObfuscatedName(value="an")
    @Export(value="verticesY")
    int[] verticesY;
    @ObfuscatedName(value="ae")
    @Export(value="verticesZ")
    int[] verticesZ;
    @ObfuscatedName(value="ax")
    @Export(value="faceCount")
    int faceCount = 0;
    @ObfuscatedName(value="at")
    @Export(value="indices1")
    int[] indices1;
    @ObfuscatedName(value="ac")
    @Export(value="indices2")
    int[] indices2;
    @ObfuscatedName(value="au")
    @Export(value="indices3")
    int[] indices3;
    @ObfuscatedName(value="as")
    @Export(value="faceRenderTypes")
    byte[] faceRenderTypes;
    @ObfuscatedName(value="aq")
    @Export(value="faceRenderPriorities")
    byte[] faceRenderPriorities;
    @ObfuscatedName(value="af")
    @Export(value="faceAlphas")
    byte[] faceAlphas;
    @ObfuscatedName(value="aa")
    @Export(value="textureCoords")
    byte[] textureCoords;
    @ObfuscatedName(value="ak")
    @Export(value="faceColors")
    short[] faceColors;
    @ObfuscatedName(value="al")
    @Export(value="faceTextures")
    short[] faceTextures;
    @ObfuscatedName(value="av")
    @Export(value="priority")
    byte priority = 0;
    @ObfuscatedName(value="ag")
    @Export(value="textureTriangleCount")
    int textureTriangleCount;
    @ObfuscatedName(value="aw")
    @Export(value="textureRenderTypes")
    byte[] textureRenderTypes;
    @ObfuscatedName(value="ai")
    @Export(value="texTriangleX")
    short[] texTriangleX;
    @ObfuscatedName(value="ar")
    @Export(value="texTriangleY")
    short[] texTriangleY;
    @ObfuscatedName(value="am")
    @Export(value="texTriangleZ")
    short[] texTriangleZ;
    @ObfuscatedName(value="ap")
    @Export(value="vertexSkins")
    int[] vertexSkins;
    @ObfuscatedName(value="ab")
    @Export(value="faceSkins")
    int[] faceSkins;
    @ObfuscatedName(value="aj")
    @Export(value="vertexLabels")
    int[][] vertexLabels;
    @ObfuscatedName(value="bu")
    @Export(value="faceLabelsAlpha")
    int[][] faceLabelsAlpha;
    @ObfuscatedName(value="bh")
    int[][] field1875;
    @ObfuscatedName(value="bw")
    int[][] field1876;
    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="[Lhi;")
    @Export(value="faceNormals")
    FaceNormal[] faceNormals;
    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="[Lhd;")
    @Export(value="vertexNormals")
    VertexNormal[] vertexNormals;
    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="[Lhd;")
    @Export(value="vertexVertices")
    VertexNormal[] vertexVertices;
    @ObfuscatedName(value="bi")
    @Export(value="ambient")
    public short ambient;
    @ObfuscatedName(value="bz")
    @Export(value="contrast")
    public short contrast;
    @ObfuscatedName(value="bt")
    @Export(value="isBoundsCalculated")
    boolean isBoundsCalculated = false;
    @ObfuscatedName(value="bf")
    int field1863;
    @ObfuscatedName(value="by")
    int field1884;
    @ObfuscatedName(value="bm")
    int field1885;
    @ObfuscatedName(value="bp")
    int field1886;
    @ObfuscatedName(value="bg")
    int field1887;

    ModelData() {
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @ObfuscatedSignature(descriptor="([Lgx;I)V")
    public ModelData(ModelData[] modelDataArray, int n) {
        ModelData modelData;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        this.verticesCount = 0;
        this.faceCount = 0;
        this.textureTriangleCount = 0;
        this.priority = (byte)-1;
        int n2 = 0;
        while (true) {
            block24: {
                block25: {
                    block23: {
                        if (n2 >= n) break block23;
                        modelData = modelDataArray[n2];
                        if (modelData == null) break block24;
                        break block25;
                    }
                    this.verticesX = new int[this.verticesCount];
                    this.verticesY = new int[this.verticesCount];
                    this.verticesZ = new int[this.verticesCount];
                    this.vertexSkins = new int[this.verticesCount];
                    this.indices1 = new int[this.faceCount];
                    this.indices2 = new int[this.faceCount];
                    this.indices3 = new int[this.faceCount];
                    if (bl) {
                        this.faceRenderTypes = new byte[this.faceCount];
                    }
                    if (bl2) {
                        this.faceRenderPriorities = new byte[this.faceCount];
                    }
                    if (bl3) {
                        this.faceAlphas = new byte[this.faceCount];
                    }
                    if (bl4) {
                        this.faceSkins = new int[this.faceCount];
                    }
                    if (bl5) {
                        this.faceTextures = new short[this.faceCount];
                    }
                    if (bl6) {
                        this.textureCoords = new byte[this.faceCount];
                    }
                    if (bl7) {
                        this.field1875 = new int[this.verticesCount][];
                        this.field1876 = new int[this.verticesCount][];
                    }
                    this.faceColors = new short[this.faceCount];
                    if (this.textureTriangleCount > 0) {
                        this.textureRenderTypes = new byte[this.textureTriangleCount];
                        this.texTriangleX = new short[this.textureTriangleCount];
                        this.texTriangleY = new short[this.textureTriangleCount];
                        this.texTriangleZ = new short[this.textureTriangleCount];
                    }
                    break;
                }
                this.verticesCount += modelData.verticesCount;
                this.faceCount += modelData.faceCount;
                this.textureTriangleCount += modelData.textureTriangleCount;
                if (modelData.faceRenderPriorities != null) {
                    bl2 = true;
                } else {
                    if (this.priority == -1) {
                        this.priority = modelData.priority;
                    }
                    if (this.priority != modelData.priority) {
                        bl2 = true;
                    }
                }
                bl |= modelData.faceRenderTypes != null;
                bl3 |= modelData.faceAlphas != null;
                bl4 |= modelData.faceSkins != null;
                bl5 |= modelData.faceTextures != null;
                bl6 |= modelData.textureCoords != null;
                bl7 |= modelData.field1875 != null;
            }
            ++n2;
        }
        this.verticesCount = 0;
        this.faceCount = 0;
        this.textureTriangleCount = 0;
        n2 = 0;
        block1: while (n2 < n) {
            boolean bl8 = true;
            while (true) {
                int n3;
                block29: {
                    block30: {
                        block27: {
                            block28: {
                                block26: {
                                    if (!bl8 || (bl8 = false)) break block26;
                                    modelData = modelDataArray[n2];
                                    if (modelData == null) break block27;
                                    n3 = 0;
                                }
                                if (n3 >= modelData.faceCount) break block28;
                                if (!bl) break block29;
                                break block30;
                            }
                            for (n3 = 0; n3 < modelData.textureTriangleCount; ++this.textureTriangleCount, ++n3) {
                                this.textureRenderTypes[this.textureTriangleCount] = modelData.textureRenderTypes[n3];
                                byte by = this.textureRenderTypes[this.textureTriangleCount];
                                if (by != 0) continue;
                                this.texTriangleX[this.textureTriangleCount] = (short)this.method3898(modelData, modelData.texTriangleX[n3]);
                                this.texTriangleY[this.textureTriangleCount] = (short)this.method3898(modelData, modelData.texTriangleY[n3]);
                                this.texTriangleZ[this.textureTriangleCount] = (short)this.method3898(modelData, modelData.texTriangleZ[n3]);
                            }
                        }
                        ++n2;
                        continue block1;
                    }
                    if (modelData.faceRenderTypes != null) {
                        this.faceRenderTypes[this.faceCount] = modelData.faceRenderTypes[n3];
                    }
                }
                if (bl2) {
                    this.faceRenderPriorities[this.faceCount] = modelData.faceRenderPriorities != null ? modelData.faceRenderPriorities[n3] : modelData.priority;
                }
                if (bl3 && modelData.faceAlphas != null) {
                    this.faceAlphas[this.faceCount] = modelData.faceAlphas[n3];
                }
                if (bl4 && modelData.faceSkins != null) {
                    this.faceSkins[this.faceCount] = modelData.faceSkins[n3];
                }
                if (bl5) {
                    this.faceTextures[this.faceCount] = modelData.faceTextures != null ? modelData.faceTextures[n3] : -1;
                }
                if (bl6) {
                    this.textureCoords[this.faceCount] = modelData.textureCoords != null && modelData.textureCoords[n3] != -1 ? (int)(this.textureTriangleCount + modelData.textureCoords[n3]) : -1;
                }
                this.faceColors[this.faceCount] = modelData.faceColors[n3];
                this.indices1[this.faceCount] = this.method3898(modelData, modelData.indices1[n3]);
                this.indices2[this.faceCount] = this.method3898(modelData, modelData.indices2[n3]);
                this.indices3[this.faceCount] = this.method3898(modelData, modelData.indices3[n3]);
                ++this.faceCount;
                ++n3;
            }
            break;
        }
        return;
    }

    ModelData(byte[] byArray) {
        if (byArray[byArray.length - 1] == -3 && byArray[byArray.length - 2] == -1) {
            this.method3892(byArray);
        } else if (byArray[byArray.length - 1] == -2 && byArray[byArray.length - 2] == -1) {
            this.method3921(byArray);
        } else if (byArray[byArray.length - 1] == -1 && byArray[byArray.length - 2] == -1) {
            this.method3895(byArray);
        } else {
            this.method3906(byArray);
        }
    }

    @ObfuscatedSignature(descriptor="(Lgx;ZZZZ)V", garbageValue="1")
    public ModelData(ModelData modelData, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        int n;
        this.verticesCount = modelData.verticesCount;
        this.faceCount = modelData.faceCount;
        this.textureTriangleCount = modelData.textureTriangleCount;
        if (!bl) {
            this.verticesX = new int[this.verticesCount];
            this.verticesY = new int[this.verticesCount];
            this.verticesZ = new int[this.verticesCount];
            for (n = 0; n < this.verticesCount; ++n) {
                this.verticesX[n] = modelData.verticesX[n];
                this.verticesY[n] = modelData.verticesY[n];
                this.verticesZ[n] = modelData.verticesZ[n];
            }
        } else {
            this.verticesX = modelData.verticesX;
            this.verticesY = modelData.verticesY;
            this.verticesZ = modelData.verticesZ;
        }
        if (bl2) {
            this.faceColors = modelData.faceColors;
        } else {
            this.faceColors = new short[this.faceCount];
            for (n = 0; n < this.faceCount; ++n) {
                this.faceColors[n] = modelData.faceColors[n];
            }
        }
        if (!bl3 && modelData.faceTextures != null) {
            this.faceTextures = new short[this.faceCount];
            for (n = 0; n < this.faceCount; ++n) {
                this.faceTextures[n] = modelData.faceTextures[n];
            }
        } else {
            this.faceTextures = modelData.faceTextures;
        }
        this.faceAlphas = modelData.faceAlphas;
        this.indices1 = modelData.indices1;
        this.indices2 = modelData.indices2;
        this.indices3 = modelData.indices3;
        this.faceRenderTypes = modelData.faceRenderTypes;
        this.faceRenderPriorities = modelData.faceRenderPriorities;
        this.textureCoords = modelData.textureCoords;
        this.priority = modelData.priority;
        this.textureRenderTypes = modelData.textureRenderTypes;
        this.texTriangleX = modelData.texTriangleX;
        this.texTriangleY = modelData.texTriangleY;
        this.texTriangleZ = modelData.texTriangleZ;
        this.vertexSkins = modelData.vertexSkins;
        this.faceSkins = modelData.faceSkins;
        this.vertexLabels = modelData.vertexLabels;
        this.faceLabelsAlpha = modelData.faceLabelsAlpha;
        this.vertexNormals = modelData.vertexNormals;
        this.faceNormals = modelData.faceNormals;
        this.vertexVertices = modelData.vertexVertices;
        this.field1875 = modelData.field1875;
        this.field1876 = modelData.field1876;
        this.ambient = modelData.ambient;
        this.contrast = modelData.contrast;
    }

    public ModelData(int n, int n2, int n3) {
        this.verticesX = new int[n];
        this.verticesY = new int[n];
        this.verticesZ = new int[n];
        this.vertexSkins = new int[n];
        this.indices1 = new int[n2];
        this.indices2 = new int[n2];
        this.indices3 = new int[n2];
        this.faceRenderTypes = new byte[n2];
        this.faceRenderPriorities = new byte[n2];
        this.faceAlphas = new byte[n2];
        this.faceColors = new short[n2];
        this.faceTextures = new short[n2];
        this.textureCoords = new byte[n2];
        this.faceSkins = new int[n2];
        if (n3 > 0) {
            this.textureRenderTypes = new byte[n3];
            this.texTriangleX = new short[n3];
            this.texTriangleY = new short[n3];
            this.texTriangleZ = new short[n3];
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ah")
    void method3892(byte[] byArray) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        int n19;
        int n20;
        int n21;
        int n22;
        int n23;
        int n24;
        int n25;
        int n26;
        int n27;
        int n28;
        int n29;
        Buffer buffer;
        Buffer buffer2;
        Buffer buffer3;
        Buffer buffer4;
        Buffer buffer5;
        Buffer buffer6;
        Buffer buffer7;
        block40: {
            int n30;
            int n31;
            buffer7 = new Buffer(byArray);
            buffer6 = new Buffer(byArray);
            buffer5 = new Buffer(byArray);
            buffer4 = new Buffer(byArray);
            buffer3 = new Buffer(byArray);
            buffer2 = new Buffer(byArray);
            buffer = new Buffer(byArray);
            buffer7.offset = byArray.length - 26;
            int n32 = buffer7.readUnsignedShort();
            n29 = buffer7.readUnsignedShort();
            n28 = buffer7.readUnsignedByte();
            n27 = buffer7.readUnsignedByte();
            n26 = buffer7.readUnsignedByte();
            n25 = buffer7.readUnsignedByte();
            n24 = buffer7.readUnsignedByte();
            n23 = buffer7.readUnsignedByte();
            int n33 = buffer7.readUnsignedByte();
            int n34 = buffer7.readUnsignedByte();
            int n35 = buffer7.readUnsignedShort();
            int n36 = buffer7.readUnsignedShort();
            int n37 = buffer7.readUnsignedShort();
            int n38 = buffer7.readUnsignedShort();
            int n39 = buffer7.readUnsignedShort();
            int n40 = buffer7.readUnsignedShort();
            int n41 = 0;
            int n42 = 0;
            int n43 = 0;
            if (n28 > 0) {
                this.textureRenderTypes = new byte[n28];
                buffer7.offset = 0;
                for (n31 = 0; n31 < n28; ++n31) {
                    this.textureRenderTypes[n31] = buffer7.readByte();
                    n30 = this.textureRenderTypes[n31];
                    if (n30 == 0) {
                        ++n41;
                    }
                    if (n30 >= 1 && n30 <= 3) {
                        ++n42;
                    }
                    if (n30 != 2) continue;
                    ++n43;
                }
            }
            n30 = n31 = n28;
            n22 = n31 += n32;
            if (n27 == 1) {
                n31 += n29;
            }
            n21 = n31;
            n20 = n31 += n29;
            if (n26 == 255) {
                n31 += n29;
            }
            n19 = n31;
            if (n24 == 1) {
                n31 += n29;
            }
            int n44 = n31;
            n18 = n31 += n40;
            if (n25 == 1) {
                n31 += n29;
            }
            n17 = n31;
            n16 = n31 += n38;
            if (n23 == 1) {
                n31 = n29 * 2 + n31;
            }
            n15 = n31;
            n14 = n31 += n39;
            int n45 = n31 = n29 * 2 + n31;
            int n46 = n31 += n35;
            int n47 = n31 += n36;
            n13 = n31 += n37;
            n12 = n31 = n41 * 6 + n31;
            n11 = n31 = n42 * 6 + n31;
            n10 = n31 = n42 * 6 + n31;
            n9 = n31 = n42 * 2 + n31;
            n8 = n31 += n42;
            n7 = n31 = n42 * 2 + n43 * 2 + n31;
            this.verticesCount = n32;
            this.faceCount = n29;
            this.textureTriangleCount = n28;
            this.verticesX = new int[n32];
            this.verticesY = new int[n32];
            this.verticesZ = new int[n32];
            this.indices1 = new int[n29];
            this.indices2 = new int[n29];
            this.indices3 = new int[n29];
            if (n33 == 1) {
                this.vertexSkins = new int[n32];
            }
            if (n27 == 1) {
                this.faceRenderTypes = new byte[n29];
            }
            if (n26 == 255) {
                this.faceRenderPriorities = new byte[n29];
            } else {
                this.priority = (byte)n26;
            }
            if (n25 == 1) {
                this.faceAlphas = new byte[n29];
            }
            if (n24 == 1) {
                this.faceSkins = new int[n29];
            }
            if (n23 == 1) {
                this.faceTextures = new short[n29];
            }
            if (n23 == 1 && n28 > 0) {
                this.textureCoords = new byte[n29];
            }
            if (n34 == 1) {
                this.field1875 = new int[n32][];
                this.field1876 = new int[n32][];
            }
            this.faceColors = new short[n29];
            if (n28 > 0) {
                this.texTriangleX = new short[n28];
                this.texTriangleY = new short[n28];
                this.texTriangleZ = new short[n28];
            }
            buffer7.offset = n30;
            buffer6.offset = n45;
            buffer5.offset = n46;
            buffer4.offset = n47;
            buffer3.offset = n44;
            int n48 = 0;
            int n49 = 0;
            int n50 = 0;
            n6 = 0;
            while (true) {
                block42: {
                    block43: {
                        block41: {
                            if (n6 >= n32) break block41;
                            n5 = buffer7.readUnsignedByte();
                            n4 = 0;
                            if ((n5 & 1) == 0) break block42;
                            break block43;
                        }
                        if (n34 == 1) {
                            break;
                        }
                        break block40;
                    }
                    n4 = buffer6.readShortSmart();
                }
                n3 = 0;
                if ((n5 & 2) != 0) {
                    n3 = buffer5.readShortSmart();
                }
                n2 = 0;
                if ((n5 & 4) != 0) {
                    n2 = buffer4.readShortSmart();
                }
                this.verticesX[n6] = n48 + n4;
                this.verticesY[n6] = n49 + n3;
                this.verticesZ[n6] = n50 + n2;
                n48 = this.verticesX[n6];
                n49 = this.verticesY[n6];
                n50 = this.verticesZ[n6];
                if (n33 == 1) {
                    this.vertexSkins[n6] = buffer3.readUnsignedByte();
                }
                ++n6;
            }
            for (n6 = 0; n6 < n32; ++n6) {
                n5 = buffer3.readUnsignedByte();
                this.field1875[n6] = new int[n5];
                this.field1876[n6] = new int[n5];
                for (n4 = 0; n4 < n5; ++n4) {
                    this.field1875[n6][n4] = buffer3.readUnsignedByte();
                    this.field1876[n6][n4] = buffer3.readUnsignedByte();
                }
            }
        }
        buffer7.offset = n14;
        buffer6.offset = n22;
        buffer5.offset = n20;
        buffer4.offset = n18;
        buffer3.offset = n19;
        buffer2.offset = n16;
        buffer.offset = n15;
        n6 = 0;
        while (true) {
            if (n6 >= n29) break;
            this.faceColors[n6] = (short)buffer7.readUnsignedShort();
            if (n27 == 1) {
                this.faceRenderTypes[n6] = buffer6.readByte();
            }
            if (n26 == 255) {
                this.faceRenderPriorities[n6] = buffer5.readByte();
            }
            if (n25 == 1) {
                this.faceAlphas[n6] = buffer4.readByte();
            }
            if (n24 == 1) {
                this.faceSkins[n6] = buffer3.readUnsignedByte();
            }
            if (n23 == 1) {
                this.faceTextures[n6] = (short)(buffer2.readUnsignedShort() - 1);
            }
            if (this.textureCoords != null && this.faceTextures[n6] != -1) {
                this.textureCoords[n6] = (byte)(buffer.readUnsignedByte() - 1);
            }
            ++n6;
        }
        buffer7.offset = n17;
        buffer6.offset = n21;
        n6 = 0;
        n5 = 0;
        n4 = 0;
        n3 = 0;
        n2 = 0;
        while (true) {
            if (n2 >= n29) break;
            n = buffer6.readUnsignedByte();
            if (n == 1) {
                n3 = n6 = buffer7.readShortSmart() + n3;
                n3 = n5 = buffer7.readShortSmart() + n3;
                n3 = n4 = buffer7.readShortSmart() + n3;
                this.indices1[n2] = n6;
                this.indices2[n2] = n5;
                this.indices3[n2] = n4;
            }
            if (n == 2) {
                n5 = n4;
                n3 = n4 = buffer7.readShortSmart() + n3;
                this.indices1[n2] = n6;
                this.indices2[n2] = n5;
                this.indices3[n2] = n4;
            }
            if (n == 3) {
                n6 = n4;
                n3 = n4 = buffer7.readShortSmart() + n3;
                this.indices1[n2] = n6;
                this.indices2[n2] = n5;
                this.indices3[n2] = n4;
            }
            if (n == 4) {
                int n51 = n6;
                n6 = n5;
                n5 = n51;
                n3 = n4 = buffer7.readShortSmart() + n3;
                this.indices1[n2] = n6;
                this.indices2[n2] = n5;
                this.indices3[n2] = n4;
            }
            ++n2;
        }
        buffer7.offset = n13;
        buffer6.offset = n12;
        buffer5.offset = n11;
        buffer4.offset = n10;
        buffer3.offset = n9;
        buffer2.offset = n8;
        n2 = 0;
        while (true) {
            block45: {
                block46: {
                    block44: {
                        if (n2 >= n28) break block44;
                        n = this.textureRenderTypes[n2] & 0xFF;
                        if (n != 0) break block45;
                        break block46;
                    }
                    buffer7.offset = n7;
                    n2 = buffer7.readUnsignedByte();
                    if (n2 != 0) {
                        new ModelData0();
                        buffer7.readUnsignedShort();
                        buffer7.readUnsignedShort();
                        buffer7.readUnsignedShort();
                        buffer7.readInt();
                    }
                    return;
                }
                this.texTriangleX[n2] = (short)buffer7.readUnsignedShort();
                this.texTriangleY[n2] = (short)buffer7.readUnsignedShort();
                this.texTriangleZ[n2] = (short)buffer7.readUnsignedShort();
            }
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="az")
    void method3921(byte[] byArray) {
        boolean bl;
        boolean bl2;
        block37: {
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            int n16;
            int n17;
            int n18;
            int n19;
            int n20;
            int n21;
            Buffer buffer;
            Buffer buffer2;
            Buffer buffer3;
            Buffer buffer4;
            Buffer buffer5;
            block36: {
                int n22;
                bl2 = false;
                bl = false;
                buffer5 = new Buffer(byArray);
                buffer4 = new Buffer(byArray);
                buffer3 = new Buffer(byArray);
                buffer2 = new Buffer(byArray);
                buffer = new Buffer(byArray);
                buffer5.offset = byArray.length - 23;
                int n23 = buffer5.readUnsignedShort();
                n21 = buffer5.readUnsignedShort();
                n20 = buffer5.readUnsignedByte();
                n19 = buffer5.readUnsignedByte();
                n18 = buffer5.readUnsignedByte();
                n17 = buffer5.readUnsignedByte();
                n16 = buffer5.readUnsignedByte();
                int n24 = buffer5.readUnsignedByte();
                int n25 = buffer5.readUnsignedByte();
                int n26 = buffer5.readUnsignedShort();
                int n27 = buffer5.readUnsignedShort();
                int n28 = buffer5.readUnsignedShort();
                int n29 = buffer5.readUnsignedShort();
                int n30 = buffer5.readUnsignedShort();
                int n31 = n22 = 0;
                n15 = n22 += n23;
                n14 = n22 += n21;
                if (n18 == 255) {
                    n22 += n21;
                }
                n13 = n22;
                if (n16 == 1) {
                    n22 += n21;
                }
                n12 = n22;
                if (n19 == 1) {
                    n22 += n21;
                }
                int n32 = n22;
                n11 = n22 += n30;
                if (n17 == 1) {
                    n22 += n21;
                }
                n10 = n22;
                n9 = n22 += n29;
                n8 = n22 = n21 * 2 + n22;
                int n33 = n22 = n20 * 6 + n22;
                int n34 = n22 += n26;
                int n35 = n22 += n27;
                n22 += n28;
                this.verticesCount = n23;
                this.faceCount = n21;
                this.textureTriangleCount = n20;
                this.verticesX = new int[n23];
                this.verticesY = new int[n23];
                this.verticesZ = new int[n23];
                this.indices1 = new int[n21];
                this.indices2 = new int[n21];
                this.indices3 = new int[n21];
                if (n20 > 0) {
                    this.textureRenderTypes = new byte[n20];
                    this.texTriangleX = new short[n20];
                    this.texTriangleY = new short[n20];
                    this.texTriangleZ = new short[n20];
                }
                if (n24 == 1) {
                    this.vertexSkins = new int[n23];
                }
                if (n19 == 1) {
                    this.faceRenderTypes = new byte[n21];
                    this.textureCoords = new byte[n21];
                    this.faceTextures = new short[n21];
                }
                if (n18 == 255) {
                    this.faceRenderPriorities = new byte[n21];
                } else {
                    this.priority = (byte)n18;
                }
                if (n17 == 1) {
                    this.faceAlphas = new byte[n21];
                }
                if (n16 == 1) {
                    this.faceSkins = new int[n21];
                }
                if (n25 == 1) {
                    this.field1875 = new int[n23][];
                    this.field1876 = new int[n23][];
                }
                this.faceColors = new short[n21];
                buffer5.offset = n31;
                buffer4.offset = n33;
                buffer3.offset = n34;
                buffer2.offset = n35;
                buffer.offset = n32;
                int n36 = 0;
                int n37 = 0;
                int n38 = 0;
                n7 = 0;
                while (true) {
                    block39: {
                        block40: {
                            block38: {
                                if (n7 >= n23) break block38;
                                n6 = buffer5.readUnsignedByte();
                                n5 = 0;
                                if ((n6 & 1) == 0) break block39;
                                break block40;
                            }
                            if (n25 == 1) {
                                break;
                            }
                            break block36;
                        }
                        n5 = buffer4.readShortSmart();
                    }
                    n4 = 0;
                    if ((n6 & 2) != 0) {
                        n4 = buffer3.readShortSmart();
                    }
                    n3 = 0;
                    if ((n6 & 4) != 0) {
                        n3 = buffer2.readShortSmart();
                    }
                    this.verticesX[n7] = n36 + n5;
                    this.verticesY[n7] = n37 + n4;
                    this.verticesZ[n7] = n38 + n3;
                    n36 = this.verticesX[n7];
                    n37 = this.verticesY[n7];
                    n38 = this.verticesZ[n7];
                    if (n24 == 1) {
                        this.vertexSkins[n7] = buffer.readUnsignedByte();
                    }
                    ++n7;
                }
                n7 = 0;
                while (true) {
                    if (n7 >= n23) break;
                    n6 = buffer.readUnsignedByte();
                    this.field1875[n7] = new int[n6];
                    this.field1876[n7] = new int[n6];
                    for (n5 = 0; n5 < n6; ++n5) {
                        this.field1875[n7][n5] = buffer.readUnsignedByte();
                        this.field1876[n7][n5] = buffer.readUnsignedByte();
                    }
                    ++n7;
                }
            }
            buffer5.offset = n9;
            buffer4.offset = n12;
            buffer3.offset = n14;
            buffer2.offset = n11;
            buffer.offset = n13;
            n7 = 0;
            while (true) {
                block41: {
                    block43: {
                        block42: {
                            if (n7 >= n21) break;
                            this.faceColors[n7] = (short)buffer5.readUnsignedShort();
                            if (n19 != 1) break block41;
                            n6 = buffer4.readUnsignedByte();
                            if ((n6 & 1) == 1) {
                                this.faceRenderTypes[n7] = 1;
                                bl2 = true;
                            } else {
                                this.faceRenderTypes[n7] = 0;
                            }
                            if ((n6 & 2) != 2) break block42;
                            this.textureCoords[n7] = (byte)(n6 >> 2);
                            this.faceTextures[n7] = this.faceColors[n7];
                            this.faceColors[n7] = 127;
                            if (this.faceTextures[n7] == -1) break block41;
                            break block43;
                        }
                        this.textureCoords[n7] = -1;
                        this.faceTextures[n7] = -1;
                        break block41;
                    }
                    bl = true;
                }
                if (n18 == 255) {
                    this.faceRenderPriorities[n7] = buffer3.readByte();
                }
                if (n17 == 1) {
                    this.faceAlphas[n7] = buffer2.readByte();
                }
                if (n16 == 1) {
                    this.faceSkins[n7] = buffer.readUnsignedByte();
                }
                ++n7;
            }
            buffer5.offset = n10;
            buffer4.offset = n15;
            n7 = 0;
            n6 = 0;
            n5 = 0;
            n4 = 0;
            n3 = 0;
            while (true) {
                block45: {
                    block46: {
                        block44: {
                            if (n3 >= n21) break block44;
                            n2 = buffer4.readUnsignedByte();
                            if (n2 != 1) break block45;
                            break block46;
                        }
                        buffer5.offset = n8;
                        for (n3 = 0; n3 < n20; ++n3) {
                            this.textureRenderTypes[n3] = 0;
                            this.texTriangleX[n3] = (short)buffer5.readUnsignedShort();
                            this.texTriangleY[n3] = (short)buffer5.readUnsignedShort();
                            this.texTriangleZ[n3] = (short)buffer5.readUnsignedShort();
                        }
                        if (this.textureCoords != null) {
                            break;
                        }
                        break block37;
                    }
                    n4 = n7 = buffer5.readShortSmart() + n4;
                    n4 = n6 = buffer5.readShortSmart() + n4;
                    n4 = n5 = buffer5.readShortSmart() + n4;
                    this.indices1[n3] = n7;
                    this.indices2[n3] = n6;
                    this.indices3[n3] = n5;
                }
                if (n2 == 2) {
                    n6 = n5;
                    n4 = n5 = buffer5.readShortSmart() + n4;
                    this.indices1[n3] = n7;
                    this.indices2[n3] = n6;
                    this.indices3[n3] = n5;
                }
                if (n2 == 3) {
                    n7 = n5;
                    n4 = n5 = buffer5.readShortSmart() + n4;
                    this.indices1[n3] = n7;
                    this.indices2[n3] = n6;
                    this.indices3[n3] = n5;
                }
                if (n2 == 4) {
                    n = n7;
                    n7 = n6;
                    n6 = n;
                    n4 = n5 = buffer5.readShortSmart() + n4;
                    this.indices1[n3] = n7;
                    this.indices2[n3] = n6;
                    this.indices3[n3] = n5;
                }
                ++n3;
            }
            n3 = 0;
            n2 = 0;
            while (true) {
                block48: {
                    block49: {
                        block47: {
                            if (n2 >= n21) break block47;
                            n = this.textureCoords[n2] & 0xFF;
                            if (n == 255) break block48;
                            break block49;
                        }
                        if (n3 != 0) break;
                        this.textureCoords = null;
                        break;
                    }
                    if (this.indices1[n2] == (this.texTriangleX[n] & 0xFFFF) && this.indices2[n2] == (this.texTriangleY[n] & 0xFFFF) && this.indices3[n2] == (this.texTriangleZ[n] & 0xFFFF)) {
                        this.textureCoords[n2] = -1;
                    } else {
                        n3 = 1;
                    }
                }
                ++n2;
            }
        }
        if (!bl) {
            this.faceTextures = null;
        }
        if (!bl2) {
            this.faceRenderTypes = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ao")
    void method3895(byte[] byArray) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        Buffer buffer = new Buffer(byArray);
        Buffer buffer2 = new Buffer(byArray);
        Buffer buffer3 = new Buffer(byArray);
        Buffer buffer4 = new Buffer(byArray);
        Buffer buffer5 = new Buffer(byArray);
        Buffer buffer6 = new Buffer(byArray);
        Buffer buffer7 = new Buffer(byArray);
        buffer.offset = byArray.length - 23;
        int n8 = buffer.readUnsignedShort();
        int n9 = buffer.readUnsignedShort();
        int n10 = buffer.readUnsignedByte();
        int n11 = buffer.readUnsignedByte();
        int n12 = buffer.readUnsignedByte();
        int n13 = buffer.readUnsignedByte();
        int n14 = buffer.readUnsignedByte();
        int n15 = buffer.readUnsignedByte();
        int n16 = buffer.readUnsignedByte();
        int n17 = buffer.readUnsignedShort();
        int n18 = buffer.readUnsignedShort();
        int n19 = buffer.readUnsignedShort();
        int n20 = buffer.readUnsignedShort();
        int n21 = buffer.readUnsignedShort();
        int n22 = 0;
        int n23 = 0;
        int n24 = 0;
        if (n10 > 0) {
            this.textureRenderTypes = new byte[n10];
            buffer.offset = 0;
            for (n7 = 0; n7 < n10; ++n7) {
                this.textureRenderTypes[n7] = buffer.readByte();
                n6 = this.textureRenderTypes[n7];
                if (n6 == 0) {
                    ++n22;
                }
                if (n6 >= 1 && n6 <= 3) {
                    ++n23;
                }
                if (n6 != 2) continue;
                ++n24;
            }
        }
        n6 = n7 = n10;
        int n25 = n7 += n8;
        if (n11 == 1) {
            n7 += n9;
        }
        int n26 = n7;
        int n27 = n7 += n9;
        if (n12 == 255) {
            n7 += n9;
        }
        int n28 = n7;
        if (n14 == 1) {
            n7 += n9;
        }
        int n29 = n7;
        if (n16 == 1) {
            n7 += n8;
        }
        int n30 = n7;
        if (n13 == 1) {
            n7 += n9;
        }
        int n31 = n7;
        int n32 = n7 += n20;
        if (n15 == 1) {
            n7 = n9 * 2 + n7;
        }
        int n33 = n7;
        int n34 = n7 += n21;
        int n35 = n7 = n9 * 2 + n7;
        int n36 = n7 += n17;
        int n37 = n7 += n18;
        int n38 = n7 += n19;
        int n39 = n7 = n22 * 6 + n7;
        int n40 = n7 = n23 * 6 + n7;
        int n41 = n7 = n23 * 6 + n7;
        int n42 = n7 = n23 * 2 + n7;
        int n43 = n7 += n23;
        int n44 = n7 = n23 * 2 + n24 * 2 + n7;
        this.verticesCount = n8;
        this.faceCount = n9;
        this.textureTriangleCount = n10;
        this.verticesX = new int[n8];
        this.verticesY = new int[n8];
        this.verticesZ = new int[n8];
        this.indices1 = new int[n9];
        this.indices2 = new int[n9];
        this.indices3 = new int[n9];
        if (n16 == 1) {
            this.vertexSkins = new int[n8];
        }
        if (n11 == 1) {
            this.faceRenderTypes = new byte[n9];
        }
        if (n12 == 255) {
            this.faceRenderPriorities = new byte[n9];
        } else {
            this.priority = (byte)n12;
        }
        if (n13 == 1) {
            this.faceAlphas = new byte[n9];
        }
        if (n14 == 1) {
            this.faceSkins = new int[n9];
        }
        if (n15 == 1) {
            this.faceTextures = new short[n9];
        }
        if (n15 == 1 && n10 > 0) {
            this.textureCoords = new byte[n9];
        }
        this.faceColors = new short[n9];
        if (n10 > 0) {
            this.texTriangleX = new short[n10];
            this.texTriangleY = new short[n10];
            this.texTriangleZ = new short[n10];
        }
        buffer.offset = n6;
        buffer2.offset = n35;
        buffer3.offset = n36;
        buffer4.offset = n37;
        buffer5.offset = n29;
        int n45 = 0;
        int n46 = 0;
        int n47 = 0;
        int n48 = 0;
        while (true) {
            if (n48 >= n8) break;
            n5 = buffer.readUnsignedByte();
            n4 = 0;
            if ((n5 & 1) != 0) {
                n4 = buffer2.readShortSmart();
            }
            n3 = 0;
            if ((n5 & 2) != 0) {
                n3 = buffer3.readShortSmart();
            }
            n2 = 0;
            if ((n5 & 4) != 0) {
                n2 = buffer4.readShortSmart();
            }
            this.verticesX[n48] = n45 + n4;
            this.verticesY[n48] = n46 + n3;
            this.verticesZ[n48] = n47 + n2;
            n45 = this.verticesX[n48];
            n46 = this.verticesY[n48];
            n47 = this.verticesZ[n48];
            if (n16 == 1) {
                this.vertexSkins[n48] = buffer5.readUnsignedByte();
            }
            ++n48;
        }
        buffer.offset = n34;
        buffer2.offset = n25;
        buffer3.offset = n27;
        buffer4.offset = n30;
        buffer5.offset = n28;
        buffer6.offset = n32;
        buffer7.offset = n33;
        n48 = 0;
        while (true) {
            if (n48 >= n9) break;
            this.faceColors[n48] = (short)buffer.readUnsignedShort();
            if (n11 == 1) {
                this.faceRenderTypes[n48] = buffer2.readByte();
            }
            if (n12 == 255) {
                this.faceRenderPriorities[n48] = buffer3.readByte();
            }
            if (n13 == 1) {
                this.faceAlphas[n48] = buffer4.readByte();
            }
            if (n14 == 1) {
                this.faceSkins[n48] = buffer5.readUnsignedByte();
            }
            if (n15 == 1) {
                this.faceTextures[n48] = (short)(buffer6.readUnsignedShort() - 1);
            }
            if (this.textureCoords != null && this.faceTextures[n48] != -1) {
                this.textureCoords[n48] = (byte)(buffer7.readUnsignedByte() - 1);
            }
            ++n48;
        }
        buffer.offset = n31;
        buffer2.offset = n26;
        n48 = 0;
        n5 = 0;
        n4 = 0;
        n3 = 0;
        n2 = 0;
        while (true) {
            if (n2 >= n9) break;
            n = buffer2.readUnsignedByte();
            if (n == 1) {
                n3 = n48 = buffer.readShortSmart() + n3;
                n3 = n5 = buffer.readShortSmart() + n3;
                n3 = n4 = buffer.readShortSmart() + n3;
                this.indices1[n2] = n48;
                this.indices2[n2] = n5;
                this.indices3[n2] = n4;
            }
            if (n == 2) {
                n5 = n4;
                n3 = n4 = buffer.readShortSmart() + n3;
                this.indices1[n2] = n48;
                this.indices2[n2] = n5;
                this.indices3[n2] = n4;
            }
            if (n == 3) {
                n48 = n4;
                n3 = n4 = buffer.readShortSmart() + n3;
                this.indices1[n2] = n48;
                this.indices2[n2] = n5;
                this.indices3[n2] = n4;
            }
            if (n == 4) {
                int n49 = n48;
                n48 = n5;
                n5 = n49;
                n3 = n4 = buffer.readShortSmart() + n3;
                this.indices1[n2] = n48;
                this.indices2[n2] = n5;
                this.indices3[n2] = n4;
            }
            ++n2;
        }
        buffer.offset = n38;
        buffer2.offset = n39;
        buffer3.offset = n40;
        buffer4.offset = n41;
        buffer5.offset = n42;
        buffer6.offset = n43;
        n2 = 0;
        while (true) {
            block39: {
                block40: {
                    block38: {
                        if (n2 >= n10) break block38;
                        n = this.textureRenderTypes[n2] & 0xFF;
                        if (n != 0) break block39;
                        break block40;
                    }
                    buffer.offset = n44;
                    n2 = buffer.readUnsignedByte();
                    if (n2 != 0) {
                        new ModelData0();
                        buffer.readUnsignedShort();
                        buffer.readUnsignedShort();
                        buffer.readUnsignedShort();
                        buffer.readInt();
                    }
                    return;
                }
                this.texTriangleX[n2] = (short)buffer.readUnsignedShort();
                this.texTriangleY[n2] = (short)buffer.readUnsignedShort();
                this.texTriangleZ[n2] = (short)buffer.readUnsignedShort();
            }
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ad")
    void method3906(byte[] byArray) {
        boolean bl;
        boolean bl2;
        block34: {
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            bl2 = false;
            bl = false;
            Buffer buffer = new Buffer(byArray);
            Buffer buffer2 = new Buffer(byArray);
            Buffer buffer3 = new Buffer(byArray);
            Buffer buffer4 = new Buffer(byArray);
            Buffer buffer5 = new Buffer(byArray);
            buffer.offset = byArray.length - 18;
            int n8 = buffer.readUnsignedShort();
            int n9 = buffer.readUnsignedShort();
            int n10 = buffer.readUnsignedByte();
            int n11 = buffer.readUnsignedByte();
            int n12 = buffer.readUnsignedByte();
            int n13 = buffer.readUnsignedByte();
            int n14 = buffer.readUnsignedByte();
            int n15 = buffer.readUnsignedByte();
            int n16 = buffer.readUnsignedShort();
            int n17 = buffer.readUnsignedShort();
            int n18 = buffer.readUnsignedShort();
            int n19 = buffer.readUnsignedShort();
            int n20 = n7 = 0;
            int n21 = n7 += n8;
            int n22 = n7 += n9;
            if (n12 == 255) {
                n7 += n9;
            }
            int n23 = n7;
            if (n14 == 1) {
                n7 += n9;
            }
            int n24 = n7;
            if (n11 == 1) {
                n7 += n9;
            }
            int n25 = n7;
            if (n15 == 1) {
                n7 += n8;
            }
            int n26 = n7;
            if (n13 == 1) {
                n7 += n9;
            }
            int n27 = n7;
            int n28 = n7 += n19;
            int n29 = n7 = n9 * 2 + n7;
            int n30 = n7 = n10 * 6 + n7;
            int n31 = n7 += n16;
            int n32 = n7 += n17;
            n7 += n18;
            this.verticesCount = n8;
            this.faceCount = n9;
            this.textureTriangleCount = n10;
            this.verticesX = new int[n8];
            this.verticesY = new int[n8];
            this.verticesZ = new int[n8];
            this.indices1 = new int[n9];
            this.indices2 = new int[n9];
            this.indices3 = new int[n9];
            if (n10 > 0) {
                this.textureRenderTypes = new byte[n10];
                this.texTriangleX = new short[n10];
                this.texTriangleY = new short[n10];
                this.texTriangleZ = new short[n10];
            }
            if (n15 == 1) {
                this.vertexSkins = new int[n8];
            }
            if (n11 == 1) {
                this.faceRenderTypes = new byte[n9];
                this.textureCoords = new byte[n9];
                this.faceTextures = new short[n9];
            }
            if (n12 == 255) {
                this.faceRenderPriorities = new byte[n9];
            } else {
                this.priority = (byte)n12;
            }
            if (n13 == 1) {
                this.faceAlphas = new byte[n9];
            }
            if (n14 == 1) {
                this.faceSkins = new int[n9];
            }
            this.faceColors = new short[n9];
            buffer.offset = n20;
            buffer2.offset = n30;
            buffer3.offset = n31;
            buffer4.offset = n32;
            buffer5.offset = n25;
            int n33 = 0;
            int n34 = 0;
            int n35 = 0;
            int n36 = 0;
            while (true) {
                if (n36 >= n8) break;
                n6 = buffer.readUnsignedByte();
                n5 = 0;
                if ((n6 & 1) != 0) {
                    n5 = buffer2.readShortSmart();
                }
                n4 = 0;
                if ((n6 & 2) != 0) {
                    n4 = buffer3.readShortSmart();
                }
                n3 = 0;
                if ((n6 & 4) != 0) {
                    n3 = buffer4.readShortSmart();
                }
                this.verticesX[n36] = n33 + n5;
                this.verticesY[n36] = n34 + n4;
                this.verticesZ[n36] = n35 + n3;
                n33 = this.verticesX[n36];
                n34 = this.verticesY[n36];
                n35 = this.verticesZ[n36];
                if (n15 == 1) {
                    this.vertexSkins[n36] = buffer5.readUnsignedByte();
                }
                ++n36;
            }
            buffer.offset = n28;
            buffer2.offset = n24;
            buffer3.offset = n22;
            buffer4.offset = n26;
            buffer5.offset = n23;
            n36 = 0;
            while (true) {
                block35: {
                    block37: {
                        block36: {
                            if (n36 >= n9) break;
                            this.faceColors[n36] = (short)buffer.readUnsignedShort();
                            if (n11 != 1) break block35;
                            n6 = buffer2.readUnsignedByte();
                            if ((n6 & 1) == 1) {
                                this.faceRenderTypes[n36] = 1;
                                bl2 = true;
                            } else {
                                this.faceRenderTypes[n36] = 0;
                            }
                            if ((n6 & 2) != 2) break block36;
                            this.textureCoords[n36] = (byte)(n6 >> 2);
                            this.faceTextures[n36] = this.faceColors[n36];
                            this.faceColors[n36] = 127;
                            if (this.faceTextures[n36] == -1) break block35;
                            break block37;
                        }
                        this.textureCoords[n36] = -1;
                        this.faceTextures[n36] = -1;
                        break block35;
                    }
                    bl = true;
                }
                if (n12 == 255) {
                    this.faceRenderPriorities[n36] = buffer3.readByte();
                }
                if (n13 == 1) {
                    this.faceAlphas[n36] = buffer4.readByte();
                }
                if (n14 == 1) {
                    this.faceSkins[n36] = buffer5.readUnsignedByte();
                }
                ++n36;
            }
            buffer.offset = n27;
            buffer2.offset = n21;
            n36 = 0;
            n6 = 0;
            n5 = 0;
            n4 = 0;
            n3 = 0;
            while (true) {
                block39: {
                    block40: {
                        block38: {
                            if (n3 >= n9) break block38;
                            n2 = buffer2.readUnsignedByte();
                            if (n2 != 1) break block39;
                            break block40;
                        }
                        buffer.offset = n29;
                        for (n3 = 0; n3 < n10; ++n3) {
                            this.textureRenderTypes[n3] = 0;
                            this.texTriangleX[n3] = (short)buffer.readUnsignedShort();
                            this.texTriangleY[n3] = (short)buffer.readUnsignedShort();
                            this.texTriangleZ[n3] = (short)buffer.readUnsignedShort();
                        }
                        if (this.textureCoords != null) {
                            break;
                        }
                        break block34;
                    }
                    n4 = n36 = buffer.readShortSmart() + n4;
                    n4 = n6 = buffer.readShortSmart() + n4;
                    n4 = n5 = buffer.readShortSmart() + n4;
                    this.indices1[n3] = n36;
                    this.indices2[n3] = n6;
                    this.indices3[n3] = n5;
                }
                if (n2 == 2) {
                    n6 = n5;
                    n4 = n5 = buffer.readShortSmart() + n4;
                    this.indices1[n3] = n36;
                    this.indices2[n3] = n6;
                    this.indices3[n3] = n5;
                }
                if (n2 == 3) {
                    n36 = n5;
                    n4 = n5 = buffer.readShortSmart() + n4;
                    this.indices1[n3] = n36;
                    this.indices2[n3] = n6;
                    this.indices3[n3] = n5;
                }
                if (n2 == 4) {
                    n = n36;
                    n36 = n6;
                    n6 = n;
                    n4 = n5 = buffer.readShortSmart() + n4;
                    this.indices1[n3] = n36;
                    this.indices2[n3] = n6;
                    this.indices3[n3] = n5;
                }
                ++n3;
            }
            n3 = 0;
            n2 = 0;
            while (true) {
                block42: {
                    block43: {
                        block41: {
                            if (n2 >= n9) break block41;
                            n = this.textureCoords[n2] & 0xFF;
                            if (n == 255) break block42;
                            break block43;
                        }
                        if (n3 != 0) break;
                        this.textureCoords = null;
                        break;
                    }
                    if (this.indices1[n2] == (this.texTriangleX[n] & 0xFFFF) && this.indices2[n2] == (this.texTriangleY[n] & 0xFFFF) && this.indices3[n2] == (this.texTriangleZ[n] & 0xFFFF)) {
                        this.textureCoords[n2] = -1;
                    } else {
                        n3 = 1;
                    }
                }
                ++n2;
            }
        }
        if (!bl) {
            this.faceTextures = null;
        }
        if (!bl2) {
            this.faceRenderTypes = null;
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lgx;I)I")
    final int method3898(ModelData modelData, int n) {
        int n2 = -1;
        int n3 = modelData.verticesX[n];
        int n4 = modelData.verticesY[n];
        int n5 = modelData.verticesZ[n];
        for (int i = 0; i < this.verticesCount; ++i) {
            if (n3 != this.verticesX[i] || n4 != this.verticesY[i] || n5 != this.verticesZ[i]) {
                continue;
            }
            n2 = i;
            break;
        }
        if (n2 == -1) {
            this.verticesX[this.verticesCount] = n3;
            this.verticesY[this.verticesCount] = n4;
            this.verticesZ[this.verticesCount] = n5;
            if (modelData.vertexSkins != null) {
                this.vertexSkins[this.verticesCount] = modelData.vertexSkins[n];
            }
            if (modelData.field1875 != null) {
                this.field1875[this.verticesCount] = modelData.field1875[n];
                this.field1876[this.verticesCount] = modelData.field1876[n];
            }
            n2 = this.verticesCount++;
        }
        return n2;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="()Lgx;")
    @Export(value="copyModelData")
    public ModelData copyModelData() {
        ModelData modelData = new ModelData();
        if (this.faceRenderTypes != null) {
            modelData.faceRenderTypes = new byte[this.faceCount];
            for (int i = 0; i < this.faceCount; ++i) {
                modelData.faceRenderTypes[i] = this.faceRenderTypes[i];
            }
        }
        modelData.verticesCount = this.verticesCount;
        modelData.faceCount = this.faceCount;
        modelData.textureTriangleCount = this.textureTriangleCount;
        modelData.verticesX = this.verticesX;
        modelData.verticesY = this.verticesY;
        modelData.verticesZ = this.verticesZ;
        modelData.indices1 = this.indices1;
        modelData.indices2 = this.indices2;
        modelData.indices3 = this.indices3;
        modelData.faceRenderPriorities = this.faceRenderPriorities;
        modelData.faceAlphas = this.faceAlphas;
        modelData.textureCoords = this.textureCoords;
        modelData.faceColors = this.faceColors;
        modelData.faceTextures = this.faceTextures;
        modelData.priority = this.priority;
        modelData.textureRenderTypes = this.textureRenderTypes;
        modelData.texTriangleX = this.texTriangleX;
        modelData.texTriangleY = this.texTriangleY;
        modelData.texTriangleZ = this.texTriangleZ;
        modelData.vertexSkins = this.vertexSkins;
        modelData.faceSkins = this.faceSkins;
        modelData.vertexLabels = this.vertexLabels;
        modelData.faceLabelsAlpha = this.faceLabelsAlpha;
        modelData.vertexNormals = this.vertexNormals;
        modelData.faceNormals = this.faceNormals;
        modelData.ambient = this.ambient;
        modelData.contrast = this.contrast;
        return modelData;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="([[IIIIZI)Lgx;")
    public ModelData method3900(int[][] nArray, int n, int n2, int n3, boolean bl, int n4) {
        this.calculateBounds();
        int n5 = n + this.field1884;
        int n6 = n + this.field1885;
        int n7 = n3 + this.field1887;
        int n8 = n3 + this.field1886;
        if (n5 >= 0 && n6 + 128 >> 7 < nArray.length && n7 >= 0 && n8 + 128 >> 7 < nArray[0].length) {
            n6 = n6 + 127 >> 7;
            n8 = n8 + 127 >> 7;
            if (n2 == nArray[n5 >>= 7][n7 >>= 7] && n2 == nArray[n6][n7] && n2 == nArray[n5][n8] && n2 == nArray[n6][n8]) {
                return this;
            }
            ModelData modelData = new ModelData(this, true, true, true, true);
            modelData.verticesY = new int[modelData.verticesCount];
            if (n4 != 0) {
                for (int i = 0; i < modelData.verticesCount; ++i) {
                    int n9 = (-this.verticesY[i] << 16) / this.height;
                    if (n9 >= n4) {
                        modelData.verticesY[i] = this.verticesY[i];
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
                    modelData.verticesY[i] = (n4 - n9) * (n18 - n2) / n4 + this.verticesY[i];
                }
            } else {
                for (int i = 0; i < modelData.verticesCount; ++i) {
                    int n19 = n + this.verticesX[i];
                    int n20 = n3 + this.verticesZ[i];
                    int n21 = n19 & 0x7F;
                    int n22 = n20 & 0x7F;
                    int n23 = n19 >> 7;
                    int n24 = n20 >> 7;
                    int n25 = nArray[n23][n24] * (128 - n21) + nArray[n23 + 1][n24] * n21 >> 7;
                    int n26 = nArray[n23][n24 + 1] * (128 - n21) + n21 * nArray[n23 + 1][n24 + 1] >> 7;
                    int n27 = n25 * (128 - n22) + n26 * n22 >> 7;
                    modelData.verticesY[i] = n27 + this.verticesY[i] - n2;
                }
            }
            modelData.invalidate();
            return modelData;
        }
        return this;
    }

    @ObfuscatedName(value="at")
    public int method3942(int n, int n2, int n3) {
        for (int i = 0; i < this.verticesCount; ++i) {
            if (this.verticesX[i] != n || n2 != this.verticesY[i] || n3 != this.verticesZ[i]) continue;
            return i;
        }
        this.verticesX[this.verticesCount] = n;
        this.verticesY[this.verticesCount] = n2;
        this.verticesZ[this.verticesCount] = n3;
        return this.verticesCount++;
    }

    @ObfuscatedName(value="ac")
    public int method3954(int n, int n2, int n3, byte by, byte by2, short s, short s2) {
        this.indices1[this.faceCount] = n;
        this.indices2[this.faceCount] = n2;
        this.indices3[this.faceCount] = n3;
        this.faceRenderTypes[this.faceCount] = by;
        this.textureCoords[this.faceCount] = by2;
        this.faceColors[this.faceCount] = s;
        this.faceTextures[this.faceCount] = s2;
        return this.faceCount++;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="au")
    void method3903() {
        int n;
        int n2;
        int n3;
        int[] nArray;
        block7: {
            if (this.vertexSkins == null) break block7;
            nArray = new int[256];
            n3 = 0;
            n2 = 0;
            while (true) {
                block9: {
                    block10: {
                        block8: {
                            if (n2 >= this.verticesCount) break block8;
                            int n4 = n = this.vertexSkins[n2];
                            nArray[n4] = nArray[n4] + 1;
                            if (n <= n3) break block9;
                            break block10;
                        }
                        this.vertexLabels = new int[n3 + 1][];
                        for (n2 = 0; n2 <= n3; ++n2) {
                            this.vertexLabels[n2] = new int[nArray[n2]];
                            nArray[n2] = 0;
                        }
                        n2 = 0;
                        while (n2 < this.verticesCount) {
                            int n5 = n = this.vertexSkins[n2];
                            int n6 = nArray[n5];
                            nArray[n5] = n6 + 1;
                            this.vertexLabels[n][n6] = n2++;
                        }
                        this.vertexSkins = null;
                        break;
                    }
                    n3 = n;
                }
                ++n2;
            }
        }
        if (this.faceSkins == null) return;
        nArray = new int[256];
        n3 = 0;
        n2 = 0;
        while (true) {
            block12: {
                block13: {
                    block11: {
                        if (n2 >= this.faceCount) break block11;
                        int n7 = n = this.faceSkins[n2];
                        nArray[n7] = nArray[n7] + 1;
                        if (n <= n3) break block12;
                        break block13;
                    }
                    this.faceLabelsAlpha = new int[n3 + 1][];
                    for (n2 = 0; n2 <= n3; ++n2) {
                        this.faceLabelsAlpha[n2] = new int[nArray[n2]];
                        nArray[n2] = 0;
                    }
                    n2 = 0;
                    while (true) {
                        if (n2 >= this.faceCount) {
                            this.faceSkins = null;
                            return;
                        }
                        int n8 = n = this.faceSkins[n2];
                        int n9 = nArray[n8];
                        nArray[n8] = n9 + 1;
                        this.faceLabelsAlpha[n][n9] = n2++;
                    }
                }
                n3 = n;
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="aa")
    public void method3904() {
        int n = 0;
        while (true) {
            if (n >= this.verticesCount) {
                this.invalidate();
                return;
            }
            int n2 = this.verticesX[n];
            this.verticesX[n] = this.verticesZ[n];
            this.verticesZ[n] = -n2;
            ++n;
        }
    }

    @ObfuscatedName(value="ak")
    public void method3905() {
        int n = 0;
        while (true) {
            if (n >= this.verticesCount) {
                this.invalidate();
                return;
            }
            this.verticesX[n] = -this.verticesX[n];
            this.verticesZ[n] = -this.verticesZ[n];
            ++n;
        }
    }

    @ObfuscatedName(value="al")
    public void method3894() {
        int n = 0;
        while (true) {
            if (n >= this.verticesCount) {
                this.invalidate();
                return;
            }
            int n2 = this.verticesZ[n];
            this.verticesZ[n] = this.verticesX[n];
            this.verticesX[n] = -n2;
            ++n;
        }
    }

    @ObfuscatedName(value="av")
    public void method3907(int n) {
        int n2 = ModelData_sine[n];
        int n3 = ModelData_cosine[n];
        int n4 = 0;
        while (true) {
            if (n4 >= this.verticesCount) {
                this.invalidate();
                return;
            }
            int n5 = n2 * this.verticesZ[n4] + n3 * this.verticesX[n4] >> 16;
            this.verticesZ[n4] = n3 * this.verticesZ[n4] - n2 * this.verticesX[n4] >> 16;
            this.verticesX[n4] = n5;
            ++n4;
        }
    }

    @ObfuscatedName(value="ag")
    @Export(value="changeOffset")
    public void changeOffset(int n, int n2, int n3) {
        int n4 = 0;
        while (true) {
            if (n4 >= this.verticesCount) {
                this.invalidate();
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

    @ObfuscatedName(value="aw")
    @Export(value="recolor")
    public void recolor(short s, short s2) {
        int n = 0;
        while (n < this.faceCount) {
            if (this.faceColors[n] == s) {
                this.faceColors[n] = s2;
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ai")
    @Export(value="retexture")
    public void retexture(short s, short s2) {
        if (this.faceTextures == null) {
            return;
        }
        int n = 0;
        while (n < this.faceCount) {
            if (this.faceTextures[n] == s) {
                this.faceTextures[n] = s2;
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ar")
    public void method3911() {
        int n;
        for (n = 0; n < this.verticesCount; ++n) {
            this.verticesZ[n] = -this.verticesZ[n];
        }
        n = 0;
        while (true) {
            if (n >= this.faceCount) {
                this.invalidate();
                return;
            }
            int n2 = this.indices1[n];
            this.indices1[n] = this.indices3[n];
            this.indices3[n] = n2;
            ++n;
        }
    }

    @ObfuscatedName(value="am")
    @Export(value="resize")
    public void resize(int n, int n2, int n3) {
        int n4 = 0;
        while (true) {
            if (n4 >= this.verticesCount) {
                this.invalidate();
                return;
            }
            this.verticesX[n4] = this.verticesX[n4] * n / 128;
            this.verticesY[n4] = n2 * this.verticesY[n4] / 128;
            this.verticesZ[n4] = n3 * this.verticesZ[n4] / 128;
            ++n4;
        }
    }

    @ObfuscatedName(value="ap")
    @Export(value="calculateVertexNormals")
    public void calculateVertexNormals() {
        int n;
        if (this.vertexNormals != null) {
            return;
        }
        this.vertexNormals = new VertexNormal[this.verticesCount];
        for (n = 0; n < this.verticesCount; ++n) {
            this.vertexNormals[n] = new VertexNormal();
        }
        n = 0;
        block1: while (n < this.faceCount) {
            int n2 = this.indices1[n];
            int n3 = this.indices2[n];
            int n4 = this.indices3[n];
            int n5 = this.verticesX[n3] - this.verticesX[n2];
            int n6 = this.verticesY[n3] - this.verticesY[n2];
            int n7 = this.verticesZ[n3] - this.verticesZ[n2];
            int n8 = this.verticesX[n4] - this.verticesX[n2];
            int n9 = this.verticesY[n4] - this.verticesY[n2];
            int n10 = this.verticesZ[n4] - this.verticesZ[n2];
            int n11 = n6 * n10 - n9 * n7;
            int n12 = n7 * n8 - n10 * n5;
            int n13 = n5 * n9 - n8 * n6;
            while (true) {
                if (n11 <= 8192 && n12 <= 8192 && n13 <= 8192 && n11 >= -8192 && n12 >= -8192 && n13 >= -8192) {
                    Object object;
                    int n14 = (int)Math.sqrt(n11 * n11 + n12 * n12 + n13 * n13);
                    if (n14 <= 0) {
                        n14 = 1;
                    }
                    n11 = n11 * 256 / n14;
                    n12 = n12 * 256 / n14;
                    n13 = n13 * 256 / n14;
                    byte by = this.faceRenderTypes == null ? (byte)0 : this.faceRenderTypes[n];
                    if (by != 0) {
                        if (by == 1) {
                            if (this.faceNormals == null) {
                                this.faceNormals = new FaceNormal[this.faceCount];
                            }
                            this.faceNormals[n] = new FaceNormal();
                            object = this.faceNormals[n];
                            ((FaceNormal)object).x = n11;
                            ((FaceNormal)object).y = n12;
                            ((FaceNormal)object).z = n13;
                        }
                    } else {
                        object = this.vertexNormals[n2];
                        ((VertexNormal)object).x += n11;
                        ((VertexNormal)object).y += n12;
                        ((VertexNormal)object).z += n13;
                        ++((VertexNormal)object).magnitude;
                        object = this.vertexNormals[n3];
                        ((VertexNormal)object).x += n11;
                        ((VertexNormal)object).y += n12;
                        ((VertexNormal)object).z += n13;
                        ++((VertexNormal)object).magnitude;
                        object = this.vertexNormals[n4];
                        ((VertexNormal)object).x += n11;
                        ((VertexNormal)object).y += n12;
                        ((VertexNormal)object).z += n13;
                        ++((VertexNormal)object).magnitude;
                    }
                    ++n;
                    continue block1;
                }
                n11 >>= 1;
                n12 >>= 1;
                n13 >>= 1;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="ab")
    @Export(value="invalidate")
    void invalidate() {
        this.vertexNormals = null;
        this.vertexVertices = null;
        this.faceNormals = null;
        this.isBoundsCalculated = false;
    }

    @ObfuscatedName(value="aj")
    @Export(value="calculateBounds")
    void calculateBounds() {
        if (this.isBoundsCalculated) {
            return;
        }
        this.height = 0;
        this.field1863 = 0;
        this.field1884 = 999999;
        this.field1885 = -999999;
        this.field1886 = -99999;
        this.field1887 = 99999;
        int n = 0;
        while (true) {
            if (n >= this.verticesCount) {
                this.isBoundsCalculated = true;
                return;
            }
            int n2 = this.verticesX[n];
            int n3 = this.verticesY[n];
            int n4 = this.verticesZ[n];
            if (n2 < this.field1884) {
                this.field1884 = n2;
            }
            if (n2 > this.field1885) {
                this.field1885 = n2;
            }
            if (n4 < this.field1887) {
                this.field1887 = n4;
            }
            if (n4 > this.field1886) {
                this.field1886 = n4;
            }
            if (-n3 > this.height) {
                this.height = -n3;
            }
            if (n3 > this.field1863) {
                this.field1863 = n3;
            }
            ++n;
        }
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(IIIII)Lhv;")
    @Export(value="toModel")
    public final Model toModel(int var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        this.calculateVertexNormals();
        var6_6 = (int)Math.sqrt(var5_5 * var5_5 + var3_3 * var3_3 + var4_4 * var4_4);
        var7_7 = var6_6 * var2_2 >> 8;
        var8_8 = new Model();
        var8_8.faceColors1 = new int[this.faceCount];
        var8_8.faceColors2 = new int[this.faceCount];
        var8_8.faceColors3 = new int[this.faceCount];
        if (this.textureTriangleCount <= 0 || this.textureCoords == null) ** GOTO lbl28
        var9_9 = new int[this.textureTriangleCount];
        var10_10 = 0;
        while (true) {
            block27: {
                if (var10_10 < this.faceCount) break block27;
                var8_8.field2207 = 0;
                var10_10 = 0;
                while (true) {
                    block28: {
                        if (var10_10 < this.textureTriangleCount) break block28;
                        var8_8.field2208 = new int[var8_8.field2207];
                        var8_8.field2241 = new int[var8_8.field2207];
                        var8_8.field2210 = new int[var8_8.field2207];
                        var10_10 = 0;
                        var11_11 = 0;
                        while (true) {
                            block29: {
                                if (var11_11 < this.textureTriangleCount) break block29;
                                var8_8.field2237 = new byte[this.faceCount];
                                var11_11 = 0;
                                while (true) {
                                    block30: {
                                        if (var11_11 < this.faceCount) break block30;
lbl28:
                                        // 2 sources

                                        var16_12 = 0;
                                        while (true) {
                                            if (var16_12 >= this.faceCount) {
                                                this.method3903();
                                                var8_8.verticesCount = this.verticesCount;
                                                var8_8.verticesX = this.verticesX;
                                                var8_8.verticesY = this.verticesY;
                                                var8_8.verticesZ = this.verticesZ;
                                                var8_8.indicesCount = this.faceCount;
                                                var8_8.indices1 = this.indices1;
                                                var8_8.indices2 = this.indices2;
                                                var8_8.indices3 = this.indices3;
                                                var8_8.faceRenderPriorities = this.faceRenderPriorities;
                                                var8_8.faceAlphas = this.faceAlphas;
                                                var8_8.field2212 = this.priority;
                                                var8_8.vertexLabels = this.vertexLabels;
                                                var8_8.faceLabelsAlpha = this.faceLabelsAlpha;
                                                var8_8.faceTextures = this.faceTextures;
                                                var8_8.field2260 = this.field1875;
                                                var8_8.field2214 = this.field1876;
                                                return var8_8;
                                            }
                                            var10_10 = this.faceRenderTypes == null ? 0 : this.faceRenderTypes[var16_12];
                                            var11_11 = this.faceAlphas == null ? 0 : this.faceAlphas[var16_12];
                                            var12_13 = this.faceTextures == null ? -1 : this.faceTextures[var16_12];
                                            if (var11_11 == -2) {
                                                var10_10 = 3;
                                            }
                                            if (var11_11 == -1) {
                                                var10_10 = 2;
                                            }
                                            if (var12_13 != -1) {
                                                if (var10_10 != 0) {
                                                    if (var10_10 != 1) {
                                                        var8_8.faceColors3[var16_12] = -2;
                                                    } else {
                                                        var13_14 = this.faceNormals[var16_12];
                                                        var14_15 = (var4_4 * var13_14.y + var5_5 * var13_14.z + var3_3 * var13_14.x) / (var7_7 / 2 + var7_7) + var1_1;
                                                        var8_8.faceColors1[var16_12] = ModelData.method3988(var14_15);
                                                        var8_8.faceColors3[var16_12] = -1;
                                                    }
                                                } else {
                                                    var13_14 = this.vertexVertices != null && this.vertexVertices[this.indices1[var16_12]] != null ? this.vertexVertices[this.indices1[var16_12]] : this.vertexNormals[this.indices1[var16_12]];
                                                    var14_15 = (var4_4 * var13_14.y + var5_5 * var13_14.z + var3_3 * var13_14.x) / (var7_7 * var13_14.magnitude) + var1_1;
                                                    var8_8.faceColors1[var16_12] = ModelData.method3988(var14_15);
                                                    var13_14 = this.vertexVertices != null && this.vertexVertices[this.indices2[var16_12]] != null ? this.vertexVertices[this.indices2[var16_12]] : this.vertexNormals[this.indices2[var16_12]];
                                                    var14_15 = (var4_4 * var13_14.y + var5_5 * var13_14.z + var3_3 * var13_14.x) / (var7_7 * var13_14.magnitude) + var1_1;
                                                    var8_8.faceColors2[var16_12] = ModelData.method3988(var14_15);
                                                    var13_14 = this.vertexVertices != null && this.vertexVertices[this.indices3[var16_12]] != null ? this.vertexVertices[this.indices3[var16_12]] : this.vertexNormals[this.indices3[var16_12]];
                                                    var14_15 = (var4_4 * var13_14.y + var5_5 * var13_14.z + var3_3 * var13_14.x) / (var7_7 * var13_14.magnitude) + var1_1;
                                                    var8_8.faceColors3[var16_12] = ModelData.method3988(var14_15);
                                                }
                                            } else if (var10_10 != 0) {
                                                if (var10_10 != 1) {
                                                    if (var10_10 != 3) {
                                                        var8_8.faceColors3[var16_12] = -2;
                                                    } else {
                                                        var8_8.faceColors1[var16_12] = 128;
                                                        var8_8.faceColors3[var16_12] = -1;
                                                    }
                                                } else {
                                                    var13_14 = this.faceNormals[var16_12];
                                                    var14_15 = (var4_4 * var13_14.y + var5_5 * var13_14.z + var3_3 * var13_14.x) / (var7_7 / 2 + var7_7) + var1_1;
                                                    var8_8.faceColors1[var16_12] = ModelData.method3915(this.faceColors[var16_12] & 65535, var14_15);
                                                    var8_8.faceColors3[var16_12] = -1;
                                                }
                                            } else {
                                                var15_16 = this.faceColors[var16_12] & 65535;
                                                var13_14 = this.vertexVertices != null && this.vertexVertices[this.indices1[var16_12]] != null ? this.vertexVertices[this.indices1[var16_12]] : this.vertexNormals[this.indices1[var16_12]];
                                                var14_15 = (var4_4 * var13_14.y + var5_5 * var13_14.z + var3_3 * var13_14.x) / (var7_7 * var13_14.magnitude) + var1_1;
                                                var8_8.faceColors1[var16_12] = ModelData.method3915(var15_16, var14_15);
                                                var13_14 = this.vertexVertices != null && this.vertexVertices[this.indices2[var16_12]] != null ? this.vertexVertices[this.indices2[var16_12]] : this.vertexNormals[this.indices2[var16_12]];
                                                var14_15 = (var4_4 * var13_14.y + var5_5 * var13_14.z + var3_3 * var13_14.x) / (var7_7 * var13_14.magnitude) + var1_1;
                                                var8_8.faceColors2[var16_12] = ModelData.method3915(var15_16, var14_15);
                                                var13_14 = this.vertexVertices != null && this.vertexVertices[this.indices3[var16_12]] != null ? this.vertexVertices[this.indices3[var16_12]] : this.vertexNormals[this.indices3[var16_12]];
                                                var14_15 = (var4_4 * var13_14.y + var5_5 * var13_14.z + var3_3 * var13_14.x) / (var7_7 * var13_14.magnitude) + var1_1;
                                                var8_8.faceColors3[var16_12] = ModelData.method3915(var15_16, var14_15);
                                            }
                                            ++var16_12;
                                        }
                                    }
                                    var8_8.field2237[var11_11] = this.textureCoords[var11_11] != -1 ? (int)var9_9[this.textureCoords[var11_11] & 255] : -1;
                                    ++var11_11;
                                }
                            }
                            if (var9_9[var11_11] <= 0 || this.textureRenderTypes[var11_11] != 0) {
                                var9_9[var11_11] = -1;
                            } else {
                                var8_8.field2208[var10_10] = this.texTriangleX[var11_11] & 65535;
                                var8_8.field2241[var10_10] = this.texTriangleY[var11_11] & 65535;
                                var8_8.field2210[var10_10] = this.texTriangleZ[var11_11] & 65535;
                                var9_9[var11_11] = var10_10++;
                            }
                            ++var11_11;
                        }
                    }
                    if (var9_9[var10_10] > 0 && this.textureRenderTypes[var10_10] == 0) {
                        ++var8_8.field2207;
                    }
                    ++var10_10;
                }
            }
            if (this.textureCoords[var10_10] != -1) {
                v0 = this.textureCoords[var10_10] & 255;
                var9_9[v0] = var9_9[v0] + 1;
            }
            ++var10_10;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;II)Lgx;")
    @Export(value="ModelData_get")
    public static ModelData ModelData_get(AbstractArchive abstractArchive, int n, int n2) {
        byte[] byArray = abstractArchive.takeFile(n, n2);
        if (byArray == null) {
            return null;
        }
        return new ModelData(byArray);
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(Lgx;Lgx;IIIZ)V")
    static void method3916(ModelData modelData, ModelData modelData2, int n, int n2, int n3, boolean bl) {
        modelData.calculateBounds();
        modelData.calculateVertexNormals();
        modelData2.calculateBounds();
        modelData2.calculateVertexNormals();
        ++field1890;
        int n4 = 0;
        int[] nArray = modelData2.verticesX;
        int n5 = modelData2.verticesCount;
        int n6 = 0;
        while (true) {
            int n7;
            int n8;
            int n9;
            if (n6 >= modelData.verticesCount) {
                if (n4 >= 3 && bl) {
                    n6 = 0;
                    while (true) {
                        if (n6 >= modelData.faceCount) {
                            n6 = 0;
                            while (true) {
                                if (n6 >= modelData2.faceCount) {
                                    return;
                                }
                                if (field1890 == field1853[modelData2.indices1[n6]] && field1890 == field1853[modelData2.indices2[n6]] && field1890 == field1853[modelData2.indices3[n6]]) {
                                    if (modelData2.faceRenderTypes == null) {
                                        modelData2.faceRenderTypes = new byte[modelData2.faceCount];
                                    }
                                    modelData2.faceRenderTypes[n6] = 2;
                                }
                                ++n6;
                            }
                        }
                        if (field1888[modelData.indices1[n6]] == field1890 && field1888[modelData.indices2[n6]] == field1890 && field1888[modelData.indices3[n6]] == field1890) {
                            if (modelData.faceRenderTypes == null) {
                                modelData.faceRenderTypes = new byte[modelData.faceCount];
                            }
                            modelData.faceRenderTypes[n6] = 2;
                        }
                        ++n6;
                    }
                }
                return;
            }
            VertexNormal vertexNormal = modelData.vertexNormals[n6];
            if (vertexNormal.magnitude != 0 && (n9 = modelData.verticesY[n6] - n2) <= modelData2.field1863 && (n8 = modelData.verticesX[n6] - n) >= modelData2.field1884 && n8 <= modelData2.field1885 && (n7 = modelData.verticesZ[n6] - n3) >= modelData2.field1887 && n7 <= modelData2.field1886) {
                for (int i = 0; i < n5; ++i) {
                    VertexNormal vertexNormal2;
                    VertexNormal vertexNormal3;
                    VertexNormal vertexNormal4 = modelData2.vertexNormals[i];
                    if (n8 != nArray[i] || n7 != modelData2.verticesZ[i] || n9 != modelData2.verticesY[i] || vertexNormal4.magnitude == 0) continue;
                    if (modelData.vertexVertices == null) {
                        modelData.vertexVertices = new VertexNormal[modelData.verticesCount];
                    }
                    if (modelData2.vertexVertices == null) {
                        modelData2.vertexVertices = new VertexNormal[n5];
                    }
                    if ((vertexNormal3 = modelData.vertexVertices[n6]) == null) {
                        vertexNormal3 = modelData.vertexVertices[n6] = new VertexNormal(vertexNormal);
                    }
                    if ((vertexNormal2 = modelData2.vertexVertices[i]) == null) {
                        vertexNormal2 = modelData2.vertexVertices[i] = new VertexNormal(vertexNormal4);
                    }
                    vertexNormal3.x += vertexNormal4.x;
                    vertexNormal3.y += vertexNormal4.y;
                    vertexNormal3.z += vertexNormal4.z;
                    vertexNormal3.magnitude += vertexNormal4.magnitude;
                    vertexNormal2.x += vertexNormal.x;
                    vertexNormal2.y += vertexNormal.y;
                    vertexNormal2.z += vertexNormal.z;
                    vertexNormal2.magnitude += vertexNormal.magnitude;
                    ++n4;
                    ModelData.field1888[n6] = field1890;
                    ModelData.field1853[i] = field1890;
                }
            }
            ++n6;
        }
    }

    @ObfuscatedName(value="bw")
    static final int method3915(int n, int n2) {
        if ((n2 = (n & 0x7F) * n2 >> 7) < 2) {
            n2 = 2;
        } else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }

    @ObfuscatedName(value="bb")
    static final int method3988(int n) {
        if (n < 2) {
            n = 2;
        } else if (n > 126) {
            n = 126;
        }
        return n;
    }
}

