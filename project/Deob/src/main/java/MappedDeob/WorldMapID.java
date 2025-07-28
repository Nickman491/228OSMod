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
import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="lw")
@Implements(value="WorldMapID")
public class WorldMapID {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Llw;")
    static final WorldMapID field3247 = new WorldMapID(0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Llw;")
    static final WorldMapID field3241 = new WorldMapID(1);
    @ObfuscatedName(value="ae")
    static int[][] field3244;
    @ObfuscatedName(value="ax")
    static ThreadPoolExecutor field3245;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-112446325)
    @Export(value="value")
    final int value;

    WorldMapID(int n) {
        this.value = n;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIIII)[I", garbageValue="2004102191")
    static int[] method6402(int n, int n2, int n3, int n4, int n5) {
        int n6;
        int[] nArray = new int[256];
        for (n6 = 0; n6 < 64; ++n6) {
            nArray[n6] = class135.method3445(n, n2, n6);
        }
        for (n6 = 0; n6 < 64; ++n6) {
            nArray[n6 + 64] = class135.method3445(n2, n3, n6);
        }
        for (n6 = 0; n6 < 64; ++n6) {
            nArray[n6 + 128] = class135.method3445(n3, n4, n6);
        }
        for (n6 = 0; n6 < 64; ++n6) {
            nArray[n6 + 192] = class135.method3445(n4, n5, n6);
        }
        return nArray;
    }
}

