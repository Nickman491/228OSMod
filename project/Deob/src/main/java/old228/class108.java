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

@ObfuscatedName(value="ej")
public class class108
extends Enum
implements MouseWheel {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lej;")
    static final /* enum */ class108 field1377 = new class108("runelite", 0, 0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lej;")
    static final /* enum */ class108 field1382 = new class108("runelite", 1, 1);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lej;")
    static final /* enum */ class108 field1379 = new class108("runelite", 2, 2);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lej;")
    static final /* enum */ class108 field1380 = new class108("runelite", 3, 3);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lej;")
    static final /* enum */ class108 field1378 = new class108("runelite", 4, 4);
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=474752957)
    final int field1381;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    class108() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.field1381 = var3_1;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    public int vmethod10703() {
        return this.field1381;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;Lpq;ZLqw;B)V", garbageValue="-66")
    public static void method3099(class391 class3912, class391 class3913, boolean bl, class435 class4352) {
        class240.field2581 = class3912;
        URLLoader.field1463 = class3913;
        class307.field3282 = bl;
        class157.field1721 = class240.field2581.method7740(10);
        class515.field5179 = class4352;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lpq;Ljava/lang/String;Ljava/lang/String;I)Lvi;", garbageValue="-187850125")
    public static class569 method3097(class391 class3912, String string, String string2) {
        class569 class5692;
        int n;
        if (!class3912.method7781(string, string2)) {
            return null;
        }
        int n2 = class3912.method7743(string);
        if (class296.method6397(class3912, n2, n = class3912.method7747(n2, string2))) {
            class569 class5693;
            class569 class5694 = new class569();
            class5694.field5561 = class571.field5581;
            class5694.field5568 = class174.field1832;
            class5694.field5565 = class241.field2585[0];
            class5694.field5566 = class571.field5583[0];
            class5694.field5567 = class571.field5584[0];
            class5694.field5564 = class403.field4657[0];
            class5694.field5562 = class25.field108;
            class5694.field5563 = class240.field2580[0];
            class241.field2585 = null;
            class571.field5583 = null;
            class571.field5584 = null;
            class403.field4657 = null;
            class25.field108 = null;
            class240.field2580 = null;
            class5692 = class5693 = class5694;
        } else {
            class5692 = null;
        }
        return class5692;
    }
}

