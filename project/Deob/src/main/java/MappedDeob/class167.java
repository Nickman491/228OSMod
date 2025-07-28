/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gv")
public class class167 {
    @ObfuscatedName(value="fm")
    @ObfuscatedSignature(descriptor="Lok;")
    @Export(value="archive12")
    static Archive archive12;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(longValue=5893049423313328319L)
    long field1787;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(longValue=1230870611193710827L)
    public long field1791 = -1L;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lps;")
    IterableNodeDeque field1786 = new IterableNodeDeque();

    @ObfuscatedSignature(descriptor="(Lvy;)V")
    public class167(Buffer buffer) {
        this.method3812(buffer);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="1996451817")
    void method3812(Buffer buffer) {
        this.field1787 = buffer.readLong();
        this.field1791 = buffer.readLong();
        int n = buffer.readUnsignedByte();
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
            ((class166)class1662).vmethod3869(buffer);
            this.field1786.addFirst(class1662);
            n = buffer.readUnsignedByte();
        }
        throw new RuntimeException("");
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lgk;B)V", garbageValue="-15")
    public void method3817(ClanChannel clanChannel) {
        if (this.field1787 == clanChannel.key && clanChannel.field1810 == this.field1791) {
            class166 class1662 = (class166)this.field1786.last();
            while (true) {
                if (class1662 == null) {
                    ++clanChannel.field1810;
                    return;
                }
                class1662.vmethod3870(clanChannel);
                class1662 = (class166)this.field1786.previous();
            }
        }
        throw new RuntimeException("");
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;B)V", garbageValue="53")
    public static void method3811(AbstractArchive abstractArchive) {
        EnumComposition.EnumDefinition_archive = abstractArchive;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(CI)Z", garbageValue="-87648385")
    @Export(value="isCharAlphabetic")
    public static boolean isCharAlphabetic(char c) {
        return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }
}

