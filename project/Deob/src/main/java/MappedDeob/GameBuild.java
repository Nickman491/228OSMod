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

@ObfuscatedName(value="oe")
@Implements(value="GameBuild")
public class GameBuild {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Loe;")
    @Export(value="LIVE")
    static final GameBuild LIVE = new GameBuild("LIVE", 0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Loe;")
    @Export(value="BUILDLIVE")
    static final GameBuild BUILDLIVE = new GameBuild("BUILDLIVE", 3);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Loe;")
    @Export(value="RC")
    static final GameBuild RC = new GameBuild("RC", 1);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Loe;")
    @Export(value="WIP")
    static final GameBuild WIP = new GameBuild("WIP", 2);
    @ObfuscatedName(value="ad")
    @Export(value="name")
    public final String name;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=185232069)
    @Export(value="buildId")
    final int buildId;

    GameBuild(String string, int n) {
        this.name = string;
        this.buildId = n;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="-1767959900")
    @Export(value="ItemContainer_getCount")
    static int ItemContainer_getCount(int n, int n2) {
        ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.get(n);
        if (itemContainer == null) {
            return 0;
        }
        if (n2 >= 0 && n2 < itemContainer.quantities.length) {
            return itemContainer.quantities[n2];
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="mz")
    @ObfuscatedSignature(descriptor="([Lna;II)V", garbageValue="-1975296094")
    @Export(value="drawModelComponents")
    static final void drawModelComponents(Widget[] widgetArray, int n) {
        int n2 = 0;
        while (true) {
            block17: {
                Widget widget;
                block18: {
                    InterfaceParent interfaceParent;
                    if (n2 >= widgetArray.length) {
                        return;
                    }
                    widget = widgetArray[n2];
                    if (widget == null || widget.parentId != n || widget.isIf3 && class163.isComponentHidden(widget)) break block17;
                    if (widget.type != 0) break block18;
                    if (!widget.isIf3 && class163.isComponentHidden(widget) && widget != class424.mousedOverWidgetIf1) break block17;
                    GameBuild.drawModelComponents(widgetArray, widget.id);
                    if (widget.children != null) {
                        GameBuild.drawModelComponents(widget.children, widget.id);
                    }
                    if ((interfaceParent = (InterfaceParent)Client.interfaceParents.get(widget.id)) != null) {
                        class9.method83(interfaceParent.group);
                    }
                }
                if (widget.type == 6) {
                    int n3;
                    int n4;
                    if ((widget.sequenceId != -1 || widget.sequenceId2 != -1) && (n4 = (n3 = class268.runCs1(widget)) != 0 ? widget.sequenceId2 : widget.sequenceId) != -1) {
                        SequenceDefinition sequenceDefinition = class33.SequenceDefinition_get(n4);
                        if (sequenceDefinition.isCachedModelIdSet()) {
                            widget.modelFrame += Client.field581;
                            int n5 = sequenceDefinition.method5703();
                            if (widget.modelFrame >= n5) {
                                widget.modelFrame -= sequenceDefinition.frameCount;
                                if (widget.modelFrame < 0 || widget.modelFrame >= n5) {
                                    widget.modelFrame = 0;
                                }
                            }
                            UserComparator8.invalidateWidget(widget);
                        } else {
                            widget.modelFrameCycle += Client.field581;
                            while (widget.modelFrameCycle > sequenceDefinition.frameLengths[widget.modelFrame]) {
                                widget.modelFrameCycle -= sequenceDefinition.frameLengths[widget.modelFrame];
                                ++widget.modelFrame;
                                if (widget.modelFrame >= sequenceDefinition.frameIds.length) {
                                    widget.modelFrame -= sequenceDefinition.frameCount;
                                    if (widget.modelFrame < 0 || widget.modelFrame >= sequenceDefinition.frameIds.length) {
                                        widget.modelFrame = 0;
                                    }
                                }
                                UserComparator8.invalidateWidget(widget);
                            }
                        }
                    }
                    if (widget.field3928 != 0 && !widget.isIf3) {
                        n3 = widget.field3928 >> 16;
                        n4 = widget.field3928 << 16 >> 16;
                        widget.modelAngleX = (n3 *= Client.field581) + widget.modelAngleX & 0x7FF;
                        widget.modelAngleY = (n4 *= Client.field581) + widget.modelAngleY & 0x7FF;
                        UserComparator8.invalidateWidget(widget);
                    }
                }
            }
            ++n2;
        }
    }
}

