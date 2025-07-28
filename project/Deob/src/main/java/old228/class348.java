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

@ObfuscatedName(value="nf")
public class class348
extends class510 {
    @ObfuscatedName(value="kd")
    @ObfuscatedSignature(descriptor="Lvf;")
    static class570 field3758;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1573085963)
    public final int field3754;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1656732957)
    public final int field3753;
    @ObfuscatedName(value="az")
    public final int[] field3752;
    @ObfuscatedName(value="ao")
    public final int[] field3755;

    class348(int n, int n2, int[] nArray, int[] nArray2, int n3) {
        this.field3754 = n;
        this.field3753 = n2;
        this.field3752 = nArray;
        this.field3755 = nArray2;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIB)Z", garbageValue="63")
    public boolean method6951(int n, int n2) {
        int n3;
        return n2 >= 0 && n2 < this.field3755.length && n >= (n3 = this.field3755[n2]) && n <= n3 + this.field3752[n2];
    }
}

