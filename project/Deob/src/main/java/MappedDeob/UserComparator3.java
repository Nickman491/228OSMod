/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="eu")
@Implements(value="UserComparator3")
public class UserComparator3
extends AbstractUserComparator {
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=1260367595)
    @Export(value="loginBoxCenter")
    static int loginBoxCenter;
    @ObfuscatedName(value="gq")
    @ObfuscatedGetter(intValue=-1449433465)
    static int field1506;
    @ObfuscatedName(value="ay")
    @Export(value="reversed")
    final boolean reversed;

    public UserComparator3(boolean bl) {
        this.reversed = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lsu;Lsu;I)I", garbageValue="1663642696")
    @Export(value="compareBuddy")
    int compareBuddy(Buddy buddy, Buddy buddy2) {
        if (buddy2.world == buddy.world) {
            return this.compareUser(buddy, buddy2);
        }
        return this.reversed ? buddy.world - buddy2.world : buddy2.world - buddy.world;
    }

    public int compare(Object object, Object object2) {
        return this.compareBuddy((Buddy)object, (Buddy)object2);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="908157200")
    public static void method3346() {
        class254.field2716.clear();
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IIS)V", garbageValue="23665")
    public static void method3347(int var0, int var1_1) {
        block5: {
            class333.field3630 = var0;
            class333.field3632 = var1_1;
            class333.field3633 = 0;
            class333.field3634 = 0;
            class333.field3626.clear();
            class333.field3629.clear();
            if (class333.field3623.isEmpty() || var0 == 0 && var1_1 == 0) break block5;
            class333.field3629.add(new class444(null, class333.field3630));
            class333.field3629.add(new class446(null, 0, false, class333.field3632));
            var3_2 = new ArrayList<class345>();
            var4_4 = class333.field3623.iterator();
            while (true) {
                block6: {
                    if (var4_4.hasNext()) break block6;
                    var3_2 = var2_6 = var3_2;
                    class333.field3629.add(new class443(null, var3_2));
                    ** GOTO lbl30
                }
                var5_5 = (class345)var4_4.next();
                var3_2.add(var5_5);
            }
        }
        var2_7 = class333.field3623.iterator();
        block1: while (true) {
            block7: {
                if (var2_7.hasNext()) break block7;
                class333.field3623.clear();
lbl30:
                // 2 sources

                return;
            }
            var3_3 = (class345)var2_7.next();
            if (var3_3 == null) continue;
            var3_3.field3743.clear();
            var3_3.field3743.method6714();
            var3_3.field3743.setPcmStreamVolume(0);
            var3_3.field3743.field3668 = 0;
            var8_10 = var3_3.field3735;
            var9_11 = var3_3.field3737;
            var6_8 = class333.field3627.iterator();
            while (true) {
                if (var6_8.hasNext()) ** break;
                continue block1;
                var7_9 = (class339)var6_8.next();
                var7_9.vmethod6894(var8_10, var9_11);
            }
            break;
        }
    }
}

