package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="rq")
public class class463 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lrq;")
    public static final class463 field4954 = new class463(0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lrq;")
    static final class463 field4953 = new class463(1);
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-2066207141)
    final int field4952;

    class463(int n) {
        this.field4952 = n;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Lwk;", garbageValue="1773166265")
    public static class576 method9025(int n) {
        class576[] class576Array;
        class576[] class576Array2 = class576Array = new class576[]{class576.field5632, class576.field5631, class576.field5630};
        int n2 = 0;
        while (n2 < class576Array2.length) {
            class576 class5762 = class576Array2[n2];
            if (n == class5762.field5629) {
                return class5762;
            }
            ++n2;
        }
        return null;
    }
}

