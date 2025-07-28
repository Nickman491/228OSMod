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

@ObfuscatedName(value="dz")
public class class103
extends class514 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-654168689)
    public int field1320;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lhj;")
    public class187 field1319;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="[Lku;")
    class270[] field1336 = new class270[4];
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=2049252501)
    public int field1321;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1436000011)
    public int field1322;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=780525675)
    public int field1323;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1670285575)
    int field1324;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1186505997)
    int field1325;
    @ObfuscatedName(value="at")
    int[][] field1326;
    @ObfuscatedName(value="ac")
    int[][][] field1328;
    @ObfuscatedName(value="au")
    byte[][][] field1337;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="[Ldx;")
    public class94[] field1329 = new class94[2048];
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="[Leq;")
    public class105[] field1330 = new class105[65536];
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=1239693991)
    int field1331;
    @ObfuscatedName(value="aa")
    int[] field1332 = new int[65536];
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="[Lsg;")
    class480[] field1318 = new class480[2048];
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-1859119109)
    int field1334;
    @ObfuscatedName(value="av")
    int[] field1335 = new int[2048];
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="[[[Lpm;")
    class410[][][] field1327;
    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="Lpm;")
    class410 field1333 = new class410();
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lpm;")
    class410 field1338 = new class410();
    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="Lpm;")
    class410 field1339 = new class410();

    @ObfuscatedSignature(descriptor="(IIIILgs;)V")
    class103(int n, int n2, int n3, int n4, class175 class1752) {
        this.field1320 = n;
        this.field1322 = n2;
        this.field1323 = n3;
        this.field1327 = new class410[4][n2][n3];
        this.field1328 = new int[4][n2 + 1][n3 + 1];
        this.field1337 = new byte[4][n2][n3];
        this.field1326 = new int[n2][n3];
        int n5 = 0;
        while (true) {
            if (n5 >= 4) {
                this.field1319 = new class187(n, 4, n2, n3, n4, class1752, this.field1328);
                return;
            }
            this.field1336[n5] = new class270(n2, n3);
            ++n5;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1808821499")
    void method2991() {
        int n;
        this.field1331 = 0;
        this.field1334 = 0;
        for (n = 0; n < 2048; ++n) {
            this.field1329[n] = null;
        }
        for (n = 0; n < 65536; ++n) {
            this.field1330[n] = null;
        }
        for (n = 0; n < 2048; ++n) {
            this.field1318[n] = null;
        }
        this.field1338.method8013();
        this.field1339.method8013();
        this.field1333 = new class410();
        n = 0;
        while (true) {
            if (n >= 4) {
                this.field1319.method4309();
                n = 0;
                while (true) {
                    if (n >= 4) {
                        return;
                    }
                    this.field1336[n].method5800();
                    ++n;
                }
            }
            for (int i = 0; i < this.field1322; ++i) {
                for (int j = 0; j < this.field1323; ++j) {
                    this.field1327[n][i][j] = null;
                }
            }
            ++n;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1597512398")
    void method2992() {
        int n;
        for (n = 0; n < 2048; ++n) {
            this.field1329[n] = null;
        }
        n = 0;
        while (n < this.field1330.length) {
            class105 class1052 = this.field1330[n];
            if (class1052 != null) {
                class1052.field1230 = -1;
                class1052.field1236 = false;
            }
            ++n;
        }
        return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="jf")
    @ObfuscatedSignature(descriptor="(IIIIIS)V", garbageValue="128")
    static void method2997(int n, int n2, int n3, int n4, int n5) {
        class410 class4102 = class30.field131.field1327[n][n2][n3];
        if (class4102 == null) return;
        class109 class1092 = (class109)class4102.method7996();
        while (true) {
            block6: {
                block5: {
                    if (class1092 == null) break block5;
                    if ((n4 & Short.MAX_VALUE) != class1092.field1389 || n5 != class1092.field1385) break block6;
                    class1092.method9623();
                }
                if (class4102.method7996() == null) {
                    class30.field131.field1327[n][n2][n3] = null;
                }
                class453.method8927(n, n2, n3);
                return;
            }
            class1092 = (class109)class4102.method8005();
        }
    }
}

