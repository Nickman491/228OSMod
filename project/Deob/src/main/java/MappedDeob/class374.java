/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName(value="or")
public class class374 {
    @ObfuscatedName(value="jb")
    static int[][] field4114;

    static {
        Math.sqrt(8192.0);
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="-1163631135")
    static final int method7622(int n, int n2) {
        int n3 = PcmPlayer.method804(n - 1, n2 - 1) + PcmPlayer.method804(n + 1, n2 - 1) + PcmPlayer.method804(n - 1, 1 + n2) + PcmPlayer.method804(n + 1, n2 + 1);
        int n4 = PcmPlayer.method804(n - 1, n2) + PcmPlayer.method804(n + 1, n2) + PcmPlayer.method804(n, n2 - 1) + PcmPlayer.method804(n, n2 + 1);
        int n5 = PcmPlayer.method804(n, n2);
        return n3 / 16 + n4 / 8 + n5 / 4;
    }

    @ObfuscatedName(value="bf")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-574847449")
    static int method7621(int n, Script script, boolean bl) {
        if (n != ScriptOpcodes.OC_NAME) {
            if (n != ScriptOpcodes.OC_OP) {
                if (n != ScriptOpcodes.OC_IOP) {
                    if (n != 4222) {
                        if (n != ScriptOpcodes.OC_COST) {
                            if (n != ScriptOpcodes.OC_STACKABLE) {
                                if (n != ScriptOpcodes.OC_CERT) {
                                    if (n != ScriptOpcodes.OC_UNCERT) {
                                        if (n != ScriptOpcodes.OC_MEMBERS) {
                                            if (n != ScriptOpcodes.OC_PLACEHOLDER) {
                                                if (n != ScriptOpcodes.OC_UNPLACEHOLDER) {
                                                    int n2;
                                                    if (n != ScriptOpcodes.OC_FIND) {
                                                        if (n != ScriptOpcodes.OC_FINDNEXT) {
                                                            if (n != ScriptOpcodes.OC_FINDRESET) {
                                                                int n3;
                                                                int n4;
                                                                if (n != 4213) {
                                                                    if (n != 4214) {
                                                                        if (n != 4215) {
                                                                            if (n != 4216) {
                                                                                if (n != 4217) {
                                                                                    if (n != 4218) {
                                                                                        return 2;
                                                                                    }
                                                                                    int n5 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = FaceNormal.ItemDefinition_get((int)n5).field2853;
                                                                                    return 1;
                                                                                }
                                                                                int n6 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                ItemComposition itemComposition = FaceNormal.ItemDefinition_get(n6);
                                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = itemComposition.field2896;
                                                                                return 1;
                                                                            }
                                                                            int n7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = FaceNormal.ItemDefinition_get((int)n7).field2878;
                                                                            return 1;
                                                                        }
                                                                        int n8 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = FaceNormal.ItemDefinition_get((int)n8).maleModel2;
                                                                        return 1;
                                                                    }
                                                                    int n9 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = FaceNormal.ItemDefinition_get((int)n9).maleModel1;
                                                                    return 1;
                                                                }
                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (n4 = FaceNormal.ItemDefinition_get(n3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]).getShiftClickIndex()) != -1 ? n4 + 1 : n4;
                                                                return 1;
                                                            }
                                                            class271.foundItemIndex = 0;
                                                            return 1;
                                                        }
                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapSection1.foundItemIds != null && class271.foundItemIndex < class20.foundItemIdCount ? WorldMapSection1.foundItemIds[++class271.foundItemIndex - 1] & 0xFFFF : -1;
                                                        return 1;
                                                    }
                                                    String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                                    class360.findItemDefinitions(string, (n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]) == 1);
                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class20.foundItemIdCount;
                                                    return 1;
                                                }
                                                int n10 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                ItemComposition itemComposition = FaceNormal.ItemDefinition_get(n10);
                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = itemComposition.placeholderTemplate >= 0 && itemComposition.placeholder >= 0 ? itemComposition.placeholder : n10;
                                                return 1;
                                            }
                                            int n11 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                            ItemComposition itemComposition = FaceNormal.ItemDefinition_get(n11);
                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = itemComposition.placeholderTemplate == -1 && itemComposition.placeholder >= 0 ? itemComposition.placeholder : n11;
                                            return 1;
                                        }
                                        int n12 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = FaceNormal.ItemDefinition_get((int)n12).isMembersOnly ? 1 : 0;
                                        return 1;
                                    }
                                    int n13 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                    ItemComposition itemComposition = FaceNormal.ItemDefinition_get(n13);
                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = itemComposition.noteTemplate >= 0 && itemComposition.note >= 0 ? itemComposition.note : n13;
                                    return 1;
                                }
                                int n14 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                ItemComposition itemComposition = FaceNormal.ItemDefinition_get(n14);
                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = itemComposition.noteTemplate == -1 && itemComposition.note >= 0 ? itemComposition.note : n14;
                                return 1;
                            }
                            int n15 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = FaceNormal.ItemDefinition_get((int)n15).isStackable == 1 ? 1 : 0;
                            return 1;
                        }
                        int n16 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = FaceNormal.ItemDefinition_get((int)n16).maleModel;
                        return 1;
                    }
                    int n17 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 3];
                    int n18 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                    int n19 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
                    ItemComposition itemComposition = FaceNormal.ItemDefinition_get(n17);
                    String string = null;
                    if (n18 >= 1 && n18 <= 5 && itemComposition.inventoryActions[n18 - 1] != null && itemComposition.field2872 != null && itemComposition.field2872[n18 - 1] != null && n19 >= 1 && n19 <= itemComposition.field2872[n18 - 1].length) {
                        string = itemComposition.field2872[n18 - 1][n19 - 1];
                    }
                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = string != null ? string : "";
                    return 1;
                }
                int n20 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                int n21 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                ItemComposition itemComposition = FaceNormal.ItemDefinition_get(n20);
                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = n21 >= 1 && n21 <= 5 && itemComposition.inventoryActions[n21 - 1] != null ? itemComposition.inventoryActions[n21 - 1] : "";
                return 1;
            }
            int n22 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
            int n23 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
            ItemComposition itemComposition = FaceNormal.ItemDefinition_get(n22);
            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = n23 >= 1 && n23 <= 5 && itemComposition.groundActions[n23 - 1] != null ? itemComposition.groundActions[n23 - 1] : "";
            return 1;
        }
        int n24 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = FaceNormal.ItemDefinition_get((int)n24).name;
        return 1;
    }

    @ObfuscatedName(value="hk")
    @ObfuscatedSignature(descriptor="(IIIB)V", garbageValue="-38")
    static final void method7623(int n, int n2, int n3) {
        if (Buddy.cameraX < n && (Buddy.cameraX = (n - Buddy.cameraX) * class544.field5398 / 1000 + Buddy.cameraX + WorldMapSectionType.field3187) > n) {
            Buddy.cameraX = n;
        }
        if (Buddy.cameraX > n && (Buddy.cameraX -= (Buddy.cameraX - n) * class544.field5398 / 1000 + WorldMapSectionType.field3187) < n) {
            Buddy.cameraX = n;
        }
        if (Message.cameraY < n2 && (Message.cameraY = (n2 - Message.cameraY) * class544.field5398 / 1000 + Message.cameraY + WorldMapSectionType.field3187) > n2) {
            Message.cameraY = n2;
        }
        if (Message.cameraY > n2 && (Message.cameraY -= (Message.cameraY - n2) * class544.field5398 / 1000 + WorldMapSectionType.field3187) < n2) {
            Message.cameraY = n2;
        }
        if (class31.cameraZ < n3 && (class31.cameraZ = (n3 - class31.cameraZ) * class544.field5398 / 1000 + class31.cameraZ + WorldMapSectionType.field3187) > n3) {
            class31.cameraZ = n3;
        }
        if (class31.cameraZ > n3 && (class31.cameraZ -= (class31.cameraZ - n3) * class544.field5398 / 1000 + WorldMapSectionType.field3187) < n3) {
            class31.cameraZ = n3;
        }
    }
}

