/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="an")
public class class5
implements class2 {
    @ObfuscatedName(value="ay")
    final MessageDigest field13 = this.method26();

    @ObfuscatedSignature(descriptor="(Lat;)V")
    class5(class8 class83) {
    }

    @ObfuscatedName(value="ay")
    boolean method22(int n, String string, long l) {
        byte[] byArray = this.method35(string, l);
        return class5.method27(byArray) >= n;
    }

    @ObfuscatedName(value="ao")
    byte[] method35(String string, long l) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string).append(Long.toHexString(l));
        this.field13.reset();
        try {
            this.field13.update(stringBuilder.toString().getBytes("UTF-8"));
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
        }
        return this.field13.digest();
    }

    @ObfuscatedName(value="ad")
    MessageDigest method26() {
        try {
            return MessageDigest.getInstance("SHA-256");
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            return null;
        }
    }

    @ObfuscatedName(value="ah")
    static int method27(byte[] byArray) {
        int n = 0;
        byte[] byArray2 = byArray;
        for (int i = 0; i < byArray2.length; ++i) {
            byte by = byArray2[i];
            int n2 = class5.method24(by);
            n += n2;
            if (n2 != 8) break;
        }
        return n;
    }

    @ObfuscatedName(value="az")
    static int method24(byte by) {
        int n = 0;
        if (by != 0) {
            int n2 = by & 0xFF;
            while ((n2 & 0x80) == 0) {
                ++n;
                n2 <<= 1;
            }
        } else {
            n = 8;
        }
        return n;
    }
}

