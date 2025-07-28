package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="mi")
public final class class315 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ltm;")
    class510 field3295 = new class510();
    @ObfuscatedName(value="ah")
    int field3296;
    @ObfuscatedName(value="az")
    int field3297;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lue;")
    class529 field3298;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lpz;")
    class415 field3299 = new class415();

    public class315(int n) {
        this.field3296 = n;
        this.field3297 = n;
        int n2 = 1;
        while (n2 + n2 < n) {
            n2 += n2;
        }
        this.field3298 = new class529(n2);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(J)Ltm;")
    public class510 method6578(long l) {
        class510 class5102 = (class510)this.field3298.method9967(l);
        if (class5102 != null) {
            this.field3299.method8134(class5102);
        }
        return class5102;
    }

    @ObfuscatedName(value="ah")
    public void method6579(long l) {
        class510 class5102 = (class510)this.field3298.method9967(l);
        if (class5102 != null) {
            class5102.method9623();
            class5102.method9621();
            ++this.field3297;
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ltm;J)V")
    public void method6590(class510 class5102, long l) {
        if (this.field3297 != 0) {
            --this.field3297;
        } else {
            class510 class5103 = this.field3299.method8137();
            class5103.method9623();
            class5103.method9621();
            if (class5103 == this.field3295) {
                class5103 = this.field3299.method8137();
                class5103.method9623();
                class5103.method9621();
            }
        }
        this.field3298.method9970(class5102, l);
        this.field3299.method8134(class5102);
    }

    @ObfuscatedName(value="ao")
    public void method6581() {
        this.field3299.method8136();
        this.field3298.method9968();
        this.field3295 = new class510();
        this.field3297 = this.field3296;
    }
}

