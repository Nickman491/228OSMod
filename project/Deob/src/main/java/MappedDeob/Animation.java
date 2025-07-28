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

@ObfuscatedName(value="gf")
@Implements(value="Animation")
public class Animation {
    @ObfuscatedName(value="ay")
    static int[] field1925 = new int[500];
    @ObfuscatedName(value="ah")
    static int[] field1917 = new int[500];
    @ObfuscatedName(value="az")
    static int[] field1919 = new int[500];
    @ObfuscatedName(value="ao")
    static int[] field1920 = new int[500];
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lhu;")
    @Export(value="skeleton")
    Skeleton skeleton = null;
    @ObfuscatedName(value="an")
    @Export(value="transformCount")
    int transformCount = -1;
    @ObfuscatedName(value="ae")
    @Export(value="transformSkeletonLabels")
    int[] transformSkeletonLabels;
    @ObfuscatedName(value="ax")
    @Export(value="transformXs")
    int[] transformXs;
    @ObfuscatedName(value="at")
    @Export(value="transformYs")
    int[] transformYs;
    @ObfuscatedName(value="ac")
    @Export(value="transformZs")
    int[] transformZs;
    @ObfuscatedName(value="au")
    @Export(value="hasAlphaTransform")
    boolean hasAlphaTransform = false;

    @ObfuscatedSignature(descriptor="([BLhu;)V")
    Animation(byte[] byArray, Skeleton skeleton) {
        this.skeleton = skeleton;
        Buffer buffer = new Buffer(byArray);
        Buffer buffer2 = new Buffer(byArray);
        buffer.offset = 2;
        int n = buffer.readUnsignedByte();
        int n2 = -1;
        int n3 = 0;
        buffer2.offset = n + buffer.offset;
        int n4 = 0;
        while (true) {
            if (n4 >= n) {
                if (byArray.length == buffer2.offset) {
                    this.transformCount = n3;
                    this.transformSkeletonLabels = new int[n3];
                    this.transformXs = new int[n3];
                    this.transformYs = new int[n3];
                    this.transformZs = new int[n3];
                    n4 = 0;
                    while (true) {
                        if (n4 >= n3) {
                            return;
                        }
                        this.transformSkeletonLabels[n4] = field1925[n4];
                        this.transformXs[n4] = field1917[n4];
                        this.transformYs[n4] = field1919[n4];
                        this.transformZs[n4] = field1920[n4];
                        ++n4;
                    }
                }
                throw new RuntimeException();
            }
            int n5 = buffer.readUnsignedByte();
            if (n5 > 0) {
                int n6;
                if (this.skeleton.transformTypes[n4] != 0) {
                    for (n6 = n4 - 1; n6 > n2; --n6) {
                        if (this.skeleton.transformTypes[n6] != 0) {
                            continue;
                        }
                        Animation.field1925[n3] = n6;
                        Animation.field1917[n3] = 0;
                        Animation.field1919[n3] = 0;
                        Animation.field1920[n3] = 0;
                        ++n3;
                        break;
                    }
                }
                Animation.field1925[n3] = n4;
                n6 = 0;
                if (this.skeleton.transformTypes[n4] == 3) {
                    n6 = 128;
                }
                Animation.field1917[n3] = (n5 & 1) != 0 ? buffer2.readShortSmart() : n6;
                Animation.field1919[n3] = (n5 & 2) != 0 ? buffer2.readShortSmart() : n6;
                Animation.field1920[n3] = (n5 & 4) != 0 ? buffer2.readShortSmart() : n6;
                n2 = n4;
                ++n3;
                if (this.skeleton.transformTypes[n4] == 5) {
                    this.hasAlphaTransform = true;
                }
            }
            ++n4;
        }
    }
}

