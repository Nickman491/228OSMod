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

@ObfuscatedName(value="ld")
@Implements(value="WorldMapSprite")
public final class WorldMapSprite {
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=1399333337)
    static int field3231;
    @ObfuscatedName(value="ah")
    @Export(value="tileColors")
    final int[] tileColors;

    WorldMapSprite() {
        this.tileColors = new int[4096];
    }

    WorldMapSprite(int[] nArray) {
        this.tileColors = nArray;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="1508282537")
    @Export(value="getTileColor")
    final int getTileColor(int n, int n2) {
        return this.tileColors[n + n2 * 64];
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lpq;III)Z", garbageValue="761771961")
    public static boolean method6397(AbstractArchive abstractArchive, int n, int n2) {
        byte[] byArray = abstractArchive.takeFile(n, n2);
        if (byArray == null) {
            return false;
        }
        class443.SpriteBuffer_decode(byArray);
        return true;
    }
}

