package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jh")
public class class237
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    public static class391 field2546;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static class315 field2545;
    @ObfuscatedName(value="az")
    public boolean field2544 = false;

    static {
        field2545 = new class315(64);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1478983834")
    public void method5201(class556 class5562) {
        int n;
        while ((n = class5562.method10282()) != 0) {
            this.method5199(class5562, n);
        }
        return;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="995631844")
    void method5199(class556 class5562, int n) {
        if (n == 2) {
            this.field2544 = true;
        }
    }
}

