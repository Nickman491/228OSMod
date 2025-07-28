/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="uu")
final class class543
implements class540 {
    class543() {
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Object;Lvy;I)V", garbageValue="-1394480464")
    public void vmethod10147(Object object, Buffer buffer) {
        this.method10112((Long)object, buffer);
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;I)Ljava/lang/Object;", garbageValue="-95091658")
    public Object vmethod10140(Buffer buffer) {
        return buffer.readLong();
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Long;Lvy;I)V", garbageValue="-196702427")
    void method10112(Long l, Buffer buffer) {
        buffer.writeLong(l);
    }
}

