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

@ObfuscatedName(value="ve")
public class class549
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    static class391 field5417;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static class315 field5416;
    @ObfuscatedName(value="az")
    Object[][] field5418;
    @ObfuscatedName(value="ao")
    int[][] field5415;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=180951745)
    public int field5419 = -1;

    static {
        field5416 = new class315(64);
    }

    class549() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;B)V", garbageValue="56")
    void method10170(class556 class5562) {
        int n;
        while ((n = class5562.method10282()) != 0) {
            this.method10185(class5562, n);
        }
        return;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(II)[Ljava/lang/Object;", garbageValue="1657346556")
    public Object[] method10171(int n) {
        if (this.field5418 == null) {
            return null;
        }
        return this.field5418[n];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="-2139902597")
    void method10185(class556 class5562, int n) {
        if (n != 3) {
            if (n != 4) return;
            this.field5419 = class5562.method10301();
            return;
        }
        int n2 = class5562.method10282();
        if (this.field5418 == null) {
            this.field5418 = new Object[n2][];
            this.field5415 = new int[n2][];
        }
        int n3 = class5562.method10282();
        block0: while (n3 != 255) {
            int n4 = class5562.method10282();
            int[] nArray = new int[n4];
            int n5 = 0;
            while (true) {
                if (n5 >= n4) {
                    Object[][] objectArray = this.field5418;
                    int n6 = n3;
                    int n7 = class5562.method10407();
                    Object[] objectArray2 = new Object[nArray.length * n7];
                    int n8 = 0;
                    while (true) {
                        if (n8 >= n7) {
                            Object[] objectArray3 = objectArray2;
                            objectArray[n6] = objectArray3;
                            this.field5415[n3] = nArray;
                            n3 = class5562.method10282();
                            continue block0;
                        }
                        for (int i = 0; i < nArray.length; ++i) {
                            int n9 = i + nArray.length * n8;
                            class544 class5442 = class242.method5280(nArray[i]);
                            objectArray2[n9] = class5442.method10123(class5562);
                        }
                        ++n8;
                    }
                }
                nArray[n5] = class5562.method10407();
                ++n5;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-91")
    void method10172() {
    }
}

