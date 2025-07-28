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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ua")
@Implements(value="WorldMap")
public class WorldMap {
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lun;")
    @Export(value="fontNameVerdana11")
    static final FontName fontNameVerdana11 = FontName.FontName_verdana11;
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Lun;")
    @Export(value="fontNameVerdana13")
    static final FontName fontNameVerdana13 = FontName.FontName_verdana13;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lun;")
    @Export(value="fontNameVerdana15")
    static final FontName fontNameVerdana15 = FontName.FontName_verdana15;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="WorldMap_archive")
    AbstractArchive WorldMap_archive;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="WorldMap_geographyArchive")
    AbstractArchive WorldMap_geographyArchive;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="WorldMap_groundArchive")
    AbstractArchive WorldMap_groundArchive;
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lqw;")
    @Export(value="font")
    Font font;
    @ObfuscatedName(value="af")
    @Export(value="fonts")
    HashMap fonts;
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="[Lvi;")
    @Export(value="mapSceneSprites")
    IndexedSprite[] mapSceneSprites;
    @ObfuscatedName(value="ak")
    @Export(value="details")
    HashMap details;
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lkg;")
    @Export(value="mainMapArea")
    WorldMapArea mainMapArea;
    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="Lkg;")
    @Export(value="currentMapArea")
    WorldMapArea currentMapArea;
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="Lkg;")
    WorldMapArea field5247;
    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="Lln;")
    @Export(value="worldMapRenderer")
    WorldMapRenderer worldMapRenderer;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lui;")
    @Export(value="cacheLoader")
    WorldMapArchiveLoader cacheLoader;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=-1263353459)
    @Export(value="centerTileX")
    int centerTileX;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=-757920317)
    @Export(value="centerTileY")
    int centerTileY;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=-910073395)
    @Export(value="worldMapTargetX")
    int worldMapTargetX = -1;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=-1078169411)
    @Export(value="worldMapTargetY")
    int worldMapTargetY = -1;
    @ObfuscatedName(value="aj")
    @Export(value="zoom")
    float zoom;
    @ObfuscatedName(value="bu")
    @Export(value="zoomTarget")
    float zoomTarget;
    @ObfuscatedName(value="bh")
    @ObfuscatedGetter(intValue=-1724412843)
    @Export(value="worldMapDisplayWidth")
    int worldMapDisplayWidth = -1;
    @ObfuscatedName(value="bw")
    @ObfuscatedGetter(intValue=-1136354703)
    @Export(value="worldMapDisplayHeight")
    int worldMapDisplayHeight = -1;
    @ObfuscatedName(value="bb")
    @ObfuscatedGetter(intValue=-1689015869)
    @Export(value="worldMapDisplayX")
    int worldMapDisplayX = -1;
    @ObfuscatedName(value="bx")
    @ObfuscatedGetter(intValue=-1468105399)
    @Export(value="worldMapDisplayY")
    int worldMapDisplayY = -1;
    @ObfuscatedName(value="bd")
    @ObfuscatedGetter(intValue=-1190319851)
    @Export(value="maxFlashCount")
    int maxFlashCount = 3;
    @ObfuscatedName(value="bi")
    @ObfuscatedGetter(intValue=-1748388695)
    @Export(value="cyclesPerFlash")
    int cyclesPerFlash = 50;
    @ObfuscatedName(value="bz")
    @Export(value="perpetualFlash")
    boolean perpetualFlash = false;
    @ObfuscatedName(value="bt")
    @Export(value="flashingElements")
    HashSet flashingElements = null;
    @ObfuscatedName(value="bf")
    @ObfuscatedGetter(intValue=-344276351)
    @Export(value="flashCount")
    int flashCount = -1;
    @ObfuscatedName(value="by")
    @ObfuscatedGetter(intValue=951487379)
    @Export(value="flashCycle")
    int flashCycle = -1;
    @ObfuscatedName(value="bm")
    @ObfuscatedGetter(intValue=1453294759)
    int field5283 = -1;
    @ObfuscatedName(value="bp")
    @ObfuscatedGetter(intValue=2145186445)
    int field5299 = -1;
    @ObfuscatedName(value="bg")
    @ObfuscatedGetter(intValue=-535649107)
    int field5264 = -1;
    @ObfuscatedName(value="bc")
    @ObfuscatedGetter(intValue=1331954087)
    int field5286 = -1;
    @ObfuscatedName(value="bv")
    @ObfuscatedGetter(longValue=5420777842527732741L)
    long field5287;
    @ObfuscatedName(value="bq")
    @ObfuscatedGetter(intValue=-1148942197)
    int field5288;
    @ObfuscatedName(value="ba")
    @ObfuscatedGetter(intValue=-429926047)
    int field5289;
    @ObfuscatedName(value="bk")
    boolean field5307 = true;
    @ObfuscatedName(value="bo")
    @Export(value="enabledElements")
    HashSet enabledElements = new HashSet();
    @ObfuscatedName(value="be")
    @Export(value="enabledCategories")
    HashSet enabledCategories = new HashSet();
    @ObfuscatedName(value="bn")
    @Export(value="enabledElementIds")
    HashSet enabledElementIds = new HashSet();
    @ObfuscatedName(value="br")
    HashSet field5294 = new HashSet();
    @ObfuscatedName(value="bl")
    @Export(value="elementsDisabled")
    boolean elementsDisabled = false;
    @ObfuscatedName(value="cb")
    @ObfuscatedGetter(intValue=-581933911)
    int field5296 = 0;
    @ObfuscatedName(value="cc")
    @Export(value="menuOpcodes")
    final int[] menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
    @ObfuscatedName(value="co")
    List field5255;
    @ObfuscatedName(value="ca")
    @Export(value="iconIterator")
    Iterator iconIterator;
    @ObfuscatedName(value="cg")
    HashSet field5257 = new HashSet();
    @ObfuscatedName(value="cp")
    @ObfuscatedSignature(descriptor="Lnz;")
    @Export(value="mouseCoord")
    Coord mouseCoord = null;
    @ObfuscatedName(value="cz")
    public boolean field5302 = false;
    @ObfuscatedName(value="cy")
    @ObfuscatedSignature(descriptor="Lvf;")
    @Export(value="sprite")
    SpritePixels sprite;
    @ObfuscatedName(value="cu")
    @ObfuscatedGetter(intValue=253070077)
    @Export(value="cachedPixelsPerTile")
    int cachedPixelsPerTile;
    @ObfuscatedName(value="cq")
    @ObfuscatedGetter(intValue=-1267470751)
    @Export(value="minCachedTileX")
    int minCachedTileX = -1;
    @ObfuscatedName(value="cf")
    @ObfuscatedGetter(intValue=1192070813)
    @Export(value="minCachedTileY")
    int minCachedTileY = -1;
    @ObfuscatedName(value="ct")
    @ObfuscatedGetter(intValue=-812343699)
    int field5298 = -1;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;Lpq;Lpq;Lqw;Ljava/util/HashMap;[Lvi;I)V", garbageValue="-384875908")
    @Export(value="init")
    public void init(AbstractArchive abstractArchive, AbstractArchive abstractArchive2, AbstractArchive abstractArchive3, Font font, HashMap hashMap, IndexedSprite[] indexedSpriteArray) {
        this.mapSceneSprites = indexedSpriteArray;
        this.WorldMap_archive = abstractArchive;
        this.WorldMap_geographyArchive = abstractArchive2;
        this.WorldMap_groundArchive = abstractArchive3;
        this.font = font;
        this.fonts = new HashMap();
        this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, hashMap.get(fontNameVerdana11));
        this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, hashMap.get(fontNameVerdana13));
        this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, hashMap.get(fontNameVerdana15));
        this.cacheLoader = new WorldMapArchiveLoader(abstractArchive);
        int n = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3264.name);
        int[] nArray = this.WorldMap_archive.getGroupFileIds(n);
        int n2 = nArray == null ? 0 : nArray.length;
        this.details = new HashMap(n2);
        int n3 = 0;
        while (true) {
            if (n3 >= n2) {
                this.setCurrentMapArea(this.mainMapArea);
                this.field5247 = null;
                return;
            }
            Buffer buffer = new Buffer(this.WorldMap_archive.takeFile(n, nArray[n3]));
            WorldMapArea worldMapArea = new WorldMapArea();
            worldMapArea.read(buffer, nArray[n3]);
            this.details.put(worldMapArea.getInternalName(), worldMapArea);
            if (worldMapArea.getIsMain()) {
                this.mainMapArea = worldMapArea;
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="66")
    public void method9720() {
        WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIZIIIII)V", garbageValue="921212845")
    @Export(value="onCycle")
    public void onCycle(int n, int n2, boolean bl, int n3, int n4, int n5, int n6) {
        if (this.cacheLoader.isLoaded()) {
            this.smoothZoom();
            this.scrollToTarget();
            if (bl) {
                int n7 = (int)Math.ceil((float)n5 / this.zoom);
                int n8 = (int)Math.ceil((float)n6 / this.zoom);
                List list = this.worldMapRenderer.method6237(this.centerTileX - n7 / 2 - 1, this.centerTileY - n8 / 2 - 1, n7 / 2 + this.centerTileX + 1, n8 / 2 + this.centerTileY + 1, n3, n4, n5, n6, n, n2);
                HashSet<AbstractWorldMapIcon> hashSet = new HashSet<AbstractWorldMapIcon>();
                Iterator iterator = list.iterator();
                while (true) {
                    WorldMapEvent worldMapEvent;
                    ScriptEvent scriptEvent;
                    AbstractWorldMapIcon abstractWorldMapIcon;
                    if (!iterator.hasNext()) {
                        iterator = this.field5257.iterator();
                        while (true) {
                            if (!iterator.hasNext()) {
                                this.field5257 = hashSet;
                                return;
                            }
                            abstractWorldMapIcon = (AbstractWorldMapIcon)iterator.next();
                            if (hashSet.contains(abstractWorldMapIcon)) continue;
                            scriptEvent = new ScriptEvent();
                            worldMapEvent = new WorldMapEvent(abstractWorldMapIcon.getElement(), abstractWorldMapIcon.coord1, abstractWorldMapIcon.coord2);
                            scriptEvent.setArgs(new Object[]{worldMapEvent, n, n2});
                            scriptEvent.setType(16);
                            Friend.runScriptEvent(scriptEvent);
                        }
                    }
                    abstractWorldMapIcon = (AbstractWorldMapIcon)iterator.next();
                    hashSet.add(abstractWorldMapIcon);
                    scriptEvent = new ScriptEvent();
                    worldMapEvent = new WorldMapEvent(abstractWorldMapIcon.getElement(), abstractWorldMapIcon.coord1, abstractWorldMapIcon.coord2);
                    scriptEvent.setArgs(new Object[]{worldMapEvent, n, n2});
                    if (!this.field5257.contains(abstractWorldMapIcon)) {
                        scriptEvent.setType(15);
                    } else {
                        scriptEvent.setType(17);
                    }
                    Friend.runScriptEvent(scriptEvent);
                }
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIZZI)V", garbageValue="-603417059")
    public void method9800(int var1_1, int var2_2, boolean var3_3, boolean var4_4) {
        var5_5 = ReflectionCheck.method724();
        this.method9732(var1_1, var2_2, var4_4, var5_5);
        if (this.hasTarget() || !var4_4 && !var3_3) ** GOTO lbl-1000
        v0 = var7_6 = Client.clickedWidget != null;
        if (!var7_6) {
            if (var4_4) {
                this.field5264 = var1_1;
                this.field5286 = var2_2;
                this.field5283 = this.centerTileX;
                this.field5299 = this.centerTileY;
            }
            if (this.field5283 != -1) {
                var8_7 = var1_1 - this.field5264;
                var9_8 = var2_2 - this.field5286;
                this.setWorldMapPosition(this.field5283 - (int)((float)var8_7 / this.zoomTarget), (int)((float)var9_8 / this.zoomTarget) + this.field5299, false);
            }
        } else lbl-1000:
        // 2 sources

        {
            this.method9924();
        }
        if (var4_4) {
            this.field5287 = var5_5;
            this.field5288 = var1_1;
            this.field5289 = var2_2;
        }
    }

    @ObfuscatedName(value="ad")
    void method9732(int n, int n2, boolean bl, long l) {
        if (this.currentMapArea == null) {
            this.mouseCoord = null;
        } else {
            int n3 = (int)((float)this.centerTileX + ((float)(n - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0f) / this.zoom);
            int n4 = (int)((float)this.centerTileY - ((float)(n2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0f) / this.zoom);
            this.mouseCoord = this.currentMapArea.coord(n3 + this.currentMapArea.getRegionLowX() * 64, n4 + this.currentMapArea.getRegionLowY() * 64);
            if (this.mouseCoord != null && bl) {
                class269 class2692 = HealthBar.method3010();
                if (class30.method480() && class2692.method5776(82) && class2692.method5776(81)) {
                    int n5 = this.mouseCoord.x;
                    int n6 = this.mouseCoord.y;
                    int n7 = this.mouseCoord.plane;
                    PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3368, Client.packetWriter.isaacCipher);
                    packetBufferNode.packetBuffer.writeInt(n5);
                    packetBufferNode.packetBuffer.method10320(n6);
                    packetBufferNode.packetBuffer.method10332(0);
                    packetBufferNode.packetBuffer.method10310(n7);
                    Client.packetWriter.addNode(packetBufferNode);
                } else {
                    boolean bl2 = true;
                    if (this.field5307) {
                        int n8 = n - this.field5288;
                        int n9 = n2 - this.field5289;
                        if (l - this.field5287 > 500L || n8 < -25 || n8 > 25 || n9 < -25 || n9 > 25) {
                            bl2 = false;
                        }
                    }
                    if (bl2) {
                        PacketBufferNode packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3352, Client.packetWriter.isaacCipher);
                        packetBufferNode.packetBuffer.method10332(this.mouseCoord.packed());
                        Client.packetWriter.addNode(packetBufferNode);
                        this.field5287 = 0L;
                    }
                }
            }
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1082827779")
    @Export(value="smoothZoom")
    void smoothZoom() {
        if (class184.field1975 == null) {
            if (this.zoom < this.zoomTarget) {
                this.zoom = Math.min(this.zoomTarget, this.zoom / 30.0f + this.zoom);
            }
            if (this.zoom > this.zoomTarget) {
                this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0f);
            }
            return;
        }
        this.zoom = this.zoomTarget;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1561757065")
    @Export(value="scrollToTarget")
    void scrollToTarget() {
        if (this.hasTarget()) {
            int n = this.worldMapTargetX - this.centerTileX;
            int n2 = this.worldMapTargetY - this.centerTileY;
            if (n != 0) {
                n /= Math.min(8, Math.abs(n));
            }
            if (n2 != 0) {
                n2 /= Math.min(8, Math.abs(n2));
            }
            this.setWorldMapPosition(n + this.centerTileX, n2 + this.centerTileY, true);
            if (this.centerTileX == this.worldMapTargetX && this.centerTileY == this.worldMapTargetY) {
                this.worldMapTargetX = -1;
                this.worldMapTargetY = -1;
            }
            return;
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(IIZI)V", garbageValue="-454932438")
    @Export(value="setWorldMapPosition")
    final void setWorldMapPosition(int n, int n2, boolean bl) {
        this.centerTileX = n;
        this.centerTileY = n2;
        ReflectionCheck.method724();
        if (bl) {
            this.method9924();
        }
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1068503217")
    final void method9924() {
        this.field5286 = -1;
        this.field5264 = -1;
        this.field5299 = -1;
        this.field5283 = -1;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1942748590")
    @Export(value="hasTarget")
    boolean hasTarget() {
        return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(IIIB)Lkg;", garbageValue="2")
    @Export(value="mapAreaAtCoord")
    public WorldMapArea mapAreaAtCoord(int n, int n2, int n3) {
        WorldMapArea worldMapArea;
        Iterator iterator = this.details.values().iterator();
        do {
            if (iterator.hasNext()) continue;
            return null;
        } while (!(worldMapArea = (WorldMapArea)iterator.next()).containsCoord(n, n2, n3));
        return worldMapArea;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(IIIZI)V", garbageValue="436314663")
    public void method9730(int n, int n2, int n3, boolean bl) {
        WorldMapArea worldMapArea = this.mapAreaAtCoord(n, n2, n3);
        if (worldMapArea == null) {
            if (!bl) {
                return;
            }
            worldMapArea = this.mainMapArea;
        }
        boolean bl2 = false;
        if (worldMapArea != this.field5247 || bl) {
            this.field5247 = worldMapArea;
            this.setCurrentMapArea(worldMapArea);
            bl2 = true;
        }
        if (bl2 || bl) {
            this.jump(n, n2, n3);
        }
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1364107327")
    @Export(value="setCurrentMapAreaId")
    public void setCurrentMapAreaId(int n) {
        WorldMapArea worldMapArea = this.getMapArea(n);
        if (worldMapArea != null) {
            this.setCurrentMapArea(worldMapArea);
        }
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="604187685")
    @Export(value="currentMapAreaId")
    public int currentMapAreaId() {
        if (this.currentMapArea != null) {
            return this.currentMapArea.getId();
        }
        return -1;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(B)Lkg;", garbageValue="1")
    @Export(value="getCurrentMapArea")
    public WorldMapArea getCurrentMapArea() {
        return this.currentMapArea;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkg;S)V", garbageValue="5000")
    @Export(value="setCurrentMapArea")
    void setCurrentMapArea(WorldMapArea worldMapArea) {
        if (this.currentMapArea == null || worldMapArea != this.currentMapArea) {
            this.initializeWorldMap(worldMapArea);
            this.jump(-1, -1, -1);
            return;
        }
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(Lkg;I)V", garbageValue="-513231515")
    @Export(value="initializeWorldMap")
    void initializeWorldMap(WorldMapArea worldMapArea) {
        this.currentMapArea = worldMapArea;
        this.worldMapRenderer = new WorldMapRenderer(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
        this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName());
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(Lkg;Lnz;Lnz;ZI)V", garbageValue="1887228144")
    public void method9736(WorldMapArea worldMapArea, Coord coord, Coord coord2, boolean bl) {
        if (worldMapArea != null) {
            if (this.currentMapArea == null || worldMapArea != this.currentMapArea) {
                this.initializeWorldMap(worldMapArea);
            }
            if (!bl && this.currentMapArea.containsCoord(coord.plane, coord.x, coord.y)) {
                this.jump(coord.plane, coord.x, coord.y);
            } else {
                this.jump(coord2.plane, coord2.x, coord2.y);
            }
            return;
        }
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(IIII)V", garbageValue="845412686")
    @Export(value="jump")
    void jump(int n, int n2, int n3) {
        if (this.currentMapArea != null) {
            int[] nArray = this.currentMapArea.position(n, n2, n3);
            if (nArray == null) {
                nArray = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY());
            }
            this.setWorldMapPosition(nArray[0] - this.currentMapArea.getRegionLowX() * 64, nArray[1] - this.currentMapArea.getRegionLowY() * 64, true);
            this.worldMapTargetX = -1;
            this.worldMapTargetY = -1;
            this.zoomTarget = this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom());
            this.field5255 = null;
            this.iconIterator = null;
            this.worldMapRenderer.clearIcons();
            return;
        }
    }

    @ObfuscatedName(value="aw")
    public void method9738(int n, int n2, int n3, int n4, int n5, double d) {
        int n6;
        block10: {
            block12: {
                int[] nArray;
                block11: {
                    nArray = new int[4];
                    Rasterizer2D.Rasterizer2D_getClipArray(nArray);
                    Rasterizer2D.Rasterizer2D_setClip(n, n2, n3 + n, n2 + n4);
                    n6 = this.cacheLoader.getPercentLoaded();
                    if (n6 < 100) break block10;
                    if (this.worldMapRenderer.isLoaded()) break block11;
                    this.worldMapRenderer.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
                    if (!this.worldMapRenderer.isLoaded()) break block12;
                }
                int n7 = class300.Rasterizer3D_brighten(this.worldMapRenderer.method6240(), d);
                Rasterizer2D.Rasterizer2D_fillRectangle(n, n2, n3, n4, n7);
                if (this.flashingElements != null) {
                    ++this.flashCycle;
                    if (this.flashCycle % this.cyclesPerFlash == 0) {
                        this.flashCycle = 0;
                        ++this.flashCount;
                    }
                    if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) {
                        this.flashingElements = null;
                    }
                }
                int n8 = (int)Math.ceil((float)n3 / this.zoom);
                int n9 = (int)Math.ceil((float)n4 / this.zoom);
                double d2 = SceneTileModel.method4068();
                this.worldMapRenderer.drawTiles(this.centerTileX - n8 / 2, this.centerTileY - n9 / 2, n8 / 2 + this.centerTileX, n9 / 2 + this.centerTileY, n, n2, n3 + n, n2 + n4);
                if (!this.elementsDisabled) {
                    boolean bl = false;
                    if (n5 - this.field5296 > 100) {
                        this.field5296 = n5;
                        bl = true;
                    }
                    this.worldMapRenderer.drawElements(this.centerTileX - n8 / 2, this.centerTileY - n9 / 2, n8 / 2 + this.centerTileX, n9 / 2 + this.centerTileY, n, n2, n3 + n, n2 + n4, this.field5294, this.flashingElements, this.flashCycle, this.cyclesPerFlash, bl);
                }
                this.method9742(n, n2, n3, n4, n8, n9);
                if (class30.method480() && this.field5302 && this.mouseCoord != null) {
                    this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 0xFFFF00, -1);
                }
                this.worldMapDisplayWidth = n8;
                this.worldMapDisplayHeight = n9;
                this.worldMapDisplayX = n;
                this.worldMapDisplayY = n2;
                Rasterizer2D.Rasterizer2D_setClipArray(nArray);
                if (d2 != SceneTileModel.method4068()) {
                    SceneTileModel.method4004(d2);
                }
                return;
            }
            return;
        }
        this.drawLoading(n, n2, n3, n4, n6);
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-743800921")
    public void method9843() {
        WorldMapRegion.WorldMapRegion_cachedSprites.clear();
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(IIIIIIB)Z", garbageValue="35")
    boolean method9773(int n, int n2, int n3, int n4, int n5, int n6) {
        if (this.sprite == null) {
            return true;
        }
        if (this.sprite.subWidth == n && this.sprite.subHeight == n2) {
            if (this.worldMapRenderer.pixelsPerTile != this.cachedPixelsPerTile) {
                return true;
            }
            if (this.field5298 != Client.field791) {
                return true;
            }
            if (n3 <= 0 && n4 <= 0) {
                return n3 + n < n5 || n2 + n4 < n6;
                {
                }
            }
            return true;
        }
        return true;
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(IIIIIIS)V", garbageValue="23255")
    void method9742(int n, int n2, int n3, int n4, int n5, int n6) {
        if (class184.field1975 != null) {
            int n7;
            int n8;
            int n9 = 512 / (this.worldMapRenderer.pixelsPerTile * 2);
            int n10 = n3 + 512;
            int n11 = n4 + 512;
            float f = 1.0f;
            int n12 = this.getDisplayX() - n5 / 2 - n9;
            int n13 = n - (n12 + n9 - this.minCachedTileX) * this.worldMapRenderer.pixelsPerTile;
            if (this.method9773(n10 = (int)((float)n10 / f), n11 = (int)((float)n11 / f), n13, n8 = n2 - this.worldMapRenderer.pixelsPerTile * (n9 - ((n7 = this.getDisplayY() - n6 / 2 - n9) - this.minCachedTileY)), n3, n4)) {
                if (this.sprite != null && this.sprite.subWidth == n10 && this.sprite.subHeight == n11) {
                    Arrays.fill(this.sprite.pixels, 0);
                } else {
                    this.sprite = new SpritePixels(n10, n11);
                }
                this.minCachedTileX = this.getDisplayX() - n5 / 2 - n9;
                this.minCachedTileY = this.getDisplayY() - n6 / 2 - n9;
                this.cachedPixelsPerTile = this.worldMapRenderer.pixelsPerTile;
                class184.field1975.method7945(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / f);
                this.field5298 = Client.field791;
                n13 = n - (n9 + n12 - this.minCachedTileX) * this.worldMapRenderer.pixelsPerTile;
                n8 = n2 - this.worldMapRenderer.pixelsPerTile * (n9 - (n7 - this.minCachedTileY));
            }
            Rasterizer2D.Rasterizer2D_fillRectangleAlpha(n, n2, n3, n4, 0, 128);
            if (f != 1.0f) {
                this.sprite.method10769(n13, n8, (int)((float)n10 * f), (int)((float)n11 * f), 192);
            } else {
                this.sprite.method10753(n13, n8, 192);
            }
        }
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="38")
    @Export(value="drawOverview")
    public void drawOverview(int n, int n2, int n3, int n4) {
        block2: {
            block4: {
                block3: {
                    if (!this.cacheLoader.isLoaded()) break block2;
                    if (this.worldMapRenderer.isLoaded()) break block3;
                    this.worldMapRenderer.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
                    if (!this.worldMapRenderer.isLoaded()) break block4;
                }
                this.worldMapRenderer.drawOverview(n, n2, n3, n4, this.flashingElements, this.flashCycle, this.cyclesPerFlash);
                return;
            }
            return;
        }
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="36")
    @Export(value="setZoomPercentage")
    public void setZoomPercentage(int n) {
        this.zoomTarget = this.getZoomFromPercentage(n);
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(IIIIIB)V", garbageValue="-4")
    @Export(value="drawLoading")
    void drawLoading(int n, int n2, int n3, int n4, int n5) {
        int n6 = 20;
        int n7 = n3 / 2 + n;
        int n8 = n4 / 2 + n2 - 18 - n6;
        Rasterizer2D.Rasterizer2D_fillRectangle(n, n2, n3, n4, -16777216);
        Rasterizer2D.Rasterizer2D_drawRectangle(n7 - 152, n8, 304, 34, -65536);
        Rasterizer2D.Rasterizer2D_fillRectangle(n7 - 150, n8 + 2, n5 * 3, 30, -65536);
        this.font.drawCentered("Loading...", n7, n6 + n8, -1, -1);
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(IB)F", garbageValue="6")
    @Export(value="getZoomFromPercentage")
    float getZoomFromPercentage(int n) {
        if (n == 25) {
            return 1.0f;
        }
        if (n == 37) {
            return 1.5f;
        }
        if (n == 50) {
            return 2.0f;
        }
        if (n == 75) {
            return 3.0f;
        }
        if (n == 100) {
            return 4.0f;
        }
        return 8.0f;
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-57")
    @Export(value="getZoomLevel")
    public int getZoomLevel() {
        if (1.0 == (double)this.zoomTarget) {
            return 25;
        }
        if ((double)this.zoomTarget == 1.5) {
            return 37;
        }
        if (2.0 == (double)this.zoomTarget) {
            return 50;
        }
        if ((double)this.zoomTarget == 3.0) {
            return 75;
        }
        if ((double)this.zoomTarget == 4.0) {
            return 100;
        }
        return 200;
    }

    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1064650804")
    @Export(value="loadCache")
    public void loadCache() {
        this.cacheLoader.load();
    }

    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1514325203")
    @Export(value="isCacheLoaded")
    public boolean isCacheLoaded() {
        return this.cacheLoader.isLoaded();
    }

    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(II)Lkg;", garbageValue="375796056")
    @Export(value="getMapArea")
    public WorldMapArea getMapArea(int n) {
        WorldMapArea worldMapArea;
        Iterator iterator = this.details.values().iterator();
        do {
            if (iterator.hasNext()) continue;
            return null;
        } while ((worldMapArea = (WorldMapArea)iterator.next()).getId() != n);
        return worldMapArea;
    }

    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="0")
    @Export(value="setWorldMapPositionTarget")
    public void setWorldMapPositionTarget(int n, int n2) {
        if (this.currentMapArea != null && this.currentMapArea.containsPosition(n, n2)) {
            this.worldMapTargetX = n - this.currentMapArea.getRegionLowX() * 64;
            this.worldMapTargetY = n2 - this.currentMapArea.getRegionLowY() * 64;
            return;
        }
    }

    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="-18")
    @Export(value="setWorldMapPositionTargetInstant")
    public void setWorldMapPositionTargetInstant(int n, int n2) {
        if (this.currentMapArea != null) {
            this.setWorldMapPosition(n - this.currentMapArea.getRegionLowX() * 64, n2 - this.currentMapArea.getRegionLowY() * 64, true);
            this.worldMapTargetX = -1;
            this.worldMapTargetY = -1;
            return;
        }
    }

    @ObfuscatedName(value="bz")
    @ObfuscatedSignature(descriptor="(IIIB)V", garbageValue="-86")
    @Export(value="jumpToSourceCoord")
    public void jumpToSourceCoord(int n, int n2, int n3) {
        if (this.currentMapArea != null) {
            int[] nArray = this.currentMapArea.position(n, n2, n3);
            if (nArray != null) {
                this.setWorldMapPositionTarget(nArray[0], nArray[1]);
            }
            return;
        }
    }

    @ObfuscatedName(value="bt")
    @ObfuscatedSignature(descriptor="(IIII)V", garbageValue="-2053353057")
    @Export(value="jumpToSourceCoordInstant")
    public void jumpToSourceCoordInstant(int n, int n2, int n3) {
        if (this.currentMapArea != null) {
            int[] nArray = this.currentMapArea.position(n, n2, n3);
            if (nArray != null) {
                this.setWorldMapPositionTargetInstant(nArray[0], nArray[1]);
            }
            return;
        }
    }

    @ObfuscatedName(value="bf")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-679471745")
    @Export(value="getDisplayX")
    public int getDisplayX() {
        if (this.currentMapArea != null) {
            return this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
        }
        return -1;
    }

    @ObfuscatedName(value="by")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-18")
    @Export(value="getDisplayY")
    public int getDisplayY() {
        if (this.currentMapArea != null) {
            return this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
        }
        return -1;
    }

    @ObfuscatedName(value="bm")
    @ObfuscatedSignature(descriptor="(I)Lnz;", garbageValue="455688264")
    @Export(value="getDisplayCoord")
    public Coord getDisplayCoord() {
        if (this.currentMapArea != null) {
            return this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
        }
        return null;
    }

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="499937463")
    @Export(value="getDisplayWith")
    public int getDisplayWith() {
        return this.worldMapDisplayWidth;
    }

    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1616420233")
    @Export(value="getDisplayHeight")
    public int getDisplayHeight() {
        return this.worldMapDisplayHeight;
    }

    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="52")
    @Export(value="setMaxFlashCount")
    public void setMaxFlashCount(int n) {
        if (n >= 1) {
            this.maxFlashCount = n;
        }
    }

    @ObfuscatedName(value="bv")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1385461987")
    @Export(value="resetMaxFlashCount")
    public void resetMaxFlashCount() {
        this.maxFlashCount = 3;
    }

    @ObfuscatedName(value="bq")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="78")
    @Export(value="setCyclesPerFlash")
    public void setCyclesPerFlash(int n) {
        if (n >= 1) {
            this.cyclesPerFlash = n;
        }
    }

    @ObfuscatedName(value="ba")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-1")
    @Export(value="resetCyclesPerFlash")
    public void resetCyclesPerFlash() {
        this.cyclesPerFlash = 50;
    }

    @ObfuscatedName(value="bk")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="20")
    @Export(value="setPerpetualFlash")
    public void setPerpetualFlash(boolean bl) {
        this.perpetualFlash = bl;
    }

    @ObfuscatedName(value="bs")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="21")
    @Export(value="flashElement")
    public void flashElement(int n) {
        this.flashingElements = new HashSet();
        this.flashingElements.add(n);
        this.flashCount = 0;
        this.flashCycle = 0;
    }

    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="2019182763")
    @Export(value="flashCategory")
    public void flashCategory(int n) {
        this.flashingElements = new HashSet();
        this.flashCount = 0;
        this.flashCycle = 0;
        int n2 = 0;
        while (n2 < WorldMapElement.WorldMapElement_count) {
            if (class31.WorldMapElement_get(n2) != null && class31.WorldMapElement_get((int)n2).category == n) {
                this.flashingElements.add(class31.WorldMapElement_get((int)n2).objectId);
            }
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="bo")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="65536")
    @Export(value="stopCurrentFlashes")
    public void stopCurrentFlashes() {
        this.flashingElements = null;
    }

    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="220507953")
    @Export(value="setElementsDisabled")
    public void setElementsDisabled(boolean bl) {
        this.elementsDisabled = !bl;
    }

    @ObfuscatedName(value="bn")
    @ObfuscatedSignature(descriptor="(IZI)V", garbageValue="-1807632120")
    @Export(value="disableElement")
    public void disableElement(int n, boolean bl) {
        if (bl) {
            this.enabledElements.remove(n);
        } else {
            this.enabledElements.add(n);
        }
        this.method9764();
    }

    @ObfuscatedName(value="br")
    @ObfuscatedSignature(descriptor="(IZI)V", garbageValue="121136032")
    @Export(value="setCategoryDisabled")
    public void setCategoryDisabled(int n, boolean bl) {
        if (bl) {
            this.enabledCategories.remove(n);
        } else {
            this.enabledCategories.add(n);
        }
        int n2 = 0;
        while (true) {
            if (n2 >= WorldMapElement.WorldMapElement_count) {
                this.method9764();
                return;
            }
            if (class31.WorldMapElement_get(n2) != null && class31.WorldMapElement_get((int)n2).category == n) {
                int n3 = class31.WorldMapElement_get((int)n2).objectId;
                if (bl) {
                    this.enabledElementIds.remove(n3);
                } else {
                    this.enabledElementIds.add(n3);
                }
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="bl")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="688799447")
    @Export(value="getElementsDisabled")
    public boolean getElementsDisabled() {
        return !this.elementsDisabled;
    }

    @ObfuscatedName(value="cb")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1897890849")
    @Export(value="isElementDisabled")
    public boolean isElementDisabled(int n) {
        return !this.enabledElements.contains(n);
    }

    @ObfuscatedName(value="cn")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-1555664169")
    @Export(value="isCategoryDisabled")
    public boolean isCategoryDisabled(int n) {
        return !this.enabledCategories.contains(n);
    }

    @ObfuscatedName(value="cc")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1914765206")
    void method9764() {
        this.field5294.clear();
        this.field5294.addAll(this.enabledElements);
        this.field5294.addAll(this.enabledElementIds);
    }

    @ObfuscatedName(value="co")
    @ObfuscatedSignature(descriptor="(IIIIIIB)V", garbageValue="-4")
    @Export(value="addElementMenuOptions")
    public void addElementMenuOptions(int n, int n2, int n3, int n4, int n5, int n6) {
        if (this.cacheLoader.isLoaded()) {
            int n7;
            int n8 = (int)Math.ceil((float)n3 / this.zoom);
            List list = this.worldMapRenderer.method6237(this.centerTileX - n8 / 2 - 1, this.centerTileY - (n7 = (int)Math.ceil((float)n4 / this.zoom)) / 2 - 1, n8 / 2 + this.centerTileX + 1, n7 / 2 + this.centerTileY + 1, n, n2, n3, n4, n5, n6);
            if (!list.isEmpty()) {
                Iterator iterator = list.iterator();
                block0: while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    AbstractWorldMapIcon abstractWorldMapIcon = (AbstractWorldMapIcon)iterator.next();
                    WorldMapElement worldMapElement = class31.WorldMapElement_get(abstractWorldMapIcon.getElement());
                    boolean bl = false;
                    int n9 = this.menuOpcodes.length - 1;
                    while (true) {
                        if (n9 < 0) {
                            if (!bl) continue block0;
                            return;
                        }
                        if (worldMapElement.menuActions[n9] != null) {
                            class6.method44(worldMapElement.menuActions[n9], worldMapElement.menuTargetName, this.menuOpcodes[n9], abstractWorldMapIcon.getElement(), abstractWorldMapIcon.coord1.packed(), abstractWorldMapIcon.coord2.packed());
                            bl = true;
                        }
                        --n9;
                    }
                    break;
                }
            }
            return;
        }
    }

    @ObfuscatedName(value="ca")
    @ObfuscatedSignature(descriptor="(ILnz;I)Lnz;", garbageValue="1968820504")
    public Coord method9775(int n, Coord coord) {
        if (this.cacheLoader.isLoaded()) {
            if (this.worldMapRenderer.isLoaded()) {
                if (this.currentMapArea.containsPosition(coord.x, coord.y)) {
                    HashMap hashMap = this.worldMapRenderer.buildIcons();
                    List list = (List)hashMap.get(n);
                    if (list != null && !list.isEmpty()) {
                        AbstractWorldMapIcon abstractWorldMapIcon;
                        AbstractWorldMapIcon abstractWorldMapIcon2 = null;
                        int n2 = -1;
                        Iterator iterator = list.iterator();
                        while (true) {
                            if (!iterator.hasNext()) {
                                return abstractWorldMapIcon2.coord2;
                            }
                            abstractWorldMapIcon = (AbstractWorldMapIcon)iterator.next();
                            int n3 = abstractWorldMapIcon.coord2.x - coord.x;
                            int n4 = abstractWorldMapIcon.coord2.y - coord.y;
                            int n5 = n3 * n3 + n4 * n4;
                            if (n5 == 0) break;
                            if (n5 >= n2 && abstractWorldMapIcon2 != null) continue;
                            abstractWorldMapIcon2 = abstractWorldMapIcon;
                            n2 = n5;
                        }
                        return abstractWorldMapIcon.coord2;
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @ObfuscatedName(value="cg")
    @ObfuscatedSignature(descriptor="(IILnz;Lnz;I)V", garbageValue="-1205907088")
    @Export(value="worldMapMenuAction")
    public void worldMapMenuAction(int n, int n2, Coord coord, Coord coord2) {
        ScriptEvent scriptEvent = new ScriptEvent();
        WorldMapEvent worldMapEvent = new WorldMapEvent(n2, coord, coord2);
        scriptEvent.setArgs(new Object[]{worldMapEvent});
        switch (n) {
            case 1012: {
                scriptEvent.setType(14);
                break;
            }
            case 1010: {
                scriptEvent.setType(12);
                break;
            }
            case 1008: {
                scriptEvent.setType(10);
                break;
            }
            case 1009: {
                scriptEvent.setType(11);
                break;
            }
            case 1011: {
                scriptEvent.setType(13);
            }
        }
        Friend.runScriptEvent(scriptEvent);
    }

    @ObfuscatedName(value="cp")
    @ObfuscatedSignature(descriptor="(I)Lly;", garbageValue="-206797207")
    @Export(value="iconStart")
    public AbstractWorldMapIcon iconStart() {
        if (this.cacheLoader.isLoaded()) {
            if (this.worldMapRenderer.isLoaded()) {
                HashMap hashMap = this.worldMapRenderer.buildIcons();
                this.field5255 = new LinkedList();
                Iterator iterator = hashMap.values().iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        this.iconIterator = this.field5255.iterator();
                        return this.iconNext();
                    }
                    List list = (List)iterator.next();
                    this.field5255.addAll(list);
                }
            }
            return null;
        }
        return null;
    }

    @ObfuscatedName(value="cz")
    @ObfuscatedSignature(descriptor="(B)Lly;", garbageValue="32")
    @Export(value="iconNext")
    public AbstractWorldMapIcon iconNext() {
        if (this.iconIterator != null) {
            AbstractWorldMapIcon abstractWorldMapIcon;
            do {
                if (this.iconIterator.hasNext()) continue;
                return null;
            } while ((abstractWorldMapIcon = (AbstractWorldMapIcon)this.iconIterator.next()).getElement() == -1);
            return abstractWorldMapIcon;
        }
        return null;
    }
}

