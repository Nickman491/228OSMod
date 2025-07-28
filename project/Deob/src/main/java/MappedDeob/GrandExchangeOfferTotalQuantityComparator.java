/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pt")
@Implements(value="GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator
implements Comparator {
    GrandExchangeOfferTotalQuantityComparator() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpj;Lpj;I)I", garbageValue="1877472683")
    @Export(value="compare_bridged")
    int compare_bridged(GrandExchangeEvent grandExchangeEvent, GrandExchangeEvent grandExchangeEvent2) {
        return grandExchangeEvent.grandExchangeOffer.totalQuantity < grandExchangeEvent2.grandExchangeOffer.totalQuantity ? -1 : (grandExchangeEvent2.grandExchangeOffer.totalQuantity == grandExchangeEvent.grandExchangeOffer.totalQuantity ? 0 : 1);
    }

    public int compare(Object object, Object object2) {
        return this.compare_bridged((GrandExchangeEvent)object, (GrandExchangeEvent)object2);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="([BIII)Ljava/lang/String;", garbageValue="512362012")
    @Export(value="decodeStringCp1252")
    public static String decodeStringCp1252(byte[] byArray, int n, int n2) {
        char[] cArray = new char[n2];
        int n3 = 0;
        int n4 = 0;
        while (n4 < n2) {
            int n5 = byArray[n4 + n] & 0xFF;
            if (n5 != 0) {
                if (n5 >= 128 && n5 < 160) {
                    int n6 = class417.cp1252AsciiExtension[n5 - 128];
                    if (n6 == 0) {
                        n6 = 63;
                    }
                    n5 = n6;
                }
                cArray[n3++] = (char)n5;
            }
            ++n4;
        }
        return new String(cArray, 0, n3);
    }

    @ObfuscatedName(value="mf")
    @ObfuscatedSignature(descriptor="(Lna;IIZI)V", garbageValue="452329856")
    @Export(value="alignWidgetSize")
    static void alignWidgetSize(Widget widget, int n, int n2, boolean bl) {
        int n3 = widget.width;
        int n4 = widget.height * -1528330031;
        if (widget.widthAlignment == 0) {
            widget.width = widget.rawWidth;
        } else if (widget.widthAlignment == 1) {
            widget.width = n - widget.rawWidth;
        } else if (widget.widthAlignment == 2) {
            widget.width = widget.rawWidth * n >> 14;
        }
        if (widget.heightAlignment == 0) {
            widget.height = widget.rawHeight * 2037764145;
        } else if (widget.heightAlignment == 1) {
            widget.height = (n2 - widget.rawHeight) * 2037764145;
        } else if (widget.heightAlignment == 2) {
            widget.height = (n2 * widget.rawHeight >> 14) * 2037764145;
        }
        if (widget.widthAlignment == 4) {
            widget.width = widget.height * widget.field3888 * -1528330031 / widget.field4008;
        }
        if (widget.heightAlignment == 4) {
            widget.height = widget.width * widget.field4008 / widget.field3888 * 2037764145;
        }
        if (widget.contentType == 1337) {
            Client.viewportWidget = widget;
        }
        if (widget.type == 12) {
            widget.method7444().method7134(widget.width, widget.height * -1528330031);
        }
        if (bl && widget.onResize != null && (n3 != widget.width || n4 != widget.height * -1528330031)) {
            ScriptEvent scriptEvent = new ScriptEvent();
            scriptEvent.widget = widget;
            scriptEvent.args = widget.onResize;
            Client.scriptEvents.addFirst(scriptEvent);
        }
    }
}

