package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="sm")
public class class481 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lks;")
    final class274 field5037 = new class274();
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-417408189)
    int field5038;

    class481() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="hi")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="224190195")
    static final void method9355() {
        int n = 0;
        while (true) {
            block10: {
                block8: {
                    class40 class408;
                    class48 class4810;
                    int n2;
                    class39 class3910;
                    block14: {
                        int n3;
                        int n4;
                        int n5;
                        block12: {
                            block13: {
                                block11: {
                                    block9: {
                                        block6: {
                                            block7: {
                                                block5: {
                                                    if (n >= client.field748) break block5;
                                                    int n6 = n;
                                                    client.field751[n6] = client.field751[n6] - 1;
                                                    if (client.field751[n] >= -10) break block6;
                                                    break block7;
                                                }
                                                if (!client.field540) return;
                                                if (!class333.field3629.isEmpty()) {
                                                    return;
                                                }
                                                n = !class333.field3623.isEmpty() && class333.field3623.get(0) != null && ((class345)class333.field3623.get((int)0)).field3743 != null ? (int)(((class345)class333.field3623.get((int)0)).field3743.method6717() ? 1 : 0) : 0;
                                                if (n != 0) return;
                                                if (class544.field5403.method2896() != 0 && class153.method3620()) {
                                                    class96.method2709(class544.field5399, class544.field5403.method2896());
                                                }
                                                client.field540 = false;
                                                return;
                                            }
                                            --client.field748;
                                            break block8;
                                        }
                                        class3910 = client.field754[n];
                                        if (class3910 != null) break block9;
                                        class3910 = class39.method775(class69.field815, client.field698[n], 0);
                                        if (class3910 == null) break block10;
                                        int n7 = n;
                                        client.field751[n7] = client.field751[n7] + class3910.method773();
                                        client.field754[n] = class3910;
                                    }
                                    if (client.field751[n] >= 0) break block10;
                                    if (client.field752[n] == 0) break block11;
                                    n5 = (client.field752[n] & 0xFF) * 128;
                                    int n8 = client.field752[n] >> 16 & 0xFF;
                                    int n9 = Math.abs(class350.method6980(n8) - class407.field4693.field1213);
                                    int n10 = client.field752[n] >> 8 & 0xFF;
                                    int n11 = Math.abs(class350.method6980(n10) - class407.field4693.field1196);
                                    n4 = Math.max(n11 + n9 - 128, 0);
                                    n3 = Math.max(((client.field753[n] & 0x1F) - 1) * 128, 0);
                                    if (n4 < n5) break block12;
                                    break block13;
                                }
                                n2 = class544.field5403.method2898();
                                break block14;
                            }
                            client.field751[n] = -100;
                            break block10;
                        }
                        float f = n3 < n5 ? Math.min(Math.max((float)(n5 - n4) / (float)(n5 - n3), 0.0f), 1.0f) : 1.0f;
                        n2 = (int)(f * (float)class544.field5403.method2900());
                    }
                    if (n2 > 0 && (class4810 = class48.method971(class408 = class3910.method772().method782(class64.field457), 100, n2)) != null) {
                        class4810.method913(client.field750[n] - 1);
                        class476.field5014.method741(class4810);
                    }
                    client.field751[n] = -100;
                    break block10;
                }
                for (int i = n; i < client.field748; ++i) {
                    client.field698[i] = client.field698[i + 1];
                    client.field754[i] = client.field754[i + 1];
                    client.field750[i] = client.field750[i + 1];
                    client.field751[i] = client.field751[i + 1];
                    client.field752[i] = client.field752[i + 1];
                    client.field753[i] = client.field753[i + 1];
                }
                --n;
            }
            ++n;
        }
    }
}

