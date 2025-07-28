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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ki")
@Implements(value="WorldMapRegion")
public class WorldMapRegion {
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lmf;")
    @Export(value="WorldMapRegion_cachedSprites")
    public static DemotingHashTable WorldMapRegion_cachedSprites = new DemotingHashTable(0x2400000, 256);
    @ObfuscatedName(value="ik")
    @ObfuscatedGetter(longValue=-443869461595618329L)
    static long field3124;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1050432489)
    @Export(value="regionX")
    int regionX;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=653055413)
    @Export(value="regionY")
    int regionY;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lko;")
    @Export(value="worldMapData_0")
    WorldMapData_0 worldMapData_0;
    @ObfuscatedName(value="at")
    @Export(value="worldMapData1List")
    LinkedList worldMapData1List;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=1155673661)
    @Export(value="backgroundColor")
    int backgroundColor;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-373546867)
    @Export(value="pixelsPerTile")
    int pixelsPerTile;
    @ObfuscatedName(value="as")
    @Export(value="icon0List")
    List icon0List;
    @ObfuscatedName(value="aq")
    @Export(value="iconMap")
    HashMap iconMap;
    @ObfuscatedName(value="af")
    @Export(value="fonts")
    final HashMap fonts;

    WorldMapRegion(int n, int n2, int n3, HashMap hashMap) {
        this.regionX = n;
        this.regionY = n2;
        this.worldMapData1List = new LinkedList();
        this.icon0List = new LinkedList();
        this.iconMap = new HashMap();
        this.backgroundColor = n3 | 0xFF000000;
        this.fonts = hashMap;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIII)V", garbageValue="-1466626269")
    void method6106(int n, int n2, int n3) {
        int n4 = this.regionX;
        int n5 = this.regionY;
        int n6 = this.pixelsPerTile;
        Object object = WorldMapRegion_cachedSprites;
        long l = n6 << 16 | n4 << 8 | n5;
        SpritePixels spritePixels = (SpritePixels)((DemotingHashTable)object).get(l);
        if ((object = spritePixels) == null) {
            return;
        }
        if (n3 != this.pixelsPerTile * 64) {
            ((SpritePixels)object).drawScaledWorldmap(n, n2, n3, n3);
        } else {
            ((SpritePixels)object).drawAt(n, n2);
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lko;Ljava/util/List;B)V", garbageValue="-60")
    @Export(value="initWorldMapData0")
    void initWorldMapData0(WorldMapData_0 worldMapData_0, List list) {
        this.iconMap.clear();
        this.worldMapData_0 = worldMapData_0;
        this.addAllToIconList(list);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ljava/util/HashSet;Ljava/util/List;I)V", garbageValue="-588244452")
    @Export(value="initWorldMapData1")
    void initWorldMapData1(HashSet hashSet, List list) {
        this.iconMap.clear();
        Iterator iterator = hashSet.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.addAllToIconList(list);
                return;
            }
            WorldMapData_1 worldMapData_1 = (WorldMapData_1)iterator.next();
            if (worldMapData_1.getRegionX() != this.regionX || worldMapData_1.getRegionY() != this.regionY) continue;
            this.worldMapData1List.add(worldMapData_1);
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IIIILlu;I)V", garbageValue="-44209391")
    @Export(value="getIconsForTiles")
    void getIconsForTiles(int n, int n2, int n3, int n4, AbstractWorldMapData abstractWorldMapData) {
        int n5 = n;
        while (n5 < n3 + n) {
            block1: for (int i = n2; i < n2 + n4; ++i) {
                for (int j = 0; j < abstractWorldMapData.planes; ++j) {
                    WorldMapDecoration[] worldMapDecorationArray = abstractWorldMapData.decorations[j][n5][i];
                    if (worldMapDecorationArray == null || worldMapDecorationArray.length == 0) continue;
                    WorldMapDecoration[] worldMapDecorationArray2 = worldMapDecorationArray;
                    for (int k = 0; k < worldMapDecorationArray2.length; ++k) {
                        WorldMapDecoration worldMapDecoration = worldMapDecorationArray2[k];
                        ObjectComposition objectComposition = class142.getObjectDefinition(worldMapDecoration.objectDefinitionId);
                        if (!class113.method3177(objectComposition)) continue;
                        this.getIcon(objectComposition, j, n5, i, abstractWorldMapData);
                        continue block1;
                    }
                }
            }
            ++n5;
        }
        return;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lkl;IIILlu;I)V", garbageValue="-1610742956")
    @Export(value="getIcon")
    void getIcon(ObjectComposition objectComposition, int n, int n2, int n3, AbstractWorldMapData abstractWorldMapData) {
        WorldMapElement worldMapElement;
        Object object;
        Coord coord = new Coord(n, n2 + this.regionX * 64, this.regionY * 64 + n3);
        Coord coord2 = null;
        if (this.worldMapData_0 == null) {
            object = (WorldMapData_1)abstractWorldMapData;
            coord2 = new Coord(n + ((AbstractWorldMapData)object).minPlane, ((AbstractWorldMapData)object).regionXLow * 64 + n2 + ((WorldMapData_1)object).getChunkXLow() * 8, n3 + ((AbstractWorldMapData)object).regionYLow * 4096 + ((WorldMapData_1)object).getChunkYLow() * 8);
        } else {
            coord2 = new Coord(this.worldMapData_0.minPlane + n, n2 + this.worldMapData_0.regionXLow * 64, this.worldMapData_0.regionYLow * 4096 + n3);
        }
        if (objectComposition.transforms == null) {
            worldMapElement = class31.WorldMapElement_get(objectComposition.mapIconId);
            object = new WorldMapIcon_0(coord2, coord, worldMapElement.objectId, this.createMapLabel(worldMapElement));
        } else {
            object = new WorldMapIcon_1(coord2, coord, objectComposition.id, this);
        }
        worldMapElement = class31.WorldMapElement_get(((AbstractWorldMapIcon)object).getElement());
        if (worldMapElement.field2533) {
            this.iconMap.put(new Coord(0, n2, n3), object);
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="517557938")
    @Export(value="initWorldMapIcon1s")
    void initWorldMapIcon1s() {
        Iterator iterator = this.iconMap.values().iterator();
        while (iterator.hasNext()) {
            AbstractWorldMapIcon abstractWorldMapIcon = (AbstractWorldMapIcon)iterator.next();
            if (!(abstractWorldMapIcon instanceof WorldMapIcon_1)) continue;
            ((WorldMapIcon_1)abstractWorldMapIcon).init();
        }
        return;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Ljava/util/List;I)V", garbageValue="-1162210322")
    @Export(value="addAllToIconList")
    void addAllToIconList(List list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            WorldMapIcon_0 worldMapIcon_0 = (WorldMapIcon_0)iterator.next();
            if (!class31.WorldMapElement_get((int)worldMapIcon_0.element).field2533 || worldMapIcon_0.coord2.x >> 6 != this.regionX || worldMapIcon_0.coord2.y >> 6 != this.regionY) continue;
            WorldMapIcon_0 worldMapIcon_02 = new WorldMapIcon_0(worldMapIcon_0.coord2, worldMapIcon_0.coord2, worldMapIcon_0.element, this.method6172(worldMapIcon_0.element));
            this.icon0List.add(worldMapIcon_02);
        }
        return;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-1918")
    void method6113() {
        if (this.worldMapData_0 == null) {
            for (WorldMapData_1 worldMapData_1 : this.worldMapData1List) {
                worldMapData_1.reset();
            }
        } else {
            this.worldMapData_0.reset();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Lpq;B)Z", garbageValue="-69")
    @Export(value="loadGeography")
    boolean loadGeography(AbstractArchive abstractArchive) {
        this.iconMap.clear();
        if (this.worldMapData_0 == null) {
            boolean bl = true;
            Iterator iterator = this.worldMapData1List.iterator();
            while (true) {
                WorldMapData_1 worldMapData_1;
                if (!iterator.hasNext()) {
                    if (!bl) return bl;
                    iterator = this.worldMapData1List.iterator();
                    while (true) {
                        if (!iterator.hasNext()) {
                            return bl;
                        }
                        worldMapData_1 = (WorldMapData_1)iterator.next();
                        this.getIconsForTiles(worldMapData_1.getChunkX() * 8, worldMapData_1.getChunkY() * 8, 8, 8, worldMapData_1);
                    }
                }
                worldMapData_1 = (WorldMapData_1)iterator.next();
                worldMapData_1.loadGeography(abstractArchive);
                bl &= worldMapData_1.isFullyLoaded();
            }
        }
        this.worldMapData_0.loadGeography(abstractArchive);
        if (!this.worldMapData_0.isFullyLoaded()) {
            return false;
        }
        this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0);
        return true;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(ILlr;[Lvi;Lpq;Lpq;D)V")
    void method6115(int n, WorldMapScaleHandler worldMapScaleHandler, IndexedSprite[] indexedSpriteArray, AbstractArchive abstractArchive, AbstractArchive abstractArchive2, double d) {
        this.pixelsPerTile = n;
        if (this.worldMapData_0 == null && this.worldMapData1List.isEmpty()) {
            return;
        }
        DemotingHashTable demotingHashTable = WorldMapRegion_cachedSprites;
        int n2 = this.regionX;
        int n3 = this.regionY;
        long l = n << 16 | n2 << 8 | n3;
        SpritePixels spritePixels = (SpritePixels)demotingHashTable.get(l);
        if (spritePixels == null) {
            if (SceneTileModel.method4068() != d) {
                SceneTileModel.method4004(d);
            }
            boolean bl = true;
            bl &= this.loadGeography(abstractArchive);
            int n4 = this.worldMapData_0 == null ? ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId : this.worldMapData_0.groupId;
            if (!(bl &= abstractArchive2.tryLoadGroup(n4))) {
                return;
            }
            byte[] byArray = abstractArchive2.takeFileFlat(n4);
            WorldMapSprite worldMapSprite = class344.method6934(byArray);
            SpritePixels spritePixels2 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
            spritePixels2.setRaster();
            if (this.worldMapData_0 == null) {
                this.method6119(worldMapScaleHandler, indexedSpriteArray, worldMapSprite);
            } else {
                this.method6227(worldMapScaleHandler, indexedSpriteArray, worldMapSprite);
            }
            int n5 = this.regionX;
            int n6 = this.regionY;
            int n7 = this.pixelsPerTile;
            WorldMapRegion_cachedSprites.put(spritePixels2, ItemContainer.method2606(n5, n6, n7), spritePixels2.pixels.length * 4);
            this.method6113();
            return;
        }
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(IIILjava/util/HashSet;I)V", garbageValue="2069696355")
    void method6174(int n, int n2, int n3, HashSet hashSet) {
        if (hashSet == null) {
            hashSet = new HashSet();
        }
        this.drawNonLinkMapIcons(n, n2, hashSet, n3);
        this.drawMapLinks(n, n2, hashSet, n3);
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Ljava/util/HashSet;III)V", garbageValue="-1584571433")
    @Export(value="flashElements")
    void flashElements(HashSet hashSet, int n, int n2) {
        Iterator iterator = this.iconMap.values().iterator();
        while (true) {
            int n3;
            if (!iterator.hasNext()) {
                this.method6165(hashSet, n, n2);
                return;
            }
            AbstractWorldMapIcon abstractWorldMapIcon = (AbstractWorldMapIcon)iterator.next();
            if (!abstractWorldMapIcon.hasValidElement() || !hashSet.contains(n3 = abstractWorldMapIcon.getElement())) continue;
            WorldMapElement worldMapElement = class31.WorldMapElement_get(n3);
            this.drawBackgroundCircle(worldMapElement, abstractWorldMapIcon.screenX, abstractWorldMapIcon.screenY, n, n2);
        }
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(Llr;[Lvi;Lld;I)V", garbageValue="24705389")
    void method6227(WorldMapScaleHandler worldMapScaleHandler, IndexedSprite[] indexedSpriteArray, WorldMapSprite worldMapSprite) {
        int n = 0;
        while (true) {
            int n2;
            if (n >= 64) {
                n = 0;
                while (true) {
                    if (n >= 64) {
                        return;
                    }
                    for (n2 = 0; n2 < 64; ++n2) {
                        this.method6120(n, n2, this.worldMapData_0, worldMapScaleHandler, indexedSpriteArray);
                    }
                    ++n;
                }
            }
            for (n2 = 0; n2 < 64; ++n2) {
                this.drawTileGround(n, n2, this.worldMapData_0, worldMapScaleHandler, worldMapSprite);
                this.method6209(n, n2, this.worldMapData_0, worldMapScaleHandler);
            }
            ++n;
        }
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Llr;[Lvi;Lld;B)V", garbageValue="73")
    void method6119(WorldMapScaleHandler worldMapScaleHandler, IndexedSprite[] indexedSpriteArray, WorldMapSprite worldMapSprite) {
        Iterator iterator = this.worldMapData1List.iterator();
        block0: while (true) {
            int n;
            int n2;
            WorldMapData_1 worldMapData_1;
            if (!iterator.hasNext()) {
                iterator = this.worldMapData1List.iterator();
                block1: while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    worldMapData_1 = (WorldMapData_1)iterator.next();
                    n2 = worldMapData_1.getChunkX() * 8;
                    while (true) {
                        if (n2 >= worldMapData_1.getChunkX() * 8 + 8) continue block1;
                        for (n = worldMapData_1.getChunkY() * 8; n < worldMapData_1.getChunkY() * 8 + 8; ++n) {
                            this.method6120(n2, n, worldMapData_1, worldMapScaleHandler, indexedSpriteArray);
                        }
                        ++n2;
                    }
                    break;
                }
            }
            worldMapData_1 = (WorldMapData_1)iterator.next();
            n2 = worldMapData_1.getChunkX() * 8;
            while (true) {
                if (n2 >= worldMapData_1.getChunkX() * 8 + 8) continue block0;
                for (n = worldMapData_1.getChunkY() * 8; n < worldMapData_1.getChunkY() * 8 + 8; ++n) {
                    this.drawTileGround(n2, n, worldMapData_1, worldMapScaleHandler, worldMapSprite);
                    this.method6209(n2, n, worldMapData_1, worldMapScaleHandler);
                }
                ++n2;
            }
            break;
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(IILlu;Llr;[Lvi;B)V", garbageValue="-56")
    void method6120(int n, int n2, AbstractWorldMapData abstractWorldMapData, WorldMapScaleHandler worldMapScaleHandler, IndexedSprite[] indexedSpriteArray) {
        this.method6175(n, n2, abstractWorldMapData);
        this.method6124(n, n2, abstractWorldMapData, indexedSpriteArray);
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(IILlu;Llr;Lld;I)V", garbageValue="2099380889")
    @Export(value="drawTileGround")
    void drawTileGround(int n, int n2, AbstractWorldMapData abstractWorldMapData, WorldMapScaleHandler worldMapScaleHandler, WorldMapSprite worldMapSprite) {
        int n3 = abstractWorldMapData.floorUnderlayIds[0][n][n2] - 1;
        int n4 = abstractWorldMapData.floorOverlayIds[0][n][n2] - 1;
        if (n3 == -1 && n4 == -1) {
            Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor);
        }
        int n5 = 0xFF00FF;
        if (n4 != -1) {
            n5 = class31.method496(n4, this.backgroundColor);
        }
        if (n4 > -1 && abstractWorldMapData.field3210[0][n][n2] == 0) {
            Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2), this.pixelsPerTile, this.pixelsPerTile, n5);
            return;
        }
        int n6 = this.method6123(n, n2, abstractWorldMapData, worldMapSprite);
        if (n4 != -1) {
            worldMapScaleHandler.method6497(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2), n6, n5, this.pixelsPerTile, this.pixelsPerTile, abstractWorldMapData.field3210[0][n][n2], abstractWorldMapData.field3205[0][n][n2]);
            return;
        }
        Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2), this.pixelsPerTile, this.pixelsPerTile, n6);
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(IILlu;Llr;B)V", garbageValue="99")
    void method6209(int n, int n2, AbstractWorldMapData abstractWorldMapData, WorldMapScaleHandler worldMapScaleHandler) {
        int n3 = 1;
        while (n3 < abstractWorldMapData.planes) {
            int n4 = abstractWorldMapData.floorOverlayIds[n3][n][n2] - 1;
            if (n4 > -1) {
                int n5 = class31.method496(n4, this.backgroundColor);
                if (abstractWorldMapData.field3210[n3][n][n2] != 0) {
                    worldMapScaleHandler.method6497(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2), 0, n5, this.pixelsPerTile, this.pixelsPerTile, abstractWorldMapData.field3210[n3][n][n2], abstractWorldMapData.field3205[n3][n][n2]);
                } else {
                    Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2), this.pixelsPerTile, this.pixelsPerTile, n5);
                }
            }
            ++n3;
        }
        return;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(IILlu;Lld;I)I", garbageValue="125412595")
    int method6123(int n, int n2, AbstractWorldMapData abstractWorldMapData, WorldMapSprite worldMapSprite) {
        if (abstractWorldMapData.floorUnderlayIds[0][n][n2] != 0) {
            return worldMapSprite.getTileColor(n, n2);
        }
        return this.backgroundColor;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(IILlu;[Lvi;I)V", garbageValue="1149870919")
    void method6124(int n, int n2, AbstractWorldMapData abstractWorldMapData, IndexedSprite[] indexedSpriteArray) {
        int n3 = 0;
        while (n3 < abstractWorldMapData.planes) {
            WorldMapDecoration[] worldMapDecorationArray = abstractWorldMapData.decorations[n3][n][n2];
            if (worldMapDecorationArray != null && worldMapDecorationArray.length != 0) {
                WorldMapDecoration[] worldMapDecorationArray2 = worldMapDecorationArray;
                for (int i = 0; i < worldMapDecorationArray2.length; ++i) {
                    boolean bl;
                    WorldMapDecoration worldMapDecoration = worldMapDecorationArray2[i];
                    int n4 = worldMapDecoration.decoration;
                    boolean bl2 = bl = n4 >= WorldMapDecorationType.field4086.id && n4 <= WorldMapDecorationType.field4082.id;
                    if (!bl && !class228.method5106(worldMapDecoration.decoration)) continue;
                    ObjectComposition objectComposition = class142.getObjectDefinition(worldMapDecoration.objectDefinitionId);
                    if (objectComposition.mapSceneId == -1) continue;
                    int n5 = worldMapDecoration.rotation != 1 && worldMapDecoration.rotation != 3 ? objectComposition.sizeY : objectComposition.sizeX;
                    indexedSpriteArray[objectComposition.mapSceneId].method10712(this.pixelsPerTile * n, this.pixelsPerTile * (64 - n5 - n2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
                }
            }
            ++n3;
        }
        return;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(IILlu;I)V", garbageValue="820260147")
    void method6175(int n, int n2, AbstractWorldMapData abstractWorldMapData) {
        int n3 = 0;
        while (n3 < abstractWorldMapData.planes) {
            WorldMapDecoration[] worldMapDecorationArray = abstractWorldMapData.decorations[n3][n][n2];
            if (worldMapDecorationArray != null && worldMapDecorationArray.length != 0) {
                WorldMapDecoration[] worldMapDecorationArray2 = worldMapDecorationArray;
                for (int i = 0; i < worldMapDecorationArray2.length; ++i) {
                    int n4;
                    int n5;
                    WorldMapDecoration worldMapDecoration = worldMapDecorationArray2[i];
                    if (!HealthBarUpdate.method2833(worldMapDecoration.decoration)) continue;
                    ObjectComposition objectComposition = class142.getObjectDefinition(worldMapDecoration.objectDefinitionId);
                    int n6 = n5 = objectComposition.int1 != 0 ? -3407872 : -3355444;
                    if (worldMapDecoration.decoration == WorldMapDecorationType.field4074.id) {
                        this.method6139(n, n2, worldMapDecoration.rotation, n5);
                    }
                    if (worldMapDecoration.decoration == WorldMapDecorationType.field4070.id) {
                        this.method6139(n, n2, worldMapDecoration.rotation, -3355444);
                        this.method6139(n, n2, worldMapDecoration.rotation + 1, n5);
                    }
                    if (worldMapDecoration.decoration == WorldMapDecorationType.field4068.id) {
                        if (worldMapDecoration.rotation == 0) {
                            Rasterizer2D.method10619(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2), 1, n5);
                        }
                        if (worldMapDecoration.rotation == 1) {
                            Rasterizer2D.method10619(this.pixelsPerTile + this.pixelsPerTile * n - 1, this.pixelsPerTile * (63 - n2), 1, n5);
                        }
                        if (worldMapDecoration.rotation == 2) {
                            Rasterizer2D.method10619(this.pixelsPerTile + this.pixelsPerTile * n - 1, this.pixelsPerTile * (63 - n2) + this.pixelsPerTile - 1, 1, n5);
                        }
                        if (worldMapDecoration.rotation == 3) {
                            Rasterizer2D.method10619(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2) + this.pixelsPerTile - 1, 1, n5);
                        }
                    }
                    if (worldMapDecoration.decoration != WorldMapDecorationType.field4066.id) continue;
                    int n7 = worldMapDecoration.rotation % 2;
                    if (n7 != 0) {
                        for (n4 = 0; n4 < this.pixelsPerTile; ++n4) {
                            Rasterizer2D.method10619(n4 + this.pixelsPerTile * n, n4 + this.pixelsPerTile * (63 - n2), 1, n5);
                        }
                        continue;
                    }
                    for (n4 = 0; n4 < this.pixelsPerTile; ++n4) {
                        Rasterizer2D.method10619(n4 + this.pixelsPerTile * n, (64 - n2) * this.pixelsPerTile - 1 - n4, 1, n5);
                    }
                }
            }
            ++n3;
        }
        return;
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(IILjava/util/HashSet;II)V", garbageValue="837362733")
    @Export(value="drawNonLinkMapIcons")
    void drawNonLinkMapIcons(int n, int n2, HashSet hashSet, int n3) {
        float f = (float)n3 / 64.0f;
        float f2 = f / 2.0f;
        Iterator iterator = this.iconMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            Coord coord = (Coord)entry.getKey();
            int n4 = (int)((float)n + (float)coord.x * f - f2);
            int n5 = (int)((float)(n2 + n3) - f * (float)coord.y - f2);
            AbstractWorldMapIcon abstractWorldMapIcon = (AbstractWorldMapIcon)entry.getValue();
            if (abstractWorldMapIcon == null || !abstractWorldMapIcon.hasValidElement()) continue;
            abstractWorldMapIcon.screenX = n4;
            abstractWorldMapIcon.screenY = n5;
            WorldMapElement worldMapElement = class31.WorldMapElement_get(abstractWorldMapIcon.getElement());
            if (hashSet.contains(worldMapElement.getObjectId())) continue;
            this.method6129(abstractWorldMapIcon, n4, n5, f);
        }
        return;
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(Ljava/util/HashSet;III)V", garbageValue="-98224507")
    void method6165(HashSet hashSet, int n, int n2) {
        Iterator iterator = this.icon0List.iterator();
        while (iterator.hasNext()) {
            WorldMapElement worldMapElement;
            AbstractWorldMapIcon abstractWorldMapIcon = (AbstractWorldMapIcon)iterator.next();
            if (!abstractWorldMapIcon.hasValidElement() || (worldMapElement = class31.WorldMapElement_get(abstractWorldMapIcon.getElement())) == null || !hashSet.contains(worldMapElement.getObjectId())) continue;
            this.drawBackgroundCircle(worldMapElement, abstractWorldMapIcon.screenX, abstractWorldMapIcon.screenY, n, n2);
        }
        return;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(Ljm;IIIIB)V", garbageValue="81")
    @Export(value="drawBackgroundCircle")
    void drawBackgroundCircle(WorldMapElement worldMapElement, int n, int n2, int n3, int n4) {
        SpritePixels spritePixels = worldMapElement.getSpriteBool(false);
        if (spritePixels != null) {
            spritePixels.drawTransBgAt(n - spritePixels.subWidth / 2, n2 - spritePixels.subHeight / 2);
            if (n3 % n4 < n4 / 2) {
                Rasterizer2D.Rasterizer2D_drawCircleAlpha(n, n2, 15, 0xFFFF00, 128);
                Rasterizer2D.Rasterizer2D_drawCircleAlpha(n, n2, 7, 0xFFFFFF, 256);
            }
            return;
        }
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(Lly;IIFI)V", garbageValue="-1797725706")
    void method6129(AbstractWorldMapIcon abstractWorldMapIcon, int n, int n2, float f) {
        WorldMapElement worldMapElement = class31.WorldMapElement_get(abstractWorldMapIcon.getElement());
        this.method6116(worldMapElement, n, n2);
        this.method6131(abstractWorldMapIcon, worldMapElement, n, n2, f);
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Ljm;III)V", garbageValue="-1315466009")
    void method6116(WorldMapElement worldMapElement, int n, int n2) {
        SpritePixels spritePixels = worldMapElement.getSpriteBool(false);
        if (spritePixels != null) {
            int n3 = this.method6133(spritePixels, worldMapElement.horizontalAlignment);
            int n4 = this.method6134(spritePixels, worldMapElement.verticalAlignment);
            spritePixels.drawTransBgAt(n3 + n, n2 + n4);
        }
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(Lly;Ljm;IIFB)V", garbageValue="0")
    void method6131(AbstractWorldMapIcon abstractWorldMapIcon, WorldMapElement worldMapElement, int n, int n2, float f) {
        WorldMapLabel worldMapLabel = abstractWorldMapIcon.getLabel();
        if (worldMapLabel != null) {
            if (worldMapLabel.size.method5991(f)) {
                Font font = (Font)this.fonts.get(worldMapLabel.size);
                font.drawLines(worldMapLabel.text, n - worldMapLabel.width / 2, n2, worldMapLabel.width, worldMapLabel.height, 0xFF000000 | worldMapElement.field2540, 0, 1, 0, font.ascent / 2);
                return;
            }
            return;
        }
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(IILjava/util/HashSet;IB)V", garbageValue="97")
    @Export(value="drawMapLinks")
    void drawMapLinks(int n, int n2, HashSet hashSet, int n3) {
        float f = (float)n3 / 64.0f;
        Iterator iterator = this.icon0List.iterator();
        while (iterator.hasNext()) {
            AbstractWorldMapIcon abstractWorldMapIcon = (AbstractWorldMapIcon)iterator.next();
            if (!abstractWorldMapIcon.hasValidElement()) continue;
            int n4 = abstractWorldMapIcon.coord2.x % 64;
            int n5 = abstractWorldMapIcon.coord2.y % 64;
            abstractWorldMapIcon.screenX = (int)((float)n + f * (float)n4);
            abstractWorldMapIcon.screenY = (int)((float)n2 + (float)(63 - n5) * f);
            if (hashSet.contains(abstractWorldMapIcon.getElement())) continue;
            this.method6129(abstractWorldMapIcon, abstractWorldMapIcon.screenX, abstractWorldMapIcon.screenY, f);
        }
        return;
    }

    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="(Lvf;Ljt;I)I", garbageValue="949804228")
    int method6133(SpritePixels spritePixels, HorizontalAlignment horizontalAlignment) {
        switch (horizontalAlignment.value) {
            case 0: {
                return -spritePixels.subWidth / 2;
            }
            case 2: {
                return 0;
            }
        }
        return -spritePixels.subWidth;
    }

    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="(Lvf;Ljk;I)I", garbageValue="-497738492")
    int method6134(SpritePixels spritePixels, VerticalAlignment verticalAlignment) {
        switch (verticalAlignment.value) {
            case 1: {
                return -spritePixels.subHeight / 2;
            }
            case 2: {
                return 0;
            }
        }
        return -spritePixels.subHeight;
    }

    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(II)Lli;", garbageValue="-633165647")
    WorldMapLabel method6172(int n) {
        WorldMapElement worldMapElement = class31.WorldMapElement_get(n);
        return this.createMapLabel(worldMapElement);
    }

    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="(Ljm;B)Lli;", garbageValue="87")
    @Export(value="createMapLabel")
    WorldMapLabel createMapLabel(WorldMapElement worldMapElement) {
        if (worldMapElement.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
            WorldMapLabelSize worldMapLabelSize = WorldMapLabelSize.method5992(worldMapElement.textSize);
            if (worldMapLabelSize != null) {
                Font font = (Font)this.fonts.get(worldMapLabelSize);
                if (font != null) {
                    int n = font.lineCount(worldMapElement.name, 1000000);
                    String[] stringArray = new String[n];
                    font.breakLines(worldMapElement.name, null, stringArray);
                    int n2 = stringArray.length * font.ascent / 2;
                    int n3 = 0;
                    String[] stringArray2 = stringArray;
                    int n4 = 0;
                    while (true) {
                        if (n4 >= stringArray2.length) {
                            return new WorldMapLabel(worldMapElement.name, n3, n2, worldMapLabelSize);
                        }
                        String string = stringArray2[n4];
                        int n5 = font.stringWidth(string);
                        if (n5 > n3) {
                            n3 = n5;
                        }
                        ++n4;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @ObfuscatedName(value="bz")
    @ObfuscatedSignature(descriptor="(IIIIII)Ljava/util/List;", garbageValue="1263967352")
    List method6216(int n, int n2, int n3, int n4, int n5) {
        LinkedList<AbstractWorldMapIcon> linkedList = new LinkedList<AbstractWorldMapIcon>();
        if (n4 >= n && n5 >= n2) {
            if (n4 < n3 + n && n5 < n3 + n2) {
                Iterator<Object> iterator = this.iconMap.values().iterator();
                while (true) {
                    AbstractWorldMapIcon abstractWorldMapIcon;
                    if (!iterator.hasNext()) {
                        iterator = this.icon0List.iterator();
                        while (true) {
                            if (!iterator.hasNext()) {
                                return linkedList;
                            }
                            abstractWorldMapIcon = (AbstractWorldMapIcon)iterator.next();
                            if (!abstractWorldMapIcon.hasValidElement() || !abstractWorldMapIcon.fitsScreen(n4, n5)) continue;
                            linkedList.add(abstractWorldMapIcon);
                        }
                    }
                    abstractWorldMapIcon = (AbstractWorldMapIcon)iterator.next();
                    if (!abstractWorldMapIcon.hasValidElement() || !abstractWorldMapIcon.fitsScreen(n4, n5)) continue;
                    linkedList.add(abstractWorldMapIcon);
                }
            }
            return linkedList;
        }
        return linkedList;
    }

    @ObfuscatedName(value="bt")
    @ObfuscatedSignature(descriptor="(I)Ljava/util/List;", garbageValue="1286016129")
    @Export(value="icons")
    List icons() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.icon0List);
        linkedList.addAll(this.iconMap.values());
        return linkedList;
    }

    @ObfuscatedName(value="bf")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="0")
    void method6139(int n, int n2, int n3, int n4) {
        if ((n3 %= 4) == 0) {
            Rasterizer2D.method10621(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2), this.pixelsPerTile, n4);
        }
        if (n3 == 1) {
            Rasterizer2D.method10619(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2), this.pixelsPerTile, n4);
        }
        if (n3 == 2) {
            Rasterizer2D.method10621(this.pixelsPerTile * n + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - n2), this.pixelsPerTile, n4);
        }
        if (n3 == 3) {
            Rasterizer2D.method10619(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2) + this.pixelsPerTile - 1, this.pixelsPerTile, n4);
        }
    }
}

