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
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="hs")
@Implements(value="Renderable")
public abstract class Renderable
extends DualNode {
    @ObfuscatedName(value="ef")
    @ObfuscatedGetter(intValue=-1363658001)
    @Export(value="height")
    public int height = 1000;

    protected Renderable() {
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(B)Lhv;", garbageValue="-7")
    @Export(value="getModel")
    protected Model getModel() {
        return null;
    }

    @ObfuscatedName(value="eq")
    void vmethod4616(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, long l, int n10, int n11, boolean bl) {
        Model model = this.getModel();
        if (model != null) {
            this.height = model.height;
            int n12 = SceneTileModel.field1954[n2];
            int n13 = SceneTileModel.Rasterizer3D_cosine[n2];
            int n14 = SceneTileModel.field1954[n3];
            int n15 = SceneTileModel.Rasterizer3D_cosine[n3];
            model.draw(n, n12, n13, n14, n15, n4 - n7, n5 - n8, n6 - n9, l);
        }
    }

    @ObfuscatedName(value="kl")
    @ObfuscatedSignature(descriptor="(ILqe;IIIJ)V")
    void vmethod4565(int n, class428 class4282, int n2, int n3, int n4, long l) {
        Model model = this.getModel();
        if (model != null) {
            this.height = model.height;
            model.vmethod4565(n, class4282, n2, n3, n4, l);
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="81507739")
    static void method4460() {
        Tiles.Tiles_minPlane = 99;
        SecureRandomCallable.Tiles_underlays = new short[4][104][104];
        SecureRandomFuture.Tiles_overlays = new short[4][104][104];
        Tiles.Tiles_shapes = new byte[4][104][104];
        Tiles.field1026 = new byte[4][104][104];
        class538.field5380 = new int[4][105][105];
        Tiles.Tiles_underlays2 = new byte[4][105][105];
        WorldMapID.field3244 = new int[105][105];
        InvDefinition.Tiles_hue = new int[104];
        Tiles.Tiles_saturation = new int[104];
        Tiles.Tiles_lightness = new int[104];
        class4.Tiles_hueMultiplier = new int[104];
        class557.field5476 = new int[104];
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="([Ljava/lang/String;[IB)V", garbageValue="-20")
    public static void method4461(String[] stringArray, int[] nArray) {
        class250.method5356(stringArray, nArray, 0, stringArray.length - 1);
    }

    @ObfuscatedName(value="lb")
    @ObfuscatedSignature(descriptor="(IIIIIIIIB)V", garbageValue="1")
    static final void method4459(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (ClanChannel.field1807.method7024(n)) {
            class10.field53 = null;
            class134.drawInterface(ClanChannel.field1807.field3772[n], -1, n2, n3, n4, n5, n6, n7, n8);
            if (class10.field53 != null) {
                class134.drawInterface(class10.field53, -1412584499, n2, n3, n4, n5, class433.field4786, WorldMapElement.field2543, n8);
                class10.field53 = null;
            }
            return;
        }
        if (n8 != -1) {
            Client.field713[n8] = true;
        } else {
            for (int i = 0; i < 100; ++i) {
                Client.field713[i] = true;
            }
        }
    }
}

