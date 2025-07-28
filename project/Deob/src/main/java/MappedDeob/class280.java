/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kw")
public class class280 {
    @ObfuscatedName(value="id")
    @ObfuscatedSignature(descriptor="Lez;")
    @Export(value="urlRequester")
    static UrlRequester urlRequester;
    @ObfuscatedName(value="ua")
    @ObfuscatedGetter(intValue=225791087)
    static int field3067;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1327755477")
    @Export(value="loadWorlds")
    static boolean loadWorlds() {
        try {
            if (class149.World_request == null) {
                class149.World_request = urlRequester.request(new URL(class28.field121));
            } else if (class149.World_request.isDone()) {
                byte[] byArray = class149.World_request.getResponse();
                Buffer buffer = new Buffer(byArray);
                buffer.readInt();
                World.World_count = buffer.readUnsignedShort();
                World.World_worlds = new World[World.World_count];
                int n = 0;
                while (n < World.World_count) {
                    World world = World.World_worlds[n] = new World();
                    world.id = buffer.readUnsignedShort();
                    world.properties = buffer.readInt();
                    world.host = buffer.readStringCp1252NullTerminated();
                    world.activity = buffer.readStringCp1252NullTerminated();
                    world.location = buffer.readUnsignedByte();
                    world.population = buffer.readShort();
                    world.index = n++;
                }
                class159.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
                class149.World_request = null;
                return true;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            class149.World_request = null;
        }
        return false;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ldz;IIIII)V", garbageValue="-1976368708")
    static final void method5989(class103 class1032, int n, int n2, int n3, int n4) {
        int[][][] nArray = class1032.field1328;
        int n5 = class1032.field1322 - 1;
        int n6 = class1032.field1323 - 1;
        int n7 = n2;
        while (n7 <= n2 + n4) {
            for (int i = n; i <= n3 + n; ++i) {
                if (i < 0 || i >= nArray[0].length - 1 || n7 < 0 || n7 >= nArray[0][0].length - 1) continue;
                Tiles.Tiles_underlays2[0][i][n7] = 127;
                if (i == n && i > 0) {
                    nArray[0][i][n7] = nArray[0][i - 1][n7];
                }
                if (i == n3 + n && i < n5) {
                    nArray[0][i][n7] = nArray[0][i + 1][n7];
                }
                if (n7 == n2 && n7 > 0) {
                    nArray[0][i][n7] = nArray[0][i][n7 - 1];
                }
                if (n2 + n4 != n7 || n7 >= n6) continue;
                nArray[0][i][n7] = nArray[0][i][n7 + 1];
            }
            ++n7;
        }
        return;
    }
}

