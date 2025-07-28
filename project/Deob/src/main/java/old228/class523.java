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

@ObfuscatedName(value="ui")
public class class523 {
    @ObfuscatedName(value="ad")
    String field5241;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lpq;")
    class391 field5243;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1318039913)
    int field5242 = 0;
    @ObfuscatedName(value="ax")
    boolean field5245 = false;

    @ObfuscatedSignature(descriptor="(Lpq;)V")
    class523(class391 class3912) {
        this.field5243 = class3912;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-536495632")
    void method9709(String string) {
        if (string != null && !string.isEmpty()) {
            if (string != this.field5241) {
                this.field5241 = string;
                this.field5242 = 0;
                this.field5245 = false;
                this.method9711();
                return;
            }
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1237303035")
    int method9711() {
        if (this.field5241 != null) {
            if (this.field5242 < 33) {
                if (!this.field5243.method7750(class303.field3269.field3268, this.field5241)) return this.field5242;
                this.field5242 = 33;
            }
            if (this.field5242 == 33) {
                if (this.field5243.method7781(class303.field3265.field3268, this.field5241) && !this.field5243.method7750(class303.field3265.field3268, this.field5241)) return this.field5242;
                this.field5242 = 66;
            }
            if (this.field5242 != 66) return this.field5242;
            if (!this.field5243.method7750(this.field5241, class303.field3267.field3268)) return this.field5242;
            this.field5242 = 100;
            this.field5245 = true;
            return this.field5242;
        } else {
            this.field5242 = 100;
            this.field5245 = true;
        }
        return this.field5242;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-915181834")
    boolean method9710() {
        return this.field5245;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-923373061")
    int method9716() {
        return this.field5242;
    }
}

