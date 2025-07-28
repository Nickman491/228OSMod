package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="mr")
public class class323 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmr;")
    public static final class323 field3420 = new class323(7);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmr;")
    public static final class323 field3423 = new class323(4);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lmr;")
    public static final class323 field3421 = new class323(14);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lmr;")
    public static final class323 field3427 = new class323(2);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lmr;")
    public static final class323 field3419 = new class323(5);
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lmr;")
    public static final class323 field3424 = new class323(7);
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lmr;")
    public static final class323 field3425 = new class323(-2);
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lmr;")
    public static final class323 field3422 = new class323(14);
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lmr;")
    public static final class323 field3429 = new class323(7);
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lmr;")
    public static final class323 field3428 = new class323(20);
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Lmr;")
    public static final class323 field3433 = new class323(11);
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lmr;")
    public static final class323 field3430 = new class323(4);
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lmr;")
    public static final class323 field3431 = new class323(17);
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Lmr;")
    public static final class323 field3432 = new class323(6);

    @ObfuscatedSignature(descriptor="(I)V", garbageValue="7")
    class323(int n) {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(CI)C", garbageValue="-1526949369")
    static char method6620(char c) {
        switch (c) {
            case '\u00cd': 
            case '\u00ce': 
            case '\u00cf': 
            case '\u00ed': 
            case '\u00ee': 
            case '\u00ef': {
                return 'i';
            }
            case ' ': 
            case '-': 
            case '_': 
            case '\u00a0': {
                return '_';
            }
            case '\u00d9': 
            case '\u00da': 
            case '\u00db': 
            case '\u00dc': 
            case '\u00f9': 
            case '\u00fa': 
            case '\u00fb': 
            case '\u00fc': {
                return 'u';
            }
            default: {
                return Character.toLowerCase(c);
            }
            case '\u00d1': 
            case '\u00f1': {
                return 'n';
            }
            case '\u00c8': 
            case '\u00c9': 
            case '\u00ca': 
            case '\u00cb': 
            case '\u00e8': 
            case '\u00e9': 
            case '\u00ea': 
            case '\u00eb': {
                return 'e';
            }
            case '#': 
            case '[': 
            case ']': {
                return c;
            }
            case '\u00c0': 
            case '\u00c1': 
            case '\u00c2': 
            case '\u00c3': 
            case '\u00c4': 
            case '\u00e0': 
            case '\u00e1': 
            case '\u00e2': 
            case '\u00e3': 
            case '\u00e4': {
                return 'a';
            }
            case '\u00df': {
                return 'b';
            }
            case '\u00d2': 
            case '\u00d3': 
            case '\u00d4': 
            case '\u00d5': 
            case '\u00d6': 
            case '\u00f2': 
            case '\u00f3': 
            case '\u00f4': 
            case '\u00f5': 
            case '\u00f6': {
                return 'o';
            }
            case '\u00ff': 
            case '\u0178': {
                return 'y';
            }
            case '\u00c7': 
            case '\u00e7': 
        }
        return 'c';
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ja")
    @ObfuscatedSignature(descriptor="(IIIIII)V", garbageValue="-2114364667")
    static void method6617(int n, int n2, int n3, int n4, int n5) {
        class410 class4102 = class30.field131.field1327[n][n2][n3];
        if (class4102 == null) return;
        class109 class1092 = (class109)class4102.method7996();
        while (true) {
            block4: {
                block3: {
                    if (class1092 == null) break block3;
                    if ((n4 & Short.MAX_VALUE) != class1092.field1389 || n5 != class1092.field1385) break block4;
                    class1092.method3106();
                }
                class453.method8927(n, n2, n3);
                return;
            }
            class1092 = (class109)class4102.method8005();
        }
    }

    @ObfuscatedName(value="kl")
    @ObfuscatedSignature(descriptor="(IIIIIIII)Z", garbageValue="-2123451935")
    static boolean method6619(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        class206 class2062;
        block24: {
            block23: {
                class187 class1872;
                block22: {
                    class1872 = class30.field131.field1319;
                    if (n6 == class384.field4498.field4495) break block22;
                    if (n6 != class384.field4494.field4495) {
                        if (n6 != class384.field4496.field4495) {
                            class178 class1782;
                            if (n6 == class384.field4497.field4495 && (class1782 = class1872.method4199(n, n2, n3)) != null) {
                                class1782.field1896 = new class82(class30.field131, class360.method7406(class1782.field1894), 22, n5, n, n2, n3, n7, false, class1782.field1896);
                                return true;
                            }
                        } else {
                            class209 class2092 = class1872.method4280(n, n2, n3);
                            if (n4 == class370.field4082.field4087) {
                                n4 = class370.field4086.field4087;
                            }
                            if (class2092 != null) {
                                class2092.field2339 = new class82(class30.field131, class360.method7406(class2092.field2347), n4, n5, n, n2, n3, n7, false, class2092.field2339);
                                return true;
                            }
                        }
                    } else {
                        class208 class2082 = class1872.method4230(n, n2, n3);
                        if (class2082 != null) {
                            int n8 = class360.method7406(class2082.field2332);
                            if (n4 != class370.field4071.field4087 && n4 != class370.field4072.field4087) {
                                if (n4 != class370.field4069.field4087) {
                                    if (n4 != class370.field4090.field4087) {
                                        if (n4 == class370.field4075.field4087) {
                                            class2082.field2329 = new class82(class30.field131, n8, 4, n5 + 4, n, n2, n3, n7, false, class2082.field2329);
                                            class2082.field2328 = new class82(class30.field131, n8, 4, (n5 + 2 & 3) + 4, n, n2, n3, n7, false, class2082.field2328);
                                        }
                                    } else {
                                        class2082.field2329 = new class82(class30.field131, n8, 4, (n5 + 2 & 3) + 4, n, n2, n3, n7, false, class2082.field2329);
                                    }
                                } else {
                                    class2082.field2329 = new class82(class30.field131, n8, 4, n5 + 4, n, n2, n3, n7, false, class2082.field2329);
                                }
                            } else {
                                class2082.field2329 = new class82(class30.field131, n8, 4, n5, n, n2, n3, n7, false, class2082.field2329);
                            }
                            return true;
                        }
                    }
                    break block23;
                }
                class2062 = class1872.method4257(n, n2, n3);
                if (class2062 != null) break block24;
            }
            return false;
        }
        int n9 = class360.method7406(class2062.field2320);
        if (n4 != class370.field4070.field4087) {
            class2062.field2318 = new class82(class30.field131, n9, n4, n5, n, n2, n3, n7, false, class2062.field2318);
        } else {
            class2062.field2318 = new class82(class30.field131, n9, 2, n5 + 4, n, n2, n3, n7, false, class2062.field2318);
            class2062.field2319 = new class82(class30.field131, n9, 2, n5 + 1 & 3, n, n2, n3, n7, false, class2062.field2319);
        }
        return true;
    }
}

