package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ai")
public class class20 {
    @ObfuscatedName(value="jx")
    static byte[][] field88;
    @ObfuscatedName(value="se")
    static boolean field91;
    @ObfuscatedName(value="wb")
    @ObfuscatedGetter(intValue=-1716801803)
    static int field92;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1914974289)
    final int field86;
    @ObfuscatedName(value="ah")
    final String field85;
    @ObfuscatedName(value="az")
    final Map field90;
    @ObfuscatedName(value="ao")
    final String field84;

    class20(String string) {
        this.field86 = 400;
        this.field85 = string;
        this.field90 = null;
        this.field84 = "";
    }

    /*
     * Enabled aggressive block sorting
     */
    class20(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream;
        this.field86 = httpURLConnection.getResponseCode();
        this.field85 = httpURLConnection.getResponseMessage();
        this.field90 = httpURLConnection.getHeaderFields();
        StringBuilder stringBuilder = new StringBuilder();
        InputStream inputStream2 = inputStream = this.field86 >= 300 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
        if (inputStream != null) {
            String string;
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while ((string = bufferedReader.readLine()) != null) {
                stringBuilder.append(string);
            }
            inputStream.close();
        }
        this.field84 = stringBuilder.toString();
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(S)I", garbageValue="-16593")
    public int method291() {
        return this.field86;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="-1561646912")
    public String method301() {
        return this.field85;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)Ljava/util/Map;", garbageValue="1862700448")
    public Map method293() {
        return this.field90;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="1539511432")
    public String method294() {
        return this.field84;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/io/File;B)V", garbageValue="-38")
    static void method308(File file) {
        class218.field2397 = file;
        if (!class218.field2397.exists()) {
            throw new RuntimeException("");
        }
        class218.field2396 = true;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(II)F", garbageValue="1253392583")
    static final float method298(int n) {
        float f = 10075.0f - (float)n;
        return (f * 1.0075567f - 75.56675f) / f;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="643864803")
    public static int method307(int n) {
        return class360.method7406(class199.field2270[n]);
    }
}

