package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kw")
public class class280 {
    @ObfuscatedName(value="id")
    @ObfuscatedSignature(descriptor="Lez;")
    static URLLoader field3069;
    @ObfuscatedName(value="ua")
    @ObfuscatedGetter(intValue=225791087)
    static int field3067;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1327755477")
    static boolean method5990() {
        try {
            if (class149.field1678 == null) {
                class149.field1678 = field3069.method3275(new URL(class28.field121));
            } else if (class149.field1678.method3302()) {
                byte[] byArray = class149.field1678.method3310();
                class556 class5562 = new class556(byArray);
                class5562.method10440();
                class69.field808 = class5562.method10307();
                class69.field817 = new class69[class69.field808];
                int n = 0;
                while (n < class69.field808) {
                    class69 class692 = class69.field817[n] = new class69();
                    class692.field812 = class5562.method10307();
                    class692.field813 = class5562.method10440();
                    class692.field807 = class5562.method10290();
                    class692.field816 = class5562.method10290();
                    class692.field811 = class5562.method10282();
                    class692.field814 = class5562.method10284();
                    class692.field818 = n++;
                }
                class159.method3676(class69.field817, 0, class69.field817.length - 1, class69.field804, class69.field805);
                class149.field1678 = null;
                return true;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            class149.field1678 = null;
        }
        return false;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ldz;IIIII)V", garbageValue="-1976368708")
    static final void method5989(class103 class1032, int n, int n2, int n3, int n4) {
        int[][][] nArray = class1032.field1328;
        int n5 = class1032.field1322 - 1;
        int n6 = class1032.field1323 - 1;
        int n7 = n2;
        while (n7 <= n2 + n4) {
            for (int i = n; i <= n3 + n; ++i) {
                if (i < 0 || i >= nArray[0].length - 1 || n7 < 0 || n7 >= nArray[0][0].length - 1) continue;
                class84.field1029[0][i][n7] = 127;
                if (i == n && i > 0) {
                    nArray[0][i][n7] = nArray[0][i - 1][n7];
                }
                if (i == n3 + n && i < n5) {
                    nArray[0][i][n7] = nArray[0][i + 1][n7];
                }
                if (n7 == n2 && n7 > 0) {
                    nArray[0][i][n7] = nArray[0][i][n7 - 1];
                }
                if (n2 + n4 != n7 || n7 >= n6) continue;
                nArray[0][i][n7] = nArray[0][i][n7 + 1];
            }
            ++n7;
        }
        return;
    }
}

