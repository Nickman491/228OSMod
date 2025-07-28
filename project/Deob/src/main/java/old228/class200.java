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

@ObfuscatedName(value="hd")
public class class200 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1397898627)
    int field2278;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-396954475)
    int field2276;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-411226141)
    int field2277;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=507587089)
    int field2275;

    class200() {
    }

    @ObfuscatedSignature(descriptor="(Lhd;)V")
    class200(class200 class2002) {
        this.field2278 = class2002.field2278;
        this.field2276 = class2002.field2276;
        this.field2277 = class2002.field2277;
        this.field2275 = class2002.field2275;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Ljr;", garbageValue="-678648084")
    public static class242 method4707(int n) {
        class242 class2422 = (class242)class242.field2590.method6578(n);
        if (class2422 != null) {
            return class2422;
        }
        byte[] byArray = class242.field2588.method7790(8, n);
        class2422 = new class242();
        if (byArray != null) {
            class2422.method5275(new class556(byArray));
        }
        class242.field2590.method6590(class2422, n);
        return class2422;
    }
}

