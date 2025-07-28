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

@ObfuscatedName(value="mw")
public class class319 {
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(longValue=504080126095839219L)
    static long field3313;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1501922780")
    public static int method6609() {
        return class199.field2271;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lpq;Ljava/lang/String;Ljava/lang/String;I)[Lvi;", garbageValue="-1850059826")
    public static class569[] method6611(class391 class3912, String string, String string2) {
        if (!class3912.method7781(string, string2)) {
            return null;
        }
        int n = class3912.method7743(string);
        int n2 = class3912.method7747(n, string2);
        return class16.method213(class3912, n, n2);
    }

    @ObfuscatedName(value="gl")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1037305055")
    static boolean method6610() {
        if (client.field795 != null && client.field542 < client.field795.size()) {
            while (true) {
                if (client.field542 >= client.field795.size()) {
                    return true;
                }
                class86 class862 = (class86)client.field795.get(client.field542);
                if (!class862.method2580()) {
                    return false;
                }
                ++client.field542;
            }
        }
        return true;
    }
}

