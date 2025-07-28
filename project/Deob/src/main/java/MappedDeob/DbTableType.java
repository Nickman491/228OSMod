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

@ObfuscatedName(value="vh")
@Implements(value="DbTableType")
public class DbTableType
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpq;")
    public static AbstractArchive field5408;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmi;")
    public static EvictingDualNodeHashTable field5409;
    @ObfuscatedName(value="az")
    @Export(value="types")
    public int[][] types;
    @ObfuscatedName(value="ao")
    @Export(value="defaultValues")
    public Object[][] defaultValues;

    static {
        field5409 = new EvictingDualNodeHashTable(64);
    }

    DbTableType() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="215413861")
    void method10151(Buffer buffer) {
        int n;
        while ((n = buffer.readUnsignedByte()) != 0) {
            this.method10152(buffer, n);
        }
        return;
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;IB)V", garbageValue="14")
    void method10152(Buffer var1_1, int var2_2) {
        if (var2_2 != 1) ** GOTO lbl8
        var3_3 = var1_1.readUnsignedByte();
        if (this.types == null) {
            this.types = new int[var3_3][];
        }
        var4_4 = var1_1.readUnsignedByte();
        block0: while (true) {
            block12: {
                if (var4_4 != 255) break block12;
lbl8:
                // 2 sources

                return;
            }
            var5_5 = var4_4 & 127;
            var6_6 = (var4_4 & 128) != 0;
            var7_7 = new int[var1_1.readUnsignedByte()];
            var8_8 = 0;
            while (true) {
                block13: {
                    if (var8_8 < var7_7.length) break block13;
                    this.types[var5_5] = var7_7;
                    if (!var6_6) ** GOTO lbl29
                    if (this.defaultValues == null) {
                        this.defaultValues = new Object[this.types.length][];
                    }
                    var17_17 = this.defaultValues;
                    var9_9 = var5_5;
                    var11_11 = var1_1.readUShortSmart();
                    var12_12 = new Object[var7_7.length * var11_11];
                    var13_13 = 0;
                    while (true) {
                        block14: {
                            if (var13_13 < var11_11) break block14;
                            var10_10 = var12_12;
                            var17_17[var9_9] = var10_10;
lbl29:
                            // 2 sources

                            var4_4 = var1_1.readUnsignedByte();
                            continue block0;
                        }
                        for (var14_14 = 0; var14_14 < var7_7.length; ++var14_14) {
                            var15_15 = var14_14 + var7_7.length * var13_13;
                            var16_16 = EnumComposition.method5280(var7_7[var14_14]);
                            var12_12[var15_15] = var16_16.method10123(var1_1);
                        }
                        ++var13_13;
                    }
                }
                var7_7[var8_8] = var1_1.readUShortSmart();
                ++var8_8;
            }
            break;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="124")
    void method10159() {
    }
}

