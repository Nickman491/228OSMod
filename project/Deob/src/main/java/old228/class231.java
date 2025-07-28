package old228;/*
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
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmi;")
    static class315 field2495 = new class315(64);

    @ObfuscatedName(value="kj")
    @ObfuscatedSignature(descriptor="(III)Lkv;", garbageValue="-436780710")
    static class272 method5129(int n, int n2) {
        client.field798.field3023 = n;
        client.field798.field3020 = n2;
        client.field798.field3021 = 1;
        client.field798.field3019 = 1;
        return client.field798;
    }

    @ObfuscatedName(value="ld")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I", garbageValue="414685391")
    static final int method5128(String string, String string2, int n, int n2, int n3, int n4, int n5, boolean bl, int n6) {
        if (client.field647) {
            return -1;
        }
        if (!class302.method6465(n6, n)) {
            return -1;
        }
        return client.field648.method10927(string, string2, n, n2, n3, n4, n5, bl, n6);
    }
}

