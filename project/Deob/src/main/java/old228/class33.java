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

@ObfuscatedName(value="bz")
public class class33 {
    @ObfuscatedName(value="oj")
    @ObfuscatedGetter(intValue=-1027343517)
    static int field149;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1927105713)
    int field147;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1996685255)
    int field144;

    class33(int n, int n2) {
        this.field147 = n;
        this.field144 = n2;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lbb;I)Z", garbageValue="2126273148")
    boolean method519(class29 class2910) {
        if (class2910 == null) {
            return false;
        }
        switch (this.field147) {
            case 4: {
                return class2910.vmethod5764(this.field144 == 1);
            }
            default: {
                return false;
            }
            case 1: {
                return class2910.vmethod5756(this.field144);
            }
            case 3: {
                return class2910.vmethod5758((char)this.field144);
            }
            case 2: 
        }
        return class2910.vmethod5757(this.field144);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Lkb;", garbageValue="1208084405")
    public static SequenceDef method520(int n) {
        SequenceDef class2652 = (SequenceDef) SequenceDef.field2917.method6578(n);
        if (class2652 == null) {
            byte[] byArray = SequenceDef.field2919.method7790(12, n);
            class2652 = new SequenceDef();
            if (byArray != null) {
                class2652.method5697(new class556(byArray));
            }
            class2652.method5665();
            SequenceDef.field2917.method6590(class2652, n);
            return class2652;
        }
        return class2652;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIIB)F", garbageValue="86")
    static float method521(int n, int n2, int n3) {
        return (float)(n - n2) / (float)(n3 - n2);
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="38")
    static void method515(boolean bl) {
        if (!(client.field521.method1441() || client.field521.method1293() || client.field521.method1418())) {
            class78.field936 = "";
            class78.field930 = "Enter your username/email & password.";
            class78.field949 = "";
            class114.method3212(2);
            if (bl) {
                class78.field940 = "";
            }
            if (class78.field955 == null || class78.field955.length() <= 0) {
                if (class544.field5403.method2944() == null) {
                    client.field555 = false;
                } else {
                    class78.field955 = class544.field5403.method2944();
                    client.field555 = true;
                }
            }
            class100.method2832();
            return;
        }
        class114.method3212(10);
    }

    @ObfuscatedName(value="jh")
    @ObfuscatedSignature(descriptor="(Ldz;Lda;II)V", garbageValue="1603163751")
    static void method523(class103 class1032, class99 class992, int n) {
        int n2;
        int n3;
        class350 class3502 = class992.method2785(class1032);
        int n4 = class992.field1213;
        int n5 = class992.field1268 * -2132848751 - 1;
        int n6 = n3 = n4 + (n5 << 6);
        int n7 = class992.field1196;
        int n8 = class992.field1268 * -2132848751 - 1;
        int n9 = n2 = n7 + (n8 << 6);
        class4.method18(class1032, class3502.field3764, class3502.field3765, n6, n9, n);
    }

    @ObfuscatedName(value="ni")
    static final void method522(double d) {
        class182.method4004(d);
        ((class194)class182.field1957.field2300).method4478(d);
        if (class420.field4722 != null) {
            class420.field4722.method9843();
        }
        ItemDef.field2849.method6581();
        class544.field5403.method2893(d);
    }
}

