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

@ObfuscatedName(value="wr")
@Implements(value="IsaacCipher")
public final class IsaacCipher {
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1976195467)
    @Export(value="valuesRemaining")
    int valuesRemaining;
    @ObfuscatedName(value="ad")
    @Export(value="results")
    int[] results;
    @ObfuscatedName(value="an")
    @Export(value="mm")
    int[] mm = new int[256];
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=2086706837)
    @Export(value="aa")
    int aa;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1197567597)
    @Export(value="bb")
    int bb;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-455724335)
    @Export(value="cc")
    int cc;

    public IsaacCipher(int[] nArray) {
        this.results = new int[256];
        int n = 0;
        while (true) {
            if (n >= nArray.length) {
                this.method10889();
                return;
            }
            this.results[n] = nArray[n];
            ++n;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-2058853670")
    @Export(value="nextInt")
    public final int nextInt() {
        if (this.valuesRemaining == 0) {
            this.generateMoreResults();
            this.valuesRemaining = 256;
        }
        return this.results[--this.valuesRemaining];
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1664945185")
    public final int method10888() {
        if (this.valuesRemaining == 0) {
            this.generateMoreResults();
            this.valuesRemaining = 256;
        }
        return this.results[this.valuesRemaining - 1];
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-888650300")
    @Export(value="generateMoreResults")
    final void generateMoreResults() {
        this.bb += ++this.cc;
        int n = 0;
        while (n < 256) {
            int n2;
            int n3 = this.mm[n];
            this.aa = (n & 2) != 0 ? ((n & 1) == 0 ? (this.aa ^= this.aa << 2) : (this.aa ^= this.aa >>> 16)) : ((n & 1) == 0 ? (this.aa ^= this.aa << 13) : (this.aa ^= this.aa >>> 6));
            this.aa += this.mm[128 + n & 0xFF];
            this.mm[n] = n2 = this.mm[(n3 & 0x3FC) >> 2] + this.bb + this.aa;
            this.results[n] = this.bb = this.mm[(n2 >> 8 & 0x3FC) >> 2] + n3;
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1680763285")
    final void method10889() {
        int n = -1640531527;
        int n2 = -1640531527;
        int n3 = -1640531527;
        int n4 = -1640531527;
        int n5 = -1640531527;
        int n6 = -1640531527;
        int n7 = -1640531527;
        int n8 = -1640531527;
        int n9 = 0;
        while (true) {
            if (n9 >= 4) {
                n9 = 0;
                while (true) {
                    if (n9 >= 256) {
                        n9 = 0;
                        while (true) {
                            if (n9 >= 256) {
                                this.generateMoreResults();
                                this.valuesRemaining = 256;
                                return;
                            }
                            n8 += this.mm[n9];
                            n7 += this.mm[n9 + 1];
                            n6 = this.mm[n9 + 2] + n6;
                            n5 = this.mm[n9 + 3] + n5;
                            n4 += this.mm[n9 + 4];
                            n3 = this.mm[n9 + 5] + n3;
                            n2 += this.mm[n9 + 6];
                            n = this.mm[n9 + 7] + n;
                            n5 += (n8 ^= n7 << 11);
                            n7 += n6;
                            n4 += (n7 ^= n6 >>> 2);
                            n6 += n5;
                            n3 += (n6 ^= n5 << 8);
                            n5 += n4;
                            n2 += (n5 ^= n4 >>> 16);
                            n4 += n3;
                            n += (n4 ^= n3 << 10);
                            n3 += n2;
                            n8 += (n3 ^= n2 >>> 4);
                            n2 += n;
                            n7 += (n2 ^= n << 8);
                            n += n8;
                            n6 += (n ^= n8 >>> 9);
                            this.mm[n9] = n8 += n7;
                            this.mm[n9 + 1] = n7;
                            this.mm[n9 + 2] = n6;
                            this.mm[n9 + 3] = n5;
                            this.mm[n9 + 4] = n4;
                            this.mm[n9 + 5] = n3;
                            this.mm[n9 + 6] = n2;
                            this.mm[n9 + 7] = n;
                            n9 += 8;
                        }
                    }
                    n8 += this.results[n9];
                    n7 += this.results[n9 + 1];
                    n6 += this.results[n9 + 2];
                    n5 = this.results[n9 + 3] + n5;
                    n4 += this.results[n9 + 4];
                    n3 = this.results[n9 + 5] + n3;
                    n2 += this.results[n9 + 6];
                    n += this.results[n9 + 7];
                    n5 += (n8 ^= n7 << 11);
                    n7 += n6;
                    n4 += (n7 ^= n6 >>> 2);
                    n6 += n5;
                    n3 += (n6 ^= n5 << 8);
                    n5 += n4;
                    n2 += (n5 ^= n4 >>> 16);
                    n4 += n3;
                    n += (n4 ^= n3 << 10);
                    n3 += n2;
                    n8 += (n3 ^= n2 >>> 4);
                    n2 += n;
                    n7 += (n2 ^= n << 8);
                    n += n8;
                    n6 += (n ^= n8 >>> 9);
                    this.mm[n9] = n8 += n7;
                    this.mm[n9 + 1] = n7;
                    this.mm[n9 + 2] = n6;
                    this.mm[n9 + 3] = n5;
                    this.mm[n9 + 4] = n4;
                    this.mm[n9 + 5] = n3;
                    this.mm[n9 + 6] = n2;
                    this.mm[n9 + 7] = n;
                    n9 += 8;
                }
            }
            n5 += (n8 ^= n7 << 11);
            n7 += n6;
            n4 += (n7 ^= n6 >>> 2);
            n6 += n5;
            n3 += (n6 ^= n5 << 8);
            n5 += n4;
            n2 += (n5 ^= n4 >>> 16);
            n4 += n3;
            n += (n4 ^= n3 << 10);
            n3 += n2;
            n8 += (n3 ^= n2 >>> 4);
            n2 += n;
            n7 += (n2 ^= n << 8);
            n += n8;
            n6 += (n ^= n8 >>> 9);
            n8 += n7;
            ++n9;
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(CI)Z", garbageValue="707263185")
    @Export(value="isCharPrintable")
    public static boolean isCharPrintable(char c) {
        if (c >= ' ' && c <= '~') {
            return true;
        }
        if (c >= '\u00a0' && c <= '\u00ff') {
            return true;
        }
        return c == '\u20ac' || c == '\u0152' || c == '\u2014' || c == '\u0153' || c == '\u0178';
        {
        }
    }
}

