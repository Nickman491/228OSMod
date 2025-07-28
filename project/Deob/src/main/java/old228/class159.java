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

@ObfuscatedName(value="gc")
public class class159
extends class150 {
    @ObfuscatedName(value="kf")
    @ObfuscatedGetter(intValue=340683139)
    static int field1730;
    @ObfuscatedName(value="ay")
    String field1728;
    @ObfuscatedSignature(descriptor="Lfv;")
    final /* synthetic */ class153 this$0;

    @ObfuscatedSignature(descriptor="(Lfv;)V")
    class159(class153 class1532) {
        this.this$0 = class1532;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1355269794")
    void vmethod3879(class556 class5562) {
        this.field1728 = class5562.method10290();
        class5562.method10440();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgq;B)V", garbageValue="0")
    void vmethod3882(class161 class1612) {
        class1612.field1739 = this.field1728;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="([Lcx;II[I[IB)V", garbageValue="-55")
    static void method3676(class69[] class69Array, int n, int n2, int[] nArray, int[] nArray2) {
        if (n >= n2) return;
        int n3 = n - 1;
        int n4 = n2 + 1;
        int n5 = (n2 + n) / 2;
        class69 class692 = class69Array[n5];
        class69Array[n5] = class69Array[n];
        class69Array[n] = class692;
        block0: while (true) {
            if (n3 >= n4) {
                class159.method3676(class69Array, n, n4, nArray, nArray2);
                class159.method3676(class69Array, n4 + 1, n2, nArray, nArray2);
                return;
            }
            boolean bl = true;
            block1: while (true) {
                --n4;
                int n6 = 0;
                while (true) {
                    block31: {
                        int n7;
                        int n8;
                        block30: {
                            if (n6 >= 4) break block30;
                            if (nArray[n6] != 2) {
                                if (nArray[n6] != 1) {
                                    if (nArray[n6] != 3) {
                                        n8 = class69Array[n4].field812;
                                        n7 = class692.field812;
                                    } else {
                                        n8 = class69Array[n4].method1958() ? 1 : 0;
                                        n7 = class692.method1958() ? 1 : 0;
                                    }
                                } else {
                                    n8 = class69Array[n4].field814;
                                    n7 = class692.field814;
                                    if (n8 == -1 && nArray2[n6] == 1) {
                                        n8 = 2001;
                                    }
                                    if (n7 == -1 && nArray2[n6] == 1) {
                                        n7 = 2001;
                                    }
                                }
                            } else {
                                n8 = class69Array[n4].field818;
                                n7 = class692.field818;
                            }
                            if (n8 == n7) break block31;
                            if (!(nArray2[n6] == 1 && n8 > n7 || nArray2[n6] == 0 && n8 < n7)) {
                                bl = false;
                            }
                        }
                        if (bl) continue block1;
                        bl = true;
                        block3: while (true) {
                            ++n3;
                            n6 = 0;
                            while (true) {
                                block33: {
                                    block32: {
                                        if (n6 >= 4) break block32;
                                        if (nArray[n6] != 2) {
                                            if (nArray[n6] != 1) {
                                                if (nArray[n6] != 3) {
                                                    n8 = class69Array[n3].field812;
                                                    n7 = class692.field812;
                                                } else {
                                                    n8 = class69Array[n3].method1958() ? 1 : 0;
                                                    n7 = class692.method1958() ? 1 : 0;
                                                }
                                            } else {
                                                n8 = class69Array[n3].field814;
                                                n7 = class692.field814;
                                                if (n8 == -1 && nArray2[n6] == 1) {
                                                    n8 = 2001;
                                                }
                                                if (n7 == -1 && nArray2[n6] == 1) {
                                                    n7 = 2001;
                                                }
                                            }
                                        } else {
                                            n8 = class69Array[n3].field818;
                                            n7 = class692.field818;
                                        }
                                        if (n8 == n7) break block33;
                                        if (!(nArray2[n6] == 1 && n8 < n7 || nArray2[n6] == 0 && n8 > n7)) {
                                            bl = false;
                                        }
                                    }
                                    if (bl) continue block3;
                                    if (n3 >= n4) continue block0;
                                    class69 class693 = class69Array[n3];
                                    class69Array[n3] = class69Array[n4];
                                    class69Array[n4] = class693;
                                    continue block0;
                                }
                                if (n6 == 3) {
                                    bl = false;
                                }
                                ++n6;
                            }
                            break;
                        }
                    }
                    if (n6 == 3) {
                        bl = false;
                    }
                    ++n6;
                }
                break;
            }
            break;
        }
    }
}

