/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pl")
@Implements(value="GrandExchangeEvents")
public class GrandExchangeEvents {
    @ObfuscatedName(value="ah")
    @Export(value="GrandExchangeEvents_ageComparator")
    public static Comparator GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator();
    @ObfuscatedName(value="az")
    @Export(value="GrandExchangeEvents_priceComparator")
    public static Comparator GrandExchangeEvents_priceComparator;
    @ObfuscatedName(value="ao")
    @Export(value="GrandExchangeEvents_nameComparator")
    public static Comparator GrandExchangeEvents_nameComparator;
    @ObfuscatedName(value="ad")
    @Export(value="GrandExchangeEvents_quantityComparator")
    public static Comparator GrandExchangeEvents_quantityComparator;
    @ObfuscatedName(value="ay")
    @Export(value="events")
    public final List events;

    static {
        new GrandExchangeOfferWorldComparator();
        GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator();
        GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator();
        GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
    }

    @ObfuscatedSignature(descriptor="(Lvy;Z)V", garbageValue="1")
    public GrandExchangeEvents(Buffer buffer, boolean bl) {
        int n = buffer.readUnsignedShort();
        boolean bl2 = buffer.readUnsignedByte() == 1;
        byte by = bl2 ? (byte)1 : 0;
        int n2 = buffer.readUnsignedShort();
        this.events = new ArrayList(n2);
        int n3 = 0;
        while (n3 < n2) {
            this.events.add(new GrandExchangeEvent(buffer, by, n));
            ++n3;
        }
        return;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/util/Comparator;ZI)V", garbageValue="449666140")
    @Export(value="sort")
    public void sort(Comparator comparator, boolean bl) {
        if (!bl) {
            Collections.sort(this.events, Collections.reverseOrder(comparator));
        } else {
            Collections.sort(this.events, comparator);
        }
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="jt")
    @ObfuscatedSignature(descriptor="(Ldz;I)V", garbageValue="1500148000")
    static void method7859(class103 var0) {
        var1_1 = var0.field1322 / 8;
        var2_2 = var0.field1323 / 8;
        var3_3 = false;
        Projectile.method2454(false);
        var3_3 = true;
        var4_4 = 0;
        while (true) {
            block27: {
                if (var4_4 < WorldMapSectionType.field3193.length) break block27;
                if (!var3_3) {
                    return;
                }
                Projectile.method2454(false);
                var3_3 = true;
                var4_4 = 0;
                while (true) {
                    block28: {
                        if (var4_4 < WorldMapSectionType.field3193.length) break block28;
                        if (!var3_3) {
                            return;
                        }
                        var4_4 = 0;
                        while (true) {
                            block29: {
                                if (var4_4 < 4) break block29;
                                class113.method3178();
                                Renderable.method4460();
                                World.method1957();
                                Projectile.method2454(true);
                                var4_4 = 0;
                                while (true) {
                                    if (var4_4 >= 4) {
                                        var4_4 = 0;
                                        while (true) {
                                            if (var4_4 >= 13) {
                                                Projectile.method2454(true);
                                                var4_4 = 0;
                                                while (true) {
                                                    if (var4_4 >= 4) {
                                                        Projectile.method2454(true);
                                                        class113.method3178();
                                                        GrandExchangeEvent.method7903(var0);
                                                        Projectile.method2454(true);
                                                        ObjectComposition.ObjectDefinition_cachedModelData.clear();
                                                        class113.method3178();
                                                        UserComparator7.method3331();
                                                        Client.field509 = false;
                                                        return;
                                                    }
                                                    class113.method3178();
                                                    for (var5_8 = 0; var5_8 < var1_1; ++var5_8) {
                                                        block7: for (var6_6 = 0; var6_6 < var2_2; ++var6_6) {
                                                            var7_7 = Client.field574[var4_4][var5_8][var6_6];
                                                            if (var7_7 == -1) continue;
                                                            var8_9 = var7_7 >> 24 & 3;
                                                            var9_10 = var7_7 >> 1 & 3;
                                                            var10_11 = var7_7 >> 14 & 1023;
                                                            var11_12 = var7_7 >> 3 & 2047;
                                                            var12_13 = (var10_11 / 8 << 8) + var11_12 / 8;
                                                            for (var13_14 = 0; var13_14 < StructComposition.field2742.length; ++var13_14) {
                                                                if (StructComposition.field2742[var13_14] != var12_13 || AccessFile.field5365[var13_14] == null) continue;
                                                                Tiles.method2511(var0, AccessFile.field5365[var13_14], var4_4, var5_8 * 8, var6_6 * 8, var8_9, (var10_11 & 7) * 8, (var11_12 & 7) * 8, var9_10);
                                                                continue block7;
                                                            }
                                                        }
                                                    }
                                                    ++var4_4;
                                                }
                                            }
                                            for (var5_8 = 0; var5_8 < 13; ++var5_8) {
                                                var6_6 = Client.field574[0][var4_4][var5_8];
                                                if (var6_6 != -1) continue;
                                                class280.method5989(var0, var4_4 * 8, var5_8 * 8, 8, 8);
                                            }
                                            ++var4_4;
                                        }
                                    }
                                    class113.method3178();
                                    for (var5_8 = 0; var5_8 < var1_1; ++var5_8) {
                                        block11: for (var6_6 = 0; var6_6 < var2_2; ++var6_6) {
                                            var7_7 = 0;
                                            var8_9 = Client.field574[var4_4][var5_8][var6_6];
                                            if (var8_9 == -1) ** GOTO lbl88
                                            var9_10 = var8_9 >> 24 & 3;
                                            var10_11 = var8_9 >> 1 & 3;
                                            var11_12 = var8_9 >> 14 & 1023;
                                            var12_13 = var8_9 >> 3 & 2047;
                                            var13_14 = (var11_12 / 8 << 8) + var12_13 / 8;
                                            var14_15 = 0;
                                            while (true) {
                                                block31: {
                                                    block30: {
                                                        if (var14_15 >= StructComposition.field2742.length) break block30;
                                                        if (StructComposition.field2742[var14_15] != var13_14 || WorldMapSectionType.field3193[var14_15] == null) break block31;
                                                        var15_16 = (var11_12 - var5_8) * 8;
                                                        var16_17 = (var12_13 - var6_6) * 8;
                                                        class92.method2646(var0, WorldMapSectionType.field3193[var14_15], var4_4, var5_8 * 8, var6_6 * 8, var9_10, (var11_12 & 7) * 8, (var12_13 & 7) * 8, var10_11, var15_16, var16_17);
                                                        var7_7 = 1;
                                                    }
                                                    if (var7_7 != 0) continue block11;
                                                    FloorOverlayDefinition.method5662(var0.field1328, var4_4, var5_8 * 8, var6_6 * 8);
                                                    continue block11;
                                                }
                                                ++var14_15;
                                            }
                                        }
                                    }
                                    ++var4_4;
                                }
                            }
                            for (var5_8 = 0; var5_8 < var0.field1337[var4_4].length; ++var5_8) {
                                Arrays.fill(var0.field1337[var4_4][var5_8], (byte)0);
                            }
                            ++var4_4;
                        }
                    }
                    var17_5 = AccessFile.field5365[var4_4];
                    if (var17_5 != null) {
                        var6_6 = 10;
                        var7_7 = 10;
                        var3_3 &= class508.method9614(var17_5, var6_6, var7_7);
                    }
                    ++var4_4;
                }
            }
            if (class440.field4851[var4_4] != -1 && WorldMapSectionType.field3193[var4_4] == null) {
                WorldMapSectionType.field3193[var4_4] = class68.field494.takeFile(class440.field4851[var4_4], 0);
                if (WorldMapSectionType.field3193[var4_4] == null) {
                    var3_3 = false;
                }
            }
            if (HealthBarDefinition.field2578[var4_4] != -1 && AccessFile.field5365[var4_4] == null) {
                AccessFile.field5365[var4_4] = class68.field494.takeFileEncrypted(HealthBarDefinition.field2578[var4_4], 0, class374.field4114[var4_4]);
                if (AccessFile.field5365[var4_4] == null) {
                    var3_3 = false;
                }
            }
            ++var4_4;
        }
    }
}

