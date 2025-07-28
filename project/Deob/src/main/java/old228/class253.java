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

@ObfuscatedName(value="jy")
public class class253
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    public static class391 field2706;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static class315 field2710;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=415300407)
    int field2711 = 0;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=636115089)
    public int field2705;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-432148143)
    public int field2709;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1778819099)
    public int field2708;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-660163557)
    public int field2707;

    static {
        field2710 = new class315(64);
    }

    class253() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-692891777")
    void method5384() {
        this.method5387(this.field2711);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;IB)V", garbageValue="-14")
    void method5385(class556 class5562, int n) {
        int n2;
        while ((n2 = class5562.method10282()) != 0) {
            this.method5393(class5562, n2, n);
        }
        return;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;III)V", garbageValue="-694252472")
    void method5393(class556 class5562, int n, int n2) {
        if (n == 1) {
            this.field2711 = class5562.method10285();
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-931556523")
    void method5387(int n) {
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
        this.field2709 = (int)(256.0 * d7);
        this.field2708 = (int)(256.0 * d8);
        if (this.field2709 < 0) {
            this.field2709 = 0;
        } else if (this.field2709 > 255) {
            this.field2709 = 255;
        }
        if (this.field2708 < 0) {
            this.field2708 = 0;
        } else if (this.field2708 > 255) {
            this.field2708 = 255;
        }
        this.field2707 = d8 > 0.5 ? (int)((1.0 - d8) * d7 * 512.0) : (int)(d7 * d8 * 512.0);
        if (this.field2707 < 1) {
            this.field2707 = 1;
        }
        this.field2705 = (int)(d6 * (double)this.field2707);
    }

    @ObfuscatedName(value="nk")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-752235605")
    static final void method5403() {
        client.field699 = client.field549;
        class20.field91 = true;
    }
}

