package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="mz")
class class336
implements ThreadFactory {
    @ObfuscatedSignature(descriptor="Lma;")
    final /* synthetic */ class334 this$0;

    @ObfuscatedSignature(descriptor="(Lma;)V")
    class336(class334 class3342) {
        this.this$0 = class3342;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "OSRS WAV Load");
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="2132324260")
    public static void method6883() {
        class231.field2495.method6581();
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="111")
    static int method6884() {
        return class78.field926;
    }
}

