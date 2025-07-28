package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="sq")
public abstract class class486 {
    class486() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1264971006")
    public abstract boolean vmethod9407(int var1) throws IOException;

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-2125512046")
    public abstract int vmethod9408() throws IOException;

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1363854656")
    public abstract int vmethod9406() throws IOException;

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="([BIIB)I", garbageValue="72")
    public abstract int vmethod9410(byte[] var1, int var2, int var3) throws IOException;

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="([BIIB)V", garbageValue="-105")
    public abstract void vmethod9411(byte[] var1, int var2, int var3) throws IOException;

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1821776179")
    public abstract void vmethod9416();

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lpq;IIB)[Lvf;", garbageValue="34")
    public static class570[] method9404(class391 class3912, int n, int n2) {
        if (!class296.method6397(class3912, n, n2)) {
            return null;
        }
        return class457.method8965();
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="-97")
    static void method9400(boolean bl) {
        int n = 0;
        if (class101.method2876()) {
            if (client.field521.method1441() || client.field521.method1293() || client.field521.method1418()) {
                n = 10;
            }
        } else {
            n = 12;
        }
        class114.method3212(n);
        if (bl) {
            class78.field955 = "";
            class78.field940 = "";
            class326.field3592 = 0;
            class480.field5036 = "";
        }
        if (class78.field955 == null || class78.field955.length() <= 0) {
            if (class544.field5403.method2944() == null) {
                client.field555 = false;
            } else {
                class78.field955 = class544.field5403.method2944();
                client.field555 = true;
            }
        }
        class100.method2832();
    }
}

