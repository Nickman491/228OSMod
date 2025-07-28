/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jw")
public class class240 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="ItemDefinition_archive")
    static AbstractArchive ItemDefinition_archive;
    @ObfuscatedName(value="at")
    @Export(value="SpriteBuffer_pixels")
    public static byte[][] SpriteBuffer_pixels;

    @ObfuscatedName(value="gr")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1834354626")
    static void method5249() {
        SpriteMask.field3758 = null;
        class213.redHintArrowSprite = null;
        class155.field1709 = null;
        BuddyRankComparator.field1520 = null;
        class10.field47 = null;
        SoundSystem.field288 = null;
        class140.field1626 = null;
        ArchiveLoader.field1054 = null;
        class464.field4957 = null;
        WorldMapSection2.scrollBarSprites = null;
        FriendSystem.field829 = null;
    }

    @ObfuscatedName(value="nx")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="254663704")
    static final void method5252(int n) {
        n = Math.min(Math.max(n, 0), 127);
        class544.clientPreferences.method2967(n);
    }
}

