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

@ObfuscatedName(value="sh")
@Implements(value="ArchiveDisk")
public final class ArchiveDisk {
    @ObfuscatedName(value="ay")
    @Export(value="ArchiveDisk_buffer")
    static byte[] ArchiveDisk_buffer = new byte[520];
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Luc;")
    @Export(value="datFile")
    BufferedFile datFile = null;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Luc;")
    @Export(value="idxFile")
    BufferedFile idxFile = null;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=541395447)
    @Export(value="archive")
    int archive;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1224551879)
    @Export(value="maxEntrySize")
    int maxEntrySize = 65000;

    @ObfuscatedSignature(descriptor="(ILuc;Luc;I)V")
    public ArchiveDisk(int n, BufferedFile bufferedFile, BufferedFile bufferedFile2, int n2) {
        this.archive = n;
        this.datFile = bufferedFile;
        this.idxFile = bufferedFile2;
        this.maxEntrySize = n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)[B", garbageValue="-399191126")
    @Export(value="read")
    public byte[] read(int n) {
        BufferedFile bufferedFile = this.datFile;
        synchronized (bufferedFile) {
            try {
                if (this.idxFile.length() < (long)(n * 6 + 6)) {
                    return null;
                }
                this.idxFile.seek(n * 6);
                this.idxFile.read(ArchiveDisk_buffer, 0, 6);
                int n2 = ((ArchiveDisk_buffer[0] & 0xFF) << 16) + (ArchiveDisk_buffer[2] & 0xFF) + ((ArchiveDisk_buffer[1] & 0xFF) << 8);
                int n3 = (ArchiveDisk_buffer[5] & 0xFF) + ((ArchiveDisk_buffer[3] & 0xFF) << 16) + ((ArchiveDisk_buffer[4] & 0xFF) << 8);
                if (n2 < 0 || n2 > this.maxEntrySize) {
                    return null;
                }
                if (n3 <= 0 || (long)n3 > this.datFile.length() / 520L) {
                    return null;
                }
                byte[] byArray = new byte[n2];
                int n4 = 0;
                int n5 = 0;
                while (n4 < n2) {
                    int n6;
                    int n7;
                    int n8;
                    int n9;
                    int n10;
                    if (n3 == 0) {
                        return null;
                    }
                    this.datFile.seek(520L * (long)n3);
                    int n11 = n2 - n4;
                    if (n > 65535) {
                        if (n11 > 510) {
                            n11 = 510;
                        }
                        n10 = 10;
                        this.datFile.read(ArchiveDisk_buffer, 0, n11 + n10);
                        n9 = ((ArchiveDisk_buffer[1] & 0xFF) << 16) + ((ArchiveDisk_buffer[0] & 0xFF) << 24) + (ArchiveDisk_buffer[3] & 0xFF) + ((ArchiveDisk_buffer[2] & 0xFF) << 8);
                        n8 = (ArchiveDisk_buffer[5] & 0xFF) + ((ArchiveDisk_buffer[4] & 0xFF) << 8);
                        n7 = (ArchiveDisk_buffer[8] & 0xFF) + ((ArchiveDisk_buffer[7] & 0xFF) << 8) + ((ArchiveDisk_buffer[6] & 0xFF) << 16);
                        n6 = ArchiveDisk_buffer[9] & 0xFF;
                    } else {
                        if (n11 > 512) {
                            n11 = 512;
                        }
                        n10 = 8;
                        this.datFile.read(ArchiveDisk_buffer, 0, n10 + n11);
                        n9 = (ArchiveDisk_buffer[1] & 0xFF) + ((ArchiveDisk_buffer[0] & 0xFF) << 8);
                        n8 = (ArchiveDisk_buffer[3] & 0xFF) + ((ArchiveDisk_buffer[2] & 0xFF) << 8);
                        n7 = ((ArchiveDisk_buffer[5] & 0xFF) << 8) + ((ArchiveDisk_buffer[4] & 0xFF) << 16) + (ArchiveDisk_buffer[6] & 0xFF);
                        n6 = ArchiveDisk_buffer[7] & 0xFF;
                    }
                    if (n9 != n || n5 != n8 || n6 != this.archive) {
                        return null;
                    }
                    if (n7 < 0 || (long)n7 > this.datFile.length() / 520L) {
                        return null;
                    }
                    int n12 = n10 + n11;
                    for (int i = n10; i < n12; ++i) {
                        byArray[n4++] = ArchiveDisk_buffer[i];
                    }
                    n3 = n7;
                    ++n5;
                }
                return byArray;
            }
            catch (IOException iOException) {
                return null;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I[BII)Z", garbageValue="88936568")
    @Export(value="write")
    public boolean write(int n, byte[] byArray, int n2) {
        BufferedFile bufferedFile = this.datFile;
        synchronized (bufferedFile) {
            if (n2 < 0 || n2 > this.maxEntrySize) {
                throw new IllegalArgumentException("" + this.archive + ',' + n + ',' + n2);
            }
            boolean bl = this.write0(n, byArray, n2, true);
            if (!bl) {
                bl = this.write0(n, byArray, n2, false);
            }
            return bl;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I[BIZI)Z", garbageValue="1973649601")
    @Export(value="write0")
    boolean write0(int n, byte[] byArray, int n2, boolean bl) {
        BufferedFile bufferedFile = this.datFile;
        synchronized (bufferedFile) {
            try {
                int n3;
                if (bl) {
                    if (this.idxFile.length() < (long)(n * 6 + 6)) {
                        return false;
                    }
                    this.idxFile.seek(n * 6);
                    this.idxFile.read(ArchiveDisk_buffer, 0, 6);
                    n3 = (ArchiveDisk_buffer[5] & 0xFF) + ((ArchiveDisk_buffer[3] & 0xFF) << 16) + ((ArchiveDisk_buffer[4] & 0xFF) << 8);
                    if (n3 <= 0 || (long)n3 > this.datFile.length() / 520L) {
                        return false;
                    }
                } else {
                    n3 = (int)((this.datFile.length() + 519L) / 520L);
                    if (n3 == 0) {
                        n3 = 1;
                    }
                }
                ArchiveDisk.ArchiveDisk_buffer[0] = (byte)(n2 >> 16);
                ArchiveDisk.ArchiveDisk_buffer[1] = (byte)(n2 >> 8);
                ArchiveDisk.ArchiveDisk_buffer[2] = (byte)n2;
                ArchiveDisk.ArchiveDisk_buffer[3] = (byte)(n3 >> 16);
                ArchiveDisk.ArchiveDisk_buffer[4] = (byte)(n3 >> 8);
                ArchiveDisk.ArchiveDisk_buffer[5] = (byte)n3;
                this.idxFile.seek(n * 6);
                this.idxFile.write(ArchiveDisk_buffer, 0, 6);
                int n4 = 0;
                int n5 = 0;
                while (n4 < n2) {
                    int n6;
                    int n7 = 0;
                    if (bl) {
                        int n8;
                        int n9;
                        this.datFile.seek(520L * (long)n3);
                        if (n > 65535) {
                            try {
                                this.datFile.read(ArchiveDisk_buffer, 0, 10);
                            }
                            catch (EOFException eOFException) {
                                break;
                            }
                            n6 = ((ArchiveDisk_buffer[1] & 0xFF) << 16) + ((ArchiveDisk_buffer[0] & 0xFF) << 24) + (ArchiveDisk_buffer[3] & 0xFF) + ((ArchiveDisk_buffer[2] & 0xFF) << 8);
                            n9 = (ArchiveDisk_buffer[5] & 0xFF) + ((ArchiveDisk_buffer[4] & 0xFF) << 8);
                            n7 = (ArchiveDisk_buffer[8] & 0xFF) + ((ArchiveDisk_buffer[7] & 0xFF) << 8) + ((ArchiveDisk_buffer[6] & 0xFF) << 16);
                            n8 = ArchiveDisk_buffer[9] & 0xFF;
                        } else {
                            try {
                                this.datFile.read(ArchiveDisk_buffer, 0, 8);
                            }
                            catch (EOFException eOFException) {
                                break;
                            }
                            n6 = (ArchiveDisk_buffer[1] & 0xFF) + ((ArchiveDisk_buffer[0] & 0xFF) << 8);
                            n9 = (ArchiveDisk_buffer[3] & 0xFF) + ((ArchiveDisk_buffer[2] & 0xFF) << 8);
                            n7 = ((ArchiveDisk_buffer[5] & 0xFF) << 8) + ((ArchiveDisk_buffer[4] & 0xFF) << 16) + (ArchiveDisk_buffer[6] & 0xFF);
                            n8 = ArchiveDisk_buffer[7] & 0xFF;
                        }
                        if (n6 != n || n5 != n9 || n8 != this.archive) {
                            return false;
                        }
                        if (n7 < 0 || (long)n7 > this.datFile.length() / 520L) {
                            return false;
                        }
                    }
                    if (n7 == 0) {
                        bl = false;
                        n7 = (int)((this.datFile.length() + 519L) / 520L);
                        if (n7 == 0) {
                            ++n7;
                        }
                        if (n7 == n3) {
                            ++n7;
                        }
                    }
                    if (n > 65535) {
                        if (n2 - n4 <= 510) {
                            n7 = 0;
                        }
                        ArchiveDisk.ArchiveDisk_buffer[0] = (byte)(n >> 24);
                        ArchiveDisk.ArchiveDisk_buffer[1] = (byte)(n >> 16);
                        ArchiveDisk.ArchiveDisk_buffer[2] = (byte)(n >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[3] = (byte)n;
                        ArchiveDisk.ArchiveDisk_buffer[4] = (byte)(n5 >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[5] = (byte)n5;
                        ArchiveDisk.ArchiveDisk_buffer[6] = (byte)(n7 >> 16);
                        ArchiveDisk.ArchiveDisk_buffer[7] = (byte)(n7 >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[8] = (byte)n7;
                        ArchiveDisk.ArchiveDisk_buffer[9] = (byte)this.archive;
                        this.datFile.seek((long)n3 * 520L);
                        this.datFile.write(ArchiveDisk_buffer, 0, 10);
                        n6 = n2 - n4;
                        if (n6 > 510) {
                            n6 = 510;
                        }
                        this.datFile.write(byArray, n4, n6);
                        n4 += n6;
                    } else {
                        if (n2 - n4 <= 512) {
                            n7 = 0;
                        }
                        ArchiveDisk.ArchiveDisk_buffer[0] = (byte)(n >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[1] = (byte)n;
                        ArchiveDisk.ArchiveDisk_buffer[2] = (byte)(n5 >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[3] = (byte)n5;
                        ArchiveDisk.ArchiveDisk_buffer[4] = (byte)(n7 >> 16);
                        ArchiveDisk.ArchiveDisk_buffer[5] = (byte)(n7 >> 8);
                        ArchiveDisk.ArchiveDisk_buffer[6] = (byte)n7;
                        ArchiveDisk.ArchiveDisk_buffer[7] = (byte)this.archive;
                        this.datFile.seek(520L * (long)n3);
                        this.datFile.write(ArchiveDisk_buffer, 0, 8);
                        n6 = n2 - n4;
                        if (n6 > 512) {
                            n6 = 512;
                        }
                        this.datFile.write(byArray, n4, n6);
                        n4 += n6;
                    }
                    n3 = n7;
                    ++n5;
                }
                return true;
            }
            catch (IOException iOException) {
                return false;
            }
        }
    }

    public String toString() {
        return "" + this.archive;
    }
}

