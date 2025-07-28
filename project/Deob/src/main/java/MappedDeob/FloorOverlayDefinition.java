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

@ObfuscatedName(value="kh")
@Implements(value="FloorOverlayDefinition")
public class FloorOverlayDefinition
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="FloorOverlayDefinition_archive")
    public static AbstractArchive FloorOverlayDefinition_archive;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="FloorOverlayDefinition_cached")
    public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=723339769)
    @Export(value="primaryRgb")
    public int primaryRgb = 0;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1608774715)
    @Export(value="texture")
    public int texture = -1;
    @ObfuscatedName(value="ad")
    @Export(value="hideUnderlay")
    public boolean hideUnderlay = true;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1188899257)
    @Export(value="secondaryRgb")
    public int secondaryRgb = -1;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1268256995)
    @Export(value="hue")
    public int hue;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1591346701)
    @Export(value="saturation")
    public int saturation;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=790799761)
    @Export(value="lightness")
    public int lightness;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=1813568943)
    @Export(value="secondaryHue")
    public int secondaryHue;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-756026487)
    @Export(value="secondarySaturation")
    public int secondarySaturation;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-1827749161)
    @Export(value="secondaryLightness")
    public int secondaryLightness;

    static {
        FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="58")
    @Export(value="postDecode")
    public void postDecode() {
        if (this.secondaryRgb != -1) {
            this.setHsl(this.secondaryRgb);
            this.secondaryHue = this.hue;
            this.secondarySaturation = this.saturation;
            this.secondaryLightness = this.lightness;
        }
        this.setHsl(this.primaryRgb);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;IB)V", garbageValue="92")
    @Export(value="decode")
    public void decode(Buffer buffer, int n) {
        int n2;
        while ((n2 = buffer.readUnsignedByte()) != 0) {
            this.decodeNext(buffer, n2, n);
        }
        return;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;III)V", garbageValue="-2100971127")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n, int n2) {
        if (n == 1) {
            this.primaryRgb = buffer.readMedium();
        } else if (n == 2) {
            this.texture = buffer.readUnsignedByte();
        } else if (n == 5) {
            this.hideUnderlay = false;
        } else if (n == 7) {
            this.secondaryRgb = buffer.readMedium();
        } else if (n == 8) {
            // empty if block
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="92")
    @Export(value="setHsl")
    void setHsl(int n) {
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
        this.hue = (int)((d6 /= 6.0) * 256.0);
        this.saturation = (int)(256.0 * d7);
        this.lightness = (int)(d8 * 256.0);
        if (this.saturation < 0) {
            this.saturation = 0;
        } else if (this.saturation > 255) {
            this.saturation = 255;
        }
        if (this.lightness < 0) {
            this.lightness = 0;
        } else if (this.lightness > 255) {
            this.lightness = 255;
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

