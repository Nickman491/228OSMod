package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 *  org.bouncycastle.asn1.x509.Certificate
 *  org.bouncycastle.crypto.tls.Certificate
 *  org.bouncycastle.crypto.tls.CertificateRequest
 *  org.bouncycastle.crypto.tls.TlsAuthentication
 *  org.bouncycastle.crypto.tls.TlsCredentials
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName(value="as")
class class11
implements TlsAuthentication {
    @ObfuscatedSignature(descriptor="Laf;")
    final /* synthetic */ class13 this$2;

    @ObfuscatedSignature(descriptor="(Laf;)V")
    class11(class13 class1310) {
        this.this$2 = class1310;
    }

    public void notifyServerCertificate(org.bouncycastle.crypto.tls.Certificate certificate) throws IOException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            LinkedList<java.security.cert.Certificate> linkedList = new LinkedList<java.security.cert.Certificate>();
            Certificate[] certificateArray = certificate.getCertificateList();
            for (int i = 0; i < certificateArray.length; ++i) {
                Certificate certificate2 = certificateArray[i];
                linkedList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(certificate2.getEncoded())));
            }
            this.this$2.this$1.field57 = linkedList.toArray(new java.security.cert.Certificate[0]);
        }
        catch (CertificateException certificateException) {
            throw new IOException(certificateException);
        }
    }

    public TlsCredentials getClientCredentials(CertificateRequest certificateRequest) throws IOException {
        return null;
    }
}

