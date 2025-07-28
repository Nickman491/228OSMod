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

@ObfuscatedName(value="be")
@Implements(value="RawPcmStream")
public class RawPcmStream
extends PcmStream {
    @ObfuscatedName(value="ay")
    int field318;
    @ObfuscatedName(value="ah")
    int field309;
    @ObfuscatedName(value="az")
    int field310;
    @ObfuscatedName(value="ao")
    int field311;
    @ObfuscatedName(value="ad")
    int field312;
    @ObfuscatedName(value="an")
    int field321;
    @ObfuscatedName(value="ae")
    int field314;
    @ObfuscatedName(value="ax")
    @Export(value="numLoops")
    int numLoops;
    @ObfuscatedName(value="at")
    @Export(value="start")
    int start;
    @ObfuscatedName(value="ac")
    @Export(value="end")
    int end;
    @ObfuscatedName(value="au")
    boolean field322;
    @ObfuscatedName(value="as")
    int field319;
    @ObfuscatedName(value="aq")
    int field320;
    @ObfuscatedName(value="af")
    int field308;
    @ObfuscatedName(value="aa")
    int field316;

    @ObfuscatedSignature(descriptor="(Lbc;III)V")
    RawPcmStream(RawSound rawSound, int n, int n2, int n3) {
        this.sound = rawSound;
        this.start = rawSound.start;
        this.end = rawSound.end;
        this.field322 = rawSound.field244;
        this.field309 = n;
        this.field310 = n2;
        this.field311 = n3;
        this.field318 = 0;
        this.method912();
    }

    @ObfuscatedSignature(descriptor="(Lbc;II)V")
    RawPcmStream(RawSound rawSound, int n, int n2) {
        this.sound = rawSound;
        this.start = rawSound.start;
        this.end = rawSound.end;
        this.field322 = rawSound.field244;
        this.field309 = n;
        this.field310 = n2;
        this.field311 = 8192;
        this.field318 = 0;
        this.method912();
    }

    @ObfuscatedName(value="ad")
    void method912() {
        this.field312 = this.field310;
        this.field321 = RawPcmStream.method980(this.field310, this.field311);
        this.field314 = RawPcmStream.method920(this.field310, this.field311);
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="()Lbn;")
    @Export(value="firstSubStream")
    protected PcmStream firstSubStream() {
        return null;
    }

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="()Lbn;")
    @Export(value="nextSubStream")
    protected PcmStream nextSubStream() {
        return null;
    }

    @Override
    @ObfuscatedName(value="ax")
    protected int vmethod6927() {
        if (this.field310 == 0 && this.field319 == 0) {
            return 0;
        }
        return 1;
    }

    @Override
    @ObfuscatedName(value="at")
    @Export(value="fill")
    public synchronized void fill(int[] nArray, int n, int n2) {
        block32: {
            block34: {
                int n3;
                int n4;
                int n5;
                int n6;
                RawSound rawSound;
                block35: {
                    int n7;
                    block36: {
                        block38: {
                            block37: {
                                block33: {
                                    block31: {
                                        if (this.field310 == 0 && this.field319 == 0) {
                                            this.skip(n2);
                                            return;
                                        }
                                        rawSound = (RawSound)this.sound;
                                        n6 = this.start << 8;
                                        n5 = this.end << 8;
                                        n7 = rawSound.samples.length << 8;
                                        n4 = n5 - n6;
                                        if (n4 <= 0) {
                                            this.numLoops = 0;
                                        }
                                        n3 = n;
                                        n2 += n;
                                        if (this.field318 >= 0) break block31;
                                        if (this.field309 <= 0) break block32;
                                        this.field318 = 0;
                                    }
                                    if (this.field318 < n7) break block33;
                                    if (this.field309 >= 0) break block34;
                                    this.field318 = n7 - 1;
                                }
                                if (this.numLoops < 0) break block35;
                                if (this.numLoops <= 0) break block36;
                                if (this.field322) break block37;
                                if (this.field309 >= 0) {
                                    while (true) {
                                        n3 = this.method934(nArray, n3, n5, n2, rawSound.samples[this.start]);
                                        if (this.field318 < n5) {
                                            return;
                                        }
                                        int n8 = (this.field318 - n6) / n4;
                                        if (n8 >= this.numLoops) break;
                                        this.field318 -= n4 * n8;
                                        this.numLoops -= n8;
                                    }
                                    this.field318 -= n4 * this.numLoops;
                                    this.numLoops = 0;
                                } else {
                                    while (true) {
                                        n3 = this.method968(nArray, n3, n6, n2, rawSound.samples[this.end - 1]);
                                        if (this.field318 >= n6) {
                                            return;
                                        }
                                        int n9 = (n5 - 1 - this.field318) / n4;
                                        if (n9 >= this.numLoops) break;
                                        this.field318 += n4 * n9;
                                        this.numLoops -= n9;
                                    }
                                    this.field318 += n4 * this.numLoops;
                                    this.numLoops = 0;
                                }
                                break block36;
                            }
                            if (this.field309 >= 0) break block38;
                            n3 = this.method968(nArray, n3, n6, n2, rawSound.samples[this.start]);
                            if (this.field318 >= n6) {
                                return;
                            }
                            this.field318 = n6 + n6 - 1 - this.field318;
                            this.field309 = -this.field309;
                            if (--this.numLoops == 0) break block36;
                        }
                        do {
                            n3 = this.method934(nArray, n3, n5, n2, rawSound.samples[this.end - 1]);
                            if (this.field318 < n5) {
                                return;
                            }
                            this.field318 = n5 + n5 - 1 - this.field318;
                            this.field309 = -this.field309;
                            if (--this.numLoops == 0) break;
                            n3 = this.method968(nArray, n3, n6, n2, rawSound.samples[this.start]);
                            if (this.field318 >= n6) {
                                return;
                            }
                            this.field318 = n6 + n6 - 1 - this.field318;
                            this.field309 = -this.field309;
                        } while (--this.numLoops != 0);
                    }
                    if (this.field309 >= 0) {
                        this.method934(nArray, n3, n7, n2, 0);
                        if (this.field318 >= n7) {
                            this.field318 = n7;
                            this.method909();
                            this.remove();
                        }
                    } else {
                        this.method968(nArray, n3, 0, n2, 0);
                        if (this.field318 < 0) {
                            this.field318 = -1;
                            this.method909();
                            this.remove();
                        }
                    }
                    return;
                }
                if (!this.field322) {
                    if (this.field309 >= 0) {
                        while (true) {
                            n3 = this.method934(nArray, n3, n5, n2, rawSound.samples[this.start]);
                            if (this.field318 < n5) {
                                return;
                            }
                            this.field318 = n6 + (this.field318 - n6) % n4;
                        }
                    }
                    while (true) {
                        n3 = this.method968(nArray, n3, n6, n2, rawSound.samples[this.end - 1]);
                        if (this.field318 >= n6) {
                            return;
                        }
                        this.field318 = n5 - 1 - (n5 - 1 - this.field318) % n4;
                    }
                }
                if (this.field309 < 0) {
                    n3 = this.method968(nArray, n3, n6, n2, rawSound.samples[this.start]);
                    if (this.field318 >= n6) {
                        return;
                    }
                    this.field318 = n6 + n6 - 1 - this.field318;
                    this.field309 = -this.field309;
                }
                while (true) {
                    n3 = this.method934(nArray, n3, n5, n2, rawSound.samples[this.end - 1]);
                    if (this.field318 < n5) {
                        return;
                    }
                    this.field318 = n5 + n5 - 1 - this.field318;
                    this.field309 = -this.field309;
                    n3 = this.method968(nArray, n3, n6, n2, rawSound.samples[this.start]);
                    if (this.field318 >= n6) {
                        return;
                    }
                    this.field318 = n6 + n6 - 1 - this.field318;
                    this.field309 = -this.field309;
                }
            }
            this.method909();
            this.remove();
            return;
        }
        this.method909();
        this.remove();
    }

    @ObfuscatedName(value="ac")
    @Export(value="setNumLoops")
    public synchronized void setNumLoops(int n) {
        this.numLoops = n;
    }

    @Override
    @ObfuscatedName(value="au")
    @Export(value="skip")
    public synchronized void skip(int n) {
        block34: {
            block36: {
                int n2;
                int n3;
                int n4;
                block37: {
                    int n5;
                    block38: {
                        block44: {
                            block39: {
                                block43: {
                                    block42: {
                                        block40: {
                                            block41: {
                                                block35: {
                                                    block33: {
                                                        if (this.field319 > 0) {
                                                            if (n < this.field319) {
                                                                this.field312 += this.field320 * n;
                                                                this.field321 += this.field308 * n;
                                                                this.field314 += this.field316 * n;
                                                                this.field319 -= n;
                                                            } else {
                                                                if (this.field310 == Integer.MIN_VALUE) {
                                                                    this.field310 = 0;
                                                                    this.field314 = 0;
                                                                    this.field321 = 0;
                                                                    this.field312 = 0;
                                                                    this.remove();
                                                                    n = this.field319;
                                                                }
                                                                this.field319 = 0;
                                                                this.method912();
                                                            }
                                                        }
                                                        RawSound rawSound = (RawSound)this.sound;
                                                        n4 = this.start << 8;
                                                        n3 = this.end << 8;
                                                        n5 = rawSound.samples.length << 8;
                                                        n2 = n3 - n4;
                                                        if (n2 <= 0) {
                                                            this.numLoops = 0;
                                                        }
                                                        if (this.field318 >= 0) break block33;
                                                        if (this.field309 <= 0) break block34;
                                                        this.field318 = 0;
                                                    }
                                                    if (this.field318 < n5) break block35;
                                                    if (this.field309 >= 0) break block36;
                                                    this.field318 = n5 - 1;
                                                }
                                                this.field318 += this.field309 * n;
                                                if (this.numLoops < 0) break block37;
                                                if (this.numLoops <= 0) break block38;
                                                if (this.field322) break block39;
                                                if (this.field309 < 0) break block40;
                                                if (this.field318 < n3) {
                                                    return;
                                                }
                                                int n6 = (this.field318 - n4) / n2;
                                                if (n6 >= this.numLoops) break block41;
                                                this.field318 -= n2 * n6;
                                                this.numLoops -= n6;
                                                break block42;
                                            }
                                            this.field318 -= n2 * this.numLoops;
                                            this.numLoops = 0;
                                            break block38;
                                        }
                                        if (this.field318 >= n4) {
                                            return;
                                        }
                                        int n7 = (n3 - 1 - this.field318) / n2;
                                        if (n7 >= this.numLoops) break block43;
                                        this.field318 += n2 * n7;
                                        this.numLoops -= n7;
                                    }
                                    return;
                                }
                                this.field318 += n2 * this.numLoops;
                                this.numLoops = 0;
                                break block38;
                            }
                            if (this.field309 >= 0) break block44;
                            if (this.field318 >= n4) {
                                return;
                            }
                            this.field318 = n4 + n4 - 1 - this.field318;
                            this.field309 = -this.field309;
                            if (--this.numLoops == 0) break block38;
                        }
                        do {
                            if (this.field318 < n3) {
                                return;
                            }
                            this.field318 = n3 + n3 - 1 - this.field318;
                            this.field309 = -this.field309;
                            if (--this.numLoops == 0) break;
                            if (this.field318 >= n4) {
                                return;
                            }
                            this.field318 = n4 + n4 - 1 - this.field318;
                            this.field309 = -this.field309;
                        } while (--this.numLoops != 0);
                    }
                    if (this.field309 >= 0) {
                        if (this.field318 >= n5) {
                            this.field318 = n5;
                            this.method909();
                            this.remove();
                        }
                    } else if (this.field318 < 0) {
                        this.field318 = -1;
                        this.method909();
                        this.remove();
                    }
                    return;
                }
                if (!this.field322) {
                    if (this.field309 >= 0) {
                        if (this.field318 < n3) {
                            return;
                        }
                        this.field318 = n4 + (this.field318 - n4) % n2;
                    } else {
                        if (this.field318 >= n4) {
                            return;
                        }
                        this.field318 = n3 - 1 - (n3 - 1 - this.field318) % n2;
                    }
                    return;
                }
                if (this.field309 < 0) {
                    if (this.field318 >= n4) {
                        return;
                    }
                    this.field318 = n4 + n4 - 1 - this.field318;
                    this.field309 = -this.field309;
                }
                while (true) {
                    if (this.field318 < n3) {
                        return;
                    }
                    this.field318 = n3 + n3 - 1 - this.field318;
                    this.field309 = -this.field309;
                    if (this.field318 >= n4) {
                        return;
                    }
                    this.field318 = n4 + n4 - 1 - this.field318;
                    this.field309 = -this.field309;
                }
            }
            this.method909();
            this.remove();
            return;
        }
        this.method909();
        this.remove();
    }

    @ObfuscatedName(value="as")
    public synchronized void method914(int n) {
        this.method916(n << 6, this.method918());
    }

    @ObfuscatedName(value="aq")
    synchronized void method915(int n) {
        this.method916(n, this.method918());
    }

    @ObfuscatedName(value="af")
    synchronized void method916(int n, int n2) {
        this.field310 = n;
        this.field311 = n2;
        this.field319 = 0;
        this.method912();
    }

    @ObfuscatedName(value="aa")
    public synchronized int method922() {
        return this.field310 == Integer.MIN_VALUE ? 0 : this.field310;
    }

    @ObfuscatedName(value="ak")
    public synchronized int method918() {
        return this.field311 < 0 ? -1 : this.field311;
    }

    @ObfuscatedName(value="al")
    public synchronized void method1050(int n) {
        int n2 = ((RawSound)this.sound).samples.length << 8;
        if (n < -1) {
            n = -1;
        }
        if (n > n2) {
            n = n2;
        }
        this.field318 = n;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(Z)V", garbageValue="1")
    public synchronized void method974() {
        this.field309 = (this.field309 ^ this.field309 >> 31) + (this.field309 >>> 31);
        this.field309 = -this.field309;
    }

    @ObfuscatedName(value="ag")
    void method909() {
        if (this.field319 != 0) {
            if (this.field310 == Integer.MIN_VALUE) {
                this.field310 = 0;
            }
            this.field319 = 0;
            this.method912();
        }
    }

    @ObfuscatedName(value="aw")
    public synchronized void method950(int n, int n2) {
        this.method1008(n, n2, this.method918());
    }

    @ObfuscatedName(value="ai")
    public synchronized void method1008(int n, int n2, int n3) {
        if (n != 0) {
            int n4 = RawPcmStream.method980(n2, n3);
            int n5 = RawPcmStream.method920(n2, n3);
            if (n4 != this.field321 || n5 != this.field314) {
                int n6 = n2 - this.field312;
                if (this.field312 - n2 > n6) {
                    n6 = this.field312 - n2;
                }
                if (n4 - this.field321 > n6) {
                    n6 = n4 - this.field321;
                }
                if (this.field321 - n4 > n6) {
                    n6 = this.field321 - n4;
                }
                if (n5 - this.field314 > n6) {
                    n6 = n5 - this.field314;
                }
                if (this.field314 - n5 > n6) {
                    n6 = this.field314 - n5;
                }
                if (n > n6) {
                    n = n6;
                }
                this.field319 = n;
                this.field310 = n2;
                this.field311 = n3;
                this.field320 = (n2 - this.field312) / n;
                this.field308 = (n4 - this.field321) / n;
                this.field316 = (n5 - this.field314) / n;
                return;
            }
            this.field319 = 0;
            return;
        }
        this.method916(n2, n3);
    }

    @ObfuscatedName(value="ar")
    public synchronized void method924(int n) {
        if (n != 0) {
            if (this.field321 == 0 && this.field314 == 0) {
                this.field319 = 0;
                this.field310 = 0;
                this.field312 = 0;
                this.remove();
                return;
            }
            int n2 = -this.field312;
            if (this.field312 > n2) {
                n2 = this.field312;
            }
            if (-this.field321 > n2) {
                n2 = -this.field321;
            }
            if (this.field321 > n2) {
                n2 = this.field321;
            }
            if (-this.field314 > n2) {
                n2 = -this.field314;
            }
            if (this.field314 > n2) {
                n2 = this.field314;
            }
            if (n > n2) {
                n = n2;
            }
            this.field319 = n;
            this.field310 = Integer.MIN_VALUE;
            this.field320 = -this.field312 / n;
            this.field308 = -this.field321 / n;
            this.field316 = -this.field314 / n;
            return;
        }
        this.method915(0);
        this.remove();
    }

    @ObfuscatedName(value="am")
    public synchronized void method1040(int n) {
        this.field309 = this.field309 < 0 ? -n : n;
    }

    @ObfuscatedName(value="bz")
    public synchronized int method926() {
        return this.field309 < 0 ? -this.field309 : this.field309;
    }

    @ObfuscatedName(value="bt")
    public boolean method927() {
        return this.field318 < 0 || this.field318 >= ((RawSound)this.sound).samples.length << 8;
    }

    @ObfuscatedName(value="bp")
    public boolean method928() {
        return this.field319 != 0;
    }

    @ObfuscatedName(value="bg")
    int method934(int[] nArray, int n, int n2, int n3, int n4) {
        do {
            if (this.field319 <= 0) {
                if (this.field309 == 256 && (this.field318 & 0xFF) == 0) {
                    if (PcmPlayer.PcmPlayer_stereo) {
                        return RawPcmStream.method919(0, ((RawSound)this.sound).samples, nArray, this.field318, n, this.field321, this.field314, 0, n3, n2, this);
                    }
                    return RawPcmStream.method933(((RawSound)this.sound).samples, nArray, this.field318, n, this.field312, 0, n3, n2, this);
                }
                if (PcmPlayer.PcmPlayer_stereo) {
                    return RawPcmStream.method1018(0, 0, ((RawSound)this.sound).samples, nArray, this.field318, n, this.field321, this.field314, 0, n3, n2, this, this.field309, n4);
                }
                return RawPcmStream.method1043(0, 0, ((RawSound)this.sound).samples, nArray, this.field318, n, this.field312, 0, n3, n2, this, this.field309, n4);
            }
            int n5 = n + this.field319;
            if (n5 > n3) {
                n5 = n3;
            }
            this.field319 += n;
            n = this.field309 == 256 && (this.field318 & 0xFF) == 0 ? (PcmPlayer.PcmPlayer_stereo ? RawPcmStream.method946(0, ((RawSound)this.sound).samples, nArray, this.field318, n, this.field321, this.field314, this.field308, this.field316, 0, n5, n2, this) : RawPcmStream.method1030(((RawSound)this.sound).samples, nArray, this.field318, n, this.field312, this.field320, 0, n5, n2, this)) : (PcmPlayer.PcmPlayer_stereo ? RawPcmStream.method1033(0, 0, ((RawSound)this.sound).samples, nArray, this.field318, n, this.field321, this.field314, this.field308, this.field316, 0, n5, n2, this, this.field309, n4) : RawPcmStream.method1053(0, 0, ((RawSound)this.sound).samples, nArray, this.field318, n, this.field312, this.field320, 0, n5, n2, this, this.field309, n4));
            this.field319 -= n;
            if (this.field319 == 0) continue;
            return n;
        } while (!this.method936());
        return n3;
    }

    @Override
    @ObfuscatedName(value="bk")
    int vmethod1079() {
        int n = this.field312 * 3 >> 6;
        n = (n ^ n >> 31) + (n >>> 31);
        if (this.numLoops == 0) {
            n -= n * this.field318 / (((RawSound)this.sound).samples.length << 8);
        } else if (this.numLoops >= 0) {
            n -= n * this.start / ((RawSound)this.sound).samples.length;
        }
        return n > 255 ? 255 : n;
    }

    @ObfuscatedName(value="bs")
    int method968(int[] nArray, int n, int n2, int n3, int n4) {
        do {
            if (this.field319 <= 0) {
                if (this.field309 != -256 || (this.field318 & 0xFF) != 0) {
                    if (PcmPlayer.PcmPlayer_stereo) {
                        return RawPcmStream.method977(0, 0, ((RawSound)this.sound).samples, nArray, this.field318, n, this.field321, this.field314, 0, n3, n2, this, this.field309, n4);
                    }
                    return RawPcmStream.method943(0, 0, ((RawSound)this.sound).samples, nArray, this.field318, n, this.field312, 0, n3, n2, this, this.field309, n4);
                }
                if (PcmPlayer.PcmPlayer_stereo) {
                    return RawPcmStream.method1037(0, ((RawSound)this.sound).samples, nArray, this.field318, n, this.field321, this.field314, 0, n3, n2, this);
                }
                return RawPcmStream.method1029(((RawSound)this.sound).samples, nArray, this.field318, n, this.field312, 0, n3, n2, this);
            }
            int n5 = n + this.field319;
            if (n5 > n3) {
                n5 = n3;
            }
            this.field319 += n;
            n = this.field309 == -256 && (this.field318 & 0xFF) == 0 ? (PcmPlayer.PcmPlayer_stereo ? RawPcmStream.method948(0, ((RawSound)this.sound).samples, nArray, this.field318, n, this.field321, this.field314, this.field308, this.field316, 0, n5, n2, this) : RawPcmStream.method1015(((RawSound)this.sound).samples, nArray, this.field318, n, this.field312, this.field320, 0, n5, n2, this)) : (PcmPlayer.PcmPlayer_stereo ? RawPcmStream.method952(0, 0, ((RawSound)this.sound).samples, nArray, this.field318, n, this.field321, this.field314, this.field308, this.field316, 0, n5, n2, this, this.field309, n4) : RawPcmStream.method951(0, 0, ((RawSound)this.sound).samples, nArray, this.field318, n, this.field312, this.field320, 0, n5, n2, this, this.field309, n4));
            this.field319 -= n;
            if (this.field319 == 0) continue;
            return n;
        } while (!this.method936());
        return n3;
    }

    @ObfuscatedName(value="bj")
    boolean method936() {
        int n;
        int n2;
        int n3 = this.field310;
        if (n3 != Integer.MIN_VALUE) {
            n2 = RawPcmStream.method980(n3, this.field311);
            n = RawPcmStream.method920(n3, this.field311);
        } else {
            n = 0;
            n2 = 0;
            n3 = 0;
        }
        if (n3 == this.field312 && n2 == this.field321 && n == this.field314) {
            if (this.field310 != Integer.MIN_VALUE) {
                this.method912();
                return false;
            }
            this.field310 = 0;
            this.field314 = 0;
            this.field321 = 0;
            this.field312 = 0;
            this.remove();
            return true;
        }
        if (this.field312 >= n3) {
            if (this.field312 <= n3) {
                this.field320 = 0;
            } else {
                this.field320 = -1;
                this.field319 = this.field312 - n3;
            }
        } else {
            this.field320 = 1;
            this.field319 = n3 - this.field312;
        }
        if (this.field321 >= n2) {
            if (this.field321 <= n2) {
                this.field308 = 0;
            } else {
                this.field308 = -1;
                if (this.field319 == 0 || this.field319 > this.field321 - n2) {
                    this.field319 = this.field321 - n2;
                }
            }
        } else {
            this.field308 = 1;
            if (this.field319 == 0 || this.field319 > n2 - this.field321) {
                this.field319 = n2 - this.field321;
            }
        }
        if (this.field314 >= n) {
            if (this.field314 <= n) {
                this.field316 = 0;
            } else {
                this.field316 = -1;
                if (this.field319 == 0 || this.field319 > this.field314 - n) {
                    this.field319 = this.field314 - n;
                }
            }
        } else {
            this.field316 = 1;
            if (this.field319 == 0 || this.field319 > n - this.field314) {
                this.field319 = n - this.field314;
            }
        }
        return false;
    }

    @ObfuscatedName(value="ay")
    static int method980(int n, int n2) {
        return n2 < 0 ? n : (int)((double)n * Math.sqrt((double)(16384 - n2) * 1.220703125E-4) + 0.5);
    }

    @ObfuscatedName(value="ah")
    static int method920(int n, int n2) {
        return n2 < 0 ? -n : (int)((double)n * Math.sqrt((double)n2 * 1.220703125E-4) + 0.5);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lbc;II)Lbe;")
    @Export(value="createRawPcmStream")
    public static RawPcmStream createRawPcmStream(RawSound rawSound, int n, int n2) {
        if (rawSound.samples != null && rawSound.samples.length != 0) {
            return new RawPcmStream(rawSound, (int)((long)rawSound.sampleRate * 256L * (long)n / (long)(PcmPlayer.field257 * 100)), n2 << 6);
        }
        return null;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lbc;III)Lbe;")
    public static RawPcmStream method911(RawSound rawSound, int n, int n2, int n3) {
        if (rawSound.samples != null && rawSound.samples.length != 0) {
            return new RawPcmStream(rawSound, n, n2, n3);
        }
        return null;
    }

    @ObfuscatedName(value="bo")
    @ObfuscatedSignature(descriptor="([B[IIIIIIILbe;)I")
    static int method933(byte[] byArray, int[] nArray, int n, int n2, int n3, int n4, int n5, int n6, RawPcmStream rawPcmStream) {
        n3 <<= 2;
        n4 = n2 + (n6 >>= 8) - (n >>= 8);
        if (n4 > n5) {
            n4 = n5;
        }
        n4 -= 3;
        while (true) {
            if (n2 >= n4) {
                n4 += 3;
                while (true) {
                    if (n2 >= n4) {
                        rawPcmStream.field318 = n << 8;
                        return n2;
                    }
                    int n7 = n2++;
                    nArray[n7] = nArray[n7] + byArray[n++] * n3;
                }
            }
            int n8 = n2++;
            nArray[n8] = nArray[n8] + byArray[n++] * n3;
            int n9 = n2++;
            nArray[n9] = nArray[n9] + byArray[n++] * n3;
            int n10 = n2++;
            nArray[n10] = nArray[n10] + byArray[n++] * n3;
            int n11 = n2++;
            nArray[n11] = nArray[n11] + byArray[n++] * n3;
        }
    }

    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(I[B[IIIIIIIILbe;)I")
    static int method919(int n, byte[] byArray, int[] nArray, int n2, int n3, int n4, int n5, int n6, int n7, int n8, RawPcmStream rawPcmStream) {
        n4 <<= 2;
        n5 <<= 2;
        n6 = n3 + (n8 >>= 8) - (n2 >>= 8);
        if (n6 > n7) {
            n6 = n7;
        }
        n3 <<= 1;
        n6 <<= 1;
        n6 -= 6;
        while (true) {
            if (n3 >= n6) {
                n6 += 6;
                while (true) {
                    if (n3 >= n6) {
                        rawPcmStream.field318 = n2 << 8;
                        return n3 >> 1;
                    }
                    n = byArray[n2++];
                    int n9 = n3++;
                    nArray[n9] = nArray[n9] + n * n4;
                    int n10 = n3++;
                    nArray[n10] = nArray[n10] + n * n5;
                }
            }
            n = byArray[n2++];
            int n11 = n3++;
            nArray[n11] = nArray[n11] + n * n4;
            int n12 = n3++;
            nArray[n12] = nArray[n12] + n * n5;
            n = byArray[n2++];
            int n13 = n3++;
            nArray[n13] = nArray[n13] + n * n4;
            int n14 = n3++;
            nArray[n14] = nArray[n14] + n * n5;
            n = byArray[n2++];
            int n15 = n3++;
            nArray[n15] = nArray[n15] + n * n4;
            int n16 = n3++;
            nArray[n16] = nArray[n16] + n * n5;
            n = byArray[n2++];
            int n17 = n3++;
            nArray[n17] = nArray[n17] + n * n4;
            int n18 = n3++;
            nArray[n18] = nArray[n18] + n * n5;
        }
    }

    @ObfuscatedName(value="bn")
    @ObfuscatedSignature(descriptor="([B[IIIIIIILbe;)I")
    static int method1029(byte[] byArray, int[] nArray, int n, int n2, int n3, int n4, int n5, int n6, RawPcmStream rawPcmStream) {
        n3 <<= 2;
        n4 = n2 + (n >>= 8) - ((n6 >>= 8) - 1);
        if (n4 > n5) {
            n4 = n5;
        }
        n4 -= 3;
        while (true) {
            if (n2 >= n4) {
                n4 += 3;
                while (true) {
                    if (n2 >= n4) {
                        rawPcmStream.field318 = n << 8;
                        return n2;
                    }
                    int n7 = n2++;
                    nArray[n7] = nArray[n7] + byArray[n--] * n3;
                }
            }
            int n8 = n2++;
            nArray[n8] = nArray[n8] + byArray[n--] * n3;
            int n9 = n2++;
            nArray[n9] = nArray[n9] + byArray[n--] * n3;
            int n10 = n2++;
            nArray[n10] = nArray[n10] + byArray[n--] * n3;
            int n11 = n2++;
            nArray[n11] = nArray[n11] + byArray[n--] * n3;
        }
    }

    @ObfuscatedName(value="br")
    @ObfuscatedSignature(descriptor="(I[B[IIIIIIIILbe;)I")
    static int method1037(int n, byte[] byArray, int[] nArray, int n2, int n3, int n4, int n5, int n6, int n7, int n8, RawPcmStream rawPcmStream) {
        n4 <<= 2;
        n5 <<= 2;
        n6 = (n2 >>= 8) + n3 - ((n8 >>= 8) - 1);
        if (n6 > n7) {
            n6 = n7;
        }
        n3 <<= 1;
        n6 <<= 1;
        n6 -= 6;
        while (true) {
            if (n3 >= n6) {
                n6 += 6;
                while (true) {
                    if (n3 >= n6) {
                        rawPcmStream.field318 = n2 << 8;
                        return n3 >> 1;
                    }
                    n = byArray[n2--];
                    int n9 = n3++;
                    nArray[n9] = nArray[n9] + n * n4;
                    int n10 = n3++;
                    nArray[n10] = nArray[n10] + n * n5;
                }
            }
            n = byArray[n2--];
            int n11 = n3++;
            nArray[n11] = nArray[n11] + n * n4;
            int n12 = n3++;
            nArray[n12] = nArray[n12] + n * n5;
            n = byArray[n2--];
            int n13 = n3++;
            nArray[n13] = nArray[n13] + n * n4;
            int n14 = n3++;
            nArray[n14] = nArray[n14] + n * n5;
            n = byArray[n2--];
            int n15 = n3++;
            nArray[n15] = nArray[n15] + n * n4;
            int n16 = n3++;
            nArray[n16] = nArray[n16] + n * n5;
            n = byArray[n2--];
            int n17 = n3++;
            nArray[n17] = nArray[n17] + n * n4;
            int n18 = n3++;
            nArray[n18] = nArray[n18] + n * n5;
        }
    }

    @ObfuscatedName(value="bl")
    @ObfuscatedSignature(descriptor="(II[B[IIIIIIILbe;II)I")
    static int method1043(int n, int n2, byte[] byArray, int[] nArray, int n3, int n4, int n5, int n6, int n7, int n8, RawPcmStream rawPcmStream, int n9, int n10) {
        if (n9 == 0 || (n6 = n4 + (n9 + (n8 - n3) - 257) / n9) > n7) {
            n6 = n7;
        }
        while (true) {
            if (n4 >= n6) {
                if (n9 == 0 || (n6 = n4 + (n9 + (n8 - n3) - 1) / n9) > n7) {
                    n6 = n7;
                }
                n2 = n10;
                while (true) {
                    if (n4 >= n6) {
                        rawPcmStream.field318 = n3;
                        return n4;
                    }
                    n = byArray[n3 >> 8];
                    int n11 = n4++;
                    nArray[n11] = nArray[n11] + (((n << 8) + (n2 - n) * (n3 & 0xFF)) * n5 >> 6);
                    n3 = n9 + n3;
                }
            }
            n2 = n3 >> 8;
            n = byArray[n2];
            int n12 = n4++;
            nArray[n12] = nArray[n12] + (((n << 8) + (byArray[n2 + 1] - n) * (n3 & 0xFF)) * n5 >> 6);
            n3 = n9 + n3;
        }
    }

    @ObfuscatedName(value="cb")
    @ObfuscatedSignature(descriptor="(II[B[IIIIIIIILbe;II)I")
    static int method1018(int n, int n2, byte[] byArray, int[] nArray, int n3, int n4, int n5, int n6, int n7, int n8, int n9, RawPcmStream rawPcmStream, int n10, int n11) {
        if (n10 == 0 || (n7 = n4 + (n9 - n3 + n10 - 257) / n10) > n8) {
            n7 = n8;
        }
        n4 <<= 1;
        n7 <<= 1;
        while (true) {
            if (n4 >= n7) {
                if (n10 == 0 || (n7 = (n4 >> 1) + (n9 - n3 + n10 - 1) / n10) > n8) {
                    n7 = n8;
                }
                n7 <<= 1;
                n2 = n11;
                while (true) {
                    if (n4 >= n7) {
                        rawPcmStream.field318 = n3;
                        return n4 >> 1;
                    }
                    n = byArray[n3 >> 8];
                    n = (n << 8) + (n2 - n) * (n3 & 0xFF);
                    int n12 = n4++;
                    nArray[n12] = nArray[n12] + (n * n5 >> 6);
                    int n13 = n4++;
                    nArray[n13] = nArray[n13] + (n * n6 >> 6);
                    n3 += n10;
                }
            }
            n2 = n3 >> 8;
            n = byArray[n2];
            n = (n << 8) + (n3 & 0xFF) * (byArray[n2 + 1] - n);
            int n14 = n4++;
            nArray[n14] = nArray[n14] + (n * n5 >> 6);
            int n15 = n4++;
            nArray[n15] = nArray[n15] + (n * n6 >> 6);
            n3 += n10;
        }
    }

    @ObfuscatedName(value="cn")
    @ObfuscatedSignature(descriptor="(II[B[IIIIIIILbe;II)I")
    static int method943(int n, int n2, byte[] byArray, int[] nArray, int n3, int n4, int n5, int n6, int n7, int n8, RawPcmStream rawPcmStream, int n9, int n10) {
        if (n9 == 0 || (n6 = n4 + (n9 + (n8 + 256 - n3)) / n9) > n7) {
            n6 = n7;
        }
        while (true) {
            if (n4 >= n6) {
                if (n9 == 0 || (n6 = n4 + (n9 + (n8 - n3)) / n9) > n7) {
                    n6 = n7;
                }
                n = n10;
                n2 = n9;
                while (true) {
                    if (n4 >= n6) {
                        rawPcmStream.field318 = n3;
                        return n4;
                    }
                    int n11 = n4++;
                    nArray[n11] = nArray[n11] + (((n << 8) + (byArray[n3 >> 8] - n) * (n3 & 0xFF)) * n5 >> 6);
                    n3 += n2;
                }
            }
            n2 = n3 >> 8;
            n = byArray[n2 - 1];
            int n12 = n4++;
            nArray[n12] = nArray[n12] + (((n << 8) + (byArray[n2] - n) * (n3 & 0xFF)) * n5 >> 6);
            n3 = n9 + n3;
        }
    }

    @ObfuscatedName(value="cc")
    @ObfuscatedSignature(descriptor="(II[B[IIIIIIIILbe;II)I")
    static int method977(int n, int n2, byte[] byArray, int[] nArray, int n3, int n4, int n5, int n6, int n7, int n8, int n9, RawPcmStream rawPcmStream, int n10, int n11) {
        if (n10 == 0 || (n7 = n4 + (n9 + 256 - n3 + n10) / n10) > n8) {
            n7 = n8;
        }
        n4 <<= 1;
        n7 <<= 1;
        while (true) {
            if (n4 >= n7) {
                if (n10 == 0 || (n7 = (n4 >> 1) + (n9 - n3 + n10) / n10) > n8) {
                    n7 = n8;
                }
                n7 <<= 1;
                n2 = n11;
                while (true) {
                    if (n4 >= n7) {
                        rawPcmStream.field318 = n3;
                        return n4 >> 1;
                    }
                    n = (n2 << 8) + (n3 & 0xFF) * (byArray[n3 >> 8] - n2);
                    int n12 = n4++;
                    nArray[n12] = nArray[n12] + (n * n5 >> 6);
                    int n13 = n4++;
                    nArray[n13] = nArray[n13] + (n * n6 >> 6);
                    n3 += n10;
                }
            }
            n2 = n3 >> 8;
            n = byArray[n2 - 1];
            n = (byArray[n2] - n) * (n3 & 0xFF) + (n << 8);
            int n14 = n4++;
            nArray[n14] = nArray[n14] + (n * n5 >> 6);
            int n15 = n4++;
            nArray[n15] = nArray[n15] + (n * n6 >> 6);
            n3 += n10;
        }
    }

    @ObfuscatedName(value="co")
    @ObfuscatedSignature(descriptor="([B[IIIIIIIILbe;)I")
    static int method1030(byte[] byArray, int[] nArray, int n, int n2, int n3, int n4, int n5, int n6, int n7, RawPcmStream rawPcmStream) {
        n3 <<= 2;
        n4 <<= 2;
        n5 = n2 + (n7 >>= 8) - (n >>= 8);
        if (n5 > n6) {
            n5 = n6;
        }
        rawPcmStream.field321 += rawPcmStream.field308 * (n5 - n2);
        rawPcmStream.field314 += rawPcmStream.field316 * (n5 - n2);
        n5 -= 3;
        while (true) {
            if (n2 >= n5) {
                n5 += 3;
                while (true) {
                    if (n2 >= n5) {
                        rawPcmStream.field312 = n3 >> 2;
                        rawPcmStream.field318 = n << 8;
                        return n2;
                    }
                    int n8 = n2++;
                    nArray[n8] = nArray[n8] + byArray[n++] * n3;
                    n3 = n4 + n3;
                }
            }
            int n9 = n2++;
            nArray[n9] = nArray[n9] + byArray[n++] * n3;
            n3 = n4 + n3;
            int n10 = n2++;
            nArray[n10] = nArray[n10] + byArray[n++] * n3;
            n3 = n4 + n3;
            int n11 = n2++;
            nArray[n11] = nArray[n11] + byArray[n++] * n3;
            n3 = n4 + n3;
            int n12 = n2++;
            nArray[n12] = nArray[n12] + byArray[n++] * n3;
            n3 = n4 + n3;
        }
    }

    @ObfuscatedName(value="ca")
    @ObfuscatedSignature(descriptor="(I[B[IIIIIIIIIILbe;)I")
    static int method946(int n, byte[] byArray, int[] nArray, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, RawPcmStream rawPcmStream) {
        n4 <<= 2;
        n5 <<= 2;
        n6 <<= 2;
        n7 <<= 2;
        n8 = (n10 >>= 8) + n3 - (n2 >>= 8);
        if (n8 > n9) {
            n8 = n9;
        }
        rawPcmStream.field312 += rawPcmStream.field320 * (n8 - n3);
        n3 <<= 1;
        n8 <<= 1;
        n8 -= 6;
        while (true) {
            if (n3 >= n8) {
                n8 += 6;
                while (true) {
                    if (n3 >= n8) {
                        rawPcmStream.field321 = n4 >> 2;
                        rawPcmStream.field314 = n5 >> 2;
                        rawPcmStream.field318 = n2 << 8;
                        return n3 >> 1;
                    }
                    n = byArray[n2++];
                    int n11 = n3++;
                    nArray[n11] = nArray[n11] + n * n4;
                    n4 += n6;
                    int n12 = n3++;
                    nArray[n12] = nArray[n12] + n * n5;
                    n5 = n7 + n5;
                }
            }
            n = byArray[n2++];
            int n13 = n3++;
            nArray[n13] = nArray[n13] + n * n4;
            n4 += n6;
            int n14 = n3++;
            nArray[n14] = nArray[n14] + n * n5;
            n5 = n7 + n5;
            n = byArray[n2++];
            int n15 = n3++;
            nArray[n15] = nArray[n15] + n * n4;
            n4 += n6;
            int n16 = n3++;
            nArray[n16] = nArray[n16] + n * n5;
            n5 = n7 + n5;
            n = byArray[n2++];
            int n17 = n3++;
            nArray[n17] = nArray[n17] + n * n4;
            n4 += n6;
            int n18 = n3++;
            nArray[n18] = nArray[n18] + n * n5;
            n5 = n7 + n5;
            n = byArray[n2++];
            int n19 = n3++;
            nArray[n19] = nArray[n19] + n * n4;
            n4 += n6;
            int n20 = n3++;
            nArray[n20] = nArray[n20] + n * n5;
            n5 = n7 + n5;
        }
    }

    @ObfuscatedName(value="cg")
    @ObfuscatedSignature(descriptor="([B[IIIIIIIILbe;)I")
    static int method1015(byte[] byArray, int[] nArray, int n, int n2, int n3, int n4, int n5, int n6, int n7, RawPcmStream rawPcmStream) {
        n3 <<= 2;
        n4 <<= 2;
        n5 = n2 + (n >>= 8) - ((n7 >>= 8) - 1);
        if (n5 > n6) {
            n5 = n6;
        }
        rawPcmStream.field321 += rawPcmStream.field308 * (n5 - n2);
        rawPcmStream.field314 += rawPcmStream.field316 * (n5 - n2);
        n5 -= 3;
        while (true) {
            if (n2 >= n5) {
                n5 += 3;
                while (true) {
                    if (n2 >= n5) {
                        rawPcmStream.field312 = n3 >> 2;
                        rawPcmStream.field318 = n << 8;
                        return n2;
                    }
                    int n8 = n2++;
                    nArray[n8] = nArray[n8] + byArray[n--] * n3;
                    n3 = n4 + n3;
                }
            }
            int n9 = n2++;
            nArray[n9] = nArray[n9] + byArray[n--] * n3;
            n3 = n4 + n3;
            int n10 = n2++;
            nArray[n10] = nArray[n10] + byArray[n--] * n3;
            n3 = n4 + n3;
            int n11 = n2++;
            nArray[n11] = nArray[n11] + byArray[n--] * n3;
            n3 = n4 + n3;
            int n12 = n2++;
            nArray[n12] = nArray[n12] + byArray[n--] * n3;
            n3 = n4 + n3;
        }
    }

    @ObfuscatedName(value="cp")
    @ObfuscatedSignature(descriptor="(I[B[IIIIIIIIIILbe;)I")
    static int method948(int n, byte[] byArray, int[] nArray, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, RawPcmStream rawPcmStream) {
        n4 <<= 2;
        n5 <<= 2;
        n6 <<= 2;
        n7 <<= 2;
        n8 = (n2 >>= 8) + n3 - ((n10 >>= 8) - 1);
        if (n8 > n9) {
            n8 = n9;
        }
        rawPcmStream.field312 += rawPcmStream.field320 * (n8 - n3);
        n3 <<= 1;
        n8 <<= 1;
        n8 -= 6;
        while (true) {
            if (n3 >= n8) {
                n8 += 6;
                while (true) {
                    if (n3 >= n8) {
                        rawPcmStream.field321 = n4 >> 2;
                        rawPcmStream.field314 = n5 >> 2;
                        rawPcmStream.field318 = n2 << 8;
                        return n3 >> 1;
                    }
                    n = byArray[n2--];
                    int n11 = n3++;
                    nArray[n11] = nArray[n11] + n * n4;
                    n4 += n6;
                    int n12 = n3++;
                    nArray[n12] = nArray[n12] + n * n5;
                    n5 = n7 + n5;
                }
            }
            n = byArray[n2--];
            int n13 = n3++;
            nArray[n13] = nArray[n13] + n * n4;
            n4 += n6;
            int n14 = n3++;
            nArray[n14] = nArray[n14] + n * n5;
            n5 = n7 + n5;
            n = byArray[n2--];
            int n15 = n3++;
            nArray[n15] = nArray[n15] + n * n4;
            n4 += n6;
            int n16 = n3++;
            nArray[n16] = nArray[n16] + n * n5;
            n5 = n7 + n5;
            n = byArray[n2--];
            int n17 = n3++;
            nArray[n17] = nArray[n17] + n * n4;
            n4 += n6;
            int n18 = n3++;
            nArray[n18] = nArray[n18] + n * n5;
            n5 = n7 + n5;
            n = byArray[n2--];
            int n19 = n3++;
            nArray[n19] = nArray[n19] + n * n4;
            n4 += n6;
            int n20 = n3++;
            nArray[n20] = nArray[n20] + n * n5;
            n5 = n7 + n5;
        }
    }

    @ObfuscatedName(value="cz")
    @ObfuscatedSignature(descriptor="(II[B[IIIIIIIILbe;II)I")
    static int method1053(int n, int n2, byte[] byArray, int[] nArray, int n3, int n4, int n5, int n6, int n7, int n8, int n9, RawPcmStream rawPcmStream, int n10, int n11) {
        rawPcmStream.field321 -= rawPcmStream.field308 * n4;
        rawPcmStream.field314 -= rawPcmStream.field316 * n4;
        if (n10 == 0 || (n7 = n4 + (n9 - n3 + n10 - 257) / n10) > n8) {
            n7 = n8;
        }
        while (true) {
            if (n4 >= n7) {
                if (n10 == 0 || (n7 = n4 + (n9 - n3 + n10 - 1) / n10) > n8) {
                    n7 = n8;
                }
                n2 = n11;
                while (true) {
                    if (n4 >= n7) {
                        rawPcmStream.field321 += rawPcmStream.field308 * n4;
                        rawPcmStream.field314 += rawPcmStream.field316 * n4;
                        rawPcmStream.field312 = n5;
                        rawPcmStream.field318 = n3;
                        return n4;
                    }
                    n = byArray[n3 >> 8];
                    int n12 = n4++;
                    nArray[n12] = nArray[n12] + (((n << 8) + (n2 - n) * (n3 & 0xFF)) * n5 >> 6);
                    n5 = n6 + n5;
                    n3 += n10;
                }
            }
            n2 = n3 >> 8;
            n = byArray[n2];
            int n13 = n4++;
            nArray[n13] = nArray[n13] + (((n << 8) + (byArray[n2 + 1] - n) * (n3 & 0xFF)) * n5 >> 6);
            n5 = n6 + n5;
            n3 += n10;
        }
    }

    @ObfuscatedName(value="cy")
    @ObfuscatedSignature(descriptor="(II[B[IIIIIIIIIILbe;II)I")
    static int method1033(int n, int n2, byte[] byArray, int[] nArray, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, RawPcmStream rawPcmStream, int n12, int n13) {
        rawPcmStream.field312 -= n4 * rawPcmStream.field320;
        if (n12 == 0 || (n9 = n4 + (n11 - n3 + n12 - 257) / n12) > n10) {
            n9 = n10;
        }
        n4 <<= 1;
        n9 <<= 1;
        while (true) {
            if (n4 >= n9) {
                if (n12 == 0 || (n9 = (n4 >> 1) + (n11 - n3 + n12 - 1) / n12) > n10) {
                    n9 = n10;
                }
                n9 <<= 1;
                n2 = n13;
                while (true) {
                    if (n4 >= n9) {
                        rawPcmStream.field312 += rawPcmStream.field320 * (n4 >>= 1);
                        rawPcmStream.field321 = n5;
                        rawPcmStream.field314 = n6;
                        rawPcmStream.field318 = n3;
                        return n4;
                    }
                    n = byArray[n3 >> 8];
                    n = (n << 8) + (n2 - n) * (n3 & 0xFF);
                    int n14 = n4++;
                    nArray[n14] = nArray[n14] + (n * n5 >> 6);
                    n5 = n7 + n5;
                    int n15 = n4++;
                    nArray[n15] = nArray[n15] + (n * n6 >> 6);
                    n6 += n8;
                    n3 += n12;
                }
            }
            n2 = n3 >> 8;
            n = byArray[n2];
            n = (n << 8) + (n3 & 0xFF) * (byArray[n2 + 1] - n);
            int n16 = n4++;
            nArray[n16] = nArray[n16] + (n * n5 >> 6);
            n5 = n7 + n5;
            int n17 = n4++;
            nArray[n17] = nArray[n17] + (n * n6 >> 6);
            n6 += n8;
            n3 += n12;
        }
    }

    @ObfuscatedName(value="cu")
    @ObfuscatedSignature(descriptor="(II[B[IIIIIIIILbe;II)I")
    static int method951(int n, int n2, byte[] byArray, int[] nArray, int n3, int n4, int n5, int n6, int n7, int n8, int n9, RawPcmStream rawPcmStream, int n10, int n11) {
        rawPcmStream.field321 -= rawPcmStream.field308 * n4;
        rawPcmStream.field314 -= rawPcmStream.field316 * n4;
        if (n10 == 0 || (n7 = n4 + (n9 + 256 - n3 + n10) / n10) > n8) {
            n7 = n8;
        }
        while (true) {
            if (n4 >= n7) {
                if (n10 == 0 || (n7 = n4 + (n9 - n3 + n10) / n10) > n8) {
                    n7 = n8;
                }
                n = n11;
                n2 = n10;
                while (true) {
                    if (n4 >= n7) {
                        rawPcmStream.field321 += rawPcmStream.field308 * n4;
                        rawPcmStream.field314 += rawPcmStream.field316 * n4;
                        rawPcmStream.field312 = n5;
                        rawPcmStream.field318 = n3;
                        return n4;
                    }
                    int n12 = n4++;
                    nArray[n12] = nArray[n12] + (((n << 8) + (byArray[n3 >> 8] - n) * (n3 & 0xFF)) * n5 >> 6);
                    n5 = n6 + n5;
                    n3 += n2;
                }
            }
            n2 = n3 >> 8;
            n = byArray[n2 - 1];
            int n13 = n4++;
            nArray[n13] = nArray[n13] + (((n << 8) + (byArray[n2] - n) * (n3 & 0xFF)) * n5 >> 6);
            n5 = n6 + n5;
            n3 += n10;
        }
    }

    @ObfuscatedName(value="cq")
    @ObfuscatedSignature(descriptor="(II[B[IIIIIIIIIILbe;II)I")
    static int method952(int n, int n2, byte[] byArray, int[] nArray, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, RawPcmStream rawPcmStream, int n12, int n13) {
        rawPcmStream.field312 -= n4 * rawPcmStream.field320;
        if (n12 == 0 || (n9 = n4 + (n11 + 256 - n3 + n12) / n12) > n10) {
            n9 = n10;
        }
        n4 <<= 1;
        n9 <<= 1;
        while (true) {
            if (n4 >= n9) {
                if (n12 == 0 || (n9 = (n4 >> 1) + (n11 - n3 + n12) / n12) > n10) {
                    n9 = n10;
                }
                n9 <<= 1;
                n2 = n13;
                while (true) {
                    if (n4 >= n9) {
                        rawPcmStream.field312 += rawPcmStream.field320 * (n4 >>= 1);
                        rawPcmStream.field321 = n5;
                        rawPcmStream.field314 = n6;
                        rawPcmStream.field318 = n3;
                        return n4;
                    }
                    n = (n2 << 8) + (n3 & 0xFF) * (byArray[n3 >> 8] - n2);
                    int n14 = n4++;
                    nArray[n14] = nArray[n14] + (n * n5 >> 6);
                    n5 = n7 + n5;
                    int n15 = n4++;
                    nArray[n15] = nArray[n15] + (n * n6 >> 6);
                    n6 += n8;
                    n3 += n12;
                }
            }
            n2 = n3 >> 8;
            n = byArray[n2 - 1];
            n = (byArray[n2] - n) * (n3 & 0xFF) + (n << 8);
            int n16 = n4++;
            nArray[n16] = nArray[n16] + (n * n5 >> 6);
            n5 = n7 + n5;
            int n17 = n4++;
            nArray[n17] = nArray[n17] + (n * n6 >> 6);
            n6 += n8;
            n3 += n12;
        }
    }
}

