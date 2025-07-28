package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ee")
public class class121
implements Comparator {
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="[Luc;")
    public static class537[] field1484;
    @ObfuscatedName(value="cy")
    @ObfuscatedGetter(intValue=-1400294067)
    static int field1481;
    @ObfuscatedName(value="ay")
    final boolean field1483;

    public class121(boolean bl) {
        this.field1483 = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lsu;Lsu;B)I", garbageValue="76")
    int method3313(class478 class4782, class478 class4783) {
        return this.field1483 ? class4782.field5018 - class4783.field5018 : class4783.field5018 - class4782.field5018;
    }

    public int compare(Object object, Object object2) {
        return this.method3313((class478)object, (class478)object2);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @ObfuscatedName(value="nr")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-3927")
    static final void method3319() {
        class324 class3242 = class90.method2629(class322.field3405, client.field564.field1446);
        class3242.field3442.method10300(0);
        client.field564.method3257(class3242);
    }
}

