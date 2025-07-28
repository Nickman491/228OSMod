/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ul")
final class class545
implements class540 {
    class545() {
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Object;Lvy;I)V", garbageValue="-1394480464")
    public void vmethod10147(Object object, Buffer buffer) {
        this.method10139((String)object, buffer);
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;I)Ljava/lang/Object;", garbageValue="-95091658")
    public Object vmethod10140(Buffer buffer) {
        return buffer.readStringCp1252NullTerminated();
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Lvy;I)V", garbageValue="-1668245202")
    void method10139(String string, Buffer buffer) {
        buffer.writeStringCp1252NullTerminated(string);
    }
}

