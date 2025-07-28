/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="el")
@Implements(value="UserComparator7")
public class UserComparator7
extends AbstractUserComparator {
    @ObfuscatedName(value="ay")
    @Export(value="reversed")
    final boolean reversed;

    public UserComparator7(boolean bl) {
        this.reversed = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lsu;Lsu;I)I", garbageValue="796003130")
    @Export(value="compareBuddy")
    int compareBuddy(Buddy buddy, Buddy buddy2) {
        if (buddy.world != 0 && buddy2.world != 0) {
            return this.reversed ? buddy.int2 - buddy2.int2 : buddy2.int2 - buddy.int2;
        }
        return this.compareUser(buddy, buddy2);
    }

    public int compare(Object object, Object object2) {
        return this.compareBuddy((Buddy)object, (Buddy)object2);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;Lpq;IZI)Lfl;", garbageValue="201102891")
    public static class144 method3330(AbstractArchive abstractArchive, AbstractArchive abstractArchive2, int n, boolean bl) {
        boolean bl2 = true;
        byte[] byArray = abstractArchive.getFile(n >> 16 & 0xFFFF, n & 0xFFFF);
        if (byArray == null) {
            bl2 = false;
            return null;
        }
        int n2 = (byArray[1] & 0xFF) << 8 | byArray[2] & 0xFF;
        byte[] byArray2 = bl ? abstractArchive2.getFile(0, n2) : abstractArchive2.getFile(n2, 0);
        if (byArray2 == null) {
            bl2 = false;
        }
        if (!bl2) {
            return null;
        }
        if (WorldMapID.field3245 == null) {
            class142.field1631 = Runtime.getRuntime().availableProcessors();
            WorldMapID.field3245 = new ThreadPoolExecutor(0, class142.field1631, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(class142.field1631 * 100 + 100), new class141());
        }
        try {
            return new class144(abstractArchive, abstractArchive2, n, bl);
        }
        catch (Exception exception) {
            return null;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-109")
    static void method3331() {
        SecureRandomCallable.Tiles_underlays = null;
        SecureRandomFuture.Tiles_overlays = null;
        Tiles.Tiles_shapes = null;
        Tiles.field1026 = null;
        class538.field5380 = null;
        Tiles.Tiles_underlays2 = null;
        WorldMapID.field3244 = null;
        InvDefinition.Tiles_hue = null;
        Tiles.Tiles_saturation = null;
        Tiles.Tiles_lightness = null;
        class4.Tiles_hueMultiplier = null;
        class557.field5476 = null;
    }

    @ObfuscatedName(value="jd")
    @ObfuscatedSignature(descriptor="(IIIIIIIIIIIIIII)V", garbageValue="853514196")
    static void method3332(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14) {
        n2 = n2 * 128 + 64;
        n3 = n3 * 128 + 64;
        n4 = n4 * 128 + 64;
        n5 = n5 * 128 + 64;
        Projectile projectile = new Projectile(n7, n, n2, n3, Canvas.method337(class30.field131, n2, n3, n) - n8, n10 + Client.cycle, n11 + Client.cycle, n12, n13, n14, n6, n9);
        projectile.setDestination(n4, n5, Canvas.method337(class30.field131, n4, n5, n) - n9, n10 + Client.cycle);
        class30.field131.field1338.addFirst(projectile);
    }
}

