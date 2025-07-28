package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="lu")
public abstract class class293 {
    @ObfuscatedName(value="jq")
    @ObfuscatedGetter(intValue=930710513)
    static int field3215;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=747892736)
    int field3204;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=938496000)
    int field3201;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=780184599)
    int field3203;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-950004071)
    int field3200;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-432409417)
    int field3211;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-171903861)
    int field3202;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-1411211197)
    int field3212 = -1;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-921447447)
    int field3207 = -1;
    @ObfuscatedName(value="aq")
    short[][][] field3206;
    @ObfuscatedName(value="af")
    short[][][] field3209;
    @ObfuscatedName(value="aa")
    byte[][][] field3210;
    @ObfuscatedName(value="ak")
    byte[][][] field3205;
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="[[[[Llx;")
    class295[][][][] field3208;
    @ObfuscatedName(value="av")
    boolean field3213;
    @ObfuscatedName(value="ag")
    boolean field3214;

    class293() {
        new LinkedList();
        this.field3213 = false;
        this.field3214 = false;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;B)V", garbageValue="-46")
    abstract void vmethod6369(class556 var1);

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1510656174")
    boolean method6363() {
        return this.field3213 && this.field3214;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(Lpq;I)V", garbageValue="1797083612")
    void method6364(class391 class3912) {
        if (this.method6363()) {
            return;
        }
        byte[] byArray = class3912.method7790(this.field3212, this.field3207);
        if (byArray != null) {
            this.vmethod6369(new class556(byArray));
            this.field3213 = true;
            this.field3214 = true;
        }
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-2138652093")
    void method6365() {
        this.field3206 = null;
        this.field3209 = null;
        this.field3210 = null;
        this.field3205 = null;
        this.field3208 = null;
        this.field3213 = false;
        this.field3214 = false;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(IILvy;B)V", garbageValue="4")
    void method6374(int n, int n2, class556 class5562) {
        int n3 = class5562.method10282();
        if (n3 != 0) {
            if ((n3 & 1) == 0) {
                this.method6368(n, n2, class5562, n3);
            } else {
                this.method6367(n, n2, class5562, n3);
            }
            return;
        }
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(IILvy;II)V", garbageValue="-91703415")
    void method6367(int n, int n2, class556 class5562, int n3) {
        boolean bl;
        boolean bl2 = bl = (n3 & 2) != 0;
        if (bl) {
            this.field3209[0][n][n2] = (short)class5562.method10307();
        }
        this.field3206[0][n][n2] = (short)class5562.method10307();
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(IILvy;IB)V", garbageValue="-67")
    void method6368(int n, int n2, class556 class5562, int n3) {
        int n4;
        int n5;
        int n6;
        int n7 = ((n3 & 0x18) >> 3) + 1;
        boolean bl = (n3 & 2) != 0;
        boolean bl2 = (n3 & 4) != 0;
        this.field3206[0][n][n2] = (short)class5562.method10307();
        if (bl) {
            n6 = class5562.method10282();
            for (n5 = 0; n5 < n6; ++n5) {
                int n8 = class5562.method10307();
                if (n8 == 0) continue;
                this.field3209[n5][n][n2] = (short)n8;
                n4 = class5562.method10282();
                this.field3210[n5][n][n2] = (byte)(n4 >> 2);
                this.field3205[n5][n][n2] = (byte)(n4 & 3);
            }
        }
        if (bl2) {
            for (n6 = 0; n6 < n7; ++n6) {
                n5 = class5562.method10282();
                if (n5 == 0) continue;
                class295[] class295Array = new class295[n5];
                this.field3208[n6][n][n2] = class295Array;
                class295[] class295Array2 = class295Array;
                for (n4 = 0; n4 < n5; ++n4) {
                    int n9 = class5562.method10476();
                    int n10 = class5562.method10282();
                    class295Array2[n4] = new class295(n9, n10 >> 2, n10 & 3);
                }
            }
        }
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="16")
    int method6370() {
        return this.field3203;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="35")
    int method6371() {
        return this.field3200;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Lqe;", garbageValue="1411520419")
    public static class428 method6389() {
        class428[] class428Array = class428.field4758;
        synchronized (class428.field4758) {
            if (class428.field4759 == 0) {
                // ** MonitorExit[var0] (shouldn't be in output)
                return new class428();
            }
            class428.field4758[--class428.field4759].method8372();
            // ** MonitorExit[var0] (shouldn't be in output)
            return class428.field4758[class428.field4759];
        }
    }
}

