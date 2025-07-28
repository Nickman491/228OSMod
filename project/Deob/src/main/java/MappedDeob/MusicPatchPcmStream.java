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

@ObfuscatedName(value="nv")
@Implements(value="MusicPatchPcmStream")
public class MusicPatchPcmStream
extends PcmStream {
    @ObfuscatedName(value="jh")
    static int[][] field3705;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lma;")
    @Export(value="superStream")
    MidiPcmStream superStream;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpm;")
    @Export(value="queue")
    NodeDeque queue = new NodeDeque();
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lbp;")
    @Export(value="mixer")
    PcmStreamMixer mixer = new PcmStreamMixer();

    @ObfuscatedSignature(descriptor="(Lma;)V")
    MusicPatchPcmStream(MidiPcmStream midiPcmStream) {
        this.superStream = midiPcmStream;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lne;[IIIII)V", garbageValue="1738538147")
    void method6903(MusicPatchNode musicPatchNode, int[] nArray, int n, int n2, int n3) {
        if ((this.superStream.field3651[musicPatchNode.field3731] & 4) != 0 && musicPatchNode.field3727 < 0) {
            int n4 = this.superStream.field3654[musicPatchNode.field3731] / PcmPlayer.field257;
            while (true) {
                int n5;
                if ((n5 = (n4 + 1048575 - musicPatchNode.field3733) / n4) > n2) {
                    musicPatchNode.field3733 += n4 * n2;
                    break;
                }
                musicPatchNode.stream.fill(nArray, n, n5);
                n += n5;
                n2 -= n5;
                musicPatchNode.field3733 += n4 * n5 - 0x100000;
                int n6 = PcmPlayer.field257 / 100;
                int n7 = 262144 / n4;
                if (n7 < n6) {
                    n6 = n7;
                }
                RawPcmStream rawPcmStream = musicPatchNode.stream;
                if (this.superStream.field3652[musicPatchNode.field3731] != 0) {
                    musicPatchNode.stream = RawPcmStream.method911(musicPatchNode.rawSound, rawPcmStream.method926(), 0, rawPcmStream.method918());
                    this.superStream.method6723(musicPatchNode, musicPatchNode.table.field3691[musicPatchNode.field3718] < 0);
                    musicPatchNode.stream.method950(n6, rawPcmStream.method922());
                } else {
                    musicPatchNode.stream = RawPcmStream.method911(musicPatchNode.rawSound, rawPcmStream.method926(), rawPcmStream.method922(), rawPcmStream.method918());
                }
                if (musicPatchNode.table.field3691[musicPatchNode.field3718] < 0) {
                    musicPatchNode.stream.setNumLoops(-1);
                }
                rawPcmStream.method924(n6);
                rawPcmStream.fill(nArray, n, n3 - n);
                if (!rawPcmStream.method928()) continue;
                this.mixer.addSubStream(rawPcmStream);
            }
        }
        musicPatchNode.stream.fill(nArray, n, n2);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lne;II)V", garbageValue="-622400505")
    void method6904(MusicPatchNode musicPatchNode, int n) {
        if ((this.superStream.field3651[musicPatchNode.field3731] & 4) != 0 && musicPatchNode.field3727 < 0) {
            int n2 = this.superStream.field3654[musicPatchNode.field3731] / PcmPlayer.field257;
            int n3 = (n2 + 1048575 - musicPatchNode.field3733) / n2;
            musicPatchNode.field3733 = n2 * n + musicPatchNode.field3733 & 0xFFFFF;
            if (n3 <= n) {
                if (this.superStream.field3652[musicPatchNode.field3731] != 0) {
                    musicPatchNode.stream = RawPcmStream.method911(musicPatchNode.rawSound, musicPatchNode.stream.method926(), 0, musicPatchNode.stream.method918());
                    this.superStream.method6723(musicPatchNode, musicPatchNode.table.field3691[musicPatchNode.field3718] < 0);
                } else {
                    musicPatchNode.stream = RawPcmStream.method911(musicPatchNode.rawSound, musicPatchNode.stream.method926(), musicPatchNode.stream.method922(), musicPatchNode.stream.method918());
                }
                if (musicPatchNode.table.field3691[musicPatchNode.field3718] < 0) {
                    musicPatchNode.stream.setNumLoops(-1);
                }
                n = musicPatchNode.field3733 / n2;
            }
        }
        musicPatchNode.stream.skip(n);
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="()Lbn;")
    @Export(value="firstSubStream")
    protected PcmStream firstSubStream() {
        MusicPatchNode musicPatchNode = (MusicPatchNode)this.queue.last();
        if (musicPatchNode == null) {
            return null;
        }
        if (musicPatchNode.stream != null) {
            return musicPatchNode.stream;
        }
        return this.nextSubStream();
    }

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="()Lbn;")
    @Export(value="nextSubStream")
    protected PcmStream nextSubStream() {
        MusicPatchNode musicPatchNode;
        do {
            if ((musicPatchNode = (MusicPatchNode)this.queue.previous()) != null) continue;
            return null;
        } while (musicPatchNode.stream == null);
        return musicPatchNode.stream;
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
        this.mixer.fill(nArray, n, n2);
        MusicPatchNode musicPatchNode = (MusicPatchNode)this.queue.last();
        while (musicPatchNode != null) {
            if (!this.superStream.method6745(musicPatchNode)) {
                int n3 = n;
                int n4 = n2;
                do {
                    if (n4 <= musicPatchNode.field3728) {
                        this.method6903(musicPatchNode, nArray, n3, n4, n3 + n4);
                        musicPatchNode.field3728 -= n4;
                        break;
                    }
                    this.method6903(musicPatchNode, nArray, n3, musicPatchNode.field3728, n3 + n4);
                } while (!this.superStream.method6746(musicPatchNode, nArray, n3 += musicPatchNode.field3728, n4 -= musicPatchNode.field3728));
            }
            musicPatchNode = (MusicPatchNode)this.queue.previous();
        }
        return;
    }

    @Override
    @ObfuscatedName(value="au")
    @Export(value="skip")
    protected void skip(int n) {
        this.mixer.skip(n);
        MusicPatchNode musicPatchNode = (MusicPatchNode)this.queue.last();
        while (musicPatchNode != null) {
            if (!this.superStream.method6745(musicPatchNode)) {
                int n2 = n;
                do {
                    if (n2 <= musicPatchNode.field3728) {
                        this.method6904(musicPatchNode, n2);
                        musicPatchNode.field3728 -= n2;
                        break;
                    }
                    this.method6904(musicPatchNode, musicPatchNode.field3728);
                } while (!this.superStream.method6746(musicPatchNode, null, 0, n2 -= musicPatchNode.field3728));
            }
            musicPatchNode = (MusicPatchNode)this.queue.previous();
        }
        return;
    }

    @ObfuscatedName(value="ka")
    @ObfuscatedSignature(descriptor="(Ldz;IIB)V", garbageValue="77")
    static final void method6901(class103 class1032, int n, int n2) {
        PcmPlayer.method827(class1032, class1032.field1321, n, n2);
    }
}

