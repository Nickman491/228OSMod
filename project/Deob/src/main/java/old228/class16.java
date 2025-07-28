package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="al")
public class class16
implements ThreadFactory {
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Lit;")
    static class227 field70;
    @ObfuscatedName(value="ay")
    final ThreadGroup field67;
    @ObfuscatedName(value="ah")
    final AtomicInteger field69 = new AtomicInteger(1);
    @ObfuscatedSignature(descriptor="Laa;")
    final /* synthetic */ class14 this$0;

    @ObfuscatedSignature(descriptor="(Laa;)V")
    class16(class14 class1410) {
        this.this$0 = class1410;
        SecurityManager securityManager = System.getSecurityManager();
        this.field67 = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
    }

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.field67, runnable, this.this$0.field58 + "-rest-request-" + this.field69.getAndIncrement(), 0L);
        thread.setDaemon(true);
        thread.setPriority(5);
        return thread;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;III)[Lvi;", garbageValue="591347831")
    public static class569[] method213(class391 class3912, int n, int n2) {
        if (!class296.method6397(class3912, n, n2)) {
            return null;
        }
        class569[] class569Array = new class569[class571.field5582];
        int n3 = 0;
        while (true) {
            if (n3 >= class571.field5582) {
                class241.field2585 = null;
                class571.field5583 = null;
                class571.field5584 = null;
                class403.field4657 = null;
                class25.field108 = null;
                class240.field2580 = null;
                class569[] class569Array2 = class569Array;
                return class569Array2;
            }
            class569 class5692 = class569Array[n3] = new class569();
            class5692.field5561 = class571.field5581;
            class5692.field5568 = class174.field1832;
            class5692.field5565 = class241.field2585[n3];
            class5692.field5566 = class571.field5583[n3];
            class5692.field5567 = class571.field5584[n3];
            class5692.field5564 = class403.field4657[n3];
            class5692.field5562 = class25.field108;
            class5692.field5563 = class240.field2580[n3];
            ++n3;
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="595905120")
    public static void method209() {
        class239.field2566.method6581();
        class239.field2567.method6581();
    }

    @ObfuscatedName(value="ia")
    @ObfuscatedSignature(descriptor="(Ldz;I)V", garbageValue="790177061")
    static final void method208(class103 class1032) {
        class74 class742 = (class74)class1032.field1339.method7996();
        while (class742 != null) {
            if (class1032.field1321 == class742.field884 && !class742.field885) {
                if (client.field514 >= class742.field883) {
                    class742.method2351(client.field581);
                    if (class742.field885) {
                        class742.method9623();
                    } else {
                        class1032.field1319.method4185(class742.field884, class742.field891, class742.field882, class742.field886, 60, class742, 0, -1L, false);
                    }
                }
            } else {
                class742.method9623();
            }
            class742 = (class74)class1032.field1339.method8005();
        }
        return;
    }

    @ObfuscatedName(value="ma")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1734456775")
    static final void method211(int n) {
        if (!class170.field1807.method7024(n)) {
            return;
        }
        class361[] class361Array = class170.field1807.field3772[n];
        int n2 = 0;
        while (n2 < class361Array.length) {
            class361 class3612 = class361Array[n2];
            if (class3612 != null) {
                class3612.field4012 = 0;
                class3612.field4013 = 0;
            }
            ++n2;
        }
        return;
    }
}

