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
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName(value="ex")
@Implements(value="HealthBar")
public class HealthBar
extends Node {
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-899894429)
    @Export(value="Interpreter_stringStackSize")
    static int Interpreter_stringStackSize;
    @ObfuscatedName(value="og")
    @ObfuscatedSignature(descriptor="Lna;")
    static Widget field1346;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Ljc;")
    @Export(value="definition")
    HealthBarDefinition definition;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lps;")
    @Export(value="updates")
    IterableNodeDeque updates = new IterableNodeDeque();

    @ObfuscatedSignature(descriptor="(Ljc;)V")
    HealthBar(HealthBarDefinition healthBarDefinition) {
        this.definition = healthBarDefinition;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIIII)V", garbageValue="-1002957734")
    @Export(value="put")
    void put(int n, int n2, int n3, int n4) {
        HealthBarUpdate healthBarUpdate = null;
        int n5 = 0;
        HealthBarUpdate healthBarUpdate2 = (HealthBarUpdate)this.updates.last();
        while (true) {
            if (healthBarUpdate2 == null) {
                if (healthBarUpdate != null) {
                    IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(n, n2, n3, n4), healthBarUpdate);
                    if (n5 >= 4) {
                        this.updates.last().remove();
                    }
                    return;
                }
                if (n5 < 4) {
                    this.updates.addLast(new HealthBarUpdate(n, n2, n3, n4));
                }
                return;
            }
            ++n5;
            if (healthBarUpdate2.cycle == n) break;
            if (healthBarUpdate2.cycle <= n) {
                healthBarUpdate = healthBarUpdate2;
            }
            healthBarUpdate2 = (HealthBarUpdate)this.updates.previous();
        }
        healthBarUpdate2.set(n, n2, n3, n4);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Ldp;", garbageValue="-66124549")
    @Export(value="get")
    HealthBarUpdate get(int n) {
        HealthBarUpdate healthBarUpdate = (HealthBarUpdate)this.updates.last();
        if (healthBarUpdate != null && healthBarUpdate.cycle <= n) {
            HealthBarUpdate healthBarUpdate2 = (HealthBarUpdate)this.updates.previous();
            while (true) {
                if (healthBarUpdate2 == null || healthBarUpdate2.cycle > n) {
                    if (this.definition.int5 + healthBarUpdate.cycle + healthBarUpdate.cycleOffset > n) {
                        return healthBarUpdate;
                    }
                    healthBarUpdate.remove();
                    return null;
                }
                healthBarUpdate.remove();
                healthBarUpdate = healthBarUpdate2;
                healthBarUpdate2 = (HealthBarUpdate)this.updates.previous();
            }
        }
        return null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1961180597")
    @Export(value="isEmpty")
    boolean isEmpty() {
        return this.updates.method8050();
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/io/File;ZB)Z", garbageValue="48")
    static boolean method3008(File file, boolean bl) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            int n = randomAccessFile.read();
            randomAccessFile.seek(0L);
            randomAccessFile.write(n);
            randomAccessFile.seek(0L);
            randomAccessFile.close();
            if (bl) {
                file.delete();
            }
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="1139670283")
    static int method3000(int n, Script script, boolean bl) {
        block74: {
            block75: {
                block76: {
                    int n2;
                    block94: {
                        block96: {
                            block99: {
                                int n3;
                                class92 class922;
                                class93 class932;
                                block98: {
                                    block97: {
                                        block95: {
                                            block93: {
                                                block77: {
                                                    int n4;
                                                    block87: {
                                                        block89: {
                                                            block92: {
                                                                int n5;
                                                                class92 class923;
                                                                class93 class933;
                                                                block91: {
                                                                    block90: {
                                                                        block88: {
                                                                            block86: {
                                                                                block78: {
                                                                                    block79: {
                                                                                        block80: {
                                                                                            block81: {
                                                                                                int n6;
                                                                                                block83: {
                                                                                                    block85: {
                                                                                                        int n7;
                                                                                                        int n8;
                                                                                                        class92 class924;
                                                                                                        class93 class934;
                                                                                                        block84: {
                                                                                                            block82: {
                                                                                                                if (n == ScriptOpcodes.SOUND_SYNTH) break block74;
                                                                                                                if (n == ScriptOpcodes.SOUND_SONG) break block75;
                                                                                                                if (n == ScriptOpcodes.SOUND_JINGLE) break block76;
                                                                                                                if (n == 3212 || n == 3213 || n == 3209 || n == 3181 || n == 3203 || n == 3205 || n == 3207) break block77;
                                                                                                                if (n == 3214 || n == 3215 || n == 3210 || n == 3182 || n == 3204 || n == 3206 || n == 3208) break block78;
                                                                                                                if (n == 3211) break block79;
                                                                                                                if (n == 3216) break block80;
                                                                                                                if (n == 3218) break block81;
                                                                                                                if (n != 3217 && n != 3219) {
                                                                                                                    if (n != 3220) {
                                                                                                                        if (n != 3221) {
                                                                                                                            if (n != 3222) {
                                                                                                                                return 2;
                                                                                                                            }
                                                                                                                            int n9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 4];
                                                                                                                            int n10 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                                                                                                            int n11 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
                                                                                                                            int n12 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3];
                                                                                                                            class309.method6539(n9, n10, n11, n12);
                                                                                                                            return 1;
                                                                                                                        }
                                                                                                                        int n13 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 6];
                                                                                                                        int n14 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                                                                                                        int n15 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
                                                                                                                        int n16 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3];
                                                                                                                        int n17 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 4];
                                                                                                                        int n18 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 5];
                                                                                                                        ArrayList<Integer> arrayList = new ArrayList<Integer>();
                                                                                                                        arrayList.add(n13);
                                                                                                                        arrayList.add(n14);
                                                                                                                        class420.method8237(arrayList, n15, n16, n17, n18);
                                                                                                                        return 1;
                                                                                                                    }
                                                                                                                    int n19 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                                                                                                                    int n20 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                                                                                                    UserComparator3.method3347(n19, n20);
                                                                                                                    return 1;
                                                                                                                }
                                                                                                                class934 = class93.field1110;
                                                                                                                class924 = class92.field1108;
                                                                                                                n8 = -1;
                                                                                                                n7 = -1;
                                                                                                                if (n != 3217) break block82;
                                                                                                                n6 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                                class934 = (class93)StructComposition.findEnumerated(class277.method5964(), n6);
                                                                                                                if (class934 == null) break block83;
                                                                                                            }
                                                                                                            if (n != 3219) break block84;
                                                                                                            n6 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                                            class924 = (class92)StructComposition.findEnumerated(Login.method2388(), n6);
                                                                                                            if (class924 == null) break block85;
                                                                                                        }
                                                                                                        if (class924 != class92.field1108) {
                                                                                                            switch (class924.field1107) {
                                                                                                                default: {
                                                                                                                    String string = String.format("Unkown game option: %s.", class924.toString());
                                                                                                                    throw new RuntimeException(string);
                                                                                                                }
                                                                                                                case 2: 
                                                                                                                case 3: 
                                                                                                                case 4: {
                                                                                                                    n8 = 0;
                                                                                                                    n7 = 100;
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 1: {
                                                                                                                    n8 = 0;
                                                                                                                    n7 = 1;
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            switch (class934.field1115) {
                                                                                                                case 1: 
                                                                                                                case 2: 
                                                                                                                case 3: {
                                                                                                                    n8 = 0;
                                                                                                                    n7 = 1;
                                                                                                                    break;
                                                                                                                }
                                                                                                                default: {
                                                                                                                    String string = String.format("Unkown device option: %s.", class934.toString());
                                                                                                                    throw new RuntimeException(string);
                                                                                                                }
                                                                                                                case 4: {
                                                                                                                    n8 = 0;
                                                                                                                    n7 = Integer.MAX_VALUE;
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 5: {
                                                                                                                    n8 = 0;
                                                                                                                    n7 = 100;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = n8;
                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = n7;
                                                                                                        return 1;
                                                                                                    }
                                                                                                    throw new RuntimeException(String.format("Unrecognized game option %d", n6));
                                                                                                }
                                                                                                throw new RuntimeException(String.format("Unrecognized device option %d", n6));
                                                                                            }
                                                                                            int n21 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                            int n22 = 0;
                                                                                            class92 class925 = (class92)StructComposition.findEnumerated(Login.method2388(), n21);
                                                                                            if (class925 != null) {
                                                                                                n22 = class925 != class92.field1108 ? 1 : 0;
                                                                                            }
                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = n22;
                                                                                            return 1;
                                                                                        }
                                                                                        int n23 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                        int n24 = 0;
                                                                                        class93 class935 = (class93)StructComposition.findEnumerated(class277.method5964(), n23);
                                                                                        if (class935 != null) {
                                                                                            n24 = class935 != class93.field1110 ? 1 : 0;
                                                                                        }
                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = n24;
                                                                                        return 1;
                                                                                    }
                                                                                    return 1;
                                                                                }
                                                                                class933 = class93.field1110;
                                                                                class923 = class92.field1108;
                                                                                n5 = 0;
                                                                                if (n != 3214) break block86;
                                                                                n4 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                class933 = (class93)StructComposition.findEnumerated(class277.method5964(), n4);
                                                                                if (class933 == null) break block87;
                                                                            }
                                                                            if (n != 3215) break block88;
                                                                            n4 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                            class923 = (class92)StructComposition.findEnumerated(Login.method2388(), n4);
                                                                            if (class923 == null) break block89;
                                                                        }
                                                                        if (n == 3210) break block90;
                                                                        if (n != 3182) {
                                                                            if (n != 3204) {
                                                                                if (n != 3206) {
                                                                                    if (n == 3208) {
                                                                                        class923 = class92.field1097;
                                                                                    }
                                                                                } else {
                                                                                    class923 = class92.field1100;
                                                                                }
                                                                            } else {
                                                                                class923 = class92.field1099;
                                                                            }
                                                                        } else {
                                                                            class933 = class93.field1114;
                                                                        }
                                                                        break block91;
                                                                    }
                                                                    n4 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                    class933 = (class93)StructComposition.findEnumerated(class277.method5964(), n4);
                                                                    if (class933 == null && (class923 = (class92)StructComposition.findEnumerated(Login.method2388(), n4)) == null) break block92;
                                                                }
                                                                if (class923 != class92.field1108) {
                                                                    switch (class923.field1107) {
                                                                        case 4: {
                                                                            n4 = class544.clientPreferences.method2900();
                                                                            n5 = Math.round((float)(n4 * 100) / 127.0f);
                                                                            break;
                                                                        }
                                                                        default: {
                                                                            String string = String.format("Unkown game option: %s.", class923.toString());
                                                                            throw new RuntimeException(string);
                                                                        }
                                                                        case 1: {
                                                                            n5 = class544.clientPreferences.method2890() ? 1 : 0;
                                                                            break;
                                                                        }
                                                                        case 2: {
                                                                            n4 = class544.clientPreferences.method2896();
                                                                            n5 = Math.round((float)(n4 * 100) / 255.0f);
                                                                            break;
                                                                        }
                                                                        case 3: {
                                                                            n4 = class544.clientPreferences.method2898();
                                                                            n5 = Math.round((float)(n4 * 100) / 127.0f);
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    switch (class933.field1115) {
                                                                        case 5: {
                                                                            n5 = SoundCache.method893();
                                                                            break;
                                                                        }
                                                                        case 3: {
                                                                            n5 = class544.clientPreferences.method2983() ? 1 : 0;
                                                                            break;
                                                                        }
                                                                        case 1: {
                                                                            n5 = class544.clientPreferences.method2974() ? 1 : 0;
                                                                            break;
                                                                        }
                                                                        case 4: {
                                                                            n5 = class544.clientPreferences.method2892();
                                                                            break;
                                                                        }
                                                                        default: {
                                                                            String string = String.format("Unkown device option: %s.", class933.toString());
                                                                            throw new RuntimeException(string);
                                                                        }
                                                                        case 2: {
                                                                            n5 = class544.clientPreferences.method2887() ? 1 : 0;
                                                                        }
                                                                    }
                                                                }
                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = n5;
                                                                return 1;
                                                            }
                                                            throw new RuntimeException(String.format("Unrecognized client option %d", n4));
                                                        }
                                                        throw new RuntimeException(String.format("Unrecognized game option %d", n4));
                                                    }
                                                    throw new RuntimeException(String.format("Unrecognized device option %d", n4));
                                                }
                                                class932 = class93.field1110;
                                                class922 = class92.field1108;
                                                n3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                if (n != 3212) break block93;
                                                n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                class932 = (class93)StructComposition.findEnumerated(class277.method5964(), n2);
                                                if (class932 == null) break block94;
                                            }
                                            if (n != 3213) break block95;
                                            n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                            class922 = (class92)StructComposition.findEnumerated(Login.method2388(), n2);
                                            if (class922 == null) break block96;
                                        }
                                        if (n == 3209) break block97;
                                        if (n != 3181) {
                                            if (n != 3203) {
                                                if (n != 3205) {
                                                    if (n == 3207) {
                                                        class922 = class92.field1097;
                                                    }
                                                } else {
                                                    class922 = class92.field1100;
                                                }
                                            } else {
                                                class922 = class92.field1099;
                                            }
                                        } else {
                                            class932 = class93.field1114;
                                        }
                                        break block98;
                                    }
                                    n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                    class932 = (class93)StructComposition.findEnumerated(class277.method5964(), n2);
                                    if (class932 == null && (class922 = (class92)StructComposition.findEnumerated(Login.method2388(), n2)) == null) break block99;
                                }
                                if (class922 != class92.field1108) {
                                    switch (class922.field1107) {
                                        case 4: {
                                            n3 = Math.min(Math.max(n3, 0), 100);
                                            n2 = Math.round((float)(n3 * 127) / 100.0f);
                                            class240.method5252(n2);
                                            break;
                                        }
                                        default: {
                                            String string = String.format("Unkown game option: %s.", class922.toString());
                                            throw new RuntimeException(string);
                                        }
                                        case 1: {
                                            class544.clientPreferences.method2921(n3 == 1);
                                            break;
                                        }
                                        case 3: {
                                            n3 = Math.min(Math.max(n3, 0), 100);
                                            n2 = Math.round((float)(n3 * 127) / 100.0f);
                                            ClanChannel.method3839(n2);
                                            break;
                                        }
                                        case 2: {
                                            n3 = Math.min(Math.max(n3, 0), 100);
                                            n2 = Math.round((float)(n3 * 255) / 100.0f);
                                            class149.method3578(n2);
                                            break;
                                        }
                                    }
                                } else {
                                    switch (class932.field1115) {
                                        default: {
                                            String string = String.format("Unkown device option: %s.", class932.toString());
                                            throw new RuntimeException(string);
                                        }
                                        case 5: {
                                            class140.method3504(n3);
                                            break;
                                        }
                                        case 4: {
                                            if (n3 < 0) {
                                                n3 = 0;
                                            }
                                            class544.clientPreferences.method2891(n3);
                                            break;
                                        }
                                        case 3: {
                                            class544.clientPreferences.method2899(n3 == 1);
                                            break;
                                        }
                                        case 2: {
                                            class544.clientPreferences.method2978(n3 == 1);
                                            break;
                                        }
                                        case 1: {
                                            class544.clientPreferences.method2884(n3 == 1);
                                        }
                                    }
                                }
                                return 1;
                            }
                            throw new RuntimeException(String.format("Unrecognized client option %d", n2));
                        }
                        throw new RuntimeException(String.format("Unrecognized game option %d", n2));
                    }
                    throw new RuntimeException(String.format("Unrecognized device option %d", n2));
                }
                class82.method2494(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2], Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
                return 1;
            }
            int n25 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 5];
            int n26 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
            int n27 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
            int n28 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3];
            int n29 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 4];
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            arrayList.add(n25);
            class420.method8237(arrayList, n26, n27, n28, n29);
            return 1;
        }
        class378.queueSoundEffect(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 3], Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2]);
        return 1;
    }

    @ObfuscatedName(value="gb")
    @ObfuscatedSignature(descriptor="(I)Lkc;", garbageValue="-1509113256")
    public static class269 method3010() {
        return Client.field731;
    }
}

