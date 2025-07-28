/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dj")
public class class82
extends Renderable {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Ldz;")
    final class103 field1017;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1150913177)
    final int field1010;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=977106559)
    final int field1012;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-839326733)
    final int field1013;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-551069187)
    final int field1014;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1717963547)
    final int field1011;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1479527589)
    final int field1016;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lkb;")
    SequenceDefinition field1015;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=0x449F499F)
    int field1018;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-1354187807)
    int field1019;

    @ObfuscatedSignature(descriptor="(Ldz;IIIIIIIZLhs;)V")
    class82(class103 class1032, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, Renderable renderable) {
        this.field1017 = class1032;
        this.field1010 = n;
        this.field1012 = n2;
        this.field1013 = n3;
        this.field1014 = n4;
        this.field1011 = n5;
        this.field1016 = n6;
        if (n7 != -1) {
            this.field1015 = class33.SequenceDefinition_get(n7);
            this.field1018 = 0;
            this.field1019 = Client.cycle - 1;
            if (this.field1015.field2943 == 0 && renderable instanceof class82) {
                class82 class822 = (class82)renderable;
                if (this.field1015 == class822.field1015) {
                    this.field1018 = class822.field1018;
                    this.field1019 = class822.field1019;
                    return;
                }
            }
            if (bl && this.field1015.frameCount != -1) {
                if (this.field1015.isCachedModelIdSet()) {
                    this.field1018 = (int)(Math.random() * (double)this.field1015.method5703());
                } else {
                    this.field1018 = (int)(Math.random() * (double)this.field1015.frameIds.length);
                    this.field1019 -= (int)(Math.random() * (double)this.field1015.frameLengths[this.field1018]);
                }
            }
        }
    }

    @Override
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(B)Lhv;", garbageValue="-7")
    @Export(value="getModel")
    protected final Model getModel() {
        int n;
        int n2;
        int n3;
        int[][] nArray;
        ObjectComposition objectComposition;
        block12: {
            int n4;
            block14: {
                block13: {
                    int n5;
                    int n6;
                    objectComposition = class142.getObjectDefinition(this.field1010);
                    if (objectComposition.transforms != null) {
                        objectComposition = objectComposition.transform();
                    }
                    if (objectComposition == null) {
                        return null;
                    }
                    if (this.field1013 != 1 && this.field1013 != 3) {
                        n6 = objectComposition.sizeX;
                        n5 = objectComposition.sizeY;
                    } else {
                        n6 = objectComposition.sizeY;
                        n5 = objectComposition.sizeX;
                    }
                    int n7 = (n6 >> 1) + this.field1011;
                    int n8 = (n6 + 1 >> 1) + this.field1011;
                    int n9 = (n5 >> 1) + this.field1016;
                    int n10 = (n5 + 1 >> 1) + this.field1016;
                    nArray = this.field1017.field1328[this.field1014];
                    n3 = nArray[n8][n10] + nArray[n7][n9] + nArray[n8][n9] + nArray[n7][n10] >> 2;
                    n2 = (this.field1011 << 7) + (n6 << 6);
                    n = (this.field1016 << 7) + (n5 << 6);
                    if (this.field1015 == null) break block12;
                    n4 = Client.cycle - this.field1019;
                    if (this.field1015.frameCount > 0 && this.field1015.field2931 > 0) {
                        n4 %= this.field1015.field2931;
                    }
                    if (!this.field1015.isCachedModelIdSet()) break block13;
                    int n11 = this.field1015.method5703();
                    this.field1018 += n4;
                    n4 = 0;
                    if (this.field1018 >= n11) {
                        this.field1018 = n11 - this.field1015.frameCount;
                        if (this.field1018 < 0 || this.field1018 > n11) {
                            this.field1015 = null;
                        }
                    }
                    if (this.field1015 == null) break block14;
                    class271.method5839(this.field1015, this.field1018, n2, n, false);
                    break block14;
                }
                while (n4 > this.field1015.frameLengths[this.field1018]) {
                    block16: {
                        block15: {
                            n4 -= this.field1015.frameLengths[this.field1018];
                            ++this.field1018;
                            if (this.field1018 < this.field1015.frameIds.length) break block15;
                            this.field1018 -= this.field1015.frameCount;
                            if (this.field1018 < 0 || this.field1018 >= this.field1015.frameIds.length) break block16;
                        }
                        class271.method5839(this.field1015, this.field1018, n2, n, false);
                        continue;
                    }
                    this.field1015 = null;
                    break;
                }
            }
            this.field1019 = Client.cycle - n4;
        }
        return objectComposition.getModelDynamic(this.field1012, this.field1013, nArray, n2, n3, n, this.field1015, this.field1018);
    }

    @ObfuscatedName(value="ho")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="1465461977")
    static void method2494(int n, int n2) {
        if (class544.clientPreferences.method2896() != 0 && n != -1) {
            ArrayList<class345> arrayList = new ArrayList<class345>();
            arrayList.add(new class345((AbstractArchive)WorldMapSection2.field3102, n, 0, class544.clientPreferences.method2896(), false));
            class1.method9(arrayList, 0, 0, 0, 0, true);
            Client.playingJingle = true;
        }
    }

    @ObfuscatedName(value="ik")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="256")
    static final void method2491() {
        Iterator iterator = Client.field508.iterator();
        block0: while (iterator.hasNext()) {
            class103 class1032 = (class103)iterator.next();
            int n = 0;
            while (true) {
                if (n >= class1032.field1331) continue block0;
                int n2 = class1032.field1332[n];
                class105 class1052 = class1032.field1330[n2];
                if (class1052 != null) {
                    class275.method5935(class1032, class1052, class1052.field1354.size);
                }
                ++n;
            }
            break;
        }
        return;
    }
}

