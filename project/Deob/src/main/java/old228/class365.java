package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="oi")
public abstract class class365 {
    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="Lgk;")
    static class170 field4045;

    class365() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)[B", garbageValue="14")
    abstract byte[] vmethod7601();

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="([BI)V", garbageValue="1288883946")
    public abstract void vmethod7600(byte[] var1);

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Lfb;", garbageValue="-1650010421")
    static class134 method7582(int n) {
        MouseWheel[] mouseWheelArray = new class134[]{class134.field1561, class134.field1557, class134.field1559, class134.field1560, class134.field1563};
        class134 class1342 = (class134)class259.method5457(mouseWheelArray, n);
        if (class1342 == null) {
            class1342 = class134.field1561;
        }
        return class1342;
    }

    @ObfuscatedName(value="nh")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="63")
    static final void method7584() {
        class324 class3242 = class90.method2629(class322.field3340, client.field564.field1446);
        client.field564.method3257(class3242);
        class72.field862 = true;
        class89 class892 = (class89)client.field664.method9988();
        while (true) {
            if (class892 == null) {
                if (client.field668 != null) {
                    class122.method3325(client.field668);
                    client.field668 = null;
                }
                class72.field862 = false;
                return;
            }
            if (class892.field1072 == 0 || class892.field1072 == 3) {
                class247.method5349(class892, true);
            }
            class892 = (class89)client.field664.method9996();
        }
    }
}

