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

@ObfuscatedName(value="jk")
public class class249
extends Enum
implements MouseWheel {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ljk;")
    static final /* enum */ class249 field2673 = new class249("runelite", 0, 2, 0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ljk;")
    static final /* enum */ class249 field2668 = new class249("runelite", 1, 1, 1);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Ljk;")
    static final /* enum */ class249 field2670 = new class249("runelite", 2, 0, 2);
    @ObfuscatedName(value="io")
    @ObfuscatedSignature(descriptor="Lus;")
    static class525 field2674;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-761626247)
    public final int field2671;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1236815397)
    final int field2672;

    /*
     * WARNING - void declaration
     */
    class249() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.field2671 = var3_1;
        this.field2672 = var4_2;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    public int vmethod10703() {
        return this.field2672;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Ljd;", garbageValue="801639333")
    public static class258 method5354(int n) {
        class258 class2582 = (class258)class258.field2737.method6578(n);
        if (class2582 != null) {
            return class2582;
        }
        byte[] byArray = class258.field2741.method7790(11, n);
        class2582 = new class258();
        if (byArray != null) {
            class2582.method5429(new class556(byArray));
        }
        class2582.method5444();
        class258.field2737.method6590(class2582, n);
        return class2582;
    }

    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-445996510")
    static int method5355(int n, class81 class812, boolean bl) {
        return 2;
    }
}

