/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName(value="fi")
public class class140
implements class130 {
    @ObfuscatedName(value="do")
    @ObfuscatedSignature(descriptor="[Lvi;")
    @Export(value="worldSelectStars")
    static IndexedSprite[] worldSelectStars;
    @ObfuscatedName(value="kr")
    @ObfuscatedSignature(descriptor="[Lvf;")
    static SpritePixels[] field1626;

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)Ljava/io/File;", garbageValue="7")
    @Export(value="getFile")
    static File getFile(String string) {
        if (!FileSystem.FileSystem_hasPermissions) {
            throw new RuntimeException("");
        }
        File file = (File)FileSystem.FileSystem_cacheFiles.get(string);
        if (file != null) {
            return file;
        }
        File file2 = new File(FileSystem.FileSystem_cacheDir, string);
        RandomAccessFile randomAccessFile = null;
        try {
            File file3 = new File(file2.getParent());
            if (!file3.exists()) {
                throw new RuntimeException("");
            }
            randomAccessFile = new RandomAccessFile(file2, "rw");
            int n = randomAccessFile.read();
            randomAccessFile.seek(0L);
            randomAccessFile.write(n);
            randomAccessFile.seek(0L);
            randomAccessFile.close();
            FileSystem.FileSystem_cacheFiles.put(string, file2);
            return file2;
        }
        catch (Exception exception) {
            try {
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                    randomAccessFile = null;
                }
            }
            catch (Exception exception2) {
                // empty catch block
            }
            throw new RuntimeException();
        }
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Ldz;[BIIB)V", garbageValue="-95")
    static final void method3503(class103 class1032, byte[] byArray, int n, int n2) {
        Buffer buffer = new Buffer(byArray);
        int n3 = -1;
        int n4;
        block0: while ((n4 = buffer.method10297()) != 0) {
            n3 += n4;
            int n5 = 0;
            while (true) {
                int n6;
                if ((n6 = buffer.readUShortSmart()) == 0) continue block0;
                int n7 = (n5 += n6 - 1) & 0x3F;
                int n8 = n5 >> 6 & 0x3F;
                int n9 = n5 >> 12;
                int n10 = buffer.readUnsignedByte();
                int n11 = n10 >> 2;
                int n12 = n10 & 3;
                int n13 = n8 + n;
                int n14 = n2 + n7;
                if (n13 <= 0 || n14 <= 0 || n13 >= class1032.field1328[0].length - 2 || n14 >= class1032.field1328[0][0].length - 2) continue;
                int n15 = n9;
                if ((class1032.field1337[1][n13][n14] & 2) == 2) {
                    --n15;
                }
                CollisionMap collisionMap = null;
                if (n15 >= 0 && class1032.field1336 != null) {
                    collisionMap = class1032.field1336[n15];
                }
                WorldMapSection1.method6435(class1032, n9, n13, n14, n3, n12, n11, collisionMap);
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="546395833")
    static final int method3505(int n, int n2) {
        if (n == -1) {
            return 12345678;
        }
        if ((n2 = (n & 0x7F) * n2 / 128) < 2) {
            n2 = 2;
        } else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }

    @ObfuscatedName(value="bt")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="1156609576")
    static int method3501(int n, Script script, boolean bl) {
        if (n != ScriptOpcodes.APPEND_NUM) {
            if (n != ScriptOpcodes.APPEND) {
                if (n != ScriptOpcodes.APPEND_SIGNNUM) {
                    if (n != ScriptOpcodes.LOWERCASE) {
                        if (n != ScriptOpcodes.FROMDATE) {
                            if (n != ScriptOpcodes.TEXT_GENDER) {
                                if (n != ScriptOpcodes.TOSTRING) {
                                    if (n != ScriptOpcodes.COMPARE) {
                                        if (n != ScriptOpcodes.PARAHEIGHT) {
                                            if (n != ScriptOpcodes.PARAWIDTH) {
                                                if (n != ScriptOpcodes.TEXT_SWITCH) {
                                                    if (n != ScriptOpcodes.ESCAPE) {
                                                        if (n != ScriptOpcodes.APPEND_CHAR) {
                                                            if (n != ScriptOpcodes.CHAR_ISPRINTABLE) {
                                                                if (n != ScriptOpcodes.CHAR_ISALPHANUMERIC) {
                                                                    if (n != ScriptOpcodes.CHAR_ISALPHA) {
                                                                        if (n != ScriptOpcodes.CHAR_ISNUMERIC) {
                                                                            String string;
                                                                            if (n != ScriptOpcodes.STRING_LENGTH) {
                                                                                if (n != ScriptOpcodes.SUBSTRING) {
                                                                                    if (n != ScriptOpcodes.REMOVETAGS) {
                                                                                        if (n != ScriptOpcodes.STRING_INDEXOF_CHAR) {
                                                                                            if (n != ScriptOpcodes.STRING_INDEXOF_STRING) {
                                                                                                if (n != 4122) {
                                                                                                    if (n != 4123) {
                                                                                                        if (n != 4124) {
                                                                                                            return 2;
                                                                                                        }
                                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = ModeWhere.localPlayer.appearance != null ? ModeWhere.localPlayer.appearance.field3811 : -1;
                                                                                                        return 1;
                                                                                                    }
                                                                                                    String string2 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize -= 3];
                                                                                                    String string3 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1];
                                                                                                    String string4 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 2];
                                                                                                    if (ModeWhere.localPlayer.appearance != null) {
                                                                                                        switch (ModeWhere.localPlayer.appearance.field3811) {
                                                                                                            case 0: {
                                                                                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = string2;
                                                                                                                break;
                                                                                                            }
                                                                                                            default: {
                                                                                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = string4;
                                                                                                                break;
                                                                                                            }
                                                                                                            case 1: {
                                                                                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = string3;
                                                                                                            }
                                                                                                        }
                                                                                                        return 1;
                                                                                                    }
                                                                                                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = string4;
                                                                                                    return 1;
                                                                                                }
                                                                                                String string5 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                                                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = string5.toUpperCase();
                                                                                                return 1;
                                                                                            }
                                                                                            String string6 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize -= 2];
                                                                                            String string7 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1];
                                                                                            int n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = string6.indexOf(string7, n2);
                                                                                            return 1;
                                                                                        }
                                                                                        String string8 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                                                                        int n3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = string8.indexOf(n3);
                                                                                        return 1;
                                                                                    }
                                                                                    String string9 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                                                                    StringBuilder stringBuilder = new StringBuilder(string9.length());
                                                                                    boolean bl2 = false;
                                                                                    int n4 = 0;
                                                                                    while (true) {
                                                                                        if (n4 >= string9.length()) {
                                                                                            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = stringBuilder.toString();
                                                                                            return 1;
                                                                                        }
                                                                                        char c = string9.charAt(n4);
                                                                                        if (c == '<') {
                                                                                            bl2 = true;
                                                                                        } else if (c == '>') {
                                                                                            bl2 = false;
                                                                                        } else if (!bl2) {
                                                                                            stringBuilder.append(c);
                                                                                        }
                                                                                        ++n4;
                                                                                    }
                                                                                }
                                                                                String string10 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                                                                int n5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                                                                                int n6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = string10.substring(n5, n6);
                                                                                return 1;
                                                                            }
                                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]) != null ? string.length() : 0;
                                                                            return 1;
                                                                        }
                                                                        int n7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Huffman.isDigit((char)n7) ? 1 : 0;
                                                                        return 1;
                                                                    }
                                                                    int n8 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class167.isCharAlphabetic((char)n8) ? 1 : 0;
                                                                    return 1;
                                                                }
                                                                int n9 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class274.isAlphaNumeric((char)n9) ? 1 : 0;
                                                                return 1;
                                                            }
                                                            int n10 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = IsaacCipher.isCharPrintable((char)n10) ? 1 : 0;
                                                            return 1;
                                                        }
                                                        String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                                        int n11 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = string + (char)n11;
                                                        return 1;
                                                    }
                                                    String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(string);
                                                    return 1;
                                                }
                                                String string = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize -= 2];
                                                String string11 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1];
                                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1 ? string : string11;
                                                return 1;
                                            }
                                            String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                            int n12 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                                            int n13 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                            byte[] byArray = class220.archive13.takeFile(n13, 0);
                                            Font font = new Font(byArray);
                                            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = font.lineWidth(string, n12);
                                            return 1;
                                        }
                                        String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                                        int n14 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
                                        int n15 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
                                        byte[] byArray = class220.archive13.takeFile(n15, 0);
                                        Font font = new Font(byArray);
                                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = font.lineCount(string, n14);
                                        return 1;
                                    }
                                    Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class166.method3809(class211.compareStrings(Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize -= 2], Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1], ScriptFrame.clientLanguage));
                                    return 1;
                                }
                                int n16 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = Integer.toString(n16);
                                return 1;
                            }
                            String string = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize -= 2];
                            String string12 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1];
                            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ModeWhere.localPlayer.appearance != null && ModeWhere.localPlayer.appearance.gender != 0 ? string12 : string;
                            return 1;
                        }
                        int n17 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                        long l = (11745L + (long)n17) * 86400000L;
                        Interpreter.Interpreter_calendar.setTime(new Date(l));
                        int n18 = Interpreter.Interpreter_calendar.get(5);
                        int n19 = Interpreter.Interpreter_calendar.get(2);
                        int n20 = Interpreter.Interpreter_calendar.get(1);
                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = n18 + "-" + Interpreter.Interpreter_MONTHS[n19] + "-" + n20;
                        return 1;
                    }
                    String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                    Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = string.toLowerCase();
                    return 1;
                }
                String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
                int n21 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = string + PlayerType.intToString(n21, true);
                return 1;
            }
            String string = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize -= 2];
            String string13 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1];
            Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = string + string13;
            return 1;
        }
        String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
        int n22 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = string + n22;
        return 1;
    }

    @ObfuscatedName(value="mj")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-95")
    static final void method3504(int n) {
        n = Math.max(Math.min(n, 100), 0);
        n = 100 - n;
        float f = 0.5f + (float)n / 200.0f;
        class33.method522(f);
    }
}

