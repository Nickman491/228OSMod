package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jf")
public class class259
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    public static class391 field2745;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static class315 field2743;
    @ObfuscatedName(value="ca")
    @ObfuscatedSignature(descriptor="Lol;")
    static class377 field2749;
    @ObfuscatedName(value="fr")
    @ObfuscatedSignature(descriptor="Lok;")
    static class388 field2746;
    @ObfuscatedName(value="jw")
    static int[] field2742;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lue;")
    class529 field2744;

    static {
        field2743 = new class315(64);
    }

    class259() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1529643123")
    void method5452() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;B)V", garbageValue="5")
    void method5453(class556 class5562) {
        int n;
        while ((n = class5562.method10282()) != 0) {
            this.method5454(class5562, n);
        }
        return;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="1848014011")
    void method5454(class556 class5562, int n) {
        if (n == 249) {
            this.field2744 = class1.method7(class5562, this.field2744);
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IIB)I", garbageValue="7")
    public int method5468(int n, int n2) {
        return class23.method336(this.field2744, n, n2);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;I)Ljava/lang/String;", garbageValue="-634217919")
    public String method5460(int n, String string) {
        return class47.method906(this.field2744, n, string);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([Lpd;II)Lpd;", garbageValue="-1909362778")
    public static MouseWheel method5457(MouseWheel[] mouseWheelArray, int n) {
        MouseWheel[] class404Array2 = mouseWheelArray;
        int n2 = 0;
        while (n2 < class404Array2.length) {
            MouseWheel class4042 = class404Array2[n2];
            if (n == class4042.vmethod10703()) {
                return class4042;
            }
            ++n2;
        }
        return null;
    }
}

