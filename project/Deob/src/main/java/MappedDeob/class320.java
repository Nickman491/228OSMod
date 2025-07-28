/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="mv")
public class class320 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-1617562708")
    @Export(value="iLog")
    public static int iLog(int n) {
        int n2 = 0;
        if (n < 0 || n >= 65536) {
            n >>>= 16;
            n2 += 16;
        }
        if (n >= 256) {
            n >>>= 8;
            n2 += 8;
        }
        if (n >= 16) {
            n >>>= 4;
            n2 += 4;
        }
        if (n >= 4) {
            n >>>= 2;
            n2 += 2;
        }
        if (n >= 1) {
            n >>>= 1;
            ++n2;
        }
        return n + n2;
    }
}

