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

@ObfuscatedName(value="gv")
public class class167 {
    @ObfuscatedName(value="fm")
    @ObfuscatedSignature(descriptor="Lok;")
    static class388 field1793;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(longValue=5893049423313328319L)
    long field1787;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(longValue=1230870611193710827L)
    public long field1791 = -1L;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lps;")
    class412 field1786 = new class412();

    @ObfuscatedSignature(descriptor="(Lvy;)V")
    public class167(class556 class5562) {
        this.method3812(class5562);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="1996451817")
    void method3812(class556 class5562) {
        this.field1787 = class5562.method10273();
        this.field1791 = class5562.method10273();
        int n = class5562.method10282();
        while (true) {
            class166 class1662;
            if (n == 0) {
                return;
            }
            if (n == 1) {
                class1662 = new class162(this);
            } else if (n == 4) {
                class1662 = new class173(this);
            } else if (n == 3) {
                class1662 = new class158(this);
            } else if (n == 2) {
                class1662 = new class156(this);
            } else {
                if (n != 5) break;
                class1662 = new class163(this);
            }
            ((class166)class1662).vmethod3869(class5562);
            this.field1786.method8043(class1662);
            n = class5562.method10282();
        }
        throw new RuntimeException("");
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgk;B)V", garbageValue="-15")
    public void method3817(class170 class1702) {
        if (this.field1787 == class1702.field5174 && class1702.field1810 == this.field1791) {
            class166 class1662 = (class166)this.field1786.method8046();
            while (true) {
                if (class1662 == null) {
                    ++class1702.field1810;
                    return;
                }
                class1662.vmethod3870(class1702);
                class1662 = (class166)this.field1786.method8048();
            }
        }
        throw new RuntimeException("");
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;B)V", garbageValue="53")
    public static void method3811(class391 class3912) {
        class242.field2588 = class3912;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(CI)Z", garbageValue="-87648385")
    public static boolean method3815(char c) {
        return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }
}

