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
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="uc")
@Implements(value="BufferedFile")
public class BufferedFile {
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Luv;")
    @Export(value="accessFile")
    AccessFile accessFile;
    @ObfuscatedName(value="az")
    @Export(value="readBuffer")
    byte[] readBuffer;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(longValue=-3398309533142168347L)
    @Export(value="readBufferOffset")
    long readBufferOffset = -1L;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=893574585)
    @Export(value="readBufferLength")
    int readBufferLength;
    @ObfuscatedName(value="an")
    @Export(value="writeBuffer")
    byte[] writeBuffer;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(longValue=-9200289238593592605L)
    @Export(value="writeBufferOffset")
    long writeBufferOffset = -1L;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=336128357)
    @Export(value="writeBufferLength")
    int writeBufferLength = 0;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(longValue=4523741511039997769L)
    @Export(value="offset")
    long offset;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(longValue=7268121424706532609L)
    @Export(value="fileLength")
    long fileLength;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(longValue=-3669922273151907715L)
    @Export(value="length")
    long length;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(longValue=4796728509207237293L)
    @Export(value="fileOffset")
    long fileOffset;

    @ObfuscatedSignature(descriptor="(Luv;II)V")
    public BufferedFile(AccessFile accessFile, int n, int n2) throws IOException {
        this.accessFile = accessFile;
        this.length = this.fileLength = accessFile.length();
        this.readBuffer = new byte[n];
        this.writeBuffer = new byte[n2];
        this.offset = 0L;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1326483255")
    @Export(value="close")
    public void close() throws IOException {
        this.flush();
        this.accessFile.close();
    }

    @ObfuscatedName(value="ah")
    @Export(value="seek")
    public void seek(long l) throws IOException {
        if (l < 0L) {
            throw new IOException("");
        }
        this.offset = l;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)J", garbageValue="27")
    @Export(value="length")
    public long length() {
        return this.length;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="([BI)V", garbageValue="-1249394233")
    @Export(value="readFully")
    public void readFully(byte[] byArray) throws IOException {
        this.read(byArray, 0, byArray.length);
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="([BIII)V", garbageValue="1664120562")
    @Export(value="read")
    public void read(byte[] byArray, int n, int n2) throws IOException {
        try {
            int n3;
            if (n2 + n > byArray.length) {
                throw new ArrayIndexOutOfBoundsException(n2 + n - byArray.length);
            }
            if (-1L != this.writeBufferOffset && this.offset >= this.writeBufferOffset && (long)n2 + this.offset <= this.writeBufferOffset + (long)this.writeBufferLength) {
                System.arraycopy(this.writeBuffer, (int)(this.offset - this.writeBufferOffset), byArray, n, n2);
                this.offset += (long)n2;
                return;
            }
            long l = this.offset;
            int n4 = n;
            int n5 = n2;
            if (this.offset >= this.readBufferOffset && this.offset < this.readBufferOffset + (long)this.readBufferLength) {
                n3 = (int)((long)this.readBufferLength - (this.offset - this.readBufferOffset));
                if (n3 > n2) {
                    n3 = n2;
                }
                System.arraycopy(this.readBuffer, (int)(this.offset - this.readBufferOffset), byArray, n, n3);
                this.offset += (long)n3;
                n = n3 + n;
                n2 -= n3;
            }
            if (n2 > this.readBuffer.length) {
                this.accessFile.seek(this.offset);
                this.fileOffset = this.offset;
                while (n2 > 0 && (n3 = this.accessFile.read(byArray, n, n2)) != -1) {
                    this.fileOffset += (long)n3;
                    this.offset += (long)n3;
                    n = n3 + n;
                    n2 -= n3;
                }
            } else if (n2 > 0) {
                this.load();
                n3 = n2;
                if (n3 > this.readBufferLength) {
                    n3 = this.readBufferLength;
                }
                System.arraycopy(this.readBuffer, 0, byArray, n, n3);
                n = n3 + n;
                n2 -= n3;
                this.offset += (long)n3;
            }
            if (this.writeBufferOffset != -1L) {
                if (this.writeBufferOffset > this.offset && n2 > 0) {
                    n3 = n + (int)(this.writeBufferOffset - this.offset);
                    if (n3 > n2 + n) {
                        n3 = n2 + n;
                    }
                    while (n < n3) {
                        byArray[n++] = 0;
                        --n2;
                        ++this.offset;
                    }
                }
                long l2 = -1L;
                long l3 = -1L;
                if (this.writeBufferOffset >= l && this.writeBufferOffset < (long)n5 + l) {
                    l2 = this.writeBufferOffset;
                } else if (l >= this.writeBufferOffset && l < (long)this.writeBufferLength + this.writeBufferOffset) {
                    l2 = l;
                }
                if ((long)this.writeBufferLength + this.writeBufferOffset > l && this.writeBufferOffset + (long)this.writeBufferLength <= (long)n5 + l) {
                    l3 = this.writeBufferOffset + (long)this.writeBufferLength;
                } else if (l + (long)n5 > this.writeBufferOffset && l + (long)n5 <= this.writeBufferOffset + (long)this.writeBufferLength) {
                    l3 = (long)n5 + l;
                }
                if (l2 > -1L && l3 > l2) {
                    int n6 = (int)(l3 - l2);
                    System.arraycopy(this.writeBuffer, (int)(l2 - this.writeBufferOffset), byArray, (int)(l2 - l) + n4, n6);
                    if (l3 > this.offset) {
                        n2 = (int)((long)n2 - (l3 - this.offset));
                        this.offset = l3;
                    }
                }
            }
        }
        catch (IOException iOException) {
            this.fileOffset = -1L;
            throw iOException;
        }
        if (n2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="0")
    @Export(value="load")
    void load() throws IOException {
        this.readBufferLength = 0;
        if (this.fileOffset != this.offset) {
            this.accessFile.seek(this.offset);
            this.fileOffset = this.offset;
        }
        this.readBufferOffset = this.offset;
        while (true) {
            int n;
            block7: {
                block6: {
                    if (this.readBufferLength >= this.readBuffer.length) break block6;
                    int n2 = this.readBuffer.length - this.readBufferLength;
                    if (n2 > 200000000) {
                        n2 = 200000000;
                    }
                    if ((n = this.accessFile.read(this.readBuffer, this.readBufferLength, n2)) != -1) break block7;
                }
                return;
            }
            this.fileOffset += (long)n;
            this.readBufferLength += n;
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="([BIIB)V", garbageValue="-33")
    @Export(value="write")
    public void write(byte[] byArray, int n, int n2) throws IOException {
        try {
            if ((long)n2 + this.offset > this.length) {
                this.length = (long)n2 + this.offset;
            }
            if (this.writeBufferOffset != -1L && (this.offset < this.writeBufferOffset || this.offset > this.writeBufferOffset + (long)this.writeBufferLength)) {
                this.flush();
            }
            if (this.writeBufferOffset != -1L && this.offset + (long)n2 > this.writeBufferOffset + (long)this.writeBuffer.length) {
                int n3 = (int)((long)this.writeBuffer.length - (this.offset - this.writeBufferOffset));
                System.arraycopy(byArray, n, this.writeBuffer, (int)(this.offset - this.writeBufferOffset), n3);
                this.offset += (long)n3;
                n = n3 + n;
                n2 -= n3;
                this.writeBufferLength = this.writeBuffer.length;
                this.flush();
            }
            if (n2 > this.writeBuffer.length) {
                if (this.offset != this.fileOffset) {
                    this.accessFile.seek(this.offset);
                    this.fileOffset = this.offset;
                }
                this.accessFile.write(byArray, n, n2);
                this.fileOffset += (long)n2;
                if (this.fileOffset > this.fileLength) {
                    this.fileLength = this.fileOffset;
                }
                long l = -1L;
                long l2 = -1L;
                if (this.offset >= this.readBufferOffset && this.offset < (long)this.readBufferLength + this.readBufferOffset) {
                    l = this.offset;
                } else if (this.readBufferOffset >= this.offset && this.readBufferOffset < this.offset + (long)n2) {
                    l = this.readBufferOffset;
                }
                if (this.offset + (long)n2 > this.readBufferOffset && (long)n2 + this.offset <= this.readBufferOffset + (long)this.readBufferLength) {
                    l2 = this.offset + (long)n2;
                } else if ((long)this.readBufferLength + this.readBufferOffset > this.offset && this.readBufferOffset + (long)this.readBufferLength <= this.offset + (long)n2) {
                    l2 = this.readBufferOffset + (long)this.readBufferLength;
                }
                if (l > -1L && l2 > l) {
                    int n4 = (int)(l2 - l);
                    System.arraycopy(byArray, (int)((long)n + l - this.offset), this.readBuffer, (int)(l - this.readBufferOffset), n4);
                }
                this.offset += (long)n2;
                return;
            }
            if (n2 > 0) {
                if (-1L == this.writeBufferOffset) {
                    this.writeBufferOffset = this.offset;
                }
                System.arraycopy(byArray, n, this.writeBuffer, (int)(this.offset - this.writeBufferOffset), n2);
                this.offset += (long)n2;
                if (this.offset - this.writeBufferOffset > (long)this.writeBufferLength) {
                    this.writeBufferLength = (int)(this.offset - this.writeBufferOffset);
                }
                return;
            }
        }
        catch (IOException iOException) {
            this.fileOffset = -1L;
            throw iOException;
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1915339222")
    @Export(value="flush")
    void flush() throws IOException {
        if (-1L != this.writeBufferOffset) {
            if (this.fileOffset != this.writeBufferOffset) {
                this.accessFile.seek(this.writeBufferOffset);
                this.fileOffset = this.writeBufferOffset;
            }
            this.accessFile.write(this.writeBuffer, 0, this.writeBufferLength);
            this.fileOffset += 336128357L * (long)(this.writeBufferLength * -1033363347);
            if (this.fileOffset > this.fileLength) {
                this.fileLength = this.fileOffset;
            }
            long l = -1L;
            long l2 = -1L;
            if (this.writeBufferOffset >= this.readBufferOffset && this.writeBufferOffset < this.readBufferOffset + (long)this.readBufferLength) {
                l = this.writeBufferOffset;
            } else if (this.readBufferOffset >= this.writeBufferOffset && this.readBufferOffset < this.writeBufferOffset + (long)this.writeBufferLength) {
                l = this.readBufferOffset;
            }
            if (this.writeBufferOffset + (long)this.writeBufferLength > this.readBufferOffset && (long)this.writeBufferLength + this.writeBufferOffset <= (long)this.readBufferLength + this.readBufferOffset) {
                l2 = this.writeBufferOffset + (long)this.writeBufferLength;
            } else if ((long)this.readBufferLength + this.readBufferOffset > this.writeBufferOffset && this.readBufferOffset + (long)this.readBufferLength <= this.writeBufferOffset + (long)this.writeBufferLength) {
                l2 = this.readBufferOffset + (long)this.readBufferLength;
            }
            if (l > -1L && l2 > l) {
                int n = (int)(l2 - l);
                System.arraycopy(this.writeBuffer, (int)(l - this.writeBufferOffset), this.readBuffer, (int)(l - this.readBufferOffset), n);
            }
            this.writeBufferOffset = -1L;
            this.writeBufferLength = 0;
        }
    }
}

