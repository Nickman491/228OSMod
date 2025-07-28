package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ha")
public final class class206 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1837012129)
    int field2316;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1884426115)
    int field2314;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=506114547)
    int field2315;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1738243283)
    int field2322;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=1084924095)
    int field2313;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lhs;")
    public class190 field2318;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lhs;")
    public class190 field2319;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(longValue=-4333333370256334569L)
    public long field2320 = 0L;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=1069251799)
    int field2321 = 0;

    class206() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="-57")
    public static int method4809(int n) {
        n = (n & 0x55555555) + (n >>> 1 & 0x55555555);
        n = (n >>> 2 & 0x33333333) + (n & 0x33333333);
        n = n + (n >>> 4) & 0xF0F0F0F;
        n = (n >>> 8) + n;
        n += n >>> 16;
        return n & 0xFF;
    }
}

