package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="oq")
public class class371 {
    @ObfuscatedName(value="ah")
    public static final boolean[] field4092 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
    @ObfuscatedName(value="az")
    public static int[] field4093 = new int[99];

    static {
        int n = 0;
        int n2 = 0;
        while (n2 < 99) {
            int n3 = n2 + 1;
            int n4 = (int)((double)n3 + 300.0 * Math.pow(2.0, (double)n3 / 7.0));
            class371.field4093[n2] = (n += n4) / 4;
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/net/Socket;III)Lsq;", garbageValue="-1851008494")
    public static class486 method7618(Socket socket, int n, int n2) throws IOException {
        return new class487(socket, n, n2);
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)Ljava/lang/String;", garbageValue="1792590271")
    public static String method7619(String string) {
        int n = string.length();
        char[] cArray = new char[n];
        int n2 = 2;
        int n3 = 0;
        while (n3 < n) {
            char c = string.charAt(n3);
            if (n2 == 0) {
                c = Character.toLowerCase(c);
            } else if (n2 == 2 || Character.isUpperCase(c)) {
                char c2 = c != '\u00b5' && c != '\u0192' ? Character.toTitleCase(c) : c;
                c = c2;
            }
            if (Character.isLetter(c)) {
                n2 = 0;
            } else if (c != '.' && c != '?' && c != '!') {
                if (!Character.isSpaceChar(c)) {
                    n2 = 1;
                } else if (n2 != 2) {
                    n2 = 1;
                }
            } else {
                n2 = 2;
            }
            cArray[n3] = c;
            ++n3;
        }
        return new String(cArray);
    }

    @ObfuscatedName(value="ny")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-1110094328")
    static final void method7620(String string) {
        if (class281.field3080 == null) {
            return;
        }
        class324 class3242 = class90.method2629(class322.field3350, client.field564.field1446);
        class3242.field3442.method10300(class91.method2631(string));
        class3242.field3442.method10442(string);
        client.field564.method3257(class3242);
    }
}

