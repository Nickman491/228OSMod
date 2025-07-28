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

@ObfuscatedName(value="ft")
public class class146
extends Enum
implements class404 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lft;")
    public static final /* enum */ class146 field1659 = new class146("runelite", 0, 1, 0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lft;")
    public static final /* enum */ class146 field1662 = new class146("runelite", 1, 4, 1);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lft;")
    public static final /* enum */ class146 field1661 = new class146("runelite", 2, 3, 2);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lft;")
    public static final /* enum */ class146 field1664 = new class146("runelite", 3, 2, 3);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lft;")
    public static final /* enum */ class146 field1663 = new class146("runelite", 4, 0, 4);
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1834694195)
    public final int field1665;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=274014195)
    final int field1660;

    /*
     * WARNING - void declaration
     */
    class146() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.field1665 = var3_1;
        this.field1660 = var4_2;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.field1660;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Lej;", garbageValue="1748459436")
    static AttackOption[] method3561() {
        return new AttackOption[]{AttackOption.field1378, AttackOption.field1379, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1382, AttackOption.field1380};
    }
}

