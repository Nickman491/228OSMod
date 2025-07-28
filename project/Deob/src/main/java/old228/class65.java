package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 *  netscape.javascript.JSObject
 */
import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName(value="ci")
public class class65
extends class272 {
    class65() {
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIILku;B)Z", garbageValue="-42")
    protected boolean vmethod5841(int n, int n2, int n3, class270 class2702) {
        return n2 == this.field3023 && n3 == this.field3020;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="-62")
    static int method1261(int n) {
        class83 class832 = (class83)class115.field1439.get(n);
        if (class832 == null) {
            return 0;
        }
        return class832.method2499();
    }

    @ObfuscatedName(value="og")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="1")
    static void method1254(String string) {
        class406.field4674 = string;
        try {
            String string2 = client.field521.getParameter(Integer.toString(18));
            String string3 = client.field521.getParameter(Integer.toString(13));
            String string4 = string2 + "settings=" + string + "; version=1; path=/; domain=" + string3;
            string4 = string.length() == 0 ? string4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0" : string4 + "; Expires=" + class10.method113(class37.method724() + 94608000000L) + "; Max-Age=" + 94608000L;
            client client2 = client.field521;
            String string5 = "document.cookie=\"" + string4 + "\"";
            JSObject.getWindow((Applet)client2).eval(string5);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }
}

