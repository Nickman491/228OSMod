package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ob")
public class class378 {
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lpq;Ljava/lang/String;Ljava/lang/String;B)[Lvf;", garbageValue="85")
    public static class570[] method7637(class391 class3912, String string, String string2) {
        if (!class3912.method7781(string, string2)) {
            return null;
        }
        int n = class3912.method7743(string);
        int n2 = class3912.method7747(n, string2);
        return class486.method9404(class3912, n, n2);
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="175783721")
    static final void method7636(String string) {
        class324 class3242 = class90.method2629(class322.field3346, client.field564.field1446);
        class3242.field3442.method10300(class91.method2631(string));
        class3242.field3442.method10442(string);
        client.field564.method3257(class3242);
    }

    @ObfuscatedName(value="hy")
    @ObfuscatedSignature(descriptor="(IIII)V", garbageValue="-334790907")
    static void method7635(int n, int n2, int n3) {
        if (class544.field5403.method2898() != 0 && n2 != 0 && client.field748 < 50) {
            client.field698[client.field748] = n;
            client.field750[client.field748] = n2;
            client.field751[client.field748] = n3;
            client.field754[client.field748] = null;
            client.field752[client.field748] = 0;
            client.field753[client.field748] = 0;
            ++client.field748;
        }
    }
}

