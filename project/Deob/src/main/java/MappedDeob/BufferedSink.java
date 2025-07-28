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
import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="sv")
@Implements(value="BufferedSink")
public class BufferedSink
implements Runnable {
    @ObfuscatedName(value="ay")
    @Export(value="thread")
    Thread thread;
    @ObfuscatedName(value="ah")
    @Export(value="outputStream")
    OutputStream outputStream;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1411750849)
    @Export(value="capacity")
    int capacity;
    @ObfuscatedName(value="ao")
    @Export(value="buffer")
    byte[] buffer;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=1591863287)
    @Export(value="position")
    int position = 0;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=2081628013)
    @Export(value="limit")
    int limit = 0;
    @ObfuscatedName(value="ae")
    @Export(value="exception")
    IOException exception;
    @ObfuscatedName(value="ax")
    @Export(value="closed")
    boolean closed;

    BufferedSink(OutputStream outputStream, int n) {
        this.outputStream = outputStream;
        this.capacity = n + 1;
        this.buffer = new byte[this.capacity];
        this.thread = new Thread(this);
        this.thread.setDaemon(true);
        this.thread.start();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1522866853")
    @Export(value="isClosed")
    boolean isClosed() {
        if (this.closed) {
            block4: {
                try {
                    this.outputStream.close();
                    if (this.exception == null) {
                        this.exception = new IOException("");
                    }
                }
                catch (IOException iOException) {
                    if (this.exception != null) break block4;
                    this.exception = new IOException(iOException);
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
    @Export(value="write")
    void write(byte[] byArray, int n, int n2) throws IOException {
        if (n2 < 0 || n < 0 || n2 + n > byArray.length) {
            throw new IOException();
        }
        BufferedSink bufferedSink = this;
        synchronized (bufferedSink) {
            if (this.exception != null) {
                throw new IOException(this.exception.toString());
            }
            int n3 = this.position <= this.limit ? this.capacity - this.limit + this.position - 1 : this.position - this.limit - 1;
            if (n3 < n2) {
                throw new IOException("");
            }
            if (n2 + this.limit <= this.capacity) {
                System.arraycopy(byArray, n, this.buffer, this.limit, n2);
            } else {
                int n4 = this.capacity - this.limit;
                System.arraycopy(byArray, n, this.buffer, this.limit, n4);
                System.arraycopy(byArray, n4 + n, this.buffer, 0, n2 - n4);
            }
            this.limit = (n2 + this.limit) % this.capacity;
            this.notifyAll();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="105")
    @Export(value="close")
    void close() {
        BufferedSink bufferedSink = this;
        synchronized (bufferedSink) {
            this.closed = true;
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
        do {
            int n;
            BufferedSink bufferedSink = this;
            synchronized (bufferedSink) {
                while (true) {
                    if (this.exception != null) {
                        return;
                    }
                    n = this.position <= this.limit ? this.limit - this.position : this.capacity - this.position + this.limit;
                    if (n > 0) break;
                    try {
                        this.outputStream.flush();
                    }
                    catch (IOException iOException) {
                        this.exception = iOException;
                        return;
                    }
                    if (this.isClosed()) {
                        return;
                    }
                    try {
                        this.wait();
                    }
                    catch (InterruptedException interruptedException) {}
                }
            }
            try {
                if (n + this.position <= this.capacity) {
                    this.outputStream.write(this.buffer, this.position, n);
                } else {
                    int n2 = this.capacity - this.position;
                    this.outputStream.write(this.buffer, this.position, n2);
                    this.outputStream.write(this.buffer, 0, n - n2);
                }
            }
            catch (IOException iOException) {
                BufferedSink bufferedSink2 = this;
                synchronized (bufferedSink2) {
                    this.exception = iOException;
                    return;
                }
            }
            bufferedSink = this;
            synchronized (bufferedSink) {
                this.position = (n + this.position) % this.capacity;
            }
        } while (!this.isClosed());
    }
}

