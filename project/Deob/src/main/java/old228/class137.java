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

@ObfuscatedName(value="fs")
public class class137
implements MouseWheel {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lfs;")
    static final class137 field1604 = new class137(0, 0, null, 0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lfs;")
    static final class137 field1600 = new class137(1, 1, null, 9);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lfs;")
    static final class137 field1596 = new class137(2, 2, null, 3);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lfs;")
    static final class137 field1597 = new class137(3, 3, null, 6);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lfs;")
    static final class137 field1598 = new class137(4, 4, null, 1);
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lfs;")
    static final class137 field1599 = new class137(5, 5, null, 3);
    @ObfuscatedName(value="fl")
    @ObfuscatedSignature(descriptor="Lok;")
    static class388 field1603;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-56822517)
    final int field1595;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=632281529)
    final int field1601;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-135725277)
    final int field1602;

    class137(int n, int n2, String string, int n3) {
        this.field1595 = n;
        this.field1601 = n2;
        this.field1602 = n3;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    public int vmethod10703() {
        return this.field1601;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1125994409")
    int method3482() {
        return this.field1602;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(IB)Lfl;", garbageValue="122")
    static class144 method3480(int n) {
        class144 class1442 = (class144) SequenceDef.field2938.method6578(n);
        if (class1442 != null) {
            return class1442;
        }
        class1442 = class123.method3330(SequenceDef.field2920, class466.field4971, n, false);
        if (class1442 != null) {
            SequenceDef.field2938.method6590(class1442, n);
        }
        return class1442;
    }

    @ObfuscatedName(value="ij")
    @ObfuscatedSignature(descriptor="(Ldz;IZI)V", garbageValue="-1927975258")
    static void method3487(class103 class1032, int n, boolean bl) {
        class94 class942 = class1032.field1329[n];
        if (class942 != null && class942.vmethod3039() && !class942.field1138) {
            int n2 = class942.field1137;
            class942.field1139 = false;
            if ((client.field502 && client.field673.field1406 > 50 || client.field673.field1406 > 200) && bl && class942.field1201 == class942.field1238) {
                class942.field1139 = true;
            }
            int n3 = class942.field1213 >> 7;
            int n4 = class942.field1196 >> 7;
            if (0 <= n3 && n3 < 104 && 0 <= n4 && n4 < 104) {
                long l = class79.method2452(0, 0, 0, false, class942.field1145, class1032.field1320);
                if (class942.field1142 != null && client.field514 >= class942.field1129 && client.field514 < class942.field1130) {
                    class942.field1139 = false;
                    class942.field1128 = class23.method337(class1032, class942.field1213, class942.field1196, n2);
                    class942.field1260 = client.field514;
                    class1032.field1319.method4334(n2, class942.field1213, class942.field1196, class942.field1128, 60, class942, class942.field1197, l, class942.field1124, class942.field1141, class942.field1146, class942.field1144);
                } else {
                    if ((class942.field1213 & 0x7F) == 64 && (class942.field1196 & 0x7F) == 64) {
                        if (class1032.field1326[n3][n4] == client.field617) {
                            return;
                        }
                        class1032.field1326[n3][n4] = client.field617;
                    }
                    class942.field1128 = class23.method337(class1032, class942.field1213, class942.field1196, n2);
                    class942.field1260 = client.field514;
                    class1032.field1319.method4185(n2, class942.field1213, class942.field1196, class942.field1128, 60, class942, class942.field1197, l, class942.field1206);
                }
            }
        }
    }
}

