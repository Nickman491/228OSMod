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

@ObfuscatedName(value="fj")
public class class154
extends class150 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-59590313)
    int field1700 = -1;
    @ObfuscatedName(value="ah")
    byte field1699;
    @ObfuscatedSignature(descriptor="Lfv;")
    final /* synthetic */ class153 this$0;

    @ObfuscatedSignature(descriptor="(Lfv;)V")
    class154(class153 class1532) {
        this.this$0 = class1532;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1355269794")
    void vmethod3879(class556 class5562) {
        this.field1700 = class5562.method10307();
        this.field1699 = class5562.method10524();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgq;B)V", garbageValue="0")
    void vmethod3882(class161 class1612) {
        class1612.method3695(this.field1700, this.field1699);
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-792671172")
    public static final void method3627(int n, int n2) {
        class199.field2263 = n;
        class199.field2264 = n2;
        class199.field2265 = true;
        class199.field2271 = 0;
        class199.field2269 = false;
    }

    @ObfuscatedName(value="kx")
    @ObfuscatedSignature(descriptor="(IIIIIIB)Z", garbageValue="27")
    static boolean method3621(int n, int n2, int n3, int n4, int n5, int n6) {
        return class323.method6619(class30.field131.field1321, n, n2, n3, n4, n5, n6);
    }

    @ObfuscatedName(value="kk")
    @ObfuscatedSignature(descriptor="(Ldz;Ldx;IILkq;I)V", garbageValue="-2028366493")
    static final void method3629(class103 class1032, class94 class942, int n, int n2, class275 class2752) {
        int n3 = class942.field1266[0];
        int n4 = class942.field1221[0];
        int n5 = class942.method2664();
        class270 class2702 = class1032.field1336[class1032.field1321];
        if (n3 >= n5 && n3 < class2702.field2991 - n5 && n4 >= n5 && n4 < class2702.field3002 - n5) {
            if (n >= n5 && n < class2702.field2991 - n5 && n2 >= n5 && n2 < class2702.field3002 - n5) {
                int n6 = client.field793.method5941(n3, n4, class942.method2664(), class231.method5129(n, n2), class2702, true, client.field799, client.field800);
                if (n6 < 1) {
                    return;
                }
                for (int i = 0; i < n6 - 1; ++i) {
                    class942.method2678(client.field799[i], client.field800[i], class2752);
                }
                return;
            }
            return;
        }
    }
}

