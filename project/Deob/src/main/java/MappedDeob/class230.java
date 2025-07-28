/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="iw")
public class class230
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static EvictingDualNodeHashTable field2490 = new EvictingDualNodeHashTable(64);
    @ObfuscatedName(value="ww")
    static List field2489;

    @ObfuscatedName(value="gd")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="737624929")
    static void method5124() {
        if (GameEngine.field189 != null) {
            GameEngine.field189.field1319.method4211(class544.clientPreferences.method2902());
        }
    }
}

