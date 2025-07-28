package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="vq")
public class class566
extends class510 {
    @ObfuscatedName(value="ap")
    public static int[] field5546;
    @ObfuscatedName(value="ab")
    public static int field5542;
    @ObfuscatedName(value="aj")
    public static int field5543;
    @ObfuscatedName(value="bu")
    public static float[] field5544;
    @ObfuscatedName(value="bw")
    public static int field5541;
    @ObfuscatedName(value="bb")
    public static int field5547;
    @ObfuscatedName(value="bx")
    public static int field5548;
    @ObfuscatedName(value="bd")
    public static int field5549;

    static {
        field5541 = 0;
        field5547 = 0;
        field5548 = 0;
        field5549 = 0;
    }

    protected class566() {
    }

    @ObfuscatedName(value="ec")
    protected static void method10603(int[] nArray, int n, int n2, float[] fArray) {
        field5546 = nArray;
        field5542 = n;
        field5543 = n2;
        field5544 = fArray;
        class566.method10659(0, 0, n, n2);
    }

    @ObfuscatedName(value="em")
    public static void method10640() {
        field5548 = 0;
        field5541 = 0;
        field5549 = field5542;
        field5547 = field5543;
    }

    @ObfuscatedName(value="es")
    public static void method10659(int n, int n2, int n3, int n4) {
        if (n < 0) {
            n = 0;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 > field5542) {
            n3 = field5542;
        }
        if (n4 > field5543) {
            n4 = field5543;
        }
        field5548 = n;
        field5541 = n2;
        field5549 = n3;
        field5547 = n4;
    }

    @ObfuscatedName(value="er")
    public static void method10639(int n, int n2, int n3, int n4) {
        if (field5548 < n) {
            field5548 = n;
        }
        if (field5541 < n2) {
            field5541 = n2;
        }
        if (field5549 > n3) {
            field5549 = n3;
        }
        if (field5547 > n4) {
            field5547 = n4;
        }
    }

    @ObfuscatedName(value="ep")
    public static void method10607(int[] nArray) {
        nArray[0] = field5548;
        nArray[1] = field5541;
        nArray[2] = field5549;
        nArray[3] = field5547;
    }

    @ObfuscatedName(value="eo")
    public static void method10649(int[] nArray) {
        field5548 = nArray[0];
        field5541 = nArray[1];
        field5549 = nArray[2];
        field5547 = nArray[3];
    }

    @ObfuscatedName(value="ez")
    public static void method10609() {
        int n = 0;
        int n2 = field5542 * field5543 - 7;
        while (true) {
            if (n >= n2) {
                n2 += 7;
                while (n < n2) {
                    class566.field5546[n++] = 0;
                }
                class566.method10626();
                return;
            }
            class566.field5546[n++] = 0;
            class566.field5546[n++] = 0;
            class566.field5546[n++] = 0;
            class566.field5546[n++] = 0;
            class566.field5546[n++] = 0;
            class566.field5546[n++] = 0;
            class566.field5546[n++] = 0;
            class566.field5546[n++] = 0;
        }
    }

    @ObfuscatedName(value="eb")
    static void method10610(int n, int n2, int n3, int n4) {
        if (n3 != 0) {
            int n5;
            int n6;
            if (n3 < 0) {
                n3 = -n3;
            }
            if ((n6 = n2 - n3) < field5541) {
                n6 = field5541;
            }
            if ((n5 = n3 + n2 + 1) > field5547) {
                n5 = field5547;
            }
            int n7 = n6;
            int n8 = n3 * n3;
            int n9 = 0;
            int n10 = n2 - n7;
            int n11 = n10 * n10;
            int n12 = n11 - n10;
            if (n2 > n5) {
                n2 = n5;
            }
            block0: while (true) {
                int n13;
                int n14;
                int n15;
                int n16;
                if (n7 >= n2) {
                    n9 = n3;
                    n10 = n7 - n2;
                    n12 = n8 + n10 * n10;
                    n11 = n12 - n9;
                    n12 -= n10;
                    block1: while (true) {
                        if (n7 >= n5) {
                            return;
                        }
                        while (true) {
                            if (n12 <= n8 || n11 <= n8) {
                                n16 = n - n9;
                                if (n16 < field5548) {
                                    n16 = field5548;
                                }
                                if ((n15 = n + n9) > field5549 - 1) {
                                    n15 = field5549 - 1;
                                }
                                n14 = n16 + n7 * field5542;
                                for (n13 = n16; n13 <= n15; ++n13) {
                                    class566.field5546[n14++] = n4;
                                }
                                ++n7;
                                n12 = n12 + n10 + n10;
                                n11 += n10++ + n10;
                                continue block1;
                            }
                            n12 -= n9-- + n9;
                            n11 -= n9 + n9;
                        }
                        break;
                    }
                }
                while (true) {
                    if (n12 > n8 && n11 > n8) {
                        n16 = n - n9 + 1;
                        if (n16 < field5548) {
                            n16 = field5548;
                        }
                        if ((n15 = n + n9) > field5549) {
                            n15 = field5549;
                        }
                        n14 = n16 + n7 * field5542;
                        for (n13 = n16; n13 < n15; ++n13) {
                            class566.field5546[n14++] = n4;
                        }
                        ++n7;
                        n11 -= n10-- + n10;
                        n12 -= n10 + n10;
                        continue block0;
                    }
                    n11 = n11 + n9 + n9;
                    n12 += n9++ + n9;
                }
                break;
            }
        }
        class566.method10624(n, n2, n4);
    }

    @ObfuscatedName(value="en")
    public static void method10602(int n, int n2, int n3, int n4, int n5) {
        if (n5 == 0) {
            return;
        }
        if (n5 != 256) {
            int n6;
            if (n3 < 0) {
                n3 = -n3;
            }
            int n7 = 256 - n5;
            int n8 = (n4 >> 16 & 0xFF) * n5;
            int n9 = (n4 >> 8 & 0xFF) * n5;
            int n10 = n5 * (n4 & 0xFF);
            int n11 = n2 - n3;
            if (n11 < field5541) {
                n11 = field5541;
            }
            if ((n6 = n3 + n2 + 1) > field5547) {
                n6 = field5547;
            }
            int n12 = n11;
            int n13 = n3 * n3;
            int n14 = 0;
            int n15 = n2 - n12;
            int n16 = n15 * n15;
            int n17 = n16 - n15;
            if (n2 > n6) {
                n2 = n6;
            }
            block0: while (true) {
                int n18;
                int n19;
                int n20;
                int n21;
                int n22;
                int n23;
                int n24;
                int n25;
                if (n12 >= n2) {
                    n14 = n3;
                    n15 = -n15;
                    n17 = n13 + n15 * n15;
                    n16 = n17 - n14;
                    n17 -= n15;
                    block1: while (true) {
                        if (n12 >= n6) {
                            return;
                        }
                        while (true) {
                            if (n17 <= n13 || n16 <= n13) {
                                n25 = n - n14;
                                if (n25 < field5548) {
                                    n25 = field5548;
                                }
                                if ((n24 = n + n14) > field5549 - 1) {
                                    n24 = field5549 - 1;
                                }
                                n23 = n25 + n12 * field5542;
                                n22 = n25;
                                while (true) {
                                    if (n22 > n24) {
                                        ++n12;
                                        n17 = n17 + n15 + n15;
                                        n16 += n15++ + n15;
                                        continue block1;
                                    }
                                    n21 = n7 * (field5546[n23] >> 16 & 0xFF);
                                    n20 = (field5546[n23] >> 8 & 0xFF) * n7;
                                    n19 = n7 * (field5546[n23] & 0xFF);
                                    n18 = (n10 + n19 >> 8) + (n8 + n21 >> 8 << 16) + (n9 + n20 >> 8 << 8);
                                    class566.field5546[n23++] = n18;
                                    ++n22;
                                }
                            }
                            n17 -= n14-- + n14;
                            n16 -= n14 + n14;
                        }
                        break;
                    }
                }
                while (true) {
                    if (n17 > n13 && n16 > n13) {
                        n25 = n - n14 + 1;
                        if (n25 < field5548) {
                            n25 = field5548;
                        }
                        if ((n24 = n + n14) > field5549) {
                            n24 = field5549;
                        }
                        n23 = n25 + n12 * field5542;
                        n22 = n25;
                        while (true) {
                            if (n22 >= n24) {
                                ++n12;
                                n16 -= n15-- + n15;
                                n17 -= n15 + n15;
                                continue block0;
                            }
                            n21 = n7 * (field5546[n23] >> 16 & 0xFF);
                            n20 = (field5546[n23] >> 8 & 0xFF) * n7;
                            n19 = n7 * (field5546[n23] & 0xFF);
                            n18 = (n10 + n19 >> 8) + (n8 + n21 >> 8 << 16) + (n9 + n20 >> 8 << 8);
                            class566.field5546[n23++] = n18;
                            ++n22;
                        }
                    }
                    n16 = n16 + n14 + n14;
                    n17 += n14++ + n14;
                }
                break;
            }
        }
        class566.method10610(n, n2, n3, n4);
    }

    @ObfuscatedName(value="ee")
    public static void method10680(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n < field5548) {
            n3 -= field5548 - n;
            n = field5548;
        }
        if (n2 < field5541) {
            n4 -= field5541 - n2;
            n2 = field5541;
        }
        if (n + n3 > field5549) {
            n3 = field5549 - n;
        }
        if (n4 + n2 > field5547) {
            n4 = field5547 - n2;
        }
        n5 = (n6 * (n5 & 0xFF00FF) >> 8 & 0xFF00FF) + (n6 * (n5 & 0xFF00) >> 8 & 0xFF00);
        int n7 = 256 - n6;
        int n8 = field5542 - n3;
        int n9 = n + field5542 * n2;
        int n10 = 0;
        block0: while (n10 < n4) {
            int n11 = -n3;
            while (true) {
                if (n11 >= 0) {
                    n9 += n8;
                    ++n10;
                    continue block0;
                }
                int n12 = field5546[n9];
                n12 = ((n12 & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + (n7 * (n12 & 0xFF00) >> 8 & 0xFF00);
                class566.field5546[n9++] = n12 + n5;
                ++n11;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="ev")
    public static void method10677(int n, int n2, int n3, int n4, int n5) {
        if (n < field5548) {
            n3 -= field5548 - n;
            n = field5548;
        }
        if (n2 < field5541) {
            n4 -= field5541 - n2;
            n2 = field5541;
        }
        if (n + n3 > field5549) {
            n3 = field5549 - n;
        }
        if (n4 + n2 > field5547) {
            n4 = field5547 - n2;
        }
        int n6 = field5542 - n3;
        int n7 = n + field5542 * n2;
        int n8 = -n4;
        block0: while (n8 < 0) {
            int n9 = -n3;
            while (true) {
                if (n9 >= 0) {
                    n7 += n6;
                    ++n8;
                    continue block0;
                }
                class566.field5546[n7++] = n5;
                ++n9;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="el")
    public static void method10614(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n3 > 0 && n4 > 0) {
            int n7 = 0;
            int n8 = 65536 / n4;
            if (n < field5548) {
                n3 -= field5548 - n;
                n = field5548;
            }
            if (n2 < field5541) {
                n7 += (field5541 - n2) * n8;
                n4 -= field5541 - n2;
                n2 = field5541;
            }
            if (n + n3 > field5549) {
                n3 = field5549 - n;
            }
            if (n4 + n2 > field5547) {
                n4 = field5547 - n2;
            }
            int n9 = field5542 - n3;
            int n10 = n + field5542 * n2;
            int n11 = -n4;
            block0: while (true) {
                if (n11 >= 0) {
                    return;
                }
                int n12 = 65536 - n7 >> 8;
                int n13 = n7 >> 8;
                int n14 = (n13 * (n6 & 0xFF00FF) + n12 * (n5 & 0xFF00FF) & 0xFF00FF00) + (n13 * (n6 & 0xFF00) + n12 * (n5 & 0xFF00) & 0xFF0000) >>> 8;
                int n15 = -n3;
                while (true) {
                    if (n15 >= 0) {
                        n10 += n9;
                        n7 += n8;
                        ++n11;
                        continue block0;
                    }
                    class566.field5546[n10++] = n14;
                    ++n15;
                }
                break;
            }
        }
    }

    @ObfuscatedName(value="ea")
    public static void method10615(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (n3 > 0 && n4 > 0) {
            int n9 = 0;
            int n10 = 65536 / n4;
            if (n < field5548) {
                n3 -= field5548 - n;
                n = field5548;
            }
            if (n2 < field5541) {
                n9 += (field5541 - n2) * n10;
                n4 -= field5541 - n2;
                n2 = field5541;
            }
            if (n + n3 > field5549) {
                n3 = field5549 - n;
            }
            if (n4 + n2 > field5547) {
                n4 = field5547 - n2;
            }
            int n11 = field5542 - n3;
            int n12 = n + field5542 * n2;
            int n13 = -n4;
            while (true) {
                block12: {
                    if (n13 >= 0) {
                        return;
                    }
                    int n14 = 65536 - n9 >> 8;
                    int n15 = n9 >> 8;
                    int n16 = (n14 * n7 + n15 * n8 & 0xFF00) >>> 8;
                    if (n16 != 0) {
                        int n17 = (n15 * (n6 & 0xFF00FF) + n14 * (n5 & 0xFF00FF) & 0xFF00FF00) + (n15 * (n6 & 0xFF00) + n14 * (n5 & 0xFF00) & 0xFF0000) >>> 8;
                        int n18 = 255 - n16;
                        int n19 = ((n17 & 0xFF00FF) * n16 >> 8 & 0xFF00FF) + (n16 * (n17 & 0xFF00) >> 8 & 0xFF00);
                        int n20 = -n3;
                        while (true) {
                            if (n20 >= 0) {
                                n12 += n11;
                                n9 += n10;
                                break block12;
                            }
                            int n21 = field5546[n12];
                            if (n21 != 0) {
                                n21 = ((n21 & 0xFF00FF) * n18 >> 8 & 0xFF00FF) + (n18 * (n21 & 0xFF00) >> 8 & 0xFF00);
                                class566.field5546[n12++] = n19 + n21;
                            } else {
                                class566.field5546[n12++] = n19;
                            }
                            ++n20;
                        }
                    }
                    n12 += field5542;
                    n9 += n10;
                }
                ++n13;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="eu")
    @ObfuscatedSignature(descriptor="(IIIIII[BIZ)V", garbageValue="1")
    public static void method10663(int n, int n2, int n3, int n4, int n5, int n6, byte[] byArray, int n7) {
        int n8;
        int n9;
        int n10;
        int n11;
        block10: {
            if (n + n3 < 0) return;
            if (n4 + n2 < 0) {
                return;
            }
            if (n >= field5542) return;
            if (n2 >= field5543) {
                return;
            }
            n11 = 0;
            n10 = 0;
            if (n < 0) {
                n11 -= n;
                n3 = n + n3;
            }
            if (n2 < 0) {
                n10 -= n2;
                n4 += n2;
            }
            if (n + n3 > field5542) {
                n3 = field5542 - n;
            }
            if (n4 + n2 > field5543) {
                n4 = field5543 - n2;
            }
            n9 = byArray.length / n7;
            n8 = field5542 - n3;
            int n12 = n5 >>> 24;
            int n13 = n6 >>> 24;
            if (n12 == 255 && n13 == 255) break block10;
            int n14 = n + n11 + (n10 + n2) * field5542;
            int n15 = n10 + n2;
            block0: while (true) {
                if (n15 >= n4 + n10 + n2) return;
                int n16 = n + n11;
                while (true) {
                    int n17;
                    block12: {
                        block13: {
                            block11: {
                                if (n16 >= n + n11 + n3) break block11;
                                int n18 = (n15 - n2) % n9;
                                int n19 = (n16 - n) % n7;
                                n17 = n5;
                                if (byArray[n19 + n18 * n7] == 0) break block12;
                                break block13;
                            }
                            n14 += n8;
                            ++n15;
                            continue block0;
                        }
                        n17 = n6;
                    }
                    int n20 = n17 >>> 24;
                    int n21 = 255 - n20;
                    int n22 = field5546[n14];
                    int n23 = ((n17 & 0xFF00FF) * n20 + (n22 & 0xFF00FF) * n21 & 0xFF00FF00) + (n20 * (n17 & 0xFF00) + n21 * (n22 & 0xFF00) & 0xFF0000) >> 8;
                    class566.field5546[n14++] = n23;
                    ++n16;
                }
                break;
            }
        }
        int n24 = n + n11 + (n10 + n2) * field5542;
        int n25 = n10 + n2;
        block2: while (n25 < n4 + n10 + n2) {
            int n26 = n + n11;
            while (true) {
                block17: {
                    block15: {
                        block16: {
                            block14: {
                                if (n26 >= n + n11 + n3) break block14;
                                int n27 = (n26 - n) % n7;
                                int n28 = (n25 - n2) % n9;
                                if (byArray[n27 + n28 * n7] == 0) break block15;
                                break block16;
                            }
                            n24 += n8;
                            ++n25;
                            continue block2;
                        }
                        class566.field5546[n24++] = n6;
                        break block17;
                    }
                    class566.field5546[n24++] = n5;
                }
                ++n26;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="ey")
    public static void method10617(int n, int n2, int n3, int n4, int n5) {
        class566.method10619(n, n2, n3, n5);
        class566.method10619(n, n4 + n2 - 1, n3, n5);
        class566.method10621(n, n2, n4, n5);
        class566.method10621(n + n3 - 1, n2, n4, n5);
    }

    @ObfuscatedName(value="eh")
    public static void method10618(int n, int n2, int n3, int n4, int n5, int n6) {
        class566.method10620(n, n2, n3, n5, n6);
        class566.method10620(n, n4 + n2 - 1, n3, n5, n6);
        if (n4 >= 3) {
            class566.method10658(n, n2 + 1, n4 - 2, n5, n6);
            class566.method10658(n + n3 - 1, n2 + 1, n4 - 2, n5, n6);
        }
    }

    @ObfuscatedName(value="ew")
    public static void method10619(int n, int n2, int n3, int n4) {
        if (n2 >= field5541 && n2 < field5547) {
            if (n < field5548) {
                n3 -= field5548 - n;
                n = field5548;
            }
            if (n + n3 > field5549) {
                n3 = field5549 - n;
            }
            int n5 = n + field5542 * n2;
            for (int i = 0; i < n3; ++i) {
                class566.field5546[n5 + i] = n4;
            }
            return;
        }
    }

    @ObfuscatedName(value="ed")
    static void method10620(int n, int n2, int n3, int n4, int n5) {
        if (n2 >= field5541 && n2 < field5547) {
            if (n < field5548) {
                n3 -= field5548 - n;
                n = field5548;
            }
            if (n + n3 > field5549) {
                n3 = field5549 - n;
            }
            int n6 = 256 - n5;
            int n7 = (n4 >> 16 & 0xFF) * n5;
            int n8 = (n4 >> 8 & 0xFF) * n5;
            int n9 = n5 * (n4 & 0xFF);
            int n10 = n + field5542 * n2;
            int n11 = 0;
            while (true) {
                if (n11 >= n3) {
                    return;
                }
                int n12 = n6 * (field5546[n10] >> 16 & 0xFF);
                int n13 = (field5546[n10] >> 8 & 0xFF) * n6;
                int n14 = n6 * (field5546[n10] & 0xFF);
                int n15 = (n9 + n14 >> 8) + (n7 + n12 >> 8 << 16) + (n8 + n13 >> 8 << 8);
                class566.field5546[n10++] = n15;
                ++n11;
            }
        }
    }

    @ObfuscatedName(value="fz")
    public static void method10621(int n, int n2, int n3, int n4) {
        if (n >= field5548 && n < field5549) {
            if (n2 < field5541) {
                n3 -= field5541 - n2;
                n2 = field5541;
            }
            if (n3 + n2 > field5547) {
                n3 = field5547 - n2;
            }
            int n5 = n + field5542 * n2;
            for (int i = 0; i < n3; ++i) {
                class566.field5546[n5 + i * class566.field5542] = n4;
            }
            return;
        }
    }

    @ObfuscatedName(value="fn")
    static void method10658(int n, int n2, int n3, int n4, int n5) {
        if (n >= field5548 && n < field5549) {
            if (n2 < field5541) {
                n3 -= field5541 - n2;
                n2 = field5541;
            }
            if (n3 + n2 > field5547) {
                n3 = field5547 - n2;
            }
            int n6 = 256 - n5;
            int n7 = (n4 >> 16 & 0xFF) * n5;
            int n8 = (n4 >> 8 & 0xFF) * n5;
            int n9 = n5 * (n4 & 0xFF);
            int n10 = n + field5542 * n2;
            int n11 = 0;
            while (true) {
                int n12;
                if (n11 >= n3) {
                    return;
                }
                int n13 = n6 * (field5546[n10] >> 16 & 0xFF);
                int n14 = (field5546[n10] >> 8 & 0xFF) * n6;
                int n15 = n6 * (field5546[n10] & 0xFF);
                class566.field5546[n10] = n12 = (n9 + n15 >> 8) + (n7 + n13 >> 8 << 16) + (n8 + n14 >> 8 << 8);
                n10 += field5542;
                ++n11;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="fd")
    public static void method10623(int n, int n2, int n3, int n4, int n5) {
        block11: {
            block13: {
                int n6;
                block15: {
                    block16: {
                        block14: {
                            block12: {
                                block10: {
                                    n3 -= n;
                                    if ((n4 -= n2) != 0) break block10;
                                    if (n3 < 0) {
                                        class566.method10619(n + n3, n2, -n3 + 1, n5);
                                        return;
                                    }
                                    break block11;
                                }
                                if (n3 != 0) break block12;
                                if (n4 < 0) {
                                    class566.method10621(n, n4 + n2, -n4 + 1, n5);
                                    return;
                                }
                                break block13;
                            }
                            if (n4 + n3 < 0) {
                                n += n3;
                                n3 = -n3;
                                n2 = n4 + n2;
                                n4 = -n4;
                            }
                            if (n3 <= n4) break block14;
                            n2 <<= 16;
                            n2 += 32768;
                            n6 = (int)Math.floor((double)(n4 <<= 16) / (double)n3 + 0.5);
                            n3 = n + n3;
                            if (n >= field5548) break block15;
                            break block16;
                        }
                        n <<= 16;
                        n += 32768;
                        int n7 = (int)Math.floor((double)(n3 <<= 16) / (double)n4 + 0.5);
                        n4 += n2;
                        if (n2 < field5541) {
                            n += (field5541 - n2) * n7;
                            n2 = field5541;
                        }
                        if (n4 >= field5547) {
                            n4 = field5547 - 1;
                        }
                        while (n2 <= n4) {
                            int n8 = n >> 16;
                            if (n8 >= field5548 && n8 < field5549) {
                                class566.field5546[n8 + class566.field5542 * n2] = n5;
                            }
                            n += n7;
                            ++n2;
                        }
                        return;
                    }
                    n2 = n6 * (field5548 - n) + n2;
                    n = field5548;
                }
                if (n3 >= field5549) {
                    n3 = field5549 - 1;
                }
                while (n <= n3) {
                    int n9 = n2 >> 16;
                    if (n9 >= field5541 && n9 < field5547) {
                        class566.field5546[n + n9 * class566.field5542] = n5;
                    }
                    n2 = n6 + n2;
                    ++n;
                }
                return;
            }
            class566.method10621(n, n2, n4 + 1, n5);
            return;
        }
        class566.method10619(n, n2, n3 + 1, n5);
    }

    @ObfuscatedName(value="fc")
    static void method10624(int n, int n2, int n3) {
        if (n >= field5548 && n2 >= field5541 && n < field5549 && n2 < field5547) {
            class566.field5546[n + class566.field5542 * n2] = n3;
            return;
        }
    }

    @ObfuscatedName(value="fb")
    public static void method10625(int n, int n2, int n3, int[] nArray, int[] nArray2) {
        int n4 = n + field5542 * n2;
        n2 = 0;
        while (n2 < nArray.length) {
            int n5 = n4 + nArray[n2];
            for (n = -nArray2[n2]; n < 0; ++n) {
                class566.field5546[n5++] = n3;
            }
            n4 += field5542;
            ++n2;
        }
        return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="fg")
    public static void method10626() {
        if (field5544 == null) {
            return;
        }
        if (field5548 == 0 && field5549 == field5542 && field5541 == 0 && field5547 == field5543) {
            int n = field5544.length;
            int n2 = n - (n & 7);
            int n3 = 0;
            while (true) {
                if (n3 >= n2) {
                    while (n3 < n) {
                        class566.field5544[n3++] = 0.0f;
                    }
                    return;
                }
                class566.field5544[n3++] = 0.0f;
                class566.field5544[n3++] = 0.0f;
                class566.field5544[n3++] = 0.0f;
                class566.field5544[n3++] = 0.0f;
                class566.field5544[n3++] = 0.0f;
                class566.field5544[n3++] = 0.0f;
                class566.field5544[n3++] = 0.0f;
                class566.field5544[n3++] = 0.0f;
            }
        }
        int n = field5549 - field5548;
        int n4 = field5547 - field5541;
        int n5 = field5542 - n;
        int n6 = field5541 * field5542 + field5548;
        int n7 = n >> 3;
        int n8 = n & 7;
        n = n6 - 1;
        int n9 = -n4;
        while (n9 < 0) {
            int n10;
            if (n7 > 0) {
                n10 = n7;
                do {
                    class566.field5544[++n] = 0.0f;
                    class566.field5544[++n] = 0.0f;
                    class566.field5544[++n] = 0.0f;
                    class566.field5544[++n] = 0.0f;
                    class566.field5544[++n] = 0.0f;
                    class566.field5544[++n] = 0.0f;
                    class566.field5544[++n] = 0.0f;
                    class566.field5544[++n] = 0.0f;
                } while (--n10 > 0);
            }
            if (n8 > 0) {
                n10 = n8;
                do {
                    class566.field5544[++n] = 0.0f;
                } while (--n10 > 0);
            }
            n += n5;
            ++n9;
        }
        return;
    }

    @ObfuscatedName(value="ff")
    public static void method10627() {
        if (field5544 == null) {
            return;
        }
        int n = field5544.length;
        int n2 = 0;
        while (n2 < n) {
            if (n2 % field5542 < field5542 / 2 && field5544[n2] > 0.0f) {
                float f = field5544[n2];
                float f2 = 75.0f;
                float f3 = 10000.0f;
                float f4 = 750000.0f / (10000.0f - 9925.0f * f);
                float f5 = (f4 - 75.0f) / 9925.0f;
                int n3 = (int)(255.0f * f5);
                class566.field5546[n2] = n3 << 16 | n3 << 8 | n3;
            }
            ++n2;
        }
        return;
    }
}

