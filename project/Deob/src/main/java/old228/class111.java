package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="et")
final class class111
implements class351 {
    @ObfuscatedSignature(descriptor="Lna;")
    final /* synthetic */ class361 val$item;

    @ObfuscatedSignature(descriptor="(Lna;)V")
    class111(class361 class3612) {
        this.val$item = class3612;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1894647927")
    public void vmethod7020() {
        if (this.val$item.method7447().field3802 != null) {
            class90 class902 = new class90();
            class902.method2628(this.val$item);
            class902.method2630(this.val$item.method7447().field3802);
            class236.method5196().method7998(class902);
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lae;B)Lao;", garbageValue="103")
    public static class3 method3126(class6 class610) {
        switch (class610.field15) {
            case 0: {
                return new class0();
            }
        }
        throw new IllegalArgumentException();
    }

    @ObfuscatedName(value="ky")
    @ObfuscatedSignature(descriptor="(Ldz;ZLvv;I)V", garbageValue="850337230")
    static final void method3125(class103 class1032, boolean bl, class555 class5552) {
        client.field635 = 0;
        client.field562 = 0;
        class223.method5008(class1032, class5552);
        while (true) {
            int n;
            boolean bl2;
            int n2;
            int n3;
            int n4;
            int n5 = 16;
            int n6 = 1 << n5;
            if (class5552.method10229(client.field564.field1452) < n5 + 12 || (n4 = class5552.method10227(n5)) == n6 - 1) {
                class5552.method10238();
                class475.method9189(class1032, class5552);
                n5 = 0;
                while (true) {
                    if (n5 >= client.field635) {
                        if (class5552.field5471 == client.field564.field1452) {
                            n5 = 0;
                            while (true) {
                                if (n5 >= class1032.field1331) {
                                    return;
                                }
                                if (class1032.field1330[class1032.field1332[n5]] == null) {
                                    throw new RuntimeException(n5 + "," + class1032.field1331);
                                }
                                ++n5;
                            }
                        }
                        throw new RuntimeException(class5552.field5471 + "," + client.field564.field1452);
                    }
                    n6 = client.field537[n5];
                    if (class1032.field1330[n6].field1259 != client.field514) {
                        class1032.field1330[n6].field1354 = null;
                        class1032.field1330[n6] = null;
                    }
                    ++n5;
                }
            }
            int n7 = class183.field1966;
            boolean bl3 = false;
            if (class1032.field1330[n4] == null) {
                class1032.field1330[n4] = new class105();
                bl3 = true;
            }
            class105 class1052 = class1032.field1330[n4];
            class1052.field1350 = n7;
            class1032.field1332[++class1032.field1331 - 1] = n4;
            class1052.field1259 = client.field514;
            if (!bl) {
                n3 = class5552.method10227(6);
                if (n3 > 31) {
                    n3 -= 64;
                }
            } else {
                n3 = class5552.method10227(8);
                if (n3 > 127) {
                    n3 -= 256;
                }
            }
            if (!bl) {
                n2 = class5552.method10227(6);
                if (n2 > 31) {
                    n2 -= 64;
                }
            } else {
                n2 = class5552.method10227(8);
                if (n2 > 127) {
                    n2 -= 256;
                }
            }
            boolean bl4 = bl2 = class5552.method10227(1) == 1;
            if (bl2) {
                class5552.method10227(32);
            }
            class1052.field1354 = class446.method8848(class5552.method10227(14));
            int n8 = class5552.method10227(1);
            int n9 = client.field640[class5552.method10227(3)];
            if (bl3) {
                class1052.field1262 = class1052.field1197 = n9;
            }
            if ((n = class5552.method10227(1)) == 1) {
                client.field567[++client.field562 - 1] = n4;
            }
            class97.method2736(class1052);
            if (class1052.field1200 == 0) {
                class1052.field1197 = 0;
            }
            class1052.method3049(n2 + class277.field3055, n3 + class221.field2426, n8 == 1);
        }
    }
}

