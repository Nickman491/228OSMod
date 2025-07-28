package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 *  org.bouncycastle.crypto.tls.TlsClient
 *  org.bouncycastle.crypto.tls.TlsClientProtocol
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClient;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName(value="aq")
class class12
extends SSLSocket {
    @ObfuscatedName(value="ay")
    Certificate[] field57;
    @ObfuscatedSignature(descriptor="Lak;")
    final /* synthetic */ class15 this$0;
    final /* synthetic */ TlsClientProtocol val$tlsClientProtocol;
    final /* synthetic */ String val$host;

    @ObfuscatedSignature(descriptor="(Lak;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V")
    class12(class15 class1510, TlsClientProtocol tlsClientProtocol, String string) {
        this.this$0 = class1510;
        this.val$tlsClientProtocol = tlsClientProtocol;
        this.val$host = string;
    }

    @Override
    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
    }

    @Override
    public boolean getEnableSessionCreation() {
        return false;
    }

    @Override
    public String[] getEnabledCipherSuites() {
        return null;
    }

    @Override
    public String[] getEnabledProtocols() {
        return null;
    }

    @Override
    public boolean getNeedClientAuth() {
        return false;
    }

    @Override
    public SSLSession getSession() {
        return new class17(this);
    }

    @Override
    public String[] getSupportedProtocols() {
        return null;
    }

    @Override
    public String[] getSupportedCipherSuites() {
        return null;
    }

    @Override
    public synchronized void close() throws IOException {
        this.val$tlsClientProtocol.close();
    }

    @Override
    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
    }

    @Override
    public void setEnabledCipherSuites(String[] stringArray) {
    }

    @Override
    public void setEnabledProtocols(String[] stringArray) {
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return this.val$tlsClientProtocol.getInputStream();
    }

    @Override
    public void setUseClientMode(boolean bl) {
    }

    @Override
    public void setWantClientAuth(boolean bl) {
    }

    @Override
    public void startHandshake() throws IOException {
        this.val$tlsClientProtocol.connect((TlsClient)new class13(this));
    }

    @Override
    public boolean getUseClientMode() {
        return false;
    }

    @Override
    public void setEnableSessionCreation(boolean bl) {
    }

    @Override
    public boolean getWantClientAuth() {
        return false;
    }

    @Override
    public void setNeedClientAuth(boolean bl) {
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        return this.val$tlsClientProtocol.getOutputStream();
    }
}

