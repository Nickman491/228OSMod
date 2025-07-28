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

@ObfuscatedName(value="eq")
public final class class105
extends class99 {
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1158988943)
    static int field1352 = 1;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-1940611065)
    static int field1349 = 1;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ljz;")
    class247 field1354;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-299363553)
    int field1350;
    @ObfuscatedName(value="az")
    String field1348 = "";
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=777313087)
    int field1351 = 31;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lvn;")
    class557 field1356;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Ljs;")
    class246 field1353;
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Ljs;")
    class246 field1355;

    class105() {
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="105")
    public int vmethod9290() {
        return this.field1350;
    }

    @Override
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(B)Lhv;", garbageValue="-7")
    protected final class198 vmethod4447() {
        if (this.field1354 == null) {
            return null;
        }
        SequenceDef class2652 = this.field1240 != -1 && this.field1271 == 0 ? class33.method520(this.field1240) : null;
        SequenceDef class2653 = this.field1238 != -1 && (this.field1238 != this.field1201 || class2652 == null) ? class33.method520(this.field1238) : null;
        class198 class1982 = null;
        class1982 = this.field1353 != null && this.field1353.field2614 ? class407.field4693.field1121.method7058(class2652, this.field1241, class2653, this.field1237) : this.field1354.method5299(class2652, this.field1241, class2653, this.field1237, this.field1353);
        if (class1982 == null) {
            return null;
        }
        class1982.method4600();
        this.field1255 = class1982.field2116;
        int n = class1982.field2195;
        class1982 = this.method2807(class1982);
        if (this.field1354.field2622 == 1) {
            class1982.field2239 = true;
        }
        if (this.field1208 != 0 && client.field514 >= this.field1256 && client.field514 < this.field1252) {
            class1982.field2196 = this.field1258;
            class1982.field2257 = this.field1211;
            class1982.field2206 = this.field1261;
            class1982.field2225 = this.field1208;
            class1982.field2193 = (short)n;
        } else {
            class1982.field2225 = 0;
        }
        return class1982;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="1244068072")
    void method3022(String string) {
        this.field1348 = string == null ? "" : string;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="13")
    void method3013(int n) {
        this.field1351 = n;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="50")
    boolean method3066(int n) {
        if (n >= 0 && n <= 4) {
            return (this.field1351 & 1 << n) != 0;
        }
        return true;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="1259463685")
    final String method3015() {
        if (this.field1348.isEmpty()) {
            class247 class2472 = this.field1354;
            if (class2472.field2663 != null && (class2472 = class2472.method5302()) == null) {
                class2472 = this.field1354;
            }
            return class2472.field2621;
        }
        return this.field1348;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(ILkq;I)V", garbageValue="-433229914")
    final void method3012(int n, class275 class2752) {
        int n2 = this.field1266[0];
        int n3 = this.field1221[0];
        if (n == 0) {
            --n2;
            ++n3;
        }
        if (n == 1) {
            ++n3;
        }
        if (n == 2) {
            ++n2;
            ++n3;
        }
        if (n == 3) {
            --n2;
        }
        if (n == 4) {
            ++n2;
        }
        if (n == 5) {
            --n2;
            --n3;
        }
        if (n == 6) {
            --n3;
        }
        if (n == 7) {
            ++n2;
            --n3;
        }
        if (this.field1240 != -1 && class33.method520((int)this.field1240).field2942 == 1) {
            this.field1240 = -1;
        }
        if (this.field1265 < 9) {
            ++this.field1265;
        }
        int n4 = this.field1265;
        while (true) {
            if (n4 <= 0) {
                this.field1266[0] = n2;
                this.field1221[0] = n3;
                this.field1264[0] = class2752;
                return;
            }
            this.field1266[n4] = this.field1266[n4 - 1];
            this.field1221[n4] = this.field1221[n4 - 1];
            this.field1264[n4] = this.field1264[n4 - 1];
            --n4;
        }
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(IIZB)V", garbageValue="-22")
    final void method3049(int n, int n2, boolean bl) {
        if (this.field1240 != -1 && class33.method520((int)this.field1240).field2942 == 1) {
            this.field1240 = -1;
        }
        if (!bl) {
            int n3 = n - this.field1266[0];
            int n4 = n2 - this.field1221[0];
            if (n3 >= -8 && n3 <= 8 && n4 >= -8 && n4 <= 8) {
                if (this.field1265 < 9) {
                    ++this.field1265;
                }
                int n5 = this.field1265;
                while (true) {
                    if (n5 <= 0) {
                        this.field1266[0] = n;
                        this.field1221[0] = n2;
                        this.field1264[0] = class275.field3045;
                        return;
                    }
                    this.field1266[n5] = this.field1266[n5 - 1];
                    this.field1221[n5] = this.field1221[n5 - 1];
                    this.field1264[n5] = this.field1264[n5 - 1];
                    --n5;
                }
            }
        }
        this.field1265 = 0;
        this.field1270 = 0;
        this.field1269 = 0;
        this.field1266[0] = n;
        this.field1221[0] = n2;
        this.field1213 = this.field1266[0] * 128 + this.field1268 * 936633408;
        this.field1196 = this.field1221[0] * 128 + this.field1268 * 936633408;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)[I", garbageValue="339049754")
    int[] method3020() {
        if (this.field1356 == null) {
            return this.field1354.method5338();
        }
        return this.field1356.method10527();
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(S)[S", garbageValue="1000")
    short[] method3021() {
        if (this.field1356 == null) {
            return this.field1354.method5308();
        }
        return this.field1356.method10528();
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(IISI)V", garbageValue="1597186844")
    void method3068(int n, int n2, short s) {
        if (this.field1356 == null) {
            this.field1356 = new class557(this.field1354);
        }
        this.field1356.method10531(n, n2, s);
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="([I[SI)V", garbageValue="-1689305792")
    void method3023(int[] nArray, short[] sArray) {
        if (this.field1356 == null) {
            this.field1356 = new class557(this.field1354);
        }
        this.field1356.method10530(nArray, sArray);
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1859745266")
    void method3024() {
        this.field1356 = null;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Ljs;I)V", garbageValue="-1463505074")
    void method3019(class246 class2462) {
        this.field1355 = class2462;
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(I)Ljs;", garbageValue="-770341048")
    class246 method3063() {
        return this.field1355;
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(Ljs;I)V", garbageValue="485692558")
    void method3027(class246 class2462) {
        this.field1353 = class2462;
    }

    @Override
    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="3")
    final boolean vmethod3039() {
        return this.field1354 != null;
    }

    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="486172024")
    void method3028() {
        this.field1355 = null;
    }

    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="990492198")
    void method3014() {
        this.field1353 = null;
    }

    @Override
    @ObfuscatedName(value="cm")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="140502690")
    int vmethod3030() {
        return this.field1354.field2662 == -1 ? this.field1255 : this.field1354.field2662;
    }
}

