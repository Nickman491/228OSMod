package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bm")
public class class37
extends class514 {
    @ObfuscatedName(value="ho")
    static SecureRandom field228;
    @ObfuscatedName(value="vi")
    @ObfuscatedSignature(descriptor="Lsh;")
    static class490 field227;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1508244125)
    int field220;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1413258665)
    int field221;
    @ObfuscatedName(value="az")
    int[] field222;
    @ObfuscatedName(value="ao")
    int[] field230;
    @ObfuscatedName(value="ad")
    Field[] field224;
    @ObfuscatedName(value="an")
    int[] field229;
    @ObfuscatedName(value="ae")
    Method[] field226;
    @ObfuscatedName(value="ax")
    byte[][][] field223;

    class37() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)J", garbageValue="-373546867")
    public static final synchronized long method724() {
        long l = System.currentTimeMillis();
        if (l < class329.field3607) {
            class319.field3313 += class329.field3607 - l;
        }
        class329.field3607 = l;
        return class319.field3313 + l;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Lna;I[B[BI)V", garbageValue="1806582189")
    static final void method725(class361 class3612, int n, byte[] byArray, byte[] byArray2) {
        if (class3612.field3861 == null) {
            if (byArray == null) {
                return;
            }
            class3612.field3861 = new byte[11][];
            class3612.field3952 = new byte[11][];
            class3612.field3964 = new int[11];
            class3612.field3864 = new int[11];
        }
        class3612.field3861[n] = byArray;
        if (byArray != null) {
            class3612.field3950 = true;
        } else {
            class3612.field3950 = false;
            for (int i = 0; i < class3612.field3861.length; ++i) {
                if (class3612.field3861[i] == null) {
                    continue;
                }
                class3612.field3950 = true;
                break;
            }
        }
        class3612.field3952[n] = byArray2;
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-236178595")
    static int method726(int n, class81 class812, boolean bl) {
        block19: {
            int n2;
            block20: {
                if (n == 3400) break block19;
                if (n != 3408) {
                    if (n != 3411) {
                        return 2;
                    }
                    int n3 = class72.field865[--class63.field444];
                    class242 class2422 = class200.method4707(n3);
                    class72.field865[++class63.field444 - 1] = class2422.method5266();
                    return 1;
                }
                int n4 = class72.field865[class63.field444 -= 4];
                n2 = class72.field865[class63.field444 + 1];
                int n5 = class72.field865[class63.field444 + 2];
                int n6 = class72.field865[class63.field444 + 3];
                class242 class2423 = class200.method4707(n5);
                if (n4 != class2423.field2587 || n2 != class2423.field2589) break block20;
                int n7 = 0;
                while (true) {
                    block22: {
                        block21: {
                            if (n7 >= class2423.field2592) break block21;
                            if (n6 != class2423.field2593[n7]) break block22;
                            if (n2 == 115) {
                                class72.field855[++class104.field1343 - 1] = class2423.field2595[n7];
                            } else {
                                class72.field865[++class63.field444 - 1] = class2423.field2594[n7];
                            }
                            class2423 = null;
                        }
                        if (class2423 != null) {
                            if (n2 == 115) {
                                class72.field855[++class104.field1343 - 1] = class2423.field2591;
                            } else {
                                class72.field865[++class63.field444 - 1] = class2423.field2586;
                            }
                        }
                        return 1;
                    }
                    ++n7;
                }
            }
            if (n2 == 115) {
                class72.field855[++class104.field1343 - 1] = "null";
            } else {
                class72.field865[++class63.field444 - 1] = 0;
            }
            return 1;
        }
        int n8 = class72.field865[class63.field444 -= 2];
        int n9 = class72.field865[class63.field444 + 1];
        class242 class2424 = class200.method4707(n8);
        if (class2424.field2589 != 's') {
            // empty if block
        }
        int n10 = 0;
        while (true) {
            block24: {
                block23: {
                    if (n10 >= class2424.field2592) break block23;
                    if (n9 != class2424.field2593[n10]) break block24;
                    class72.field855[++class104.field1343 - 1] = class2424.field2595[n10];
                    class2424 = null;
                }
                if (class2424 != null) {
                    class72.field855[++class104.field1343 - 1] = class2424.field2591;
                }
                return 1;
            }
            ++n10;
        }
    }
}

