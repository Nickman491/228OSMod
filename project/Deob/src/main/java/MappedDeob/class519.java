/*
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

@ObfuscatedName(value="tq")
public class class519
extends class521 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=2124514443)
    int field5227 = 0;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1132406593)
    int field5226 = 0;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-997503879)
    int field5228 = 0;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1709532629)
    int field5230 = 0;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-2074165069)
    int field5225 = 0;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1914738025)
    int field5229 = 0;

    public class519(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        super(n7, n8);
        this.field5227 = n;
        this.field5226 = n2;
        this.field5228 = n3;
        this.field5230 = n4;
        this.field5225 = n5;
        this.field5229 = n6;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="634007463")
    public int vmethod9687() {
        double d = this.method9695();
        return (int)Math.round((double)(this.field5230 - this.field5227) * d + (double)this.field5227);
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1800401881")
    public int vmethod9688() {
        double d = this.method9695();
        return (int)Math.round(d * (double)(this.field5225 - this.field5226) + (double)this.field5226);
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="7")
    public int vmethod9689() {
        double d = this.method9695();
        return (int)Math.round((double)this.field5228 + (double)(this.field5229 - this.field5228) * d);
    }
}

