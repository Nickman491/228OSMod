package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="nt")
public class class344
implements Comparator {
    class344() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lmj;Lmj;S)I", garbageValue="2602")
    int method6935(class337 class3372, class337 class3373) {
        return class3372.field3689 - class3373.field3689;
    }

    public int compare(Object object, Object object2) {
        return this.method6935((class337)object, (class337)object2);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([BI)Lld;", garbageValue="-185429957")
    static class296 method6934(byte[] byArray) {
        if (byArray == null) {
            return new class296();
        }
        return new class296(class395.method7878((byte[])byArray).field5576);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;Ljava/lang/String;I)I", garbageValue="2132988122")
    public static int method6942(class556 class5562, String string) {
        int n = class5562.field5471;
        int n2 = string.length();
        byte[] byArray = new byte[n2];
        int n3 = 0;
        while (true) {
            if (n3 >= n2) {
                byte[] byArray2;
                byte[] byArray3 = byArray2 = byArray;
                class5562.method10280(byArray3.length);
                class5562.field5471 += class364.field4040.method7572(byArray3, 0, byArray3.length, class5562.field5470, class5562.field5471);
                return class5562.field5471 - n;
            }
            char c = string.charAt(n3);
            byArray[n3] = c > '\u0000' && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff' ? (int)c : (c == '\u20ac' ? -128 : (c == '\u201a' ? -126 : (c == '\u0192' ? -125 : (c == '\u201e' ? -124 : (c == '\u2026' ? -123 : (c == '\u2020' ? -122 : (c == '\u2021' ? -121 : (c == '\u02c6' ? -120 : (c == '\u2030' ? -119 : (c == '\u0160' ? -118 : (c == '\u2039' ? -117 : (c == '\u0152' ? -116 : (c == '\u017d' ? -114 : (c == '\u2018' ? -111 : (c == '\u2019' ? -110 : (c == '\u201c' ? -109 : (c == '\u201d' ? -108 : (c == '\u2022' ? -107 : (c == '\u2013' ? -106 : (c == '\u2014' ? -105 : (c == '\u02dc' ? -104 : (c == '\u2122' ? -103 : (c == '\u0161' ? -102 : (c == '\u203a' ? -101 : (c == '\u0153' ? -100 : (c == '\u017e' ? -98 : (c == '\u0178' ? -97 : 63)))))))))))))))))))))))))));
            ++n3;
        }
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(IIII)D", garbageValue="791398229")
    static double method6945(int n, int n2, int n3) {
        double d;
        double d2 = d = n2 > 0 ? (double)Math.max(0.0f, Math.min(1.0f, (float)n / (float)n2)) : 1.0;
        if (!(d <= 0.0) && !(d >= 1.0)) {
            switch (n3) {
                default: {
                    return d;
                }
                case 11: {
                    return 1.0 - Math.pow(1.0 - d, 4.0);
                }
                case 18: {
                    return d < 0.5 ? Math.pow(2.0, 10.0 + 20.0 * d) / 2.0 : (2.0 - Math.pow(2.0, -20.0 * d + 10.0)) / 2.0;
                }
                case 0: {
                    return d;
                }
                case 27: {
                    double d3 = 1.3962634015954636;
                    double d4 = Math.sin((20.0 * d - 11.125) * 1.3962634015954636);
                    return d < 0.5 ? -(Math.pow(2.0, d * 20.0 - 10.0) * d4) / 2.0 : Math.pow(2.0, -20.0 * d + 10.0) * d4 / 2.0 + 1.0;
                }
                case 15: {
                    return d < 0.5 ? d * (8.0 * d) * d * d * d : 1.0 - Math.pow(2.0 + -2.0 * d, 5.0) / 2.0;
                }
                case 6: {
                    return d < 0.5 ? d * (2.0 * d) : 1.0 - Math.pow(-2.0 * d + 2.0, 2.0) / 2.0;
                }
                case 10: {
                    return d * (d * d * d);
                }
                case 17: {
                    return 1.0 - Math.pow(2.0, -10.0 * d);
                }
                case 23: {
                    double d5 = 1.70158;
                    double d6 = 2.70158;
                    return 1.0 + 2.70158 * Math.pow(d - 1.0, 3.0) + 1.70158 * Math.pow(d - 1.0, 2.0);
                }
                case 3: {
                    return -(Math.cos(Math.PI * d) - 1.0) / 2.0;
                }
                case 4: {
                    return d * d;
                }
                case 14: {
                    return 1.0 - Math.pow(1.0 - d, 5.0);
                }
                case 12: {
                    return d < 0.5 ? d * (d * (8.0 * d) * d) : 1.0 - Math.pow(2.0 + d * -2.0, 4.0) / 2.0;
                }
                case 5: {
                    return 1.0 - (1.0 - d) * (1.0 - d);
                }
                case 9: {
                    return d < 0.5 ? d * 4.0 * d * d : 1.0 - Math.pow(d * -2.0 + 2.0, 3.0) / 2.0;
                }
                case 21: {
                    return d < 0.5 ? (1.0 - Math.sqrt(1.0 - Math.pow(d * 2.0, 2.0))) / 2.0 : (Math.sqrt(1.0 - Math.pow(d * -2.0 + 2.0, 2.0)) + 1.0) / 2.0;
                }
                case 24: {
                    double d7 = 1.70158;
                    double d8 = 2.5949095;
                    return d < 0.5 ? Math.pow(2.0 * d, 2.0) * (d * 7.189819 - 2.5949095) / 2.0 : (Math.pow(2.0 * d - 2.0, 2.0) * ((d * 2.0 - 2.0) * 3.5949095 + 2.5949095) + 2.0) / 2.0;
                }
                case 2: {
                    return Math.sin(Math.PI * d / 2.0);
                }
                case 26: {
                    double d9 = 2.0943951023931953;
                    return Math.pow(2.0, -10.0 * d) * Math.sin((10.0 * d - 0.75) * 2.0943951023931953) + 1.0;
                }
                case 13: {
                    return d * (d * (d * d * d));
                }
                case 1: {
                    return 1.0 - Math.cos(d * Math.PI / 2.0);
                }
                case 8: {
                    return 1.0 - Math.pow(1.0 - d, 3.0);
                }
                case 22: {
                    double d10 = 1.70158;
                    double d11 = 2.70158;
                    return d * 2.70158 * d * d - d * (1.70158 * d);
                }
                case 20: {
                    return Math.sqrt(1.0 - Math.pow(d - 1.0, 2.0));
                }
                case 16: {
                    return Math.pow(2.0, d * 10.0 - 10.0);
                }
                case 19: {
                    return 1.0 - Math.sqrt(1.0 - Math.pow(d, 2.0));
                }
                case 7: {
                    return d * (d * d);
                }
                case 25: 
            }
            double d12 = 2.0943951023931953;
            return -Math.pow(2.0, d * 10.0 - 10.0) * Math.sin(2.0943951023931953 * (10.0 * d - 10.75));
        }
        return d <= 0.0 ? 0.0 : 1.0;
    }

    @ObfuscatedName(value="bz")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-140887058")
    static int method6944(int n, class81 class812, boolean bl) {
        if (n != 4000) {
            if (n != 4001) {
                if (n != 4002) {
                    if (n != 4003) {
                        if (n != 4004) {
                            if (n != 4005) {
                                if (n != 4006) {
                                    if (n != 4007) {
                                        if (n != 4008) {
                                            if (n != 4009) {
                                                if (n != 4010) {
                                                    if (n != 4011) {
                                                        if (n != 4012) {
                                                            if (n != 4013) {
                                                                if (n != 4014) {
                                                                    if (n != 4015) {
                                                                        if (n != 4016) {
                                                                            if (n != 4017) {
                                                                                if (n != 4018) {
                                                                                    if (n != 4025) {
                                                                                        if (n != 4026) {
                                                                                            if (n != 4027) {
                                                                                                if (n != 4028) {
                                                                                                    if (n != 4029) {
                                                                                                        if (n != 4030) {
                                                                                                            if (n != 4032) {
                                                                                                                if (n != 4033) {
                                                                                                                    if (n != 4034) {
                                                                                                                        if (n != 4035) {
                                                                                                                            if (n != 4036) {
                                                                                                                                return 2;
                                                                                                                            }
                                                                                                                            String string = class72.field855[--class104.field1343];
                                                                                                                            int n2 = -1;
                                                                                                                            if (class426.method8330(string)) {
                                                                                                                                n2 = class278.method5972(string);
                                                                                                                            }
                                                                                                                            class72.field865[++class63.field444 - 1] = n2;
                                                                                                                            return 1;
                                                                                                                        }
                                                                                                                        class72.field865[class63.field444 - 1] = Math.abs(class72.field865[class63.field444 - 1]);
                                                                                                                        return 1;
                                                                                                                    }
                                                                                                                    int n3 = class72.field865[class63.field444 -= 2];
                                                                                                                    int n4 = class72.field865[class63.field444 + 1];
                                                                                                                    int n5 = class251.method5360(n3, n4);
                                                                                                                    class72.field865[++class63.field444 - 1] = n5;
                                                                                                                    return 1;
                                                                                                                }
                                                                                                                class72.field865[class63.field444 - 1] = class10.method100(class72.field865[class63.field444 - 1]);
                                                                                                                return 1;
                                                                                                            }
                                                                                                            class72.field865[class63.field444 - 1] = class287.method6279(class72.field865[class63.field444 - 1]);
                                                                                                            return 1;
                                                                                                        }
                                                                                                        int n6 = class72.field865[class63.field444 -= 4];
                                                                                                        int n7 = class72.field865[class63.field444 + 1];
                                                                                                        int n8 = class72.field865[class63.field444 + 2];
                                                                                                        int n9 = class72.field865[class63.field444 + 3];
                                                                                                        n6 = class191.method4463(n6, n8, n9);
                                                                                                        int n10 = ItemDef.method5643(n9 - n8 + 1);
                                                                                                        if (n7 > n10) {
                                                                                                            n7 = n10;
                                                                                                        }
                                                                                                        class72.field865[++class63.field444 - 1] = n6 | n7 << n8;
                                                                                                        return 1;
                                                                                                    }
                                                                                                    int n11 = class72.field865[class63.field444 -= 3];
                                                                                                    int n12 = class72.field865[class63.field444 + 1];
                                                                                                    int n13 = class72.field865[class63.field444 + 2];
                                                                                                    int n14 = 31 - n13;
                                                                                                    class72.field865[++class63.field444 - 1] = n11 << n14 >>> n12 + n14;
                                                                                                    return 1;
                                                                                                }
                                                                                                int n15 = class72.field865[class63.field444 -= 3];
                                                                                                int n16 = class72.field865[class63.field444 + 1];
                                                                                                int n17 = class72.field865[class63.field444 + 2];
                                                                                                class72.field865[++class63.field444 - 1] = class191.method4463(n15, n16, n17);
                                                                                                return 1;
                                                                                            }
                                                                                            int n18 = class72.field865[class63.field444 -= 3];
                                                                                            int n19 = class72.field865[class63.field444 + 1];
                                                                                            int n20 = class72.field865[class63.field444 + 2];
                                                                                            class72.field865[++class63.field444 - 1] = class458.method8966(n18, n19, n20);
                                                                                            return 1;
                                                                                        }
                                                                                        int n21 = class72.field865[class63.field444 -= 2];
                                                                                        int n22 = class72.field865[class63.field444 + 1];
                                                                                        class72.field865[++class63.field444 - 1] = n21 ^ 1 << n22;
                                                                                        return 1;
                                                                                    }
                                                                                    int n23 = class206.method4809(class72.field865[--class63.field444]);
                                                                                    class72.field865[++class63.field444 - 1] = n23;
                                                                                    return 1;
                                                                                }
                                                                                long l = class72.field865[class63.field444 -= 3];
                                                                                long l2 = class72.field865[class63.field444 + 1];
                                                                                long l3 = class72.field865[class63.field444 + 2];
                                                                                class72.field865[++class63.field444 - 1] = (int)(l3 * l / l2);
                                                                                return 1;
                                                                            }
                                                                            int n24 = class72.field865[class63.field444 -= 2];
                                                                            int n25 = class72.field865[class63.field444 + 1];
                                                                            class72.field865[++class63.field444 - 1] = n24 > n25 ? n24 : n25;
                                                                            return 1;
                                                                        }
                                                                        int n26 = class72.field865[class63.field444 -= 2];
                                                                        int n27 = class72.field865[class63.field444 + 1];
                                                                        class72.field865[++class63.field444 - 1] = n26 < n27 ? n26 : n27;
                                                                        return 1;
                                                                    }
                                                                    int n28 = class72.field865[class63.field444 -= 2];
                                                                    int n29 = class72.field865[class63.field444 + 1];
                                                                    class72.field865[++class63.field444 - 1] = n28 | n29;
                                                                    return 1;
                                                                }
                                                                int n30 = class72.field865[class63.field444 -= 2];
                                                                int n31 = class72.field865[class63.field444 + 1];
                                                                class72.field865[++class63.field444 - 1] = n30 & n31;
                                                                return 1;
                                                            }
                                                            int n32 = class72.field865[class63.field444 -= 2];
                                                            int n33 = class72.field865[class63.field444 + 1];
                                                            if (n32 != 0) {
                                                                switch (n33) {
                                                                    case 2: {
                                                                        class72.field865[++class63.field444 - 1] = (int)Math.sqrt(n32);
                                                                        break;
                                                                    }
                                                                    default: {
                                                                        class72.field865[++class63.field444 - 1] = (int)Math.pow(n32, 1.0 / (double)n33);
                                                                        break;
                                                                    }
                                                                    case 1: {
                                                                        class72.field865[++class63.field444 - 1] = n32;
                                                                        break;
                                                                    }
                                                                    case 3: {
                                                                        class72.field865[++class63.field444 - 1] = (int)Math.cbrt(n32);
                                                                        break;
                                                                    }
                                                                    case 0: {
                                                                        class72.field865[++class63.field444 - 1] = Integer.MAX_VALUE;
                                                                        break;
                                                                    }
                                                                    case 4: {
                                                                        class72.field865[++class63.field444 - 1] = (int)Math.sqrt(Math.sqrt(n32));
                                                                    }
                                                                }
                                                                return 1;
                                                            }
                                                            class72.field865[++class63.field444 - 1] = 0;
                                                            return 1;
                                                        }
                                                        int n34 = class72.field865[class63.field444 -= 2];
                                                        int n35 = class72.field865[class63.field444 + 1];
                                                        class72.field865[++class63.field444 - 1] = n34 == 0 ? 0 : (int)Math.pow(n34, n35);
                                                        return 1;
                                                    }
                                                    int n36 = class72.field865[class63.field444 -= 2];
                                                    int n37 = class72.field865[class63.field444 + 1];
                                                    class72.field865[++class63.field444 - 1] = n36 % n37;
                                                    return 1;
                                                }
                                                int n38 = class72.field865[class63.field444 -= 2];
                                                int n39 = class72.field865[class63.field444 + 1];
                                                class72.field865[++class63.field444 - 1] = (n38 & 1 << n39) != 0 ? 1 : 0;
                                                return 1;
                                            }
                                            int n40 = class72.field865[class63.field444 -= 2];
                                            int n41 = class72.field865[class63.field444 + 1];
                                            class72.field865[++class63.field444 - 1] = n40 & -1 - (1 << n41);
                                            return 1;
                                        }
                                        int n42 = class72.field865[class63.field444 -= 2];
                                        int n43 = class72.field865[class63.field444 + 1];
                                        class72.field865[++class63.field444 - 1] = n42 | 1 << n43;
                                        return 1;
                                    }
                                    int n44 = class72.field865[class63.field444 -= 2];
                                    int n45 = class72.field865[class63.field444 + 1];
                                    class72.field865[++class63.field444 - 1] = n44 + n45 * n44 / 100;
                                    return 1;
                                }
                                int n46 = class72.field865[class63.field444 -= 5];
                                int n47 = class72.field865[class63.field444 + 1];
                                int n48 = class72.field865[class63.field444 + 2];
                                int n49 = class72.field865[class63.field444 + 3];
                                int n50 = class72.field865[class63.field444 + 4];
                                class72.field865[++class63.field444 - 1] = n46 + (n50 - n48) * (n47 - n46) / (n49 - n48);
                                return 1;
                            }
                            int n51 = class72.field865[--class63.field444];
                            class72.field865[++class63.field444 - 1] = (int)(Math.random() * (double)(n51 + 1));
                            return 1;
                        }
                        int n52 = class72.field865[--class63.field444];
                        class72.field865[++class63.field444 - 1] = (int)(Math.random() * (double)n52);
                        return 1;
                    }
                    int n53 = class72.field865[class63.field444 -= 2];
                    int n54 = class72.field865[class63.field444 + 1];
                    class72.field865[++class63.field444 - 1] = n53 / n54;
                    return 1;
                }
                int n55 = class72.field865[class63.field444 -= 2];
                int n56 = class72.field865[class63.field444 + 1];
                class72.field865[++class63.field444 - 1] = n55 * n56;
                return 1;
            }
            int n57 = class72.field865[class63.field444 -= 2];
            int n58 = class72.field865[class63.field444 + 1];
            class72.field865[++class63.field444 - 1] = n57 - n58;
            return 1;
        }
        int n59 = class72.field865[class63.field444 -= 2];
        int n60 = class72.field865[class63.field444 + 1];
        class72.field865[++class63.field444 - 1] = n60 + n59;
        return 1;
    }
}

