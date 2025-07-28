/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fs")
public class class137
implements class404 {
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
    static Archive field1603;
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
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
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
        class144 class1442 = (class144)SequenceDefinition.SequenceDefinition_cachedModel.get(n);
        if (class1442 != null) {
            return class1442;
        }
        class1442 = UserComparator7.method3330(SequenceDefinition.SequenceDefinition_animationsArchive, class466.SequenceDefinition_skeletonsArchive, n, false);
        if (class1442 != null) {
            SequenceDefinition.SequenceDefinition_cachedModel.put(class1442, n);
        }
        return class1442;
    }

    @ObfuscatedName(value="ij")
    @ObfuscatedSignature(descriptor="(Ldz;IZI)V", garbageValue="-1927975258")
    static void method3487(class103 class1032, int n, boolean bl) {
        Player player = class1032.field1329[n];
        if (player != null && player.isVisible() && !player.field1138) {
            int n2 = player.plane;
            player.field1139 = false;
            if ((Client.isLowDetail && Client.field673.field1406 > 50 || Client.field673.field1406 > 200) && bl && player.field1201 == player.field1238) {
                player.field1139 = true;
            }
            int n3 = player.x >> 7;
            int n4 = player.field1196 >> 7;
            if (0 <= n3 && n3 < 104 && 0 <= n4 && n4 < 104) {
                long l = Projectile.method2452(0, 0, 0, false, player.field1145, class1032.field1320);
                if (player.field1142 != null && Client.cycle >= player.field1129 && Client.cycle < player.field1130) {
                    player.field1139 = false;
                    player.field1128 = Canvas.method337(class1032, player.x, player.field1196, n2);
                    player.field1260 = Client.cycle;
                    class1032.field1319.method4334(n2, player.x, player.field1196, player.field1128, 60, player, player.field1197, l, player.field1124, player.field1141, player.field1146, player.field1144);
                } else {
                    if ((player.x & 0x7F) == 64 && (player.field1196 & 0x7F) == 64) {
                        if (class1032.field1326[n3][n4] == Client.viewportDrawCount) {
                            return;
                        }
                        class1032.field1326[n3][n4] = Client.viewportDrawCount;
                    }
                    player.field1128 = Canvas.method337(class1032, player.x, player.field1196, n2);
                    player.field1260 = Client.cycle;
                    class1032.field1319.method4185(n2, player.x, player.field1196, player.field1128, 60, player, player.field1197, l, player.field1206);
                }
            }
        }
    }
}

