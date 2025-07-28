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

@ObfuscatedName(value="gy")
public class class165
extends class150 {
    @ObfuscatedName(value="gt")
    static String field1782;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(longValue=-2094426101884963605L)
    long field1783 = -1L;
    @ObfuscatedName(value="ah")
    String field1781 = null;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1010564325)
    int field1784 = 0;
    @ObfuscatedSignature(descriptor="Lfv;")
    final /* synthetic */ class153 this$0;

    @ObfuscatedSignature(descriptor="(Lfv;)V")
    class165(class153 class1532) {
        this.this$0 = class1532;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1355269794")
    void vmethod3879(class556 class5562) {
        if (class5562.method10282() != 255) {
            --class5562.field5471;
            this.field1783 = class5562.method10273();
        }
        this.field1781 = class5562.method10360();
        this.field1784 = class5562.method10307();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgq;B)V", garbageValue="0")
    void vmethod3882(class161 class1612) {
        class1612.method3691(this.field1783, this.field1781, this.field1784);
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1951312105")
    public static void method3794() {
        class229.field2485.method6581();
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="1147545767")
    static int method3793(int n, class81 class812, boolean bl) {
        class361 class3612;
        class361 class3613 = class3612 = bl ? class134.field1564 : class9.field45;
        if (n != 1700) {
            if (n != 1701) {
                if (n != 1702) {
                    if (n != 1707) {
                        if (n != 1708) {
                            if (n != 1709) {
                                return 2;
                            }
                            return class303.method6467(class3612);
                        }
                        return class10.method112(class3612);
                    }
                    class72.field865[++class63.field444 - 1] = class3612.method7433() ? 1 : 0;
                    return 1;
                }
                class72.field865[++class63.field444 - 1] = class3612.field3863;
                return 1;
            }
            class72.field865[++class63.field444 - 1] = class3612.field4010 != -1 ? class3612.field4011 : 0;
            return 1;
        }
        class72.field865[++class63.field444 - 1] = class3612.field4010;
        return 1;
    }
}

