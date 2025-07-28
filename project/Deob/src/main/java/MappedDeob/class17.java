/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="av")
class class17
implements SSLSession {
    @ObfuscatedSignature(descriptor="Laq;")
    final /* synthetic */ class12 this$1;

    @ObfuscatedSignature(descriptor="(Laq;)V")
    class17(class12 class122) {
        this.this$1 = class122;
    }

    @Override
    public Certificate[] getLocalCertificates() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getApplicationBufferSize() {
        return 0;
    }

    @Override
    public String getCipherSuite() {
        throw new UnsupportedOperationException();
    }

    @Override
    public long getCreationTime() {
        throw new UnsupportedOperationException();
    }

    @Override
    public long getLastAccessedTime() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Principal getLocalPrincipal() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getPacketBufferSize() {
        throw new UnsupportedOperationException();
    }

    @Override
    public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
        return null;
    }

    @Override
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return null;
    }

    @Override
    public int getPeerPort() {
        return 0;
    }

    @Override
    public byte[] getId() {
        throw new UnsupportedOperationException();
    }

    @Override
    public SSLSessionContext getSessionContext() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String[] getValueNames() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isValid() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void putValue(String string, Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getPeerHost() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
        return this.this$1.field57;
    }

    @Override
    public void invalidate() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object getValue(String string) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeValue(String string) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getProtocol() {
        throw new UnsupportedOperationException();
    }
}

