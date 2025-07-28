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
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="oc")
@Implements(value="ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler
implements Runnable {
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpm;")
    @Export(value="ArchiveDiskActionHandler_requestQueue")
    static final NodeDeque ArchiveDiskActionHandler_requestQueue = new NodeDeque();
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpm;")
    @Export(value="ArchiveDiskActionHandler_responseQueue")
    static NodeDeque ArchiveDiskActionHandler_responseQueue = new NodeDeque();
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-900251729)
    static int field4526 = 0;
    @ObfuscatedName(value="ao")
    @Export(value="ArchiveDiskActionHandler_lock")
    static final Object ArchiveDiskActionHandler_lock = new Object();
    @ObfuscatedName(value="ad")
    @Export(value="ArchiveDiskActionHandler_thread")
    static Thread ArchiveDiskActionHandler_thread;

    ArchiveDiskActionHandler() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        while (true) {
            try {
                ArchiveDiskAction archiveDiskAction;
                Object object = ArchiveDiskActionHandler_requestQueue;
                synchronized (object) {
                    archiveDiskAction = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
                }
                if (archiveDiskAction != null) {
                    if (archiveDiskAction.type == 0) {
                        archiveDiskAction.archiveDisk.write((int)archiveDiskAction.key, archiveDiskAction.data, archiveDiskAction.data.length);
                        object = ArchiveDiskActionHandler_requestQueue;
                        synchronized (object) {
                            archiveDiskAction.remove();
                        }
                    }
                    if (archiveDiskAction.type == 1) {
                        archiveDiskAction.data = archiveDiskAction.archiveDisk.read((int)archiveDiskAction.key);
                        object = ArchiveDiskActionHandler_requestQueue;
                        synchronized (object) {
                            ArchiveDiskActionHandler_responseQueue.addFirst(archiveDiskAction);
                        }
                    }
                    object = ArchiveDiskActionHandler_lock;
                    synchronized (object) {
                        if (field4526 <= 1) {
                            field4526 = 0;
                            ArchiveDiskActionHandler_lock.notifyAll();
                            return;
                        }
                        field4526 = 600;
                        continue;
                    }
                }
                class174.method3881(100L);
                object = ArchiveDiskActionHandler_lock;
                synchronized (object) {
                    if (field4526 <= 1) {
                        field4526 = 0;
                        ArchiveDiskActionHandler_lock.notifyAll();
                        return;
                    }
                    --field4526;
                }
            }
            catch (Exception exception) {
                class255.RunException_sendStackTrace(null, exception);
                return;
            }
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="([Ljava/lang/CharSequence;III)Ljava/lang/String;", garbageValue="-1902639880")
    public static String method7668(CharSequence[] charSequenceArray, int n, int n2) {
        if (n2 == 0) {
            return "";
        }
        if (n2 != 1) {
            int n3 = n2 + n;
            int n4 = 0;
            int n5 = n;
            while (true) {
                if (n5 >= n3) {
                    StringBuilder stringBuilder = new StringBuilder(n4);
                    int n6 = n;
                    while (true) {
                        if (n6 >= n3) {
                            return stringBuilder.toString();
                        }
                        CharSequence charSequence = charSequenceArray[n6];
                        if (charSequence == null) {
                            stringBuilder.append("null");
                        } else {
                            stringBuilder.append(charSequence);
                        }
                        ++n6;
                    }
                }
                CharSequence charSequence = charSequenceArray[n5];
                n4 = charSequence == null ? (n4 += 4) : (n4 += charSequence.length());
                ++n5;
            }
        }
        CharSequence charSequence = charSequenceArray[n];
        if (charSequence == null) {
            return "null";
        }
        return charSequence.toString();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)Lvh;", garbageValue="-1558697005")
    public static DbTableType method7671(int n) {
        DbTableType dbTableType = (DbTableType)DbTableType.field5409.get(n);
        if (dbTableType != null) {
            return dbTableType;
        }
        byte[] byArray = DbTableType.field5408.takeFile(39, n);
        dbTableType = new DbTableType();
        if (byArray != null) {
            dbTableType.method10151(new Buffer(byArray));
        }
        dbTableType.method10159();
        DbTableType.field5409.put(dbTableType, n);
        return dbTableType;
    }
}

