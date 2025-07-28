package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ed")
public class class129
extends class475 {
    @ObfuscatedName(value="ay")
    final boolean field1525;

    public class129(boolean bl) {
        this.field1525 = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lsu;Lsu;B)I", garbageValue="-45")
    int method3371(class478 class4782, class478 class4783) {
        if (class4782.field5020 != 0 && class4783.field5020 != 0) {
            return this.field1525 ? class4782.method9161().method10972(class4783.method9161()) : class4783.method9161().method10972(class4782.method9161());
        }
        return this.method9184(class4782, class4783);
    }

    public int compare(Object object, Object object2) {
        return this.method3371((class478)object, (class478)object2);
    }
}

