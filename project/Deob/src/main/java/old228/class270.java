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

@ObfuscatedName(value="ku")
public class class270 {
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-300118987)
    static int field2995;
    @ObfuscatedName(value="bt")
    @ObfuscatedGetter(intValue=-282336855)
    int field2999 = 0;
    @ObfuscatedName(value="bf")
    @ObfuscatedGetter(intValue=-2013653011)
    int field2994 = 0;
    @ObfuscatedName(value="by")
    @ObfuscatedGetter(intValue=-1403464625)
    public int field2991;
    @ObfuscatedName(value="bm")
    @ObfuscatedGetter(intValue=1481826841)
    public int field3002;
    @ObfuscatedName(value="bp")
    public int[][] field3003;

    public class270(int n, int n2) {
        this.field2991 = n;
        this.field3002 = n2;
        this.field3003 = new int[this.field2991][this.field3002];
        this.method5800();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-999668508")
    public void method5800() {
        int n = 0;
        while (n < this.field2991) {
            for (int i = 0; i < this.field3002; ++i) {
                if (n != 0 && i != 0 && n < this.field2991 - 5 && i < this.field3002 - 5) {
                    this.field3003[n][i] = 0x40000000;
                    continue;
                }
                this.field3003[n][i] = 0xFFFFFF;
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIIZB)V", garbageValue="-116")
    public void method5797(int n, int n2, int n3, int n4, boolean bl) {
        n -= this.field2999;
        n2 -= this.field2994;
        if (n3 == 0) {
            if (n4 == 0) {
                this.method5809(n, n2, 128);
                this.method5809(n - 1, n2, 8);
            }
            if (n4 == 1) {
                this.method5809(n, n2, 2);
                this.method5809(n, n2 + 1, 32);
            }
            if (n4 == 2) {
                this.method5809(n, n2, 8);
                this.method5809(n + 1, n2, 128);
            }
            if (n4 == 3) {
                this.method5809(n, n2, 32);
                this.method5809(n, n2 - 1, 2);
            }
        }
        if (n3 == 1 || n3 == 3) {
            if (n4 == 0) {
                this.method5809(n, n2, 1);
                this.method5809(n - 1, n2 + 1, 16);
            }
            if (n4 == 1) {
                this.method5809(n, n2, 4);
                this.method5809(n + 1, n2 + 1, 64);
            }
            if (n4 == 2) {
                this.method5809(n, n2, 16);
                this.method5809(n + 1, n2 - 1, 1);
            }
            if (n4 == 3) {
                this.method5809(n, n2, 64);
                this.method5809(n - 1, n2 - 1, 4);
            }
        }
        if (n3 == 2) {
            if (n4 == 0) {
                this.method5809(n, n2, 130);
                this.method5809(n - 1, n2, 8);
                this.method5809(n, n2 + 1, 32);
            }
            if (n4 == 1) {
                this.method5809(n, n2, 10);
                this.method5809(n, n2 + 1, 32);
                this.method5809(n + 1, n2, 128);
            }
            if (n4 == 2) {
                this.method5809(n, n2, 40);
                this.method5809(n + 1, n2, 128);
                this.method5809(n, n2 - 1, 2);
            }
            if (n4 == 3) {
                this.method5809(n, n2, 160);
                this.method5809(n, n2 - 1, 2);
                this.method5809(n - 1, n2, 8);
            }
        }
        if (bl) {
            if (n3 == 0) {
                if (n4 == 0) {
                    this.method5809(n, n2, 65536);
                    this.method5809(n - 1, n2, 4096);
                }
                if (n4 == 1) {
                    this.method5809(n, n2, 1024);
                    this.method5809(n, n2 + 1, 16384);
                }
                if (n4 == 2) {
                    this.method5809(n, n2, 4096);
                    this.method5809(n + 1, n2, 65536);
                }
                if (n4 == 3) {
                    this.method5809(n, n2, 16384);
                    this.method5809(n, n2 - 1, 1024);
                }
            }
            if (n3 == 1 || n3 == 3) {
                if (n4 == 0) {
                    this.method5809(n, n2, 512);
                    this.method5809(n - 1, n2 + 1, 8192);
                }
                if (n4 == 1) {
                    this.method5809(n, n2, 2048);
                    this.method5809(n + 1, n2 + 1, 32768);
                }
                if (n4 == 2) {
                    this.method5809(n, n2, 8192);
                    this.method5809(n + 1, n2 - 1, 512);
                }
                if (n4 == 3) {
                    this.method5809(n, n2, 32768);
                    this.method5809(n - 1, n2 - 1, 2048);
                }
            }
            if (n3 == 2) {
                if (n4 == 0) {
                    this.method5809(n, n2, 66560);
                    this.method5809(n - 1, n2, 4096);
                    this.method5809(n, n2 + 1, 16384);
                }
                if (n4 == 1) {
                    this.method5809(n, n2, 5120);
                    this.method5809(n, n2 + 1, 16384);
                    this.method5809(n + 1, n2, 65536);
                }
                if (n4 == 2) {
                    this.method5809(n, n2, 20480);
                    this.method5809(n + 1, n2, 65536);
                    this.method5809(n, n2 - 1, 1024);
                }
                if (n4 == 3) {
                    this.method5809(n, n2, 81920);
                    this.method5809(n, n2 - 1, 1024);
                    this.method5809(n - 1, n2, 4096);
                }
            }
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIIIZI)V", garbageValue="-2042285315")
    public void method5798(int n, int n2, int n3, int n4, boolean bl) {
        int n5 = 256;
        if (bl) {
            n5 += 131072;
        }
        n2 -= this.field2994;
        int n6 = n -= this.field2999;
        while (n6 < n3 + n) {
            if (n6 >= 0 && n6 < this.field2991) {
                for (int i = n2; i < n2 + n4; ++i) {
                    if (i < 0 || i >= this.field3002) continue;
                    this.method5809(n6, i, n5);
                }
            }
            ++n6;
        }
        return;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="-9")
    public void method5814(int n, int n2) {
        int[] nArray = this.field3003[n -= this.field2999];
        int n3 = n2 -= this.field2994;
        nArray[n3] = nArray[n3] | 0x200000;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="48")
    public void method5812(int n, int n2) {
        int[] nArray = this.field3003[n -= this.field2999];
        int n3 = n2 -= this.field2994;
        nArray[n3] = nArray[n3] | 0x40000;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IIII)V", garbageValue="884769403")
    void method5809(int n, int n2, int n3) {
        int[] nArray = this.field3003[n];
        int n4 = n2;
        nArray[n4] = nArray[n4] | n3;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IIIIZI)V", garbageValue="1594522752")
    public void method5802(int n, int n2, int n3, int n4, boolean bl) {
        n -= this.field2999;
        n2 -= this.field2994;
        if (n3 == 0) {
            if (n4 == 0) {
                this.method5804(n, n2, 128);
                this.method5804(n - 1, n2, 8);
            }
            if (n4 == 1) {
                this.method5804(n, n2, 2);
                this.method5804(n, n2 + 1, 32);
            }
            if (n4 == 2) {
                this.method5804(n, n2, 8);
                this.method5804(n + 1, n2, 128);
            }
            if (n4 == 3) {
                this.method5804(n, n2, 32);
                this.method5804(n, n2 - 1, 2);
            }
        }
        if (n3 == 1 || n3 == 3) {
            if (n4 == 0) {
                this.method5804(n, n2, 1);
                this.method5804(n - 1, n2 + 1, 16);
            }
            if (n4 == 1) {
                this.method5804(n, n2, 4);
                this.method5804(n + 1, n2 + 1, 64);
            }
            if (n4 == 2) {
                this.method5804(n, n2, 16);
                this.method5804(n + 1, n2 - 1, 1);
            }
            if (n4 == 3) {
                this.method5804(n, n2, 64);
                this.method5804(n - 1, n2 - 1, 4);
            }
        }
        if (n3 == 2) {
            if (n4 == 0) {
                this.method5804(n, n2, 130);
                this.method5804(n - 1, n2, 8);
                this.method5804(n, n2 + 1, 32);
            }
            if (n4 == 1) {
                this.method5804(n, n2, 10);
                this.method5804(n, n2 + 1, 32);
                this.method5804(n + 1, n2, 128);
            }
            if (n4 == 2) {
                this.method5804(n, n2, 40);
                this.method5804(n + 1, n2, 128);
                this.method5804(n, n2 - 1, 2);
            }
            if (n4 == 3) {
                this.method5804(n, n2, 160);
                this.method5804(n, n2 - 1, 2);
                this.method5804(n - 1, n2, 8);
            }
        }
        if (bl) {
            if (n3 == 0) {
                if (n4 == 0) {
                    this.method5804(n, n2, 65536);
                    this.method5804(n - 1, n2, 4096);
                }
                if (n4 == 1) {
                    this.method5804(n, n2, 1024);
                    this.method5804(n, n2 + 1, 16384);
                }
                if (n4 == 2) {
                    this.method5804(n, n2, 4096);
                    this.method5804(n + 1, n2, 65536);
                }
                if (n4 == 3) {
                    this.method5804(n, n2, 16384);
                    this.method5804(n, n2 - 1, 1024);
                }
            }
            if (n3 == 1 || n3 == 3) {
                if (n4 == 0) {
                    this.method5804(n, n2, 512);
                    this.method5804(n - 1, n2 + 1, 8192);
                }
                if (n4 == 1) {
                    this.method5804(n, n2, 2048);
                    this.method5804(n + 1, n2 + 1, 32768);
                }
                if (n4 == 2) {
                    this.method5804(n, n2, 8192);
                    this.method5804(n + 1, n2 - 1, 512);
                }
                if (n4 == 3) {
                    this.method5804(n, n2, 32768);
                    this.method5804(n - 1, n2 - 1, 2048);
                }
            }
            if (n3 == 2) {
                if (n4 == 0) {
                    this.method5804(n, n2, 66560);
                    this.method5804(n - 1, n2, 4096);
                    this.method5804(n, n2 + 1, 16384);
                }
                if (n4 == 1) {
                    this.method5804(n, n2, 5120);
                    this.method5804(n, n2 + 1, 16384);
                    this.method5804(n + 1, n2, 65536);
                }
                if (n4 == 2) {
                    this.method5804(n, n2, 20480);
                    this.method5804(n + 1, n2, 65536);
                    this.method5804(n, n2 - 1, 1024);
                }
                if (n4 == 3) {
                    this.method5804(n, n2, 81920);
                    this.method5804(n, n2 - 1, 1024);
                    this.method5804(n - 1, n2, 4096);
                }
            }
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(IIIIIZI)V", garbageValue="120960399")
    public void method5803(int n, int n2, int n3, int n4, int n5, boolean bl) {
        int n6;
        int n7 = 0x2000100;
        if (bl) {
            n7 += 131072;
        }
        n -= this.field2999;
        n2 -= this.field2994;
        if (n5 == 1 || n5 == 3) {
            n6 = n3;
            n3 = n4;
            n4 = n6;
        }
        n6 = n;
        while (n6 < n3 + n) {
            if (n6 >= 0 && n6 < this.field2991) {
                for (int i = n2; i < n2 + n4; ++i) {
                    if (i < 0 || i >= this.field3002) continue;
                    this.method5804(n6, i, n7);
                }
            }
            ++n6;
        }
        return;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(IIIB)V", garbageValue="31")
    void method5804(int n, int n2, int n3) {
        int[] nArray = this.field3003[n];
        int n4 = n2;
        nArray[n4] = nArray[n4] & ~n3;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="53")
    public void method5805(int n, int n2) {
        int[] nArray = this.field3003[n -= this.field2999];
        int n3 = n2 -= this.field2994;
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
        class513 class5132 = (class513)client.field710.method9988();
        while (class5132 != null) {
            if ((long)n == (class5132.field5174 >> 48 & 0xFFFFL)) {
                class5132.method9623();
            }
            class5132 = (class513)client.field710.method9996();
        }
        return;
    }
}

