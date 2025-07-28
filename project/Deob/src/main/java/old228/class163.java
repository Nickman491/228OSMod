package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Collections;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ga")
public class class163
extends class166 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1594708939)
    int field1772 = -1;
    @ObfuscatedName(value="ah")
    byte field1769;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=789016747)
    int field1770;
    @ObfuscatedName(value="ao")
    String field1771;
    @ObfuscatedSignature(descriptor="Lgv;")
    final /* synthetic */ class167 this$0;

    @ObfuscatedSignature(descriptor="(Lgv;)V")
    class163(class167 class1672) {
        this.this$0 = class1672;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="1969161379")
    void vmethod3869(class556 class5562) {
        class5562.method10282();
        this.field1772 = class5562.method10307();
        this.field1769 = class5562.method10524();
        this.field1770 = class5562.method10307();
        class5562.method10273();
        this.field1771 = class5562.method10290();
        class5562.method10282();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgk;I)V", garbageValue="-1263140647")
    void vmethod3870(class170 class1702) {
        class152 class1522 = (class152)class1702.field1808.get(this.field1772);
        class1522.field1686 = this.field1769;
        class1522.field1687 = this.field1770;
        class1522.field1685 = new class579(this.field1771);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([I[II)V", garbageValue="-1302635542")
    public static void method3778(int[] nArray, int[] nArray2) {
        if (nArray != null && nArray2 != null) {
            class580.field5644 = nArray;
            class238.field2563 = new int[nArray.length];
            class225.field2459 = new byte[nArray.length][][];
            int n = 0;
            while (true) {
                if (n >= class580.field5644.length) {
                    Collections.sort(class453.field4887);
                    return;
                }
                class225.field2459[n] = new byte[nArray2[n]][];
                class453.field4887.add(nArray[n]);
                ++n;
            }
        }
        class580.field5644 = null;
        class238.field2563 = null;
        class225.field2459 = null;
        class453.field4887.clear();
        class453.field4887.add(100);
        class453.field4887.add(5000);
        class453.field4887.add(10000);
        class453.field4887.add(30000);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;II)Z", garbageValue="1669839859")
    static boolean method3775(String string, int n) {
        return class440.method8813(string, n, "openjs");
    }

    @ObfuscatedName(value="om")
    @ObfuscatedSignature(descriptor="(Lna;I)Z", garbageValue="-812239853")
    static boolean method3777(class361 class3612) {
        return class3612.field3891;
    }
}

