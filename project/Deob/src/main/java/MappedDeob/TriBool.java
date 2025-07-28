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

@ObfuscatedName(value="sb")
@Implements(value="TriBool")
public class TriBool {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lsb;")
    @Export(value="TriBool_unknown")
    public static final TriBool TriBool_unknown = new TriBool();
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lsb;")
    @Export(value="TriBool_true")
    public static final TriBool TriBool_true = new TriBool();
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lsb;")
    @Export(value="TriBool_false")
    public static final TriBool TriBool_false = new TriBool();
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lvf;")
    @Export(value="rightTitleSprite")
    static SpritePixels rightTitleSprite;

    TriBool() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)F", garbageValue="-1385881134")
    public static float method9284(int n) {
        return (float)(3.834951969714103E-4 * (double)(n &= 0x3FFF));
    }
}

