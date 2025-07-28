/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="uw")
class class538
implements Iterator {
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="[Lvi;")
    static IndexedSprite[] field5379;
    @ObfuscatedName(value="aq")
    static int[][][] field5380;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1212790791)
    int field5381;
    @ObfuscatedSignature(descriptor="Luf;")
    final /* synthetic */ class539 this$0;

    @ObfuscatedSignature(descriptor="(Luf;)V")
    class538(class539 class5392) {
        this.this$0 = class5392;
    }

    @Override
    public boolean hasNext() {
        return this.field5381 < this.this$0.method9511();
    }

    public Object next() {
        int n;
        class498 class4982;
        if ((class4982 = (class498)this.this$0.field5383.get(n = ++this.field5381 - 1)) != null) {
            return class4982;
        }
        return this.this$0.method10081(n);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)Lfm;", garbageValue="759007110")
    static class138 method10069(int n) {
        class404[] class404Array = new class138[]{class138.field1608, class138.field1606, class138.field1607, class138.field1619, class138.field1617, class138.field1610, class138.field1625, class138.field1612, class138.field1613, class138.field1614, class138.field1615, class138.field1616, class138.field1611, class138.field1618, class138.field1605, class138.field1620, class138.field1621};
        class138 class1382 = (class138)StructComposition.findEnumerated(class404Array, n);
        if (class1382 == null) {
            class1382 = class138.field1608;
        }
        return class1382;
    }
}

