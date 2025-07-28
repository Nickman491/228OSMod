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

@ObfuscatedName(value="os")
public class class384
extends Enum
implements class404 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Los;")
    public static final /* enum */ class384 field4498 = new class384("runelite", 0, 0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Los;")
    public static final /* enum */ class384 field4494 = new class384("runelite", 1, 1);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Los;")
    public static final /* enum */ class384 field4496 = new class384("runelite", 2, 2);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Los;")
    public static final /* enum */ class384 field4497 = new class384("runelite", 3, 3);
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=629776237)
    public final int field4495;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    class384() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.field4495 = var3_1;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.field4495;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="130353676")
    public static int method7653(int n) {
        return n >>> 4 & class550.field5421;
    }

    @ObfuscatedName(value="jo")
    @ObfuscatedSignature(descriptor="(IIIIIIIIIIIIILdx;I)V", garbageValue="-1315165544")
    static void method7652(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, Player player) {
        int n14;
        int n15;
        ObjectComposition objectComposition = class142.getObjectDefinition(n7);
        if (n5 != 1 && n5 != 3) {
            n15 = objectComposition.sizeX;
            n14 = objectComposition.sizeY;
        } else {
            n15 = objectComposition.sizeY;
            n14 = objectComposition.sizeX;
        }
        int n16 = (n15 >> 1) + n2;
        int n17 = (n15 + 1 >> 1) + n2;
        int n18 = (n14 >> 1) + n3;
        int n19 = n3 + (n14 + 1 >> 1);
        int[][] nArray = class30.field131.field1328[n];
        int n20 = nArray[n16][n18] + nArray[n17][n18] + nArray[n16][n19] + nArray[n17][n19] >> 2;
        int n21 = (n2 << 7) + (n15 << 6);
        int n22 = (n3 << 7) + (n14 << 6);
        Model model = objectComposition.getModel(n4, n5, nArray, n21, n20, n22);
        if (model != null) {
            int n23;
            Varcs.method3211(class30.field131, n, n2, n3, n6, -1, 0, 0, 31, null, n8 + 1, n9 + 1);
            player.field1129 = n8 + Client.cycle;
            player.field1130 = n9 + Client.cycle;
            player.field1142 = model;
            player.field1131 = n15 * 64 + n2 * 128;
            player.field1133 = n3 * 128 + n14 * 64;
            player.field1132 = n20;
            if (n10 > n12) {
                n23 = n10;
                n10 = n12;
                n12 = n23;
            }
            if (n11 > n13) {
                n23 = n11;
                n11 = n13;
                n13 = n23;
            }
            player.field1124 = n10 + n2;
            player.field1146 = n12 + n2;
            player.field1141 = n11 + n3;
            player.field1144 = n3 + n13;
        }
    }
}

