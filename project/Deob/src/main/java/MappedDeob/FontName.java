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

@ObfuscatedName(value="un")
@Implements(value="FontName")
public class FontName {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lun;")
    @Export(value="FontName_plain11")
    public static final FontName FontName_plain11 = new FontName("p11_full");
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lun;")
    @Export(value="FontName_plain12")
    public static final FontName FontName_plain12 = new FontName("p12_full");
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lun;")
    @Export(value="FontName_bold12")
    public static final FontName FontName_bold12 = new FontName("b12_full");
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lun;")
    @Export(value="FontName_verdana11")
    public static final FontName FontName_verdana11 = new FontName("verdana_11pt_regular");
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lun;")
    @Export(value="FontName_verdana13")
    public static final FontName FontName_verdana13 = new FontName("verdana_13pt_regular");
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lun;")
    @Export(value="FontName_verdana15")
    public static final FontName FontName_verdana15 = new FontName("verdana_15pt_regular");
    @ObfuscatedName(value="au")
    public static short[] field5323;
    @ObfuscatedName(value="gn")
    @Export(value="worldHost")
    static String worldHost;
    @ObfuscatedName(value="ig")
    @ObfuscatedSignature(descriptor="Lqw;")
    static Font field5319;
    @ObfuscatedName(value="ae")
    @Export(value="name")
    String name;

    FontName(String string) {
        this.name = string;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Lun;", garbageValue="-1551767491")
    public static FontName[] method9935() {
        return new FontName[]{FontName_verdana13, FontName_plain12, FontName_verdana11, FontName_verdana15, FontName_bold12, FontName_plain11};
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-1973306811")
    public static int method9937(int n) {
        long l = ViewportMouse.ViewportMouse_entityTags[n];
        int n2 = (int)(l >>> 14 & 3L);
        return n2;
    }

    @ObfuscatedName(value="li")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;Ljava/lang/String;IIIIIII)V", garbageValue="-127263735")
    static final void method9934(int n, String string, String string2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (Client.isMenuOpen) {
            return;
        }
        if (!AbstractWorldMapIcon.method6465(n7, n2)) {
            return;
        }
        if (n >= 0 && n < Client.field648.field5623.length) {
            if (Client.field648.field5623[n] == null) {
                Client.field648.field5623[n] = new class575(false);
            }
            Client.field648.field5623[n].method10927(string, string2, n2, n3, n4, n5, n6, false, n7);
            return;
        }
    }

    @ObfuscatedName(value="lh")
    @ObfuscatedSignature(descriptor="(IB)Ljava/lang/String;", garbageValue="-5")
    @Export(value="formatItemStacks")
    static final String formatItemStacks(int n) {
        String string = Integer.toString(n);
        int n2 = string.length() - 3;
        while (true) {
            if (n2 <= 0) {
                if (string.length() > 9) {
                    return " " + class97.colorStartTag(65408) + string.substring(0, string.length() - 8) + "M" + " " + " (" + string + ")" + "</col>";
                }
                if (string.length() > 6) {
                    return " " + class97.colorStartTag(0xFFFFFF) + string.substring(0, string.length() - 4) + "K" + " " + " (" + string + ")" + "</col>";
                }
                return " " + class97.colorStartTag(0xFFFF00) + string + "</col>";
            }
            string = string.substring(0, n2) + "," + string.substring(n2);
            n2 -= 3;
        }
    }

    @ObfuscatedName(value="nq")
    @ObfuscatedSignature(descriptor="(IIIILvf;Lnf;B)V", garbageValue="1")
    @Export(value="drawSpriteOnMinimap")
    static final void drawSpriteOnMinimap(int n, int n2, int n3, int n4, SpritePixels spritePixels, SpriteMask spriteMask) {
        if (spritePixels == null) {
            return;
        }
        int n5 = Client.camAngleY & 0x7FF;
        int n6 = n4 * n4 + n3 * n3;
        if (n6 > 6400) {
            return;
        }
        int n7 = SceneTileModel.field1954[n5];
        int n8 = SceneTileModel.Rasterizer3D_cosine[n5];
        int n9 = n8 * n3 + n4 * n7 >> 16;
        int n10 = n4 * n8 - n7 * n3 >> 16;
        if (n6 > 2500) {
            spritePixels.method10758(n9 + spriteMask.width / 2 - spritePixels.width / 2, spriteMask.height / 2 - n10 - spritePixels.height / 2, n, n2, spriteMask.width, spriteMask.height, spriteMask.xStarts, spriteMask.xWidths);
        } else {
            spritePixels.drawTransBgAt(n + n9 + spriteMask.width / 2 - spritePixels.width / 2, spriteMask.height / 2 + n2 - n10 - spritePixels.height / 2);
        }
    }
}

