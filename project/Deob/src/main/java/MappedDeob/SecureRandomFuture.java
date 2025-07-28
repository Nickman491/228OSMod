/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dc")
@Implements(value="SecureRandomFuture")
public class SecureRandomFuture {
    @ObfuscatedName(value="az")
    @Export(value="Tiles_overlays")
    static short[][][] Tiles_overlays;
    @ObfuscatedName(value="bk")
    @Export(value="hasFocus")
    protected static boolean hasFocus;
    @ObfuscatedName(value="ay")
    @Export(value="executor")
    ExecutorService executor = Executors.newSingleThreadExecutor();
    @ObfuscatedName(value="ah")
    @Export(value="future")
    Future future = this.executor.submit(new SecureRandomCallable());

    SecureRandomFuture() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-155959094")
    @Export(value="shutdown")
    void shutdown() {
        this.executor.shutdown();
        this.executor = null;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1026396364")
    @Export(value="isDone")
    boolean isDone() {
        return this.future.isDone();
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)Ljava/security/SecureRandom;", garbageValue="-1713831444")
    @Export(value="get")
    SecureRandom get() {
        try {
            return (SecureRandom)this.future.get();
        }
        catch (Exception exception) {
            return ObjectSound.method2103();
        }
    }

    @ObfuscatedName(value="mo")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="901914060")
    @Export(value="setTapToDrop")
    static void setTapToDrop(boolean bl) {
        Client.tapToDrop = bl;
    }
}

