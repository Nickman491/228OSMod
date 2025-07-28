/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="oy")
@Implements(value="Calendar")
public class Calendar {
    @ObfuscatedName(value="ay")
    @Export(value="MONTH_NAMES_ENGLISH_GERMAN")
    static final String[][] MONTH_NAMES_ENGLISH_GERMAN = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil", "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};
    @ObfuscatedName(value="ah")
    @Export(value="DAYS_OF_THE_WEEK")
    static final String[] DAYS_OF_THE_WEEK = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    @ObfuscatedName(value="az")
    @Export(value="Calendar_calendar")
    static java.util.Calendar Calendar_calendar;

    static {
        java.util.Calendar.getInstance();
        Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;II[BIB)I", garbageValue="19")
    @Export(value="encodeStringCp1252")
    public static int encodeStringCp1252(CharSequence charSequence, int n, int n2, byte[] byArray, int n3) {
        int n4 = n2 - n;
        int n5 = 0;
        while (n5 < n4) {
            char c = charSequence.charAt(n5 + n);
            byArray[n5 + n3] = c > '\u0000' && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff' ? (int)c : (c == '\u20ac' ? -128 : (c == '\u201a' ? -126 : (c == '\u0192' ? -125 : (c == '\u201e' ? -124 : (c == '\u2026' ? -123 : (c == '\u2020' ? -122 : (c == '\u2021' ? -121 : (c == '\u02c6' ? -120 : (c == '\u2030' ? -119 : (c == '\u0160' ? -118 : (c == '\u2039' ? -117 : (c == '\u0152' ? -116 : (c == '\u017d' ? -114 : (c == '\u2018' ? -111 : (c == '\u2019' ? -110 : (c == '\u201c' ? -109 : (c == '\u201d' ? -108 : (c == '\u2022' ? -107 : (c == '\u2013' ? -106 : (c == '\u2014' ? -105 : (c == '\u02dc' ? -104 : (c == '\u2122' ? -103 : (c == '\u0161' ? -102 : (c == '\u203a' ? -101 : (c == '\u0153' ? -100 : (c == '\u017e' ? -98 : (c == '\u0178' ? -97 : 63)))))))))))))))))))))))))));
            ++n5;
        }
        return n4;
    }

    @ObfuscatedName(value="gi")
    @ObfuscatedSignature(descriptor="(Lmb;B)V", garbageValue="-69")
    static void method7597(PacketBufferNode packetBufferNode) {
        packetBufferNode.packetBuffer.method10333(GraphicsDefaults.field5117.hash);
        packetBufferNode.packetBuffer.method10333(WorldMapSection2.field3102.hash);
        packetBufferNode.packetBuffer.method10333(FaceNormal.field2120.hash);
        packetBufferNode.packetBuffer.method10331(SpotAnimationDefinition.field2704.hash);
        packetBufferNode.packetBuffer.method10332(class157.field1718.hash);
        packetBufferNode.packetBuffer.method10333(class268.archive2.hash);
        packetBufferNode.packetBuffer.method10331(class68.field494.hash);
        packetBufferNode.packetBuffer.method10332(class188.field2104.hash);
        packetBufferNode.packetBuffer.method10332(SoundCache.field291.hash);
        packetBufferNode.packetBuffer.method10268(StructComposition.field2746.hash);
        packetBufferNode.packetBuffer.method10332(class167.archive12.hash);
        packetBufferNode.packetBuffer.method10333(class137.field1603.hash);
        packetBufferNode.packetBuffer.method10268(class59.field398.hash);
        packetBufferNode.packetBuffer.method10268(0);
    }
}

