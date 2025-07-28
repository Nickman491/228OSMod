/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="if")
public class class231
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmi;")
    static EvictingDualNodeHashTable field2495 = new EvictingDualNodeHashTable(64);

    @ObfuscatedName(value="kj")
    @ObfuscatedSignature(descriptor="(III)Lkv;", garbageValue="-436780710")
    static RouteStrategy method5129(int n, int n2) {
        Client.field798.approxDestinationX = n;
        Client.field798.approxDestinationY = n2;
        Client.field798.approxDestinationSizeX = 1;
        Client.field798.approxDestinationSizeY = 1;
        return Client.field798;
    }

    @ObfuscatedName(value="ld")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I", garbageValue="414685391")
    static final int method5128(String string, String string2, int n, int n2, int n3, int n4, int n5, boolean bl, int n6) {
        if (Client.isMenuOpen) {
            return -1;
        }
        if (!AbstractWorldMapIcon.method6465(n6, n)) {
            return -1;
        }
        return Client.field648.method10927(string, string2, n, n2, n3, n4, n5, bl, n6);
    }
}

