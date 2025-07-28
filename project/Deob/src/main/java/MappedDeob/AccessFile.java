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
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="uv")
@Implements(value="AccessFile")
public final class AccessFile {
    @ObfuscatedName(value="jt")
    static byte[][] field5365;
    @ObfuscatedName(value="ay")
    @Export(value="file")
    RandomAccessFile file;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(longValue=-755532636098864675L)
    @Export(value="maxSize")
    final long maxSize;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(longValue=8596067630020995745L)
    @Export(value="offset")
    long offset;

    public AccessFile(File file, String string, long l) throws IOException {
        if (l == -1L) {
            l = Long.MAX_VALUE;
        }
        if (file.length() > l) {
            file.delete();
        }
        this.file = new RandomAccessFile(file, string);
        this.maxSize = l;
        this.offset = 0L;
        int n = this.file.read();
        if (n != -1 && !string.equals("r")) {
            this.file.seek(0L);
            this.file.write(n);
        }
        this.file.seek(0L);
    }

    @ObfuscatedName(value="ay")
    @Export(value="seek")
    final void seek(long l) throws IOException {
        this.file.seek(l);
        this.offset = l;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="([BIII)V", garbageValue="833290154")
    @Export(value="write")
    public final void write(byte[] byArray, int n, int n2) throws IOException {
        if (this.offset + (long)n2 <= this.maxSize) {
            this.file.write(byArray, n, n2);
            this.offset += (long)n2;
            return;
        }
        this.file.seek(this.maxSize);
        this.file.write(1);
        throw new EOFException();
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="110")
    @Export(value="close")
    public final void close() throws IOException {
        this.closeSync(false);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="1820290406")
    @Export(value="closeSync")
    public final void closeSync(boolean bl) throws IOException {
        if (this.file != null) {
            if (bl) {
                try {
                    this.file.getFD().sync();
                }
                catch (SyncFailedException syncFailedException) {
                    // empty catch block
                }
            }
            this.file.close();
            this.file = null;
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)J", garbageValue="65535")
    @Export(value="length")
    public final long length() throws IOException {
        return this.file.length();
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="([BIII)I", garbageValue="2041401149")
    @Export(value="read")
    public final int read(byte[] byArray, int n, int n2) throws IOException {
        int n3 = this.file.read(byArray, n, n2);
        if (n3 > 0) {
            this.offset += (long)n3;
        }
        return n3;
    }

    protected void finalize() throws Throwable {
        if (this.file != null) {
            this.close();
        }
    }
}

