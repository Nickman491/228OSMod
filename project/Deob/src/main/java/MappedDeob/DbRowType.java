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

@ObfuscatedName(value="ve")
@Implements(value="DbRowType")
public class DbRowType
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    static AbstractArchive field5417;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static EvictingDualNodeHashTable field5416;
    @ObfuscatedName(value="az")
    @Export(value="columnTypes")
    Object[][] columnTypes;
    @ObfuscatedName(value="ao")
    int[][] field5415;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=180951745)
    @Export(value="tableId")
    public int tableId = -1;

    static {
        field5416 = new EvictingDualNodeHashTable(64);
    }

    DbRowType() {
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;B)V", garbageValue="56")
    void method10170(Buffer buffer) {
        int n;
        while ((n = buffer.readUnsignedByte()) != 0) {
            this.method10185(buffer, n);
        }
        return;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(II)[Ljava/lang/Object;", garbageValue="1657346556")
    @Export(value="getColumnType")
    public Object[] getColumnType(int n) {
        if (this.columnTypes == null) {
            return null;
        }
        return this.columnTypes[n];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="-2139902597")
    void method10185(Buffer buffer, int n) {
        if (n != 3) {
            if (n != 4) return;
            this.tableId = buffer.method10301();
            return;
        }
        int n2 = buffer.readUnsignedByte();
        if (this.columnTypes == null) {
            this.columnTypes = new Object[n2][];
            this.field5415 = new int[n2][];
        }
        int n3 = buffer.readUnsignedByte();
        block0: while (n3 != 255) {
            int n4 = buffer.readUnsignedByte();
            int[] nArray = new int[n4];
            int n5 = 0;
            while (true) {
                if (n5 >= n4) {
                    Object[][] objectArray = this.columnTypes;
                    int n6 = n3;
                    int n7 = buffer.readUShortSmart();
                    Object[] objectArray2 = new Object[nArray.length * n7];
                    int n8 = 0;
                    while (true) {
                        if (n8 >= n7) {
                            Object[] objectArray3 = objectArray2;
                            objectArray[n6] = objectArray3;
                            this.field5415[n3] = nArray;
                            n3 = buffer.readUnsignedByte();
                            continue block0;
                        }
                        for (int i = 0; i < nArray.length; ++i) {
                            int n9 = i + nArray.length * n8;
                            class544 class5442 = EnumComposition.method5280(nArray[i]);
                            objectArray2[n9] = class5442.method10123(buffer);
                        }
                        ++n8;
                    }
                }
                nArray[n5] = buffer.readUShortSmart();
                ++n5;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-91")
    void method10172() {
    }
}

