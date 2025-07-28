/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jb")
public class class243
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmi;")
    static EvictingDualNodeHashTable field2599 = new EvictingDualNodeHashTable(64);
    @ObfuscatedName(value="pm")
    @ObfuscatedGetter(intValue=664650581)
    @Export(value="widgetDragDuration")
    static int widgetDragDuration;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;Lpq;Lpq;I)V", garbageValue="390023160")
    public static void method5285(AbstractArchive abstractArchive, AbstractArchive abstractArchive2, AbstractArchive abstractArchive3) {
        SequenceDefinition.SequenceDefinition_archive = abstractArchive;
        SequenceDefinition.SequenceDefinition_animationsArchive = abstractArchive2;
        class466.SequenceDefinition_skeletonsArchive = abstractArchive3;
    }
}

