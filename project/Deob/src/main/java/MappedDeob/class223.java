/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName(value="ic")
public class class223 {
    @ObfuscatedName(value="ah")
    String field2437;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=632143365)
    int field2438 = 0;
    @ObfuscatedName(value="ao")
    ArrayList field2440 = new ArrayList();
    @ObfuscatedName(value="ad")
    ArrayList field2444 = new ArrayList();
    @ObfuscatedName(value="an")
    ArrayList field2442 = new ArrayList();
    @ObfuscatedName(value="ae")
    String field2443 = null;
    @ObfuscatedName(value="ax")
    float[] field2439 = new float[4];
    @ObfuscatedName(value="at")
    Map field2441 = new HashMap();
    @ObfuscatedName(value="ac")
    Map field2446 = new HashMap();

    class223() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="-2061482577")
    String method5006() {
        return this.field2437;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="382594970")
    int method5016() {
        return this.field2438;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-785708555")
    void method5009() {
        this.field2443 = null;
        this.field2439[0] = 0.0f;
        this.field2439[1] = 0.0f;
        this.field2439[2] = 1.0f;
        this.field2439[3] = 1.0f;
        this.field2440.clear();
        this.field2444.clear();
        this.field2442.clear();
        this.field2441.clear();
        this.field2446.clear();
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lorg/json/JSONObject;ILez;B)Z", garbageValue="-10")
    boolean method5007(JSONObject jSONObject, int n, UrlRequester urlRequester) {
        JSONObject jSONObject2 = jSONObject;
        if (n < 2) {
            try {
                jSONObject2 = jSONObject2.getJSONObject("message");
            }
            catch (Exception exception) {
                this.method5009();
                return false;
            }
            try {
                this.method5011(jSONObject2.getJSONArray("images"), urlRequester);
            }
            catch (Exception exception) {
                this.field2444.clear();
            }
            try {
                this.method5013(jSONObject2.getJSONArray("labels"));
            }
            catch (Exception exception) {
                this.field2442.clear();
            }
        } else {
            try {
                this.method5012(jSONObject2.getJSONObject("image"), urlRequester);
            }
            catch (Exception exception) {
                this.field2444.clear();
            }
            try {
                this.method5014(jSONObject2.getJSONObject("label"));
            }
            catch (Exception exception) {
                this.field2442.clear();
            }
        }
        try {
            this.method5015(jSONObject2.getJSONObject("behaviour"));
        }
        catch (Exception exception) {
            this.field2443 = null;
            this.field2439[0] = 0.0f;
            this.field2439[1] = 0.0f;
            this.field2439[2] = 1.0f;
            this.field2439[3] = 1.0f;
            this.field2440.clear();
        }
        try {
            JSONObject jSONObject3 = jSONObject2.optJSONObject("meta");
            if (jSONObject3 != null) {
                this.method5024(jSONObject2.getJSONObject("meta"));
            }
        }
        catch (Exception exception) {
            this.field2441.clear();
            this.field2446.clear();
        }
        if (n == 2) {
            try {
                this.field2437 = jSONObject2.getString("id");
                this.field2438 = Integer.parseInt(jSONObject2.getString("priority"));
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return true;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lorg/json/JSONArray;Lez;I)V", garbageValue="2088947389")
    void method5011(JSONArray jSONArray, UrlRequester urlRequester) throws JSONException {
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); ++i) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                class213 class2132 = new class213(this);
                class2132.field2373 = urlRequester.request(new URL(jSONObject.getString("src")));
                class2132.field2372 = Decimator.method1176(jSONObject, "placement");
                this.field2444.add(class2132);
                continue;
            }
            catch (MalformedURLException malformedURLException) {
                // empty catch block
            }
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lorg/json/JSONObject;Lez;B)V", garbageValue="25")
    void method5012(JSONObject jSONObject, UrlRequester urlRequester) throws JSONException {
        try {
            class213 class2132 = new class213(this);
            class2132.field2373 = urlRequester.request(new URL(jSONObject.getString("src")));
            class2132.field2372 = Decimator.method1176(jSONObject, "placement");
            this.field2444.add(class2132);
        }
        catch (MalformedURLException malformedURLException) {
            // empty catch block
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lorg/json/JSONArray;B)V", garbageValue="4")
    void method5013(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return;
        }
        int n = 0;
        while (n < jSONArray.length()) {
            JSONObject jSONObject = jSONArray.getJSONObject(n);
            class224 class2242 = new class224(this);
            class2242.field2450 = jSONObject.getString("text");
            class2242.field2451 = class153.method3617(jSONObject.getString("align_x"));
            class2242.field2453 = class153.method3617(jSONObject.getString("align_y"));
            class2242.field2454 = jSONObject.getInt("font");
            class2242.field2447 = Decimator.method1176(jSONObject, "placement");
            this.field2442.add(class2242);
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lorg/json/JSONObject;I)V", garbageValue="20564214")
    void method5014(JSONObject jSONObject) throws JSONException {
        class224 class2242 = new class224(this);
        class2242.field2450 = jSONObject.optString("text");
        class2242.field2451 = class153.method3617(jSONObject.optString("align_x"));
        class2242.field2453 = class153.method3617(jSONObject.optString("align_y"));
        class2242.field2454 = jSONObject.optInt("font");
        class2242.field2447 = Decimator.method1176(jSONObject, "placement");
        this.field2442.add(class2242);
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Lorg/json/JSONObject;I)V", garbageValue="1908279385")
    void method5015(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        this.field2439 = Decimator.method1176(jSONObject, "clickbounds");
        this.field2443 = jSONObject.getString("endpoint");
        String[] stringArray = JSONObject.getNames(jSONObject);
        for (int i = 0; i < jSONObject.length(); ++i) {
            if (stringArray[i].equals("clickbounds") || stringArray[i].equals("endpoint")) continue;
            try {
                int n = jSONObject.getInt(stringArray[i]);
                this.field2440.add(new class211(this, stringArray[i], n));
                continue;
            }
            catch (Exception exception) {
                try {
                    String string = jSONObject.getString(stringArray[i]);
                    if (string.equals("true")) {
                        this.field2440.add(new class211(this, stringArray[i], 1));
                        continue;
                    }
                    if (string.equals("false")) {
                        this.field2440.add(new class211(this, stringArray[i], 0));
                        continue;
                    }
                    this.field2440.add(new class220(this, stringArray[i], string));
                    continue;
                }
                catch (Exception exception2) {
                    // empty catch block
                }
            }
        }
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Lorg/json/JSONObject;B)V", garbageValue="93")
    void method5024(JSONObject jSONObject) throws JSONException {
        String[] stringArray = JSONObject.getNames(jSONObject);
        for (int i = 0; i < jSONObject.length(); ++i) {
            try {
                int n = jSONObject.optInt(stringArray[i]);
                this.field2441.put(stringArray[i], n);
                continue;
            }
            catch (Exception exception) {
                try {
                    String string = jSONObject.optString(stringArray[i]);
                    if (string.equals("true")) {
                        this.field2441.put(stringArray[i], 1);
                        continue;
                    }
                    if (string.equals("false")) {
                        this.field2441.put(stringArray[i], 0);
                        continue;
                    }
                    this.field2446.put(stringArray[i], string);
                    continue;
                }
                catch (Exception exception2) {
                    // empty catch block
                }
            }
        }
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(IIIIIIIIFFFB)F", garbageValue="36")
    public static float method5043(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, float f, float f2, float f3) {
        float f4 = (n7 - n8) * (n3 - n5) + (n6 - n8) * (n5 - n4);
        float f5 = (float)((n2 - n8) * (n5 - n4) + (n7 - n8) * (n - n5)) / f4;
        float f6 = (float)((n2 - n8) * (n3 - n5) + (n8 - n6) * (n - n5)) / f4;
        float f7 = 1.0f - f5 - f6;
        return f7 * f3 + (f2 * f6 + f * f5);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Lqh;Lqh;S)Lqh;", garbageValue="301")
    public static final class426 method5044(class426 class4262, class426 class4263) {
        Object object = class426.field4746;
        synchronized (class426.field4746) {
            class426 class4264;
            if (class426.field4742 == 0) {
                class4264 = new class426(class4262);
            } else {
                class426.field4746[--class426.field4742].method8316(class4262);
                class4264 = class426.field4746[class426.field4742];
            }
            // ** MonitorExit[var3_2] (shouldn't be in output)
            object = class4264;
            ((class426)object).method8291(class4263);
            return object;
        }
    }

    @ObfuscatedName(value="ks")
    @ObfuscatedSignature(descriptor="(Ldz;Lvv;I)V", garbageValue="2135107044")
    static final void method5008(class103 class1032, PacketBuffer packetBuffer) {
        int n;
        packetBuffer.method10226();
        int n2 = packetBuffer.readBits(8);
        if (n2 < class1032.field1331) {
            for (n = n2; n < class1032.field1331; ++n) {
                Client.field537[++Client.field635 - 1] = class1032.field1332[n];
            }
        }
        if (n2 <= class1032.field1331) {
            class1032.field1331 = 0;
            n = 0;
            while (true) {
                if (n >= n2) {
                    return;
                }
                int n3 = class1032.field1332[n];
                class105 class1052 = class1032.field1330[n3];
                int n4 = packetBuffer.readBits(1);
                if (n4 != 0) {
                    int n5 = packetBuffer.readBits(2);
                    if (n5 != 0) {
                        int n6;
                        int n7;
                        if (n5 != 1) {
                            if (n5 != 2) {
                                if (n5 == 3) {
                                    Client.field537[++Client.field635 - 1] = n3;
                                }
                            } else {
                                class1032.field1332[++class1032.field1331 - 1] = n3;
                                class1052.field1259 = Client.cycle;
                                if (packetBuffer.readBits(1) != 1) {
                                    n7 = packetBuffer.readBits(3);
                                    class1052.method3012(n7, class275.field3044);
                                } else {
                                    n7 = packetBuffer.readBits(3);
                                    class1052.method3012(n7, class275.field3046);
                                    n6 = packetBuffer.readBits(3);
                                    class1052.method3012(n6, class275.field3046);
                                }
                                n7 = packetBuffer.readBits(1);
                                if (n7 == 1) {
                                    Client.field567[++Client.field562 - 1] = n3;
                                }
                            }
                        } else {
                            class1032.field1332[++class1032.field1331 - 1] = n3;
                            class1052.field1259 = Client.cycle;
                            n7 = packetBuffer.readBits(3);
                            class1052.method3012(n7, class275.field3045);
                            n6 = packetBuffer.readBits(1);
                            if (n6 == 1) {
                                Client.field567[++Client.field562 - 1] = n3;
                            }
                        }
                    } else {
                        class1032.field1332[++class1032.field1331 - 1] = n3;
                        class1052.field1259 = Client.cycle;
                        Client.field567[++Client.field562 - 1] = n3;
                    }
                } else {
                    class1032.field1332[++class1032.field1331 - 1] = n3;
                    class1052.field1259 = Client.cycle;
                }
                ++n;
            }
        }
        throw new RuntimeException("");
    }
}

