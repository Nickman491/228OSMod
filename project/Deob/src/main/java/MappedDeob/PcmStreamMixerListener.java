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

@ObfuscatedName(value="ca")
@Implements(value="PcmStreamMixerListener")
public abstract class PcmStreamMixerListener
extends Node {
    @ObfuscatedName(value="ay")
    int field374;

    @ObfuscatedName(value="ay")
    @Export(value="remove2")
    abstract void remove2();

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lbp;)I")
    @Export(value="update")
    abstract int update();
}

