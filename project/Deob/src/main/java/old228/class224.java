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

@ObfuscatedName(value="ih")
public class class224 {
    @ObfuscatedName(value="ao")
    public String field2450;
    @ObfuscatedName(value="ad")
    public float[] field2447 = new float[4];
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1579963723)
    public int field2451 = 1;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-937616875)
    public int field2453 = 1;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-116708463)
    public int field2454 = 0;
    @ObfuscatedSignature(descriptor="Lic;")
    final /* synthetic */ class223 this$0;

    @ObfuscatedSignature(descriptor="(Lic;)V")
    class224(class223 class2232) {
        this.this$0 = class2232;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIIIIB)I", garbageValue="0")
    public static int method5045(int n, int n2, int n3, int n4, int n5, int n6) {
        if ((n6 & 1) == 1) {
            int n7 = n4;
            n4 = n5;
            n5 = n7;
        }
        if ((n3 &= 3) == 0) {
            return n2;
        }
        if (n3 == 1) {
            return 7 - n - (n4 - 1);
        }
        if (n3 == 2) {
            return 7 - n2 - (n5 - 1);
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="jq")
    @ObfuscatedSignature(descriptor="(Lmr;B)V", garbageValue="-9")
    static final void method5046(class323 class3232) {
        int n;
        int n2;
        String[] stringArray;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        class555 class5552;
        block31: {
            int n8;
            block45: {
                int n9;
                int n10;
                block19: {
                    class109 class1092;
                    class410 class4102;
                    block20: {
                        int n11;
                        int n12;
                        int n13;
                        int n14;
                        int n15;
                        int n16;
                        block51: {
                            block10: {
                                block11: {
                                    boolean bl;
                                    int n17;
                                    int n18;
                                    int n19;
                                    int n20;
                                    int n21;
                                    int n22;
                                    int n23;
                                    block50: {
                                        block13: {
                                            block14: {
                                                int n24;
                                                int n25;
                                                int n26;
                                                int n27;
                                                int n28;
                                                int n29;
                                                int n30;
                                                short s;
                                                short s2;
                                                int n31;
                                                block49: {
                                                    block16: {
                                                        block17: {
                                                            int n32;
                                                            block48: {
                                                                block22: {
                                                                    block23: {
                                                                        int n33;
                                                                        int n34;
                                                                        block47: {
                                                                            block25: {
                                                                                block26: {
                                                                                    int n35;
                                                                                    block46: {
                                                                                        block28: {
                                                                                            block29: {
                                                                                                block32: {
                                                                                                    int n36;
                                                                                                    block44: {
                                                                                                        block34: {
                                                                                                            block35: {
                                                                                                                int n37;
                                                                                                                int n38;
                                                                                                                int n39;
                                                                                                                int n40;
                                                                                                                block43: {
                                                                                                                    block37: {
                                                                                                                        block38: {
                                                                                                                            int n41;
                                                                                                                            block42: {
                                                                                                                                block40: {
                                                                                                                                    block41: {
                                                                                                                                        int n42;
                                                                                                                                        int n43;
                                                                                                                                        int n44;
                                                                                                                                        int n45;
                                                                                                                                        int n46;
                                                                                                                                        int n47;
                                                                                                                                        int n48;
                                                                                                                                        int n49;
                                                                                                                                        int n50;
                                                                                                                                        block39: {
                                                                                                                                            block36: {
                                                                                                                                                block33: {
                                                                                                                                                    block30: {
                                                                                                                                                        block27: {
                                                                                                                                                            block24: {
                                                                                                                                                                block21: {
                                                                                                                                                                    block18: {
                                                                                                                                                                        block15: {
                                                                                                                                                                            block12: {
                                                                                                                                                                                block9: {
                                                                                                                                                                                    class5552 = client.field564.field1450;
                                                                                                                                                                                    if (class323.field3432 != class3232) break block9;
                                                                                                                                                                                    n16 = class5552.method10334();
                                                                                                                                                                                    n15 = class5552.method10341();
                                                                                                                                                                                    int n51 = class5552.method10314();
                                                                                                                                                                                    n14 = (n51 >> 4 & 7) + class293.field3215;
                                                                                                                                                                                    n13 = (n51 & 7) + class360.field3857;
                                                                                                                                                                                    n12 = class5552.method10334();
                                                                                                                                                                                    if (n14 < 0) return;
                                                                                                                                                                                    if (n13 < 0) return;
                                                                                                                                                                                    if (n14 >= class30.field131.field1322) return;
                                                                                                                                                                                    if (n13 >= class30.field131.field1323) return;
                                                                                                                                                                                    n14 = class350.method6980(n14);
                                                                                                                                                                                    n13 = class350.method6980(n13);
                                                                                                                                                                                    if (client.field767 != -1) break block10;
                                                                                                                                                                                    break block11;
                                                                                                                                                                                }
                                                                                                                                                                                if (class323.field3430 != class3232) break block12;
                                                                                                                                                                                int n52 = class5552.method10312();
                                                                                                                                                                                n23 = n52 >> 2;
                                                                                                                                                                                n22 = n52 & 3;
                                                                                                                                                                                n21 = client.field578[n23];
                                                                                                                                                                                int n53 = class5552.method10312();
                                                                                                                                                                                n20 = (n53 >> 4 & 7) + class293.field3215;
                                                                                                                                                                                n19 = (n53 & 7) + class360.field3857;
                                                                                                                                                                                n18 = class5552.method10458();
                                                                                                                                                                                if (0 > n20) return;
                                                                                                                                                                                if (n20 >= 103) return;
                                                                                                                                                                                if (0 > n19) return;
                                                                                                                                                                                if (n19 >= 103) return;
                                                                                                                                                                                if (client.field767 != -1) break block13;
                                                                                                                                                                                break block14;
                                                                                                                                                                            }
                                                                                                                                                                            if (class323.field3431 != class3232) break block15;
                                                                                                                                                                            n31 = class5552.method10440();
                                                                                                                                                                            s2 = (short)class5552.method10326();
                                                                                                                                                                            s = (short)class5552.method10324();
                                                                                                                                                                            int n54 = class5552.method10314();
                                                                                                                                                                            n30 = (n54 >> 4 & 7) + class293.field3215;
                                                                                                                                                                            n29 = (n54 & 7) + class360.field3857;
                                                                                                                                                                            n28 = class5552.method10307();
                                                                                                                                                                            n27 = class5552.method10334();
                                                                                                                                                                            n26 = class5552.method10284();
                                                                                                                                                                            n25 = class5552.method10325();
                                                                                                                                                                            if (n30 < 0) return;
                                                                                                                                                                            if (n29 < 0) return;
                                                                                                                                                                            if (n30 >= 104) return;
                                                                                                                                                                            if (n29 >= 104) return;
                                                                                                                                                                            if (client.field767 != -1) break block16;
                                                                                                                                                                            break block17;
                                                                                                                                                                        }
                                                                                                                                                                        if (class323.field3423 != class3232) break block18;
                                                                                                                                                                        n10 = class5552.method10334();
                                                                                                                                                                        n7 = class5552.method10282();
                                                                                                                                                                        n6 = class5552.method10312();
                                                                                                                                                                        n9 = (n6 >> 4 & 7) + class293.field3215;
                                                                                                                                                                        n5 = (n6 & 7) + class360.field3857;
                                                                                                                                                                        n4 = class30.field131.field1321;
                                                                                                                                                                        if (n9 < 0 || n5 < 0 || n9 >= class30.field131.field1322 || n5 >= class30.field131.field1323) break block18;
                                                                                                                                                                        class4102 = class30.field131.field1327[n4][n9][n5];
                                                                                                                                                                        if (class4102 == null) break block19;
                                                                                                                                                                        class1092 = (class109)class4102.method7996();
                                                                                                                                                                        break block20;
                                                                                                                                                                    }
                                                                                                                                                                    if (class323.field3424 != class3232) break block21;
                                                                                                                                                                    n10 = class5552.method10334();
                                                                                                                                                                    n7 = class5552.method10314();
                                                                                                                                                                    n6 = (n7 >> 4 & 7) + class293.field3215;
                                                                                                                                                                    n9 = (n7 & 7) + class360.field3857;
                                                                                                                                                                    n5 = class5552.method10378();
                                                                                                                                                                    if (n6 < 0) return;
                                                                                                                                                                    if (n9 < 0) return;
                                                                                                                                                                    if (n6 >= 104) return;
                                                                                                                                                                    if (n9 >= 104) return;
                                                                                                                                                                    if (client.field767 != -1) break block22;
                                                                                                                                                                    break block23;
                                                                                                                                                                }
                                                                                                                                                                if (class323.field3427 != class3232) break block24;
                                                                                                                                                                n10 = class5552.method10314();
                                                                                                                                                                n7 = (n10 >> 4 & 7) + class293.field3215;
                                                                                                                                                                n6 = (n10 & 7) + class360.field3857;
                                                                                                                                                                n9 = class5552.method10312();
                                                                                                                                                                n5 = n9 >> 2;
                                                                                                                                                                n4 = n9 & 3;
                                                                                                                                                                n34 = client.field578[n5];
                                                                                                                                                                if (n7 < 0) return;
                                                                                                                                                                if (n6 < 0) return;
                                                                                                                                                                if (n7 >= class30.field131.field1322) return;
                                                                                                                                                                if (n6 >= class30.field131.field1323) return;
                                                                                                                                                                if (client.field767 != -1) break block25;
                                                                                                                                                                break block26;
                                                                                                                                                            }
                                                                                                                                                            if (class323.field3433 != class3232) break block27;
                                                                                                                                                            n10 = class5552.method10440();
                                                                                                                                                            n7 = class5552.method10387();
                                                                                                                                                            n6 = class5552.method10312();
                                                                                                                                                            n9 = (n6 >> 4 & 7) + class293.field3215;
                                                                                                                                                            n5 = (n6 & 7) + class360.field3857;
                                                                                                                                                            n4 = class5552.method10323();
                                                                                                                                                            if (n9 < 0) return;
                                                                                                                                                            if (n5 < 0) return;
                                                                                                                                                            if (n9 >= class30.field131.field1322) return;
                                                                                                                                                            if (n5 >= class30.field131.field1323) return;
                                                                                                                                                            if (client.field767 != -1) break block28;
                                                                                                                                                            break block29;
                                                                                                                                                        }
                                                                                                                                                        if (class323.field3425 != class3232) break block30;
                                                                                                                                                        n10 = class5552.method10282();
                                                                                                                                                        n7 = (n10 >> 4 & 7) + class293.field3215;
                                                                                                                                                        n6 = (n10 & 7) + class360.field3857;
                                                                                                                                                        n9 = class5552.method10341();
                                                                                                                                                        n5 = n9 >> 2;
                                                                                                                                                        n4 = n9 & 3;
                                                                                                                                                        n3 = client.field578[n5];
                                                                                                                                                        n8 = class5552.method10341();
                                                                                                                                                        stringArray = null;
                                                                                                                                                        if (n8 <= 0) break block31;
                                                                                                                                                        break block32;
                                                                                                                                                    }
                                                                                                                                                    if (class323.field3420 != class3232) break block33;
                                                                                                                                                    n10 = class5552.method10307();
                                                                                                                                                    n7 = class5552.method10314();
                                                                                                                                                    n6 = (n7 >> 4 & 7) + class293.field3215;
                                                                                                                                                    n9 = (n7 & 7) + class360.field3857;
                                                                                                                                                    n5 = class5552.method10440();
                                                                                                                                                    n4 = class30.field131.field1321;
                                                                                                                                                    if (0 > n6) return;
                                                                                                                                                    if (n6 >= 104) return;
                                                                                                                                                    if (0 > n9) return;
                                                                                                                                                    if (n9 >= 104) return;
                                                                                                                                                    if (client.field767 != -1) break block34;
                                                                                                                                                    break block35;
                                                                                                                                                }
                                                                                                                                                if (class323.field3429 == class3232) {
                                                                                                                                                    n10 = class5552.method10282();
                                                                                                                                                    n7 = class5552.method10312();
                                                                                                                                                    n6 = (n7 >> 4 & 7) + class293.field3215;
                                                                                                                                                    n9 = (n7 & 7) + class360.field3857;
                                                                                                                                                    n5 = class5552.method10307();
                                                                                                                                                    n4 = class5552.method10312();
                                                                                                                                                    int n55 = class5552.method10312();
                                                                                                                                                    int n56 = class5552.method10341() & 0x1F;
                                                                                                                                                    if (n6 < 0) return;
                                                                                                                                                    if (n9 < 0) return;
                                                                                                                                                    if (n6 >= class30.field131.field1322) return;
                                                                                                                                                    if (n9 >= class30.field131.field1323) return;
                                                                                                                                                    int n57 = n56 + 1;
                                                                                                                                                    if (class407.field4693.field1266[0] < n6 - n57) return;
                                                                                                                                                    if (class407.field4693.field1266[0] > n6 + n57) return;
                                                                                                                                                    if (class407.field4693.field1221[0] < n9 - n57) return;
                                                                                                                                                    if (class407.field4693.field1221[0] > n9 + n57) return;
                                                                                                                                                    if (class544.field5403.method2900() == 0) return;
                                                                                                                                                    if (n4 <= 0) return;
                                                                                                                                                    if (client.field748 >= 50) return;
                                                                                                                                                    client.field698[client.field748] = n5;
                                                                                                                                                    client.field754[client.field748] = null;
                                                                                                                                                    client.field752[client.field748] = n56 + (n9 << 8) + (n6 << 16);
                                                                                                                                                    client.field750[client.field748] = n4;
                                                                                                                                                    client.field751[client.field748] = n55;
                                                                                                                                                    client.field753[client.field748] = n10;
                                                                                                                                                    ++client.field748;
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                                if (class323.field3419 != class3232) break block36;
                                                                                                                                                n10 = class5552.method10312();
                                                                                                                                                n7 = (n10 >> 4 & 7) + class293.field3215;
                                                                                                                                                n6 = (n10 & 7) + class360.field3857;
                                                                                                                                                n9 = class5552.method10341();
                                                                                                                                                n5 = class5552.method10458();
                                                                                                                                                n4 = class5552.method10341();
                                                                                                                                                n40 = n4 >> 2;
                                                                                                                                                n39 = n4 & 3;
                                                                                                                                                n38 = client.field578[n40];
                                                                                                                                                if (n7 < 0) return;
                                                                                                                                                if (n6 < 0) return;
                                                                                                                                                if (n7 >= class30.field131.field1322) return;
                                                                                                                                                if (n6 >= class30.field131.field1323) return;
                                                                                                                                                if (client.field767 != -1) break block37;
                                                                                                                                                break block38;
                                                                                                                                            }
                                                                                                                                            if (class323.field3421 != class3232) break block39;
                                                                                                                                            n10 = class5552.method10312();
                                                                                                                                            n7 = class5552.method10323();
                                                                                                                                            n6 = class5552.method10387();
                                                                                                                                            if (class5552.method10312() != 1) break block40;
                                                                                                                                            break block41;
                                                                                                                                        }
                                                                                                                                        if (class323.field3422 == class3232) {
                                                                                                                                            n10 = class5552.method10315();
                                                                                                                                            n7 = class5552.method10334();
                                                                                                                                            n6 = class5552.method10315();
                                                                                                                                            n9 = class5552.method10307();
                                                                                                                                            n5 = class5552.method10316();
                                                                                                                                            n4 = class5552.method10314();
                                                                                                                                            n50 = (n4 >> 4 & 7) + class293.field3215;
                                                                                                                                            n49 = (n4 & 7) + class360.field3857;
                                                                                                                                            n48 = class5552.method10334();
                                                                                                                                            n47 = class5552.method10307();
                                                                                                                                            n46 = class5552.method10524();
                                                                                                                                            n45 = class5552.method10282();
                                                                                                                                            n44 = n45 >> 2;
                                                                                                                                            n43 = n45 & 3;
                                                                                                                                            n42 = client.field578[n44];
                                                                                                                                            class94 class942 = n7 == client.field623 ? class407.field4693 : class30.field131.field1329[n7];
                                                                                                                                            if (class942 != null) {
                                                                                                                                                int n58 = client.field767 == -1 ? class30.field131.field1321 : client.field767;
                                                                                                                                                class384.method7652(n58, n50, n49, n44, n43, n42, n9, n47, n48, n5, n46, n6, n10, class942);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        if (class323.field3428 != class3232) return;
                                                                                                                                        n10 = class5552.method10341() * 4;
                                                                                                                                        n7 = class5552.method10282();
                                                                                                                                        n6 = class5552.method10307();
                                                                                                                                        n9 = class5552.method10330();
                                                                                                                                        n5 = class5552.method10282() * 4;
                                                                                                                                        n4 = class5552.method10282();
                                                                                                                                        n50 = (n4 >> 4 & 7) + class293.field3215;
                                                                                                                                        n49 = (n4 & 7) + class360.field3857;
                                                                                                                                        n48 = class5552.method10316();
                                                                                                                                        n47 = class5552.method10458();
                                                                                                                                        n46 = class5552.method10334();
                                                                                                                                        n45 = class5552.method10334();
                                                                                                                                        n44 = class5552.method10524();
                                                                                                                                        n43 = class5552.method10330();
                                                                                                                                        n48 += n50;
                                                                                                                                        n44 += n49;
                                                                                                                                        if (n50 < 0) return;
                                                                                                                                        if (n49 < 0) return;
                                                                                                                                        if (n50 >= class30.field131.field1322) return;
                                                                                                                                        if (n49 >= class30.field131.field1323) return;
                                                                                                                                        if (n48 < 0) return;
                                                                                                                                        if (n44 < 0) return;
                                                                                                                                        if (n48 >= class30.field131.field1322) return;
                                                                                                                                        if (n44 >= class30.field131.field1323) return;
                                                                                                                                        if (n47 == 65535) return;
                                                                                                                                        n42 = client.field767 == -1 ? class30.field131.field1321 : client.field767;
                                                                                                                                        class123.method3332(n42, n50, n49, n48, n44, n9, n47, n5, n10, n45, n46, n7, n6, n43);
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    n41 = 1;
                                                                                                                                    break block42;
                                                                                                                                }
                                                                                                                                n41 = 0;
                                                                                                                            }
                                                                                                                            n9 = n41;
                                                                                                                            n5 = class5552.method10307();
                                                                                                                            n4 = class5552.method10307();
                                                                                                                            int n59 = class5552.method10312();
                                                                                                                            int n60 = class5552.method10314();
                                                                                                                            int n61 = (n60 >> 4 & 7) + class293.field3215;
                                                                                                                            int n62 = (n60 & 7) + class360.field3857;
                                                                                                                            if (n61 < 0) return;
                                                                                                                            if (n62 < 0) return;
                                                                                                                            if (n61 >= class30.field131.field1322) return;
                                                                                                                            if (n62 >= class30.field131.field1323) return;
                                                                                                                            int n63 = client.field767 == -1 ? class30.field131.field1321 : client.field767;
                                                                                                                            class229.method5109(n63, n61, n62, n4, n6, n10, n7, n5, n59, n9 != 0);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        n37 = class30.field131.field1321;
                                                                                                                        break block43;
                                                                                                                    }
                                                                                                                    n37 = client.field767;
                                                                                                                }
                                                                                                                int n64 = n37;
                                                                                                                class114.method3211(class30.field131, n64, n7, n6, n38, n5, n40, n39, n9, null, 0, -1);
                                                                                                                return;
                                                                                                            }
                                                                                                            n36 = n4;
                                                                                                            break block44;
                                                                                                        }
                                                                                                        n36 = client.field767;
                                                                                                    }
                                                                                                    int n65 = n36;
                                                                                                    class103.method2997(n65, n6, n9, n10, n5);
                                                                                                    return;
                                                                                                }
                                                                                                stringArray = new String[5];
                                                                                                break block45;
                                                                                            }
                                                                                            n35 = class30.field131.field1321;
                                                                                            break block46;
                                                                                        }
                                                                                        n35 = client.field767;
                                                                                    }
                                                                                    int n66 = n35;
                                                                                    class78.method2450(n66, n9, n5, n4, n7, n10);
                                                                                    return;
                                                                                }
                                                                                n33 = class30.field131.field1321;
                                                                                break block47;
                                                                            }
                                                                            n33 = client.field767;
                                                                        }
                                                                        int n67 = n33;
                                                                        class114.method3211(class30.field131, n67, n7, n6, n34, -1, n5, n4, 31, null, 0, -1);
                                                                        return;
                                                                    }
                                                                    n32 = class30.field131.field1321;
                                                                    break block48;
                                                                }
                                                                n32 = client.field767;
                                                            }
                                                            n4 = n32;
                                                            class323.method6617(n4, n6, n9, n10, n5);
                                                            return;
                                                        }
                                                        n24 = class30.field131.field1321;
                                                        break block49;
                                                    }
                                                    n24 = client.field767;
                                                }
                                                int n68 = n24;
                                                class482.method9366(n68, n30, n29, n27, n31, s, n26, s2, n25, n28);
                                                return;
                                            }
                                            n17 = class30.field131.field1321;
                                            break block50;
                                        }
                                        n17 = client.field767;
                                    }
                                    int n69 = n17;
                                    class98 class982 = class128.method3365(class30.field131, n69, n20, n19, n21);
                                    if (class982 != null) {
                                        ObjectDef class2622 = class142.method3512(class982.field1192);
                                        if (class2622.field2840) {
                                            class982.field1189 = n18;
                                            return;
                                        }
                                    }
                                    if (bl = class323.method6619(n69, n20, n19, n23, n22, n21, n18)) {
                                        return;
                                    }
                                    if (class982 == null) return;
                                    class982.field1189 = n18;
                                    return;
                                }
                                n11 = class30.field131.field1321;
                                break block51;
                            }
                            n11 = client.field767;
                        }
                        int n70 = n11;
                        class74 class742 = new class74(n16, n70, n14, n13, class23.method337(class30.field131, n14, n13, n70) - n15, n12, client.field514);
                        class30.field131.field1339.method7998(class742);
                        return;
                    }
                    while (class1092 != null) {
                        if ((n10 & Short.MAX_VALUE) == class1092.field1389) {
                            class1092.method3101(n7);
                            break;
                        }
                        class1092 = (class109)class4102.method8005();
                    }
                }
                if (n9 < 0) return;
                if (n5 < 0) return;
                if (n9 >= class30.field131.field1322) return;
                if (n5 >= class30.field131.field1323) return;
                int n71 = client.field767 == -1 ? class30.field131.field1321 : client.field767;
                class10.method92(n71, n9, n5, n10, n7);
                return;
            }
            for (n2 = 0; n2 < n8; ++n2) {
                n = class5552.method10312();
                String string = class5552.method10290();
                if (n < 0 || n >= 5) continue;
                stringArray[n] = string;
            }
        }
        n2 = class5552.method10341();
        n = class5552.method10307();
        if (n7 < 0) return;
        if (n6 < 0) return;
        if (n7 >= class30.field131.field1322) return;
        if (n6 >= class30.field131.field1323) return;
        int n72 = client.field767 == -1 ? class30.field131.field1321 : client.field767;
        class114.method3211(class30.field131, n72, n7, n6, n3, n, n5, n4, n2, stringArray, 0, -1);
    }
}

