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

@ObfuscatedName(value="kh")
public class OverlayDef
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    public static class391 field2904;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static class315 field2914;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=723339769)
    public int field2905 = 0;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1608774715)
    public int field2906 = -1;
    @ObfuscatedName(value="ad")
    public boolean field2911 = true;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1188899257)
    public int field2908 = -1;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1268256995)
    public int field2909;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1591346701)
    public int field2910;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=790799761)
    public int field2903;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=1813568943)
    public int field2912;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-756026487)
    public int field2913;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-1827749161)
    public int field2907;

    static {
        field2914 = new class315(64);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="58")
    public void method5646() {
        if (this.field2908 != -1) {
            this.method5659(this.field2908);
            this.field2912 = this.field2909;
            this.field2913 = this.field2910;
            this.field2907 = this.field2903;
        }
        this.method5659(this.field2905);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;IB)V", garbageValue="92")
    public void method5647(class556 class5562, int n) {
        int n2;
        while ((n2 = class5562.method10282()) != 0) {
            this.method5648(class5562, n2, n);
        }
        return;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;III)V", garbageValue="-2100971127")
    void method5648(class556 class5562, int n, int n2) {
        if (n == 1) {
            this.field2905 = class5562.method10285();
        } else if (n == 2) {
            this.field2906 = class5562.method10282();
        } else if (n == 5) {
            this.field2911 = false;
        } else if (n == 7) {
            this.field2908 = class5562.method10285();
        } else if (n == 8) {
            // empty if block
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="92")
    void method5659(int n) {
        double d;
        double d2 = (double)(n >> 16 & 0xFF) / 256.0;
        double d3 = (double)(n >> 8 & 0xFF) / 256.0;
        double d4 = (double)(n & 0xFF) / 256.0;
        double d5 = d2;
        if (d3 < d5) {
            d5 = d3;
        }
        if (d4 < d5) {
            d5 = d4;
        }
        if (d3 > (d = d2)) {
            d = d3;
        }
        if (d4 > d) {
            d = d4;
        }
        double d6 = 0.0;
        double d7 = 0.0;
        double d8 = (d + d5) / 2.0;
        if (d != d5) {
            if (d8 < 0.5) {
                d7 = (d - d5) / (d5 + d);
            }
            if (d8 >= 0.5) {
                d7 = (d - d5) / (2.0 - d - d5);
            }
            if (d2 == d) {
                d6 = (d3 - d4) / (d - d5);
            } else if (d3 == d) {
                d6 = (d4 - d2) / (d - d5) + 2.0;
            } else if (d == d4) {
                d6 = (d2 - d3) / (d - d5) + 4.0;
            }
        }
        this.field2909 = (int)((d6 /= 6.0) * 256.0);
        this.field2910 = (int)(256.0 * d7);
        this.field2903 = (int)(d8 * 256.0);
        if (this.field2910 < 0) {
            this.field2910 = 0;
        } else if (this.field2910 > 255) {
            this.field2910 = 255;
        }
        if (this.field2903 < 0) {
            this.field2903 = 0;
        } else if (this.field2903 > 255) {
            this.field2903 = 255;
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="([[[IIIII)V", garbageValue="441580607")
    static final void method5662(int[][][] nArray, int n, int n2, int n3) {
        int n4 = 0;
        while (true) {
            if (n4 >= 8) {
                if (n2 > 0) {
                    for (n4 = 1; n4 < 8; ++n4) {
                        nArray[n][n2][n3 + n4] = nArray[n][n2 - 1][n3 + n4];
                    }
                }
                if (n3 > 0) {
                    for (n4 = 1; n4 < 8; ++n4) {
                        nArray[n][n4 + n2][n3] = nArray[n][n4 + n2][n3 - 1];
                    }
                }
                if (n2 > 0 && nArray[n][n2 - 1][n3] != 0) {
                    nArray[n][n2][n3] = nArray[n][n2 - 1][n3];
                } else if (n3 > 0 && nArray[n][n2][n3 - 1] != 0) {
                    nArray[n][n2][n3] = nArray[n][n2][n3 - 1];
                } else if (n2 > 0 && n3 > 0 && nArray[n][n2 - 1][n3 - 1] != 0) {
                    nArray[n][n2][n3] = nArray[n][n2 - 1][n3 - 1];
                }
                return;
            }
            for (int i = 0; i < 8; ++i) {
                nArray[n][n4 + n2][n3 + i] = 0;
            }
            ++n4;
        }
    }
}

