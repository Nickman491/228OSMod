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

@ObfuscatedName(value="ql")
public class class423 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1187183205)
    public int field4735;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=2020733535)
    public int field4736;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1966960069)
    public int field4734;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=98523261)
    public int field4733;

    public class423(int n, int n2, int n3, int n4) {
        this.method8261(n, n2);
        this.method8262(n3, n4);
    }

    public class423(int n, int n2) {
        this(0, 0, n, n2);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="36")
    public void method8261(int n, int n2) {
        this.field4735 = n;
        this.field4736 = n2;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-353425709")
    public void method8262(int n, int n2) {
        this.field4734 = n;
        this.field4733 = n2;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIB)Z", garbageValue="-2")
    public boolean method8263(int n, int n2) {
        return n >= this.field4735 && n < this.field4735 + this.field4734 && n2 >= this.field4736 && n2 < this.field4733 + this.field4736;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lql;Lql;B)V", garbageValue="-33")
    public void method8265(class423 class4232, class423 class4233) {
        this.method8266(class4232, class4233);
        this.method8267(class4232, class4233);
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lql;Lql;S)V", garbageValue="1000")
    void method8266(class423 class4232, class423 class4233) {
        class4233.field4735 = this.field4735;
        class4233.field4734 = this.field4734;
        if (this.field4735 < class4232.field4735) {
            class4233.field4734 -= class4232.field4735 - this.field4735;
            class4233.field4735 = class4232.field4735;
        }
        if (class4233.method8268() > class4232.method8268()) {
            class4233.field4734 -= class4233.method8268() - class4232.method8268();
        }
        if (class4233.field4734 < 0) {
            class4233.field4734 = 0;
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lql;Lql;B)V", garbageValue="42")
    void method8267(class423 class4232, class423 class4233) {
        class4233.field4736 = this.field4736;
        class4233.field4733 = this.field4733;
        if (this.field4736 < class4232.field4736) {
            class4233.field4733 -= class4232.field4736 - this.field4736;
            class4233.field4736 = class4232.field4736;
        }
        if (class4233.method8260() > class4232.method8260()) {
            class4233.field4733 -= class4233.method8260() - class4232.method8260();
        }
        if (class4233.field4733 < 0) {
            class4233.field4733 = 0;
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1827217304")
    int method8268() {
        return this.field4734 + this.field4735;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1683044794")
    int method8260() {
        return this.field4736 + this.field4733;
    }

    public String toString() {
        return null;
    }
}

