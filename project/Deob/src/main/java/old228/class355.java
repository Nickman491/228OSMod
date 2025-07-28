package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.text.ParseException;
import java.util.Date;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ng")
public class class355 {
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lbl;")
    public static class51 field3788;
    @ObfuscatedName(value="al")
    static String[] field3789;

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1982481347")
    static boolean method7042() {
        Date date;
        try {
            date = class73.method2338();
        }
        catch (ParseException parseException) {
            class114.method3212(7);
            class150.method3595("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (date == null) {
            return false;
        }
        boolean bl = class139.method3500(date);
        Date date2 = class81.method2490();
        boolean bl2 = date.after(date2);
        boolean bl3 = bl2;
        if (!bl3) {
            class84.method2574("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        class121.field1481 = !bl ? 0x7FFFFF : (int)(date.getTime() / 86400000L - 11745L);
        return true;
    }

    @ObfuscatedName(value="ip")
    @ObfuscatedSignature(descriptor="(Ldz;IIB)V", garbageValue="25")
    static final void method7041(class103 class1032, int n, int n2) {
        if (client.field565 != 2) {
            return;
        }
        int n3 = client.field528 * 64 + (client.field525 - class1032.field1324 << 7);
        int n4 = client.field529 * 4096 + (client.field526 - class1032.field1325 << 7);
        class4.method18(class1032, n3, n4, n3, n4, client.field527 * 4);
        if (client.field802 > -1 && client.field514 % 20 < 10) {
            class44.field288[0].method10774(client.field802 + n - 12, n2 + client.field538 - 28);
        }
    }
}

