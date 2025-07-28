/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="mj")
public class class337 {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=381161101)
    int field3689;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lcn;")
    class53 field3688;

    @ObfuscatedSignature(descriptor="(ILcn;)V")
    class337(int n, class53 class533) {
        this.field3689 = n;
        this.field3688 = class533;
    }

    @ObfuscatedName(value="nz")
    @ObfuscatedSignature(descriptor="(Lna;IIII)V", garbageValue="1197017701")
    static final void method6885(Widget widget, int n, int n2, int n3) {
        SpriteMask spriteMask = widget.method7446(ClanChannel.field1807, false);
        if (spriteMask == null) {
            return;
        }
        if (Client.minimapState < 3) {
            SpriteMask.field3758.drawRotatedMaskedCenteredAround(n, n2, spriteMask.width, spriteMask.height, 25, 25, Client.camAngleY, 256, spriteMask.xStarts, spriteMask.xWidths);
        } else {
            Rasterizer2D.Rasterizer2D_fillMaskedRectangle(n, n2, 0, spriteMask.xStarts, spriteMask.xWidths);
        }
    }
}

