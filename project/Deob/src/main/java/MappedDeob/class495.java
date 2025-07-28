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

@ObfuscatedName(value="tl")
public class class495
extends Enum
implements class404 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ltl;")
    static final /* enum */ class495 field5119 = new class495("runelite", 0, 2, 1);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ltl;")
    static final /* enum */ class495 field5125 = new class495("runelite", 1, 0, 2);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Ltl;")
    static final /* enum */ class495 field5121 = new class495("runelite", 2, 3, 3);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Ltl;")
    static final /* enum */ class495 field5122 = new class495("runelite", 3, 1, 10);
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=1090014637)
    final int field5123;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1936807073)
    final int field5124;

    /*
     * WARNING - void declaration
     */
    class495() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.field5123 = var3_1;
        this.field5124 = var4_2;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.field5124;
    }
}

