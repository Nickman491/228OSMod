/*
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
extends Node {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-654168689)
    public int field1320;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lhj;")
    public class187 field1319;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="[Lku;")
    CollisionMap[] field1336 = new CollisionMap[4];
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
    public Player[] field1329 = new Player[2048];
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
    NodeDeque[][][] field1327;
    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="Lpm;")
    NodeDeque field1333 = new NodeDeque();
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lpm;")
    NodeDeque field1338 = new NodeDeque();
    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="Lpm;")
    NodeDeque field1339 = new NodeDeque();

    @ObfuscatedSignature(descriptor="(IIIILgs;)V")
    class103(int n, int n2, int n3, int n4, class175 class1752) {
        this.field1320 = n;
        this.field1322 = n2;
        this.field1323 = n3;
        this.field1327 = new NodeDeque[4][n2][n3];
        this.field1328 = new int[4][n2 + 1][n3 + 1];
        this.field1337 = new byte[4][n2][n3];
        this.field1326 = new int[n2][n3];
        int n5 = 0;
        while (true) {
            if (n5 >= 4) {
                this.field1319 = new class187(n, 4, n2, n3, n4, class1752, this.field1328);
                return;
            }
            this.field1336[n5] = new CollisionMap(n2, n3);
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
        this.field1338.clear();
        this.field1339.clear();
        this.field1333 = new NodeDeque();
        n = 0;
        while (true) {
            if (n >= 4) {
                this.field1319.method4309();
                n = 0;
                while (true) {
                    if (n >= 4) {
                        return;
                    }
                    this.field1336[n].clear();
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
        NodeDeque nodeDeque = class30.field131.field1327[n][n2][n3];
        if (nodeDeque == null) return;
        TileItem tileItem = (TileItem)nodeDeque.last();
        while (true) {
            block6: {
                block5: {
                    if (tileItem == null) break block5;
                    if ((n4 & Short.MAX_VALUE) != tileItem.id || n5 != tileItem.field1385) break block6;
                    tileItem.remove();
                }
                if (nodeDeque.last() == null) {
                    class30.field131.field1327[n][n2][n3] = null;
                }
                ByteArrayPool.method8927(n, n2, n3);
                return;
            }
            tileItem = (TileItem)nodeDeque.previous();
        }
    }
}

