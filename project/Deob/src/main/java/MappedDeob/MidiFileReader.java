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

@ObfuscatedName(value="mu")
@Implements(value="MidiFileReader")
public class MidiFileReader {
    @ObfuscatedName(value="ac")
    static final byte[] field3674 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lvy;")
    @Export(value="buffer")
    Buffer buffer = new Buffer(null);
    @ObfuscatedName(value="ah")
    @Export(value="division")
    int division;
    @ObfuscatedName(value="az")
    @Export(value="trackStarts")
    int[] trackStarts;
    @ObfuscatedName(value="ao")
    @Export(value="trackPositions")
    int[] trackPositions;
    @ObfuscatedName(value="ad")
    @Export(value="trackLengths")
    int[] trackLengths;
    @ObfuscatedName(value="an")
    int[] field3675;
    @ObfuscatedName(value="ae")
    int field3676;
    @ObfuscatedName(value="at")
    long field3678;

    MidiFileReader() {
    }

    @ObfuscatedName(value="ay")
    @Export(value="parse")
    void parse(byte[] byArray) {
        this.buffer.array = byArray;
        this.buffer.offset = 10;
        int n = this.buffer.readUnsignedShort();
        this.division = this.buffer.readUnsignedShort();
        this.field3676 = 500000;
        this.trackStarts = new int[n];
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                this.field3678 = 0L;
                this.trackPositions = new int[n];
                for (n2 = 0; n2 < n; ++n2) {
                    this.trackPositions[n2] = this.trackStarts[n2];
                }
                this.trackLengths = new int[n];
                this.field3675 = new int[n];
                return;
            }
            int n3 = this.buffer.readInt();
            int n4 = this.buffer.readInt();
            if (n3 == 1297379947) {
                this.trackStarts[n2] = this.buffer.offset;
                ++n2;
            }
            this.buffer.offset += n4;
        }
    }

    @ObfuscatedName(value="ah")
    @Export(value="clear")
    void clear() {
        this.buffer.array = null;
        this.trackStarts = null;
        this.trackPositions = null;
        this.trackLengths = null;
        this.field3675 = null;
    }

    @ObfuscatedName(value="az")
    @Export(value="isReady")
    boolean isReady() {
        return this.buffer.array != null;
    }

    @ObfuscatedName(value="ao")
    @Export(value="trackCount")
    int trackCount() {
        return this.trackPositions.length;
    }

    @ObfuscatedName(value="ad")
    @Export(value="gotoTrack")
    void gotoTrack(int n) {
        this.buffer.offset = this.trackPositions[n];
    }

    @ObfuscatedName(value="an")
    @Export(value="markTrackPosition")
    void markTrackPosition(int n) {
        this.trackPositions[n] = this.buffer.offset;
    }

    @ObfuscatedName(value="ae")
    @Export(value="setTrackDone")
    void setTrackDone() {
        this.buffer.offset = -1;
    }

    @ObfuscatedName(value="ax")
    @Export(value="readTrackLength")
    void readTrackLength(int n) {
        int n2 = this.buffer.readVarInt();
        int n3 = n;
        this.trackLengths[n3] = this.trackLengths[n3] + n2;
    }

    @ObfuscatedName(value="at")
    @Export(value="readMessage")
    int readMessage(int n) {
        int n2 = this.readMessage0(n);
        return n2;
    }

    @ObfuscatedName(value="ac")
    @Export(value="readMessage0")
    int readMessage0(int n) {
        int n2;
        int n3 = this.buffer.array[this.buffer.offset];
        if (n3 >= 0) {
            n3 = this.field3675[n];
        } else {
            this.field3675[n] = n3 &= 0xFF;
            ++this.buffer.offset;
        }
        if (n3 != 240 && n3 != 247) {
            return this.method6832(n, n3);
        }
        int n4 = this.buffer.readVarInt();
        if (n3 == 247 && n4 > 0 && ((n2 = this.buffer.array[this.buffer.offset] & 0xFF) >= 241 && n2 <= 243 || n2 == 246 || n2 == 248 || n2 >= 250 && n2 <= 252 || n2 == 254)) {
            ++this.buffer.offset;
            this.field3675[n] = n2;
            return this.method6832(n, n2);
        }
        this.buffer.offset += n4;
        return 0;
    }

    @ObfuscatedName(value="au")
    int method6832(int n, int n2) {
        if (n2 != 255) {
            byte by = field3674[n2 - 128];
            int n3 = n2;
            if (by >= 1) {
                n3 |= this.buffer.readUnsignedByte() << 8;
            }
            if (by >= 2) {
                n3 |= this.buffer.readUnsignedByte() << 16;
            }
            return n3;
        }
        int n4 = this.buffer.readUnsignedByte();
        int n5 = this.buffer.readVarInt();
        if (n4 != 47) {
            if (n4 != 81) {
                this.buffer.offset += n5;
                return 3;
            }
            int n6 = this.buffer.readMedium();
            int n7 = this.trackLengths[n];
            this.field3678 += (long)n7 * (long)(this.field3676 - n6);
            this.field3676 = n6;
            this.buffer.offset += (n5 -= 3);
            return 2;
        }
        this.buffer.offset += n5;
        return 1;
    }

    @ObfuscatedName(value="as")
    long method6850(int n) {
        return this.field3678 + (long)n * (long)this.field3676;
    }

    @ObfuscatedName(value="aq")
    @Export(value="getPrioritizedTrack")
    int getPrioritizedTrack() {
        int n = this.trackPositions.length;
        int n2 = -1;
        int n3 = Integer.MAX_VALUE;
        int n4 = 0;
        while (n4 < n) {
            if (this.trackPositions[n4] >= 0 && this.trackLengths[n4] < n3) {
                n2 = n4;
                n3 = this.trackLengths[n4];
            }
            ++n4;
        }
        return n2;
    }

    @ObfuscatedName(value="af")
    @Export(value="isDone")
    boolean isDone() {
        int n = this.trackPositions.length;
        for (int i = 0; i < n; ++i) {
            if (this.trackPositions[i] < 0) continue;
            return false;
        }
        return true;
    }

    @ObfuscatedName(value="aa")
    @Export(value="reset")
    void reset(long l) {
        this.field3678 = l;
        int n = this.trackPositions.length;
        int n2 = 0;
        while (n2 < n) {
            this.trackLengths[n2] = 0;
            this.field3675[n2] = 0;
            this.buffer.offset = this.trackStarts[n2];
            this.readTrackLength(n2);
            this.trackPositions[n2] = this.buffer.offset;
            ++n2;
        }
        return;
    }
}

