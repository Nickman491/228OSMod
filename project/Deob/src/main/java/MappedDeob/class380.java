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

@ObfuscatedName(value="ou")
public class class380 {
    @ObfuscatedName(value="dg")
    static boolean field4145;

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(IIIIIZB)Lvf;", garbageValue="67")
    @Export(value="getItemSprite")
    public static final SpritePixels getItemSprite(int n, int n2, int n3, int n4, int n5, boolean bl) {
        Model model;
        SpritePixels spritePixels;
        if (n2 == -1) {
            n5 = 0;
        } else if (n5 == 2 && n2 != 1) {
            n5 = 1;
        }
        long l = ((long)n3 << 38) + ((long)n + ((long)n2 << 16)) + ((long)n5 << 40) + ((long)n4 << 42);
        if (!bl && (spritePixels = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(l)) != null) {
            return spritePixels;
        }
        ItemComposition itemComposition = FaceNormal.ItemDefinition_get(n);
        if (n2 > 1 && itemComposition.countobj != null) {
            int n6 = -1;
            int n7 = 0;
            while (true) {
                if (n7 >= 10) {
                    if (n6 == -1) break;
                    itemComposition = FaceNormal.ItemDefinition_get(n6);
                    break;
                }
                if (n2 >= itemComposition.countco[n7] && itemComposition.countco[n7] != 0) {
                    n6 = itemComposition.countobj[n7];
                }
                ++n7;
            }
        }
        if ((model = itemComposition.getModel(1)) == null) {
            return null;
        }
        SpritePixels spritePixels2 = null;
        if (itemComposition.noteTemplate == -1 ? (itemComposition.notedId == -1 ? itemComposition.placeholderTemplate != -1 && (spritePixels2 = class380.getItemSprite(itemComposition.placeholder, n2, 0, 0, 0, false)) == null : (spritePixels2 = class380.getItemSprite(itemComposition.unnotedId, n2, n3, n4, 0, false)) == null) : (spritePixels2 = class380.getItemSprite(itemComposition.note, 10, 1, 0, 0, true)) == null) {
            return null;
        }
        int[] nArray = Rasterizer2D.Rasterizer2D_pixels;
        int n8 = Rasterizer2D.Rasterizer2D_width;
        int n9 = Rasterizer2D.Rasterizer2D_height;
        float[] fArray = Rasterizer2D.field5544;
        int[] nArray2 = new int[4];
        Rasterizer2D.Rasterizer2D_getClipArray(nArray2);
        spritePixels = new SpritePixels(36, 32);
        SceneTileModel.method4016(spritePixels.pixels, 36, 32, null);
        Rasterizer2D.Rasterizer2D_clear();
        SceneTileModel.method4071();
        SceneTileModel.method4020(16, 16);
        SceneTileModel.field1957.field2290 = false;
        if (itemComposition.placeholderTemplate != -1) {
            spritePixels2.drawTransBgAt(0, 0);
        }
        int n10 = itemComposition.zoom2d;
        if (bl) {
            n10 = (int)((double)n10 * 1.5);
        } else if (n3 == 2) {
            n10 = (int)((double)n10 * 1.04);
        }
        int n11 = n10 * SceneTileModel.field1954[itemComposition.xan2d] >> 16;
        int n12 = n10 * SceneTileModel.Rasterizer3D_cosine[itemComposition.xan2d] >> 16;
        model.calculateBoundsCylinder();
        model.method4561(0, itemComposition.yan2d, itemComposition.zan2d, itemComposition.xan2d, itemComposition.offsetX2d, model.height / 2 + n11 + itemComposition.offsetY2d, n12 + itemComposition.offsetY2d);
        if (itemComposition.notedId != -1) {
            spritePixels2.drawTransBgAt(0, 0);
        }
        if (n3 >= 1) {
            spritePixels.outline(1);
        }
        if (n3 >= 2) {
            spritePixels.outline(0xFFFFFF);
        }
        if (n4 != 0) {
            spritePixels.shadow(n4);
        }
        SceneTileModel.method4016(spritePixels.pixels, 36, 32, null);
        if (itemComposition.noteTemplate != -1) {
            spritePixels2.drawTransBgAt(0, 0);
        }
        if (n5 == 1 || n5 == 2 && itemComposition.isStackable == 1) {
            DesktopPlatformInfoProvider.field5179.draw(class212.method4858(n2), 0, 9, 0xFFFF00, 1);
        }
        if (!bl) {
            ItemComposition.ItemDefinition_cachedSprites.put(spritePixels, l);
        }
        SceneTileModel.method4016(nArray, n8, n9, fArray);
        Rasterizer2D.Rasterizer2D_setClipArray(nArray2);
        SceneTileModel.method4071();
        SceneTileModel.field1957.field2290 = true;
        return spritePixels;
    }

    @ObfuscatedName(value="ob")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1128240649")
    static void method7644() {
        Client.packetWriter.addNode(ScriptEvent.getPacketBufferNode(ClientPacket.field3365, Client.packetWriter.isaacCipher));
        Client.titleLoadingStage = 0;
    }
}

