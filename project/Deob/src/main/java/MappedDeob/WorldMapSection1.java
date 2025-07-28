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

@ObfuscatedName(value="lq")
@Implements(value="WorldMapSection1")
public class WorldMapSection1
implements WorldMapSection {
    @ObfuscatedName(value="ws")
    @Export(value="foundItemIds")
    static short[] foundItemIds;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=2131055319)
    @Export(value="minPlane")
    int minPlane;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1183766459)
    @Export(value="planes")
    int planes;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1132037033)
    @Export(value="regionStartX")
    int regionStartX;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-756063109)
    @Export(value="regionStartY")
    int regionStartY;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=83308097)
    @Export(value="regionEndX")
    int regionEndX;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-843891125)
    @Export(value="regionEndY")
    int regionEndY;

    WorldMapSection1() {
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lkg;B)V", garbageValue="43")
    @Export(value="expandBounds")
    public void expandBounds(WorldMapArea worldMapArea) {
        if (worldMapArea.regionLowX > this.regionEndX) {
            worldMapArea.regionLowX = this.regionEndX;
        }
        if (worldMapArea.regionHighX < this.regionEndX) {
            worldMapArea.regionHighX = this.regionEndX;
        }
        if (worldMapArea.regionLowY > this.regionEndY) {
            worldMapArea.regionLowY = this.regionEndY;
        }
        if (worldMapArea.regionHighY < this.regionEndY) {
            worldMapArea.regionHighY = this.regionEndY;
        }
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIB)Z", garbageValue="53")
    @Export(value="containsCoord")
    public boolean containsCoord(int n, int n2, int n3) {
        if (n >= this.minPlane && n < this.planes + this.minPlane) {
            return n2 >> 6 == this.regionStartX && n3 >> 6 == this.regionStartY;
        }
        return false;
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="-177019651")
    @Export(value="containsPosition")
    public boolean containsPosition(int n, int n2) {
        return n >> 6 == this.regionEndX && n2 >> 6 == this.regionEndY;
    }

    @Override
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIIB)[I", garbageValue="1")
    @Export(value="getBorderTileLengths")
    public int[] getBorderTileLengths(int n, int n2, int n3) {
        if (this.containsCoord(n, n2, n3)) {
            int[] nArray = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + n2, n3 + (this.regionEndY * 64 - this.regionStartY * 64)};
            return nArray;
        }
        return null;
    }

    @Override
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(III)Lnz;", garbageValue="-425070677")
    @Export(value="coord")
    public Coord coord(int n, int n2) {
        if (this.containsPosition(n, n2)) {
            int n3 = this.regionStartX * 64 - this.regionEndX * 64 + n;
            int n4 = this.regionStartY * 64 - this.regionEndY * 64 + n2;
            return new Coord(this.minPlane, n3, n4);
        }
        return null;
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lvy;I)V", garbageValue="-1542767096")
    @Export(value="read")
    public void read(Buffer buffer) {
        this.minPlane = buffer.readUnsignedByte();
        this.planes = buffer.readUnsignedByte();
        this.regionStartX = buffer.readUnsignedShort();
        this.regionStartY = buffer.readUnsignedShort();
        this.regionEndX = buffer.readUnsignedShort();
        this.regionEndY = buffer.readUnsignedShort();
        this.postRead();
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-199417862")
    @Export(value="postRead")
    void postRead() {
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Ldz;IIIIIILku;S)V", garbageValue="218")
    static final void method6435(class103 class1032, int n, int n2, int n3, int n4, int n5, int n6, CollisionMap collisionMap) {
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        if (Client.isLowDetail && (class1032.field1337[0][n2][n3] & 2) == 0 && (class1032.field1337[n][n2][n3] & 0x10) != 0) {
            return;
        }
        if (n < Tiles.Tiles_minPlane) {
            Tiles.Tiles_minPlane = n;
        }
        ObjectComposition objectComposition = class142.getObjectDefinition(n4);
        if (n5 != 1 && n5 != 3) {
            n12 = objectComposition.sizeX;
            n11 = objectComposition.sizeY;
        } else {
            n12 = objectComposition.sizeY;
            n11 = objectComposition.sizeX;
        }
        if (n12 + n2 > class1032.field1322) {
            n10 = n2;
            n9 = n2 + 1;
        } else {
            n10 = (n12 >> 1) + n2;
            n9 = n2 + (n12 + 1 >> 1);
        }
        if (n3 + n11 > class1032.field1323) {
            n8 = n3;
            n7 = n3 + 1;
        } else {
            n8 = n3 + (n11 >> 1);
            n7 = n3 + (n11 + 1 >> 1);
        }
        int[][] nArray = class1032.field1328[n];
        int n13 = nArray[n9][n7] + nArray[n9][n8] + nArray[n10][n8] + nArray[n10][n7] >> 2;
        int n14 = (n2 << 7) + (n12 << 6);
        int n15 = (n3 << 7) + (n11 << 6);
        long l = Projectile.method2452(n2, n3, 2, objectComposition.int1 == 0, n4, class1032.field1320);
        int n16 = (n5 << 6) + n6;
        if (objectComposition.int3 == 1) {
            n16 += 256;
        }
        if (objectComposition.hasSound()) {
            GameEngine.method593(n, n2, n3, objectComposition, n5);
        }
        class187 class1872 = class1032.field1319;
        if (n6 != 22) {
            if (n6 != 10 && n6 != 11) {
                if (n6 < 12) {
                    if (n6 != 0) {
                        if (n6 != 1) {
                            Renderable renderable;
                            Renderable renderable2;
                            if (n6 != 2) {
                                if (n6 != 3) {
                                    if (n6 != 9) {
                                        if (n6 != 4) {
                                            if (n6 != 5) {
                                                if (n6 != 6) {
                                                    if (n6 != 7) {
                                                        Renderable renderable3;
                                                        Renderable renderable4;
                                                        if (n6 != 8) {
                                                            return;
                                                        }
                                                        int n17 = 8;
                                                        long l2 = class1872.method4395(n, n2, n3);
                                                        if (l2 != 0L) {
                                                            n17 = class142.getObjectDefinition((int)class360.method7406((long)l2)).int2 / 2;
                                                        }
                                                        int n18 = n5 + 2 & 3;
                                                        if (objectComposition.animationId == -1 && objectComposition.transforms == null) {
                                                            renderable4 = objectComposition.getEntity(4, n5 + 4, nArray, n14, n13, n15);
                                                            renderable3 = objectComposition.getEntity(4, n18 + 4, nArray, n14, n13, n15);
                                                        } else {
                                                            renderable4 = new class82(class1032, n4, 4, n5 + 4, n, n2, n3, objectComposition.animationId, objectComposition.boolean3, null);
                                                            renderable3 = new class82(class1032, n4, 4, n18 + 4, n, n2, n3, objectComposition.animationId, objectComposition.boolean3, null);
                                                        }
                                                        class1872.method4183(n, n2, n3, n13, renderable4, renderable3, 256, n5, n17 * Tiles.field1037[n5], n17 * Tiles.field1038[n5], l, n16);
                                                        return;
                                                    }
                                                    int n19 = n5 + 2 & 3;
                                                    Renderable renderable5 = objectComposition.animationId == -1 && objectComposition.transforms == null ? objectComposition.getEntity(4, n19 + 4, nArray, n14, n13, n15) : new class82(class1032, n4, 4, n19 + 4, n, n2, n3, objectComposition.animationId, objectComposition.boolean3, null);
                                                    class1872.method4183(n, n2, n3, n13, renderable5, null, 256, n19, 0, 0, l, n16);
                                                    return;
                                                }
                                                int n20 = 8;
                                                long l3 = class1872.method4395(n, n2, n3);
                                                if (0L != l3) {
                                                    n20 = class142.getObjectDefinition((int)class360.method7406((long)l3)).int2 / 2;
                                                }
                                                Renderable renderable6 = objectComposition.animationId == -1 && objectComposition.transforms == null ? objectComposition.getEntity(4, n5 + 4, nArray, n14, n13, n15) : new class82(class1032, n4, 4, n5 + 4, n, n2, n3, objectComposition.animationId, objectComposition.boolean3, null);
                                                class1872.method4183(n, n2, n3, n13, renderable6, null, 256, n5, n20 * Tiles.field1037[n5], n20 * Tiles.field1038[n5], l, n16);
                                                return;
                                            }
                                            int n21 = 16;
                                            long l4 = class1872.method4395(n, n2, n3);
                                            if (0L != l4) {
                                                n21 = class142.getObjectDefinition((int)class360.method7406((long)l4)).int2;
                                            }
                                            Renderable renderable7 = objectComposition.animationId == -1 && objectComposition.transforms == null ? objectComposition.getEntity(4, n5, nArray, n14, n13, n15) : new class82(class1032, n4, 4, n5, n, n2, n3, objectComposition.animationId, objectComposition.boolean3, null);
                                            class1872.method4183(n, n2, n3, n13, renderable7, null, Tiles.field1028[n5], 0, n21 * Tiles.field1031[n5], n21 * Tiles.field1036[n5], l, n16);
                                            return;
                                        }
                                        Renderable renderable8 = objectComposition.animationId == -1 && objectComposition.transforms == null ? objectComposition.getEntity(4, n5, nArray, n14, n13, n15) : new class82(class1032, n4, 4, n5, n, n2, n3, objectComposition.animationId, objectComposition.boolean3, null);
                                        class1872.method4183(n, n2, n3, n13, renderable8, null, Tiles.field1028[n5], 0, 0, 0, l, n16);
                                        return;
                                    }
                                    Renderable renderable9 = objectComposition.animationId == -1 && objectComposition.transforms == null ? objectComposition.getEntity(n6, n5, nArray, n14, n13, n15) : new class82(class1032, n4, n6, n5, n, n2, n3, objectComposition.animationId, objectComposition.boolean3, null);
                                    class1872.method4184(n, n2, n3, n13, 1, 1, renderable9, 0, l, n16);
                                    if (objectComposition.interactType != 0 && collisionMap != null) {
                                        collisionMap.addGameObject(n2, n3, n12, n11, objectComposition.boolean1);
                                    }
                                    if (objectComposition.int2 != 16) {
                                        class1872.method4190(n, n2, n3, objectComposition.int2);
                                    }
                                    return;
                                }
                                Renderable renderable10 = objectComposition.animationId == -1 && objectComposition.transforms == null ? objectComposition.getEntity(3, n5, nArray, n14, n13, n15) : new class82(class1032, n4, 3, n5, n, n2, n3, objectComposition.animationId, objectComposition.boolean3, null);
                                class1872.method4182(n, n2, n3, n13, renderable10, null, Tiles.field1034[n5], 0, l, n16);
                                if (objectComposition.clipped) {
                                    if (n5 == 0) {
                                        Tiles.Tiles_underlays2[n][n2][n3 + 1] = 50;
                                    } else if (n5 == 1) {
                                        Tiles.Tiles_underlays2[n][n2 + 1][n3 + 1] = 50;
                                    } else if (n5 == 2) {
                                        Tiles.Tiles_underlays2[n][n2 + 1][n3] = 50;
                                    } else if (n5 == 3) {
                                        Tiles.Tiles_underlays2[n][n2][n3] = 50;
                                    }
                                }
                                if (objectComposition.interactType != 0 && collisionMap != null) {
                                    collisionMap.method5797(n2, n3, n6, n5, objectComposition.boolean1);
                                }
                                return;
                            }
                            int n22 = n5 + 1 & 3;
                            if (objectComposition.animationId == -1 && objectComposition.transforms == null) {
                                renderable2 = objectComposition.getEntity(2, n5 + 4, nArray, n14, n13, n15);
                                renderable = objectComposition.getEntity(2, n22, nArray, n14, n13, n15);
                            } else {
                                renderable2 = new class82(class1032, n4, 2, n5 + 4, n, n2, n3, objectComposition.animationId, objectComposition.boolean3, null);
                                renderable = new class82(class1032, n4, 2, n22, n, n2, n3, objectComposition.animationId, objectComposition.boolean3, null);
                            }
                            class1872.method4182(n, n2, n3, n13, renderable2, renderable, Tiles.field1028[n5], Tiles.field1028[n22], l, n16);
                            if (objectComposition.modelClipped) {
                                if (n5 != 0) {
                                    if (n5 != 1) {
                                        if (n5 != 2) {
                                            if (n5 == 3) {
                                                int[] nArray2 = class538.field5380[n][n2];
                                                int n23 = n3;
                                                nArray2[n23] = nArray2[n23] | 0x492;
                                                int[] nArray3 = class538.field5380[n][n2];
                                                int n24 = n3;
                                                nArray3[n24] = nArray3[n24] | 0x249;
                                            }
                                        } else {
                                            int[] nArray4 = class538.field5380[n][n2 + 1];
                                            int n25 = n3;
                                            nArray4[n25] = nArray4[n25] | 0x249;
                                            int[] nArray5 = class538.field5380[n][n2];
                                            int n26 = n3;
                                            nArray5[n26] = nArray5[n26] | 0x492;
                                        }
                                    } else {
                                        int[] nArray6 = class538.field5380[n][n2];
                                        int n27 = 1 + n3;
                                        nArray6[n27] = nArray6[n27] | 0x492;
                                        int[] nArray7 = class538.field5380[n][n2 + 1];
                                        int n28 = n3;
                                        nArray7[n28] = nArray7[n28] | 0x249;
                                    }
                                } else {
                                    int[] nArray8 = class538.field5380[n][n2];
                                    int n29 = n3;
                                    nArray8[n29] = nArray8[n29] | 0x249;
                                    int[] nArray9 = class538.field5380[n][n2];
                                    int n30 = n3 + 1;
                                    nArray9[n30] = nArray9[n30] | 0x492;
                                }
                            }
                            if (objectComposition.interactType != 0 && collisionMap != null) {
                                collisionMap.method5797(n2, n3, n6, n5, objectComposition.boolean1);
                            }
                            if (objectComposition.int2 != 16) {
                                class1872.method4190(n, n2, n3, objectComposition.int2);
                            }
                            return;
                        }
                        Renderable renderable = objectComposition.animationId == -1 && objectComposition.transforms == null ? objectComposition.getEntity(1, n5, nArray, n14, n13, n15) : new class82(class1032, n4, 1, n5, n, n2, n3, objectComposition.animationId, objectComposition.boolean3, null);
                        class1872.method4182(n, n2, n3, n13, renderable, null, Tiles.field1034[n5], 0, l, n16);
                        if (objectComposition.clipped) {
                            if (n5 == 0) {
                                Tiles.Tiles_underlays2[n][n2][n3 + 1] = 50;
                            } else if (n5 == 1) {
                                Tiles.Tiles_underlays2[n][n2 + 1][n3 + 1] = 50;
                            } else if (n5 == 2) {
                                Tiles.Tiles_underlays2[n][n2 + 1][n3] = 50;
                            } else if (n5 == 3) {
                                Tiles.Tiles_underlays2[n][n2][n3] = 50;
                            }
                        }
                        if (objectComposition.interactType != 0 && collisionMap != null) {
                            collisionMap.method5797(n2, n3, n6, n5, objectComposition.boolean1);
                        }
                        return;
                    }
                    Renderable renderable = objectComposition.animationId == -1 && objectComposition.transforms == null ? objectComposition.getEntity(0, n5, nArray, n14, n13, n15) : new class82(class1032, n4, 0, n5, n, n2, n3, objectComposition.animationId, objectComposition.boolean3, null);
                    class1872.method4182(n, n2, n3, n13, renderable, null, Tiles.field1028[n5], 0, l, n16);
                    if (n5 != 0) {
                        if (n5 != 1) {
                            if (n5 != 2) {
                                if (n5 == 3) {
                                    if (objectComposition.clipped) {
                                        Tiles.Tiles_underlays2[n][n2][n3] = 50;
                                        Tiles.Tiles_underlays2[n][n2 + 1][n3] = 50;
                                    }
                                    if (objectComposition.modelClipped) {
                                        int[] nArray10 = class538.field5380[n][n2];
                                        int n31 = n3;
                                        nArray10[n31] = nArray10[n31] | 0x492;
                                    }
                                }
                            } else {
                                if (objectComposition.clipped) {
                                    Tiles.Tiles_underlays2[n][n2 + 1][n3] = 50;
                                    Tiles.Tiles_underlays2[n][n2 + 1][n3 + 1] = 50;
                                }
                                if (objectComposition.modelClipped) {
                                    int[] nArray11 = class538.field5380[n][n2 + 1];
                                    int n32 = n3;
                                    nArray11[n32] = nArray11[n32] | 0x249;
                                }
                            }
                        } else {
                            if (objectComposition.clipped) {
                                Tiles.Tiles_underlays2[n][n2][n3 + 1] = 50;
                                Tiles.Tiles_underlays2[n][n2 + 1][n3 + 1] = 50;
                            }
                            if (objectComposition.modelClipped) {
                                int[] nArray12 = class538.field5380[n][n2];
                                int n33 = n3 + 1;
                                nArray12[n33] = nArray12[n33] | 0x492;
                            }
                        }
                    } else {
                        if (objectComposition.clipped) {
                            Tiles.Tiles_underlays2[n][n2][n3] = 50;
                            Tiles.Tiles_underlays2[n][n2][n3 + 1] = 50;
                        }
                        if (objectComposition.modelClipped) {
                            int[] nArray13 = class538.field5380[n][n2];
                            int n34 = n3;
                            nArray13[n34] = nArray13[n34] | 0x249;
                        }
                    }
                    if (objectComposition.interactType != 0 && collisionMap != null) {
                        collisionMap.method5797(n2, n3, n6, n5, objectComposition.boolean1);
                    }
                    if (objectComposition.int2 != 16) {
                        class1872.method4190(n, n2, n3, objectComposition.int2);
                    }
                    return;
                }
                Renderable renderable = objectComposition.animationId == -1 && objectComposition.transforms == null ? objectComposition.getEntity(n6, n5, nArray, n14, n13, n15) : new class82(class1032, n4, n6, n5, n, n2, n3, objectComposition.animationId, objectComposition.boolean3, null);
                class1872.method4184(n, n2, n3, n13, 1, 1, renderable, 0, l, n16);
                if (n6 >= 12 && n6 <= 17 && n6 != 13 && n > 0) {
                    int[] nArray14 = class538.field5380[n][n2];
                    int n35 = n3;
                    nArray14[n35] = nArray14[n35] | 0x924;
                }
                if (objectComposition.interactType != 0 && collisionMap != null) {
                    collisionMap.addGameObject(n2, n3, n12, n11, objectComposition.boolean1);
                }
                return;
            }
            Renderable renderable = objectComposition.animationId == -1 && objectComposition.transforms == null ? objectComposition.getEntity(10, n5, nArray, n14, n13, n15) : new class82(class1032, n4, 10, n5, n, n2, n3, objectComposition.animationId, objectComposition.boolean3, null);
            if (renderable != null && class1872.method4184(n, n2, n3, n13, n12, n11, renderable, n6 == 11 ? 256 : 0, l, n16) && objectComposition.clipped) {
                byte by = 15;
                if (renderable instanceof Model && (by = ((Model)renderable).method4591() / 4) > 30) {
                    by = 30;
                }
                for (int i = 0; i <= n12; ++i) {
                    for (int j = 0; j <= n11; ++j) {
                        if (by <= Tiles.Tiles_underlays2[n][i + n2][n3 + j]) continue;
                        Tiles.Tiles_underlays2[n][i + n2][n3 + j] = by;
                    }
                }
            }
            if (objectComposition.interactType != 0 && collisionMap != null) {
                collisionMap.addGameObject(n2, n3, n12, n11, objectComposition.boolean1);
            }
            return;
        }
        if (Client.isLowDetail && objectComposition.int1 == 0 && objectComposition.interactType != 1 && !objectComposition.boolean2) {
            return;
        }
        Renderable renderable = objectComposition.animationId == -1 && objectComposition.transforms == null ? objectComposition.getEntity(22, n5, nArray, n14, n13, n15) : new class82(class1032, n4, 22, n5, n, n2, n3, objectComposition.animationId, objectComposition.boolean3, null);
        class1872.method4180(n, n2, n3, n13, renderable, l, n16);
        if (objectComposition.interactType == 1 && collisionMap != null) {
            collisionMap.method5812(n2, n3);
        }
    }
}

