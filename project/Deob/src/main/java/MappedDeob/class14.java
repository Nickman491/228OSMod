/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="aa")
public class class14 {
    @ObfuscatedName(value="ir")
    @ObfuscatedGetter(intValue=-934221379)
    static int field62;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1368043261)
    final int field64;
    @ObfuscatedName(value="ah")
    final String field58;
    @ObfuscatedName(value="az")
    final ThreadFactory field60;
    @ObfuscatedName(value="ao")
    final ThreadPoolExecutor field59;

    public class14(String string, int n, int n2) {
        this.field58 = string;
        this.field64 = n;
        this.field60 = new class16(this);
        this.field59 = this.method182(n2);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Ljava/util/concurrent/ThreadPoolExecutor;", garbageValue="816481997")
    final ThreadPoolExecutor method182(int n) {
        return new ThreadPoolExecutor(n, n, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(this.field64), this.field60);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lau;I)Lag;", garbageValue="2084087012")
    public class18 method183(class10 class102) {
        if (this.field59.getQueue().remainingCapacity() > 0) {
            class18 class182 = new class18(this.field59.submit(new class19(this, class102)));
            return class182;
        }
        System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field59.getCorePoolSize() + " Queue capacity " + this.field64);
        return new class18("Queue full");
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1078520818")
    public final void method184() {
        try {
            this.field59.shutdown();
        }
        catch (Exception exception) {
            System.err.println("Error shutting down RestRequestService\r\n" + exception);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="([F[IIII)V", garbageValue="-1881468642")
    static void method187(float[] fArray, int[] nArray, int n, int n2) {
        if (n >= n2) return;
        int n3 = (n2 + n) / 2;
        int n4 = n;
        float f = fArray[n3];
        fArray[n3] = fArray[n2];
        fArray[n2] = f;
        int n5 = nArray[n3];
        nArray[n3] = nArray[n2];
        nArray[n2] = n5;
        int n6 = n;
        while (true) {
            if (n6 >= n2) {
                fArray[n2] = fArray[n4];
                fArray[n4] = f;
                nArray[n2] = nArray[n4];
                nArray[n4] = n5;
                class14.method187(fArray, nArray, n, n4 - 1);
                class14.method187(fArray, nArray, n4 + 1, n2);
                return;
            }
            if (fArray[n6] < f) {
                float f2 = fArray[n6];
                fArray[n6] = fArray[n4];
                fArray[n4] = f2;
                int n7 = nArray[n6];
                nArray[n6] = nArray[n4];
                nArray[n4++] = n7;
            }
            ++n6;
        }
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(CI)Z", garbageValue="2001552610")
    static boolean method188(char c) {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00ef\u00bf\u00bd$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(c) != -1;
    }
}

