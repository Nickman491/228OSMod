package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Date;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fi")
public class class140
implements class130 {
    @ObfuscatedName(value="do")
    @ObfuscatedSignature(descriptor="[Lvi;")
    static class569[] field1628;
    @ObfuscatedName(value="kr")
    @ObfuscatedSignature(descriptor="[Lvf;")
    static class570[] field1626;

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)Ljava/io/File;", garbageValue="7")
    static File method3502(String string) {
        if (!class218.field2396) {
            throw new RuntimeException("");
        }
        File file = (File)class218.field2398.get(string);
        if (file != null) {
            return file;
        }
        File file2 = new File(class218.field2397, string);
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
            class218.field2398.put(string, file2);
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
        class556 class5562 = new class556(byArray);
        int n3 = -1;
        int n4;
        block0: while ((n4 = class5562.method10297()) != 0) {
            n3 += n4;
            int n5 = 0;
            while (true) {
                int n6;
                if ((n6 = class5562.method10407()) == 0) continue block0;
                int n7 = (n5 += n6 - 1) & 0x3F;
                int n8 = n5 >> 6 & 0x3F;
                int n9 = n5 >> 12;
                int n10 = class5562.method10282();
                int n11 = n10 >> 2;
                int n12 = n10 & 3;
                int n13 = n8 + n;
                int n14 = n2 + n7;
                if (n13 <= 0 || n14 <= 0 || n13 >= class1032.field1328[0].length - 2 || n14 >= class1032.field1328[0][0].length - 2) continue;
                int n15 = n9;
                if ((class1032.field1337[1][n13][n14] & 2) == 2) {
                    --n15;
                }
                class270 class2702 = null;
                if (n15 >= 0 && class1032.field1336 != null) {
                    class2702 = class1032.field1336[n15];
                }
                class301.method6435(class1032, n9, n13, n14, n3, n12, n11, class2702);
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
    static int method3501(int n, class81 class812, boolean bl) {
        if (n != 4100) {
            if (n != 4101) {
                if (n != 4102) {
                    if (n != 4103) {
                        if (n != 4104) {
                            if (n != 4105) {
                                if (n != 4106) {
                                    if (n != 4107) {
                                        if (n != 4108) {
                                            if (n != 4109) {
                                                if (n != 4110) {
                                                    if (n != 4111) {
                                                        if (n != 4112) {
                                                            if (n != 4113) {
                                                                if (n != 4114) {
                                                                    if (n != 4115) {
                                                                        if (n != 4116) {
                                                                            String string;
                                                                            if (n != 4117) {
                                                                                if (n != 4118) {
                                                                                    if (n != 4119) {
                                                                                        if (n != 4120) {
                                                                                            if (n != 4121) {
                                                                                                if (n != 4122) {
                                                                                                    if (n != 4123) {
                                                                                                        if (n != 4124) {
                                                                                                            return 2;
                                                                                                        }
                                                                                                        class72.field865[++class63.field444 - 1] = class407.field4693.field1121 != null ? class407.field4693.field1121.field3811 : -1;
                                                                                                        return 1;
                                                                                                    }
                                                                                                    String string2 = class72.field855[class104.field1343 -= 3];
                                                                                                    String string3 = class72.field855[class104.field1343 + 1];
                                                                                                    String string4 = class72.field855[class104.field1343 + 2];
                                                                                                    if (class407.field4693.field1121 != null) {
                                                                                                        switch (class407.field4693.field1121.field3811) {
                                                                                                            case 0: {
                                                                                                                class72.field855[++class104.field1343 - 1] = string2;
                                                                                                                break;
                                                                                                            }
                                                                                                            default: {
                                                                                                                class72.field855[++class104.field1343 - 1] = string4;
                                                                                                                break;
                                                                                                            }
                                                                                                            case 1: {
                                                                                                                class72.field855[++class104.field1343 - 1] = string3;
                                                                                                            }
                                                                                                        }
                                                                                                        return 1;
                                                                                                    }
                                                                                                    class72.field855[++class104.field1343 - 1] = string4;
                                                                                                    return 1;
                                                                                                }
                                                                                                String string5 = class72.field855[--class104.field1343];
                                                                                                class72.field855[++class104.field1343 - 1] = string5.toUpperCase();
                                                                                                return 1;
                                                                                            }
                                                                                            String string6 = class72.field855[class104.field1343 -= 2];
                                                                                            String string7 = class72.field855[class104.field1343 + 1];
                                                                                            int n2 = class72.field865[--class63.field444];
                                                                                            class72.field865[++class63.field444 - 1] = string6.indexOf(string7, n2);
                                                                                            return 1;
                                                                                        }
                                                                                        String string8 = class72.field855[--class104.field1343];
                                                                                        int n3 = class72.field865[--class63.field444];
                                                                                        class72.field865[++class63.field444 - 1] = string8.indexOf(n3);
                                                                                        return 1;
                                                                                    }
                                                                                    String string9 = class72.field855[--class104.field1343];
                                                                                    StringBuilder stringBuilder = new StringBuilder(string9.length());
                                                                                    boolean bl2 = false;
                                                                                    int n4 = 0;
                                                                                    while (true) {
                                                                                        if (n4 >= string9.length()) {
                                                                                            class72.field855[++class104.field1343 - 1] = stringBuilder.toString();
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
                                                                                String string10 = class72.field855[--class104.field1343];
                                                                                int n5 = class72.field865[class63.field444 -= 2];
                                                                                int n6 = class72.field865[class63.field444 + 1];
                                                                                class72.field855[++class104.field1343 - 1] = string10.substring(n5, n6);
                                                                                return 1;
                                                                            }
                                                                            class72.field865[++class63.field444 - 1] = (string = class72.field855[--class104.field1343]) != null ? string.length() : 0;
                                                                            return 1;
                                                                        }
                                                                        int n7 = class72.field865[--class63.field444];
                                                                        class72.field865[++class63.field444 - 1] = class363.method7571((char)n7) ? 1 : 0;
                                                                        return 1;
                                                                    }
                                                                    int n8 = class72.field865[--class63.field444];
                                                                    class72.field865[++class63.field444 - 1] = class167.method3815((char)n8) ? 1 : 0;
                                                                    return 1;
                                                                }
                                                                int n9 = class72.field865[--class63.field444];
                                                                class72.field865[++class63.field444 - 1] = class274.method5930((char)n9) ? 1 : 0;
                                                                return 1;
                                                            }
                                                            int n10 = class72.field865[--class63.field444];
                                                            class72.field865[++class63.field444 - 1] = class573.method10903((char)n10) ? 1 : 0;
                                                            return 1;
                                                        }
                                                        String string = class72.field855[--class104.field1343];
                                                        int n11 = class72.field865[--class63.field444];
                                                        class72.field855[++class104.field1343 - 1] = string + (char)n11;
                                                        return 1;
                                                    }
                                                    String string = class72.field855[--class104.field1343];
                                                    class72.field855[++class104.field1343 - 1] = class439.method8700(string);
                                                    return 1;
                                                }
                                                String string = class72.field855[class104.field1343 -= 2];
                                                String string11 = class72.field855[class104.field1343 + 1];
                                                class72.field855[++class104.field1343 - 1] = class72.field865[--class63.field444] == 1 ? string : string11;
                                                return 1;
                                            }
                                            String string = class72.field855[--class104.field1343];
                                            int n12 = class72.field865[class63.field444 -= 2];
                                            int n13 = class72.field865[class63.field444 + 1];
                                            byte[] byArray = class220.field2408.method7790(n13, 0);
                                            class435 class4352 = new class435(byArray);
                                            class72.field865[++class63.field444 - 1] = class4352.method8731(string, n12);
                                            return 1;
                                        }
                                        String string = class72.field855[--class104.field1343];
                                        int n14 = class72.field865[class63.field444 -= 2];
                                        int n15 = class72.field865[class63.field444 + 1];
                                        byte[] byArray = class220.field2408.method7790(n15, 0);
                                        class435 class4353 = new class435(byArray);
                                        class72.field865[++class63.field444 - 1] = class4353.method8680(string, n14);
                                        return 1;
                                    }
                                    class72.field865[++class63.field444 - 1] = class166.method3809(class211.method4838(class72.field855[class104.field1343 -= 2], class72.field855[class104.field1343 + 1], class63.field446));
                                    return 1;
                                }
                                int n16 = class72.field865[--class63.field444];
                                class72.field855[++class104.field1343 - 1] = Integer.toString(n16);
                                return 1;
                            }
                            String string = class72.field855[class104.field1343 -= 2];
                            String string12 = class72.field855[class104.field1343 + 1];
                            class72.field855[++class104.field1343 - 1] = class407.field4693.field1121 != null && class407.field4693.field1121.field3813 != 0 ? string12 : string;
                            return 1;
                        }
                        int n17 = class72.field865[--class63.field444];
                        long l = (11745L + (long)n17) * 86400000L;
                        class72.field859.setTime(new Date(l));
                        int n18 = class72.field859.get(5);
                        int n19 = class72.field859.get(2);
                        int n20 = class72.field859.get(1);
                        class72.field855[++class104.field1343 - 1] = n18 + "-" + class72.field860[n19] + "-" + n20;
                        return 1;
                    }
                    String string = class72.field855[--class104.field1343];
                    class72.field855[++class104.field1343 - 1] = string.toLowerCase();
                    return 1;
                }
                String string = class72.field855[--class104.field1343];
                int n21 = class72.field865[--class63.field444];
                class72.field855[++class104.field1343 - 1] = string + class385.method7659(n21, true);
                return 1;
            }
            String string = class72.field855[class104.field1343 -= 2];
            String string13 = class72.field855[class104.field1343 + 1];
            class72.field855[++class104.field1343 - 1] = string + string13;
            return 1;
        }
        String string = class72.field855[--class104.field1343];
        int n22 = class72.field865[--class63.field444];
        class72.field855[++class104.field1343 - 1] = string + n22;
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

