package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="on")
public class class369
extends Enum
implements MouseWheel {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lon;")
    static final /* enum */ class369 field4063 = new class369("runelite", 0, 0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lon;")
    static final /* enum */ class369 field4059 = new class369("runelite", 1, 1);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lon;")
    static final /* enum */ class369 field4062 = new class369("runelite", 2, 2);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lon;")
    public static final /* enum */ class369 field4061 = new class369("runelite", 3, 3);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lon;")
    static final /* enum */ class369 field4064 = new class369("runelite", 4, 4);
    @ObfuscatedName(value="ev")
    @ObfuscatedSignature(descriptor="Lsq;")
    static class486 field4058;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=171324907)
    final int field4060;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    class369() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.field4060 = var3_1;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    public int vmethod10703() {
        return this.field4060;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Lip;", garbageValue="1429932229")
    public static class229 method7611(int n) {
        class229 class2292 = (class229)class229.field2485.method6578(n);
        if (class2292 != null) {
            return class2292;
        }
        byte[] byArray = class229.field2484.method7790(5, n);
        class2292 = new class229();
        if (byArray != null) {
            class2292.method5113(new class556(byArray));
        }
        class229.field2485.method6590(class2292, n);
        return class2292;
    }

    @ObfuscatedName(value="bo")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-866296781")
    protected static int method7610() {
        int n = 0;
        if (class522.field5234 == null || !class522.field5234.isValid()) {
            try {
                for (GarbageCollectorMXBean garbageCollectorMXBean : ManagementFactory.getGarbageCollectorMXBeans()) {
                    if (!garbageCollectorMXBean.isValid()) continue;
                    class522.field5234 = garbageCollectorMXBean;
                    class34.field188 = -1L;
                    class34.field181 = -1L;
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (class522.field5234 != null) {
            long l = class37.method724();
            long l2 = class522.field5234.getCollectionTime();
            if (-1L != class34.field181) {
                long l3 = l2 - class34.field181;
                long l4 = l - class34.field188;
                if (l4 != 0L) {
                    n = (int)(100L * l3 / l4);
                }
            }
            class34.field181 = l2;
            class34.field188 = l;
        }
        return n;
    }
}

