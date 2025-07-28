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

@ObfuscatedName(value="cy")
public class class60 {
    @ObfuscatedName(value="ay")
    byte[] field411 = null;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1104605573)
    int field409 = 0;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=957315661)
    int field410 = 0;

    class60() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="0")
    int method1205(int n) {
        int n2 = 0;
        int n3 = 0;
        while (true) {
            int n4;
            if (n < 8 - this.field410) {
                if (n > 0) {
                    n4 = (1 << n) - 1;
                    n2 += (this.field411[this.field409] >> this.field410 & n4) << n3;
                    this.field410 += n;
                }
                return n2;
            }
            n4 = 8 - this.field410;
            int n5 = (1 << n4) - 1;
            n2 += (this.field411[this.field409] >> this.field410 & n5) << n3;
            this.field410 = 0;
            ++this.field409;
            n3 += n4;
            n -= n4;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="897372458")
    int method1207() {
        int n = this.field411[this.field409] >> this.field410 & 1;
        ++this.field410;
        this.field409 += this.field410 >> 3;
        this.field410 &= 7;
        return n;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="([BIB)V", garbageValue="124")
    void method1204(byte[] byArray, int n) {
        this.field411 = byArray;
        this.field409 = n;
        this.field410 = 0;
    }
}

