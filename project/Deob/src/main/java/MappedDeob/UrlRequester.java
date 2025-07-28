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
import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ez")
@Implements(value="UrlRequester")
public abstract class UrlRequester
implements Runnable {
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lpq;")
    @Export(value="ItemDefinition_modelArchive")
    static AbstractArchive ItemDefinition_modelArchive;
    @ObfuscatedName(value="cs")
    @ObfuscatedGetter(intValue=2081606281)
    static int field1461;
    @ObfuscatedName(value="ay")
    final Thread field1466;
    @ObfuscatedName(value="ah")
    @Export(value="isClosed")
    volatile boolean isClosed;
    @ObfuscatedName(value="az")
    @Export(value="requests")
    Queue requests = new LinkedList();
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-731538215)
    int field1464;

    UrlRequester(int n) {
        this.field1466 = new Thread(this);
        this.field1466.setPriority(1);
        this.field1466.start();
        this.field1464 = n;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Len;I)V", garbageValue="-1821014649")
    abstract void vmethod3292(UrlRequest var1) throws IOException;

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/net/URLConnection;B)I", garbageValue="68")
    int method3272(URLConnection uRLConnection) {
        int n = UrlRequest.field1474;
        if (uRLConnection != null) {
            try {
                if (uRLConnection instanceof HttpURLConnection) {
                    n = ((HttpURLConnection)uRLConnection).getResponseCode();
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        return n;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/net/URLConnection;B)V", garbageValue="22")
    void method3273(URLConnection uRLConnection) {
        uRLConnection.setConnectTimeout(5000);
        uRLConnection.setReadTimeout(5000);
        uRLConnection.setUseCaches(false);
        uRLConnection.setRequestProperty("Connection", "close");
        uRLConnection.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1464);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ljava/net/URLConnection;Len;I)V", garbageValue="1573162555")
    void method3289(URLConnection uRLConnection, UrlRequest urlRequest) {
        DataInputStream dataInputStream = null;
        try {
            byte[] byArray;
            int n = uRLConnection.getContentLength();
            dataInputStream = new DataInputStream(uRLConnection.getInputStream());
            if (n >= 0) {
                byArray = new byte[n];
                dataInputStream.readFully(byArray);
            } else {
                byArray = new byte[]{};
                byte[] byArray2 = PacketWriter.ByteArrayPool_getArray(5000);
                int n2 = dataInputStream.read(byArray2);
                while (n2 > -1) {
                    byte[] byArray3 = new byte[byArray.length + n2];
                    System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                    System.arraycopy(byArray2, 0, byArray3, byArray.length, n2);
                    byArray = byArray3;
                    n2 = dataInputStream.read(byArray2);
                }
                WorldMapArea.ByteArrayPool_release(byArray2);
            }
            urlRequest.response0 = byArray;
        }
        catch (IOException iOException) {
            urlRequest.response0 = null;
        }
        finally {
            urlRequest.field1476 = this.method3272(uRLConnection);
        }
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Ljava/net/URL;B)Len;", garbageValue="-108")
    @Export(value="request")
    public UrlRequest request(URL uRL) {
        UrlRequest urlRequest = new UrlRequest(uRL);
        UrlRequester urlRequester = this;
        synchronized (urlRequester) {
            this.requests.add(urlRequest);
            this.notify();
        }
        return urlRequest;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-184934019")
    @Export(value="close")
    public void close() {
        this.isClosed = true;
        try {
            UrlRequester urlRequester = this;
            synchronized (urlRequester) {
                this.notify();
            }
            this.field1466.join();
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
        while (!this.isClosed) {
            try {
                UrlRequest urlRequest;
                UrlRequester urlRequester = this;
                synchronized (urlRequester) {
                    urlRequest = (UrlRequest)this.requests.poll();
                    if (urlRequest == null) {
                        try {
                            this.wait();
                        }
                        catch (InterruptedException interruptedException) {
                            // empty catch block
                        }
                        continue;
                    }
                }
                this.vmethod3292(urlRequest);
            }
            catch (Exception exception) {
                class255.RunException_sendStackTrace(null, exception);
            }
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;I)V", garbageValue="-1781265223")
    public static void method3282(AbstractArchive abstractArchive) {
        VarcInt.VarcInt_archive = abstractArchive;
    }

    @ObfuscatedName(value="lf")
    @ObfuscatedSignature(descriptor="(IIIILjava/lang/String;B)V", garbageValue="-94")
    @Export(value="widgetDefaultMenuAction")
    static void widgetDefaultMenuAction(int n, int n2, int n3, int n4, String string) {
        int n5 = n >>> 16;
        int n6 = n & 0xFFFF;
        Widget widget = ClanChannel.field1807.method7023(n2, n3);
        if (widget == null) {
            return;
        }
        if (widget.onOp != null) {
            ScriptEvent scriptEvent = new ScriptEvent();
            scriptEvent.widget = widget;
            scriptEvent.opIndex = n6;
            scriptEvent.field1081 = n5;
            scriptEvent.targetName = string;
            scriptEvent.args = widget.onOp;
            Friend.runScriptEvent(scriptEvent);
        }
        boolean bl = true;
        if (widget.contentType > 0) {
            bl = FriendsList.method9092(widget);
        }
        if (!bl) {
            return;
        }
        if (class250.method5357(class232.getWidgetFlags(widget), n6 - 1)) {
            PacketBufferNode packetBufferNode;
            if (n == 1) {
                packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3323, Client.packetWriter.isaacCipher);
                packetBufferNode.packetBuffer.method10268(n2);
                packetBufferNode.packetBuffer.writeShort(n3);
                packetBufferNode.packetBuffer.writeShort(n4);
                Client.packetWriter.addNode(packetBufferNode);
            }
            if (n == 2) {
                packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3349, Client.packetWriter.isaacCipher);
                packetBufferNode.packetBuffer.method10268(n2);
                packetBufferNode.packetBuffer.writeShort(n3);
                packetBufferNode.packetBuffer.writeShort(n4);
                Client.packetWriter.addNode(packetBufferNode);
            }
            if (n == 3) {
                packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3376, Client.packetWriter.isaacCipher);
                packetBufferNode.packetBuffer.method10268(n2);
                packetBufferNode.packetBuffer.writeShort(n3);
                packetBufferNode.packetBuffer.writeShort(n4);
                Client.packetWriter.addNode(packetBufferNode);
            }
            if (n == 4) {
                packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3385, Client.packetWriter.isaacCipher);
                packetBufferNode.packetBuffer.method10268(n2);
                packetBufferNode.packetBuffer.writeShort(n3);
                packetBufferNode.packetBuffer.writeShort(n4);
                Client.packetWriter.addNode(packetBufferNode);
            }
            if (n == 5) {
                packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3338, Client.packetWriter.isaacCipher);
                packetBufferNode.packetBuffer.method10268(n2);
                packetBufferNode.packetBuffer.writeShort(n3);
                packetBufferNode.packetBuffer.writeShort(n4);
                Client.packetWriter.addNode(packetBufferNode);
            }
            if (n == 6) {
                packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3331, Client.packetWriter.isaacCipher);
                packetBufferNode.packetBuffer.method10268(n2);
                packetBufferNode.packetBuffer.writeShort(n3);
                packetBufferNode.packetBuffer.writeShort(n4);
                Client.packetWriter.addNode(packetBufferNode);
            }
            if (n == 7) {
                packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3384, Client.packetWriter.isaacCipher);
                packetBufferNode.packetBuffer.method10268(n2);
                packetBufferNode.packetBuffer.writeShort(n3);
                packetBufferNode.packetBuffer.writeShort(n4);
                Client.packetWriter.addNode(packetBufferNode);
            }
            if (n == 8) {
                packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3329, Client.packetWriter.isaacCipher);
                packetBufferNode.packetBuffer.method10268(n2);
                packetBufferNode.packetBuffer.writeShort(n3);
                packetBufferNode.packetBuffer.writeShort(n4);
                Client.packetWriter.addNode(packetBufferNode);
            }
            if (n == 9) {
                packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3327, Client.packetWriter.isaacCipher);
                packetBufferNode.packetBuffer.method10268(n2);
                packetBufferNode.packetBuffer.writeShort(n3);
                packetBufferNode.packetBuffer.writeShort(n4);
                Client.packetWriter.addNode(packetBufferNode);
            }
            if (n == 10) {
                packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3370, Client.packetWriter.isaacCipher);
                packetBufferNode.packetBuffer.method10268(n2);
                packetBufferNode.packetBuffer.writeShort(n3);
                packetBufferNode.packetBuffer.writeShort(n4);
                Client.packetWriter.addNode(packetBufferNode);
            }
            if (n5 != 0) {
                packetBufferNode = ScriptEvent.getPacketBufferNode(ClientPacket.field3413, Client.packetWriter.isaacCipher);
                packetBufferNode.packetBuffer.method10268(n2);
                packetBufferNode.packetBuffer.writeShort(n3);
                packetBufferNode.packetBuffer.writeShort(n4);
                packetBufferNode.packetBuffer.writeByte(n6);
                packetBufferNode.packetBuffer.writeByte(n5 - 1);
                Client.packetWriter.addNode(packetBufferNode);
            }
            return;
        }
    }
}

