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

@ObfuscatedName(value="pu")
@Implements(value="GrandExchangeOffer")
public class GrandExchangeOffer {
    @ObfuscatedName(value="ay")
    @Export(value="state")
    byte state;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1143661643)
    @Export(value="id")
    public int id;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=708435427)
    @Export(value="unitPrice")
    public int unitPrice;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-219996791)
    @Export(value="totalQuantity")
    public int totalQuantity;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-2134705951)
    @Export(value="currentQuantity")
    public int currentQuantity;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-2086438493)
    @Export(value="currentPrice")
    public int currentPrice;

    public GrandExchangeOffer() {
    }

    @ObfuscatedSignature(descriptor="(Lvy;Z)V", garbageValue="0")
    public GrandExchangeOffer(Buffer buffer, boolean bl) {
        this.state = buffer.readByte();
        this.id = buffer.readUnsignedShort();
        this.unitPrice = buffer.readInt();
        this.totalQuantity = buffer.readInt();
        this.currentQuantity = buffer.readInt();
        this.currentPrice = buffer.readInt();
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="305720230")
    @Export(value="status")
    public int status() {
        return this.state & 7;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1473569240")
    @Export(value="type")
    public int type() {
        return (this.state & 8) == 8 ? 1 : 0;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="854210133")
    void method7918(int n) {
        this.state = (byte)(this.state & 0xFFFFFFF8);
        this.state = (byte)(this.state | n & 7);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-923443826")
    void method7919(int n) {
        this.state = (byte)(this.state & 0xFFFFFFF7);
        if (n == 1) {
            this.state = (byte)(this.state | 8);
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)D", garbageValue="849686759")
    public static double method7927(int n) {
        int n2 = class507.field5154[n & 0x7FF];
        return (double)n2 / 65536.0;
    }
}

