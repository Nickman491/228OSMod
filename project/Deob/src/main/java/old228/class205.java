package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="hh")
public class class205 {
    class205() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IB)Lja;", garbageValue="7")
    public static class256 method4806(int n) {
        class256 class2562 = (class256)class256.field2730.method6578(n);
        if (class2562 != null) {
            return class2562;
        }
        byte[] byArray = class431.field4781.method7790(14, n);
        class2562 = new class256();
        if (byArray != null) {
            class2562.method5420(new class556(byArray));
        }
        class256.field2730.method6590(class2562, n);
        return class2562;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(II)Lhb;", garbageValue="-1674690556")
    static class192 method4807(int n) {
        class192 class1922;
        class192 class1923 = (class192) SequenceDef.field2922.method6578(n);
        if (class1923 != null) {
            return class1923;
        }
        class391 class3912 = SequenceDef.field2920;
        class391 class3913 = class466.field4971;
        boolean bl = true;
        int[] nArray = class3912.method7814(n);
        for (int i = 0; i < nArray.length; ++i) {
            byte[] byArray = class3912.method7736(n, nArray[i]);
            if (byArray == null) {
                bl = false;
                continue;
            }
            int n2 = (byArray[0] & 0xFF) << 8 | byArray[1] & 0xFF;
            byte[] byArray2 = class3913.method7736(n2, 0);
            if (byArray2 != null) continue;
            bl = false;
        }
        if (!bl) {
            class1922 = null;
        } else {
            try {
                class1922 = new class192(class3912, class3913, n, false);
            }
            catch (Exception exception) {
                class1922 = null;
            }
        }
        class1923 = class1922;
        if (class1923 != null) {
            SequenceDef.field2922.method6590(class1923, n);
        }
        return class1923;
    }

    @ObfuscatedName(value="gq")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="2138033295")
    static void method4808() {
        client.field512 = true;
        if (class19.field80 != null && class19.field80.method3199()) {
            class19.field80.method3186();
        }
        class92.method2637();
        class63.method1230();
        if (class168.field1794 != null) {
            class168.field1794.field1094 = false;
        }
        class168.field1794 = null;
        client.field564.method3247();
        if (class34.field156 != null) {
            try {
                class34.field156.method4909();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        class34.field156 = null;
        class4.method20();
        class240.method5249();
        client.field508.method2723();
        class420.field4722 = null;
        class125.method3347(0, 0);
        class153.method3619();
        client.field540 = false;
        class69.method1957();
        if (class328.field3606 != null) {
            class328.field3606.method809();
        }
        HitSplatDef.field2760.method7855();
        class214.method4916();
        if (class280.field3069 != null) {
            class280.field3069.method3281();
        }
        class150.method3592();
        class216.field2393 = null;
        class216.field2394 = null;
        class121.field1484 = null;
        class93.method2651();
        class37.field227 = null;
        client.field795.clear();
        client.field692 = 0;
        HitSplatDef.field2760 = new class392();
        class280.field3069 = new URLConnection(client.field521.field547, 228);
        try {
            class30.method483("oldschool", class255.field2724, class438.field4820.field4119, 0, 23);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        class37.field227 = new class490(255, class216.field2393, class216.field2394, 500000);
        class34.field156 = new class214();
        client.field521.method544();
        class227.method5078(class95.field1157);
        class360.method7405(0);
    }
}

