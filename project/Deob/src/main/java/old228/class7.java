package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ax")
public class class7 {
    @ObfuscatedName(value="af")
    public static short[][] field30;
    @ObfuscatedName(value="la")
    @ObfuscatedGetter(intValue=-199280175)
    static int field26;
    @ObfuscatedName(value="ay")
    ExecutorService field23 = Executors.newSingleThreadExecutor();
    @ObfuscatedName(value="ah")
    Future field28;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lvy;")
    final class556 field24;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lao;")
    final class3 field25;

    @ObfuscatedSignature(descriptor="(Lvy;Lao;)V")
    public class7(class556 class5562, class3 class347) {
        this.field24 = class5562;
        this.field25 = class347;
        this.method49();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1847674213")
    public boolean method46() {
        return this.field28.isDone();
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-62")
    public void method47() {
        this.field23.shutdown();
        this.field23 = null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)Lvy;", garbageValue="1592185690")
    public class556 method57() {
        try {
            return (class556)this.field28.get();
        }
        catch (Exception exception) {
            return null;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1268155503")
    void method49() {
        this.field28 = this.field23.submit(new class1(this, this.field24, this.field25));
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lni;B)V", garbageValue="111")
    public static void method50(class339 class3392) {
        if (!class333.field3627.contains(class3392)) {
            class333.field3627.add(class3392);
        }
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1908195796")
    static final void method58() {
        String string = "You can't add yourself to your own friend list";
        class72.method2153(30, "", string);
    }
}

