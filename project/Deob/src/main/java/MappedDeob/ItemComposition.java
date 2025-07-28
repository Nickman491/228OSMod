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

@ObfuscatedName(value="km")
@Implements(value="ItemComposition")
public class ItemComposition
extends DualNode {
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="ItemDefinition_cached")
    public static EvictingDualNodeHashTable ItemDefinition_cached = new EvictingDualNodeHashTable(64);
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="ItemDefinition_cachedModels")
    public static EvictingDualNodeHashTable ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50);
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="ItemDefinition_cachedSprites")
    public static EvictingDualNodeHashTable ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200);
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-892737005)
    @Export(value="id")
    int id;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-2136818033)
    @Export(value="model")
    int model;
    @ObfuscatedName(value="al")
    @Export(value="name")
    public String name = "null";
    @ObfuscatedName(value="av")
    public String field2853 = "null";
    @ObfuscatedName(value="ag")
    @Export(value="recolorFrom")
    short[] recolorFrom;
    @ObfuscatedName(value="aw")
    @Export(value="recolorTo")
    short[] recolorTo;
    @ObfuscatedName(value="ai")
    @Export(value="retextureFrom")
    short[] retextureFrom;
    @ObfuscatedName(value="ar")
    @Export(value="retextureTo")
    short[] retextureTo;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=119514159)
    @Export(value="zoom2d")
    public int zoom2d = 2000;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=276276175)
    @Export(value="xan2d")
    public int xan2d = 0;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=799654401)
    @Export(value="yan2d")
    public int yan2d = 0;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-1071851413)
    @Export(value="zan2d")
    public int zan2d = 0;
    @ObfuscatedName(value="bu")
    @ObfuscatedGetter(intValue=1952162727)
    @Export(value="offsetX2d")
    public int offsetX2d = 0;
    @ObfuscatedName(value="bh")
    @ObfuscatedGetter(intValue=-767015285)
    @Export(value="offsetY2d")
    public int offsetY2d = 0;
    @ObfuscatedName(value="bx")
    @ObfuscatedGetter(intValue=553532525)
    @Export(value="isStackable")
    public int isStackable = 0;
    @ObfuscatedName(value="bd")
    @ObfuscatedGetter(intValue=-1439711833)
    @Export(value="maleModel")
    public int maleModel = 1;
    @ObfuscatedName(value="bi")
    @ObfuscatedGetter(intValue=-1905187571)
    @Export(value="maleModel1")
    public int maleModel1 = -1;
    @ObfuscatedName(value="bz")
    @ObfuscatedGetter(intValue=1125129175)
    @Export(value="maleModel2")
    public int maleModel2 = -1;
    @ObfuscatedName(value="bt")
    @ObfuscatedGetter(intValue=-1417048927)
    public int field2878 = -1;
    @ObfuscatedName(value="bf")
    @Export(value="isMembersOnly")
    public boolean isMembersOnly = false;
    @ObfuscatedName(value="by")
    @Export(value="groundActions")
    public String[] groundActions = new String[]{null, null, "Take", null, null};
    @ObfuscatedName(value="bm")
    @Export(value="inventoryActions")
    public String[] inventoryActions = new String[]{null, null, null, null, "Drop"};
    @ObfuscatedName(value="bp")
    public String[][] field2872 = null;
    @ObfuscatedName(value="bc")
    @ObfuscatedGetter(intValue=-1741976857)
    @Export(value="shiftClickIndex")
    int shiftClickIndex = -2;
    @ObfuscatedName(value="bv")
    @ObfuscatedGetter(intValue=-1049243131)
    @Export(value="femaleModel1")
    int femaleModel1 = -1;
    @ObfuscatedName(value="bq")
    @ObfuscatedGetter(intValue=-109723523)
    @Export(value="maleHeadModel")
    int maleHeadModel = -1;
    @ObfuscatedName(value="ba")
    @ObfuscatedGetter(intValue=2135044085)
    int field2876 = 0;
    @ObfuscatedName(value="bk")
    @ObfuscatedGetter(intValue=-619364413)
    @Export(value="maleHeadModel2")
    int maleHeadModel2 = -1;
    @ObfuscatedName(value="bs")
    @ObfuscatedGetter(intValue=1167900573)
    int field2857 = -1;
    @ObfuscatedName(value="bj")
    @ObfuscatedGetter(intValue=380180787)
    int field2847 = 0;
    @ObfuscatedName(value="bo")
    @ObfuscatedGetter(intValue=474682293)
    int field2877 = -1;
    @ObfuscatedName(value="be")
    @ObfuscatedGetter(intValue=-973052635)
    int field2855 = -1;
    @ObfuscatedName(value="bn")
    @ObfuscatedGetter(intValue=-441648217)
    int field2852 = -1;
    @ObfuscatedName(value="br")
    @ObfuscatedGetter(intValue=706978655)
    int field2883 = -1;
    @ObfuscatedName(value="bl")
    @ObfuscatedGetter(intValue=224115793)
    int field2884 = -1;
    @ObfuscatedName(value="cb")
    @ObfuscatedGetter(intValue=1891834093)
    int field2885 = -1;
    @ObfuscatedName(value="cn")
    @Export(value="countobj")
    int[] countobj;
    @ObfuscatedName(value="cc")
    @Export(value="countco")
    int[] countco;
    @ObfuscatedName(value="co")
    @ObfuscatedGetter(intValue=324168927)
    @Export(value="note")
    public int note = -1;
    @ObfuscatedName(value="ca")
    @ObfuscatedGetter(intValue=-2102002821)
    @Export(value="noteTemplate")
    public int noteTemplate = -1;
    @ObfuscatedName(value="cg")
    @ObfuscatedGetter(intValue=-676025685)
    @Export(value="resizeX")
    int resizeX = 128;
    @ObfuscatedName(value="cp")
    @ObfuscatedGetter(intValue=-1065577369)
    @Export(value="resizeY")
    int resizeY = 128;
    @ObfuscatedName(value="cz")
    @ObfuscatedGetter(intValue=-1443180817)
    @Export(value="resizeZ")
    int resizeZ = 128;
    @ObfuscatedName(value="cy")
    @ObfuscatedGetter(intValue=1763920749)
    public int field2893 = 0;
    @ObfuscatedName(value="cu")
    @ObfuscatedGetter(intValue=1283640709)
    public int field2868 = 0;
    @ObfuscatedName(value="cq")
    @ObfuscatedGetter(intValue=600104221)
    public int field2895 = 0;
    @ObfuscatedName(value="cf")
    @ObfuscatedGetter(intValue=796033429)
    public int field2896 = 0;
    @ObfuscatedName(value="ct")
    @ObfuscatedSignature(descriptor="Lue;")
    @Export(value="params")
    IterableNodeHashTable params;
    @ObfuscatedName(value="ci")
    @Export(value="isTradable")
    public boolean isTradable = false;
    @ObfuscatedName(value="cl")
    @ObfuscatedGetter(intValue=-1385069669)
    @Export(value="unnotedId")
    int unnotedId = -1;
    @ObfuscatedName(value="cw")
    @ObfuscatedGetter(intValue=1482194655)
    @Export(value="notedId")
    int notedId = -1;
    @ObfuscatedName(value="cj")
    @ObfuscatedGetter(intValue=-181289213)
    @Export(value="placeholder")
    public int placeholder = -1;
    @ObfuscatedName(value="cx")
    @ObfuscatedGetter(intValue=1463720475)
    @Export(value="placeholderTemplate")
    public int placeholderTemplate = -1;

    ItemComposition() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="164105098")
    @Export(value="post")
    void post() {
        if (this.isStackable == 1) {
            this.field2896 = 0;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-625177235")
    @Export(value="decode")
    void decode(Buffer buffer) {
        int n;
        while ((n = buffer.readUnsignedByte()) != 0) {
            this.decodeNext(buffer, n);
        }
        return;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="1710442107")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        if (n == 1) {
            this.model = buffer.readUnsignedShort();
        } else if (n == 2) {
            this.name = buffer.readStringCp1252NullTerminated();
        } else if (n == 3) {
            this.field2853 = buffer.readStringCp1252NullTerminated();
        } else if (n == 4) {
            this.zoom2d = buffer.readUnsignedShort();
        } else if (n == 5) {
            this.xan2d = buffer.readUnsignedShort();
        } else if (n == 6) {
            this.yan2d = buffer.readUnsignedShort();
        } else if (n != 7) {
            if (n != 8) {
                if (n != 9) {
                    if (n == 11) {
                        this.isStackable = 1;
                    } else if (n == 12) {
                        this.maleModel = buffer.readInt();
                    } else if (n == 13) {
                        this.maleModel1 = buffer.readUnsignedByte();
                    } else if (n == 14) {
                        this.maleModel2 = buffer.readUnsignedByte();
                    } else if (n == 16) {
                        this.isMembersOnly = true;
                    } else if (n != 23) {
                        if (n == 24) {
                            this.maleHeadModel = buffer.readUnsignedShort();
                        } else if (n != 25) {
                            if (n == 26) {
                                this.field2857 = buffer.readUnsignedShort();
                            } else if (n == 27) {
                                this.field2878 = buffer.readUnsignedByte();
                            } else if (n >= 30 && n < 35) {
                                this.groundActions[n - 30] = buffer.readStringCp1252NullTerminated();
                                if (this.groundActions[n - 30].equalsIgnoreCase("Hidden")) {
                                    this.groundActions[n - 30] = null;
                                }
                            } else if (n >= 35 && n < 40) {
                                this.inventoryActions[n - 35] = buffer.readStringCp1252NullTerminated();
                            } else if (n != 40) {
                                if (n != 41) {
                                    if (n != 42) {
                                        if (n != 43) {
                                            if (n != 65) {
                                                if (n == 75) {
                                                    this.field2896 = buffer.readShort();
                                                } else if (n == 78) {
                                                    this.field2877 = buffer.readUnsignedShort();
                                                } else if (n == 79) {
                                                    this.field2855 = buffer.readUnsignedShort();
                                                } else if (n == 90) {
                                                    this.field2852 = buffer.readUnsignedShort();
                                                } else if (n == 91) {
                                                    this.field2884 = buffer.readUnsignedShort();
                                                } else if (n == 92) {
                                                    this.field2883 = buffer.readUnsignedShort();
                                                } else if (n == 93) {
                                                    this.field2885 = buffer.readUnsignedShort();
                                                } else if (n != 94) {
                                                    if (n == 95) {
                                                        this.zan2d = buffer.readUnsignedShort();
                                                    } else if (n == 97) {
                                                        this.note = buffer.readUnsignedShort();
                                                    } else if (n == 98) {
                                                        this.noteTemplate = buffer.readUnsignedShort();
                                                    } else if (n >= 100 && n < 110) {
                                                        if (this.countobj == null) {
                                                            this.countobj = new int[10];
                                                            this.countco = new int[10];
                                                        }
                                                        this.countobj[n - 100] = buffer.readUnsignedShort();
                                                        this.countco[n - 100] = buffer.readUnsignedShort();
                                                    } else if (n == 110) {
                                                        this.resizeX = buffer.readUnsignedShort();
                                                    } else if (n == 111) {
                                                        this.resizeY = buffer.readUnsignedShort();
                                                    } else if (n == 112) {
                                                        this.resizeZ = buffer.readUnsignedShort();
                                                    } else if (n == 113) {
                                                        this.field2893 = buffer.readByte();
                                                    } else if (n == 114) {
                                                        this.field2868 = buffer.readByte() * 5;
                                                    } else if (n == 115) {
                                                        this.field2895 = buffer.readUnsignedByte();
                                                    } else if (n == 139) {
                                                        this.unnotedId = buffer.readUnsignedShort();
                                                    } else if (n == 140) {
                                                        this.notedId = buffer.readUnsignedShort();
                                                    } else if (n == 148) {
                                                        this.placeholder = buffer.readUnsignedShort();
                                                    } else if (n == 149) {
                                                        this.placeholderTemplate = buffer.readUnsignedShort();
                                                    } else if (n == 249) {
                                                        this.params = class1.readStringIntParameters(buffer, this.params);
                                                    }
                                                } else {
                                                    buffer.readUnsignedShort();
                                                }
                                            } else {
                                                this.isTradable = true;
                                            }
                                        } else {
                                            int n2;
                                            boolean bl;
                                            int n3 = buffer.readUnsignedByte();
                                            if (this.field2872 == null) {
                                                this.field2872 = new String[5][];
                                            }
                                            boolean bl2 = bl = n3 >= 0 && n3 < 5;
                                            if (bl && this.field2872[n3] == null) {
                                                this.field2872[n3] = new String[20];
                                            }
                                            while ((n2 = buffer.readUnsignedByte() - 1) != -1) {
                                                String string = buffer.readStringCp1252NullTerminated();
                                                if (!bl || n2 < 0 || n2 >= 20) continue;
                                                this.field2872[n3][n2] = string;
                                            }
                                        }
                                    } else {
                                        this.shiftClickIndex = buffer.readByte();
                                    }
                                } else {
                                    int n4 = buffer.readUnsignedByte();
                                    this.retextureFrom = new short[n4];
                                    this.retextureTo = new short[n4];
                                    for (int i = 0; i < n4; ++i) {
                                        this.retextureFrom[i] = (short)buffer.readUnsignedShort();
                                        this.retextureTo[i] = (short)buffer.readUnsignedShort();
                                    }
                                }
                            } else {
                                int n5 = buffer.readUnsignedByte();
                                this.recolorFrom = new short[n5];
                                this.recolorTo = new short[n5];
                                for (int i = 0; i < n5; ++i) {
                                    this.recolorFrom[i] = (short)buffer.readUnsignedShort();
                                    this.recolorTo[i] = (short)buffer.readUnsignedShort();
                                }
                            }
                        } else {
                            this.maleHeadModel2 = buffer.readUnsignedShort();
                            this.field2847 = buffer.readUnsignedByte();
                        }
                    } else {
                        this.femaleModel1 = buffer.readUnsignedShort();
                        this.field2876 = buffer.readUnsignedByte();
                    }
                } else {
                    buffer.readStringCp1252NullTerminated();
                }
            } else {
                this.offsetY2d = buffer.readUnsignedShort();
                if (this.offsetY2d > Short.MAX_VALUE) {
                    this.offsetY2d -= 65536;
                }
            }
        } else {
            this.offsetX2d = buffer.readUnsignedShort();
            if (this.offsetX2d > Short.MAX_VALUE) {
                this.offsetX2d -= 65536;
            }
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lkm;Lkm;I)V", garbageValue="-931912257")
    @Export(value="genCert")
    void genCert(ItemComposition itemComposition, ItemComposition itemComposition2) {
        this.model = itemComposition.model;
        this.zoom2d = itemComposition.zoom2d;
        this.xan2d = itemComposition.xan2d;
        this.yan2d = itemComposition.yan2d;
        this.zan2d = itemComposition.zan2d;
        this.offsetX2d = itemComposition.offsetX2d;
        this.offsetY2d = itemComposition.offsetY2d;
        this.recolorFrom = itemComposition.recolorFrom;
        this.recolorTo = itemComposition.recolorTo;
        this.retextureFrom = itemComposition.retextureFrom;
        this.retextureTo = itemComposition.retextureTo;
        this.name = itemComposition2.name;
        this.field2853 = "Swap this note at any bank for the equivalent item";
        this.isMembersOnly = itemComposition2.isMembersOnly;
        this.maleModel = itemComposition2.maleModel;
        this.isStackable = 1;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lkm;Lkm;S)V", garbageValue="-5411")
    @Export(value="genBought")
    void genBought(ItemComposition itemComposition, ItemComposition itemComposition2) {
        this.model = itemComposition.model;
        this.zoom2d = itemComposition.zoom2d;
        this.xan2d = itemComposition.xan2d;
        this.yan2d = itemComposition.yan2d;
        this.zan2d = itemComposition.zan2d;
        this.offsetX2d = itemComposition.offsetX2d;
        this.offsetY2d = itemComposition.offsetY2d;
        this.recolorFrom = itemComposition2.recolorFrom;
        this.recolorTo = itemComposition2.recolorTo;
        this.retextureFrom = itemComposition2.retextureFrom;
        this.retextureTo = itemComposition2.retextureTo;
        this.name = itemComposition2.name;
        this.field2853 = itemComposition2.field2853;
        this.isMembersOnly = itemComposition2.isMembersOnly;
        this.isStackable = itemComposition2.isStackable;
        this.maleModel1 = itemComposition2.maleModel1;
        this.maleModel2 = itemComposition2.maleModel2;
        this.field2878 = itemComposition2.field2878;
        this.femaleModel1 = itemComposition2.femaleModel1;
        this.maleHeadModel = itemComposition2.maleHeadModel;
        this.field2877 = itemComposition2.field2877;
        this.maleHeadModel2 = itemComposition2.maleHeadModel2;
        this.field2857 = itemComposition2.field2857;
        this.field2855 = itemComposition2.field2855;
        this.field2852 = itemComposition2.field2852;
        this.field2883 = itemComposition2.field2883;
        this.field2884 = itemComposition2.field2884;
        this.field2885 = itemComposition2.field2885;
        this.field2895 = itemComposition2.field2895;
        this.groundActions = itemComposition2.groundActions;
        this.field2896 = itemComposition2.field2896;
        this.inventoryActions = new String[5];
        if (itemComposition2.inventoryActions != null) {
            for (int i = 0; i < 4; ++i) {
                this.inventoryActions[i] = itemComposition2.inventoryActions[i];
            }
        }
        this.inventoryActions[4] = "Discard";
        if (itemComposition2.field2872 == null) {
            this.field2872 = null;
        } else {
            this.field2872 = new String[5][];
            System.arraycopy(itemComposition2.field2872, 0, this.field2872, 0, 4);
        }
        this.maleModel = 0;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lkm;Lkm;I)V", garbageValue="786881847")
    @Export(value="genPlaceholder")
    void genPlaceholder(ItemComposition itemComposition, ItemComposition itemComposition2) {
        this.model = itemComposition.model;
        this.zoom2d = itemComposition.zoom2d;
        this.xan2d = itemComposition.xan2d;
        this.yan2d = itemComposition.yan2d;
        this.zan2d = itemComposition.zan2d;
        this.offsetX2d = itemComposition.offsetX2d;
        this.offsetY2d = itemComposition.offsetY2d;
        this.recolorFrom = itemComposition.recolorFrom;
        this.recolorTo = itemComposition.recolorTo;
        this.retextureFrom = itemComposition.retextureFrom;
        this.retextureTo = itemComposition.retextureTo;
        this.isStackable = itemComposition.isStackable;
        this.name = itemComposition2.name;
        this.field2853 = itemComposition2.field2853;
        this.maleModel = 0;
        this.isMembersOnly = false;
        this.isTradable = false;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(II)Lgx;", garbageValue="-1768715510")
    @Export(value="getModelData")
    public final ModelData getModelData(int n) {
        ModelData modelData;
        if (this.countobj != null && n > 1) {
            int n2 = -1;
            int n3 = 0;
            while (true) {
                if (n3 >= 10) {
                    if (n2 == -1) break;
                    return FaceNormal.ItemDefinition_get(n2).getModelData(1);
                }
                if (n >= this.countco[n3] && this.countco[n3] != 0) {
                    n2 = this.countobj[n3];
                }
                ++n3;
            }
        }
        if ((modelData = ModelData.ModelData_get(UrlRequester.ItemDefinition_modelArchive, this.model, 0)) == null) {
            return null;
        }
        if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
            modelData.resize(this.resizeX, this.resizeY, this.resizeZ);
        }
        this.method5574(modelData, null);
        return modelData;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(IB)Lhv;", garbageValue="-79")
    @Export(value="getModel")
    public final Model getModel(int n) {
        Model model;
        if (this.countobj != null && n > 1) {
            int n2 = -1;
            int n3 = 0;
            while (true) {
                if (n3 >= 10) {
                    if (n2 == -1) break;
                    return FaceNormal.ItemDefinition_get(n2).getModel(1);
                }
                if (n >= this.countco[n3] && this.countco[n3] != 0) {
                    n2 = this.countobj[n3];
                }
                ++n3;
            }
        }
        if ((model = (Model)ItemDefinition_cachedModels.get(this.id)) != null) {
            return model;
        }
        ModelData modelData = ModelData.ModelData_get(UrlRequester.ItemDefinition_modelArchive, this.model, 0);
        if (modelData == null) {
            return null;
        }
        if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
            modelData.resize(this.resizeX, this.resizeY, this.resizeZ);
        }
        this.method5574(modelData, null);
        model = modelData.toModel(this.field2893 + 64, this.field2868 + 768, -50, -10, -50);
        model.isSingleTile = true;
        ItemDefinition_cachedModels.put(model, this.id);
        return model;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Lia;I)Lhv;", garbageValue="-1284864010")
    public final Model method5582(class228 class2282) {
        Model model = class2282.field2483;
        if (model != null) {
            return model;
        }
        ModelData modelData = ModelData.ModelData_get(UrlRequester.ItemDefinition_modelArchive, class2282.field2474, 0);
        if (modelData == null) {
            return null;
        }
        if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
            modelData.resize(this.resizeX, this.resizeY, this.resizeZ);
        }
        this.method5574(modelData, class2282);
        model = modelData.toModel(this.field2893 + 64, this.field2868 + 768, -50, -10, -50);
        model.isSingleTile = true;
        class2282.field2483 = model;
        return model;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(II)Lkm;", garbageValue="-100301827")
    @Export(value="getCountObj")
    public ItemComposition getCountObj(int n) {
        if (this.countobj != null && n > 1) {
            int n2 = -1;
            int n3 = 0;
            while (true) {
                if (n3 >= 10) {
                    if (n2 == -1) break;
                    return FaceNormal.ItemDefinition_get(n2);
                }
                if (n >= this.countco[n3] && this.countco[n3] != 0) {
                    n2 = this.countobj[n3];
                }
                ++n3;
            }
        }
        return this;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(ILia;I)Z", garbageValue="403119401")
    public final boolean method5571(int n, class228 class2282) {
        int n2 = this.femaleModel1;
        int n3 = this.maleHeadModel;
        int n4 = this.field2877;
        if (n == 1) {
            n2 = this.maleHeadModel2;
            n3 = this.field2857;
            n4 = this.field2855;
        }
        if (class2282 != null && class2282.method5083(n)) {
            n2 = class2282.method5099(n);
        }
        if (n2 == -1) {
            return true;
        }
        boolean bl = true;
        if (!UrlRequester.ItemDefinition_modelArchive.tryLoadFile(n2, 0)) {
            bl = false;
        }
        if (n3 != -1 && !UrlRequester.ItemDefinition_modelArchive.tryLoadFile(n3, 0)) {
            bl = false;
        }
        if (n4 != -1 && !UrlRequester.ItemDefinition_modelArchive.tryLoadFile(n4, 0)) {
            bl = false;
        }
        return bl;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(ILia;I)Lgx;", garbageValue="811824866")
    public final ModelData method5572(int n, class228 class2282) {
        int n2 = this.femaleModel1;
        int n3 = this.maleHeadModel;
        int n4 = this.field2877;
        if (n == 1) {
            n2 = this.maleHeadModel2;
            n3 = this.field2857;
            n4 = this.field2855;
        }
        if (class2282 != null && class2282.method5083(n)) {
            n2 = class2282.method5099(n);
        }
        if (n2 == -1) {
            return null;
        }
        ModelData modelData = ModelData.ModelData_get(UrlRequester.ItemDefinition_modelArchive, n2, 0);
        if (n3 != -1) {
            ModelData modelData2 = ModelData.ModelData_get(UrlRequester.ItemDefinition_modelArchive, n3, 0);
            if (n4 == -1) {
                ModelData[] modelDataArray = new ModelData[]{modelData, modelData2};
                modelData = new ModelData(modelDataArray, 2);
            } else {
                ModelData modelData3 = ModelData.ModelData_get(UrlRequester.ItemDefinition_modelArchive, n4, 0);
                ModelData[] modelDataArray = new ModelData[]{modelData, modelData2, modelData3};
                modelData = new ModelData(modelDataArray, 3);
            }
        }
        if (n == 0 && this.field2876 != 0) {
            modelData.changeOffset(0, this.field2876, 0);
        }
        if (n == 1 && this.field2847 != 0) {
            modelData.changeOffset(0, this.field2847, 0);
        }
        this.method5574(modelData, class2282);
        return modelData;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(ILia;B)Z", garbageValue="42")
    public final boolean method5630(int n, class228 class2282) {
        int n2 = this.field2852;
        int n3 = this.field2883;
        if (n == 1) {
            n2 = this.field2884;
            n3 = this.field2885;
        }
        if (class2282 != null && class2282.method5084(n)) {
            n2 = class2282.method5080(n);
        }
        if (n2 == -1) {
            return true;
        }
        boolean bl = true;
        if (!UrlRequester.ItemDefinition_modelArchive.tryLoadFile(n2, 0)) {
            bl = false;
        }
        if (n3 != -1 && !UrlRequester.ItemDefinition_modelArchive.tryLoadFile(n3, 0)) {
            bl = false;
        }
        return bl;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(ILia;I)Lgx;", garbageValue="1783399362")
    public final ModelData method5573(int n, class228 class2282) {
        int n2 = this.field2852;
        int n3 = this.field2883;
        if (n == 1) {
            n2 = this.field2884;
            n3 = this.field2885;
        }
        if (class2282 != null && class2282.method5084(n)) {
            n2 = class2282.method5080(n);
        }
        if (n2 == -1) {
            return null;
        }
        ModelData modelData = ModelData.ModelData_get(UrlRequester.ItemDefinition_modelArchive, n2, 0);
        if (n3 != -1) {
            ModelData modelData2 = ModelData.ModelData_get(UrlRequester.ItemDefinition_modelArchive, n3, 0);
            ModelData[] modelDataArray = new ModelData[]{modelData, modelData2};
            modelData = new ModelData(modelDataArray, 2);
        }
        this.method5574(modelData, class2282);
        return modelData;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(Lgx;Lia;B)V", garbageValue="16")
    void method5574(ModelData modelData, class228 class2282) {
        int n;
        short[] sArray;
        short[] sArray2;
        if (this.recolorFrom != null) {
            sArray2 = this.recolorFrom;
            sArray = this.recolorTo;
            if (class2282 != null && class2282.field2479 != null && this.recolorTo.length == class2282.field2479.length) {
                sArray = class2282.field2479;
            }
            for (n = 0; n < this.recolorFrom.length; ++n) {
                modelData.recolor(sArray2[n], sArray[n]);
            }
        }
        if (this.retextureFrom != null) {
            sArray2 = this.retextureFrom;
            sArray = this.retextureTo;
            if (class2282 != null && class2282.field2477 != null && this.retextureTo.length == class2282.field2477.length) {
                sArray = class2282.field2477;
            }
            for (n = 0; n < this.retextureFrom.length; ++n) {
                modelData.retexture(sArray2[n], sArray[n]);
            }
        }
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="-1636243841")
    @Export(value="getIntParam")
    public int getIntParam(int n, int n2) {
        return Canvas.method336(this.params, n, n2);
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;I)Ljava/lang/String;", garbageValue="181061069")
    @Export(value="getStringParam")
    public String getStringParam(int n, String string) {
        return class47.method906(this.params, n, string);
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="69")
    @Export(value="getShiftClickIndex")
    public int getShiftClickIndex() {
        if (this.shiftClickIndex != -1 && this.inventoryActions != null) {
            if (this.shiftClickIndex >= 0) {
                return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
            }
            return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1;
        }
        return -1;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1865588074")
    boolean method5611() {
        return this.recolorTo != null;
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="101")
    boolean method5579() {
        return this.retextureTo != null;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([BZS)Ljava/lang/Object;", garbageValue="-20607")
    public static Object method5587(byte[] byArray, boolean bl) {
        if (byArray == null) {
            return null;
        }
        if (byArray.length <= 136) {
            return byArray;
        }
        DirectByteArrayCopier directByteArrayCopier = new DirectByteArrayCopier();
        ((AbstractByteArrayCopier)directByteArrayCopier).set(byArray);
        return directByteArrayCopier;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="-62")
    public static int method5643(int n) {
        return class331.field3612[n];
    }
}

