/*
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
    static GraphicsDefaults field133;
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
        class438.idxCount = n2;
        class73.cacheGamebuild = n;
        try {
            class544.field5402 = System.getProperty("os.name");
        }
        catch (Exception exception) {
            class544.field5402 = "Unknown";
        }
        Decimator.field379 = class544.field5402.toLowerCase();
        class502.userHomeDirectory = null;
        try {
            class502.userHomeDirectory = System.getProperty("jagex.userhome");
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (class502.userHomeDirectory == null) {
            try {
                class502.userHomeDirectory = System.getProperty("user.home");
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (class502.userHomeDirectory != null) {
            class502.userHomeDirectory = class502.userHomeDirectory + "/";
        }
        try {
            if (Decimator.field379.startsWith("win")) {
                if (class502.userHomeDirectory == null) {
                    class502.userHomeDirectory = System.getenv("USERPROFILE");
                }
            } else if (class502.userHomeDirectory == null) {
                class502.userHomeDirectory = System.getenv("HOME");
            }
            if (class502.userHomeDirectory != null) {
                class502.userHomeDirectory = class502.userHomeDirectory + "/";
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (class502.userHomeDirectory == null) {
            class502.userHomeDirectory = "~/";
        }
        class355.field3789 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class502.userHomeDirectory, "/tmp/", ""};
        BuddyRankComparator.field1522 = new String[]{".jagex_cache_" + class73.cacheGamebuild, ".file_store_" + class73.cacheGamebuild};
        block8: for (n3 = 0; n3 < 4; ++n3) {
            File[] fileArray;
            JagexCache.cacheDir = class145.method3556(string, string3, n3);
            if (!JagexCache.cacheDir.exists()) {
                JagexCache.cacheDir.mkdirs();
            }
            if ((fileArray = JagexCache.cacheDir.listFiles()) == null) break;
            File[] fileArray2 = fileArray;
            for (int i = 0; i < fileArray2.length; ++i) {
                File file = fileArray2[i];
                if (!HealthBar.method3008(file, false)) continue block8;
            }
        }
        class20.method308(JagexCache.cacheDir);
        MouseRecorder.method2635();
        JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class140.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class140.getFile("main_file_cache.idx255"), "rw", 0x100000L), 6000, 0);
        UserComparator4.JagexCache_idxFiles = new BufferedFile[class438.idxCount];
        for (n3 = 0; n3 < class438.idxCount; ++n3) {
            UserComparator4.JagexCache_idxFiles[n3] = new BufferedFile(new AccessFile(class140.getFile("main_file_cache.idx" + n3), "rw", 0x100000L), 6000, 0);
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Ljc;", garbageValue="-1834814068")
    public static HealthBarDefinition method482(int n) {
        HealthBarDefinition healthBarDefinition = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get(n);
        if (healthBarDefinition != null) {
            return healthBarDefinition;
        }
        byte[] byArray = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, n);
        healthBarDefinition = new HealthBarDefinition();
        healthBarDefinition.field2568 = n;
        if (byArray != null) {
            healthBarDefinition.decode(new Buffer(byArray));
        }
        HealthBarDefinition.HealthBarDefinition_cached.put(healthBarDefinition, n);
        return healthBarDefinition;
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
    static int method484(int n, Script script, boolean bl) {
        if (n != 3500) {
            if (n != 3501) {
                if (n != 3502) {
                    return 2;
                }
                int n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.field731.method5774(n2) ? 1 : 0;
                return 1;
            }
            int n3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.field731.method5755(n3) ? 1 : 0;
            return 1;
        }
        int n4 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.field731.method5776(n4) ? 1 : 0;
        return 1;
    }

    @ObfuscatedName(value="oj")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="716080260")
    public static boolean method480() {
        return Client.staffModLevel >= 2;
    }
}

