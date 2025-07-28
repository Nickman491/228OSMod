/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 *  netscape.javascript.JSObject
 */
import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName(value="qk")
public class class440 {
    @ObfuscatedName(value="jp")
    static int[] field4851;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lqi;")
    class436 field4850;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-2067313247)
    int field4849 = 0;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=506750791)
    int field4848 = 0;

    @ObfuscatedSignature(descriptor="(Lqi;II)V")
    class440(class436 class4362, int n, int n2) {
        this.field4850 = class4362;
        this.field4849 = n;
        this.field4848 = n2;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="2096882874")
    public String method8809() {
        if (this.method8788()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(this.method8808());
        int n = this.field4849;
        while (n < this.field4848) {
            class438 class4382 = this.field4850.method8528(n);
            stringBuilder.append(class4382.field4824);
            ++n;
        }
        return stringBuilder.toString();
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="57")
    boolean method8810(int n) {
        return this.field4850.method8536() == 2 || this.field4850.method8536() == 1 && (!this.field4850.field4798 || this.field4848 - 1 != n);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="706203165")
    public boolean method8788() {
        return this.field4849 == this.field4848;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="25")
    public int method8808() {
        return this.field4848 - this.field4849;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lqo;I)Z", garbageValue="1163269871")
    boolean method8790(class438 class4382) {
        if (this.field4850.field4813 == 2) {
            return true;
        }
        if (this.field4850.field4813 == 0) {
            return false;
        }
        return this.field4850.method8529() != class4382;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="931589017")
    int method8806() {
        if (this.method8788()) {
            return 0;
        }
        class438 class4382 = this.field4850.method8528(this.field4848 - 1);
        if (class4382.field4824 == '\n') {
            return 0;
        }
        if (this.method8790(class4382)) {
            return this.field4850.field4801.advances[42];
        }
        int n = this.field4850.field4801.advances[class4382.field4824];
        if (n != 0) {
            return n;
        }
        if (class4382.field4824 != '\t') {
            return this.field4850.field4801.advances[32];
        }
        return this.field4850.field4801.advances[32] * 3;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)Lug;", garbageValue="2031855998")
    public class527 method8792() {
        if (!this.method8788()) {
            class438 class4382 = this.field4850.method8528(this.field4848 - 1);
            return new class527(class4382.field4821 + this.method8806(), class4382.field4822);
        }
        return new class527(0, 0);
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(II)Lqo;", garbageValue="-2064956229")
    public class438 method8786(int n) {
        if (n >= 0 && n < this.method8808()) {
            return this.field4850.method8528(this.field4849 + n);
        }
        return null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lni;I)V", garbageValue="-629202281")
    public static void method8814(class339 class3392) {
        class333.field3627.remove(class3392);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;ILjava/lang/String;I)Z", garbageValue="-71588071")
    static boolean method8813(String string, int n, String string2) {
        if (n == 0) {
            try {
                if (!class31.field137.startsWith("win")) {
                    throw new Exception();
                }
                if (!string.startsWith("http://") && !string.startsWith("https://")) {
                    throw new Exception();
                }
                String string3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                for (int i = 0; i < string.length(); ++i) {
                    if (string3.indexOf(string.charAt(i)) != -1) continue;
                    throw new Exception();
                }
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + string + "\"");
                return true;
            }
            catch (Throwable throwable) {
                return false;
            }
        }
        if (n == 1) {
            try {
                Object object = class26.method402(class31.field138, string2, new Object[]{new URL(class31.field138.getCodeBase(), string).toString()});
                return object != null;
            }
            catch (Throwable throwable) {
                return false;
            }
        }
        if (n == 2) {
            try {
                class31.field138.getAppletContext().showDocument(new URL(class31.field138.getCodeBase(), string), "_blank");
                return true;
            }
            catch (Exception exception) {
                return false;
            }
        }
        if (n == 3) {
            try {
                Applet applet = class31.field138;
                JSObject.getWindow((Applet)applet).call("loggedout", null);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                class31.field138.getAppletContext().showDocument(new URL(class31.field138.getCodeBase(), string), "_top");
                return true;
            }
            catch (Exception exception) {
                return false;
            }
        }
        throw new IllegalArgumentException();
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="244777010")
    static final void method8812() {
        String string = "Your friend list is full. Max of 200 for free users, and 400 for members";
        Interpreter.addGameMessage(30, "", string);
    }
}

