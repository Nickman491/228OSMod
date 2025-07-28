package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pi")
public class class413 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ltg;")
    class509 field4703;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ltg;")
    class509 field4702;

    public class413() {
        this.field4703.field5165 = this.field4703 = new class509();
        this.field4703.field5166 = this.field4703;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ltg;)V")
    public void method8120(class509 class5092) {
        if (class5092.field5166 != null) {
            class5092.method9617();
        }
        class5092.field5166 = this.field4703.field5166;
        class5092.field5165 = this.field4703;
        class5092.field5166.field5165 = class5092;
        class5092.field5165.field5166 = class5092;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="()Ltg;")
    public class509 method8118() {
        class509 class5092 = this.field4703.field5165;
        if (class5092 != this.field4703) {
            this.field4702 = class5092.field5165;
            return class5092;
        }
        this.field4702 = null;
        return null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="()Ltg;")
    public class509 method8119() {
        class509 class5092 = this.field4702;
        if (class5092 != this.field4703) {
            this.field4702 = class5092.field5165;
            return class5092;
        }
        this.field4702 = null;
        return null;
    }
}

