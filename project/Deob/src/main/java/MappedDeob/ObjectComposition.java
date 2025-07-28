/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kl")
@Implements(value="ObjectComposition")
public class ObjectComposition
extends DualNode {
    @ObfuscatedName(value="ay")
    @Export(value="ObjectDefinition_isLowDetail")
    static boolean ObjectDefinition_isLowDetail = false;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="ObjectDefinition_archive")
    static AbstractArchive ObjectDefinition_archive;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="ObjectDefinition_modelsArchive")
    static AbstractArchive ObjectDefinition_modelsArchive;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="ObjectDefinition_cached")
    static EvictingDualNodeHashTable ObjectDefinition_cached;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="ObjectDefinition_cachedModelData")
    public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="ObjectDefinition_cachedEntities")
    static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="ObjectDefinition_cachedModels")
    static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="[Lgx;")
    static ModelData[] field2824;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=2086113935)
    @Export(value="id")
    public int id;
    @ObfuscatedName(value="ac")
    @Export(value="modelIds")
    int[] modelIds;
    @ObfuscatedName(value="au")
    @Export(value="models")
    int[] models;
    @ObfuscatedName(value="as")
    @Export(value="name")
    public String name = "null";
    @ObfuscatedName(value="aq")
    @Export(value="recolorFrom")
    short[] recolorFrom;
    @ObfuscatedName(value="af")
    @Export(value="recolorTo")
    short[] recolorTo;
    @ObfuscatedName(value="aa")
    @Export(value="retextureFrom")
    short[] retextureFrom;
    @ObfuscatedName(value="ak")
    @Export(value="retextureTo")
    short[] retextureTo;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-442152137)
    @Export(value="sizeX")
    public int sizeX = 1;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=64993453)
    @Export(value="sizeY")
    public int sizeY = 1;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=482809959)
    @Export(value="interactType")
    public int interactType = 2;
    @ObfuscatedName(value="aw")
    @Export(value="boolean1")
    public boolean boolean1 = true;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-1398883391)
    @Export(value="int1")
    public int int1 = -1;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=1921565955)
    @Export(value="clipType")
    int clipType = -1;
    @ObfuscatedName(value="am")
    @Export(value="nonFlatShading")
    boolean nonFlatShading = false;
    @ObfuscatedName(value="ap")
    @Export(value="modelClipped")
    public boolean modelClipped = false;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=1102146793)
    @Export(value="animationId")
    public int animationId = -1;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=672593261)
    @Export(value="int2")
    public int int2 = 16;
    @ObfuscatedName(value="bu")
    @ObfuscatedGetter(intValue=-985734849)
    @Export(value="ambient")
    int ambient = 0;
    @ObfuscatedName(value="bh")
    @ObfuscatedGetter(intValue=-1257350453)
    @Export(value="contrast")
    int contrast = 0;
    @ObfuscatedName(value="bw")
    @Export(value="actions")
    public String[] actions = new String[5];
    @ObfuscatedName(value="bb")
    @ObfuscatedGetter(intValue=381882989)
    @Export(value="mapIconId")
    public int mapIconId = -1;
    @ObfuscatedName(value="bx")
    @ObfuscatedGetter(intValue=1336208653)
    @Export(value="mapSceneId")
    public int mapSceneId = -1;
    @ObfuscatedName(value="bd")
    @Export(value="isRotated")
    boolean isRotated = false;
    @ObfuscatedName(value="bi")
    @Export(value="clipped")
    public boolean clipped = true;
    @ObfuscatedName(value="bz")
    @ObfuscatedGetter(intValue=-527845869)
    @Export(value="modelSizeX")
    int modelSizeX = 128;
    @ObfuscatedName(value="bt")
    @ObfuscatedGetter(intValue=-1483271063)
    @Export(value="modelHeight")
    int modelHeight = 128;
    @ObfuscatedName(value="bf")
    @ObfuscatedGetter(intValue=2139076267)
    @Export(value="modelSizeY")
    int modelSizeY = 128;
    @ObfuscatedName(value="by")
    @ObfuscatedGetter(intValue=-1790940099)
    @Export(value="offsetX")
    int offsetX = 0;
    @ObfuscatedName(value="bm")
    @ObfuscatedGetter(intValue=-1275487297)
    @Export(value="offsetHeight")
    int offsetHeight = 0;
    @ObfuscatedName(value="bp")
    @ObfuscatedGetter(intValue=-1443444161)
    @Export(value="offsetY")
    int offsetY = 0;
    @ObfuscatedName(value="bg")
    @Export(value="boolean2")
    public boolean boolean2 = false;
    @ObfuscatedName(value="bc")
    @Export(value="isSolid")
    boolean isSolid = false;
    @ObfuscatedName(value="bv")
    @ObfuscatedGetter(intValue=1258426071)
    @Export(value="int3")
    public int int3 = -1;
    @ObfuscatedName(value="bq")
    @Export(value="transforms")
    public int[] transforms;
    @ObfuscatedName(value="ba")
    @ObfuscatedGetter(intValue=-1461919573)
    @Export(value="transformVarbit")
    int transformVarbit = -1;
    @ObfuscatedName(value="bk")
    @ObfuscatedGetter(intValue=1303058113)
    @Export(value="transformVarp")
    int transformVarp = -1;
    @ObfuscatedName(value="bs")
    @ObfuscatedGetter(intValue=-1998590587)
    @Export(value="ambientSoundId")
    public int ambientSoundId = -1;
    @ObfuscatedName(value="bj")
    @ObfuscatedGetter(intValue=-1090600960)
    @Export(value="int7")
    public int int7 = 0;
    @ObfuscatedName(value="bo")
    @ObfuscatedGetter(intValue=381272064)
    public int field2835 = 0;
    @ObfuscatedName(value="be")
    @ObfuscatedGetter(intValue=832555613)
    @Export(value="int5")
    public int int5 = 0;
    @ObfuscatedName(value="bn")
    @ObfuscatedGetter(intValue=14659201)
    @Export(value="int6")
    public int int6 = 0;
    @ObfuscatedName(value="br")
    @Export(value="soundEffectIds")
    public int[] soundEffectIds;
    @ObfuscatedName(value="bl")
    @Export(value="boolean3")
    public boolean boolean3 = true;
    @ObfuscatedName(value="cb")
    public boolean field2840 = false;
    @ObfuscatedName(value="cn")
    @ObfuscatedSignature(descriptor="Lue;")
    @Export(value="params")
    IterableNodeHashTable params;

    static {
        ObjectDefinition_cached = new EvictingDualNodeHashTable(4096);
        ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500);
        ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30);
        ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30);
        field2824 = new ModelData[4];
    }

    ObjectComposition() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-69")
    @Export(value="postDecode")
    void postDecode() {
        if (this.int1 == -1) {
            this.int1 = 0;
            if (this.modelIds != null && (this.models == null || this.models[0] == 10)) {
                this.int1 = 1;
            }
            for (int i = 0; i < 5; ++i) {
                if (this.actions[i] == null) continue;
                this.int1 = 1;
            }
        }
        if (this.int3 == -1) {
            this.int3 = this.interactType != 0 ? 1 : 0;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="355284563")
    @Export(value="decode")
    void decode(Buffer buffer) {
        int n;
        while ((n = buffer.readUnsignedByte()) != 0) {
            this.decodeNext(buffer, n);
        }
        return;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="-1636926646")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        block16: {
            block17: {
                block19: {
                    block22: {
                        block28: {
                            block34: {
                                block35: {
                                    block36: {
                                        block43: {
                                            block50: {
                                                block51: {
                                                    block52: {
                                                        block56: {
                                                            block55: {
                                                                block54: {
                                                                    block53: {
                                                                        block49: {
                                                                            block48: {
                                                                                block47: {
                                                                                    block46: {
                                                                                        block45: {
                                                                                            block44: {
                                                                                                block42: {
                                                                                                    block41: {
                                                                                                        block40: {
                                                                                                            block39: {
                                                                                                                block38: {
                                                                                                                    block37: {
                                                                                                                        block33: {
                                                                                                                            block32: {
                                                                                                                                block31: {
                                                                                                                                    block30: {
                                                                                                                                        block29: {
                                                                                                                                            block27: {
                                                                                                                                                block26: {
                                                                                                                                                    block25: {
                                                                                                                                                        block24: {
                                                                                                                                                            block23: {
                                                                                                                                                                block21: {
                                                                                                                                                                    block20: {
                                                                                                                                                                        block18: {
                                                                                                                                                                            if (n == 1) break block17;
                                                                                                                                                                            if (n != 2) break block18;
                                                                                                                                                                            this.name = buffer.readStringCp1252NullTerminated();
                                                                                                                                                                            break block16;
                                                                                                                                                                        }
                                                                                                                                                                        if (n == 5) break block19;
                                                                                                                                                                        if (n != 14) break block20;
                                                                                                                                                                        this.sizeX = buffer.readUnsignedByte();
                                                                                                                                                                        break block16;
                                                                                                                                                                    }
                                                                                                                                                                    if (n != 15) break block21;
                                                                                                                                                                    this.sizeY = buffer.readUnsignedByte();
                                                                                                                                                                    break block16;
                                                                                                                                                                }
                                                                                                                                                                if (n == 17) break block22;
                                                                                                                                                                if (n != 18) break block23;
                                                                                                                                                                this.boolean1 = false;
                                                                                                                                                                break block16;
                                                                                                                                                            }
                                                                                                                                                            if (n != 19) break block24;
                                                                                                                                                            this.int1 = buffer.readUnsignedByte();
                                                                                                                                                            break block16;
                                                                                                                                                        }
                                                                                                                                                        if (n != 21) break block25;
                                                                                                                                                        this.clipType = 0;
                                                                                                                                                        break block16;
                                                                                                                                                    }
                                                                                                                                                    if (n != 22) break block26;
                                                                                                                                                    this.nonFlatShading = true;
                                                                                                                                                    break block16;
                                                                                                                                                }
                                                                                                                                                if (n != 23) break block27;
                                                                                                                                                this.modelClipped = true;
                                                                                                                                                break block16;
                                                                                                                                            }
                                                                                                                                            if (n == 24) break block28;
                                                                                                                                            if (n != 27) break block29;
                                                                                                                                            this.interactType = 1;
                                                                                                                                            break block16;
                                                                                                                                        }
                                                                                                                                        if (n != 28) break block30;
                                                                                                                                        this.int2 = buffer.readUnsignedByte();
                                                                                                                                        break block16;
                                                                                                                                    }
                                                                                                                                    if (n != 29) break block31;
                                                                                                                                    this.ambient = buffer.readByte();
                                                                                                                                    break block16;
                                                                                                                                }
                                                                                                                                if (n != 39) break block32;
                                                                                                                                this.contrast = buffer.readByte() * 25;
                                                                                                                                break block16;
                                                                                                                            }
                                                                                                                            if (n < 30 || n >= 35) break block33;
                                                                                                                            this.actions[n - 30] = buffer.readStringCp1252NullTerminated();
                                                                                                                            if (!this.actions[n - 30].equalsIgnoreCase("Hidden")) break block16;
                                                                                                                            this.actions[n - 30] = null;
                                                                                                                            break block16;
                                                                                                                        }
                                                                                                                        if (n == 40) break block34;
                                                                                                                        if (n == 41) break block35;
                                                                                                                        if (n == 61) break block36;
                                                                                                                        if (n != 62) break block37;
                                                                                                                        this.isRotated = true;
                                                                                                                        break block16;
                                                                                                                    }
                                                                                                                    if (n != 64) break block38;
                                                                                                                    this.clipped = false;
                                                                                                                    break block16;
                                                                                                                }
                                                                                                                if (n != 65) break block39;
                                                                                                                this.modelSizeX = buffer.readUnsignedShort();
                                                                                                                break block16;
                                                                                                            }
                                                                                                            if (n != 66) break block40;
                                                                                                            this.modelHeight = buffer.readUnsignedShort();
                                                                                                            break block16;
                                                                                                        }
                                                                                                        if (n != 67) break block41;
                                                                                                        this.modelSizeY = buffer.readUnsignedShort();
                                                                                                        break block16;
                                                                                                    }
                                                                                                    if (n != 68) break block42;
                                                                                                    this.mapSceneId = buffer.readUnsignedShort();
                                                                                                    break block16;
                                                                                                }
                                                                                                if (n == 69) break block43;
                                                                                                if (n != 70) break block44;
                                                                                                this.offsetX = buffer.readShort();
                                                                                                break block16;
                                                                                            }
                                                                                            if (n != 71) break block45;
                                                                                            this.offsetHeight = buffer.readShort();
                                                                                            break block16;
                                                                                        }
                                                                                        if (n != 72) break block46;
                                                                                        this.offsetY = buffer.readShort();
                                                                                        break block16;
                                                                                    }
                                                                                    if (n != 73) break block47;
                                                                                    this.boolean2 = true;
                                                                                    break block16;
                                                                                }
                                                                                if (n != 74) break block48;
                                                                                this.isSolid = true;
                                                                                break block16;
                                                                            }
                                                                            if (n != 75) break block49;
                                                                            this.int3 = buffer.readUnsignedByte();
                                                                            break block16;
                                                                        }
                                                                        if (n == 77 || n == 92) break block50;
                                                                        if (n == 78) break block51;
                                                                        if (n == 79) break block52;
                                                                        if (n != 81) break block53;
                                                                        buffer.readUnsignedByte();
                                                                        break block16;
                                                                    }
                                                                    if (n != 82) break block54;
                                                                    this.mapIconId = buffer.readUnsignedShort();
                                                                    break block16;
                                                                }
                                                                if (n != 89) break block55;
                                                                this.boolean3 = false;
                                                                break block16;
                                                            }
                                                            if (n != 90) break block56;
                                                            this.field2840 = true;
                                                            break block16;
                                                        }
                                                        if (n != 249) break block16;
                                                        this.params = class1.readStringIntParameters(buffer, this.params);
                                                        break block16;
                                                    }
                                                    this.int5 = buffer.readUnsignedShort();
                                                    this.int6 = buffer.readUnsignedShort();
                                                    this.int7 = buffer.readUnsignedByte() * 16384;
                                                    this.field2835 = buffer.readUnsignedByte() * 16384;
                                                    int n2 = buffer.readUnsignedByte();
                                                    this.soundEffectIds = new int[n2];
                                                    for (int i = 0; i < n2; ++i) {
                                                        this.soundEffectIds[i] = buffer.readUnsignedShort();
                                                    }
                                                    break block16;
                                                }
                                                this.ambientSoundId = buffer.readUnsignedShort();
                                                this.int7 = buffer.readUnsignedByte() * 16384;
                                                this.field2835 = buffer.readUnsignedByte() * 16384;
                                                break block16;
                                            }
                                            this.transformVarbit = buffer.readUnsignedShort();
                                            if (this.transformVarbit == 65535) {
                                                this.transformVarbit = -1;
                                            }
                                            this.transformVarp = buffer.readUnsignedShort();
                                            if (this.transformVarp == 65535) {
                                                this.transformVarp = -1;
                                            }
                                            int n3 = -1;
                                            if (n == 92 && (n3 = buffer.readUnsignedShort()) == 65535) {
                                                n3 = -1;
                                            }
                                            int n4 = buffer.readUnsignedByte();
                                            this.transforms = new int[n4 + 2];
                                            int n5 = 0;
                                            while (true) {
                                                if (n5 > n4) {
                                                    this.transforms[n4 + 1] = n3;
                                                    break block16;
                                                }
                                                this.transforms[n5] = buffer.readUnsignedShort();
                                                if (this.transforms[n5] == 65535) {
                                                    this.transforms[n5] = -1;
                                                }
                                                ++n5;
                                            }
                                        }
                                        buffer.readUnsignedByte();
                                        break block16;
                                    }
                                    buffer.readUnsignedShort();
                                    break block16;
                                }
                                int n6 = buffer.readUnsignedByte();
                                this.retextureFrom = new short[n6];
                                this.retextureTo = new short[n6];
                                for (int i = 0; i < n6; ++i) {
                                    this.retextureFrom[i] = (short)buffer.readUnsignedShort();
                                    this.retextureTo[i] = (short)buffer.readUnsignedShort();
                                }
                                break block16;
                            }
                            int n7 = buffer.readUnsignedByte();
                            this.recolorFrom = new short[n7];
                            this.recolorTo = new short[n7];
                            for (int i = 0; i < n7; ++i) {
                                this.recolorFrom[i] = (short)buffer.readUnsignedShort();
                                this.recolorTo[i] = (short)buffer.readUnsignedShort();
                            }
                            break block16;
                        }
                        this.animationId = buffer.readUnsignedShort();
                        if (this.animationId != 65535) break block16;
                        this.animationId = -1;
                        break block16;
                    }
                    this.interactType = 0;
                    this.boolean1 = false;
                    break block16;
                }
                int n8 = buffer.readUnsignedByte();
                if (n8 <= 0) break block16;
                if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
                    buffer.offset += n8 * 2;
                } else {
                    this.models = null;
                    this.modelIds = new int[n8];
                    for (int i = 0; i < n8; ++i) {
                        this.modelIds[i] = buffer.readUnsignedShort();
                    }
                }
                break block16;
            }
            int n9 = buffer.readUnsignedByte();
            if (n9 > 0) {
                if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
                    buffer.offset += n9 * 3;
                } else {
                    this.models = new int[n9];
                    this.modelIds = new int[n9];
                    for (int i = 0; i < n9; ++i) {
                        this.modelIds[i] = buffer.readUnsignedShort();
                        this.models[i] = buffer.readUnsignedByte();
                    }
                }
            }
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="-2")
    public final boolean method5510(int n) {
        if (this.models != null) {
            int n2 = 0;
            while (true) {
                if (n2 >= this.models.length) {
                    return true;
                }
                if (this.models[n2] == n) {
                    return ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[n2] & 0xFFFF, 0);
                }
                ++n2;
            }
        }
        if (this.modelIds == null) {
            return true;
        }
        if (n != 10) {
            return true;
        }
        boolean bl = true;
        int n3 = 0;
        while (n3 < this.modelIds.length) {
            bl &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[n3] & 0xFFFF, 0);
            ++n3;
        }
        return bl;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-16370576")
    @Export(value="needsModelFiles")
    public final boolean needsModelFiles() {
        if (this.modelIds == null) {
            return true;
        }
        boolean bl = true;
        int n = 0;
        while (n < this.modelIds.length) {
            bl &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[n] & 0xFFFF, 0);
            ++n;
        }
        return bl;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(II[[IIIII)Lhs;", garbageValue="-458675841")
    @Export(value="getEntity")
    public final Renderable getEntity(int n, int n2, int[][] nArray, int n3, int n4, int n5) {
        long l = this.models == null ? (long)(n2 + (this.id << 10)) : (long)(n2 + (n << 3) + (this.id << 10));
        Renderable renderable = (Renderable)ObjectDefinition_cachedEntities.get(l);
        if (renderable == null) {
            ModelData modelData = this.getModelData(n, n2);
            if (modelData == null) {
                return null;
            }
            if (!this.nonFlatShading) {
                renderable = modelData.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
            } else {
                modelData.ambient = (short)(this.ambient + 64);
                modelData.contrast = (short)(this.contrast + 768);
                modelData.calculateVertexNormals();
                renderable = modelData;
            }
            ObjectDefinition_cachedEntities.put(renderable, l);
        }
        if (this.nonFlatShading) {
            renderable = ((ModelData)renderable).copyModelData();
        }
        if (this.clipType >= 0) {
            if (renderable instanceof Model) {
                renderable = ((Model)renderable).contourGround(nArray, n3, n4, n5, true, this.clipType);
            } else if (renderable instanceof ModelData) {
                renderable = ((ModelData)renderable).method3900(nArray, n3, n4, n5, true, this.clipType);
            }
        }
        return renderable;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(II[[IIIIB)Lhv;", garbageValue="-92")
    @Export(value="getModel")
    public final Model getModel(int n, int n2, int[][] nArray, int n3, int n4, int n5) {
        long l = this.models == null ? (long)(n2 + (this.id << 10)) : (long)(n2 + (n << 3) + (this.id << 10));
        Model model = (Model)ObjectDefinition_cachedModels.get(l);
        if (model == null) {
            ModelData modelData = this.getModelData(n, n2);
            if (modelData == null) {
                return null;
            }
            model = modelData.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
            ObjectDefinition_cachedModels.put(model, l);
        }
        if (this.clipType >= 0) {
            model = model.contourGround(nArray, n3, n4, n5, true, this.clipType);
        }
        return model;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(II[[IIIILkb;II)Lhv;", garbageValue="1968590300")
    @Export(value="getModelDynamic")
    public final Model getModelDynamic(int n, int n2, int[][] nArray, int n3, int n4, int n5, SequenceDefinition sequenceDefinition, int n6) {
        long l = this.models == null ? (long)(n2 + (this.id << 10)) : (long)(n2 + (n << 3) + (this.id << 10));
        Model model = (Model)ObjectDefinition_cachedModels.get(l);
        if (model == null) {
            ModelData modelData = this.getModelData(n, n2);
            if (modelData == null) {
                return null;
            }
            model = modelData.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
            ObjectDefinition_cachedModels.put(model, l);
        }
        if (sequenceDefinition == null && this.clipType == -1) {
            return model;
        }
        model = sequenceDefinition == null ? model.toSharedSequenceModel(true) : sequenceDefinition.transformObjectModel(model, n6, n2);
        if (this.clipType >= 0) {
            model = model.contourGround(nArray, n3, n4, n5, false, this.clipType);
        }
        return model;
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(III)Lgx;", garbageValue="746141989")
    @Export(value="getModelData")
    final ModelData getModelData(int var1_1, int var2_2) {
        block30: {
            var3_3 = null;
            if (this.models == null) break block30;
            var4_4 = -1;
            var5_5 = 0;
            while (true) {
                block32: {
                    block31: {
                        if (var5_5 >= this.models.length) break block31;
                        if (this.models[var5_5] != var1_1) break block32;
                        var4_4 = var5_5;
                    }
                    if (var4_4 == -1) {
                        return null;
                    }
                    var5_5 = this.modelIds[var4_4];
                    var6_6 = this.isRotated ^ (var2_2 > 3 ? 1 : 0);
                    if (var6_6 != 0) {
                        var5_5 += 65536;
                    }
                    if ((var3_3 = (ModelData)ObjectComposition.ObjectDefinition_cachedModelData.get(var5_5)) == null) {
                        var3_3 = ModelData.ModelData_get(ObjectComposition.ObjectDefinition_modelsArchive, var5_5 & 65535, 0);
                        if (var3_3 == null) {
                            return null;
                        }
                        if (var6_6 != 0) {
                            var3_3.method3911();
                        }
                        ObjectComposition.ObjectDefinition_cachedModelData.put(var3_3, var5_5);
                    }
                    ** GOTO lbl41
                }
                ++var5_5;
            }
        }
        if (var1_1 != 10) {
            return null;
        }
        if (this.modelIds == null) {
            return null;
        }
        var4_4 = (int)this.isRotated;
        if (var1_1 == 2 && var2_2 > 3) {
            var4_4 = var4_4 == 0 ? 1 : 0;
        }
        var5_5 = this.modelIds.length;
        var6_6 = 0;
        while (true) {
            block33: {
                if (var6_6 < var5_5) break block33;
                if (var5_5 > 1) {
                    var3_3 = new ModelData(ObjectComposition.field2824, var5_5);
                }
lbl41:
                // 4 sources

                var4_4 = this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128 ? 0 : 1;
                var5_5 = this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0 ? 0 : 1;
                var8_8 = new ModelData(var3_3, var2_2 == 0 && var4_4 == 0 && var5_5 == 0, this.recolorFrom == null, this.retextureFrom == null, true);
                if (var1_1 == 4 && var2_2 > 3) {
                    var8_8.method3907(256);
                    var8_8.changeOffset(45, 0, -45);
                }
                if ((var2_2 &= 3) == 1) {
                    var8_8.method3904();
                } else if (var2_2 == 2) {
                    var8_8.method3905();
                } else if (var2_2 == 3) {
                    var8_8.method3894();
                }
                if (this.recolorFrom == null) ** GOTO lbl59
                var7_7 = 0;
                while (true) {
                    block34: {
                        if (var7_7 < this.recolorFrom.length) break block34;
lbl59:
                        // 2 sources

                        if (this.retextureFrom == null) ** GOTO lbl63
                        var7_7 = 0;
                        while (true) {
                            block35: {
                                if (var7_7 < this.retextureFrom.length) break block35;
lbl63:
                                // 2 sources

                                if (var4_4 != 0) {
                                    var8_8.resize(this.modelSizeX, this.modelHeight, this.modelSizeY);
                                }
                                if (var5_5 != 0) {
                                    var8_8.changeOffset(this.offsetX, this.offsetHeight, this.offsetY);
                                }
                                return var8_8;
                            }
                            var8_8.retexture(this.retextureFrom[var7_7], this.retextureTo[var7_7]);
                            ++var7_7;
                        }
                    }
                    var8_8.recolor(this.recolorFrom[var7_7], this.recolorTo[var7_7]);
                    ++var7_7;
                }
            }
            var7_7 = this.modelIds[var6_6];
            if (var4_4 != 0) {
                var7_7 += 65536;
            }
            if ((var3_3 = (ModelData)ObjectComposition.ObjectDefinition_cachedModelData.get(var7_7)) == null) {
                var3_3 = ModelData.ModelData_get(ObjectComposition.ObjectDefinition_modelsArchive, var7_7 & 65535, 0);
                if (var3_3 == null) {
                    return null;
                }
                if (var4_4 != 0) {
                    var3_3.method3911();
                }
                ObjectComposition.ObjectDefinition_cachedModelData.put(var3_3, var7_7);
            }
            if (var5_5 > 1) {
                ObjectComposition.field2824[var6_6] = var3_3;
            }
            ++var6_6;
        }
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)Lkl;", garbageValue="-1458429807")
    @Export(value="transform")
    public final ObjectComposition transform() {
        int n = -1;
        if (this.transformVarbit != -1) {
            n = class77.getVarbit(this.transformVarbit);
        } else if (this.transformVarp != -1) {
            n = Varps.Varps_main[this.transformVarp];
        }
        int n2 = n >= 0 && n < this.transforms.length - 1 ? this.transforms[n] : this.transforms[this.transforms.length - 1];
        if (n2 != -1) {
            return class142.getObjectDefinition(n2);
        }
        return null;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="724984041")
    @Export(value="getIntParam")
    public int getIntParam(int n, int n2) {
        return Canvas.method336(this.params, n, n2);
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;I)Ljava/lang/String;", garbageValue="-1407726908")
    @Export(value="getStringParam")
    public String getStringParam(int n, String string) {
        return class47.method906(this.params, n, string);
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1256792634")
    @Export(value="hasSound")
    public boolean hasSound() {
        if (this.transforms == null) {
            return this.ambientSoundId != -1 || this.soundEffectIds != null;
        }
        int n = 0;
        while (n < this.transforms.length) {
            if (this.transforms[n] != -1) {
                ObjectComposition objectComposition = class142.getObjectDefinition(this.transforms[n]);
                if (objectComposition.ambientSoundId != -1 || objectComposition.soundEffectIds != null) {
                    return true;
                }
            }
            ++n;
        }
        return false;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)Ljq;", garbageValue="8")
    @Export(value="SpotAnimationDefinition_get")
    public static SpotAnimationDefinition SpotAnimationDefinition_get(int n) {
        SpotAnimationDefinition spotAnimationDefinition = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get(n);
        if (spotAnimationDefinition != null) {
            return spotAnimationDefinition;
        }
        byte[] byArray = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, n);
        spotAnimationDefinition = new SpotAnimationDefinition();
        spotAnimationDefinition.id = n;
        if (byArray != null) {
            spotAnimationDefinition.decode(new Buffer(byArray));
        }
        SpotAnimationDefinition.SpotAnimationDefinition_cached.put(spotAnimationDefinition, n);
        return spotAnimationDefinition;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(IIIIB)I", garbageValue="78")
    static final int method5559(int n, int n2, int n3, int n4) {
        int n5 = 65536 - SceneTileModel.Rasterizer3D_cosine[n3 * 1024 / n4] >> 1;
        return ((65536 - n5) * n >> 16) + (n5 * n2 >> 16);
    }

    @ObfuscatedName(value="kr")
    @ObfuscatedSignature(descriptor="(Ldz;Ldu;I)V", garbageValue="583421709")
    static final void method5557(class103 class1032, PendingSpawn pendingSpawn) {
        class187 class1872 = class1032.field1319;
        long l = 0L;
        int n = -1;
        int n2 = 0;
        int n3 = 0;
        if (pendingSpawn.field1180 == 0) {
            l = class1872.method4395(pendingSpawn.field1188, pendingSpawn.field1187, pendingSpawn.field1182);
        }
        if (pendingSpawn.field1180 == 1) {
            l = class1872.method4253(pendingSpawn.field1188, pendingSpawn.field1187, pendingSpawn.field1182);
        }
        if (pendingSpawn.field1180 == 2) {
            l = class1872.method4202(pendingSpawn.field1188, pendingSpawn.field1187, pendingSpawn.field1182);
        }
        if (pendingSpawn.field1180 == 3) {
            l = class1872.method4203(pendingSpawn.field1188, pendingSpawn.field1187, pendingSpawn.field1182);
        }
        if (l != 0L) {
            int n4 = class1872.method4192(pendingSpawn.field1188, pendingSpawn.field1187, pendingSpawn.field1182, l);
            n = class360.method7406(l);
            n2 = n4 & 0x1F;
            n3 = n4 >> 6 & 3;
        }
        pendingSpawn.field1181 = n;
        pendingSpawn.field1179 = n2;
        pendingSpawn.field1184 = n3;
    }
}

