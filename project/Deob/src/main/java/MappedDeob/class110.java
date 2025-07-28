/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ek")
final class class110
implements class351 {
    @ObfuscatedSignature(descriptor="Lna;")
    final /* synthetic */ Widget val$item;

    @ObfuscatedSignature(descriptor="(Lna;)V")
    class110(Widget widget) {
        this.val$item = widget;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1894647927")
    public void vmethod7020() {
        if (this.val$item.method7447().field3804 != null) {
            ScriptEvent scriptEvent = new ScriptEvent();
            scriptEvent.method2628(this.val$item);
            scriptEvent.setArgs(this.val$item.method7447().field3804);
            WorldMapElement.method5196().addFirst(scriptEvent);
        }
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="-8")
    static final void method3122(int n, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8;
        if (ViewportMouse.ViewportMouse_false0) {
            return;
        }
        int n9 = n;
        int n10 = n2;
        int n11 = n3;
        int n12 = n4;
        int n13 = 50;
        int n14 = class185.method4138();
        int n15 = (ViewportMouse.ViewportMouse_x - SceneTileModel.method4008()) * n13 / SceneTileModel.method4061();
        int n16 = (ViewportMouse.ViewportMouse_y - SceneTileModel.method4048()) * n13 / SceneTileModel.method4061();
        int n17 = (ViewportMouse.ViewportMouse_x - SceneTileModel.method4008()) * n14 / SceneTileModel.method4061();
        int n18 = (ViewportMouse.ViewportMouse_y - SceneTileModel.method4048()) * n14 / SceneTileModel.method4061();
        int n19 = FriendSystem.method2089(n16, n13, n10, n9);
        n13 = class93.method2647(n16, n13, n10, n9);
        n16 = n19;
        n19 = FriendSystem.method2089(n18, n14, n10, n9);
        n14 = class93.method2647(n18, n14, n10, n9);
        n18 = n19;
        n19 = n8 = n12 * n15 - n11 * n13 >> 16;
        n13 = n7 = n13 * n12 + n15 * n11 >> 16;
        n15 = n19;
        n19 = n6 = n17 * n12 - n11 * n14 >> 16;
        n14 = n5 = n14 * n12 + n17 * n11 >> 16;
        n17 = n19;
        ViewportMouse.field2267 = (n17 + n15) / 2;
        Huffman.field4034 = (n18 + n16) / 2;
        class169.field1804 = (n13 + n14) / 2;
        ViewportMouse.field2262 = (n17 - n15) / 2;
        class496.field5128 = (n18 - n16) / 2;
        CollisionMap.field2995 = (n14 - n13) / 2;
        WorldMapSprite.field3231 = Math.abs(ViewportMouse.field2262);
        class464.field4955 = Math.abs(class496.field5128);
        UserComparator10.field1516 = Math.abs(CollisionMap.field2995);
        ViewportMouse.field2268.method8285(n17 - n15, n18 - n16, n14 - n13);
        ViewportMouse.field2268.method8289();
        ViewportMouse.ViewportMouse_false0 = true;
    }
}

