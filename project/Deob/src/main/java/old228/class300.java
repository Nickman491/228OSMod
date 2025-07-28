package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="lc")
public class class300 {
    @ObfuscatedName(value="ay")
    public static int method6411(int n, double d) {
        double d2 = (double)(n >> 16 & 0xFF) / 256.0;
        double d3 = (double)(n >> 8 & 0xFF) / 256.0;
        double d4 = (double)(n & 0xFF) / 256.0;
        d2 = Math.pow(d2, d);
        d3 = Math.pow(d3, d);
        d4 = Math.pow(d4, d);
        int n2 = (int)(d2 * 256.0);
        int n3 = (int)(d3 * 256.0);
        int n4 = (int)(256.0 * d4);
        return n4 + (n3 << 8) + (n2 << 16) + -16777216;
    }
}

