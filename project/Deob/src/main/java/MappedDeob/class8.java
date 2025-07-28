/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="at")
public class class8 {
    @ObfuscatedName(value="ay")
    final int field32;
    @ObfuscatedName(value="ah")
    final int field33;
    @ObfuscatedName(value="az")
    final String field31;

    @ObfuscatedSignature(descriptor="(Lvy;)V")
    class8(Buffer buffer) {
        this(buffer.readUnsignedByte(), buffer.readUnsignedByte(), buffer.readStringCp1252NullTerminated());
    }

    class8(int n, int n2, String string) {
        this.field32 = n;
        this.field33 = n2;
        this.field31 = string;
    }

    @ObfuscatedName(value="ay")
    String method60() {
        return Integer.toHexString(this.field32) + Integer.toHexString(this.field33) + this.field31;
    }

    @ObfuscatedName(value="ah")
    int method61() {
        return this.field33;
    }
}

