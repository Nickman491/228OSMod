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
import java.io.InputStream;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="sd")
public class class488
implements Runnable {
    @ObfuscatedName(value="ay")
    Thread field5067;
    @ObfuscatedName(value="ah")
    InputStream field5065;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=671273965)
    int field5069;
    @ObfuscatedName(value="ao")
    byte[] field5064;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-620647127)
    int field5068 = 0;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-458040065)
    int field5066 = 0;
    @ObfuscatedName(value="ae")
    IOException field5070;

    class488(InputStream inputStream, int n) {
        this.field5065 = inputStream;
        this.field5069 = n + 1;
        this.field5064 = new byte[this.field5069];
        this.field5067 = new Thread(this);
        this.field5067.setDaemon(true);
        this.field5067.start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="0")
    boolean method9437(int n) throws IOException {
        if (n == 0) {
            return true;
        }
        if (n <= 0 || n >= this.field5069) {
            throw new IOException();
        }
        class488 class4882 = this;
        synchronized (class4882) {
            int n2 = this.field5068 <= this.field5066 ? this.field5066 - this.field5068 : this.field5069 - this.field5068 + this.field5066;
            if (n2 < n) {
                if (this.field5070 != null) {
                    throw new IOException(this.field5070.toString());
                }
                this.notifyAll();
                return false;
            }
            return true;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-472463721")
    int method9438() throws IOException {
        class488 class4882 = this;
        synchronized (class4882) {
            int n = this.field5068 <= this.field5066 ? this.field5066 - this.field5068 : this.field5069 - this.field5068 + this.field5066;
            if (n <= 0 && this.field5070 != null) {
                throw new IOException(this.field5070.toString());
            }
            this.notifyAll();
            return n;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)I", garbageValue="1")
    int method9439() throws IOException {
        class488 class4882 = this;
        synchronized (class4882) {
            if (this.field5066 == this.field5068) {
                if (this.field5070 != null) {
                    throw new IOException(this.field5070.toString());
                }
                return -1;
            }
            int n = this.field5064[this.field5068] & 0xFF;
            this.field5068 = (this.field5068 + 1) % this.field5069;
            this.notifyAll();
            return n;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="([BIII)I", garbageValue="-788241942")
    int method9440(byte[] byArray, int n, int n2) throws IOException {
        if (n2 < 0 || n < 0 || n2 + n > byArray.length) {
            throw new IOException();
        }
        class488 class4882 = this;
        synchronized (class4882) {
            int n3 = this.field5068 <= this.field5066 ? this.field5066 - this.field5068 : this.field5069 - this.field5068 + this.field5066;
            if (n2 > n3) {
                n2 = n3;
            }
            if (n2 == 0 && this.field5070 != null) {
                throw new IOException(this.field5070.toString());
            }
            if (n2 + this.field5068 <= this.field5069) {
                System.arraycopy(this.field5064, this.field5068, byArray, n, n2);
            } else {
                int n4 = this.field5069 - this.field5068;
                System.arraycopy(this.field5064, this.field5068, byArray, n, n4);
                System.arraycopy(this.field5064, 0, byArray, n4 + n, n2 - n4);
            }
            this.field5068 = (n2 + this.field5068) % this.field5069;
            this.notifyAll();
            return n2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1385030634")
    void method9441() {
        class488 class4882 = this;
        synchronized (class4882) {
            if (this.field5070 == null) {
                this.field5070 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field5067.join();
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
        while (true) {
            int n;
            int n2;
            class488 class4882 = this;
            synchronized (class4882) {
                while (true) {
                    if (this.field5070 != null) {
                        return;
                    }
                    n2 = this.field5068 == 0 ? this.field5069 - this.field5066 - 1 : (this.field5068 <= this.field5066 ? this.field5069 - this.field5066 : this.field5068 - this.field5066 - 1);
                    if (n2 > 0) break;
                    try {
                        this.wait();
                    }
                    catch (InterruptedException interruptedException) {}
                }
            }
            try {
                n = this.field5065.read(this.field5064, this.field5066, n2);
                if (n == -1) {
                    throw new EOFException();
                }
            }
            catch (IOException iOException) {
                class488 class4883 = this;
                synchronized (class4883) {
                    this.field5070 = iOException;
                    return;
                }
            }
            class488 class4884 = this;
            synchronized (class4884) {
                this.field5066 = (n + this.field5066) % this.field5069;
            }
        }
    }
}

