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

@ObfuscatedName(value="oh")
@Implements(value="ArchiveDiskAction")
public class ArchiveDiskAction
extends Node {
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=659066549)
    @Export(value="type")
    int type;
    @ObfuscatedName(value="ah")
    @Export(value="data")
    byte[] data;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lsh;")
    @Export(value="archiveDisk")
    ArchiveDisk archiveDisk;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lok;")
    @Export(value="archive")
    Archive archive;

    ArchiveDiskAction() {
    }
}

