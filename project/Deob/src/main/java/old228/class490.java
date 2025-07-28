package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="sh")
public final class class490 {
    @ObfuscatedName(value="ay")
    static byte[] field5084 = new byte[520];
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Luc;")
    class537 field5081 = null;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Luc;")
    class537 field5082 = null;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=541395447)
    int field5083;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1224551879)
    int field5080 = 65000;

    @ObfuscatedSignature(descriptor="(ILuc;Luc;I)V")
    public class490(int n, class537 class5372, class537 class5373, int n2) {
        this.field5083 = n;
        this.field5081 = class5372;
        this.field5082 = class5373;
        this.field5080 = n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)[B", garbageValue="-399191126")
    public byte[] method9468(int n) {
        class537 class5372 = this.field5081;
        synchronized (class5372) {
            try {
                if (this.field5082.method10051() < (long)(n * 6 + 6)) {
                    return null;
                }
                this.field5082.method10050(n * 6);
                this.field5082.method10053(field5084, 0, 6);
                int n2 = ((field5084[0] & 0xFF) << 16) + (field5084[2] & 0xFF) + ((field5084[1] & 0xFF) << 8);
                int n3 = (field5084[5] & 0xFF) + ((field5084[3] & 0xFF) << 16) + ((field5084[4] & 0xFF) << 8);
                if (n2 < 0 || n2 > this.field5080) {
                    return null;
                }
                if (n3 <= 0 || (long)n3 > this.field5081.method10051() / 520L) {
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
                    this.field5081.method10050(520L * (long)n3);
                    int n11 = n2 - n4;
                    if (n > 65535) {
                        if (n11 > 510) {
                            n11 = 510;
                        }
                        n10 = 10;
                        this.field5081.method10053(field5084, 0, n11 + n10);
                        n9 = ((field5084[1] & 0xFF) << 16) + ((field5084[0] & 0xFF) << 24) + (field5084[3] & 0xFF) + ((field5084[2] & 0xFF) << 8);
                        n8 = (field5084[5] & 0xFF) + ((field5084[4] & 0xFF) << 8);
                        n7 = (field5084[8] & 0xFF) + ((field5084[7] & 0xFF) << 8) + ((field5084[6] & 0xFF) << 16);
                        n6 = field5084[9] & 0xFF;
                    } else {
                        if (n11 > 512) {
                            n11 = 512;
                        }
                        n10 = 8;
                        this.field5081.method10053(field5084, 0, n10 + n11);
                        n9 = (field5084[1] & 0xFF) + ((field5084[0] & 0xFF) << 8);
                        n8 = (field5084[3] & 0xFF) + ((field5084[2] & 0xFF) << 8);
                        n7 = ((field5084[5] & 0xFF) << 8) + ((field5084[4] & 0xFF) << 16) + (field5084[6] & 0xFF);
                        n6 = field5084[7] & 0xFF;
                    }
                    if (n9 != n || n5 != n8 || n6 != this.field5083) {
                        return null;
                    }
                    if (n7 < 0 || (long)n7 > this.field5081.method10051() / 520L) {
                        return null;
                    }
                    int n12 = n10 + n11;
                    for (int i = n10; i < n12; ++i) {
                        byArray[n4++] = field5084[i];
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
    public boolean method9469(int n, byte[] byArray, int n2) {
        class537 class5372 = this.field5081;
        synchronized (class5372) {
            if (n2 < 0 || n2 > this.field5080) {
                throw new IllegalArgumentException("" + this.field5083 + ',' + n + ',' + n2);
            }
            boolean bl = this.method9479(n, byArray, n2, true);
            if (!bl) {
                bl = this.method9479(n, byArray, n2, false);
            }
            return bl;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I[BIZI)Z", garbageValue="1973649601")
    boolean method9479(int n, byte[] byArray, int n2, boolean bl) {
        class537 class5372 = this.field5081;
        synchronized (class5372) {
            try {
                int n3;
                if (bl) {
                    if (this.field5082.method10051() < (long)(n * 6 + 6)) {
                        return false;
                    }
                    this.field5082.method10050(n * 6);
                    this.field5082.method10053(field5084, 0, 6);
                    n3 = (field5084[5] & 0xFF) + ((field5084[3] & 0xFF) << 16) + ((field5084[4] & 0xFF) << 8);
                    if (n3 <= 0 || (long)n3 > this.field5081.method10051() / 520L) {
                        return false;
                    }
                } else {
                    n3 = (int)((this.field5081.method10051() + 519L) / 520L);
                    if (n3 == 0) {
                        n3 = 1;
                    }
                }
                class490.field5084[0] = (byte)(n2 >> 16);
                class490.field5084[1] = (byte)(n2 >> 8);
                class490.field5084[2] = (byte)n2;
                class490.field5084[3] = (byte)(n3 >> 16);
                class490.field5084[4] = (byte)(n3 >> 8);
                class490.field5084[5] = (byte)n3;
                this.field5082.method10050(n * 6);
                this.field5082.method10054(field5084, 0, 6);
                int n4 = 0;
                int n5 = 0;
                while (n4 < n2) {
                    int n6;
                    int n7 = 0;
                    if (bl) {
                        int n8;
                        int n9;
                        this.field5081.method10050(520L * (long)n3);
                        if (n > 65535) {
                            try {
                                this.field5081.method10053(field5084, 0, 10);
                            }
                            catch (EOFException eOFException) {
                                break;
                            }
                            n6 = ((field5084[1] & 0xFF) << 16) + ((field5084[0] & 0xFF) << 24) + (field5084[3] & 0xFF) + ((field5084[2] & 0xFF) << 8);
                            n9 = (field5084[5] & 0xFF) + ((field5084[4] & 0xFF) << 8);
                            n7 = (field5084[8] & 0xFF) + ((field5084[7] & 0xFF) << 8) + ((field5084[6] & 0xFF) << 16);
                            n8 = field5084[9] & 0xFF;
                        } else {
                            try {
                                this.field5081.method10053(field5084, 0, 8);
                            }
                            catch (EOFException eOFException) {
                                break;
                            }
                            n6 = (field5084[1] & 0xFF) + ((field5084[0] & 0xFF) << 8);
                            n9 = (field5084[3] & 0xFF) + ((field5084[2] & 0xFF) << 8);
                            n7 = ((field5084[5] & 0xFF) << 8) + ((field5084[4] & 0xFF) << 16) + (field5084[6] & 0xFF);
                            n8 = field5084[7] & 0xFF;
                        }
                        if (n6 != n || n5 != n9 || n8 != this.field5083) {
                            return false;
                        }
                        if (n7 < 0 || (long)n7 > this.field5081.method10051() / 520L) {
                            return false;
                        }
                    }
                    if (n7 == 0) {
                        bl = false;
                        n7 = (int)((this.field5081.method10051() + 519L) / 520L);
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
                        class490.field5084[0] = (byte)(n >> 24);
                        class490.field5084[1] = (byte)(n >> 16);
                        class490.field5084[2] = (byte)(n >> 8);
                        class490.field5084[3] = (byte)n;
                        class490.field5084[4] = (byte)(n5 >> 8);
                        class490.field5084[5] = (byte)n5;
                        class490.field5084[6] = (byte)(n7 >> 16);
                        class490.field5084[7] = (byte)(n7 >> 8);
                        class490.field5084[8] = (byte)n7;
                        class490.field5084[9] = (byte)this.field5083;
                        this.field5081.method10050((long)n3 * 520L);
                        this.field5081.method10054(field5084, 0, 10);
                        n6 = n2 - n4;
                        if (n6 > 510) {
                            n6 = 510;
                        }
                        this.field5081.method10054(byArray, n4, n6);
                        n4 += n6;
                    } else {
                        if (n2 - n4 <= 512) {
                            n7 = 0;
                        }
                        class490.field5084[0] = (byte)(n >> 8);
                        class490.field5084[1] = (byte)n;
                        class490.field5084[2] = (byte)(n5 >> 8);
                        class490.field5084[3] = (byte)n5;
                        class490.field5084[4] = (byte)(n7 >> 16);
                        class490.field5084[5] = (byte)(n7 >> 8);
                        class490.field5084[6] = (byte)n7;
                        class490.field5084[7] = (byte)this.field5083;
                        this.field5081.method10050(520L * (long)n3);
                        this.field5081.method10054(field5084, 0, 8);
                        n6 = n2 - n4;
                        if (n6 > 512) {
                            n6 = 512;
                        }
                        this.field5081.method10054(byArray, n4, n6);
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
        return "" + this.field5083;
    }
}

