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

@ObfuscatedName(value="pt")
final class class394
implements Comparator {
    class394() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpj;Lpj;I)I", garbageValue="1877472683")
    int method7864(class399 class3992, class399 class3993) {
        return class3992.field4637.field4646 < class3993.field4637.field4646 ? -1 : (class3993.field4637.field4646 == class3992.field4637.field4646 ? 0 : 1);
    }

    public int compare(Object object, Object object2) {
        return this.method7864((class399)object, (class399)object2);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="([BIII)Ljava/lang/String;", garbageValue="512362012")
    public static String method7867(byte[] byArray, int n, int n2) {
        char[] cArray = new char[n2];
        int n3 = 0;
        int n4 = 0;
        while (n4 < n2) {
            int n5 = byArray[n4 + n] & 0xFF;
            if (n5 != 0) {
                if (n5 >= 128 && n5 < 160) {
                    int n6 = class417.field4711[n5 - 128];
                    if (n6 == 0) {
                        n6 = 63;
                    }
                    n5 = n6;
                }
                cArray[n3++] = (char)n5;
            }
            ++n4;
        }
        return new String(cArray, 0, n3);
    }

    @ObfuscatedName(value="mf")
    @ObfuscatedSignature(descriptor="(Lna;IIZI)V", garbageValue="452329856")
    static void method7872(class361 class3612, int n, int n2, boolean bl) {
        int n3 = class3612.field3886;
        int n4 = class3612.field3887 * -1528330031;
        if (class3612.field3878 == 0) {
            class3612.field3886 = class3612.field3929;
        } else if (class3612.field3878 == 1) {
            class3612.field3886 = n - class3612.field3929;
        } else if (class3612.field3878 == 2) {
            class3612.field3886 = class3612.field3929 * n >> 14;
        }
        if (class3612.field3879 == 0) {
            class3612.field3887 = class3612.field3933 * 2037764145;
        } else if (class3612.field3879 == 1) {
            class3612.field3887 = (n2 - class3612.field3933) * 2037764145;
        } else if (class3612.field3879 == 2) {
            class3612.field3887 = (n2 * class3612.field3933 >> 14) * 2037764145;
        }
        if (class3612.field3878 == 4) {
            class3612.field3886 = class3612.field3887 * class3612.field3888 * -1528330031 / class3612.field4008;
        }
        if (class3612.field3879 == 4) {
            class3612.field3887 = class3612.field3886 * class3612.field4008 / class3612.field3888 * 2037764145;
        }
        if (class3612.field3875 == 1337) {
            client.field687 = class3612;
        }
        if (class3612.field3873 == 12) {
            class3612.method7444().method7134(class3612.field3886, class3612.field3887 * -1528330031);
        }
        if (bl && class3612.field3998 != null && (n3 != class3612.field3886 || n4 != class3612.field3887 * -1528330031)) {
            class90 class902 = new class90();
            class902.field1077 = class3612;
            class902.field1086 = class3612.field3998;
            client.field706.method7998(class902);
        }
    }
}

