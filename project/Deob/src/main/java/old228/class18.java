package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ag")
public class class18 {
    @ObfuscatedName(value="gp")
    @ObfuscatedGetter(intValue=634158813)
    static int field79;
    @ObfuscatedName(value="gv")
    static String field77;
    @ObfuscatedName(value="qn")
    @ObfuscatedSignature(descriptor="Luf;")
    static class539 field75;
    @ObfuscatedName(value="ay")
    Future field73;
    @ObfuscatedName(value="ah")
    String field72;

    class18(Future future) {
        this.field73 = future;
    }

    class18(String string) {
        this.method277(string);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-2043229210")
    void method277(String string) {
        if (string == null) {
            string = "";
        }
        this.field72 = string;
        if (this.field73 != null) {
            this.field73.cancel(true);
            this.field73 = null;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="1897963977")
    public final String method283() {
        return this.field72;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1635286519")
    public boolean method266() {
        return this.field72 != null || this.field73 == null;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="11366892")
    public final boolean method267() {
        if (this.method266()) {
            return true;
        }
        return this.field73.isDone();
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(B)Lai;", garbageValue="-128")
    public final class20 method273() {
        if (this.method266()) {
            return new class20(this.field72);
        }
        if (!this.method267()) {
            return null;
        }
        try {
            return (class20)this.field73.get();
        }
        catch (Exception exception) {
            String string = "Error retrieving REST request reply";
            System.err.println(string + "\r\n" + exception);
            this.method277(string);
            return new class20(string);
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;Luo;I)Ljava/lang/String;", garbageValue="512695713")
    public static String method270(CharSequence charSequence, class534 class5342) {
        int n;
        int n2;
        int n3;
        if (charSequence == null) {
            return null;
        }
        int n4 = charSequence.length();
        for (n3 = 0; n3 < n4; ++n3) {
            n2 = charSequence.charAt(n3);
            int n5 = n2 != 160 && n2 != 32 && n2 != 95 && n2 != 45 ? 0 : (n = 1);
            if (n == 0) break;
        }
        while (n4 > n3) {
            n2 = charSequence.charAt(n4 - 1);
            int n6 = n2 != 160 && n2 != 32 && n2 != 95 && n2 != 45 ? 0 : (n = 1);
            if (n == 0) break;
            --n4;
        }
        if ((n = n4 - n3) >= 1) {
            int n7;
            n2 = n;
            if (class5342 != null) {
                switch (class5342.field5357) {
                    case 7: {
                        n7 = 20;
                        break;
                    }
                    default: {
                        n7 = 12;
                        break;
                    }
                }
            } else {
                n7 = 12;
            }
            if (n2 <= n7) {
                StringBuilder stringBuilder = new StringBuilder(n);
                n7 = n3;
                while (true) {
                    char c;
                    boolean bl;
                    char c2;
                    block23: {
                        if (n7 >= n4) {
                            if (stringBuilder.length() == 0) {
                                return null;
                            }
                            return stringBuilder.toString();
                        }
                        c2 = charSequence.charAt(n7);
                        if (!Character.isISOControl(c2)) {
                            if (!class274.method5930(c2)) {
                                char[] cArray = class535.field5359;
                                int n8 = 0;
                                while (true) {
                                    char c3;
                                    if (n8 >= cArray.length) {
                                        cArray = class535.field5360;
                                        n8 = 0;
                                        while (true) {
                                            if (n8 >= cArray.length) {
                                                bl = false;
                                                break block23;
                                            }
                                            c3 = cArray[n8];
                                            if (c3 == c2) {
                                                bl = true;
                                                break block23;
                                            }
                                            ++n8;
                                        }
                                    }
                                    c3 = cArray[n8];
                                    if (c2 == c3) {
                                        bl = true;
                                        break block23;
                                    }
                                    ++n8;
                                }
                            }
                            bl = true;
                        } else {
                            bl = false;
                        }
                    }
                    if (bl && (c = class323.method6620(c2)) != '\u0000') {
                        stringBuilder.append(c);
                    }
                    ++n7;
                }
            }
        }
        return null;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1536678022")
    public static void method275() {
        class237.field2545.method6581();
    }

    @ObfuscatedName(value="nt")
    @ObfuscatedSignature(descriptor="(Lna;B)V", garbageValue="2")
    static final void method284(class361 class3612) {
        int n = class3612.field3875;
        if (n != 324) {
            if (n != 325) {
                if (n != 327) {
                    if (n != 328) {
                        return;
                    }
                    class3612.field3923 = 150;
                    class3612.field3994 = (int)(Math.sin((double)client.field514 / 40.0) * 256.0) & 0x7FF;
                    class3612.field3915 = 5;
                    class3612.field3916 = 1;
                    return;
                }
                class3612.field3923 = 150;
                class3612.field3994 = (int)(Math.sin((double)client.field514 / 40.0) * 256.0) & 0x7FF;
                class3612.field3915 = 5;
                class3612.field3916 = 0;
                return;
            }
            if (client.field621 == -1) {
                client.field621 = class3612.field3906;
                client.field783 = class3612.field3871;
            }
            class3612.field3906 = client.field680.field3813 == 1 ? client.field783 : client.field621;
            return;
        }
        if (client.field621 == -1) {
            client.field621 = class3612.field3906;
            client.field783 = class3612.field3871;
        }
        class3612.field3906 = client.field680.field3813 == 1 ? client.field621 : client.field783;
    }
}

