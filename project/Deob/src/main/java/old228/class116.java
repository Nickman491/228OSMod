package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ep")
public class class116 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lsq;")
    class486 field1448;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lps;")
    class412 field1449 = new class412();
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1527394769)
    int field1459 = 0;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lvy;")
    class556 field1453 = new class556(5000);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lwr;")
    public class573 field1446;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lvv;")
    class555 field1450 = new class555(40000);
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lmn;")
    class325 field1451 = null;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-554681029)
    int field1452 = 0;
    @ObfuscatedName(value="at")
    boolean field1457 = true;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-1900238241)
    int field1454 = 0;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=555548547)
    int field1455 = 0;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=1785260499)
    int field1456 = 0;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-1743314537)
    int field1445;
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Lmn;")
    class325 field1458;
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lmn;")
    class325 field1447;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lmn;")
    class325 field1460;

    class116() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1444195951")
    final void method3243() {
        this.field1449.method8042();
        this.field1459 = 0;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="911985798")
    final void method3246() throws IOException {
        if (this.field1448 != null && this.field1459 > 0) {
            this.field1453.field5471 = 0;
            while (true) {
                class324 class3242;
                if ((class3242 = (class324)this.field1449.method8046()) == null || class3242.field3436 > this.field1453.field5470.length - this.field1453.field5471) {
                    this.field1448.vmethod9411(this.field1453.field5470, 0, this.field1453.field5471);
                    this.field1455 = 0;
                    break;
                }
                this.field1453.method10275(class3242.field3442.field5470, 0, class3242.field3436);
                this.field1459 -= class3242.field3436;
                class3242.method9623();
                class3242.field3442.method10451();
                class3242.method6621();
            }
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lmb;I)V", garbageValue="1268821956")
    public final void method3257(class324 class3242) {
        this.field1449.method8043(class3242);
        class3242.field3436 = class3242.field3442.field5471;
        class3242.field3442.field5471 = 0;
        this.field1459 += class3242.field3436;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lsq;I)V", garbageValue="375321384")
    void method3263(class486 class4862) {
        this.field1448 = class4862;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-4")
    void method3247() {
        if (this.field1448 != null) {
            this.field1448.vmethod9416();
            this.field1448 = null;
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-14145")
    void method3248() {
        this.field1448 = null;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)Lsq;", garbageValue="-145702831")
    class486 method3249() {
        return this.field1448;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)[B", garbageValue="167109404")
    public static byte[] method3251(int n) {
        return class302.method6466(n, false);
    }
}

