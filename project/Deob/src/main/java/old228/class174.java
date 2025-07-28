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

@ObfuscatedName(value="ge")
public class class174
extends class150 {
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1718739607)
    public static int field1832;
    @ObfuscatedName(value="tl")
    @ObfuscatedSignature(descriptor="Lvf;")
    static class570 field1834;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1489707361)
    int field1836;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(longValue=1584767731287262431L)
    long field1831;
    @ObfuscatedSignature(descriptor="Lfv;")
    final /* synthetic */ class153 this$0;

    @ObfuscatedSignature(descriptor="(Lfv;)V")
    class174(class153 class1532) {
        this.this$0 = class1532;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1355269794")
    void vmethod3879(class556 class5562) {
        this.field1836 = class5562.method10440();
        this.field1831 = class5562.method10273();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgq;B)V", garbageValue="0")
    void vmethod3882(class161 class1612) {
        class1612.method3701(this.field1836, this.field1831);
    }

    @ObfuscatedName(value="ay")
    public static final void method3881(long l) {
        if (l <= 0L) {
            return;
        }
        if (0L != l % 10L) {
            class248.method5350(l);
        } else {
            class248.method5350(l - 1L);
            class248.method5350(1L);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([Ljava/lang/String;[SIII)V", garbageValue="-140035932")
    public static void method3887(String[] stringArray, short[] sArray, int n, int n2) {
        if (n >= n2) return;
        int n3 = (n2 + n) / 2;
        int n4 = n;
        String string = stringArray[n3];
        stringArray[n3] = stringArray[n2];
        stringArray[n2] = string;
        short s = sArray[n3];
        sArray[n3] = sArray[n2];
        sArray[n2] = s;
        int n5 = n;
        while (true) {
            if (n5 >= n2) {
                stringArray[n2] = stringArray[n4];
                stringArray[n4] = string;
                sArray[n2] = sArray[n4];
                sArray[n4] = s;
                class174.method3887(stringArray, sArray, n, n4 - 1);
                class174.method3887(stringArray, sArray, n4 + 1, n2);
                return;
            }
            if (string == null || stringArray[n5] != null && stringArray[n5].compareTo(string) < (n5 & 1)) {
                String string2 = stringArray[n5];
                stringArray[n5] = stringArray[n4];
                stringArray[n4] = string2;
                short s2 = sArray[n5];
                sArray[n5] = sArray[n4];
                sArray[n4++] = s2;
            }
            ++n5;
        }
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="1549344134")
    static void method3886(String string) {
        class78.field943 = class166.method3810(string);
    }
}

