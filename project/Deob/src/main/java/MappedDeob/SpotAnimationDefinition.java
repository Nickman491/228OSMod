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

@ObfuscatedName(value="jq")
@Implements(value="SpotAnimationDefinition")
public class SpotAnimationDefinition
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="SpotAnimationDefinition_archive")
    static AbstractArchive SpotAnimationDefinition_archive;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpq;")
    static AbstractArchive field2700;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="SpotAnimationDefinition_cached")
    public static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="DBTableMasterIndex_cache")
    public static EvictingDualNodeHashTable DBTableMasterIndex_cache;
    @ObfuscatedName(value="fg")
    @ObfuscatedSignature(descriptor="Lok;")
    static Archive field2704;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1301972745)
    @Export(value="id")
    int id;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=141562829)
    @Export(value="archive")
    int archive;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=425218609)
    @Export(value="sequence")
    public int sequence = -1;
    @ObfuscatedName(value="ax")
    @Export(value="recolorFrom")
    short[] recolorFrom;
    @ObfuscatedName(value="at")
    @Export(value="recolorTo")
    short[] recolorTo;
    @ObfuscatedName(value="ac")
    @Export(value="retextureFrom")
    short[] retextureFrom;
    @ObfuscatedName(value="au")
    @Export(value="retextureTo")
    short[] retextureTo;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-2104753871)
    @Export(value="widthScale")
    int widthScale = 128;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=1879181871)
    @Export(value="heightScale")
    int heightScale = 128;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-1758727787)
    @Export(value="orientation")
    int orientation = 0;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-940508089)
    @Export(value="ambient")
    int ambient = 0;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=1250873071)
    @Export(value="contrast")
    int contrast = 0;

    static {
        SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
        DBTableMasterIndex_cache = new EvictingDualNodeHashTable(30);
    }

    SpotAnimationDefinition() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="1007662088")
    @Export(value="decode")
    void decode(Buffer buffer) {
        int n;
        while ((n = buffer.readUnsignedByte()) != 0) {
            this.decodeNext(buffer, n);
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="-1457934063")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        if (n == 1) {
            this.archive = buffer.readUnsignedShort();
            return;
        }
        if (n == 2) {
            this.sequence = buffer.readUnsignedShort();
            return;
        }
        if (n == 4) {
            this.widthScale = buffer.readUnsignedShort();
            return;
        }
        if (n == 5) {
            this.heightScale = buffer.readUnsignedShort();
            return;
        }
        if (n == 6) {
            this.orientation = buffer.readUnsignedShort();
            return;
        }
        if (n == 7) {
            this.ambient = buffer.readUnsignedByte();
            return;
        }
        if (n == 8) {
            this.contrast = buffer.readUnsignedByte();
            return;
        }
        if (n != 40) {
            if (n != 41) return;
            int n2 = buffer.readUnsignedByte();
            this.retextureFrom = new short[n2];
            this.retextureTo = new short[n2];
            int n3 = 0;
            while (n3 < n2) {
                this.retextureFrom[n3] = (short)buffer.readUnsignedShort();
                this.retextureTo[n3] = (short)buffer.readUnsignedShort();
                ++n3;
            }
            return;
        }
        int n4 = buffer.readUnsignedByte();
        this.recolorFrom = new short[n4];
        this.recolorTo = new short[n4];
        int n5 = 0;
        while (n5 < n4) {
            this.recolorFrom[n5] = (short)buffer.readUnsignedShort();
            this.recolorTo[n5] = (short)buffer.readUnsignedShort();
            ++n5;
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(II)Lhv;", garbageValue="-1427565975")
    @Export(value="getModel")
    public final Model getModel(int n) {
        Model model = this.method5365();
        if (model == null) {
            return null;
        }
        Model model2 = this.sequence != -1 && n != -1 ? class33.SequenceDefinition_get(this.sequence).method5698(model, n) : model.method4652(true);
        if (this.widthScale != 128 || this.heightScale != 128) {
            model2.scale(this.widthScale, this.heightScale, this.widthScale);
        }
        if (this.orientation != 0) {
            if (this.orientation == 90) {
                model2.rotateY90Ccw();
            }
            if (this.orientation == 180) {
                model2.rotateY90Ccw();
                model2.rotateY90Ccw();
            }
            if (this.orientation == 270) {
                model2.rotateY90Ccw();
                model2.rotateY90Ccw();
                model2.rotateY90Ccw();
            }
        }
        return model2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(B)Lhv;", garbageValue="121")
    public final Model method5365() {
        Model model = (Model)DBTableMasterIndex_cache.get(this.id);
        if (model == null) {
            int n;
            ModelData modelData = ModelData.ModelData_get(field2700, this.archive, 0);
            if (modelData == null) {
                return null;
            }
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
            model = modelData.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
            DBTableMasterIndex_cache.put(model, this.id);
        }
        return model;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1699365126")
    public static void method5377() {
        class257.field2735.clear();
    }

    @ObfuscatedName(value="bn")
    @ObfuscatedSignature(descriptor="(ILdm;ZB)I", garbageValue="-13")
    static int method5382(int n, Script script, boolean bl) {
        if (n != 7108) {
            return 2;
        }
        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Skeleton.method4171() ? 1 : 0;
        return 1;
    }

    @ObfuscatedName(value="ix")
    @ObfuscatedSignature(descriptor="(Lda;I)V", garbageValue="-401614943")
    static final void method5375(Actor actor) {
        Object object;
        actor.field1206 = false;
        if (actor.field1238 != -1) {
            object = class33.SequenceDefinition_get(actor.field1238);
            if (object == null) {
                actor.field1238 = -1;
            } else if (!((SequenceDefinition)object).isCachedModelIdSet() && ((SequenceDefinition)object).frameIds != null) {
                ++actor.field1226;
                if (actor.field1237 < ((SequenceDefinition)object).frameIds.length && actor.field1226 > ((SequenceDefinition)object).frameLengths[actor.field1237]) {
                    actor.field1226 = 1;
                    class271.method5839((SequenceDefinition)object, ++actor.field1237, actor.x, actor.field1196, ModeWhere.localPlayer == actor);
                }
                if (actor.field1237 >= ((SequenceDefinition)object).frameIds.length) {
                    if (((SequenceDefinition)object).frameCount <= 0) {
                        actor.field1226 = 0;
                        actor.field1237 = 0;
                    } else {
                        actor.field1237 -= ((SequenceDefinition)object).frameCount;
                        if (((SequenceDefinition)object).field2940) {
                            ++actor.field1239;
                        }
                        if (actor.field1237 < 0 || actor.field1237 >= ((SequenceDefinition)object).frameIds.length || ((SequenceDefinition)object).field2940 && actor.field1239 >= ((SequenceDefinition)object).field2936) {
                            actor.field1226 = 0;
                            actor.field1237 = 0;
                            actor.field1239 = 0;
                        }
                    }
                    class271.method5839((SequenceDefinition)object, actor.field1237, actor.x, actor.field1196, ModeWhere.localPlayer == actor);
                }
            } else if (!((SequenceDefinition)object).isCachedModelIdSet()) {
                actor.field1238 = -1;
            } else {
                ++actor.field1237;
                int n = ((SequenceDefinition)object).method5703();
                if (actor.field1237 >= n) {
                    if (((SequenceDefinition)object).frameCount <= 0) {
                        actor.field1226 = 0;
                        actor.field1237 = 0;
                    } else {
                        actor.field1237 -= ((SequenceDefinition)object).frameCount;
                        if (((SequenceDefinition)object).field2940) {
                            ++actor.field1239;
                        }
                        if (actor.field1237 < 0 || actor.field1237 >= n || ((SequenceDefinition)object).field2940 && actor.field1239 >= ((SequenceDefinition)object).field2936) {
                            actor.field1237 = 0;
                            actor.field1226 = 0;
                            actor.field1239 = 0;
                        }
                    }
                    class271.method5839((SequenceDefinition)object, actor.field1237, actor.x, actor.field1196, ModeWhere.localPlayer == actor);
                } else {
                    class271.method5839((SequenceDefinition)object, actor.field1237, actor.x, actor.field1196, ModeWhere.localPlayer == actor);
                }
            }
        }
        object = new IterableNodeHashTableIterator(actor.method2810());
        Node node = (class485)((IterableNodeHashTableIterator)object).method9951();
        while (true) {
            int n;
            if (node == null) {
                if (actor.field1240 != -1 && actor.field1271 <= 1) {
                    node = class33.SequenceDefinition_get(actor.field1240);
                    if (((SequenceDefinition)node).field2941 == 1 && actor.field1270 > 0 && actor.field1263 <= Client.cycle && actor.field1199 < Client.cycle) {
                        actor.field1271 = 1;
                        return;
                    }
                }
                if (actor.field1240 != -1 && actor.field1271 == 0) {
                    node = class33.SequenceDefinition_get(actor.field1240);
                    if (node == null) {
                        actor.field1240 = -1;
                    } else if (!((SequenceDefinition)node).isCachedModelIdSet() && ((SequenceDefinition)node).frameIds != null) {
                        ++actor.field1242;
                        if (actor.field1241 < ((SequenceDefinition)node).frameIds.length && actor.field1242 > ((SequenceDefinition)node).frameLengths[actor.field1241]) {
                            actor.field1242 = 1;
                            class271.method5839((SequenceDefinition)node, ++actor.field1241, actor.x, actor.field1196, ModeWhere.localPlayer == actor);
                        }
                        if (actor.field1241 >= ((SequenceDefinition)node).frameIds.length) {
                            actor.field1241 -= ((SequenceDefinition)node).frameCount;
                            ++actor.field1244;
                            if (actor.field1244 < ((SequenceDefinition)node).field2936) {
                                if (actor.field1241 >= 0 && actor.field1241 < ((SequenceDefinition)node).frameIds.length) {
                                    class271.method5839((SequenceDefinition)node, actor.field1241, actor.x, actor.field1196, ModeWhere.localPlayer == actor);
                                } else {
                                    actor.field1240 = -1;
                                }
                            } else {
                                actor.field1240 = -1;
                            }
                        }
                        actor.field1206 = ((SequenceDefinition)node).field2935;
                    } else if (!((SequenceDefinition)node).isCachedModelIdSet()) {
                        actor.field1240 = -1;
                    } else {
                        ++actor.field1241;
                        n = ((SequenceDefinition)node).method5703();
                        if (actor.field1241 >= n) {
                            actor.field1241 -= ((SequenceDefinition)node).frameCount;
                            ++actor.field1244;
                            if (actor.field1244 < ((SequenceDefinition)node).field2936) {
                                if (actor.field1241 >= 0 && actor.field1241 < n) {
                                    class271.method5839((SequenceDefinition)node, actor.field1241, actor.x, actor.field1196, ModeWhere.localPlayer == actor);
                                } else {
                                    actor.field1240 = -1;
                                }
                            } else {
                                actor.field1240 = -1;
                            }
                        } else {
                            class271.method5839((SequenceDefinition)node, actor.field1241, actor.x, actor.field1196, ModeWhere.localPlayer == actor);
                        }
                    }
                }
                if (actor.field1271 > 0) {
                    --actor.field1271;
                }
                return;
            }
            if (((class485)node).field5056 != -1 && Client.cycle >= ((class485)node).field5051) {
                n = ObjectComposition.SpotAnimationDefinition_get((int)((class485)node).field5056).sequence;
                if (n != -1) {
                    ((class485)node).field5052 = Math.max(((class485)node).field5052, 0);
                    SequenceDefinition sequenceDefinition = class33.SequenceDefinition_get(n);
                    if (sequenceDefinition.frameIds != null && !sequenceDefinition.isCachedModelIdSet()) {
                        ++((class485)node).field5053;
                        if (((class485)node).field5052 < sequenceDefinition.frameIds.length && ((class485)node).field5053 > sequenceDefinition.frameLengths[((class485)node).field5052]) {
                            ((class485)node).field5053 = 1;
                            class271.method5839(sequenceDefinition, ++((class485)node).field5052, actor.x, actor.field1196, ModeWhere.localPlayer == actor);
                        }
                        if (((class485)node).field5052 >= sequenceDefinition.frameIds.length) {
                            node.remove();
                            --actor.field1246;
                        }
                    } else if (!sequenceDefinition.isCachedModelIdSet()) {
                        node.remove();
                        --actor.field1246;
                    } else {
                        ++((class485)node).field5052;
                        int n2 = sequenceDefinition.method5703();
                        if (((class485)node).field5052 >= n2) {
                            node.remove();
                            --actor.field1246;
                        } else {
                            class271.method5839(sequenceDefinition, ((class485)node).field5052, actor.x, actor.field1196, ModeWhere.localPlayer == actor);
                        }
                    }
                } else {
                    node.remove();
                    --actor.field1246;
                }
            }
            node = (class485)((IterableNodeHashTableIterator)object).next();
        }
    }
}

