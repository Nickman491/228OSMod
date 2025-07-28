package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="us")
public class class525 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    class391 field5308;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpq;")
    class391 field5309;
    @ObfuscatedName(value="az")
    HashMap field5310;

    @ObfuscatedSignature(descriptor="(Lpq;Lpq;)V")
    public class525(class391 class3912, class391 class3913) {
        this.field5308 = class3912;
        this.field5309 = class3913;
        this.field5310 = new HashMap();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([Lun;I)Ljava/util/HashMap;", garbageValue="-455222829")
    public HashMap method9927(class526[] class526Array) {
        HashMap<class526, class435> hashMap = new HashMap<class526, class435>();
        class526[] class526Array2 = class526Array;
        int n = 0;
        while (n < class526Array2.length) {
            class526 class5262 = class526Array2[n];
            if (!this.field5310.containsKey(class5262)) {
                class435 class4352;
                class391 class3912 = this.field5308;
                class391 class3913 = this.field5309;
                String string = class5262.field5317;
                if (class3912.method7781(string, "")) {
                    class435 class4353;
                    int n2;
                    int n3 = class3912.method7743(string);
                    if (class296.method6397(class3912, n3, n2 = class3912.method7747(n3, ""))) {
                        class435 class4354;
                        byte[] byArray = class3913.method7790(n3, n2);
                        if (byArray != null) {
                            class435 class4355 = new class435(byArray, class241.field2585, class571.field5583, class571.field5584, class403.field4657, class25.field108, class240.field2580);
                            class241.field2585 = null;
                            class571.field5583 = null;
                            class571.field5584 = null;
                            class403.field4657 = null;
                            class25.field108 = null;
                            class240.field2580 = null;
                            class4354 = class4355;
                        } else {
                            class4354 = null;
                        }
                        class4353 = class4354;
                    } else {
                        class4353 = null;
                    }
                    class4352 = class4353;
                } else {
                    class4352 = null;
                }
                class435 class4356 = class4352;
                if (class4356 != null) {
                    this.field5310.put(class5262, class4356);
                    hashMap.put(class5262, class4356);
                }
            } else {
                hashMap.put(class5262, (class435)this.field5310.get(class5262));
            }
            ++n;
        }
        return hashMap;
    }
}

