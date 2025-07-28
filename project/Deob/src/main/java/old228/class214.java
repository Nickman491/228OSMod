package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ix")
public class class214
implements Runnable {
    @ObfuscatedName(value="ay")
    public static String field2382;
    @ObfuscatedName(value="ah")
    public static String field2379;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Liq;")
    class222 field2378 = null;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Liq;")
    class222 field2376 = null;
    @ObfuscatedName(value="ad")
    Thread field2380;
    @ObfuscatedName(value="an")
    boolean field2377 = false;

    public class214() {
        field2382 = "Unknown";
        field2379 = "1.6";
        try {
            field2382 = System.getProperty("java.vendor");
            field2379 = System.getProperty("java.version");
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.field2377 = false;
        this.field2380 = new Thread(this);
        this.field2380.setPriority(10);
        this.field2380.setDaemon(true);
        this.field2380.start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="25896")
    public final void method4909() {
        class214 class2142 = this;
        synchronized (class2142) {
            this.field2377 = true;
            this.notifyAll();
        }
        try {
            this.field2380.join();
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIILjava/lang/Object;I)Liq;", garbageValue="496476713")
    final class222 method4924(int n, int n2, int n3, Object object) {
        class222 class2222 = new class222();
        class2222.field2434 = n;
        class2222.field2432 = n2;
        class2222.field2435 = object;
        class214 class2142 = this;
        synchronized (class2142) {
            if (this.field2376 != null) {
                this.field2376.field2430 = class2222;
                this.field2376 = class2222;
            } else {
                this.field2376 = this.field2378 = class2222;
            }
            this.notify();
        }
        return class2222;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;II)Liq;", garbageValue="-530151426")
    public final class222 method4911(String string, int n) {
        return this.method4924(1, n, 0, string);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Runnable;IB)Liq;", garbageValue="82")
    public final class222 method4912(Runnable runnable, int n) {
        return this.method4924(2, n, 0, runnable);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void run() {
        while (true) {
            class222 class2222;
            class214 class2142 = this;
            synchronized (class2142) {
                while (true) {
                    if (this.field2377) {
                        return;
                    }
                    if (this.field2378 != null) {
                        class2222 = this.field2378;
                        this.field2378 = this.field2378.field2430;
                        if (this.field2378 != null) break;
                        this.field2376 = null;
                        break;
                    }
                    try {
                        this.wait();
                    }
                    catch (InterruptedException interruptedException) {}
                }
            }
            try {
                int n = class2222.field2434;
                if (n == 1) {
                    class2222.field2436 = new Socket(InetAddress.getByName((String)class2222.field2435), class2222.field2432);
                } else if (n == 2) {
                    Thread thread = new Thread((Runnable)class2222.field2435);
                    thread.setDaemon(true);
                    thread.start();
                    thread.setPriority(class2222.field2432);
                    class2222.field2436 = thread;
                } else if (n == 4) {
                    class2222.field2436 = new DataInputStream(((URL)class2222.field2435).openStream());
                }
                class2222.field2433 = 1;
                continue;
            }
            catch (ThreadDeath threadDeath) {
                throw threadDeath;
            }
            catch (Throwable throwable) {
                class2222.field2433 = 2;
                continue;
            }
            break;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="688799447")
    public static void method4914() {
        class35 class354 = class35.field194;
        synchronized (class354) {
            class35.field206 = class35.field196;
            class35.field201 = class35.field197;
            class35.field202 = class35.field208;
            class35.field203 = class35.field199;
            class35.field200 = class35.field204;
            class35.field209 = class35.field205;
            class35.field211 = class35.field210;
            class35.field191 = class35.field207;
            class35.field204 = 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-116")
    public static void method4916() {
        Object object = class387.field4530;
        synchronized (object) {
            if (class387.field4526 != 0) {
                class387.field4526 = 1;
                try {
                    class387.field4530.wait();
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
            }
        }
        object = class387.field4527;
        synchronized (object) {
            class387.field4527.method8013();
            class387.field4528.method8013();
        }
    }

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="936346055")
    static int method4922(int n, class81 class812, boolean bl) {
        if (n != 5504) {
            if (n != 5505) {
                if (n != 5506) {
                    int n2;
                    if (n != 5530) {
                        if (n != 5531) {
                            return 2;
                        }
                        class72.field865[++class63.field444 - 1] = client.field595;
                        return 1;
                    }
                    if ((n2 = class72.field865[--class63.field444]) < 0) {
                        n2 = 0;
                    }
                    client.field595 = n2;
                    return 1;
                }
                class72.field865[++class63.field444 - 1] = client.field503;
                return 1;
            }
            class72.field865[++class63.field444 - 1] = client.field588;
            return 1;
        }
        int n3 = class72.field865[class63.field444 -= 2];
        int n4 = class72.field865[class63.field444 + 1];
        if (!client.field797) {
            client.field588 = n3;
            client.field503 = n4;
        }
        return 1;
    }

    @ObfuscatedName(value="ck")
    @ObfuscatedSignature(descriptor="([BB)[B", garbageValue="7")
    static final byte[] method4920(byte[] byArray) {
        class556 class5562 = new class556(byArray);
        int n = class5562.method10282();
        int n2 = class5562.method10440();
        if (n2 >= 0 && (class391.field4585 == 0 || n2 <= class391.field4585)) {
            if (n != 0) {
                int n3 = class5562.method10440();
                if (n3 >= 0 && (class391.field4585 == 0 || n3 <= class391.field4585)) {
                    byte[] byArray2 = new byte[n3];
                    if (n == 1) {
                        class559.method10566(byArray2, n3, byArray, n2, 9);
                    } else {
                        class391.field4576.method10963(class5562, byArray2);
                    }
                    return byArray2;
                }
                throw new RuntimeException();
            }
            byte[] byArray3 = new byte[n2];
            class5562.method10293(byArray3, 0, n2);
            return byArray3;
        }
        throw new RuntimeException();
    }

    @ObfuscatedName(value="lx")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;IIIIII)I", garbageValue="-1396127676")
    static final int method4908(String string, String string2, int n, int n2, int n3, int n4, int n5) {
        return class231.method5128(string, string2, n, n2, n3, n4, n5, false, -1);
    }
}

