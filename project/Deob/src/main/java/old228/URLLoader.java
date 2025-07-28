package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ez")
public abstract class URLLoader
implements Runnable {
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lpq;")
    static class391 field1463;
    @ObfuscatedName(value="cs")
    @ObfuscatedGetter(intValue=2081606281)
    static int field1461;
    @ObfuscatedName(value="ay")
    final Thread field1466;
    @ObfuscatedName(value="ah")
    volatile boolean field1462;
    @ObfuscatedName(value="az")
    Queue field1465 = new LinkedList();
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-731538215)
    int field1464;

    URLLoader(int n) {
        this.field1466 = new Thread(this);
        this.field1466.setPriority(1);
        this.field1466.start();
        this.field1464 = n;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Len;I)V", garbageValue="-1821014649")
    abstract void vmethod3292(class120 var1) throws IOException;

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/net/old228.URLConnection;B)I", garbageValue="-1")
    int method3272(URLConnection uRLConnection) {
        int n = class120.field1474;
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
    @ObfuscatedSignature(descriptor="(Ljava/net/old228.URLConnection;B)V", garbageValue="22")
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
    @ObfuscatedSignature(descriptor="(Ljava/net/old228.URLConnection;Len;I)V", garbageValue="1573162555")
    void method3289(URLConnection uRLConnection, class120 class1202) {
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
                byte[] byArray2 = class116.method3251(5000);
                int n2 = dataInputStream.read(byArray2);
                while (n2 > -1) {
                    byte[] byArray3 = new byte[byArray.length + n2];
                    System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                    System.arraycopy(byArray2, 0, byArray3, byArray.length, n2);
                    byArray = byArray3;
                    n2 = dataInputStream.read(byArray2);
                }
                class284.method6065(byArray2);
            }
            class1202.field1475 = byArray;
        }
        catch (IOException iOException) {
            class1202.field1475 = null;
        }
        finally {
            class1202.field1476 = this.method3272(uRLConnection);
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
    public class120 method3275(URL uRL) {
        class120 class1202 = new class120(uRL);
        URLLoader class1182 = this;
        synchronized (class1182) {
            this.field1465.add(class1202);
            this.notify();
        }
        return class1202;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-184934019")
    public void method3281() {
        this.field1462 = true;
        try {
            URLLoader class1182 = this;
            synchronized (class1182) {
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
        while (!this.field1462) {
            try {
                class120 class1202;
                URLLoader class1182 = this;
                synchronized (class1182) {
                    class1202 = (class120)this.field1465.poll();
                    if (class1202 == null) {
                        try {
                            this.wait();
                        }
                        catch (InterruptedException interruptedException) {
                            // empty catch block
                        }
                        continue;
                    }
                }
                this.vmethod3292(class1202);
            }
            catch (Exception exception) {
                class255.method5410(null, exception);
            }
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Lpq;I)V", garbageValue="-1781265223")
    public static void method3282(class391 class3912) {
        class237.field2546 = class3912;
    }

    @ObfuscatedName(value="lf")
    @ObfuscatedSignature(descriptor="(IIIILjava/lang/String;B)V", garbageValue="-94")
    static void method3271(int n, int n2, int n3, int n4, String string) {
        int n5 = n >>> 16;
        int n6 = n & 0xFFFF;
        class361 class3612 = class170.field1807.method7023(n2, n3);
        if (class3612 == null) {
            return;
        }
        if (class3612.field3984 != null) {
            class90 class902 = new class90();
            class902.field1077 = class3612;
            class902.field1076 = n6;
            class902.field1081 = n5;
            class902.field1085 = string;
            class902.field1086 = class3612.field3984;
            class471.method9136(class902);
        }
        boolean bl = true;
        if (class3612.field3875 > 0) {
            bl = class469.method9092(class3612);
        }
        if (!bl) {
            return;
        }
        if (class250.method5357(class232.method5133(class3612), n6 - 1)) {
            class324 class3242;
            if (n == 1) {
                class3242 = class90.method2629(class322.field3323, client.field564.field1446);
                class3242.field3442.method10268(n2);
                class3242.field3442.method10266(n3);
                class3242.field3442.method10266(n4);
                client.field564.method3257(class3242);
            }
            if (n == 2) {
                class3242 = class90.method2629(class322.field3349, client.field564.field1446);
                class3242.field3442.method10268(n2);
                class3242.field3442.method10266(n3);
                class3242.field3442.method10266(n4);
                client.field564.method3257(class3242);
            }
            if (n == 3) {
                class3242 = class90.method2629(class322.field3376, client.field564.field1446);
                class3242.field3442.method10268(n2);
                class3242.field3442.method10266(n3);
                class3242.field3442.method10266(n4);
                client.field564.method3257(class3242);
            }
            if (n == 4) {
                class3242 = class90.method2629(class322.field3385, client.field564.field1446);
                class3242.field3442.method10268(n2);
                class3242.field3442.method10266(n3);
                class3242.field3442.method10266(n4);
                client.field564.method3257(class3242);
            }
            if (n == 5) {
                class3242 = class90.method2629(class322.field3338, client.field564.field1446);
                class3242.field3442.method10268(n2);
                class3242.field3442.method10266(n3);
                class3242.field3442.method10266(n4);
                client.field564.method3257(class3242);
            }
            if (n == 6) {
                class3242 = class90.method2629(class322.field3331, client.field564.field1446);
                class3242.field3442.method10268(n2);
                class3242.field3442.method10266(n3);
                class3242.field3442.method10266(n4);
                client.field564.method3257(class3242);
            }
            if (n == 7) {
                class3242 = class90.method2629(class322.field3384, client.field564.field1446);
                class3242.field3442.method10268(n2);
                class3242.field3442.method10266(n3);
                class3242.field3442.method10266(n4);
                client.field564.method3257(class3242);
            }
            if (n == 8) {
                class3242 = class90.method2629(class322.field3329, client.field564.field1446);
                class3242.field3442.method10268(n2);
                class3242.field3442.method10266(n3);
                class3242.field3442.method10266(n4);
                client.field564.method3257(class3242);
            }
            if (n == 9) {
                class3242 = class90.method2629(class322.field3327, client.field564.field1446);
                class3242.field3442.method10268(n2);
                class3242.field3442.method10266(n3);
                class3242.field3442.method10266(n4);
                client.field564.method3257(class3242);
            }
            if (n == 10) {
                class3242 = class90.method2629(class322.field3370, client.field564.field1446);
                class3242.field3442.method10268(n2);
                class3242.field3442.method10266(n3);
                class3242.field3442.method10266(n4);
                client.field564.method3257(class3242);
            }
            if (n5 != 0) {
                class3242 = class90.method2629(class322.field3413, client.field564.field1446);
                class3242.field3442.method10268(n2);
                class3242.field3442.method10266(n3);
                class3242.field3442.method10266(n4);
                class3242.field3442.method10300(n6);
                class3242.field3442.method10300(n5 - 1);
                client.field564.method3257(class3242);
            }
            return;
        }
    }
}

