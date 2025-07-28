package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jp")
public class class241
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmi;")
    static class315 field2583 = new class315(64);
    @ObfuscatedName(value="ao")
    public static int[] field2585;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="1218941172")
    public static int method5261(int n, int n2) {
        return (n << 8) + n2;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="878177340")
    public static void method5257() {
        ObjectDef.field2791.method6581();
        ObjectDef.field2792.method6581();
        ObjectDef.field2826.method6581();
        ObjectDef.field2794.method6581();
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(Lix;IIB)Lbq;", garbageValue="0")
    public static final class42 method5262(class214 class2142, int n, int n2) {
        if (n < 0 || n >= 2) {
            throw new IllegalArgumentException();
        }
        if (n2 < 256) {
            n2 = 256;
        }
        try {
            class42 class425 = class355.field3788.vmethod1106();
            class425.field262 = new int[(class42.field264 ? 2 : 1) * 256];
            class425.field263 = n2;
            class425.vmethod834();
            class425.field267 = (n2 & 0xFFFFFC00) + 1024;
            if (class425.field267 > 16384) {
                class425.field267 = 16384;
            }
            class425.vmethod854(class425.field267);
            if (class328.field3605 > 0 && class493.field5096 == null) {
                class493.field5096 = new class44();
                class42.field255 = Executors.newScheduledThreadPool(1);
                class42.field255.scheduleAtFixedRate(class493.field5096, 0L, 10L, TimeUnit.MILLISECONDS);
            }
            if (class493.field5096 != null) {
                if (class493.field5096.field289[n] != null) {
                    throw new IllegalArgumentException();
                }
                class493.field5096.field289[n] = class425;
            }
            return class425;
        }
        catch (Throwable throwable) {
            return new class42();
        }
    }
}

