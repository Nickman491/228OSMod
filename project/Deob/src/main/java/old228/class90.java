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

@ObfuscatedName(value="df")
public class class90
extends class514 {
    @ObfuscatedName(value="ay")
    Object[] field1086;
    @ObfuscatedName(value="ah")
    boolean field1075;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lna;")
    class361 field1077;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1190012531)
    int field1078;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=1402240027)
    int field1079;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=904758891)
    int field1076;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1860502355)
    int field1081;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lna;")
    class361 field1082;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1432134479)
    int field1083;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=1241265743)
    int field1084;
    @ObfuscatedName(value="au")
    String field1085;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-1852724295)
    int field1080;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-212291339)
    int field1087 = 76;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([Ljava/lang/Object;I)V", garbageValue="1177676751")
    public void method2630(Object[] objectArray) {
        this.field1086 = objectArray;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1971710567")
    public void method2621(int n) {
        this.field1087 = n;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lna;S)V", garbageValue="-4216")
    public void method2628(class361 class3612) {
        this.field1077 = class3612;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lmm;Lwr;B)Lmb;", garbageValue="18")
    public static class324 method2629(class322 class3222, class573 class5732) {
        class324 class3242 = class19.method288();
        class3242.field3437 = class3222;
        class3242.field3435 = class3222.field3417;
        class3242.field3442 = class3242.field3435 == -1 ? new class555(260) : (class3242.field3435 == -2 ? new class555(10000) : (class3242.field3435 <= 18 ? new class555(20) : (class3242.field3435 <= 98 ? new class555(100) : new class555(260))));
        class3242.field3442.method10248(class5732);
        class3242.field3442.method10221(class3242.field3437.field3416);
        class3242.field3436 = 0;
        return class3242;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1400630297")
    public static void method2622(int n) {
        if (class333.field3623.isEmpty()) return;
        Object object = class333.field3623.iterator();
        while (true) {
            if (!object.hasNext()) {
                object = (class345)class333.field3623.get(0);
                if (object == null || ((class345)object).field3743 == null || !((class345)object).field3743.method6717() || ((class345)object).field3745) return;
                ((class345)object).field3743.method6709(n);
                ((class345)object).field3739 = n;
                return;
            }
            class345 class3452 = (class345)object.next();
            if (class3452 == null) continue;
            class3452.field3738 = n;
        }
    }
}

