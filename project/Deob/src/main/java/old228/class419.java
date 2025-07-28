package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 *  np
 */
import java.util.regex.Pattern;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@np
@ObfuscatedName(value="qg")
public final class class419 {
    static {
        Pattern.compile("^\\D*(\\d+)\\D*$");
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;I)I", garbageValue="1866255552")
    public static int method8220(CharSequence charSequence) {
        int n = charSequence.length();
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            n2 = (n2 << 5) - n2 + charSequence.charAt(i);
        }
        return n2;
    }

    @ObfuscatedName(value="mv")
    @ObfuscatedSignature(descriptor="(Lna;I)V", garbageValue="-1747181726")
    static final void method8221(class361 class3612) {
        block18: {
            String string;
            if (class3612.field3874 == 1) {
                class214.method4908(class3612.field4007, "", 24, 0, 0, class3612.field3910, class3612.field4010);
            }
            if (class3612.field3874 == 2 && !client.field522 && (string = class47.method905(class3612)) != null) {
                class214.method4908(string, class97.method2752(65280) + class3612.field4006, 25, 0, -1, class3612.field3910, class3612.field4010);
            }
            if (class3612.field3874 == 3) {
                class6.method44("Close", "", 26, 0, 0, class3612.field3910);
            }
            if (class3612.field3874 == 4) {
                class6.method44(class3612.field4007, "", 28, 0, 0, class3612.field3910);
            }
            if (class3612.field3874 == 5) {
                class6.method44(class3612.field4007, "", 29, 0, 0, class3612.field3910);
            }
            if (class3612.field3874 == 6 && client.field668 == null) {
                class6.method44(class3612.field4007, "", 30, 0, -1, class3612.field3910);
            }
            if (class3612.field3991) {
                if (!client.field522) {
                    int n = 9;
                    while (true) {
                        String string2;
                        if (n < 0) {
                            if (class248.method5351(class232.method5133(class3612))) {
                                class6.method44("Continue", "", 30, 0, class3612.field3863, class3612.field3910);
                            }
                            break block18;
                        }
                        if (n == class3612.field3958 * 1920625471 && (string2 = class47.method905(class3612)) != null) {
                            class214.method4908(string2, class3612.field4024, 25, 0, class3612.field3863, class3612.field3910, class3612.field4010);
                        }
                        string2 = !class250.method5357(class232.method5133(class3612), n) && class3612.field3984 == null ? null : (class3612.field3956 != null && class3612.field3956.length > n && class3612.field3956[n] != null && class3612.field3956[n].trim().length() != 0 ? class3612.field3956[n] : null);
                        String string3 = string2;
                        if (string3 != null) {
                            int n2;
                            int n3;
                            if (n <= class3612.field3958 * 1920625471) {
                                n3 = 57;
                                n2 = class231.method5128(string3, class3612.field4024, n3, n + 1, class3612.field3863, class3612.field3910, class3612.field4010, class3612.field3869, -1);
                            } else {
                                n3 = 1007;
                                n2 = class214.method4908(string3, class3612.field4024, n3, n + 1, class3612.field3863, class3612.field3910, class3612.field4010);
                            }
                            if (class3612.field3957 != null && n < class3612.field3957.length && class3612.field3957[n] != null) {
                                String[] stringArray = class3612.field3957[n];
                                for (int i = stringArray.length - 1; i >= 0; --i) {
                                    int n4 = i + 1 << 16 | n + 1;
                                    if (stringArray[i] == null || stringArray[i].isEmpty()) continue;
                                    class526.method9934(n2, stringArray[i], "", n3, n4, class3612.field3863, class3612.field3910, class3612.field4010, -1);
                                }
                            }
                        }
                        --n;
                    }
                }
                if (class141.method3509(class232.method5133(class3612)) && (class106.field1365 & 0x20) == 32) {
                    class214.method4908(client.field661, client.field662 + " " + "->" + " " + class3612.field4024, 58, 0, class3612.field3863, class3612.field3910, class3612.field4010);
                }
            }
        }
    }
}

