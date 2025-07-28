/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="sp")
public abstract class class482 {
    class482() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lks;Lsm;II)V", garbageValue="-1318895003")
    abstract void vmethod9368(class274 var1, class481 var2, int var3);

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lks;IIB)Z", garbageValue="-65")
    abstract boolean vmethod9369(class274 var1, int var2, int var3);

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="1212488341")
    abstract void vmethod9367(int var1, int var2);

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ji")
    @ObfuscatedSignature(descriptor="(IIIIISISIIB)V", garbageValue="-103")
    static void method9366(int n, int n2, int n3, int n4, int n5, short s, int n6, short s2, int n7, int n8) {
        NodeDeque nodeDeque = class30.field131.field1327[n][n2][n3];
        if (nodeDeque == null) return;
        TileItem tileItem = (TileItem)nodeDeque.last();
        while (true) {
            block9: {
                block8: {
                    if (tileItem == null) break block8;
                    if ((n4 & Short.MAX_VALUE) != tileItem.id || n5 != tileItem.field1385) break block9;
                    class228 class2282 = tileItem.method3105();
                    if (class2282 == null) {
                        class2282 = new class228(n4);
                    }
                    if (class2282.method5081() && n6 > -1 && n6 < class2282.field2479.length) {
                        class2282.field2479[n6] = s;
                    }
                    if (class2282.method5082() && n7 > -1 && n7 < class2282.field2477.length) {
                        class2282.field2477[n7] = s2;
                    }
                    if (n8 > -1) {
                        class2282.field2474 = n8;
                        class2282.field2483 = null;
                    }
                    tileItem.method3104(class2282);
                }
                ByteArrayPool.method8927(n, n2, n3);
                return;
            }
            tileItem = (TileItem)nodeDeque.previous();
        }
    }
}

