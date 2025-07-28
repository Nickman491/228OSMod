package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gk")
public class class170
extends class514 {
    @ObfuscatedName(value="ek")
    @ObfuscatedSignature(descriptor="Lnq;")
    static class352 field1807;
    @ObfuscatedName(value="ay")
    boolean field1814;
    @ObfuscatedName(value="ah")
    boolean field1806 = true;
    @ObfuscatedName(value="az")
    public List field1808;
    @ObfuscatedName(value="ao")
    int[] field1809;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(longValue=5804263768996706621L)
    public long field1810;
    @ObfuscatedName(value="an")
    public String field1811 = null;
    @ObfuscatedName(value="ae")
    public byte field1812;
    @ObfuscatedName(value="ax")
    public byte field1813;

    static {
        new BitSet(65536);
    }

    @ObfuscatedSignature(descriptor="(Lvy;)V")
    public class170(class556 class5562) {
        this.method3851(class5562);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[I", garbageValue="-338552712")
    public int[] method3834() {
        if (this.field1809 != null) return this.field1809;
        String[] stringArray = new String[this.field1808.size()];
        this.field1809 = new int[this.field1808.size()];
        int n = 0;
        while (true) {
            if (n >= this.field1808.size()) {
                class190.method4461(stringArray, this.field1809);
                return this.field1809;
            }
            stringArray[n] = ((class152)this.field1808.get((int)n)).field1685.method10974();
            this.field1809[n] = n;
            ++n;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lfw;I)V", garbageValue="-564141182")
    void method3835(class152 class1522) {
        this.field1808.add(class1522);
        this.field1809 = null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-561369554")
    void method3836(int n) {
        this.field1808.remove(n);
        this.field1809 = null;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-730358534")
    public int method3837() {
        return this.field1808.size();
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)I", garbageValue="-91")
    public int method3850(String string) {
        if (!this.field1806) {
            throw new RuntimeException("Displaynames not available");
        }
        int n = 0;
        while (n < this.field1808.size()) {
            if (((class152)this.field1808.get((int)n)).field1685.method10969().equalsIgnoreCase(string)) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="2119647539")
    void method3851(class556 class5562) {
        int n = class5562.method10282();
        if ((n & 1) != 0) {
            this.field1814 = true;
        }
        if ((n & 2) != 0) {
            this.field1806 = true;
        }
        int n2 = 2;
        if ((n & 4) != 0) {
            n2 = class5562.method10282();
        }
        this.field5174 = class5562.method10273();
        this.field1810 = class5562.method10273();
        this.field1811 = class5562.method10290();
        class5562.method10410();
        this.field1813 = class5562.method10524();
        this.field1812 = class5562.method10524();
        int n3 = class5562.method10307();
        if (n3 <= 0) return;
        this.field1808 = new ArrayList(n3);
        int n4 = 0;
        while (n4 < n3) {
            class152 class1522 = new class152();
            if (this.field1814) {
                class5562.method10273();
            }
            if (this.field1806) {
                class1522.field1685 = new class579(class5562.method10290());
            }
            class1522.field1686 = class5562.method10524();
            class1522.field1687 = class5562.method10307();
            if (n2 >= 3) {
                class5562.method10410();
            }
            this.field1808.add(n4, class1522);
            ++n4;
        }
        return;
    }

    @ObfuscatedName(value="kv")
    @ObfuscatedSignature(descriptor="(Ldz;Lvv;I)V", garbageValue="433669662")
    static void method3857(class103 class1032, class555 class5552) {
        int n = class5552.method10307();
        class480 class4802 = class1032.field1318[n];
        class103 class1033 = class4802.field5035;
        class1033.field1324 = class5552.method10307();
        class1033.field1325 = class5552.method10307();
        int n2 = class1033.field1322 / 8;
        int n3 = class1033.field1323 / 8;
        int n4 = class5552.method10307();
        class5552.method10226();
        int n5 = 0;
        while (true) {
            int n6;
            int n7;
            int n8;
            if (n5 >= 4) {
                class5552.method10238();
                class374.field4114 = new int[n4][4];
                n5 = 0;
                while (true) {
                    if (n5 >= n4) {
                        class259.field2742 = new int[n4];
                        class440.field4851 = new int[n4];
                        class239.field2578 = new int[n4];
                        class292.field3193 = new byte[n4][];
                        class536.field5365 = new byte[n4][];
                        n4 = 0;
                        n5 = 0;
                        while (true) {
                            if (n5 >= 4) {
                                class360.method7405(25);
                                client.field509 = true;
                                class151.field1683 = class1033;
                                class393.method7859(class1033);
                                return;
                            }
                            for (n8 = 0; n8 < n2; ++n8) {
                                for (n7 = 0; n7 < n3; ++n7) {
                                    int n9;
                                    n6 = client.field574[n5][n8][n7];
                                    if (n6 == -1) continue;
                                    int n10 = n6 >> 14 & 0x3FF;
                                    int n11 = n6 >> 3 & 0x7FF;
                                    int n12 = (n10 / 8 << 8) + n11 / 8;
                                    for (n9 = 0; n9 < n4; ++n9) {
                                        if (class259.field2742[n9] != n12) continue;
                                        n12 = -1;
                                        break;
                                    }
                                    if (n12 == -1) continue;
                                    class259.field2742[n4] = n12;
                                    n9 = n12 >> 8 & 0xFF;
                                    int n13 = n12 & 0xFF;
                                    class440.field4851[n4] = class68.field494.method7743("m" + n9 + "_" + n13);
                                    class239.field2578[n4] = class68.field494.method7743("l" + n9 + "_" + n13);
                                    ++n4;
                                }
                            }
                            ++n5;
                        }
                    }
                    for (n8 = 0; n8 < 4; ++n8) {
                        class374.field4114[n5][n8] = class5552.method10440();
                    }
                    ++n5;
                }
            }
            for (n8 = 0; n8 < n2; ++n8) {
                for (n7 = 0; n7 < n3; ++n7) {
                    n6 = class5552.method10227(1);
                    if (n6 != 1) {
                        client.field574[n5][n8][n7] = -1;
                        continue;
                    }
                    client.field574[n5][n8][n7] = class5552.method10227(26);
                }
            }
            ++n5;
        }
    }

    @ObfuscatedName(value="nv")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1899065248")
    static final void method3839(int n) {
        n = Math.min(Math.max(n, 0), 127);
        class544.field5403.method2897(n);
    }
}

