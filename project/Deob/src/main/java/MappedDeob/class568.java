/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="vb")
public class class568
extends Enum
implements class404 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lvb;")
    @Export(value="SOLID")
    public static final /* enum */ class568 SOLID = new class568("runelite", 0, 0, 0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lvb;")
    static final /* enum */ class568 field5555 = new class568("runelite", 1, 1, 1);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lvb;")
    static final /* enum */ class568 field5556 = new class568("runelite", 2, 2, 2);
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=166649643)
    public final int field5554;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-218930385)
    final int field5559;

    /*
     * WARNING - void declaration
     */
    class568() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.field5554 = var3_1;
        this.field5559 = var4_2;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.field5559;
    }
}

