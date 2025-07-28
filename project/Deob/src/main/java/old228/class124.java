package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.awt.FontMetrics;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ea")
public class class124
extends class475 {
    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="Llo;")
    static class307 field1499;
    @ObfuscatedName(value="bb")
    static FontMetrics field1494;
    @ObfuscatedName(value="ds")
    @ObfuscatedSignature(descriptor="[Lvf;")
    static class570[] field1493;
    @ObfuscatedName(value="ay")
    final boolean field1496;

    public class124(boolean bl) {
        this.field1496 = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lsu;Lsu;I)I", garbageValue="-1570181773")
    int method3335(class478 class4782, class478 class4783) {
        if (class4782.field5020 == 0) {
            if (class4783.field5020 != 0) {
                return this.field1496 ? 1 : -1;
            }
        } else if (class4783.field5020 == 0) {
            return this.field1496 ? -1 : 1;
        }
        return this.method9184(class4782, class4783);
    }

    public int compare(Object object, Object object2) {
        return this.method3335((class478)object, (class478)object2);
    }
}

