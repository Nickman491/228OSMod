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

@ObfuscatedName(value="hn")
public class class184 {
    @ObfuscatedName(value="wm")
    @ObfuscatedSignature(descriptor="Lpw;")
    public static class402 field1975;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="[Lfc;")
    class133[] field1976;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-2110551047)
    int field1977;

    @ObfuscatedSignature(descriptor="(Lvy;I)V")
    class184(Buffer buffer, int n) {
        this.field1976 = new class133[n];
        this.field1977 = buffer.readUnsignedByte();
        int n2 = 0;
        while (true) {
            class133 class1332;
            if (n2 >= this.field1976.length) {
                this.method4106();
                return;
            }
            this.field1976[n2] = class1332 = new class133(this.field1977, buffer, false);
            ++n2;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1788165079")
    void method4106() {
        class133[] class133Array = this.field1976;
        int n = 0;
        while (n < class133Array.length) {
            class133 class1332 = class133Array[n];
            if (class1332.field1553 >= 0) {
                class1332.field1541 = this.field1976[class1332.field1553];
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="695864652")
    public int method4107() {
        return this.field1976.length;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)Lfc;", garbageValue="-2084598540")
    class133 method4108(int n) {
        if (n < this.method4107()) {
            return this.field1976[n];
        }
        return null;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(B)[Lfc;", garbageValue="-29")
    class133[] method4126() {
        return this.field1976;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lfl;IB)V", garbageValue="1")
    void method4110(class144 class1442, int n) {
        this.method4111(class1442, n, null, false);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lfl;I[ZZI)V", garbageValue="528946643")
    void method4111(class144 class1442, int n, boolean[] blArray, boolean bl) {
        int n2 = class1442.method3529();
        int n3 = 0;
        class133[] class133Array = this.method4126();
        int n4 = 0;
        while (n4 < class133Array.length) {
            class133 class1332 = class133Array[n4];
            if (blArray == null || bl == blArray[n3]) {
                class1442.method3524(n, class1332, n3, n2);
            }
            ++n3;
            ++n4;
        }
        return;
    }
}

