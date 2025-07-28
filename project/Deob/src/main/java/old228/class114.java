package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.EOFException;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="es")
public class class114 {
    @ObfuscatedName(value="az")
    boolean[] field1434;
    @ObfuscatedName(value="ao")
    Map field1432;
    @ObfuscatedName(value="ad")
    boolean field1435 = false;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(longValue=6896705008618298895L)
    long field1437;

    class114() {
        int n = class268.field2973.method7740(19);
        this.field1432 = new HashMap();
        this.field1434 = new boolean[n];
        int n2 = 0;
        while (true) {
            class237 class2372;
            if (n2 >= n) {
                this.method3187();
                return;
            }
            class237 class2373 = (class237)class237.field2545.method6578(n2);
            if (class2373 == null) {
                byte[] byArray = class237.field2546.method7790(19, n2);
                class2373 = new class237();
                if (byArray != null) {
                    class2373.method5201(new class556(byArray));
                }
                class237.field2545.method6590(class2373, n2);
                class2372 = class2373;
            } else {
                class2372 = class2373;
            }
            class2373 = class2372;
            this.field1434[n2] = class2373.field2544;
            ++n2;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="0")
    void method3183(int n, int n2) {
        this.field1432.put(n, n2);
        if (this.field1434[n]) {
            this.field1435 = true;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="115")
    int method3195(int n) {
        Object v = this.field1432.get(n);
        if (!(v instanceof Integer)) {
            return -1;
        }
        return (Integer)v;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;I)V", garbageValue="1055164733")
    void method3182(int n, String string) {
        this.field1432.put(n, string);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(II)Ljava/lang/String;", garbageValue="-260194423")
    String method3208(int n) {
        Object v = this.field1432.get(n);
        if (!(v instanceof String)) {
            return "";
        }
        return (String)v;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-811823227")
    void method3204() {
        int n = 0;
        while (n < this.field1434.length) {
            if (!this.field1434[n]) {
                this.field1432.remove(n);
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(ZI)Luv;", garbageValue="568662494")
    class536 method3185(boolean bl) {
        return class31.method493("2", class259.field2749.field4125, bl);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1683180538")
    void method3186() {
        class536 class5362 = this.method3185(true);
        try {
            int n = 3;
            int n2 = 0;
            for (Map.Entry entry : this.field1432.entrySet()) {
                int n3 = (Integer)entry.getKey();
                if (!this.field1434[n3]) continue;
                Object v = entry.getValue();
                n += 3;
                if (v instanceof Integer) {
                    n += 4;
                } else if (v instanceof String) {
                    n += class91.method2631((String)v);
                }
                ++n2;
            }
            class556 class5562 = new class556(n);
            class5562.method10300(2);
            class5562.method10266(n2);
            for (Map.Entry entry : this.field1432.entrySet()) {
                int n4 = (Integer)entry.getKey();
                if (!this.field1434[n4]) continue;
                class5562.method10266(n4);
                Object v = entry.getValue();
                class544 class5442 = class544.method10119(v.getClass());
                class5562.method10300(class5442.field5391);
                class544.method10136(v, class5562);
            }
            class5362.method10028(class5562.field5470, 0, class5562.field5471);
        }
        catch (Exception exception) {
        }
        finally {
            try {
                class5362.method10037();
            }
            catch (Exception exception) {}
        }
        this.field1435 = false;
        this.field1437 = class37.method724();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1663080803")
    void method3187() {
        class536 class5362 = this.method3185(false);
        try {
            int n;
            byte[] byArray = new byte[(int)class5362.method10031()];
            for (int i = 0; i < byArray.length; i += n) {
                n = class5362.method10044(byArray, i, byArray.length - i);
                if (n != -1) continue;
                throw new EOFException();
            }
            class556 class5562 = new class556(byArray);
            if (class5562.field5470.length - class5562.field5471 < 1) {
                return;
            }
            int n2 = class5562.method10282();
            if (n2 < 0 || n2 > 2) {
                return;
            }
            if (n2 >= 2) {
                int n3 = class5562.method10307();
                for (int i = 0; i < n3; ++i) {
                    int n4 = class5562.method10307();
                    int n5 = class5562.method10282();
                    class544 class5442 = (class544)class259.method5457(class544.method10125(), n5);
                    Object object = class5442.method10123(class5562);
                    if (n4 < 0 || n4 >= this.field1434.length || !this.field1434[n4]) continue;
                    this.field1432.put(n4, object);
                }
            } else {
                int n6;
                int n7;
                int n8 = class5562.method10307();
                for (n7 = 0; n7 < n8; ++n7) {
                    n6 = class5562.method10307();
                    int n9 = class5562.method10440();
                    if (n6 < 0 || n6 >= this.field1434.length || !this.field1434[n6]) continue;
                    this.field1432.put(n6, n9);
                }
                n7 = class5562.method10307();
                for (n6 = 0; n6 < n7; ++n6) {
                    class5562.method10307();
                    class5562.method10290();
                }
            }
        }
        catch (Exception exception) {
        }
        finally {
            try {
                class5362.method10037();
            }
            catch (Exception exception) {}
        }
        this.field1435 = false;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="364521518")
    void method3188() {
        if (this.field1435 && this.field1437 < class37.method724() - 60000L) {
            this.method3186();
        }
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="11")
    boolean method3199() {
        return this.field1435;
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-28")
    static void method3212(int n) {
        if (n == class78.field926) {
            return;
        }
        class78.field926 = n;
    }

    @ObfuscatedName(value="km")
    @ObfuscatedSignature(descriptor="(Ldz;IIIIIIII[Ljava/lang/String;III)V", garbageValue="-51087148")
    static void method3211(class103 class1032, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, String[] stringArray, int n9, int n10) {
        class410 class4102 = class1032.field1333;
        class98 class982 = null;
        class98 class983 = (class98)class4102.method7996();
        while (true) {
            block6: {
                block5: {
                    if (class983 == null) break block5;
                    if (class983.field1188 != n || n2 != class983.field1187 || n3 != class983.field1182 || n4 != class983.field1180) break block6;
                    class982 = class983;
                }
                if (class982 == null) {
                    class982 = new class98();
                    class982.field1188 = n;
                    class982.field1180 = n4;
                    class982.field1187 = n2;
                    class982.field1182 = n3;
                    class982.field1189 = -1;
                    ObjectDef.method5557(class1032, class982);
                    class4102.method7998(class982);
                }
                class982.field1192 = n5;
                class982.field1194 = n6;
                class982.field1185 = n7;
                class982.field1183 = n9;
                class982.field1186 = n10;
                class982.method2754(n8);
                class982.method2757(stringArray);
                return;
            }
            class983 = (class98)class4102.method8005();
        }
    }
}

