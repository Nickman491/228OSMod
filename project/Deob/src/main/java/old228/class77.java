package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.math.BigInteger;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ch")
public class class77 {
    @ObfuscatedName(value="ay")
    static final BigInteger field916 = new BigInteger("10001", 16);
    @ObfuscatedName(value="ah")
    static final BigInteger field917 = new BigInteger("86e8427690ebc5e5cc9b6b3336a1f7af648af5bcf44a8057b13a05934a356697924662f3dc12214aa0ddcb0030e0e53c3fc937e50424a85a5ae1ddfa7712e2971cbc0c6a7c1ed5a6602c4d838b3ec9cd663b6e065923456bc76ea9974bef518ddf4caac9e9cf6ae8090345598fd2f8c55ef7a2e8f01770582bf8cfcc4e668ae9", 16);

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="0")
    public static int method2368(int n) {
        class256 class2562 = class205.method4806(n);
        int n2 = class2562.field2729;
        int n3 = class2562.field2732;
        int n4 = class2562.field2731;
        int n5 = class349.field3760[n4 - n3];
        return class349.field3763[n2] >> n3 & n5;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lna;II)V", garbageValue="-1626286422")
    static final void method2367(class361 class3612, int n) {
        if (class3612.field3861 != null) {
            if (class3612.field3953 == null) {
                class3612.field3953 = new int[class3612.field3861.length];
            }
            class3612.field3953[n] = Integer.MAX_VALUE;
            return;
        }
        throw new RuntimeException();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="lu")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-1027046531")
    static final void method2366(int n, int n2) {
        int[] nArray = new int[client.field508.method2716()];
        float[] fArray = new float[client.field508.method2716()];
        int n3 = 0;
        for (Object object : client.field508) {
            nArray[n3] = ((class103)object).field1320;
            fArray[n3] = ((class103)object).field1319.field2067;
            ++n3;
        }
        class145.method3557(fArray, nArray);
        HashMap hashMap = new HashMap();
        for (n3 = nArray.length - 1; n3 >= 0; --n3) {
            Object object;
            if (!(fArray[n3] > 0.0f) && nArray[n3] != -1 || hashMap.containsKey(object = client.field508.method2720(nArray[n3]))) continue;
            hashMap.put(object, nArray[n3]);
        }
        n3 = 0;
        while (n3 < nArray.length) {
            int n4 = nArray[n3];
            class492 class4922 = client.field508.method2720(n4);
            Integer n5 = (Integer)hashMap.get(class4922);
            if (n5 != null && n5.equals(n4)) {
                if (class4922 == class492.field5092) {
                    class231.method5128("Walk here", "", 23, 0, n, n2, 0, false, n4);
                } else if (class4922 == class492.field5094) {
                    float f;
                    Object object;
                    Object object2;
                    int n6 = class23.method337(class34.field189, class53.field339.vmethod9352(), class53.field339.vmethod9331(), class53.field339.vmethod9290());
                    class426 class4262 = class349.method6964(class53.field339.vmethod9352(), n6, class53.field339.vmethod9331());
                    int n7 = class478.field5017;
                    int n8 = class64.field459;
                    int n9 = class31.field140;
                    float f2 = 1.0E-5f;
                    class426 class4263 = class349.method6964(n7, n8, n9);
                    Object object3 = class349.method6964(0.0f, n6, 0.0f);
                    class426 class4264 = class349.method6964(0.0f, 1.0f, 0.0f);
                    float f3 = class4264.method8305((class426)(object2 = class199.field2268));
                    float f4 = f3;
                    if (Math.abs(f4) < 1.0E-5f) {
                        object = null;
                    } else {
                        class426 class4265 = class223.method5044(class4263, (class426)object3);
                        f = class4264.method8305(class4265);
                        float f5 = -f / f4;
                        if (f5 < 0.0f) {
                            object = null;
                        } else {
                            Object object4;
                            Object object5;
                            Object object6;
                            class4263.method8317();
                            ((class426)object3).method8317();
                            class4264.method8317();
                            class4265.method8317();
                            class426 class4266 = class199.field2268;
                            Object object7 = class426.field4746;
                            // MONITORENTER : old228.class426.field4746
                            if (class426.field4742 == 0) {
                                object6 = new class426(class4266);
                            } else {
                                class426.field4746[--class426.field4742].method8316(class4266);
                                object6 = class426.field4746[class426.field4742];
                            }
                            // MONITOREXIT : object7
                            object7 = object6;
                            ((class426)object7).method8327(f5);
                            object6 = object5 = object7;
                            Object object8 = class426.field4746;
                            // MONITORENTER : old228.class426.field4746
                            if (class426.field4742 == 0) {
                                object7 = new class426(class4263);
                            } else {
                                class426.field4746[--class426.field4742].method8316(class4263);
                                object7 = class426.field4746[class426.field4742];
                            }
                            // MONITOREXIT : object8
                            object8 = object7;
                            ((class426)object8).method8297((class426)object6);
                            object = object4 = object8;
                        }
                    }
                    Object object9 = object;
                    if (object9 != null) {
                        int n10;
                        float f6;
                        Object object10;
                        class4263 = class223.method5044(object9, class4262);
                        class4264 = class426.field4743;
                        object2 = class426.field4746;
                        // MONITORENTER : old228.class426.field4746
                        if (class426.field4742 == 0) {
                            object10 = new class426(class4264);
                        } else {
                            class426.field4746[--class426.field4742].method8316(class4264);
                            object10 = class426.field4746[class426.field4742];
                        }
                        // MONITOREXIT : object2
                        object2 = object10;
                        ((class426)object2).method8293(class4263);
                        object10 = object3 = object2;
                        class426 class4267 = class426.field4745;
                        float f7 = f6 = ((class426)object10).method8305(class4267);
                        class426 class4268 = class426.field4743;
                        f = class4268.method8305(class4263);
                        float f8 = (float)Math.atan2(f7, f);
                        int n11 = n10 = (int)(2048.0 * ((double)f8 / (Math.PI * 2))) & 0x7FF;
                        n11 += 64;
                        n11 = (n11 & 0x7FF) / 128;
                        class231.method5128("Set heading", "", 60, n11, 0, 0, 0, false, n4);
                        class4263.method8317();
                        ((class426)object10).method8317();
                        ((class426)object9).method8317();
                    }
                }
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="lw")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="647995674")
    static boolean method2369(int n, int n2) {
        boolean bl;
        boolean bl2;
        if (n2 >= 2000) {
            n2 -= 2000;
        }
        boolean bl3 = n != class148.field1676 && n != -1 && !class63.method1231(n2) ? false : (bl2 = true);
        if (!bl2) {
            bl2 = bl = n2 == 14 || n2 == 15 || n2 >= 44 && n2 <= 51;
        }
        if (!(bl = bl2)) {
            boolean bl4;
            bl = bl4 = n2 == 1002 || n2 == 1003 || n2 == 1004;
        }
        return bl;
    }
}

