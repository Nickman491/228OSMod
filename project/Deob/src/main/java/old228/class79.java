package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dn")
public final class class79
extends class190 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=739120569)
    int field969;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1349592311)
    int field972;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-865782673)
    int field989;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-141392581)
    int field965;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1900685121)
    int field977;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-587423577)
    int field963;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1673977269)
    int field985;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1065381413)
    int field967;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-706453793)
    int field964;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-1633593095)
    int field982;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=1931084429)
    int field968;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=1958929093)
    int field962;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=1795420119)
    int field974;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-1310000737)
    int field975;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-278059355)
    int field976;
    @ObfuscatedName(value="ak")
    boolean field980 = false;
    @ObfuscatedName(value="al")
    double field978;
    @ObfuscatedName(value="av")
    double field979;
    @ObfuscatedName(value="ag")
    double field971;
    @ObfuscatedName(value="aw")
    double field981;
    @ObfuscatedName(value="ai")
    double field973;
    @ObfuscatedName(value="ar")
    double field983;
    @ObfuscatedName(value="am")
    double field984;
    @ObfuscatedName(value="ap")
    double field970;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=1609779233)
    int field986;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=1117073495)
    int field987;
    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="Lkb;")
    SequenceDef field988;
    @ObfuscatedName(value="bh")
    @ObfuscatedGetter(intValue=-1645215705)
    int field966 = 0;
    @ObfuscatedName(value="bw")
    @ObfuscatedGetter(intValue=-1043117971)
    int field990 = 0;

    class79(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        this.field969 = n;
        this.field972 = n2;
        this.field989 = n3;
        this.field965 = n4;
        this.field977 = n5;
        this.field982 = n6;
        this.field968 = n7;
        this.field962 = n8;
        this.field974 = n9;
        this.field976 = n10;
        this.field963 = n11;
        this.field980 = false;
        int n12 = ObjectDef.method5541((int)this.field969).field2703;
        this.field988 = n12 != -1 ? class33.method520(n12) : null;
    }

    class79(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        this(n, n2, n3, n4, n5, n6, n7, n8, n9, n11, n12);
        this.field975 = n10;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="36")
    final void method2453(int n, int n2, int n3, int n4) {
        double d;
        this.field985 = n;
        this.field967 = n2;
        this.field964 = n3;
        if (!this.field980) {
            d = this.field985 - this.field989;
            double d2 = this.field967 - this.field965;
            double d3 = Math.sqrt(d * d + d2 * d2);
            this.field978 = (double)this.field989 + (double)this.field974 * d / d3;
            this.field979 = (double)this.field965 + d2 * (double)this.field974 / d3;
            this.field971 = this.field977;
        }
        d = this.field968 + 1 - n4;
        this.field981 = ((double)this.field985 - this.field978) / d;
        this.field973 = ((double)this.field967 - this.field979) / d;
        this.field983 = Math.sqrt(this.field973 * this.field973 + this.field981 * this.field981);
        if (!this.field980) {
            this.field984 = -this.field983 * Math.tan(0.02454369 * (double)this.field962);
        }
        this.field970 = 2.0 * ((double)this.field964 - this.field971 - this.field984 * d) / (d * d);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1469246305")
    final void method2459(int n) {
        this.field980 = true;
        this.field978 += this.field981 * (double)n;
        this.field979 += (double)n * this.field973;
        this.field971 += this.field984 * (double)n + (double)n * (0.5 * this.field970) * (double)n;
        this.field984 += (double)n * this.field970;
        this.field986 = (int)(Math.atan2(this.field981, this.field973) * 325.949) + 1024 & 0x7FF;
        this.field987 = (int)(Math.atan2(this.field984, this.field983) * 325.949) & 0x7FF;
        if (this.field988 == null) return;
        if (this.field988.method5672()) {
            this.field966 += n;
            int n2 = this.field988.method5703();
            if (this.field966 < n2) return;
            this.field966 = n2 - this.field988.field2932;
            return;
        }
        this.field990 += n;
        while (this.field990 > this.field988.field2923[this.field966]) {
            this.field990 -= this.field988.field2923[this.field966];
            ++this.field966;
            if (this.field966 < this.field988.field2916.length) continue;
            this.field966 -= this.field988.field2932;
            if (this.field966 >= 0 && this.field966 < this.field988.field2916.length) continue;
            this.field966 = 0;
        }
        return;
    }

    @Override
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(B)Lhv;", garbageValue="-7")
    protected final class198 vmethod4447() {
        class252 class2522 = ObjectDef.method5541(this.field969);
        class198 class1982 = class2522.method5381(this.field966);
        if (class1982 == null) {
            return null;
        }
        class1982.method4558(this.field987);
        return class1982;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="474346292")
    static void method2456() {
        class536 class5362 = null;
        try {
            class5362 = class31.method493("", class259.field2749.field4125, true);
            class556 class5562 = class544.field5403.method2881();
            class5362.method10028(class5562.field5470, 0, class5562.field5471);
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            if (class5362 != null) {
                class5362.method10030(true);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(IIIZIII)J", garbageValue="959258606")
    public static long method2452(int n, int n2, int n3, boolean bl, int n4, int n5) {
        long l = (long)((n & 0x7F) << 0 | (n2 & 0x7F) << 7 | (n3 & 3) << 14) | ((long)n4 & 0xFFFFFFFFL) << 17 | ((long)n5 & 0x7FFL) << 49;
        if (bl) {
            l |= 0x10000L;
        }
        return l;
    }

    @ObfuscatedName(value="jb")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="-15")
    static final void method2454(boolean bl) {
        class113.method3178();
        ++client.field564.field1455;
        if (client.field564.field1455 < 50 && !bl) {
            return;
        }
        client.field564.field1455 = 0;
        if (!client.field566 && client.field564.method3249() != null) {
            class324 class3242 = class90.method2629(class322.field3382, client.field564.field1446);
            client.field564.method3257(class3242);
            try {
                client.field564.method3246();
            }
            catch (IOException iOException) {
                client.field566 = true;
            }
        }
    }
}

