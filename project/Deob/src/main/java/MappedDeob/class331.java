/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="md")
public class class331 {
    @ObfuscatedName(value="ay")
    static int[] field3612;

    static {
        new Object();
        field3612 = new int[33];
        class331.field3612[0] = 0;
        int n = 2;
        int n2 = 1;
        while (n2 < 33) {
            class331.field3612[n2] = n - 1;
            n += n;
            ++n2;
        }
        return;
    }
}

