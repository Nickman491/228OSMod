package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bx")
public class class30 {
    @ObfuscatedName(value="fo")
    @ObfuscatedSignature(descriptor="Lth;")
    static class494 field133;
    @ObfuscatedName(value="gr")
    @ObfuscatedGetter(intValue=-2093912385)
    static int field134;
    @ObfuscatedName(value="jl")
    @ObfuscatedSignature(descriptor="Ldz;")
    static class103 field131;

    static {
        ImageIO.setUseCache(false);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V", garbageValue="1")
    public static void method483(String string, String string2, String string3, int n, int n2) throws IOException {
        int n3;
        if (string2 != null && !string2.isEmpty()) {
            string = string + "-" + string2;
        }
        class438.field4823 = n2;
        class73.field879 = n;
        try {
            class544.field5402 = System.getProperty("os.name");
        }
        catch (Exception exception) {
            class544.field5402 = "Unknown";
        }
        class57.field379 = class544.field5402.toLowerCase();
        class502.field5134 = null;
        try {
            class502.field5134 = System.getProperty("jagex.userhome");
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (class502.field5134 == null) {
            try {
                class502.field5134 = System.getProperty("user.home");
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (class502.field5134 != null) {
            class502.field5134 = class502.field5134 + "/";
        }
        try {
            if (class57.field379.startsWith("win")) {
                if (class502.field5134 == null) {
                    class502.field5134 = System.getenv("USERPROFILE");
                }
            } else if (class502.field5134 == null) {
                class502.field5134 = System.getenv("HOME");
            }
            if (class502.field5134 != null) {
                class502.field5134 = class502.field5134 + "/";
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (class502.field5134 == null) {
            class502.field5134 = "~/";
        }
        class355.field3789 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class502.field5134, "/tmp/", ""};
        class128.field1522 = new String[]{".jagex_cache_" + class73.field879, ".file_store_" + class73.field879};
        block8: for (n3 = 0; n3 < 4; ++n3) {
            File[] fileArray;
            class216.field2388 = class145.method3556(string, string3, n3);
            if (!class216.field2388.exists()) {
                class216.field2388.mkdirs();
            }
            if ((fileArray = class216.field2388.listFiles()) == null) break;
            File[] fileArray2 = fileArray;
            for (int i = 0; i < fileArray2.length; ++i) {
                File file = fileArray2[i];
                if (!class104.method3008(file, false)) continue block8;
            }
        }
        class20.method308(class216.field2388);
        class91.method2635();
        class216.field2393 = new class537(new class536(class140.method3502("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        class216.field2394 = new class537(new class536(class140.method3502("main_file_cache.idx255"), "rw", 0x100000L), 6000, 0);
        class121.field1484 = new class537[class438.field4823];
        for (n3 = 0; n3 < class438.field4823; ++n3) {
            class121.field1484[n3] = new class537(new class536(class140.method3502("main_file_cache.idx" + n3), "rw", 0x100000L), 6000, 0);
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Ljc;", garbageValue="-1834814068")
    public static class239 method482(int n) {
        class239 class2392 = (class239)class239.field2566.method6578(n);
        if (class2392 != null) {
            return class2392;
        }
        byte[] byArray = class239.field2571.method7790(33, n);
        class2392 = new class239();
        class2392.field2568 = n;
        if (byArray != null) {
            class2392.method5229(new class556(byArray));
        }
        class239.field2566.method6590(class2392, n);
        return class2392;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="-1094768085")
    public static int method481(int n, int n2) {
        int n3 = 0;
        while (n2 > 0) {
            n3 = n3 << 1 | n & 1;
            n >>>= 1;
            --n2;
        }
        return n3;
    }

    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="(ILdm;ZB)I", garbageValue="-56")
    static int method484(int n, class81 class812, boolean bl) {
        if (n != 3500) {
            if (n != 3501) {
                if (n != 3502) {
                    return 2;
                }
                int n2 = class72.field865[--class63.field444];
                class72.field865[++class63.field444 - 1] = client.field731.method5774(n2) ? 1 : 0;
                return 1;
            }
            int n3 = class72.field865[--class63.field444];
            class72.field865[++class63.field444 - 1] = client.field731.method5755(n3) ? 1 : 0;
            return 1;
        }
        int n4 = class72.field865[--class63.field444];
        class72.field865[++class63.field444 - 1] = client.field731.method5776(n4) ? 1 : 0;
        return 1;
    }

    @ObfuscatedName(value="oj")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="716080260")
    public static boolean method480() {
        return client.field671 >= 2;
    }
}

