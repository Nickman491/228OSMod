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

@ObfuscatedName(value="rw")
public class class450
extends class448 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    class391 field4875;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpq;")
    class391 field4874;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lpq;")
    class391 field4873;

    @ObfuscatedSignature(descriptor="(Lrh;Lpq;Lpq;Lpq;)V")
    public class450(class448 class4482, class391 class3912, class391 class3913, class391 class3914) {
        super(class4482);
        this.field4875 = class3912;
        this.field4874 = class3913;
        this.field4873 = class3914;
        this.field4868 = "LoadSongTask";
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1892560666")
    public boolean vmethod8883() {
        int n = 0;
        for (class345 class3452 : class333.field3623) {
            if (class3452 != null && class3452.field3743.field3668 > 1 && class3452.field3743.method6749()) {
                this.method8861("Attempted to load patches of already loading midiplayer!");
                return true;
            }
            if (class3452 == null || class3452.field3741) {
                ++n;
                continue;
            }
            try {
                if (class3452.field3736 == null || class3452.field3735 == -1 || class3452.field3737 == -1) {
                    ++n;
                    continue;
                }
                if (class3452.field3747 == null) {
                    class3452.field3747 = class342.method6928(class3452.field3736, class3452.field3735, class3452.field3737);
                    if (class3452.field3747 == null) continue;
                }
                if (class3452.field3746 == null) {
                    class3452.field3746 = new class45(this.field4873, this.field4874);
                }
                if (!class3452.field3743.method6711(class3452.field3747, this.field4875, class3452.field3746)) continue;
                ++n;
                class3452.field3741 = true;
                class3452.field3743.method6712();
            }
            catch (Exception exception) {
                class255.method5410(null, exception);
                this.method8861(exception.getMessage());
                return true;
            }
        }
        return n == class333.field3623.size();
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="([FIFI)F", garbageValue="889884528")
    static float method8887(float[] fArray, int n, float f) {
        float f2 = fArray[n];
        int n2 = n - 1;
        while (n2 >= 0) {
            f2 = fArray[n2] + f * f2;
            --n2;
        }
        return f2;
    }

    @ObfuscatedName(value="ng")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1840217495")
    static final void method8884() {
        Iterator iterator = client.field508.iterator();
        block0: while (iterator.hasNext()) {
            class103 class1032 = (class103)iterator.next();
            int n = 0;
            while (true) {
                if (n >= client.field673.field1406) continue block0;
                class94 class942 = class34.field189.field1329[client.field673.field1412[n]];
                if (class942 != null) {
                    class942.method2662();
                }
                ++n;
            }
            break;
        }
        return;
    }
}

