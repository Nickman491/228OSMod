/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="qq")
public final class class432 {
    @ObfuscatedName(value="ay")
    final Object field4785;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-322115481)
    int field4784;

    class432(Object object, int n) {
        this.field4785 = object;
        this.field4784 = n;
    }

    @ObfuscatedName(value="he")
    @ObfuscatedSignature(descriptor="(Lkx;IIZI)V", garbageValue="445127993")
    static void method8480(class261 class2612, int n, int n2, boolean bl) {
        block6: {
            block5: {
                block4: {
                    if (class2612 == null) {
                        return;
                    }
                    if (class2612.field2782 == 0) break block4;
                    int n3 = (n - 64) / 128;
                    int n4 = (n2 - 64) / 128;
                    Client.soundLocations[Client.soundEffectCount] = (n4 << 8) + class2612.field2782 + (n3 << 16);
                    break block5;
                }
                if (!bl) break block6;
                Client.soundLocations[Client.soundEffectCount] = 0;
            }
            Client.soundEffectIds[Client.soundEffectCount] = class2612.field2785;
            Client.queuedSoundEffectLoops[Client.soundEffectCount] = class2612.field2781;
            Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
            Client.soundEffects[Client.soundEffectCount] = null;
            Client.field753[Client.soundEffectCount] = class2612.field2783;
            ++Client.soundEffectCount;
            return;
        }
    }
}

