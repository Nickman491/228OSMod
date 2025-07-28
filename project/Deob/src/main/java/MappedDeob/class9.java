/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ac")
public class class9
implements class404 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lac;")
    public static final class9 field43 = new class9(0, "POST", true, true);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lac;")
    public static final class9 field34 = new class9(1, "GET", true, false);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lac;")
    static final class9 field38 = new class9(2, "PUT", false, true);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lac;")
    static final class9 field37 = new class9(3, "PATCH", false, true);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lac;")
    static final class9 field35 = new class9(4, "DELETE", false, true);
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lna;")
    static Widget field45;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=697922389)
    int field36;
    @ObfuscatedName(value="ae")
    String field40;
    @ObfuscatedName(value="ax")
    boolean field41;
    @ObfuscatedName(value="at")
    boolean field42;

    class9(int n, String string, boolean bl, boolean bl2) {
        this.field36 = n;
        this.field40 = string;
        this.field41 = bl;
        this.field42 = bl2;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="-65")
    boolean method75() {
        return this.field41;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.field36;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)Ljava/lang/String;", garbageValue="-3")
    public String method67() {
        return this.field40;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1399283481")
    boolean method68() {
        return this.field42;
    }

    @ObfuscatedName(value="ay")
    public static final int method82(double d, double d2, double d3) {
        double d4 = d3;
        double d5 = d3;
        double d6 = d3;
        if (0.0 != d2) {
            double d7 = d3 < 0.5 ? (1.0 + d2) * d3 : d2 + d3 - d2 * d3;
            double d8 = d3 * 2.0 - d7;
            double d9 = 0.3333333333333333 + d;
            if (d9 > 1.0) {
                d9 -= 1.0;
            }
            double d10 = d;
            double d11 = d - 0.3333333333333333;
            if (d11 < 0.0) {
                d11 += 1.0;
            }
            d4 = 6.0 * d9 < 1.0 ? d9 * (6.0 * (d7 - d8)) + d8 : (d9 * 2.0 < 1.0 ? d7 : (d9 * 3.0 < 2.0 ? (0.6666666666666666 - d9) * (d7 - d8) * 6.0 + d8 : d8));
            d5 = 6.0 * d10 < 1.0 ? 6.0 * (d7 - d8) * d10 + d8 : (d10 * 2.0 < 1.0 ? d7 : (3.0 * d10 < 2.0 ? d8 + (d7 - d8) * (0.6666666666666666 - d10) * 6.0 : d8));
            d6 = 6.0 * d11 < 1.0 ? d8 + d11 * (6.0 * (d7 - d8)) : (2.0 * d11 < 1.0 ? d7 : (d11 * 3.0 < 2.0 ? 6.0 * ((d7 - d8) * (0.6666666666666666 - d11)) + d8 : d8));
        }
        int n = (int)(256.0 * d4);
        int n2 = (int)(256.0 * d5);
        int n3 = (int)(256.0 * d6);
        int n4 = n3 + (n2 << 8) + (n << 16);
        return n4;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="39")
    static void method84() {
        if (!Login.clearLoginScreen) {
            return;
        }
        Login.titleboxSprite = null;
        class454.field4897 = null;
        class538.field5379 = null;
        WorldMapSectionType.leftTitleSprite = null;
        TriBool.rightTitleSprite = null;
        Login.logoSprite = null;
        class169.title_muteSprite = null;
        Login.field920 = null;
        FriendLoginUpdate.field4992 = null;
        UserComparator5.worldSelectBackSprites = null;
        class73.worldSelectFlagSprites = null;
        Script.worldSelectArrows = null;
        class140.worldSelectStars = null;
        class93.field1118 = null;
        class461.loginScreenRunesAnimation.method2852();
        UserComparator3.method3347(0, 100);
        UserComparator8.method3320().method7823(true);
        Login.clearLoginScreen = false;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;BII)I", garbageValue="-1622496793")
    static int method65(Buffer buffer, byte by, int n) {
        int n2 = by >> n & 3;
        if (n2 != 3) {
            if (n2 != 2) {
                if (n2 != 1) {
                    return 0;
                }
                return buffer.readByte();
            }
            return buffer.readShort();
        }
        return buffer.readInt();
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="([FB)V", garbageValue="-97")
    static void method81(float[] fArray) {
        float f;
        fArray[1] = 1.0f - fArray[1];
        if (fArray[0] < 0.0f) {
            fArray[0] = 0.0f;
        }
        if (fArray[1] < 0.0f) {
            fArray[1] = 0.0f;
        }
        if ((fArray[0] > 1.0f || fArray[1] > 1.0f) && (f = 1.0f + (fArray[1] * (fArray[1] - 2.0f) + fArray[0] * (fArray[0] - 2.0f + fArray[1]))) + class132.field1535 > 0.0f) {
            if (!(class132.field1535 + fArray[0] < 1.3333334f)) {
                fArray[0] = 1.3333334f - class132.field1535;
                fArray[1] = 0.33333334f - class132.field1535;
            } else {
                float f2 = fArray[0] - 2.0f;
                float f3 = fArray[0] - 1.0f;
                float f4 = (float)Math.sqrt(f2 * f2 - f3 * (4.0f * f3));
                float f5 = 0.5f * (-f2 + f4);
                if (!(class132.field1535 + fArray[1] > f5)) {
                    f5 = 0.5f * (-f2 - f4);
                    if (fArray[1] < class132.field1535 + f5) {
                        fArray[1] = class132.field1535 + f5;
                    }
                } else {
                    fArray[1] = f5 - class132.field1535;
                }
            }
        }
        fArray[1] = 1.0f - fArray[1];
    }

    @ObfuscatedName(value="bv")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-1946123852")
    static int method85(int n) {
        return (int)((Math.log(n) / Interpreter.field854 - 7.0) * 256.0);
    }

    @ObfuscatedName(value="ih")
    @ObfuscatedSignature(descriptor="(Ldz;I)V", garbageValue="1976579478")
    static void method79(class103 class1032) {
        if (Client.combatTargetPlayerIndex >= 0 && class1032.field1329[Client.combatTargetPlayerIndex] != null) {
            class137.method3487(class1032, Client.combatTargetPlayerIndex, false);
        }
    }

    @ObfuscatedName(value="mu")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="96")
    static final void method83(int n) {
        if (!ClanChannel.field1807.method7024(n)) {
            return;
        }
        GameBuild.drawModelComponents(ClanChannel.field1807.field3772[n], -1);
    }
}

