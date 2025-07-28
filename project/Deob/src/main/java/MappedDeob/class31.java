/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.applet.Applet;
import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bd")
public class class31 {
    @ObfuscatedName(value="ay")
    static Applet field138 = null;
    @ObfuscatedName(value="ah")
    static String field137 = "";
    @ObfuscatedName(value="kz")
    @ObfuscatedGetter(intValue=-2011348113)
    @Export(value="cameraZ")
    static int cameraZ;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIB)I", garbageValue="98")
    static int method496(int n, int n2) {
        FloorOverlayDefinition floorOverlayDefinition;
        FloorOverlayDefinition floorOverlayDefinition2 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get(n);
        if (floorOverlayDefinition2 == null) {
            byte[] byArray = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, n);
            floorOverlayDefinition2 = new FloorOverlayDefinition();
            if (byArray != null) {
                floorOverlayDefinition2.decode(new Buffer(byArray), n);
            }
            floorOverlayDefinition2.postDecode();
            FloorOverlayDefinition.FloorOverlayDefinition_cached.put(floorOverlayDefinition2, n);
            floorOverlayDefinition = floorOverlayDefinition2;
        } else {
            floorOverlayDefinition = floorOverlayDefinition2;
        }
        floorOverlayDefinition2 = floorOverlayDefinition;
        if (floorOverlayDefinition2 != null) {
            if (floorOverlayDefinition2.secondaryRgb < 0) {
                if (floorOverlayDefinition2.texture < 0) {
                    if (floorOverlayDefinition2.primaryRgb != 0xFF00FF) {
                        int n3 = class166.method3805(floorOverlayDefinition2.hue, floorOverlayDefinition2.saturation, floorOverlayDefinition2.lightness);
                        int n4 = ClanSettings.method3688(n3, 96);
                        return SceneTileModel.Rasterizer3D_colorPalette[n4] | 0xFF000000;
                    }
                    return n2;
                }
                int n5 = ClanSettings.method3688(SceneTileModel.field1957.Rasterizer3D_textureLoader.getAverageTextureRGB(floorOverlayDefinition2.texture), 96);
                return SceneTileModel.Rasterizer3D_colorPalette[n5] | 0xFF000000;
            }
            int n6 = class166.method3805(floorOverlayDefinition2.secondaryHue, floorOverlayDefinition2.secondarySaturation, floorOverlayDefinition2.secondaryLightness);
            int n7 = ClanSettings.method3688(n6, 96);
            return SceneTileModel.Rasterizer3D_colorPalette[n7] | 0xFF000000;
        }
        return n2;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)Ljm;", garbageValue="-70")
    @Export(value="WorldMapElement_get")
    public static WorldMapElement WorldMapElement_get(int n) {
        if (n >= 0 && n < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[n] != null) {
            return WorldMapElement.WorldMapElement_cached[n];
        }
        return new WorldMapElement(n);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;ZB)Luv;", garbageValue="-12")
    @Export(value="getPreferencesFile")
    public static AccessFile getPreferencesFile(String string, String string2, boolean bl) {
        File file = new File(JagexCache.cacheDir, "preferences" + string + ".dat");
        if (file.exists()) {
            try {
                AccessFile accessFile = new AccessFile(file, "rw", 10000L);
                return accessFile;
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        String string3 = "";
        if (class73.cacheGamebuild == 33) {
            string3 = "_rc";
        } else if (class73.cacheGamebuild == 34) {
            string3 = "_wip";
        }
        File file2 = new File(class502.userHomeDirectory, "jagex_" + string2 + "_preferences" + string + string3 + ".dat");
        if (!bl && file2.exists()) {
            try {
                AccessFile accessFile = new AccessFile(file2, "rw", 10000L);
                return accessFile;
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        try {
            AccessFile accessFile = new AccessFile(file, "rw", 10000L);
            return accessFile;
        }
        catch (IOException iOException) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName(value="bo")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-2143778245")
    static int method494(int n, Script script, boolean bl) {
        return 2;
    }
}

