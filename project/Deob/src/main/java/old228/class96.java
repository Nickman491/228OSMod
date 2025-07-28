package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dy")
public class class96 {
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Lpq;IB)V", garbageValue="51")
    public static void method2709(class391 class3912, int n) {
        if (!class333.field3626.isEmpty()) {
            ArrayList<class345> arrayList = new ArrayList<class345>();
            Iterator iterator = class333.field3626.iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    class1.method9(arrayList, class333.field3630, class333.field3632, class333.field3633, class333.field3634, false);
                    return;
                }
                class345 class3452 = (class345)iterator.next();
                class3452.field3742 = false;
                class3452.field3741 = false;
                class3452.field3745 = false;
                class3452.field3744 = false;
                class3452.field3736 = class3912;
                class3452.field3738 = n;
                class3452.field3739 = 0.0f;
                arrayList.add(class3452);
            }
        }
    }

    @ObfuscatedName(value="il")
    @ObfuscatedSignature(descriptor="(Ldz;Lda;I)V", garbageValue="-498840566")
    static final void method2710(class103 class1032, class99 class992) {
        int n;
        int n2;
        int n3;
        int n4;
        class67 class672;
        int n5;
        int n6;
        if (class992.field1230 != -1) {
            class103 class1033 = null;
            class99 class993 = null;
            n6 = 65536;
            if (class992.field1230 >= n6) {
                n5 = class992.field1230 - n6;
                class1033 = class128.method3366(n5, client.field508);
                class993 = class1033.field1329[n5];
            } else {
                class1033 = class508.method9616(class992.field1230, client.field508);
                class993 = class1033.field1330[class992.field1230];
            }
            if (class993 == null) {
                if (class992.field1236) {
                    class992.field1230 = -1;
                    class992.field1236 = false;
                }
            } else {
                class426 class4262 = class349.method6964(class992.field1213, 0.0f, class992.field1196);
                class426 class4263 = class349.method6964(class993.field1213, 0.0f, class993.field1196);
                if (class1032.field1320 != -1) {
                    class672 = class34.field189.field1318[class1032.field1320];
                    class4262 = class672.method9302(class992.field1213, class992.field1196);
                }
                if (class1033.field1320 != -1) {
                    class672 = class34.field189.field1318[class1033.field1320];
                    class4263 = class672.method9302(class993.field1213, class993.field1196);
                }
                n4 = (int)(class4262.field4747 - class4263.field4747);
                int n7 = (int)(class4262.field4749 - class4263.field4749);
                if (n4 != 0 || n7 != 0) {
                    int n8;
                    class99 class994 = class992;
                    class994.field1262 = n8 = (int)(Math.atan2(n4, n7) * 325.94932345220167) & 0x7FF;
                }
            }
        }
        if (class992.field1265 == 0 || class992.field1269 > 0) {
            n3 = -1;
            if (class992.field1233 != -1 && class992.field1205 != -1) {
                n2 = class350.method6980(class992.field1233 - class34.field189.field1324);
                n6 = class350.method6980(class992.field1205 - class34.field189.field1325);
                n5 = class992.field1213 - n2;
                n = class992.field1196 - n6;
                if (n5 != 0 || n != 0) {
                    n3 = n4 = (int)(Math.atan2(n5, n) * 325.94932345220167) & 0x7FF;
                }
            } else if (class992.field1232 != -1) {
                n3 = class992.field1232;
            }
            if (n3 != -1) {
                class992.field1262 = n3;
                if (class992.field1235) {
                    class992.field1197 = class992.field1262;
                }
            }
            class992.method2782();
        }
        if ((n3 = class992.field1262 - class992.field1197 & 0x7FF) == 0) {
            if (class992.field1236) {
                class992.field1230 = -1;
                class992.field1236 = false;
            }
            class992.field1231 = 0;
        } else {
            n2 = -1;
            n6 = 1;
            ++class992.field1231;
            n5 = n3 > 1024 ? -1 : 1;
            class992.field1197 += n5 * class992.field1200;
            n = 1;
            if (n3 < class992.field1200 || n3 > 2048 - class992.field1200) {
                class992.field1197 = class992.field1262;
                n = 0;
            }
            if (class992.field1200 > 0 && class992.field1201 == class992.field1238 && (class992.field1231 > 25 || n != 0)) {
                class992.field1238 = n5 != -1 || class992.field1202 == -1 ? (n5 == 1 && class992.field1203 != -1 ? class992.field1203 : class992.field1204) : class992.field1202;
            }
            class672 = class992;
            class992.field1197 = ((class99)class672).field1197 & 0x7FF;
        }
    }
}

