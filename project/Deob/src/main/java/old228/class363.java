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

@ObfuscatedName(value="nw")
public class class363 {
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1458099025)
    static int field4034;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=-1493208141)
    public static int field4038;
    @ObfuscatedName(value="ay")
    int[] field4037;
    @ObfuscatedName(value="ah")
    byte[] field4036;
    @ObfuscatedName(value="az")
    int[] field4035;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public class363(byte[] byArray) {
        int n = byArray.length;
        this.field4037 = new int[n];
        this.field4036 = byArray;
        int[] nArray = new int[33];
        this.field4035 = new int[8];
        int n2 = 0;
        int n3 = 0;
        block0: while (n3 < n) {
            boolean bl = true;
            while (true) {
                int n4;
                int n5;
                block19: {
                    block17: {
                        block18: {
                            block15: {
                                block16: {
                                    block13: {
                                        block14: {
                                            int n6;
                                            int n7;
                                            byte by;
                                            block12: {
                                                int n8;
                                                if (!bl || (bl = false)) break block12;
                                                by = byArray[n3];
                                                if (by == 0) break block13;
                                                int n9 = 1 << 32 - by;
                                                this.field4037[n3] = n7 = nArray[by];
                                                if ((n7 & n9) != 0) {
                                                    n8 = nArray[by - 1];
                                                } else {
                                                    n8 = n7 | n9;
                                                    for (n5 = by - 1; n5 >= 1 && n7 == (n4 = nArray[n5]); --n5) {
                                                        n6 = 1 << 32 - n5;
                                                        if ((n4 & n6) != 0) {
                                                            nArray[n5] = nArray[n5 - 1];
                                                            break;
                                                        }
                                                        nArray[n5] = n4 | n6;
                                                    }
                                                }
                                                nArray[by] = n8;
                                                n5 = by + 1;
                                                while (true) {
                                                    if (n5 > 32) break;
                                                    if (n7 == nArray[n5]) {
                                                        nArray[n5] = n8;
                                                    }
                                                    ++n5;
                                                }
                                                n5 = 0;
                                                n4 = 0;
                                            }
                                            if (n4 >= by) break block14;
                                            n6 = Integer.MIN_VALUE >>> n4;
                                            if ((n7 & n6) == 0) break block15;
                                            break block16;
                                        }
                                        this.field4035[n5] = ~n3;
                                        if (n5 >= n2) {
                                            n2 = n5 + 1;
                                        }
                                    }
                                    ++n3;
                                    continue block0;
                                }
                                if (this.field4035[n5] != 0) break block17;
                                break block18;
                            }
                            ++n5;
                            break block19;
                        }
                        this.field4035[n5] = n2;
                    }
                    n5 = this.field4035[n5];
                }
                if (n5 >= this.field4035.length) {
                    int[] nArray2 = new int[this.field4035.length * 2];
                    for (int i = 0; i < this.field4035.length; ++i) {
                        nArray2[i] = this.field4035[i];
                    }
                    this.field4035 = nArray2;
                }
                n6 >>>= 1;
                ++n4;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([BII[BIB)I", garbageValue="0")
    int method7572(byte[] byArray, int n, int n2, byte[] byArray2, int n3) {
        int n4 = 0;
        int n5 = n3 << 3;
        n2 += n;
        while (n < n2) {
            int n6 = byArray[n] & 0xFF;
            int n7 = this.field4037[n6];
            byte by = this.field4036[n6];
            if (by == 0) {
                throw new RuntimeException("" + n6);
            }
            int n8 = n5 >> 3;
            int n9 = n5 & 7;
            n4 &= -n9 >> 31;
            int n10 = (n9 + by - 1 >> 3) + n8;
            byArray2[n8] = (byte)(n4 |= n7 >>> (n9 += 24));
            if (n8 < n10) {
                n4 = n7 >>> (n9 -= 8);
                byArray2[++n8] = (byte)n4;
                if (n8 < n10) {
                    n4 = n7 >>> (n9 -= 8);
                    byArray2[++n8] = (byte)n4;
                    if (n8 < n10) {
                        n4 = n7 >>> (n9 -= 8);
                        byArray2[++n8] = (byte)n4;
                        if (n8 < n10) {
                            n4 = n7 << -(n9 -= 8);
                            byArray2[++n8] = (byte)n4;
                        }
                    }
                }
            }
            n5 += by;
            ++n;
        }
        return (n5 + 7 >> 3) - n3;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="([BI[BIII)I", garbageValue="-668999189")
    int method7573(byte[] byArray, int n, byte[] byArray2, int n2, int n3) {
        if (n3 == 0) {
            return 0;
        }
        int n4 = 0;
        n3 += n2;
        int n5 = n;
        while (true) {
            block13: {
                block14: {
                    block6: {
                        int n6;
                        byte by;
                        block12: {
                            block11: {
                                block10: {
                                    block9: {
                                        block8: {
                                            block7: {
                                                block5: {
                                                    n4 = (by = byArray[n5]) < 0 ? this.field4035[n4] : ++n4;
                                                    n6 = this.field4035[n4];
                                                    if (n6 >= 0) break block5;
                                                    byArray2[n2++] = (byte)(~n6);
                                                    if (n2 >= n3) break block6;
                                                    n4 = 0;
                                                }
                                                n4 = (by & 0x40) != 0 ? this.field4035[n4] : ++n4;
                                                n6 = this.field4035[n4];
                                                if (n6 >= 0) break block7;
                                                byArray2[n2++] = (byte)(~n6);
                                                if (n2 >= n3) break block6;
                                                n4 = 0;
                                            }
                                            n4 = (by & 0x20) != 0 ? this.field4035[n4] : ++n4;
                                            n6 = this.field4035[n4];
                                            if (n6 >= 0) break block8;
                                            byArray2[n2++] = (byte)(~n6);
                                            if (n2 >= n3) break block6;
                                            n4 = 0;
                                        }
                                        n4 = (by & 0x10) != 0 ? this.field4035[n4] : ++n4;
                                        n6 = this.field4035[n4];
                                        if (n6 >= 0) break block9;
                                        byArray2[n2++] = (byte)(~n6);
                                        if (n2 >= n3) break block6;
                                        n4 = 0;
                                    }
                                    n4 = (by & 8) != 0 ? this.field4035[n4] : ++n4;
                                    n6 = this.field4035[n4];
                                    if (n6 >= 0) break block10;
                                    byArray2[n2++] = (byte)(~n6);
                                    if (n2 >= n3) break block6;
                                    n4 = 0;
                                }
                                n4 = (by & 4) != 0 ? this.field4035[n4] : ++n4;
                                n6 = this.field4035[n4];
                                if (n6 >= 0) break block11;
                                byArray2[n2++] = (byte)(~n6);
                                if (n2 >= n3) break block6;
                                n4 = 0;
                            }
                            n4 = (by & 2) != 0 ? this.field4035[n4] : ++n4;
                            n6 = this.field4035[n4];
                            if (n6 >= 0) break block12;
                            byArray2[n2++] = (byte)(~n6);
                            if (n2 >= n3) break block6;
                            n4 = 0;
                        }
                        n4 = (by & 1) != 0 ? this.field4035[n4] : ++n4;
                        n6 = this.field4035[n4];
                        if (n6 >= 0) break block13;
                        byArray2[n2++] = (byte)(~n6);
                        if (n2 < n3) break block14;
                    }
                    return n5 + 1 - n;
                }
                n4 = 0;
            }
            ++n5;
        }
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(CI)Z", garbageValue="-2130866999")
    public static boolean method7571(char c) {
        return c >= '0' && c <= '9';
    }
}

