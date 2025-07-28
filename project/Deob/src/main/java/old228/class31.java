package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.applet.Applet;
import java.io.File;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bd")
public class class31 {
    @ObfuscatedName(value="ay")
    static Applet field138 = null;
    @ObfuscatedName(value="ah")
    static String field137 = "";
    @ObfuscatedName(value="kz")
    @ObfuscatedGetter(intValue=-2011348113)
    static int field140;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIB)I", garbageValue="98")
    static int method496(int n, int n2) {
        OverlayDef class2642;
        OverlayDef class2643 = (OverlayDef) OverlayDef.field2914.method6578(n);
        if (class2643 == null) {
            byte[] byArray = OverlayDef.field2904.method7790(4, n);
            class2643 = new OverlayDef();
            if (byArray != null) {
                class2643.method5647(new class556(byArray), n);
            }
            class2643.method5646();
            OverlayDef.field2914.method6590(class2643, n);
            class2642 = class2643;
        } else {
            class2642 = class2643;
        }
        class2643 = class2642;
        if (class2643 != null) {
            if (class2643.field2908 < 0) {
                if (class2643.field2906 < 0) {
                    if (class2643.field2905 != 0xFF00FF) {
                        int n3 = class166.method3805(class2643.field2909, class2643.field2910, class2643.field2903);
                        int n4 = class161.method3688(n3, 96);
                        return class182.field1960[n4] | 0xFF000000;
                    }
                    return n2;
                }
                int n5 = class161.method3688(class182.field1957.field2300.vmethod4811(class2643.field2906), 96);
                return class182.field1960[n5] | 0xFF000000;
            }
            int n6 = class166.method3805(class2643.field2912, class2643.field2913, class2643.field2907);
            int n7 = class161.method3688(n6, 96);
            return class182.field1960[n7] | 0xFF000000;
        }
        return n2;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)Ljm;", garbageValue="-70")
    public static class236 method498(int n) {
        if (n >= 0 && n < class236.field2519.length && class236.field2519[n] != null) {
            return class236.field2519[n];
        }
        return new class236(n);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;ZB)Luv;", garbageValue="-12")
    public static class536 method493(String string, String string2, boolean bl) {
        File file = new File(class216.field2388, "preferences" + string + ".dat");
        if (file.exists()) {
            try {
                class536 class5362 = new class536(file, "rw", 10000L);
                return class5362;
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        String string3 = "";
        if (class73.field879 == 33) {
            string3 = "_rc";
        } else if (class73.field879 == 34) {
            string3 = "_wip";
        }
        File file2 = new File(class502.field5134, "jagex_" + string2 + "_preferences" + string + string3 + ".dat");
        if (!bl && file2.exists()) {
            try {
                class536 class5363 = new class536(file2, "rw", 10000L);
                return class5363;
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        try {
            class536 class5364 = new class536(file, "rw", 10000L);
            return class5364;
        }
        catch (IOException iOException) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName(value="bo")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="-2143778245")
    static int method494(int n, class81 class812, boolean bl) {
        return 2;
    }
}

