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

@ObfuscatedName(value="bu")
public class class26 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;", garbageValue="-260622984")
    public static Object method402(Applet applet, String string, Object[] objectArray) throws Throwable {
        return JSObject.getWindow((Applet)applet).call(string, objectArray);
    }
}

