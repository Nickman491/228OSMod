/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jt")
@Implements(value="HorizontalAlignment")
public class HorizontalAlignment
extends Enum
implements class404 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ljt;")
    static final /* enum */ HorizontalAlignment field2609 = new HorizontalAlignment("runelite", 0, 2, 0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ljt;")
    @Export(value="HorizontalAlignment_centered")
    static final /* enum */ HorizontalAlignment HorizontalAlignment_centered = new HorizontalAlignment("runelite", 1, 0, 1);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Ljt;")
    static final /* enum */ HorizontalAlignment field2605 = new HorizontalAlignment("runelite", 2, 1, 2);
    @ObfuscatedName(value="uk")
    @ObfuscatedGetter(intValue=-374291309)
    static int field2603;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1606140245)
    @Export(value="value")
    public final int value;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1784617127)
    @Export(value="id")
    final int id;

    /*
     * WARNING - void declaration
     */
    HorizontalAlignment() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.value = var3_1;
        this.id = var4_2;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.id;
    }
}

