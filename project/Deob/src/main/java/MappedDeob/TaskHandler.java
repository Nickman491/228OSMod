/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName(value="ix")
@Implements(value="TaskHandler")
public class TaskHandler
implements Runnable {
    @ObfuscatedName(value="ay")
    @Export(value="javaVendor")
    public static String javaVendor;
    @ObfuscatedName(value="ah")
    @Export(value="javaVersion")
    public static String javaVersion;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Liq;")
    @Export(value="current")
    Task current = null;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Liq;")
    @Export(value="task")
    Task task = null;
    @ObfuscatedName(value="ad")
    @Export(value="thread")
    Thread thread;
    @ObfuscatedName(value="an")
    @Export(value="isClosed")
    boolean isClosed = false;

    public TaskHandler() {
        javaVendor = "Unknown";
        javaVersion = "1.6";
        try {
            javaVendor = System.getProperty("java.vendor");
            javaVersion = System.getProperty("java.version");
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.isClosed = false;
        this.thread = new Thread(this);
        this.thread.setPriority(10);
        this.thread.setDaemon(true);
        this.thread.start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="25896")
    @Export(value="close")
    public final void close() {
        TaskHandler taskHandler = this;
        synchronized (taskHandler) {
            this.isClosed = true;
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
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIILjava/lang/Object;I)Liq;", garbageValue="496476713")
    @Export(value="newTask")
    final Task newTask(int n, int n2, int n3, Object object) {
        Task task = new Task();
        task.type = n;
        task.intArgument = n2;
        task.objectArgument = object;
        TaskHandler taskHandler = this;
        synchronized (taskHandler) {
            if (this.task != null) {
                this.task.next = task;
                this.task = task;
            } else {
                this.task = this.current = task;
            }
            this.notify();
        }
        return task;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;II)Liq;", garbageValue="-530151426")
    public final Task method4911(String string, int n) {
        return this.newTask(1, n, 0, string);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Runnable;IB)Liq;", garbageValue="82")
    @Export(value="newThreadTask")
    public final Task newThreadTask(Runnable runnable, int n) {
        return this.newTask(2, n, 0, runnable);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void run() {
        while (true) {
            Task task;
            TaskHandler taskHandler = this;
            synchronized (taskHandler) {
                while (true) {
                    if (this.isClosed) {
                        return;
                    }
                    if (this.current != null) {
                        task = this.current;
                        this.current = this.current.next;
                        if (this.current != null) break;
                        this.task = null;
                        break;
                    }
                    try {
                        this.wait();
                    }
                    catch (InterruptedException interruptedException) {}
                }
            }
            try {
                int n = task.type;
                if (n == 1) {
                    task.result = new Socket(InetAddress.getByName((String)task.objectArgument), task.intArgument);
                } else if (n == 2) {
                    Thread thread = new Thread((Runnable)task.objectArgument);
                    thread.setDaemon(true);
                    thread.start();
                    thread.setPriority(task.intArgument);
                    task.result = thread;
                } else if (n == 4) {
                    task.result = new DataInputStream(((URL)task.objectArgument).openStream());
                }
                task.status = 1;
                continue;
            }
            catch (ThreadDeath threadDeath) {
                throw threadDeath;
            }
            catch (Throwable throwable) {
                task.status = 2;
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
        MouseHandler mouseHandler = MouseHandler.MouseHandler_instance;
        synchronized (mouseHandler) {
            MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
            MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
            MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
            MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
            MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
            MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
            MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
            MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
            MouseHandler.MouseHandler_lastButtonVolatile = 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-116")
    public static void method4916() {
        Object object = ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock;
        synchronized (object) {
            if (ArchiveDiskActionHandler.field4526 != 0) {
                ArchiveDiskActionHandler.field4526 = 1;
                try {
                    ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
            }
        }
        object = ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue;
        synchronized (object) {
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.clear();
            ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.clear();
        }
    }

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(ILdm;ZI)I", garbageValue="936346055")
    static int method4922(int n, Script script, boolean bl) {
        if (n != ScriptOpcodes.CAM_FORCEANGLE) {
            if (n != ScriptOpcodes.CAM_GETANGLE_XA) {
                if (n != ScriptOpcodes.CAM_GETANGLE_YA) {
                    int n2;
                    if (n != ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
                        if (n != ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
                            return 2;
                        }
                        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.camFollowHeight;
                        return 1;
                    }
                    if ((n2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]) < 0) {
                        n2 = 0;
                    }
                    Client.camFollowHeight = n2;
                    return 1;
                }
                Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.camAngleY;
                return 1;
            }
            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.camAngleX;
            return 1;
        }
        int n3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize -= 2];
        int n4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
        if (!Client.isCameraLocked) {
            Client.camAngleX = n3;
            Client.camAngleY = n4;
        }
        return 1;
    }

    @ObfuscatedName(value="ck")
    @ObfuscatedSignature(descriptor="([BB)[B", garbageValue="7")
    @Export(value="decompressBytes")
    static final byte[] decompressBytes(byte[] byArray) {
        Buffer buffer = new Buffer(byArray);
        int n = buffer.readUnsignedByte();
        int n2 = buffer.readInt();
        if (n2 >= 0 && (AbstractArchive.field4585 == 0 || n2 <= AbstractArchive.field4585)) {
            if (n != 0) {
                int n3 = buffer.readInt();
                if (n3 >= 0 && (AbstractArchive.field4585 == 0 || n3 <= AbstractArchive.field4585)) {
                    byte[] byArray2 = new byte[n3];
                    if (n == 1) {
                        BZip2Decompressor.BZip2Decompressor_decompress(byArray2, n3, byArray, n2, 9);
                    } else {
                        AbstractArchive.gzipDecompressor.decompress(buffer, byArray2);
                    }
                    return byArray2;
                }
                throw new RuntimeException();
            }
            byte[] byArray3 = new byte[n2];
            buffer.readBytes(byArray3, 0, n2);
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

