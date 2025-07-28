package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="br")
public class class50 {
    @ObfuscatedName(value="ay")
    int field330;
    @ObfuscatedName(value="ah")
    int field328;
    @ObfuscatedName(value="az")
    int[] field329;
    @ObfuscatedName(value="ao")
    int[] field327;

    class50() {
        class60 class602 = class54.field347;
        class602.method1205(16);
        int n = this.field330 = class602.method1207() != 0 ? class602.method1205(4) + 1 : 1;
        if (class602.method1207() != 0) {
            class602.method1205(8);
        }
        class602.method1205(2);
        if (this.field330 > 1) {
            this.field328 = class602.method1205(4);
        }
        this.field329 = new int[this.field330];
        this.field327 = new int[this.field330];
        int n2 = 0;
        while (n2 < this.field330) {
            class602.method1205(8);
            this.field329[n2] = class602.method1205(8);
            this.field327[n2] = class602.method1205(8);
            ++n2;
        }
        return;
    }
}

