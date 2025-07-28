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

@ObfuscatedName(value="dk")
public class class83 {
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="[Lct;")
    class64[] field1023 = new class64[100];
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=2144686969)
    int field1022;

    class83() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lct;", garbageValue="-373552992")
    class64 method2506(int n, String string, String string2, String string3) {
        class64 class642 = this.field1023[99];
        int n2 = this.field1022;
        while (true) {
            if (n2 <= 0) {
                if (class642 == null) {
                    class642 = new class64(n, string, string3, string2);
                } else {
                    class642.method9623();
                    class642.method9621();
                    class642.method1234(n, string, string3, string2);
                }
                this.field1023[0] = class642;
                if (this.field1022 < 100) {
                    ++this.field1022;
                }
                return class642;
            }
            if (n2 != 100) {
                this.field1023[n2] = this.field1023[n2 - 1];
            }
            --n2;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Lct;", garbageValue="-1427940988")
    class64 method2498(int n) {
        if (n >= 0 && n < this.field1022) {
            return this.field1023[n];
        }
        return null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1858544506")
    int method2499() {
        return this.field1022;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Loe;", garbageValue="-908384021")
    public static class375 method2508(int n) {
        class375[] class375Array = class115.method3241();
        int n2 = 0;
        while (n2 < class375Array.length) {
            class375 class3752 = class375Array[n2];
            if (n == class3752.field4120) {
                return class3752;
            }
            ++n2;
        }
        return null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lpq;III)Lvf;", garbageValue="437889605")
    public static class570 method2509(class391 class3912, int n, int n2) {
        if (!class296.method6397(class3912, n, n2)) {
            return null;
        }
        class570 class5702 = new class570();
        class5702.field5574 = class571.field5581;
        class5702.field5575 = class174.field1832;
        class5702.field5572 = class241.field2585[0];
        class5702.field5573 = class571.field5583[0];
        class5702.field5570 = class571.field5584[0];
        class5702.field5571 = class403.field4657[0];
        int n3 = class5702.field5571 * class5702.field5570;
        byte[] byArray = class240.field2580[0];
        class5702.field5576 = new int[n3];
        for (int i = 0; i < n3; ++i) {
            class5702.field5576[i] = class25.field108[byArray[i] & 0xFF];
        }
        class241.field2585 = null;
        class571.field5583 = null;
        class571.field5584 = null;
        class403.field4657 = null;
        class25.field108 = null;
        class240.field2580 = null;
        class570 class5703 = class5702;
        return class5703;
    }
}

