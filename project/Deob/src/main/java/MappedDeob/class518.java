/*
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

@ObfuscatedName(value="ti")
public class class518
extends class521 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=787504179)
    int field5223 = 0;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-693478239)
    int field5221 = 0;
    @ObfuscatedName(value="az")
    double field5219 = 0.0;
    @ObfuscatedName(value="ao")
    double field5218 = 0.0;
    @ObfuscatedName(value="ad")
    double field5222 = 0.0;
    @ObfuscatedName(value="an")
    double field5220 = 0.0;
    @ObfuscatedName(value="ae")
    double field5224 = 0.0;

    public class518(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        super(n9, n10);
        this.field5223 = n3;
        this.field5221 = n6;
        if ((n5 - n8) * (n7 - n) != (n4 - n7) * (n8 - n2)) {
            boolean bl;
            double d = (double)(n7 + n) / 2.0;
            double d2 = (double)(n8 + n2) / 2.0;
            double d3 = (double)(n4 + n7) / 2.0;
            double d4 = (double)(n5 + n8) / 2.0;
            double d5 = (double)(n7 - n) * -1.0 / (double)(n8 - n2);
            double d6 = (double)(n4 - n7) * -1.0 / (double)(n5 - n8);
            this.field5219 = (d4 + (d * d5 - d6 * d3) - d2) / (d5 - d6);
            this.field5218 = d2 + d5 * (this.field5219 - d);
            this.field5222 = Math.sqrt(Math.pow(this.field5219 - (double)n, 2.0) + Math.pow(this.field5218 - (double)n2, 2.0));
            this.field5220 = Math.atan2((double)n2 - this.field5218, (double)n - this.field5219);
            double d7 = Math.atan2((double)n8 - this.field5218, (double)n7 - this.field5219);
            this.field5224 = Math.atan2((double)n5 - this.field5218, (double)n4 - this.field5219);
            boolean bl2 = !(this.field5220 <= d7 && d7 <= this.field5224 || this.field5224 <= d7 && d7 <= this.field5220) ? false : (bl = true);
            if (!bl) {
                this.field5224 += Math.PI * (double)(this.field5220 - this.field5224 > 0.0 ? 2 : -2);
            }
            return;
        }
        this.field5219 = n4;
        this.field5218 = n5;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="634007463")
    public int vmethod9687() {
        double d = this.method9695();
        double d2 = (this.field5224 - this.field5220) * d + this.field5220;
        return (int)Math.round(this.field5219 + this.field5222 * Math.cos(d2));
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1800401881")
    public int vmethod9688() {
        double d = this.method9695();
        double d2 = this.field5220 + d * (this.field5224 - this.field5220);
        return (int)Math.round(this.field5218 + this.field5222 * Math.sin(d2));
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="7")
    public int vmethod9689() {
        double d = this.method9695();
        return (int)Math.round(d * (double)(this.field5221 - this.field5223) + (double)this.field5223);
    }
}

