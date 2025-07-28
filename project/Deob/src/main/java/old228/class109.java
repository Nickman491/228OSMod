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

@ObfuscatedName(value="eg")
public final class class109
extends class190 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=993264681)
    int field1389;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1292745957)
    int field1385;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=208941453)
    int field1386;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=731829437)
    int field1387;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=455551503)
    int field1391;
    @ObfuscatedName(value="an")
    boolean field1384;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1407412917)
    int field1390 = 31;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lia;")
    class228 field1388;

    class109() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-768696378")
    void method3101(int n) {
        this.field1390 = n;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="49")
    boolean method3116(int n) {
        if (n >= 0 && n <= 4) {
            return (this.field1390 & 1 << n) != 0;
        }
        return true;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lia;I)V", garbageValue="-1220201616")
    void method3104(class228 class2282) {
        this.field1388 = class2282;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)Lia;", garbageValue="-55471053")
    class228 method3105() {
        return this.field1388;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1906303790")
    void method3106() {
        this.field1388 = null;
    }

    @Override
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(B)Lhv;", garbageValue="-7")
    protected final class198 vmethod4447() {
        ItemDef class2632 = class191.method4462(this.field1389);
        return this.field1388 == null ? class2632.method5568(this.field1385) : class2632.method5582(this.field1388);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lnw;B)V", garbageValue="60")
    public static void method3111(class363 class3632) {
        class364.field4040 = class3632;
    }
}

