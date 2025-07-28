/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 *  org.bouncycastle.crypto.tls.DefaultTlsClient
 *  org.bouncycastle.crypto.tls.TlsAuthentication
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName(value="af")
class class13
extends DefaultTlsClient {
    @ObfuscatedSignature(descriptor="Laq;")
    final /* synthetic */ class12 this$1;

    @ObfuscatedSignature(descriptor="(Laq;)V")
    class13(class12 class122) {
        this.this$1 = class122;
    }

    public Hashtable getClientExtensions() throws IOException {
        Hashtable<Integer, byte[]> hashtable = super.getClientExtensions();
        if (hashtable == null) {
            hashtable = new Hashtable<Integer, byte[]>();
        }
        byte[] byArray = this.this$1.val$host.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeShort(byArray.length + 3);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeShort(byArray.length);
        dataOutputStream.write(byArray);
        dataOutputStream.close();
        hashtable.put(0, byteArrayOutputStream.toByteArray());
        return hashtable;
    }

    public TlsAuthentication getAuthentication() throws IOException {
        return new class11(this);
    }
}

