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

@ObfuscatedName(value="rb")
public class class455 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(longValue=-4641101876541563541L)
    long field4909 = -1L;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(longValue=6644330373994654651L)
    long field4903 = -1L;
    @ObfuscatedName(value="az")
    public boolean field4907 = false;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(longValue=-8356337548988540209L)
    long field4902 = 0L;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(longValue=2576810478100689245L)
    long field4904 = 0L;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(longValue=-6467865585511420701L)
    long field4905 = 0L;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-900855465)
    int field4906 = 0;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1473568515)
    int field4900 = 0;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-767770327)
    int field4908 = 0;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=2066281717)
    int field4901 = 0;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1947241197")
    public void method8937() {
        this.field4909 = class37.method724();
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1510722758")
    public void method8954() {
        if (-1L != this.field4909) {
            this.field4904 = class37.method724() - this.field4909;
            this.field4909 = -1L;
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1806918946")
    public void method8944(int n) {
        this.field4903 = class37.method724();
        this.field4906 = n;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="511371086")
    public void method8940() {
        if (this.field4903 != -1L) {
            this.field4902 = class37.method724() - this.field4903;
            this.field4903 = -1L;
        }
        ++this.field4908;
        this.field4907 = true;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1638122827")
    public void method8964() {
        this.field4907 = false;
        this.field4900 = 0;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="440496412")
    public void method8942() {
        this.method8940();
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-57710978")
    public void method8949(class556 class5562) {
        long l = this.field4904;
        if ((l /= 10L) < 0L) {
            l = 0L;
        } else if (l > 65535L) {
            l = 65535L;
        }
        class5562.method10266((int)l);
        long l2 = this.field4902;
        if ((l2 /= 10L) < 0L) {
            l2 = 0L;
        } else if (l2 > 65535L) {
            l2 = 65535L;
        }
        class5562.method10266((int)l2);
        long l3 = this.field4905;
        if ((l3 /= 10L) < 0L) {
            l3 = 0L;
        } else if (l3 > 65535L) {
            l3 = 65535L;
        }
        class5562.method10266((int)l3);
        class5562.method10266(this.field4906);
        class5562.method10266(this.field4900);
        class5562.method10266(this.field4908);
        class5562.method10266(this.field4901);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;Lpq;Lpq;Ljava/util/ArrayList;I)Z", garbageValue="311867327")
    public static boolean method8939(class391 class3912, class391 class3913, class391 class3914, ArrayList arrayList) {
        class333.field3628 = class3912;
        class553.field5461 = class3913;
        class333.field3624 = class3914;
        class333.field3625 = arrayList;
        return true;
    }

    @ObfuscatedName(value="cg")
    @ObfuscatedSignature(descriptor="(Lud;I)Ljava/lang/Object;", garbageValue="1496692321")
    static Object method8952(class544 class5442) {
        if (class5442 != null) {
            switch (class5442.field5394) {
                case 2: {
                    return class72.field865[--class63.field444];
                }
                default: {
                    throw new IllegalStateException("popValueOfType() failure - unsupported type");
                }
                case 0: 
            }
            return class72.field855[--class104.field1343];
        }
        throw new IllegalStateException("popValueOfType() failure - null baseVarType");
    }

    @ObfuscatedName(value="ir")
    @ObfuscatedSignature(descriptor="(Ldz;ZI)V", garbageValue="-1611699744")
    static final void method8951(class103 class1032, boolean bl) {
        int n = 0;
        while (true) {
            block5: {
                int n2;
                class105 class1052;
                block6: {
                    if (n >= class1032.field1331) {
                        return;
                    }
                    class1052 = class1032.field1330[class1032.field1332[n]];
                    if (class1052 == null || !class1052.vmethod3039() || class1052.field1354.field2620 != bl || !class1052.field1354.method5303()) break block5;
                    n2 = class1032.field1321;
                    int n3 = class1052.field1213 >> 7;
                    int n4 = class1052.field1196 >> 7;
                    if (n3 < 0 || n3 >= class1032.field1322 || n4 < 0 || n4 >= class1032.field1323) break block5;
                    if (class1052.field1268 * -2132848751 != 1 || (class1052.field1213 & 0x7F) != 64 || (class1052.field1196 & 0x7F) != 64) break block6;
                    if (class1032.field1326[n3][n4] == client.field617) break block5;
                    class1032.field1326[n3][n4] = client.field617;
                }
                long l = class79.method2452(0, 0, 1, !class1052.field1354.field2656, class1032.field1332[n], class1032.field1320);
                class1052.field1260 = client.field514;
                int n5 = class23.method337(class1032, class1052.field1268 * 936633408 - 64 + class1052.field1213, class1052.field1268 * 936633408 - 64 + class1052.field1196, n2);
                class1032.field1319.method4185(n2, class1052.field1213, class1052.field1196, n5, class1052.field1268 * 936633408 - 64 + 60, class1052, class1052.field1197, l, class1052.field1206);
            }
            ++n;
        }
    }
}

