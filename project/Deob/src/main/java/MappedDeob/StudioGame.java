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

@ObfuscatedName(value="ol")
@Implements(value="StudioGame")
public class StudioGame
extends Enum
implements class404 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lol;")
    @Export(value="runescape")
    public static final /* enum */ StudioGame runescape = new StudioGame("runelite", 0, "runescape", "RuneScape", 0);
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lol;")
    @Export(value="stellardawn")
    public static final /* enum */ StudioGame stellardawn = new StudioGame("runelite", 1, "stellardawn", "Stellar Dawn", 1);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lol;")
    @Export(value="game3")
    public static final /* enum */ StudioGame game3 = new StudioGame("runelite", 2, "game3", "Game 3", 2);
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lol;")
    @Export(value="game4")
    public static final /* enum */ StudioGame game4 = new StudioGame("runelite", 3, "game4", "Game 4", 3);
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lol;")
    @Export(value="game5")
    public static final /* enum */ StudioGame game5 = new StudioGame("runelite", 4, "game5", "Game 5", 4);
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lol;")
    @Export(value="oldscape")
    public static final /* enum */ StudioGame oldscape = new StudioGame("runelite", 5, "oldscape", "RuneScape 2007", 5);
    @ObfuscatedName(value="ae")
    @Export(value="name")
    public final String name;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-157847499)
    @Export(value="id")
    final int id;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    StudioGame(int n) {
        void var5_-1;
        void var1_-1;
        this.name = (String)n;
        this.id = var5_-1;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="118")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        return this.id;
    }
}

