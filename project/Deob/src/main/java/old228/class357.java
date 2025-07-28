package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="nk")
public class class357 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lnn;")
    public class359 field3801 = new class359();
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lnl;")
    class353 field3800 = new class353();
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lbh;")
    class27 field3799 = new class27();
    @ObfuscatedName(value="ao")
    public Object[] field3802;
    @ObfuscatedName(value="ad")
    public Object[] field3803;
    @ObfuscatedName(value="an")
    public Object[] field3804;
    @ObfuscatedName(value="ae")
    public Object[] field3805;

    class357() {
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-1716627366")
    public static int method7049(int n) {
        --n;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return n + 1;
    }
}

