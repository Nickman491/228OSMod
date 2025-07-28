/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ih")
public class class224 {
    @ObfuscatedName(value="ao")
    public String field2450;
    @ObfuscatedName(value="ad")
    public float[] field2447 = new float[4];
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1579963723)
    public int field2451 = 1;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-937616875)
    public int field2453 = 1;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-116708463)
    public int field2454 = 0;
    @ObfuscatedSignature(descriptor="Lic;")
    final /* synthetic */ class223 this$0;

    @ObfuscatedSignature(descriptor="(Lic;)V")
    class224(class223 class2232) {
        this.this$0 = class2232;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIIIIB)I", garbageValue="0")
    public static int method5045(int n, int n2, int n3, int n4, int n5, int n6) {
        if ((n6 & 1) == 1) {
            int n7 = n4;
            n4 = n5;
            n5 = n7;
        }
        if ((n3 &= 3) == 0) {
            return n2;
        }
        if (n3 == 1) {
            return 7 - n - (n4 - 1);
        }
        if (n3 == 2) {
            return 7 - n2 - (n5 - 1);
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="jq")
    @ObfuscatedSignature(descriptor="(Lmr;B)V", garbageValue="-9")
    static final void method5046(class323 class3232) {
        int n;
        int n2;
        String[] stringArray;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        PacketBuffer packetBuffer;
        block31: {
            int n8;
            block45: {
                int n9;
                int n10;
                block19: {
                    TileItem tileItem;
                    NodeDeque nodeDeque;
                    block20: {
                        int n11;
                        int n12;
                        int n13;
                        int n14;
                        int n15;
                        int n16;
                        block51: {
                            block10: {
                                block11: {
                                    boolean bl;
                                    int n17;
                                    int n18;
                                    int n19;
                                    int n20;
                                    int n21;
                                    int n22;
                                    int n23;
                                    block50: {
                                        block13: {
                                            block14: {
                                                int n24;
                                                int n25;
                                                int n26;
                                                int n27;
                                                int n28;
                                                int n29;
                                                int n30;
                                                short s;
                                                short s2;
                                                int n31;
                                                block49: {
                                                    block16: {
                                                        block17: {
                                                            int n32;
                                                            block48: {
                                                                block22: {
                                                                    block23: {
                                                                        int n33;
                                                                        int n34;
                                                                        block47: {
                                                                            block25: {
                                                                                block26: {
                                                                                    int n35;
                                                                                    block46: {
                                                                                        block28: {
                                                                                            block29: {
                                                                                                block32: {
                                                                                                    int n36;
                                                                                                    block44: {
                                                                                                        block34: {
                                                                                                            block35: {
                                                                                                                int n37;
                                                                                                                int n38;
                                                                                                                int n39;
                                                                                                                int n40;
                                                                                                                block43: {
                                                                                                                    block37: {
                                                                                                                        block38: {
                                                                                                                            int n41;
                                                                                                                            block42: {
                                                                                                                                block40: {
                                                                                                                                    block41: {
                                                                                                                                        int n42;
                                                                                                                                        int n43;
                                                                                                                                        int n44;
                                                                                                                                        int n45;
                                                                                                                                        int n46;
                                                                                                                                        int n47;
                                                                                                                                        int n48;
                                                                                                                                        int n49;
                                                                                                                                        int n50;
                                                                                                                                        block39: {
                                                                                                                                            block36: {
                                                                                                                                                block33: {
                                                                                                                                                    block30: {
                                                                                                                                                        block27: {
                                                                                                                                                            block24: {
                                                                                                                                                                block21: {
                                                                                                                                                                    block18: {
                                                                                                                                                                        block15: {
                                                                                                                                                                            block12: {
                                                                                                                                                                                block9: {
                                                                                                                                                                                    packetBuffer = Client.packetWriter.packetBuffer;
                                                                                                                                                                                    if (class323.field3432 != class3232) break block9;
                                                                                                                                                                                    n16 = packetBuffer.method10334();
                                                                                                                                                                                    n15 = packetBuffer.method10341();
                                                                                                                                                                                    int n51 = packetBuffer.method10314();
                                                                                                                                                                                    n14 = (n51 >> 4 & 7) + AbstractWorldMapData.field3215;
                                                                                                                                                                                    n13 = (n51 & 7) + class360.field3857;
                                                                                                                                                                                    n12 = packetBuffer.method10334();
                                                                                                                                                                                    if (n14 < 0) return;
                                                                                                                                                                                    if (n13 < 0) return;
                                                                                                                                                                                    if (n14 >= class30.field131.field1322) return;
                                                                                                                                                                                    if (n13 >= class30.field131.field1323) return;
                                                                                                                                                                                    n14 = Coord.method6980(n14);
                                                                                                                                                                                    n13 = Coord.method6980(n13);
                                                                                                                                                                                    if (Client.field767 != -1) break block10;
                                                                                                                                                                                    break block11;
                                                                                                                                                                                }
                                                                                                                                                                                if (class323.field3430 != class3232) break block12;
                                                                                                                                                                                int n52 = packetBuffer.method10312();
                                                                                                                                                                                n23 = n52 >> 2;
                                                                                                                                                                                n22 = n52 & 3;
                                                                                                                                                                                n21 = Client.field578[n23];
                                                                                                                                                                                int n53 = packetBuffer.method10312();
                                                                                                                                                                                n20 = (n53 >> 4 & 7) + AbstractWorldMapData.field3215;
                                                                                                                                                                                n19 = (n53 & 7) + class360.field3857;
                                                                                                                                                                                n18 = packetBuffer.method10458();
                                                                                                                                                                                if (0 > n20) return;
                                                                                                                                                                                if (n20 >= 103) return;
                                                                                                                                                                                if (0 > n19) return;
                                                                                                                                                                                if (n19 >= 103) return;
                                                                                                                                                                                if (Client.field767 != -1) break block13;
                                                                                                                                                                                break block14;
                                                                                                                                                                            }
                                                                                                                                                                            if (class323.field3431 != class3232) break block15;
                                                                                                                                                                            n31 = packetBuffer.readInt();
                                                                                                                                                                            s2 = (short)packetBuffer.method10326();
                                                                                                                                                                            s = (short)packetBuffer.method10324();
                                                                                                                                                                            int n54 = packetBuffer.method10314();
                                                                                                                                                                            n30 = (n54 >> 4 & 7) + AbstractWorldMapData.field3215;
                                                                                                                                                                            n29 = (n54 & 7) + class360.field3857;
                                                                                                                                                                            n28 = packetBuffer.readUnsignedShort();
                                                                                                                                                                            n27 = packetBuffer.method10334();
                                                                                                                                                                            n26 = packetBuffer.readShort();
                                                                                                                                                                            n25 = packetBuffer.method10325();
                                                                                                                                                                            if (n30 < 0) return;
                                                                                                                                                                            if (n29 < 0) return;
                                                                                                                                                                            if (n30 >= 104) return;
                                                                                                                                                                            if (n29 >= 104) return;
                                                                                                                                                                            if (Client.field767 != -1) break block16;
                                                                                                                                                                            break block17;
                                                                                                                                                                        }
                                                                                                                                                                        if (class323.field3423 != class3232) break block18;
                                                                                                                                                                        n10 = packetBuffer.method10334();
                                                                                                                                                                        n7 = packetBuffer.readUnsignedByte();
                                                                                                                                                                        n6 = packetBuffer.method10312();
                                                                                                                                                                        n9 = (n6 >> 4 & 7) + AbstractWorldMapData.field3215;
                                                                                                                                                                        n5 = (n6 & 7) + class360.field3857;
                                                                                                                                                                        n4 = class30.field131.field1321;
                                                                                                                                                                        if (n9 < 0 || n5 < 0 || n9 >= class30.field131.field1322 || n5 >= class30.field131.field1323) break block18;
                                                                                                                                                                        nodeDeque = class30.field131.field1327[n4][n9][n5];
                                                                                                                                                                        if (nodeDeque == null) break block19;
                                                                                                                                                                        tileItem = (TileItem)nodeDeque.last();
                                                                                                                                                                        break block20;
                                                                                                                                                                    }
                                                                                                                                                                    if (class323.field3424 != class3232) break block21;
                                                                                                                                                                    n10 = packetBuffer.method10334();
                                                                                                                                                                    n7 = packetBuffer.method10314();
                                                                                                                                                                    n6 = (n7 >> 4 & 7) + AbstractWorldMapData.field3215;
                                                                                                                                                                    n9 = (n7 & 7) + class360.field3857;
                                                                                                                                                                    n5 = packetBuffer.method10378();
                                                                                                                                                                    if (n6 < 0) return;
                                                                                                                                                                    if (n9 < 0) return;
                                                                                                                                                                    if (n6 >= 104) return;
                                                                                                                                                                    if (n9 >= 104) return;
                                                                                                                                                                    if (Client.field767 != -1) break block22;
                                                                                                                                                                    break block23;
                                                                                                                                                                }
                                                                                                                                                                if (class323.field3427 != class3232) break block24;
                                                                                                                                                                n10 = packetBuffer.method10314();
                                                                                                                                                                n7 = (n10 >> 4 & 7) + AbstractWorldMapData.field3215;
                                                                                                                                                                n6 = (n10 & 7) + class360.field3857;
                                                                                                                                                                n9 = packetBuffer.method10312();
                                                                                                                                                                n5 = n9 >> 2;
                                                                                                                                                                n4 = n9 & 3;
                                                                                                                                                                n34 = Client.field578[n5];
                                                                                                                                                                if (n7 < 0) return;
                                                                                                                                                                if (n6 < 0) return;
                                                                                                                                                                if (n7 >= class30.field131.field1322) return;
                                                                                                                                                                if (n6 >= class30.field131.field1323) return;
                                                                                                                                                                if (Client.field767 != -1) break block25;
                                                                                                                                                                break block26;
                                                                                                                                                            }
                                                                                                                                                            if (class323.field3433 != class3232) break block27;
                                                                                                                                                            n10 = packetBuffer.readInt();
                                                                                                                                                            n7 = packetBuffer.method10387();
                                                                                                                                                            n6 = packetBuffer.method10312();
                                                                                                                                                            n9 = (n6 >> 4 & 7) + AbstractWorldMapData.field3215;
                                                                                                                                                            n5 = (n6 & 7) + class360.field3857;
                                                                                                                                                            n4 = packetBuffer.method10323();
                                                                                                                                                            if (n9 < 0) return;
                                                                                                                                                            if (n5 < 0) return;
                                                                                                                                                            if (n9 >= class30.field131.field1322) return;
                                                                                                                                                            if (n5 >= class30.field131.field1323) return;
                                                                                                                                                            if (Client.field767 != -1) break block28;
                                                                                                                                                            break block29;
                                                                                                                                                        }
                                                                                                                                                        if (class323.field3425 != class3232) break block30;
                                                                                                                                                        n10 = packetBuffer.readUnsignedByte();
                                                                                                                                                        n7 = (n10 >> 4 & 7) + AbstractWorldMapData.field3215;
                                                                                                                                                        n6 = (n10 & 7) + class360.field3857;
                                                                                                                                                        n9 = packetBuffer.method10341();
                                                                                                                                                        n5 = n9 >> 2;
                                                                                                                                                        n4 = n9 & 3;
                                                                                                                                                        n3 = Client.field578[n5];
                                                                                                                                                        n8 = packetBuffer.method10341();
                                                                                                                                                        stringArray = null;
                                                                                                                                                        if (n8 <= 0) break block31;
                                                                                                                                                        break block32;
                                                                                                                                                    }
                                                                                                                                                    if (class323.field3420 != class3232) break block33;
                                                                                                                                                    n10 = packetBuffer.readUnsignedShort();
                                                                                                                                                    n7 = packetBuffer.method10314();
                                                                                                                                                    n6 = (n7 >> 4 & 7) + AbstractWorldMapData.field3215;
                                                                                                                                                    n9 = (n7 & 7) + class360.field3857;
                                                                                                                                                    n5 = packetBuffer.readInt();
                                                                                                                                                    n4 = class30.field131.field1321;
                                                                                                                                                    if (0 > n6) return;
                                                                                                                                                    if (n6 >= 104) return;
                                                                                                                                                    if (0 > n9) return;
                                                                                                                                                    if (n9 >= 104) return;
                                                                                                                                                    if (Client.field767 != -1) break block34;
                                                                                                                                                    break block35;
                                                                                                                                                }
                                                                                                                                                if (class323.field3429 == class3232) {
                                                                                                                                                    n10 = packetBuffer.readUnsignedByte();
                                                                                                                                                    n7 = packetBuffer.method10312();
                                                                                                                                                    n6 = (n7 >> 4 & 7) + AbstractWorldMapData.field3215;
                                                                                                                                                    n9 = (n7 & 7) + class360.field3857;
                                                                                                                                                    n5 = packetBuffer.readUnsignedShort();
                                                                                                                                                    n4 = packetBuffer.method10312();
                                                                                                                                                    int n55 = packetBuffer.method10312();
                                                                                                                                                    int n56 = packetBuffer.method10341() & 0x1F;
                                                                                                                                                    if (n6 < 0) return;
                                                                                                                                                    if (n9 < 0) return;
                                                                                                                                                    if (n6 >= class30.field131.field1322) return;
                                                                                                                                                    if (n9 >= class30.field131.field1323) return;
                                                                                                                                                    int n57 = n56 + 1;
                                                                                                                                                    if (ModeWhere.localPlayer.field1266[0] < n6 - n57) return;
                                                                                                                                                    if (ModeWhere.localPlayer.field1266[0] > n6 + n57) return;
                                                                                                                                                    if (ModeWhere.localPlayer.field1221[0] < n9 - n57) return;
                                                                                                                                                    if (ModeWhere.localPlayer.field1221[0] > n9 + n57) return;
                                                                                                                                                    if (class544.clientPreferences.method2900() == 0) return;
                                                                                                                                                    if (n4 <= 0) return;
                                                                                                                                                    if (Client.soundEffectCount >= 50) return;
                                                                                                                                                    Client.soundEffectIds[Client.soundEffectCount] = n5;
                                                                                                                                                    Client.soundEffects[Client.soundEffectCount] = null;
                                                                                                                                                    Client.soundLocations[Client.soundEffectCount] = n56 + (n9 << 8) + (n6 << 16);
                                                                                                                                                    Client.queuedSoundEffectLoops[Client.soundEffectCount] = n4;
                                                                                                                                                    Client.queuedSoundEffectDelays[Client.soundEffectCount] = n55;
                                                                                                                                                    Client.field753[Client.soundEffectCount] = n10;
                                                                                                                                                    ++Client.soundEffectCount;
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                                if (class323.field3419 != class3232) break block36;
                                                                                                                                                n10 = packetBuffer.method10312();
                                                                                                                                                n7 = (n10 >> 4 & 7) + AbstractWorldMapData.field3215;
                                                                                                                                                n6 = (n10 & 7) + class360.field3857;
                                                                                                                                                n9 = packetBuffer.method10341();
                                                                                                                                                n5 = packetBuffer.method10458();
                                                                                                                                                n4 = packetBuffer.method10341();
                                                                                                                                                n40 = n4 >> 2;
                                                                                                                                                n39 = n4 & 3;
                                                                                                                                                n38 = Client.field578[n40];
                                                                                                                                                if (n7 < 0) return;
                                                                                                                                                if (n6 < 0) return;
                                                                                                                                                if (n7 >= class30.field131.field1322) return;
                                                                                                                                                if (n6 >= class30.field131.field1323) return;
                                                                                                                                                if (Client.field767 != -1) break block37;
                                                                                                                                                break block38;
                                                                                                                                            }
                                                                                                                                            if (class323.field3421 != class3232) break block39;
                                                                                                                                            n10 = packetBuffer.method10312();
                                                                                                                                            n7 = packetBuffer.method10323();
                                                                                                                                            n6 = packetBuffer.method10387();
                                                                                                                                            if (packetBuffer.method10312() != 1) break block40;
                                                                                                                                            break block41;
                                                                                                                                        }
                                                                                                                                        if (class323.field3422 == class3232) {
                                                                                                                                            n10 = packetBuffer.method10315();
                                                                                                                                            n7 = packetBuffer.method10334();
                                                                                                                                            n6 = packetBuffer.method10315();
                                                                                                                                            n9 = packetBuffer.readUnsignedShort();
                                                                                                                                            n5 = packetBuffer.method10316();
                                                                                                                                            n4 = packetBuffer.method10314();
                                                                                                                                            n50 = (n4 >> 4 & 7) + AbstractWorldMapData.field3215;
                                                                                                                                            n49 = (n4 & 7) + class360.field3857;
                                                                                                                                            n48 = packetBuffer.method10334();
                                                                                                                                            n47 = packetBuffer.readUnsignedShort();
                                                                                                                                            n46 = packetBuffer.readByte();
                                                                                                                                            n45 = packetBuffer.readUnsignedByte();
                                                                                                                                            n44 = n45 >> 2;
                                                                                                                                            n43 = n45 & 3;
                                                                                                                                            n42 = Client.field578[n44];
                                                                                                                                            Player player = n7 == Client.field623 ? ModeWhere.localPlayer : class30.field131.field1329[n7];
                                                                                                                                            if (player != null) {
                                                                                                                                                int n58 = Client.field767 == -1 ? class30.field131.field1321 : Client.field767;
                                                                                                                                                class384.method7652(n58, n50, n49, n44, n43, n42, n9, n47, n48, n5, n46, n6, n10, player);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        if (class323.field3428 != class3232) return;
                                                                                                                                        n10 = packetBuffer.method10341() * 4;
                                                                                                                                        n7 = packetBuffer.readUnsignedByte();
                                                                                                                                        n6 = packetBuffer.readUnsignedShort();
                                                                                                                                        n9 = packetBuffer.method10330();
                                                                                                                                        n5 = packetBuffer.readUnsignedByte() * 4;
                                                                                                                                        n4 = packetBuffer.readUnsignedByte();
                                                                                                                                        n50 = (n4 >> 4 & 7) + AbstractWorldMapData.field3215;
                                                                                                                                        n49 = (n4 & 7) + class360.field3857;
                                                                                                                                        n48 = packetBuffer.method10316();
                                                                                                                                        n47 = packetBuffer.method10458();
                                                                                                                                        n46 = packetBuffer.method10334();
                                                                                                                                        n45 = packetBuffer.method10334();
                                                                                                                                        n44 = packetBuffer.readByte();
                                                                                                                                        n43 = packetBuffer.method10330();
                                                                                                                                        n48 += n50;
                                                                                                                                        n44 += n49;
                                                                                                                                        if (n50 < 0) return;
                                                                                                                                        if (n49 < 0) return;
                                                                                                                                        if (n50 >= class30.field131.field1322) return;
                                                                                                                                        if (n49 >= class30.field131.field1323) return;
                                                                                                                                        if (n48 < 0) return;
                                                                                                                                        if (n44 < 0) return;
                                                                                                                                        if (n48 >= class30.field131.field1322) return;
                                                                                                                                        if (n44 >= class30.field131.field1323) return;
                                                                                                                                        if (n47 == 65535) return;
                                                                                                                                        n42 = Client.field767 == -1 ? class30.field131.field1321 : Client.field767;
                                                                                                                                        UserComparator7.method3332(n42, n50, n49, n48, n44, n9, n47, n5, n10, n45, n46, n7, n6, n43);
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    n41 = 1;
                                                                                                                                    break block42;
                                                                                                                                }
                                                                                                                                n41 = 0;
                                                                                                                            }
                                                                                                                            n9 = n41;
                                                                                                                            n5 = packetBuffer.readUnsignedShort();
                                                                                                                            n4 = packetBuffer.readUnsignedShort();
                                                                                                                            int n59 = packetBuffer.method10312();
                                                                                                                            int n60 = packetBuffer.method10314();
                                                                                                                            int n61 = (n60 >> 4 & 7) + AbstractWorldMapData.field3215;
                                                                                                                            int n62 = (n60 & 7) + class360.field3857;
                                                                                                                            if (n61 < 0) return;
                                                                                                                            if (n62 < 0) return;
                                                                                                                            if (n61 >= class30.field131.field1322) return;
                                                                                                                            if (n62 >= class30.field131.field1323) return;
                                                                                                                            int n63 = Client.field767 == -1 ? class30.field131.field1321 : Client.field767;
                                                                                                                            InvDefinition.method5109(n63, n61, n62, n4, n6, n10, n7, n5, n59, n9 != 0);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        n37 = class30.field131.field1321;
                                                                                                                        break block43;
                                                                                                                    }
                                                                                                                    n37 = Client.field767;
                                                                                                                }
                                                                                                                int n64 = n37;
                                                                                                                Varcs.method3211(class30.field131, n64, n7, n6, n38, n5, n40, n39, n9, null, 0, -1);
                                                                                                                return;
                                                                                                            }
                                                                                                            n36 = n4;
                                                                                                            break block44;
                                                                                                        }
                                                                                                        n36 = Client.field767;
                                                                                                    }
                                                                                                    int n65 = n36;
                                                                                                    class103.method2997(n65, n6, n9, n10, n5);
                                                                                                    return;
                                                                                                }
                                                                                                stringArray = new String[5];
                                                                                                break block45;
                                                                                            }
                                                                                            n35 = class30.field131.field1321;
                                                                                            break block46;
                                                                                        }
                                                                                        n35 = Client.field767;
                                                                                    }
                                                                                    int n66 = n35;
                                                                                    Login.method2450(n66, n9, n5, n4, n7, n10);
                                                                                    return;
                                                                                }
                                                                                n33 = class30.field131.field1321;
                                                                                break block47;
                                                                            }
                                                                            n33 = Client.field767;
                                                                        }
                                                                        int n67 = n33;
                                                                        Varcs.method3211(class30.field131, n67, n7, n6, n34, -1, n5, n4, 31, null, 0, -1);
                                                                        return;
                                                                    }
                                                                    n32 = class30.field131.field1321;
                                                                    break block48;
                                                                }
                                                                n32 = Client.field767;
                                                            }
                                                            n4 = n32;
                                                            class323.method6617(n4, n6, n9, n10, n5);
                                                            return;
                                                        }
                                                        n24 = class30.field131.field1321;
                                                        break block49;
                                                    }
                                                    n24 = Client.field767;
                                                }
                                                int n68 = n24;
                                                class482.method9366(n68, n30, n29, n27, n31, s, n26, s2, n25, n28);
                                                return;
                                            }
                                            n17 = class30.field131.field1321;
                                            break block50;
                                        }
                                        n17 = Client.field767;
                                    }
                                    int n69 = n17;
                                    PendingSpawn pendingSpawn = BuddyRankComparator.method3365(class30.field131, n69, n20, n19, n21);
                                    if (pendingSpawn != null) {
                                        ObjectComposition objectComposition = class142.getObjectDefinition(pendingSpawn.field1192);
                                        if (objectComposition.field2840) {
                                            pendingSpawn.field1189 = n18;
                                            return;
                                        }
                                    }
                                    if (bl = class323.method6619(n69, n20, n19, n23, n22, n21, n18)) {
                                        return;
                                    }
                                    if (pendingSpawn == null) return;
                                    pendingSpawn.field1189 = n18;
                                    return;
                                }
                                n11 = class30.field131.field1321;
                                break block51;
                            }
                            n11 = Client.field767;
                        }
                        int n70 = n11;
                        GraphicsObject graphicsObject = new GraphicsObject(n16, n70, n14, n13, Canvas.method337(class30.field131, n14, n13, n70) - n15, n12, Client.cycle);
                        class30.field131.field1339.addFirst(graphicsObject);
                        return;
                    }
                    while (tileItem != null) {
                        if ((n10 & Short.MAX_VALUE) == tileItem.id) {
                            tileItem.method3101(n7);
                            break;
                        }
                        tileItem = (TileItem)nodeDeque.previous();
                    }
                }
                if (n9 < 0) return;
                if (n5 < 0) return;
                if (n9 >= class30.field131.field1322) return;
                if (n5 >= class30.field131.field1323) return;
                int n71 = Client.field767 == -1 ? class30.field131.field1321 : Client.field767;
                class10.method92(n71, n9, n5, n10, n7);
                return;
            }
            for (n2 = 0; n2 < n8; ++n2) {
                n = packetBuffer.method10312();
                String string = packetBuffer.readStringCp1252NullTerminated();
                if (n < 0 || n >= 5) continue;
                stringArray[n] = string;
            }
        }
        n2 = packetBuffer.method10341();
        n = packetBuffer.readUnsignedShort();
        if (n7 < 0) return;
        if (n6 < 0) return;
        if (n7 >= class30.field131.field1322) return;
        if (n6 >= class30.field131.field1323) return;
        int n72 = Client.field767 == -1 ? class30.field131.field1321 : Client.field767;
        Varcs.method3211(class30.field131, n72, n7, n6, n3, n, n5, n4, n2, stringArray, 0, -1);
    }
}

