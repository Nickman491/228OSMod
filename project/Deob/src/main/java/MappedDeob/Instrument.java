/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cu")
@Implements(value="Instrument")
public class Instrument {
    @ObfuscatedName(value="av")
    @Export(value="Instrument_samples")
    static int[] Instrument_samples;
    @ObfuscatedName(value="ag")
    @Export(value="Instrument_noise")
    static int[] Instrument_noise;
    @ObfuscatedName(value="aw")
    @Export(value="Instrument_sine")
    static int[] Instrument_sine;
    @ObfuscatedName(value="ar")
    @Export(value="Instrument_phases")
    static int[] Instrument_phases;
    @ObfuscatedName(value="am")
    @Export(value="Instrument_delays")
    static int[] Instrument_delays;
    @ObfuscatedName(value="ap")
    @Export(value="Instrument_volumeSteps")
    static int[] Instrument_volumeSteps;
    @ObfuscatedName(value="ab")
    @Export(value="Instrument_pitchSteps")
    static int[] Instrument_pitchSteps;
    @ObfuscatedName(value="aj")
    @Export(value="Instrument_pitchBaseSteps")
    static int[] Instrument_pitchBaseSteps;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lba;")
    @Export(value="pitch")
    SoundEnvelope pitch;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lba;")
    @Export(value="volume")
    SoundEnvelope volume;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lba;")
    @Export(value="pitchModifier")
    SoundEnvelope pitchModifier;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lba;")
    @Export(value="pitchModifierAmplitude")
    SoundEnvelope pitchModifierAmplitude;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lba;")
    @Export(value="volumeMultiplier")
    SoundEnvelope volumeMultiplier;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lba;")
    @Export(value="volumeMultiplierAmplitude")
    SoundEnvelope volumeMultiplierAmplitude;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lba;")
    @Export(value="release")
    SoundEnvelope release;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lba;")
    @Export(value="attack")
    SoundEnvelope attack;
    @ObfuscatedName(value="at")
    @Export(value="oscillatorVolume")
    int[] oscillatorVolume = new int[]{0, 0, 0, 0, 0};
    @ObfuscatedName(value="ac")
    @Export(value="oscillatorPitch")
    int[] oscillatorPitch = new int[]{0, 0, 0, 0, 0};
    @ObfuscatedName(value="au")
    @Export(value="oscillatorDelays")
    int[] oscillatorDelays = new int[]{0, 0, 0, 0, 0};
    @ObfuscatedName(value="as")
    @Export(value="delayTime")
    int delayTime = 0;
    @ObfuscatedName(value="aq")
    @Export(value="delayDecay")
    int delayDecay = 100;
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Lcp;")
    @Export(value="filter")
    AudioFilter filter;
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lba;")
    @Export(value="filterEnvelope")
    SoundEnvelope filterEnvelope;
    @ObfuscatedName(value="ak")
    @Export(value="duration")
    int duration = 500;
    @ObfuscatedName(value="al")
    @Export(value="offset")
    int offset = 0;

    static {
        Instrument_noise = new int[32768];
        Random random = new Random(0L);
        int n = 0;
        while (true) {
            if (n >= 32768) {
                Instrument_sine = new int[32768];
                n = 0;
                while (true) {
                    if (n >= 32768) {
                        Instrument_samples = new int[220500];
                        Instrument_phases = new int[5];
                        Instrument_delays = new int[5];
                        Instrument_volumeSteps = new int[5];
                        Instrument_pitchSteps = new int[5];
                        Instrument_pitchBaseSteps = new int[5];
                        return;
                    }
                    Instrument.Instrument_sine[n] = (int)(Math.sin((double)n / 5215.1903) * 16384.0);
                    ++n;
                }
            }
            Instrument.Instrument_noise[n] = (random.nextInt() & 2) - 1;
            ++n;
        }
    }

    Instrument() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ay")
    @Export(value="synthesize")
    final int[] synthesize(int n, int n2) {
        class451.clearIntArray(Instrument_samples, 0, n);
        if (n2 < 10) {
            return Instrument_samples;
        }
        double d = (double)n / ((double)n2 + 0.0);
        this.pitch.reset();
        this.volume.reset();
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        if (this.pitchModifier != null) {
            this.pitchModifier.reset();
            this.pitchModifierAmplitude.reset();
            n3 = (int)((double)(this.pitchModifier.end - this.pitchModifier.start) * 32.768 / d);
            n4 = (int)((double)this.pitchModifier.start * 32.768 / d);
        }
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        if (this.volumeMultiplier != null) {
            this.volumeMultiplier.reset();
            this.volumeMultiplierAmplitude.reset();
            n6 = (int)((double)(this.volumeMultiplier.end - this.volumeMultiplier.start) * 32.768 / d);
            n7 = (int)((double)this.volumeMultiplier.start * 32.768 / d);
        }
        int n9 = 0;
        while (true) {
            if (n9 >= 5) break;
            if (this.oscillatorVolume[n9] == 0) {
            } else {
                Instrument.Instrument_phases[n9] = 0;
                Instrument.Instrument_delays[n9] = (int)((double)this.oscillatorDelays[n9] * d);
                Instrument.Instrument_volumeSteps[n9] = (this.oscillatorVolume[n9] << 14) / 100;
                Instrument.Instrument_pitchSteps[n9] = (int)((double)(this.pitch.end - this.pitch.start) * 32.768 * Math.pow(1.0057929410678534, this.oscillatorPitch[n9]) / d);
                Instrument.Instrument_pitchBaseSteps[n9] = (int)((double)this.pitch.start * 32.768 / d);
            }
            ++n9;
        }
        n9 = 0;
        block1: while (true) {
            int n10;
            int n11;
            int n12;
            int n13;
            block39: {
                int n14;
                block37: {
                    block38: {
                        block35: {
                            block36: {
                                block34: {
                                    if (n9 >= n) break block34;
                                    n13 = this.pitch.doStep(n);
                                    n12 = this.volume.doStep(n);
                                    if (this.pitchModifier == null) break block35;
                                    break block36;
                                }
                                if (this.release == null) break block37;
                                this.release.reset();
                                this.attack.reset();
                                n9 = 0;
                                n13 = 0;
                                n12 = 1;
                                break block38;
                            }
                            n11 = this.pitchModifier.doStep(n);
                            n10 = this.pitchModifierAmplitude.doStep(n);
                            n13 += this.evaluateWave(n5, n10, this.pitchModifier.form) >> 1;
                            n5 = n5 + n4 + (n11 * n3 >> 16);
                        }
                        if (this.volumeMultiplier != null) {
                            n11 = this.volumeMultiplier.doStep(n);
                            n10 = this.volumeMultiplierAmplitude.doStep(n);
                            n12 = n12 * ((this.evaluateWave(n8, n10, this.volumeMultiplier.form) >> 1) + 32768) >> 15;
                            n8 = n8 + n7 + (n11 * n6 >> 16);
                        }
                        break block39;
                    }
                    for (n11 = 0; n11 < n; ++n11) {
                        n10 = this.release.doStep(n);
                        n14 = this.attack.doStep(n);
                        n13 = n12 != 0 ? (n10 * (this.release.end - this.release.start) >> 8) + this.release.start : (n14 * (this.release.end - this.release.start) >> 8) + this.release.start;
                        if ((n9 += 256) >= n13) {
                            n9 = 0;
                            int n15 = n12 = n12 == 0 ? 1 : 0;
                        }
                        if (n12 == 0) continue;
                        Instrument.Instrument_samples[n11] = 0;
                    }
                }
                if (this.delayTime > 0 && this.delayDecay > 0) {
                    for (n13 = n9 = (int)((double)this.delayTime * d); n13 < n; ++n13) {
                        int n16 = n13;
                        Instrument_samples[n16] = Instrument_samples[n16] + Instrument_samples[n13 - n9] * this.delayDecay / 100;
                    }
                }
                if (this.filter.pairs[0] > 0 || this.filter.pairs[1] > 0) {
                    this.filterEnvelope.reset();
                    n9 = this.filterEnvelope.doStep(n + 1);
                    n13 = this.filter.compute(0, (float)n9 / 65536.0f);
                    n12 = this.filter.compute(1, (float)n9 / 65536.0f);
                    if (n >= n13 + n12) {
                        int n17;
                        int n18;
                        n11 = 0;
                        n10 = n12;
                        if (n10 > n - n13) {
                            n10 = n - n13;
                        }
                        while (true) {
                            if (n11 >= n10) break;
                            n14 = (int)((long)Instrument_samples[n11 + n13] * (long)AudioFilter.forwardMultiplier >> 16);
                            for (n18 = 0; n18 < n13; ++n18) {
                                n14 = (int)((long)Instrument_samples[n11 + n13 - 1 - n18] * (long)AudioFilter.coefficients[0][n18] >> 16) + n14;
                            }
                            for (n18 = 0; n18 < n11; n14 -= (int)((long)Instrument_samples[n11 - 1 - n18] * (long)AudioFilter.coefficients[1][n18] >> 16), ++n18) {
                            }
                            Instrument.Instrument_samples[n11] = n14;
                            n9 = this.filterEnvelope.doStep(n + 1);
                            ++n11;
                        }
                        n14 = 128;
                        n10 = 128;
                        block7: while (true) {
                            if (n10 > n - n13) {
                                n10 = n - n13;
                            }
                            while (true) {
                                if (n11 < n10) {
                                    n18 = (int)((long)Instrument_samples[n11 + n13] * (long)AudioFilter.forwardMultiplier >> 16);
                                } else {
                                    if (n11 >= n - n13) break block7;
                                    n13 = this.filter.compute(0, (float)n9 / 65536.0f);
                                    n12 = this.filter.compute(1, (float)n9 / 65536.0f);
                                    n10 += 128;
                                    continue block7;
                                }
                                for (n17 = 0; n17 < n13; ++n17) {
                                    n18 = (int)((long)Instrument_samples[n11 + n13 - 1 - n17] * (long)AudioFilter.coefficients[0][n17] >> 16) + n18;
                                }
                                for (n17 = 0; n17 < n12; n18 -= (int)((long)Instrument_samples[n11 - 1 - n17] * (long)AudioFilter.coefficients[1][n17] >> 16), ++n17) {
                                }
                                Instrument.Instrument_samples[n11] = n18;
                                n9 = this.filterEnvelope.doStep(n + 1);
                                ++n11;
                            }
                            break;
                        }
                        while (n11 < n) {
                            n18 = 0;
                            for (n17 = n11 + n13 - n; n17 < n13; ++n17) {
                                n18 = (int)((long)Instrument_samples[n11 + n13 - 1 - n17] * (long)AudioFilter.coefficients[0][n17] >> 16) + n18;
                            }
                            for (n17 = 0; n17 < n12; n18 -= (int)((long)Instrument_samples[n11 - 1 - n17] * (long)AudioFilter.coefficients[1][n17] >> 16), ++n17) {
                            }
                            Instrument.Instrument_samples[n11] = n18;
                            n9 = this.filterEnvelope.doStep(n + 1);
                            ++n11;
                        }
                    }
                }
                n9 = 0;
                while (true) {
                    if (n9 >= n) {
                        return Instrument_samples;
                    }
                    if (Instrument_samples[n9] < Short.MIN_VALUE) {
                        Instrument.Instrument_samples[n9] = Short.MIN_VALUE;
                    }
                    if (Instrument_samples[n9] > Short.MAX_VALUE) {
                        Instrument.Instrument_samples[n9] = Short.MAX_VALUE;
                    }
                    ++n9;
                }
            }
            n11 = 0;
            while (true) {
                block42: {
                    block41: {
                        block40: {
                            if (n11 >= 5) break block40;
                            if (this.oscillatorVolume[n11] != 0) break block41;
                            break block42;
                        }
                        ++n9;
                        continue block1;
                    }
                    n10 = Instrument_delays[n11] + n9;
                    if (n10 < n) {
                        int n19 = n10;
                        Instrument_samples[n19] = Instrument_samples[n19] + this.evaluateWave(Instrument_phases[n11], n12 * Instrument_volumeSteps[n11] >> 15, this.pitch.form);
                        int n20 = n11;
                        Instrument_phases[n20] = Instrument_phases[n20] + ((n13 * Instrument_pitchSteps[n11] >> 16) + Instrument_pitchBaseSteps[n11]);
                    }
                }
                ++n11;
            }
            break;
        }
    }

    @ObfuscatedName(value="ah")
    @Export(value="evaluateWave")
    final int evaluateWave(int n, int n2, int n3) {
        if (n3 != 1) {
            if (n3 == 2) {
                return Instrument_sine[n & Short.MAX_VALUE] * n2 >> 14;
            }
            if (n3 == 3) {
                return (n2 * (n & Short.MAX_VALUE) >> 14) - n2;
            }
            if (n3 == 4) {
                return n2 * Instrument_noise[n / 2607 & Short.MAX_VALUE];
            }
            return 0;
        }
        if ((n & Short.MAX_VALUE) < 16384) {
            return n2;
        }
        return -n2;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lvy;)V")
    @Export(value="decode")
    final void decode(Buffer buffer) {
        this.pitch = new SoundEnvelope();
        this.pitch.decode(buffer);
        this.volume = new SoundEnvelope();
        this.volume.decode(buffer);
        int n = buffer.readUnsignedByte();
        if (n != 0) {
            --buffer.offset;
            this.pitchModifier = new SoundEnvelope();
            this.pitchModifier.decode(buffer);
            this.pitchModifierAmplitude = new SoundEnvelope();
            this.pitchModifierAmplitude.decode(buffer);
        }
        if ((n = buffer.readUnsignedByte()) != 0) {
            --buffer.offset;
            this.volumeMultiplier = new SoundEnvelope();
            this.volumeMultiplier.decode(buffer);
            this.volumeMultiplierAmplitude = new SoundEnvelope();
            this.volumeMultiplierAmplitude.decode(buffer);
        }
        if ((n = buffer.readUnsignedByte()) != 0) {
            --buffer.offset;
            this.release = new SoundEnvelope();
            this.release.decode(buffer);
            this.attack = new SoundEnvelope();
            this.attack.decode(buffer);
        }
        int n2 = 0;
        while (true) {
            int n3;
            if (n2 >= 10 || (n3 = buffer.readUShortSmart()) == 0) {
                this.delayTime = buffer.readUShortSmart();
                this.delayDecay = buffer.readUShortSmart();
                this.duration = buffer.readUnsignedShort();
                this.offset = buffer.readUnsignedShort();
                this.filter = new AudioFilter();
                this.filterEnvelope = new SoundEnvelope();
                this.filter.method1181(buffer, this.filterEnvelope);
                return;
            }
            this.oscillatorVolume[n2] = n3;
            this.oscillatorPitch[n2] = buffer.readShortSmart();
            this.oscillatorDelays[n2] = buffer.readUShortSmart();
            ++n2;
        }
    }
}

