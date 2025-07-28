/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="qm")
public class class420 {
    @ObfuscatedName(value="wj")
    @ObfuscatedSignature(descriptor="Lua;")
    @Export(value="worldMap")
    static WorldMap worldMap;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ht")
    @ObfuscatedSignature(descriptor="(Ljava/util/ArrayList;IIIIB)V", garbageValue="120")
    static void method8237(ArrayList arrayList, int n, int n2, int n3, int n4) {
        Object object;
        boolean bl;
        if (arrayList.isEmpty()) return;
        int n5 = (Integer)arrayList.get(0);
        if (n5 == -1 && !Client.playingJingle) {
            UserComparator3.method3347(0, 0);
            return;
        }
        if (n5 == -1) return;
        if (class333.field3626.isEmpty()) {
            bl = false;
        } else {
            object = (class345)class333.field3626.get(0);
            if (object != null && n5 == ((class345)object).field3735) {
                return;
            }
            boolean bl2 = false;
            bl = bl2;
        }
        if (bl) return;
        if (class544.clientPreferences.method2896() == 0) return;
        object = new ArrayList();
        int n6 = 0;
        while (true) {
            if (n6 >= arrayList.size()) {
                if (!Client.playingJingle) {
                    class1.method9((ArrayList)object, n, n2, n3, n4, false);
                    return;
                } else {
                    class220.method4973((ArrayList)object, n, n2, n3, n4);
                }
                return;
            }
            ((ArrayList)object).add(new class345((AbstractArchive)class544.field5399, (Integer)arrayList.get(n6), 0, class544.clientPreferences.method2896(), false));
            ++n6;
        }
    }
}

