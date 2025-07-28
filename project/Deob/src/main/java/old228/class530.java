package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ub")
public final class class530 {
    @ObfuscatedName(value="ay")
    int field5341;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="[Ltf;")
    class514[] field5338;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Ltf;")
    class514 field5340;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Ltf;")
    class514 field5339;
    @ObfuscatedName(value="ad")
    int field5342 = 0;

    public class530(int n) {
        this.field5341 = n;
        this.field5338 = new class514[n];
        int n2 = 0;
        while (n2 < n) {
            class514 class5142;
            class5142.field5173 = class5142 = (this.field5338[n2] = new class514());
            class5142.field5175 = class5142;
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(J)Ltf;")
    public class514 method9985(long l) {
        class514 class5142 = this.field5338[(int)(l & (long)(this.field5341 - 1))];
        this.field5340 = class5142.field5173;
        while (true) {
            if (class5142 == this.field5340) {
                this.field5340 = null;
                return null;
            }
            if (this.field5340.field5174 == l) break;
            this.field5340 = this.field5340.field5173;
        }
        class514 class5143 = this.field5340;
        this.field5340 = this.field5340.field5173;
        return class5143;
    }

    @ObfuscatedName(value="ah")
    public int method9995() {
        int n = 0;
        int n2 = 0;
        while (n2 < this.field5341) {
            class514 class5142 = this.field5338[n2];
            class514 class5143 = class5142.field5173;
            while (class5143 != class5142) {
                ++n;
                class5143 = class5143.field5173;
            }
            ++n2;
        }
        return n;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ltf;J)V")
    public void method9984(class514 class5142, long l) {
        if (class5142.field5175 != null) {
            class5142.method9623();
        }
        class514 class5143 = this.field5338[(int)(l & (long)(this.field5341 - 1))];
        class5142.field5175 = class5143.field5175;
        class5142.field5173 = class5143;
        class5142.field5175.field5173 = class5142;
        class5142.field5173.field5175 = class5142;
        class5142.field5174 = l;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="()Ltf;")
    public class514 method9988() {
        this.field5342 = 0;
        return this.method9996();
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="()Ltf;")
    public class514 method9996() {
        class514 class5142;
        if (this.field5342 > 0 && this.field5338[this.field5342 - 1] != this.field5339) {
            class514 class5143 = this.field5339;
            this.field5339 = class5143.field5173;
            return class5143;
        }
        do {
            if (this.field5342 < this.field5341) continue;
            return null;
        } while ((class5142 = this.field5338[this.field5342++].field5173) == this.field5338[this.field5342 - 1]);
        this.field5339 = class5142.field5173;
        return class5142;
    }
}

