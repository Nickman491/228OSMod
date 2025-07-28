/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fg")
public class class135
implements Callable {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lff;")
    final class136 field1567;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lfs;")
    final class137 field1569;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lfm;")
    final class138 field1566;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=2124282617)
    final int field1568;
    @ObfuscatedSignature(descriptor="Lfl;")
    final /* synthetic */ class144 this$0;

    @ObfuscatedSignature(descriptor="(Lfl;Lff;Lfs;Lfm;I)V")
    class135(class144 class1442, class136 class1362, class137 class1372, class138 class1382, int n) {
        this.this$0 = class1442;
        this.field1567 = class1362;
        this.field1569 = class1372;
        this.field1566 = class1382;
        this.field1568 = n;
    }

    public Object call() {
        this.field1567.method3448();
        class136[][] class136Array = this.field1569 != class137.field1600 ? this.this$0.field1639 : this.this$0.field1638;
        class136Array[this.field1568][this.field1566.method3491()] = this.field1567;
        return null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIIB)I", garbageValue="43")
    static int method3445(int n, int n2, int n3) {
        int n4 = n >> 16 & 0xFF;
        int n5 = n >> 8 & 0xFF;
        int n6 = n & 0xFF;
        int n7 = n2 >> 16 & 0xFF;
        int n8 = n2 >> 8 & 0xFF;
        int n9 = n2 & 0xFF;
        int n10 = n4 + (n7 - n4 + 1) * n3 / 64 & 0xFF;
        int n11 = n5 + (n8 - n5 + 1) * n3 / 64 & 0xFF;
        int n12 = (n9 - n6 + 1) * n3 / 64 + n6 & 0xFF;
        return n10 << 16 | n11 << 8 | n12;
    }
}

