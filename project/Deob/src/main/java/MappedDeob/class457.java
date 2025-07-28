/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="rn")
public class class457 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(B)[Lvf;", garbageValue="-81")
    static SpritePixels[] method8965() {
        SpritePixels[] spritePixelsArray = new SpritePixels[class571.SpriteBuffer_spriteCount];
        int n = 0;
        while (true) {
            if (n >= class571.SpriteBuffer_spriteCount) {
                class241.SpriteBuffer_xOffsets = null;
                class571.SpriteBuffer_yOffsets = null;
                class571.SpriteBuffer_spriteWidths = null;
                class403.SpriteBuffer_spriteHeights = null;
                KeyHandler.SpriteBuffer_spritePalette = null;
                class240.SpriteBuffer_pixels = null;
                return spritePixelsArray;
            }
            SpritePixels spritePixels = spritePixelsArray[n] = new SpritePixels();
            spritePixels.width = class571.SpriteBuffer_spriteWidth;
            spritePixels.height = class174.SpriteBuffer_spriteHeight;
            spritePixels.xOffset = class241.SpriteBuffer_xOffsets[n];
            spritePixels.yOffset = class571.SpriteBuffer_yOffsets[n];
            spritePixels.subWidth = class571.SpriteBuffer_spriteWidths[n];
            spritePixels.subHeight = class403.SpriteBuffer_spriteHeights[n];
            int n2 = spritePixels.subHeight * spritePixels.subWidth;
            byte[] byArray = class240.SpriteBuffer_pixels[n];
            spritePixels.pixels = new int[n2];
            for (int i = 0; i < n2; ++i) {
                spritePixels.pixels[i] = KeyHandler.SpriteBuffer_spritePalette[byArray[i] & 0xFF];
            }
            ++n;
        }
    }
}

