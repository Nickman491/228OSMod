package old228;/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 *  net.runelite.rs.Reflection
 */
import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import old228.org.json.JSONArray;
import old228.org.json.JSONException;
import old228.org.json.JSONObject;

@ObfuscatedName(value="tx")
public class class504
implements class503 {
    @ObfuscatedName(value="ah")
    JSONObject field5140;

    public class504(byte[] byArray) throws UnsupportedEncodingException {
        this.method9557(byArray);
    }

    public class504(JSONObject jSONObject) {
        this.field5140 = jSONObject;
    }

    public class504(String string) throws UnsupportedEncodingException {
        this.method9555(string);
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)Ltw;", garbageValue="-546778474")
    public class502 vmethod9572() {
        return class502.field5137;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)[B", garbageValue="613600609")
    public byte[] vmethod9573() throws UnsupportedEncodingException {
        if (this.field5140 != null) {
            return ((Object)this.field5140).toString().getBytes("UTF-8");
        }
        return new byte[0];
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="([BB)V", garbageValue="106")
    void method9557(byte[] byArray) throws UnsupportedEncodingException {
        String string = new String(byArray, "UTF-8");
        this.method9555(string);
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="1089631791")
    void method9555(String string) throws UnsupportedEncodingException {
        block4: {
            try {
                if (string.charAt(0) == '{') {
                    this.field5140 = new JSONObject(string);
                    break block4;
                }
                if (string.charAt(0) == '[') {
                    JSONArray jSONArray = new JSONArray(string);
                    this.field5140 = new JSONObject();
                    this.field5140.method11016("arrayValues", jSONArray);
                    break block4;
                }
                throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }
            catch (JSONException jSONException) {
                throw new UnsupportedEncodingException(jSONException.getMessage());
            }
        }
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)Lorg/json/JSONObject;", garbageValue="1844308788")
    public JSONObject method9559() {
        return this.field5140;
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)Ljava/lang/Class;", garbageValue="2")
    static Class method9568(String string) throws ClassNotFoundException {
        if (string.equals("B")) {
            return Byte.TYPE;
        }
        if (string.equals("I")) {
            return Integer.TYPE;
        }
        if (string.equals("S")) {
            return Short.TYPE;
        }
        if (string.equals("J")) {
            return Long.TYPE;
        }
        if (string.equals("Z")) {
            return Boolean.TYPE;
        }
        if (string.equals("F")) {
            return Float.TYPE;
        }
        if (string.equals("D")) {
            return Double.TYPE;
        }
        if (string.equals("C")) {
            return Character.TYPE;
        }
        if (string.equals("void")) {
            return Void.TYPE;
        }
        return Reflection.findClass((String)string);
    }
}

