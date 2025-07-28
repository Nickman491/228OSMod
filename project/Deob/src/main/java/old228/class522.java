package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="um")
public abstract class class522 {
    @ObfuscatedName(value="bj")
    static GarbageCollectorMXBean field5234;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=825095503)
    int field5238 = 0;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1832451349)
    int field5235 = 0;
    @ObfuscatedName(value="ac")
    double field5236 = 0.0;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-1395383813)
    int field5237 = 0;

    class522(int n, int n2) {
        this.field5238 = n;
        this.field5235 = 0;
        this.field5237 = n2 >= 0 && n2 <= 27 ? n2 : 0;
        this.field5236 = class344.method6945(this.field5235, this.field5238, this.field5237);
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-752325579")
    public void method9700() {
        if (this.field5235 < this.field5238) {
            ++this.field5235;
            this.field5236 = class344.method6945(this.field5235, this.field5238, this.field5237);
        }
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(I)D", garbageValue="2145106480")
    double method9695() {
        return this.field5236;
    }
}

