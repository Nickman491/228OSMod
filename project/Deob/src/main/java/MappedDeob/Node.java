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

@ObfuscatedName(value="tf")
@Implements(value="Node")
public class Node {
    @ObfuscatedName(value="hs")
    @Export(value="key")
    public long key;
    @ObfuscatedName(value="hb")
    @ObfuscatedSignature(descriptor="Ltf;")
    @Export(value="previous")
    public Node previous;
    @ObfuscatedName(value="he")
    @ObfuscatedSignature(descriptor="Ltf;")
    @Export(value="next")
    public Node next;

    @ObfuscatedName(value="ku")
    @Export(value="remove")
    public void remove() {
        if (this.next == null) {
            return;
        }
        this.next.previous = this.previous;
        this.previous.next = this.next;
        this.previous = null;
        this.next = null;
    }

    @ObfuscatedName(value="kn")
    @Export(value="hasNext")
    public boolean hasNext() {
        return this.next != null;
    }
}

