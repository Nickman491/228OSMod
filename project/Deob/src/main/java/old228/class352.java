package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="nq")
public class class352 {
    @ObfuscatedName(value="ae")
    static boolean[] field3778;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    class391 field3775;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpq;")
    class391 field3768;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lpq;")
    class391 field3769;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lpq;")
    class391 field3770;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lpq;")
    class391 field3767;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="[[Lna;")
    public class361[][] field3772;
    @ObfuscatedName(value="ax")
    Map field3773 = new HashMap();
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lmi;")
    class315 field3774 = new class315(200);
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lmi;")
    class315 field3776 = new class315(50);
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Lmi;")
    class315 field3771 = new class315(20);
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lmi;")
    class315 field3777 = new class315(8);
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lro;")
    class465 field3779 = new class465(10, class463.field4954);
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Lro;")
    class465 field3780 = new class465(10, class463.field4954);

    @ObfuscatedSignature(descriptor="(Lpq;Lpq;Lpq;Lpq;Lpq;)V")
    public class352(class391 class3912, class391 class3913, class391 class3914, class391 class3915, class391 class3916) {
        int n = 0;
        if (class3912 != null) {
            this.field3775 = class3912;
            this.field3769 = class3913;
            this.field3770 = class3914;
            this.field3767 = class3915;
            this.field3768 = class3916;
            n = this.field3775.method7812();
        }
        this.field3772 = new class361[n][];
        field3778 = new boolean[n];
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Lna;", garbageValue="1962524701")
    public class361 method7031(int n) {
        boolean bl;
        int n2 = n >> 16;
        int n3 = n & 0xFFFF;
        if (!(this.field3772[n2] != null && this.field3772[n2][n3] != null || (bl = this.method7024(n2)))) {
            return null;
        }
        return this.field3772[n2][n3];
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)Lna;", garbageValue="-1107392999")
    public class361 method7023(int n, int n2) {
        class361 class3612 = this.method7031(n);
        if (n2 == -1) {
            return class3612;
        }
        if (class3612 != null && class3612.field4014 != null && n2 < class3612.field4014.length) {
            return class3612.field4014[n2];
        }
        return null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-87937638")
    public boolean method7024(int n) {
        if (field3778[n]) {
            return true;
        }
        if (!this.field3775.method7732(n)) {
            return false;
        }
        int n2 = this.field3775.method7740(n);
        if (n2 != 0) {
            if (this.field3772[n] == null) {
                this.field3772[n] = new class361[n2];
            }
            int n3 = 0;
            while (true) {
                byte[] byArray;
                if (n3 >= n2) {
                    class352.field3778[n] = true;
                    return true;
                }
                if (this.field3772[n][n3] == null && (byArray = this.field3775.method7790(n, n3)) != null) {
                    byte[] byArray2;
                    this.field3772[n][n3] = new class361();
                    this.field3772[n][n3].field3910 = n3 + (n << 16);
                    if (byArray[0] == -1) {
                        this.field3772[n][n3].method7410(new class556(byArray));
                    } else {
                        this.field3772[n][n3].method7492(new class556(byArray));
                    }
                    if (this.field3768 != null && (byArray2 = this.field3768.method7790(n, n3)) != null && byArray2.length > 0) {
                        this.field3772[n][n3].method7552(new class556(byArray2));
                        this.field3773.put(this.field3772[n][n3].field3872, n);
                    }
                }
                ++n3;
            }
        }
        class352.field3778[n] = true;
        return true;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-59723310")
    public void method7021(int n) {
        if (n == -1) {
            return;
        }
        if (!field3778[n]) {
            return;
        }
        this.field3775.method7728(n);
        if (this.field3772[n] == null) {
            return;
        }
        int n2 = 0;
        while (true) {
            if (n2 >= this.field3772[n].length) {
                this.field3772[n] = null;
                class352.field3778[n] = false;
                return;
            }
            if (this.field3772[n][n2] != null) {
                this.field3772[n][n2] = null;
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-21")
    public void method7026() {
        this.field3774.method6581();
        this.field3776.method6581();
        this.field3771.method6581();
        this.field3777.method6581();
    }
}

