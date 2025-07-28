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

@ObfuscatedName(value="ej")
@Implements(value="AttackOption")
public class AttackOption
extends Enum
implements class404 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lej;")
    @Export(value="AttackOption_dependsOnCombatLevels")
    static final /* enum */ AttackOption AttackOption_dependsOnCombatLevels = new AttackOption("runelite", 0, 0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lej;")
    static final /* enum */ AttackOption field1382 = new AttackOption("runelite", 1, 1);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lej;")
    static final /* enum */ AttackOption field1379 = new AttackOption("runelite", 2, 2);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lej;")
    static final /* enum */ AttackOption field1380 = new AttackOption("runelite", 3, 3);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lej;")
    static final /* enum */ AttackOption field1378 = new AttackOption("runelite", 4, 4);
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=474752957)
    @Export(value="id")
    final int id;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    AttackOption() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.id = var3_1;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.id;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;Lpq;ZLqw;B)V", garbageValue="-66")
    public static void method3099(AbstractArchive abstractArchive, AbstractArchive abstractArchive2, boolean bl, Font font) {
        class240.ItemDefinition_archive = abstractArchive;
        UrlRequester.ItemDefinition_modelArchive = abstractArchive2;
        WorldMapEvent.ItemDefinition_inMembersWorld = bl;
        class157.ItemDefinition_fileCount = class240.ItemDefinition_archive.getGroupFileCount(10);
        DesktopPlatformInfoProvider.field5179 = font;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lpq;Ljava/lang/String;Ljava/lang/String;I)Lvi;", garbageValue="-187850125")
    @Export(value="SpriteBuffer_getIndexedSpriteByName")
    public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive abstractArchive, String string, String string2) {
        IndexedSprite indexedSprite;
        int n;
        if (!abstractArchive.isValidFileName(string, string2)) {
            return null;
        }
        int n2 = abstractArchive.getGroupId(string);
        if (WorldMapSprite.method6397(abstractArchive, n2, n = abstractArchive.getFileId(n2, string2))) {
            IndexedSprite indexedSprite2;
            IndexedSprite indexedSprite3 = new IndexedSprite();
            indexedSprite3.width = class571.SpriteBuffer_spriteWidth;
            indexedSprite3.height = class174.SpriteBuffer_spriteHeight;
            indexedSprite3.xOffset = class241.SpriteBuffer_xOffsets[0];
            indexedSprite3.yOffset = class571.SpriteBuffer_yOffsets[0];
            indexedSprite3.subWidth = class571.SpriteBuffer_spriteWidths[0];
            indexedSprite3.subHeight = class403.SpriteBuffer_spriteHeights[0];
            indexedSprite3.palette = KeyHandler.SpriteBuffer_spritePalette;
            indexedSprite3.pixels = class240.SpriteBuffer_pixels[0];
            class241.SpriteBuffer_xOffsets = null;
            class571.SpriteBuffer_yOffsets = null;
            class571.SpriteBuffer_spriteWidths = null;
            class403.SpriteBuffer_spriteHeights = null;
            KeyHandler.SpriteBuffer_spritePalette = null;
            class240.SpriteBuffer_pixels = null;
            indexedSprite = indexedSprite2 = indexedSprite3;
        } else {
            indexedSprite = null;
        }
        return indexedSprite;
    }
}

