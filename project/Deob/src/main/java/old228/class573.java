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

@ObfuscatedName(value="wr")
public final class class573 {
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1976195467)
    int field5595;
    @ObfuscatedName(value="ad")
    int[] field5588;
    @ObfuscatedName(value="an")
    int[] field5592 = new int[256];
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=2086706837)
    int field5593;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1197567597)
    int field5594;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-455724335)
    int field5590;

    public class573(int[] nArray) {
        this.field5588 = new int[256];
        int n = 0;
        while (true) {
            if (n >= nArray.length) {
                this.method10889();
                return;
            }
            this.field5588[n] = nArray[n];
            ++n;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-2058853670")
    public final int method10899() {
        if (this.field5595 == 0) {
            this.method10898();
            this.field5595 = 256;
        }
        return this.field5588[--this.field5595];
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1664945185")
    public final int method10888() {
        if (this.field5595 == 0) {
            this.method10898();
            this.field5595 = 256;
        }
        return this.field5588[this.field5595 - 1];
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-888650300")
    final void method10898() {
        this.field5594 += ++this.field5590;
        int n = 0;
        while (n < 256) {
            int n2;
            int n3 = this.field5592[n];
            this.field5593 = (n & 2) != 0 ? ((n & 1) == 0 ? (this.field5593 ^= this.field5593 << 2) : (this.field5593 ^= this.field5593 >>> 16)) : ((n & 1) == 0 ? (this.field5593 ^= this.field5593 << 13) : (this.field5593 ^= this.field5593 >>> 6));
            this.field5593 += this.field5592[128 + n & 0xFF];
            this.field5592[n] = n2 = this.field5592[(n3 & 0x3FC) >> 2] + this.field5594 + this.field5593;
            this.field5588[n] = this.field5594 = this.field5592[(n2 >> 8 & 0x3FC) >> 2] + n3;
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
                                this.method10898();
                                this.field5595 = 256;
                                return;
                            }
                            n8 += this.field5592[n9];
                            n7 += this.field5592[n9 + 1];
                            n6 = this.field5592[n9 + 2] + n6;
                            n5 = this.field5592[n9 + 3] + n5;
                            n4 += this.field5592[n9 + 4];
                            n3 = this.field5592[n9 + 5] + n3;
                            n2 += this.field5592[n9 + 6];
                            n = this.field5592[n9 + 7] + n;
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
                            this.field5592[n9] = n8 += n7;
                            this.field5592[n9 + 1] = n7;
                            this.field5592[n9 + 2] = n6;
                            this.field5592[n9 + 3] = n5;
                            this.field5592[n9 + 4] = n4;
                            this.field5592[n9 + 5] = n3;
                            this.field5592[n9 + 6] = n2;
                            this.field5592[n9 + 7] = n;
                            n9 += 8;
                        }
                    }
                    n8 += this.field5588[n9];
                    n7 += this.field5588[n9 + 1];
                    n6 += this.field5588[n9 + 2];
                    n5 = this.field5588[n9 + 3] + n5;
                    n4 += this.field5588[n9 + 4];
                    n3 = this.field5588[n9 + 5] + n3;
                    n2 += this.field5588[n9 + 6];
                    n += this.field5588[n9 + 7];
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
                    this.field5592[n9] = n8 += n7;
                    this.field5592[n9 + 1] = n7;
                    this.field5592[n9 + 2] = n6;
                    this.field5592[n9 + 3] = n5;
                    this.field5592[n9 + 4] = n4;
                    this.field5592[n9 + 5] = n3;
                    this.field5592[n9 + 6] = n2;
                    this.field5592[n9 + 7] = n;
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
    public static boolean method10903(char c) {
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

