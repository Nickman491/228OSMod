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
import java.io.InputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="sd")
@Implements(value="BufferedSource")
public class BufferedSource
implements Runnable {
    @ObfuscatedName(value="ay")
    @Export(value="thread")
    Thread thread;
    @ObfuscatedName(value="ah")
    @Export(value="inputStream")
    InputStream inputStream;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=671273965)
    @Export(value="capacity")
    int capacity;
    @ObfuscatedName(value="ao")
    @Export(value="buffer")
    byte[] buffer;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-620647127)
    @Export(value="position")
    int position = 0;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-458040065)
    @Export(value="limit")
    int limit = 0;
    @ObfuscatedName(value="ae")
    @Export(value="exception")
    IOException exception;

    BufferedSource(InputStream inputStream, int n) {
        this.inputStream = inputStream;
        this.capacity = n + 1;
        this.buffer = new byte[this.capacity];
        this.thread = new Thread(this);
        this.thread.setDaemon(true);
        this.thread.start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IB)Z", garbageValue="0")
    @Export(value="isAvailable")
    boolean isAvailable(int n) throws IOException {
        if (n == 0) {
            return true;
        }
        if (n <= 0 || n >= this.capacity) {
            throw new IOException();
        }
        BufferedSource bufferedSource = this;
        synchronized (bufferedSource) {
            int n2 = this.position <= this.limit ? this.limit - this.position : this.capacity - this.position + this.limit;
            if (n2 < n) {
                if (this.exception != null) {
                    throw new IOException(this.exception.toString());
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
    @Export(value="available")
    int available() throws IOException {
        BufferedSource bufferedSource = this;
        synchronized (bufferedSource) {
            int n = this.position <= this.limit ? this.limit - this.position : this.capacity - this.position + this.limit;
            if (n <= 0 && this.exception != null) {
                throw new IOException(this.exception.toString());
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
    @Export(value="readUnsignedByte")
    int readUnsignedByte() throws IOException {
        BufferedSource bufferedSource = this;
        synchronized (bufferedSource) {
            if (this.limit == this.position) {
                if (this.exception != null) {
                    throw new IOException(this.exception.toString());
                }
                return -1;
            }
            int n = this.buffer[this.position] & 0xFF;
            this.position = (this.position + 1) % this.capacity;
            this.notifyAll();
            return n;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="([BIII)I", garbageValue="-788241942")
    @Export(value="read")
    int read(byte[] byArray, int n, int n2) throws IOException {
        if (n2 < 0 || n < 0 || n2 + n > byArray.length) {
            throw new IOException();
        }
        BufferedSource bufferedSource = this;
        synchronized (bufferedSource) {
            int n3 = this.position <= this.limit ? this.limit - this.position : this.capacity - this.position + this.limit;
            if (n2 > n3) {
                n2 = n3;
            }
            if (n2 == 0 && this.exception != null) {
                throw new IOException(this.exception.toString());
            }
            if (n2 + this.position <= this.capacity) {
                System.arraycopy(this.buffer, this.position, byArray, n, n2);
            } else {
                int n4 = this.capacity - this.position;
                System.arraycopy(this.buffer, this.position, byArray, n, n4);
                System.arraycopy(this.buffer, 0, byArray, n4 + n, n2 - n4);
            }
            this.position = (n2 + this.position) % this.capacity;
            this.notifyAll();
            return n2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1385030634")
    @Export(value="close")
    void close() {
        BufferedSource bufferedSource = this;
        synchronized (bufferedSource) {
            if (this.exception == null) {
                this.exception = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.thread.join();
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
            BufferedSource bufferedSource = this;
            synchronized (bufferedSource) {
                while (true) {
                    if (this.exception != null) {
                        return;
                    }
                    n2 = this.position == 0 ? this.capacity - this.limit - 1 : (this.position <= this.limit ? this.capacity - this.limit : this.position - this.limit - 1);
                    if (n2 > 0) break;
                    try {
                        this.wait();
                    }
                    catch (InterruptedException interruptedException) {}
                }
            }
            try {
                n = this.inputStream.read(this.buffer, this.limit, n2);
                if (n == -1) {
                    throw new EOFException();
                }
            }
            catch (IOException iOException) {
                BufferedSource bufferedSource2 = this;
                synchronized (bufferedSource2) {
                    this.exception = iOException;
                    return;
                }
            }
            BufferedSource bufferedSource3 = this;
            synchronized (bufferedSource3) {
                this.limit = (n + this.limit) % this.capacity;
            }
        }
    }
}

