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

@ObfuscatedName(value="ww")
public class class574 {
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1377942857)
    int field5609;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1512434257)
    int field5598;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=977849859)
    int field5599;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1014335183)
    int field5600;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-2067185287)
    int field5605;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1966637571)
    int field5597;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-362394515)
    int field5601 = 0;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-753631595)
    int field5604 = 0;
    @ObfuscatedName(value="ac")
    boolean field5608;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-2136755735)
    int field5606;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=1550802973)
    int field5607;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-267529311)
    int field5602;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=993786395)
    int field5603;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIIIIIIIZB)V", garbageValue="7")
    public void method10905(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl) {
        this.field5609 = n;
        this.field5598 = n2;
        this.field5599 = n3;
        this.field5600 = n4;
        this.field5605 = n5;
        this.field5597 = n6;
        this.field5601 = n7;
        this.field5604 = n8;
        this.field5608 = bl;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIII)V", garbageValue="2039845081")
    public void method10906(int n, int n2, int n3, int n4) {
        this.field5606 = n;
        this.field5607 = n2;
        this.field5602 = n3;
        this.field5603 = n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lqi;Lqw;S)V", garbageValue="-20924")
    public void method10907(class436 class4362, Font font) {
        int n;
        int n2;
        if (font == null) {
            return;
        }
        int n3 = font.ascent;
        int n4 = Math.min(this.field5600, (int)(0.9f * (float)n3));
        int n5 = class4362.method8559(this.field5599);
        int n6 = class4362.method8560(this.field5600);
        int n7 = n5 + (this.field5609 - this.field5605);
        int n8 = n6 + n3 + (this.field5598 - this.field5597);
        Rasterizer2D.Rasterizer2D_setClip(this.field5609, this.field5598, this.field5599 + this.field5609, this.field5598 + this.field5600);
        int n9 = this.field5604;
        int n10 = this.field5601;
        if (n9 > n10) {
            int n11 = n9;
            n9 = n10;
            n10 = n11;
        }
        class440 class4402 = class4362.method8629(0, n9);
        class440 class4403 = class4362.method8629(n9, n10);
        class440 class4404 = class4362.method8629(n10, class4362.method8532());
        class440 class4405 = class4362.method8629(0, this.field5601);
        if (!class4403.method8788()) {
            int n12 = font.field4846 + font.maxAscent;
            for (n2 = 0; n2 < class4403.method8808(); ++n2) {
                class438 class4382 = class4403.method8786(n2);
                n = n7 + class4382.field4821;
                int n13 = font.charWidth(class4382.field4824);
                int n14 = n8 + class4382.field4822 - n3;
                Rasterizer2D.Rasterizer2D_fillRectangle(n, n14, n13, n12, this.field5603);
            }
        }
        if (!class4402.method8788()) {
            font.method8689(class4402, n7, n8, this.field5606, this.field5607, -1);
        }
        if (!class4403.method8788()) {
            font.method8689(class4403, n7, n8, this.field5602, this.field5607, -1);
        }
        if (!class4404.method8788()) {
            font.method8689(class4404, n7, n8, this.field5606, this.field5607, -1);
        }
        if (this.field5608) {
            class527 class5272 = class4405.method8792();
            n2 = n7 + (Integer)class5272.field5326;
            int n15 = n8 + (Integer)class5272.field5327;
            n = n15 - n4;
            Rasterizer2D.Rasterizer2D_drawLine(n2, n15, n2, n, this.field5606);
            if (this.field5607 != -1) {
                Rasterizer2D.Rasterizer2D_drawLine(n2 + 1, n15 + 1, n2 + 1, n + 1, this.field5607);
            }
        }
    }
}

