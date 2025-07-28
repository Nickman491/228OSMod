/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
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
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bi")
@Implements(value="RasterProvider")
public final class RasterProvider
extends AbstractRasterProvider {
    @ObfuscatedName(value="ay")
    @Export(value="component")
    Component component;
    @ObfuscatedName(value="ah")
    Image field141;

    RasterProvider(int n, int n2, Component component, boolean bl) {
        this.width = n;
        this.height = n2;
        this.pixels = new int[n2 * n + 1];
        if (bl) {
            this.field5553 = new float[n2 * n + 1];
        }
        DataBufferInt dataBufferInt = new DataBufferInt(this.pixels, this.pixels.length);
        DirectColorModel directColorModel = new DirectColorModel(32, 0xFF0000, 65280, 255);
        WritableRaster writableRaster = Raster.createWritableRaster(((ColorModel)directColorModel).createCompatibleSampleModel(this.width, this.height), dataBufferInt, null);
        this.field141 = new BufferedImage(directColorModel, writableRaster, false, new Hashtable());
        this.setComponent(component);
        this.apply();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/awt/Component;I)V", garbageValue="1927727007")
    @Export(value="setComponent")
    final void setComponent(Component component) {
        this.component = component;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="268701696")
    @Export(value="drawFull")
    public final void drawFull(int n, int n2) {
        this.drawFull0(this.component.getGraphics(), n, n2);
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="0")
    @Export(value="draw")
    public final void draw(int n, int n2, int n3, int n4) {
        this.draw0(this.component.getGraphics(), n, n2, n3, n4);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ljava/awt/Graphics;IIB)V", garbageValue="2")
    @Export(value="drawFull0")
    final void drawFull0(Graphics graphics, int n, int n2) {
        try {
            graphics.drawImage(this.field141, n, n2, this.component);
        }
        catch (Exception exception) {
            this.component.repaint();
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Ljava/awt/Graphics;IIIIB)V", garbageValue="-90")
    @Export(value="draw0")
    final void draw0(Graphics graphics, int n, int n2, int n3, int n4) {
        try {
            Shape shape = graphics.getClip();
            graphics.clipRect(n, n2, n3, n4);
            graphics.drawImage(this.field141, 0, 0, this.component);
            graphics.setClip(shape);
        }
        catch (Exception exception) {
            this.component.repaint();
        }
    }
}

