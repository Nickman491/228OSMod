package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bp")
public class class38
extends class49 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpm;")
    class410 field234 = new class410();
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpm;")
    class410 field233 = new class410();
    @ObfuscatedName(value="az")
    int field232 = 0;
    @ObfuscatedName(value="ao")
    int field235 = -1;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lbn;)V")
    public final synchronized void method741(class49 class4910) {
        this.field234.method7999(class4910);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lbn;)V")
    public final synchronized void method745(class49 class4910) {
        class4910.method9623();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="az")
    void method770() {
        if (this.field232 <= 0) return;
        class56 class5610 = (class56)this.field233.method7996();
        while (true) {
            if (class5610 == null) {
                this.field235 -= this.field232;
                this.field232 = 0;
                return;
            }
            class5610.field374 -= this.field232;
            class5610 = (class56)this.field233.method8005();
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ltf;Lca;)V")
    void method730(class514 class5142, class56 class5610) {
        while (this.field233.field4696 != class5142 && ((class56)class5142).field374 <= class5610.field374) {
            class5142 = class5142.field5173;
        }
        class410.method8000(class5610, class5142);
        this.field235 = ((class56)this.field233.field4696.field5173).field374;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lca;)V")
    void method767(class56 class5610) {
        class5610.method9623();
        class5610.method1162();
        class514 class5142 = this.field233.field4696.field5173;
        this.field235 = class5142 == this.field233.field4696 ? -1 : ((class56)class5142).field374;
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="()Lbn;")
    protected class49 vmethod6899() {
        return (class49)this.field234.method7996();
    }

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="()Lbn;")
    protected class49 vmethod6900() {
        return (class49)this.field234.method8005();
    }

    @Override
    @ObfuscatedName(value="ax")
    protected int vmethod6927() {
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    @ObfuscatedName(value="at")
    public final synchronized void vmethod6908(int[] nArray, int n, int n2) {
        do {
            class56 class5610;
            if (this.field235 < 0) {
                this.method737(nArray, n, n2);
                return;
            }
            if (n2 + this.field232 < this.field235) {
                this.field232 += n2;
                this.method737(nArray, n, n2);
                return;
            }
            int n3 = this.field235 - this.field232;
            this.method737(nArray, n, n3);
            n = n3 + n;
            n2 -= n3;
            this.field232 += n3;
            this.method770();
            class56 class5611 = class5610 = (class56)this.field233.method7996();
            synchronized (class5611) {
                int n4 = class5610.method1163();
                if (n4 < 0) {
                    class5610.field374 = 0;
                    this.method767(class5610);
                } else {
                    class5610.field374 = n4;
                    this.method730(class5610.field5173, class5610);
                }
            }
        } while (n2 != 0);
    }

    @ObfuscatedName(value="ac")
    void method737(int[] nArray, int n, int n2) {
        class49 class4910 = (class49)this.field234.method7996();
        while (class4910 != null) {
            class4910.method1083(nArray, n, n2);
            class4910 = (class49)this.field234.method8005();
        }
        return;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    @ObfuscatedName(value="au")
    public final synchronized void vmethod6902(int n) {
        do {
            class56 class5610;
            if (this.field235 < 0) {
                this.method750(n);
                return;
            }
            if (this.field232 + n < this.field235) {
                this.field232 += n;
                this.method750(n);
                return;
            }
            int n2 = this.field235 - this.field232;
            this.method750(n2);
            n -= n2;
            this.field232 += n2;
            this.method770();
            class56 class5611 = class5610 = (class56)this.field233.method7996();
            synchronized (class5611) {
                int n3 = class5610.method1163();
                if (n3 < 0) {
                    class5610.field374 = 0;
                    this.method767(class5610);
                } else {
                    class5610.field374 = n3;
                    this.method730(class5610.field5173, class5610);
                }
            }
        } while (n != 0);
    }

    @ObfuscatedName(value="as")
    void method750(int n) {
        class49 class4910 = (class49)this.field234.method7996();
        while (class4910 != null) {
            class4910.vmethod6902(n);
            class4910 = (class49)this.field234.method8005();
        }
        return;
    }
}

