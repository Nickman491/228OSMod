package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gf")
public class class180 {
    @ObfuscatedName(value="ay")
    static int[] field1925 = new int[500];
    @ObfuscatedName(value="ah")
    static int[] field1917 = new int[500];
    @ObfuscatedName(value="az")
    static int[] field1919 = new int[500];
    @ObfuscatedName(value="ao")
    static int[] field1920 = new int[500];
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lhu;")
    class186 field1921 = null;
    @ObfuscatedName(value="an")
    int field1918 = -1;
    @ObfuscatedName(value="ae")
    int[] field1923;
    @ObfuscatedName(value="ax")
    int[] field1924;
    @ObfuscatedName(value="at")
    int[] field1926;
    @ObfuscatedName(value="ac")
    int[] field1922;
    @ObfuscatedName(value="au")
    boolean field1927 = false;

    @ObfuscatedSignature(descriptor="([BLhu;)V")
    class180(byte[] byArray, class186 class1862) {
        this.field1921 = class1862;
        class556 class5562 = new class556(byArray);
        class556 class5563 = new class556(byArray);
        class5562.field5471 = 2;
        int n = class5562.method10282();
        int n2 = -1;
        int n3 = 0;
        class5563.field5471 = n + class5562.field5471;
        int n4 = 0;
        while (true) {
            if (n4 >= n) {
                if (byArray.length == class5563.field5471) {
                    this.field1918 = n3;
                    this.field1923 = new int[n3];
                    this.field1924 = new int[n3];
                    this.field1926 = new int[n3];
                    this.field1922 = new int[n3];
                    n4 = 0;
                    while (true) {
                        if (n4 >= n3) {
                            return;
                        }
                        this.field1923[n4] = field1925[n4];
                        this.field1924[n4] = field1917[n4];
                        this.field1926[n4] = field1919[n4];
                        this.field1922[n4] = field1920[n4];
                        ++n4;
                    }
                }
                throw new RuntimeException();
            }
            int n5 = class5562.method10282();
            if (n5 > 0) {
                int n6;
                if (this.field1921.field1998[n4] != 0) {
                    for (n6 = n4 - 1; n6 > n2; --n6) {
                        if (this.field1921.field1998[n6] != 0) {
                            continue;
                        }
                        class180.field1925[n3] = n6;
                        class180.field1917[n3] = 0;
                        class180.field1919[n3] = 0;
                        class180.field1920[n3] = 0;
                        ++n3;
                        break;
                    }
                }
                class180.field1925[n3] = n4;
                n6 = 0;
                if (this.field1921.field1998[n4] == 3) {
                    n6 = 128;
                }
                class180.field1917[n3] = (n5 & 1) != 0 ? class5563.method10294() : n6;
                class180.field1919[n3] = (n5 & 2) != 0 ? class5563.method10294() : n6;
                class180.field1920[n3] = (n5 & 4) != 0 ? class5563.method10294() : n6;
                n2 = n4;
                ++n3;
                if (this.field1921.field1998[n4] == 5) {
                    this.field1927 = true;
                }
            }
            ++n4;
        }
    }
}

