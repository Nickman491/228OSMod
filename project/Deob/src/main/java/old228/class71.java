package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.security.SecureRandom;
import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cv")
public final class class71
extends class514 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpm;")
    static class410 field846 = new class410();
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1131317725)
    int field835;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=942339623)
    int field837;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1696715089)
    int field834;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1635286519)
    int field838;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=941532923)
    int field839;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-975525999)
    int field840;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-798105153)
    int field841;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=40578233)
    int field842;
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lbe;")
    class48 field843;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-1328904845)
    int field844;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-553453707)
    int field845;
    @ObfuscatedName(value="aq")
    int[] field849;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=408592797)
    int field847;
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lbe;")
    class48 field836;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkl;")
    ObjectDef field848;

    class71() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1849624967")
    void method2092() {
        int n = this.field842;
        ObjectDef class2622 = this.field848.method5517();
        if (class2622 == null) {
            this.field842 = -1;
            this.field840 = 0;
            this.field841 = 0;
            this.field844 = 0;
            this.field845 = 0;
            this.field849 = null;
        } else {
            this.field842 = class2622.field2819;
            this.field840 = class2622.field2834 * 16384;
            this.field841 = class2622.field2835 * 16384;
            this.field844 = class2622.field2814;
            this.field845 = class2622.field2811;
            this.field849 = class2622.field2812;
        }
        if (n != this.field842 && this.field843 != null) {
            class476.field5014.method745(this.field843);
            this.field843 = null;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Lkn;", garbageValue="1572526147")
    static class271[] method2105() {
        return new class271[]{class271.field3008, class271.field3017, class271.field3016, class271.field3005, class271.field3011, class271.field3010, class271.field3018};
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)Ljava/security/SecureRandom;", garbageValue="21906822")
    static SecureRandom method2103() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextInt();
        return secureRandom;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="52")
    public static void method2104() {
        Arrays.fill(class349.field3762, 0);
        Arrays.fill(class349.field3763, 0);
    }
}

