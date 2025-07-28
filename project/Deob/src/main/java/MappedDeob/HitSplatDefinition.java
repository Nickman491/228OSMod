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

@ObfuscatedName(value="kd")
@Implements(value="HitSplatDefinition")
public class HitSplatDefinition
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="HitSplatDefinition_archive")
    static AbstractArchive HitSplatDefinition_archive;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpq;")
    static AbstractArchive field2751;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="HitSplatDefinition_fontsArchive")
    static AbstractArchive HitSplatDefinition_fontsArchive;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="HitSplatDefinition_cached")
    public static EvictingDualNodeHashTable HitSplatDefinition_cached;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static EvictingDualNodeHashTable field2754;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="HitSplatDefinition_cachedFonts")
    public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
    @ObfuscatedName(value="ft")
    @ObfuscatedSignature(descriptor="Lok;")
    static Archive field2777;
    @ObfuscatedName(value="vc")
    @ObfuscatedSignature(descriptor="Lpa;")
    static class392 field2760;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=1508234575)
    @Export(value="fontId")
    int fontId = -1;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-1584396285)
    @Export(value="textColor")
    public int textColor = 0xFFFFFF;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-1551936187)
    public int field2773 = 70;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-1841557453)
    int field2758 = -1;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-425735521)
    int field2762 = -1;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=271682969)
    int field2763 = -1;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=1963234727)
    int field2767 = -1;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=1270620965)
    public int field2757 = 0;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=-1979431219)
    public int field2759 = 0;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=768545391)
    public int field2764 = -1;
    @ObfuscatedName(value="ar")
    String field2768 = "";
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=-751369181)
    public int field2769 = -1;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=2052084467)
    public int field2770 = 0;
    @ObfuscatedName(value="ab")
    @Export(value="transforms")
    public int[] transforms;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-390406083)
    @Export(value="transformVarbit")
    int transformVarbit = -1;
    @ObfuscatedName(value="bu")
    @ObfuscatedGetter(intValue=2112634023)
    @Export(value="transformVarp")
    int transformVarp = -1;

    static {
        HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
        field2754 = new EvictingDualNodeHashTable(64);
        HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
    }

    HitSplatDefinition() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-239192483")
    @Export(value="decode")
    void decode(Buffer buffer) {
        int n;
        while ((n = buffer.readUnsignedByte()) != 0) {
            this.decodeNext(buffer, n);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="2033650103")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        if (n == 1) {
            this.fontId = buffer.method10476();
            return;
        }
        if (n == 2) {
            this.textColor = buffer.readMedium();
            return;
        }
        if (n == 3) {
            this.field2758 = buffer.method10476();
            return;
        }
        if (n == 4) {
            this.field2763 = buffer.method10476();
            return;
        }
        if (n == 5) {
            this.field2762 = buffer.method10476();
            return;
        }
        if (n == 6) {
            this.field2767 = buffer.method10476();
            return;
        }
        if (n == 7) {
            this.field2757 = buffer.readShort();
            return;
        }
        if (n == 8) {
            this.field2768 = buffer.readStringCp1252NullCircumfixed();
            return;
        }
        if (n == 9) {
            this.field2773 = buffer.readUnsignedShort();
            return;
        }
        if (n == 10) {
            this.field2759 = buffer.readShort();
            return;
        }
        if (n == 11) {
            this.field2764 = 0;
            return;
        }
        if (n == 12) {
            this.field2769 = buffer.readUnsignedByte();
            return;
        }
        if (n == 13) {
            this.field2770 = buffer.readShort();
            return;
        }
        if (n == 14) {
            this.field2764 = buffer.readUnsignedShort();
            return;
        }
        if (n != 17 && n != 18) return;
        this.transformVarbit = buffer.readUnsignedShort();
        if (this.transformVarbit == 65535) {
            this.transformVarbit = -1;
        }
        this.transformVarp = buffer.readUnsignedShort();
        if (this.transformVarp == 65535) {
            this.transformVarp = -1;
        }
        int n2 = -1;
        if (n == 18 && (n2 = buffer.readUnsignedShort()) == 65535) {
            n2 = -1;
        }
        int n3 = buffer.readUnsignedByte();
        this.transforms = new int[n3 + 2];
        int n4 = 0;
        while (true) {
            if (n4 > n3) {
                this.transforms[n3 + 1] = n2;
                return;
            }
            this.transforms[n4] = buffer.readUnsignedShort();
            if (this.transforms[n4] == 65535) {
                this.transforms[n4] = -1;
            }
            ++n4;
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)Lkd;", garbageValue="1483625755")
    @Export(value="transform")
    public final HitSplatDefinition transform() {
        int n = -1;
        if (this.transformVarbit != -1) {
            n = class77.getVarbit(this.transformVarbit);
        } else if (this.transformVarp != -1) {
            n = Varps.Varps_main[this.transformVarp];
        }
        int n2 = n >= 0 && n < this.transforms.length - 1 ? this.transforms[n] : this.transforms[this.transforms.length - 1];
        if (n2 != -1) {
            return class183.method4104(n2);
        }
        return null;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IB)Ljava/lang/String;", garbageValue="-1")
    @Export(value="getString")
    public String getString(int n) {
        String string = this.field2768;
        int n2;
        while ((n2 = string.indexOf("%1")) >= 0) {
            string = string.substring(0, n2) + PlayerType.intToString(n, false) + string.substring(n2 + 2);
        }
        return string;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)Lvf;", garbageValue="-1228108972")
    public SpritePixels method5475() {
        if (this.field2758 < 0) {
            return null;
        }
        SpritePixels spritePixels = (SpritePixels)field2754.get(this.field2758);
        if (spritePixels != null) {
            return spritePixels;
        }
        spritePixels = ChatChannel.SpriteBuffer_getSprite(field2751, this.field2758, 0);
        if (spritePixels != null) {
            field2754.put(spritePixels, this.field2758);
        }
        return spritePixels;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)Lvf;", garbageValue="1188272615")
    public SpritePixels method5496() {
        if (this.field2762 < 0) {
            return null;
        }
        SpritePixels spritePixels = (SpritePixels)field2754.get(this.field2762);
        if (spritePixels != null) {
            return spritePixels;
        }
        spritePixels = ChatChannel.SpriteBuffer_getSprite(field2751, this.field2762, 0);
        if (spritePixels != null) {
            field2754.put(spritePixels, this.field2762);
        }
        return spritePixels;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)Lvf;", garbageValue="1647383178")
    public SpritePixels method5490() {
        if (this.field2763 < 0) {
            return null;
        }
        SpritePixels spritePixels = (SpritePixels)field2754.get(this.field2763);
        if (spritePixels != null) {
            return spritePixels;
        }
        spritePixels = ChatChannel.SpriteBuffer_getSprite(field2751, this.field2763, 0);
        if (spritePixels != null) {
            field2754.put(spritePixels, this.field2763);
        }
        return spritePixels;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(I)Lvf;", garbageValue="1310089348")
    public SpritePixels method5481() {
        if (this.field2767 < 0) {
            return null;
        }
        SpritePixels spritePixels = (SpritePixels)field2754.get(this.field2767);
        if (spritePixels != null) {
            return spritePixels;
        }
        spritePixels = ChatChannel.SpriteBuffer_getSprite(field2751, this.field2767, 0);
        if (spritePixels != null) {
            field2754.put(spritePixels, this.field2767);
        }
        return spritePixels;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(I)Lqw;", garbageValue="-1075044673")
    @Export(value="getFont")
    public Font getFont() {
        Font font;
        if (this.fontId == -1) {
            return null;
        }
        Font font2 = (Font)HitSplatDefinition_cachedFonts.get(this.fontId);
        if (font2 != null) {
            return font2;
        }
        AbstractArchive abstractArchive = field2751;
        AbstractArchive abstractArchive2 = HitSplatDefinition_fontsArchive;
        int n = this.fontId;
        if (WorldMapSprite.method6397(abstractArchive, n, 0)) {
            Font font3;
            byte[] byArray = abstractArchive2.takeFile(n, 0);
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
            font = font3;
        } else {
            font = null;
        }
        font2 = font;
        if (font2 != null) {
            HitSplatDefinition_cachedFonts.put(font2, this.fontId);
        }
        return font2;
    }
}

