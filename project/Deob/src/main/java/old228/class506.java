package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="td")
public class class506 {
    @ObfuscatedName(value="an")
    static final int[] field5147 = new int[16384];
    @ObfuscatedName(value="ae")
    static final int[] field5148 = new int[16384];

    static {
        double d = 3.834951969714103E-4;
        int n = 0;
        while (n < 16384) {
            class506.field5147[n] = (int)(16384.0 * Math.sin((double)n * d));
            class506.field5148[n] = (int)(16384.0 * Math.cos((double)n * d));
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Throwable;Ljava/lang/String;)Lwg;")
    public static class582 method9592(Throwable throwable, String string) {
        class582 class5822;
        if (!(throwable instanceof class582)) {
            class5822 = new class582(throwable, string);
        } else {
            class5822 = (class582)throwable;
            class5822.field5651 = class5822.field5651 + ' ' + string;
        }
        return class5822;
    }

    @ObfuscatedName(value="nj")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="399679247")
    static final void method9591(int n, int n2) {
        if (client.field738[n] == null) {
            return;
        }
        if (n2 >= 0 && n2 < client.field738[n].method3837()) {
            class152 class1522 = (class152)client.field738[n].field1808.get(n2);
            if (class1522.field1686 != -1) {
                return;
            }
            class324 class3242 = class90.method2629(class322.field3345, client.field564.field1446);
            class3242.field3442.method10300(3 + class91.method2631(class1522.field1685.method10969()));
            class3242.field3442.method10300(n);
            class3242.field3442.method10266(n2);
            class3242.field3442.method10442(class1522.field1685.method10969());
            client.field564.method3257(class3242);
            return;
        }
    }
}

