/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="iv")
public class class232
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="KitDefinition_cached")
    static EvictingDualNodeHashTable KitDefinition_cached = new EvictingDualNodeHashTable(64);
    @ObfuscatedName(value="bz")
    static Image field2500;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(CI)B", garbageValue="2093153434")
    @Export(value="charToByteCp1252")
    public static byte charToByteCp1252(char c) {
        int n = c > '\u0000' && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff' ? (int)c : (c == '\u20ac' ? -128 : (c == '\u201a' ? -126 : (c == '\u0192' ? -125 : (c == '\u201e' ? -124 : (c == '\u2026' ? -123 : (c == '\u2020' ? -122 : (c == '\u2021' ? -121 : (c == '\u02c6' ? -120 : (c == '\u2030' ? -119 : (c == '\u0160' ? -118 : (c == '\u2039' ? -117 : (c == '\u0152' ? -116 : (c == '\u017d' ? -114 : (c == '\u2018' ? -111 : (c == '\u2019' ? -110 : (c == '\u201c' ? -109 : (c == '\u201d' ? -108 : (c == '\u2022' ? -107 : (c == '\u2013' ? -106 : (c == '\u2014' ? -105 : (c == '\u02dc' ? -104 : (c == '\u2122' ? -103 : (c == '\u0161' ? -102 : (c == '\u203a' ? -101 : (c == '\u0153' ? -100 : (c == '\u017e' ? -98 : (c == '\u0178' ? -97 : 63)))))))))))))))))))))))))));
        return (byte)n;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="([BIIS)Ljava/lang/String;", garbageValue="-29647")
    static String method5130(byte[] byArray, int n, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = n;
        while (n3 < n2 + n) {
            int n4 = byArray[n3] & 0xFF;
            stringBuilder.append(class418.field4713[n4 >>> 2]);
            if (n3 >= n2 - 1) {
                stringBuilder.append(class418.field4713[(n4 & 3) << 4]).append("==");
            } else {
                int n5 = byArray[n3 + 1] & 0xFF;
                stringBuilder.append(class418.field4713[(n4 & 3) << 4 | n5 >>> 4]);
                if (n3 >= n2 - 2) {
                    stringBuilder.append(class418.field4713[(n5 & 0xF) << 2]).append("=");
                } else {
                    int n6 = byArray[n3 + 2] & 0xFF;
                    stringBuilder.append(class418.field4713[(n5 & 0xF) << 2 | n6 >>> 6]).append(class418.field4713[n6 & 0x3F]);
                }
            }
            n3 += 3;
        }
        return stringBuilder.toString();
    }

    @ObfuscatedName(value="oi")
    @ObfuscatedSignature(descriptor="(Lna;I)I", garbageValue="1955912193")
    @Export(value="getWidgetFlags")
    static int getWidgetFlags(Widget widget) {
        IntegerNode integerNode = (IntegerNode)Client.widgetFlags.get((long)widget.childIndex + ((long)widget.id << 32));
        if (integerNode != null) {
            return integerNode.integer;
        }
        return widget.flags;
    }
}

