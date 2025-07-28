package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="eb")
public class URLConnection
extends URLLoader {
    @ObfuscatedName(value="ad")
    final boolean field1468;

    public URLConnection(boolean bl, int n) {
        super(n);
        this.field1468 = bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Len;I)V", garbageValue="-1821014649")
    void vmethod3292(class120 class1202) throws IOException {
        java.net.URLConnection uRLConnection = null;
        try {
            String string = class1202.field1473.getProtocol();
            if (string.equals("http")) {
                uRLConnection = this.method3295(class1202);
            } else if (string.equals("https")) {
                uRLConnection = this.method3294(class1202);
            } else {
                class1202.field1476 = class120.field1474;
                return;
            }
            this.method3289(uRLConnection, class1202);
        }
        catch (IOException iOException) {
            class1202.field1476 = class120.field1474;
        }
        finally {
            if (uRLConnection != null && uRLConnection instanceof HttpURLConnection) {
                HttpURLConnection httpURLConnection = (HttpURLConnection)uRLConnection;
                httpURLConnection.disconnect();
            }
        }
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(Len;S)Ljava/net/old228.URLConnection;", garbageValue="24310")
    java.net.URLConnection method3295(class120 class1202) throws IOException {
        java.net.URLConnection uRLConnection = class1202.field1473.openConnection();
        this.method3273(uRLConnection);
        return uRLConnection;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(Len;B)Ljava/net/old228.URLConnection;", garbageValue="-103")
    java.net.URLConnection method3294(class120 class1202) throws IOException {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection)class1202.field1473.openConnection();
        if (!this.field1468) {
            HttpsURLConnection httpsURLConnection2 = httpsURLConnection;
            if (class15.field66 == null) {
                class15.field66 = new class15();
            }
            class15 class1510 = class15.field66;
            httpsURLConnection2.setSSLSocketFactory(class1510);
        }
        this.method3273(httpsURLConnection);
        return httpsURLConnection;
    }

    @ObfuscatedName(value="hl")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="2")
    static final int method3301(int n) {
        if (Math.abs(n - class183.field1972) <= 1024) {
            return n;
        }
        return n + (n < class183.field1972 ? 1 : -1) * 2048;
    }
}

