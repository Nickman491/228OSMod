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

@ObfuscatedName(value="dv")
public class class93
extends Enum
implements MouseWheel {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ldv;")
    static final /* enum */ class93 field1110 = new class93("runelite", 0, 0, -1);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ldv;")
    static final /* enum */ class93 field1109 = new class93("runelite", 1, 1, 2);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Ldv;")
    static final /* enum */ class93 field1112 = new class93("runelite", 2, 2, 3);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Ldv;")
    static final /* enum */ class93 field1117 = new class93("runelite", 3, 3, 4);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Ldv;")
    static final /* enum */ class93 field1113 = new class93("runelite", 4, 4, 5);
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Ldv;")
    static final /* enum */ class93 field1114 = new class93("runelite", 5, 5, 6);
    @ObfuscatedName(value="dr")
    static boolean field1111;
    @ObfuscatedName(value="dg")
    @ObfuscatedSignature(descriptor="Lvi;")
    static class569 field1118;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-203307499)
    final int field1115;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-774392109)
    final int field1116;

    /*
     * WARNING - void declaration
     */
    class93() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.field1115 = var3_1;
        this.field1116 = var4_2;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    public int vmethod10703() {
        return this.field1116;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIIIB)I", garbageValue="-91")
    static final int method2647(int n, int n2, int n3, int n4) {
        return n3 * n2 - n4 * n >> 16;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-89")
    public static void method2651() {
        class218.field2398.clear();
    }
}

