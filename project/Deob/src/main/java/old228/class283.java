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

@ObfuscatedName(value="kp")
public class class283
implements class304 {
    @ObfuscatedName(value="fs")
    @ObfuscatedSignature(descriptor="Lok;")
    static class388 field3102;
    @ObfuscatedName(value="kc")
    @ObfuscatedSignature(descriptor="[Lvi;")
    static class569[] field3094;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1440027847)
    int field3098;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-437334943)
    int field3091;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=878567445)
    int field3097;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1988309377)
    int field3093;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1369617375)
    int field3104;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=97173577)
    int field3090;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-2004531413)
    int field3096;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1888039883)
    int field3095;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1409237689)
    int field3092;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=174576573)
    int field3099;

    class283() {
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lkg;B)V", garbageValue="43")
    public void vmethod6484(class284 class2842) {
        if (class2842.field3112 > this.field3096) {
            class2842.field3112 = this.field3096;
        }
        if (class2842.field3113 < this.field3092) {
            class2842.field3113 = this.field3092;
        }
        if (class2842.field3114 > this.field3095) {
            class2842.field3114 = this.field3095;
        }
        if (class2842.field3117 < this.field3099) {
            class2842.field3117 = this.field3099;
        }
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIB)Z", garbageValue="53")
    public boolean vmethod6470(int n, int n2, int n3) {
        if (n >= this.field3098 && n < this.field3098 + this.field3091) {
            return n2 >> 6 >= this.field3097 && n2 >> 6 <= this.field3104 && n3 >> 6 >= this.field3093 && n3 >> 6 <= this.field3090;
        }
        return false;
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="-177019651")
    public boolean vmethod6469(int n, int n2) {
        return n >> 6 >= this.field3096 && n >> 6 <= this.field3092 && n2 >> 6 >= this.field3095 && n2 >> 6 <= this.field3099;
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIIB)[I", garbageValue="1")
    public int[] vmethod6481(int n, int n2, int n3) {
        if (this.vmethod6470(n, n2, n3)) {
            int[] nArray = new int[]{this.field3096 * 64 - this.field3097 * 64 + n2, n3 + (this.field3095 * 64 - this.field3093 * 64)};
            return nArray;
        }
        return null;
    }

    @Override
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(III)Lnz;", garbageValue="-425070677")
    public class350 vmethod6473(int n, int n2) {
        if (this.vmethod6469(n, n2)) {
            int n3 = this.field3097 * 64 - this.field3096 * 64 + n;
            int n4 = this.field3093 * 64 - this.field3095 * 64 + n2;
            return new class350(this.field3098, n3, n4);
        }
        return null;
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1542767096")
    public void vmethod6474(class556 class5562) {
        this.field3098 = class5562.method10282();
        this.field3091 = class5562.method10282();
        this.field3097 = class5562.method10307();
        this.field3093 = class5562.method10307();
        this.field3104 = class5562.method10307();
        this.field3090 = class5562.method10307();
        this.field3096 = class5562.method10307();
        this.field3095 = class5562.method10307();
        this.field3092 = class5562.method10307();
        this.field3099 = class5562.method10307();
        this.method6017();
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1998585367")
    void method6017() {
    }

    @ObfuscatedName(value="iu")
    @ObfuscatedSignature(descriptor="(Lda;I)V", garbageValue="-2014514008")
    static final void method6018(class99 class992) {
        int n = Math.max(1, class992.field1263 - client.field514);
        int n2 = class992.field1247 * 128 + class992.field1268 * 936633408;
        int n3 = class992.field1249 * 128 + class992.field1268 * 936633408;
        class992.field1213 += (n2 - class992.field1213) / n;
        class992.field1196 += (n3 - class992.field1196) / n;
        class992.field1269 = 0;
        class992.field1262 = class992.field1253;
    }
}

