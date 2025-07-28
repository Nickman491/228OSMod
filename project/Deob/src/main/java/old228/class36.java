package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="by")
public class class36 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lps;")
    public static class412 field219 = new class412();

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;Lks;I)Z", garbageValue="1407636165")
    public static boolean method722(class556 class5562, class274 class2742) {
        byte by = class5562.method10524();
        if (by != 0) {
            int n = class9.method65(class5562, by, 0);
            int n2 = class9.method65(class5562, by, 2);
            int n3 = class9.method65(class5562, by, 4);
            int n4 = class9.method65(class5562, by, 6);
            class2742.method5921(n, n2, n3, n4);
            return true;
        }
        return false;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="554766994")
    static int method716(int n, int n2) {
        class87 class872 = (class87)class87.field1057.method9985(n);
        if (class872 == null) {
            return -1;
        }
        if (n2 >= 0 && n2 < class872.field1058.length) {
            return class872.field1058[n2];
        }
        return -1;
    }

    @ObfuscatedName(value="ic")
    @ObfuscatedSignature(descriptor="(Ldz;B)V", garbageValue="0")
    static void method718(class103 class1032) {
        int n;
        int n2 = n = client.field648.field5612 - 1;
        if (class34.field189 == class1032 && n2 >= 0 && client.field648.field5614[n2] == 60) {
            int n3 = client.field648.field5615[n2] * 128;
            int n4 = 384;
            int n5 = Math.max(384, 2000 - client.field553 * 2);
            int n6 = class53.field339.vmethod9352() - (int)(class400.method7927(n3) * (double)n5);
            int n7 = class53.field339.vmethod9331() - (int)(class520.method9685(n3) * (double)n5);
            int n8 = class23.method337(class1032, class53.field339.vmethod9352(), class53.field339.vmethod9331(), class53.field339.vmethod9290());
            class1032.field1319.method4185(class1032.field1321, n6, n7, n8, 60, class53.field338, n3, 0L, false);
        }
    }

    @ObfuscatedName(value="ln")
    @ObfuscatedSignature(descriptor="(Lcr;IIS)V", garbageValue="512")
    static final void method721(class76 class762, int n, int n2) {
        if (class762 != null) {
            class508.method9611(class762.field914, class762.field911, class762.field906, class762.field904, class762.field908, class762.field909, class762.field910, class762.field907, n, n2);
        }
    }
}

