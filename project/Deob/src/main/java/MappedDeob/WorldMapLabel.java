/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="li")
@Implements(value="WorldMapLabel")
public class WorldMapLabel {
    @ObfuscatedName(value="ay")
    @Export(value="text")
    String text;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-289017001)
    @Export(value="width")
    int width;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-640122131)
    @Export(value="height")
    int height;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lkz;")
    @Export(value="size")
    WorldMapLabelSize size;

    @ObfuscatedSignature(descriptor="(Ljava/lang/String;IILkz;)V")
    WorldMapLabel(String string, int n, int n2, WorldMapLabelSize worldMapLabelSize) {
        this.text = string;
        this.width = n;
        this.height = n2;
        this.size = worldMapLabelSize;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;Lpq;S)Z", garbageValue="17063")
    public static boolean method6398(AbstractArchive abstractArchive, AbstractArchive abstractArchive2) {
        WorldMapElement.WorldMapElement_archive = abstractArchive2;
        if (abstractArchive.isFullyLoaded()) {
            WorldMapElement.WorldMapElement_count = abstractArchive.getGroupFileCount(35);
            WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];
            int n = 0;
            while (true) {
                if (n >= WorldMapElement.WorldMapElement_count) {
                    return true;
                }
                byte[] byArray = abstractArchive.takeFile(35, n);
                WorldMapElement.WorldMapElement_cached[n] = new WorldMapElement(n);
                if (byArray != null) {
                    WorldMapElement.WorldMapElement_cached[n].decode(new Buffer(byArray));
                    WorldMapElement.WorldMapElement_cached[n].method5166();
                }
                ++n;
            }
        }
        return false;
    }

    @ObfuscatedName(value="mq")
    @ObfuscatedSignature(descriptor="(Lna;IIB)V", garbageValue="-18")
    @Export(value="clickWidget")
    static final void clickWidget(Widget widget, int n, int n2) {
        if (Client.clickedWidget == null && !Client.isMenuOpen) {
            if (widget != null && ItemContainer.method2607(widget) != null) {
                Client.clickedWidget = widget;
                Client.clickedWidgetParent = ItemContainer.method2607(widget);
                Client.widgetClickX = n;
                Client.widgetClickY = n2;
                class243.widgetDragDuration = 0;
                Client.isDraggingWidget = false;
                int n3 = Client.field648.field5612 - 1;
                int n4 = n3;
                if (n4 != -1) {
                    class53.method1124(n4);
                }
                return;
            }
            return;
        }
    }
}

