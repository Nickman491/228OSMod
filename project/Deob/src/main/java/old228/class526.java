package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="un")
public class class526 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lun;")
    public static final class526 field5312 = new class526("p11_full");
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lun;")
    public static final class526 field5322 = new class526("p12_full");
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lun;")
    public static final class526 field5313 = new class526("b12_full");
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lun;")
    public static final class526 field5314 = new class526("verdana_11pt_regular");
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lun;")
    public static final class526 field5315 = new class526("verdana_13pt_regular");
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lun;")
    public static final class526 field5320 = new class526("verdana_15pt_regular");
    @ObfuscatedName(value="au")
    public static short[] field5323;
    @ObfuscatedName(value="gn")
    static String field5324;
    @ObfuscatedName(value="ig")
    @ObfuscatedSignature(descriptor="Lqw;")
    static class435 field5319;
    @ObfuscatedName(value="ae")
    String field5317;

    class526(String string) {
        this.field5317 = string;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Lun;", garbageValue="-1551767491")
    public static class526[] method9935() {
        return new class526[]{field5315, field5322, field5314, field5320, field5313, field5312};
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-1973306811")
    public static int method9937(int n) {
        long l = class199.field2270[n];
        int n2 = (int)(l >>> 14 & 3L);
        return n2;
    }

    @ObfuscatedName(value="li")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;Ljava/lang/String;IIIIIII)V", garbageValue="-127263735")
    static final void method9934(int n, String string, String string2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (client.field647) {
            return;
        }
        if (!class302.method6465(n7, n2)) {
            return;
        }
        if (n >= 0 && n < client.field648.field5623.length) {
            if (client.field648.field5623[n] == null) {
                client.field648.field5623[n] = new class575(false);
            }
            client.field648.field5623[n].method10927(string, string2, n2, n3, n4, n5, n6, false, n7);
            return;
        }
    }

    @ObfuscatedName(value="lh")
    @ObfuscatedSignature(descriptor="(IB)Ljava/lang/String;", garbageValue="-5")
    static final String method9938(int n) {
        String string = Integer.toString(n);
        int n2 = string.length() - 3;
        while (true) {
            if (n2 <= 0) {
                if (string.length() > 9) {
                    return " " + class97.method2752(65408) + string.substring(0, string.length() - 8) + "M" + " " + " (" + string + ")" + "</col>";
                }
                if (string.length() > 6) {
                    return " " + class97.method2752(0xFFFFFF) + string.substring(0, string.length() - 4) + "K" + " " + " (" + string + ")" + "</col>";
                }
                return " " + class97.method2752(0xFFFF00) + string + "</col>";
            }
            string = string.substring(0, n2) + "," + string.substring(n2);
            n2 -= 3;
        }
    }

    @ObfuscatedName(value="nq")
    @ObfuscatedSignature(descriptor="(IIIILvf;Lnf;B)V", garbageValue="1")
    static final void method9936(int n, int n2, int n3, int n4, class570 class5702, class348 class3482) {
        if (class5702 == null) {
            return;
        }
        int n5 = client.field503 & 0x7FF;
        int n6 = n4 * n4 + n3 * n3;
        if (n6 > 6400) {
            return;
        }
        int n7 = class182.field1954[n5];
        int n8 = class182.field1955[n5];
        int n9 = n8 * n3 + n4 * n7 >> 16;
        int n10 = n4 * n8 - n7 * n3 >> 16;
        if (n6 > 2500) {
            class5702.method10758(n9 + class3482.field3754 / 2 - class5702.field5574 / 2, class3482.field3753 / 2 - n10 - class5702.field5575 / 2, n, n2, class3482.field3754, class3482.field3753, class3482.field3755, class3482.field3752);
        } else {
            class5702.method10774(n + n9 + class3482.field3754 / 2 - class5702.field5574 / 2, class3482.field3753 / 2 + n2 - n10 - class5702.field5575 / 2);
        }
    }
}

