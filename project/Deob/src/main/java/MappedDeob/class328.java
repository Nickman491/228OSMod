/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 *  np
 */
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
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
    @Export(value="pcmPlayer1")
    static PcmPlayer pcmPlayer1;
    @ObfuscatedName(value="vq")
    @ObfuscatedSignature(descriptor="Lpl;")
    @Export(value="grandExchangeEvents")
    static GrandExchangeEvents grandExchangeEvents;

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
    @Export(value="Messages_getMessage")
    static Message Messages_getMessage(int n) {
        return (Message)Messages.Messages_hashTable.get(n);
    }

    @ObfuscatedName(value="ig")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;ZI)V", garbageValue="-571040366")
    @Export(value="drawLoadingMessage")
    static final void drawLoadingMessage(String string, boolean bl) {
        if (!Client.showLoadingMessages) {
            return;
        }
        int n = 4;
        int n2 = n + 6;
        int n3 = n + 6;
        int n4 = HealthBarUpdate.fontPlain12.lineWidth(string, 250);
        int n5 = HealthBarUpdate.fontPlain12.lineCount(string, 250) * 13;
        Rasterizer2D.Rasterizer2D_fillRectangle(n2 - n, n3 - n, n + n + n4, n + n5 + n, 0);
        Rasterizer2D.Rasterizer2D_drawRectangle(n2 - n, n3 - n, n + n + n4, n5 + n + n, 0xFFFFFF);
        HealthBarUpdate.fontPlain12.drawLines(string, n2, n3, n4, n5, 0xFFFFFF, -1, 1, 1, 0);
        int n6 = n2 - n;
        int n7 = n3 - n;
        int n8 = n + n4 + n;
        int n9 = n + n5 + n;
        int n10 = 0;
        while (true) {
            if (n10 >= Client.rootWidgetCount) {
                if (!bl) {
                    class446.method8847(n2, n3, n4, n5);
                } else {
                    class6.rasterProvider.drawFull(0, 0);
                }
                return;
            }
            if (Client.rootWidgetWidths[n10] + Client.rootWidgetXs[n10] > n6 && Client.rootWidgetXs[n10] < n6 + n8 && Client.rootWidgetHeights[n10] + Client.rootWidgetYs[n10] > n7 && Client.rootWidgetYs[n10] < n7 + n9) {
                Client.field713[n10] = true;
            }
            ++n10;
        }
    }

    @ObfuscatedName(value="nl")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-5805")
    @Export(value="FriendSystem_invalidateIgnoreds")
    static final void FriendSystem_invalidateIgnoreds() {
        class502.method9544();
        if (WorldMapLabelSize.friendsChat != null) {
            WorldMapLabelSize.friendsChat.invalidateIgnoreds();
        }
    }
}

