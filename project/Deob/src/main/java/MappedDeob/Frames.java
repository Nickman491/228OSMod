/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="hb")
@Implements(value="Frames")
public class Frames
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="[Lgf;")
    @Export(value="frames")
    Animation[] frames;

    @ObfuscatedSignature(descriptor="(Lpq;Lpq;IZ)V", garbageValue="0")
    public Frames(AbstractArchive abstractArchive, AbstractArchive abstractArchive2, int n, boolean bl) {
        NodeDeque nodeDeque = new NodeDeque();
        int n2 = abstractArchive.getGroupFileCount(n);
        this.frames = new Animation[n2];
        int[] nArray = abstractArchive.getGroupFileIds(n);
        int n3 = 0;
        while (n3 < nArray.length) {
            byte[] byArray = abstractArchive.takeFile(n, nArray[n3]);
            Skeleton skeleton = null;
            int n4 = (byArray[0] & 0xFF) << 8 | byArray[1] & 0xFF;
            Skeleton skeleton2 = (Skeleton)nodeDeque.last();
            while (skeleton2 != null) {
                if (n4 != skeleton2.id) {
                    skeleton2 = (Skeleton)nodeDeque.previous();
                    continue;
                }
                skeleton = skeleton2;
                break;
            }
            if (skeleton == null) {
                byte[] byArray2 = abstractArchive2.getFile(n4, 0);
                skeleton = new Skeleton(n4, byArray2);
                nodeDeque.addFirst(skeleton);
            }
            this.frames[nArray[n3]] = new Animation(byArray, skeleton);
            ++n3;
        }
        return;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="-36")
    @Export(value="hasAlphaTransform")
    public boolean hasAlphaTransform(int n) {
        return this.frames[n].hasAlphaTransform;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(FFFB)F", garbageValue="118")
    public static float method4470(float f, float f2, float f3) {
        if (f2 < f) {
            throw new IllegalArgumentException("max: " + f2 + " can not be lower than min: " + f);
        }
        return Math.max(f, Math.min(f3, f2));
    }

    @ObfuscatedName(value="jw")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="-1182838659")
    static int method4471(int n, int n2) {
        int n3 = n2 - 334;
        if (n3 < 0) {
            n3 = 0;
        } else if (n3 > 100) {
            n3 = 100;
        }
        int n4 = (Client.zoomWidth - Client.zoomHeight) * n3 / 100 + Client.zoomHeight;
        return n * n4 / 256;
    }
}

