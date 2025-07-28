package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="lg")
public abstract class class309
implements class311 {
    @ObfuscatedName(value="at")
    static int[] field3287;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1974898491)
    protected int field3286;

    @ObfuscatedSignature(descriptor="(Lol;Lph;I)V")
    protected class309(class377 class3772, class406 class4062, int n) {
        this.field3286 = n;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)[Lvb;", garbageValue="16")
    public static class568[] method6540() {
        return new class568[]{class568.field5555, class568.field5557, class568.field5556};
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="0")
    public static void method6539(int n, int n2, int n3, int n4) {
        if (class333.field3623.size() > 1 && class333.field3623.get(0) != null && ((class345)class333.field3623.get((int)0)).field3743.method6717() && class333.field3623.get(1) != null && ((class345)class333.field3623.get((int)1)).field3743.method6717()) {
            class333.field3630 = n;
            class333.field3632 = n2;
            class333.field3633 = n3;
            class333.field3634 = n4;
            class333.field3629.add(new class442(null));
            ArrayList<class444> arrayList = new ArrayList<class444>();
            arrayList.add(new class444(new class447(null, 1, false, class333.field3634), class333.field3633));
            arrayList.add(new class444(new class446(null, 0, false, class333.field3632), class333.field3630));
            class333.field3629.add(new class449(null, arrayList));
            if (class333.field3626.get(0) != null && class333.field3626.get(1) != null) {
                class345 class3452 = (class345)class333.field3626.get(0);
                class333.field3626.set(0, class333.field3623.get(1));
                class333.field3626.set(1, class3452);
            }
        }
    }
}

