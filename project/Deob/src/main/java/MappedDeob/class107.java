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

@ObfuscatedName(value="ei")
public class class107 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1735207919)
    int field1375;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1917571321)
    int field1373;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-2071388707)
    int field1372;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=670825549)
    int field1374;

    class107(int n, int n2, int n3, int n4) {
        this.field1375 = n;
        this.field1373 = n2;
        this.field1372 = n3;
        this.field1374 = n4;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="2142215513")
    int method3090() {
        return this.field1375;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-1")
    int method3081() {
        return this.field1373;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-34")
    int method3082() {
        return this.field1372;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="27")
    int method3083() {
        return this.field1374;
    }

    @ObfuscatedName(value="hg")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1573434342")
    @Export(value="forceDisconnect")
    static final void forceDisconnect(int n) {
        Client.logOut();
        switch (n) {
            case 2: {
                Varcs.method3212(24);
                class150.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
                break;
            }
            case 1: {
                class28.method460();
            }
        }
    }
}

