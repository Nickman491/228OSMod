package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="rn")
public class class457 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(B)[Lvf;", garbageValue="-81")
    static class570[] method8965() {
        class570[] class570Array = new class570[class571.field5582];
        int n = 0;
        while (true) {
            if (n >= class571.field5582) {
                class241.field2585 = null;
                class571.field5583 = null;
                class571.field5584 = null;
                class403.field4657 = null;
                class25.field108 = null;
                class240.field2580 = null;
                return class570Array;
            }
            class570 class5702 = class570Array[n] = new class570();
            class5702.field5574 = class571.field5581;
            class5702.field5575 = class174.field1832;
            class5702.field5572 = class241.field2585[n];
            class5702.field5573 = class571.field5583[n];
            class5702.field5570 = class571.field5584[n];
            class5702.field5571 = class403.field4657[n];
            int n2 = class5702.field5571 * class5702.field5570;
            byte[] byArray = class240.field2580[n];
            class5702.field5576 = new int[n2];
            for (int i = 0; i < n2; ++i) {
                class5702.field5576[i] = class25.field108[byArray[i] & 0xFF];
            }
            ++n;
        }
    }
}

