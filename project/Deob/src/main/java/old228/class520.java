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

@ObfuscatedName(value="uh")
public class class520
extends class522 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-664920125)
    int field5232 = 0;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-144132369)
    int field5231 = 0;

    public class520(int n, int n2, int n3, int n4) {
        super(n3, n4);
        this.field5232 = n;
        this.field5231 = n2;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1957368633")
    public int method9684() {
        double d = this.method9695();
        return (int)Math.round((double)this.field5232 + d * (double)(this.field5231 - this.field5232));
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IB)D", garbageValue="0")
    public static double method9685(int n) {
        int n2 = class507.field5153[n & 0x7FF];
        return (double)n2 / 65536.0;
    }
}

