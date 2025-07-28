/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="qp")
public class class429 {
    @ObfuscatedName(value="ay")
    float field4768;
    @ObfuscatedName(value="ah")
    float field4766;
    @ObfuscatedName(value="az")
    float field4773;
    @ObfuscatedName(value="ao")
    float field4775;
    @ObfuscatedName(value="ad")
    float field4765;
    @ObfuscatedName(value="an")
    float field4770;
    @ObfuscatedName(value="ae")
    float field4771;
    @ObfuscatedName(value="ax")
    float field4772;
    @ObfuscatedName(value="at")
    float field4767;
    @ObfuscatedName(value="ac")
    float field4769;
    @ObfuscatedName(value="au")
    float field4774;
    @ObfuscatedName(value="as")
    float field4776;

    static {
        new class429();
    }

    public class429() {
        this.method8456();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1450694311")
    void method8456() {
        this.field4776 = 0.0f;
        this.field4774 = 0.0f;
        this.field4769 = 0.0f;
        this.field4772 = 0.0f;
        this.field4771 = 0.0f;
        this.field4770 = 0.0f;
        this.field4775 = 0.0f;
        this.field4773 = 0.0f;
        this.field4766 = 0.0f;
        this.field4767 = 1.0f;
        this.field4765 = 1.0f;
        this.field4768 = 1.0f;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(FI)V", garbageValue="-62247449")
    public void method8459(float f) {
        float f2 = (float)Math.cos(f);
        float f3 = (float)Math.sin(f);
        float f4 = this.field4766;
        float f5 = this.field4765;
        float f6 = this.field4772;
        float f7 = this.field4774;
        this.field4766 = f2 * f4 - f3 * this.field4773;
        this.field4773 = f3 * f4 + this.field4773 * f2;
        this.field4765 = f2 * f5 - this.field4770 * f3;
        this.field4770 = f2 * this.field4770 + f5 * f3;
        this.field4772 = f6 * f2 - f3 * this.field4767;
        this.field4767 = f3 * f6 + this.field4767 * f2;
        this.field4774 = f2 * f7 - this.field4776 * f3;
        this.field4776 = this.field4776 * f2 + f7 * f3;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(FI)V", garbageValue="1632786425")
    public void method8460(float f) {
        float f2 = (float)Math.cos(f);
        float f3 = (float)Math.sin(f);
        float f4 = this.field4768;
        float f5 = this.field4775;
        float f6 = this.field4771;
        float f7 = this.field4769;
        this.field4768 = f3 * this.field4773 + f2 * f4;
        this.field4773 = this.field4773 * f2 - f4 * f3;
        this.field4775 = f3 * this.field4770 + f5 * f2;
        this.field4770 = f2 * this.field4770 - f5 * f3;
        this.field4771 = f2 * f6 + f3 * this.field4767;
        this.field4767 = this.field4767 * f2 - f3 * f6;
        this.field4769 = f7 * f2 + this.field4776 * f3;
        this.field4776 = f2 * this.field4776 - f3 * f7;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(FI)V", garbageValue="-2120399841")
    void method8455(float f) {
        float f2 = (float)Math.cos(f);
        float f3 = (float)Math.sin(f);
        float f4 = this.field4768;
        float f5 = this.field4775;
        float f6 = this.field4771;
        float f7 = this.field4769;
        this.field4768 = f4 * f2 - this.field4766 * f3;
        this.field4766 = f2 * this.field4766 + f4 * f3;
        this.field4775 = f5 * f2 - this.field4765 * f3;
        this.field4765 = f3 * f5 + this.field4765 * f2;
        this.field4771 = f2 * f6 - f3 * this.field4772;
        this.field4772 = f3 * f6 + this.field4772 * f2;
        this.field4769 = f7 * f2 - this.field4774 * f3;
        this.field4774 = f2 * this.field4774 + f7 * f3;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(FFFI)V", garbageValue="280070721")
    public void method8458(float f, float f2, float f3) {
        this.field4769 += f;
        this.field4774 += f2;
        this.field4776 += f3;
    }

    public String toString() {
        return this.field4768 + "," + this.field4775 + "," + this.field4771 + "," + this.field4769 + "\n" + this.field4766 + "," + this.field4765 + "," + this.field4772 + "," + this.field4774 + "\n" + this.field4773 + "," + this.field4770 + "," + this.field4767 + "," + this.field4776;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;I)J", garbageValue="502696532")
    public static long method8477(CharSequence charSequence) {
        long l = 0L;
        int n = charSequence.length();
        int n2 = 0;
        while (true) {
            block11: {
                block10: {
                    if (n2 >= n) break block10;
                    l *= 37L;
                    char c = charSequence.charAt(n2);
                    if (c >= 'A' && c <= 'Z') {
                        l += (long)(c + '\u0001' - 65);
                    } else if (c >= 'a' && c <= 'z') {
                        l += (long)(c + '\u0001' - 97);
                    } else if (c >= '0' && c <= '9') {
                        l += (long)(c + 27 - 48);
                    }
                    if (l < 177917621779460413L) break block11;
                }
                while (0L == l % 37L && 0L != l) {
                    l /= 37L;
                }
                return l;
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="my")
    @ObfuscatedSignature(descriptor="(II)Ljava/lang/String;", garbageValue="-1831833354")
    static final String method8471(int n) {
        if (n < 999999999) {
            return Integer.toString(n);
        }
        return "*";
    }
}

