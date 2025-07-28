package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jo")
public class class257
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmi;")
    static class315 field2735 = new class315(64);

    @ObfuscatedName(value="ie")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="40")
    static final void method5425() {
        int n = client.field673.field1406;
        int[] nArray = client.field673.field1412;
        Iterator iterator = client.field508.iterator();
        block0: while (iterator.hasNext()) {
            class103 class1032 = (class103)iterator.next();
            int n2 = 0;
            while (true) {
                if (n2 >= n) continue block0;
                class94 class942 = class1032.field1329[nArray[n2]];
                if (class942 != null) {
                    class275.method5935(class1032, class942, 1);
                }
                ++n2;
            }
            break;
        }
        return;
    }
}

