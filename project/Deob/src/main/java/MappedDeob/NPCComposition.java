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

@ObfuscatedName(value="jz")
@Implements(value="NPCComposition")
public class NPCComposition
extends DualNode {
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="NpcDefinition_archive")
    static AbstractArchive NpcDefinition_archive;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="NpcDefinition_cached")
    static EvictingDualNodeHashTable NpcDefinition_cached;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="NpcDefinition_cachedModels")
    static EvictingDualNodeHashTable NpcDefinition_cachedModels;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1484728147)
    @Export(value="id")
    public int id;
    @ObfuscatedName(value="ae")
    @Export(value="name")
    public String name = "null";
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=544480039)
    @Export(value="size")
    public int size = 1;
    @ObfuscatedName(value="at")
    @Export(value="models")
    int[] models;
    @ObfuscatedName(value="ac")
    int[] field2657;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-2100195497)
    @Export(value="idleSequence")
    public int idleSequence = -1;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=1466777751)
    @Export(value="turnLeftSequence")
    public int turnLeftSequence = -1;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-957173073)
    @Export(value="turnRightSequence")
    public int turnRightSequence = -1;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-1423413901)
    @Export(value="walkSequence")
    public int walkSequence = -1;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=826218875)
    @Export(value="walkBackSequence")
    public int walkBackSequence = -1;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=1547035255)
    @Export(value="walkLeftSequence")
    public int walkLeftSequence = -1;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-777259805)
    @Export(value="walkRightSequence")
    public int walkRightSequence = -1;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=1418125129)
    public int field2659 = -1;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=-525811383)
    public int field2633 = -1;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=-1855644605)
    public int field2634 = -1;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-9235403)
    public int field2623 = -1;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=332535463)
    public int field2636 = -1;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=-864477045)
    public int field2649 = -1;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=1501008845)
    public int field2660 = -1;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=-1966830645)
    public int field2639 = -1;
    @ObfuscatedName(value="aj")
    @Export(value="recolorFrom")
    short[] recolorFrom;
    @ObfuscatedName(value="bu")
    @Export(value="recolorTo")
    public short[] recolorTo;
    @ObfuscatedName(value="bh")
    @Export(value="retextureFrom")
    short[] retextureFrom;
    @ObfuscatedName(value="bw")
    @Export(value="retextureTo")
    public short[] retextureTo;
    @ObfuscatedName(value="bb")
    @Export(value="actions")
    public String[] actions = new String[5];
    @ObfuscatedName(value="bx")
    public boolean field2645 = true;
    @ObfuscatedName(value="bd")
    @ObfuscatedGetter(intValue=-1351731847)
    @Export(value="combatLevel")
    public int combatLevel = -1;
    @ObfuscatedName(value="bi")
    @ObfuscatedGetter(intValue=257998873)
    @Export(value="widthScale")
    int widthScale = 128;
    @ObfuscatedName(value="bz")
    @ObfuscatedGetter(intValue=953998459)
    @Export(value="heightScale")
    int heightScale = 128;
    @ObfuscatedName(value="bt")
    public boolean field2620 = false;
    @ObfuscatedName(value="bf")
    @ObfuscatedGetter(intValue=-85195023)
    int field2637 = 0;
    @ObfuscatedName(value="by")
    @ObfuscatedGetter(intValue=-471108415)
    int field2651 = 0;
    @ObfuscatedName(value="bm")
    @ObfuscatedGetter(intValue=-1268584791)
    public int field2652 = 32;
    @ObfuscatedName(value="bp")
    @Export(value="transforms")
    public int[] transforms;
    @ObfuscatedName(value="bg")
    @ObfuscatedGetter(intValue=-1243761615)
    @Export(value="transformVarbit")
    int transformVarbit = -1;
    @ObfuscatedName(value="bc")
    @ObfuscatedGetter(intValue=-2004054639)
    @Export(value="transformVarp")
    int transformVarp = -1;
    @ObfuscatedName(value="bv")
    public boolean field2656 = true;
    @ObfuscatedName(value="bq")
    public boolean field2624 = true;
    @ObfuscatedName(value="ba")
    public boolean field2658 = false;
    @ObfuscatedName(value="bk")
    public boolean field2638 = false;
    @ObfuscatedName(value="bs")
    @Export(value="headIconArchiveIds")
    int[] headIconArchiveIds = null;
    @ObfuscatedName(value="bj")
    @Export(value="headIconSpriteIndex")
    short[] headIconSpriteIndex = null;
    @ObfuscatedName(value="bo")
    @ObfuscatedGetter(intValue=879404947)
    public int field2662 = -1;
    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="Lue;")
    @Export(value="params")
    IterableNodeHashTable params;
    @ObfuscatedName(value="bn")
    int[] field2664 = new int[]{1, 1, 1, 1, 1, 1};

    static {
        NpcDefinition_cached = new EvictingDualNodeHashTable(64);
        NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50);
    }

    NPCComposition() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="0")
    @Export(value="postDecode")
    void postDecode() {
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-864949448")
    @Export(value="decode")
    void decode(Buffer buffer) {
        int n;
        while ((n = buffer.readUnsignedByte()) != 0) {
            this.decodeNext(buffer, n);
        }
        return;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="1091946639")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        block14: {
            block15: {
                block22: {
                    block23: {
                        block25: {
                            block26: {
                                block27: {
                                    block41: {
                                        block43: {
                                            block47: {
                                                block49: {
                                                    block52: {
                                                        block51: {
                                                            block50: {
                                                                block48: {
                                                                    block46: {
                                                                        block45: {
                                                                            block44: {
                                                                                block42: {
                                                                                    block40: {
                                                                                        block39: {
                                                                                            block38: {
                                                                                                block37: {
                                                                                                    block36: {
                                                                                                        block35: {
                                                                                                            block34: {
                                                                                                                block33: {
                                                                                                                    block32: {
                                                                                                                        block31: {
                                                                                                                            block30: {
                                                                                                                                block29: {
                                                                                                                                    block28: {
                                                                                                                                        block24: {
                                                                                                                                            block21: {
                                                                                                                                                block20: {
                                                                                                                                                    block19: {
                                                                                                                                                        block18: {
                                                                                                                                                            block17: {
                                                                                                                                                                block16: {
                                                                                                                                                                    if (n == 1) break block15;
                                                                                                                                                                    if (n != 2) break block16;
                                                                                                                                                                    this.name = buffer.readStringCp1252NullTerminated();
                                                                                                                                                                    break block14;
                                                                                                                                                                }
                                                                                                                                                                if (n != 12) break block17;
                                                                                                                                                                this.size = buffer.readUnsignedByte();
                                                                                                                                                                break block14;
                                                                                                                                                            }
                                                                                                                                                            if (n != 13) break block18;
                                                                                                                                                            this.idleSequence = buffer.readUnsignedShort();
                                                                                                                                                            break block14;
                                                                                                                                                        }
                                                                                                                                                        if (n != 14) break block19;
                                                                                                                                                        this.walkSequence = buffer.readUnsignedShort();
                                                                                                                                                        break block14;
                                                                                                                                                    }
                                                                                                                                                    if (n != 15) break block20;
                                                                                                                                                    this.turnLeftSequence = buffer.readUnsignedShort();
                                                                                                                                                    break block14;
                                                                                                                                                }
                                                                                                                                                if (n != 16) break block21;
                                                                                                                                                this.turnRightSequence = buffer.readUnsignedShort();
                                                                                                                                                break block14;
                                                                                                                                            }
                                                                                                                                            if (n == 17) break block22;
                                                                                                                                            if (n == 18) break block23;
                                                                                                                                            if (n < 30 || n >= 35) break block24;
                                                                                                                                            this.actions[n - 30] = buffer.readStringCp1252NullTerminated();
                                                                                                                                            if (!this.actions[n - 30].equalsIgnoreCase("Hidden")) break block14;
                                                                                                                                            this.actions[n - 30] = null;
                                                                                                                                            break block14;
                                                                                                                                        }
                                                                                                                                        if (n == 40) break block25;
                                                                                                                                        if (n == 41) break block26;
                                                                                                                                        if (n == 60) break block27;
                                                                                                                                        if (n != 74) break block28;
                                                                                                                                        this.field2664[0] = buffer.readUnsignedShort();
                                                                                                                                        break block14;
                                                                                                                                    }
                                                                                                                                    if (n != 75) break block29;
                                                                                                                                    this.field2664[1] = buffer.readUnsignedShort();
                                                                                                                                    break block14;
                                                                                                                                }
                                                                                                                                if (n != 76) break block30;
                                                                                                                                this.field2664[2] = buffer.readUnsignedShort();
                                                                                                                                break block14;
                                                                                                                            }
                                                                                                                            if (n != 77) break block31;
                                                                                                                            this.field2664[3] = buffer.readUnsignedShort();
                                                                                                                            break block14;
                                                                                                                        }
                                                                                                                        if (n != 78) break block32;
                                                                                                                        this.field2664[4] = buffer.readUnsignedShort();
                                                                                                                        break block14;
                                                                                                                    }
                                                                                                                    if (n != 79) break block33;
                                                                                                                    this.field2664[5] = buffer.readUnsignedShort();
                                                                                                                    break block14;
                                                                                                                }
                                                                                                                if (n != 93) break block34;
                                                                                                                this.field2645 = false;
                                                                                                                break block14;
                                                                                                            }
                                                                                                            if (n != 95) break block35;
                                                                                                            this.combatLevel = buffer.readUnsignedShort();
                                                                                                            break block14;
                                                                                                        }
                                                                                                        if (n != 97) break block36;
                                                                                                        this.widthScale = buffer.readUnsignedShort();
                                                                                                        break block14;
                                                                                                    }
                                                                                                    if (n != 98) break block37;
                                                                                                    this.heightScale = buffer.readUnsignedShort();
                                                                                                    break block14;
                                                                                                }
                                                                                                if (n != 99) break block38;
                                                                                                this.field2620 = true;
                                                                                                break block14;
                                                                                            }
                                                                                            if (n != 100) break block39;
                                                                                            this.field2637 = buffer.readByte();
                                                                                            break block14;
                                                                                        }
                                                                                        if (n != 101) break block40;
                                                                                        this.field2651 = buffer.readByte() * 5;
                                                                                        break block14;
                                                                                    }
                                                                                    if (n == 102) break block41;
                                                                                    if (n != 103) break block42;
                                                                                    this.field2652 = buffer.readUnsignedShort();
                                                                                    break block14;
                                                                                }
                                                                                if (n == 106 || n == 118) break block43;
                                                                                if (n != 107) break block44;
                                                                                this.field2656 = false;
                                                                                break block14;
                                                                            }
                                                                            if (n != 109) break block45;
                                                                            this.field2624 = false;
                                                                            break block14;
                                                                        }
                                                                        if (n != 114) break block46;
                                                                        this.field2659 = buffer.readUnsignedShort();
                                                                        break block14;
                                                                    }
                                                                    if (n == 115) break block47;
                                                                    if (n != 116) break block48;
                                                                    this.field2636 = buffer.readUnsignedShort();
                                                                    break block14;
                                                                }
                                                                if (n == 117) break block49;
                                                                if (n != 122) break block50;
                                                                this.field2658 = true;
                                                                break block14;
                                                            }
                                                            if (n != 123) break block51;
                                                            this.field2638 = true;
                                                            break block14;
                                                        }
                                                        if (n != 124) break block52;
                                                        this.field2662 = buffer.readUnsignedShort();
                                                        break block14;
                                                    }
                                                    if (n != 249) break block14;
                                                    this.params = class1.readStringIntParameters(buffer, this.params);
                                                    break block14;
                                                }
                                                this.field2636 = buffer.readUnsignedShort();
                                                this.field2649 = buffer.readUnsignedShort();
                                                this.field2660 = buffer.readUnsignedShort();
                                                this.field2639 = buffer.readUnsignedShort();
                                                break block14;
                                            }
                                            this.field2659 = buffer.readUnsignedShort();
                                            this.field2633 = buffer.readUnsignedShort();
                                            this.field2634 = buffer.readUnsignedShort();
                                            this.field2623 = buffer.readUnsignedShort();
                                            break block14;
                                        }
                                        this.transformVarbit = buffer.readUnsignedShort();
                                        if (this.transformVarbit == 65535) {
                                            this.transformVarbit = -1;
                                        }
                                        this.transformVarp = buffer.readUnsignedShort();
                                        if (this.transformVarp == 65535) {
                                            this.transformVarp = -1;
                                        }
                                        int n2 = -1;
                                        if (n == 118 && (n2 = buffer.readUnsignedShort()) == 65535) {
                                            n2 = -1;
                                        }
                                        int n3 = buffer.readUnsignedByte();
                                        this.transforms = new int[n3 + 2];
                                        int n4 = 0;
                                        while (true) {
                                            if (n4 > n3) {
                                                this.transforms[n3 + 1] = n2;
                                                break block14;
                                            }
                                            this.transforms[n4] = buffer.readUnsignedShort();
                                            if (this.transforms[n4] == 65535) {
                                                this.transforms[n4] = -1;
                                            }
                                            ++n4;
                                        }
                                    }
                                    int n5 = buffer.readUnsignedByte();
                                    int n6 = 0;
                                    int n7 = n5;
                                    while (true) {
                                        if (n7 == 0) {
                                            this.headIconArchiveIds = new int[n6];
                                            this.headIconSpriteIndex = new short[n6];
                                            for (int i = 0; i < n6; ++i) {
                                                if ((n5 & 1 << i) != 0) {
                                                    this.headIconArchiveIds[i] = buffer.method10476();
                                                    this.headIconSpriteIndex[i] = (short)buffer.method10441();
                                                    continue;
                                                }
                                                this.headIconArchiveIds[i] = -1;
                                                this.headIconSpriteIndex[i] = -1;
                                            }
                                            break block14;
                                        }
                                        ++n6;
                                        n7 >>= 1;
                                    }
                                }
                                int n8 = buffer.readUnsignedByte();
                                this.field2657 = new int[n8];
                                for (int i = 0; i < n8; ++i) {
                                    this.field2657[i] = buffer.readUnsignedShort();
                                }
                                break block14;
                            }
                            int n9 = buffer.readUnsignedByte();
                            this.retextureFrom = new short[n9];
                            this.retextureTo = new short[n9];
                            for (int i = 0; i < n9; ++i) {
                                this.retextureFrom[i] = (short)buffer.readUnsignedShort();
                                this.retextureTo[i] = (short)buffer.readUnsignedShort();
                            }
                            break block14;
                        }
                        int n10 = buffer.readUnsignedByte();
                        this.recolorFrom = new short[n10];
                        this.recolorTo = new short[n10];
                        for (int i = 0; i < n10; ++i) {
                            this.recolorFrom[i] = (short)buffer.readUnsignedShort();
                            this.recolorTo[i] = (short)buffer.readUnsignedShort();
                        }
                        break block14;
                    }
                    buffer.readUnsignedShort();
                    break block14;
                }
                this.walkSequence = buffer.readUnsignedShort();
                this.walkBackSequence = buffer.readUnsignedShort();
                this.walkLeftSequence = buffer.readUnsignedShort();
                this.walkRightSequence = buffer.readUnsignedShort();
                break block14;
            }
            int n11 = buffer.readUnsignedByte();
            this.models = new int[n11];
            for (int i = 0; i < n11; ++i) {
                this.models[i] = buffer.readUnsignedShort();
            }
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lkb;ILkb;ILjs;B)Lhv;", garbageValue="125")
    @Export(value="getModel")
    public final Model getModel(SequenceDefinition sequenceDefinition, int n, SequenceDefinition sequenceDefinition2, int n2, NewStuff newStuff) {
        block6: {
            block8: {
                Renderable renderable;
                Model model;
                block7: {
                    if (this.transforms != null) break block6;
                    long l = this.id;
                    if (newStuff != null) {
                        l |= newStuff.field2613 << 16;
                    }
                    if ((model = (Model)NpcDefinition_cachedModels.get(l)) != null) break block7;
                    renderable = this.getModelData(this.models, newStuff);
                    if (renderable == null) break block8;
                    model = ((ModelData)renderable).toModel(this.field2637 + 64, this.field2651 + 850, -30, -50, -30);
                    NpcDefinition_cachedModels.put(model, l);
                }
                renderable = sequenceDefinition != null && sequenceDefinition2 != null ? sequenceDefinition.applyTransformations(model, n, sequenceDefinition2, n2) : (sequenceDefinition != null ? sequenceDefinition.transformActorModel(model, n) : (sequenceDefinition2 != null ? sequenceDefinition2.transformActorModel(model, n2) : model.toSharedSequenceModel(true)));
                if (this.widthScale != 128 || this.heightScale != 128) {
                    ((Model)renderable).scale(this.widthScale, this.heightScale, this.widthScale);
                }
                return renderable;
            }
            return null;
        }
        NPCComposition nPCComposition = this.transform();
        if (nPCComposition != null) {
            return nPCComposition.getModel(sequenceDefinition, n, sequenceDefinition2, n2, newStuff);
        }
        return null;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Ljs;B)Lgx;", garbageValue="80")
    public final ModelData method5342(NewStuff newStuff) {
        if (this.transforms == null) {
            return this.getModelData(this.field2657, newStuff);
        }
        NPCComposition nPCComposition = this.transform();
        if (nPCComposition != null) {
            return nPCComposition.method5342(newStuff);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="([ILjs;I)Lgx;", garbageValue="-571439410")
    @Export(value="getModelData")
    ModelData getModelData(int[] nArray, NewStuff newStuff) {
        int[] nArray2 = nArray;
        if (newStuff != null && newStuff.field2611 != null) {
            nArray2 = newStuff.field2611;
        }
        if (nArray2 == null) {
            return null;
        }
        boolean bl = false;
        int n = 0;
        while (true) {
            block12: {
                block13: {
                    int n2;
                    short[] sArray;
                    ModelData modelData;
                    block15: {
                        ModelData[] modelDataArray;
                        block16: {
                            block14: {
                                block11: {
                                    if (n >= nArray2.length) break block11;
                                    if (nArray2[n] == -1) break block12;
                                    break block13;
                                }
                                if (bl) {
                                    return null;
                                }
                                modelDataArray = new ModelData[nArray2.length];
                                for (int i = 0; i < nArray2.length; ++i) {
                                    modelDataArray[i] = ModelData.ModelData_get(class430.field4779, nArray2[i], 0);
                                }
                                if (modelDataArray.length != 1) break block14;
                                modelData = modelDataArray[0];
                                if (modelData != null) break block15;
                                break block16;
                            }
                            modelData = new ModelData(modelDataArray, modelDataArray.length);
                            break block15;
                        }
                        modelData = new ModelData(modelDataArray, modelDataArray.length);
                    }
                    if (this.recolorFrom != null) {
                        sArray = this.recolorTo;
                        if (newStuff != null && newStuff.field2612 != null) {
                            sArray = newStuff.field2612;
                        }
                        for (n2 = 0; n2 < this.recolorFrom.length; ++n2) {
                            modelData.recolor(this.recolorFrom[n2], sArray[n2]);
                        }
                    }
                    if (this.retextureFrom == null) return modelData;
                    sArray = this.retextureTo;
                    if (newStuff != null && newStuff.field2610 != null) {
                        sArray = newStuff.field2610;
                    }
                    n2 = 0;
                    while (n2 < this.retextureFrom.length) {
                        modelData.retexture(this.retextureFrom[n2], sArray[n2]);
                        ++n2;
                    }
                    return modelData;
                }
                if (!class430.field4779.tryLoadFile(nArray2[n], 0)) {
                    bl = true;
                }
            }
            ++n;
        }
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(B)Ljz;", garbageValue="112")
    @Export(value="transform")
    public final NPCComposition transform() {
        int n = -1;
        if (this.transformVarbit != -1) {
            n = class77.getVarbit(this.transformVarbit);
        } else if (this.transformVarp != -1) {
            n = Varps.Varps_main[this.transformVarp];
        }
        int n2 = n >= 0 && n < this.transforms.length - 1 ? this.transforms[n] : this.transforms[this.transforms.length - 1];
        if (n2 != -1) {
            return class446.getNpcDefinition(n2);
        }
        return null;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="-96")
    @Export(value="transformIsVisible")
    public boolean transformIsVisible() {
        if (this.transforms == null) {
            return true;
        }
        int n = -1;
        if (this.transformVarbit != -1) {
            n = class77.getVarbit(this.transformVarbit);
        } else if (this.transformVarp != -1) {
            n = Varps.Varps_main[this.transformVarp];
        }
        if (n >= 0 && n < this.transforms.length) {
            return this.transforms[n] != -1;
        }
        return this.transforms[this.transforms.length - 1] != -1;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="-2059003076")
    @Export(value="getIntParam")
    public int getIntParam(int n, int n2) {
        return Canvas.method336(this.params, n, n2);
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;I)Ljava/lang/String;", garbageValue="2072668217")
    @Export(value="getStringParam")
    public String getStringParam(int n, String string) {
        return class47.method906(this.params, n, string);
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="53")
    public boolean method5306() {
        return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(I)[I", garbageValue="-1580797982")
    public int[] method5338() {
        return this.headIconArchiveIds;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="7")
    public int method5330(int n) {
        if (this.headIconArchiveIds != null && n < this.headIconArchiveIds.length) {
            return this.headIconArchiveIds[n];
        }
        return -1;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)[S", garbageValue="829641065")
    public short[] method5308() {
        return this.headIconSpriteIndex;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(II)S", garbageValue="-2033521077")
    public short method5309(int n) {
        if (this.headIconSpriteIndex != null && n < this.headIconSpriteIndex.length) {
            return this.headIconSpriteIndex[n];
        }
        return -1;
    }

    @ObfuscatedName(value="np")
    @ObfuscatedSignature(descriptor="(Ldt;ZB)V", garbageValue="0")
    @Export(value="closeInterface")
    static final void closeInterface(InterfaceParent interfaceParent, boolean bl) {
        int n = interfaceParent.group;
        int n2 = (int)interfaceParent.key;
        interfaceParent.remove();
        if (bl) {
            ClanChannel.field1807.method7021(n);
        }
        CollisionMap.method5831(n);
        Widget widget = ClanChannel.field1807.method7031(n2);
        if (widget != null) {
            UserComparator8.invalidateWidget(widget);
        }
        if (Client.rootInterface != -1) {
            Client.method1709(Client.rootInterface, 1);
        }
    }
}

