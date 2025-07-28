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

@ObfuscatedName(value="go")
public class class172
extends class150 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(longValue=7871847390707015403L)
    long field1822 = -1L;
    @ObfuscatedName(value="ah")
    String field1820 = null;
    @ObfuscatedSignature(descriptor="Lfv;")
    final /* synthetic */ class153 this$0;

    @ObfuscatedSignature(descriptor="(Lfv;)V")
    class172(class153 class1532) {
        this.this$0 = class1532;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1355269794")
    void vmethod3879(class556 class5562) {
        if (class5562.method10282() != 255) {
            --class5562.field5471;
            this.field1822 = class5562.method10273();
        }
        this.field1820 = class5562.method10360();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgq;B)V", garbageValue="0")
    void vmethod3882(class161 class1612) {
        class1612.method3693(this.field1822, this.field1820);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)F", garbageValue="16433405")
    public static float method3867(int n) {
        return (float)(Math.PI * 2 * (double)((float)(n &= 0x7FF) / 2048.0f));
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(CB)C", garbageValue="2")
    static char method3861(char c) {
        if (c == '\u00c6') {
            return 'E';
        }
        if (c == '\u00e6') {
            return 'e';
        }
        if (c == '\u00df') {
            return 's';
        }
        if (c == '\u0152') {
            return 'E';
        }
        if (c == '\u0153') {
            return 'e';
        }
        return '\u0000';
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(FFFFLff;B)V", garbageValue="5")
    static void method3866(float f, float f2, float f3, float f4, class136 class1362) {
        float f5 = f2 - f;
        float f6 = f3 - f2;
        float f7 = f4 - f3;
        float f8 = f6 - f5;
        class1362.field1581 = f7 - f6 - f8;
        class1362.field1580 = f8 + (f8 + f8);
        class1362.field1579 = f5 + (f5 + f5);
        class1362.field1578 = f;
    }
}

