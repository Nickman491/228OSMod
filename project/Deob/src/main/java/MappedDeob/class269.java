/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kc")
public class class269
implements class29 {
    @ObfuscatedName(value="ah")
    char[] field2976 = new char[128];
    @ObfuscatedName(value="az")
    int[] field2977 = new int[128];
    @ObfuscatedName(value="ao")
    public int[] field2984 = new int[128];
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=1194474427)
    public int field2979 = 0;
    @ObfuscatedName(value="an")
    int[] field2980 = new int[128];
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-2034379675)
    int field2982 = 0;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-165631079)
    int field2990 = 0;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1411319837)
    int field2983 = 0;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=271975871)
    int field2978 = 0;
    @ObfuscatedName(value="au")
    boolean[] field2985 = new boolean[112];
    @ObfuscatedName(value="as")
    boolean[] field2986 = new boolean[112];
    @ObfuscatedName(value="aq")
    boolean[] field2987 = new boolean[112];
    @ObfuscatedName(value="af")
    public char field2975;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-821031549)
    public int field2989;

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-458319724")
    public boolean vmethod5756(int n) {
        this.method5789(n);
        this.field2985[n] = true;
        this.field2986[n] = true;
        this.field2987[n] = false;
        if (this.field2979 < 128) {
            this.field2984[++this.field2979 - 1] = n;
        }
        return true;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="0")
    public boolean vmethod5757(int n) {
        this.field2985[n] = false;
        this.field2986[n] = false;
        this.field2987[n] = true;
        if (this.field2982 < 128) {
            this.field2980[++this.field2982 - 1] = n;
        }
        return true;
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(CI)Z", garbageValue="804434279")
    public boolean vmethod5758(char c) {
        int n = this.field2983 + 1 & 0x7F;
        if (n != this.field2990) {
            this.field2977[this.field2983] = -1;
            this.field2976[this.field2983] = c;
            this.field2983 = n;
        }
        return false;
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(ZI)Z", garbageValue="1360179052")
    public boolean vmethod5764(boolean bl) {
        return false;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1037307663")
    void method5789(int n) {
        int n2 = this.field2983 + 1 & 0x7F;
        if (n2 != this.field2990) {
            this.field2977[this.field2983] = n;
            this.field2976[this.field2983] = '\u0000';
            this.field2983 = n2;
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="310936192")
    public void method5763() {
        this.field2990 = this.field2978;
        this.field2978 = this.field2983;
        this.field2979 = 0;
        this.field2982 = 0;
        Arrays.fill(this.field2986, false);
        Arrays.fill(this.field2987, false);
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1914191137")
    public final boolean method5772() {
        if (this.field2978 == this.field2990) {
            return false;
        }
        this.field2989 = this.field2977[this.field2990];
        this.field2975 = this.field2976[this.field2990];
        this.field2990 = this.field2990 + 1 & 0x7F;
        return true;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="0")
    public boolean method5755(int n) {
        if (n >= 0 && n < 112) {
            return this.field2986[n];
        }
        return false;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="8")
    public boolean method5776(int n) {
        if (n >= 0 && n < 112) {
            return this.field2985[n];
        }
        return false;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="4")
    public boolean method5774(int n) {
        if (n >= 0 && n < 112) {
            return this.field2987[n];
        }
        return false;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)[I", garbageValue="-61519205")
    public int[] method5766() {
        int[] nArray = new int[this.field2979];
        int n = 0;
        while (n < this.field2979) {
            nArray[n] = this.field2984[n];
            ++n;
        }
        return nArray;
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(B)[I", garbageValue="-46")
    public int[] method5767() {
        int[] nArray = new int[this.field2982];
        int n = 0;
        while (n < this.field2982) {
            nArray[n] = this.field2980[n];
            ++n;
        }
        return nArray;
    }
}

