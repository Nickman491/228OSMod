/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kn")
public class class271 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lkn;")
    static final class271 field3016 = new class271(2, 8, 8);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lkn;")
    static final class271 field3018 = new class271(6, 16, 16);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lkn;")
    static final class271 field3005 = new class271(3, 32, 32);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lkn;")
    static final class271 field3008 = new class271(0, 48, 48);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lkn;")
    static final class271 field3017 = new class271(1, 64, 64);
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lkn;")
    static final class271 field3010 = new class271(5, 96, 96);
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lkn;")
    static final class271 field3011 = new class271(4, 128, 128);
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="[Lkn;")
    static final class271[] field3009 = ObjectSound.method2105();
    @ObfuscatedName(value="ix")
    @ObfuscatedGetter(intValue=2005502141)
    static int field3015;
    @ObfuscatedName(value="wt")
    @ObfuscatedGetter(intValue=1323148989)
    @Export(value="foundItemIndex")
    static int foundItemIndex;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=2136590553)
    final int field3012;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-609962513)
    final int field3013;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=1500051147)
    final int field3014;

    static {
        Arrays.sort(field3009, new class278());
    }

    class271(int n, int n2, int n3) {
        this.field3012 = n;
        this.field3013 = n2;
        this.field3014 = n3;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-19")
    int method5832() {
        return this.field3013 * this.field3014;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="hb")
    @ObfuscatedSignature(descriptor="(Lkb;IIIZI)V", garbageValue="2075909946")
    static void method5839(SequenceDefinition sequenceDefinition, int n, int n2, int n3, boolean bl) {
        if (Client.soundEffectCount >= 50) {
            return;
        }
        if (sequenceDefinition.field2925 == null) return;
        if (!sequenceDefinition.field2925.containsKey(n)) {
            return;
        }
        ArrayList arrayList = (ArrayList)sequenceDefinition.field2925.get(n);
        if (arrayList.isEmpty()) {
            return;
        }
        int n4 = 0;
        boolean bl2 = true;
        while (true) {
            block12: {
                int n5;
                block10: {
                    block11: {
                        Iterator iterator;
                        int n6;
                        block9: {
                            if (!bl2 || (bl2 = false)) break block9;
                            if (arrayList.size() <= 1) break block10;
                            n6 = 1 + (int)(Math.random() * 100.0);
                            n5 = 0;
                            iterator = arrayList.iterator();
                        }
                        if (!iterator.hasNext()) break block11;
                        class261 class2612 = (class261)iterator.next();
                        int n7 = n5;
                        if (n7 > n6 || n6 >= (n5 += class2612.field2780)) break block12;
                    }
                    if (n4 >= arrayList.size()) {
                        return;
                    }
                }
                class261 class2613 = (class261)arrayList.get(n4);
                n5 = class2613.field2782 & 0x1F;
                if (n5 > 0) {
                    if (class544.clientPreferences.method2900() == 0) return;
                }
                if (n5 == 0 && class544.clientPreferences.method2898() == 0) {
                    return;
                }
                class432.method8480(class2613, n2, n3, bl);
                return;
            }
            ++n4;
        }
    }
}

