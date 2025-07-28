package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="re")
public class class443
extends class448 {
    @ObfuscatedName(value="ay")
    ArrayList field4856;

    @ObfuscatedSignature(descriptor="(Lrh;Ljava/util/ArrayList;)V")
    public class443(class448 class4482, ArrayList arrayList) {
        super(class4482);
        this.field4868 = "ClearRequestTask";
        this.field4856 = arrayList;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1892560666")
    public boolean vmethod8883() {
        if (this.field4856.isEmpty()) {
            return true;
        }
        for (class345 class3452 : this.field4856) {
            try {
                if (!class333.field3623.contains(class3452)) continue;
                if (class3452 == null) {
                    class333.field3623.remove(class3452);
                    continue;
                }
                if (class3452.field3743.field3668 > 0) {
                    --class3452.field3743.field3668;
                }
                if (class3452.field3743.field3668 == 0) {
                    class3452.field3743.method6721();
                    class3452.field3743.method6714();
                    class3452.field3743.method6709(0);
                }
                int n = class3452.field3735;
                int n2 = class3452.field3737;
                for (class339 class3392 : class333.field3627) {
                    class3392.vmethod6894(n, n2);
                }
                class333.field3623.remove(class3452);
            }
            catch (Exception exception) {
                class255.method5410(null, exception);
                this.method8861(exception.getMessage());
                class333.field3623.clear();
                return true;
            }
        }
        return true;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="([BI)V", garbageValue="1336812875")
    static void method8827(byte[] byArray) {
        int n;
        class556 class5562 = new class556(byArray);
        class5562.field5471 = byArray.length - 2;
        class571.field5582 = class5562.method10307();
        class241.field2585 = new int[class571.field5582];
        class571.field5583 = new int[class571.field5582];
        class571.field5584 = new int[class571.field5582];
        class403.field4657 = new int[class571.field5582];
        class240.field2580 = new byte[class571.field5582][];
        class5562.field5471 = byArray.length - 7 - class571.field5582 * 8;
        class571.field5581 = class5562.method10307();
        class174.field1832 = class5562.method10307();
        int n2 = (class5562.method10282() & 0xFF) + 1;
        for (n = 0; n < class571.field5582; ++n) {
            class241.field2585[n] = class5562.method10307();
        }
        for (n = 0; n < class571.field5582; ++n) {
            class571.field5583[n] = class5562.method10307();
        }
        for (n = 0; n < class571.field5582; ++n) {
            class571.field5584[n] = class5562.method10307();
        }
        for (n = 0; n < class571.field5582; ++n) {
            class403.field4657[n] = class5562.method10307();
        }
        class5562.field5471 = byArray.length - 7 - class571.field5582 * 8 - (n2 - 1) * 3;
        class25.field108 = new int[n2];
        n = 1;
        while (true) {
            if (n >= n2) {
                class5562.field5471 = 0;
                n = 0;
                while (true) {
                    int n3;
                    if (n >= class571.field5582) {
                        return;
                    }
                    int n4 = class571.field5584[n];
                    int n5 = class403.field4657[n];
                    int n6 = n5 * n4;
                    byte[] byArray2 = new byte[n6];
                    class240.field2580[n] = byArray2;
                    int n7 = class5562.method10282();
                    if (n7 != 0) {
                        if (n7 == 1) {
                            for (n3 = 0; n3 < n4; ++n3) {
                                for (int i = 0; i < n5; ++i) {
                                    byArray2[n3 + n4 * i] = class5562.method10524();
                                }
                            }
                        }
                    } else {
                        for (n3 = 0; n3 < n6; ++n3) {
                            byArray2[n3] = class5562.method10524();
                        }
                    }
                    ++n;
                }
            }
            class25.field108[n] = class5562.method10285();
            if (class25.field108[n] == 0) {
                class25.field108[n] = 1;
            }
            ++n;
        }
    }
}

