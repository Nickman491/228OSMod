package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="mu")
public class class335 {
    @ObfuscatedName(value="ac")
    static final byte[] field3674 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lvy;")
    class556 field3683 = new class556(null);
    @ObfuscatedName(value="ah")
    int field3671;
    @ObfuscatedName(value="az")
    int[] field3672;
    @ObfuscatedName(value="ao")
    int[] field3677;
    @ObfuscatedName(value="ad")
    int[] field3682;
    @ObfuscatedName(value="an")
    int[] field3675;
    @ObfuscatedName(value="ae")
    int field3676;
    @ObfuscatedName(value="at")
    long field3678;

    class335() {
    }

    @ObfuscatedName(value="ay")
    void method6874(byte[] byArray) {
        this.field3683.field5470 = byArray;
        this.field3683.field5471 = 10;
        int n = this.field3683.method10307();
        this.field3671 = this.field3683.method10307();
        this.field3676 = 500000;
        this.field3672 = new int[n];
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                this.field3678 = 0L;
                this.field3677 = new int[n];
                for (n2 = 0; n2 < n; ++n2) {
                    this.field3677[n2] = this.field3672[n2];
                }
                this.field3682 = new int[n];
                this.field3675 = new int[n];
                return;
            }
            int n3 = this.field3683.method10440();
            int n4 = this.field3683.method10440();
            if (n3 == 1297379947) {
                this.field3672[n2] = this.field3683.field5471;
                ++n2;
            }
            this.field3683.field5471 += n4;
        }
    }

    @ObfuscatedName(value="ah")
    void method6823() {
        this.field3683.field5470 = null;
        this.field3672 = null;
        this.field3677 = null;
        this.field3682 = null;
        this.field3675 = null;
    }

    @ObfuscatedName(value="az")
    boolean method6824() {
        return this.field3683.field5470 != null;
    }

    @ObfuscatedName(value="ao")
    int method6837() {
        return this.field3677.length;
    }

    @ObfuscatedName(value="ad")
    void method6826(int n) {
        this.field3683.field5471 = this.field3677[n];
    }

    @ObfuscatedName(value="an")
    void method6871(int n) {
        this.field3677[n] = this.field3683.field5471;
    }

    @ObfuscatedName(value="ae")
    void method6828() {
        this.field3683.field5471 = -1;
    }

    @ObfuscatedName(value="ax")
    void method6829(int n) {
        int n2 = this.field3683.method10309();
        int n3 = n;
        this.field3682[n3] = this.field3682[n3] + n2;
    }

    @ObfuscatedName(value="at")
    int method6830(int n) {
        int n2 = this.method6831(n);
        return n2;
    }

    @ObfuscatedName(value="ac")
    int method6831(int n) {
        int n2;
        int n3 = this.field3683.field5470[this.field3683.field5471];
        if (n3 >= 0) {
            n3 = this.field3675[n];
        } else {
            this.field3675[n] = n3 &= 0xFF;
            ++this.field3683.field5471;
        }
        if (n3 != 240 && n3 != 247) {
            return this.method6832(n, n3);
        }
        int n4 = this.field3683.method10309();
        if (n3 == 247 && n4 > 0 && ((n2 = this.field3683.field5470[this.field3683.field5471] & 0xFF) >= 241 && n2 <= 243 || n2 == 246 || n2 == 248 || n2 >= 250 && n2 <= 252 || n2 == 254)) {
            ++this.field3683.field5471;
            this.field3675[n] = n2;
            return this.method6832(n, n2);
        }
        this.field3683.field5471 += n4;
        return 0;
    }

    @ObfuscatedName(value="au")
    int method6832(int n, int n2) {
        if (n2 != 255) {
            byte by = field3674[n2 - 128];
            int n3 = n2;
            if (by >= 1) {
                n3 |= this.field3683.method10282() << 8;
            }
            if (by >= 2) {
                n3 |= this.field3683.method10282() << 16;
            }
            return n3;
        }
        int n4 = this.field3683.method10282();
        int n5 = this.field3683.method10309();
        if (n4 != 47) {
            if (n4 != 81) {
                this.field3683.field5471 += n5;
                return 3;
            }
            int n6 = this.field3683.method10285();
            int n7 = this.field3682[n];
            this.field3678 += (long)n7 * (long)(this.field3676 - n6);
            this.field3676 = n6;
            this.field3683.field5471 += (n5 -= 3);
            return 2;
        }
        this.field3683.field5471 += n5;
        return 1;
    }

    @ObfuscatedName(value="as")
    long method6850(int n) {
        return this.field3678 + (long)n * (long)this.field3676;
    }

    @ObfuscatedName(value="aq")
    int method6834() {
        int n = this.field3677.length;
        int n2 = -1;
        int n3 = Integer.MAX_VALUE;
        int n4 = 0;
        while (n4 < n) {
            if (this.field3677[n4] >= 0 && this.field3682[n4] < n3) {
                n2 = n4;
                n3 = this.field3682[n4];
            }
            ++n4;
        }
        return n2;
    }

    @ObfuscatedName(value="af")
    boolean method6835() {
        int n = this.field3677.length;
        for (int i = 0; i < n; ++i) {
            if (this.field3677[i] < 0) continue;
            return false;
        }
        return true;
    }

    @ObfuscatedName(value="aa")
    void method6868(long l) {
        this.field3678 = l;
        int n = this.field3677.length;
        int n2 = 0;
        while (n2 < n) {
            this.field3682[n2] = 0;
            this.field3675[n2] = 0;
            this.field3683.field5471 = this.field3672[n2];
            this.method6829(n2);
            this.field3677[n2] = this.field3683.field5471;
            ++n2;
        }
        return;
    }
}

