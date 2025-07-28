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

@ObfuscatedName(value="kz")
@Implements(value="WorldMapLabelSize")
public class WorldMapLabelSize {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lkz;")
    @Export(value="WorldMapLabelSize_small")
    public static final WorldMapLabelSize WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lkz;")
    @Export(value="WorldMapLabelSize_medium")
    public static final WorldMapLabelSize WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lkz;")
    @Export(value="WorldMapLabelSize_large")
    public static final WorldMapLabelSize WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0);
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lgq;")
    static ClanSettings field3082;
    @ObfuscatedName(value="sw")
    @ObfuscatedSignature(descriptor="Lwk;")
    @Export(value="privateChatMode")
    static PrivateChatMode privateChatMode;
    @ObfuscatedName(value="sm")
    @ObfuscatedSignature(descriptor="Lsa;")
    @Export(value="friendsChat")
    static FriendsChat friendsChat;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1750753491)
    final int field3078;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1318030643)
    final int field3081;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-164667467)
    final int field3079;

    WorldMapLabelSize(int n, int n2, int n3) {
        this.field3078 = n;
        this.field3081 = n2;
        this.field3079 = n3;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(FI)Z", garbageValue="-394087721")
    boolean method5991(float f) {
        return f >= (float)this.field3079;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Lkz;", garbageValue="-1934432977")
    static WorldMapLabelSize method5992(int n) {
        WorldMapLabelSize[] worldMapLabelSizeArray;
        WorldMapLabelSize[] worldMapLabelSizeArray2 = worldMapLabelSizeArray = new WorldMapLabelSize[]{WorldMapLabelSize_medium, WorldMapLabelSize_large, WorldMapLabelSize_small};
        int n2 = 0;
        while (n2 < worldMapLabelSizeArray2.length) {
            WorldMapLabelSize worldMapLabelSize = worldMapLabelSizeArray2[n2];
            if (n == worldMapLabelSize.field3081) {
                return worldMapLabelSize;
            }
            ++n2;
        }
        return null;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(B)Lcx;", garbageValue="-86")
    @Export(value="worldListStart")
    static World worldListStart() {
        World.World_listCount = 0;
        return class329.getNextWorldListWorld();
    }
}

