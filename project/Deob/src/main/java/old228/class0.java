package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ay")
public class class0
implements class3 {
    class0() {
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;)Lvy;")
    public class556 vmethod12(class556 class5562) {
        class556 class5563 = new class556(100);
        this.method1(class5562, class5563);
        return class5563;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;Lvy;)V")
    void method1(class556 class5562, class556 class5563) {
        class8 class810 = new class8(class5562);
        class5 class55 = new class5(class810);
        long l = 0L;
        while (true) {
            if (class55.method22(class810.method61(), class810.method60(), l)) {
                class5563.method10466(l);
                return;
            }
            ++l;
        }
    }
}

