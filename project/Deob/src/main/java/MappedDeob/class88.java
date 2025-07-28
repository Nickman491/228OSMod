/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dg")
public class class88 {
    @ObfuscatedName(value="fa")
    @ObfuscatedSignature(descriptor="Lok;")
    static Archive field1069;

    @ObfuscatedName(value="ca")
    @ObfuscatedSignature(descriptor="(ILnz;ZB)V", garbageValue="32")
    static void method2612(int n, Coord coord, boolean bl) {
        WorldMapArea worldMapArea = Canvas.getWorldMap().getMapArea(n);
        int n2 = ModeWhere.localPlayer.plane;
        int n3 = (ModeWhere.localPlayer.x >> 7) + GameEngine.field189.field1324;
        int n4 = (ModeWhere.localPlayer.field1196 >> 7) + GameEngine.field189.field1325;
        Coord coord2 = new Coord(n2, n3, n4);
        Canvas.getWorldMap().method9736(worldMapArea, coord2, coord, bl);
    }
}

