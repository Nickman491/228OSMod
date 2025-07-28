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

@ObfuscatedName(value="wt")
@Implements(value="IntHashTable")
public class IntHashTable {
    @ObfuscatedName(value="ay")
    @Export(value="array")
    int[] array;

    public IntHashTable(int[] nArray) {
        int n;
        int n2;
        for (n2 = 1; n2 <= (nArray.length >> 1) + nArray.length; n2 <<= 1) {
        }
        this.array = new int[n2 + n2];
        for (n = 0; n < n2 + n2; ++n) {
            this.array[n] = -1;
        }
        n = 0;
        while (n < nArray.length) {
            int n3 = nArray[n] & n2 - 1;
            while (this.array[n3 + n3 + 1] != -1) {
                n3 = n3 + 1 & n2 - 1;
            }
            this.array[n3 + n3] = nArray[n];
            this.array[n3 + n3 + 1] = n++;
        }
        return;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="2141418339")
    @Export(value="get")
    public int get(int n) {
        int n2 = (this.array.length >> 1) - 1;
        int n3 = n & n2;
        int n4;
        while ((n4 = this.array[n3 + n3 + 1]) != -1) {
            if (this.array[n3 + n3] == n) {
                return n4;
            }
            n3 = n3 + 1 & n2;
        }
        return -1;
    }
}

