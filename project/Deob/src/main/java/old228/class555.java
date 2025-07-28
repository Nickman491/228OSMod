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

@ObfuscatedName(value="vv")
public class class555
extends class556 {
    @ObfuscatedName(value="ah")
    static final int[] field5466 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, Short.MAX_VALUE, 65535, 131071, 262143, 524287, 1048575, 0x1FFFFF, 0x3FFFFF, 0x7FFFFF, 0xFFFFFF, 0x1FFFFFF, 0x3FFFFFF, 0x7FFFFFF, 0xFFFFFFF, 0x1FFFFFFF, 0x3FFFFFFF, Integer.MAX_VALUE, -1};
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lwr;")
    class573 field5467;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-458675841)
    int field5468;

    public class555(int n) {
        super(n);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([II)V", garbageValue="1906157384")
    public void method10223(int[] nArray) {
        this.field5467 = new class573(nArray);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lwr;I)V", garbageValue="-1275790681")
    public void method10248(class573 class5732) {
        this.field5467 = class5732;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-478530350")
    public void method10221(int n) {
        this.field5470[++this.field5471 - 1] = (byte)(n + this.field5467.method10899());
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="4")
    public int method10222() {
        return this.field5470[++this.field5471 - 1] - this.field5467.method10899() & 0xFF;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="699577370")
    public boolean method10224() {
        int n = this.field5470[this.field5471] - this.field5467.method10888() & 0xFF;
        return n >= 128;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="19")
    public int method10253() {
        int n;
        if ((n = this.field5470[++this.field5471 - 1] - this.field5467.method10899() & 0xFF) < 128) {
            return n;
        }
        return (n - 128 << 8) + (this.field5470[++this.field5471 - 1] - this.field5467.method10899() & 0xFF);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="([BIII)V", garbageValue="367906627")
    public void method10225(byte[] byArray, int n, int n2) {
        for (int i = 0; i < n2; ++i) {
            byArray[i + n] = (byte)(this.field5470[++this.field5471 - 1] - this.field5467.method10899());
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="93")
    public void method10226() {
        this.field5468 = this.field5471 * 8;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="7")
    public int method10227(int n) {
        int n2 = this.field5468 >> 3;
        int n3 = 8 - (this.field5468 & 7);
        int n4 = 0;
        this.field5468 += n;
        while (true) {
            if (n <= n3) {
                n4 = n3 == n ? (n4 += this.field5470[n2] & field5466[n3]) : (this.field5470[n2] >> n3 - n & field5466[n]) + n4;
                return n4;
            }
            n4 += (this.field5470[n2++] & field5466[n3]) << n - n3;
            n -= n3;
            n3 = 8;
        }
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="508136829")
    public void method10238() {
        this.field5471 = (this.field5468 + 7) / 8;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="-53")
    public int method10229(int n) {
        return n * 8 - this.field5468;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="569639568")
    public int method10230(int n) {
        return n - this.field5471;
    }

    @ObfuscatedName(value="is")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="28")
    static void method10255(int n) {
        client.field541 = 0L;
        client.field722 = n >= 2;
        if (class194.method4501() != 1) {
            client.field521.method525(7680, 2160);
        } else {
            client.field521.method525(765, 503);
        }
        if (client.field510 >= 25 && client.field564 != null && client.field564.field1446 != null) {
            class324 class3242 = class90.method2629(class322.field3337, client.field564.field1446);
            class3242.field3442.method10300(class194.method4501());
            class3242.field3442.method10266(class128.field1521);
            class3242.field3442.method10266(class363.field4038);
            client.field564.method3257(class3242);
        }
    }
}

