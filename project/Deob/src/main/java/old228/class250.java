package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jv")
public class class250
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static class315 field2677 = new class315(64);

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="-572190979")
    public static boolean method5357(int n, int n2) {
        return (n >> n2 + 1 & 1) != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="([Ljava/lang/String;[IIII)V", garbageValue="307997747")
    static void method5356(String[] stringArray, int[] nArray, int n, int n2) {
        if (n >= n2) return;
        int n3 = (n2 + n) / 2;
        int n4 = n;
        String string = stringArray[n3];
        stringArray[n3] = stringArray[n2];
        stringArray[n2] = string;
        int n5 = nArray[n3];
        nArray[n3] = nArray[n2];
        nArray[n2] = n5;
        int n6 = n;
        while (true) {
            if (n6 >= n2) {
                stringArray[n2] = stringArray[n4];
                stringArray[n4] = string;
                nArray[n2] = nArray[n4];
                nArray[n4] = n5;
                class250.method5356(stringArray, nArray, n, n4 - 1);
                class250.method5356(stringArray, nArray, n4 + 1, n2);
                return;
            }
            if (string == null || stringArray[n6] != null && stringArray[n6].compareTo(string) < (n6 & 1)) {
                String string2 = stringArray[n6];
                stringArray[n6] = stringArray[n4];
                stringArray[n4] = string2;
                int n7 = nArray[n6];
                nArray[n6] = nArray[n4];
                nArray[n4++] = n7;
            }
            ++n6;
        }
    }
}

