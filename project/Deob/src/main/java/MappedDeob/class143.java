/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fr")
class class143
implements Callable {
    @ObfuscatedName(value="iz")
    @ObfuscatedGetter(intValue=1078117213)
    static int field1637;
    @ObfuscatedSignature(descriptor="Lfl;")
    final /* synthetic */ class144 this$0;
    @ObfuscatedSignature(descriptor="Lvy;")
    final /* synthetic */ Buffer val$p;
    final /* synthetic */ int val$version;

    @ObfuscatedSignature(descriptor="(Lfl;Lvy;I)V")
    class143(class144 class1442, Buffer buffer, int n) {
        this.this$0 = class1442;
        this.val$p = buffer;
        this.val$version = n;
    }

    public Object call() {
        this.this$0.method3520(this.val$p, this.val$version);
        return null;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)Lim;", garbageValue="-77")
    public static class221 method3517() {
        return class221.field2422;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="iq")
    @ObfuscatedSignature(descriptor="(IIIIZB)V", garbageValue="-25")
    @Export(value="setViewportShape")
    static final void setViewportShape(int n, int n2, int n3, int n4, boolean bl) {
        int n5;
        int n6;
        block8: {
            int n7;
            int n8;
            block9: {
                block7: {
                    int n9;
                    if (n3 < 1) {
                        n3 = 1;
                    }
                    if (n4 < 1) {
                        n4 = 1;
                    }
                    if ((n8 = n4 * (n6 = (n9 = n4 - 334) < 0 ? Client.field609 : (n9 >= 100 ? Client.field656 : (Client.field656 - Client.field609) * n9 / 100 + Client.field609)) * 512 / (n3 * 334)) >= Client.field702) break block7;
                    n8 = Client.field702;
                    n6 = n8 * n3 * 334 / (n4 * 512);
                    if (n6 <= Client.field773) break block8;
                    break block9;
                }
                if (n8 > Client.field775 && (n6 = (n8 = (int)Client.field775) * n3 * 334 / (n4 * 512)) < Client.field772) {
                    n6 = Client.field772;
                    n7 = n8 * n3 * 334 / (n6 * 512);
                    n5 = (n4 - n7) / 2;
                    if (bl) {
                        Rasterizer2D.Rasterizer2D_resetClip();
                        Rasterizer2D.Rasterizer2D_fillRectangle(n, n2, n3, n5, -16777216);
                        Rasterizer2D.Rasterizer2D_fillRectangle(n, n4 + n2 - n5, n3, n5, -16777216);
                    }
                    n2 = n5 + n2;
                    n4 -= n5 * 2;
                }
                break block8;
            }
            n6 = Client.field773;
            n7 = n4 * n6 * 512 / (n8 * 334);
            n5 = (n3 - n7) / 2;
            if (bl) {
                Rasterizer2D.Rasterizer2D_resetClip();
                Rasterizer2D.Rasterizer2D_fillRectangle(n, n2, n5, n4, -16777216);
                Rasterizer2D.Rasterizer2D_fillRectangle(n + n3 - n5, n2, n5, n4, -16777216);
            }
            n += n5;
            n3 -= n5 * 2;
        }
        Client.viewportZoom = n4 * n6 / 334;
        if (n3 != Client.viewportWidth || n4 != Client.viewportHeight) {
            int[] nArray = new int[9];
            for (n5 = 0; n5 < nArray.length; ++n5) {
                int n10;
                int n11 = n5 * 32 + 15 + 128;
                int n12 = n10 = n11 * 3 + 600;
                int n13 = SceneTileModel.field1954[n11];
                n12 = Frames.method4471(n12, n4);
                nArray[n5] = n13 * n12 >> 16;
            }
            GameEngine.field189.field1319.method4267(nArray, 500, 800, n3 * 334 / n4, 334);
        }
        Client.viewportOffsetX = n;
        Client.viewportOffsetY = n2;
        Client.viewportWidth = n3;
        Client.viewportHeight = n4;
    }
}

