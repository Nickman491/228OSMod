/*
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
    public Buffer vmethod12(Buffer buffer) {
        Buffer buffer2 = new Buffer(100);
        this.method1(buffer, buffer2);
        return buffer2;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;Lvy;)V")
    void method1(Buffer buffer, Buffer buffer2) {
        class8 class83 = new class8(buffer);
        class5 class52 = new class5(class83);
        long l = 0L;
        while (true) {
            if (class52.method22(class83.method61(), class83.method60(), l)) {
                buffer2.writeLong(l);
                return;
            }
            ++l;
        }
    }
}

