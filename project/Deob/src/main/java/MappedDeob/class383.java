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

@ObfuscatedName(value="oz")
public class class383
extends Enum
implements class404 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Loz;")
    static final /* enum */ class383 field4488 = new class383("runelite", 0, -1);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Loz;")
    static final /* enum */ class383 field4486 = new class383("runelite", 1, 0);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Loz;")
    static final /* enum */ class383 field4487 = new class383("runelite", 2, 1);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Loz;")
    static final /* enum */ class383 field4485 = new class383("runelite", 3, 2);
    @ObfuscatedName(value="cg")
    @ObfuscatedSignature(descriptor="Luo;")
    @Export(value="loginType")
    static LoginType loginType;
    @ObfuscatedName(value="ug")
    @ObfuscatedGetter(intValue=-286042239)
    static int field4491;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=1596427081)
    final int field4492;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    class383() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.field4492 = var3_1;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.field4492;
    }
}

