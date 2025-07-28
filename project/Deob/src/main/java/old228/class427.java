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

@ObfuscatedName(value="qa")
public final class class427 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="[Lqa;")
    static class427[] field4755 = new class427[0];
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1504367069)
    static int field4750 = 100;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-457814417)
    static int field4752;
    @ObfuscatedName(value="ao")
    float field4751;
    @ObfuscatedName(value="ad")
    float field4754;
    @ObfuscatedName(value="an")
    float field4753;
    @ObfuscatedName(value="ae")
    float field4756;

    static {
        field4755 = new class427[100];
        field4752 = 0;
        new class427();
    }

    class427() {
        this.method8345();
    }

    public class427(float f, float f2, float f3) {
        this.method8332(f, f2, f3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1473805285")
    public void method8354() {
        class427[] class427Array = field4755;
        synchronized (field4755) {
            if (field4752 < field4750 - 1) {
                class427.field4755[++class427.field4752 - 1] = this;
            }
            // ** MonitorExit[var1_1] (shouldn't be in output)
            return;
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(FFFFI)V", garbageValue="-987345796")
    void method8333(float f, float f2, float f3, float f4) {
        this.field4751 = f;
        this.field4754 = f2;
        this.field4753 = f3;
        this.field4756 = f4;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(FFFFI)V", garbageValue="1523709540")
    public void method8334(float f, float f2, float f3, float f4) {
        float f5 = (float)Math.sin(0.5f * f4);
        float f6 = (float)Math.cos(0.5f * f4);
        this.field4751 = f * f5;
        this.field4754 = f5 * f2;
        this.field4753 = f3 * f5;
        this.field4756 = f6;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(FFFI)V", garbageValue="-29318803")
    public void method8332(float f, float f2, float f3) {
        this.method8334(0.0f, 1.0f, 0.0f, f);
        class427 class4272 = class191.method4465();
        class4272.method8334(1.0f, 0.0f, 0.0f, f2);
        this.method8340(class4272);
        class4272.method8334(0.0f, 0.0f, 1.0f, f3);
        this.method8340(class4272);
        class4272.method8354();
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-476969734")
    final void method8345() {
        this.field4753 = 0.0f;
        this.field4754 = 0.0f;
        this.field4751 = 0.0f;
        this.field4756 = 1.0f;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lqa;I)V", garbageValue="2146504528")
    public final void method8340(class427 class4272) {
        this.method8333(this.field4751 * class4272.field4756 + this.field4756 * class4272.field4751 + class4272.field4754 * this.field4753 - this.field4754 * class4272.field4753, class4272.field4753 * this.field4751 + (class4272.field4756 * this.field4754 - class4272.field4751 * this.field4753 + this.field4756 * class4272.field4754), class4272.field4756 * this.field4753 + this.field4754 * class4272.field4751 - class4272.field4754 * this.field4751 + this.field4756 * class4272.field4753, this.field4756 * class4272.field4756 - class4272.field4751 * this.field4751 - this.field4754 * class4272.field4754 - class4272.field4753 * this.field4753);
    }

    public int hashCode() {
        int n = 31;
        float f = 1.0f;
        f = this.field4751 + f * 31.0f;
        f = this.field4754 + 31.0f * f;
        f = this.field4753 + 31.0f * f;
        f = this.field4756 + f * 31.0f;
        return (int)f;
    }

    public String toString() {
        return this.field4751 + "," + this.field4754 + "," + this.field4753 + "," + this.field4756;
    }

    public boolean equals(Object object) {
        if (!(object instanceof class427)) {
            return false;
        }
        class427 class4272 = (class427)object;
        return class4272.field4751 == this.field4751 && this.field4754 == class4272.field4754 && class4272.field4753 == this.field4753 && class4272.field4756 == this.field4756;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ldf;Ldm;III)V", garbageValue="-105147355")
    static void method8367(class90 class902, class81 object, int n, int n2) {
        Object object2;
        int n7;
        Object[] objectArray = class902.field1086;
        class63.field444 = 0;
        class104.field1343 = 0;
        int n3 = -1;
        int[] nArray = ((class81)object).field1001;
        int[] nArray2 = ((class81)object).field1002;
        int n4 = -1;
        class72.field851 = 0;
        class72.field850 = false;
        boolean bl = false;
        int n5 = 0;
        try {
            Object object3;
            int n6;
            class542.field5388 = new int[((class81)object).field1005];
            int n8 = 0;
            class148.field1675 = new String[((class81)object).field1000];
            int n9 = 0;
            for (n7 = 1; n7 < objectArray.length; ++n7) {
                if (objectArray[n7] instanceof Integer) {
                    n6 = (Integer)objectArray[n7];
                    if (n6 == -2147483647) {
                        n6 = class902.field1078;
                    }
                    if (n6 == -2147483646) {
                        n6 = class902.field1079;
                    }
                    if (n6 == -2147483645) {
                        int n10 = n6 = class902.field1077 != null ? class902.field1077.field3910 : -1;
                    }
                    if (n6 == -2147483644) {
                        n6 = class902.field1076;
                    }
                    if (n6 == -2147483643) {
                        int n11 = n6 = class902.field1077 != null ? class902.field1077.field3863 : -1;
                    }
                    if (n6 == -2147483642) {
                        int n12 = n6 = class902.field1082 != null ? class902.field1082.field3910 : -1;
                    }
                    if (n6 == -2147483641) {
                        int n13 = n6 = class902.field1082 != null ? class902.field1082.field3863 : -1;
                    }
                    if (n6 == -2147483640) {
                        n6 = class902.field1083;
                    }
                    if (n6 == -2147483639) {
                        n6 = class902.field1084;
                    }
                    if (n6 == -2147483638) {
                        n6 = class902.field1081;
                    }
                    class542.field5388[n8++] = n6;
                    continue;
                }
                if (!(objectArray[n7] instanceof String)) continue;
                object3 = (String)objectArray[n7];
                if (((String)object3).equals("event_opbase")) {
                    object3 = class902.field1085;
                }
                class148.field1675[n9++] = object3;
            }
            class72.field864 = class902.field1080;
            block13: while (true) {
                if (++n5 > n) {
                    throw new RuntimeException();
                }
                if ((n4 = nArray[++n3]) < 100) {
                    int n14;
                    if (n4 == 0) {
                        class72.field865[++class63.field444 - 1] = nArray2[n3];
                        continue;
                    }
                    if (n4 == 1) {
                        n7 = nArray2[n3];
                        class72.field865[++class63.field444 - 1] = class349.field3763[n7];
                        continue;
                    }
                    if (n4 == 2) {
                        n7 = nArray2[n3];
                        class349.field3763[n7] = class72.field865[--class63.field444];
                        class272.method5848(n7);
                        continue;
                    }
                    if (n4 == 3) {
                        class72.field855[++class104.field1343 - 1] = ((class81)object).field1003[n3];
                        continue;
                    }
                    if (n4 == 6) {
                        n3 += nArray2[n3];
                        continue;
                    }
                    if (n4 == 7) {
                        if (class72.field865[class63.field444 -= 2] == class72.field865[class63.field444 + 1]) continue;
                        n3 += nArray2[n3];
                        continue;
                    }
                    if (n4 == 8) {
                        if (class72.field865[class63.field444 -= 2] != class72.field865[class63.field444 + 1]) continue;
                        n3 += nArray2[n3];
                        continue;
                    }
                    if (n4 == 9) {
                        if (class72.field865[class63.field444 -= 2] >= class72.field865[class63.field444 + 1]) continue;
                        n3 += nArray2[n3];
                        continue;
                    }
                    if (n4 == 10) {
                        if (class72.field865[class63.field444 -= 2] <= class72.field865[class63.field444 + 1]) continue;
                        n3 += nArray2[n3];
                        continue;
                    }
                    if (n4 == 21) {
                        if (class72.field851 == 0) {
                            return;
                        }
                        object2 = class72.field858[--class72.field851];
                        object = ((class63)object2).field442;
                        nArray = ((class81)object).field1001;
                        nArray2 = ((class81)object).field1002;
                        n3 = ((class63)object2).field440;
                        class542.field5388 = ((class63)object2).field441;
                        class148.field1675 = ((class63)object2).field443;
                        continue;
                    }
                    if (n4 == 25) {
                        n7 = nArray2[n3];
                        class72.field865[++class63.field444 - 1] = class77.method2368(n7);
                        continue;
                    }
                    if (n4 == 27) {
                        n7 = nArray2[n3];
                        class272.method5847(n7, class72.field865[--class63.field444]);
                        continue;
                    }
                    if (n4 == 31) {
                        if (class72.field865[class63.field444 -= 2] > class72.field865[class63.field444 + 1]) continue;
                        n3 += nArray2[n3];
                        continue;
                    }
                    if (n4 == 32) {
                        if (class72.field865[class63.field444 -= 2] < class72.field865[class63.field444 + 1]) continue;
                        n3 += nArray2[n3];
                        continue;
                    }
                    if (n4 == 33) {
                        class72.field865[++class63.field444 - 1] = class542.field5388[nArray2[n3]];
                        continue;
                    }
                    if (n4 == 34) {
                        class542.field5388[nArray2[n3]] = class72.field865[--class63.field444];
                        continue;
                    }
                    if (n4 == 35) {
                        class72.field855[++class104.field1343 - 1] = class148.field1675[nArray2[n3]];
                        continue;
                    }
                    if (n4 == 36) {
                        class148.field1675[nArray2[n3]] = class72.field855[--class104.field1343];
                        continue;
                    }
                    if (n4 == 37) {
                        n7 = nArray2[n3];
                        object3 = class387.method7668(class72.field855, class104.field1343 -= n7, n7);
                        class72.field855[++class104.field1343 - 1] = object3;
                        continue;
                    }
                    if (n4 == 38) {
                        --class63.field444;
                        continue;
                    }
                    if (n4 == 39) {
                        --class104.field1343;
                        continue;
                    }
                    if (n4 == 40) {
                        if (class72.field851 == 50) {
                            throw new RuntimeException();
                        }
                        n7 = nArray2[n3];
                        object3 = class34.method657(n7);
                        Object object4 = new int[((class81)object3).field1005];
                        String[] stringArray = new String[((class81)object3).field1000];
                        for (n14 = 0; n14 < ((class81)object3).field1006; ++n14) {
                            object4[n14] = class72.field865[n14 + (class63.field444 - ((class81)object3).field1006)];
                        }
                        for (n14 = 0; n14 < ((class81)object3).field1007; ++n14) {
                            stringArray[n14] = class72.field855[n14 + (class104.field1343 - ((class81)object3).field1007)];
                        }
                        class63.field444 -= ((class81)object3).field1006;
                        class104.field1343 -= ((class81)object3).field1007;
                        class63 class632 = new class63();
                        class632.field442 = object;
                        class632.field440 = n3;
                        class632.field441 = class542.field5388;
                        class632.field443 = class148.field1675;
                        class72.field858[++class72.field851 - 1] = class632;
                        object = object3;
                        nArray = ((class81)object).field1001;
                        nArray2 = ((class81)object).field1002;
                        n3 = -1;
                        class542.field5388 = (int[])object4;
                        class148.field1675 = stringArray;
                        continue;
                    }
                    if (n4 == 42) {
                        class72.field865[++class63.field444 - 1] = class19.field80.method3195(nArray2[n3]);
                        continue;
                    }
                    if (n4 == 43) {
                        class19.field80.method3183(nArray2[n3], class72.field865[--class63.field444]);
                        continue;
                    }
                    if (n4 == 44) {
                        int n15;
                        n7 = nArray2[n3] >> 16;
                        n6 = nArray2[n3] & 0xFFFF;
                        if ((n15 = class72.field865[--class63.field444]) < 0) throw new RuntimeException();
                        if (n15 > 5000) {
                            throw new RuntimeException();
                        }
                        class72.field852[n7] = n15;
                        int n16 = -1;
                        if (n6 == 105) {
                            n16 = 0;
                        }
                        n14 = 0;
                        while (true) {
                            if (n14 >= n15) continue block13;
                            class72.field853[n7][n14] = n16;
                            ++n14;
                        }
                    }
                    if (n4 == 45) {
                        n7 = nArray2[n3];
                        if ((n6 = class72.field865[--class63.field444]) < 0) throw new RuntimeException();
                        if (n6 >= class72.field852[n7]) {
                            throw new RuntimeException();
                        }
                        class72.field865[++class63.field444 - 1] = class72.field853[n7][n6];
                        continue;
                    }
                    if (n4 == 46) {
                        n7 = nArray2[n3];
                        n6 = class72.field865[class63.field444 -= 2];
                        if (n6 < 0) throw new RuntimeException();
                        if (n6 >= class72.field852[n7]) {
                            throw new RuntimeException();
                        }
                        class72.field853[n7][n6] = class72.field865[class63.field444 + 1];
                        continue;
                    }
                    if (n4 == 49) {
                        object2 = class19.field80.method3208(nArray2[n3]);
                        class72.field855[++class104.field1343 - 1] = object2;
                        continue;
                    }
                    if (n4 == 50) {
                        class19.field80.method3182(nArray2[n3], class72.field855[--class104.field1343]);
                        continue;
                    }
                    if (n4 == 60) {
                        object2 = ((class81)object).field1008[nArray2[n3]];
                        if ((object3 = (class513)((class529)object2).method9967(class72.field865[--class63.field444])) == null) continue;
                        n3 += ((class513)object3).field5172;
                        continue;
                    }
                    if (n4 == 74) {
                        object2 = class281.field3082.method3689(nArray2[n3]);
                        if (object2 == null) {
                            class72.field865[++class63.field444 - 1] = -1;
                            continue;
                        }
                        class72.field865[++class63.field444 - 1] = (Integer)object2;
                        continue;
                    }
                    if (n4 != 76) throw new IllegalStateException();
                    object2 = client.field803.method9506(nArray2[n3]);
                    if (object2 == null) {
                        class72.field865[++class63.field444 - 1] = -1;
                        continue;
                    }
                    class72.field865[++class63.field444 - 1] = (Integer)object2;
                    continue;
                }
                n7 = ((class81)object).field1002[n3] == 1 ? 1 : 0;
                n6 = class53.method1129(n4, (class81)object, n7 != 0);
                switch (n6) {
                    case 1: {
                        continue block13;
                    }
                    case 2: {
                        throw new IllegalStateException();
                    }
                    case 0: {
                        return;
                    }
                }
                continue;
                break;
            }
        }
        catch (Exception exception) {
            bl = true;
            StringBuilder stringBuilder = new StringBuilder(30);
            stringBuilder.append("").append(((class514)object).field5174).append(" ");
            for (n7 = class72.field851 - 1; n7 >= 0; --n7) {
                stringBuilder.append("").append(class72.field858[n7].field442.field5174).append(" ");
            }
            stringBuilder.append("").append(n4);
            class255.method5410(stringBuilder.toString(), exception);
            return;
        }
        finally {
            while (class72.field863.size() > 0) {
                object2 = (class107)class72.field863.remove(0);
                URLLoader.method3271(((class107)object2).method3090(), ((class107)object2).method3081(), ((class107)object2).method3082(), ((class107)object2).method3083(), "");
            }
            if (class72.field850) {
                class72.field850 = false;
                class365.method7584();
            }
            if (!bl && n2 > 0 && n5 >= n2) {
                class255.method5410("Warning: Script " + ((class81)object).field1004 + " finished at op count " + n5 + " of max " + n, null);
            }
        }
    }
}

