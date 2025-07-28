/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName(value="im")
public class class221 {
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lim;")
    static final class221 field2422 = new class221();
    @ObfuscatedName(value="fi")
    @ObfuscatedSignature(descriptor="Lok;")
    static Archive field2421;
    @ObfuscatedName(value="no")
    @ObfuscatedGetter(intValue=1772774201)
    static int field2426;
    @ObfuscatedName(value="ay")
    String field2410 = "";
    @ObfuscatedName(value="ah")
    String field2415 = "";
    @ObfuscatedName(value="az")
    String field2411 = "";
    @ObfuscatedName(value="ao")
    String field2413 = "";
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(longValue=-1785860587673457591L)
    long field2414 = -1L;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Laa;")
    class14 field2420;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lag;")
    class18 field2416;
    @ObfuscatedName(value="ax")
    final int field2417 = 1;
    @ObfuscatedName(value="at")
    final int field2418 = 2;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=968711367)
    int field2419 = 1;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=816256339)
    int field2423 = 0;
    @ObfuscatedName(value="ak")
    String field2428;
    @ObfuscatedName(value="av")
    boolean field2424;

    class221() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;B)V", garbageValue="71")
    public void method4976(int n, String string) {
        this.field2423 = n;
        this.field2428 = string;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-769087225")
    public void method4977(boolean bl) {
        this.field2424 = bl;
        this.field2420 = new class14("crmsession", 1, 1);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", garbageValue="1012227368")
    void method4975(String string, String string2, String string3) {
        if (this.field2419 == 2) {
            return;
        }
        this.field2410 = string;
        this.field2415 = string2;
        this.field2411 = string3;
        if (!this.field2410.endsWith("/")) {
            this.field2410 = this.field2410 + "/";
        }
        if (this.field2415.equals("")) {
            return;
        }
        String string4 = this.field2410;
        string4 = string4 + "session/open/" + this.field2415;
        if (this.field2411.equals("")) {
            // empty if block
        }
        string4 = string4 + "?userHash=" + this.field2411;
        try {
            this.field2416 = this.method4992(string4);
            this.field2414 = ReflectionCheck.method724();
        }
        catch (IOException iOException) {
            this.field2416 = null;
            this.field2415 = "";
            this.field2411 = "";
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1891305770")
    public void method4979() {
        if (this.field2416 != null) {
            return;
        }
        if (!this.field2413.isEmpty() && this.field2419 == 1) {
            long l = ReflectionCheck.method724();
            long l2 = l - this.field2414;
            String string = this.field2410;
            string = string + "session/close/" + this.field2415 + "/" + this.field2413;
            string = this.field2411.isEmpty() ? string + "?sessionDuration=" + l2 : string + "?userHash=" + this.field2411 + "&sessionDuration=" + l2;
            try {
                this.field2416 = this.method4992(string);
            }
            catch (IOException iOException) {
                this.field2419 = 1;
            }
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="60")
    public void method4980() {
        if (this.field2420 != null) {
            this.field2420.method184();
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="862837352")
    void method4991() {
        if (this.field2413.isEmpty()) {
            return;
        }
        String string = "";
        switch (this.field2423) {
            default: {
                break;
            }
            case 3: {
                string = "events/impression";
                break;
            }
            case 1: {
                string = "events/click";
                break;
            }
            case 2: {
                string = "events/dismissed";
            }
        }
        if (this.field2428.isEmpty()) {
            return;
        }
        String string2 = this.field2410;
        string2 = string2 + string + "/" + this.field2415 + "/" + this.field2413 + "/" + this.field2428 + "?userHash=" + this.field2411;
        try {
            this.field2416 = this.method4992(string2);
        }
        catch (IOException iOException) {
            this.field2419 = 1;
        }
        this.field2419 = 1;
        this.field2423 = 0;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-2024423487")
    public void method4982() {
        block4: {
            block6: {
                block5: {
                    if (this.field2416 == null || !this.field2416.method267()) break block4;
                    if (!this.field2416.method267() || this.field2416.method273().method291() != 200 || !this.field2413.isEmpty()) break block5;
                    String string = this.field2416.method273().method294();
                    if (string.isEmpty()) break block6;
                    this.field2413 = string;
                }
                if (this.field2423 != 0) {
                    this.method4991();
                }
                return;
            }
            return;
        }
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)Z", garbageValue="-1263544057")
    public boolean method4983(String string) {
        this.method4976(2, string);
        return true;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)Lag;", garbageValue="-190142456")
    class18 method4992(String string) throws IOException {
        URL uRL = new URL(string);
        class10 class102 = new class10(uRL, class9.field43, this.field2424);
        try {
            JSONObject jSONObject = new JSONObject();
            class102.method108(new class504(jSONObject));
        }
        catch (Exception exception) {
            // empty catch block
        }
        return this.field2420.method183(class102);
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="192939260")
    static void method5000() {
        int n;
        long l;
        Object object;
        Object object2;
        block32: {
            if ((Login.Login_username = Login.Login_username.trim()).length() == 0) {
                class150.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                return;
            }
            try {
                long l2;
                int n2;
                URL uRL = new URL(RouteStrategy.method5846("services", false) + "m=accountappeal/login.ws");
                URLConnection uRLConnection = uRL.openConnection();
                uRLConnection.setRequestProperty("connection", "close");
                uRLConnection.setDoInput(true);
                uRLConnection.setDoOutput(true);
                uRLConnection.setConnectTimeout(5000);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(uRLConnection.getOutputStream());
                outputStreamWriter.write("data1=req");
                outputStreamWriter.flush();
                object2 = uRLConnection.getInputStream();
                object = new Buffer(new byte[1000]);
                while ((n2 = ((InputStream)object2).read(((Buffer)object).array, ((Buffer)object).offset, 1000 - ((Buffer)object).offset)) != -1) {
                    ((Buffer)object).offset += n2;
                    if (((Buffer)object).offset < 1000) continue;
                    l = 0L;
                    break block32;
                }
                ((Buffer)object).offset = 0;
                l = l2 = ((Buffer)object).readLong();
            }
            catch (Exception exception) {
                l = 0L;
            }
        }
        long l3 = l;
        if (0L == l3) {
            n = 5;
        } else {
            int n3;
            block33: {
                int n4;
                object2 = Login.Login_username;
                object = new Random();
                Buffer buffer = new Buffer(128);
                Buffer buffer2 = new Buffer(128);
                int[] nArray = new int[]{((Random)object).nextInt(), ((Random)object).nextInt(), (int)(l3 >> 32), (int)l3};
                buffer.writeByte(10);
                for (n4 = 0; n4 < 4; ++n4) {
                    buffer.method10268(((Random)object).nextInt());
                }
                buffer.method10268(nArray[0]);
                buffer.method10268(nArray[1]);
                buffer.writeLong(l3);
                buffer.writeLong(0L);
                for (n4 = 0; n4 < 4; ++n4) {
                    buffer.method10268(((Random)object).nextInt());
                }
                buffer.encryptRsa(class75.field897, class75.field900);
                buffer2.writeByte(10);
                for (n4 = 0; n4 < 3; ++n4) {
                    buffer2.method10268(((Random)object).nextInt());
                }
                buffer2.writeLong(((Random)object).nextLong());
                buffer2.writeLongMedium(((Random)object).nextLong());
                WorldMapElement.method5197(buffer2);
                buffer2.writeLong(((Random)object).nextLong());
                buffer2.encryptRsa(class75.field897, class75.field900);
                n4 = MouseRecorder.stringCp1252NullTerminatedByteSize((String)object2);
                if (n4 % 8 != 0) {
                    n4 += 8 - n4 % 8;
                }
                Buffer buffer3 = new Buffer(n4);
                buffer3.writeStringCp1252NullTerminated((String)object2);
                buffer3.offset = n4;
                buffer3.xteaEncryptAll(nArray);
                Buffer buffer4 = new Buffer(buffer.offset + buffer2.offset + buffer3.offset + 5);
                buffer4.writeByte(2);
                buffer4.writeByte(buffer.offset);
                buffer4.writeBytes(buffer.array, 0, buffer.offset);
                buffer4.writeByte(buffer2.offset);
                buffer4.writeBytes(buffer2.array, 0, buffer2.offset);
                buffer4.writeShort(buffer3.offset);
                buffer4.writeBytes(buffer3.array, 0, buffer3.offset);
                String string = CollisionMap.method5830(buffer4.array);
                try {
                    boolean bl;
                    String string2;
                    block34: {
                        int n5;
                        URL uRL = new URL(RouteStrategy.method5846("services", false) + "m=accountappeal/login.ws");
                        URLConnection uRLConnection = uRL.openConnection();
                        uRLConnection.setDoInput(true);
                        uRLConnection.setDoOutput(true);
                        uRLConnection.setConnectTimeout(5000);
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(uRLConnection.getOutputStream());
                        outputStreamWriter.write("data2=" + PcmPlayer.method857(string) + "&dest=" + PcmPlayer.method857("passwordchoice.ws"));
                        outputStreamWriter.flush();
                        InputStream inputStream = uRLConnection.getInputStream();
                        buffer4 = new Buffer(new byte[1000]);
                        while ((n5 = inputStream.read(buffer4.array, buffer4.offset, 1000 - buffer4.offset)) != -1) {
                            buffer4.offset += n5;
                            if (buffer4.offset < 1000) continue;
                            n3 = 5;
                            break block33;
                        }
                        outputStreamWriter.close();
                        inputStream.close();
                        string2 = new String(buffer4.array);
                        if (string2.startsWith("OFFLINE")) {
                            n3 = 4;
                            break block33;
                        }
                        if (string2.startsWith("WRONG")) {
                            n3 = 7;
                            break block33;
                        }
                        if (string2.startsWith("RELOAD")) {
                            n3 = 3;
                            break block33;
                        }
                        if (string2.startsWith("Not permitted for social network accounts.")) {
                            n3 = 6;
                            break block33;
                        }
                        buffer4.xteaDecryptAll(nArray);
                        while (buffer4.offset > 0 && buffer4.array[buffer4.offset - 1] == 0) {
                            --buffer4.offset;
                        }
                        string2 = new String(buffer4.array, 0, buffer4.offset);
                        if (string2 == null) {
                            bl = false;
                        } else {
                            try {
                                new URL(string2);
                            }
                            catch (MalformedURLException malformedURLException) {
                                bl = false;
                                break block34;
                            }
                            bl = true;
                        }
                    }
                    if (bl) {
                        WorldMapRectangle.openURL(string2, true, false);
                        n3 = 2;
                    } else {
                        n3 = 5;
                    }
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                    n3 = 5;
                }
            }
            n = n3;
        }
        switch (n) {
            case 4: {
                class150.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
                break;
            }
            case 7: {
                class150.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
                break;
            }
            case 6: {
                class150.setLoginResponseString("", "Error connecting to server.", "");
                break;
            }
            case 2: {
                class150.setLoginResponseString(Strings.field4256, Strings.field4410, Strings.field4439);
                Varcs.method3212(6);
                break;
            }
            case 3: {
                class150.setLoginResponseString("", "Error connecting to server.", "");
                break;
            }
            case 5: {
                class150.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
            }
        }
    }
}

