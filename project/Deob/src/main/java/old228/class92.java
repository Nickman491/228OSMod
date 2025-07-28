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

@ObfuscatedName(value="dw")
public class class92
extends Enum
implements MouseWheel {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ldw;")
    static final /* enum */ class92 field1108 = new class92("runelite", 0, 0, -1);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ldw;")
    static final /* enum */ class92 field1102 = new class92("runelite", 1, 1, 1);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Ldw;")
    static final /* enum */ class92 field1099 = new class92("runelite", 2, 2, 7);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Ldw;")
    static final /* enum */ class92 field1100 = new class92("runelite", 3, 3, 8);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Ldw;")
    static final /* enum */ class92 field1097 = new class92("runelite", 4, 4, 9);
    @ObfuscatedName(value="jn")
    static int[] field1101;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1023890417)
    final int field1107;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=532784169)
    final int field1098;

    /*
     * WARNING - void declaration
     */
    class92() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.field1107 = var3_1;
        this.field1098 = var4_2;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    public int vmethod10703() {
        return this.field1098;
    }

    @ObfuscatedName(value="ah")
    public static String method2641(long l) {
        if (l > 0L && l < 6582952005840035281L) {
            if (l % 37L == 0L) {
                return null;
            }
            int n = 0;
            long l2 = l;
            while (true) {
                if (l2 == 0L) {
                    StringBuilder stringBuilder = new StringBuilder(n);
                    while (true) {
                        if (0L == l) {
                            return stringBuilder.reverse().toString();
                        }
                        long l3 = l;
                        stringBuilder.append(class421.field4727[(int)(l3 - 37L * (l /= 37L))]);
                    }
                }
                ++n;
                l2 /= 37L;
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Ldz;[BIIIIIIIIIB)V", garbageValue="29")
    static final void method2646(class103 class1032, byte[] byArray, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        int n10;
        class270[] class270Array = class1032.field1336;
        if (class270Array != null) {
            for (int i = 0; i < 8; ++i) {
                for (n10 = 0; n10 < 8; ++n10) {
                    if (n2 + i <= 0 || n2 + i >= class270Array[n].field3003.length || n10 + n3 <= 0 || n10 + n3 >= class270Array[n].field3003[n2 + i].length) continue;
                    int[] nArray = class270Array[n].field3003[n2 + i];
                    int n11 = n10 + n3;
                    nArray[n11] = nArray[n11] & 0xBFFFFFFF;
                }
            }
        }
        class556 class5562 = new class556(byArray);
        n10 = 0;
        block2: while (n10 < 4) {
            int n12 = 0;
            while (true) {
                if (n12 < 64) {
                } else {
                    ++n10;
                    continue block2;
                }
                for (int i = 0; i < 64; ++i) {
                    if (n4 == n10 && n12 >= n5 && n12 < n5 + 8 && i >= n6 && i < n6 + 8) {
                        int n13 = n2;
                        int n14 = n12 & 7;
                        int n15 = i & 7;
                        int n16 = n7;
                        int n17 = (n16 &= 3) == 0 ? n14 : (n16 == 1 ? n15 : (n16 == 2 ? 7 - n14 : 7 - n15));
                        int n18 = n13 + n17;
                        int n19 = n3;
                        int n20 = n12 & 7;
                        int n21 = i & 7;
                        int n22 = n7;
                        int n23 = (n22 &= 3) == 0 ? n21 : (n22 == 1 ? 7 - n20 : (n22 == 2 ? 7 - n21 : n20));
                        int n24 = n23 + n19;
                        int n25 = n2 + (n12 & 7) + n8;
                        int n26 = n9 + (i & 7) + n3;
                        class28.method454(class1032, class5562, n, n18, n24, n25, n26, n7);
                        continue;
                    }
                    class28.method454(class1032, class5562, 0, -1, -1, 0, 0, 0);
                }
                ++n12;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="gs")
    @ObfuscatedSignature(descriptor="(IZZZZI)Lok;", garbageValue="2090910213")
    static class388 method2644(int n, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        class490 class4902 = null;
        if (class216.field2393 != null) {
            class4902 = new class490(n, class216.field2393, class121.field1484[n], 1000000);
        }
        return new class388(class4902, class37.field227, HitSplatDef.field2760, n, bl, bl2, bl3, bl4, false);
    }

    @ObfuscatedName(value="hj")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="686864867")
    static final void method2637() {
        class238.field2562 = null;
        class238.field2554 = null;
        class238.field2550 = 0;
    }

    @ObfuscatedName(value="hm")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="5")
    static final void method2645() {
        class374.method7623(class245.field2603, class42.field275, class27.field118);
        class74.method2358(class70.field830, class340.field3703);
        if (class478.field5017 == class245.field2603 && class42.field275 == class64.field459 && class27.field118 == class31.field140 && class70.field830 == class159.field1730 && class183.field1972 == class340.field3703) {
            client.field762 = false;
            client.field797 = false;
            client.field669 = false;
            client.field757 = false;
            class280.field3067 = 0;
            client.field801 = 0;
            class416.field4710 = 0;
            class383.field4491 = 0;
            class505.field5142 = 0;
            class544.field5398 = 0;
            class292.field3187 = 0;
            class101.field1293 = 0;
            class305.field3274 = 0;
            class95.field1167 = 0;
            client.field657 = null;
            client.field761 = null;
            client.field725 = null;
        }
    }
}

