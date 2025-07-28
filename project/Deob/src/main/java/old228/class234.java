package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="je")
public class class234
extends class510 {
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lpq;")
    static class391 field2504;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=111494813)
    public static int field2505;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lmi;")
    static class315 field2506;
    @ObfuscatedName(value="fh")
    @ObfuscatedSignature(descriptor="Lcj;")
    static class68 field2510;
    @ObfuscatedName(value="il")
    @ObfuscatedSignature(descriptor="Lsq;")
    static class486 field2508;
    @ObfuscatedName(value="lf")
    @ObfuscatedGetter(intValue=1927519643)
    static int field2509;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1557444195)
    public int field2502 = 0;

    static {
        field2506 = new class315(64);
    }

    class234() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="830553942")
    void method5136(class556 class5562) {
        int n;
        while ((n = class5562.method10282()) != 0) {
            this.method5137(class5562, n);
        }
        this.method5138();
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="1188566166")
    void method5137(class556 class5562, int n) {
        if (n == 5) {
            this.field2502 = class5562.method10307();
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-2088614685")
    void method5138() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="-130295306")
    static String method5158() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = class275.field3053;
        int n = 0;
        while (true) {
            if (n >= ((class275[])object).length) {
                object = stringBuilder.toString();
                return ((String)object).substring(0, ((String)object).length() - 2);
            }
            class275 class2752 = object[n];
            stringBuilder.append(class2752.field3052);
            stringBuilder.append(", ");
            ++n;
        }
    }
}

