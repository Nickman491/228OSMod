package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jl")
public class class254
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmi;")
    static class315 field2716 = new class315(64);

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)Lje;", garbageValue="-41")
    public static class234 method5404(int n) {
        class234 class2342 = (class234)class234.field2506.method6578(n);
        if (class2342 != null) {
            return class2342;
        }
        byte[] byArray = class234.field2504.method7790(16, n);
        class2342 = new class234();
        if (byArray != null) {
            class2342.method5136(new class556(byArray));
        }
        class234.field2506.method6590(class2342, n);
        return class2342;
    }

    @ObfuscatedName(value="gm")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="50")
    static int method5409() {
        if (client.field795 != null && client.field542 < client.field795.size()) {
            int n = 0;
            int n2 = 0;
            while (true) {
                if (n2 > client.field542) {
                    return n * 10000 / client.field692;
                }
                n += ((class86)client.field795.get((int)n2)).field1055;
                ++n2;
            }
        }
        return 10000;
    }
}

