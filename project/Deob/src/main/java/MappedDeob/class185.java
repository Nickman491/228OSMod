/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="hx")
public abstract class class185
extends Rasterizer2D {
    @ObfuscatedName(value="au")
    static int field1990 = 0;
    @ObfuscatedName(value="ay")
    boolean field1983 = false;
    @ObfuscatedName(value="ah")
    boolean field1981 = false;
    @ObfuscatedName(value="at")
    int[] field1989 = SceneTileModel.Rasterizer3D_colorPalette;
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lhm;")
    class203 field1982;

    @ObfuscatedSignature(descriptor="(Lhm;)V")
    class185(class203 class2032) {
        this.field1982 = class2032;
    }

    @ObfuscatedName(value="ay")
    void method4133(int[] nArray, int n, int n2, float[] fArray) {
        Rasterizer2D.method10603(nArray, n, n2, fArray);
    }

    @ObfuscatedName(value="ao")
    void method4134(int n, int n2, int n3, int n4, int n5, int n6, float f, float f2, float f3, int n7, int n8, int n9, byte by, byte by2, byte by3, byte by4) {
        n7 = class185.method4132(n7, by, by2, by3, by4);
        n8 = class185.method4132(n8, by, by2, by3, by4);
        n9 = class185.method4132(n9, by, by2, by3, by4);
        this.vmethod4753(n, n2, n3, n4, n5, n6, f, f2, f3, n7, n8, n9);
    }

    @ObfuscatedName(value="ad")
    void method4152(int n, int n2, int n3, int n4, int n5, int n6, float f, float f2, float f3, int n7, byte by, byte by2, byte by3, byte by4) {
        int n8 = class185.method4132(n7, by, by2, by3, by4);
        n7 = this.field1989[n8];
        this.vmethod4755(n, n2, n3, n4, n5, n6, f, f2, f3, n7);
    }

    @ObfuscatedName(value="an")
    abstract void vmethod4753(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

    @ObfuscatedName(value="ae")
    abstract void vmethod4755(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

    @ObfuscatedName(value="ax")
    abstract void vmethod4801(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

    @ObfuscatedName(value="at")
    abstract void vmethod4764(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

    @ObfuscatedName(value="ah")
    static int method4132(int n, byte by, byte by2, byte by3, byte by4) {
        int n2 = n >> 10 & 0x3F;
        int n3 = n >> 7 & 7;
        int n4 = n & 0x7F;
        int n5 = by4 & 0xFF;
        if (by != -1) {
            n2 = (n5 * (by - n2) >> 7) + n2;
        }
        if (by2 != -1) {
            n3 = (n5 * (by2 - n3) >> 7) + n3;
        }
        if (by3 != -1) {
            n4 += n5 * (by3 - n4) >> 7;
        }
        return (n2 << 10 | n3 << 7 | n4) & 0xFFFF;
    }

    @ObfuscatedName(value="az")
    static final int method4131(int n, int n2) {
        if ((n2 = (n & 0x7F) * n2 >> 7) < 2) {
            n2 = 2;
        } else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }

    @ObfuscatedName(value="ac")
    static final int method4138() {
        return field1990;
    }

    @ObfuscatedName(value="au")
    static void method4139(int n) {
        field1990 = n;
    }

    @ObfuscatedName(value="as")
    static void method4156(int n) {
        int n2 = n * 210;
        class185.method4139(n2);
    }
}

