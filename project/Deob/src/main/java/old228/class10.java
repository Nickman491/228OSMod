package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Date;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="au")
public class class10 {
    @ObfuscatedName(value="kh")
    @ObfuscatedSignature(descriptor="[Lvf;")
    static class570[] field47;
    @ObfuscatedName(value="pr")
    @ObfuscatedSignature(descriptor="[Lna;")
    static class361[] field53;
    @ObfuscatedName(value="va")
    @ObfuscatedSignature(descriptor="Lcd;")
    public static class70 field54;
    @ObfuscatedName(value="ay")
    final HttpsURLConnection field55;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lri;")
    final class461 field56;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lac;")
    final class9 field48;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Ltn;")
    class503 field46;
    @ObfuscatedName(value="ad")
    boolean field50 = false;
    @ObfuscatedName(value="an")
    boolean field51 = false;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1817451863)
    int field52 = 300000;

    @ObfuscatedSignature(descriptor="(Ljava/net/URL;Lac;Lri;Z)V")
    public class10(URL uRL, class9 class910, class461 class4612, boolean bl) throws IOException {
        if (class910.method75()) {
            this.field55 = (HttpsURLConnection)uRL.openConnection();
            if (!bl) {
                HttpsURLConnection httpsURLConnection = this.field55;
                if (class15.field66 == null) {
                    class15.field66 = new class15();
                }
                class15 class1510 = class15.field66;
                httpsURLConnection.setSSLSocketFactory(class1510);
            }
            this.field48 = class910;
            this.field56 = class4612 != null ? class4612 : new class461();
            return;
        }
        throw new UnsupportedEncodingException("Unsupported request method used " + class910.method67());
    }

    @ObfuscatedSignature(descriptor="(Ljava/net/URL;Lac;Z)V")
    public class10(URL uRL, class9 class910, boolean bl) throws IOException {
        this(uRL, class910, new class461(), bl);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)Lri;", garbageValue="62")
    public class461 method114() {
        return this.field56;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ltn;B)V", garbageValue="2")
    public void method108(class503 class5032) {
        if (this.field50) {
            return;
        }
        if (class5032 != null) {
            this.field46 = class5032;
            if (this.field46.vmethod9572() == null) {
                this.field56.method8980();
            } else {
                this.field56.method8987(this.field46.vmethod9572());
            }
            return;
        }
        this.field56.method8997("Content-Type");
        this.field46 = null;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1136076020")
    void method86() throws ProtocolException {
        if (this.field50) {
            return;
        }
        this.field55.setRequestMethod(this.field48.method67());
        this.field56.method8972(this.field55);
        if (this.field48.method68() && this.field46 != null) {
            this.field55.setDoOutput(true);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(this.field46.vmethod9573());
                byteArrayOutputStream.writeTo(this.field55.getOutputStream());
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            finally {
                try {
                    byteArrayOutputStream.close();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
        this.field55.setConnectTimeout(this.field52);
        this.field55.setInstanceFollowRedirects(this.field51);
        this.field50 = true;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1407153734")
    boolean method90() throws IOException {
        if (!this.field50) {
            this.method86();
        }
        this.field55.connect();
        return this.field55.getResponseCode() == -1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(S)Lai;", garbageValue="-252")
    class20 method91() {
        class20 class2010;
        try {
            if (!this.field50 || this.field55.getResponseCode() == -1) {
                return new class20("No REST response has been received yet.");
            }
        }
        catch (IOException iOException) {
            this.field55.disconnect();
            return new class20("Error decoding REST response code: " + iOException.getMessage());
        }
        try {
            class2010 = new class20(this.field55);
        }
        catch (IOException iOException) {
            class20 class2011 = new class20("Error decoding REST response: " + iOException.getMessage());
            return class2011;
        }
        finally {
            this.field55.disconnect();
        }
        return class2010;
    }

    @ObfuscatedName(value="ay")
    public static String method113(long l) {
        Calender.field4049.setTime(new Date(l));
        int n = Calender.field4049.get(7);
        int n2 = Calender.field4049.get(5);
        int n3 = Calender.field4049.get(2);
        int n4 = Calender.field4049.get(1);
        int n5 = Calender.field4049.get(11);
        int n6 = Calender.field4049.get(12);
        int n7 = Calender.field4049.get(13);
        return Calender.field4048[n - 1] + ", " + n2 / 10 + n2 % 10 + "-" + Calender.field4050[0][n3] + "-" + n4 + " " + n5 / 10 + n5 % 10 + ":" + n6 / 10 + n6 % 10 + ":" + n7 / 10 + n7 % 10 + " GMT";
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="78")
    public static int method100(int n) {
        return class506.field5148[n & 0x3FFF];
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(Lna;B)I", garbageValue="-36")
    static int method112(class361 class3612) {
        if (class3612.field3873 == 11) {
            String string = class72.field855[--class104.field1343];
            class72.field865[++class63.field444 - 1] = class3612.method7465(string);
            return 1;
        }
        --class104.field1343;
        class72.field865[++class63.field444 - 1] = -1;
        return 1;
    }

    @ObfuscatedName(value="jy")
    @ObfuscatedSignature(descriptor="(IIIIII)V", garbageValue="-439773603")
    static void method92(int n, int n2, int n3, int n4, int n5) {
        class410 class4102 = class30.field131.field1327[n][n2][n3];
        if (class4102 != null) {
            class109 class1092 = (class109)class4102.method7996();
            while (class1092 != null) {
                if ((n4 & Short.MAX_VALUE) != class1092.field1389) {
                    class1092 = (class109)class4102.method8005();
                    continue;
                }
                class1092.method3101(n5);
                break;
            }
        }
    }
}

