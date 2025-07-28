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

@ObfuscatedName(value="ct")
public class class64
extends class510 {
    @ObfuscatedName(value="kw")
    @ObfuscatedGetter(intValue=-1531834981)
    static int field459;
    @ObfuscatedName(value="tf")
    @ObfuscatedSignature(descriptor="Lcg;")
    static class57 field457;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-45791165)
    int field452;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=855742145)
    int field449;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=119134741)
    int field450;
    @ObfuscatedName(value="ao")
    String field451;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lwb;")
    class579 field456;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lsb;")
    class479 field453 = class479.field5024;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lsb;")
    class479 field455 = class479.field5024;
    @ObfuscatedName(value="ax")
    String field458;
    @ObfuscatedName(value="at")
    String field454;

    class64(int n, String string, String string2, String string3) {
        this.method1234(n, string, string2, string3);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V", garbageValue="-94")
    void method1234(int n, String string, String string2, String string3) {
        this.field452 = class84.method2572();
        this.field449 = client.field514;
        this.field450 = n;
        this.field451 = string;
        this.method1241();
        this.field458 = string2;
        this.field454 = string3;
        this.method1240();
        this.method1238();
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="662241692")
    void method1240() {
        this.field453 = class479.field5024;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="-64")
    final boolean method1236() {
        if (this.field453 == class479.field5024) {
            this.method1237();
        }
        return this.field453 == class479.field5023;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-65")
    void method1237() {
        this.field453 = class10.field54.field825.method9194(this.field456) ? class479.field5023 : class479.field5022;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-348559967")
    void method1238() {
        this.field455 = class479.field5024;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-538386494")
    final boolean method1239() {
        if (this.field455 == class479.field5024) {
            this.method1250();
        }
        return this.field455 == class479.field5023;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-929945081")
    void method1250() {
        this.field455 = class10.field54.field828.method9194(this.field456) ? class479.field5023 : class479.field5022;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="0")
    final void method1241() {
        this.field456 = this.field451 != null ? new class579(class23.method334(this.field451), class383.field4489) : null;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Lfs;", garbageValue="1020129089")
    static class137 method1253(int n) {
        MouseWheel[] mouseWheelArray = new class137[]{class137.field1604, class137.field1600, class137.field1596, class137.field1597, class137.field1598, class137.field1599};
        class137 class1372 = (class137)class259.method5457(mouseWheelArray, n);
        if (class1372 == null) {
            class1372 = class137.field1604;
        }
        return class1372;
    }
}

