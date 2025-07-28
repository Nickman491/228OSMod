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
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="er")
@Implements(value="Messages")
public class Messages {
    @ObfuscatedName(value="ay")
    @Export(value="Messages_channels")
    static final Map Messages_channels = new HashMap();
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lue;")
    @Export(value="Messages_hashTable")
    static final IterableNodeHashTable Messages_hashTable = new IterableNodeHashTable(1024);
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lpz;")
    @Export(value="Messages_queue")
    static final IterableDualNodeQueue Messages_queue = new IterableDualNodeQueue();
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1013388835)
    @Export(value="Messages_count")
    static int Messages_count = 0;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)[Loe;", garbageValue="-2")
    static GameBuild[] method3241() {
        return new GameBuild[]{GameBuild.WIP, GameBuild.RC, GameBuild.BUILDLIVE, GameBuild.LIVE};
    }
}

