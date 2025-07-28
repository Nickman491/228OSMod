/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 *  netscape.javascript.JSObject
 */
import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName(value="ci")
@Implements(value="ApproximateRouteStrategy")
public class ApproximateRouteStrategy
extends RouteStrategy {
    ApproximateRouteStrategy() {
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIILku;B)Z", garbageValue="-42")
    @Export(value="hasArrived")
    protected boolean hasArrived(int n, int n2, int n3, CollisionMap collisionMap) {
        return n2 == this.approxDestinationX && n3 == this.approxDestinationY;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="-62")
    @Export(value="Messages_getHistorySize")
    static int Messages_getHistorySize(int n) {
        ChatChannel chatChannel = (ChatChannel)Messages.Messages_channels.get(n);
        if (chatChannel == null) {
            return 0;
        }
        return chatChannel.size();
    }

    @ObfuscatedName(value="og")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="1")
    static void method1254(String string) {
        Language.field4674 = string;
        try {
            String string2 = Client.client.getParameter(Integer.toString(18));
            String string3 = Client.client.getParameter(Integer.toString(13));
            String string4 = string2 + "settings=" + string + "; version=1; path=/; domain=" + string3;
            string4 = string.length() == 0 ? string4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0" : string4 + "; Expires=" + class10.method113(ReflectionCheck.method724() + 94608000000L) + "; Max-Age=" + 94608000L;
            Client client = Client.client;
            String string5 = "document.cookie=\"" + string4 + "\"";
            JSObject.getWindow((Applet)client).eval(string5);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }
}

