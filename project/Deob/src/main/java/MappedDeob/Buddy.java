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

@ObfuscatedName(value="su")
@Implements(value="Buddy")
public class Buddy
extends User {
    @ObfuscatedName(value="ko")
    @ObfuscatedGetter(intValue=130611919)
    @Export(value="cameraX")
    static int cameraX;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-609922555)
    @Export(value="world")
    public int world = -1;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1806970475)
    @Export(value="int2")
    public int int2;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=364975233)
    @Export(value="rank")
    public int rank;

    Buddy() {
    }

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="391643508")
    @Export(value="set")
    void set(int n, int n2) {
        this.world = n;
        this.int2 = n2;
    }

    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="29")
    @Export(value="getWorld")
    public int getWorld() {
        return this.world;
    }

    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="11")
    @Export(value="hasWorld")
    public boolean hasWorld() {
        return this.world > 0;
    }
}

