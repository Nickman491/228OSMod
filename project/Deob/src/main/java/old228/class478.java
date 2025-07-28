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

@ObfuscatedName(value="su")
public class class478
extends class474 {
    @ObfuscatedName(value="ko")
    @ObfuscatedGetter(intValue=130611919)
    static int field5017;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-609922555)
    public int field5020 = -1;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1806970475)
    public int field5018;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=364975233)
    public int field5019;

    class478() {
    }

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="391643508")
    void method9276(int n, int n2) {
        this.field5020 = n;
        this.field5018 = n2;
    }

    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="29")
    public int method9275() {
        return this.field5020;
    }

    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="11")
    public boolean method9278() {
        return this.field5020 > 0;
    }
}

