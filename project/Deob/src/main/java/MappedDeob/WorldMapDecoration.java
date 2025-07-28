/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="lx")
@Implements(value="WorldMapDecoration")
public class WorldMapDecoration {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-814245525)
    @Export(value="objectDefinitionId")
    final int objectDefinitionId;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-484641233)
    @Export(value="decoration")
    final int decoration;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=2020167799)
    @Export(value="rotation")
    final int rotation;

    WorldMapDecoration(int n, int n2, int n3) {
        this.objectDefinitionId = n;
        this.decoration = n2;
        this.rotation = n3;
    }
}

