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

@ObfuscatedName(value="lr")
@Implements(value="WorldMapScaleHandler")
public class WorldMapScaleHandler {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=972907447)
    @Export(value="pixelsPerTile")
    int pixelsPerTile;
    @ObfuscatedName(value="ah")
    @Export(value="tileTemplates")
    byte[][][] tileTemplates;

    WorldMapScaleHandler(int n) {
        this.pixelsPerTile = n;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIIIIIIIB)V", garbageValue="-55")
    void method6497(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (n7 != 0 && this.pixelsPerTile != 0 && this.tileTemplates != null) {
            n8 = this.method6498(n8, n7);
            n7 = this.method6499(n7);
            Rasterizer2D.Rasterizer2D_drawGradientPixels(n, n2, n5, n6, n3, n4, this.tileTemplates[n7 - 1][n8], this.pixelsPerTile);
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
    @Export(value="init")
    void init() {
        if (this.tileTemplates == null) {
            this.tileTemplates = new byte[8][4][];
            this.init0();
            this.init1();
            this.init2();
            this.init3();
            this.init4();
            this.init5();
            this.init6();
            this.init7();
            return;
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1317891984")
    @Export(value="init0")
    void init0() {
        byte[] byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
        int n = 0;
        int n2 = 0;
        while (true) {
            int n3;
            if (n2 >= this.pixelsPerTile) {
                this.tileTemplates[0][0] = byArray;
                byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                n = 0;
                n2 = this.pixelsPerTile - 1;
                while (true) {
                    if (n2 < 0) {
                        this.tileTemplates[0][1] = byArray;
                        byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                        n = 0;
                        n2 = 0;
                        while (true) {
                            if (n2 >= this.pixelsPerTile) {
                                this.tileTemplates[0][2] = byArray;
                                byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                                n = 0;
                                n2 = this.pixelsPerTile - 1;
                                while (true) {
                                    if (n2 < 0) {
                                        this.tileTemplates[0][3] = byArray;
                                        return;
                                    }
                                    for (n3 = 0; n3 < this.pixelsPerTile; ++n3) {
                                        if (n3 >= n2) {
                                            byArray[n] = -1;
                                        }
                                        ++n;
                                    }
                                    --n2;
                                }
                            }
                            for (n3 = 0; n3 < this.pixelsPerTile; ++n3) {
                                if (n3 >= n2) {
                                    byArray[n] = -1;
                                }
                                ++n;
                            }
                            ++n2;
                        }
                    }
                    for (n3 = 0; n3 < this.pixelsPerTile; ++n3) {
                        if (n3 <= n2) {
                            byArray[n] = -1;
                        }
                        ++n;
                    }
                    --n2;
                }
            }
            for (n3 = 0; n3 < this.pixelsPerTile; ++n3) {
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
    @Export(value="init1")
    void init1() {
        byte[] byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
        int n = 0;
        int n2 = this.pixelsPerTile - 1;
        while (true) {
            int n3;
            if (n2 < 0) {
                this.tileTemplates[1][0] = byArray;
                byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                n = 0;
                n2 = 0;
                while (true) {
                    if (n2 >= this.pixelsPerTile) {
                        this.tileTemplates[1][1] = byArray;
                        byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                        n = 0;
                        n2 = 0;
                        while (true) {
                            if (n2 >= this.pixelsPerTile) {
                                this.tileTemplates[1][2] = byArray;
                                byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                                n = 0;
                                n2 = this.pixelsPerTile - 1;
                                while (true) {
                                    if (n2 < 0) {
                                        this.tileTemplates[1][3] = byArray;
                                        return;
                                    }
                                    for (n3 = this.pixelsPerTile - 1; n3 >= 0; --n3) {
                                        if (n3 >= n2 << 1) {
                                            byArray[n] = -1;
                                        }
                                        ++n;
                                    }
                                    --n2;
                                }
                            }
                            for (n3 = this.pixelsPerTile - 1; n3 >= 0; --n3) {
                                if (n3 <= n2 >> 1) {
                                    byArray[n] = -1;
                                }
                                ++n;
                            }
                            ++n2;
                        }
                    }
                    for (n3 = 0; n3 < this.pixelsPerTile; ++n3) {
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
            for (n3 = 0; n3 < this.pixelsPerTile; ++n3) {
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
    @Export(value="init2")
    void init2() {
        byte[] byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
        int n = 0;
        int n2 = this.pixelsPerTile - 1;
        while (true) {
            int n3;
            if (n2 < 0) {
                this.tileTemplates[2][0] = byArray;
                byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                n = 0;
                n2 = this.pixelsPerTile - 1;
                block1: while (true) {
                    if (n2 < 0) {
                        this.tileTemplates[2][1] = byArray;
                        byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                        n = 0;
                        n2 = 0;
                        while (true) {
                            if (n2 >= this.pixelsPerTile) {
                                this.tileTemplates[2][2] = byArray;
                                byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                                n = 0;
                                n2 = 0;
                                while (true) {
                                    if (n2 >= this.pixelsPerTile) {
                                        this.tileTemplates[2][3] = byArray;
                                        return;
                                    }
                                    for (n3 = this.pixelsPerTile - 1; n3 >= 0; --n3) {
                                        if (n3 >= n2 << 1) {
                                            byArray[n] = -1;
                                        }
                                        ++n;
                                    }
                                    ++n2;
                                }
                            }
                            for (n3 = 0; n3 < this.pixelsPerTile; ++n3) {
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
                        if (n3 >= this.pixelsPerTile) {
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
            for (n3 = this.pixelsPerTile - 1; n3 >= 0; --n3) {
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
    @Export(value="init3")
    void init3() {
        byte[] byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
        int n = 0;
        int n2 = this.pixelsPerTile - 1;
        while (true) {
            int n3;
            if (n2 < 0) {
                this.tileTemplates[3][0] = byArray;
                byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                n = 0;
                n2 = 0;
                while (true) {
                    if (n2 >= this.pixelsPerTile) {
                        this.tileTemplates[3][1] = byArray;
                        byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                        n = 0;
                        n2 = 0;
                        while (true) {
                            if (n2 >= this.pixelsPerTile) {
                                this.tileTemplates[3][2] = byArray;
                                byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                                n = 0;
                                n2 = this.pixelsPerTile - 1;
                                while (true) {
                                    if (n2 < 0) {
                                        this.tileTemplates[3][3] = byArray;
                                        return;
                                    }
                                    for (n3 = this.pixelsPerTile - 1; n3 >= 0; --n3) {
                                        if (n3 <= n2 << 1) {
                                            byArray[n] = -1;
                                        }
                                        ++n;
                                    }
                                    --n2;
                                }
                            }
                            for (n3 = this.pixelsPerTile - 1; n3 >= 0; --n3) {
                                if (n3 >= n2 >> 1) {
                                    byArray[n] = -1;
                                }
                                ++n;
                            }
                            ++n2;
                        }
                    }
                    for (n3 = 0; n3 < this.pixelsPerTile; ++n3) {
                        if (n3 <= n2 << 1) {
                            byArray[n] = -1;
                        }
                        ++n;
                    }
                    ++n2;
                }
            }
            for (n3 = 0; n3 < this.pixelsPerTile; ++n3) {
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
    @Export(value="init4")
    void init4() {
        byte[] byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
        int n = 0;
        int n2 = this.pixelsPerTile - 1;
        while (true) {
            int n3;
            if (n2 < 0) {
                this.tileTemplates[4][0] = byArray;
                byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                n = 0;
                n2 = this.pixelsPerTile - 1;
                block1: while (true) {
                    if (n2 < 0) {
                        this.tileTemplates[4][1] = byArray;
                        byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                        n = 0;
                        n2 = 0;
                        block2: while (true) {
                            if (n2 >= this.pixelsPerTile) {
                                this.tileTemplates[4][2] = byArray;
                                byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                                n = 0;
                                n2 = 0;
                                block3: while (true) {
                                    if (n2 >= this.pixelsPerTile) {
                                        this.tileTemplates[4][3] = byArray;
                                        return;
                                    }
                                    n3 = this.pixelsPerTile - 1;
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
                                if (n3 >= this.pixelsPerTile) {
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
                        if (n3 >= this.pixelsPerTile) {
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
            for (n3 = this.pixelsPerTile - 1; n3 >= 0; --n3) {
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
    @Export(value="init5")
    void init5() {
        byte[] byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
        int n = 0;
        byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
        n = 0;
        int n2 = 0;
        while (true) {
            int n3;
            if (n2 >= this.pixelsPerTile) {
                this.tileTemplates[5][0] = byArray;
                byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                n = 0;
                n2 = 0;
                while (true) {
                    if (n2 >= this.pixelsPerTile) {
                        this.tileTemplates[5][1] = byArray;
                        byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                        n = 0;
                        n2 = 0;
                        while (true) {
                            if (n2 >= this.pixelsPerTile) {
                                this.tileTemplates[5][2] = byArray;
                                byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                                n = 0;
                                n2 = 0;
                                while (true) {
                                    if (n2 >= this.pixelsPerTile) {
                                        this.tileTemplates[5][3] = byArray;
                                        return;
                                    }
                                    for (n3 = 0; n3 < this.pixelsPerTile; ++n3) {
                                        if (n2 >= this.pixelsPerTile / 2) {
                                            byArray[n] = -1;
                                        }
                                        ++n;
                                    }
                                    ++n2;
                                }
                            }
                            for (n3 = 0; n3 < this.pixelsPerTile; ++n3) {
                                if (n3 >= this.pixelsPerTile / 2) {
                                    byArray[n] = -1;
                                }
                                ++n;
                            }
                            ++n2;
                        }
                    }
                    for (n3 = 0; n3 < this.pixelsPerTile; ++n3) {
                        if (n2 <= this.pixelsPerTile / 2) {
                            byArray[n] = -1;
                        }
                        ++n;
                    }
                    ++n2;
                }
            }
            for (n3 = 0; n3 < this.pixelsPerTile; ++n3) {
                if (n3 <= this.pixelsPerTile / 2) {
                    byArray[n] = -1;
                }
                ++n;
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="5")
    @Export(value="init6")
    void init6() {
        byte[] byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
        int n = 0;
        byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
        n = 0;
        int n2 = 0;
        while (true) {
            int n3;
            if (n2 >= this.pixelsPerTile) {
                this.tileTemplates[6][0] = byArray;
                byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                n = 0;
                n2 = this.pixelsPerTile - 1;
                while (true) {
                    if (n2 < 0) {
                        this.tileTemplates[6][1] = byArray;
                        byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                        n = 0;
                        n2 = this.pixelsPerTile - 1;
                        while (true) {
                            if (n2 < 0) {
                                this.tileTemplates[6][2] = byArray;
                                byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                                n = 0;
                                n2 = 0;
                                while (true) {
                                    if (n2 >= this.pixelsPerTile) {
                                        this.tileTemplates[6][3] = byArray;
                                        return;
                                    }
                                    for (n3 = this.pixelsPerTile - 1; n3 >= 0; --n3) {
                                        if (n3 <= n2 - this.pixelsPerTile / 2) {
                                            byArray[n] = -1;
                                        }
                                        ++n;
                                    }
                                    ++n2;
                                }
                            }
                            for (n3 = this.pixelsPerTile - 1; n3 >= 0; --n3) {
                                if (n3 <= n2 - this.pixelsPerTile / 2) {
                                    byArray[n] = -1;
                                }
                                ++n;
                            }
                            --n2;
                        }
                    }
                    for (n3 = 0; n3 < this.pixelsPerTile; ++n3) {
                        if (n3 <= n2 - this.pixelsPerTile / 2) {
                            byArray[n] = -1;
                        }
                        ++n;
                    }
                    --n2;
                }
            }
            for (n3 = 0; n3 < this.pixelsPerTile; ++n3) {
                if (n3 <= n2 - this.pixelsPerTile / 2) {
                    byArray[n] = -1;
                }
                ++n;
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="117")
    @Export(value="init7")
    void init7() {
        byte[] byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
        int n = 0;
        byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
        n = 0;
        int n2 = 0;
        while (true) {
            int n3;
            if (n2 >= this.pixelsPerTile) {
                this.tileTemplates[7][0] = byArray;
                byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                n = 0;
                n2 = this.pixelsPerTile - 1;
                while (true) {
                    if (n2 < 0) {
                        this.tileTemplates[7][1] = byArray;
                        byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                        n = 0;
                        n2 = this.pixelsPerTile - 1;
                        while (true) {
                            if (n2 < 0) {
                                this.tileTemplates[7][2] = byArray;
                                byArray = new byte[this.pixelsPerTile * this.pixelsPerTile];
                                n = 0;
                                n2 = 0;
                                while (true) {
                                    if (n2 >= this.pixelsPerTile) {
                                        this.tileTemplates[7][3] = byArray;
                                        return;
                                    }
                                    for (n3 = this.pixelsPerTile - 1; n3 >= 0; --n3) {
                                        if (n3 >= n2 - this.pixelsPerTile / 2) {
                                            byArray[n] = -1;
                                        }
                                        ++n;
                                    }
                                    ++n2;
                                }
                            }
                            for (n3 = this.pixelsPerTile - 1; n3 >= 0; --n3) {
                                if (n3 >= n2 - this.pixelsPerTile / 2) {
                                    byArray[n] = -1;
                                }
                                ++n;
                            }
                            --n2;
                        }
                    }
                    for (n3 = 0; n3 < this.pixelsPerTile; ++n3) {
                        if (n3 >= n2 - this.pixelsPerTile / 2) {
                            byArray[n] = -1;
                        }
                        ++n;
                    }
                    --n2;
                }
            }
            for (n3 = 0; n3 < this.pixelsPerTile; ++n3) {
                if (n3 >= n2 - this.pixelsPerTile / 2) {
                    byArray[n] = -1;
                }
                ++n;
            }
            ++n2;
        }
    }
}

