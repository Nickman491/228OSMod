/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="iu")
public class class211
extends class226 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1492450491)
    int field2353;
    @ObfuscatedSignature(descriptor="Lic;")
    final /* synthetic */ class223 this$0;

    @ObfuscatedSignature(descriptor="(Lic;Ljava/lang/String;I)V")
    class211(class223 class2232, String string, int n) {
        this.this$0 = class2232;
        super(class2232, string);
        this.field2353 = n;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-681041604")
    public int vmethod5060() {
        return 0;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="2027661207")
    public int vmethod5064() {
        return this.field2353;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-83")
    public static void method4837() {
        class241.field2583.clear();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lph;I)I", garbageValue="783041897")
    @Export(value="compareStrings")
    public static int compareStrings(CharSequence charSequence, CharSequence charSequence2, Language language) {
        char c;
        char c2;
        int n = charSequence.length();
        int n2 = charSequence2.length();
        int n3 = 0;
        int n4 = 0;
        char c3 = '\u0000';
        char c4 = '\u0000';
        do {
            if (n3 - c3 >= n && n4 - c4 >= n2) {
                char c5 = Math.min(n, n2);
                c2 = '\u0000';
                while (true) {
                    char c6;
                    char c7;
                    if (c2 >= c5) {
                        c2 = n - n2;
                        if (c2 != '\u0000') {
                            return c2;
                        }
                        c7 = '\u0000';
                        while (true) {
                            if (c7 >= c5) {
                                return 0;
                            }
                            c6 = charSequence.charAt(c7);
                            char c8 = charSequence2.charAt(c7);
                            if (c6 != c8) {
                                return class390.lowercaseChar(c6, language) - class390.lowercaseChar(c8, language);
                            }
                            ++c7;
                        }
                    }
                    if (language != Language.Language_FR) {
                        n3 = n4 = c2;
                    } else {
                        n3 = n - 1 - c2;
                        n4 = n2 - 1 - c2;
                    }
                    c7 = charSequence.charAt(n3);
                    c6 = charSequence2.charAt(n4);
                    if (c7 != c6 && Character.toUpperCase(c7) != Character.toUpperCase(c6) && (c7 = Character.toLowerCase(c7)) != (c6 = Character.toLowerCase(c6))) {
                        return class390.lowercaseChar(c7, language) - class390.lowercaseChar(c6, language);
                    }
                    ++c2;
                }
            }
            if (n3 - c3 >= n) {
                return -1;
            }
            if (n4 - c4 >= n2) {
                return 1;
            }
            if (c3 == '\u0000') {
                c = charSequence.charAt(n3++);
            } else {
                c = c3;
                c3 = '\u0000';
            }
            if (c4 == '\u0000') {
                c2 = charSequence2.charAt(n4++);
            } else {
                c2 = c4;
                c4 = '\u0000';
            }
            c3 = class172.method3861(c);
            c4 = class172.method3861(c2);
            c = HealthBarUpdate.standardizeChar(c, language);
        } while ((c2 = (char)HealthBarUpdate.standardizeChar(c2, language)) == c || Character.toUpperCase(c) == Character.toUpperCase(c2) || (c = Character.toLowerCase(c)) == (c2 = Character.toLowerCase(c2)));
        return class390.lowercaseChar(c, language) - class390.lowercaseChar(c2, language);
    }

    @ObfuscatedName(value="oy")
    @ObfuscatedSignature(descriptor="(Lna;S)Lna;", garbageValue="3509")
    static Widget method4832(Widget widget) {
        int n = class232.getWidgetFlags(widget);
        int n2 = n >> 17 & 7;
        int n3 = n2;
        if (n3 == 0) {
            return null;
        }
        int n4 = 0;
        while (n4 < n3) {
            widget = ClanChannel.field1807.method7031(widget.parentId);
            if (widget == null) {
                return null;
            }
            ++n4;
        }
        return widget;
    }
}

