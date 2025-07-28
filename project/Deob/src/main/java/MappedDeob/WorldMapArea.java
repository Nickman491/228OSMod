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
import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kg")
@Implements(value="WorldMapArea")
public class WorldMapArea {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1318861981)
    @Export(value="id")
    int id = -1;
    @ObfuscatedName(value="ah")
    @Export(value="internalName")
    String internalName;
    @ObfuscatedName(value="az")
    @Export(value="externalName")
    String externalName;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=34779515)
    @Export(value="backGroundColor")
    int backGroundColor = -1;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-316135669)
    int field3115 = -16777216;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-366932217)
    @Export(value="zoom")
    int zoom = -1;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lnz;")
    @Export(value="origin")
    Coord origin = null;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-706980989)
    @Export(value="regionLowX")
    int regionLowX = Integer.MAX_VALUE;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=1436587615)
    @Export(value="regionHighX")
    int regionHighX = 0;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-1400082121)
    @Export(value="regionLowY")
    int regionLowY = Integer.MAX_VALUE;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-1496544063)
    @Export(value="regionHighY")
    int regionHighY = 0;
    @ObfuscatedName(value="as")
    @Export(value="isMain")
    boolean isMain = false;
    @ObfuscatedName(value="aq")
    @Export(value="sections")
    LinkedList sections;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lvy;II)V", garbageValue="1084362175")
    @Export(value="read")
    public void read(Buffer buffer, int n) {
        this.id = n;
        this.internalName = buffer.readStringCp1252NullTerminated();
        this.externalName = buffer.readStringCp1252NullTerminated();
        this.origin = new Coord(buffer.readInt());
        this.backGroundColor = buffer.readInt();
        this.field3115 = buffer.readInt();
        buffer.readUnsignedByte();
        this.isMain = buffer.readUnsignedByte() == 1;
        this.zoom = buffer.readUnsignedByte();
        int n2 = buffer.readUnsignedByte();
        this.sections = new LinkedList();
        int n3 = 0;
        while (true) {
            if (n3 >= n2) {
                this.setBounds();
                return;
            }
            this.sections.add(this.readWorldMapSection(buffer));
            ++n3;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lvy;I)Llb;", garbageValue="64957886")
    @Export(value="readWorldMapSection")
    WorldMapSection readWorldMapSection(Buffer buffer) {
        int n = buffer.readUnsignedByte();
        class404[] class404Array = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE2, WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE1, WorldMapSectionType.WORLDMAPSECTIONTYPE3};
        WorldMapSectionType worldMapSectionType = (WorldMapSectionType)StructComposition.findEnumerated(class404Array, n);
        WorldMapSection worldMapSection = null;
        switch (worldMapSectionType.type) {
            case 1: {
                worldMapSection = new WorldMapSection0();
                break;
            }
            default: {
                throw new IllegalStateException("");
            }
            case 3: {
                worldMapSection = new WorldMapSection1();
                break;
            }
            case 0: {
                worldMapSection = new WorldMapSection2();
                break;
            }
            case 2: {
                worldMapSection = new class288();
            }
        }
        worldMapSection.read(buffer);
        return worldMapSection;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIII)Z", garbageValue="2114827468")
    @Export(value="containsCoord")
    public boolean containsCoord(int n, int n2, int n3) {
        WorldMapSection worldMapSection;
        Iterator iterator = this.sections.iterator();
        do {
            if (iterator.hasNext()) continue;
            return false;
        } while (!(worldMapSection = (WorldMapSection)iterator.next()).containsCoord(n, n2, n3));
        return true;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIB)Z", garbageValue="7")
    @Export(value="containsPosition")
    public boolean containsPosition(int n, int n2) {
        int n3 = n / 64;
        int n4 = n2 / 64;
        if (n3 >= this.regionLowX && n3 <= this.regionHighX) {
            if (n4 >= this.regionLowY && n4 <= this.regionHighY) {
                WorldMapSection worldMapSection;
                Iterator iterator = this.sections.iterator();
                do {
                    if (iterator.hasNext()) continue;
                    return false;
                } while (!(worldMapSection = (WorldMapSection)iterator.next()).containsPosition(n, n2));
                return true;
            }
            return false;
        }
        return false;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IIIB)[I", garbageValue="-21")
    @Export(value="position")
    public int[] position(int n, int n2, int n3) {
        WorldMapSection worldMapSection;
        Iterator iterator = this.sections.iterator();
        do {
            if (iterator.hasNext()) continue;
            return null;
        } while (!(worldMapSection = (WorldMapSection)iterator.next()).containsCoord(n, n2, n3));
        return worldMapSection.getBorderTileLengths(n, n2, n3);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IIS)Lnz;", garbageValue="255")
    @Export(value="coord")
    public Coord coord(int n, int n2) {
        WorldMapSection worldMapSection;
        Iterator iterator = this.sections.iterator();
        do {
            if (iterator.hasNext()) continue;
            return null;
        } while (!(worldMapSection = (WorldMapSection)iterator.next()).containsPosition(n, n2));
        return worldMapSection.coord(n, n2);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-533653807")
    @Export(value="setBounds")
    void setBounds() {
        Iterator iterator = this.sections.iterator();
        while (iterator.hasNext()) {
            WorldMapSection worldMapSection = (WorldMapSection)iterator.next();
            worldMapSection.expandBounds(this);
        }
        return;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="4")
    @Export(value="getId")
    public int getId() {
        return this.id;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="737441105")
    @Export(value="getIsMain")
    public boolean getIsMain() {
        return this.isMain;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="-1003881370")
    @Export(value="getInternalName")
    public String getInternalName() {
        return this.internalName;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="1516921793")
    @Export(value="getExternalName")
    public String getExternalName() {
        return this.externalName;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-95461746")
    @Export(value="getBackGroundColor")
    int getBackGroundColor() {
        return this.backGroundColor;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-907957900")
    int method6045() {
        return this.field3115;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1606431166")
    @Export(value="getZoom")
    public int getZoom() {
        return this.zoom;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1769521116")
    @Export(value="getRegionLowX")
    public int getRegionLowX() {
        return this.regionLowX;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="10")
    @Export(value="getRegionHighX")
    public int getRegionHighX() {
        return this.regionHighX;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1701617392")
    @Export(value="getRegionLowY")
    public int getRegionLowY() {
        return this.regionLowY;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="84")
    @Export(value="getRegionHighY")
    public int getRegionHighY() {
        return this.regionHighY;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="-78")
    @Export(value="getOriginX")
    public int getOriginX() {
        return this.origin.x;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="587959186")
    @Export(value="getOriginPlane")
    public int getOriginPlane() {
        return this.origin.plane;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1028869615")
    @Export(value="getOriginY")
    public int getOriginY() {
        return this.origin.y;
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(S)Lnz;", garbageValue="326")
    @Export(value="getOrigin")
    public Coord getOrigin() {
        return new Coord(this.origin);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="([BB)V", garbageValue="-6")
    @Export(value="ByteArrayPool_release")
    public static void ByteArrayPool_release(byte[] byArray) {
        Object object = ByteArrayPool.field4883;
        synchronized (object) {
            if (byArray.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4880) {
                ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = byArray;
                return;
            }
            if (byArray.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4895) {
                ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = byArray;
                return;
            }
            if (byArray.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4888) {
                ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = byArray;
                return;
            }
            if (byArray.length == 30000 && ByteArrayPool.field4885 < ByteArrayPool.field4891) {
                ByteArrayPool.field4892[++ByteArrayPool.field4885 - 1] = byArray;
                return;
            }
            if (class225.ByteArrayPool_arrays != null) {
                for (int i = 0; i < class580.ByteArrayPool_alternativeSizes.length; ++i) {
                    if (byArray.length != class580.ByteArrayPool_alternativeSizes[i] || KitDefinition.ByteArrayPool_altSizeArrayCounts[i] >= class225.ByteArrayPool_arrays[i].length) continue;
                    int n = i;
                    int n2 = KitDefinition.ByteArrayPool_altSizeArrayCounts[n];
                    KitDefinition.ByteArrayPool_altSizeArrayCounts[n] = n2 + 1;
                    class225.ByteArrayPool_arrays[i][n2] = byArray;
                    return;
                }
            }
        }
    }
}

