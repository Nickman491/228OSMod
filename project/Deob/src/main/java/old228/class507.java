package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="tt")
public class class507 {
    @ObfuscatedName(value="aq")
    static final int[] field5154 = new int[2048];
    @ObfuscatedName(value="af")
    static final int[] field5153 = new int[2048];

    static {
        double d = 0.0030679615757712823;
        int n = 0;
        while (n < 2048) {
            class507.field5154[n] = (int)(65536.0 * Math.sin(d * (double)n));
            class507.field5153[n] = (int)(65536.0 * Math.cos((double)n * d));
            ++n;
        }
        return;
    }
}

