/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jp")
public class class241
extends DualNode {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmi;")
    static EvictingDualNodeHashTable field2583 = new EvictingDualNodeHashTable(64);
    @ObfuscatedName(value="ao")
    @Export(value="SpriteBuffer_xOffsets")
    public static int[] SpriteBuffer_xOffsets;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="1218941172")
    public static int method5261(int n, int n2) {
        return (n << 8) + n2;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="878177340")
    public static void method5257() {
        ObjectComposition.ObjectDefinition_cached.clear();
        ObjectComposition.ObjectDefinition_cachedModelData.clear();
        ObjectComposition.ObjectDefinition_cachedEntities.clear();
        ObjectComposition.ObjectDefinition_cachedModels.clear();
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(Lix;IIB)Lbq;", garbageValue="0")
    public static final PcmPlayer method5262(TaskHandler taskHandler, int n, int n2) {
        if (n < 0 || n >= 2) {
            throw new IllegalArgumentException();
        }
        if (n2 < 256) {
            n2 = 256;
        }
        try {
            PcmPlayer pcmPlayer = class355.pcmPlayerProvider.player();
            pcmPlayer.samples = new int[(PcmPlayer.PcmPlayer_stereo ? 2 : 1) * 256];
            pcmPlayer.field263 = n2;
            pcmPlayer.init();
            pcmPlayer.capacity = (n2 & 0xFFFFFC00) + 1024;
            if (pcmPlayer.capacity > 16384) {
                pcmPlayer.capacity = 16384;
            }
            pcmPlayer.open(pcmPlayer.capacity);
            if (class328.field3605 > 0 && DefaultsGroup.soundSystem == null) {
                DefaultsGroup.soundSystem = new SoundSystem();
                PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1);
                PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(DefaultsGroup.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
            }
            if (DefaultsGroup.soundSystem != null) {
                if (DefaultsGroup.soundSystem.players[n] != null) {
                    throw new IllegalArgumentException();
                }
                DefaultsGroup.soundSystem.players[n] = pcmPlayer;
            }
            return pcmPlayer;
        }
        catch (Throwable throwable) {
            return new PcmPlayer();
        }
    }
}

