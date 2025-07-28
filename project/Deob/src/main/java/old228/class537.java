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

@ObfuscatedName(value="uc")
public class class537 {
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Luv;")
    class536 field5374;
    @ObfuscatedName(value="az")
    byte[] field5368;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(longValue=-3398309533142168347L)
    long field5369 = -1L;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=893574585)
    int field5370;
    @ObfuscatedName(value="an")
    byte[] field5371;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(longValue=-9200289238593592605L)
    long field5367 = -1L;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=336128357)
    int field5377 = 0;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(longValue=4523741511039997769L)
    long field5372;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(longValue=7268121424706532609L)
    long field5373;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(longValue=-3669922273151907715L)
    long field5376;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(longValue=4796728509207237293L)
    long field5366;

    @ObfuscatedSignature(descriptor="(Luv;II)V")
    public class537(class536 class5362, int n, int n2) throws IOException {
        this.field5374 = class5362;
        this.field5376 = this.field5373 = class5362.method10031();
        this.field5368 = new byte[n];
        this.field5371 = new byte[n2];
        this.field5372 = 0L;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1326483255")
    public void method10049() throws IOException {
        this.method10058();
        this.field5374.method10037();
    }

    @ObfuscatedName(value="ah")
    public void method10050(long l) throws IOException {
        if (l < 0L) {
            throw new IOException("");
        }
        this.field5372 = l;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)J", garbageValue="27")
    public long method10051() {
        return this.field5376;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="([BI)V", garbageValue="-1249394233")
    public void method10052(byte[] byArray) throws IOException {
        this.method10053(byArray, 0, byArray.length);
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="([BIII)V", garbageValue="1664120562")
    public void method10053(byte[] byArray, int n, int n2) throws IOException {
        try {
            int n3;
            if (n2 + n > byArray.length) {
                throw new ArrayIndexOutOfBoundsException(n2 + n - byArray.length);
            }
            if (-1L != this.field5367 && this.field5372 >= this.field5367 && (long)n2 + this.field5372 <= this.field5367 + (long)this.field5377) {
                System.arraycopy(this.field5371, (int)(this.field5372 - this.field5367), byArray, n, n2);
                this.field5372 += (long)n2;
                return;
            }
            long l = this.field5372;
            int n4 = n;
            int n5 = n2;
            if (this.field5372 >= this.field5369 && this.field5372 < this.field5369 + (long)this.field5370) {
                n3 = (int)((long)this.field5370 - (this.field5372 - this.field5369));
                if (n3 > n2) {
                    n3 = n2;
                }
                System.arraycopy(this.field5368, (int)(this.field5372 - this.field5369), byArray, n, n3);
                this.field5372 += (long)n3;
                n = n3 + n;
                n2 -= n3;
            }
            if (n2 > this.field5368.length) {
                this.field5374.method10027(this.field5372);
                this.field5366 = this.field5372;
                while (n2 > 0 && (n3 = this.field5374.method10044(byArray, n, n2)) != -1) {
                    this.field5366 += (long)n3;
                    this.field5372 += (long)n3;
                    n = n3 + n;
                    n2 -= n3;
                }
            } else if (n2 > 0) {
                this.method10059();
                n3 = n2;
                if (n3 > this.field5370) {
                    n3 = this.field5370;
                }
                System.arraycopy(this.field5368, 0, byArray, n, n3);
                n = n3 + n;
                n2 -= n3;
                this.field5372 += (long)n3;
            }
            if (this.field5367 != -1L) {
                if (this.field5367 > this.field5372 && n2 > 0) {
                    n3 = n + (int)(this.field5367 - this.field5372);
                    if (n3 > n2 + n) {
                        n3 = n2 + n;
                    }
                    while (n < n3) {
                        byArray[n++] = 0;
                        --n2;
                        ++this.field5372;
                    }
                }
                long l2 = -1L;
                long l3 = -1L;
                if (this.field5367 >= l && this.field5367 < (long)n5 + l) {
                    l2 = this.field5367;
                } else if (l >= this.field5367 && l < (long)this.field5377 + this.field5367) {
                    l2 = l;
                }
                if ((long)this.field5377 + this.field5367 > l && this.field5367 + (long)this.field5377 <= (long)n5 + l) {
                    l3 = this.field5367 + (long)this.field5377;
                } else if (l + (long)n5 > this.field5367 && l + (long)n5 <= this.field5367 + (long)this.field5377) {
                    l3 = (long)n5 + l;
                }
                if (l2 > -1L && l3 > l2) {
                    int n6 = (int)(l3 - l2);
                    System.arraycopy(this.field5371, (int)(l2 - this.field5367), byArray, (int)(l2 - l) + n4, n6);
                    if (l3 > this.field5372) {
                        n2 = (int)((long)n2 - (l3 - this.field5372));
                        this.field5372 = l3;
                    }
                }
            }
        }
        catch (IOException iOException) {
            this.field5366 = -1L;
            throw iOException;
        }
        if (n2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="0")
    void method10059() throws IOException {
        this.field5370 = 0;
        if (this.field5366 != this.field5372) {
            this.field5374.method10027(this.field5372);
            this.field5366 = this.field5372;
        }
        this.field5369 = this.field5372;
        while (true) {
            int n;
            block7: {
                block6: {
                    if (this.field5370 >= this.field5368.length) break block6;
                    int n2 = this.field5368.length - this.field5370;
                    if (n2 > 200000000) {
                        n2 = 200000000;
                    }
                    if ((n = this.field5374.method10044(this.field5368, this.field5370, n2)) != -1) break block7;
                }
                return;
            }
            this.field5366 += (long)n;
            this.field5370 += n;
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="([BIIB)V", garbageValue="-33")
    public void method10054(byte[] byArray, int n, int n2) throws IOException {
        try {
            if ((long)n2 + this.field5372 > this.field5376) {
                this.field5376 = (long)n2 + this.field5372;
            }
            if (this.field5367 != -1L && (this.field5372 < this.field5367 || this.field5372 > this.field5367 + (long)this.field5377)) {
                this.method10058();
            }
            if (this.field5367 != -1L && this.field5372 + (long)n2 > this.field5367 + (long)this.field5371.length) {
                int n3 = (int)((long)this.field5371.length - (this.field5372 - this.field5367));
                System.arraycopy(byArray, n, this.field5371, (int)(this.field5372 - this.field5367), n3);
                this.field5372 += (long)n3;
                n = n3 + n;
                n2 -= n3;
                this.field5377 = this.field5371.length;
                this.method10058();
            }
            if (n2 > this.field5371.length) {
                if (this.field5372 != this.field5366) {
                    this.field5374.method10027(this.field5372);
                    this.field5366 = this.field5372;
                }
                this.field5374.method10028(byArray, n, n2);
                this.field5366 += (long)n2;
                if (this.field5366 > this.field5373) {
                    this.field5373 = this.field5366;
                }
                long l = -1L;
                long l2 = -1L;
                if (this.field5372 >= this.field5369 && this.field5372 < (long)this.field5370 + this.field5369) {
                    l = this.field5372;
                } else if (this.field5369 >= this.field5372 && this.field5369 < this.field5372 + (long)n2) {
                    l = this.field5369;
                }
                if (this.field5372 + (long)n2 > this.field5369 && (long)n2 + this.field5372 <= this.field5369 + (long)this.field5370) {
                    l2 = this.field5372 + (long)n2;
                } else if ((long)this.field5370 + this.field5369 > this.field5372 && this.field5369 + (long)this.field5370 <= this.field5372 + (long)n2) {
                    l2 = this.field5369 + (long)this.field5370;
                }
                if (l > -1L && l2 > l) {
                    int n4 = (int)(l2 - l);
                    System.arraycopy(byArray, (int)((long)n + l - this.field5372), this.field5368, (int)(l - this.field5369), n4);
                }
                this.field5372 += (long)n2;
                return;
            }
            if (n2 > 0) {
                if (-1L == this.field5367) {
                    this.field5367 = this.field5372;
                }
                System.arraycopy(byArray, n, this.field5371, (int)(this.field5372 - this.field5367), n2);
                this.field5372 += (long)n2;
                if (this.field5372 - this.field5367 > (long)this.field5377) {
                    this.field5377 = (int)(this.field5372 - this.field5367);
                }
                return;
            }
        }
        catch (IOException iOException) {
            this.field5366 = -1L;
            throw iOException;
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1915339222")
    void method10058() throws IOException {
        if (-1L != this.field5367) {
            if (this.field5366 != this.field5367) {
                this.field5374.method10027(this.field5367);
                this.field5366 = this.field5367;
            }
            this.field5374.method10028(this.field5371, 0, this.field5377);
            this.field5366 += 336128357L * (long)(this.field5377 * -1033363347);
            if (this.field5366 > this.field5373) {
                this.field5373 = this.field5366;
            }
            long l = -1L;
            long l2 = -1L;
            if (this.field5367 >= this.field5369 && this.field5367 < this.field5369 + (long)this.field5370) {
                l = this.field5367;
            } else if (this.field5369 >= this.field5367 && this.field5369 < this.field5367 + (long)this.field5377) {
                l = this.field5369;
            }
            if (this.field5367 + (long)this.field5377 > this.field5369 && (long)this.field5377 + this.field5367 <= (long)this.field5370 + this.field5369) {
                l2 = this.field5367 + (long)this.field5377;
            } else if ((long)this.field5370 + this.field5369 > this.field5367 && this.field5369 + (long)this.field5370 <= this.field5367 + (long)this.field5377) {
                l2 = this.field5369 + (long)this.field5370;
            }
            if (l > -1L && l2 > l) {
                int n = (int)(l2 - l);
                System.arraycopy(this.field5371, (int)(l - this.field5367), this.field5368, (int)(l - this.field5369), n);
            }
            this.field5367 = -1L;
            this.field5377 = 0;
        }
    }
}

