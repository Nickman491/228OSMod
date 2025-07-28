package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 *  np
 *  px
 */
import java.util.Locale;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@px
@np
@ObfuscatedName(value="ph")
public class class406
implements MouseWheel {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lph;")
    public static final class406 field4667 = new class406("EN", "en", "English", class407.field4684, 0, "GB");
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lph;")
    static final class406 field4663 = new class406("DE", "de", "German", class407.field4684, 1, "DE");
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lph;")
    public static final class406 field4665 = new class406("FR", "fr", "French", class407.field4684, 2, "FR");
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lph;")
    static final class406 field4677 = new class406("PT", "pt", "Portuguese", class407.field4684, 3, "BR");
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lph;")
    static final class406 field4668 = new class406("NL", "nl", "Dutch", class407.field4681, 4, "NL");
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lph;")
    public static final class406 field4672 = new class406("ES", "es", "Spanish", class407.field4681, 5, "ES");
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lph;")
    static final class406 field4669 = new class406("ES_MX", "es-mx", "Spanish (Latin American)", class407.field4684, 6, "MX");
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="[Lph;")
    public static final class406[] field4664;
    @ObfuscatedName(value="cq")
    static String field4674;
    @ObfuscatedName(value="ax")
    final String field4670;
    @ObfuscatedName(value="at")
    final String field4671;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-1375478211)
    final int field4666;

    static {
        class406[] class406Array = class406.method7969();
        field4664 = new class406[class406Array.length];
        class406[] class406Array2 = class406Array;
        int n = 0;
        while (true) {
            if (n >= class406Array2.length) {
                return;
            }
            class406 class4062 = class406Array2[n];
            if (field4664[class4062.field4666] != null) break;
            class406.field4664[class4062.field4666] = class4062;
            ++n;
        }
        throw new IllegalStateException();
    }

    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpg;ILjava/lang/String;)V")
    class406(String string, String string2, String string3, class407 class4072, int n, String string4) {
        this.field4670 = string;
        this.field4671 = string2;
        this.field4666 = n;
        if (string4 == null) {
            new Locale(string2.substring(0, 2));
        } else {
            new Locale(string2.substring(0, 2), string4);
        }
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    public int vmethod10703() {
        return this.field4666;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="-439268539")
    String method7971() {
        return this.field4671;
    }

    public String toString() {
        return this.method7971().toLowerCase(Locale.ENGLISH);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Lph;", garbageValue="-1245891173")
    static class406[] method7969() {
        return new class406[]{field4665, field4672, field4677, field4667, field4663, field4669, field4668};
    }

    @ObfuscatedName(value="ah")
    static boolean method7967(long l) {
        int n = (int)(l >>> 14 & 3L);
        return n == 2;
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ldz;[BIIIII)V", garbageValue="1521949636")
    static final void method7975(class103 var0, byte[] var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        if (var0.field1336 == null) ** GOTO lbl5
        var6_6 = 0;
        while (true) {
            block10: {
                if (var6_6 < 4) break block10;
lbl5:
                // 2 sources

                var12_9 = new class556(var1_1);
                var7_7 = 0;
                while (true) {
                    if (var7_7 >= 4) {
                        return;
                    }
                    for (var8_8 = 0; var8_8 < 64; ++var8_8) {
                        for (var9_10 = 0; var9_10 < 64; ++var9_10) {
                            var10_11 = var8_8 + var2_2;
                            var11_12 = var3_3 + var9_10;
                            class28.method454(var0, var12_9, var7_7, var10_11, var11_12, var10_11 + var4_4, var5_5 + var11_12, 0);
                        }
                    }
                    ++var7_7;
                }
            }
            for (var7_7 = 0; var7_7 < 64; ++var7_7) {
                for (var8_8 = 0; var8_8 < 64; ++var8_8) {
                    if (var7_7 + var2_2 <= 0 || var7_7 + var2_2 >= var0.field1336[var6_6].field3003.length || var3_3 + var8_8 <= 0 || var3_3 + var8_8 >= var0.field1336[var6_6].field3003[var7_7 + var2_2].length) continue;
                    v0 = var0.field1336[var6_6].field3003[var7_7 + var2_2];
                    v1 = var8_8 + var3_3;
                    v0[v1] = v0[v1] & -1073741825;
                }
            }
            ++var6_6;
        }
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lcx;I)V", garbageValue="-1719770110")
    static void method7981(class69 class692) {
        if (class692.method1958() != client.field796) {
            client.field796 = class692.method1958();
            class267.method5746(class692.method1958());
        }
        if (class692.field813 != client.field569) {
            class388 class3882 = class42.field276;
            int n = class692.field813;
            class78.field923 = (n & class552.field5431.vmethod10703()) == 0 ? ((n & class552.field5456.vmethod10703()) == 0 ? ((n & class552.field5441.vmethod10703()) == 0 ? class108.method3097(class3882, "logo", "") : class108.method3097(class3882, "logo_speedrunning", "")) : class108.method3097(class3882, "logo_seasonal_mode", "")) : class108.method3097(class3882, "logo_deadman_mode", "");
        }
        class526.field5324 = class692.field807;
        client.field689 = class692.field812;
        client.field569 = class692.field813;
        class255.field2724 = class692.field819;
        class358.field3822 = client.field500 == 0 ? 43594 : class692.field812 + 40000;
        class173.field1829 = client.field500 == 0 ? 443 : class692.field812 + 50000;
        class340.field3702 = class358.field3822;
    }

    @ObfuscatedName(value="it")
    @ObfuscatedSignature(descriptor="(Ldz;I)V", garbageValue="-706406186")
    static final void method7980(class103 class1032) {
        class79 class792 = (class79)class1032.field1338.method7996();
        while (class792 != null) {
            if (class1032.field1321 == class792.field972 && client.field514 <= class792.field968) {
                if (client.field514 >= class792.field982) {
                    class99 class992;
                    int n;
                    if (!class792.field980 && class792.field975 != 0) {
                        if (class792.field975 <= 0) {
                            n = -class792.field975 - 1;
                            class992 = n == client.field623 ? class407.field4693 : class30.field131.field1329[n];
                            if (class992 != null && 0 <= class992.field1213 && class992.field1213 < 13312 && 0 <= class992.field1196 && class992.field1196 < 13312) {
                                class792.field989 = class992.field1213;
                                class792.field965 = class992.field1196;
                                class792.method2453(class792.field985, class792.field967, class792.field964, client.field514);
                            }
                        } else {
                            class992 = class30.field131.field1330[class792.field975 - 1];
                            if (class992 != null && 0 <= class992.field1213 && class992.field1213 < 13312 && 0 <= class992.field1196 && class992.field1196 < 13312) {
                                class792.field989 = class992.field1213;
                                class792.field965 = class992.field1196;
                                class792.method2453(class792.field985, class792.field967, class792.field964, client.field514);
                            }
                        }
                    }
                    if (class792.field976 > 0 && (class992 = class1032.field1330[class792.field976 - 1]) != null && 0 <= class992.field1213 && class992.field1213 < 13312 && 0 <= class992.field1196 && class992.field1196 < 13312) {
                        class792.method2453(class992.field1213, class992.field1196, class23.method337(class1032, class992.field1213, class992.field1196, class792.field972) - class792.field963, client.field514);
                    }
                    if (class792.field976 < 0 && (class992 = (n = -class792.field976 - 1) == client.field623 ? class407.field4693 : class1032.field1329[n]) != null && 0 <= class992.field1213 && class992.field1213 < 13312 && 0 <= class992.field1196 && class992.field1196 < 13312) {
                        class792.method2453(class992.field1213, class992.field1196, class23.method337(class1032, class992.field1213, class992.field1196, class792.field972) - class792.field963, client.field514);
                    }
                    class792.method2459(client.field581);
                    class1032.field1319.method4185(class1032.field1321, (int)class792.field978, (int)class792.field979, (int)class792.field971, 60, class792, class792.field986, -1L, false);
                }
            } else {
                class792.method9623();
            }
            class792 = (class79)class1032.field1338.method8005();
        }
        return;
    }

    @ObfuscatedName(value="kn")
    @ObfuscatedSignature(descriptor="(Ldz;Lvv;II)V", garbageValue="-484128573")
    static void method7972(class103 class1032, class555 class5552, int n) {
        int n2 = class5552.method10282();
        if (n2 < class1032.field1334) {
            throw new RuntimeException("dang");
        }
        if (n2 > class1032.field1334) {
            throw new RuntimeException("dang!");
        }
        class1032.field1334 = 0;
        class274 class2742 = new class274();
        int n3 = 0;
        while (true) {
            int n4;
            int n5;
            if (n3 >= n2) {
                while (true) {
                    class480 class4802;
                    if (class5552.method10230(client.field564.field1452) < 10) {
                        return;
                    }
                    n3 = class5552.method10307();
                    class1032.field1335[++class1032.field1334 - 1] = n3;
                    n5 = class5552.method10282();
                    int n6 = class5552.method10282();
                    n4 = n5 * 8;
                    int n7 = n6 * 8;
                    class103 class1033 = client.field508.method2713(n3, n4, n7, class544.field5403.method2902(), class175.field1838);
                    class1032.field1318[n3] = class4802 = new class480(n3, class1033);
                    class4802.field5027 = class5552.method10524();
                    class274 class2743 = class4802.field5029;
                    class2743.method5900(0, 0);
                    class2743.method5891(0);
                    class2743.method5901(0);
                    class36.method722(class5552, class2743);
                    class4802.method9298(class4802.field5029);
                    if (n < 4) continue;
                    int n8 = class5552.method10284();
                    int n9 = class5552.method10284();
                    class4802.method9334(n8, n9);
                }
            }
            n5 = class1032.field1335[n3];
            class480 class4803 = class1032.field1318[n5];
            n4 = class5552.method10282();
            if (n4 != 0) {
                class1032.field1335[++class1032.field1334 - 1] = n5;
                if (n4 != 1) {
                    class2742.method5899(class4803.method9293());
                    class36.method722(class5552, class2742);
                    if (n4 != 2) {
                        class4803.method9316(class2742);
                    } else {
                        class4803.method9298(class2742);
                    }
                }
            } else {
                client.field508.method2737(class4803.field5035);
                class1032.field1318[n5] = null;
            }
            ++n3;
        }
    }
}

