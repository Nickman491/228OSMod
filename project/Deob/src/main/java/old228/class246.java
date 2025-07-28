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

@ObfuscatedName(value="js")
public class class246 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(longValue=7261164173229613339L)
    public long field2613;
    @ObfuscatedName(value="ah")
    int[] field2611;
    @ObfuscatedName(value="az")
    short[] field2612;
    @ObfuscatedName(value="ao")
    short[] field2610;
    @ObfuscatedName(value="ad")
    public boolean field2614 = false;

    public class246(long l, int[] nArray, short[] sArray, short[] sArray2, boolean bl) {
        this.field2613 = l;
        this.field2611 = nArray;
        this.field2612 = sArray;
        this.field2610 = sArray2;
        this.field2614 = bl;
    }

    @ObfuscatedName(value="br")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-170561838")
    static int method5295(int n, class81 class812, boolean bl) {
        if (n != 7463) {
            return 2;
        }
        boolean bl2 = class72.field865[--class63.field444] == 1;
        class63.method1229(bl2);
        return 1;
    }
}

