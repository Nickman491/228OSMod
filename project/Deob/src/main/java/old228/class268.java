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

@ObfuscatedName(value="ka")
public class class268
extends class514 {
    @ObfuscatedName(value="ew")
    @ObfuscatedSignature(descriptor="Lok;")
    static class388 field2973;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-490227731)
    public int field2968;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1771210245)
    public int field2969;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-657302699)
    public int field2970;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lna;")
    public class361 field2971;

    @ObfuscatedSignature(descriptor="(IIILna;)V")
    public class268(int n, int n2, int n3, class361 class3612) {
        this.field2970 = n;
        this.field2968 = n2;
        this.field2969 = n3;
        this.field2971 = class3612;
    }

    @ObfuscatedName(value="mc")
    @ObfuscatedSignature(descriptor="(Lna;B)Z", garbageValue="-73")
    static final boolean method5754(class361 class3612) {
        if (class3612.field4003 == null) {
            return false;
        }
        int n = 0;
        while (n < class3612.field4003.length) {
            int n2 = SequenceDef.method5725(class3612, n);
            int n3 = class3612.field4004[n];
            if (class3612.field4003[n] != 2 ? (class3612.field4003[n] != 3 ? (class3612.field4003[n] != 4 ? n2 != n3 : n2 == n3) : n2 <= n3) : n2 >= n3) {
                return false;
            }
            ++n;
        }
        return true;
    }
}

