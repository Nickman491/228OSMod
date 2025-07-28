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

@ObfuscatedName(value="dd")
public class class95 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ldd;")
    static final class95 field1165 = new class95();
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ldd;")
    static final class95 field1157 = new class95();
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Ldd;")
    static final class95 field1153 = new class95();
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Ldd;")
    static final class95 field1151 = new class95();
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Ldd;")
    static final class95 field1152 = new class95();
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Ldd;")
    static final class95 field1150 = new class95();
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Ldd;")
    static final class95 field1154 = new class95();
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Ldd;")
    static final class95 field1155 = new class95();
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Ldd;")
    static final class95 field1149 = new class95();
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Ldd;")
    static final class95 field1148 = new class95();
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Ldd;")
    static final class95 field1158 = new class95();
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Ldd;")
    static final class95 field1159 = new class95();
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Ldd;")
    static final class95 field1156 = new class95();
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Ldd;")
    static final class95 field1161 = new class95();
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Ldd;")
    static final class95 field1162 = new class95();
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Ldd;")
    static final class95 field1163 = new class95();
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Ldd;")
    static final class95 field1160 = new class95();
    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="Ldd;")
    static final class95 field1164 = new class95();
    @ObfuscatedName(value="ti")
    @ObfuscatedGetter(intValue=-399746587)
    static int field1167;

    class95() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="-1117049380")
    public static int method2708(int n, int n2) {
        int n3 = 1;
        while (true) {
            if (n2 <= 1) {
                if (n2 == 1) {
                    return n * n3;
                }
                return n3;
            }
            if ((n2 & 1) != 0) {
                n3 = n * n3;
            }
            n *= n;
            n2 >>= 1;
        }
    }
}

