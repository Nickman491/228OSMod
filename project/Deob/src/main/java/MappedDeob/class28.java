/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bw")
public class class28 {
    @ObfuscatedName(value="cu")
    static String field121;
    @ObfuscatedName(value="dl")
    @Export(value="KeyHandler_keyCodes")
    static int[] KeyHandler_keyCodes;

    static {
        KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Lve;", garbageValue="226734916")
    public static DbRowType method463(int n) {
        DbRowType dbRowType = (DbRowType)DbRowType.field5416.get(n);
        if (dbRowType != null) {
            return dbRowType;
        }
        byte[] byArray = DbRowType.field5417.takeFile(38, n);
        dbRowType = new DbRowType();
        if (byArray != null) {
            dbRowType.method10170(new Buffer(byArray));
        }
        dbRowType.method10172();
        DbRowType.field5416.put(dbRowType, n);
        return dbRowType;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Ldz;Lvy;IIIIIII)V", garbageValue="1236041058")
    static final void method454(class103 class1032, Buffer buffer, int n, int n2, int n3, int n4, int n5, int n6) {
        block13: {
            int[][][] nArray = class1032.field1328;
            byte[][][] byArray = class1032.field1337;
            if (n >= 0 && n < 4 && n2 >= 0 && n2 < nArray[0].length - 1 && n3 >= 0 && n3 < nArray[0][0].length - 1) {
                int n7;
                byArray[n][n2][n3] = 0;
                while ((n7 = buffer.readUnsignedShort()) != 0) {
                    if (n7 != 1) {
                        if (n7 > 49) {
                            if (n7 > 81) {
                                SecureRandomCallable.Tiles_underlays[n][n2][n3] = (short)(n7 - 81);
                                continue;
                            }
                            byArray[n][n2][n3] = (byte)(n7 - 49);
                            continue;
                        }
                        SecureRandomFuture.Tiles_overlays[n][n2][n3] = (short)buffer.readShort();
                        Tiles.Tiles_shapes[n][n2][n3] = (byte)((n7 - 2) / 4);
                        Tiles.field1026[n][n2][n3] = (byte)(n7 - 2 + n6 & 3);
                        continue;
                    }
                    int n8 = buffer.readUnsignedByte();
                    if (n8 == 1) {
                        n8 = 0;
                    }
                    if (n == 0) {
                        nArray[0][n2][n3] = -n8 * 8;
                    } else {
                        nArray[n][n2][n3] = nArray[n - 1][n2][n3] - n8 * 8;
                    }
                    break block13;
                }
                if (n == 0) {
                    nArray[0][n2][n3] = -class28.method461(n4 + 932731, n5 + 556238) * 8;
                } else {
                    nArray[n][n2][n3] = nArray[n - 1][n2][n3] - 240;
                }
            } else {
                int n9;
                while ((n9 = buffer.readUnsignedShort()) != 0) {
                    if (n9 != 1) {
                        if (n9 > 49) continue;
                        buffer.readShort();
                        continue;
                    }
                    buffer.readUnsignedByte();
                    break;
                }
            }
        }
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(IIB)I", garbageValue="93")
    static final int method461(int n, int n2) {
        int n3 = class75.method2359(n + 45365, n2 + 91923, 4) - 128 + (class75.method2359(n + 10294, n2 + 37821, 2) - 128 >> 1) + (class75.method2359(n, n2, 1) - 128 >> 2);
        if ((n3 = (int)(0.3 * (double)n3) + 35) < 10) {
            n3 = 10;
        } else if (n3 > 60) {
            n3 = 60;
        }
        return n3;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(IIII)I", garbageValue="533909516")
    static final int method462(int n, int n2, int n3) {
        if (n3 > 179) {
            n2 /= 2;
        }
        if (n3 > 192) {
            n2 /= 2;
        }
        if (n3 > 217) {
            n2 /= 2;
        }
        if (n3 > 243) {
            n2 /= 2;
        }
        int n4 = (n2 / 32 << 7) + (n / 4 << 10) + n3 / 2;
        return n4;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1237364530")
    static void method460() {
        Varcs.method3212(24);
        class150.setLoginResponseString("", "You were disconnected from the server.", "");
    }

    @ObfuscatedName(value="cn")
    @ObfuscatedSignature(descriptor="(ILdm;ZB)I", garbageValue="6")
    static int method459(int n, Script script, boolean bl) {
        if (n != 7900) {
            if (n != 7901) {
                return 2;
            }
            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.field794;
            return 1;
        }
        int n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
        Client.field794 = Math.max(n2, 0);
        return 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="lo")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Lna;B)Ljava/lang/String;", garbageValue="8")
    static String method458(String string, Widget widget) {
        if (string.indexOf("%") == -1) return string;
        int n = 1;
        block0: while (n <= 5) {
            while (true) {
                int n2;
                if ((n2 = string.indexOf("%" + n)) == -1) {
                    ++n;
                    continue block0;
                }
                string = string.substring(0, n2) + class429.method8471(SequenceDefinition.method5725(widget, n - 1)) + string.substring(n2 + 2);
            }
            break;
        }
        return string;
    }
}

