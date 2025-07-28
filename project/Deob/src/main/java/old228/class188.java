package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="hp")
public class class188
extends class195 {
    @ObfuscatedName(value="eh")
    @ObfuscatedSignature(descriptor="Lok;")
    static class388 field2104;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lqe;")
    class428 field2103;
    @ObfuscatedName(value="ah")
    float[] field2102 = new float[3];

    @ObfuscatedSignature(descriptor="(Lqe;)V")
    class188(class428 class4282) {
        this.field2103 = class4282;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lhs;IIIIJ)V")
    void vmethod4503(class190 class1902, int n, int n2, int n3, int n4, long l) {
        class1902.vmethod4565(n, this.field2103, n2, n3, n4, l);
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lhj;Lhz;IIII)V", garbageValue="54431755")
    void vmethod4504(class187 class1872, class201 class2012, int n, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8 = n7 = n2 << 7;
        int n9 = n6 = n3 << 7;
        int n10 = n5 = n8 + 128;
        int n11 = n4 = n9 + 128;
        int n12 = class1872.field2008[n][n2][n3];
        int n13 = class1872.field2008[n][n2 + 1][n3];
        int n14 = class1872.field2008[n][n2 + 1][n3 + 1];
        int n15 = class1872.field2008[n][n2][n3 + 1];
        this.field2103.method8385(n8, n12, n9, this.field2102);
        n8 = (int)this.field2102[0];
        n12 = (int)this.field2102[1];
        n9 = (int)this.field2102[2] | 1;
        this.field2103.method8385(n10, n13, n6, this.field2102);
        n10 = (int)this.field2102[0];
        n13 = (int)this.field2102[1];
        n6 = (int)this.field2102[2] | 1;
        this.field2103.method8385(n5, n14, n11, this.field2102);
        n5 = (int)this.field2102[0];
        n14 = (int)this.field2102[1];
        n11 = (int)this.field2102[2] | 1;
        this.field2103.method8385(n7, n15, n4, this.field2102);
        n7 = (int)this.field2102[0];
        n15 = (int)this.field2102[1];
        n4 = (int)this.field2102[2] | 1;
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
            int n5 = class1962.field2170[n4];
            int n6 = class1962.field2176[n4];
            int n7 = class1962.field2160[n4];
            this.field2103.method8385(n5, n6, n7, this.field2102);
            n5 = (int)this.field2102[0];
            n6 = (int)this.field2102[1];
            n7 = (int)this.field2102[2];
            if (class1962.field2167 != null) {
                class196.field2178[n4] = n5;
                class196.field2177[n4] = n6;
                class196.field2158[n4] = n7;
            }
            class196.field2173[n4] = class182.method4008() + n5 * class182.method4061() / (n7 |= 1);
            class196.field2159[n4] = class182.method4048() + n6 * class182.method4061() / n7;
            class196.field2174[n4] = class20.method298(n7);
            ++n4;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="345972941")
    static void method4441(int n, int n2) {
        int[] nArray = new int[4];
        int[] nArray2 = new int[4];
        nArray[0] = n;
        nArray2[0] = n2;
        int n3 = 1;
        int n4 = 0;
        while (true) {
            if (n4 >= 4) {
                class69.field804 = nArray;
                class69.field805 = nArray2;
                class159.method3676(class69.field817, 0, class69.field817.length - 1, class69.field804, class69.field805);
                return;
            }
            if (class69.field804[n4] != n) {
                nArray[n3] = class69.field804[n4];
                nArray2[n3] = class69.field805[n4];
                ++n3;
            }
            ++n4;
        }
    }

    @ObfuscatedName(value="jr")
    @ObfuscatedSignature(descriptor="(IIZI)V", garbageValue="-947724231")
    static final void method4437(int n, int n2, boolean bl) {
        if (bl && n == class14.field62 && class133.field1554 == n2) {
            return;
        }
        class14.field62 = n;
        class133.field1554 = n2;
        class360.method7405(25);
        client.field723 = true;
        class328.method6641("Loading - please wait.", true);
        int n3 = class34.field189.field1324;
        int n4 = class34.field189.field1325;
        class34.field189.field1324 = (n - 6) * 8;
        class34.field189.field1325 = (n2 - 6) * 8;
        int n5 = class34.field189.field1324 - n3;
        int n6 = class34.field189.field1325 - n4;
        int n7 = n5 * 128;
        int n8 = n6 * 128;
        int n9 = 0;
        while (true) {
            class67 class672;
            int n10;
            if (n9 >= 65536) {
                n9 = 0;
                while (true) {
                    if (n9 >= 2048) {
                        n9 = 0;
                        while (true) {
                            if (n9 >= 2048) {
                                n9 = 0;
                                int n11 = 104;
                                n10 = 1;
                                if (n5 < 0) {
                                    n9 = 103;
                                    n11 = -1;
                                    n10 = -1;
                                }
                                int n12 = 0;
                                int n13 = 104;
                                int n14 = 1;
                                if (n6 < 0) {
                                    n12 = 103;
                                    n13 = -1;
                                    n14 = -1;
                                }
                                int n15 = n9;
                                while (true) {
                                    int n16;
                                    if (n11 == n15) {
                                        class98 class982 = (class98)class34.field189.field1333.method7996();
                                        while (true) {
                                            if (class982 == null) {
                                                if (client.field744 != 0) {
                                                    client.field744 -= n5;
                                                    client.field745 -= n6;
                                                }
                                                client.field748 = 0;
                                                client.field797 = false;
                                                class478.field5017 -= n5 << 7;
                                                class31.field140 -= n6 << 7;
                                                class234.field2509 -= n5 << 7;
                                                class7.field26 -= n6 << 7;
                                                client.field739 = -1;
                                                class34.field189.field1339.method8013();
                                                class34.field189.field1338.method8013();
                                                for (n16 = 0; n16 < 4; ++n16) {
                                                    class34.field189.field1336[n16].method5800();
                                                }
                                                return;
                                            }
                                            class982.field1187 -= n5;
                                            class982.field1182 -= n6;
                                            if (class982.field1187 < 0 || 104 <= class982.field1187 || class982.field1182 < 0 || 104 <= class982.field1182) {
                                                class982.method9623();
                                            }
                                            class982 = (class98)class34.field189.field1333.method8005();
                                        }
                                    }
                                    for (n16 = n12; n16 != n13; n16 += n14) {
                                        int n17 = n15 + n5;
                                        int n18 = n6 + n16;
                                        for (int i = 0; i < 4; ++i) {
                                            class34.field189.field1327[i][n15][n16] = 0 <= n17 && n17 < 104 && 0 <= n18 && n18 < 104 ? class34.field189.field1327[i][n17][n18] : null;
                                        }
                                    }
                                    n15 += n10;
                                }
                            }
                            class672 = class34.field189.field1318[n9];
                            if (class672 != null) {
                                ((class480)class672).method9297(-n7, -n8);
                            }
                            ++n9;
                        }
                    }
                    class672 = class34.field189.field1329[n9];
                    if (class672 != null) {
                        n10 = 0;
                        while (true) {
                            if (n10 >= 10) {
                                ((class99)class672).field1213 -= n7;
                                ((class99)class672).field1196 -= n8;
                                ((class99)class672).field1247 -= n5;
                                ((class99)class672).field1249 -= n6;
                                ((class99)class672).field1248 -= n5;
                                ((class99)class672).field1250 -= n6;
                                break;
                            }
                            int n19 = n10;
                            ((class99)class672).field1266[n19] = ((class99)class672).field1266[n19] - n5;
                            int n20 = n10++;
                            ((class99)class672).field1221[n20] = ((class99)class672).field1221[n20] - n6;
                        }
                    }
                    ++n9;
                }
            }
            class672 = class34.field189.field1330[n9];
            if (class672 != null) {
                n10 = 0;
                while (true) {
                    if (n10 >= 10) {
                        ((class99)class672).field1213 -= n7;
                        ((class99)class672).field1196 -= n8;
                        ((class99)class672).field1247 -= n5;
                        ((class99)class672).field1249 -= n6;
                        ((class99)class672).field1248 -= n5;
                        ((class99)class672).field1250 -= n6;
                        break;
                    }
                    int n21 = n10;
                    ((class99)class672).field1266[n21] = ((class99)class672).field1266[n21] - n5;
                    int n22 = n10++;
                    ((class99)class672).field1221[n22] = ((class99)class672).field1221[n22] - n6;
                }
            }
            ++n9;
        }
    }

    @ObfuscatedName(value="kb")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="708605342")
    static final void method4435() {
        class98 class982 = (class98)class34.field189.field1333.method7996();
        while (class982 != null) {
            if (class982.field1186 != -1) {
                class982.method9623();
            } else {
                class982.field1183 = 0;
                ObjectDef.method5557(class34.field189, class982);
            }
            class982 = (class98)class34.field189.field1333.method8005();
        }
        return;
    }

    @ObfuscatedName(value="ko")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="544538834")
    static void method4443() {
        client.field648.field5612 = 0;
        client.field647 = false;
    }
}

