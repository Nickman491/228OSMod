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

@ObfuscatedName(value="lo")
public class class307 {
    @ObfuscatedName(value="at")
    static boolean field3282;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1192052067)
    public int field3284;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lnz;")
    public class350 field3283;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lnz;")
    public class350 field3285;

    @ObfuscatedSignature(descriptor="(ILnz;Lnz;)V")
    public class307(int n, class350 class3502, class350 class3503) {
        this.field3284 = n;
        this.field3283 = class3502;
        this.field3285 = class3503;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Lpq;II)Z", garbageValue="286865598")
    public static boolean method6538(class391 class3912, int n) {
        byte[] byArray = class3912.method7735(n);
        if (byArray == null) {
            return false;
        }
        class443.method8827(byArray);
        return true;
    }

    @ObfuscatedName(value="iv")
    @ObfuscatedSignature(descriptor="(Lka;S)V", garbageValue="17104")
    static void method6537(class268 class2682) {
        if (class2682 != null && class2682.field2971 != null) {
            Object object;
            if (class2682.field2971.field3863 < 0 || (object = class170.field1807.method7031(class2682.field2971.field4026)) != null && ((class361)object).field4014 != null && ((class361)object).field4014.length != 0 && class2682.field2971.field3863 < ((class361)object).field4014.length && class2682.field2971 == ((class361)object).field4014[class2682.field2971.field3863]) {
                if (class2682.field2971.field3873 == 11 && class2682.field2970 == 0) {
                    if (class2682.field2971.method7432(class2682.field2968, class2682.field2969, 0, 0)) {
                        class2682.field2971.method7440().method4873().method4976(1, class2682.field2971.method7440().method4853());
                        switch (class2682.field2971.method7441()) {
                            case 1: {
                                int[] nArray;
                                boolean bl;
                                int n = class232.method5133(class2682.field2971);
                                boolean bl2 = bl = (n >> 22 & 1) != 0;
                                if (!bl || (nArray = class2682.field2971.method7536()) == null) break;
                                class324 class3242 = class90.method2629(class322.field3390, client.field564.field1446);
                                class3242.field3442.method10331(nArray[2]);
                                class3242.field3442.method10268(class2682.field2971.method7437());
                                class3242.field3442.method10332(nArray[1]);
                                class3242.field3442.method10331(nArray[0]);
                                class3242.field3442.method10266(class2682.field2971.field3863);
                                class3242.field3442.method10332(class2682.field2971.field3910);
                                client.field564.method3257(class3242);
                                break;
                            }
                            case 0: {
                                class294.method6390(class2682.field2971.method7436(), true, false);
                            }
                        }
                    }
                } else if (class2682.field2971.field3873 == 12 && (object = class2682.field2971.method7444()) != null && ((class359)object).method7181()) {
                    switch (class2682.field2970) {
                        case 1: {
                            ((class359)object).method7169(class2682.field2968, class2682.field2969);
                            break;
                        }
                        case 0: {
                            client.field575.method5727(class2682.field2971);
                            ((class359)object).method7129(true);
                            ((class359)object).method7317(class2682.field2968, class2682.field2969, client.field731.method5776(82), client.field731.method5776(81));
                        }
                    }
                }
                return;
            }
            return;
        }
    }
}

