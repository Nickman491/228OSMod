package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 */
import java.util.Random;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="rr")
public class class451 {
    @ObfuscatedName(value="ay")
    public static void method8889(byte[] byArray, int n, byte[] byArray2, int n2, int n3) {
        if (byArray2 == byArray) {
            if (n2 == n) {
                return;
            }
            if (n2 > n && n2 < n3 + n) {
                n = --n3 + n;
                n2 += n3;
                n3 = n - n3;
                n3 += 7;
                while (true) {
                    if (n < n3) {
                        n3 -= 7;
                        while (n >= n3) {
                            byArray2[n2--] = byArray[n--];
                        }
                        return;
                    }
                    byArray2[n2--] = byArray[n--];
                    byArray2[n2--] = byArray[n--];
                    byArray2[n2--] = byArray[n--];
                    byArray2[n2--] = byArray[n--];
                    byArray2[n2--] = byArray[n--];
                    byArray2[n2--] = byArray[n--];
                    byArray2[n2--] = byArray[n--];
                    byArray2[n2--] = byArray[n--];
                }
            }
        }
        n3 += n;
        n3 -= 7;
        while (true) {
            if (n >= n3) {
                n3 += 7;
                while (n < n3) {
                    byArray2[n2++] = byArray[n++];
                }
                return;
            }
            byArray2[n2++] = byArray[n++];
            byArray2[n2++] = byArray[n++];
            byArray2[n2++] = byArray[n++];
            byArray2[n2++] = byArray[n++];
            byArray2[n2++] = byArray[n++];
            byArray2[n2++] = byArray[n++];
            byArray2[n2++] = byArray[n++];
            byArray2[n2++] = byArray[n++];
        }
    }

    @ObfuscatedName(value="ac")
    public static void method8898(int[] nArray, int n, int n2) {
        n2 = n2 + n - 7;
        while (true) {
            if (n >= n2) {
                n2 += 7;
                while (n < n2) {
                    nArray[n++] = 0;
                }
                return;
            }
            nArray[n++] = 0;
            nArray[n++] = 0;
            nArray[n++] = 0;
            nArray[n++] = 0;
            nArray[n++] = 0;
            nArray[n++] = 0;
            nArray[n++] = 0;
            nArray[n++] = 0;
        }
    }

    @ObfuscatedName(value="au")
    public static void method8899(int[] nArray, int n, int n2, int n3) {
        if (n2 == 0 && n3 == 0) {
            n2 = (int)(Math.random() * 2.147483647E9);
            n3 = (int)(Math.random() * 2.147483647E9);
        }
        long l = (long)n2 << 32 | (long)n3;
        Random random = new Random(l);
        int n4 = n - 1;
        while (n4 > 0) {
            int n5 = random.nextInt(n4 + 1);
            if (n4 != n5) {
                int n6 = nArray[n4];
                nArray[n4] = nArray[n5];
                nArray[n5] = n6;
            }
            --n4;
        }
        return;
    }
}

