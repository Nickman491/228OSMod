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

@ObfuscatedName(value="lm")
public class class291
implements class304 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=374769887)
    int field3173;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=344112399)
    int field3174;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1856263099)
    int field3180;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=286775725)
    int field3183;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-828001247)
    int field3176;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1353964283)
    int field3177;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1766889347)
    int field3178;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1789200761)
    int field3179;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=1449937041)
    int field3186;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-1893291229)
    int field3181;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-1620698785)
    int field3182;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-212616909)
    int field3175;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=2138023255)
    int field3184;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-532819435)
    int field3172;

    class291() {
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lkg;B)V", garbageValue="43")
    public void vmethod6484(class284 class2842) {
        if (class2842.field3112 > this.field3176) {
            class2842.field3112 = this.field3176;
        }
        if (class2842.field3113 < this.field3176) {
            class2842.field3113 = this.field3176;
        }
        if (class2842.field3114 > this.field3177) {
            class2842.field3114 = this.field3177;
        }
        if (class2842.field3117 < this.field3177) {
            class2842.field3117 = this.field3177;
        }
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIB)Z", garbageValue="53")
    public boolean vmethod6470(int n, int n2, int n3) {
        if (n >= this.field3173 && n < this.field3174 + this.field3173) {
            return n2 >= (this.field3180 << 6) + (this.field3178 << 3) && n2 <= (this.field3180 << 6) + (this.field3186 << 3) + 7 && n3 >= (this.field3183 << 6) + (this.field3179 << 3) && n3 <= (this.field3183 << 6) + (this.field3181 << 3) + 7;
        }
        return false;
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="-177019651")
    public boolean vmethod6469(int n, int n2) {
        return n >= (this.field3176 << 6) + (this.field3182 << 3) && n <= (this.field3176 << 6) + (this.field3184 << 3) + 7 && n2 >= (this.field3177 << 6) + (this.field3175 << 3) && n2 <= (this.field3177 << 6) + (this.field3172 << 3) + 7;
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIIB)[I", garbageValue="1")
    public int[] vmethod6481(int n, int n2, int n3) {
        if (this.vmethod6470(n, n2, n3)) {
            int[] nArray = new int[]{this.field3176 * 64 - this.field3180 * 64 + n2 + (this.field3182 * 8 - this.field3178 * 8), n3 + (this.field3177 * 64 - this.field3183 * 64) + (this.field3175 * 8 - this.field3179 * 8)};
            return nArray;
        }
        return null;
    }

    @Override
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(III)Lnz;", garbageValue="-425070677")
    public class350 vmethod6473(int n, int n2) {
        if (this.vmethod6469(n, n2)) {
            int n3 = this.field3180 * 64 - this.field3176 * 64 + (this.field3178 * 8 - this.field3182 * 8) + n;
            int n4 = this.field3183 * 64 - this.field3177 * 64 + n2 + (this.field3179 * 8 - this.field3175 * 8);
            return new class350(this.field3173, n3, n4);
        }
        return null;
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1542767096")
    public void vmethod6474(class556 class5562) {
        this.field3173 = class5562.method10282();
        this.field3174 = class5562.method10282();
        this.field3180 = class5562.method10307();
        this.field3178 = class5562.method10282();
        this.field3186 = class5562.method10282();
        this.field3183 = class5562.method10307();
        this.field3179 = class5562.method10282();
        this.field3181 = class5562.method10282();
        this.field3176 = class5562.method10307();
        this.field3182 = class5562.method10282();
        this.field3184 = class5562.method10282();
        this.field3177 = class5562.method10307();
        this.field3175 = class5562.method10282();
        this.field3172 = class5562.method10282();
        this.method6343();
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-774872799")
    void method6343() {
    }

    @ObfuscatedName(value="ib")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="891741750")
    static boolean method6358() {
        return (client.field634 & 4) != 0;
    }
}

