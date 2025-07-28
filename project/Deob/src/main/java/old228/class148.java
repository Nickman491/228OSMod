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

@ObfuscatedName(value="fk")
public class class148
extends class150 {
    @ObfuscatedName(value="ad")
    static String[] field1675;
    @ObfuscatedName(value="mz")
    @ObfuscatedGetter(intValue=851312265)
    static int field1676;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(longValue=-7198038692640291871L)
    long field1673 = -1L;
    @ObfuscatedName(value="ah")
    String field1672 = null;
    @ObfuscatedSignature(descriptor="Lfv;")
    final /* synthetic */ class153 this$0;

    @ObfuscatedSignature(descriptor="(Lfv;)V")
    class148(class153 class1532) {
        this.this$0 = class1532;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1355269794")
    void vmethod3879(class556 class5562) {
        if (class5562.method10282() != 255) {
            --class5562.field5471;
            this.field1673 = class5562.method10273();
        }
        this.field1672 = class5562.method10360();
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgq;B)V", garbageValue="0")
    void vmethod3882(class161 class1612) {
        class1612.method3691(this.field1673, this.field1672, 0);
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="37")
    public static int method3577(int n) {
        long l = class199.field2270[n];
        int n2 = (int)(l >>> 7 & 0x7FL);
        return n2;
    }

    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="98")
    static int method3575(int n) {
        return (int)Math.pow(2.0, 7.0f + (float)n / 256.0f);
    }
}

