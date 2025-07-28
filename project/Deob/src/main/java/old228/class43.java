package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ba")
public class class43 {
    @ObfuscatedName(value="ay")
    int field287 = 2;
    @ObfuscatedName(value="ah")
    int[] field277 = new int[2];
    @ObfuscatedName(value="az")
    int[] field283 = new int[2];
    @ObfuscatedName(value="ao")
    int field280;
    @ObfuscatedName(value="ad")
    int field281;
    @ObfuscatedName(value="an")
    int field282;
    @ObfuscatedName(value="ae")
    int field285;
    @ObfuscatedName(value="ax")
    int field278;
    @ObfuscatedName(value="at")
    int field284;
    @ObfuscatedName(value="ac")
    int field286;
    @ObfuscatedName(value="au")
    int field279;

    class43() {
        this.field277[0] = 0;
        this.field277[1] = 65535;
        this.field283[0] = 0;
        this.field283[1] = 65535;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;)V")
    final void method858(class556 class5562) {
        this.field282 = class5562.method10282();
        this.field280 = class5562.method10440();
        this.field281 = class5562.method10440();
        this.method860(class5562);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;)V")
    final void method860(class556 class5562) {
        this.field287 = class5562.method10282();
        this.field277 = new int[this.field287];
        this.field283 = new int[this.field287];
        int n = 0;
        while (n < this.field287) {
            this.field277[n] = class5562.method10307();
            this.field283[n] = class5562.method10307();
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="az")
    final void method859() {
        this.field285 = 0;
        this.field278 = 0;
        this.field284 = 0;
        this.field286 = 0;
        this.field279 = 0;
    }

    @ObfuscatedName(value="ao")
    final int method862(int n) {
        if (this.field279 >= this.field285) {
            this.field286 = this.field283[this.field278++] << 15;
            if (this.field278 >= this.field287) {
                this.field278 = this.field287 - 1;
            }
            this.field285 = (int)((double)this.field277[this.field278] / 65536.0 * (double)n);
            if (this.field285 > this.field279) {
                this.field284 = ((this.field283[this.field278] << 15) - this.field286) / (this.field285 - this.field279);
            }
        }
        this.field286 += this.field284;
        ++this.field279;
        return this.field286 - this.field284 >> 15;
    }
}

