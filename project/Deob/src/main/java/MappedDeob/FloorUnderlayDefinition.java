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

@ObfuscatedName(value="jy")
@Implements(value="FloorUnderlayDefinition")
public class FloorUnderlayDefinition
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="FloorUnderlayDefinition_archive")
    public static AbstractArchive FloorUnderlayDefinition_archive;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="FloorUnderlayDefinition_cached")
    public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=415300407)
    @Export(value="rgb")
    int rgb = 0;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=636115089)
    @Export(value="hue")
    public int hue;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-432148143)
    @Export(value="saturation")
    public int saturation;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1778819099)
    @Export(value="lightness")
    public int lightness;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-660163557)
    @Export(value="hueMultiplier")
    public int hueMultiplier;

    static {
        FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
    }

    FloorUnderlayDefinition() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-692891777")
    @Export(value="postDecode")
    void postDecode() {
        this.setHsl(this.rgb);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;IB)V", garbageValue="-14")
    @Export(value="decode")
    void decode(Buffer buffer, int n) {
        int n2;
        while ((n2 = buffer.readUnsignedByte()) != 0) {
            this.decodeNext(buffer, n2, n);
        }
        return;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;III)V", garbageValue="-694252472")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n, int n2) {
        if (n == 1) {
            this.rgb = buffer.readMedium();
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-931556523")
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
                d7 = (d - d5) / (d + d5);
            }
            if (d8 >= 0.5) {
                d7 = (d - d5) / (2.0 - d - d5);
            }
            if (d == d2) {
                d6 = (d3 - d4) / (d - d5);
            } else if (d == d3) {
                d6 = (d4 - d2) / (d - d5) + 2.0;
            } else if (d4 == d) {
                d6 = (d2 - d3) / (d - d5) + 4.0;
            }
        }
        d6 /= 6.0;
        this.saturation = (int)(256.0 * d7);
        this.lightness = (int)(256.0 * d8);
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
        this.hueMultiplier = d8 > 0.5 ? (int)((1.0 - d8) * d7 * 512.0) : (int)(d7 * d8 * 512.0);
        if (this.hueMultiplier < 1) {
            this.hueMultiplier = 1;
        }
        this.hue = (int)(d6 * (double)this.hueMultiplier);
    }

    @ObfuscatedName(value="nk")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-752235605")
    @Export(value="addCancelMenuEntry")
    static final void addCancelMenuEntry() {
        Client.menuOptionsCount = Client.cycleCntr;
        class20.field91 = true;
    }
}

