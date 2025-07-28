/*
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
    final /* synthetic */ MidiPcmStream this$0;

    @ObfuscatedSignature(descriptor="(Lma;)V")
    class336(MidiPcmStream midiPcmStream) {
        this.this$0 = midiPcmStream;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "OSRS WAV Load");
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="2132324260")
    public static void method6883() {
        class231.field2495.clear();
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="111")
    static int method6884() {
        return Login.loginIndex;
    }
}

