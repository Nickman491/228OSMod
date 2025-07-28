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

@ObfuscatedName(value="ia")
public class class228 {
    @ObfuscatedName(value="ad")
    public short[] field2479;
    @ObfuscatedName(value="an")
    public short[] field2477;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-82315899)
    public int field2482 = -1;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-625907211)
    public int field2472 = -1;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1797823235)
    public int field2480 = -1;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-547761083)
    public int field2481 = -1;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=1223269621)
    public int field2474;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lhv;")
    public class198 field2483;

    public class228(int n) {
        ItemDef class2632 = class191.method4462(n);
        if (class2632.method5611()) {
            this.field2479 = new short[class2632.field2879.length];
            System.arraycopy(class2632.field2879, 0, this.field2479, 0, this.field2479.length);
        }
        if (class2632.method5579()) {
            this.field2477 = new short[class2632.field2882.length];
            System.arraycopy(class2632.field2882, 0, this.field2477, 0, this.field2477.length);
        }
        this.field2474 = class2632.field2851;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1997637316")
    public boolean method5081() {
        return this.field2479 != null;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="119")
    public boolean method5082() {
        return this.field2477 != null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="-10")
    boolean method5083(int n) {
        return n == 0 && this.field2482 != -1 || n == 1 && this.field2472 != -1;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1072478042")
    boolean method5084(int n) {
        return n == 0 && this.field2480 != -1 || n == 1 && this.field2481 != -1;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="100")
    int method5099(int n) {
        return n == 0 ? this.field2482 : this.field2472;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="-47")
    int method5080(int n) {
        return n == 0 ? this.field2480 : this.field2481;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-318781679")
    public static boolean method5106(int n) {
        return n == class370.field4088.field4087;
    }

    @ObfuscatedName(value="lr")
    @ObfuscatedSignature(descriptor="(IIIIIIB)V", garbageValue="12")
    static final void method5107(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8;
        int n9 = n3 - n;
        int n10 = n9 >= 0 ? n9 : -n9;
        int n11 = n10;
        if (n11 < (n8 = (n7 = n4 - n2) >= 0 ? n7 : -n7)) {
            n11 = n8;
        }
        if (n11 == 0) {
            return;
        }
        int n12 = (n7 << 16) / n11;
        int n13 = (n9 << 16) / n11;
        if (n12 <= n13) {
            n13 = -n13;
        } else {
            n12 = -n12;
        }
        int n14 = n6 * n12 >> 17;
        int n15 = n6 * n12 + 1 >> 17;
        int n16 = n6 * n13 >> 17;
        int n17 = n6 * n13 + 1 >> 17;
        int n18 = (n -= class566.field5548) + n14;
        int n19 = n - n15;
        int n20 = n + n9 - n15;
        int n21 = n + n14 + n9;
        int n22 = n16 + (n2 -= class566.field5541);
        int n23 = n2 - n17;
        int n24 = n7 + n2 - n17;
        int n25 = n7 + n16 + n2;
        class182.method4021(n18, n19, n20);
        class182.method4009(n22, n23, n24, n18, n19, n20, 0.0f, 0.0f, 0.0f, n5);
        class182.method4021(n18, n20, n21);
        class182.method4009(n22, n24, n25, n18, n20, n21, 0.0f, 0.0f, 0.0f, n5);
    }
}

