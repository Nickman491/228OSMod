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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ki")
public class class285 {
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lmf;")
    public static class313 field3125 = new class313(0x2400000, 256);
    @ObfuscatedName(value="ik")
    @ObfuscatedGetter(longValue=-443869461595618329L)
    static long field3124;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1050432489)
    int field3129;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=653055413)
    int field3122;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lko;")
    class279 field3123;
    @ObfuscatedName(value="at")
    LinkedList field3120;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=1155673661)
    int field3127;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-373546867)
    int field3126;
    @ObfuscatedName(value="as")
    List field3128;
    @ObfuscatedName(value="aq")
    HashMap field3118;
    @ObfuscatedName(value="af")
    final HashMap field3131;

    class285(int n, int n2, int n3, HashMap hashMap) {
        this.field3129 = n;
        this.field3122 = n2;
        this.field3120 = new LinkedList();
        this.field3128 = new LinkedList();
        this.field3118 = new HashMap();
        this.field3127 = n3 | 0xFF000000;
        this.field3131 = hashMap;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIII)V", garbageValue="-1466626269")
    void method6106(int n, int n2, int n3) {
        int n4 = this.field3129;
        int n5 = this.field3122;
        int n6 = this.field3126;
        Object object = field3125;
        long l = n6 << 16 | n4 << 8 | n5;
        class570 class5702 = (class570)((class313)object).method6545(l);
        if ((object = class5702) == null) {
            return;
        }
        if (n3 != this.field3126 * 64) {
            ((class570)object).method10764(n, n2, n3, n3);
        } else {
            ((class570)object).method10741(n, n2);
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lko;Ljava/util/List;B)V", garbageValue="-60")
    void method6107(class279 class2792, List list) {
        this.field3118.clear();
        this.field3123 = class2792;
        this.method6122(list);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ljava/util/HashSet;Ljava/util/List;I)V", garbageValue="-588244452")
    void method6108(HashSet hashSet, List list) {
        this.field3118.clear();
        Iterator iterator = hashSet.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.method6122(list);
                return;
            }
            class287 class2872 = (class287)iterator.next();
            if (class2872.method6370() != this.field3129 || class2872.method6371() != this.field3122) continue;
            this.field3120.add(class2872);
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IIIILlu;I)V", garbageValue="-44209391")
    void method6109(int n, int n2, int n3, int n4, class293 class2932) {
        int n5 = n;
        while (n5 < n3 + n) {
            block1: for (int i = n2; i < n2 + n4; ++i) {
                for (int j = 0; j < class2932.field3202; ++j) {
                    class295[] class295Array = class2932.field3208[j][n5][i];
                    if (class295Array == null || class295Array.length == 0) continue;
                    class295[] class295Array2 = class295Array;
                    for (int k = 0; k < class295Array2.length; ++k) {
                        class295 class2952 = class295Array2[k];
                        ObjectDef class2622 = class142.method3512(class2952.field3224);
                        if (!class113.method3177(class2622)) continue;
                        this.method6110(class2622, j, n5, i, class2932);
                        continue block1;
                    }
                }
            }
            ++n5;
        }
        return;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lkl;IIILlu;I)V", garbageValue="-1610742956")
    void method6110(ObjectDef class2622, int n, int n2, int n3, class293 class2932) {
        class236 class2362;
        Object object;
        class350 class3502 = new class350(n, n2 + this.field3129 * 64, this.field3122 * 64 + n3);
        class350 class3503 = null;
        if (this.field3123 == null) {
            object = (class287)class2932;
            class3503 = new class350(n + ((class293)object).field3211, ((class293)object).field3204 * 64 + n2 + ((class287)object).method6276() * 8, n3 + ((class293)object).field3201 * 64 + ((class287)object).method6280() * 8);
        } else {
            class3503 = new class350(this.field3123.field3211 + n, n2 + this.field3123.field3204 * 64, n3 + this.field3123.field3201 * 64);
        }
        if (class2622.field2837 == null) {
            class2362 = class31.method498(class2622.field2817);
            object = new class290(class3503, class3502, class2362.field2522, this.method6176(class2362));
        } else {
            object = new class282(class3503, class3502, class2622.field2836, this);
        }
        class2362 = class31.method498(((class302)object).vmethod6438());
        if (class2362.field2533) {
            this.field3118.put(new class350(0, n2, n3), object);
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="517557938")
    void method6142() {
        Iterator iterator = this.field3118.values().iterator();
        while (iterator.hasNext()) {
            class302 class3022 = (class302)iterator.next();
            if (!(class3022 instanceof class282)) continue;
            ((class282)class3022).method5995();
        }
        return;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Ljava/util/List;I)V", garbageValue="-1162210322")
    void method6122(List list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            class290 class2902 = (class290)iterator.next();
            if (!class31.method498((int)class2902.field3171).field2533 || class2902.field3260.field3764 >> 6 != this.field3129 || class2902.field3260.field3765 >> 6 != this.field3122) continue;
            class290 class2903 = new class290(class2902.field3260, class2902.field3260, class2902.field3171, this.method6172(class2902.field3171));
            this.field3128.add(class2903);
        }
        return;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-1918")
    void method6113() {
        if (this.field3123 == null) {
            for (class287 class2872 : this.field3120) {
                class2872.method6365();
            }
        } else {
            this.field3123.method6365();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Lpq;B)Z", garbageValue="-69")
    boolean method6114(class391 class3912) {
        this.field3118.clear();
        if (this.field3123 == null) {
            boolean bl = true;
            Iterator iterator = this.field3120.iterator();
            while (true) {
                class287 class2872;
                if (!iterator.hasNext()) {
                    if (!bl) return bl;
                    iterator = this.field3120.iterator();
                    while (true) {
                        if (!iterator.hasNext()) {
                            return bl;
                        }
                        class2872 = (class287)iterator.next();
                        this.method6109(class2872.method6281() * 8, class2872.method6282() * 8, 8, 8, class2872);
                    }
                }
                class2872 = (class287)iterator.next();
                class2872.method6364(class3912);
                bl &= class2872.method6363();
            }
        }
        this.field3123.method6364(class3912);
        if (!this.field3123.method6363()) {
            return false;
        }
        this.method6109(0, 0, 64, 64, this.field3123);
        return true;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(ILlr;[Lvi;Lpq;Lpq;D)V")
    void method6115(int n, class306 class3062, class569[] class569Array, class391 class3912, class391 class3913, double d) {
        this.field3126 = n;
        if (this.field3123 == null && this.field3120.isEmpty()) {
            return;
        }
        class313 class3132 = field3125;
        int n2 = this.field3129;
        int n3 = this.field3122;
        long l = n << 16 | n2 << 8 | n3;
        class570 class5702 = (class570)class3132.method6545(l);
        if (class5702 == null) {
            if (class182.method4068() != d) {
                class182.method4004(d);
            }
            boolean bl = true;
            bl &= this.method6114(class3912);
            int n4 = this.field3123 == null ? ((class293)this.field3120.getFirst()).field3212 : this.field3123.field3212;
            if (!(bl &= class3913.method7732(n4))) {
                return;
            }
            byte[] byArray = class3913.method7735(n4);
            class296 class2962 = class344.method6934(byArray);
            class570 class5703 = new class570(this.field3126 * 64, this.field3126 * 64);
            class5703.method10734();
            if (this.field3123 == null) {
                this.method6119(class3062, class569Array, class2962);
            } else {
                this.method6227(class3062, class569Array, class2962);
            }
            int n5 = this.field3129;
            int n6 = this.field3122;
            int n7 = this.field3126;
            field3125.method6558(class5703, class87.method2606(n5, n6, n7), class5703.field5576.length * 4);
            this.method6113();
            return;
        }
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(IIILjava/util/HashSet;I)V", garbageValue="2069696355")
    void method6174(int n, int n2, int n3, HashSet hashSet) {
        if (hashSet == null) {
            hashSet = new HashSet();
        }
        this.method6180(n, n2, hashSet, n3);
        this.method6132(n, n2, hashSet, n3);
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Ljava/util/HashSet;III)V", garbageValue="-1584571433")
    void method6140(HashSet hashSet, int n, int n2) {
        Iterator iterator = this.field3118.values().iterator();
        while (true) {
            int n3;
            if (!iterator.hasNext()) {
                this.method6165(hashSet, n, n2);
                return;
            }
            class302 class3022 = (class302)iterator.next();
            if (!class3022.method6456() || !hashSet.contains(n3 = class3022.vmethod6438())) continue;
            class236 class2362 = class31.method498(n3);
            this.method6128(class2362, class3022.field3258, class3022.field3261, n, n2);
        }
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(Llr;[Lvi;Lld;I)V", garbageValue="24705389")
    void method6227(class306 class3062, class569[] class569Array, class296 class2962) {
        int n = 0;
        while (true) {
            int n2;
            if (n >= 64) {
                n = 0;
                while (true) {
                    if (n >= 64) {
                        return;
                    }
                    for (n2 = 0; n2 < 64; ++n2) {
                        this.method6120(n, n2, this.field3123, class3062, class569Array);
                    }
                    ++n;
                }
            }
            for (n2 = 0; n2 < 64; ++n2) {
                this.method6127(n, n2, this.field3123, class3062, class2962);
                this.method6209(n, n2, this.field3123, class3062);
            }
            ++n;
        }
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Llr;[Lvi;Lld;B)V", garbageValue="73")
    void method6119(class306 class3062, class569[] class569Array, class296 class2962) {
        Iterator iterator = this.field3120.iterator();
        block0: while (true) {
            int n;
            int n2;
            class287 class2872;
            if (!iterator.hasNext()) {
                iterator = this.field3120.iterator();
                block1: while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    class2872 = (class287)iterator.next();
                    n2 = class2872.method6281() * 8;
                    while (true) {
                        if (n2 >= class2872.method6281() * 8 + 8) continue block1;
                        for (n = class2872.method6282() * 8; n < class2872.method6282() * 8 + 8; ++n) {
                            this.method6120(n2, n, class2872, class3062, class569Array);
                        }
                        ++n2;
                    }
                    break;
                }
            }
            class2872 = (class287)iterator.next();
            n2 = class2872.method6281() * 8;
            while (true) {
                if (n2 >= class2872.method6281() * 8 + 8) continue block0;
                for (n = class2872.method6282() * 8; n < class2872.method6282() * 8 + 8; ++n) {
                    this.method6127(n2, n, class2872, class3062, class2962);
                    this.method6209(n2, n, class2872, class3062);
                }
                ++n2;
            }
            break;
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(IILlu;Llr;[Lvi;B)V", garbageValue="-56")
    void method6120(int n, int n2, class293 class2932, class306 class3062, class569[] class569Array) {
        this.method6175(n, n2, class2932);
        this.method6124(n, n2, class2932, class569Array);
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(IILlu;Llr;Lld;I)V", garbageValue="2099380889")
    void method6127(int n, int n2, class293 class2932, class306 class3062, class296 class2962) {
        int n3 = class2932.field3206[0][n][n2] - 1;
        int n4 = class2932.field3209[0][n][n2] - 1;
        if (n3 == -1 && n4 == -1) {
            class566.method10677(this.field3126 * n, this.field3126 * (63 - n2), this.field3126, this.field3126, this.field3127);
        }
        int n5 = 0xFF00FF;
        if (n4 != -1) {
            n5 = class31.method496(n4, this.field3127);
        }
        if (n4 > -1 && class2932.field3210[0][n][n2] == 0) {
            class566.method10677(this.field3126 * n, this.field3126 * (63 - n2), this.field3126, this.field3126, n5);
            return;
        }
        int n6 = this.method6123(n, n2, class2932, class2962);
        if (n4 != -1) {
            class3062.method6497(this.field3126 * n, this.field3126 * (63 - n2), n6, n5, this.field3126, this.field3126, class2932.field3210[0][n][n2], class2932.field3205[0][n][n2]);
            return;
        }
        class566.method10677(this.field3126 * n, this.field3126 * (63 - n2), this.field3126, this.field3126, n6);
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(IILlu;Llr;B)V", garbageValue="99")
    void method6209(int n, int n2, class293 class2932, class306 class3062) {
        int n3 = 1;
        while (n3 < class2932.field3202) {
            int n4 = class2932.field3209[n3][n][n2] - 1;
            if (n4 > -1) {
                int n5 = class31.method496(n4, this.field3127);
                if (class2932.field3210[n3][n][n2] != 0) {
                    class3062.method6497(this.field3126 * n, this.field3126 * (63 - n2), 0, n5, this.field3126, this.field3126, class2932.field3210[n3][n][n2], class2932.field3205[n3][n][n2]);
                } else {
                    class566.method10677(this.field3126 * n, this.field3126 * (63 - n2), this.field3126, this.field3126, n5);
                }
            }
            ++n3;
        }
        return;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(IILlu;Lld;I)I", garbageValue="125412595")
    int method6123(int n, int n2, class293 class2932, class296 class2962) {
        if (class2932.field3206[0][n][n2] != 0) {
            return class2962.method6394(n, n2);
        }
        return this.field3127;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(IILlu;[Lvi;I)V", garbageValue="1149870919")
    void method6124(int n, int n2, class293 class2932, class569[] class569Array) {
        int n3 = 0;
        while (n3 < class2932.field3202) {
            class295[] class295Array = class2932.field3208[n3][n][n2];
            if (class295Array != null && class295Array.length != 0) {
                class295[] class295Array2 = class295Array;
                for (int i = 0; i < class295Array2.length; ++i) {
                    boolean bl;
                    class295 class2952 = class295Array2[i];
                    int n4 = class2952.field3221;
                    boolean bl2 = bl = n4 >= class370.field4086.field4087 && n4 <= class370.field4082.field4087;
                    if (!bl && !class228.method5106(class2952.field3221)) continue;
                    ObjectDef class2622 = class142.method3512(class2952.field3224);
                    if (class2622.field2818 == -1) continue;
                    int n5 = class2952.field3222 != 1 && class2952.field3222 != 3 ? class2622.field2805 : class2622.field2804;
                    class569Array[class2622.field2818].method10712(this.field3126 * n, this.field3126 * (64 - n5 - n2), this.field3126 * 2, this.field3126 * 2);
                }
            }
            ++n3;
        }
        return;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(IILlu;I)V", garbageValue="820260147")
    void method6175(int n, int n2, class293 class2932) {
        int n3 = 0;
        while (n3 < class2932.field3202) {
            class295[] class295Array = class2932.field3208[n3][n][n2];
            if (class295Array != null && class295Array.length != 0) {
                class295[] class295Array2 = class295Array;
                for (int i = 0; i < class295Array2.length; ++i) {
                    int n4;
                    int n5;
                    class295 class2952 = class295Array2[i];
                    if (!class100.method2833(class2952.field3221)) continue;
                    ObjectDef class2622 = class142.method3512(class2952.field3224);
                    int n6 = n5 = class2622.field2833 != 0 ? -3407872 : -3355444;
                    if (class2952.field3221 == class370.field4074.field4087) {
                        this.method6139(n, n2, class2952.field3222, n5);
                    }
                    if (class2952.field3221 == class370.field4070.field4087) {
                        this.method6139(n, n2, class2952.field3222, -3355444);
                        this.method6139(n, n2, class2952.field3222 + 1, n5);
                    }
                    if (class2952.field3221 == class370.field4068.field4087) {
                        if (class2952.field3222 == 0) {
                            class566.method10619(this.field3126 * n, this.field3126 * (63 - n2), 1, n5);
                        }
                        if (class2952.field3222 == 1) {
                            class566.method10619(this.field3126 + this.field3126 * n - 1, this.field3126 * (63 - n2), 1, n5);
                        }
                        if (class2952.field3222 == 2) {
                            class566.method10619(this.field3126 + this.field3126 * n - 1, this.field3126 * (63 - n2) + this.field3126 - 1, 1, n5);
                        }
                        if (class2952.field3222 == 3) {
                            class566.method10619(this.field3126 * n, this.field3126 * (63 - n2) + this.field3126 - 1, 1, n5);
                        }
                    }
                    if (class2952.field3221 != class370.field4066.field4087) continue;
                    int n7 = class2952.field3222 % 2;
                    if (n7 != 0) {
                        for (n4 = 0; n4 < this.field3126; ++n4) {
                            class566.method10619(n4 + this.field3126 * n, n4 + this.field3126 * (63 - n2), 1, n5);
                        }
                        continue;
                    }
                    for (n4 = 0; n4 < this.field3126; ++n4) {
                        class566.method10619(n4 + this.field3126 * n, (64 - n2) * this.field3126 - 1 - n4, 1, n5);
                    }
                }
            }
            ++n3;
        }
        return;
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(IILjava/util/HashSet;II)V", garbageValue="837362733")
    void method6180(int n, int n2, HashSet hashSet, int n3) {
        float f = (float)n3 / 64.0f;
        float f2 = f / 2.0f;
        Iterator iterator = this.field3118.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            class350 class3502 = (class350)entry.getKey();
            int n4 = (int)((float)n + (float)class3502.field3764 * f - f2);
            int n5 = (int)((float)(n2 + n3) - f * (float)class3502.field3765 - f2);
            class302 class3022 = (class302)entry.getValue();
            if (class3022 == null || !class3022.method6456()) continue;
            class3022.field3258 = n4;
            class3022.field3261 = n5;
            class236 class2362 = class31.method498(class3022.vmethod6438());
            if (hashSet.contains(class2362.method5172())) continue;
            this.method6129(class3022, n4, n5, f);
        }
        return;
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(Ljava/util/HashSet;III)V", garbageValue="-98224507")
    void method6165(HashSet hashSet, int n, int n2) {
        Iterator iterator = this.field3128.iterator();
        while (iterator.hasNext()) {
            class236 class2362;
            class302 class3022 = (class302)iterator.next();
            if (!class3022.method6456() || (class2362 = class31.method498(class3022.vmethod6438())) == null || !hashSet.contains(class2362.method5172())) continue;
            this.method6128(class2362, class3022.field3258, class3022.field3261, n, n2);
        }
        return;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(Ljm;IIIIB)V", garbageValue="81")
    void method6128(class236 class2362, int n, int n2, int n3, int n4) {
        class570 class5702 = class2362.method5167(false);
        if (class5702 != null) {
            class5702.method10774(n - class5702.field5570 / 2, n2 - class5702.field5571 / 2);
            if (n3 % n4 < n4 / 2) {
                class566.method10602(n, n2, 15, 0xFFFF00, 128);
                class566.method10602(n, n2, 7, 0xFFFFFF, 256);
            }
            return;
        }
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(Lly;IIFI)V", garbageValue="-1797725706")
    void method6129(class302 class3022, int n, int n2, float f) {
        class236 class2362 = class31.method498(class3022.vmethod6438());
        this.method6116(class2362, n, n2);
        this.method6131(class3022, class2362, n, n2, f);
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Ljm;III)V", garbageValue="-1315466009")
    void method6116(class236 class2362, int n, int n2) {
        class570 class5702 = class2362.method5167(false);
        if (class5702 != null) {
            int n3 = this.method6133(class5702, class2362.field2524);
            int n4 = this.method6134(class5702, class2362.field2539);
            class5702.method10774(n3 + n, n2 + n4);
        }
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(Lly;Ljm;IIFB)V", garbageValue="0")
    void method6131(class302 class3022, class236 class2362, int n, int n2, float f) {
        class297 class2972 = class3022.vmethod6439();
        if (class2972 != null) {
            if (class2972.field3232.method5991(f)) {
                class435 class4352 = (class435)this.field3131.get(class2972.field3232);
                class4352.method8687(class2972.field3235, n - class2972.field3233 / 2, n2, class2972.field3233, class2972.field3234, 0xFF000000 | class2362.field2540, 0, 1, 0, class4352.field4832 / 2);
                return;
            }
            return;
        }
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(IILjava/util/HashSet;IB)V", garbageValue="97")
    void method6132(int n, int n2, HashSet hashSet, int n3) {
        float f = (float)n3 / 64.0f;
        Iterator iterator = this.field3128.iterator();
        while (iterator.hasNext()) {
            class302 class3022 = (class302)iterator.next();
            if (!class3022.method6456()) continue;
            int n4 = class3022.field3260.field3764 % 64;
            int n5 = class3022.field3260.field3765 % 64;
            class3022.field3258 = (int)((float)n + f * (float)n4);
            class3022.field3261 = (int)((float)n2 + (float)(63 - n5) * f);
            if (hashSet.contains(class3022.vmethod6438())) continue;
            this.method6129(class3022, class3022.field3258, class3022.field3261, f);
        }
        return;
    }

    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="(Lvf;Ljt;I)I", garbageValue="949804228")
    int method6133(class570 class5702, class245 class2452) {
        switch (class2452.field2606) {
            case 0: {
                return -class5702.field5570 / 2;
            }
            case 2: {
                return 0;
            }
        }
        return -class5702.field5570;
    }

    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="(Lvf;Ljk;I)I", garbageValue="-497738492")
    int method6134(class570 class5702, class249 class2492) {
        switch (class2492.field2671) {
            case 1: {
                return -class5702.field5571 / 2;
            }
            case 2: {
                return 0;
            }
        }
        return -class5702.field5571;
    }

    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(II)Lli;", garbageValue="-633165647")
    class297 method6172(int n) {
        class236 class2362 = class31.method498(n);
        return this.method6176(class2362);
    }

    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="(Ljm;B)Lli;", garbageValue="87")
    class297 method6176(class236 class2362) {
        if (class2362.field2525 != null && this.field3131 != null && this.field3131.get(class281.field3076) != null) {
            class281 class2812 = class281.method5992(class2362.field2527);
            if (class2812 != null) {
                class435 class4352 = (class435)this.field3131.get(class2812);
                if (class4352 != null) {
                    int n = class4352.method8680(class2362.field2525, 1000000);
                    String[] stringArray = new String[n];
                    class4352.method8678(class2362.field2525, null, stringArray);
                    int n2 = stringArray.length * class4352.field4832 / 2;
                    int n3 = 0;
                    String[] stringArray2 = stringArray;
                    int n4 = 0;
                    while (true) {
                        if (n4 >= stringArray2.length) {
                            return new class297(class2362.field2525, n3, n2, class2812);
                        }
                        String string = stringArray2[n4];
                        int n5 = class4352.method8682(string);
                        if (n5 > n3) {
                            n3 = n5;
                        }
                        ++n4;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @ObfuscatedName(value="bz")
    @ObfuscatedSignature(descriptor="(IIIIII)Ljava/util/List;", garbageValue="1263967352")
    List method6216(int n, int n2, int n3, int n4, int n5) {
        LinkedList<class302> linkedList = new LinkedList<class302>();
        if (n4 >= n && n5 >= n2) {
            if (n4 < n3 + n && n5 < n3 + n2) {
                Iterator<Object> iterator = this.field3118.values().iterator();
                while (true) {
                    class302 class3022;
                    if (!iterator.hasNext()) {
                        iterator = this.field3128.iterator();
                        while (true) {
                            if (!iterator.hasNext()) {
                                return linkedList;
                            }
                            class3022 = (class302)iterator.next();
                            if (!class3022.method6456() || !class3022.method6437(n4, n5)) continue;
                            linkedList.add(class3022);
                        }
                    }
                    class3022 = (class302)iterator.next();
                    if (!class3022.method6456() || !class3022.method6437(n4, n5)) continue;
                    linkedList.add(class3022);
                }
            }
            return linkedList;
        }
        return linkedList;
    }

    @ObfuscatedName(value="bt")
    @ObfuscatedSignature(descriptor="(I)Ljava/util/List;", garbageValue="1286016129")
    List method6225() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.field3128);
        linkedList.addAll(this.field3118.values());
        return linkedList;
    }

    @ObfuscatedName(value="bf")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="0")
    void method6139(int n, int n2, int n3, int n4) {
        if ((n3 %= 4) == 0) {
            class566.method10621(this.field3126 * n, this.field3126 * (63 - n2), this.field3126, n4);
        }
        if (n3 == 1) {
            class566.method10619(this.field3126 * n, this.field3126 * (63 - n2), this.field3126, n4);
        }
        if (n3 == 2) {
            class566.method10621(this.field3126 * n + this.field3126 - 1, this.field3126 * (63 - n2), this.field3126, n4);
        }
        if (n3 == 3) {
            class566.method10619(this.field3126 * n, this.field3126 * (63 - n2) + this.field3126 - 1, this.field3126, n4);
        }
    }
}

