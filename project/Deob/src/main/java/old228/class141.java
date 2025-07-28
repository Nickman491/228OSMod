package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fu")
final class class141
implements ThreadFactory {
    class141() {
    }

    @Override
    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "OSRS Maya Anim Load");
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lff;FB)F", garbageValue="-75")
    static float method3511(class136 class1362, float f) {
        if (class1362 != null) {
            float f2;
            float f3 = f != class1362.field1576 ? (f != class1362.field1577 ? (f - class1362.field1576) / (class1362.field1577 - class1362.field1576) : 1.0f) : 0.0f;
            if (!class1362.field1575) {
                float[] fArray = new float[4];
                fArray[3] = class1362.field1581;
                fArray[2] = class1362.field1580;
                fArray[1] = class1362.field1579;
                fArray[0] = class1362.field1578 - f3;
                float[] fArray2 = new float[5];
                int n = class84.method2556(fArray, 3, 0.0f, true, 1.0f, true, fArray2);
                f2 = n != 1 ? 0.0f : fArray2[0];
            } else {
                f2 = f3;
            }
            return class1362.field1582 + f2 * (f2 * (f2 * class1362.field1591 + class1362.field1584) + class1362.field1585);
        }
        return 0.0f;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IB)J", garbageValue="111")
    public static long method3506(int n) {
        return class199.field2270[n];
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="39")
    public static boolean method3509(int n) {
        return (n >> 21 & 1) != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;IZB)I", garbageValue="0")
    static int method3510(CharSequence charSequence, int n, boolean bl) {
        if (n < 2 || n > 36) throw new IllegalArgumentException("" + n);
        boolean bl2 = false;
        boolean bl3 = false;
        int n2 = 0;
        int n3 = charSequence.length();
        int n4 = 0;
        while (true) {
            block13: {
                block12: {
                    int n5;
                    int n6;
                    block11: {
                        if (n4 >= n3) {
                            if (bl3) return n2;
                            throw new NumberFormatException();
                        }
                        n6 = charSequence.charAt(n4);
                        if (n4 != 0) break block11;
                        if (n6 == 45) break block12;
                        if (n6 == 43) break block13;
                    }
                    if (n6 >= 48 && n6 <= 57) {
                        n6 -= 48;
                    } else if (n6 >= 65 && n6 <= 90) {
                        n6 -= 55;
                    } else {
                        if (n6 < 97 || n6 > 122) throw new NumberFormatException();
                        n6 -= 87;
                    }
                    if (n6 >= n) {
                        throw new NumberFormatException();
                    }
                    if (bl2) {
                        n6 = -n6;
                    }
                    if ((n5 = n6 + n2 * n) / n != n2) {
                        throw new NumberFormatException();
                    }
                    n2 = n5;
                    bl3 = true;
                    break block13;
                }
                bl2 = true;
            }
            ++n4;
        }
    }
}

