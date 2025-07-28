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
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ma")
@Implements(value="MidiPcmStream")
public class MidiPcmStream
extends PcmStream {
    @ObfuscatedName(value="by")
    static AtomicBoolean field3666 = null;
    @ObfuscatedName(value="bm")
    static ThreadPoolExecutor field3667 = null;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lub;")
    @Export(value="musicPatches")
    NodeHashTable musicPatches;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-410635123)
    int field3638 = 256;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=734475531)
    int field3639 = 1000000;
    @ObfuscatedName(value="ao")
    int[] field3648 = new int[16];
    @ObfuscatedName(value="ad")
    int[] field3641 = new int[16];
    @ObfuscatedName(value="an")
    int[] field3642 = new int[16];
    @ObfuscatedName(value="ae")
    int[] field3643 = new int[16];
    @ObfuscatedName(value="ax")
    int[] field3649 = new int[16];
    @ObfuscatedName(value="at")
    int[] field3640 = new int[16];
    @ObfuscatedName(value="ac")
    int[] field3644 = new int[16];
    @ObfuscatedName(value="au")
    int[] field3647 = new int[16];
    @ObfuscatedName(value="as")
    int[] field3637 = new int[16];
    @ObfuscatedName(value="aw")
    int[] field3651 = new int[16];
    @ObfuscatedName(value="ai")
    int[] field3650 = new int[16];
    @ObfuscatedName(value="ar")
    int[] field3669 = new int[16];
    @ObfuscatedName(value="am")
    int[] field3652 = new int[16];
    @ObfuscatedName(value="ap")
    int[] field3665 = new int[16];
    @ObfuscatedName(value="ab")
    int[] field3654 = new int[16];
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="[[Lne;")
    MusicPatchNode[][] field3655 = new MusicPatchNode[16][128];
    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="[[Lne;")
    MusicPatchNode[][] field3656 = new MusicPatchNode[16][128];
    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="Lmu;")
    @Export(value="midiFile")
    MidiFileReader midiFile = new MidiFileReader();
    @ObfuscatedName(value="bw")
    boolean field3659;
    @ObfuscatedName(value="bb")
    @ObfuscatedGetter(intValue=1656712043)
    @Export(value="track")
    int track;
    @ObfuscatedName(value="bx")
    @ObfuscatedGetter(intValue=754007923)
    @Export(value="trackLength")
    int trackLength;
    @ObfuscatedName(value="bd")
    @ObfuscatedGetter(longValue=3254050521887839121L)
    long field3661;
    @ObfuscatedName(value="bi")
    @ObfuscatedGetter(longValue=-3823371857040521559L)
    long field3662;
    @ObfuscatedName(value="bz")
    @ObfuscatedSignature(descriptor="Lnv;")
    @Export(value="patchStream")
    MusicPatchPcmStream patchStream = new MusicPatchPcmStream(this);
    @ObfuscatedName(value="bt")
    @ObfuscatedSignature(descriptor="Lbq;")
    PcmPlayer field3664 = null;
    @ObfuscatedName(value="bf")
    PriorityQueue field3646 = new PriorityQueue(5, new class344());
    @ObfuscatedName(value="bp")
    @ObfuscatedGetter(intValue=1132771239)
    public int field3668 = 0;

    @ObfuscatedSignature(descriptor="(Lbq;)V")
    public MidiPcmStream(PcmPlayer pcmPlayer) {
        this.field3664 = pcmPlayer;
        this.musicPatches = new NodeHashTable(128);
        this.method6731();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1287356357")
    @Export(value="setPcmStreamVolume")
    public void setPcmStreamVolume(int n) {
        PcmPlayer pcmPlayer = this.field3664;
        synchronized (pcmPlayer) {
            this.field3638 = n;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1455965430")
    public int method6710() {
        return this.field3638;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lnx;Lpq;Lbs;I)Z", garbageValue="580591264")
    public boolean method6711(MusicTrack var1_1, AbstractArchive var2_2, SoundCache var3_3) {
        var4_4 = this.field3664;
        synchronized (var4_4) {
            var5_5 = true;
            var6_6 = this.field3646;
            synchronized (var6_6) {
                this.field3646.clear();
            }
            var6_6 = (class346)var1_1.field3712.first();
            while (var6_6 != null) {
                var14_12 = (int)var6_6.key;
                var8_8 = (MusicPatch)this.musicPatches.get(var14_12);
                if (var8_8 != null) ** GOTO lbl22
                var8_8 = class149.method3586(var2_2, var14_12);
                if (var8_8 == null) {
                    var5_5 = false;
                } else {
                    this.musicPatches.put(var8_8, var14_12);
lbl22:
                    // 2 sources

                    if (!var8_8.method6887(var3_3, var6_6.field3748)) {
                        var5_5 = false;
                    } else if (this.field3646 != null) {
                        var9_9 = this.field3646;
                        synchronized (var9_9) {
                            for (class53 var11_11 : var8_8.field3694) {
                                this.field3646.add(new class337(var6_6.field3751, var11_11));
                            }
                        }
                    }
                }
                var6_6 = (class346)var1_1.field3712.next();
            }
            return var5_5;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1753530905")
    public void method6712() {
        if (this.field3646 != null) {
            if (field3666 != null) {
                field3666.set(true);
            }
            AtomicBoolean atomicBoolean = field3666 = new AtomicBoolean(false);
            if (field3667 == null) {
                int n = Runtime.getRuntime().availableProcessors();
                field3667 = new ThreadPoolExecutor(0, n, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(), new class336(this));
            }
            field3667.submit(new class340(this, atomicBoolean));
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1485904141")
    public void method6713() {
        PcmPlayer pcmPlayer = this.field3664;
        synchronized (pcmPlayer) {
            MusicPatch musicPatch = (MusicPatch)this.musicPatches.first();
            while (musicPatch != null) {
                musicPatch.clear();
                musicPatch = (MusicPatch)this.musicPatches.next();
            }
        }
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="()Lbn;")
    @Export(value="firstSubStream")
    protected PcmStream firstSubStream() {
        return this.patchStream;
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
        return 0;
    }

    @Override
    @ObfuscatedName(value="at")
    @Export(value="fill")
    protected void fill(int[] nArray, int n, int n2) {
        block2: {
            if (this.midiFile.isReady()) {
                long l;
                int n3 = this.midiFile.division * this.field3639 * -727379968 / PcmPlayer.field257;
                while (this.field3662 - (l = (long)n3 * (long)n2 + this.field3661) < 0L) {
                    int n4 = (int)((this.field3662 - this.field3661 + (long)n3 - 1L) / (long)n3);
                    this.field3661 += (long)n4 * (long)n3;
                    this.patchStream.fill(nArray, n, n4);
                    n = n4 + n;
                    n2 -= n4;
                    this.method6744();
                    if (this.midiFile.isReady()) continue;
                    break block2;
                }
                this.field3661 = l;
            }
        }
        this.patchStream.fill(nArray, n, n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-272372987")
    public void method6714() {
        PcmPlayer pcmPlayer = this.field3664;
        synchronized (pcmPlayer) {
            MusicPatch musicPatch = (MusicPatch)this.musicPatches.first();
            while (musicPatch != null) {
                musicPatch.remove();
                musicPatch = (MusicPatch)this.musicPatches.next();
            }
        }
    }

    @Override
    @ObfuscatedName(value="au")
    @Export(value="skip")
    protected void skip(int n) {
        block2: {
            if (this.midiFile.isReady()) {
                long l;
                int n2 = this.midiFile.division * this.field3639 * -727379968 / PcmPlayer.field257;
                while (this.field3662 - (l = (long)n2 * (long)n + this.field3661) < 0L) {
                    int n3 = (int)(((long)n2 + (this.field3662 - this.field3661) - 1L) / (long)n2);
                    this.field3661 += (long)n3 * (long)n2;
                    this.patchStream.skip(n3);
                    n -= n3;
                    this.method6744();
                    if (this.midiFile.isReady()) continue;
                    break block2;
                }
                this.field3661 = l;
            }
        }
        this.patchStream.skip(n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lnx;ZI)V", garbageValue="-1658894017")
    @Export(value="setMusicTrack")
    public void setMusicTrack(MusicTrack musicTrack, boolean bl) {
        PcmPlayer pcmPlayer = this.field3664;
        synchronized (pcmPlayer) {
            this.clear();
            this.midiFile.parse(musicTrack.midi);
            this.field3659 = bl;
            this.field3661 = 0L;
            int n = this.midiFile.trackCount();
            for (int i = 0; i < n; ++i) {
                this.midiFile.gotoTrack(i);
                this.midiFile.readTrackLength(i);
                this.midiFile.markTrackPosition(i);
            }
            this.track = this.midiFile.getPrioritizedTrack();
            this.trackLength = this.midiFile.trackLengths[this.track];
            this.field3662 = this.midiFile.method6850(this.trackLength);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="0")
    @Export(value="clear")
    public void clear() {
        PcmPlayer pcmPlayer = this.field3664;
        synchronized (pcmPlayer) {
            this.midiFile.clear();
            this.method6731();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-697656511")
    @Export(value="isReady")
    public boolean isReady() {
        PcmPlayer pcmPlayer = this.field3664;
        synchronized (pcmPlayer) {
            return this.midiFile.isReady();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-15404535")
    public boolean method6749() {
        PcmPlayer pcmPlayer = this.field3664;
        synchronized (pcmPlayer) {
            return this.musicPatches.method9995() > 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-1971479199")
    public void method6719(int n, int n2) {
        PcmPlayer pcmPlayer = this.field3664;
        synchronized (pcmPlayer) {
            this.method6720(n, n2);
        }
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-221864183")
    void method6720(int n, int n2) {
        this.field3643[n] = n2;
        this.field3640[n] = n2 & 0xFFFFFF80;
        this.method6782(n, n2);
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="1866947017")
    void method6782(int n, int n2) {
        if (n2 != this.field3649[n]) {
            this.field3649[n] = n2;
            for (int i = 0; i < 128; ++i) {
                this.field3656[n][i] = null;
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(IIII)V", garbageValue="64524799")
    void method6780(int n, int n2, int n3) {
        MusicPatch musicPatch;
        this.method6724(n, n2, 64);
        if ((this.field3651[n] & 2) != 0) {
            void var4_5;
            MusicPatchNode musicPatchNode = (MusicPatchNode)this.patchStream.queue.first();
            while (var4_5 != null) {
                if (var4_5.field3731 == n && var4_5.field3727 < 0) {
                    this.field3655[n][var4_5.field3718] = null;
                    this.field3655[n][n2] = var4_5;
                    int n4 = (var4_5.field3722 * var4_5.field3723 >> 12) + var4_5.field3721;
                    var4_5.field3721 += n2 - var4_5.field3718 << 8;
                    var4_5.field3722 = n4 - var4_5.field3721;
                    var4_5.field3723 = 4096;
                    var4_5.field3718 = n2;
                    return;
                }
                MusicPatchNode musicPatchNode2 = (MusicPatchNode)this.patchStream.queue.next();
            }
        }
        if ((musicPatch = (MusicPatch)this.musicPatches.get(this.field3649[n])) == null) {
            return;
        }
        if (musicPatch.rawSounds[n2] == null) {
            return;
        }
        RawSound rawSound = musicPatch.rawSounds[n2].method1119();
        if (rawSound == null) {
            return;
        }
        MusicPatchNode musicPatchNode = new MusicPatchNode();
        musicPatchNode.field3731 = n;
        musicPatchNode.table = musicPatch;
        musicPatchNode.rawSound = rawSound;
        musicPatchNode.field3716 = musicPatch.field3697[n2];
        musicPatchNode.field3717 = musicPatch.field3692[n2];
        musicPatchNode.field3718 = n2;
        musicPatchNode.field3720 = n3 * n3 * musicPatch.field3695[n2] * musicPatch.field3698 + 1024 >> 11;
        musicPatchNode.field3719 = musicPatch.field3696[n2] & 0xFF;
        musicPatchNode.field3721 = (n2 << 8) - (musicPatch.field3691[n2] & Short.MAX_VALUE);
        musicPatchNode.field3724 = 0;
        musicPatchNode.field3715 = 0;
        musicPatchNode.field3726 = 0;
        musicPatchNode.field3727 = -1;
        musicPatchNode.field3714 = 0;
        if (this.field3652[n] == 0) {
            musicPatchNode.stream = RawPcmStream.method911(rawSound, this.method6736(musicPatchNode), this.method6737(musicPatchNode), this.method6738(musicPatchNode));
        } else {
            musicPatchNode.stream = RawPcmStream.method911(rawSound, this.method6736(musicPatchNode), 0, this.method6738(musicPatchNode));
            this.method6723(musicPatchNode, musicPatch.field3691[n2] < 0);
        }
        if (musicPatch.field3691[n2] < 0) {
            musicPatchNode.stream.setNumLoops(-1);
        }
        if (musicPatchNode.field3717 >= 0) {
            MusicPatchNode musicPatchNode3 = this.field3656[n][musicPatchNode.field3717];
            if (musicPatchNode3 != null && musicPatchNode3.field3727 < 0) {
                this.field3655[n][musicPatchNode3.field3718] = null;
                musicPatchNode3.field3727 = 0;
            }
            this.field3656[n][musicPatchNode.field3717] = musicPatchNode;
        }
        this.patchStream.queue.addFirst(musicPatchNode);
        this.field3655[n][n2] = musicPatchNode;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(Lne;ZB)V", garbageValue="-63")
    void method6723(MusicPatchNode musicPatchNode, boolean bl) {
        int n;
        int n2 = musicPatchNode.rawSound.samples.length;
        if (bl && musicPatchNode.rawSound.field244) {
            int n3 = n2 + n2 - musicPatchNode.rawSound.start;
            n = (int)((long)n3 * (long)this.field3652[musicPatchNode.field3731] >> 6);
            if (n >= (n2 <<= 8)) {
                n = n2 + n2 - 1 - n;
                musicPatchNode.stream.method974();
            }
        } else {
            n = (int)((long)n2 * (long)this.field3652[musicPatchNode.field3731] >> 6);
        }
        musicPatchNode.stream.method1050(n);
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(IIIB)V", garbageValue="125")
    void method6724(int n, int n2, int n3) {
        MusicPatchNode musicPatchNode = this.field3655[n][n2];
        if (musicPatchNode == null) {
            return;
        }
        this.field3655[n][n2] = null;
        if ((this.field3651[n] & 2) == 0) {
            musicPatchNode.field3727 = 0;
        } else {
            MusicPatchNode musicPatchNode2 = (MusicPatchNode)this.patchStream.queue.last();
            while (musicPatchNode2 != null) {
                if (musicPatchNode2.field3731 == musicPatchNode.field3731 && musicPatchNode2.field3727 < 0 && musicPatchNode != musicPatchNode2) {
                    musicPatchNode.field3727 = 0;
                    break;
                }
                musicPatchNode2 = (MusicPatchNode)this.patchStream.queue.previous();
            }
        }
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(IIII)V", garbageValue="65280")
    void method6725(int n, int n2, int n3) {
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-1744070669")
    void method6726(int n, int n2) {
    }

    @ObfuscatedName(value="bz")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="824603693")
    void method6727(int n, int n2) {
        this.field3644[n] = n2;
    }

    @ObfuscatedName(value="bt")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="125")
    void method6791(int n) {
        MusicPatchNode musicPatchNode = (MusicPatchNode)this.patchStream.queue.last();
        while (musicPatchNode != null) {
            if (n < 0 || musicPatchNode.field3731 == n) {
                if (musicPatchNode.stream != null) {
                    musicPatchNode.stream.method924(PcmPlayer.field257 / 100);
                    if (musicPatchNode.stream.method928()) {
                        this.patchStream.mixer.addSubStream(musicPatchNode.stream);
                    }
                    musicPatchNode.method6931();
                }
                if (musicPatchNode.field3727 < 0) {
                    this.field3655[musicPatchNode.field3731][musicPatchNode.field3718] = null;
                }
                musicPatchNode.remove();
            }
            musicPatchNode = (MusicPatchNode)this.patchStream.queue.previous();
        }
        return;
    }

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="1")
    void method6729(int n) {
        if (n >= 0) {
            this.field3648[n] = 12800;
            this.field3641[n] = 8192;
            this.field3642[n] = 16383;
            this.field3644[n] = 8192;
            this.field3647[n] = 0;
            this.field3637[n] = 8192;
            this.method6817(n);
            this.method6733(n);
            this.field3651[n] = 0;
            this.field3650[n] = Short.MAX_VALUE;
            this.field3669[n] = 256;
            this.field3652[n] = 0;
            this.method6735(n, 8192);
            return;
        }
        for (n = 0; n < 16; ++n) {
            this.method6729(n);
        }
    }

    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="1")
    void method6754(int n) {
        MusicPatchNode musicPatchNode = (MusicPatchNode)this.patchStream.queue.last();
        while (musicPatchNode != null) {
            if ((n < 0 || musicPatchNode.field3731 == n) && musicPatchNode.field3727 < 0) {
                this.field3655[musicPatchNode.field3731][musicPatchNode.field3718] = null;
                musicPatchNode.field3727 = 0;
            }
            musicPatchNode = (MusicPatchNode)this.patchStream.queue.previous();
        }
        return;
    }

    @ObfuscatedName(value="bs")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="20")
    void method6731() {
        int n;
        this.method6791(-1);
        this.method6729(-1);
        for (n = 0; n < 16; ++n) {
            this.field3649[n] = this.field3643[n];
        }
        for (n = 0; n < 16; ++n) {
            this.field3640[n] = this.field3643[n] & 0xFFFFFF80;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-250442588")
    void method6817(int n) {
        if ((this.field3651[n] & 2) == 0) return;
        MusicPatchNode musicPatchNode = (MusicPatchNode)this.patchStream.queue.last();
        while (musicPatchNode != null) {
            if (musicPatchNode.field3731 == n && this.field3655[n][musicPatchNode.field3718] == null && musicPatchNode.field3727 < 0) {
                musicPatchNode.field3727 = 0;
            }
            musicPatchNode = (MusicPatchNode)this.patchStream.queue.previous();
        }
        return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="bo")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-336120997")
    void method6733(int n) {
        if ((this.field3651[n] & 4) == 0) return;
        MusicPatchNode musicPatchNode = (MusicPatchNode)this.patchStream.queue.last();
        while (musicPatchNode != null) {
            if (musicPatchNode.field3731 == n) {
                musicPatchNode.field3733 = 0;
            }
            musicPatchNode = (MusicPatchNode)this.patchStream.queue.previous();
        }
        return;
    }

    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="33")
    void method6770(int n) {
        int n2 = n & 0xF0;
        if (n2 != 128) {
            if (n2 != 144) {
                if (n2 != 160) {
                    int n3;
                    if (n2 != 176) {
                        if (n2 != 192) {
                            if (n2 != 208) {
                                if (n2 != 224) {
                                    n2 = n & 0xFF;
                                    if (n2 != 255) {
                                        return;
                                    }
                                    this.method6731();
                                    return;
                                }
                                int n4 = n & 0xF;
                                int n5 = (n >> 8 & 0x7F) + (n >> 9 & 0x3F80);
                                this.method6727(n4, n5);
                                return;
                            }
                            int n6 = n & 0xF;
                            int n7 = n >> 8 & 0x7F;
                            this.method6726(n6, n7);
                            return;
                        }
                        int n8 = n & 0xF;
                        int n9 = n >> 8 & 0x7F;
                        this.method6782(n8, n9 + this.field3640[n8]);
                        return;
                    }
                    int n10 = n & 0xF;
                    int n11 = n >> 8 & 0x7F;
                    int n12 = n >> 16 & 0x7F;
                    if (n11 == 0) {
                        this.field3640[n10] = (n12 << 14) + (this.field3640[n10] & 0xFFE03FFF);
                    }
                    if (n11 == 32) {
                        this.field3640[n10] = (n12 << 7) + (this.field3640[n10] & 0xFFFFC07F);
                    }
                    if (n11 == 1) {
                        this.field3647[n10] = (n12 << 7) + (this.field3647[n10] & 0xFFFFC07F);
                    }
                    if (n11 == 33) {
                        this.field3647[n10] = n12 + (this.field3647[n10] & 0xFFFFFF80);
                    }
                    if (n11 == 5) {
                        this.field3637[n10] = (n12 << 7) + (this.field3637[n10] & 0xFFFFC07F);
                    }
                    if (n11 == 37) {
                        this.field3637[n10] = n12 + (this.field3637[n10] & 0xFFFFFF80);
                    }
                    if (n11 == 7) {
                        this.field3648[n10] = (n12 << 7) + (this.field3648[n10] & 0xFFFFC07F);
                    }
                    if (n11 == 39) {
                        this.field3648[n10] = n12 + (this.field3648[n10] & 0xFFFFFF80);
                    }
                    if (n11 == 10) {
                        this.field3641[n10] = (n12 << 7) + (this.field3641[n10] & 0xFFFFC07F);
                    }
                    if (n11 == 42) {
                        this.field3641[n10] = n12 + (this.field3641[n10] & 0xFFFFFF80);
                    }
                    if (n11 == 11) {
                        this.field3642[n10] = (n12 << 7) + (this.field3642[n10] & 0xFFFFC07F);
                    }
                    if (n11 == 43) {
                        this.field3642[n10] = n12 + (this.field3642[n10] & 0xFFFFFF80);
                    }
                    if (n11 == 64) {
                        if (n12 >= 64) {
                            int n13 = n10;
                            this.field3651[n13] = this.field3651[n13] | 1;
                        } else {
                            int n14 = n10;
                            this.field3651[n14] = this.field3651[n14] & 0xFFFFFFFE;
                        }
                    }
                    if (n11 == 65) {
                        if (n12 >= 64) {
                            int n15 = n10;
                            this.field3651[n15] = this.field3651[n15] | 2;
                        } else {
                            this.method6817(n10);
                            int n16 = n10;
                            this.field3651[n16] = this.field3651[n16] & 0xFFFFFFFD;
                        }
                    }
                    if (n11 == 99) {
                        this.field3650[n10] = (n12 << 7) + (this.field3650[n10] & 0x7F);
                    }
                    if (n11 == 98) {
                        this.field3650[n10] = (this.field3650[n10] & 0x3F80) + n12;
                    }
                    if (n11 == 101) {
                        this.field3650[n10] = (n12 << 7) + (this.field3650[n10] & 0x7F) + 16384;
                    }
                    if (n11 == 100) {
                        this.field3650[n10] = (this.field3650[n10] & 0x3F80) + n12 + 16384;
                    }
                    if (n11 == 120) {
                        this.method6791(n10);
                    }
                    if (n11 == 121) {
                        this.method6729(n10);
                    }
                    if (n11 == 123) {
                        this.method6754(n10);
                    }
                    if (n11 == 6 && (n3 = this.field3650[n10]) == 16384) {
                        this.field3669[n10] = (n12 << 7) + (this.field3669[n10] & 0xFFFFC07F);
                    }
                    if (n11 == 38 && (n3 = this.field3650[n10]) == 16384) {
                        this.field3669[n10] = n12 + (this.field3669[n10] & 0xFFFFFF80);
                    }
                    if (n11 == 16) {
                        this.field3652[n10] = (n12 << 7) + (this.field3652[n10] & 0xFFFFC07F);
                    }
                    if (n11 == 48) {
                        this.field3652[n10] = n12 + (this.field3652[n10] & 0xFFFFFF80);
                    }
                    if (n11 == 81) {
                        if (n12 >= 64) {
                            int n17 = n10;
                            this.field3651[n17] = this.field3651[n17] | 4;
                        } else {
                            this.method6733(n10);
                            int n18 = n10;
                            this.field3651[n18] = this.field3651[n18] & 0xFFFFFFFB;
                        }
                    }
                    if (n11 == 17) {
                        this.method6735(n10, (n12 << 7) + (this.field3665[n10] & 0xFFFFC07F));
                    }
                    if (n11 == 49) {
                        this.method6735(n10, n12 + (this.field3665[n10] & 0xFFFFFF80));
                    }
                    return;
                }
                int n19 = n & 0xF;
                int n20 = n >> 8 & 0x7F;
                int n21 = n >> 16 & 0x7F;
                this.method6725(n19, n20, n21);
                return;
            }
            int n22 = n & 0xF;
            int n23 = n >> 8 & 0x7F;
            int n24 = n >> 16 & 0x7F;
            if (n24 > 0) {
                this.method6780(n22, n23, n24);
            } else {
                this.method6724(n22, n23, 64);
            }
            return;
        }
        int n25 = n & 0xF;
        int n26 = n >> 8 & 0x7F;
        int n27 = n >> 16 & 0x7F;
        this.method6724(n25, n26, n27);
    }

    @ObfuscatedName(value="bn")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="27268525")
    void method6735(int n, int n2) {
        this.field3665[n] = n2;
        this.field3654[n] = (int)(2097152.0 * Math.pow(2.0, 5.4931640625E-4 * (double)n2) + 0.5);
    }

    @ObfuscatedName(value="br")
    @ObfuscatedSignature(descriptor="(Lne;I)I", garbageValue="688799447")
    int method6736(MusicPatchNode musicPatchNode) {
        int n;
        int n2 = (musicPatchNode.field3723 * musicPatchNode.field3722 >> 12) + musicPatchNode.field3721;
        n2 = ((this.field3644[musicPatchNode.field3731] - 8192) * this.field3669[musicPatchNode.field3731] >> 12) + n2;
        MusicPatchNode2 musicPatchNode2 = musicPatchNode.field3716;
        if (musicPatchNode2.field3621 > 0 && (musicPatchNode2.field3618 > 0 || this.field3647[musicPatchNode.field3731] > 0)) {
            n = musicPatchNode2.field3618 << 2;
            int n3 = musicPatchNode2.field3622 << 1;
            if (musicPatchNode.field3729 < n3) {
                n = n * musicPatchNode.field3729 / n3;
            }
            double d = Math.sin((double)(musicPatchNode.field3730 & 0x1FF) * 0.01227184630308513);
            n2 += (int)((double)(n += this.field3647[musicPatchNode.field3731] >> 7) * d);
        }
        return (n = (int)((double)(musicPatchNode.rawSound.sampleRate * 256) * Math.pow(2.0, (double)n2 * 3.255208333333333E-4) / (double)PcmPlayer.field257 + 0.5)) < 1 ? 1 : n;
    }

    @ObfuscatedName(value="bl")
    @ObfuscatedSignature(descriptor="(Lne;I)I", garbageValue="167576027")
    int method6737(MusicPatchNode musicPatchNode) {
        int n;
        int n2;
        int n3;
        int n4;
        MusicPatchNode2 musicPatchNode2 = musicPatchNode.field3716;
        int n5 = this.field3648[musicPatchNode.field3731] * this.field3642[musicPatchNode.field3731] + 4096 >> 13;
        n5 = n5 * n5 + 16384 >> 15;
        n5 = n5 * musicPatchNode.field3720 + 16384 >> 15;
        n5 = n5 * this.field3638 + 128 >> 8;
        if (musicPatchNode2.field3616 > 0) {
            n5 = (int)((double)n5 * Math.pow(0.5, 1.953125E-5 * (double)(musicPatchNode.field3724 * 128) * (double)musicPatchNode2.field3616) + 0.5);
        }
        if (musicPatchNode2.field3614 != null) {
            n4 = musicPatchNode.field3715;
            n3 = musicPatchNode2.field3614[musicPatchNode.field3726 * 4 + 1];
            if (musicPatchNode.field3726 * 4 < musicPatchNode2.field3614.length - 2) {
                n2 = (musicPatchNode2.field3614[musicPatchNode.field3726 * 4] & 0xFF) << 8;
                n = (musicPatchNode2.field3614[musicPatchNode.field3726 * 4 + 2] & 0xFF) << 8;
                n3 = (n4 - n2) * (musicPatchNode2.field3614[musicPatchNode.field3726 * 4 + 3] - n3) / (n - n2) + n3;
            }
            n5 = n5 * n3 + 32 >> 6;
        }
        if (musicPatchNode.field3727 > 0 && musicPatchNode2.field3615 != null) {
            n4 = musicPatchNode.field3727;
            n3 = musicPatchNode2.field3615[musicPatchNode.field3714 * 4 + 1];
            if (musicPatchNode.field3714 * 4 < musicPatchNode2.field3615.length - 2) {
                n2 = (musicPatchNode2.field3615[musicPatchNode.field3714 * 4] & 0xFF) << 8;
                n = (musicPatchNode2.field3615[musicPatchNode.field3714 * 4 + 2] & 0xFF) << 8;
                n3 = (musicPatchNode2.field3615[musicPatchNode.field3714 * 4 + 3] - n3) * (n4 - n2) / (n - n2) + n3;
            }
            n5 = n3 * n5 + 32 >> 6;
        }
        return n5;
    }

    @ObfuscatedName(value="cb")
    @ObfuscatedSignature(descriptor="(Lne;I)I", garbageValue="1838475002")
    int method6738(MusicPatchNode musicPatchNode) {
        int n = this.field3641[musicPatchNode.field3731];
        if (n < 8192) {
            return n * musicPatchNode.field3719 + 32 >> 6;
        }
        return 16384 - ((128 - musicPatchNode.field3719) * (16384 - n) + 32 >> 6);
    }

    @ObfuscatedName(value="cn")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-2071802591")
    void method6744() {
        int n = this.track;
        int n2 = this.trackLength;
        long l = this.field3662;
        block0: while (true) {
            if (n2 != this.trackLength) {
                this.track = n;
                this.trackLength = n2;
                this.field3662 = l;
                return;
            }
            while (n2 == this.midiFile.trackLengths[n]) {
                this.midiFile.gotoTrack(n);
                int n3 = this.midiFile.readMessage(n);
                if (n3 != 1) {
                    if ((n3 & 0x80) != 0) {
                        this.method6770(n3);
                    }
                    this.midiFile.readTrackLength(n);
                    this.midiFile.markTrackPosition(n);
                    continue;
                }
                this.midiFile.setTrackDone();
                this.midiFile.markTrackPosition(n);
                if (!this.midiFile.isDone()) break;
                if (!this.field3659 || n2 == 0) break block0;
                this.midiFile.reset(l);
                break;
            }
            n = this.midiFile.getPrioritizedTrack();
            n2 = this.midiFile.trackLengths[n];
            l = this.midiFile.method6850(n2);
        }
        this.method6731();
        this.midiFile.clear();
    }

    @ObfuscatedName(value="cc")
    @ObfuscatedSignature(descriptor="(Lne;I)Z", garbageValue="-1590069172")
    boolean method6745(MusicPatchNode musicPatchNode) {
        if (musicPatchNode.stream != null) {
            return false;
        }
        if (musicPatchNode.field3727 >= 0) {
            musicPatchNode.remove();
            if (musicPatchNode.field3717 > 0 && musicPatchNode == this.field3656[musicPatchNode.field3731][musicPatchNode.field3717]) {
                this.field3656[musicPatchNode.field3731][musicPatchNode.field3717] = null;
            }
        }
        return true;
    }

    @ObfuscatedName(value="co")
    @ObfuscatedSignature(descriptor="(Lne;[IIII)Z", garbageValue="-2055070840")
    boolean method6746(MusicPatchNode musicPatchNode, int[] nArray, int n, int n2) {
        musicPatchNode.field3728 = PcmPlayer.field257 / 100;
        if (musicPatchNode.field3727 >= 0 && (musicPatchNode.stream == null || musicPatchNode.stream.method927())) {
            musicPatchNode.method6931();
            musicPatchNode.remove();
            if (musicPatchNode.field3717 > 0 && musicPatchNode == this.field3656[musicPatchNode.field3731][musicPatchNode.field3717]) {
                this.field3656[musicPatchNode.field3731][musicPatchNode.field3717] = null;
            }
            return true;
        }
        int n3 = musicPatchNode.field3723;
        if (n3 > 0) {
            if ((n3 -= (int)(16.0 * Math.pow(2.0, (double)this.field3637[musicPatchNode.field3731] * 4.921259842519685E-4) + 0.5)) < 0) {
                n3 = 0;
            }
            musicPatchNode.field3723 = n3;
        }
        musicPatchNode.stream.method1040(this.method6736(musicPatchNode));
        MusicPatchNode2 musicPatchNode2 = musicPatchNode.field3716;
        boolean bl = false;
        ++musicPatchNode.field3729;
        musicPatchNode.field3730 += musicPatchNode2.field3621;
        double d = (double)((musicPatchNode.field3718 - 60 << 8) + (musicPatchNode.field3723 * musicPatchNode.field3722 >> 12)) * 5.086263020833333E-6;
        if (musicPatchNode2.field3616 > 0) {
            musicPatchNode.field3724 = musicPatchNode2.field3619 > 0 ? musicPatchNode.field3724 * -1698938880 + (int)(128.0 * Math.pow(2.0, d * (double)musicPatchNode2.field3619) + 0.5) * 288716928 : musicPatchNode.field3724 * -1698938880 + -1698938880;
        }
        if (musicPatchNode2.field3614 != null) {
            musicPatchNode.field3715 = musicPatchNode2.field3617 > 0 ? (musicPatchNode.field3715 += (int)(128.0 * Math.pow(2.0, d * (double)musicPatchNode2.field3617) + 0.5)) : (musicPatchNode.field3715 += 128);
            while (musicPatchNode.field3726 * 4 < musicPatchNode2.field3614.length - 2 && musicPatchNode.field3715 > (musicPatchNode2.field3614[musicPatchNode.field3726 * 4 + 2] & 0xFF) << 8) {
                musicPatchNode.field3726 = musicPatchNode.field3726 * 4 + 2;
            }
            if (musicPatchNode.field3726 * 4 == musicPatchNode2.field3614.length - 2 && musicPatchNode2.field3614[musicPatchNode.field3726 * 4 + 1] == 0) {
                bl = true;
            }
        }
        if (musicPatchNode.field3727 >= 0 && musicPatchNode2.field3615 != null && (this.field3651[musicPatchNode.field3731] & 1) == 0 && (musicPatchNode.field3717 < 0 || musicPatchNode != this.field3656[musicPatchNode.field3731][musicPatchNode.field3717])) {
            musicPatchNode.field3727 = musicPatchNode2.field3620 > 0 ? (musicPatchNode.field3727 += (int)(128.0 * Math.pow(2.0, (double)musicPatchNode2.field3620 * d) + 0.5)) : (musicPatchNode.field3727 += 128);
            while (musicPatchNode.field3714 * 4 < musicPatchNode2.field3615.length - 2 && musicPatchNode.field3727 > (musicPatchNode2.field3615[musicPatchNode.field3714 * 4 + 2] & 0xFF) << 8) {
                musicPatchNode.field3714 = musicPatchNode.field3714 * 4 + 2;
            }
            if (musicPatchNode.field3714 * 4 == musicPatchNode2.field3615.length - 2) {
                bl = true;
            }
        }
        if (!bl) {
            musicPatchNode.stream.method1008(musicPatchNode.field3728, this.method6737(musicPatchNode), this.method6738(musicPatchNode));
            return false;
        }
        musicPatchNode.stream.method924(musicPatchNode.field3728);
        if (nArray != null) {
            musicPatchNode.stream.fill(nArray, n, n2);
        } else {
            musicPatchNode.stream.skip(n2);
        }
        if (musicPatchNode.stream.method928()) {
            this.patchStream.mixer.addSubStream(musicPatchNode.stream);
        }
        musicPatchNode.method6931();
        if (musicPatchNode.field3727 >= 0) {
            musicPatchNode.remove();
            if (musicPatchNode.field3717 > 0 && musicPatchNode == this.field3656[musicPatchNode.field3731][musicPatchNode.field3717]) {
                this.field3656[musicPatchNode.field3731][musicPatchNode.field3717] = null;
            }
        }
        return true;
    }
}

