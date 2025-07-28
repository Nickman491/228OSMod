/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="eb")
public class class119
extends UrlRequester {
    @ObfuscatedName(value="ad")
    final boolean field1468;

    public class119(boolean bl, int n) {
        super(n);
        this.field1468 = bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Len;I)V", garbageValue="-1821014649")
    void vmethod3292(UrlRequest urlRequest) throws IOException {
        URLConnection uRLConnection = null;
        try {
            String string = urlRequest.field1473.getProtocol();
            if (string.equals("http")) {
                uRLConnection = this.method3295(urlRequest);
            } else if (string.equals("https")) {
                uRLConnection = this.method3294(urlRequest);
            } else {
                urlRequest.field1476 = UrlRequest.field1474;
                return;
            }
            this.method3289(uRLConnection, urlRequest);
        }
        catch (IOException iOException) {
            urlRequest.field1476 = UrlRequest.field1474;
        }
        finally {
            if (uRLConnection != null && uRLConnection instanceof HttpURLConnection) {
                HttpURLConnection httpURLConnection = (HttpURLConnection)uRLConnection;
                httpURLConnection.disconnect();
            }
        }
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(Len;S)Ljava/net/URLConnection;", garbageValue="24310")
    URLConnection method3295(UrlRequest urlRequest) throws IOException {
        URLConnection uRLConnection = urlRequest.field1473.openConnection();
        this.method3273(uRLConnection);
        return uRLConnection;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(Len;B)Ljava/net/URLConnection;", garbageValue="-103")
    URLConnection method3294(UrlRequest urlRequest) throws IOException {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection)urlRequest.field1473.openConnection();
        if (!this.field1468) {
            HttpsURLConnection httpsURLConnection2 = httpsURLConnection;
            if (class15.field66 == null) {
                class15.field66 = new class15();
            }
            class15 class152 = class15.field66;
            httpsURLConnection2.setSSLSocketFactory(class152);
        }
        this.method3273(httpsURLConnection);
        return httpsURLConnection;
    }

    @ObfuscatedName(value="hl")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="2")
    static final int method3301(int n) {
        if (Math.abs(n - class183.cameraYaw) <= 1024) {
            return n;
        }
        return n + (n < class183.cameraYaw ? 1 : -1) * 2048;
    }
}

