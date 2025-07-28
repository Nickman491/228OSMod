package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="qz")
public class class433
implements Iterator {
    @ObfuscatedName(value="ps")
    @ObfuscatedGetter(intValue=886392145)
    static int field4786;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lqn;")
    class434 field4791;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=685335463)
    int field4790 = 0;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=316027243)
    int field4788;

    @ObfuscatedSignature(descriptor="(Lqn;)V")
    class433(class434 class4342) {
        this.field4788 = this.field4791.field4796;
        this.field4791 = class4342;
    }

    @Override
    public boolean hasNext() {
        return this.field4790 < this.field4791.field4792;
    }

    public Object next() {
        if (this.field4791.field4796 != this.field4788) {
            throw new ConcurrentModificationException();
        }
        if (this.field4790 >= this.field4791.field4792) {
            throw new NoSuchElementException();
        }
        Object object = this.field4791.field4793[this.field4790].field4785;
        ++this.field4790;
        return object;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

