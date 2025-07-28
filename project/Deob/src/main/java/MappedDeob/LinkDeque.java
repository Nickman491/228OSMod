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

@ObfuscatedName(value="pi")
@Implements(value="LinkDeque")
public class LinkDeque {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ltg;")
    @Export(value="sentinel")
    Link sentinel;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ltg;")
    @Export(value="current")
    Link current;

    public LinkDeque() {
        this.sentinel.previous = this.sentinel = new Link();
        this.sentinel.next = this.sentinel;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ltg;)V")
    @Export(value="addFirst")
    public void addFirst(Link link) {
        if (link.next != null) {
            link.remove();
        }
        link.next = this.sentinel.next;
        link.previous = this.sentinel;
        link.next.previous = link;
        link.previous.next = link;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="()Ltg;")
    @Export(value="last")
    public Link last() {
        Link link = this.sentinel.previous;
        if (link != this.sentinel) {
            this.current = link.previous;
            return link;
        }
        this.current = null;
        return null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="()Ltg;")
    @Export(value="previous")
    public Link previous() {
        Link link = this.current;
        if (link != this.sentinel) {
            this.current = link.previous;
            return link;
        }
        this.current = null;
        return null;
    }
}

