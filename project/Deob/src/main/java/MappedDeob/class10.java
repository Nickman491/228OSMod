/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
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
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="au")
public class class10 {
    @ObfuscatedName(value="kh")
    @ObfuscatedSignature(descriptor="[Lvf;")
    static SpritePixels[] field47;
    @ObfuscatedName(value="pr")
    @ObfuscatedSignature(descriptor="[Lna;")
    static Widget[] field53;
    @ObfuscatedName(value="va")
    @ObfuscatedSignature(descriptor="Lcd;")
    @Export(value="friendSystem")
    public static FriendSystem friendSystem;
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
    public class10(URL uRL, class9 class94, class461 class4612, boolean bl) throws IOException {
        if (class94.method75()) {
            this.field55 = (HttpsURLConnection)uRL.openConnection();
            if (!bl) {
                HttpsURLConnection httpsURLConnection = this.field55;
                if (class15.field66 == null) {
                    class15.field66 = new class15();
                }
                class15 class152 = class15.field66;
                httpsURLConnection.setSSLSocketFactory(class152);
            }
            this.field48 = class94;
            this.field56 = class4612 != null ? class4612 : new class461();
            return;
        }
        throw new UnsupportedEncodingException("Unsupported request method used " + class94.method67());
    }

    @ObfuscatedSignature(descriptor="(Ljava/net/URL;Lac;Z)V")
    public class10(URL uRL, class9 class94, boolean bl) throws IOException {
        this(uRL, class94, new class461(), bl);
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
        class20 class205;
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
            class205 = new class20(this.field55);
        }
        catch (IOException iOException) {
            class20 class207 = new class20("Error decoding REST response: " + iOException.getMessage());
            return class207;
        }
        finally {
            this.field55.disconnect();
        }
        return class205;
    }

    @ObfuscatedName(value="ay")
    public static String method113(long l) {
        Calendar.Calendar_calendar.setTime(new Date(l));
        int n = Calendar.Calendar_calendar.get(7);
        int n2 = Calendar.Calendar_calendar.get(5);
        int n3 = Calendar.Calendar_calendar.get(2);
        int n4 = Calendar.Calendar_calendar.get(1);
        int n5 = Calendar.Calendar_calendar.get(11);
        int n6 = Calendar.Calendar_calendar.get(12);
        int n7 = Calendar.Calendar_calendar.get(13);
        return Calendar.DAYS_OF_THE_WEEK[n - 1] + ", " + n2 / 10 + n2 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][n3] + "-" + n4 + " " + n5 / 10 + n5 % 10 + ":" + n6 / 10 + n6 % 10 + ":" + n7 / 10 + n7 % 10 + " GMT";
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="78")
    public static int method100(int n) {
        return class506.field5148[n & 0x3FFF];
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(Lna;B)I", garbageValue="-36")
    static int method112(Widget widget) {
        if (widget.type == 11) {
            String string = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
            Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = widget.method7465(string);
            return 1;
        }
        --HealthBar.Interpreter_stringStackSize;
        Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
        return 1;
    }

    @ObfuscatedName(value="jy")
    @ObfuscatedSignature(descriptor="(IIIIII)V", garbageValue="-439773603")
    static void method92(int n, int n2, int n3, int n4, int n5) {
        NodeDeque nodeDeque = class30.field131.field1327[n][n2][n3];
        if (nodeDeque != null) {
            TileItem tileItem = (TileItem)nodeDeque.last();
            while (tileItem != null) {
                if ((n4 & Short.MAX_VALUE) != tileItem.id) {
                    tileItem = (TileItem)nodeDeque.previous();
                    continue;
                }
                tileItem.method3101(n5);
                break;
            }
        }
    }
}

