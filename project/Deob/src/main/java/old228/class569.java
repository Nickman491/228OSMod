package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="vi")
public final class class569
extends class566 {
    @ObfuscatedName(value="ay")
    public byte[] field5563;
    @ObfuscatedName(value="ah")
    public int[] field5562;
    @ObfuscatedName(value="az")
    public int field5567;
    @ObfuscatedName(value="ao")
    public int field5564;
    @ObfuscatedName(value="ad")
    public int field5565;
    @ObfuscatedName(value="an")
    public int field5566;
    @ObfuscatedName(value="ae")
    public int field5561;
    @ObfuscatedName(value="ax")
    public int field5568;

    @ObfuscatedName(value="ay")
    public void method10708() {
        if (this.field5567 == this.field5561 && this.field5564 == this.field5568) {
            return;
        }
        byte[] byArray = new byte[this.field5561 * this.field5568];
        int n = 0;
        int n2 = 0;
        block0: while (true) {
            if (n2 >= this.field5564) {
                this.field5563 = byArray;
                this.field5567 = this.field5561;
                this.field5564 = this.field5568;
                this.field5565 = 0;
                this.field5566 = 0;
                return;
            }
            int n3 = 0;
            while (true) {
                if (n3 >= this.field5567) {
                    ++n2;
                    continue block0;
                }
                byArray[n3 + (n2 + this.field5566) * this.field5561 + this.field5565] = this.field5563[n++];
                ++n3;
            }
            break;
        }
    }

    @ObfuscatedName(value="ah")
    public void method10709(int n, int n2, int n3) {
        int n4 = 0;
        while (n4 < this.field5562.length) {
            int n5 = this.field5562[n4] >> 16 & 0xFF;
            if ((n5 += n) < 0) {
                n5 = 0;
            } else if (n5 > 255) {
                n5 = 255;
            }
            int n6 = this.field5562[n4] >> 8 & 0xFF;
            if ((n6 += n2) < 0) {
                n6 = 0;
            } else if (n6 > 255) {
                n6 = 255;
            }
            int n7 = this.field5562[n4] & 0xFF;
            n7 = n3 + n7;
            if (n7 < 0) {
                n7 = 0;
            } else if (n7 > 255) {
                n7 = 255;
            }
            this.field5562[n4] = n7 + (n6 << 8) + (n5 << 16);
            ++n4;
        }
        return;
    }

    @ObfuscatedName(value="az")
    public void method10710(int n, int n2) {
        int n3;
        n = this.field5565 + n;
        int n4 = n + (n2 += this.field5566) * class566.field5542;
        int n5 = 0;
        int n6 = this.field5564;
        int n7 = this.field5567;
        int n8 = class566.field5542 - n7;
        int n9 = 0;
        if (n2 < class566.field5541) {
            n3 = class566.field5541 - n2;
            n6 -= n3;
            n2 = class566.field5541;
            n5 += n3 * n7;
            n4 += n3 * class566.field5542;
        }
        if (n6 + n2 > class566.field5547) {
            n6 -= n6 + n2 - class566.field5547;
        }
        if (n < class566.field5548) {
            n3 = class566.field5548 - n;
            n7 -= n3;
            n = class566.field5548;
            n5 += n3;
            n4 += n3;
            n9 += n3;
            n8 += n3;
        }
        if (n7 + n > class566.field5549) {
            n3 = n7 + n - class566.field5549;
            n7 -= n3;
            n9 += n3;
            n8 += n3;
        }
        if (n7 > 0 && n6 > 0) {
            class569.method10711(class566.field5546, this.field5563, this.field5562, n5, n4, n7, n6, n8, n9);
            return;
        }
    }

    @ObfuscatedName(value="ad")
    public void method10712(int n, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7 = this.field5567;
        int n8 = this.field5564;
        int n9 = 0;
        int n10 = 0;
        int n11 = this.field5561;
        int n12 = this.field5568;
        int n13 = (n11 << 16) / n3;
        int n14 = (n12 << 16) / n4;
        if (this.field5565 > 0) {
            n6 = (n13 + (this.field5565 << 16) - 1) / n13;
            n = n6 + n;
            n9 += n6 * n13 - (this.field5565 << 16);
        }
        if (this.field5566 > 0) {
            n6 = (n14 + (this.field5566 << 16) - 1) / n14;
            n2 = n6 + n2;
            n10 += n6 * n14 - (this.field5566 << 16);
        }
        if (n7 < n11) {
            n3 = (n13 + ((n7 << 16) - n9) - 1) / n13;
        }
        if (n8 < n12) {
            n4 = (n14 + ((n8 << 16) - n10) - 1) / n14;
        }
        n6 = n + n2 * class566.field5542;
        int n15 = class566.field5542 - n3;
        if (n2 + n4 > class566.field5547) {
            n4 -= n2 + n4 - class566.field5547;
        }
        if (n2 < class566.field5541) {
            n5 = class566.field5541 - n2;
            n4 -= n5;
            n6 += n5 * class566.field5542;
            n10 += n14 * n5;
        }
        if (n3 + n > class566.field5549) {
            n5 = n3 + n - class566.field5549;
            n3 -= n5;
            n15 += n5;
        }
        if (n < class566.field5548) {
            n5 = class566.field5548 - n;
            n3 -= n5;
            n6 += n5;
            n9 += n13 * n5;
            n15 += n5;
        }
        class569.method10713(class566.field5546, this.field5563, this.field5562, n9, n10, n6, n15, n3, n4, n13, n14, n7);
    }

    @ObfuscatedName(value="ao")
    static void method10711(int[] nArray, byte[] byArray, int[] nArray2, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = -(n3 >> 2);
        n3 = -(n3 & 3);
        int n8 = -n4;
        block0: while (n8 < 0) {
            int n9 = n7;
            while (true) {
                byte by;
                if (n9 >= 0) {
                    n9 = n3;
                    while (true) {
                        if (n9 >= 0) {
                            n2 += n5;
                            n += n6;
                            ++n8;
                            continue block0;
                        }
                        by = byArray[n++];
                        if (by != 0) {
                            nArray[n2++] = nArray2[by & 0xFF];
                        } else {
                            ++n2;
                        }
                        ++n9;
                    }
                }
                by = byArray[n++];
                if (by != 0) {
                    nArray[n2++] = nArray2[by & 0xFF];
                } else {
                    ++n2;
                }
                by = byArray[n++];
                if (by != 0) {
                    nArray[n2++] = nArray2[by & 0xFF];
                } else {
                    ++n2;
                }
                by = byArray[n++];
                if (by != 0) {
                    nArray[n2++] = nArray2[by & 0xFF];
                } else {
                    ++n2;
                }
                by = byArray[n++];
                if (by != 0) {
                    nArray[n2++] = nArray2[by & 0xFF];
                } else {
                    ++n2;
                }
                ++n9;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="an")
    static void method10713(int[] nArray, byte[] byArray, int[] nArray2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        int n10 = n;
        int n11 = -n6;
        block0: while (n11 < 0) {
            int n12 = n9 * (n2 >> 16);
            int n13 = -n5;
            while (true) {
                if (n13 >= 0) {
                    n2 = n8 + n2;
                    n = n10;
                    n3 += n4;
                    ++n11;
                    continue block0;
                }
                byte by = byArray[(n >> 16) + n12];
                if (by != 0) {
                    nArray[n3++] = nArray2[by & 0xFF];
                } else {
                    ++n3;
                }
                n += n7;
                ++n13;
            }
            break;
        }
        return;
    }
}

