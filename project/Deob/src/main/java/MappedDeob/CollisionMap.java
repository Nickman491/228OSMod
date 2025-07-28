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

@ObfuscatedName(value="ku")
@Implements(value="CollisionMap")
public class CollisionMap {
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-300118987)
    static int field2995;
    @ObfuscatedName(value="bt")
    @ObfuscatedGetter(intValue=-282336855)
    @Export(value="xInset")
    int xInset = 0;
    @ObfuscatedName(value="bf")
    @ObfuscatedGetter(intValue=-2013653011)
    @Export(value="yInset")
    int yInset = 0;
    @ObfuscatedName(value="by")
    @ObfuscatedGetter(intValue=-1403464625)
    @Export(value="xSize")
    public int xSize;
    @ObfuscatedName(value="bm")
    @ObfuscatedGetter(intValue=1481826841)
    @Export(value="ySize")
    public int ySize;
    @ObfuscatedName(value="bp")
    @Export(value="flags")
    public int[][] flags;

    public CollisionMap(int n, int n2) {
        this.xSize = n;
        this.ySize = n2;
        this.flags = new int[this.xSize][this.ySize];
        this.clear();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-999668508")
    @Export(value="clear")
    public void clear() {
        int n = 0;
        while (n < this.xSize) {
            for (int i = 0; i < this.ySize; ++i) {
                if (n != 0 && i != 0 && n < this.xSize - 5 && i < this.ySize - 5) {
                    this.flags[n][i] = 0x40000000;
                    continue;
                }
                this.flags[n][i] = 0xFFFFFF;
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIIZB)V", garbageValue="-116")
    public void method5797(int n, int n2, int n3, int n4, boolean bl) {
        n -= this.xInset;
        n2 -= this.yInset;
        if (n3 == 0) {
            if (n4 == 0) {
                this.setFlag(n, n2, 128);
                this.setFlag(n - 1, n2, 8);
            }
            if (n4 == 1) {
                this.setFlag(n, n2, 2);
                this.setFlag(n, n2 + 1, 32);
            }
            if (n4 == 2) {
                this.setFlag(n, n2, 8);
                this.setFlag(n + 1, n2, 128);
            }
            if (n4 == 3) {
                this.setFlag(n, n2, 32);
                this.setFlag(n, n2 - 1, 2);
            }
        }
        if (n3 == 1 || n3 == 3) {
            if (n4 == 0) {
                this.setFlag(n, n2, 1);
                this.setFlag(n - 1, n2 + 1, 16);
            }
            if (n4 == 1) {
                this.setFlag(n, n2, 4);
                this.setFlag(n + 1, n2 + 1, 64);
            }
            if (n4 == 2) {
                this.setFlag(n, n2, 16);
                this.setFlag(n + 1, n2 - 1, 1);
            }
            if (n4 == 3) {
                this.setFlag(n, n2, 64);
                this.setFlag(n - 1, n2 - 1, 4);
            }
        }
        if (n3 == 2) {
            if (n4 == 0) {
                this.setFlag(n, n2, 130);
                this.setFlag(n - 1, n2, 8);
                this.setFlag(n, n2 + 1, 32);
            }
            if (n4 == 1) {
                this.setFlag(n, n2, 10);
                this.setFlag(n, n2 + 1, 32);
                this.setFlag(n + 1, n2, 128);
            }
            if (n4 == 2) {
                this.setFlag(n, n2, 40);
                this.setFlag(n + 1, n2, 128);
                this.setFlag(n, n2 - 1, 2);
            }
            if (n4 == 3) {
                this.setFlag(n, n2, 160);
                this.setFlag(n, n2 - 1, 2);
                this.setFlag(n - 1, n2, 8);
            }
        }
        if (bl) {
            if (n3 == 0) {
                if (n4 == 0) {
                    this.setFlag(n, n2, 65536);
                    this.setFlag(n - 1, n2, 4096);
                }
                if (n4 == 1) {
                    this.setFlag(n, n2, 1024);
                    this.setFlag(n, n2 + 1, 16384);
                }
                if (n4 == 2) {
                    this.setFlag(n, n2, 4096);
                    this.setFlag(n + 1, n2, 65536);
                }
                if (n4 == 3) {
                    this.setFlag(n, n2, 16384);
                    this.setFlag(n, n2 - 1, 1024);
                }
            }
            if (n3 == 1 || n3 == 3) {
                if (n4 == 0) {
                    this.setFlag(n, n2, 512);
                    this.setFlag(n - 1, n2 + 1, 8192);
                }
                if (n4 == 1) {
                    this.setFlag(n, n2, 2048);
                    this.setFlag(n + 1, n2 + 1, 32768);
                }
                if (n4 == 2) {
                    this.setFlag(n, n2, 8192);
                    this.setFlag(n + 1, n2 - 1, 512);
                }
                if (n4 == 3) {
                    this.setFlag(n, n2, 32768);
                    this.setFlag(n - 1, n2 - 1, 2048);
                }
            }
            if (n3 == 2) {
                if (n4 == 0) {
                    this.setFlag(n, n2, 66560);
                    this.setFlag(n - 1, n2, 4096);
                    this.setFlag(n, n2 + 1, 16384);
                }
                if (n4 == 1) {
                    this.setFlag(n, n2, 5120);
                    this.setFlag(n, n2 + 1, 16384);
                    this.setFlag(n + 1, n2, 65536);
                }
                if (n4 == 2) {
                    this.setFlag(n, n2, 20480);
                    this.setFlag(n + 1, n2, 65536);
                    this.setFlag(n, n2 - 1, 1024);
                }
                if (n4 == 3) {
                    this.setFlag(n, n2, 81920);
                    this.setFlag(n, n2 - 1, 1024);
                    this.setFlag(n - 1, n2, 4096);
                }
            }
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIIIZI)V", garbageValue="-2042285315")
    @Export(value="addGameObject")
    public void addGameObject(int n, int n2, int n3, int n4, boolean bl) {
        int n5 = 256;
        if (bl) {
            n5 += 131072;
        }
        n2 -= this.yInset;
        int n6 = n -= this.xInset;
        while (n6 < n3 + n) {
            if (n6 >= 0 && n6 < this.xSize) {
                for (int i = n2; i < n2 + n4; ++i) {
                    if (i < 0 || i >= this.ySize) continue;
                    this.setFlag(n6, i, n5);
                }
            }
            ++n6;
        }
        return;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="-9")
    public void method5814(int n, int n2) {
        int[] nArray = this.flags[n -= this.xInset];
        int n3 = n2 -= this.yInset;
        nArray[n3] = nArray[n3] | 0x200000;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="48")
    public void method5812(int n, int n2) {
        int[] nArray = this.flags[n -= this.xInset];
        int n3 = n2 -= this.yInset;
        nArray[n3] = nArray[n3] | 0x40000;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IIII)V", garbageValue="884769403")
    @Export(value="setFlag")
    void setFlag(int n, int n2, int n3) {
        int[] nArray = this.flags[n];
        int n4 = n2;
        nArray[n4] = nArray[n4] | n3;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IIIIZI)V", garbageValue="1594522752")
    public void method5802(int n, int n2, int n3, int n4, boolean bl) {
        n -= this.xInset;
        n2 -= this.yInset;
        if (n3 == 0) {
            if (n4 == 0) {
                this.setFlagOff(n, n2, 128);
                this.setFlagOff(n - 1, n2, 8);
            }
            if (n4 == 1) {
                this.setFlagOff(n, n2, 2);
                this.setFlagOff(n, n2 + 1, 32);
            }
            if (n4 == 2) {
                this.setFlagOff(n, n2, 8);
                this.setFlagOff(n + 1, n2, 128);
            }
            if (n4 == 3) {
                this.setFlagOff(n, n2, 32);
                this.setFlagOff(n, n2 - 1, 2);
            }
        }
        if (n3 == 1 || n3 == 3) {
            if (n4 == 0) {
                this.setFlagOff(n, n2, 1);
                this.setFlagOff(n - 1, n2 + 1, 16);
            }
            if (n4 == 1) {
                this.setFlagOff(n, n2, 4);
                this.setFlagOff(n + 1, n2 + 1, 64);
            }
            if (n4 == 2) {
                this.setFlagOff(n, n2, 16);
                this.setFlagOff(n + 1, n2 - 1, 1);
            }
            if (n4 == 3) {
                this.setFlagOff(n, n2, 64);
                this.setFlagOff(n - 1, n2 - 1, 4);
            }
        }
        if (n3 == 2) {
            if (n4 == 0) {
                this.setFlagOff(n, n2, 130);
                this.setFlagOff(n - 1, n2, 8);
                this.setFlagOff(n, n2 + 1, 32);
            }
            if (n4 == 1) {
                this.setFlagOff(n, n2, 10);
                this.setFlagOff(n, n2 + 1, 32);
                this.setFlagOff(n + 1, n2, 128);
            }
            if (n4 == 2) {
                this.setFlagOff(n, n2, 40);
                this.setFlagOff(n + 1, n2, 128);
                this.setFlagOff(n, n2 - 1, 2);
            }
            if (n4 == 3) {
                this.setFlagOff(n, n2, 160);
                this.setFlagOff(n, n2 - 1, 2);
                this.setFlagOff(n - 1, n2, 8);
            }
        }
        if (bl) {
            if (n3 == 0) {
                if (n4 == 0) {
                    this.setFlagOff(n, n2, 65536);
                    this.setFlagOff(n - 1, n2, 4096);
                }
                if (n4 == 1) {
                    this.setFlagOff(n, n2, 1024);
                    this.setFlagOff(n, n2 + 1, 16384);
                }
                if (n4 == 2) {
                    this.setFlagOff(n, n2, 4096);
                    this.setFlagOff(n + 1, n2, 65536);
                }
                if (n4 == 3) {
                    this.setFlagOff(n, n2, 16384);
                    this.setFlagOff(n, n2 - 1, 1024);
                }
            }
            if (n3 == 1 || n3 == 3) {
                if (n4 == 0) {
                    this.setFlagOff(n, n2, 512);
                    this.setFlagOff(n - 1, n2 + 1, 8192);
                }
                if (n4 == 1) {
                    this.setFlagOff(n, n2, 2048);
                    this.setFlagOff(n + 1, n2 + 1, 32768);
                }
                if (n4 == 2) {
                    this.setFlagOff(n, n2, 8192);
                    this.setFlagOff(n + 1, n2 - 1, 512);
                }
                if (n4 == 3) {
                    this.setFlagOff(n, n2, 32768);
                    this.setFlagOff(n - 1, n2 - 1, 2048);
                }
            }
            if (n3 == 2) {
                if (n4 == 0) {
                    this.setFlagOff(n, n2, 66560);
                    this.setFlagOff(n - 1, n2, 4096);
                    this.setFlagOff(n, n2 + 1, 16384);
                }
                if (n4 == 1) {
                    this.setFlagOff(n, n2, 5120);
                    this.setFlagOff(n, n2 + 1, 16384);
                    this.setFlagOff(n + 1, n2, 65536);
                }
                if (n4 == 2) {
                    this.setFlagOff(n, n2, 20480);
                    this.setFlagOff(n + 1, n2, 65536);
                    this.setFlagOff(n, n2 - 1, 1024);
                }
                if (n4 == 3) {
                    this.setFlagOff(n, n2, 81920);
                    this.setFlagOff(n, n2 - 1, 1024);
                    this.setFlagOff(n - 1, n2, 4096);
                }
            }
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(IIIIIZI)V", garbageValue="120960399")
    @Export(value="setFlagOffNonSquare")
    public void setFlagOffNonSquare(int n, int n2, int n3, int n4, int n5, boolean bl) {
        int n6;
        int n7 = 0x2000100;
        if (bl) {
            n7 += 131072;
        }
        n -= this.xInset;
        n2 -= this.yInset;
        if (n5 == 1 || n5 == 3) {
            n6 = n3;
            n3 = n4;
            n4 = n6;
        }
        n6 = n;
        while (n6 < n3 + n) {
            if (n6 >= 0 && n6 < this.xSize) {
                for (int i = n2; i < n2 + n4; ++i) {
                    if (i < 0 || i >= this.ySize) continue;
                    this.setFlagOff(n6, i, n7);
                }
            }
            ++n6;
        }
        return;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(IIIB)V", garbageValue="31")
    @Export(value="setFlagOff")
    void setFlagOff(int n, int n2, int n3) {
        int[] nArray = this.flags[n];
        int n4 = n2;
        nArray[n4] = nArray[n4] & ~n3;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="53")
    public void method5805(int n, int n2) {
        int[] nArray = this.flags[n -= this.xInset];
        int n3 = n2 -= this.yInset;
        nArray[n3] = nArray[n3] & 0xFFFBFFFF;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([BI)Ljava/lang/String;", garbageValue="1992752177")
    public static String method5830(byte[] byArray) {
        return class232.method5130(byArray, 0, byArray.length);
    }

    @ObfuscatedName(value="op")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-712588839")
    static void method5831(int n) {
        IntegerNode integerNode = (IntegerNode)Client.widgetFlags.first();
        while (integerNode != null) {
            if ((long)n == (integerNode.key >> 48 & 0xFFFFL)) {
                integerNode.remove();
            }
            integerNode = (IntegerNode)Client.widgetFlags.next();
        }
        return;
    }
}

