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

@ObfuscatedName(value="hg")
public class class183
extends class195 {
    @ObfuscatedName(value="ji")
    @ObfuscatedGetter(intValue=2009752845)
    static int field1966;
    @ObfuscatedName(value="kp")
    @ObfuscatedGetter(intValue=433204117)
    static int field1972;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-353137283)
    int field1964;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1352147805)
    int field1962;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-2132346569)
    int field1963;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1144738481)
    int field1974;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=1079699413)
    int field1965;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1738765779)
    int field1961;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1946329855)
    int field1967;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-184582315)
    int field1968;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-346578271)
    int field1969;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-531791061)
    int field1970;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=1754429917)
    int field1971;

    class183(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.field1964 = n;
        this.field1962 = n2;
        this.field1963 = n3;
        this.field1974 = n4;
        this.field1965 = n5;
        this.field1961 = class182.field1954[n4];
        this.field1967 = class182.field1955[n4];
        this.field1968 = class182.field1954[n5];
        this.field1969 = class182.field1955[n5];
        this.field1970 = n6;
        this.field1971 = n7;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lhs;IIIIJ)V")
    void vmethod4503(class190 class1902, int n, int n2, int n3, int n4, long l) {
        class1902.vmethod4616(n, this.field1974, this.field1965, n2, n3, n4, this.field1964, this.field1962, this.field1963, l, this.field1970, this.field1971, false);
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lhj;Lhz;IIII)V", garbageValue="54431755")
    void vmethod4504(class187 class1872, class201 class2012, int n, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8 = n7 = (n2 << 7) - this.field1964;
        int n9 = n6 = (n3 << 7) - this.field1963;
        int n10 = n5 = n8 + 128;
        int n11 = n4 = n9 + 128;
        int n12 = class1872.field2008[n][n2][n3] - this.field1962;
        int n13 = class1872.field2008[n][n2 + 1][n3] - this.field1962;
        int n14 = class1872.field2008[n][n2 + 1][n3 + 1] - this.field1962;
        int n15 = class1872.field2008[n][n2][n3 + 1] - this.field1962;
        int n16 = n9 * this.field1968 + n8 * this.field1969 >> 16;
        n9 = n9 * this.field1969 - n8 * this.field1968 >> 16;
        n8 = n16;
        n16 = n12 * this.field1967 - n9 * this.field1961 >> 16;
        n9 = n9 * this.field1967 + n12 * this.field1961 >> 16;
        n12 = n16;
        if (n9 < 50) {
            return;
        }
        n16 = n6 * this.field1968 + n10 * this.field1969 >> 16;
        n6 = n6 * this.field1969 - n10 * this.field1968 >> 16;
        n10 = n16;
        n16 = n13 * this.field1967 - n6 * this.field1961 >> 16;
        n6 = n6 * this.field1967 + n13 * this.field1961 >> 16;
        n13 = n16;
        if (n6 < 50) {
            return;
        }
        n16 = n5 * this.field1969 + n11 * this.field1968 >> 16;
        n11 = n11 * this.field1969 - n5 * this.field1968 >> 16;
        n5 = n16;
        n16 = n14 * this.field1967 - n11 * this.field1961 >> 16;
        n11 = n11 * this.field1967 + n14 * this.field1961 >> 16;
        n14 = n16;
        if (n11 < 50) {
            return;
        }
        n16 = n7 * this.field1969 + n4 * this.field1968 >> 16;
        n4 = n4 * this.field1969 - n7 * this.field1968 >> 16;
        n7 = n16;
        n16 = n15 * this.field1967 - n4 * this.field1961 >> 16;
        n4 = n4 * this.field1967 + n15 * this.field1961 >> 16;
        n15 = n16;
        if (n4 < 50) {
            return;
        }
        this.method4506(class1872, class2012, n2, n3, n8, n10, n5, n7, n12, n13, n14, n15, n9, n6, n11, n4);
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lhj;Lho;IIB)V", garbageValue="-59")
    void vmethod4516(class187 class1872, class196 class1962, int n, int n2) {
        int n3 = class1962.field2170.length;
        int n4 = 0;
        while (true) {
            if (n4 >= n3) {
                this.method4507(class1872, class1962, n, n2);
                return;
            }
            int n5 = class1962.field2170[n4] - this.field1964;
            int n6 = class1962.field2176[n4] - this.field1962;
            int n7 = class1962.field2160[n4] - this.field1963;
            int n8 = n7 * this.field1968 + n5 * this.field1969 >> 16;
            n7 = n7 * this.field1969 - n5 * this.field1968 >> 16;
            n5 = n8;
            n8 = n6 * this.field1967 - n7 * this.field1961 >> 16;
            n7 = n7 * this.field1967 + n6 * this.field1961 >> 16;
            n6 = n8;
            if (n7 < 50) {
                return;
            }
            if (class1962.field2167 != null) {
                class196.field2178[n4] = n5;
                class196.field2177[n4] = n6;
                class196.field2158[n4] = n7;
            }
            class196.field2173[n4] = class182.method4008() + n5 * class182.method4061() / n7;
            class196.field2159[n4] = class182.method4048() + n6 * class182.method4061() / n7;
            class196.field2174[n4] = class20.method298(n7);
            ++n4;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Lkd;", garbageValue="1793206579")
    public static HitSplatDef method4104(int n) {
        HitSplatDef class2602 = (HitSplatDef) HitSplatDef.field2753.method6578(n);
        if (class2602 != null) {
            return class2602;
        }
        byte[] byArray = HitSplatDef.field2778.method7790(32, n);
        class2602 = new HitSplatDef();
        if (byArray != null) {
            class2602.method5474(new class556(byArray));
        }
        HitSplatDef.field2753.method6590(class2602, n);
        return class2602;
    }
}

