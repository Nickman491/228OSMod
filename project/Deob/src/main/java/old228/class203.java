package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="hm")
public class class203 {
    @ObfuscatedName(value="ay")
    boolean field2308 = false;
    @ObfuscatedName(value="ah")
    public boolean field2290 = true;
    @ObfuscatedName(value="az")
    int field2291 = 0;
    @ObfuscatedName(value="an")
    public int field2289 = 512;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lhf;")
    public class207 field2300;
    @ObfuscatedName(value="aq")
    int field2301;
    @ObfuscatedName(value="af")
    int field2302;
    @ObfuscatedName(value="aa")
    int field2303;
    @ObfuscatedName(value="ak")
    int field2305;
    @ObfuscatedName(value="al")
    int field2304;
    @ObfuscatedName(value="av")
    int field2306;
    @ObfuscatedName(value="ag")
    int field2307;
    @ObfuscatedName(value="aw")
    int field2294;
    @ObfuscatedName(value="ai")
    int[] field2309 = new int[1024];

    class203() {
    }

    @ObfuscatedName(value="ay")
    void method4740() {
        this.field2301 = this.field2303 / 2;
        this.field2302 = this.field2305 / 2;
        this.field2304 = -this.field2301;
        this.field2306 = this.field2303 - this.field2301;
        this.field2307 = -this.field2302;
        this.field2294 = this.field2305 - this.field2302;
    }

    @ObfuscatedName(value="ah")
    void method4737(int n, int n2, int n3, int n4) {
        this.field2301 = n - n2;
        this.field2302 = n3 - n4;
        this.field2304 = -this.field2301;
        this.field2306 = this.field2303 - this.field2301;
        this.field2307 = -this.field2302;
        this.field2294 = this.field2305 - this.field2302;
    }

    @ObfuscatedName(value="az")
    void method4738(int n, int n2, int n3) {
        this.field2308 = n < 0 || n > this.field2303 || n2 < 0 || n2 > this.field2303 || n3 < 0 || n3 > this.field2303;
    }
}

