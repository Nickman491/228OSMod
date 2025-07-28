package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Comparator;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pk")
final class class395
implements Comparator {
    @ObfuscatedName(value="jm")
    static int[] field4630;

    class395() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpj;Lpj;I)I", garbageValue="1628934117")
    int method7874(class399 class3992, class399 class3993) {
        return class3992.method7907().compareTo(class3993.method7907());
    }

    public int compare(Object object, Object object2) {
        return this.method7874((class399)object, (class399)object2);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([BB)Lvf;", garbageValue="-35")
    public static final class570 method7878(byte[] byArray) {
        BufferedImage bufferedImage = null;
        try {
            Class<ImageIO> clazz = ImageIO.class;
            synchronized (ImageIO.class) {
                bufferedImage = ImageIO.read(new ByteArrayInputStream(byArray));
                // ** MonitorExit[var2_2] (shouldn't be in output)
                if (bufferedImage != null) {
                    int n = bufferedImage.getWidth();
                    int n2 = bufferedImage.getHeight();
                    int[] nArray = new int[n2 * n];
                    PixelGrabber pixelGrabber = new PixelGrabber(bufferedImage, 0, 0, n, n2, nArray, 0, n);
                    pixelGrabber.grabPixels();
                    return new class570(nArray, n, n2);
                }
            }
        }
        catch (IOException iOException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        return new class570(0, 0);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Lsl;", garbageValue="1209003518")
    public static class491[] method7881() {
        return new class491[]{class491.field5089, class491.field5087, class491.field5088};
    }
}

