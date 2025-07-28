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

@ObfuscatedName(value="jx")
@Implements(value="KitDefinition")
public class KitDefinition
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    public static AbstractArchive field2562;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="KitDefinition_modelsArchive")
    public static AbstractArchive KitDefinition_modelsArchive;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-596329219)
    public static int field2550;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static EvictingDualNodeHashTable field2548;
    @ObfuscatedName(value="ag")
    @Export(value="ByteArrayPool_altSizeArrayCounts")
    static int[] ByteArrayPool_altSizeArrayCounts;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-2047161983)
    @Export(value="bodypartID")
    int bodypartID = -1;
    @ObfuscatedName(value="an")
    @Export(value="models2")
    int[] models2;
    @ObfuscatedName(value="ae")
    @Export(value="recolorFrom")
    short[] recolorFrom;
    @ObfuscatedName(value="ax")
    @Export(value="recolorTo")
    short[] recolorTo;
    @ObfuscatedName(value="at")
    @Export(value="retextureFrom")
    short[] retextureFrom;
    @ObfuscatedName(value="ac")
    @Export(value="retextureTo")
    short[] retextureTo;
    @ObfuscatedName(value="au")
    @Export(value="models")
    int[] models = new int[]{-1, -1, -1, -1, -1};
    @ObfuscatedName(value="as")
    @Export(value="nonSelectable")
    public boolean nonSelectable = false;

    static {
        field2548 = new EvictingDualNodeHashTable(64);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1489503012")
    @Export(value="decode")
    public void decode(Buffer buffer) {
        int n;
        while ((n = buffer.readUnsignedByte()) != 0) {
            this.decodeNext(buffer, n);
        }
        return;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="2046111270")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        block4: {
            block5: {
                block7: {
                    block8: {
                        block6: {
                            block3: {
                                if (n != 1) break block3;
                                this.bodypartID = buffer.readUnsignedByte();
                                break block4;
                            }
                            if (n == 2) break block5;
                            if (n != 3) break block6;
                            this.nonSelectable = true;
                            break block4;
                        }
                        if (n == 40) break block7;
                        if (n == 41) break block8;
                        if (n < 60 || n >= 70) break block4;
                        this.models[n - 60] = buffer.readUnsignedShort();
                        break block4;
                    }
                    int n2 = buffer.readUnsignedByte();
                    this.retextureFrom = new short[n2];
                    this.retextureTo = new short[n2];
                    for (int i = 0; i < n2; ++i) {
                        this.retextureFrom[i] = (short)buffer.readUnsignedShort();
                        this.retextureTo[i] = (short)buffer.readUnsignedShort();
                    }
                    break block4;
                }
                int n3 = buffer.readUnsignedByte();
                this.recolorFrom = new short[n3];
                this.recolorTo = new short[n3];
                for (int i = 0; i < n3; ++i) {
                    this.recolorFrom[i] = (short)buffer.readUnsignedShort();
                    this.recolorTo[i] = (short)buffer.readUnsignedShort();
                }
                break block4;
            }
            int n4 = buffer.readUnsignedByte();
            this.models2 = new int[n4];
            for (int i = 0; i < n4; ++i) {
                this.models2[i] = buffer.readUnsignedShort();
            }
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="1606136182")
    public boolean method5207(int n, int n2) {
        if (n2 != 1) {
            return this.bodypartID == n;
        }
        return n + 7 == this.bodypartID;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="182221784")
    @Export(value="ready")
    public boolean ready() {
        if (this.models2 == null) {
            return true;
        }
        boolean bl = true;
        for (int i = 0; i < this.models2.length; ++i) {
            if (KitDefinition_modelsArchive.tryLoadFile(this.models2[i], 0)) continue;
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)Lgx;", garbageValue="-364982580")
    @Export(value="getModelData")
    public ModelData getModelData() {
        int n;
        if (this.models2 == null) {
            return null;
        }
        ModelData[] modelDataArray = new ModelData[this.models2.length];
        for (int i = 0; i < this.models2.length; ++i) {
            modelDataArray[i] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[i], 0);
        }
        ModelData modelData = modelDataArray.length == 1 ? modelDataArray[0] : new ModelData(modelDataArray, modelDataArray.length);
        if (this.recolorFrom != null) {
            for (n = 0; n < this.recolorFrom.length; ++n) {
                modelData.recolor(this.recolorFrom[n], this.recolorTo[n]);
            }
        }
        if (this.retextureFrom != null) {
            for (n = 0; n < this.retextureFrom.length; ++n) {
                modelData.retexture(this.retextureFrom[n], this.retextureTo[n]);
            }
        }
        return modelData;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="-115")
    public boolean method5210() {
        boolean bl = true;
        int n = 0;
        while (n < 5) {
            if (this.models[n] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[n], 0)) {
                bl = false;
            }
            ++n;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)Lgx;", garbageValue="-1755493310")
    @Export(value="getKitDefinitionModels")
    public ModelData getKitDefinitionModels() {
        ModelData[] modelDataArray = new ModelData[5];
        int n = 0;
        int n2 = 0;
        while (true) {
            block6: {
                block7: {
                    int n3;
                    block5: {
                        if (n2 >= 5) break block5;
                        if (this.models[n2] == -1) break block6;
                        break block7;
                    }
                    ModelData modelData = new ModelData(modelDataArray, n);
                    if (this.recolorFrom != null) {
                        for (n3 = 0; n3 < this.recolorFrom.length; ++n3) {
                            modelData.recolor(this.recolorFrom[n3], this.recolorTo[n3]);
                        }
                    }
                    if (this.retextureFrom != null) {
                        for (n3 = 0; n3 < this.retextureFrom.length; ++n3) {
                            modelData.retexture(this.retextureFrom[n3], this.retextureTo[n3]);
                        }
                    }
                    return modelData;
                }
                modelDataArray[n++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[n2], 0);
            }
            ++n2;
        }
    }
}

