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

@ObfuscatedName(value="tg")
@Implements(value="Link")
public class Link {
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Ltg;")
    @Export(value="previous")
    public Link previous;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Ltg;")
    @Export(value="next")
    public Link next;

    @ObfuscatedName(value="ay")
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
}

