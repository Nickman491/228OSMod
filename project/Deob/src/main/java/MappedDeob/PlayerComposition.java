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
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ny")
@Implements(value="PlayerComposition")
public class PlayerComposition {
    @ObfuscatedName(value="as")
    public static short[][] field3816;
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="PlayerAppearance_cachedModels")
    public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="Lro;")
    public static class465 field3808;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=-335860431)
    public static int field3821;
    @ObfuscatedName(value="gw")
    @ObfuscatedGetter(intValue=-1676628777)
    @Export(value="worldPort")
    static int worldPort;
    @ObfuscatedName(value="ay")
    int[] field3814;
    @ObfuscatedName(value="ah")
    int[] field3809;
    @ObfuscatedName(value="az")
    @Export(value="bodyColors")
    int[] bodyColors;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1490652809)
    public int field3811 = -1;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1245891173)
    @Export(value="gender")
    public int gender = 0;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1334537547)
    @Export(value="npcTransformId")
    public int npcTransformId;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(longValue=1607323497860284279L)
    @Export(value="hash")
    long hash;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(longValue=3880144033939998849L)
    long field3815;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="[Lia;")
    class228[] field3820;
    @ObfuscatedName(value="ac")
    boolean field3817 = false;

    static {
        PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
        field3808 = new class465(16, class463.field4954);
        field3821 = 0;
    }

    @ObfuscatedSignature(descriptor="(Lny;)V")
    PlayerComposition(PlayerComposition playerComposition) {
        if (playerComposition == null) {
            return;
        }
        int[] nArray = Arrays.copyOf(playerComposition.field3809, playerComposition.field3809.length);
        int[] nArray2 = Arrays.copyOf(playerComposition.field3814, playerComposition.field3814.length);
        class228[] class228Array = playerComposition.field3820 != null ? Arrays.copyOf(playerComposition.field3820, playerComposition.field3820.length) : null;
        int[] nArray3 = Arrays.copyOf(playerComposition.bodyColors, playerComposition.bodyColors.length);
        this.method7095(nArray2, nArray, class228Array, false, nArray3, playerComposition.gender, playerComposition.npcTransformId, playerComposition.field3811);
    }

    public PlayerComposition() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([I[I[Lia;Z[IIIII)V", garbageValue="-1392352981")
    public void method7095(int[] nArray, int[] nArray2, class228[] class228Array, boolean bl, int[] nArray3, int n, int n2, int n3) {
        this.field3820 = class228Array;
        this.field3817 = bl;
        this.field3811 = n3;
        this.method7056(nArray, nArray2, nArray3, n, n2);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="([I[I[IIIB)V", garbageValue="-1")
    public void method7056(int[] nArray, int[] nArray2, int[] nArray3, int n, int n2) {
        if (nArray == null) {
            nArray = this.method7053(n);
        }
        if (nArray2 == null) {
            nArray2 = this.method7053(n);
        }
        this.field3814 = nArray;
        this.field3809 = nArray2;
        this.bodyColors = nArray3;
        this.gender = n;
        this.npcTransformId = n2;
        this.setHash();
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IS)[I", garbageValue="-23811")
    int[] method7053(int n) {
        int[] nArray = new int[12];
        int n2 = 0;
        while (n2 < 7) {
            for (int i = 0; i < KitDefinition.field2550; ++i) {
                KitDefinition kitDefinition;
                Object[] objectArray;
                KitDefinition kitDefinition2 = (KitDefinition)KitDefinition.field2548.get(i);
                if (kitDefinition2 == null) {
                    if (KitDefinition.field2562 != null) {
                        objectArray = KitDefinition.field2562.takeFile(3, i);
                        kitDefinition2 = new KitDefinition();
                        if (objectArray != null) {
                            kitDefinition2.decode(new Buffer((byte[])objectArray));
                        }
                        KitDefinition.field2548.put(kitDefinition2, i);
                        kitDefinition = kitDefinition2;
                    } else {
                        kitDefinition = null;
                    }
                } else {
                    kitDefinition = kitDefinition2;
                }
                kitDefinition2 = kitDefinition;
                if (kitDefinition2 == null || kitDefinition2.nonSelectable || !kitDefinition2.method5207(n2, n)) continue;
                objectArray = nArray;
                int n3 = n2;
                if (class251.field2687 == null) {
                    class251.field2687 = new int[7];
                    class251.field2687[class251.field2681.field2686] = class266.field2953.field2949;
                    class251.field2687[class251.field2679.field2686] = class266.field2958.field2949;
                    class251.field2687[class251.field2680.field2686] = class266.field2959.field2949;
                    class251.field2687[class251.field2683.field2686] = class266.field2951.field2949;
                    class251.field2687[class251.field2682.field2686] = class266.field2954.field2949;
                    class251.field2687[class251.field2685.field2686] = class266.field2952.field2949;
                    class251.field2687[class251.field2684.field2686] = class266.field2947.field2949;
                }
                int n4 = class251.field2687[n3];
                objectArray[n4] = i + 256;
                break;
            }
            ++n2;
        }
        return nArray;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IZI)V", garbageValue="879068555")
    @Export(value="changeAppearance")
    public void changeAppearance(int n, boolean bl) {
        int n2;
        int n3;
        int[] nArray = this.field3809;
        int n4 = n;
        if (class251.field2687 == null) {
            class251.field2687 = new int[7];
            class251.field2687[class251.field2681.field2686] = class266.field2953.field2949;
            class251.field2687[class251.field2679.field2686] = class266.field2958.field2949;
            class251.field2687[class251.field2680.field2686] = class266.field2959.field2949;
            class251.field2687[class251.field2683.field2686] = class266.field2951.field2949;
            class251.field2687[class251.field2682.field2686] = class266.field2954.field2949;
            class251.field2687[class251.field2685.field2686] = class266.field2952.field2949;
            class251.field2687[class251.field2684.field2686] = class266.field2947.field2949;
        }
        if ((n3 = nArray[n2 = class251.field2687[n4]]) != 0) {
            Object object;
            KitDefinition kitDefinition;
            n3 -= 256;
            do {
                if (bl) {
                    if (++n3 >= KitDefinition.field2550) {
                        n3 = 0;
                    }
                } else if (--n3 < 0) {
                    n3 = KitDefinition.field2550 - 1;
                }
                if ((kitDefinition = (KitDefinition)KitDefinition.field2548.get(n3)) == null) {
                    if (KitDefinition.field2562 != null) {
                        byte[] byArray = KitDefinition.field2562.takeFile(3, n3);
                        kitDefinition = new KitDefinition();
                        if (byArray != null) {
                            kitDefinition.decode(new Buffer(byArray));
                        }
                        KitDefinition.field2548.put(kitDefinition, n3);
                        object = kitDefinition;
                        continue;
                    }
                    object = null;
                    continue;
                }
                object = kitDefinition;
            } while ((kitDefinition = object) == null || kitDefinition.nonSelectable || !kitDefinition.method5207(n, this.gender));
            object = this.field3809;
            int n5 = n;
            if (class251.field2687 == null) {
                class251.field2687 = new int[7];
                class251.field2687[class251.field2681.field2686] = class266.field2953.field2949;
                class251.field2687[class251.field2679.field2686] = class266.field2958.field2949;
                class251.field2687[class251.field2680.field2686] = class266.field2959.field2949;
                class251.field2687[class251.field2683.field2686] = class266.field2951.field2949;
                class251.field2687[class251.field2682.field2686] = class266.field2954.field2949;
                class251.field2687[class251.field2685.field2686] = class266.field2952.field2949;
                class251.field2687[class251.field2684.field2686] = class266.field2947.field2949;
            }
            int n6 = class251.field2687[n5];
            object[n6] = n3 + 256;
            this.setHash();
            return;
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IZB)V", garbageValue="109")
    public void method7055(int n, boolean bl) {
        int n2 = this.bodyColors[n];
        if (bl) {
            boolean bl2;
            do {
                if (++n2 < field3816[n].length) continue;
                n2 = 0;
            } while (!(bl2 = n != 4 || n2 < 8));
        } else {
            boolean bl3;
            do {
                if (--n2 >= 0) continue;
                n2 = field3816[n].length - 1;
            } while (!(bl3 = n != 4 || n2 < 8));
        }
        this.bodyColors[n] = n2;
        this.setHash();
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-471744688")
    public void method7087(int n) {
        if (this.gender == n) {
            return;
        }
        this.method7056(null, null, this.bodyColors, n, -1);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="31055392")
    @Export(value="write")
    public void write(Buffer buffer) {
        buffer.writeByte(this.gender);
        int n = 0;
        while (true) {
            int n2;
            int n3;
            if (n >= 7) {
                n = 0;
                while (true) {
                    if (n >= 5) {
                        return;
                    }
                    buffer.writeByte(this.bodyColors[n]);
                    ++n;
                }
            }
            int[] nArray = this.field3809;
            int n4 = n;
            if (class251.field2687 == null) {
                class251.field2687 = new int[7];
                class251.field2687[class251.field2681.field2686] = class266.field2953.field2949;
                class251.field2687[class251.field2679.field2686] = class266.field2958.field2949;
                class251.field2687[class251.field2680.field2686] = class266.field2959.field2949;
                class251.field2687[class251.field2683.field2686] = class266.field2951.field2949;
                class251.field2687[class251.field2682.field2686] = class266.field2954.field2949;
                class251.field2687[class251.field2685.field2686] = class266.field2952.field2949;
                class251.field2687[class251.field2684.field2686] = class266.field2947.field2949;
            }
            if ((n3 = nArray[n2 = class251.field2687[n4]]) != 0) {
                buffer.writeShort(n3 - 256);
            } else {
                buffer.writeShort(-1);
            }
            ++n;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="20")
    @Export(value="setHash")
    void setHash() {
        int n;
        long l = this.hash;
        long[] lArray = Buffer.field5472;
        this.hash = -1L;
        for (n = 0; n < 12; ++n) {
            this.hash = this.hash >>> 8 ^ lArray[(int)((this.hash ^ (long)(this.field3809[n] >> 24)) & 0xFFL)];
            this.hash = this.hash >>> 8 ^ lArray[(int)((this.hash ^ (long)(this.field3809[n] >> 16)) & 0xFFL)];
            this.hash = this.hash >>> 8 ^ lArray[(int)((this.hash ^ (long)(this.field3809[n] >> 8)) & 0xFFL)];
            this.hash = this.hash >>> 8 ^ lArray[(int)((this.hash ^ (long)this.field3809[n]) & 0xFFL)];
        }
        if (this.field3820 != null) {
            for (n = 0; n < this.field3820.length; ++n) {
                int n2;
                if (this.field3820[n] == null) continue;
                if (this.field3820[n].field2479 != null) {
                    for (n2 = 0; n2 < this.field3820[n].field2479.length; ++n2) {
                        this.hash = this.hash >>> 8 ^ lArray[(int)((this.hash ^ (long)(this.field3820[n].field2479[n2] >> 8)) & 0xFFL)];
                        this.hash = this.hash >>> 8 ^ lArray[(int)((this.hash ^ (long)this.field3820[n].field2479[n2]) & 0xFFL)];
                    }
                }
                if (this.field3820[n].field2477 == null) continue;
                for (n2 = 0; n2 < this.field3820[n].field2477.length; ++n2) {
                    this.hash = this.hash >>> 8 ^ lArray[(int)((this.hash ^ (long)(this.field3820[n].field2477[n2] >> 8)) & 0xFFL)];
                    this.hash = this.hash >>> 8 ^ lArray[(int)((this.hash ^ (long)this.field3820[n].field2477[n2]) & 0xFFL)];
                }
            }
        }
        for (n = 0; n < 5; ++n) {
            this.hash = this.hash >>> 8 ^ lArray[(int)((this.hash ^ (long)this.bodyColors[n]) & 0xFFL)];
        }
        this.hash = this.hash >>> 8 ^ lArray[(int)((this.hash ^ (long)this.gender) & 0xFFL)];
        if (0L != l && this.hash != l || this.field3817) {
            PlayerAppearance_cachedModels.remove(l);
        }
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Lkb;ILkb;II)Lhv;", garbageValue="-31242308")
    @Export(value="getModel")
    public Model getModel(SequenceDefinition var1_1, int var2_2, SequenceDefinition var3_3, int var4_4) {
        block21: {
            if (this.npcTransformId != -1) break block21;
            var5_5 = this.hash;
            var7_6 = this.field3809;
            if (var1_1 != null && (var1_1.shield >= 0 || var1_1.weapon >= 0)) {
                var7_6 = new int[12];
                System.arraycopy(this.field3809, 0, var7_6, 0, var7_6.length);
                if (var1_1.shield >= 0) {
                    var5_5 ^= (long)(var1_1.shield - this.field3809[class266.field2950.field2949]) << 40;
                    var7_6[class266.field2950.field2949] = this.method7084(var1_1.shield);
                }
                if (var1_1.weapon >= 0) {
                    var5_5 ^= (long)(var1_1.weapon - this.field3809[class266.field2955.field2949]) << 48;
                    var7_6[class266.field2955.field2949] = this.method7084(var1_1.weapon);
                }
            }
            if ((var8_7 = (Model)PlayerComposition.PlayerAppearance_cachedModels.get(var5_5)) != null) ** GOTO lbl36
            var9_8 = false;
            var10_9 = 0;
            while (true) {
                block22: {
                    if (var10_9 < 12) break block22;
                    if (var9_8) {
                        if (this.field3815 != -1L) {
                            var8_7 = (Model)PlayerComposition.PlayerAppearance_cachedModels.get(this.field3815);
                        }
                        if (var8_7 == null) {
                            return null;
                        }
                    }
                    if (var8_7 != null) ** GOTO lbl36
                    var17_12 = new ModelData[12];
                    var11_11 = 0;
                    var12_13 = 0;
                    while (true) {
                        block23: {
                            if (var12_13 < 12) break block23;
                            var18_10 = new ModelData(var17_12, var11_11);
                            var13_14 = 0;
                            while (true) {
                                block24: {
                                    if (var13_14 < 5) break block24;
                                    var8_7 = var18_10.toModel(64, 850, -30, -50, -30);
                                    PlayerComposition.PlayerAppearance_cachedModels.put(var8_7, var5_5);
                                    this.field3815 = var5_5;
lbl36:
                                    // 3 sources

                                    var19_18 = var1_1 == null && var3_3 == null ? var8_7.toSharedSequenceModel(true) : (var1_1 != null && var3_3 != null ? var1_1.applyTransformations(var8_7, var2_2, var3_3, var4_4) : (var1_1 != null ? var1_1.transformActorModel(var8_7, var2_2) : var3_3.transformActorModel(var8_7, var4_4)));
                                    return var19_18;
                                }
                                if (this.bodyColors[var13_14] < PlayerComposition.field3816[var13_14].length) {
                                    var18_10.recolor(FontName.field5323[var13_14], PlayerComposition.field3816[var13_14][this.bodyColors[var13_14]]);
                                }
                                if (this.bodyColors[var13_14] < class7.field30[var13_14].length) {
                                    var18_10.recolor(class169.field1805[var13_14], class7.field30[var13_14][this.bodyColors[var13_14]]);
                                }
                                ++var13_14;
                            }
                        }
                        var13_14 = var7_6[var12_13];
                        if (this.method7066(var13_14)) {
                            var14_15 = this.method7067(var13_14);
                            var15_16 = null;
                            if (var14_15 != null) {
                                var15_16 = var14_15.getModelData();
                            }
                            if (var15_16 != null) {
                                var17_12[var11_11++] = var15_16;
                            }
                        }
                        if (this.method7068(var13_14) && (var16_17 = (var14_15 = this.method7069(var13_14)).method5572(this.gender, (class228)(var15_16 = this.field3820 == null ? null : this.field3820[var12_13]))) != null) {
                            var17_12[var11_11++] = var16_17;
                        }
                        ++var12_13;
                    }
                }
                var11_11 = var7_6[var10_9];
                if (this.method7066(var11_11) && (var18_10 = this.method7067(var11_11)) != null && !var18_10.ready()) {
                    var9_8 = true;
                }
                if (this.method7068(var11_11)) {
                    v0 = var18_10 = this.field3820 == null ? null : this.field3820[var10_9];
                    if (!this.method7069(var11_11).method5571(this.gender, (class228)var18_10)) {
                        var9_8 = true;
                    }
                }
                ++var10_9;
            }
        }
        return class446.getNpcDefinition(this.npcTransformId).getModel(var1_1, var2_2, var3_3, var4_4, null);
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(I)Lgx;", garbageValue="-2033006928")
    @Export(value="getModelData")
    ModelData getModelData() {
        if (this.npcTransformId == -1) {
            boolean bl = false;
            int n = 0;
            while (true) {
                DualNode dualNode;
                int n2;
                if (n >= 12) {
                    if (bl) {
                        return null;
                    }
                    ModelData[] modelDataArray = new ModelData[12];
                    n2 = 0;
                    int n3 = 0;
                    while (true) {
                        ModelData modelData;
                        KitDefinition kitDefinition;
                        int n4;
                        if (n3 >= 12) {
                            dualNode = new ModelData(modelDataArray, n2);
                            n4 = 0;
                            while (true) {
                                if (n4 >= 5) {
                                    return dualNode;
                                }
                                if (this.bodyColors[n4] < field3816[n4].length) {
                                    ((ModelData)dualNode).recolor(FontName.field5323[n4], field3816[n4][this.bodyColors[n4]]);
                                }
                                if (this.bodyColors[n4] < class7.field30[n4].length) {
                                    ((ModelData)dualNode).recolor(class169.field1805[n4], class7.field30[n4][this.bodyColors[n4]]);
                                }
                                ++n4;
                            }
                        }
                        n4 = this.field3809[n3];
                        if (this.method7066(n4)) {
                            kitDefinition = this.method7067(n4);
                            modelData = null;
                            if (kitDefinition != null) {
                                modelData = kitDefinition.getKitDefinitionModels();
                            }
                            if (modelData != null) {
                                modelDataArray[n2++] = modelData;
                            }
                        }
                        if (this.method7068(n4)) {
                            kitDefinition = this.field3820 == null ? null : this.field3820[n3];
                            modelData = this.method7069(n4).method5573(this.gender, (class228)((Object)kitDefinition));
                            if (modelData != null) {
                                modelDataArray[n2++] = modelData;
                            }
                        }
                        ++n3;
                    }
                }
                n2 = this.field3809[n];
                if (this.method7066(n2) && (dualNode = this.method7067(n2)) != null && !((KitDefinition)dualNode).method5210()) {
                    bl = true;
                }
                if (this.method7068(n2)) {
                    DualNode dualNode2 = dualNode = this.field3820 == null ? null : this.field3820[n];
                    if (!this.method7069(n2).method5630(this.gender, (class228)((Object)dualNode))) {
                        bl = true;
                    }
                }
                ++n;
            }
        }
        return class446.getNpcDefinition(this.npcTransformId).method5342(null);
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-112654412")
    @Export(value="getChatHeadId")
    public int getChatHeadId() {
        Integer n;
        long l = this.hash;
        if (this.npcTransformId != -1) {
            l = 0xFFFFFFFFFFFF0000L | (long)this.npcTransformId;
        }
        if ((n = (Integer)field3808.method9037(l)) == null) {
            n = ++field3821 - 1;
            field3808.method9038(l, n);
            field3821 %= 65535;
        }
        return n;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1103442003")
    void method7061() {
        this.method7056(this.field3814, this.field3809, this.bodyColors, this.gender, this.npcTransformId);
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-1452730156")
    public void method7062(int n, int n2) {
        boolean bl = n2 != this.gender;
        this.gender = n2;
        if (bl) {
            if (this.gender != n) {
                if (this.field3809[0] < 2048 || this.method7094()) {
                    this.field3809[class266.field2958.field2949] = 1;
                }
                block0: for (int i = 0; i < 7; ++i) {
                    int n3;
                    int n4;
                    int n5 = i;
                    if (class251.field2687 == null) {
                        class251.field2687 = new int[7];
                        class251.field2687[class251.field2681.field2686] = class266.field2953.field2949;
                        class251.field2687[class251.field2679.field2686] = class266.field2958.field2949;
                        class251.field2687[class251.field2680.field2686] = class266.field2959.field2949;
                        class251.field2687[class251.field2683.field2686] = class266.field2951.field2949;
                        class251.field2687[class251.field2682.field2686] = class266.field2954.field2949;
                        class251.field2687[class251.field2685.field2686] = class266.field2952.field2949;
                        class251.field2687[class251.field2684.field2686] = class266.field2947.field2949;
                    }
                    if (this.field3809[n4 = (n3 = class251.field2687[n5])] <= 0 || this.field3809[n4] >= 2048) continue;
                    int[] nArray = this.field3809;
                    for (int j = 0; j < KitDefinition.field2550; ++j) {
                        KitDefinition kitDefinition;
                        Object[] objectArray;
                        KitDefinition kitDefinition2 = (KitDefinition)KitDefinition.field2548.get(j);
                        if (kitDefinition2 == null) {
                            if (KitDefinition.field2562 != null) {
                                objectArray = KitDefinition.field2562.takeFile(3, j);
                                kitDefinition2 = new KitDefinition();
                                if (objectArray != null) {
                                    kitDefinition2.decode(new Buffer((byte[])objectArray));
                                }
                                KitDefinition.field2548.put(kitDefinition2, j);
                                kitDefinition = kitDefinition2;
                            } else {
                                kitDefinition = null;
                            }
                        } else {
                            kitDefinition = kitDefinition2;
                        }
                        kitDefinition2 = kitDefinition;
                        if (kitDefinition2 == null || kitDefinition2.nonSelectable || !kitDefinition2.method5207(i, n2)) continue;
                        objectArray = nArray;
                        int n6 = i;
                        if (class251.field2687 == null) {
                            class251.field2687 = new int[7];
                            class251.field2687[class251.field2681.field2686] = class266.field2953.field2949;
                            class251.field2687[class251.field2679.field2686] = class266.field2958.field2949;
                            class251.field2687[class251.field2680.field2686] = class266.field2959.field2949;
                            class251.field2687[class251.field2683.field2686] = class266.field2951.field2949;
                            class251.field2687[class251.field2682.field2686] = class266.field2954.field2949;
                            class251.field2687[class251.field2685.field2686] = class266.field2952.field2949;
                            class251.field2687[class251.field2684.field2686] = class266.field2947.field2949;
                        }
                        int n7 = class251.field2687[n6];
                        objectArray[n7] = j + 256;
                        continue block0;
                    }
                }
            } else {
                for (int i = 0; i < 7; ++i) {
                    int n8;
                    int n9;
                    int n10 = i;
                    if (class251.field2687 == null) {
                        class251.field2687 = new int[7];
                        class251.field2687[class251.field2681.field2686] = class266.field2953.field2949;
                        class251.field2687[class251.field2679.field2686] = class266.field2958.field2949;
                        class251.field2687[class251.field2680.field2686] = class266.field2959.field2949;
                        class251.field2687[class251.field2683.field2686] = class266.field2951.field2949;
                        class251.field2687[class251.field2682.field2686] = class266.field2954.field2949;
                        class251.field2687[class251.field2685.field2686] = class266.field2952.field2949;
                        class251.field2687[class251.field2684.field2686] = class266.field2947.field2949;
                    }
                    if (this.field3809[n9 = (n8 = class251.field2687[n10])] <= 0 || this.field3809[n9] >= 2048) continue;
                    this.field3809[n9] = this.field3814[n9];
                }
            }
        }
        this.method7061();
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1944383974")
    boolean method7094() {
        if (!this.method7068(this.field3809[0])) {
            return false;
        }
        ItemComposition itemComposition = this.method7069(this.field3809[0]);
        return itemComposition.maleModel2 != class266.field2958.field2949 && itemComposition.field2878 != class266.field2958.field2949;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="98")
    public void method7064(int n, int n2) {
        this.bodyColors[n] = n2;
        this.method7061();
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-486751351")
    public void method7080(int n) {
        ItemComposition itemComposition = FaceNormal.ItemDefinition_get(n);
        this.field3809[itemComposition.maleModel1] = n + 2048;
        if (itemComposition.maleModel2 != -1) {
            this.field3809[itemComposition.maleModel2] = 0;
        }
        if (itemComposition.field2878 != -1) {
            this.field3809[itemComposition.field2878] = 0;
        }
        this.method7061();
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="126025052")
    boolean method7066(int n) {
        return n >= 256 && n < 2048;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(IB)Ljx;", garbageValue="0")
    KitDefinition method7067(int n) {
        KitDefinition kitDefinition;
        int n2 = n - 256;
        KitDefinition kitDefinition2 = (KitDefinition)KitDefinition.field2548.get(n2);
        if (kitDefinition2 == null) {
            if (KitDefinition.field2562 != null) {
                byte[] byArray = KitDefinition.field2562.takeFile(3, n2);
                kitDefinition2 = new KitDefinition();
                if (byArray != null) {
                    kitDefinition2.decode(new Buffer(byArray));
                }
                KitDefinition.field2548.put(kitDefinition2, n2);
                kitDefinition = kitDefinition2;
            } else {
                kitDefinition = null;
            }
        } else {
            kitDefinition = kitDefinition2;
        }
        return kitDefinition;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="-79")
    boolean method7068(int n) {
        return n >= 2048;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(IB)Lkm;", garbageValue="4")
    ItemComposition method7069(int n) {
        return FaceNormal.ItemDefinition_get(n - 2048);
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="688799447")
    int method7084(int n) {
        return n - 512 + 2048;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)[Lsn;", garbageValue="-43")
    public static class492[] method7114() {
        return new class492[]{class492.field5095, class492.field5092, class492.field5094};
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IS)Z", garbageValue="180")
    static final boolean method7125(int n) {
        return n == 7 || n == 8 || n >= 9 && n <= 13;
    }
}

