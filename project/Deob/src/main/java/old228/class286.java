package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ln")
public final class class286 {
    @ObfuscatedName(value="ay")
    boolean field3138 = false;
    @ObfuscatedName(value="ah")
    boolean field3139 = false;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Llv;")
    class305 field3134;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lvf;")
    class570 field3137;
    @ObfuscatedName(value="ad")
    HashMap field3136;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="[[Lki;")
    class285[][] field3147;
    @ObfuscatedName(value="ae")
    HashMap field3145 = new HashMap();
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="[Lvi;")
    class569[] field3132;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lpq;")
    final class391 field3140;
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lpq;")
    final class391 field3141;
    @ObfuscatedName(value="au")
    final HashMap field3142;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-245797833)
    int field3143;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-716092027)
    int field3144;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-1728469507)
    int field3135;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-403850304)
    int field3146;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-1812520287)
    public int field3149 = 0;

    @ObfuscatedSignature(descriptor="([Lvi;Ljava/util/HashMap;Lpq;Lpq;)V")
    public class286(class569[] class569Array, HashMap hashMap, class391 class3912, class391 class3913) {
        this.field3132 = class569Array;
        this.field3142 = hashMap;
        this.field3140 = class3912;
        this.field3141 = class3913;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;Ljava/lang/String;ZB)V", garbageValue="75")
    public void method6272(class391 class3912, String string, boolean bl) {
        if (this.field3139) {
            return;
        }
        this.field3138 = false;
        this.field3139 = true;
        System.nanoTime();
        int n = class3912.method7743(class303.field3264.field3268);
        int n2 = class3912.method7747(n, string);
        class556 class5562 = new class556(class3912.method7749(class303.field3264.field3268, string));
        class556 class5563 = new class556(class3912.method7749(class303.field3269.field3268, string));
        System.nanoTime();
        System.nanoTime();
        this.field3134 = new class305();
        try {
            this.field3134.method6492(class5562, class5563, n2, bl);
        }
        catch (IllegalStateException illegalStateException) {
            return;
        }
        this.field3134.method6070();
        this.field3134.method6052();
        this.field3134.method6093();
        this.field3143 = this.field3134.method6047() * 64;
        this.field3144 = this.field3134.method6049() * 64;
        this.field3135 = (this.field3134.method6064() - this.field3134.method6047() + 1) * 64;
        this.field3146 = (this.field3134.method6050() - this.field3134.method6049() + 1) * 4096;
        int n3 = this.field3134.method6064() - this.field3134.method6047() + 1;
        int n4 = this.field3134.method6050() - this.field3134.method6049() + 1;
        System.nanoTime();
        System.nanoTime();
        class285.field3125.method6551();
        this.field3147 = new class285[n3][n4];
        for (class279 class2792 : this.field3134.field3272) {
            int n5 = class2792.field3203;
            int n6 = class2792.field3200;
            int n7 = n5 - this.field3134.method6047();
            int n8 = n6 - this.field3134.method6049();
            this.field3147[n7][n8] = new class285(n5, n6, this.field3134.method6044(), this.field3142);
            this.field3147[n7][n8].method6107(class2792, this.field3134.field3271);
        }
        for (int i = 0; i < n3; ++i) {
            for (int j = 0; j < n4; ++j) {
                if (this.field3147[i][j] != null) continue;
                this.field3147[i][j] = new class285(this.field3134.method6047() + i, this.field3134.method6049() + j, this.field3134.method6044(), this.field3142);
                this.field3147[i][j].method6108(this.field3134.field3273, this.field3134.field3271);
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (class3912.method7781(class303.field3265.field3268, string)) {
            Object object = class3912.method7749(class303.field3265.field3268, string);
            this.field3137 = class395.method7878((byte[])object);
        }
        System.nanoTime();
        class3912.method7742();
        class3912.method7744();
        this.field3138 = true;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="540467084")
    public final void method6233() {
        this.field3136 = null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIIIIIIIS)V", garbageValue="227")
    public final void method6234(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9;
        int[] nArray = class566.field5546;
        int n10 = class566.field5542;
        int n11 = class566.field5543;
        float[] fArray = class566.field5544;
        int[] nArray2 = new int[4];
        class566.method10607(nArray2);
        class294 class2942 = this.method6269(n, n2, n3, n4);
        float f = this.method6243(n7 - n5, n3 - n);
        this.field3149 = n9 = (int)Math.ceil(f);
        if (!this.field3145.containsKey(n9)) {
            class306 class3062 = new class306(n9);
            class3062.method6505();
            this.field3145.put(n9, class3062);
        }
        int n12 = class2942.field3219 + class2942.field3216 - 1;
        int n13 = class2942.field3218 + class2942.field3217 - 1;
        int n14 = class2942.field3216;
        while (true) {
            int n15;
            if (n14 > n12) {
                class182.method4016(nArray, n10, n11, fArray);
                class566.method10649(nArray2);
                n14 = (int)(64.0f * f);
                n15 = this.field3143 * 4096 + n;
                int n16 = this.field3144 * 4096 + n2;
                int n17 = class2942.field3216;
                while (true) {
                    if (n17 >= class2942.field3216 + class2942.field3219) {
                        return;
                    }
                    for (int i = class2942.field3218; i < class2942.field3217 + class2942.field3218; ++i) {
                        this.field3147[n17][i].method6106(n5 + n14 * (this.field3147[n17][i].field3129 * 64 - n15) / 64, n8 - n14 * (this.field3147[n17][i].field3122 * 64 - n16 + 64) / 64, n14);
                    }
                    ++n17;
                }
            }
            for (n15 = class2942.field3218; n15 <= n13; ++n15) {
                this.field3147[n14][n15].method6115(n9, (class306)this.field3145.get(n9), this.field3132, this.field3140, this.field3141, 0.725);
            }
            ++n14;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V", garbageValue="64")
    public final void method6235(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, HashSet hashSet, HashSet hashSet2, int n9, int n10, boolean bl) {
        class294 class2942 = this.method6269(n, n2, n3, n4);
        float f = this.method6243(n7 - n5, n3 - n);
        int n11 = (int)(64.0f * f);
        int n12 = this.field3143 * 4096 + n;
        int n13 = this.field3144 * 4096 + n2;
        int n14 = class2942.field3216;
        while (true) {
            int n15;
            if (n14 >= class2942.field3219 + class2942.field3216) {
                if (hashSet2 != null && n9 > 0) {
                    for (n14 = class2942.field3216; n14 < class2942.field3219 + class2942.field3216; ++n14) {
                        for (n15 = class2942.field3218; n15 < class2942.field3218 + class2942.field3217; ++n15) {
                            this.field3147[n14][n15].method6140(hashSet2, n9, n10);
                        }
                    }
                }
                return;
            }
            for (n15 = class2942.field3218; n15 < class2942.field3218 + class2942.field3217; ++n15) {
                if (bl) {
                    this.field3147[n14][n15].method6142();
                }
                this.field3147[n14][n15].method6174(n5 + n11 * (this.field3147[n14][n15].field3129 * 64 - n12) / 64, n8 - n11 * (this.field3147[n14][n15].field3122 * 64 - n13 + 64) / 64, n11, hashSet);
            }
            ++n14;
        }
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IIIILjava/util/HashSet;III)V", garbageValue="312740054")
    public void method6236(int var1_1, int var2_2, int var3_3, int var4_4, HashSet var5_5, int var6_6, int var7_7) {
        if (this.field3137 != null) {
            this.field3137.method10802(var1_1, var2_2, var3_3, var4_4);
            if (var6_6 > 0 && var6_6 % var7_7 < var7_7 / 2) {
                if (this.field3136 == null) {
                    this.method6258();
                }
                var8_8 = var5_5.iterator();
                block0: while (true) {
                    if (!var8_8.hasNext()) {
                        return;
                    }
                    var9_9 = (Integer)var8_8.next();
                    var10_10 = (List)this.field3136.get(var9_9);
                    if (var10_10 == null) continue;
                    var11_11 = var10_10.iterator();
                    while (true) {
                        if (var11_11.hasNext()) ** break;
                        continue block0;
                        var12_12 = (class302)var11_11.next();
                        var13_13 = var3_3 * (var12_12.field3260.field3764 - this.field3143 * 4096) / (this.field3135 * 4096);
                        var14_14 = var4_4 - (var12_12.field3260.field3765 - this.field3144 * 4096) * var4_4 / (this.field3146 * 64);
                        class566.method10602(var13_13 + var1_1, var14_14 + var2_2, 2, 0xFFFF00, 256);
                    }
                    break;
                }
            }
            return;
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IIIIIIIIIII)Ljava/util/List;", garbageValue="1531797459")
    public List method6237(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        LinkedList linkedList = new LinkedList();
        if (this.field3138) {
            class294 class2942 = this.method6269(n, n2, n3, n4);
            float f = this.method6243(n7, n3 - n);
            int n11 = (int)(f * 64.0f);
            int n12 = this.field3143 * 4096 + n;
            int n13 = this.field3144 * 4096 + n2;
            int n14 = class2942.field3216;
            while (true) {
                if (n14 >= class2942.field3219 + class2942.field3216) {
                    return linkedList;
                }
                for (int i = class2942.field3218; i < class2942.field3218 + class2942.field3217; ++i) {
                    List list = this.field3147[n14][i].method6216(n5 + n11 * (this.field3147[n14][i].field3129 * 64 - n12) / 64, n8 + n6 - n11 * (this.field3147[n14][i].field3122 * 64 - n13 + 64) / 64, n11, n9, n10);
                    if (list.isEmpty()) continue;
                    linkedList.addAll(list);
                }
                ++n14;
            }
        }
        return linkedList;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IIIII)Lla;", garbageValue="1044915427")
    class294 method6269(int n, int n2, int n3, int n4) {
        class294 class2942 = new class294(this);
        int n5 = this.field3143 * 4096 + n;
        int n6 = this.field3144 * 4096 + n2;
        int n7 = n3 + this.field3143 * 4096;
        int n8 = this.field3144 * 4096 + n4;
        int n9 = n5 / 64;
        int n10 = n6 / 64;
        int n11 = n7 / 64;
        int n12 = n8 / 64;
        class2942.field3219 = n11 - n9 + 1;
        class2942.field3217 = n12 - n10 + 1;
        class2942.field3216 = n9 - this.field3134.method6047();
        class2942.field3218 = n10 - this.field3134.method6049();
        if (class2942.field3216 < 0) {
            class2942.field3219 += class2942.field3216;
            class2942.field3216 = 0;
        }
        if (class2942.field3216 > this.field3147.length - class2942.field3219) {
            class2942.field3219 = this.field3147.length - class2942.field3216;
        }
        if (class2942.field3218 < 0) {
            class2942.field3217 += class2942.field3218;
            class2942.field3218 = 0;
        }
        if (class2942.field3218 > this.field3147[0].length - class2942.field3217) {
            class2942.field3217 = this.field3147[0].length - class2942.field3218;
        }
        class2942.field3219 = Math.min(class2942.field3219, this.field3147.length);
        class2942.field3217 = Math.min(class2942.field3217, this.field3147[0].length);
        return class2942;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1170944951")
    public boolean method6239() {
        return this.field3138;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-124678418")
    public int method6240() {
        return this.field3134.method6045();
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(I)Ljava/util/HashMap;", garbageValue="-1053205519")
    public HashMap method6241() {
        this.method6258();
        return this.field3136;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-36")
    void method6258() {
        if (this.field3136 == null) {
            this.field3136 = new HashMap();
        }
        this.field3136.clear();
        int n = 0;
        while (n < this.field3147.length) {
            for (int i = 0; i < this.field3147[n].length; ++i) {
                List list = this.field3147[n][i].method6225();
                for (class302 class3022 : list) {
                    List<class302> list2;
                    if (!class3022.method6456()) continue;
                    int n2 = class3022.vmethod6438();
                    if (this.field3136.containsKey(n2)) {
                        list2 = (List)this.field3136.get(n2);
                        list2.add(class3022);
                        continue;
                    }
                    list2 = new LinkedList<class302>();
                    ((LinkedList)list2).add(class3022);
                    this.field3136.put(n2, list2);
                }
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(III)F", garbageValue="1398040002")
    float method6243(int n, int n2) {
        float f = (float)n / (float)n2;
        if (f > 8.0f) {
            return 8.0f;
        }
        if (f < 1.0f) {
            return 1.0f;
        }
        int n3 = Math.round(f);
        if (!(Math.abs((float)n3 - f) < 0.05f)) {
            return f;
        }
        return n3;
    }
}

