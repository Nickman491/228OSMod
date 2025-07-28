package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dc")
public class class80 {
    @ObfuscatedName(value="az")
    static short[][][] field992;
    @ObfuscatedName(value="bk")
    protected static boolean field998;
    @ObfuscatedName(value="ay")
    ExecutorService field997 = Executors.newSingleThreadExecutor();
    @ObfuscatedName(value="ah")
    Future field994 = this.field997.submit(new class85());

    class80() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-155959094")
    void method2466() {
        this.field997.shutdown();
        this.field997 = null;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1026396364")
    boolean method2465() {
        return this.field994.isDone();
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)Ljava/security/SecureRandom;", garbageValue="-1713831444")
    SecureRandom method2467() {
        try {
            return (SecureRandom)this.field994.get();
        }
        catch (Exception exception) {
            return class71.method2103();
        }
    }

    @ObfuscatedName(value="mo")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="901914060")
    static void method2473(boolean bl) {
        client.field734 = bl;
    }
}

