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

@ObfuscatedName(value="sm")
public class class481 {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lks;")
    final class274 field5037 = new class274();
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-417408189)
    int field5038;

    class481() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="hi")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="224190195")
    static final void method9355() {
        int n = 0;
        while (true) {
            block10: {
                block8: {
                    RawSound rawSound;
                    RawPcmStream rawPcmStream;
                    int n2;
                    SoundEffect soundEffect;
                    block14: {
                        int n3;
                        int n4;
                        int n5;
                        block12: {
                            block13: {
                                block11: {
                                    block9: {
                                        block6: {
                                            block7: {
                                                block5: {
                                                    if (n >= Client.soundEffectCount) break block5;
                                                    int n6 = n;
                                                    Client.queuedSoundEffectDelays[n6] = Client.queuedSoundEffectDelays[n6] - 1;
                                                    if (Client.queuedSoundEffectDelays[n] >= -10) break block6;
                                                    break block7;
                                                }
                                                if (!Client.playingJingle) return;
                                                if (!class333.field3629.isEmpty()) {
                                                    return;
                                                }
                                                n = !class333.field3623.isEmpty() && class333.field3623.get(0) != null && ((class345)class333.field3623.get((int)0)).field3743 != null ? (int)(((class345)class333.field3623.get((int)0)).field3743.isReady() ? 1 : 0) : 0;
                                                if (n != 0) return;
                                                if (class544.clientPreferences.method2896() != 0 && class153.method3620()) {
                                                    class96.method2709(class544.field5399, class544.clientPreferences.method2896());
                                                }
                                                Client.playingJingle = false;
                                                return;
                                            }
                                            --Client.soundEffectCount;
                                            break block8;
                                        }
                                        soundEffect = Client.soundEffects[n];
                                        if (soundEffect != null) break block9;
                                        soundEffect = SoundEffect.readSoundEffect(World.field815, Client.soundEffectIds[n], 0);
                                        if (soundEffect == null) break block10;
                                        int n7 = n;
                                        Client.queuedSoundEffectDelays[n7] = Client.queuedSoundEffectDelays[n7] + soundEffect.calculateDelay();
                                        Client.soundEffects[n] = soundEffect;
                                    }
                                    if (Client.queuedSoundEffectDelays[n] >= 0) break block10;
                                    if (Client.soundLocations[n] == 0) break block11;
                                    n5 = (Client.soundLocations[n] & 0xFF) * 128;
                                    int n8 = Client.soundLocations[n] >> 16 & 0xFF;
                                    int n9 = Math.abs(Coord.method6980(n8) - ModeWhere.localPlayer.x);
                                    int n10 = Client.soundLocations[n] >> 8 & 0xFF;
                                    int n11 = Math.abs(Coord.method6980(n10) - ModeWhere.localPlayer.field1196);
                                    n4 = Math.max(n11 + n9 - 128, 0);
                                    n3 = Math.max(((Client.field753[n] & 0x1F) - 1) * 128, 0);
                                    if (n4 < n5) break block12;
                                    break block13;
                                }
                                n2 = class544.clientPreferences.method2898();
                                break block14;
                            }
                            Client.queuedSoundEffectDelays[n] = -100;
                            break block10;
                        }
                        float f = n3 < n5 ? Math.min(Math.max((float)(n5 - n4) / (float)(n5 - n3), 0.0f), 1.0f) : 1.0f;
                        n2 = (int)(f * (float)class544.clientPreferences.method2900());
                    }
                    if (n2 > 0 && (rawPcmStream = RawPcmStream.createRawPcmStream(rawSound = soundEffect.toRawSound().resample(Message.decimator), 100, n2)) != null) {
                        rawPcmStream.setNumLoops(Client.queuedSoundEffectLoops[n] - 1);
                        UserList.pcmStreamMixer.addSubStream(rawPcmStream);
                    }
                    Client.queuedSoundEffectDelays[n] = -100;
                    break block10;
                }
                for (int i = n; i < Client.soundEffectCount; ++i) {
                    Client.soundEffectIds[i] = Client.soundEffectIds[i + 1];
                    Client.soundEffects[i] = Client.soundEffects[i + 1];
                    Client.queuedSoundEffectLoops[i] = Client.queuedSoundEffectLoops[i + 1];
                    Client.queuedSoundEffectDelays[i] = Client.queuedSoundEffectDelays[i + 1];
                    Client.soundLocations[i] = Client.soundLocations[i + 1];
                    Client.field753[i] = Client.field753[i + 1];
                }
                --n;
            }
            ++n;
        }
    }
}

