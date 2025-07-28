package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="qc")
public abstract class class439
extends class566 {
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="[Lvi;")
    public static class569[] field4835;
    @ObfuscatedName(value="aq")
    static int field4825;
    @ObfuscatedName(value="af")
    static int field4838;
    @ObfuscatedName(value="aa")
    static int field4839;
    @ObfuscatedName(value="ak")
    static int field4840;
    @ObfuscatedName(value="al")
    static int field4841;
    @ObfuscatedName(value="av")
    static int field4842;
    @ObfuscatedName(value="ag")
    static int field4843;
    @ObfuscatedName(value="aw")
    static int field4844;
    @ObfuscatedName(value="ai")
    static int field4834;
    @ObfuscatedName(value="ar")
    static Random field4845;
    @ObfuscatedName(value="am")
    static String[] field4826;
    @ObfuscatedName(value="ah")
    byte[][] field4829 = new byte[256][];
    @ObfuscatedName(value="az")
    int[] field4827;
    @ObfuscatedName(value="ao")
    int[] field4828;
    @ObfuscatedName(value="ad")
    int[] field4833;
    @ObfuscatedName(value="an")
    int[] field4837;
    @ObfuscatedName(value="ae")
    int[] field4831;
    @ObfuscatedName(value="ax")
    public int field4832 = 0;
    @ObfuscatedName(value="at")
    public int field4847;
    @ObfuscatedName(value="ac")
    public int field4846;
    @ObfuscatedName(value="as")
    byte[] field4836;

    static {
        field4825 = -1;
        field4838 = -1;
        field4839 = -1;
        field4840 = -1;
        field4841 = 0;
        field4842 = 0;
        field4843 = 256;
        field4844 = 0;
        field4834 = 0;
        field4845 = new Random();
        field4826 = new String[100];
    }

    class439(byte[] byArray) {
        this.method8675(byArray);
    }

    class439(byte[] byArray, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, byte[][] byArray2) {
        this.field4837 = nArray;
        this.field4831 = nArray2;
        this.field4828 = nArray3;
        this.field4833 = nArray4;
        this.method8675(byArray);
        this.field4829 = byArray2;
        int n = Integer.MAX_VALUE;
        int n2 = Integer.MIN_VALUE;
        int n3 = 0;
        while (true) {
            if (n3 >= 256) {
                this.field4847 = this.field4832 - n;
                this.field4846 = n2 - this.field4832;
                return;
            }
            if (this.field4831[n3] < n && this.field4833[n3] != 0) {
                n = this.field4831[n3];
            }
            if (this.field4831[n3] + this.field4833[n3] > n2) {
                n2 = this.field4831[n3] + this.field4833[n3];
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="ay")
    abstract void vmethod8706(byte[] var1, int var2, int var3, int var4, int var5, int var6);

    @ObfuscatedName(value="ah")
    abstract void vmethod8704(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

    @ObfuscatedName(value="ax")
    void method8675(byte[] byArray) {
        block15: {
            this.field4827 = new int[256];
            if (byArray.length != 257) {
                int n;
                int n2 = 0;
                for (int i = 0; i < 256; ++i) {
                    this.field4827[i] = byArray[n2++] & 0xFF;
                }
                int[] nArray = new int[256];
                int[] nArray2 = new int[256];
                for (n = 0; n < 256; ++n) {
                    nArray[n] = byArray[n2++] & 0xFF;
                }
                for (n = 0; n < 256; ++n) {
                    nArray2[n] = byArray[n2++] & 0xFF;
                }
                byte[][] byArrayArray = new byte[256][];
                int n3 = 0;
                while (true) {
                    int n4;
                    int n5;
                    if (n3 >= 256) {
                        byte[][] byArrayArray2 = new byte[256][];
                        n5 = 0;
                        while (true) {
                            if (n5 >= 256) {
                                this.field4836 = new byte[65536];
                                n5 = 0;
                                while (true) {
                                    if (n5 >= 256) {
                                        this.field4832 = nArray2[32] + nArray[32];
                                        break block15;
                                    }
                                    if (n5 != 32 && n5 != 160) {
                                        for (n4 = 0; n4 < 256; ++n4) {
                                            if (n4 == 32 || n4 == 160) continue;
                                            this.field4836[n4 + (n5 << 8)] = (byte)class439.method8676(byArrayArray, byArrayArray2, nArray2, this.field4827, nArray, n5, n4);
                                        }
                                    }
                                    ++n5;
                                }
                            }
                            byArrayArray2[n5] = new byte[nArray[n5]];
                            n4 = 0;
                            for (int i = 0; i < byArrayArray2[n5].length; ++i) {
                                byArrayArray2[n5][i] = n4 = (int)((byte)(n4 + byArray[n2++]));
                            }
                            ++n5;
                        }
                    }
                    byArrayArray[n3] = new byte[nArray[n3]];
                    n5 = 0;
                    for (n4 = 0; n4 < byArrayArray[n3].length; ++n4) {
                        byArrayArray[n3][n4] = n5 = (int)((byte)(n5 + byArray[n2++]));
                    }
                    ++n3;
                }
            }
            for (int i = 0; i < this.field4827.length; ++i) {
                this.field4827[i] = byArray[i] & 0xFF;
            }
            this.field4832 = byArray[256] & 0xFF;
        }
    }

    @ObfuscatedName(value="ac")
    public int method8677(char c) {
        if (c == '\u00a0') {
            c = (char)32;
        }
        return this.field4827[class232.method5132(c) & 0xFF];
    }

    @ObfuscatedName(value="au")
    public int method8682(String string) {
        if (string == null) {
            return 0;
        }
        int n = -1;
        int n2 = -1;
        int n3 = 0;
        for (int i = 0; i < string.length(); ++i) {
            int n4 = string.charAt(i);
            if (n4 == 60) {
                n = i;
                continue;
            }
            if (n4 == 62 && n != -1) {
                String string2 = string.substring(n + 1, i);
                n = -1;
                if (string2.equals("lt")) {
                    n4 = 60;
                } else if (string2.equals("gt")) {
                    n4 = 62;
                } else {
                    if (!string2.startsWith("img=")) continue;
                    try {
                        int n5 = class278.method5972(string2.substring(4));
                        n3 += class439.field4835[n5].field5561;
                        n2 = -1;
                    }
                    catch (Exception exception) {}
                    continue;
                }
            }
            if (n4 == 160) {
                n4 = 32;
            }
            if (n != -1) continue;
            n3 += this.field4827[(char)(class232.method5132((char)n4) & 0xFF)];
            if (this.field4836 != null && n2 != -1) {
                n3 += this.field4836[n4 + (n2 << 8)];
            }
            n2 = n4;
        }
        return n3;
    }

    @ObfuscatedName(value="as")
    public int method8678(String string, int[] nArray, String[] stringArray) {
        if (string == null) {
            return 0;
        }
        int n = 0;
        int n2 = 0;
        StringBuilder stringBuilder = new StringBuilder(100);
        int n3 = -1;
        int n4 = 0;
        int n5 = 0;
        int n6 = -1;
        int n7 = 0;
        int n8 = 0;
        int n9 = string.length();
        for (int i = 0; i < n9; ++i) {
            int n10 = string.charAt(i);
            if (n10 == 60) {
                n6 = i;
                continue;
            }
            if (n10 == 62 && n6 != -1) {
                String string2 = string.substring(n6 + 1, i);
                n6 = -1;
                stringBuilder.append('<');
                stringBuilder.append(string2);
                stringBuilder.append('>');
                if (string2.equals("br")) {
                    stringArray[n8++] = stringBuilder.substring(n2);
                    stringBuilder.setLength(0);
                    n2 = 0;
                    n = 0;
                    n3 = -1;
                    n7 = 0;
                } else if (string2.equals("lt")) {
                    n += this.method8677('<');
                    if (this.field4836 != null && n7 != -1) {
                        n += this.field4836[(n7 << 8) + 60];
                    }
                    n7 = 60;
                } else if (string2.equals("gt")) {
                    n += this.method8677('>');
                    if (this.field4836 != null && n7 != -1) {
                        n += this.field4836[(n7 << 8) + 62];
                    }
                    n7 = 62;
                } else if (string2.startsWith("img=")) {
                    try {
                        int n11 = class278.method5972(string2.substring(4));
                        n += class439.field4835[n11].field5561;
                        n7 = 0;
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                n10 = 0;
            }
            if (n6 != -1) continue;
            if (n10 != 0) {
                stringBuilder.append((char)n10);
                n += this.method8677((char)n10);
                if (this.field4836 != null && n7 != -1) {
                    n += this.field4836[n10 + (n7 << 8)];
                }
                n7 = n10;
            }
            if (n10 == 32) {
                n3 = stringBuilder.length();
                n4 = n;
                n5 = 1;
            }
            if (nArray != null && n > nArray[n8 < nArray.length ? n8 : nArray.length - 1] && n3 >= 0) {
                stringArray[n8++] = stringBuilder.substring(n2, n3 - n5);
                n2 = n3;
                n3 = -1;
                n -= n4;
                n7 = 0;
            }
            if (n10 != 45) continue;
            n3 = stringBuilder.length();
            n4 = n;
            n5 = 0;
        }
        if (stringBuilder.length() > n2) {
            stringArray[n8++] = stringBuilder.substring(n2);
        }
        return n8;
    }

    @ObfuscatedName(value="aq")
    public int method8731(String string, int n) {
        int n2 = this.method8678(string, new int[]{n}, field4826);
        int n3 = 0;
        int n4 = 0;
        while (n4 < n2) {
            int n5 = this.method8682(field4826[n4]);
            if (n5 > n3) {
                n3 = n5;
            }
            ++n4;
        }
        return n3;
    }

    @ObfuscatedName(value="af")
    public int method8680(String string, int n) {
        return this.method8678(string, new int[]{n}, field4826);
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(IILjava/lang/String;II)Lql;")
    public class423 method8709(int n, int n2, String string, int n3, int n4) {
        if (string != null && string.length() >= n2 + n) {
            int n5 = n3 - this.method8682(string) / 2;
            int n6 = n4 - this.field4847;
            int n7 = this.method8682(string.substring(n, n2 + n));
            int n8 = this.field4847 + this.field4846;
            return new class423(n5 += this.method8682(string.substring(0, n)), n6, n7, n8);
        }
        return new class423(n3, n4, 0, 0);
    }

    @ObfuscatedName(value="al")
    public void method8727(String string, int n, int n2, int n3, int n4) {
        if (string == null) {
            return;
        }
        this.method8698(n3, n4);
        this.method8701(string, n, n2);
    }

    @ObfuscatedName(value="av")
    public void method8684(String string, int n, int n2, int n3, int n4, int n5) {
        if (string == null) {
            return;
        }
        this.method8698(n3, n4);
        field4843 = n5;
        this.method8701(string, n, n2);
    }

    @ObfuscatedName(value="ag")
    public void method8685(String string, int n, int n2, int n3, int n4) {
        if (string == null) {
            return;
        }
        this.method8698(n3, n4);
        this.method8701(string, n - this.method8682(string), n2);
    }

    @ObfuscatedName(value="aw")
    public void method8679(String string, int n, int n2, int n3, int n4) {
        if (string == null) {
            return;
        }
        this.method8698(n3, n4);
        this.method8701(string, n - this.method8682(string) / 2, n2);
    }

    @ObfuscatedName(value="ai")
    public int method8687(String string, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        return this.method8699(string, n, n2, n3, n4, n5, n6, 256, n7, n8, n9);
    }

    @ObfuscatedName(value="ar")
    public int method8699(String string, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        int n11;
        int n12;
        if (string == null) {
            return 0;
        }
        if (n7 == 255) {
            n7 = 256;
        }
        this.method8698(n5, n6);
        field4843 = n7;
        if (n10 == 0) {
            n10 = this.field4832;
        }
        int[] nArray = new int[]{n3};
        if (n4 < n10 + this.field4847 + this.field4846 && n4 < n10 + n10) {
            nArray = null;
        }
        int n13 = this.method8678(string, nArray, field4826);
        if (n9 == 3 && n13 == 1) {
            n9 = 1;
        }
        if (n9 == 0) {
            n12 = n2 + this.field4847;
        } else if (n9 == 1) {
            n12 = n2 + this.field4847 + (n4 - this.field4847 - this.field4846 - n10 * (n13 - 1)) / 2;
        } else if (n9 == 2) {
            n12 = n2 + n4 - this.field4846 - n10 * (n13 - 1);
        } else {
            n11 = (n4 - this.field4847 - this.field4846 - n10 * (n13 - 1)) / (n13 + 1);
            if (n11 < 0) {
                n11 = 0;
            }
            n12 = n2 + n11 + this.field4847;
            n10 += n11;
        }
        n11 = 0;
        while (n11 < n13) {
            if (n8 == 0) {
                this.method8701(field4826[n11], n, n12);
            } else if (n8 == 1) {
                this.method8701(field4826[n11], n + (n3 - this.method8682(field4826[n11])) / 2, n12);
            } else if (n8 == 2) {
                this.method8701(field4826[n11], n + n3 - this.method8682(field4826[n11]), n12);
            } else if (n11 == n13 - 1) {
                this.method8701(field4826[n11], n, n12);
            } else {
                this.method8775(field4826[n11], n3);
                this.method8701(field4826[n11], n, n12);
                field4844 = 0;
            }
            n12 = n10 + n12;
            ++n11;
        }
        return n13;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(Lqk;IIIII)Lug;")
    public class527 method8689(class440 class4402, int n, int n2, int n3, int n4, int n5) {
        if (class4402.method8788()) return class4402.method8792();
        this.method8698(n3, n4);
        n2 -= this.field4832;
        int n6 = 0;
        while (n6 < class4402.method8808()) {
            class438 class4382 = class4402.method8786(n6);
            if (n5 != -1 && class4382.field4822 > n5) return new class527(class4382.field4821, class4382.field4822);
            int n7 = class4382.field4824;
            if (n7 != 10) {
                if (class4402.method8810(n6)) {
                    n7 = 42;
                }
                if (n7 != 9) {
                    if (n7 == 160) {
                        n7 = 32;
                    }
                    int n8 = n + class4382.field4821;
                    int n9 = n2 + class4382.field4822;
                    int n10 = this.field4828[n7];
                    int n11 = this.field4833[n7];
                    if (field4840 != -1) {
                        this.vmethod8706(this.field4829[n7], n8 + this.field4837[n7] + 1, n9 + this.field4831[n7] + 1, n10, n11, field4840);
                    }
                    this.vmethod8706(this.field4829[n7], n8 + this.field4837[n7], n9 + this.field4831[n7], n10, n11, field4842);
                }
            }
            ++n6;
        }
        return class4402.method8792();
    }

    @ObfuscatedName(value="ap")
    public void method8692(String string, int n, int n2, int n3, int n4, int n5, int[] nArray) {
        if (string == null) {
            return;
        }
        this.method8698(n3, n4);
        int[] nArray2 = null;
        if (nArray != null) {
            nArray2 = this.method8695(nArray, string.length());
        }
        int[] nArray3 = new int[string.length()];
        for (int i = 0; i < string.length(); ++i) {
            nArray3[i] = (int)(Math.sin((double)i / 2.0 + (double)n5 / 5.0) * 5.0);
        }
        this.method8702(string, n - this.method8682(string) / 2, n2, nArray2, null, nArray3);
    }

    @ObfuscatedName(value="ab")
    public void method8762(String string, int n, int n2, int n3, int n4, int n5, int[] nArray) {
        if (string == null) {
            return;
        }
        this.method8698(n3, n4);
        int[] nArray2 = null;
        if (nArray != null) {
            nArray2 = this.method8695(nArray, string.length());
        }
        int[] nArray3 = new int[string.length()];
        int[] nArray4 = new int[string.length()];
        int n6 = 0;
        while (true) {
            if (n6 >= string.length()) {
                this.method8702(string, n - this.method8682(string) / 2, n2, nArray2, nArray3, nArray4);
                return;
            }
            nArray3[n6] = (int)(Math.sin((double)n6 / 5.0 + (double)n5 / 5.0) * 5.0);
            nArray4[n6] = (int)(Math.sin((double)n6 / 3.0 + (double)n5 / 5.0) * 5.0);
            ++n6;
        }
    }

    @ObfuscatedName(value="aj")
    public void method8688(String string, int n, int n2, int n3, int n4, int n5, int n6, int[] nArray) {
        double d;
        if (string == null) {
            return;
        }
        this.method8698(n3, n4);
        int[] nArray2 = null;
        if (nArray != null) {
            nArray2 = this.method8695(nArray, string.length());
        }
        if ((d = 7.0 - (double)n6 / 8.0) < 0.0) {
            d = 0.0;
        }
        int[] nArray3 = new int[string.length()];
        for (int i = 0; i < string.length(); ++i) {
            nArray3[i] = (int)(Math.sin((double)i / 1.5 + (double)n5 / 1.0) * d);
        }
        this.method8702(string, n - this.method8682(string) / 2, n2, nArray2, null, nArray3);
    }

    @ObfuscatedName(value="bu")
    public void method8776(String string, int n, int n2, int n3, int n4, int[] nArray) {
        if (string == null) {
            return;
        }
        this.method8698(n3, n4);
        int[] nArray2 = null;
        if (nArray != null) {
            nArray2 = this.method8695(nArray, string.length());
        }
        this.method8702(string, n - this.method8682(string) / 2, n2, nArray2, null, null);
    }

    @ObfuscatedName(value="bh")
    public void method8694(String string, int n, int n2, int n3, int n4, int[] nArray) {
        if (string == null) {
            return;
        }
        this.method8698(n3, n4);
        int[] nArray2 = null;
        if (nArray != null) {
            nArray2 = this.method8695(nArray, string.length());
        }
        this.method8702(string, n, n2, nArray2, null, null);
    }

    @ObfuscatedName(value="bw")
    int[] method8695(int[] nArray, int n) {
        if (n == 0) {
            return null;
        }
        int[] nArray2 = new int[n];
        float f = (float)nArray.length / (float)n;
        int n2 = 0;
        while (n2 < n) {
            nArray2[n2] = nArray[(int)((float)n2 * f)];
            ++n2;
        }
        return nArray2;
    }

    @ObfuscatedName(value="bb")
    public void method8697(String string, int n, int n2, int n3, int n4, int n5) {
        if (string == null) {
            return;
        }
        this.method8698(n3, n4);
        field4845.setSeed(n5);
        field4843 = 192 + (field4845.nextInt() & 0x1F);
        int[] nArray = new int[string.length()];
        int n6 = 0;
        int n7 = 0;
        while (true) {
            if (n7 >= string.length()) {
                this.method8702(string, n, n2, null, nArray, null);
                return;
            }
            nArray[n7] = n6++;
            if ((field4845.nextInt() & 3) == 0) {
                // empty if block
            }
            ++n7;
        }
    }

    @ObfuscatedName(value="bx")
    public void method8674(int n, int n2, int n3, int n4) {
        n3 -= this.field4832;
        int n5 = n & 0xFF;
        if (n5 != 32) {
            this.vmethod8706(this.field4829[n5], n2 + this.field4837[n5], n3 + this.field4831[n5], this.field4828[n5], this.field4833[n5], n4);
        }
    }

    @ObfuscatedName(value="bd")
    void method8698(int n, int n2) {
        field4825 = -1;
        field4838 = -1;
        field4840 = field4839 = n2;
        field4842 = field4841 = n;
        field4843 = 256;
        field4844 = 0;
        field4834 = 0;
    }

    @ObfuscatedName(value="bi")
    void method8740(String string) {
        try {
            if (string.startsWith("col=")) {
                field4842 = class63.method1232(string.substring(4), 16);
            } else if (string.equals("/col")) {
                field4842 = field4841;
            } else if (string.startsWith("str=")) {
                field4825 = class63.method1232(string.substring(4), 16);
            } else if (string.equals("str")) {
                field4825 = 0x800000;
            } else if (string.equals("/str")) {
                field4825 = -1;
            } else if (string.startsWith("u=")) {
                field4838 = class63.method1232(string.substring(2), 16);
            } else if (string.equals("u")) {
                field4838 = 0;
            } else if (string.equals("/u")) {
                field4838 = -1;
            } else if (string.startsWith("shad=")) {
                field4840 = class63.method1232(string.substring(5), 16);
            } else if (string.equals("shad")) {
                field4840 = 0;
            } else if (string.equals("/shad")) {
                field4840 = field4839;
            } else if (string.equals("br")) {
                this.method8698(field4841, field4839);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @ObfuscatedName(value="bz")
    void method8775(String string, int n) {
        int n2 = 0;
        boolean bl = false;
        int n3 = 0;
        while (true) {
            if (n3 >= string.length()) {
                if (n2 > 0) {
                    field4844 = (n - this.method8682(string) << 8) / n2;
                }
                return;
            }
            char c = string.charAt(n3);
            if (c == '<') {
                bl = true;
            } else if (c == '>') {
                bl = false;
            } else if (!bl && c == ' ') {
                ++n2;
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="bt")
    void method8701(String string, int n, int n2) {
        n2 -= this.field4832;
        int n3 = -1;
        int n4 = -1;
        for (int i = 0; i < string.length(); ++i) {
            int n5;
            if (string.charAt(i) == '\u0000') continue;
            int n6 = class232.method5132(string.charAt(i)) & 0xFF;
            if (n6 == 60) {
                n3 = i;
                continue;
            }
            if (n6 == 62 && n3 != -1) {
                String string2 = string.substring(n3 + 1, i);
                n3 = -1;
                if (string2.equals("lt")) {
                    n6 = 60;
                } else if (string2.equals("gt")) {
                    n6 = 62;
                } else {
                    if (string2.startsWith("img=")) {
                        try {
                            n5 = class278.method5972(string2.substring(4));
                            class569 class5692 = field4835[n5];
                            class5692.method10710(n, n2 + this.field4832 - class5692.field5568);
                            n += class5692.field5561;
                            n4 = -1;
                        }
                        catch (Exception exception) {}
                        continue;
                    }
                    this.method8740(string2);
                    continue;
                }
            }
            if (n6 == 160) {
                n6 = 32;
            }
            if (n3 != -1) continue;
            if (this.field4836 != null && n4 != -1) {
                n += this.field4836[n6 + (n4 << 8)];
            }
            int n7 = this.field4828[n6];
            n5 = this.field4833[n6];
            if (n6 != 32) {
                if (field4843 == 256) {
                    if (field4840 != -1) {
                        class439.method8705(this.field4829[n6], n + this.field4837[n6] + 1, n2 + this.field4831[n6] + 1, n7, n5, field4840);
                    }
                    this.vmethod8706(this.field4829[n6], n + this.field4837[n6], n2 + this.field4831[n6], n7, n5, field4842);
                } else {
                    if (field4840 != -1) {
                        class439.method8707(this.field4829[n6], n + this.field4837[n6] + 1, n2 + this.field4831[n6] + 1, n7, n5, field4840, field4843);
                    }
                    this.vmethod8704(this.field4829[n6], n + this.field4837[n6], n2 + this.field4831[n6], n7, n5, field4842, field4843);
                }
            } else if (field4844 > 0) {
                n = ((field4834 += field4844) >> 8) + n;
                field4834 &= 0xFF;
            }
            int n8 = this.field4827[n6];
            if (field4825 != -1) {
                class566.method10619(n, n2 + (int)((double)this.field4832 * 0.7), n8, field4825);
            }
            if (field4838 != -1) {
                class566.method10619(n, n2 + this.field4832 + 1, n8, field4838);
            }
            n = n8 + n;
            n4 = n6;
        }
    }

    @ObfuscatedName(value="bf")
    void method8702(String string, int n, int n2, int[] nArray, int[] nArray2, int[] nArray3) {
        n2 -= this.field4832;
        int n3 = -1;
        int n4 = -1;
        int n5 = 0;
        for (int i = 0; i < string.length(); ++i) {
            int n6;
            int n7;
            int n8;
            if (string.charAt(i) == '\u0000') continue;
            int n9 = class232.method5132(string.charAt(i)) & 0xFF;
            if (n9 == 60) {
                n3 = i;
                continue;
            }
            if (n9 == 62 && n3 != -1) {
                String string2 = string.substring(n3 + 1, i);
                n3 = -1;
                if (string2.equals("lt")) {
                    n9 = 60;
                } else if (string2.equals("gt")) {
                    n9 = 62;
                } else {
                    if (string2.startsWith("img=")) {
                        try {
                            n8 = nArray2 != null ? nArray2[n5] : 0;
                            n7 = nArray3 != null ? nArray3[n5] : 0;
                            ++n5;
                            n6 = class278.method5972(string2.substring(4));
                            class569 class5692 = field4835[n6];
                            class5692.method10710(n8 + n, n7 + (n2 + this.field4832 - class5692.field5568));
                            n += class5692.field5561;
                            n4 = -1;
                        }
                        catch (Exception exception) {}
                        continue;
                    }
                    this.method8740(string2);
                    continue;
                }
            }
            if (n9 == 160) {
                n9 = 32;
            }
            if (n3 != -1) continue;
            if (this.field4836 != null && n4 != -1) {
                n += this.field4836[n9 + (n4 << 8)];
            }
            int n10 = this.field4828[n9];
            n8 = this.field4833[n9];
            n7 = nArray2 != null ? nArray2[n5] : 0;
            n6 = nArray3 != null ? nArray3[n5] : 0;
            int n11 = nArray != null ? nArray[n5] : field4842;
            ++n5;
            if (n9 != 32) {
                if (field4843 == 256) {
                    if (field4840 != -1) {
                        class439.method8705(this.field4829[n9], n7 + n + this.field4837[n9] + 1, n2 + n6 + this.field4831[n9] + 1, n10, n8, field4840);
                    }
                    this.vmethod8706(this.field4829[n9], n7 + n + this.field4837[n9], n2 + n6 + this.field4831[n9], n10, n8, n11);
                } else {
                    if (field4840 != -1) {
                        class439.method8707(this.field4829[n9], n7 + n + this.field4837[n9] + 1, n2 + n6 + this.field4831[n9] + 1, n10, n8, field4840, field4843);
                    }
                    this.vmethod8704(this.field4829[n9], n7 + n + this.field4837[n9], n2 + n6 + this.field4831[n9], n10, n8, n11, field4843);
                }
            } else if (field4844 > 0) {
                n = ((field4834 += field4844) >> 8) + n;
                field4834 &= 0xFF;
            }
            int n12 = this.field4827[n9];
            if (field4825 != -1) {
                class566.method10619(n, n2 + (int)((double)this.field4832 * 0.7), n12, field4825);
            }
            if (field4838 != -1) {
                class566.method10619(n, n2 + this.field4832, n12, field4838);
            }
            n = n12 + n;
            n4 = n9;
        }
    }

    @ObfuscatedName(value="at")
    static int method8676(byte[][] byArray, byte[][] byArray2, int[] nArray, int[] nArray2, int[] nArray3, int n, int n2) {
        int n3;
        int n4 = nArray[n];
        int n5 = n4 + nArray3[n];
        int n6 = nArray[n2];
        int n7 = n6 + nArray3[n2];
        int n8 = n4;
        if (n6 > n4) {
            n8 = n6;
        }
        int n9 = n5;
        if (n7 < n5) {
            n9 = n7;
        }
        if (nArray2[n2] < (n3 = nArray2[n])) {
            n3 = nArray2[n2];
        }
        byte[] byArray3 = byArray2[n];
        byte[] byArray4 = byArray[n2];
        int n10 = n8 - n4;
        int n11 = n8 - n6;
        int n12 = n8;
        while (n12 < n9) {
            int n13 = byArray3[n10++] + byArray4[n11++];
            if (n13 < n3) {
                n3 = n13;
            }
            ++n12;
        }
        return -n3;
    }

    @ObfuscatedName(value="aa")
    public static String method8700(String string) {
        int n = string.length();
        int n2 = 0;
        int n3 = 0;
        while (true) {
            int n4;
            if (n3 >= n) {
                StringBuilder stringBuilder = new StringBuilder(n + n2);
                n4 = 0;
                while (true) {
                    if (n4 >= n) {
                        return stringBuilder.toString();
                    }
                    char c = string.charAt(n4);
                    if (c == '<') {
                        stringBuilder.append("<lt>");
                    } else if (c == '>') {
                        stringBuilder.append("<gt>");
                    } else {
                        stringBuilder.append(c);
                    }
                    ++n4;
                }
            }
            n4 = string.charAt(n3);
            if (n4 == 60 || n4 == 62) {
                n2 += 3;
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="by")
    static void method8705(byte[] byArray, int n, int n2, int n3, int n4, int n5) {
        int n6;
        int n7 = n + n2 * class566.field5542;
        int n8 = class566.field5542 - n3;
        int n9 = 0;
        int n10 = 0;
        if (n2 < class566.field5541) {
            n6 = class566.field5541 - n2;
            n4 -= n6;
            n2 = class566.field5541;
            n10 += n3 * n6;
            n7 += n6 * class566.field5542;
        }
        if (n2 + n4 > class566.field5547) {
            n4 -= n2 + n4 - class566.field5547;
        }
        if (n < class566.field5548) {
            n6 = class566.field5548 - n;
            n3 -= n6;
            n = class566.field5548;
            n10 += n6;
            n7 += n6;
            n9 += n6;
            n8 += n6;
        }
        if (n3 + n > class566.field5549) {
            n6 = n3 + n - class566.field5549;
            n3 -= n6;
            n9 += n6;
            n8 += n6;
        }
        if (n3 > 0 && n4 > 0) {
            class439.method8778(class566.field5546, byArray, n5, n10, n7, n3, n4, n8, n9);
            return;
        }
    }

    @ObfuscatedName(value="bm")
    static void method8778(int[] nArray, byte[] byArray, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = -(n4 >> 2);
        n4 = -(n4 & 3);
        int n9 = -n5;
        block0: while (n9 < 0) {
            int n10 = n8;
            while (true) {
                if (n10 >= 0) {
                    n10 = n4;
                    while (true) {
                        if (n10 >= 0) {
                            n3 += n6;
                            n2 += n7;
                            ++n9;
                            continue block0;
                        }
                        if (byArray[n2++] != 0) {
                            nArray[n3++] = n;
                        } else {
                            ++n3;
                        }
                        ++n10;
                    }
                }
                if (byArray[n2++] != 0) {
                    nArray[n3++] = n;
                } else {
                    ++n3;
                }
                if (byArray[n2++] != 0) {
                    nArray[n3++] = n;
                } else {
                    ++n3;
                }
                if (byArray[n2++] != 0) {
                    nArray[n3++] = n;
                } else {
                    ++n3;
                }
                if (byArray[n2++] != 0) {
                    nArray[n3++] = n;
                } else {
                    ++n3;
                }
                ++n10;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="bp")
    static void method8707(byte[] byArray, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8 = n + n2 * class566.field5542;
        int n9 = class566.field5542 - n3;
        int n10 = 0;
        int n11 = 0;
        if (n2 < class566.field5541) {
            n7 = class566.field5541 - n2;
            n4 -= n7;
            n2 = class566.field5541;
            n11 += n3 * n7;
            n8 += n7 * class566.field5542;
        }
        if (n2 + n4 > class566.field5547) {
            n4 -= n2 + n4 - class566.field5547;
        }
        if (n < class566.field5548) {
            n7 = class566.field5548 - n;
            n3 -= n7;
            n = class566.field5548;
            n11 += n7;
            n8 += n7;
            n10 += n7;
            n9 += n7;
        }
        if (n3 + n > class566.field5549) {
            n7 = n3 + n - class566.field5549;
            n3 -= n7;
            n10 += n7;
            n9 += n7;
        }
        if (n3 > 0 && n4 > 0) {
            class439.method8708(class566.field5546, byArray, n5, n11, n8, n3, n4, n9, n10, n6);
            return;
        }
    }

    @ObfuscatedName(value="bg")
    static void method8708(int[] nArray, byte[] byArray, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        n = ((n & 0xFF00) * n8 & 0xFF0000) + (n8 * (n & 0xFF00FF) & 0xFF00FF00) >> 8;
        n8 = 256 - n8;
        int n9 = -n5;
        block0: while (n9 < 0) {
            int n10 = -n4;
            while (true) {
                if (n10 >= 0) {
                    n3 += n6;
                    n2 += n7;
                    ++n9;
                    continue block0;
                }
                if (byArray[n2++] == 0) {
                    ++n3;
                } else {
                    int n11 = nArray[n3];
                    nArray[n3++] = (((n11 & 0xFF00) * n8 & 0xFF0000) + ((n11 & 0xFF00FF) * n8 & 0xFF00FF00) >> 8) + n;
                }
                ++n10;
            }
            break;
        }
        return;
    }
}

