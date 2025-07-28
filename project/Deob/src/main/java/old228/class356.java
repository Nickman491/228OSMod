package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="nm")
public class class356 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Len;")
    class120 field3794;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lvf;")
    class570 field3793;

    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Lez;)V")
    class356(String string, URLLoader class1182) {
        try {
            this.field3794 = class1182.method3275(new URL(string));
        }
        catch (MalformedURLException malformedURLException) {
            this.field3794 = null;
        }
    }

    @ObfuscatedSignature(descriptor="(Len;)V")
    class356(class120 class1202) {
        this.field3794 = class1202;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)Lvf;", garbageValue="-109")
    class570 method7045() {
        if (this.field3793 == null && this.field3794 != null && this.field3794.method3302()) {
            if (this.field3794.method3310() != null) {
                this.field3793 = class395.method7878(this.field3794.method3310());
            }
            this.field3794 = null;
        }
        return this.field3793;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)[B", garbageValue="71")
    static byte[] method7046(String string) {
        int n;
        int n2 = 48;
        int n3 = 87;
        int n4 = "pattern".length();
        int n5 = 0;
        byte[] byArray = new byte[8];
        while ((n = n4 + n5) < string.length()) {
            block5: {
                block6: {
                    block9: {
                        char c;
                        block8: {
                            block7: {
                                c = string.charAt(n);
                                if (c == ':') break block5;
                                if (byArray.length == n5) break block6;
                                if (c < '0' || c > '9') break block7;
                                c = (char)(c - 48);
                                break block8;
                            }
                            if (c < 'a' || c > 'z') break block9;
                            c = (char)(c - 87);
                        }
                        byArray[n5++] = (byte)c;
                        continue;
                    }
                    return null;
                }
                return null;
            }
            if (n5 != 0) {
                byte[] byArray2 = new byte[n5];
                System.arraycopy(byArray, 0, byArray2, 0, n5);
                return byArray2;
            }
            return null;
        }
        return null;
    }
}

