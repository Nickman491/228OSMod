package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="mf")
public final class class313 {
    @ObfuscatedName(value="ay")
    int field3293;
    @ObfuscatedName(value="ah")
    int field3290;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lue;")
    class529 field3291;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lpz;")
    class415 field3292 = new class415();
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lmk;")
    class312 field3289;

    public class313(int n, int n2) {
        int n3;
        this.field3293 = n;
        this.field3290 = n;
        for (n3 = 1; n3 + n3 < n && n3 < n2; n3 += n3) {
        }
        this.field3291 = new class529(n3);
    }

    public class313(int n) {
        this(n, n);
    }

    @ObfuscatedName(value="ay")
    public Object method6545(long l) {
        class317 class3172 = (class317)this.field3291.method9967(l);
        if (class3172 == null) {
            return null;
        }
        Object object = class3172.vmethod6602();
        if (object != null) {
            if (!class3172.vmethod6603()) {
                this.field3292.method8134(class3172);
                class3172.field5167 = 0L;
            } else {
                class316 class3162 = new class316(object, class3172.field3301);
                this.field3291.method9970(class3162, class3172.field5174);
                this.field3292.method8134(class3162);
                class3162.field5167 = 0L;
                class3172.method9623();
                class3172.method9621();
            }
            return object;
        }
        class3172.method9623();
        class3172.method9621();
        this.field3290 += class3172.field3301;
        return null;
    }

    @ObfuscatedName(value="ah")
    void method6546(long l) {
        class317 class3172 = (class317)this.field3291.method9967(l);
        this.method6554(class3172);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lmy;)V")
    void method6554(class317 class3172) {
        if (class3172 != null) {
            class3172.method9623();
            class3172.method9621();
            this.field3290 += class3172.field3301;
        }
    }

    @ObfuscatedName(value="ao")
    public void method6549(Object object, long l) {
        this.method6558(object, l, 1);
    }

    @ObfuscatedName(value="ad")
    public void method6558(Object object, long l, int n) {
        if (n > this.field3293) {
            throw new IllegalStateException();
        }
        this.method6546(l);
        this.field3290 -= n;
        while (true) {
            class317 class3172;
            if (this.field3290 >= 0) {
                class3172 = new class316(object, n);
                this.field3291.method9970(class3172, l);
                this.field3292.method8134(class3172);
                class3172.field5167 = 0L;
                return;
            }
            class3172 = (class317)this.field3292.method8137();
            if (class3172 == null) break;
            if (!class3172.vmethod6603()) {
                // empty if block
            }
            this.method6554(class3172);
            if (this.field3289 == null) continue;
            this.field3289.method6541(class3172.vmethod6602());
        }
        throw new RuntimeException("");
    }

    @ObfuscatedName(value="an")
    public void method6553(int n) {
        class317 class3172 = (class317)this.field3292.method8142();
        while (class3172 != null) {
            if (!class3172.vmethod6603()) {
                if (++class3172.field5167 > (long)n) {
                    class314 class3142 = new class314(class3172.vmethod6602(), class3172.field3301);
                    this.field3291.method9970(class3142, class3172.field5174);
                    class415.method8135(class3142, class3172);
                    class3172.method9623();
                    class3172.method9621();
                }
            } else if (class3172.vmethod6602() == null) {
                class3172.method9623();
                class3172.method9621();
                this.field3290 += class3172.field3301;
            }
            class3172 = (class317)this.field3292.method8138();
        }
        return;
    }

    @ObfuscatedName(value="ae")
    public void method6551() {
        this.field3292.method8136();
        this.field3291.method9968();
        this.field3290 = this.field3293;
    }
}

