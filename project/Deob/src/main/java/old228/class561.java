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

@ObfuscatedName(value="vx")
public class class561
implements MouseWheel {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lvx;")
    public static final class561 field5530 = new class561(3, 0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lvx;")
    public static final class561 field5525 = new class561(0, 2);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lvx;")
    static final class561 field5526 = new class561(1, 5);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lvx;")
    static final class561 field5527 = new class561(2, 6);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lvx;")
    static final class561 field5524 = new class561(4, 7);
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lvx;")
    static final class561 field5529 = new class561(5, 8);
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-42420991)
    static int field5532;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=994383499)
    final int field5528;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-2080132907)
    final int field5531;

    class561(int n, int n2) {
        this.field5528 = n;
        this.field5531 = n2;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="328272051")
    public boolean method10576() {
        return this == field5525;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    public int vmethod10703() {
        return this.field5531;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)Ljava/lang/String;", garbageValue="-106")
    public static String method10574(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length());
        int n = 0;
        int n2 = -1;
        int n3 = 0;
        while (true) {
            if (n3 >= string.length()) {
                if (n < string.length()) {
                    stringBuilder.append(string.substring(n, string.length()));
                }
                return stringBuilder.toString();
            }
            char c = string.charAt(n3);
            if (c != '<') {
                if (c == '>' && n2 != -1) {
                    String string2 = string.substring(n2 + 1, n3);
                    n2 = -1;
                    if (!string2.equals("lt")) {
                        if (!string2.equals("gt")) {
                            if (string2.equals("br")) {
                                stringBuilder.append("\n");
                            }
                        } else {
                            stringBuilder.append(">");
                        }
                    } else {
                        stringBuilder.append("<");
                    }
                    n = n3 + 1;
                }
            } else {
                stringBuilder.append(string.substring(n, n3));
                n2 = n3;
            }
            ++n3;
        }
    }
}

