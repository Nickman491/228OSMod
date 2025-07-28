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

@ObfuscatedName(value="sn")
public class class492
extends Enum
implements class404 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lsn;")
    static final /* enum */ class492 field5095 = new class492("runelite", 0, 0, 0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lsn;")
    public static final /* enum */ class492 field5092 = new class492("runelite", 1, 1, 1);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lsn;")
    public static final /* enum */ class492 field5094 = new class492("runelite", 2, 2, 2);
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1060015231)
    final int field5091;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1387065079)
    final int field5093;

    /*
     * WARNING - void declaration
     */
    class492() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.field5091 = var3_1;
        this.field5093 = var4_2;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.field5093;
    }
}

