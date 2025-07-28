/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.text.ParseException;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ng")
public class class355 {
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lbl;")
    @Export(value="pcmPlayerProvider")
    public static class51 pcmPlayerProvider;
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
            Varcs.method3212(7);
            class150.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (date == null) {
            return false;
        }
        boolean bl = class139.method3500(date);
        Date date2 = Script.method2490();
        boolean bl2 = date.after(date2);
        boolean bl3 = bl2;
        if (!bl3) {
            Tiles.method2574("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        UserComparator4.field1481 = !bl ? 0x7FFFFF : (int)(date.getTime() / 86400000L - 11745L);
        return true;
    }

    @ObfuscatedName(value="ip")
    @ObfuscatedSignature(descriptor="(Ldz;IIB)V", garbageValue="25")
    static final void method7041(class103 class1032, int n, int n2) {
        if (Client.field565 != 2) {
            return;
        }
        int n3 = Client.field528 * 64 + (Client.field525 - class1032.field1324 << 7);
        int n4 = Client.field529 * 64 + (Client.field526 - class1032.field1325 << 7);
        class4.drawActor2d(class1032, n3, n4, n3, n4, Client.field527 * 4);
        if (Client.field802 > -1 && Client.cycle % 20 < 10) {
            SoundSystem.field288[0].drawTransBgAt(Client.field802 + n - 12, n2 + Client.field538 - 28);
        }
    }
}

