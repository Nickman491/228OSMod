package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 *  np
 */
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@np
@ObfuscatedName(value="mq")
public final class class328 {
    @ObfuscatedName(value="az")
    static final HashMap field3601 = new HashMap();
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=656922949)
    public static int field3605;
    @ObfuscatedName(value="tk")
    @ObfuscatedSignature(descriptor="Lbq;")
    static class42 field3606;
    @ObfuscatedName(value="vq")
    @ObfuscatedSignature(descriptor="Lpl;")
    static class393 field3597;

    static {
        Calendar.getInstance(class328.method6644("Europe/London"));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)Ljava/util/TimeZone;", garbageValue="1996536510")
    static TimeZone method6644(String string) {
        HashMap hashMap = field3601;
        synchronized (hashMap) {
            TimeZone timeZone = (TimeZone)field3601.get(string);
            if (timeZone == null) {
                timeZone = TimeZone.getTimeZone(string);
                field3601.put(string, timeZone);
            }
            return timeZone;
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(II)Lct;", garbageValue="-61851399")
    static class64 method6645(int n) {
        return (class64)class115.field1443.method9967(n);
    }

    @ObfuscatedName(value="ig")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;ZI)V", garbageValue="-571040366")
    static final void method6641(String string, boolean bl) {
        if (!client.field560) {
            return;
        }
        int n = 4;
        int n2 = n + 6;
        int n3 = n + 6;
        int n4 = class100.field1278.method8731(string, 250);
        int n5 = class100.field1278.method8680(string, 250) * 13;
        class566.method10677(n2 - n, n3 - n, n + n + n4, n + n5 + n, 0);
        class566.method10617(n2 - n, n3 - n, n + n + n4, n5 + n + n, 0xFFFFFF);
        class100.field1278.method8687(string, n2, n3, n4, n5, 0xFFFFFF, -1, 1, 1, 0);
        int n6 = n2 - n;
        int n7 = n3 - n;
        int n8 = n + n4 + n;
        int n9 = n + n5 + n;
        int n10 = 0;
        while (true) {
            if (n10 >= client.field711) {
                if (!bl) {
                    class446.method8847(n2, n3, n4, n5);
                } else {
                    class6.field14.vmethod10689(0, 0);
                }
                return;
            }
            if (client.field718[n10] + client.field716[n10] > n6 && client.field716[n10] < n6 + n8 && client.field605[n10] + client.field611[n10] > n7 && client.field611[n10] < n7 + n9) {
                client.field713[n10] = true;
            }
            ++n10;
        }
    }

    @ObfuscatedName(value="nl")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-5805")
    static final void method6640() {
        class502.method9544();
        if (class281.field3080 != null) {
            class281.field3080.method9120();
        }
    }
}

