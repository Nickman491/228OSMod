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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kb")
@Implements(value="SequenceDefinition")
public class SequenceDefinition
extends DualNode {
    @ObfuscatedName(value="ay")
    static boolean field2929 = false;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="SequenceDefinition_archive")
    static AbstractArchive SequenceDefinition_archive;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="SequenceDefinition_animationsArchive")
    static AbstractArchive SequenceDefinition_animationsArchive;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="SequenceDefinition_cached")
    public static EvictingDualNodeHashTable SequenceDefinition_cached;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="SequenceDefinition_cachedFrames")
    public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="SequenceDefinition_cachedModel")
    public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=60028421)
    @Export(value="SequenceDefinition_cachedModelId")
    public int SequenceDefinition_cachedModelId = -1;
    @ObfuscatedName(value="as")
    public Map field2925;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-678949869)
    int field2933 = 0;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-1744682479)
    int field2927 = 0;
    @ObfuscatedName(value="aa")
    @Export(value="frameIds")
    public int[] frameIds;
    @ObfuscatedName(value="ak")
    @Export(value="chatFrameIds")
    int[] chatFrameIds;
    @ObfuscatedName(value="al")
    @Export(value="frameLengths")
    public int[] frameLengths;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=1098686809)
    public int field2931;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=-1359646447)
    @Export(value="frameCount")
    public int frameCount = -1;
    @ObfuscatedName(value="aw")
    int[] field2939;
    @ObfuscatedName(value="ai")
    boolean[] field2934;
    @ObfuscatedName(value="ar")
    public boolean field2935 = false;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=1521215721)
    public int field2930 = 5;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=200620891)
    @Export(value="shield")
    public int shield = -1;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=1447383493)
    @Export(value="weapon")
    public int weapon = -1;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=1573723465)
    public int field2936 = 99;
    @ObfuscatedName(value="bu")
    public boolean field2940 = false;
    @ObfuscatedName(value="bh")
    @ObfuscatedGetter(intValue=1885296837)
    public int field2941 = -1;
    @ObfuscatedName(value="bw")
    @ObfuscatedGetter(intValue=-1458237697)
    public int field2942 = -1;
    @ObfuscatedName(value="bb")
    @ObfuscatedGetter(intValue=94594965)
    public int field2943 = 2;

    static {
        SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
        SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
        SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
    }

    SequenceDefinition() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-2092056201")
    @Export(value="decode")
    void decode(Buffer buffer) {
        int n;
        while ((n = buffer.readUnsignedByte()) != 0) {
            this.decodeNext(buffer, n);
        }
        return;
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="-807712818")
    @Export(value="decodeNext")
    void decodeNext(Buffer var1_1, int var2_2) {
        block17: {
            block18: {
                block20: {
                    block25: {
                        block29: {
                            block30: {
                                block31: {
                                    block28: {
                                        block27: {
                                            block26: {
                                                block24: {
                                                    block23: {
                                                        block22: {
                                                            block21: {
                                                                block19: {
                                                                    if (var2_2 == 1) break block18;
                                                                    if (var2_2 != 2) break block19;
                                                                    this.frameCount = var1_1.readUnsignedShort();
                                                                    break block17;
                                                                }
                                                                if (var2_2 == 3) break block20;
                                                                if (var2_2 != 4) break block21;
                                                                this.field2935 = true;
                                                                break block17;
                                                            }
                                                            if (var2_2 != 5) break block22;
                                                            this.field2930 = var1_1.readUnsignedByte();
                                                            break block17;
                                                        }
                                                        if (var2_2 != 6) break block23;
                                                        this.shield = var1_1.readUnsignedShort();
                                                        break block17;
                                                    }
                                                    if (var2_2 != 7) break block24;
                                                    this.weapon = var1_1.readUnsignedShort();
                                                    break block17;
                                                }
                                                if (var2_2 == 8) break block25;
                                                if (var2_2 != 9) break block26;
                                                this.field2941 = var1_1.readUnsignedByte();
                                                break block17;
                                            }
                                            if (var2_2 != 10) break block27;
                                            this.field2942 = var1_1.readUnsignedByte();
                                            break block17;
                                        }
                                        if (var2_2 != 11) break block28;
                                        this.field2943 = var1_1.readUnsignedByte();
                                        break block17;
                                    }
                                    if (var2_2 == 12) break block29;
                                    if (var2_2 == 13) break block30;
                                    if (var2_2 == 14) break block31;
                                    if (var2_2 != 15) {
                                        if (var2_2 == 17) {
                                            this.field2934 = new boolean[256];
                                            var3_3 = 0;
                                            while (true) {
                                                if (var3_3 >= this.field2934.length) {
                                                    var3_3 = var1_1.readUnsignedByte();
                                                    for (var4_8 = 0; var4_8 < var3_3; ++var4_8) {
                                                        this.field2934[var1_1.readUnsignedByte()] = true;
                                                    }
                                                    break block17;
                                                }
                                                this.field2934[var3_3] = false;
                                                ++var3_3;
                                            }
                                        }
                                    } else {
                                        this.field2933 = var1_1.readUnsignedShort();
                                        this.field2927 = var1_1.readUnsignedShort();
                                    }
                                    break block17;
                                }
                                var3_4 = var1_1.readUnsignedShort();
                                if (this.field2925 == null) {
                                    this.field2925 = new HashMap<K, V>();
                                }
                                for (var4_9 = 0; var4_9 < var3_4; ++var4_9) {
                                    var5_13 = var1_1.readUnsignedShort();
                                    if (var1_1 == null) ** GOTO lbl-1000
                                    var7_15 = 0;
                                    var8_16 = -1;
                                    var9_17 = 0;
                                    var10_18 = 0;
                                    var11_19 = 0;
                                    var7_15 = var1_1.readUnsignedShort();
                                    var8_16 = var1_1.readUnsignedByte();
                                    var9_17 = var1_1.readUnsignedByte();
                                    var10_18 = var1_1.readUnsignedByte();
                                    var11_19 = var1_1.readUnsignedByte();
                                    if (var7_15 >= 1 && var9_17 >= 1 && var10_18 >= 0 && var11_19 >= 0) {
                                        var6_14 = new class261(var7_15, var8_16, var9_17, var10_18, var11_19);
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var6_14 = null;
                                    }
                                    var12_20 = var6_14;
                                    if (var12_20 == null) continue;
                                    if (!this.field2925.containsKey(var5_13)) {
                                        this.field2925.put(var5_13, new ArrayList<E>());
                                    }
                                    ((ArrayList)this.field2925.get(var5_13)).add(var12_20);
                                }
                                break block17;
                            }
                            this.SequenceDefinition_cachedModelId = var1_1.readInt();
                            break block17;
                        }
                        var3_5 = var1_1.readUnsignedByte();
                        this.chatFrameIds = new int[var3_5];
                        for (var4_10 = 0; var4_10 < var3_5; ++var4_10) {
                            this.chatFrameIds[var4_10] = var1_1.readUnsignedShort();
                        }
                        for (var4_10 = 0; var4_10 < var3_5; ++var4_10) {
                            this.chatFrameIds[var4_10] = (var1_1.readUnsignedShort() << 16) + this.chatFrameIds[var4_10];
                        }
                        break block17;
                    }
                    this.field2936 = var1_1.readUnsignedByte();
                    this.field2940 = true;
                    break block17;
                }
                var3_6 = var1_1.readUnsignedByte();
                this.field2939 = new int[var3_6 + 1];
                for (var4_11 = 0; var4_11 < var3_6; ++var4_11) {
                    this.field2939[var4_11] = var1_1.readUnsignedByte();
                }
                this.field2939[var3_6] = 9999999;
                break block17;
            }
            var3_7 = var1_1.readUnsignedShort();
            this.frameLengths = new int[var3_7];
            for (var4_12 = 0; var4_12 < var3_7; ++var4_12) {
                this.frameLengths[var4_12] = var1_1.readUnsignedShort();
            }
            this.frameIds = new int[var3_7];
            for (var4_12 = 0; var4_12 < var3_7; ++var4_12) {
                this.frameIds[var4_12] = var1_1.readUnsignedShort();
            }
            for (var4_12 = 0; var4_12 < var3_7; ++var4_12) {
                this.frameIds[var4_12] = (var1_1.readUnsignedShort() << 16) + this.frameIds[var4_12];
            }
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="69648")
    @Export(value="postDecode")
    void postDecode() {
        if (this.field2941 == -1) {
            this.field2941 = this.field2939 == null && this.field2934 == null ? 0 : 2;
        }
        if (this.field2942 == -1) {
            this.field2942 = this.field2939 == null && this.field2934 == null ? 0 : 2;
        }
        if (this.frameLengths != null) {
            this.field2931 = 0;
            for (int i = 0; i < this.frameLengths.length; ++i) {
                this.field2931 += this.frameLengths[i];
            }
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lhv;II)Lhv;", garbageValue="638240262")
    @Export(value="transformActorModel")
    public Model transformActorModel(Model model, int n) {
        if (this.isCachedModelIdSet()) {
            int n2 = this.SequenceDefinition_cachedModelId;
            class144 class1442 = class166.method3808(n2) == 0 ? class137.method3480(n2) : null;
            class144 class1443 = class1442;
            if (class1443 == null) {
                return model.toSharedSequenceModel(true);
            }
            Model model2 = model.toSharedSequenceModel(!class1443.method3535());
            model2.method4548(class1443, n);
            return model2;
        }
        n = this.frameIds[n];
        Frames frames = ModelData0.getFrames(n >> 16);
        n &= 0xFFFF;
        if (frames == null) {
            return model.toSharedSequenceModel(true);
        }
        Model model3 = model.toSharedSequenceModel(!frames.hasAlphaTransform(n));
        model3.animate(frames, n);
        return model3;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lhv;III)Lhv;", garbageValue="-2023406835")
    @Export(value="transformObjectModel")
    Model transformObjectModel(Model model, int n, int n2) {
        if (this.isCachedModelIdSet()) {
            int n3 = this.SequenceDefinition_cachedModelId;
            class144 class1442 = class166.method3808(n3) == 0 ? class137.method3480(n3) : null;
            class144 class1443 = class1442;
            if (class1443 == null) {
                return model.toSharedSequenceModel(true);
            }
            Model model2 = model.toSharedSequenceModel(!class1443.method3535());
            if ((n2 &= 3) == 1) {
                model2.rotateY270Ccw();
            } else if (n2 == 2) {
                model2.rotateY180();
            } else if (n2 == 3) {
                model2.rotateY90Ccw();
            }
            model2.method4548(class1443, n);
            if (n2 == 1) {
                model2.rotateY90Ccw();
            } else if (n2 == 2) {
                model2.rotateY180();
            } else if (n2 == 3) {
                model2.rotateY270Ccw();
            }
            return model2;
        }
        n = this.frameIds[n];
        Frames frames = ModelData0.getFrames(n >> 16);
        n &= 0xFFFF;
        if (frames == null) {
            return model.toSharedSequenceModel(true);
        }
        Model model3 = model.toSharedSequenceModel(!frames.hasAlphaTransform(n));
        if ((n2 &= 3) == 1) {
            model3.rotateY270Ccw();
        } else if (n2 == 2) {
            model3.rotateY180();
        } else if (n2 == 3) {
            model3.rotateY90Ccw();
        }
        model3.animate(frames, n);
        if (n2 == 1) {
            model3.rotateY90Ccw();
        } else if (n2 == 2) {
            model3.rotateY180();
        } else if (n2 == 3) {
            model3.rotateY270Ccw();
        }
        return model3;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lhv;II)Lhv;", garbageValue="1769373549")
    Model method5698(Model model, int n) {
        if (this.isCachedModelIdSet()) {
            int n2 = this.SequenceDefinition_cachedModelId;
            class144 class1442 = class166.method3808(n2) == 0 ? class137.method3480(n2) : null;
            class144 class1443 = class1442;
            if (class1443 == null) {
                return model.method4652(true);
            }
            Model model2 = model.method4652(!class1443.method3535());
            model2.method4548(class1443, n);
            return model2;
        }
        n = this.frameIds[n];
        Frames frames = ModelData0.getFrames(n >> 16);
        n &= 0xFFFF;
        if (frames == null) {
            return model.method4652(true);
        }
        Model model3 = model.method4652(!frames.hasAlphaTransform(n));
        model3.animate(frames, n);
        return model3;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Lhv;ILkb;IB)Lhv;", garbageValue="0")
    @Export(value="applyTransformations")
    public Model applyTransformations(Model model, int n, SequenceDefinition sequenceDefinition, int n2) {
        Model model2;
        block15: {
            block18: {
                Frames frames;
                boolean bl;
                block17: {
                    DualNode dualNode;
                    Skeleton skeleton;
                    block16: {
                        block14: {
                            block12: {
                                block13: {
                                    if (field2929 && !this.isCachedModelIdSet() && !sequenceDefinition.isCachedModelIdSet()) {
                                        return this.method5670(model, n, sequenceDefinition, n2);
                                    }
                                    model2 = model.toSharedSequenceModel(false);
                                    bl = false;
                                    frames = null;
                                    skeleton = null;
                                    if (this.isCachedModelIdSet()) break block12;
                                    n = this.frameIds[n];
                                    frames = ModelData0.getFrames(n >> 16);
                                    n &= 0xFFFF;
                                    if (frames == null) {
                                        return sequenceDefinition.transformActorModel(model, n2);
                                    }
                                    if (!(sequenceDefinition.isCachedModelIdSet() || this.field2939 != null && n2 != -1)) {
                                        model2.animate(frames, n);
                                        return model2;
                                    }
                                    if (this.field2939 == null || n2 == -1) break block13;
                                    bl = sequenceDefinition.isCachedModelIdSet();
                                    if (!bl) {
                                        model2.method4598(frames, n, this.field2939, false);
                                    }
                                    break block14;
                                }
                                model2.animate(frames, n);
                                return model2;
                            }
                            dualNode = this.method5705();
                            if (dualNode == null) break block15;
                            if (sequenceDefinition.isCachedModelIdSet() && this.field2934 == null) {
                                model2.method4548((class144)dualNode, n);
                                return model2;
                            }
                            skeleton = dualNode.field1641;
                            model2.method4552(skeleton, (class144)dualNode, n, this.field2934, false, !sequenceDefinition.isCachedModelIdSet());
                        }
                        if (sequenceDefinition.isCachedModelIdSet()) break block16;
                        n2 = sequenceDefinition.frameIds[n2];
                        dualNode = ModelData0.getFrames(n2 >> 16);
                        n2 &= 0xFFFF;
                        if (dualNode == null) {
                            return this.transformActorModel(model, n);
                        }
                        model2.method4598((Frames)dualNode, n2, this.field2939, true);
                        break block17;
                    }
                    dualNode = sequenceDefinition.method5705();
                    if (dualNode == null) break block18;
                    if (skeleton == null) {
                        skeleton = dualNode.field1641;
                    }
                    model2.method4552(skeleton, (class144)dualNode, n2, this.field2934, true, true);
                }
                if (bl && frames != null) {
                    model2.method4598(frames, n, this.field2939, false);
                }
                model2.resetBounds();
                return model2;
            }
            return model2;
        }
        return model2;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Lhv;ILkb;II)Lhv;", garbageValue="-912603730")
    Model method5670(Model model, int n, SequenceDefinition sequenceDefinition, int n2) {
        n = this.frameIds[n];
        Frames frames = ModelData0.getFrames(n >> 16);
        n &= 0xFFFF;
        if (frames == null) {
            return sequenceDefinition.transformActorModel(model, n2);
        }
        n2 = sequenceDefinition.frameIds[n2];
        Frames frames2 = ModelData0.getFrames(n2 >> 16);
        n2 &= 0xFFFF;
        if (frames2 != null) {
            Model model2 = model.toSharedSequenceModel(!frames.hasAlphaTransform(n) & !frames2.hasAlphaTransform(n2));
            model2.animate2(frames, n, frames2, n2, this.field2939);
            return model2;
        }
        Model model3 = model.toSharedSequenceModel(!frames.hasAlphaTransform(n));
        model3.animate(frames, n);
        return model3;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Lhv;II)Lhv;", garbageValue="-1011483730")
    @Export(value="transformWidgetModel")
    public Model transformWidgetModel(Model model, int n) {
        if (this.isCachedModelIdSet()) {
            return this.transformActorModel(model, n);
        }
        int n2 = this.frameIds[n];
        Frames frames = ModelData0.getFrames(n2 >> 16);
        n2 &= 0xFFFF;
        if (frames == null) {
            return model.toSharedSequenceModel(true);
        }
        Frames frames2 = null;
        int n3 = 0;
        if (this.chatFrameIds != null && n < this.chatFrameIds.length) {
            n3 = this.chatFrameIds[n];
            frames2 = ModelData0.getFrames(n3 >> 16);
            n3 &= 0xFFFF;
        }
        if (frames2 != null && n3 != 65535) {
            Model model2 = model.toSharedSequenceModel(!frames.hasAlphaTransform(n2) & !frames2.hasAlphaTransform(n3));
            model2.animate(frames, n2);
            model2.animate(frames2, n3);
            return model2;
        }
        Model model3 = model.toSharedSequenceModel(!frames.hasAlphaTransform(n2));
        model3.animate(frames, n2);
        return model3;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1695266658")
    @Export(value="isCachedModelIdSet")
    public boolean isCachedModelIdSet() {
        return this.SequenceDefinition_cachedModelId >= 0;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-2097289927")
    public int method5703() {
        return this.field2927 - this.field2933;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)Lfl;", garbageValue="-165631079")
    class144 method5705() {
        if (!this.isCachedModelIdSet()) {
            return null;
        }
        int n = this.SequenceDefinition_cachedModelId;
        class144 class1442 = class166.method3808(n) == 0 ? class137.method3480(n) : null;
        return class1442;
    }

    @ObfuscatedName(value="mw")
    @ObfuscatedSignature(descriptor="(Lna;II)I", garbageValue="-1403304937")
    static final int method5725(Widget widget, int n) {
        if (widget.cs1Instructions == null || n >= widget.cs1Instructions.length) {
            return -2;
        }
        try {
            int[] nArray = widget.cs1Instructions[n];
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            while (true) {
                int n5;
                int n6;
                Widget widget2;
                int n7;
                int n8 = nArray[n3++];
                int n9 = 0;
                int n10 = 0;
                if (n8 == 0) {
                    return n2;
                }
                if (n8 == 1) {
                    n9 = Client.currentLevels[nArray[n3++]];
                }
                if (n8 == 2) {
                    n9 = Client.levels[nArray[n3++]];
                }
                if (n8 == 3) {
                    n9 = Client.experience[nArray[n3++]];
                }
                if (n8 == 4) {
                    n7 = nArray[n3++] << 16;
                    widget2 = ClanChannel.field1807.method7031(n7 += nArray[n3++]);
                    if ((n6 = nArray[n3++]) != -1 && (!FaceNormal.ItemDefinition_get((int)n6).isMembersOnly || Client.isMembersWorld)) {
                        for (n5 = 0; n5 < widget2.field3903.length; ++n5) {
                            if (n6 + 1 != widget2.field3903[n5]) continue;
                            n9 += widget2.field4009[n5];
                        }
                    }
                }
                if (n8 == 5) {
                    n9 = Varps.Varps_main[nArray[n3++]];
                }
                if (n8 == 6) {
                    n9 = Skills.Skills_experienceTable[Client.levels[nArray[n3++]] - 1];
                }
                if (n8 == 7) {
                    n9 = Varps.Varps_main[nArray[n3++]] * 100 / 46875;
                }
                if (n8 == 8) {
                    n9 = ModeWhere.localPlayer.field1136;
                }
                if (n8 == 9) {
                    for (n7 = 0; n7 < 25; ++n7) {
                        if (!Skills.Skills_enabled[n7]) continue;
                        n9 = Client.levels[n7] + n9;
                    }
                }
                if (n8 == 10) {
                    n7 = nArray[n3++] << 16;
                    widget2 = ClanChannel.field1807.method7031(n7 += nArray[n3++]);
                    if ((n6 = nArray[n3++]) != -1 && (!FaceNormal.ItemDefinition_get((int)n6).isMembersOnly || Client.isMembersWorld)) {
                        for (n5 = 0; n5 < widget2.field3903.length; ++n5) {
                            if (n6 + 1 != widget2.field3903[n5]) continue;
                            n9 = 999999999;
                            break;
                        }
                    }
                }
                if (n8 == 11) {
                    n9 = Client.runEnergy;
                }
                if (n8 == 12) {
                    n9 = Client.weight;
                }
                if (n8 == 13) {
                    int n11;
                    int n12 = n9 = ((n7 = Varps.Varps_main[nArray[n3++]]) & 1 << (n11 = nArray[n3++])) != 0 ? 1 : 0;
                }
                if (n8 == 14) {
                    n7 = nArray[n3++];
                    n9 = class77.getVarbit(n7);
                }
                if (n8 == 15) {
                    n10 = 1;
                }
                if (n8 == 16) {
                    n10 = 2;
                }
                if (n8 == 17) {
                    n10 = 3;
                }
                if (n8 == 18) {
                    n9 = (ModeWhere.localPlayer.x >> 7) + GameEngine.field189.field1324;
                }
                if (n8 == 19) {
                    n9 = (ModeWhere.localPlayer.field1196 >> 7) + GameEngine.field189.field1325;
                }
                if (n8 == 20) {
                    n9 = nArray[n3++];
                }
                if (n10 == 0) {
                    if (n4 == 0) {
                        n2 += n9;
                    }
                    if (n4 == 1) {
                        n2 -= n9;
                    }
                    if (n4 == 2 && n9 != 0) {
                        n2 /= n9;
                    }
                    if (n4 == 3) {
                        n2 *= n9;
                    }
                    n4 = 0;
                    continue;
                }
                n4 = n10;
            }
        }
        catch (Exception exception) {
            return -1;
        }
    }
}

