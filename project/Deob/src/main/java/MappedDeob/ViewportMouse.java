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

@ObfuscatedName(value="hc")
@Implements(value="ViewportMouse")
public class ViewportMouse {
    @ObfuscatedName(value="ay")
    @Export(value="ViewportMouse_isInViewport")
    static boolean ViewportMouse_isInViewport = false;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=817069503)
    @Export(value="ViewportMouse_x")
    static int ViewportMouse_x = 0;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1688319745)
    @Export(value="ViewportMouse_y")
    static int ViewportMouse_y = 0;
    @ObfuscatedName(value="ao")
    @Export(value="ViewportMouse_false0")
    static boolean ViewportMouse_false0 = false;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1882311153)
    static int field2267;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1552819489)
    static int field2262;
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Lqh;")
    public static class426 field2268;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-1009263401)
    @Export(value="ViewportMouse_entityCount")
    static int ViewportMouse_entityCount;
    @ObfuscatedName(value="ak")
    @Export(value="ViewportMouse_entityTags")
    public static long[] ViewportMouse_entityTags;

    static {
        field2268 = new class426();
        ViewportMouse_entityCount = 0;
        ViewportMouse_entityTags = new long[1000];
    }
}

