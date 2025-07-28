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
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ln")
@Implements(value="WorldMapRenderer")
public final class WorldMapRenderer {
    @ObfuscatedName(value="ay")
    @Export(value="loaded")
    boolean loaded = false;
    @ObfuscatedName(value="ah")
    @Export(value="loadStarted")
    boolean loadStarted = false;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Llv;")
    @Export(value="mapAreaData")
    WorldMapAreaData mapAreaData;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lvf;")
    @Export(value="compositeTextureSprite")
    SpritePixels compositeTextureSprite;
    @ObfuscatedName(value="ad")
    @Export(value="icons")
    HashMap icons;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="[[Lki;")
    @Export(value="regions")
    WorldMapRegion[][] regions;
    @ObfuscatedName(value="ae")
    @Export(value="scaleHandlers")
    HashMap scaleHandlers = new HashMap();
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="[Lvi;")
    @Export(value="mapSceneSprites")
    IndexedSprite[] mapSceneSprites;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="geographyArchive")
    final AbstractArchive geographyArchive;
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="groundArchive")
    final AbstractArchive groundArchive;
    @ObfuscatedName(value="au")
    @Export(value="fonts")
    final HashMap fonts;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-245797833)
    @Export(value="tileX")
    int tileX;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-716092027)
    @Export(value="tileY")
    int tileY;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-1728469507)
    @Export(value="tileWidth")
    int tileWidth;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=2006955759)
    @Export(value="tileHeight")
    int tileHeight;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-1812520287)
    @Export(value="pixelsPerTile")
    public int pixelsPerTile = 0;

    @ObfuscatedSignature(descriptor="([Lvi;Ljava/util/HashMap;Lpq;Lpq;)V")
    public WorldMapRenderer(IndexedSprite[] indexedSpriteArray, HashMap hashMap, AbstractArchive abstractArchive, AbstractArchive abstractArchive2) {
        this.mapSceneSprites = indexedSpriteArray;
        this.fonts = hashMap;
        this.geographyArchive = abstractArchive;
        this.groundArchive = abstractArchive2;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;Ljava/lang/String;ZB)V", garbageValue="75")
    @Export(value="load")
    public void load(AbstractArchive abstractArchive, String string, boolean bl) {
        if (this.loadStarted) {
            return;
        }
        this.loaded = false;
        this.loadStarted = true;
        System.nanoTime();
        int n = abstractArchive.getGroupId(WorldMapCacheName.field3264.name);
        int n2 = abstractArchive.getFileId(n, string);
        Buffer buffer = new Buffer(abstractArchive.takeFileByNames(WorldMapCacheName.field3264.name, string));
        Buffer buffer2 = new Buffer(abstractArchive.takeFileByNames(WorldMapCacheName.field3269.name, string));
        System.nanoTime();
        System.nanoTime();
        this.mapAreaData = new WorldMapAreaData();
        try {
            this.mapAreaData.init(buffer, buffer2, n2, bl);
        }
        catch (IllegalStateException illegalStateException) {
            return;
        }
        this.mapAreaData.getOriginX();
        this.mapAreaData.getOriginPlane();
        this.mapAreaData.getOriginY();
        this.tileX = this.mapAreaData.getRegionLowX() * 64;
        this.tileY = this.mapAreaData.getRegionLowY() * 64;
        this.tileWidth = (this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1) * 64;
        this.tileHeight = (this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1) * 64;
        int n3 = this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1;
        int n4 = this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1;
        System.nanoTime();
        System.nanoTime();
        WorldMapRegion.WorldMapRegion_cachedSprites.clear();
        this.regions = new WorldMapRegion[n3][n4];
        for (WorldMapData_0 worldMapData_0 : this.mapAreaData.worldMapData0Set) {
            int n5 = worldMapData_0.regionX;
            int n6 = worldMapData_0.regionY;
            int n7 = n5 - this.mapAreaData.getRegionLowX();
            int n8 = n6 - this.mapAreaData.getRegionLowY();
            this.regions[n7][n8] = new WorldMapRegion(n5, n6, this.mapAreaData.getBackGroundColor(), this.fonts);
            this.regions[n7][n8].initWorldMapData0(worldMapData_0, this.mapAreaData.iconList);
        }
        for (int i = 0; i < n3; ++i) {
            for (int j = 0; j < n4; ++j) {
                if (this.regions[i][j] != null) continue;
                this.regions[i][j] = new WorldMapRegion(this.mapAreaData.getRegionLowX() + i, this.mapAreaData.getRegionLowY() + j, this.mapAreaData.getBackGroundColor(), this.fonts);
                this.regions[i][j].initWorldMapData1(this.mapAreaData.worldMapData1Set, this.mapAreaData.iconList);
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (abstractArchive.isValidFileName(WorldMapCacheName.field3265.name, string)) {
            Object object = abstractArchive.takeFileByNames(WorldMapCacheName.field3265.name, string);
            this.compositeTextureSprite = GrandExchangeOfferNameComparator.method7878((byte[])object);
        }
        System.nanoTime();
        abstractArchive.clearGroups();
        abstractArchive.clearFiles();
        this.loaded = true;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="540467084")
    @Export(value="clearIcons")
    public final void clearIcons() {
        this.icons = null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIIIIIIIS)V", garbageValue="227")
    @Export(value="drawTiles")
    public final void drawTiles(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9;
        int[] nArray = Rasterizer2D.Rasterizer2D_pixels;
        int n10 = Rasterizer2D.Rasterizer2D_width;
        int n11 = Rasterizer2D.Rasterizer2D_height;
        float[] fArray = Rasterizer2D.field5544;
        int[] nArray2 = new int[4];
        Rasterizer2D.Rasterizer2D_getClipArray(nArray2);
        WorldMapRectangle worldMapRectangle = this.createWorldMapRectangle(n, n2, n3, n4);
        float f = this.getPixelsPerTile(n7 - n5, n3 - n);
        this.pixelsPerTile = n9 = (int)Math.ceil(f);
        if (!this.scaleHandlers.containsKey(n9)) {
            WorldMapScaleHandler worldMapScaleHandler = new WorldMapScaleHandler(n9);
            worldMapScaleHandler.init();
            this.scaleHandlers.put(n9, worldMapScaleHandler);
        }
        int n12 = worldMapRectangle.width + worldMapRectangle.x - 1;
        int n13 = worldMapRectangle.y + worldMapRectangle.height - 1;
        int n14 = worldMapRectangle.x;
        while (true) {
            int n15;
            if (n14 > n12) {
                SceneTileModel.method4016(nArray, n10, n11, fArray);
                Rasterizer2D.Rasterizer2D_setClipArray(nArray2);
                n14 = (int)(64.0f * f);
                n15 = this.tileX * 4096 + n;
                int n16 = this.tileY * 4096 + n2;
                int n17 = worldMapRectangle.x;
                while (true) {
                    if (n17 >= worldMapRectangle.x + worldMapRectangle.width) {
                        return;
                    }
                    for (int i = worldMapRectangle.y; i < worldMapRectangle.height + worldMapRectangle.y; ++i) {
                        this.regions[n17][i].method6106(n5 + n14 * (this.regions[n17][i].regionX * 64 - n15) / 64, n8 - n14 * (this.regions[n17][i].regionY * 64 - n16 + 64) / 64, n14);
                    }
                    ++n17;
                }
            }
            for (n15 = worldMapRectangle.y; n15 <= n13; ++n15) {
                this.regions[n14][n15].method6115(n9, (WorldMapScaleHandler)this.scaleHandlers.get(n9), this.mapSceneSprites, this.geographyArchive, this.groundArchive, 0.725);
            }
            ++n14;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V", garbageValue="64")
    @Export(value="drawElements")
    public final void drawElements(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, HashSet hashSet, HashSet hashSet2, int n9, int n10, boolean bl) {
        WorldMapRectangle worldMapRectangle = this.createWorldMapRectangle(n, n2, n3, n4);
        float f = this.getPixelsPerTile(n7 - n5, n3 - n);
        int n11 = (int)(64.0f * f);
        int n12 = this.tileX * 4096 + n;
        int n13 = this.tileY * 4096 + n2;
        int n14 = worldMapRectangle.x;
        while (true) {
            int n15;
            if (n14 >= worldMapRectangle.width + worldMapRectangle.x) {
                if (hashSet2 != null && n9 > 0) {
                    for (n14 = worldMapRectangle.x; n14 < worldMapRectangle.width + worldMapRectangle.x; ++n14) {
                        for (n15 = worldMapRectangle.y; n15 < worldMapRectangle.y + worldMapRectangle.height; ++n15) {
                            this.regions[n14][n15].flashElements(hashSet2, n9, n10);
                        }
                    }
                }
                return;
            }
            for (n15 = worldMapRectangle.y; n15 < worldMapRectangle.y + worldMapRectangle.height; ++n15) {
                if (bl) {
                    this.regions[n14][n15].initWorldMapIcon1s();
                }
                this.regions[n14][n15].method6174(n5 + n11 * (this.regions[n14][n15].regionX * 64 - n12) / 64, n8 - n11 * (this.regions[n14][n15].regionY * 64 - n13 + 64) / 64, n11, hashSet);
            }
            ++n14;
        }
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IIIILjava/util/HashSet;III)V", garbageValue="312740054")
    @Export(value="drawOverview")
    public void drawOverview(int var1_1, int var2_2, int var3_3, int var4_4, HashSet var5_5, int var6_6, int var7_7) {
        if (this.compositeTextureSprite != null) {
            this.compositeTextureSprite.drawScaledAt(var1_1, var2_2, var3_3, var4_4);
            if (var6_6 > 0 && var6_6 % var7_7 < var7_7 / 2) {
                if (this.icons == null) {
                    this.buildIcons0();
                }
                var8_8 = var5_5.iterator();
                block0: while (true) {
                    if (!var8_8.hasNext()) {
                        return;
                    }
                    var9_9 = (Integer)var8_8.next();
                    var10_10 = (List)this.icons.get(var9_9);
                    if (var10_10 == null) continue;
                    var11_11 = var10_10.iterator();
                    while (true) {
                        if (var11_11.hasNext()) ** break;
                        continue block0;
                        var12_12 = (AbstractWorldMapIcon)var11_11.next();
                        var13_13 = var3_3 * (var12_12.coord2.x - this.tileX * 4096) / (this.tileWidth * 4096);
                        var14_14 = var4_4 - (var12_12.coord2.y - this.tileY * 4096) * var4_4 / (this.tileHeight * 4096);
                        Rasterizer2D.Rasterizer2D_drawCircleAlpha(var13_13 + var1_1, var14_14 + var2_2, 2, 0xFFFF00, 256);
                    }
                    break;
                }
            }
            return;
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IIIIIIIIIII)Ljava/util/List;", garbageValue="1531797459")
    public List method6237(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        LinkedList linkedList = new LinkedList();
        if (this.loaded) {
            WorldMapRectangle worldMapRectangle = this.createWorldMapRectangle(n, n2, n3, n4);
            float f = this.getPixelsPerTile(n7, n3 - n);
            int n11 = (int)(f * 64.0f);
            int n12 = this.tileX * 4096 + n;
            int n13 = this.tileY * 4096 + n2;
            int n14 = worldMapRectangle.x;
            while (true) {
                if (n14 >= worldMapRectangle.width + worldMapRectangle.x) {
                    return linkedList;
                }
                for (int i = worldMapRectangle.y; i < worldMapRectangle.y + worldMapRectangle.height; ++i) {
                    List list = this.regions[n14][i].method6216(n5 + n11 * (this.regions[n14][i].regionX * 64 - n12) / 64, n8 + n6 - n11 * (this.regions[n14][i].regionY * 64 - n13 + 64) / 64, n11, n9, n10);
                    if (list.isEmpty()) continue;
                    linkedList.addAll(list);
                }
                ++n14;
            }
        }
        return linkedList;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IIIII)Lla;", garbageValue="1044915427")
    @Export(value="createWorldMapRectangle")
    WorldMapRectangle createWorldMapRectangle(int n, int n2, int n3, int n4) {
        WorldMapRectangle worldMapRectangle = new WorldMapRectangle(this);
        int n5 = this.tileX * 4096 + n;
        int n6 = this.tileY * 4096 + n2;
        int n7 = n3 + this.tileX * 4096;
        int n8 = this.tileY * 4096 + n4;
        int n9 = n5 / 64;
        int n10 = n6 / 64;
        int n11 = n7 / 64;
        int n12 = n8 / 64;
        worldMapRectangle.width = n11 - n9 + 1;
        worldMapRectangle.height = n12 - n10 + 1;
        worldMapRectangle.x = n9 - this.mapAreaData.getRegionLowX();
        worldMapRectangle.y = n10 - this.mapAreaData.getRegionLowY();
        if (worldMapRectangle.x < 0) {
            worldMapRectangle.width += worldMapRectangle.x;
            worldMapRectangle.x = 0;
        }
        if (worldMapRectangle.x > this.regions.length - worldMapRectangle.width) {
            worldMapRectangle.width = this.regions.length - worldMapRectangle.x;
        }
        if (worldMapRectangle.y < 0) {
            worldMapRectangle.height += worldMapRectangle.y;
            worldMapRectangle.y = 0;
        }
        if (worldMapRectangle.y > this.regions[0].length - worldMapRectangle.height) {
            worldMapRectangle.height = this.regions[0].length - worldMapRectangle.y;
        }
        worldMapRectangle.width = Math.min(worldMapRectangle.width, this.regions.length);
        worldMapRectangle.height = Math.min(worldMapRectangle.height, this.regions[0].length);
        return worldMapRectangle;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1170944951")
    @Export(value="isLoaded")
    public boolean isLoaded() {
        return this.loaded;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-124678418")
    public int method6240() {
        return this.mapAreaData.method6045();
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(I)Ljava/util/HashMap;", garbageValue="-1053205519")
    @Export(value="buildIcons")
    public HashMap buildIcons() {
        this.buildIcons0();
        return this.icons;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-36")
    @Export(value="buildIcons0")
    void buildIcons0() {
        if (this.icons == null) {
            this.icons = new HashMap();
        }
        this.icons.clear();
        int n = 0;
        while (n < this.regions.length) {
            for (int i = 0; i < this.regions[n].length; ++i) {
                List list = this.regions[n][i].icons();
                for (AbstractWorldMapIcon abstractWorldMapIcon : list) {
                    List<AbstractWorldMapIcon> list2;
                    if (!abstractWorldMapIcon.hasValidElement()) continue;
                    int n2 = abstractWorldMapIcon.getElement();
                    if (this.icons.containsKey(n2)) {
                        list2 = (List)this.icons.get(n2);
                        list2.add(abstractWorldMapIcon);
                        continue;
                    }
                    list2 = new LinkedList<AbstractWorldMapIcon>();
                    ((LinkedList)list2).add(abstractWorldMapIcon);
                    this.icons.put(n2, list2);
                }
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(III)F", garbageValue="1398040002")
    @Export(value="getPixelsPerTile")
    float getPixelsPerTile(int n, int n2) {
        float f = (float)n / (float)n2;
        if (f > 8.0f) {
            return 8.0f;
        }
        if (f < 1.0f) {
            return 1.0f;
        }
        int n3 = Math.round(f);
        if (!(Math.abs((float)n3 - f) < 0.05f)) {
            return f;
        }
        return n3;
    }
}

