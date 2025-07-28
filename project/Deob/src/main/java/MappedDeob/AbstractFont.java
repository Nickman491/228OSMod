/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="qc")
@Implements(value="AbstractFont")
public abstract class AbstractFont
extends Rasterizer2D {
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="[Lvi;")
    @Export(value="AbstractFont_modIconSprites")
    public static IndexedSprite[] AbstractFont_modIconSprites;
    @ObfuscatedName(value="aq")
    @Export(value="AbstractFont_strike")
    static int AbstractFont_strike;
    @ObfuscatedName(value="af")
    @Export(value="AbstractFont_underline")
    static int AbstractFont_underline;
    @ObfuscatedName(value="aa")
    @Export(value="AbstractFont_previousShadow")
    static int AbstractFont_previousShadow;
    @ObfuscatedName(value="ak")
    @Export(value="AbstractFont_shadow")
    static int AbstractFont_shadow;
    @ObfuscatedName(value="al")
    @Export(value="AbstractFont_previousColor")
    static int AbstractFont_previousColor;
    @ObfuscatedName(value="av")
    @Export(value="AbstractFont_color")
    static int AbstractFont_color;
    @ObfuscatedName(value="ag")
    @Export(value="AbstractFont_alpha")
    static int AbstractFont_alpha;
    @ObfuscatedName(value="aw")
    @Export(value="AbstractFont_justificationTotal")
    static int AbstractFont_justificationTotal;
    @ObfuscatedName(value="ai")
    @Export(value="AbstractFont_justificationCurrent")
    static int AbstractFont_justificationCurrent;
    @ObfuscatedName(value="ar")
    @Export(value="AbstractFont_random")
    static Random AbstractFont_random;
    @ObfuscatedName(value="am")
    @Export(value="AbstractFont_lines")
    static String[] AbstractFont_lines;
    @ObfuscatedName(value="ah")
    @Export(value="pixels")
    byte[][] pixels = new byte[256][];
    @ObfuscatedName(value="az")
    @Export(value="advances")
    int[] advances;
    @ObfuscatedName(value="ao")
    @Export(value="widths")
    int[] widths;
    @ObfuscatedName(value="ad")
    @Export(value="heights")
    int[] heights;
    @ObfuscatedName(value="an")
    @Export(value="leftBearings")
    int[] leftBearings;
    @ObfuscatedName(value="ae")
    @Export(value="topBearings")
    int[] topBearings;
    @ObfuscatedName(value="ax")
    @Export(value="ascent")
    public int ascent = 0;
    @ObfuscatedName(value="at")
    @Export(value="maxAscent")
    public int maxAscent;
    @ObfuscatedName(value="ac")
    public int field4846;
    @ObfuscatedName(value="as")
    @Export(value="kerning")
    byte[] kerning;

    static {
        AbstractFont_strike = -1;
        AbstractFont_underline = -1;
        AbstractFont_previousShadow = -1;
        AbstractFont_shadow = -1;
        AbstractFont_previousColor = 0;
        AbstractFont_color = 0;
        AbstractFont_alpha = 256;
        AbstractFont_justificationTotal = 0;
        AbstractFont_justificationCurrent = 0;
        AbstractFont_random = new Random();
        AbstractFont_lines = new String[100];
    }

    AbstractFont(byte[] byArray) {
        this.readMetrics(byArray);
    }

    AbstractFont(byte[] byArray, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, byte[][] byArray2) {
        this.leftBearings = nArray;
        this.topBearings = nArray2;
        this.widths = nArray3;
        this.heights = nArray4;
        this.readMetrics(byArray);
        this.pixels = byArray2;
        int n = Integer.MAX_VALUE;
        int n2 = Integer.MIN_VALUE;
        int n3 = 0;
        while (true) {
            if (n3 >= 256) {
                this.maxAscent = this.ascent - n;
                this.field4846 = n2 - this.ascent;
                return;
            }
            if (this.topBearings[n3] < n && this.heights[n3] != 0) {
                n = this.topBearings[n3];
            }
            if (this.topBearings[n3] + this.heights[n3] > n2) {
                n2 = this.topBearings[n3] + this.heights[n3];
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="ay")
    @Export(value="drawGlyph")
    abstract void drawGlyph(byte[] var1, int var2, int var3, int var4, int var5, int var6);

    @ObfuscatedName(value="ah")
    @Export(value="drawGlyphAlpha")
    abstract void drawGlyphAlpha(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

    @ObfuscatedName(value="ax")
    @Export(value="readMetrics")
    void readMetrics(byte[] byArray) {
        block15: {
            this.advances = new int[256];
            if (byArray.length != 257) {
                int n;
                int n2 = 0;
                for (int i = 0; i < 256; ++i) {
                    this.advances[i] = byArray[n2++] & 0xFF;
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
                                this.kerning = new byte[65536];
                                n5 = 0;
                                while (true) {
                                    if (n5 >= 256) {
                                        this.ascent = nArray2[32] + nArray[32];
                                        break block15;
                                    }
                                    if (n5 != 32 && n5 != 160) {
                                        for (n4 = 0; n4 < 256; ++n4) {
                                            if (n4 == 32 || n4 == 160) continue;
                                            this.kerning[n4 + (n5 << 8)] = (byte)AbstractFont.method8676(byArrayArray, byArrayArray2, nArray2, this.advances, nArray, n5, n4);
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
            for (int i = 0; i < this.advances.length; ++i) {
                this.advances[i] = byArray[i] & 0xFF;
            }
            this.ascent = byArray[256] & 0xFF;
        }
    }

    @ObfuscatedName(value="ac")
    @Export(value="charWidth")
    public int charWidth(char c) {
        if (c == '\u00a0') {
            c = (char)32;
        }
        return this.advances[class232.charToByteCp1252(c) & 0xFF];
    }

    @ObfuscatedName(value="au")
    @Export(value="stringWidth")
    public int stringWidth(String string) {
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
                        n3 += AbstractFont.AbstractFont_modIconSprites[n5].width;
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
            n3 += this.advances[(char)(class232.charToByteCp1252((char)n4) & 0xFF)];
            if (this.kerning != null && n2 != -1) {
                n3 += this.kerning[n4 + (n2 << 8)];
            }
            n2 = n4;
        }
        return n3;
    }

    @ObfuscatedName(value="as")
    @Export(value="breakLines")
    public int breakLines(String string, int[] nArray, String[] stringArray) {
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
                    n += this.charWidth('<');
                    if (this.kerning != null && n7 != -1) {
                        n += this.kerning[(n7 << 8) + 60];
                    }
                    n7 = 60;
                } else if (string2.equals("gt")) {
                    n += this.charWidth('>');
                    if (this.kerning != null && n7 != -1) {
                        n += this.kerning[(n7 << 8) + 62];
                    }
                    n7 = 62;
                } else if (string2.startsWith("img=")) {
                    try {
                        int n11 = class278.method5972(string2.substring(4));
                        n += AbstractFont.AbstractFont_modIconSprites[n11].width;
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
                n += this.charWidth((char)n10);
                if (this.kerning != null && n7 != -1) {
                    n += this.kerning[n10 + (n7 << 8)];
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
    @Export(value="lineWidth")
    public int lineWidth(String string, int n) {
        int n2 = this.breakLines(string, new int[]{n}, AbstractFont_lines);
        int n3 = 0;
        int n4 = 0;
        while (n4 < n2) {
            int n5 = this.stringWidth(AbstractFont_lines[n4]);
            if (n5 > n3) {
                n3 = n5;
            }
            ++n4;
        }
        return n3;
    }

    @ObfuscatedName(value="af")
    @Export(value="lineCount")
    public int lineCount(String string, int n) {
        return this.breakLines(string, new int[]{n}, AbstractFont_lines);
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(IILjava/lang/String;II)Lql;")
    public Bounds method8709(int n, int n2, String string, int n3, int n4) {
        if (string != null && string.length() >= n2 + n) {
            int n5 = n3 - this.stringWidth(string) / 2;
            int n6 = n4 - this.maxAscent;
            int n7 = this.stringWidth(string.substring(n, n2 + n));
            int n8 = this.maxAscent + this.field4846;
            return new Bounds(n5 += this.stringWidth(string.substring(0, n)), n6, n7, n8);
        }
        return new Bounds(n3, n4, 0, 0);
    }

    @ObfuscatedName(value="al")
    @Export(value="draw")
    public void draw(String string, int n, int n2, int n3, int n4) {
        if (string == null) {
            return;
        }
        this.reset(n3, n4);
        this.draw0(string, n, n2);
    }

    @ObfuscatedName(value="av")
    @Export(value="drawAlpha")
    public void drawAlpha(String string, int n, int n2, int n3, int n4, int n5) {
        if (string == null) {
            return;
        }
        this.reset(n3, n4);
        AbstractFont_alpha = n5;
        this.draw0(string, n, n2);
    }

    @ObfuscatedName(value="ag")
    @Export(value="drawRightAligned")
    public void drawRightAligned(String string, int n, int n2, int n3, int n4) {
        if (string == null) {
            return;
        }
        this.reset(n3, n4);
        this.draw0(string, n - this.stringWidth(string), n2);
    }

    @ObfuscatedName(value="aw")
    @Export(value="drawCentered")
    public void drawCentered(String string, int n, int n2, int n3, int n4) {
        if (string == null) {
            return;
        }
        this.reset(n3, n4);
        this.draw0(string, n - this.stringWidth(string) / 2, n2);
    }

    @ObfuscatedName(value="ai")
    @Export(value="drawLines")
    public int drawLines(String string, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
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
        this.reset(n5, n6);
        AbstractFont_alpha = n7;
        if (n10 == 0) {
            n10 = this.ascent;
        }
        int[] nArray = new int[]{n3};
        if (n4 < n10 + this.maxAscent + this.field4846 && n4 < n10 + n10) {
            nArray = null;
        }
        int n13 = this.breakLines(string, nArray, AbstractFont_lines);
        if (n9 == 3 && n13 == 1) {
            n9 = 1;
        }
        if (n9 == 0) {
            n12 = n2 + this.maxAscent;
        } else if (n9 == 1) {
            n12 = n2 + this.maxAscent + (n4 - this.maxAscent - this.field4846 - n10 * (n13 - 1)) / 2;
        } else if (n9 == 2) {
            n12 = n2 + n4 - this.field4846 - n10 * (n13 - 1);
        } else {
            n11 = (n4 - this.maxAscent - this.field4846 - n10 * (n13 - 1)) / (n13 + 1);
            if (n11 < 0) {
                n11 = 0;
            }
            n12 = n2 + n11 + this.maxAscent;
            n10 += n11;
        }
        n11 = 0;
        while (n11 < n13) {
            if (n8 == 0) {
                this.draw0(AbstractFont_lines[n11], n, n12);
            } else if (n8 == 1) {
                this.draw0(AbstractFont_lines[n11], n + (n3 - this.stringWidth(AbstractFont_lines[n11])) / 2, n12);
            } else if (n8 == 2) {
                this.draw0(AbstractFont_lines[n11], n + n3 - this.stringWidth(AbstractFont_lines[n11]), n12);
            } else if (n11 == n13 - 1) {
                this.draw0(AbstractFont_lines[n11], n, n12);
            } else {
                this.calculateLineJustification(AbstractFont_lines[n11], n3);
                this.draw0(AbstractFont_lines[n11], n, n12);
                AbstractFont_justificationTotal = 0;
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
        this.reset(n3, n4);
        n2 -= this.ascent;
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
                    int n10 = this.widths[n7];
                    int n11 = this.heights[n7];
                    if (AbstractFont_shadow != -1) {
                        this.drawGlyph(this.pixels[n7], n8 + this.leftBearings[n7] + 1, n9 + this.topBearings[n7] + 1, n10, n11, AbstractFont_shadow);
                    }
                    this.drawGlyph(this.pixels[n7], n8 + this.leftBearings[n7], n9 + this.topBearings[n7], n10, n11, AbstractFont_color);
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
        this.reset(n3, n4);
        int[] nArray2 = null;
        if (nArray != null) {
            nArray2 = this.method8695(nArray, string.length());
        }
        int[] nArray3 = new int[string.length()];
        for (int i = 0; i < string.length(); ++i) {
            nArray3[i] = (int)(Math.sin((double)i / 2.0 + (double)n5 / 5.0) * 5.0);
        }
        this.method8702(string, n - this.stringWidth(string) / 2, n2, nArray2, null, nArray3);
    }

    @ObfuscatedName(value="ab")
    public void method8762(String string, int n, int n2, int n3, int n4, int n5, int[] nArray) {
        if (string == null) {
            return;
        }
        this.reset(n3, n4);
        int[] nArray2 = null;
        if (nArray != null) {
            nArray2 = this.method8695(nArray, string.length());
        }
        int[] nArray3 = new int[string.length()];
        int[] nArray4 = new int[string.length()];
        int n6 = 0;
        while (true) {
            if (n6 >= string.length()) {
                this.method8702(string, n - this.stringWidth(string) / 2, n2, nArray2, nArray3, nArray4);
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
        this.reset(n3, n4);
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
        this.method8702(string, n - this.stringWidth(string) / 2, n2, nArray2, null, nArray3);
    }

    @ObfuscatedName(value="bu")
    public void method8776(String string, int n, int n2, int n3, int n4, int[] nArray) {
        if (string == null) {
            return;
        }
        this.reset(n3, n4);
        int[] nArray2 = null;
        if (nArray != null) {
            nArray2 = this.method8695(nArray, string.length());
        }
        this.method8702(string, n - this.stringWidth(string) / 2, n2, nArray2, null, null);
    }

    @ObfuscatedName(value="bh")
    public void method8694(String string, int n, int n2, int n3, int n4, int[] nArray) {
        if (string == null) {
            return;
        }
        this.reset(n3, n4);
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
    @Export(value="drawRandomAlphaAndSpacing")
    public void drawRandomAlphaAndSpacing(String string, int n, int n2, int n3, int n4, int n5) {
        if (string == null) {
            return;
        }
        this.reset(n3, n4);
        AbstractFont_random.setSeed(n5);
        AbstractFont_alpha = 192 + (AbstractFont_random.nextInt() & 0x1F);
        int[] nArray = new int[string.length()];
        int n6 = 0;
        int n7 = 0;
        while (true) {
            if (n7 >= string.length()) {
                this.method8702(string, n, n2, null, nArray, null);
                return;
            }
            nArray[n7] = n6++;
            if ((AbstractFont_random.nextInt() & 3) == 0) {
                // empty if block
            }
            ++n7;
        }
    }

    @ObfuscatedName(value="bx")
    public void method8674(int n, int n2, int n3, int n4) {
        n3 -= this.ascent;
        int n5 = n & 0xFF;
        if (n5 != 32) {
            this.drawGlyph(this.pixels[n5], n2 + this.leftBearings[n5], n3 + this.topBearings[n5], this.widths[n5], this.heights[n5], n4);
        }
    }

    @ObfuscatedName(value="bd")
    @Export(value="reset")
    void reset(int n, int n2) {
        AbstractFont_strike = -1;
        AbstractFont_underline = -1;
        AbstractFont_shadow = AbstractFont_previousShadow = n2;
        AbstractFont_color = AbstractFont_previousColor = n;
        AbstractFont_alpha = 256;
        AbstractFont_justificationTotal = 0;
        AbstractFont_justificationCurrent = 0;
    }

    @ObfuscatedName(value="bi")
    @Export(value="decodeTag")
    void decodeTag(String string) {
        try {
            if (string.startsWith("col=")) {
                AbstractFont_color = ScriptFrame.method1232(string.substring(4), 16);
            } else if (string.equals("/col")) {
                AbstractFont_color = AbstractFont_previousColor;
            } else if (string.startsWith("str=")) {
                AbstractFont_strike = ScriptFrame.method1232(string.substring(4), 16);
            } else if (string.equals("str")) {
                AbstractFont_strike = 0x800000;
            } else if (string.equals("/str")) {
                AbstractFont_strike = -1;
            } else if (string.startsWith("u=")) {
                AbstractFont_underline = ScriptFrame.method1232(string.substring(2), 16);
            } else if (string.equals("u")) {
                AbstractFont_underline = 0;
            } else if (string.equals("/u")) {
                AbstractFont_underline = -1;
            } else if (string.startsWith("shad=")) {
                AbstractFont_shadow = ScriptFrame.method1232(string.substring(5), 16);
            } else if (string.equals("shad")) {
                AbstractFont_shadow = 0;
            } else if (string.equals("/shad")) {
                AbstractFont_shadow = AbstractFont_previousShadow;
            } else if (string.equals("br")) {
                this.reset(AbstractFont_previousColor, AbstractFont_previousShadow);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @ObfuscatedName(value="bz")
    @Export(value="calculateLineJustification")
    void calculateLineJustification(String string, int n) {
        int n2 = 0;
        boolean bl = false;
        int n3 = 0;
        while (true) {
            if (n3 >= string.length()) {
                if (n2 > 0) {
                    AbstractFont_justificationTotal = (n - this.stringWidth(string) << 8) / n2;
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
    @Export(value="draw0")
    void draw0(String string, int n, int n2) {
        n2 -= this.ascent;
        int n3 = -1;
        int n4 = -1;
        for (int i = 0; i < string.length(); ++i) {
            int n5;
            if (string.charAt(i) == '\u0000') continue;
            int n6 = class232.charToByteCp1252(string.charAt(i)) & 0xFF;
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
                            IndexedSprite indexedSprite = AbstractFont_modIconSprites[n5];
                            indexedSprite.drawAt(n, n2 + this.ascent - indexedSprite.height);
                            n += indexedSprite.width;
                            n4 = -1;
                        }
                        catch (Exception exception) {}
                        continue;
                    }
                    this.decodeTag(string2);
                    continue;
                }
            }
            if (n6 == 160) {
                n6 = 32;
            }
            if (n3 != -1) continue;
            if (this.kerning != null && n4 != -1) {
                n += this.kerning[n6 + (n4 << 8)];
            }
            int n7 = this.widths[n6];
            n5 = this.heights[n6];
            if (n6 != 32) {
                if (AbstractFont_alpha == 256) {
                    if (AbstractFont_shadow != -1) {
                        AbstractFont.AbstractFont_drawGlyph(this.pixels[n6], n + this.leftBearings[n6] + 1, n2 + this.topBearings[n6] + 1, n7, n5, AbstractFont_shadow);
                    }
                    this.drawGlyph(this.pixels[n6], n + this.leftBearings[n6], n2 + this.topBearings[n6], n7, n5, AbstractFont_color);
                } else {
                    if (AbstractFont_shadow != -1) {
                        AbstractFont.AbstractFont_drawGlyphAlpha(this.pixels[n6], n + this.leftBearings[n6] + 1, n2 + this.topBearings[n6] + 1, n7, n5, AbstractFont_shadow, AbstractFont_alpha);
                    }
                    this.drawGlyphAlpha(this.pixels[n6], n + this.leftBearings[n6], n2 + this.topBearings[n6], n7, n5, AbstractFont_color, AbstractFont_alpha);
                }
            } else if (AbstractFont_justificationTotal > 0) {
                n = ((AbstractFont_justificationCurrent += AbstractFont_justificationTotal) >> 8) + n;
                AbstractFont_justificationCurrent &= 0xFF;
            }
            int n8 = this.advances[n6];
            if (AbstractFont_strike != -1) {
                Rasterizer2D.method10619(n, n2 + (int)((double)this.ascent * 0.7), n8, AbstractFont_strike);
            }
            if (AbstractFont_underline != -1) {
                Rasterizer2D.method10619(n, n2 + this.ascent + 1, n8, AbstractFont_underline);
            }
            n = n8 + n;
            n4 = n6;
        }
    }

    @ObfuscatedName(value="bf")
    void method8702(String string, int n, int n2, int[] nArray, int[] nArray2, int[] nArray3) {
        n2 -= this.ascent;
        int n3 = -1;
        int n4 = -1;
        int n5 = 0;
        for (int i = 0; i < string.length(); ++i) {
            int n6;
            int n7;
            int n8;
            if (string.charAt(i) == '\u0000') continue;
            int n9 = class232.charToByteCp1252(string.charAt(i)) & 0xFF;
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
                            IndexedSprite indexedSprite = AbstractFont_modIconSprites[n6];
                            indexedSprite.drawAt(n8 + n, n7 + (n2 + this.ascent - indexedSprite.height));
                            n += indexedSprite.width;
                            n4 = -1;
                        }
                        catch (Exception exception) {}
                        continue;
                    }
                    this.decodeTag(string2);
                    continue;
                }
            }
            if (n9 == 160) {
                n9 = 32;
            }
            if (n3 != -1) continue;
            if (this.kerning != null && n4 != -1) {
                n += this.kerning[n9 + (n4 << 8)];
            }
            int n10 = this.widths[n9];
            n8 = this.heights[n9];
            n7 = nArray2 != null ? nArray2[n5] : 0;
            n6 = nArray3 != null ? nArray3[n5] : 0;
            int n11 = nArray != null ? nArray[n5] : AbstractFont_color;
            ++n5;
            if (n9 != 32) {
                if (AbstractFont_alpha == 256) {
                    if (AbstractFont_shadow != -1) {
                        AbstractFont.AbstractFont_drawGlyph(this.pixels[n9], n7 + n + this.leftBearings[n9] + 1, n2 + n6 + this.topBearings[n9] + 1, n10, n8, AbstractFont_shadow);
                    }
                    this.drawGlyph(this.pixels[n9], n7 + n + this.leftBearings[n9], n2 + n6 + this.topBearings[n9], n10, n8, n11);
                } else {
                    if (AbstractFont_shadow != -1) {
                        AbstractFont.AbstractFont_drawGlyphAlpha(this.pixels[n9], n7 + n + this.leftBearings[n9] + 1, n2 + n6 + this.topBearings[n9] + 1, n10, n8, AbstractFont_shadow, AbstractFont_alpha);
                    }
                    this.drawGlyphAlpha(this.pixels[n9], n7 + n + this.leftBearings[n9], n2 + n6 + this.topBearings[n9], n10, n8, n11, AbstractFont_alpha);
                }
            } else if (AbstractFont_justificationTotal > 0) {
                n = ((AbstractFont_justificationCurrent += AbstractFont_justificationTotal) >> 8) + n;
                AbstractFont_justificationCurrent &= 0xFF;
            }
            int n12 = this.advances[n9];
            if (AbstractFont_strike != -1) {
                Rasterizer2D.method10619(n, n2 + (int)((double)this.ascent * 0.7), n12, AbstractFont_strike);
            }
            if (AbstractFont_underline != -1) {
                Rasterizer2D.method10619(n, n2 + this.ascent, n12, AbstractFont_underline);
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
    @Export(value="escapeBrackets")
    public static String escapeBrackets(String string) {
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
    @Export(value="AbstractFont_drawGlyph")
    static void AbstractFont_drawGlyph(byte[] byArray, int n, int n2, int n3, int n4, int n5) {
        int n6;
        int n7 = n + n2 * Rasterizer2D.Rasterizer2D_width;
        int n8 = Rasterizer2D.Rasterizer2D_width - n3;
        int n9 = 0;
        int n10 = 0;
        if (n2 < Rasterizer2D.Rasterizer2D_yClipStart) {
            n6 = Rasterizer2D.Rasterizer2D_yClipStart - n2;
            n4 -= n6;
            n2 = Rasterizer2D.Rasterizer2D_yClipStart;
            n10 += n3 * n6;
            n7 += n6 * Rasterizer2D.Rasterizer2D_width;
        }
        if (n2 + n4 > Rasterizer2D.Rasterizer2D_yClipEnd) {
            n4 -= n2 + n4 - Rasterizer2D.Rasterizer2D_yClipEnd;
        }
        if (n < Rasterizer2D.Rasterizer2D_xClipStart) {
            n6 = Rasterizer2D.Rasterizer2D_xClipStart - n;
            n3 -= n6;
            n = Rasterizer2D.Rasterizer2D_xClipStart;
            n10 += n6;
            n7 += n6;
            n9 += n6;
            n8 += n6;
        }
        if (n3 + n > Rasterizer2D.Rasterizer2D_xClipEnd) {
            n6 = n3 + n - Rasterizer2D.Rasterizer2D_xClipEnd;
            n3 -= n6;
            n9 += n6;
            n8 += n6;
        }
        if (n3 > 0 && n4 > 0) {
            AbstractFont.AbstractFont_placeGlyph(Rasterizer2D.Rasterizer2D_pixels, byArray, n5, n10, n7, n3, n4, n8, n9);
            return;
        }
    }

    @ObfuscatedName(value="bm")
    @Export(value="AbstractFont_placeGlyph")
    static void AbstractFont_placeGlyph(int[] nArray, byte[] byArray, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
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
    @Export(value="AbstractFont_drawGlyphAlpha")
    static void AbstractFont_drawGlyphAlpha(byte[] byArray, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8 = n + n2 * Rasterizer2D.Rasterizer2D_width;
        int n9 = Rasterizer2D.Rasterizer2D_width - n3;
        int n10 = 0;
        int n11 = 0;
        if (n2 < Rasterizer2D.Rasterizer2D_yClipStart) {
            n7 = Rasterizer2D.Rasterizer2D_yClipStart - n2;
            n4 -= n7;
            n2 = Rasterizer2D.Rasterizer2D_yClipStart;
            n11 += n3 * n7;
            n8 += n7 * Rasterizer2D.Rasterizer2D_width;
        }
        if (n2 + n4 > Rasterizer2D.Rasterizer2D_yClipEnd) {
            n4 -= n2 + n4 - Rasterizer2D.Rasterizer2D_yClipEnd;
        }
        if (n < Rasterizer2D.Rasterizer2D_xClipStart) {
            n7 = Rasterizer2D.Rasterizer2D_xClipStart - n;
            n3 -= n7;
            n = Rasterizer2D.Rasterizer2D_xClipStart;
            n11 += n7;
            n8 += n7;
            n10 += n7;
            n9 += n7;
        }
        if (n3 + n > Rasterizer2D.Rasterizer2D_xClipEnd) {
            n7 = n3 + n - Rasterizer2D.Rasterizer2D_xClipEnd;
            n3 -= n7;
            n10 += n7;
            n9 += n7;
        }
        if (n3 > 0 && n4 > 0) {
            AbstractFont.AbstractFont_placeGlyphAlpha(Rasterizer2D.Rasterizer2D_pixels, byArray, n5, n11, n8, n3, n4, n9, n10, n6);
            return;
        }
    }

    @ObfuscatedName(value="bg")
    @Export(value="AbstractFont_placeGlyphAlpha")
    static void AbstractFont_placeGlyphAlpha(int[] nArray, byte[] byArray, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
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

