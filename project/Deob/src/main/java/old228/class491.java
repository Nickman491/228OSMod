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

@ObfuscatedName(value="sl")
public class class491
extends Enum
implements MouseWheel {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lsl;")
    public static final /* enum */ class491 field5089 = new class491("runelite", 0, 0, 0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lsl;")
    public static final /* enum */ class491 field5087 = new class491("runelite", 1, 1, 1);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lsl;")
    public static final /* enum */ class491 field5088 = new class491("runelite", 2, 2, 2);
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-2128852175)
    final int field5086;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1464190671)
    final int field5090;

    /*
     * WARNING - void declaration
     */
    class491() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.field5086 = var3_1;
        this.field5090 = var4_2;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    public int vmethod10703() {
        return this.field5090;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;Lpq;I)V", garbageValue="-1410969698")
    public static void method9488(class391 class3912, class391 class3913) {
        class252.field2696 = class3912;
        class252.field2700 = class3913;
    }
}

