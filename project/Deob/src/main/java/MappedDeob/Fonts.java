/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="us")
@Implements(value="Fonts")
public class Fonts {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="spritesArchive")
    AbstractArchive spritesArchive;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="fontsArchive")
    AbstractArchive fontsArchive;
    @ObfuscatedName(value="az")
    @Export(value="map")
    HashMap map;

    @ObfuscatedSignature(descriptor="(Lpq;Lpq;)V")
    public Fonts(AbstractArchive abstractArchive, AbstractArchive abstractArchive2) {
        this.spritesArchive = abstractArchive;
        this.fontsArchive = abstractArchive2;
        this.map = new HashMap();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([Lun;I)Ljava/util/HashMap;", garbageValue="-455222829")
    @Export(value="createMap")
    public HashMap createMap(FontName[] fontNameArray) {
        HashMap<FontName, Font> hashMap = new HashMap<FontName, Font>();
        FontName[] fontNameArray2 = fontNameArray;
        int n = 0;
        while (n < fontNameArray2.length) {
            FontName fontName = fontNameArray2[n];
            if (!this.map.containsKey(fontName)) {
                Font font;
                AbstractArchive abstractArchive = this.spritesArchive;
                AbstractArchive abstractArchive2 = this.fontsArchive;
                String string = fontName.name;
                if (abstractArchive.isValidFileName(string, "")) {
                    Font font2;
                    int n2;
                    int n3 = abstractArchive.getGroupId(string);
                    if (WorldMapSprite.method6397(abstractArchive, n3, n2 = abstractArchive.getFileId(n3, ""))) {
                        Font font3;
                        byte[] byArray = abstractArchive2.takeFile(n3, n2);
                        if (byArray != null) {
                            Font font4 = new Font(byArray, class241.SpriteBuffer_xOffsets, class571.SpriteBuffer_yOffsets, class571.SpriteBuffer_spriteWidths, class403.SpriteBuffer_spriteHeights, KeyHandler.SpriteBuffer_spritePalette, class240.SpriteBuffer_pixels);
                            class241.SpriteBuffer_xOffsets = null;
                            class571.SpriteBuffer_yOffsets = null;
                            class571.SpriteBuffer_spriteWidths = null;
                            class403.SpriteBuffer_spriteHeights = null;
                            KeyHandler.SpriteBuffer_spritePalette = null;
                            class240.SpriteBuffer_pixels = null;
                            font3 = font4;
                        } else {
                            font3 = null;
                        }
                        font2 = font3;
                    } else {
                        font2 = null;
                    }
                    font = font2;
                } else {
                    font = null;
                }
                Font font5 = font;
                if (font5 != null) {
                    this.map.put(fontName, font5);
                    hashMap.put(fontName, font5);
                }
            } else {
                hashMap.put(fontName, (Font)this.map.get(fontName));
            }
            ++n;
        }
        return hashMap;
    }
}

