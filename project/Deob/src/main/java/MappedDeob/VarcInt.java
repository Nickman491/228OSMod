/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jh")
@Implements(value="VarcInt")
public class VarcInt
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="VarcInt_archive")
    public static AbstractArchive VarcInt_archive;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="VarcInt_cached")
    public static EvictingDualNodeHashTable VarcInt_cached;
    @ObfuscatedName(value="az")
    @Export(value="persist")
    public boolean persist = false;

    static {
        VarcInt_cached = new EvictingDualNodeHashTable(64);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1478983834")
    public void method5201(Buffer buffer) {
        int n;
        while ((n = buffer.readUnsignedByte()) != 0) {
            this.method5199(buffer, n);
        }
        return;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="995631844")
    void method5199(Buffer buffer, int n) {
        if (n == 2) {
            this.persist = true;
        }
    }
}

