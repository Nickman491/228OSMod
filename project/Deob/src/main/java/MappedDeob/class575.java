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

@ObfuscatedName(value="wl")
public class class575 {
    @ObfuscatedName(value="ay")
    boolean field5611;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-851609407)
    public int field5612 = 0;
    @ObfuscatedName(value="az")
    public int[] field5622;
    @ObfuscatedName(value="ao")
    public int[] field5613;
    @ObfuscatedName(value="ad")
    public int[] field5614;
    @ObfuscatedName(value="an")
    public int[] field5615;
    @ObfuscatedName(value="ae")
    public int[] field5616;
    @ObfuscatedName(value="ax")
    public int[] field5617;
    @ObfuscatedName(value="at")
    public String[] field5618;
    @ObfuscatedName(value="ac")
    public String[] field5619;
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="[Lwl;")
    public class575[] field5623;
    @ObfuscatedName(value="as")
    public boolean[] field5628;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-724915389)
    int field5620;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=1384065801)
    int field5610;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=413062201)
    int field5624;
    @ObfuscatedName(value="ak")
    int field5625;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=458338547)
    int field5626;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=1361570705)
    int field5627;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(longValue=-787465256797306685L)
    long field5621;

    public class575(boolean bl) {
        int n = bl ? 500 : 20;
        this.field5611 = bl;
        this.field5622 = new int[n];
        this.field5613 = new int[n];
        this.field5614 = new int[n];
        this.field5615 = new int[n];
        this.field5616 = new int[n];
        this.field5617 = new int[n];
        this.field5618 = new String[n];
        this.field5619 = new String[n];
        this.field5623 = new class575[n];
        this.field5628 = new boolean[n];
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Ljava/lang/String;", garbageValue="1002229274")
    public final String method10916(int n) {
        if (n < 0) {
            return "";
        }
        if (!this.field5619[n].isEmpty()) {
            return this.field5618[n] + " " + this.field5619[n];
        }
        return this.field5618[n];
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-16")
    void method10917() {
        this.field5624 = GraphicsObject.field892.stringWidth("Choose Option");
        int n = 0;
        while (true) {
            if (n >= this.field5612) {
                this.field5624 += 8;
                this.field5625 = this.field5612 * 1294578225 + 345220860;
                if (this.field5611) {
                    this.field5625 += 1553493870;
                }
                return;
            }
            int n2 = GraphicsObject.field892.stringWidth(this.method10916(n));
            if (this.field5623[n] != null) {
                n2 += 15;
            }
            if (n2 > this.field5624) {
                this.field5624 = n2;
            }
            ++n;
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-173935892")
    public final void method10920(int n, int n2) {
        this.method10917();
        this.field5620 = n - this.field5624 / 2;
        if (this.field5620 + this.field5624 > BuddyRankComparator.canvasWidth) {
            this.field5620 = BuddyRankComparator.canvasWidth - this.field5624;
        }
        if (this.field5620 < 0) {
            this.field5620 = 0;
        }
        this.field5610 = n2;
        if (this.field5625 * 1569719871 + this.field5610 > Huffman.canvasHeight) {
            this.field5610 = Huffman.canvasHeight - this.field5625 * 1569719871;
        }
        if (this.field5610 < 0) {
            this.field5610 = 0;
        }
        if (this.field5626 != -1 && this.field5623[this.field5626] != null) {
            this.field5623[this.field5626].method10915(this);
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lwl;I)V", garbageValue="1740521715")
    final void method10915(class575 class5752) {
        this.method10917();
        this.field5620 = class5752.field5624 + class5752.field5620;
        if (this.field5624 + this.field5620 > BuddyRankComparator.canvasWidth) {
            this.field5620 = class5752.field5620 - this.field5624;
        }
        if (this.field5620 < 0) {
            this.field5620 = 0;
        }
        int n = class5752.field5612 * 15 - 15 - class5752.field5626 * 15 + class5752.field5610;
        if (class5752.field5611) {
            n += 17;
        }
        int n2 = n + 19;
        this.field5610 = n;
        if (this.field5625 * 1569719871 + this.field5610 > Huffman.canvasHeight) {
            this.field5610 = n2 - this.field5625 * 1569719871;
        }
        if (this.field5610 < 0) {
            this.field5610 = 0;
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IIB)I", garbageValue="97")
    final int method10940(int n, int n2) {
        int n3 = 0;
        while (n3 < this.field5612) {
            int n4 = this.field5610 + (this.field5612 - 1 - n3) * 15 + 14;
            if (this.field5611) {
                n4 += 17;
            }
            if (n > this.field5620 && n < this.field5620 + this.field5624 && n2 > n4 - 13 && n2 < n4 + 3) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="15")
    public final void method10921(int n) {
        if (n < 0) {
            return;
        }
        class508.method9611(this.field5622[n], this.field5613[n], this.field5614[n], this.field5615[n], this.field5616[n], this.field5617[n], this.field5618[n], this.field5619[n], MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IIS)Z", garbageValue="11274")
    public final boolean method10922(int n, int n2) {
        if (this.field5626 != -1 && this.field5623[this.field5626] != null && this.field5623[this.field5626].method10922(n, n2)) {
            return true;
        }
        if (n >= this.field5620 - 10 && n <= this.field5624 + this.field5620 + 10 && n2 >= this.field5610 - 10 && n2 <= this.field5625 * 1569719871 + this.field5610 + 10) {
            int n3 = this.method10940(n, n2);
            if (n3 != -1 && n3 != this.field5626) {
                if (n3 != this.field5627) {
                    this.field5627 = n3;
                    this.field5621 = ReflectionCheck.method724();
                    if (this.field5626 != -1) {
                        this.field5621 += 300L;
                    }
                }
                if (this.field5621 <= ReflectionCheck.method724()) {
                    this.field5627 = -1;
                    this.method10926();
                    if (this.field5623[n3] != null) {
                        this.field5626 = n3;
                        this.field5623[n3].method10915(this);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="1510688622")
    public final boolean method10923(int n, int n2) {
        if (this.field5626 != -1 && this.field5623[this.field5626] != null && this.field5623[this.field5626].method10923(n, n2)) {
            return true;
        }
        int n3 = this.method10940(n, n2);
        if (n3 == -1) {
            return false;
        }
        this.method10921(n3);
        return true;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1799312768")
    public final void method10924() {
        this.field5626 = -1;
        int n = 0;
        while (n < this.field5612) {
            if (this.field5623[n] != null) {
                this.field5623[n].method10924();
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="102")
    public final void method10932() {
        int n = this.field5620;
        int n2 = this.field5610;
        int n3 = this.field5624;
        int n4 = this.field5625 * 1569719871;
        int n5 = 0;
        while (true) {
            if (n5 >= Client.rootWidgetCount) {
                this.method10926();
                return;
            }
            if (Client.rootWidgetWidths[n5] + Client.rootWidgetXs[n5] > n && Client.rootWidgetXs[n5] < n + n3 && Client.rootWidgetYs[n5] + Client.rootWidgetHeights[n5] > n2 && Client.rootWidgetYs[n5] < n4 + n2) {
                Client.field713[n5] = true;
            }
            ++n5;
        }
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-339514510")
    final void method10926() {
        if (this.field5626 != -1) {
            if (this.field5623[this.field5626] != null) {
                this.field5623[this.field5626].method10932();
            }
            this.field5626 = -1;
        }
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I", garbageValue="-397039727")
    public final int method10927(String string, String string2, int n, int n2, int n3, int n4, int n5, boolean bl, int n6) {
        if (this.field5612 >= this.field5618.length) {
            return -1;
        }
        this.field5618[this.field5612] = string;
        this.field5619[this.field5612] = string2;
        this.field5614[this.field5612] = n;
        this.field5615[this.field5612] = n2;
        this.field5622[this.field5612] = n3;
        this.field5613[this.field5612] = n4;
        this.field5616[this.field5612] = n5;
        this.field5617[this.field5612] = n6;
        this.field5628[this.field5612] = bl;
        this.field5623[this.field5612] = null;
        return ++this.field5612 - 1;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="28586")
    public final void method10928() {
        int n = this.field5620;
        int n2 = this.field5610;
        int n3 = 6116423;
        Rasterizer2D.Rasterizer2D_fillRectangle(n, n2, this.field5624, this.field5625 * 1569719871, n3);
        if (!this.field5611) {
            Rasterizer2D.Rasterizer2D_drawRectangle(n + 1, n2 + 1, this.field5624 - 2, this.field5625 * 1569719871 - 2, 0);
        } else {
            Rasterizer2D.Rasterizer2D_fillRectangle(n + 1, n2 + 1, this.field5624 - 2, 16, 0);
            Rasterizer2D.Rasterizer2D_drawRectangle(n + 1, n2 + 18, this.field5624 - 2, this.field5625 * 1569719871 - 19, 0);
            GraphicsObject.field892.draw("Choose Option", n + 3, n2 + 14, n3, -1);
        }
        int n4 = MouseHandler.MouseHandler_x;
        int n5 = MouseHandler.MouseHandler_y;
        int n6 = 0;
        while (true) {
            if (n6 >= this.field5612) {
                class446.method8847(this.field5620, this.field5610, this.field5624, this.field5625 * 1569719871);
                if (this.field5626 != -1 && this.field5623[this.field5626] != null) {
                    this.field5623[this.field5626].method10928();
                }
                return;
            }
            int n7 = n2 + (this.field5612 - 1 - n6) * 15 + 14;
            if (this.field5611) {
                n7 += 17;
            }
            int n8 = 0xFFFFFF;
            if (n4 > n && n4 < n + this.field5624 && n5 > n7 - 13 && n5 < n7 + 3) {
                n8 = 0xFFFF00;
            }
            if (n6 == this.field5626 || n6 == this.field5627 && this.field5623[n6] != null) {
                Rasterizer2D.Rasterizer2D_fillRectangle(n + 2, n7 - 12, this.field5624 - 4, 15, 7496785);
            }
            GraphicsObject.field892.draw(this.method10916(n6), n + 3, n7, n8, 0);
            if (this.field5623[n6] != null) {
                GraphicsObject.field892.method8674(62, n + this.field5624 - 10, n7, 0xFFFFFF);
            }
            ++n6;
        }
    }
}

