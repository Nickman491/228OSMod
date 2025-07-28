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

@ObfuscatedName(value="ql")
@Implements(value="Bounds")
public class Bounds {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1187183205)
    @Export(value="lowX")
    public int lowX;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=2020733535)
    @Export(value="lowY")
    public int lowY;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1966960069)
    @Export(value="highX")
    public int highX;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=98523261)
    @Export(value="highY")
    public int highY;

    public Bounds(int n, int n2, int n3, int n4) {
        this.setLow(n, n2);
        this.setHigh(n3, n4);
    }

    public Bounds(int n, int n2) {
        this(0, 0, n, n2);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="36")
    @Export(value="setLow")
    public void setLow(int n, int n2) {
        this.lowX = n;
        this.lowY = n2;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-353425709")
    @Export(value="setHigh")
    public void setHigh(int n, int n2) {
        this.highX = n;
        this.highY = n2;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIB)Z", garbageValue="-2")
    public boolean method8263(int n, int n2) {
        return n >= this.lowX && n < this.lowX + this.highX && n2 >= this.lowY && n2 < this.highY + this.lowY;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lql;Lql;B)V", garbageValue="-33")
    public void method8265(Bounds bounds, Bounds bounds2) {
        this.method8266(bounds, bounds2);
        this.method8267(bounds, bounds2);
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lql;Lql;S)V", garbageValue="1000")
    void method8266(Bounds bounds, Bounds bounds2) {
        bounds2.lowX = this.lowX;
        bounds2.highX = this.highX;
        if (this.lowX < bounds.lowX) {
            bounds2.highX -= bounds.lowX - this.lowX;
            bounds2.lowX = bounds.lowX;
        }
        if (bounds2.method8268() > bounds.method8268()) {
            bounds2.highX -= bounds2.method8268() - bounds.method8268();
        }
        if (bounds2.highX < 0) {
            bounds2.highX = 0;
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lql;Lql;B)V", garbageValue="42")
    void method8267(Bounds bounds, Bounds bounds2) {
        bounds2.lowY = this.lowY;
        bounds2.highY = this.highY;
        if (this.lowY < bounds.lowY) {
            bounds2.highY -= bounds.lowY - this.lowY;
            bounds2.lowY = bounds.lowY;
        }
        if (bounds2.method8260() > bounds.method8260()) {
            bounds2.highY -= bounds2.method8260() - bounds.method8260();
        }
        if (bounds2.highY < 0) {
            bounds2.highY = 0;
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1827217304")
    int method8268() {
        return this.highX + this.lowX;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1683044794")
    int method8260() {
        return this.lowY + this.highY;
    }

    public String toString() {
        return null;
    }
}

