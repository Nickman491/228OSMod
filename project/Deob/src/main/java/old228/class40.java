package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bc")
public class class40
extends class62 {
    @ObfuscatedName(value="ay")
    public int field242;
    @ObfuscatedName(value="ah")
    public byte[] field241;
    @ObfuscatedName(value="az")
    public int field243;
    @ObfuscatedName(value="ao")
    int field240;
    @ObfuscatedName(value="ad")
    public boolean field244;

    class40(int n, byte[] byArray, int n2, int n3) {
        this.field242 = n;
        this.field241 = byArray;
        this.field243 = n2;
        this.field240 = n3;
    }

    class40(int n, byte[] byArray, int n2, int n3, boolean bl) {
        this.field242 = n;
        this.field241 = byArray;
        this.field243 = n2;
        this.field240 = n3;
        this.field244 = bl;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lcg;)Lbc;")
    public class40 method782(class57 class572) {
        this.field241 = class572.method1175(this.field241);
        this.field242 = class572.method1168(this.field242);
        if (this.field243 == this.field240) {
            this.field243 = this.field240 = class572.method1169(this.field243);
        } else {
            this.field243 = class572.method1169(this.field243);
            this.field240 = class572.method1169(this.field240);
            if (this.field243 == this.field240) {
                --this.field243;
            }
        }
        return this;
    }
}

