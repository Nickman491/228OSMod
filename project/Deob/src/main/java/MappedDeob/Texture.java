/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gh")
@Implements(value="Texture")
public class Texture
extends Node {
    @ObfuscatedName(value="aa")
    @Export(value="Texture_animatedPixels")
    static int[] Texture_animatedPixels;
    @ObfuscatedName(value="ad")
    @Export(value="averageRGB")
    int averageRGB;
    @ObfuscatedName(value="an")
    boolean field1907;
    @ObfuscatedName(value="ae")
    @Export(value="fileIds")
    int[] fileIds;
    @ObfuscatedName(value="ax")
    int[] field1909;
    @ObfuscatedName(value="at")
    int[] field1905;
    @ObfuscatedName(value="ac")
    int[] field1911;
    @ObfuscatedName(value="au")
    @Export(value="animationDirection")
    int animationDirection;
    @ObfuscatedName(value="as")
    @Export(value="animationSpeed")
    int animationSpeed;
    @ObfuscatedName(value="aq")
    @Export(value="pixels")
    int[] pixels;
    @ObfuscatedName(value="af")
    @Export(value="isLoaded")
    boolean isLoaded = false;

    @ObfuscatedSignature(descriptor="(Lvy;)V")
    Texture(Buffer buffer) {
        this.averageRGB = buffer.readUnsignedShort();
        this.field1907 = buffer.readUnsignedByte() == 1;
        int n = buffer.readUnsignedByte();
        if (n >= 1 && n <= 4) {
            int n2;
            this.fileIds = new int[n];
            for (n2 = 0; n2 < n; ++n2) {
                this.fileIds[n2] = buffer.readUnsignedShort();
            }
            if (n > 1) {
                this.field1909 = new int[n - 1];
                for (n2 = 0; n2 < n - 1; ++n2) {
                    this.field1909[n2] = buffer.readUnsignedByte();
                }
            }
            if (n > 1) {
                this.field1905 = new int[n - 1];
                for (n2 = 0; n2 < n - 1; ++n2) {
                    this.field1905[n2] = buffer.readUnsignedByte();
                }
            }
            this.field1911 = new int[n];
            for (n2 = 0; n2 < n; ++n2) {
                this.field1911[n2] = buffer.readInt();
            }
            this.animationDirection = buffer.readUnsignedByte();
            this.animationSpeed = buffer.readUnsignedByte();
            this.pixels = null;
            return;
        }
        throw new RuntimeException();
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(DILpq;)Z")
    @Export(value="load")
    boolean load(double d, int n, AbstractArchive abstractArchive) {
        int n2 = 0;
        while (true) {
            if (n2 >= this.fileIds.length) break;
            if (abstractArchive.getFileFlat(this.fileIds[n2]) == null) {
                return false;
            }
            ++n2;
        }
        n2 = n * n;
        this.pixels = new int[n2];
        int n3 = 0;
        while (true) {
            int n4;
            block21: {
                int n5;
                int n6;
                int[] nArray;
                Object object;
                block26: {
                    block25: {
                        int n7;
                        block23: {
                            Object object2;
                            block24: {
                                block22: {
                                    Object object3;
                                    if (n3 >= this.fileIds.length) {
                                        return true;
                                    }
                                    int n8 = this.fileIds[n3];
                                    if (!WorldMapEvent.method6538(abstractArchive, n8)) {
                                        object3 = null;
                                    } else {
                                        object = new IndexedSprite();
                                        ((IndexedSprite)object).width = class571.SpriteBuffer_spriteWidth;
                                        ((IndexedSprite)object).height = class174.SpriteBuffer_spriteHeight;
                                        ((IndexedSprite)object).xOffset = class241.SpriteBuffer_xOffsets[0];
                                        ((IndexedSprite)object).yOffset = class571.SpriteBuffer_yOffsets[0];
                                        ((IndexedSprite)object).subWidth = class571.SpriteBuffer_spriteWidths[0];
                                        ((IndexedSprite)object).subHeight = class403.SpriteBuffer_spriteHeights[0];
                                        ((IndexedSprite)object).palette = KeyHandler.SpriteBuffer_spritePalette;
                                        ((IndexedSprite)object).pixels = class240.SpriteBuffer_pixels[0];
                                        class241.SpriteBuffer_xOffsets = null;
                                        class571.SpriteBuffer_yOffsets = null;
                                        class571.SpriteBuffer_spriteWidths = null;
                                        class403.SpriteBuffer_spriteHeights = null;
                                        KeyHandler.SpriteBuffer_spritePalette = null;
                                        class240.SpriteBuffer_pixels = null;
                                        object3 = object2 = object;
                                    }
                                    object2 = object3;
                                    ((IndexedSprite)object2).normalize();
                                    object = ((IndexedSprite)object2).pixels;
                                    nArray = ((IndexedSprite)object2).palette;
                                    int n9 = this.field1911[n3];
                                    if ((n9 & 0xFF000000) == 0x1000000) {
                                        // empty if block
                                    }
                                    if ((n9 & 0xFF000000) == 0x2000000) {
                                        // empty if block
                                    }
                                    if ((n9 & 0xFF000000) == 0x3000000) {
                                        n4 = n9 & 0xFF00FF;
                                        n7 = n9 >> 8 & 0xFF;
                                        for (n6 = 0; n6 < nArray.length; ++n6) {
                                            n5 = nArray[n6];
                                            if (n5 >> 8 != (n5 & 0xFFFF)) continue;
                                            nArray[n6] = n4 * (n5 &= 0xFF) >> 8 & 0xFF00FF | n7 * n5 & 0xFF00;
                                        }
                                    }
                                    for (n4 = 0; n4 < nArray.length; ++n4) {
                                        nArray[n4] = SceneTileModel.method4006(nArray[n4], d);
                                    }
                                    n4 = n3 == 0 ? 0 : this.field1909[n3 - 1];
                                    if (n4 != 0) break block21;
                                    if (n != ((IndexedSprite)object2).subWidth) break block22;
                                    break block23;
                                }
                                if (((IndexedSprite)object2).subWidth != 64 || n != 128) break block24;
                                n7 = 0;
                                break block25;
                            }
                            if (((IndexedSprite)object2).subWidth != 128 || n != 64) throw new RuntimeException();
                            n7 = 0;
                            break block26;
                        }
                        for (n7 = 0; n7 < n2; ++n7) {
                            this.pixels[n7] = nArray[object[n7] & 0xFF];
                        }
                        break block21;
                    }
                    for (n6 = 0; n6 < n; ++n6) {
                        for (n5 = 0; n5 < n; ++n5) {
                            this.pixels[n7++] = nArray[object[(n6 >> 1 << 6) + (n5 >> 1)] & 0xFF];
                        }
                    }
                    break block21;
                }
                for (n6 = 0; n6 < n; ++n6) {
                    for (n5 = 0; n5 < n; ++n5) {
                        this.pixels[n7++] = nArray[object[(n5 << 1) + (n6 << 1 << 7)] & 0xFF];
                    }
                }
            }
            if (n4 == 1) {
                // empty if block
            }
            if (n4 == 2) {
                // empty if block
            }
            if (n4 == 3) {
                // empty if block
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="ah")
    @Export(value="reset")
    void reset() {
        this.pixels = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="az")
    @Export(value="animate")
    void animate(int n) {
        int[] nArray;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        if (this.pixels == null) {
            return;
        }
        if (this.animationDirection == 1 || this.animationDirection == 3) {
            if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) {
                Texture_animatedPixels = new int[this.pixels.length];
            }
            n7 = this.pixels.length == 4096 ? 64 : 128;
            n6 = this.pixels.length;
            n5 = n7 * this.animationSpeed * n;
            n4 = n6 - 1;
            if (this.animationDirection == 1) {
                n5 = -n5;
            }
            for (n3 = 0; n3 < n6; ++n3) {
                n2 = n3 + n5 & n4;
                Texture.Texture_animatedPixels[n3] = this.pixels[n2];
            }
            nArray = this.pixels;
            this.pixels = Texture_animatedPixels;
            Texture_animatedPixels = nArray;
        }
        if (this.animationDirection != 2 && this.animationDirection != 4) return;
        if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) {
            Texture_animatedPixels = new int[this.pixels.length];
        }
        n7 = this.pixels.length == 4096 ? 64 : 128;
        n6 = this.pixels.length;
        n5 = this.animationSpeed * n;
        n4 = n7 - 1;
        if (this.animationDirection == 2) {
            n5 = -n5;
        }
        n3 = 0;
        while (true) {
            if (n3 < n6) {
            } else {
                nArray = this.pixels;
                this.pixels = Texture_animatedPixels;
                Texture_animatedPixels = nArray;
                return;
            }
            for (n2 = 0; n2 < n7; ++n2) {
                int n8 = n3 + n2;
                int n9 = n3 + (n2 + n5 & n4);
                Texture.Texture_animatedPixels[n8] = this.pixels[n9];
            }
            n3 += n7;
        }
    }
}

