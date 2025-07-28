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

@ObfuscatedName(value="gl")
public class class168
extends class150 {
    @ObfuscatedName(value="dv")
    @ObfuscatedSignature(descriptor="Lde;")
    static class91 field1794;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1951142615)
    int field1796;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-118886787)
    int field1795;
    @ObfuscatedSignature(descriptor="Lfv;")
    final /* synthetic */ class153 this$0;

    @ObfuscatedSignature(descriptor="(Lfv;)V")
    class168(class153 class1532) {
        this.this$0 = class1532;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1355269794")
    void vmethod3879(class556 class5562) {
        this.field1796 = class5562.method10440();
        this.field1795 = class5562.method10440();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgq;B)V", garbageValue="0")
    void vmethod3882(class161 class1612) {
        class1612.method3717(this.field1796, this.field1795);
    }

    @ObfuscatedName(value="kt")
    @ObfuscatedSignature(descriptor="(Ldz;IIIIIIIII)V", garbageValue="-1803870393")
    static final void method3819(class103 class1032, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        block25: {
            ObjectDef class2622;
            int n9;
            class187 class1872 = class1032.field1319;
            if (n3 < 1 || n4 < 1 || n3 > class1032.field1322 - 1 || n4 > class1032.field1323 - 1) break block25;
            if (client.field502 && class1032.field1321 != n) {
                return;
            }
            long l = 0L;
            int n10 = -1;
            int n11 = 0;
            int n12 = 0;
            if (n2 == 0) {
                l = class1872.method4395(n, n3, n4);
            }
            if (n2 == 1) {
                l = class1872.method4253(n, n3, n4);
            }
            if (n2 == 2) {
                l = class1872.method4202(n, n3, n4);
            }
            if (n2 == 3) {
                l = class1872.method4203(n, n3, n4);
            }
            if (l != 0L) {
                n9 = class1872.method4192(n, n3, n4, l);
                n10 = class360.method7406(l);
                n11 = n9 & 0x1F;
                n12 = n9 >> 6 & 3;
                class2622 = class142.method3512(n10);
                int n13 = n3;
                int n14 = n4;
                if (class2622 != null && class2622.method5519()) {
                    class514 class5142;
                    int n15 = class2622.field2804;
                    int n16 = class2622.field2805;
                    if (n12 == 1 || n12 == 3) {
                        n15 = class2622.field2805;
                        n16 = class2622.field2804;
                    }
                    int n17 = (n15 + n13) * 128;
                    int n18 = (n14 + n16) * 128;
                    n13 *= 128;
                    n14 *= 128;
                    int n19 = class2622.field2819;
                    int n20 = class2622.field2834 * 16384;
                    int n21 = class2622.field2835 * 16384;
                    if (class2622.field2837 != null && (class5142 = class2622.method5517()) != null) {
                        n19 = ((ObjectDef)class5142).field2819;
                        n20 = ((ObjectDef)class5142).field2834 * 16384;
                        n21 = ((ObjectDef)class5142).field2835 * 16384;
                    }
                    class5142 = (class71)class71.field846.method7996();
                    while (class5142 != null) {
                        if (((class71)class5142).field835 == n && n13 == ((class71)class5142).field837 * 16384 && n14 == ((class71)class5142).field834 * 16384 && n17 == ((class71)class5142).field838 * 16384 && n18 == ((class71)class5142).field839 * 16384 && n19 == ((class71)class5142).field842 && n20 == ((class71)class5142).field840 && n21 == ((class71)class5142).field841) {
                            if (((class71)class5142).field843 != null) {
                                class476.field5014.method745(((class71)class5142).field843);
                                ((class71)class5142).field843 = null;
                            }
                            if (((class71)class5142).field836 != null) {
                                class476.field5014.method745(((class71)class5142).field836);
                                ((class71)class5142).field836 = null;
                            }
                            class5142.method9623();
                            break;
                        }
                        class5142 = (class71)class71.field846.method8005();
                    }
                }
                if (n2 == 0) {
                    class1872.method4191(n, n3, n4);
                    if (class2622.field2806 != 0) {
                        class1032.field1336[n].method5802(n3, n4, n11, n12, class2622.field2807);
                    }
                }
                if (n2 == 1) {
                    class1872.method4381(n, n3, n4);
                }
                if (n2 == 2) {
                    class1872.method4242(n, n3, n4);
                    if (n3 + class2622.field2804 > class1032.field1322 - 1 || n4 + class2622.field2804 > class1032.field1323 - 1 || n3 + class2622.field2805 > class1032.field1322 - 1 || n4 + class2622.field2805 > class1032.field1323 - 1) {
                        return;
                    }
                    if (class2622.field2806 != 0) {
                        class1032.field1336[n].method5803(n3, n4, class2622.field2804, class2622.field2805, n12, class2622.field2807);
                    }
                }
                if (n2 == 3) {
                    class1872.method4194(n, n3, n4);
                    if (class2622.field2806 == 1) {
                        class1032.field1336[n].method5805(n3, n4);
                    }
                }
            }
            if (n5 >= 0) {
                n9 = n;
                if (n9 < 3 && (class1032.field1337[1][n3][n4] & 2) == 2) {
                    ++n9;
                }
                class42.method823(class1032, n, n9, n3, n4, n5, n6, n7, n8, class1032.field1336[n]);
                class2622 = class142.method3512(n5);
                if (class2622 != null && class2622.method5519()) {
                    class34.method593(n9, n3, n4, class2622, n6);
                }
            }
        }
    }
}

