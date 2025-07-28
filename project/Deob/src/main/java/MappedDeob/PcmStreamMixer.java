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

@ObfuscatedName(value="bp")
@Implements(value="PcmStreamMixer")
public class PcmStreamMixer
extends PcmStream {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpm;")
    @Export(value="subStreams")
    NodeDeque subStreams = new NodeDeque();
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpm;")
    NodeDeque field233 = new NodeDeque();
    @ObfuscatedName(value="az")
    int field232 = 0;
    @ObfuscatedName(value="ao")
    int field235 = -1;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lbn;)V")
    @Export(value="addSubStream")
    public final synchronized void addSubStream(PcmStream pcmStream) {
        this.subStreams.addLast(pcmStream);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lbn;)V")
    @Export(value="removeSubStream")
    public final synchronized void removeSubStream(PcmStream pcmStream) {
        pcmStream.remove();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="az")
    void method770() {
        if (this.field232 <= 0) return;
        PcmStreamMixerListener pcmStreamMixerListener = (PcmStreamMixerListener)this.field233.last();
        while (true) {
            if (pcmStreamMixerListener == null) {
                this.field235 -= this.field232;
                this.field232 = 0;
                return;
            }
            pcmStreamMixerListener.field374 -= this.field232;
            pcmStreamMixerListener = (PcmStreamMixerListener)this.field233.previous();
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ltf;Lca;)V")
    void method730(Node node, PcmStreamMixerListener pcmStreamMixerListener) {
        while (this.field233.sentinel != node && ((PcmStreamMixerListener)node).field374 <= pcmStreamMixerListener.field374) {
            node = node.previous;
        }
        NodeDeque.NodeDeque_addBefore(pcmStreamMixerListener, node);
        this.field235 = ((PcmStreamMixerListener)this.field233.sentinel.previous).field374;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lca;)V")
    void method767(PcmStreamMixerListener pcmStreamMixerListener) {
        pcmStreamMixerListener.remove();
        pcmStreamMixerListener.remove2();
        Node node = this.field233.sentinel.previous;
        this.field235 = node == this.field233.sentinel ? -1 : ((PcmStreamMixerListener)node).field374;
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="()Lbn;")
    @Export(value="firstSubStream")
    protected PcmStream firstSubStream() {
        return (PcmStream)this.subStreams.last();
    }

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="()Lbn;")
    @Export(value="nextSubStream")
    protected PcmStream nextSubStream() {
        return (PcmStream)this.subStreams.previous();
    }

    @Override
    @ObfuscatedName(value="ax")
    protected int vmethod6927() {
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    @ObfuscatedName(value="at")
    @Export(value="fill")
    public final synchronized void fill(int[] nArray, int n, int n2) {
        do {
            PcmStreamMixerListener pcmStreamMixerListener;
            if (this.field235 < 0) {
                this.updateSubStreams(nArray, n, n2);
                return;
            }
            if (n2 + this.field232 < this.field235) {
                this.field232 += n2;
                this.updateSubStreams(nArray, n, n2);
                return;
            }
            int n3 = this.field235 - this.field232;
            this.updateSubStreams(nArray, n, n3);
            n = n3 + n;
            n2 -= n3;
            this.field232 += n3;
            this.method770();
            PcmStreamMixerListener pcmStreamMixerListener2 = pcmStreamMixerListener = (PcmStreamMixerListener)this.field233.last();
            synchronized (pcmStreamMixerListener2) {
                int n4 = pcmStreamMixerListener.update();
                if (n4 < 0) {
                    pcmStreamMixerListener.field374 = 0;
                    this.method767(pcmStreamMixerListener);
                } else {
                    pcmStreamMixerListener.field374 = n4;
                    this.method730(pcmStreamMixerListener.previous, pcmStreamMixerListener);
                }
            }
        } while (n2 != 0);
    }

    @ObfuscatedName(value="ac")
    @Export(value="updateSubStreams")
    void updateSubStreams(int[] nArray, int n, int n2) {
        PcmStream pcmStream = (PcmStream)this.subStreams.last();
        while (pcmStream != null) {
            pcmStream.update(nArray, n, n2);
            pcmStream = (PcmStream)this.subStreams.previous();
        }
        return;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    @ObfuscatedName(value="au")
    @Export(value="skip")
    public final synchronized void skip(int n) {
        do {
            PcmStreamMixerListener pcmStreamMixerListener;
            if (this.field235 < 0) {
                this.skipSubStreams(n);
                return;
            }
            if (this.field232 + n < this.field235) {
                this.field232 += n;
                this.skipSubStreams(n);
                return;
            }
            int n2 = this.field235 - this.field232;
            this.skipSubStreams(n2);
            n -= n2;
            this.field232 += n2;
            this.method770();
            PcmStreamMixerListener pcmStreamMixerListener2 = pcmStreamMixerListener = (PcmStreamMixerListener)this.field233.last();
            synchronized (pcmStreamMixerListener2) {
                int n3 = pcmStreamMixerListener.update();
                if (n3 < 0) {
                    pcmStreamMixerListener.field374 = 0;
                    this.method767(pcmStreamMixerListener);
                } else {
                    pcmStreamMixerListener.field374 = n3;
                    this.method730(pcmStreamMixerListener.previous, pcmStreamMixerListener);
                }
            }
        } while (n != 0);
    }

    @ObfuscatedName(value="as")
    @Export(value="skipSubStreams")
    void skipSubStreams(int n) {
        PcmStream pcmStream = (PcmStream)this.subStreams.last();
        while (pcmStream != null) {
            pcmStream.skip(n);
            pcmStream = (PcmStream)this.subStreams.previous();
        }
        return;
    }
}

