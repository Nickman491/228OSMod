package old228;/*
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

@ObfuscatedName(value="tz")
public class class515
implements class517 {
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Lqw;")
    static class435 field5179;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=725544721)
    int field5176;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=694410193)
    int field5182;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=158239803)
    int field5180;

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Ltp;", garbageValue="-2112494538")
    public class516 vmethod9665() {
        String string;
        String string2;
        int n = class57.field379.startsWith("win") ? 1 : (class57.field379.startsWith("mac") ? 2 : (class57.field379.startsWith("linux") ? 3 : 4));
        try {
            string2 = System.getProperty("os.arch").toLowerCase();
        }
        catch (Exception exception) {
            string2 = "";
        }
        try {
            string = System.getProperty("os.version").toLowerCase();
        }
        catch (Exception exception) {
            string = "";
        }
        String string3 = "Unknown";
        String string4 = "1.1";
        try {
            string3 = System.getProperty("java.vendor");
            string4 = System.getProperty("java.version");
        }
        catch (Exception exception) {
            // empty catch block
        }
        boolean bl = string2.startsWith("amd64") || string2.startsWith("x86_64");
        int n2 = 0;
        if (n == 1) {
            if (string.indexOf("4.0") != -1) {
                n2 = 1;
            } else if (string.indexOf("4.1") != -1) {
                n2 = 2;
            } else if (string.indexOf("4.9") != -1) {
                n2 = 3;
            } else if (string.indexOf("5.0") != -1) {
                n2 = 4;
            } else if (string.indexOf("5.1") != -1) {
                n2 = 5;
            } else if (string.indexOf("5.2") != -1) {
                n2 = 8;
            } else if (string.indexOf("6.0") != -1) {
                n2 = 6;
            } else if (string.indexOf("6.1") != -1) {
                n2 = 7;
            } else if (string.indexOf("6.2") != -1) {
                n2 = 9;
            } else if (string.indexOf("6.3") != -1) {
                n2 = 10;
            } else if (string.indexOf("10.0") != -1) {
                n2 = 11;
            }
        } else if (n == 2) {
            if (string.indexOf("10.4") != -1) {
                n2 = 20;
            } else if (string.indexOf("10.5") != -1) {
                n2 = 21;
            } else if (string.indexOf("10.6") != -1) {
                n2 = 22;
            } else if (string.indexOf("10.7") != -1) {
                n2 = 23;
            } else if (string.indexOf("10.8") != -1) {
                n2 = 24;
            } else if (string.indexOf("10.9") != -1) {
                n2 = 25;
            } else if (string.indexOf("10.10") != -1) {
                n2 = 26;
            } else if (string.indexOf("10.11") != -1) {
                n2 = 27;
            } else if (string.indexOf("10.12") != -1) {
                n2 = 28;
            } else if (string.indexOf("10.13") != -1) {
                n2 = 29;
            }
        }
        int n3 = string3.toLowerCase().indexOf("sun") != -1 ? 1 : (string3.toLowerCase().indexOf("microsoft") != -1 ? 2 : (string3.toLowerCase().indexOf("apple") != -1 ? 3 : (string3.toLowerCase().indexOf("oracle") != -1 ? 5 : 4)));
        this.method9632(string4);
        boolean bl2 = false;
        int n4 = (int)(Runtime.getRuntime().maxMemory() / 0x100000L) + 1;
        int n5 = this.field5176 > 3 ? Runtime.getRuntime().availableProcessors() : 0;
        int n6 = 0;
        String string5 = "";
        String string6 = "";
        String string7 = "";
        String string8 = "";
        String string9 = "";
        String string10 = "";
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        int[] nArray = new int[3];
        boolean bl7 = false;
        String string11 = "";
        String string12 = "";
        String string13 = "";
        boolean bl8 = false;
        return new class516(n, bl, n2, n3, this.field5176, this.field5182, this.field5180, false, n4, n5, n6, 0, string5, string6, string7, string8, 0, 0, 0, 0, string9, string10, nArray, 0, "", "", string13);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="0")
    void method9632(String string) {
        if (!string.startsWith("1.")) {
            this.method9639(string);
        } else {
            this.method9633(string);
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-606608940")
    void method9633(String string) {
        String[] stringArray = string.split("\\.");
        try {
            this.field5176 = Integer.parseInt(stringArray[1]);
            stringArray = stringArray[2].split("_");
            this.field5182 = Integer.parseInt(stringArray[0]);
            this.field5180 = Integer.parseInt(stringArray[1]);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-2073261161")
    void method9639(String string) {
        String[] stringArray = string.split("\\.");
        try {
            this.field5176 = Integer.parseInt(stringArray[0]);
            this.field5182 = Integer.parseInt(stringArray[1]);
            this.field5180 = Integer.parseInt(stringArray[2]);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="([I[IIII)V", garbageValue="-773819736")
    public static void method9651(int[] nArray, int[] nArray2, int n, int n2) {
        if (n >= n2) return;
        int n3 = (n2 + n) / 2;
        int n4 = n;
        int n5 = nArray[n3];
        nArray[n3] = nArray[n2];
        nArray[n2] = n5;
        int n6 = nArray2[n3];
        nArray2[n3] = nArray2[n2];
        nArray2[n2] = n6;
        int n7 = n5 == Integer.MAX_VALUE ? 0 : 1;
        int n8 = n;
        while (true) {
            if (n8 >= n2) {
                nArray[n2] = nArray[n4];
                nArray[n4] = n5;
                nArray2[n2] = nArray2[n4];
                nArray2[n4] = n6;
                class515.method9651(nArray, nArray2, n, n4 - 1);
                class515.method9651(nArray, nArray2, n4 + 1, n2);
                return;
            }
            if (nArray[n8] < (n8 & n7) + n5) {
                int n9 = nArray[n8];
                nArray[n8] = nArray[n4];
                nArray[n4] = n9;
                int n10 = nArray2[n8];
                nArray2[n8] = nArray2[n4];
                nArray2[n4++] = n10;
            }
            ++n8;
        }
    }
}

