package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ma")
public class class334
extends class49 {
    @ObfuscatedName(value="by")
    static AtomicBoolean field3666 = null;
    @ObfuscatedName(value="bm")
    static ThreadPoolExecutor field3667 = null;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lub;")
    class530 field3653;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-410635123)
    int field3638 = 256;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1763645632)
    int field3639 = -727379968;
    @ObfuscatedName(value="ao")
    int[] field3648 = new int[16];
    @ObfuscatedName(value="ad")
    int[] field3641 = new int[16];
    @ObfuscatedName(value="an")
    int[] field3642 = new int[16];
    @ObfuscatedName(value="ae")
    int[] field3643 = new int[16];
    @ObfuscatedName(value="ax")
    int[] field3649 = new int[16];
    @ObfuscatedName(value="at")
    int[] field3640 = new int[16];
    @ObfuscatedName(value="ac")
    int[] field3644 = new int[16];
    @ObfuscatedName(value="au")
    int[] field3647 = new int[16];
    @ObfuscatedName(value="as")
    int[] field3637 = new int[16];
    @ObfuscatedName(value="aw")
    int[] field3651 = new int[16];
    @ObfuscatedName(value="ai")
    int[] field3650 = new int[16];
    @ObfuscatedName(value="ar")
    int[] field3669 = new int[16];
    @ObfuscatedName(value="am")
    int[] field3652 = new int[16];
    @ObfuscatedName(value="ap")
    int[] field3665 = new int[16];
    @ObfuscatedName(value="ab")
    int[] field3654 = new int[16];
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="[[Lne;")
    class343[][] field3655 = new class343[16][128];
    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="[[Lne;")
    class343[][] field3656 = new class343[16][128];
    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="Lmu;")
    class335 field3657 = new class335();
    @ObfuscatedName(value="bw")
    boolean field3659;
    @ObfuscatedName(value="bb")
    @ObfuscatedGetter(intValue=1656712043)
    int field3658;
    @ObfuscatedName(value="bx")
    @ObfuscatedGetter(intValue=754007923)
    int field3660;
    @ObfuscatedName(value="bd")
    @ObfuscatedGetter(longValue=3254050521887839121L)
    long field3661;
    @ObfuscatedName(value="bi")
    @ObfuscatedGetter(longValue=-3823371857040521559L)
    long field3662;
    @ObfuscatedName(value="bz")
    @ObfuscatedSignature(descriptor="Lnv;")
    class341 field3663 = new class341(this);
    @ObfuscatedName(value="bt")
    @ObfuscatedSignature(descriptor="Lbq;")
    class42 field3664 = null;
    @ObfuscatedName(value="bf")
    PriorityQueue field3646 = new PriorityQueue(5, new class344());
    @ObfuscatedName(value="bp")
    @ObfuscatedGetter(intValue=1132771239)
    public int field3668 = 0;

    @ObfuscatedSignature(descriptor="(Lbq;)V")
    public class334(class42 class425) {
        this.field3664 = class425;
        this.field3653 = new class530(128);
        this.method6731();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1287356357")
    public void method6709(int n) {
        class42 class425 = this.field3664;
        synchronized (class425) {
            this.field3638 = n;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1455965430")
    public int method6710() {
        return this.field3638;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lnx;Lpq;Lbs;I)Z", garbageValue="580591264")
    public boolean method6711(class342 var1_1, class391 var2_2, class45 var3_3) {
        var4_4 = this.field3664;
        synchronized (var4_4) {
            var5_5 = true;
            var6_6 = this.field3646;
            synchronized (var6_6) {
                this.field3646.clear();
            }
            var6_6 = (class346)var1_1.field3712.method9988();
            while (var6_6 != null) {
                var14_12 = (int)var6_6.field5174;
                var8_8 = (class338)this.field3653.method9985(var14_12);
                if (var8_8 != null) ** GOTO lbl22
                var8_8 = class149.method3586(var2_2, var14_12);
                if (var8_8 == null) {
                    var5_5 = false;
                } else {
                    this.field3653.method9984(var8_8, var14_12);
lbl22:
                    // 2 sources

                    if (!var8_8.method6887(var3_3, var6_6.field3748)) {
                        var5_5 = false;
                    } else if (this.field3646 != null) {
                        var9_9 = this.field3646;
                        synchronized (var9_9) {
                            for (class53 var11_11 : var8_8.field3694) {
                                this.field3646.add(new class337(var6_6.field3751, var11_11));
                            }
                        }
                    }
                }
                var6_6 = (class346)var1_1.field3712.method9996();
            }
            return var5_5;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1753530905")
    public void method6712() {
        if (this.field3646 != null) {
            if (field3666 != null) {
                field3666.set(true);
            }
            AtomicBoolean atomicBoolean = field3666 = new AtomicBoolean(false);
            if (field3667 == null) {
                int n = Runtime.getRuntime().availableProcessors();
                field3667 = new ThreadPoolExecutor(0, n, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(), new class336(this));
            }
            field3667.submit(new class340(this, atomicBoolean));
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1485904141")
    public void method6713() {
        class42 class425 = this.field3664;
        synchronized (class425) {
            class338 class3382 = (class338)this.field3653.method9988();
            while (class3382 != null) {
                class3382.method6888();
                class3382 = (class338)this.field3653.method9996();
            }
        }
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="()Lbn;")
    protected class49 vmethod6899() {
        return this.field3663;
    }

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="()Lbn;")
    protected class49 vmethod6900() {
        return null;
    }

    @Override
    @ObfuscatedName(value="ax")
    protected int vmethod6927() {
        return 0;
    }

    @Override
    @ObfuscatedName(value="at")
    protected void vmethod6908(int[] nArray, int n, int n2) {
        block2: {
            if (this.field3657.method6824()) {
                long l;
                int n3 = this.field3657.field3671 * this.field3639 * 1000000 / class42.field257;
                while (this.field3662 - (l = (long)n3 * (long)n2 + this.field3661) < 0L) {
                    int n4 = (int)((this.field3662 - this.field3661 + (long)n3 - 1L) / (long)n3);
                    this.field3661 += (long)n4 * (long)n3;
                    this.field3663.vmethod6908(nArray, n, n4);
                    n = n4 + n;
                    n2 -= n4;
                    this.method6744();
                    if (this.field3657.method6824()) continue;
                    break block2;
                }
                this.field3661 = l;
            }
        }
        this.field3663.vmethod6908(nArray, n, n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-272372987")
    public void method6714() {
        class42 class425 = this.field3664;
        synchronized (class425) {
            class338 class3382 = (class338)this.field3653.method9988();
            while (class3382 != null) {
                class3382.method9623();
                class3382 = (class338)this.field3653.method9996();
            }
        }
    }

    @Override
    @ObfuscatedName(value="au")
    protected void vmethod6902(int n) {
        block2: {
            if (this.field3657.method6824()) {
                long l;
                int n2 = this.field3657.field3671 * this.field3639 * 1000000 / class42.field257;
                while (this.field3662 - (l = (long)n2 * (long)n + this.field3661) < 0L) {
                    int n3 = (int)(((long)n2 + (this.field3662 - this.field3661) - 1L) / (long)n2);
                    this.field3661 += (long)n3 * (long)n2;
                    this.field3663.vmethod6902(n3);
                    n -= n3;
                    this.method6744();
                    if (this.field3657.method6824()) continue;
                    break block2;
                }
                this.field3661 = l;
            }
        }
        this.field3663.vmethod6902(n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lnx;ZI)V", garbageValue="-1658894017")
    public void method6715(class342 class3422, boolean bl) {
        class42 class425 = this.field3664;
        synchronized (class425) {
            this.method6721();
            this.field3657.method6874(class3422.field3711);
            this.field3659 = bl;
            this.field3661 = 0L;
            int n = this.field3657.method6837();
            for (int i = 0; i < n; ++i) {
                this.field3657.method6826(i);
                this.field3657.method6829(i);
                this.field3657.method6871(i);
            }
            this.field3658 = this.field3657.method6834();
            this.field3660 = this.field3657.field3682[this.field3658];
            this.field3662 = this.field3657.method6850(this.field3660);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="0")
    public void method6721() {
        class42 class425 = this.field3664;
        synchronized (class425) {
            this.field3657.method6823();
            this.method6731();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-697656511")
    public boolean method6717() {
        class42 class425 = this.field3664;
        synchronized (class425) {
            return this.field3657.method6824();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-15404535")
    public boolean method6749() {
        class42 class425 = this.field3664;
        synchronized (class425) {
            return this.field3653.method9995() > 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-1971479199")
    public void method6719(int n, int n2) {
        class42 class425 = this.field3664;
        synchronized (class425) {
            this.method6720(n, n2);
        }
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-221864183")
    void method6720(int n, int n2) {
        this.field3643[n] = n2;
        this.field3640[n] = n2 & 0xFFFFFF80;
        this.method6782(n, n2);
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="1866947017")
    void method6782(int n, int n2) {
        if (n2 != this.field3649[n]) {
            this.field3649[n] = n2;
            for (int i = 0; i < 128; ++i) {
                this.field3656[n][i] = null;
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(IIII)V", garbageValue="64524799")
    void method6780(int n, int n2, int n3) {
        class338 class3382;
        this.method6724(n, n2, 64);
        if ((this.field3651[n] & 2) != 0) {
            void var4_5;
            class343 class3432 = (class343)this.field3663.field3709.method8004();
            while (var4_5 != null) {
                if (var4_5.field3731 == n && var4_5.field3727 < 0) {
                    this.field3655[n][var4_5.field3718] = null;
                    this.field3655[n][n2] = var4_5;
                    int n4 = (var4_5.field3722 * var4_5.field3723 >> 12) + var4_5.field3721;
                    var4_5.field3721 += n2 - var4_5.field3718 << 8;
                    var4_5.field3722 = n4 - var4_5.field3721;
                    var4_5.field3723 = 4096;
                    var4_5.field3718 = n2;
                    return;
                }
                class343 class3433 = (class343)this.field3663.field3709.method8006();
            }
        }
        if ((class3382 = (class338)this.field3653.method9985(this.field3649[n])) == null) {
            return;
        }
        if (class3382.field3700[n2] == null) {
            return;
        }
        class40 class408 = class3382.field3700[n2].method1119();
        if (class408 == null) {
            return;
        }
        class343 class3434 = new class343();
        class3434.field3731 = n;
        class3434.field3725 = class3382;
        class3434.field3732 = class408;
        class3434.field3716 = class3382.field3697[n2];
        class3434.field3717 = class3382.field3692[n2];
        class3434.field3718 = n2;
        class3434.field3720 = n3 * n3 * class3382.field3695[n2] * class3382.field3698 + 1024 >> 11;
        class3434.field3719 = class3382.field3696[n2] & 0xFF;
        class3434.field3721 = (n2 << 8) - (class3382.field3691[n2] & Short.MAX_VALUE);
        class3434.field3724 = 0;
        class3434.field3715 = 0;
        class3434.field3726 = 0;
        class3434.field3727 = -1;
        class3434.field3714 = 0;
        if (this.field3652[n] == 0) {
            class3434.field3713 = class48.method911(class408, this.method6736(class3434), this.method6737(class3434), this.method6738(class3434));
        } else {
            class3434.field3713 = class48.method911(class408, this.method6736(class3434), 0, this.method6738(class3434));
            this.method6723(class3434, class3382.field3691[n2] < 0);
        }
        if (class3382.field3691[n2] < 0) {
            class3434.field3713.method913(-1);
        }
        if (class3434.field3717 >= 0) {
            class343 class3435 = this.field3656[n][class3434.field3717];
            if (class3435 != null && class3435.field3727 < 0) {
                this.field3655[n][class3435.field3718] = null;
                class3435.field3727 = 0;
            }
            this.field3656[n][class3434.field3717] = class3434;
        }
        this.field3663.field3709.method7998(class3434);
        this.field3655[n][n2] = class3434;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(Lne;ZB)V", garbageValue="-63")
    void method6723(class343 class3432, boolean bl) {
        int n;
        int n2 = class3432.field3732.field241.length;
        if (bl && class3432.field3732.field244) {
            int n3 = n2 + n2 - class3432.field3732.field243;
            n = (int)((long)n3 * (long)this.field3652[class3432.field3731] >> 6);
            if (n >= (n2 <<= 8)) {
                n = n2 + n2 - 1 - n;
                class3432.field3713.method974();
            }
        } else {
            n = (int)((long)n2 * (long)this.field3652[class3432.field3731] >> 6);
        }
        class3432.field3713.method1050(n);
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(IIIB)V", garbageValue="125")
    void method6724(int n, int n2, int n3) {
        class343 class3432 = this.field3655[n][n2];
        if (class3432 == null) {
            return;
        }
        this.field3655[n][n2] = null;
        if ((this.field3651[n] & 2) == 0) {
            class3432.field3727 = 0;
        } else {
            class343 class3433 = (class343)this.field3663.field3709.method7996();
            while (class3433 != null) {
                if (class3433.field3731 == class3432.field3731 && class3433.field3727 < 0 && class3432 != class3433) {
                    class3432.field3727 = 0;
                    break;
                }
                class3433 = (class343)this.field3663.field3709.method8005();
            }
        }
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(IIII)V", garbageValue="65280")
    void method6725(int n, int n2, int n3) {
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-1744070669")
    void method6726(int n, int n2) {
    }

    @ObfuscatedName(value="bz")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="824603693")
    void method6727(int n, int n2) {
        this.field3644[n] = n2;
    }

    @ObfuscatedName(value="bt")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="125")
    void method6791(int n) {
        class343 class3432 = (class343)this.field3663.field3709.method7996();
        while (class3432 != null) {
            if (n < 0 || class3432.field3731 == n) {
                if (class3432.field3713 != null) {
                    class3432.field3713.method924(class42.field257 / 100);
                    if (class3432.field3713.method928()) {
                        this.field3663.field3707.method741(class3432.field3713);
                    }
                    class3432.method6931();
                }
                if (class3432.field3727 < 0) {
                    this.field3655[class3432.field3731][class3432.field3718] = null;
                }
                class3432.method9623();
            }
            class3432 = (class343)this.field3663.field3709.method8005();
        }
        return;
    }

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="1")
    void method6729(int n) {
        if (n >= 0) {
            this.field3648[n] = 12800;
            this.field3641[n] = 8192;
            this.field3642[n] = 16383;
            this.field3644[n] = 8192;
            this.field3647[n] = 0;
            this.field3637[n] = 8192;
            this.method6817(n);
            this.method6733(n);
            this.field3651[n] = 0;
            this.field3650[n] = Short.MAX_VALUE;
            this.field3669[n] = 256;
            this.field3652[n] = 0;
            this.method6735(n, 8192);
            return;
        }
        for (n = 0; n < 16; ++n) {
            this.method6729(n);
        }
    }

    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="1")
    void method6754(int n) {
        class343 class3432 = (class343)this.field3663.field3709.method7996();
        while (class3432 != null) {
            if ((n < 0 || class3432.field3731 == n) && class3432.field3727 < 0) {
                this.field3655[class3432.field3731][class3432.field3718] = null;
                class3432.field3727 = 0;
            }
            class3432 = (class343)this.field3663.field3709.method8005();
        }
        return;
    }

    @ObfuscatedName(value="bs")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="20")
    void method6731() {
        int n;
        this.method6791(-1);
        this.method6729(-1);
        for (n = 0; n < 16; ++n) {
            this.field3649[n] = this.field3643[n];
        }
        for (n = 0; n < 16; ++n) {
            this.field3640[n] = this.field3643[n] & 0xFFFFFF80;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-250442588")
    void method6817(int n) {
        if ((this.field3651[n] & 2) == 0) return;
        class343 class3432 = (class343)this.field3663.field3709.method7996();
        while (class3432 != null) {
            if (class3432.field3731 == n && this.field3655[n][class3432.field3718] == null && class3432.field3727 < 0) {
                class3432.field3727 = 0;
            }
            class3432 = (class343)this.field3663.field3709.method8005();
        }
        return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="bo")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-336120997")
    void method6733(int n) {
        if ((this.field3651[n] & 4) == 0) return;
        class343 class3432 = (class343)this.field3663.field3709.method7996();
        while (class3432 != null) {
            if (class3432.field3731 == n) {
                class3432.field3733 = 0;
            }
            class3432 = (class343)this.field3663.field3709.method8005();
        }
        return;
    }

    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="33")
    void method6770(int n) {
        int n2 = n & 0xF0;
        if (n2 != 128) {
            if (n2 != 144) {
                if (n2 != 160) {
                    int n3;
                    if (n2 != 176) {
                        if (n2 != 192) {
                            if (n2 != 208) {
                                if (n2 != 224) {
                                    n2 = n & 0xFF;
                                    if (n2 != 255) {
                                        return;
                                    }
                                    this.method6731();
                                    return;
                                }
                                int n4 = n & 0xF;
                                int n5 = (n >> 8 & 0x7F) + (n >> 9 & 0x3F80);
                                this.method6727(n4, n5);
                                return;
                            }
                            int n6 = n & 0xF;
                            int n7 = n >> 8 & 0x7F;
                            this.method6726(n6, n7);
                            return;
                        }
                        int n8 = n & 0xF;
                        int n9 = n >> 8 & 0x7F;
                        this.method6782(n8, n9 + this.field3640[n8]);
                        return;
                    }
                    int n10 = n & 0xF;
                    int n11 = n >> 8 & 0x7F;
                    int n12 = n >> 16 & 0x7F;
                    if (n11 == 0) {
                        this.field3640[n10] = (n12 << 14) + (this.field3640[n10] & 0xFFE03FFF);
                    }
                    if (n11 == 32) {
                        this.field3640[n10] = (n12 << 7) + (this.field3640[n10] & 0xFFFFC07F);
                    }
                    if (n11 == 1) {
                        this.field3647[n10] = (n12 << 7) + (this.field3647[n10] & 0xFFFFC07F);
                    }
                    if (n11 == 33) {
                        this.field3647[n10] = n12 + (this.field3647[n10] & 0xFFFFFF80);
                    }
                    if (n11 == 5) {
                        this.field3637[n10] = (n12 << 7) + (this.field3637[n10] & 0xFFFFC07F);
                    }
                    if (n11 == 37) {
                        this.field3637[n10] = n12 + (this.field3637[n10] & 0xFFFFFF80);
                    }
                    if (n11 == 7) {
                        this.field3648[n10] = (n12 << 7) + (this.field3648[n10] & 0xFFFFC07F);
                    }
                    if (n11 == 39) {
                        this.field3648[n10] = n12 + (this.field3648[n10] & 0xFFFFFF80);
                    }
                    if (n11 == 10) {
                        this.field3641[n10] = (n12 << 7) + (this.field3641[n10] & 0xFFFFC07F);
                    }
                    if (n11 == 42) {
                        this.field3641[n10] = n12 + (this.field3641[n10] & 0xFFFFFF80);
                    }
                    if (n11 == 11) {
                        this.field3642[n10] = (n12 << 7) + (this.field3642[n10] & 0xFFFFC07F);
                    }
                    if (n11 == 43) {
                        this.field3642[n10] = n12 + (this.field3642[n10] & 0xFFFFFF80);
                    }
                    if (n11 == 64) {
                        if (n12 >= 64) {
                            int n13 = n10;
                            this.field3651[n13] = this.field3651[n13] | 1;
                        } else {
                            int n14 = n10;
                            this.field3651[n14] = this.field3651[n14] & 0xFFFFFFFE;
                        }
                    }
                    if (n11 == 65) {
                        if (n12 >= 64) {
                            int n15 = n10;
                            this.field3651[n15] = this.field3651[n15] | 2;
                        } else {
                            this.method6817(n10);
                            int n16 = n10;
                            this.field3651[n16] = this.field3651[n16] & 0xFFFFFFFD;
                        }
                    }
                    if (n11 == 99) {
                        this.field3650[n10] = (n12 << 7) + (this.field3650[n10] & 0x7F);
                    }
                    if (n11 == 98) {
                        this.field3650[n10] = (this.field3650[n10] & 0x3F80) + n12;
                    }
                    if (n11 == 101) {
                        this.field3650[n10] = (n12 << 7) + (this.field3650[n10] & 0x7F) + 16384;
                    }
                    if (n11 == 100) {
                        this.field3650[n10] = (this.field3650[n10] & 0x3F80) + n12 + 16384;
                    }
                    if (n11 == 120) {
                        this.method6791(n10);
                    }
                    if (n11 == 121) {
                        this.method6729(n10);
                    }
                    if (n11 == 123) {
                        this.method6754(n10);
                    }
                    if (n11 == 6 && (n3 = this.field3650[n10]) == 16384) {
                        this.field3669[n10] = (n12 << 7) + (this.field3669[n10] & 0xFFFFC07F);
                    }
                    if (n11 == 38 && (n3 = this.field3650[n10]) == 16384) {
                        this.field3669[n10] = n12 + (this.field3669[n10] & 0xFFFFFF80);
                    }
                    if (n11 == 16) {
                        this.field3652[n10] = (n12 << 7) + (this.field3652[n10] & 0xFFFFC07F);
                    }
                    if (n11 == 48) {
                        this.field3652[n10] = n12 + (this.field3652[n10] & 0xFFFFFF80);
                    }
                    if (n11 == 81) {
                        if (n12 >= 64) {
                            int n17 = n10;
                            this.field3651[n17] = this.field3651[n17] | 4;
                        } else {
                            this.method6733(n10);
                            int n18 = n10;
                            this.field3651[n18] = this.field3651[n18] & 0xFFFFFFFB;
                        }
                    }
                    if (n11 == 17) {
                        this.method6735(n10, (n12 << 7) + (this.field3665[n10] & 0xFFFFC07F));
                    }
                    if (n11 == 49) {
                        this.method6735(n10, n12 + (this.field3665[n10] & 0xFFFFFF80));
                    }
                    return;
                }
                int n19 = n & 0xF;
                int n20 = n >> 8 & 0x7F;
                int n21 = n >> 16 & 0x7F;
                this.method6725(n19, n20, n21);
                return;
            }
            int n22 = n & 0xF;
            int n23 = n >> 8 & 0x7F;
            int n24 = n >> 16 & 0x7F;
            if (n24 > 0) {
                this.method6780(n22, n23, n24);
            } else {
                this.method6724(n22, n23, 64);
            }
            return;
        }
        int n25 = n & 0xF;
        int n26 = n >> 8 & 0x7F;
        int n27 = n >> 16 & 0x7F;
        this.method6724(n25, n26, n27);
    }

    @ObfuscatedName(value="bn")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="27268525")
    void method6735(int n, int n2) {
        this.field3665[n] = n2;
        this.field3654[n] = (int)(2097152.0 * Math.pow(2.0, 5.4931640625E-4 * (double)n2) + 0.5);
    }

    @ObfuscatedName(value="br")
    @ObfuscatedSignature(descriptor="(Lne;I)I", garbageValue="688799447")
    int method6736(class343 class3432) {
        int n;
        int n2 = (class3432.field3723 * class3432.field3722 >> 12) + class3432.field3721;
        n2 = ((this.field3644[class3432.field3731] - 8192) * this.field3669[class3432.field3731] >> 12) + n2;
        class332 class3322 = class3432.field3716;
        if (class3322.field3621 > 0 && (class3322.field3618 > 0 || this.field3647[class3432.field3731] > 0)) {
            n = class3322.field3618 << 2;
            int n3 = class3322.field3622 << 1;
            if (class3432.field3729 < n3) {
                n = n * class3432.field3729 / n3;
            }
            double d = Math.sin((double)(class3432.field3730 & 0x1FF) * 0.01227184630308513);
            n2 += (int)((double)(n += this.field3647[class3432.field3731] >> 7) * d);
        }
        return (n = (int)((double)(class3432.field3732.field242 * 256) * Math.pow(2.0, (double)n2 * 3.255208333333333E-4) / (double)class42.field257 + 0.5)) < 1 ? 1 : n;
    }

    @ObfuscatedName(value="bl")
    @ObfuscatedSignature(descriptor="(Lne;I)I", garbageValue="167576027")
    int method6737(class343 class3432) {
        int n;
        int n2;
        int n3;
        int n4;
        class332 class3322 = class3432.field3716;
        int n5 = this.field3648[class3432.field3731] * this.field3642[class3432.field3731] + 4096 >> 13;
        n5 = n5 * n5 + 16384 >> 15;
        n5 = n5 * class3432.field3720 + 16384 >> 15;
        n5 = n5 * this.field3638 + 128 >> 8;
        if (class3322.field3616 > 0) {
            n5 = (int)((double)n5 * Math.pow(0.5, 1.953125E-5 * (double)(class3432.field3724 * 128) * (double)class3322.field3616) + 0.5);
        }
        if (class3322.field3614 != null) {
            n4 = class3432.field3715;
            n3 = class3322.field3614[class3432.field3726 * 4 + 1];
            if (class3432.field3726 * 4 < class3322.field3614.length - 2) {
                n2 = (class3322.field3614[class3432.field3726 * 4] & 0xFF) << 8;
                n = (class3322.field3614[class3432.field3726 * 4 + 2] & 0xFF) << 8;
                n3 = (n4 - n2) * (class3322.field3614[class3432.field3726 * 4 + 3] - n3) / (n - n2) + n3;
            }
            n5 = n5 * n3 + 32 >> 6;
        }
        if (class3432.field3727 > 0 && class3322.field3615 != null) {
            n4 = class3432.field3727;
            n3 = class3322.field3615[class3432.field3714 * 4 + 1];
            if (class3432.field3714 * 4 < class3322.field3615.length - 2) {
                n2 = (class3322.field3615[class3432.field3714 * 4] & 0xFF) << 8;
                n = (class3322.field3615[class3432.field3714 * 4 + 2] & 0xFF) << 8;
                n3 = (class3322.field3615[class3432.field3714 * 4 + 3] - n3) * (n4 - n2) / (n - n2) + n3;
            }
            n5 = n3 * n5 + 32 >> 6;
        }
        return n5;
    }

    @ObfuscatedName(value="cb")
    @ObfuscatedSignature(descriptor="(Lne;I)I", garbageValue="1838475002")
    int method6738(class343 class3432) {
        int n = this.field3641[class3432.field3731];
        if (n < 8192) {
            return n * class3432.field3719 + 32 >> 6;
        }
        return 16384 - ((128 - class3432.field3719) * (16384 - n) + 32 >> 6);
    }

    @ObfuscatedName(value="cn")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-2071802591")
    void method6744() {
        int n = this.field3658;
        int n2 = this.field3660;
        long l = this.field3662;
        block0: while (true) {
            if (n2 != this.field3660) {
                this.field3658 = n;
                this.field3660 = n2;
                this.field3662 = l;
                return;
            }
            while (n2 == this.field3657.field3682[n]) {
                this.field3657.method6826(n);
                int n3 = this.field3657.method6830(n);
                if (n3 != 1) {
                    if ((n3 & 0x80) != 0) {
                        this.method6770(n3);
                    }
                    this.field3657.method6829(n);
                    this.field3657.method6871(n);
                    continue;
                }
                this.field3657.method6828();
                this.field3657.method6871(n);
                if (!this.field3657.method6835()) break;
                if (!this.field3659 || n2 == 0) break block0;
                this.field3657.method6868(l);
                break;
            }
            n = this.field3657.method6834();
            n2 = this.field3657.field3682[n];
            l = this.field3657.method6850(n2);
        }
        this.method6731();
        this.field3657.method6823();
    }

    @ObfuscatedName(value="cc")
    @ObfuscatedSignature(descriptor="(Lne;I)Z", garbageValue="-1590069172")
    boolean method6745(class343 class3432) {
        if (class3432.field3713 != null) {
            return false;
        }
        if (class3432.field3727 >= 0) {
            class3432.method9623();
            if (class3432.field3717 > 0 && class3432 == this.field3656[class3432.field3731][class3432.field3717]) {
                this.field3656[class3432.field3731][class3432.field3717] = null;
            }
        }
        return true;
    }

    @ObfuscatedName(value="co")
    @ObfuscatedSignature(descriptor="(Lne;[IIII)Z", garbageValue="-2055070840")
    boolean method6746(class343 class3432, int[] nArray, int n, int n2) {
        class3432.field3728 = class42.field257 / 100;
        if (class3432.field3727 >= 0 && (class3432.field3713 == null || class3432.field3713.method927())) {
            class3432.method6931();
            class3432.method9623();
            if (class3432.field3717 > 0 && class3432 == this.field3656[class3432.field3731][class3432.field3717]) {
                this.field3656[class3432.field3731][class3432.field3717] = null;
            }
            return true;
        }
        int n3 = class3432.field3723;
        if (n3 > 0) {
            if ((n3 -= (int)(16.0 * Math.pow(2.0, (double)this.field3637[class3432.field3731] * 4.921259842519685E-4) + 0.5)) < 0) {
                n3 = 0;
            }
            class3432.field3723 = n3;
        }
        class3432.field3713.method1040(this.method6736(class3432));
        class332 class3322 = class3432.field3716;
        boolean bl = false;
        ++class3432.field3729;
        class3432.field3730 += class3322.field3621;
        double d = (double)((class3432.field3718 - 60 << 8) + (class3432.field3723 * class3432.field3722 >> 12)) * 5.086263020833333E-6;
        if (class3322.field3616 > 0) {
            class3432.field3724 = class3322.field3619 > 0 ? class3432.field3724 * -1698938880 + (int)(128.0 * Math.pow(2.0, d * (double)class3322.field3619) + 0.5) * 288716928 : class3432.field3724 * -1698938880 + -1698938880;
        }
        if (class3322.field3614 != null) {
            class3432.field3715 = class3322.field3617 > 0 ? (class3432.field3715 += (int)(128.0 * Math.pow(2.0, d * (double)class3322.field3617) + 0.5)) : (class3432.field3715 += 128);
            while (class3432.field3726 * 4 < class3322.field3614.length - 2 && class3432.field3715 > (class3322.field3614[class3432.field3726 * 4 + 2] & 0xFF) << 8) {
                class3432.field3726 = class3432.field3726 * 4 + 2;
            }
            if (class3432.field3726 * 4 == class3322.field3614.length - 2 && class3322.field3614[class3432.field3726 * 4 + 1] == 0) {
                bl = true;
            }
        }
        if (class3432.field3727 >= 0 && class3322.field3615 != null && (this.field3651[class3432.field3731] & 1) == 0 && (class3432.field3717 < 0 || class3432 != this.field3656[class3432.field3731][class3432.field3717])) {
            class3432.field3727 = class3322.field3620 > 0 ? (class3432.field3727 += (int)(128.0 * Math.pow(2.0, (double)class3322.field3620 * d) + 0.5)) : (class3432.field3727 += 128);
            while (class3432.field3714 * 4 < class3322.field3615.length - 2 && class3432.field3727 > (class3322.field3615[class3432.field3714 * 4 + 2] & 0xFF) << 8) {
                class3432.field3714 = class3432.field3714 * 4 + 2;
            }
            if (class3432.field3714 * 4 == class3322.field3615.length - 2) {
                bl = true;
            }
        }
        if (!bl) {
            class3432.field3713.method1008(class3432.field3728, this.method6737(class3432), this.method6738(class3432));
            return false;
        }
        class3432.field3713.method924(class3432.field3728);
        if (nArray != null) {
            class3432.field3713.vmethod6908(nArray, n, n2);
        } else {
            class3432.field3713.vmethod6902(n2);
        }
        if (class3432.field3713.method928()) {
            this.field3663.field3707.method741(class3432.field3713);
        }
        class3432.method6931();
        if (class3432.field3727 >= 0) {
            class3432.method9623();
            if (class3432.field3717 > 0 && class3432 == this.field3656[class3432.field3731][class3432.field3717]) {
                this.field3656[class3432.field3731][class3432.field3717] = null;
            }
        }
        return true;
    }
}

