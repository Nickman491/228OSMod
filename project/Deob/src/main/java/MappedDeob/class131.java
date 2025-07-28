/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fn")
public class class131 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=59770549)
    int field1528;
    @ObfuscatedName(value="ah")
    float field1527;
    @ObfuscatedName(value="az")
    float field1531 = Float.MAX_VALUE;
    @ObfuscatedName(value="ao")
    float field1529 = Float.MAX_VALUE;
    @ObfuscatedName(value="ad")
    float field1530 = Float.MAX_VALUE;
    @ObfuscatedName(value="an")
    float field1526 = Float.MAX_VALUE;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lfn;")
    class131 field1532;

    class131() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="740982673")
    void method3375(Buffer buffer, int n) {
        this.field1528 = buffer.readShort();
        this.field1527 = buffer.method10302();
        this.field1531 = buffer.method10302();
        this.field1529 = buffer.method10302();
        this.field1530 = buffer.method10302();
        this.field1526 = buffer.method10302();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/awt/Component;I)V", garbageValue="2033705331")
    static void method3379(Component component) {
        component.addMouseListener(MouseHandler.MouseHandler_instance);
        component.addMouseMotionListener(MouseHandler.MouseHandler_instance);
        component.addFocusListener(MouseHandler.MouseHandler_instance);
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIIII)V", garbageValue="-1032226607")
    @Export(value="itemContainerSetItem")
    static void itemContainerSetItem(int n, int n2, int n3, int n4) {
        ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.get(n);
        if (itemContainer == null) {
            itemContainer = new ItemContainer();
            ItemContainer.itemContainers.put(itemContainer, n);
        }
        if (itemContainer.ids.length <= n2) {
            int n5;
            int[] nArray = new int[n2 + 1];
            int[] nArray2 = new int[n2 + 1];
            for (n5 = 0; n5 < itemContainer.ids.length; ++n5) {
                nArray[n5] = itemContainer.ids[n5];
                nArray2[n5] = itemContainer.quantities[n5];
            }
            for (n5 = itemContainer.ids.length; n5 < n2; ++n5) {
                nArray[n5] = -1;
                nArray2[n5] = 0;
            }
            itemContainer.ids = nArray;
            itemContainer.quantities = nArray2;
        }
        itemContainer.ids[n2] = n3;
        itemContainer.quantities[n2] = n4;
    }
}

