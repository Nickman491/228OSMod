package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.applet.Applet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cm")
public final class class74
extends class190 {
    @ObfuscatedName(value="iq")
    @ObfuscatedSignature(descriptor="Lqw;")
    public static class435 field892;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1789390543)
    int field887;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1926961565)
    int field883;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-2147325297)
    int field884;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1275497143)
    int field891;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-89883695)
    int field882;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1175477221)
    int field886;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lkb;")
    SequenceDef field888;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=337630113)
    int field889 = 0;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-362503139)
    int field890 = 0;
    @ObfuscatedName(value="ac")
    boolean field885 = false;

    class74(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.field887 = n;
        this.field884 = n2;
        this.field891 = n3;
        this.field882 = n4;
        this.field886 = n5;
        this.field883 = n7 + n6;
        int n8 = ObjectDef.method5541((int)this.field887).field2703;
        if (n8 == -1) {
            this.field885 = true;
        } else {
            this.field885 = false;
            this.field888 = class33.method520(n8);
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-437976859")
    final void method2351(int n) {
        if (this.field885) {
            return;
        }
        this.field890 += n;
        if (this.field888.method5672()) {
            this.field889 += n;
            if (this.field889 < this.field888.method5703()) {
                class271.method5839(this.field888, this.field889, this.field891, this.field882, false);
            } else {
                this.field885 = true;
            }
        } else {
            while (this.field890 > this.field888.field2923[this.field889]) {
                this.field890 -= this.field888.field2923[this.field889];
                ++this.field889;
                if (this.field889 < this.field888.field2916.length) {
                    class271.method5839(this.field888, this.field889, this.field891, this.field882, false);
                    continue;
                }
                this.field885 = true;
                break;
            }
        }
    }

    @Override
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(B)Lhv;", garbageValue="-7")
    protected final class198 vmethod4447() {
        class252 class2522 = ObjectDef.method5541(this.field887);
        class198 class1982 = !this.field885 ? class2522.method5381(this.field889) : class2522.method5381(-1);
        if (class1982 == null) {
            return null;
        }
        return class1982;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/applet/Applet;Ljava/lang/String;B)V", garbageValue="13")
    public static void method2356(Applet applet, String string) {
        class31.field138 = applet;
        if (string != null) {
            class31.field137 = string;
        }
    }

    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;I)V", garbageValue="2082786972")
    static void method2357(int n, String string) {
        class78.field934 = string;
        class78.field935 = n;
    }

    @ObfuscatedName(value="hh")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-846140912")
    static final void method2358(int n, int n2) {
        int n3;
        int n4;
        if (n >= 128) {
            if (n > 383) {
                n = 383;
            }
        } else {
            n = 128;
        }
        if (class159.field1730 >= n) {
            if (class159.field1730 > n && (class159.field1730 -= (class159.field1730 - n) * class505.field5142 / 1000 + class383.field4491) < n) {
                class159.field1730 = n;
            }
        } else if ((class159.field1730 = (n - class159.field1730) * class505.field5142 / 1000 + class159.field1730 + class383.field4491) > n) {
            class159.field1730 = n;
        }
        if ((n4 = (n2 &= 0x7FF) - class183.field1972) <= 1024) {
            if (n4 < -1024) {
                n4 += 2048;
            }
        } else {
            n4 -= 2048;
        }
        if (n4 <= 0) {
            if (n4 < 0) {
                class183.field1972 -= -n4 * class505.field5142 / 1000 + class383.field4491;
                class183.field1972 &= 0x7FF;
            }
        } else {
            class183.field1972 = n4 * class505.field5142 / 1000 + class183.field1972 + class383.field4491;
            class183.field1972 &= 0x7FF;
        }
        if ((n3 = n2 - class183.field1972) <= 1024) {
            if (n3 < -1024) {
                n3 += 2048;
            }
        } else {
            n3 -= 2048;
        }
        if (n3 < 0 && n4 > 0 || n3 > 0 && n4 < 0) {
            class183.field1972 = n2;
        }
    }
}

