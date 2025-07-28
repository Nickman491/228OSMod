/*
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
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmi;")
    static EvictingDualNodeHashTable field2735 = new EvictingDualNodeHashTable(64);

    @ObfuscatedName(value="ie")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="40")
    static final void method5425() {
        int n = Client.field673.field1406;
        int[] nArray = Client.field673.field1412;
        Iterator iterator = Client.field508.iterator();
        block0: while (iterator.hasNext()) {
            class103 class1032 = (class103)iterator.next();
            int n2 = 0;
            while (true) {
                if (n2 >= n) continue block0;
                Player player = class1032.field1329[nArray[n2]];
                if (player != null) {
                    class275.method5935(class1032, player, 1);
                }
                ++n2;
            }
            break;
        }
        return;
    }
}

