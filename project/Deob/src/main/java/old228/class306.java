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

@ObfuscatedName(value="lr")
public class class306 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=972907447)
    int field3277;
    @ObfuscatedName(value="ah")
    byte[][][] field3278;

    class306(int n) {
        this.field3277 = n;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIIIIIIIB)V", garbageValue="-55")
    void method6497(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (n7 != 0 && this.field3277 != 0 && this.field3278 != null) {
            n8 = this.method6498(n8, n7);
            n7 = this.method6499(n7);
            class566.method10663(n, n2, n5, n6, n3, n4, this.field3278[n7 - 1][n8], this.field3277);
            return;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="-786773792")
    int method6498(int n, int n2) {
        if (n2 == 9) {
            n = n + 1 & 3;
        }
        if (n2 == 10) {
            n = n + 3 & 3;
        }
        if (n2 == 11) {
            n = n + 3 & 3;
        }
        return n;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="1764879216")
    int method6499(int n) {
        if (n != 9 && n != 10) {
            if (n == 11) {
                return 8;
            }
            return n;
        }
        return 1;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="74")
    void method6505() {
        if (this.field3278 == null) {
            this.field3278 = new byte[8][4][];
            this.method6534();
            this.method6502();
            this.method6503();
            this.method6504();
            this.method6496();
            this.method6506();
            this.method6507();
            this.method6508();
            return;
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1317891984")
    void method6534() {
        byte[] byArray = new byte[this.field3277 * this.field3277];
        int n = 0;
        int n2 = 0;
        while (true) {
            int n3;
            if (n2 >= this.field3277) {
                this.field3278[0][0] = byArray;
                byArray = new byte[this.field3277 * this.field3277];
                n = 0;
                n2 = this.field3277 - 1;
                while (true) {
                    if (n2 < 0) {
                        this.field3278[0][1] = byArray;
                        byArray = new byte[this.field3277 * this.field3277];
                        n = 0;
                        n2 = 0;
                        while (true) {
                            if (n2 >= this.field3277) {
                                this.field3278[0][2] = byArray;
                                byArray = new byte[this.field3277 * this.field3277];
                                n = 0;
                                n2 = this.field3277 - 1;
                                while (true) {
                                    if (n2 < 0) {
                                        this.field3278[0][3] = byArray;
                                        return;
                                    }
                                    for (n3 = 0; n3 < this.field3277; ++n3) {
                                        if (n3 >= n2) {
                                            byArray[n] = -1;
                                        }
                                        ++n;
                                    }
                                    --n2;
                                }
                            }
                            for (n3 = 0; n3 < this.field3277; ++n3) {
                                if (n3 >= n2) {
                                    byArray[n] = -1;
                                }
                                ++n;
                            }
                            ++n2;
                        }
                    }
                    for (n3 = 0; n3 < this.field3277; ++n3) {
                        if (n3 <= n2) {
                            byArray[n] = -1;
                        }
                        ++n;
                    }
                    --n2;
                }
            }
            for (n3 = 0; n3 < this.field3277; ++n3) {
                if (n3 <= n2) {
                    byArray[n] = -1;
                }
                ++n;
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="5")
    void method6502() {
        byte[] byArray = new byte[this.field3277 * this.field3277];
        int n = 0;
        int n2 = this.field3277 - 1;
        while (true) {
            int n3;
            if (n2 < 0) {
                this.field3278[1][0] = byArray;
                byArray = new byte[this.field3277 * this.field3277];
                n = 0;
                n2 = 0;
                while (true) {
                    if (n2 >= this.field3277) {
                        this.field3278[1][1] = byArray;
                        byArray = new byte[this.field3277 * this.field3277];
                        n = 0;
                        n2 = 0;
                        while (true) {
                            if (n2 >= this.field3277) {
                                this.field3278[1][2] = byArray;
                                byArray = new byte[this.field3277 * this.field3277];
                                n = 0;
                                n2 = this.field3277 - 1;
                                while (true) {
                                    if (n2 < 0) {
                                        this.field3278[1][3] = byArray;
                                        return;
                                    }
                                    for (n3 = this.field3277 - 1; n3 >= 0; --n3) {
                                        if (n3 >= n2 << 1) {
                                            byArray[n] = -1;
                                        }
                                        ++n;
                                    }
                                    --n2;
                                }
                            }
                            for (n3 = this.field3277 - 1; n3 >= 0; --n3) {
                                if (n3 <= n2 >> 1) {
                                    byArray[n] = -1;
                                }
                                ++n;
                            }
                            ++n2;
                        }
                    }
                    for (n3 = 0; n3 < this.field3277; ++n3) {
                        if (n >= 0 && n < byArray.length) {
                            if (n3 >= n2 << 1) {
                                byArray[n] = -1;
                            }
                            ++n;
                            continue;
                        }
                        ++n;
                    }
                    ++n2;
                }
            }
            for (n3 = 0; n3 < this.field3277; ++n3) {
                if (n3 <= n2 >> 1) {
                    byArray[n] = -1;
                }
                ++n;
            }
            --n2;
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1971376771")
    void method6503() {
        byte[] byArray = new byte[this.field3277 * this.field3277];
        int n = 0;
        int n2 = this.field3277 - 1;
        while (true) {
            int n3;
            if (n2 < 0) {
                this.field3278[2][0] = byArray;
                byArray = new byte[this.field3277 * this.field3277];
                n = 0;
                n2 = this.field3277 - 1;
                block1: while (true) {
                    if (n2 < 0) {
                        this.field3278[2][1] = byArray;
                        byArray = new byte[this.field3277 * this.field3277];
                        n = 0;
                        n2 = 0;
                        while (true) {
                            if (n2 >= this.field3277) {
                                this.field3278[2][2] = byArray;
                                byArray = new byte[this.field3277 * this.field3277];
                                n = 0;
                                n2 = 0;
                                while (true) {
                                    if (n2 >= this.field3277) {
                                        this.field3278[2][3] = byArray;
                                        return;
                                    }
                                    for (n3 = this.field3277 - 1; n3 >= 0; --n3) {
                                        if (n3 >= n2 << 1) {
                                            byArray[n] = -1;
                                        }
                                        ++n;
                                    }
                                    ++n2;
                                }
                            }
                            for (n3 = 0; n3 < this.field3277; ++n3) {
                                if (n3 <= n2 >> 1) {
                                    byArray[n] = -1;
                                }
                                ++n;
                            }
                            ++n2;
                        }
                    }
                    n3 = 0;
                    while (true) {
                        if (n3 >= this.field3277) {
                            --n2;
                            continue block1;
                        }
                        if (n3 >= n2 << 1) {
                            byArray[n] = -1;
                        }
                        ++n;
                        ++n3;
                    }
                    break;
                }
            }
            for (n3 = this.field3277 - 1; n3 >= 0; --n3) {
                if (n3 <= n2 >> 1) {
                    byArray[n] = -1;
                }
                ++n;
            }
            --n2;
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="416964119")
    void method6504() {
        byte[] byArray = new byte[this.field3277 * this.field3277];
        int n = 0;
        int n2 = this.field3277 - 1;
        while (true) {
            int n3;
            if (n2 < 0) {
                this.field3278[3][0] = byArray;
                byArray = new byte[this.field3277 * this.field3277];
                n = 0;
                n2 = 0;
                while (true) {
                    if (n2 >= this.field3277) {
                        this.field3278[3][1] = byArray;
                        byArray = new byte[this.field3277 * this.field3277];
                        n = 0;
                        n2 = 0;
                        while (true) {
                            if (n2 >= this.field3277) {
                                this.field3278[3][2] = byArray;
                                byArray = new byte[this.field3277 * this.field3277];
                                n = 0;
                                n2 = this.field3277 - 1;
                                while (true) {
                                    if (n2 < 0) {
                                        this.field3278[3][3] = byArray;
                                        return;
                                    }
                                    for (n3 = this.field3277 - 1; n3 >= 0; --n3) {
                                        if (n3 <= n2 << 1) {
                                            byArray[n] = -1;
                                        }
                                        ++n;
                                    }
                                    --n2;
                                }
                            }
                            for (n3 = this.field3277 - 1; n3 >= 0; --n3) {
                                if (n3 >= n2 >> 1) {
                                    byArray[n] = -1;
                                }
                                ++n;
                            }
                            ++n2;
                        }
                    }
                    for (n3 = 0; n3 < this.field3277; ++n3) {
                        if (n3 <= n2 << 1) {
                            byArray[n] = -1;
                        }
                        ++n;
                    }
                    ++n2;
                }
            }
            for (n3 = 0; n3 < this.field3277; ++n3) {
                if (n3 >= n2 >> 1) {
                    byArray[n] = -1;
                }
                ++n;
            }
            --n2;
        }
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-442549138")
    void method6496() {
        byte[] byArray = new byte[this.field3277 * this.field3277];
        int n = 0;
        int n2 = this.field3277 - 1;
        while (true) {
            int n3;
            if (n2 < 0) {
                this.field3278[4][0] = byArray;
                byArray = new byte[this.field3277 * this.field3277];
                n = 0;
                n2 = this.field3277 - 1;
                block1: while (true) {
                    if (n2 < 0) {
                        this.field3278[4][1] = byArray;
                        byArray = new byte[this.field3277 * this.field3277];
                        n = 0;
                        n2 = 0;
                        block2: while (true) {
                            if (n2 >= this.field3277) {
                                this.field3278[4][2] = byArray;
                                byArray = new byte[this.field3277 * this.field3277];
                                n = 0;
                                n2 = 0;
                                block3: while (true) {
                                    if (n2 >= this.field3277) {
                                        this.field3278[4][3] = byArray;
                                        return;
                                    }
                                    n3 = this.field3277 - 1;
                                    while (true) {
                                        if (n3 < 0) {
                                            ++n2;
                                            continue block3;
                                        }
                                        if (n3 <= n2 << 1) {
                                            byArray[n] = -1;
                                        }
                                        ++n;
                                        --n3;
                                    }
                                    break;
                                }
                            }
                            n3 = 0;
                            while (true) {
                                if (n3 >= this.field3277) {
                                    ++n2;
                                    continue block2;
                                }
                                if (n3 >= n2 >> 1) {
                                    byArray[n] = -1;
                                }
                                ++n;
                                ++n3;
                            }
                            break;
                        }
                    }
                    n3 = 0;
                    while (true) {
                        if (n3 >= this.field3277) {
                            --n2;
                            continue block1;
                        }
                        if (n3 <= n2 << 1) {
                            byArray[n] = -1;
                        }
                        ++n;
                        ++n3;
                    }
                    break;
                }
            }
            for (n3 = this.field3277 - 1; n3 >= 0; --n3) {
                if (n3 >= n2 >> 1) {
                    byArray[n] = -1;
                }
                ++n;
            }
            --n2;
        }
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="104")
    void method6506() {
        byte[] byArray = new byte[this.field3277 * this.field3277];
        int n = 0;
        byArray = new byte[this.field3277 * this.field3277];
        n = 0;
        int n2 = 0;
        while (true) {
            int n3;
            if (n2 >= this.field3277) {
                this.field3278[5][0] = byArray;
                byArray = new byte[this.field3277 * this.field3277];
                n = 0;
                n2 = 0;
                while (true) {
                    if (n2 >= this.field3277) {
                        this.field3278[5][1] = byArray;
                        byArray = new byte[this.field3277 * this.field3277];
                        n = 0;
                        n2 = 0;
                        while (true) {
                            if (n2 >= this.field3277) {
                                this.field3278[5][2] = byArray;
                                byArray = new byte[this.field3277 * this.field3277];
                                n = 0;
                                n2 = 0;
                                while (true) {
                                    if (n2 >= this.field3277) {
                                        this.field3278[5][3] = byArray;
                                        return;
                                    }
                                    for (n3 = 0; n3 < this.field3277; ++n3) {
                                        if (n2 >= this.field3277 / 2) {
                                            byArray[n] = -1;
                                        }
                                        ++n;
                                    }
                                    ++n2;
                                }
                            }
                            for (n3 = 0; n3 < this.field3277; ++n3) {
                                if (n3 >= this.field3277 / 2) {
                                    byArray[n] = -1;
                                }
                                ++n;
                            }
                            ++n2;
                        }
                    }
                    for (n3 = 0; n3 < this.field3277; ++n3) {
                        if (n2 <= this.field3277 / 2) {
                            byArray[n] = -1;
                        }
                        ++n;
                    }
                    ++n2;
                }
            }
            for (n3 = 0; n3 < this.field3277; ++n3) {
                if (n3 <= this.field3277 / 2) {
                    byArray[n] = -1;
                }
                ++n;
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="5")
    void method6507() {
        byte[] byArray = new byte[this.field3277 * this.field3277];
        int n = 0;
        byArray = new byte[this.field3277 * this.field3277];
        n = 0;
        int n2 = 0;
        while (true) {
            int n3;
            if (n2 >= this.field3277) {
                this.field3278[6][0] = byArray;
                byArray = new byte[this.field3277 * this.field3277];
                n = 0;
                n2 = this.field3277 - 1;
                while (true) {
                    if (n2 < 0) {
                        this.field3278[6][1] = byArray;
                        byArray = new byte[this.field3277 * this.field3277];
                        n = 0;
                        n2 = this.field3277 - 1;
                        while (true) {
                            if (n2 < 0) {
                                this.field3278[6][2] = byArray;
                                byArray = new byte[this.field3277 * this.field3277];
                                n = 0;
                                n2 = 0;
                                while (true) {
                                    if (n2 >= this.field3277) {
                                        this.field3278[6][3] = byArray;
                                        return;
                                    }
                                    for (n3 = this.field3277 - 1; n3 >= 0; --n3) {
                                        if (n3 <= n2 - this.field3277 / 2) {
                                            byArray[n] = -1;
                                        }
                                        ++n;
                                    }
                                    ++n2;
                                }
                            }
                            for (n3 = this.field3277 - 1; n3 >= 0; --n3) {
                                if (n3 <= n2 - this.field3277 / 2) {
                                    byArray[n] = -1;
                                }
                                ++n;
                            }
                            --n2;
                        }
                    }
                    for (n3 = 0; n3 < this.field3277; ++n3) {
                        if (n3 <= n2 - this.field3277 / 2) {
                            byArray[n] = -1;
                        }
                        ++n;
                    }
                    --n2;
                }
            }
            for (n3 = 0; n3 < this.field3277; ++n3) {
                if (n3 <= n2 - this.field3277 / 2) {
                    byArray[n] = -1;
                }
                ++n;
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="117")
    void method6508() {
        byte[] byArray = new byte[this.field3277 * this.field3277];
        int n = 0;
        byArray = new byte[this.field3277 * this.field3277];
        n = 0;
        int n2 = 0;
        while (true) {
            int n3;
            if (n2 >= this.field3277) {
                this.field3278[7][0] = byArray;
                byArray = new byte[this.field3277 * this.field3277];
                n = 0;
                n2 = this.field3277 - 1;
                while (true) {
                    if (n2 < 0) {
                        this.field3278[7][1] = byArray;
                        byArray = new byte[this.field3277 * this.field3277];
                        n = 0;
                        n2 = this.field3277 - 1;
                        while (true) {
                            if (n2 < 0) {
                                this.field3278[7][2] = byArray;
                                byArray = new byte[this.field3277 * this.field3277];
                                n = 0;
                                n2 = 0;
                                while (true) {
                                    if (n2 >= this.field3277) {
                                        this.field3278[7][3] = byArray;
                                        return;
                                    }
                                    for (n3 = this.field3277 - 1; n3 >= 0; --n3) {
                                        if (n3 >= n2 - this.field3277 / 2) {
                                            byArray[n] = -1;
                                        }
                                        ++n;
                                    }
                                    ++n2;
                                }
                            }
                            for (n3 = this.field3277 - 1; n3 >= 0; --n3) {
                                if (n3 >= n2 - this.field3277 / 2) {
                                    byArray[n] = -1;
                                }
                                ++n;
                            }
                            --n2;
                        }
                    }
                    for (n3 = 0; n3 < this.field3277; ++n3) {
                        if (n3 >= n2 - this.field3277 / 2) {
                            byArray[n] = -1;
                        }
                        ++n;
                    }
                    --n2;
                }
            }
            for (n3 = 0; n3 < this.field3277; ++n3) {
                if (n3 >= n2 - this.field3277 / 2) {
                    byArray[n] = -1;
                }
                ++n;
            }
            ++n2;
        }
    }
}

