package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="uv")
public final class class536 {
    @ObfuscatedName(value="jt")
    static byte[][] field5365;
    @ObfuscatedName(value="ay")
    RandomAccessFile field5363;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(longValue=-755532636098864675L)
    final long field5362;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(longValue=8596067630020995745L)
    long field5364;

    public class536(File file, String string, long l) throws IOException {
        if (l == -1L) {
            l = Long.MAX_VALUE;
        }
        if (file.length() > l) {
            file.delete();
        }
        this.field5363 = new RandomAccessFile(file, string);
        this.field5362 = l;
        this.field5364 = 0L;
        int n = this.field5363.read();
        if (n != -1 && !string.equals("r")) {
            this.field5363.seek(0L);
            this.field5363.write(n);
        }
        this.field5363.seek(0L);
    }

    @ObfuscatedName(value="ay")
    final void method10027(long l) throws IOException {
        this.field5363.seek(l);
        this.field5364 = l;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="([BIII)V", garbageValue="833290154")
    public final void method10028(byte[] byArray, int n, int n2) throws IOException {
        if (this.field5364 + (long)n2 <= this.field5362) {
            this.field5363.write(byArray, n, n2);
            this.field5364 += (long)n2;
            return;
        }
        this.field5363.seek(this.field5362);
        this.field5363.write(1);
        throw new EOFException();
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="110")
    public final void method10037() throws IOException {
        this.method10030(false);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="1820290406")
    public final void method10030(boolean bl) throws IOException {
        if (this.field5363 != null) {
            if (bl) {
                try {
                    this.field5363.getFD().sync();
                }
                catch (SyncFailedException syncFailedException) {
                    // empty catch block
                }
            }
            this.field5363.close();
            this.field5363 = null;
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)J", garbageValue="65535")
    public final long method10031() throws IOException {
        return this.field5363.length();
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="([BIII)I", garbageValue="2041401149")
    public final int method10044(byte[] byArray, int n, int n2) throws IOException {
        int n3 = this.field5363.read(byArray, n, n2);
        if (n3 > 0) {
            this.field5364 += (long)n3;
        }
        return n3;
    }

    protected void finalize() throws Throwable {
        if (this.field5363 != null) {
            this.method10037();
        }
    }
}

