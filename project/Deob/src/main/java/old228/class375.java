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

@ObfuscatedName(value="oe")
public class class375 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Loe;")
    static final class375 field4115 = new class375("LIVE", 0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Loe;")
    static final class375 field4117 = new class375("BUILDLIVE", 3);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Loe;")
    static final class375 field4116 = new class375("RC", 1);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Loe;")
    static final class375 field4118 = new class375("WIP", 2);
    @ObfuscatedName(value="ad")
    public final String field4119;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=185232069)
    final int field4120;

    class375(String string, int n) {
        this.field4119 = string;
        this.field4120 = n;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="-1767959900")
    static int method7630(int n, int n2) {
        class87 class872 = (class87)class87.field1057.method9985(n);
        if (class872 == null) {
            return 0;
        }
        if (n2 >= 0 && n2 < class872.field1059.length) {
            return class872.field1059[n2];
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="mz")
    @ObfuscatedSignature(descriptor="([Lna;II)V", garbageValue="-1975296094")
    static final void method7631(class361[] class361Array, int n) {
        int n2 = 0;
        while (true) {
            block17: {
                class361 class3612;
                block18: {
                    class89 class892;
                    if (n2 >= class361Array.length) {
                        return;
                    }
                    class3612 = class361Array[n2];
                    if (class3612 == null || class3612.field4026 != n || class3612.field3991 && class163.method3777(class3612)) break block17;
                    if (class3612.field3873 != 0) break block18;
                    if (!class3612.field3991 && class163.method3777(class3612) && class3612 != class424.field4739) break block17;
                    class375.method7631(class361Array, class3612.field3910);
                    if (class3612.field4014 != null) {
                        class375.method7631(class3612.field4014, class3612.field3910);
                    }
                    if ((class892 = (class89)client.field664.method9985(class3612.field3910)) != null) {
                        class9.method83(class892.field1073);
                    }
                }
                if (class3612.field3873 == 6) {
                    int n3;
                    int n4;
                    if ((class3612.field3919 != -1 || class3612.field3862 != -1) && (n4 = (n3 = class268.method5754(class3612)) != 0 ? class3612.field3862 : class3612.field3919) != -1) {
                        SequenceDef class2652 = class33.method520(n4);
                        if (class2652.method5672()) {
                            class3612.field4012 += client.field581;
                            int n5 = class2652.method5703();
                            if (class3612.field4012 >= n5) {
                                class3612.field4012 -= class2652.field2932;
                                if (class3612.field4012 < 0 || class3612.field4012 >= n5) {
                                    class3612.field4012 = 0;
                                }
                            }
                            class122.method3325(class3612);
                        } else {
                            class3612.field4013 += client.field581;
                            while (class3612.field4013 > class2652.field2923[class3612.field4012]) {
                                class3612.field4013 -= class2652.field2923[class3612.field4012];
                                ++class3612.field4012;
                                if (class3612.field4012 >= class2652.field2916.length) {
                                    class3612.field4012 -= class2652.field2932;
                                    if (class3612.field4012 < 0 || class3612.field4012 >= class2652.field2916.length) {
                                        class3612.field4012 = 0;
                                    }
                                }
                                class122.method3325(class3612);
                            }
                        }
                    }
                    if (class3612.field3928 != 0 && !class3612.field3991) {
                        n3 = class3612.field3928 >> 16;
                        n4 = class3612.field3928 << 16 >> 16;
                        class3612.field3923 = (n3 *= client.field581) + class3612.field3923 & 0x7FF;
                        class3612.field3994 = (n4 *= client.field581) + class3612.field3994 & 0x7FF;
                        class122.method3325(class3612);
                    }
                }
            }
            ++n2;
        }
    }
}

