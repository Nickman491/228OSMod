package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pz")
public class class415
implements Iterable {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ltm;")
    public class510 field4707;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ltm;")
    class510 field4708;

    public class415() {
        this.field4707.field5168 = this.field4707 = new class510();
        this.field4707.field5169 = this.field4707;
    }

    @ObfuscatedName(value="ay")
    public void method8136() {
        while (this.field4707.field5168 != this.field4707) {
            this.field4707.field5168.method9621();
        }
        return;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ltm;)V")
    public void method8134(class510 class5102) {
        if (class5102.field5169 != null) {
            class5102.method9621();
        }
        class5102.field5169 = this.field4707.field5169;
        class5102.field5168 = this.field4707;
        class5102.field5169.field5168 = class5102;
        class5102.field5168.field5169 = class5102;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="()Ltm;")
    public class510 method8137() {
        class510 class5102 = this.field4707.field5168;
        if (class5102 == this.field4707) {
            return null;
        }
        class5102.method9621();
        return class5102;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="()Ltm;")
    public class510 method8142() {
        return this.method8133(null);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Ltm;)Ltm;")
    class510 method8133(class510 class5102) {
        class510 class5103 = class5102 == null ? this.field4707.field5168 : class5102;
        if (class5103 != this.field4707) {
            this.field4708 = class5103.field5168;
            return class5103;
        }
        this.field4708 = null;
        return null;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="()Ltm;")
    public class510 method8138() {
        class510 class5102 = this.field4708;
        if (class5102 != this.field4707) {
            this.field4708 = class5102.field5168;
            return class5102;
        }
        this.field4708 = null;
        return null;
    }

    public Iterator iterator() {
        return new class414(this);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ltm;Ltm;)V")
    public static void method8135(class510 class5102, class510 class5103) {
        if (class5102.field5169 != null) {
            class5102.method9621();
        }
        class5102.field5169 = class5103;
        class5102.field5168 = class5103.field5168;
        class5102.field5169.field5168 = class5102;
        class5102.field5168.field5169 = class5102;
    }
}

