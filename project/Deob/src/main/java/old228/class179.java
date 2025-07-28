package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gh")
public class class179
extends class514 {
    @ObfuscatedName(value="aa")
    static int[] field1916;
    @ObfuscatedName(value="ad")
    int field1906;
    @ObfuscatedName(value="an")
    boolean field1907;
    @ObfuscatedName(value="ae")
    int[] field1908;
    @ObfuscatedName(value="ax")
    int[] field1909;
    @ObfuscatedName(value="at")
    int[] field1905;
    @ObfuscatedName(value="ac")
    int[] field1911;
    @ObfuscatedName(value="au")
    int field1903;
    @ObfuscatedName(value="as")
    int field1913;
    @ObfuscatedName(value="aq")
    int[] field1910;
    @ObfuscatedName(value="af")
    boolean field1915 = false;

    @ObfuscatedSignature(descriptor="(Lvy;)V")
    class179(class556 class5562) {
        this.field1906 = class5562.method10307();
        this.field1907 = class5562.method10282() == 1;
        int n = class5562.method10282();
        if (n >= 1 && n <= 4) {
            int n2;
            this.field1908 = new int[n];
            for (n2 = 0; n2 < n; ++n2) {
                this.field1908[n2] = class5562.method10307();
            }
            if (n > 1) {
                this.field1909 = new int[n - 1];
                for (n2 = 0; n2 < n - 1; ++n2) {
                    this.field1909[n2] = class5562.method10282();
                }
            }
            if (n > 1) {
                this.field1905 = new int[n - 1];
                for (n2 = 0; n2 < n - 1; ++n2) {
                    this.field1905[n2] = class5562.method10282();
                }
            }
            this.field1911 = new int[n];
            for (n2 = 0; n2 < n; ++n2) {
                this.field1911[n2] = class5562.method10440();
            }
            this.field1903 = class5562.method10282();
            this.field1913 = class5562.method10282();
            this.field1910 = null;
            return;
        }
        throw new RuntimeException();
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(DILpq;)Z")
    boolean method3991(double d, int n, class391 class3912) {
        int n2 = 0;
        while (true) {
            if (n2 >= this.field1908.length) break;
            if (class3912.method7767(this.field1908[n2]) == null) {
                return false;
            }
            ++n2;
        }
        n2 = n * n;
        this.field1910 = new int[n2];
        int n3 = 0;
        while (true) {
            int n4;
            block21: {
                int n5;
                int n6;
                int[] nArray;
                Object object;
                block26: {
                    block25: {
                        int n7;
                        block23: {
                            Object object2;
                            block24: {
                                block22: {
                                    Object object3;
                                    if (n3 >= this.field1908.length) {
                                        return true;
                                    }
                                    int n8 = this.field1908[n3];
                                    if (!class307.method6538(class3912, n8)) {
                                        object3 = null;
                                    } else {
                                        object = new class569();
                                        ((class569)object).field5561 = class571.field5581;
                                        ((class569)object).field5568 = class174.field1832;
                                        ((class569)object).field5565 = class241.field2585[0];
                                        ((class569)object).field5566 = class571.field5583[0];
                                        ((class569)object).field5567 = class571.field5584[0];
                                        ((class569)object).field5564 = class403.field4657[0];
                                        ((class569)object).field5562 = class25.field108;
                                        ((class569)object).field5563 = class240.field2580[0];
                                        class241.field2585 = null;
                                        class571.field5583 = null;
                                        class571.field5584 = null;
                                        class403.field4657 = null;
                                        class25.field108 = null;
                                        class240.field2580 = null;
                                        object3 = object2 = object;
                                    }
                                    object2 = object3;
                                    ((class569)object2).method10708();
                                    object = ((class569)object2).field5563;
                                    nArray = ((class569)object2).field5562;
                                    int n9 = this.field1911[n3];
                                    if ((n9 & 0xFF000000) == 0x1000000) {
                                        // empty if block
                                    }
                                    if ((n9 & 0xFF000000) == 0x2000000) {
                                        // empty if block
                                    }
                                    if ((n9 & 0xFF000000) == 0x3000000) {
                                        n4 = n9 & 0xFF00FF;
                                        n7 = n9 >> 8 & 0xFF;
                                        for (n6 = 0; n6 < nArray.length; ++n6) {
                                            n5 = nArray[n6];
                                            if (n5 >> 8 != (n5 & 0xFFFF)) continue;
                                            nArray[n6] = n4 * (n5 &= 0xFF) >> 8 & 0xFF00FF | n7 * n5 & 0xFF00;
                                        }
                                    }
                                    for (n4 = 0; n4 < nArray.length; ++n4) {
                                        nArray[n4] = class182.method4006(nArray[n4], d);
                                    }
                                    n4 = n3 == 0 ? 0 : this.field1909[n3 - 1];
                                    if (n4 != 0) break block21;
                                    if (n != ((class569)object2).field5567) break block22;
                                    break block23;
                                }
                                if (((class569)object2).field5567 != 64 || n != 128) break block24;
                                n7 = 0;
                                break block25;
                            }
                            if (((class569)object2).field5567 != 128 || n != 64) throw new RuntimeException();
                            n7 = 0;
                            break block26;
                        }
                        for (n7 = 0; n7 < n2; ++n7) {
                            this.field1910[n7] = nArray[object[n7] & 0xFF];
                        }
                        break block21;
                    }
                    for (n6 = 0; n6 < n; ++n6) {
                        for (n5 = 0; n5 < n; ++n5) {
                            this.field1910[n7++] = nArray[object[(n6 >> 1 << 6) + (n5 >> 1)] & 0xFF];
                        }
                    }
                    break block21;
                }
                for (n6 = 0; n6 < n; ++n6) {
                    for (n5 = 0; n5 < n; ++n5) {
                        this.field1910[n7++] = nArray[object[(n5 << 1) + (n6 << 1 << 7)] & 0xFF];
                    }
                }
            }
            if (n4 == 1) {
                // empty if block
            }
            if (n4 == 2) {
                // empty if block
            }
            if (n4 == 3) {
                // empty if block
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="ah")
    void method3992() {
        this.field1910 = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="az")
    void method3993(int n) {
        int[] nArray;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        if (this.field1910 == null) {
            return;
        }
        if (this.field1903 == 1 || this.field1903 == 3) {
            if (field1916 == null || field1916.length < this.field1910.length) {
                field1916 = new int[this.field1910.length];
            }
            n7 = this.field1910.length == 4096 ? 64 : 128;
            n6 = this.field1910.length;
            n5 = n7 * this.field1913 * n;
            n4 = n6 - 1;
            if (this.field1903 == 1) {
                n5 = -n5;
            }
            for (n3 = 0; n3 < n6; ++n3) {
                n2 = n3 + n5 & n4;
                class179.field1916[n3] = this.field1910[n2];
            }
            nArray = this.field1910;
            this.field1910 = field1916;
            field1916 = nArray;
        }
        if (this.field1903 != 2 && this.field1903 != 4) return;
        if (field1916 == null || field1916.length < this.field1910.length) {
            field1916 = new int[this.field1910.length];
        }
        n7 = this.field1910.length == 4096 ? 64 : 128;
        n6 = this.field1910.length;
        n5 = this.field1913 * n;
        n4 = n7 - 1;
        if (this.field1903 == 2) {
            n5 = -n5;
        }
        n3 = 0;
        while (true) {
            if (n3 < n6) {
            } else {
                nArray = this.field1910;
                this.field1910 = field1916;
                field1916 = nArray;
                return;
            }
            for (n2 = 0; n2 < n7; ++n2) {
                int n8 = n3 + n2;
                int n9 = n3 + (n2 + n5 & n4);
                class179.field1916[n8] = this.field1910[n9];
            }
            n3 += n7;
        }
    }
}

