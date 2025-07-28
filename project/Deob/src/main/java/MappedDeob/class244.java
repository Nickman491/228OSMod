/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ju")
public class class244
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static EvictingDualNodeHashTable field2601 = new EvictingDualNodeHashTable(64);

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="1308022467")
    public static int method5288(int n) {
        return n >>> 12;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-48")
    static void method5287() {
        Script.Script_cached.clear();
    }

    @ObfuscatedName(value="ls")
    @ObfuscatedSignature(descriptor="([Lna;Lna;ZI)V", garbageValue="-1058652978")
    @Export(value="revalidateWidgetScroll")
    static void revalidateWidgetScroll(Widget[] widgetArray, Widget widget, boolean bl) {
        int n;
        InterfaceParent interfaceParent;
        int n2 = widget.scrollWidth != 0 ? widget.scrollWidth : widget.width;
        int n3 = widget.scrollHeight != 0 ? widget.scrollHeight : widget.height * -1528330031;
        ArchiveLoader.resizeInterface(widgetArray, widget.id, n2, n3, bl);
        if (widget.children != null) {
            ArchiveLoader.resizeInterface(widget.children, widget.id, n2, n3, bl);
        }
        if ((interfaceParent = (InterfaceParent)Client.interfaceParents.get(widget.id)) != null && ClanChannel.field1807.method7024(n = interfaceParent.group)) {
            ArchiveLoader.resizeInterface(ClanChannel.field1807.field3772[n], -1, n2, n3, bl);
        }
        if (widget.contentType != 1337) {
            // empty if block
        }
    }
}

