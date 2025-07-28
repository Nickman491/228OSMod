package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bi")
public final class class32
extends class567 {
    @ObfuscatedName(value="ay")
    Component field142;
    @ObfuscatedName(value="ah")
    Image field141;

    class32(int n, int n2, Component component, boolean bl) {
        this.field5551 = n;
        this.field5550 = n2;
        this.field5552 = new int[n2 * n + 1];
        if (bl) {
            this.field5553 = new float[n2 * n + 1];
        }
        DataBufferInt dataBufferInt = new DataBufferInt(this.field5552, this.field5552.length);
        DirectColorModel directColorModel = new DirectColorModel(32, 0xFF0000, 65280, 255);
        WritableRaster writableRaster = Raster.createWritableRaster(((ColorModel)directColorModel).createCompatibleSampleModel(this.field5551, this.field5550), dataBufferInt, null);
        this.field141 = new BufferedImage(directColorModel, writableRaster, false, new Hashtable());
        this.method499(component);
        this.method10693();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/awt/Component;I)V", garbageValue="1927727007")
    final void method499(Component component) {
        this.field142 = component;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="268701696")
    public final void vmethod10689(int n, int n2) {
        this.method502(this.field142.getGraphics(), n, n2);
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="0")
    public final void vmethod10698(int n, int n2, int n3, int n4) {
        this.method503(this.field142.getGraphics(), n, n2, n3, n4);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ljava/awt/Graphics;IIB)V", garbageValue="2")
    final void method502(Graphics graphics, int n, int n2) {
        try {
            graphics.drawImage(this.field141, n, n2, this.field142);
        }
        catch (Exception exception) {
            this.field142.repaint();
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Ljava/awt/Graphics;IIIIB)V", garbageValue="-90")
    final void method503(Graphics graphics, int n, int n2, int n3, int n4) {
        try {
            Shape shape = graphics.getClip();
            graphics.clipRect(n, n2, n3, n4);
            graphics.drawImage(this.field141, 0, 0, this.field142);
            graphics.setClip(shape);
        }
        catch (Exception exception) {
            this.field142.repaint();
        }
    }
}

