/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="uy")
final class class541
implements class540 {
    class541() {
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Object;Lvy;I)V", garbageValue="-1394480464")
    public void vmethod10147(Object object, Buffer buffer) {
        this.method10100((Integer)object, buffer);
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;I)Ljava/lang/Object;", garbageValue="-95091658")
    public Object vmethod10140(Buffer buffer) {
        return buffer.readInt();
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Integer;Lvy;S)V", garbageValue="16384")
    void method10100(Integer n, Buffer buffer) {
        buffer.method10268(n);
    }
}

