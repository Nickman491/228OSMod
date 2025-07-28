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

@ObfuscatedName(value="mb")
public class class324
extends class514 {
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="[Lmb;")
    static class324[] field3438 = new class324[300];
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=790177349)
    static int field3439 = 0;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmm;")
    class322 field3437;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1977829057)
    int field3435;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lvv;")
    public class555 field3442;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1763756621)
    public int field3436;

    class324() {
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1974751955")
    public void method6621() {
        if (field3439 >= field3438.length) {
            return;
        }
        class324.field3438[++class324.field3439 - 1] = this;
    }

    @ObfuscatedName(value="je")
    @ObfuscatedSignature(descriptor="(Ldx;I)Z", garbageValue="-1639240470")
    static boolean method6629(class94 class942) {
        boolean bl;
        if (client.field634 == 0) {
            return false;
        }
        if (class407.field4693 == class942) {
            boolean bl2 = (client.field634 & 8) != 0;
            return bl2;
        }
        boolean bl3 = class291.method6358();
        if (!bl3) {
            bl = (client.field634 & 1) != 0;
            boolean bl4 = bl3 = bl && class942.method2697();
        }
        if (!(bl = bl3)) {
            boolean bl5 = (client.field634 & 2) != 0;
            bl = bl5 && class942.method2658();
        }
        return bl;
    }
}

