/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="on")
public class class369
extends Enum
implements class404 {
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
    @Export(value="js5Socket")
    static AbstractSocket js5Socket;
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
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.field4060;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Lip;", garbageValue="1429932229")
    @Export(value="getInvDefinition")
    public static InvDefinition getInvDefinition(int n) {
        InvDefinition invDefinition = (InvDefinition)InvDefinition.InvDefinition_cached.get(n);
        if (invDefinition != null) {
            return invDefinition;
        }
        byte[] byArray = InvDefinition.InvDefinition_archive.takeFile(5, n);
        invDefinition = new InvDefinition();
        if (byArray != null) {
            invDefinition.decode(new Buffer(byArray));
        }
        InvDefinition.InvDefinition_cached.put(invDefinition, n);
        return invDefinition;
    }

    @ObfuscatedName(value="bo")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-866296781")
    @Export(value="getGcDuration")
    protected static int getGcDuration() {
        int n = 0;
        if (class522.garbageCollector == null || !class522.garbageCollector.isValid()) {
            try {
                for (GarbageCollectorMXBean garbageCollectorMXBean : ManagementFactory.getGarbageCollectorMXBeans()) {
                    if (!garbageCollectorMXBean.isValid()) continue;
                    class522.garbageCollector = garbageCollectorMXBean;
                    GameEngine.garbageCollectorLastCheckTimeMs = -1L;
                    GameEngine.garbageCollectorLastCollectionTime = -1L;
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (class522.garbageCollector != null) {
            long l = ReflectionCheck.method724();
            long l2 = class522.garbageCollector.getCollectionTime();
            if (-1L != GameEngine.garbageCollectorLastCollectionTime) {
                long l3 = l2 - GameEngine.garbageCollectorLastCollectionTime;
                long l4 = l - GameEngine.garbageCollectorLastCheckTimeMs;
                if (l4 != 0L) {
                    n = (int)(100L * l3 / l4);
                }
            }
            GameEngine.garbageCollectorLastCollectionTime = l2;
            GameEngine.garbageCollectorLastCheckTimeMs = l;
        }
        return n;
    }
}

