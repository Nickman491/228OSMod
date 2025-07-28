/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 *  org.bouncycastle.crypto.tls.TlsClientProtocol
 *  org.bouncycastle.jce.provider.BouncyCastleProvider
 */
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

@ObfuscatedName(value="ak")
public class class15
extends SSLSocketFactory {
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lak;")
    public static class15 field66;
    @ObfuscatedName(value="ay")
    SecureRandom field65 = new SecureRandom();

    static {
        if (Security.getProvider("BC") == null) {
            Security.addProvider((Provider)new BouncyCastleProvider());
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;I)Ljavax/net/ssl/SSLSocket;", garbageValue="1270991079")
    SSLSocket method193(String string, TlsClientProtocol tlsClientProtocol) {
        return new class12(this, tlsClientProtocol, string);
    }

    @Override
    public Socket createSocket(Socket socket, String string, int n, boolean bl) throws IOException {
        if (socket == null) {
            socket = new Socket();
        }
        if (!socket.isConnected()) {
            socket.connect(new InetSocketAddress(string, n));
        }
        TlsClientProtocol tlsClientProtocol = new TlsClientProtocol(socket.getInputStream(), socket.getOutputStream(), this.field65);
        return this.method193(string, tlsClientProtocol);
    }

    @Override
    public String[] getSupportedCipherSuites() {
        return null;
    }

    @Override
    public Socket createSocket(InetAddress inetAddress, int n) throws IOException {
        return null;
    }

    @Override
    public Socket createSocket(String string, int n, InetAddress inetAddress, int n2) throws IOException, UnknownHostException {
        return null;
    }

    @Override
    public Socket createSocket(InetAddress inetAddress, int n, InetAddress inetAddress2, int n2) throws IOException {
        return null;
    }

    @Override
    public Socket createSocket(String string, int n) throws IOException, UnknownHostException {
        return null;
    }

    @Override
    public String[] getDefaultCipherSuites() {
        return null;
    }
}

