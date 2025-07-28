/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="in")
@Implements(value="JagexCache")
public class JagexCache {
    @ObfuscatedName(value="ao")
    static File field2389;
    @ObfuscatedName(value="ad")
    @Export(value="cacheDir")
    static File cacheDir;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Luc;")
    @Export(value="JagexCache_randomDat")
    public static BufferedFile JagexCache_randomDat;
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Luc;")
    @Export(value="JagexCache_dat2File")
    public static BufferedFile JagexCache_dat2File;
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Luc;")
    @Export(value="JagexCache_idx255File")
    public static BufferedFile JagexCache_idx255File;

    static {
        JagexCache_randomDat = null;
        JagexCache_dat2File = null;
        JagexCache_idx255File = null;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1315514448")
    static void method4938(int n) {
        ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.get(n);
        if (itemContainer == null) {
            return;
        }
        itemContainer.remove();
    }
}

