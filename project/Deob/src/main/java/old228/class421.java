package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="qj")
public final class class421 {
    @ObfuscatedName(value="ay")
    static final char[] field4727 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    @ObfuscatedName(value="ah")
    static long[] field4725 = new long[12];

    static {
        for (int i = 0; i < field4725.length; ++i) {
            class421.field4725[i] = (long)Math.pow(37.0, i);
        }
    }

    @ObfuscatedName(value="oc")
    @ObfuscatedSignature(descriptor="(I)Ljava/awt/datatransfer/Clipboard;", garbageValue="1286264344")
    public static Clipboard method8239() {
        return client.field521.method551();
    }
}

