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

@ObfuscatedName(value="cz")
public class class59 {
    @ObfuscatedName(value="fc")
    @ObfuscatedSignature(descriptor="Lok;")
    static Archive field398;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lbv;")
    VorbisFloor field403;
    @ObfuscatedName(value="ah")
    boolean field399;
    @ObfuscatedName(value="az")
    int[] field402;
    @ObfuscatedName(value="ao")
    int[] field401;
    @ObfuscatedName(value="ad")
    boolean[] field406;

    @ObfuscatedSignature(descriptor="(Lbv;Z[I[I[Z)V")
    class59(VorbisFloor vorbisFloor, boolean bl, int[] nArray, int[] nArray2, boolean[] blArray) {
        this.field403 = vorbisFloor;
        this.field399 = bl;
        this.field402 = nArray;
        this.field401 = nArray2;
        this.field406 = blArray;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([FIB)V", garbageValue="0")
    void method1195(float[] fArray, int n) {
        int n2 = this.field403.field247.length;
        int n3 = VorbisFloor.field251[this.field403.multiplier - 1];
        boolean[] blArray = this.field406;
        this.field406[1] = true;
        blArray[0] = true;
        int n4 = 2;
        while (true) {
            int n5;
            int n6;
            int n7;
            int n8;
            if (n4 >= n2) {
                this.VarbisFloor_sort(0, n2 - 1);
                n4 = 0;
                n8 = this.field403.multiplier * this.field401[0];
                n7 = 1;
                while (true) {
                    if (n7 >= n2) {
                        float f = VorbisFloor.VorbisFloor_decibelStatics[n8];
                        n6 = n4;
                        while (n6 < n) {
                            int n9 = n6++;
                            fArray[n9] = fArray[n9] * f;
                        }
                        return;
                    }
                    if (this.field406[n7]) {
                        n6 = this.field402[n7];
                        n5 = this.field403.multiplier * this.field401[n7];
                        this.field403.method783(n4, n8, n6, n5, fArray, n);
                        if (n6 >= n) {
                            return;
                        }
                        n4 = n6;
                        n8 = n5;
                    }
                    ++n7;
                }
            }
            n8 = this.field403.method786(this.field402, n4);
            n7 = this.field403.method784(this.field402, n4);
            n6 = this.field403.method791(this.field402[n8], this.field401[n8], this.field402[n7], this.field401[n7], this.field402[n4]);
            n5 = this.field401[n4];
            int n10 = n3 - n6;
            int n11 = n6;
            int n12 = (n10 < n11 ? n10 : n11) << 1;
            if (n5 == 0) {
                this.field406[n4] = false;
                this.field401[n4] = n6;
            } else {
                boolean[] blArray2 = this.field406;
                int n13 = n8;
                this.field406[n7] = true;
                blArray2[n13] = true;
                this.field406[n4] = true;
                this.field401[n4] = n5 < n12 ? ((n5 & 1) != 0 ? n6 - (n5 + 1) / 2 : n5 / 2 + n6) : (n10 > n11 ? n6 + (n5 - n11) : n10 + (n6 - n5) - 1);
            }
            ++n4;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-299665421")
    boolean method1199() {
        return this.field399;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-2077114824")
    @Export(value="VarbisFloor_sort")
    void VarbisFloor_sort(int n, int n2) {
        if (n >= n2) {
            return;
        }
        int n3 = n;
        int n4 = this.field402[n3];
        int n5 = this.field401[n3];
        boolean bl = this.field406[n3];
        int n6 = n + 1;
        while (true) {
            if (n6 > n2) {
                this.field402[n3] = n4;
                this.field401[n3] = n5;
                this.field406[n3] = bl;
                this.VarbisFloor_sort(n, n3 - 1);
                this.VarbisFloor_sort(n3 + 1, n2);
                return;
            }
            int n7 = this.field402[n6];
            if (n7 < n4) {
                this.field402[n3] = n7;
                this.field401[n3] = this.field401[n6];
                this.field406[n3] = this.field406[n6];
                this.field402[n6] = this.field402[++n3];
                this.field401[n6] = this.field401[n3];
                this.field406[n6] = this.field406[n3];
            }
            ++n6;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(CB)Z", garbageValue="-37")
    public static boolean method1203(char c) {
        if (c >= ' ' && c < '\u007f' || c > '\u007f' && c < '\u00a0' || c > '\u00a0' && c <= '\u00ff') {
            return true;
        }
        if (c == '\u0000') return false;
        char[] cArray = class417.cp1252AsciiExtension;
        int n = 0;
        while (n < cArray.length) {
            char c2 = cArray[n];
            if (c == c2) {
                return true;
            }
            ++n;
        }
        return false;
    }
}

