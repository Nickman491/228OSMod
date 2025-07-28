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

@ObfuscatedName(value="dx")
@Implements(value="Player")
public final class Player
extends Actor {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lwb;")
    @Export(value="username")
    Username username;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lny;")
    @Export(value="appearance")
    PlayerComposition appearance;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-4338737)
    int field1122 = -1;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=2021020425)
    int field1123 = -1;
    @ObfuscatedName(value="ae")
    String[] field1125 = new String[3];
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1450184417)
    int field1136;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1826513691)
    int field1127;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=1047556293)
    int field1128;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-507008159)
    int field1129;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=1071049889)
    int field1130;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=1467025815)
    int field1131;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-2059756935)
    int field1132;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=1918868429)
    int field1133;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lhv;")
    Model field1142;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=1224039761)
    int field1124;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=-1108112153)
    int field1141;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=-2029592175)
    int field1146;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=1259463217)
    int field1144;
    @ObfuscatedName(value="ai")
    boolean field1139;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=1299238349)
    int field1140;
    @ObfuscatedName(value="am")
    boolean field1138;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=1798595885)
    @Export(value="plane")
    int plane;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=-1870889557)
    int field1145;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Lsb;")
    TriBool field1126;
    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="Lsb;")
    TriBool field1134;
    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="Lsb;")
    TriBool field1135;
    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="Ldz;")
    class103 field1143;

    Player() {
        for (int i = 0; i < 3; ++i) {
            this.field1125[i] = "";
        }
        this.field1136 = 0;
        this.field1127 = 0;
        this.field1129 = 0;
        this.field1130 = 0;
        this.field1139 = false;
        this.field1140 = 0;
        this.field1138 = false;
        this.field1126 = TriBool.TriBool_unknown;
        this.field1134 = TriBool.TriBool_unknown;
        this.field1135 = TriBool.TriBool_unknown;
        this.field1143 = GameEngine.field189;
    }

    @Override
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(B)Lhv;", garbageValue="-7")
    @Export(value="getModel")
    protected final Model getModel() {
        SequenceDefinition sequenceDefinition;
        if (this.appearance == null) {
            return null;
        }
        SequenceDefinition sequenceDefinition2 = this.field1240 != -1 && this.field1271 == 0 ? class33.SequenceDefinition_get(this.field1240) : null;
        Model model = this.appearance.getModel(sequenceDefinition2, this.field1241, sequenceDefinition = this.field1238 != -1 && !this.field1139 && (this.field1201 != this.field1238 || sequenceDefinition2 == null) ? class33.SequenceDefinition_get(this.field1238) : null, this.field1237);
        if (model == null) {
            return null;
        }
        model.calculateBoundsCylinder();
        this.field1255 = model.height;
        int n = model.indicesCount;
        if (!this.field1139) {
            model = this.method2807(model);
        }
        if (!this.field1139 && this.field1142 != null) {
            if (Client.cycle >= this.field1130) {
                this.field1142 = null;
            }
            if (Client.cycle >= this.field1129 && Client.cycle < this.field1130) {
                Model model2 = this.field1142;
                model2.offsetBy(this.field1131 * 4096 - this.x, this.field1132 - this.field1128, this.field1133 * 4096 - this.field1196);
                if (this.field1262 != 512) {
                    if (this.field1262 != 1024) {
                        if (this.field1262 == 1536) {
                            model2.rotateY90Ccw();
                        }
                    } else {
                        model2.rotateY90Ccw();
                        model2.rotateY90Ccw();
                    }
                } else {
                    model2.rotateY90Ccw();
                    model2.rotateY90Ccw();
                    model2.rotateY90Ccw();
                }
                Model[] modelArray = new Model[]{model, model2};
                model = new Model(modelArray, 2);
                if (this.field1262 == 512) {
                    model2.rotateY90Ccw();
                } else if (this.field1262 != 1024) {
                    if (this.field1262 == 1536) {
                        model2.rotateY90Ccw();
                        model2.rotateY90Ccw();
                        model2.rotateY90Ccw();
                    }
                } else {
                    model2.rotateY90Ccw();
                    model2.rotateY90Ccw();
                }
                model2.offsetBy(this.x - this.field1131 * 4096, this.field1128 - this.field1132, this.field1196 - this.field1133 * 4096);
            }
        }
        model.isSingleTile = true;
        if (this.field1208 != 0 && Client.cycle >= this.field1256 && Client.cycle < this.field1252) {
            model.field2196 = this.field1258;
            model.field2257 = this.field1211;
            model.field2206 = this.field1261;
            model.overrideAmount = this.field1208;
            model.field2193 = (short)n;
        } else {
            model.overrideAmount = 0;
        }
        return model;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Lvy;B)V", garbageValue="3")
    @Export(value="read")
    final void read(Buffer buffer) {
        int n;
        class228[] class228Array;
        int[] nArray;
        int[] nArray2;
        int n2;
        int[] nArray3;
        int n3;
        int n4;
        byte by;
        block31: {
            int n5;
            int n6;
            int n7;
            buffer.offset = 0;
            by = buffer.readByte();
            n4 = -1;
            this.field1122 = buffer.readByte();
            this.field1123 = buffer.readByte();
            n3 = -1;
            this.field1140 = 0;
            nArray3 = new int[12];
            for (int i = 0; i < nArray3.length; ++i) {
                n7 = buffer.readUnsignedByte();
                if (n7 == 0) {
                    nArray3[i] = 0;
                    continue;
                }
                n6 = buffer.readUnsignedByte();
                n2 = n6 + (n7 << 8);
                if (i == 0 && n2 == 65535) {
                    n3 = buffer.readUnsignedShort();
                    break;
                }
                nArray3[i] = n2;
                if (!this.method2696(nArray3[i]) || (n5 = this.method2671((int)nArray3[i]).field2895) == 0) continue;
                this.field1140 = n5;
            }
            nArray2 = new int[12];
            n7 = 0;
            while (true) {
                if (n7 >= nArray2.length) break;
                n6 = buffer.readUnsignedByte();
                if (n6 == 0) {
                    nArray2[n7] = 0;
                } else {
                    n2 = buffer.readUnsignedByte();
                    nArray2[n7] = n2 + (n6 << 8);
                }
                ++n7;
            }
            nArray = new int[5];
            n6 = 0;
            while (true) {
                block35: {
                    block33: {
                        block34: {
                            block32: {
                                if (n6 >= nArray.length) break block32;
                                n2 = buffer.readUnsignedByte();
                                if (n2 < 0) break block33;
                                break block34;
                            }
                            this.field1201 = buffer.readUnsignedShort();
                            if (this.field1201 == 65535) {
                                this.field1201 = -1;
                            }
                            this.field1202 = buffer.readUnsignedShort();
                            if (this.field1202 == 65535) {
                                this.field1202 = -1;
                            }
                            this.field1203 = this.field1202;
                            this.field1204 = buffer.readUnsignedShort();
                            if (this.field1204 == 65535) {
                                this.field1204 = -1;
                            }
                            this.field1223 = buffer.readUnsignedShort();
                            if (this.field1223 == 65535) {
                                this.field1223 = -1;
                            }
                            this.field1267 = buffer.readUnsignedShort();
                            if (this.field1267 == 65535) {
                                this.field1267 = -1;
                            }
                            this.field1207 = buffer.readUnsignedShort();
                            if (this.field1207 == 65535) {
                                this.field1207 = -1;
                            }
                            this.field1257 = buffer.readUnsignedShort();
                            if (this.field1257 == 65535) {
                                this.field1257 = -1;
                            }
                            this.username = new Username(buffer.readStringCp1252NullTerminated(), class383.loginType);
                            this.method2656();
                            this.method2659();
                            this.method2662();
                            if (this == ModeWhere.localPlayer) {
                                class484.field5049 = this.username.getName();
                            }
                            this.field1136 = buffer.readUnsignedByte();
                            this.field1127 = buffer.readUnsignedShort();
                            boolean bl = this.field1138 = buffer.readUnsignedByte() == 1;
                            if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
                                this.field1138 = false;
                            }
                            class228Array = null;
                            n2 = 0;
                            n5 = buffer.readUnsignedShort();
                            int n8 = n2 = (n5 >> 15 & 1) == 1 ? 1 : 0;
                            if (n5 > 0 && n5 != 32768) {
                                class228Array = new class228[12];
                                break;
                            }
                            break block31;
                        }
                        if (n2 < PlayerComposition.field3816[n6].length) break block35;
                    }
                    n2 = 0;
                }
                nArray[n6] = n2;
                ++n6;
            }
            for (n = 0; n < class228Array.length; ++n) {
                class228 class2282;
                short s;
                int n9;
                boolean bl;
                int[] nArray4;
                int n10;
                int n11 = n5 >> 12 - n & 1;
                if (n11 != 1) continue;
                class228[] class228Array2 = class228Array;
                int n12 = n;
                int n13 = nArray3[n] - 2048;
                int n14 = buffer.readUnsignedByte();
                boolean bl2 = (n14 & 1) != 0;
                boolean bl3 = (n14 & 2) != 0;
                boolean bl4 = (n14 & 4) != 0;
                boolean bl5 = (n14 & 8) != 0;
                class228 class2283 = new class228(n13);
                if (bl2) {
                    n10 = buffer.readUnsignedByte();
                    nArray4 = new int[]{n10 & 0xF, n10 >> 4 & 0xF};
                    bl = class2283.field2479 != null && nArray4.length == class2283.field2479.length;
                    for (n9 = 0; n9 < 2; ++n9) {
                        if (nArray4[n9] == 15) continue;
                        s = (short)buffer.readUnsignedShort();
                        if (!bl) continue;
                        class2283.field2479[nArray4[n9]] = s;
                    }
                }
                if (bl3) {
                    n10 = buffer.readUnsignedByte();
                    nArray4 = new int[]{n10 & 0xF, n10 >> 4 & 0xF};
                    bl = class2283.field2477 != null && nArray4.length == class2283.field2477.length;
                    for (n9 = 0; n9 < 2; ++n9) {
                        if (nArray4[n9] == 15) continue;
                        s = (short)buffer.readUnsignedShort();
                        if (!bl) continue;
                        class2283.field2477[nArray4[n9]] = s;
                    }
                }
                if (bl4) {
                    class2283.field2482 = buffer.readUnsignedShort();
                    class2283.field2472 = buffer.readUnsignedShort();
                }
                if (bl5) {
                    class2283.field2480 = buffer.readUnsignedShort();
                    class2283.field2481 = buffer.readUnsignedShort();
                }
                class228Array2[n12] = class2282 = class2283;
            }
        }
        for (n = 0; n < 3; ++n) {
            this.field1125[n] = buffer.readStringCp1252NullTerminated();
        }
        n4 = buffer.readByte();
        if (this.appearance == null) {
            this.appearance = new PlayerComposition();
        }
        this.appearance.method7095(nArray2, nArray3, class228Array, n2 != 0, nArray, by, n3, n4);
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1283443343")
    boolean method2697() {
        if (this.field1126 == TriBool.TriBool_unknown) {
            this.checkIsFriend();
        }
        return this.field1126 == TriBool.TriBool_true;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="92")
    void method2656() {
        this.field1126 = TriBool.TriBool_unknown;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="70")
    @Export(value="checkIsFriend")
    void checkIsFriend() {
        this.field1126 = class10.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="-75")
    boolean method2658() {
        if (this.field1134 == TriBool.TriBool_unknown) {
            this.updateIsInFriendsChat();
        }
        return this.field1134 == TriBool.TriBool_true;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="506446761")
    void method2659() {
        this.field1134 = TriBool.TriBool_unknown;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="809695880")
    @Export(value="updateIsInFriendsChat")
    void updateIsInFriendsChat() {
        this.field1134 = WorldMapLabelSize.friendsChat != null && WorldMapLabelSize.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1378119328")
    @Export(value="updateIsInClanChat")
    void updateIsInClanChat() {
        int n = 0;
        while (true) {
            if (n >= 4) {
                this.field1135 = TriBool.TriBool_false;
                return;
            }
            if (Client.currentClanSettings[n] != null && Client.currentClanSettings[n].method3712(this.username.getName()) != -1 && n != 2) {
                this.field1135 = TriBool.TriBool_true;
                return;
            }
            ++n;
        }
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1692676098")
    void method2662() {
        this.field1135 = TriBool.TriBool_unknown;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1208907157")
    boolean method2663() {
        if (this.field1135 == TriBool.TriBool_unknown) {
            this.updateIsInClanChat();
        }
        return this.field1135 == TriBool.TriBool_true;
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="458573925")
    @Export(value="transformedSize")
    int transformedSize() {
        if (this.appearance != null && this.appearance.npcTransformId != -1) {
            return class446.getNpcDefinition((int)this.appearance.npcTransformId).size;
        }
        return 1;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Ldz;IILkq;I)V", garbageValue="-1857557654")
    final void method2694(class103 class1032, int n, int n2, class275 class2752) {
        if (this.field1240 != -1 && class33.SequenceDefinition_get((int)this.field1240).field2942 == 1) {
            this.field1240 = -1;
        }
        this.method2782();
        if (n >= 0 && n < 104 && n2 >= 0 && n2 < 104) {
            if (this.field1266[0] >= 0 && this.field1266[0] < 104 && this.field1221[0] >= 0 && this.field1221[0] < 104) {
                if (class2752 == class275.field3046) {
                    class154.method3629(class1032, this, n, n2, class275.field3046);
                }
                this.method2678(n, n2, class2752);
            } else {
                this.resetPath(n, n2);
            }
        } else {
            this.resetPath(n, n2);
        }
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="1461697436")
    @Export(value="resetPath")
    void resetPath(int n, int n2) {
        this.field1265 = 0;
        this.field1270 = 0;
        this.field1269 = 0;
        this.field1266[0] = n;
        this.field1221[0] = n2;
        int n3 = this.transformedSize();
        this.x = n3 * 64 + this.field1266[0] * 128;
        this.field1196 = this.field1221[0] * 128 + n3 * 64;
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(IILkq;B)V", garbageValue="-127")
    final void method2678(int n, int n2, class275 class2752) {
        if (this.field1265 < 9) {
            ++this.field1265;
        }
        int n3 = this.field1265;
        while (true) {
            if (n3 <= 0) {
                this.field1266[0] = n;
                this.field1221[0] = n2;
                this.field1264[0] = class2752;
                return;
            }
            this.field1266[n3] = this.field1266[n3 - 1];
            this.field1221[n3] = this.field1221[n3 - 1];
            this.field1264[n3] = this.field1264[n3 - 1];
            --n3;
        }
    }

    @Override
    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="3")
    @Export(value="isVisible")
    final boolean isVisible() {
        return this.appearance != null;
    }

    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="957965452")
    boolean method2696(int n) {
        return n >= 2048;
    }

    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(II)Lkm;", garbageValue="-466486148")
    ItemComposition method2671(int n) {
        return FaceNormal.ItemDefinition_get(n - 2048);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;Lpq;Lpq;I)V", garbageValue="1937436320")
    public static void method2704(AbstractArchive abstractArchive, AbstractArchive abstractArchive2, AbstractArchive abstractArchive3) {
        HitSplatDefinition.HitSplatDefinition_archive = abstractArchive;
        HitSplatDefinition.field2751 = abstractArchive2;
        HitSplatDefinition.HitSplatDefinition_fontsArchive = abstractArchive3;
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="mb")
    @ObfuscatedSignature(descriptor="([Lna;IIIIIIII)V", garbageValue="2088854136")
    @Export(value="updateInterface")
    static final void updateInterface(Widget[] var0, int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7) {
        var8_8 = 0;
        while (true) {
            block117: {
                block118: {
                    block119: {
                        if (var8_8 >= var0.length) {
                            return;
                        }
                        var9_9 = var0[var8_8];
                        if (var9_9 == null || var9_9.parentId != var1_1 || !var9_9.method7424() && class232.getWidgetFlags(var9_9) == 0 && var9_9 != Client.clickedWidgetParent || (var9_9.isIf3 != false ? class163.isComponentHidden(var9_9) != false : var9_9.type == 0 && var9_9 != class424.mousedOverWidgetIf1 && class163.isComponentHidden(var9_9) != false)) break block117;
                        if (var9_9.type != 11) {
                            if (var9_9.type == 12 && var9_9.method7449(ClanChannel.field1807)) {
                                UserComparator8.invalidateWidget(var9_9);
                            }
                        } else if (var9_9.method7523(ClanChannel.field1807, class280.urlRequester)) {
                            if (var9_9.method7433()) {
                                UserComparator8.invalidateWidget(var9_9);
                                class244.revalidateWidgetScroll(var9_9.children, var9_9, true);
                                var9_9.method7440().method4873().method4976(3, var9_9.method7440().method4853());
                            }
                            if (var9_9.field4023 != null) {
                                var10_10 = new ScriptEvent();
                                var10_10.widget = var9_9;
                                var10_10.args = var9_9.field4023;
                                Client.scriptEvents.addFirst(var10_10);
                            }
                        }
                        var26_26 = var9_9.x + var6_6;
                        var11_11 = var7_7 + var9_9.y;
                        if (var9_9.type != 9) {
                            var16_16 = var26_26 + var9_9.width;
                            var17_17 = var11_11 + var9_9.height * -1528330031;
                            var12_12 = var26_26 > var2_2 ? var26_26 : var2_2;
                            var13_13 = var11_11 > var3_3 ? var11_11 : var3_3;
                            var14_14 = var16_16 < var4_4 ? var16_16 : var4_4;
                            var15_15 = var17_17 < var5_5 ? var17_17 : var5_5;
                        } else {
                            var16_16 = var26_26;
                            var17_17 = var11_11;
                            var18_18 = var26_26 + var9_9.width;
                            var19_19 = var9_9.height * -1528330031 + var11_11;
                            if (var18_18 < var16_16) {
                                var20_20 = var16_16;
                                var16_16 = var18_18;
                                var18_18 = var20_20;
                            }
                            if (var19_19 < var17_17) {
                                var20_20 = var17_17;
                                var17_17 = var19_19;
                                var19_19 = var20_20;
                            }
                            var12_12 = var16_16 > var2_2 ? var16_16 : var2_2;
                            var13_13 = var17_17 > var3_3 ? var17_17 : var3_3;
                            var14_14 = var18_18 < var4_4 ? ++var18_18 : var4_4;
                            v0 = var15_15 = var19_19 < var5_5 ? ++var19_19 : var5_5;
                        }
                        if (var9_9 == Client.clickedWidget) {
                            Client.field683 = true;
                            Client.field721 = var26_26;
                            Client.field685 = var11_11;
                        }
                        var16_16 = 0;
                        if (var9_9.field3950) {
                            switch (Client.field665) {
                                case 3: {
                                    if (var9_9.id != Client.field707) break;
                                    var16_16 = 1;
                                    break;
                                }
                                case 0: {
                                    var16_16 = 1;
                                    break;
                                }
                                case 2: {
                                    if (Client.field707 != var9_9.id >>> 16) break;
                                    var16_16 = 1;
                                }
                            }
                        }
                        if (var16_16 == 0 && var9_9.isIf3 && (var12_12 >= var14_14 || var13_13 >= var15_15)) break block117;
                        if (var9_9.isIf3) {
                            if (!var9_9.noClickThrough) {
                                if (var9_9.noScrollThrough && MouseHandler.MouseHandler_x >= var12_12 && MouseHandler.MouseHandler_y >= var13_13 && MouseHandler.MouseHandler_x < var14_14 && MouseHandler.MouseHandler_y < var15_15) {
                                    var27_27 = (ScriptEvent)Client.scriptEvents.last();
                                    while (var27_27 != null) {
                                        if (var27_27.field1075 && var27_27.widget.onScroll == var27_27.args) {
                                            var27_27.remove();
                                        }
                                        var27_27 = (ScriptEvent)Client.scriptEvents.previous();
                                    }
                                }
                            } else if (MouseHandler.MouseHandler_x >= var12_12 && MouseHandler.MouseHandler_y >= var13_13 && MouseHandler.MouseHandler_x < var14_14 && MouseHandler.MouseHandler_y < var15_15) {
                                var27_27 = (ScriptEvent)Client.scriptEvents.last();
                                while (true) {
                                    if (var27_27 == null) {
                                        SoundCache.method881();
                                        if (class243.widgetDragDuration == 0) {
                                            Client.clickedWidget = null;
                                            Client.clickedWidgetParent = null;
                                        }
                                        if (!Client.isMenuOpen) {
                                            ClientPreferences.method2990();
                                        }
                                        break;
                                    }
                                    if (var27_27.field1075) {
                                        var27_27.remove();
                                        var27_27.widget.field3959 = false;
                                    }
                                    var27_27 = (ScriptEvent)Client.scriptEvents.previous();
                                }
                            }
                        }
                        var17_17 = MouseHandler.MouseHandler_x;
                        var18_18 = MouseHandler.MouseHandler_y;
                        if (MouseHandler.MouseHandler_lastButton != 0) {
                            var17_17 = MouseHandler.MouseHandler_lastPressedX;
                            var18_18 = MouseHandler.MouseHandler_lastPressedY;
                        }
                        v1 = var19_19 = var17_17 >= var12_12 && var18_18 >= var13_13 && var17_17 < var14_14 && var18_18 < var15_15 ? 1 : 0;
                        if (var9_9.contentType == 1337) break block118;
                        if (var9_9.contentType == 1338) break block119;
                        if (var9_9.contentType == 1400) {
                            class420.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, (boolean)var19_19, var26_26, var11_11, var9_9.width, var9_9.height * -1528330031);
                        }
                        if (!Client.isMenuOpen && var19_19 != 0) {
                            if (var9_9.contentType != 1400) {
                                class419.method8221(var9_9);
                            } else {
                                class420.worldMap.addElementMenuOptions(var26_26, var11_11, var9_9.width, var9_9.height * -1528330031, var17_17, var18_18);
                            }
                        }
                        if (var16_16 == 0) ** GOTO lbl110
                        var20_20 = 0;
                        while (true) {
                            block120: {
                                if (var20_20 < var9_9.field3861.length) break block120;
lbl110:
                                // 2 sources

                                if (!var9_9.isIf3) ** GOTO lbl326
                                var19_19 = MouseHandler.MouseHandler_x >= var12_12 && MouseHandler.MouseHandler_y >= var13_13 && MouseHandler.MouseHandler_x < var14_14 && MouseHandler.MouseHandler_y < var15_15 ? 1 : 0;
                                var20_20 = 0;
                                if ((MouseHandler.MouseHandler_currentButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var19_19 != 0) {
                                    var20_20 = 1;
                                }
                                var21_21 = 0;
                                if ((MouseHandler.MouseHandler_lastButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12_12 && MouseHandler.MouseHandler_lastPressedY >= var13_13 && MouseHandler.MouseHandler_lastPressedX < var14_14 && MouseHandler.MouseHandler_lastPressedY < var15_15) {
                                    var21_21 = 1;
                                }
                                if (var21_21 != 0) {
                                    WorldMapLabel.clickWidget(var9_9, MouseHandler.MouseHandler_lastPressedX - var26_26, MouseHandler.MouseHandler_lastPressedY - var11_11);
                                }
                                if (var9_9.method7425()) {
                                    if (var21_21 != 0) {
                                        Client.field709.addFirst(new class268(0, MouseHandler.MouseHandler_x - var26_26, MouseHandler.MouseHandler_y - var11_11, var9_9));
                                    }
                                    if (var20_20 != 0) {
                                        Client.field709.addFirst(new class268(1, MouseHandler.MouseHandler_x - var26_26, MouseHandler.MouseHandler_y - var11_11, var9_9));
                                    }
                                }
                                if (var9_9.contentType == 1400) {
                                    class420.worldMap.method9800(var17_17, var18_18, (boolean)(var19_19 & var20_20), (boolean)(var19_19 & var21_21));
                                }
                                if (Client.clickedWidget != null && var9_9 != Client.clickedWidget && var19_19 != 0 && GameEngine.method673(class232.getWidgetFlags(var9_9))) {
                                    Client.draggedOnWidget = var9_9;
                                }
                                if (var9_9 == Client.clickedWidgetParent) {
                                    Client.field523 = true;
                                    Client.field681 = var26_26;
                                    Client.field682 = var11_11;
                                }
                                if (!var9_9.hasListener) ** GOTO lbl326
                                if (var19_19 != 0 && Client.mouseWheelRotation != 0 && var9_9.onScroll != null) {
                                    var22_22 = new ScriptEvent();
                                    var22_22.field1075 = true;
                                    var22_22.widget = var9_9;
                                    var22_22.mouseY = Client.mouseWheelRotation;
                                    var22_22.args = var9_9.onScroll;
                                    Client.scriptEvents.addFirst((Node)var22_22);
                                }
                                if (Client.clickedWidget != null || Client.isMenuOpen) {
                                    var21_21 = 0;
                                    var20_20 = 0;
                                    var19_19 = 0;
                                }
                                if (!var9_9.field4016 && var21_21 != 0) {
                                    var9_9.field4016 = true;
                                    if (var9_9.onClick != null) {
                                        var22_22 = new ScriptEvent();
                                        var22_22.field1075 = true;
                                        var22_22.widget = var9_9;
                                        var22_22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26_26;
                                        var22_22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11_11;
                                        var22_22.args = var9_9.onClick;
                                        Client.scriptEvents.addFirst((Node)var22_22);
                                    }
                                }
                                if (var9_9.field4016 && var20_20 != 0 && var9_9.onClickRepeat != null) {
                                    var22_22 = new ScriptEvent();
                                    var22_22.field1075 = true;
                                    var22_22.widget = var9_9;
                                    var22_22.mouseX = MouseHandler.MouseHandler_x - var26_26;
                                    var22_22.mouseY = MouseHandler.MouseHandler_y - var11_11;
                                    var22_22.args = var9_9.onClickRepeat;
                                    Client.scriptEvents.addFirst((Node)var22_22);
                                }
                                if (var9_9.field4016 && var20_20 == 0) {
                                    var9_9.field4016 = false;
                                    if (var9_9.onRelease != null) {
                                        var22_22 = new ScriptEvent();
                                        var22_22.field1075 = true;
                                        var22_22.widget = var9_9;
                                        var22_22.mouseX = MouseHandler.MouseHandler_x - var26_26;
                                        var22_22.mouseY = MouseHandler.MouseHandler_y - var11_11;
                                        var22_22.args = var9_9.onRelease;
                                        Client.field708.addFirst((Node)var22_22);
                                    }
                                }
                                if (var20_20 != 0 && var9_9.onHold != null) {
                                    var22_22 = new ScriptEvent();
                                    var22_22.field1075 = true;
                                    var22_22.widget = var9_9;
                                    var22_22.mouseX = MouseHandler.MouseHandler_x - var26_26;
                                    var22_22.mouseY = MouseHandler.MouseHandler_y - var11_11;
                                    var22_22.args = var9_9.onHold;
                                    Client.scriptEvents.addFirst((Node)var22_22);
                                }
                                if (!var9_9.field3959 && var19_19 != 0) {
                                    var9_9.field3959 = true;
                                    if (var9_9.onMouseOver != null) {
                                        var22_22 = new ScriptEvent();
                                        var22_22.field1075 = true;
                                        var22_22.widget = var9_9;
                                        var22_22.mouseX = MouseHandler.MouseHandler_x - var26_26;
                                        var22_22.mouseY = MouseHandler.MouseHandler_y - var11_11;
                                        var22_22.args = var9_9.onMouseOver;
                                        Client.scriptEvents.addFirst((Node)var22_22);
                                    }
                                }
                                if (var9_9.field3959 && var19_19 != 0 && var9_9.onMouseRepeat != null) {
                                    var22_22 = new ScriptEvent();
                                    var22_22.field1075 = true;
                                    var22_22.widget = var9_9;
                                    var22_22.mouseX = MouseHandler.MouseHandler_x - var26_26;
                                    var22_22.mouseY = MouseHandler.MouseHandler_y - var11_11;
                                    var22_22.args = var9_9.onMouseRepeat;
                                    Client.scriptEvents.addFirst((Node)var22_22);
                                }
                                if (var9_9.field3959 && var19_19 == 0) {
                                    var9_9.field3959 = false;
                                    if (var9_9.onMouseLeave != null) {
                                        var22_22 = new ScriptEvent();
                                        var22_22.field1075 = true;
                                        var22_22.widget = var9_9;
                                        var22_22.mouseX = MouseHandler.MouseHandler_x - var26_26;
                                        var22_22.mouseY = MouseHandler.MouseHandler_y - var11_11;
                                        var22_22.args = var9_9.onMouseLeave;
                                        Client.field708.addFirst((Node)var22_22);
                                    }
                                }
                                if (var9_9.onTimer != null) {
                                    var22_22 = new ScriptEvent();
                                    var22_22.widget = var9_9;
                                    var22_22.args = var9_9.onTimer;
                                    Client.field666.addFirst((Node)var22_22);
                                }
                                if (var9_9.onVarTransmit != null && Client.field586 > var9_9.field4018) {
                                    block114: {
                                        if (var9_9.varTransmitTriggers != null && Client.field586 - var9_9.field4018 <= 32) {
                                            for (var28_28 = var9_9.field4018; var28_28 < Client.field586; ++var28_28) {
                                                var23_23 = Client.field688[var28_28 & 31];
                                                for (var24_24 = 0; var24_24 < var9_9.varTransmitTriggers.length; ++var24_24) {
                                                    if (var23_23 != var9_9.varTransmitTriggers[var24_24]) continue;
                                                    var25_25 = new ScriptEvent();
                                                    var25_25.widget = var9_9;
                                                    var25_25.args = var9_9.onVarTransmit;
                                                    Client.scriptEvents.addFirst(var25_25);
                                                    break block114;
                                                }
                                            }
                                        } else {
                                            var22_22 = new ScriptEvent();
                                            var22_22.widget = var9_9;
                                            var22_22.args = var9_9.onVarTransmit;
                                            Client.scriptEvents.addFirst((Node)var22_22);
                                        }
                                    }
                                    var9_9.field4018 = Client.field586;
                                }
                                if (var9_9.onInvTransmit != null && Client.field749 > var9_9.field4019) {
                                    block115: {
                                        if (var9_9.invTransmitTriggers != null && Client.field749 - var9_9.field4019 <= 32) {
                                            for (var28_28 = var9_9.field4019; var28_28 < Client.field749; ++var28_28) {
                                                var23_23 = Client.field544[var28_28 & 31];
                                                for (var24_24 = 0; var24_24 < var9_9.invTransmitTriggers.length; ++var24_24) {
                                                    if (var23_23 != var9_9.invTransmitTriggers[var24_24]) continue;
                                                    var25_25 = new ScriptEvent();
                                                    var25_25.widget = var9_9;
                                                    var25_25.args = var9_9.onInvTransmit;
                                                    Client.scriptEvents.addFirst(var25_25);
                                                    break block115;
                                                }
                                            }
                                        } else {
                                            var22_22 = new ScriptEvent();
                                            var22_22.widget = var9_9;
                                            var22_22.args = var9_9.onInvTransmit;
                                            Client.scriptEvents.addFirst((Node)var22_22);
                                        }
                                    }
                                    var9_9.field4019 = Client.field749;
                                }
                                if (var9_9.onStatTransmit != null && Client.field505 > var9_9.field3954) {
                                    block116: {
                                        if (var9_9.statTransmitTriggers != null && Client.field505 - var9_9.field3954 <= 32) {
                                            for (var28_28 = var9_9.field3954; var28_28 < Client.field505; ++var28_28) {
                                                var23_23 = Client.field780[var28_28 & 31];
                                                for (var24_24 = 0; var24_24 < var9_9.statTransmitTriggers.length; ++var24_24) {
                                                    if (var23_23 != var9_9.statTransmitTriggers[var24_24]) continue;
                                                    var25_25 = new ScriptEvent();
                                                    var25_25.widget = var9_9;
                                                    var25_25.args = var9_9.onStatTransmit;
                                                    Client.scriptEvents.addFirst(var25_25);
                                                    break block116;
                                                }
                                            }
                                        } else {
                                            var22_22 = new ScriptEvent();
                                            var22_22.widget = var9_9;
                                            var22_22.args = var9_9.onStatTransmit;
                                            Client.scriptEvents.addFirst((Node)var22_22);
                                        }
                                    }
                                    var9_9.field3954 = Client.field505;
                                }
                                if (Client.chatCycle > var9_9.field4017 && var9_9.onChatTransmit != null) {
                                    var22_22 = new ScriptEvent();
                                    var22_22.widget = var9_9;
                                    var22_22.args = var9_9.onChatTransmit;
                                    Client.scriptEvents.addFirst((Node)var22_22);
                                }
                                if (Client.field697 > var9_9.field4017 && var9_9.onFriendTransmit != null) {
                                    var22_22 = new ScriptEvent();
                                    var22_22.widget = var9_9;
                                    var22_22.args = var9_9.onFriendTransmit;
                                    Client.scriptEvents.addFirst((Node)var22_22);
                                }
                                if (Client.field770 > var9_9.field4017 && var9_9.onClanTransmit != null) {
                                    var22_22 = new ScriptEvent();
                                    var22_22.widget = var9_9;
                                    var22_22.args = var9_9.onClanTransmit;
                                    Client.scriptEvents.addFirst((Node)var22_22);
                                }
                                if (Client.menuOptionsCount > var9_9.field4017 && var9_9.field3993 != null) {
                                    var22_22 = new ScriptEvent();
                                    var22_22.widget = var9_9;
                                    var22_22.args = var9_9.field3993;
                                    Client.scriptEvents.addFirst((Node)var22_22);
                                }
                                if (Client.field700 > var9_9.field4017 && var9_9.field3988 != null) {
                                    var22_22 = new ScriptEvent();
                                    var22_22.widget = var9_9;
                                    var22_22.args = var9_9.field3988;
                                    Client.scriptEvents.addFirst((Node)var22_22);
                                }
                                if (Client.field701 > var9_9.field4017 && var9_9.onStockTransmit != null) {
                                    var22_22 = new ScriptEvent();
                                    var22_22.widget = var9_9;
                                    var22_22.args = var9_9.onStockTransmit;
                                    Client.scriptEvents.addFirst((Node)var22_22);
                                }
                                if (Client.field714 > var9_9.field4017 && var9_9.field4000 != null) {
                                    var22_22 = new ScriptEvent();
                                    var22_22.widget = var9_9;
                                    var22_22.args = var9_9.field4000;
                                    Client.scriptEvents.addFirst((Node)var22_22);
                                }
                                if (Client.field499 > var9_9.field4017 && var9_9.onMiscTransmit != null) {
                                    var22_22 = new ScriptEvent();
                                    var22_22.widget = var9_9;
                                    var22_22.args = var9_9.onMiscTransmit;
                                    Client.scriptEvents.addFirst((Node)var22_22);
                                }
                                var9_9.field4017 = Client.cycleCntr;
                                if (var9_9.onKey == null) ** GOTO lbl316
                                var28_28 = 0;
                                while (true) {
                                    block121: {
                                        if (var28_28 < Client.field733) break block121;
lbl316:
                                        // 2 sources

                                        if (var9_9.field3989 == null) ** GOTO lbl321
                                        var22_22 = Client.field731.method5766();
                                        var23_23 = 0;
                                        while (true) {
                                            block122: {
                                                if (var23_23 < ((Object)var22_22).length) break block122;
lbl321:
                                                // 2 sources

                                                if (var9_9.field3901 == null) ** GOTO lbl326
                                                var22_22 = Client.field731.method5767();
                                                var23_23 = 0;
                                                while (true) {
                                                    block123: {
                                                        if (var23_23 < ((Object)var22_22).length) break block123;
lbl326:
                                                        // 4 sources

                                                        if (!var9_9.isIf3) {
                                                            if (Client.clickedWidget != null || Client.isMenuOpen) break block117;
                                                            if ((var9_9.mouseOverRedirect >= 0 || var9_9.field3892 != 0) && MouseHandler.MouseHandler_x >= var12_12 && MouseHandler.MouseHandler_y >= var13_13 && MouseHandler.MouseHandler_x < var14_14 && MouseHandler.MouseHandler_y < var15_15) {
                                                                class424.mousedOverWidgetIf1 = var9_9.mouseOverRedirect >= 0 ? var0[var9_9.mouseOverRedirect] : var9_9;
                                                            }
                                                            if (var9_9.type == 8 && MouseHandler.MouseHandler_x >= var12_12 && MouseHandler.MouseHandler_y >= var13_13 && MouseHandler.MouseHandler_x < var14_14 && MouseHandler.MouseHandler_y < var15_15) {
                                                                HealthBar.field1346 = var9_9;
                                                            }
                                                            if (var9_9.scrollHeight > var9_9.height * -1528330031) {
                                                                MenuAction.method2364(var9_9, var26_26 + var9_9.width, var11_11, var9_9.height * -1528330031, var9_9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
                                                            }
                                                        }
                                                        if (var9_9.type == 0) {
                                                            Player.updateInterface(var0, var9_9.id, var12_12, var13_13, var14_14, var15_15, var26_26 - var9_9.scrollX, var11_11 - var9_9.scrollY);
                                                            if (var9_9.children != null) {
                                                                Player.updateInterface(var9_9.children, var9_9.id, var12_12, var13_13, var14_14, var15_15, var26_26 - var9_9.scrollX, var11_11 - var9_9.scrollY);
                                                            }
                                                            if ((var29_29 = (InterfaceParent)Client.interfaceParents.get(var9_9.id)) != null) {
                                                                if (var29_29.type == 0 && MouseHandler.MouseHandler_x >= var12_12 && MouseHandler.MouseHandler_y >= var13_13 && MouseHandler.MouseHandler_x < var14_14 && MouseHandler.MouseHandler_y < var15_15 && !Client.isMenuOpen) {
                                                                    var30_30 = (ScriptEvent)Client.scriptEvents.last();
                                                                    while (true) {
                                                                        if (var30_30 == null) {
                                                                            if (class243.widgetDragDuration == 0) {
                                                                                Client.clickedWidget = null;
                                                                                Client.clickedWidgetParent = null;
                                                                            }
                                                                            if (Client.isMenuOpen) break;
                                                                            ClientPreferences.method2990();
                                                                            break;
                                                                        }
                                                                        if (var30_30.field1075) {
                                                                            var30_30.remove();
                                                                            var30_30.widget.field3959 = false;
                                                                        }
                                                                        var30_30 = (ScriptEvent)Client.scriptEvents.previous();
                                                                    }
                                                                }
                                                                DirectByteArrayCopier.updateRootInterface(var29_29.group, var12_12, var13_13, var14_14, var15_15, var26_26, var11_11);
                                                            }
                                                        }
                                                        break block117;
                                                    }
                                                    var31_31 = new ScriptEvent();
                                                    var31_31.widget = var9_9;
                                                    var31_31.keyTyped = (int)var22_22[var23_23];
                                                    var31_31.args = var9_9.field3901;
                                                    Client.scriptEvents.addFirst(var31_31);
                                                    ++var23_23;
                                                }
                                            }
                                            var31_31 = new ScriptEvent();
                                            var31_31.widget = var9_9;
                                            var31_31.keyTyped = (int)var22_22[var23_23];
                                            var31_31.args = var9_9.field3989;
                                            Client.scriptEvents.addFirst(var31_31);
                                            ++var23_23;
                                        }
                                    }
                                    var32_32 = new ScriptEvent();
                                    var32_32.widget = var9_9;
                                    var32_32.keyTyped = Client.field735[var28_28];
                                    var32_32.field1084 = Client.field589[var28_28];
                                    var32_32.args = var9_9.onKey;
                                    Client.scriptEvents.addFirst(var32_32);
                                    ++var28_28;
                                }
                            }
                            var21_21 = 0;
                            var28_28 = 0;
                            if (var21_21 == 0 && var9_9.field3861[var20_20] != null) {
                                for (var23_23 = 0; var23_23 < var9_9.field3861[var20_20].length; ++var23_23) {
                                    var24_24 = 0;
                                    if (var9_9.field3953 != null) {
                                        var24_24 = Client.field731.method5776(var9_9.field3861[var20_20][var23_23]);
                                    }
                                    if (!Clock.method5074(var9_9.field3861[var20_20][var23_23]) && var24_24 == 0) continue;
                                    var21_21 = 1;
                                    if (var9_9.field3953 != null && var9_9.field3953[var20_20] > Client.cycle) break;
                                    var33_33 = var9_9.field3952[var20_20][var23_23];
                                    if (var33_33 != 0 && ((var33_33 & 8) != 0 && (Client.field731.method5776(86) != false || Client.field731.method5776(82) != false || Client.field731.method5776(81) != false) || (var33_33 & 2) != 0 && Client.field731.method5776(86) == false || (var33_33 & 1) != 0 && Client.field731.method5776(82) == false || (var33_33 & 4) != 0 && !Client.field731.method5776(81))) {
                                        continue;
                                    }
                                    var28_28 = 1;
                                    break;
                                }
                            }
                            if (var28_28 != 0) {
                                if (var20_20 < 10) {
                                    UrlRequester.widgetDefaultMenuAction(var20_20 + 1, var9_9.id, var9_9.childIndex, var9_9.itemId, "");
                                } else if (var20_20 == 10) {
                                    class278.method5969();
                                    AbstractWorldMapIcon.method6464(var9_9.id, var9_9.childIndex, class298.Widget_unpackTargetMask(class232.getWidgetFlags(var9_9)), var9_9.itemId);
                                    Client.field661 = class47.Widget_getSpellActionName(var9_9);
                                    if (Client.field661 == null) {
                                        Client.field661 = "null";
                                    }
                                    Client.field662 = var9_9.dataText + class97.colorStartTag(0xFFFFFF);
                                }
                                var23_23 = var9_9.field3964[var20_20];
                                if (var9_9.field3953 == null) {
                                    var9_9.field3953 = new int[var9_9.field3861.length];
                                }
                                if (var9_9.field3864 == null) {
                                    var9_9.field3864 = new int[var9_9.field3861.length];
                                }
                                var9_9.field3953[var20_20] = var23_23 == 0 ? 0x7FFFFFFF : (var9_9.field3953[var20_20] == 0 ? var23_23 + Client.cycle + var9_9.field3864[var20_20] : var23_23 + Client.cycle);
                            }
                            if (var21_21 == 0 && var9_9.field3953 != null) {
                                var9_9.field3953[var20_20] = 0;
                            }
                            ++var20_20;
                        }
                    }
                    class181.checkIfMinimapClicked(var9_9, var26_26, var11_11);
                    break block117;
                }
                if (!Client.field513 && !Client.isMenuOpen && var19_19 != 0) {
                    class368.addSceneMenuOptions(var17_17, var18_18, var12_12, var13_13);
                }
            }
            ++var8_8;
        }
    }
}

