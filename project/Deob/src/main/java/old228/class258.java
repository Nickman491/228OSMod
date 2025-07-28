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

@ObfuscatedName(value="jd")
public class class258
extends class510 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    static class391 field2741;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmi;")
    static class315 field2737;
    @ObfuscatedName(value="az")
    char field2738;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1211806913)
    public int field2739;
    @ObfuscatedName(value="ad")
    public String field2740;
    @ObfuscatedName(value="an")
    boolean field2736 = true;

    static {
        field2737 = new class315(64);
    }

    class258() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1097931173")
    void method5444() {
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lvy;B)V", garbageValue="6")
    void method5429(class556 class5562) {
        int n;
        while ((n = class5562.method10282()) != 0) {
            this.method5430(class5562, n);
        }
        return;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="355757749")
    void method5430(class556 class5562, int n) {
        if (n != 1) {
            if (n == 2) {
                this.field2739 = class5562.method10440();
            } else if (n == 4) {
                this.field2736 = false;
            } else if (n == 5) {
                this.field2740 = class5562.method10290();
            }
        } else {
            char c;
            byte by = class5562.method10524();
            int n2 = by & 0xFF;
            if (n2 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(n2, 16));
            }
            if (n2 >= 128 && n2 < 160) {
                int n3 = class417.field4711[n2 - 128];
                if (n3 == 0) {
                    n3 = 63;
                }
                n2 = n3;
            }
            this.field2738 = c = (char)n2;
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-218803820")
    public boolean method5431() {
        return this.field2738 == 's';
    }
}

