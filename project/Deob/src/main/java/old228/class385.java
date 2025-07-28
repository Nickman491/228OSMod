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

@ObfuscatedName(value="od")
public class class385
extends Enum
implements MouseWheel {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ class385 field4504 = new class385("runelite", 0, 0, -1, true, false, true);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ class385 field4518 = new class385("runelite", 1, 1, 0, true, true, true);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ class385 field4501 = new class385("runelite", 2, 2, 1, true, true, false);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ class385 field4502 = new class385("runelite", 3, 3, 2, false, false, true);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ class385 field4503 = new class385("runelite", 4, 4, 3, false, false, true);
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ class385 field4500 = new class385("runelite", 5, 5, 10, false, false, true);
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ class385 field4514 = new class385("runelite", 6, 6, 22, false, false, true);
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ class385 field4506 = new class385("runelite", 7, 7, 41, false, false, true);
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ class385 field4507 = new class385("runelite", 8, 8, 42, false, false, true);
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ class385 field4508 = new class385("runelite", 9, 9, 43, false, false, true);
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ class385 field4511 = new class385("runelite", 10, 10, 44, false, false, true);
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ class385 field4510 = new class385("runelite", 11, 11, 45, false, false, true);
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ class385 field4509 = new class385("runelite", 12, 12, 46, false, false, true);
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ class385 field4512 = new class385("runelite", 13, 13, 47, false, false, true);
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ class385 field4505 = new class385("runelite", 14, 14, 48, false, false, true);
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ class385 field4513 = new class385("runelite", 15, 15, 49, false, false, true);
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lod;")
    static final /* enum */ class385 field4515 = new class385("runelite", 16, 16, 52, false, false, true);
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=-143799401)
    final int field4516;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=-579646627)
    public final int field4517;
    @ObfuscatedName(value="aw")
    public final boolean field4499;
    @ObfuscatedName(value="ai")
    public final boolean field4519;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    class385(boolean bl, boolean bl2, boolean bl3) {
        void var7_5;
        void var6_4;
        void var2_-1;
        void var1_-1;
        this.field4516 = bl ? 1 : 0;
        this.field4517 = bl2 ? 1 : 0;
        this.field4499 = var6_4;
        this.field4519 = var7_5;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    public int vmethod10703() {
        return this.field4516;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IZI)Ljava/lang/String;", garbageValue="656906203")
    public static String method7659(int n, boolean bl) {
        if (bl && n >= 0) {
            String string;
            block6: {
                int n2 = n;
                if (bl && n2 >= 0) {
                    int n3 = 2;
                    int n4 = n2 / 10;
                    while (true) {
                        if (n4 == 0) {
                            char[] cArray = new char[n3];
                            cArray[0] = 43;
                            int n5 = n3 - 1;
                            while (true) {
                                if (n5 <= 0) {
                                    string = new String(cArray);
                                    break block6;
                                }
                                int n6 = n2;
                                int n7 = n6 - (n2 /= 10) * 10;
                                cArray[n5] = n7 >= 10 ? (char)(n7 + 87) : (char)(n7 + 48);
                                --n5;
                            }
                        }
                        n4 /= 10;
                        ++n3;
                    }
                }
                string = Integer.toString(n2, 10);
            }
            return string;
        }
        return Integer.toString(n);
    }

    @ObfuscatedName(value="bf")
    @ObfuscatedSignature(descriptor="(ILna;IIIII[FI)Lna;", garbageValue="821685708")
    static class361 method7660(int n, class361 class3612, int n2, int n3, int n4, int n5, int n6, float[] fArray) {
        class361 class3613 = new class361();
        class3613.field3873 = n;
        class3613.field4026 = class3612.field3910;
        class3613.field3863 = n2;
        class3613.field3991 = true;
        class3613.field3876 = n3;
        class3613.field3877 = n4;
        class3613.field3878 = n5;
        class3613.field3879 = n6;
        class3613.field3880 = (int)(fArray[0] * (float)class3612.field3886);
        class3613.field3926 = (int)((float)(class3612.field3887 * -1528330031) * fArray[1]);
        class3613.field3929 = (int)(fArray[2] * (float)class3612.field3886);
        class3613.field3933 = (int)((float)(class3612.field3887 * -1528330031) * fArray[3]);
        return class3613;
    }
}

