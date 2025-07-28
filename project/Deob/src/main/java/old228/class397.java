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

@ObfuscatedName(value="pp")
public class class397 {
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Lna;IIIS)V", garbageValue="30618")
    static final void method7893(class361 class3612, int n, int n2, int n3) {
        if (class3612.field3964 != null) {
            class3612.field3964[n] = n2;
            class3612.field3864[n] = n3;
            return;
        }
        throw new RuntimeException();
    }

    @ObfuscatedName(value="nc")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1383475643")
    static final void method7892() {
        Iterator iterator = client.field508.iterator();
        block0: while (iterator.hasNext()) {
            class103 class1032 = (class103)iterator.next();
            int n = 0;
            while (true) {
                if (n >= client.field673.field1406) continue block0;
                class94 class942 = class34.field189.field1329[client.field673.field1412[n]];
                if (class942 != null) {
                    class942.method2659();
                }
                ++n;
            }
            break;
        }
        return;
    }
}

