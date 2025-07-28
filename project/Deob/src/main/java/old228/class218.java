package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="id")
public class class218 {
    @ObfuscatedName(value="ay")
    static boolean field2396 = false;
    @ObfuscatedName(value="ah")
    static File field2397;
    @ObfuscatedName(value="az")
    static Hashtable field2398;

    static {
        field2398 = new Hashtable(16);
    }

    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="(ILdm;ZB)I", garbageValue="74")
    static int method4954(int n, class81 class812, boolean bl) {
        if (n != 6809) {
            return 2;
        }
        int n2 = class72.field865[--class63.field444];
        ObjectDef class2622 = class142.method3512(n2);
        class72.field855[++class104.field1343 - 1] = class2622 != null ? class2622.field2799 : "";
        return 1;
    }
}

