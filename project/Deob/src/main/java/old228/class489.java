package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="sv")
public class class489
implements Runnable {
    @ObfuscatedName(value="ay")
    Thread field5072;
    @ObfuscatedName(value="ah")
    OutputStream field5077;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1411750849)
    int field5074;
    @ObfuscatedName(value="ao")
    byte[] field5075;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=1591863287)
    int field5076 = 0;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=2081628013)
    int field5073 = 0;
    @ObfuscatedName(value="ae")
    IOException field5078;
    @ObfuscatedName(value="ax")
    boolean field5079;

    class489(OutputStream outputStream, int n) {
        this.field5077 = outputStream;
        this.field5074 = n + 1;
        this.field5075 = new byte[this.field5074];
        this.field5072 = new Thread(this);
        this.field5072.setDaemon(true);
        this.field5072.start();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1522866853")
    boolean method9460() {
        if (this.field5079) {
            block4: {
                try {
                    this.field5077.close();
                    if (this.field5078 == null) {
                        this.field5078 = new IOException("");
                    }
                }
                catch (IOException iOException) {
                    if (this.field5078 != null) break block4;
                    this.field5078 = new IOException(iOException);
                }
            }
            return true;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="([BIII)V", garbageValue="1044363336")
    void method9461(byte[] byArray, int n, int n2) throws IOException {
        if (n2 < 0 || n < 0 || n2 + n > byArray.length) {
            throw new IOException();
        }
        class489 class4892 = this;
        synchronized (class4892) {
            if (this.field5078 != null) {
                throw new IOException(this.field5078.toString());
            }
            int n3 = this.field5076 <= this.field5073 ? this.field5074 - this.field5073 + this.field5076 - 1 : this.field5076 - this.field5073 - 1;
            if (n3 < n2) {
                throw new IOException("");
            }
            if (n2 + this.field5073 <= this.field5074) {
                System.arraycopy(byArray, n, this.field5075, this.field5073, n2);
            } else {
                int n4 = this.field5074 - this.field5073;
                System.arraycopy(byArray, n, this.field5075, this.field5073, n4);
                System.arraycopy(byArray, n4 + n, this.field5075, 0, n2 - n4);
            }
            this.field5073 = (n2 + this.field5073) % this.field5074;
            this.notifyAll();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="105")
    void method9462() {
        class489 class4892 = this;
        synchronized (class4892) {
            this.field5079 = true;
            this.notifyAll();
        }
        try {
            this.field5072.join();
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        do {
            int n;
            class489 class4892 = this;
            synchronized (class4892) {
                while (true) {
                    if (this.field5078 != null) {
                        return;
                    }
                    n = this.field5076 <= this.field5073 ? this.field5073 - this.field5076 : this.field5074 - this.field5076 + this.field5073;
                    if (n > 0) break;
                    try {
                        this.field5077.flush();
                    }
                    catch (IOException iOException) {
                        this.field5078 = iOException;
                        return;
                    }
                    if (this.method9460()) {
                        return;
                    }
                    try {
                        this.wait();
                    }
                    catch (InterruptedException interruptedException) {}
                }
            }
            try {
                if (n + this.field5076 <= this.field5074) {
                    this.field5077.write(this.field5075, this.field5076, n);
                } else {
                    int n2 = this.field5074 - this.field5076;
                    this.field5077.write(this.field5075, this.field5076, n2);
                    this.field5077.write(this.field5075, 0, n - n2);
                }
            }
            catch (IOException iOException) {
                class489 class4893 = this;
                synchronized (class4893) {
                    this.field5078 = iOException;
                    return;
                }
            }
            class4892 = this;
            synchronized (class4892) {
                this.field5076 = (n + this.field5076) % this.field5074;
            }
        } while (!this.method9460());
    }
}

