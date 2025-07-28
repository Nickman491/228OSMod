/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="hf")
@Implements(value="TextureLoader")
public interface TextureLoader {
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(II)[I", garbageValue="-294472347")
    @Export(value="getTexturePixels")
    public int[] getTexturePixels(int var1);

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="667540605")
    @Export(value="getAverageTextureRGB")
    public int getAverageTextureRGB(int var1);

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1748706073")
    public boolean vmethod4810(int var1);

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="2020085258")
    @Export(value="isLowDetail")
    public boolean isLowDetail(int var1);
}

