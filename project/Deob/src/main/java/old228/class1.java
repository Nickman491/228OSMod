package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ah")
public class class1
implements Callable {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lvy;")
    final class556 field2;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lao;")
    final class3 field1;
    @ObfuscatedSignature(descriptor="Lax;")
    final /* synthetic */ class7 this$0;

    @ObfuscatedSignature(descriptor="(Lax;Lvy;Lao;)V")
    class1(class7 class710, class556 class5562, class3 class347) {
        this.this$0 = class710;
        this.field2 = class5562;
        this.field1 = class347;
    }

    public Object call() {
        return this.field1.vmethod12(this.field2);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;Lue;S)Lue;", garbageValue="-4982")
    static final class529 method7(class556 class5562, class529 class5292) {
        int n;
        int n2 = class5562.method10282();
        if (class5292 == null) {
            n = class357.method7049(n2);
            class5292 = new class529(n);
        }
        n = 0;
        while (n < n2) {
            boolean bl = class5562.method10282() == 1;
            int n3 = class5562.method10285();
            class514 class5142 = bl ? new class511(class5562.method10290()) : new class513(class5562.method10440());
            class5292.method9970(class5142, n3);
            ++n;
        }
        return class5292;
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ljava/util/ArrayList;IIIIZI)V", garbageValue="-1322829904")
    public static void method9(ArrayList var0, int var1_1, int var2_2, int var3_3, int var4_4, boolean var5_5) {
        block17: {
            block16: {
                if (var0.isEmpty()) break block17;
                class333.field3631.clear();
                class333.field3629.clear();
                if (!var5_5) {
                    for (var6_6 = 0; var6_6 < class333.field3623.size(); ++var6_6) {
                        var7_7 = (class345)class333.field3623.get(var6_6);
                        if (var7_7 != null) {
                            if (!var7_7.field3744) {
                                var7_7.field3744 = true;
                                continue;
                            }
                            if (var7_7.field3743.field3668 > 0) {
                                --var7_7.field3743.field3668;
                            }
                            var7_7.field3743.method6721();
                            var7_7.field3743.method6714();
                            var7_7.field3743.method6709(0);
                            class333.field3623.remove(var6_6);
                            --var6_6;
                            continue;
                        }
                        class333.field3623.remove(var6_6);
                        --var6_6;
                    }
                } else {
                    var12_8 = class333.field3623.iterator();
lbl26:
                    // 3 sources

                    while (true) {
                        if (var12_8.hasNext()) break block16;
                        class333.field3623.clear();
                        break;
                    }
                }
                if (!var5_5) {
                    class333.field3626.clear();
                }
                var12_8 = var0.iterator();
                while (true) {
                    block18: {
                        block19: {
                            block20: {
                                if (var12_8.hasNext()) break block18;
                                if (class333.field3631.isEmpty()) break block19;
                                class333.field3630 = var1_1;
                                class333.field3632 = var2_2;
                                class333.field3633 = var3_3;
                                class333.field3634 = var4_4;
                                class333.field3629.add(new class441(null));
                                class333.field3629.add(new class450(null, class333.field3628, class553.field5461, class333.field3624));
                                var12_8 = new ArrayList<E>();
                                var12_8.add(new class445(new class447(null, 0, true, class333.field3634)));
                                if (!class333.field3623.isEmpty()) break block20;
                                class333.field3629.add(new class444(null, class333.field3633));
                                class333.field3629.add(new class449(null, (ArrayList)var12_8));
                                ** GOTO lbl65
                            }
                            var7_7 = new ArrayList<E>();
                            var7_7.add(new class444(new class449(null, (ArrayList)var12_8), class333.field3633));
                            var9_13 = new ArrayList<Object>();
                            var10_9 = class333.field3623.iterator();
                            while (true) {
                                block21: {
                                    if (var10_9.hasNext()) break block21;
                                    var9_13 = var8_14 = var9_13;
                                    var7_7.add(new class444(new class446(new class443(null, var9_13), 0, false, class333.field3632), class333.field3630));
                                    class333.field3629.add(new class449(null, (ArrayList)var7_7));
lbl65:
                                    // 2 sources

                                    return;
                                }
                                var11_10 = (class345)var10_9.next();
                                var9_13.add(var11_10);
                            }
                        }
                        return;
                    }
                    var7_7 = (class345)var12_8.next();
                    if (var7_7.field3735 == -1 || var7_7.field3737 == -1) continue;
                    if (!var5_5) {
                        class333.field3626.add(var7_7);
                    }
                    class333.field3631.add(var7_7);
                }
            }
            var7_7 = (class345)var12_8.next();
            if (var7_7 == null) ** GOTO lbl26
            var7_7.field3743.method6721();
            var7_7.field3743.method6714();
            var7_7.field3743.method6709(0);
            var7_7.field3743.field3668 = 0;
            var13_11 = var7_7.field3735;
            var14_12 = var7_7.field3737;
            var10_9 = class333.field3627.iterator();
            while (true) {
                if (var10_9.hasNext()) ** break;
                ** continue;
                var11_10 = (class339)var10_9.next();
                var11_10.vmethod6894(var13_11, var14_12);
            }
        }
    }
}

